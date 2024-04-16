package com.inappstory.sdk.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.lrudiskcache.CacheType;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.stories.cache.DownloadFileState;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedImageView;
import com.inappstory.sdk.stories.utils.Sizes;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public class ImageLoader {
    static ImageLoader loader;
    LruDiskCache cache;
    Context mContext;
    MemoryCache memoryCache2;
    MemoryCache memoryCache = new MemoryCache();
    private Map<ImageView, String> imageViews = Collections.synchronizedMap(new WeakHashMap());
    int stub_id = R.drawable.ic_stories_close;
    public HashMap<String, String> fileLinks = new HashMap<>();
    private final Object fileLinksLock = new Object();
    ExecutorService executorService = Executors.newFixedThreadPool(1);
    ExecutorService widgetImageExecutorService = Executors.newFixedThreadPool(1);

    /* loaded from: classes3.dex */
    class a implements Runnable {
        Bitmap a;
        b b;

        public a(Bitmap bitmap, b bVar) {
            this.a = bitmap;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (!ImageLoader.this.imageViewReused(this.b) && (bitmap = this.a) != null) {
                this.b.b.setImageBitmap(bitmap);
                ImageView imageView = this.b.b;
                if (imageView instanceof GeneratedImageView) {
                    ((GeneratedImageView) imageView).onLoaded();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {
        public String a;
        public ImageView b;
        public LruDiskCache c;

        public b(String str, ImageView imageView, LruDiskCache lruDiskCache) {
            this.a = str;
            this.b = imageView;
            this.c = lruDiskCache;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        b a;

        c(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap decodeFile;
            if (ImageLoader.this.imageViewReused(this.a)) {
                return;
            }
            b bVar = this.a;
            LruDiskCache lruDiskCache = bVar.c;
            if (lruDiskCache == null) {
                decodeFile = ImageLoader.this.decodeFile(new File(this.a.a));
            } else {
                decodeFile = ImageLoader.this.getBitmap(bVar.a, lruDiskCache);
            }
            if (decodeFile != null) {
                ImageLoader.this.memoryCache.put(this.a.a, decodeFile);
            }
            if (ImageLoader.this.imageViewReused(this.a)) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new a(decodeFile, this.a));
        }
    }

    public ImageLoader(Context context) {
        this.memoryCache2 = new MemoryCache();
        this.memoryCache2 = new MemoryCache();
        this.mContext = context;
        loader = this;
    }

    private Shader createShader(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, new int[]{0, Color.parseColor("#AA000000")}, (float[]) null, Shader.TileMode.REPEAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap decodeFile(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(file), null, options);
            int dpToPxExt = Sizes.dpToPxExt(800);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            while (i2 / 2 >= dpToPxExt && i3 / 2 >= dpToPxExt) {
                i2 /= 2;
                i3 /= 2;
                i *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i;
            FileInputStream fileInputStream = new FileInputStream(file);
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options2);
            fileInputStream.close();
            return decodeStream;
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            return null;
        }
    }

    private Bitmap decodeStream(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        int dpToPxExt = Sizes.dpToPxExt(800);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        while (true) {
            i2 /= 2;
            if (i2 < dpToPxExt || (i3 = i3 / 2) < dpToPxExt) {
                break;
            }
            i *= 2;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i;
        return BitmapFactory.decodeStream(inputStream, null, options2);
    }

    public static ImageLoader getInstance() {
        return loader;
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f = i;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    private void queuePhoto(String str, ImageView imageView, LruDiskCache lruDiskCache) {
        this.executorService.submit(new c(new b(str, imageView, lruDiskCache)));
    }

    public void addDarkGradient(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setShader(createShader(bitmap.getWidth(), bitmap.getHeight()));
        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
    }

    public void addLink(String str, String str2) {
        synchronized (this.fileLinksLock) {
            this.fileLinks.put(str, str2);
        }
    }

    public void clearCache() {
        this.memoryCache.clear();
        this.memoryCache2.clear();
    }

    public void clearFileLinks() {
        synchronized (this.fileLinksLock) {
            this.fileLinks.clear();
        }
    }

    public void clearWidgetCache() {
        this.memoryCache2.clear();
    }

    public void displayImage(String str, int i, ImageView imageView) {
        displayImage(str, i, imageView, null);
    }

    public void displayRemoteColor(String str, int i, RemoteViews remoteViews, int i2, Integer num, Float f, Context context) {
        try {
            this.stub_id = i;
            Bitmap bitmap = this.memoryCache2.get(str);
            if (bitmap != null) {
                remoteViews.setImageViewBitmap(i2, bitmap);
                return;
            }
            if (this.cache == null) {
                this.cache = LruDiskCache.create(context.getCacheDir(), InAppStoryService.IAS_PREFIX, 10485760L, CacheType.FAST);
            }
            Bitmap widgetBitmap = getWidgetBitmap(null, num, true, f, str, this.cache);
            this.memoryCache2.put(str, widgetBitmap);
            remoteViews.setImageViewBitmap(i2, widgetBitmap);
        } catch (Exception unused) {
        }
    }

    public void displayRemoteImage(String str, int i, RemoteViews remoteViews, int i2, Integer num, Float f, Context context) {
        try {
            this.stub_id = i;
            if (this.memoryCache2 == null) {
                this.memoryCache2 = new MemoryCache();
            }
            Bitmap bitmap = this.memoryCache2.get(str);
            Bitmap[] bitmapArr = {bitmap};
            if (bitmap != null) {
                remoteViews.setImageViewBitmap(i2, bitmap);
                return;
            }
            if (this.cache == null) {
                this.cache = LruDiskCache.create(context.getCacheDir(), InAppStoryService.IAS_PREFIX, 10485760L, CacheType.COMMON);
            }
            Bitmap widgetBitmap = getWidgetBitmap(str, num, true, f, null, this.cache);
            bitmapArr[0] = widgetBitmap;
            this.memoryCache2.put(str, widgetBitmap);
            remoteViews.setImageViewBitmap(i2, bitmapArr[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Bitmap getBitmap(String str, LruDiskCache lruDiskCache) {
        File file;
        if (str == null) {
            return null;
        }
        try {
            DownloadFileState downloadOrGetFile = Downloader.downloadOrGetFile(str, false, lruDiskCache, null, null);
            if (downloadOrGetFile != null && (file = downloadOrGetFile.file) != null) {
                return decodeFile(file);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getFileLink(String str) {
        synchronized (this.fileLinksLock) {
            try {
                String str2 = this.fileLinks.get(str);
                if (str2 != null) {
                    if (new File(str2).exists()) {
                        return str2;
                    }
                    this.fileLinks.remove(str);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap getWidgetBitmap(String str, Integer num, boolean z, Float f, String str2, LruDiskCache lruDiskCache) {
        File file;
        if (str == null && str2 == null) {
            return null;
        }
        if (num == null) {
            String settings = this.memoryCache2.getSettings("pixels");
            if (settings != null) {
                num = Integer.valueOf(Integer.parseInt(settings));
            }
        } else {
            this.memoryCache2.putSettings("pixels", Integer.toString(num.intValue()));
        }
        if (f == null) {
            String settings2 = this.memoryCache2.getSettings("ratio");
            if (settings2 != null) {
                f = Float.valueOf(Float.parseFloat(settings2));
            }
        } else {
            this.memoryCache2.putSettings("ratio", Float.toString(f.floatValue()));
        }
        if (str == null) {
            Bitmap createBitmap = Bitmap.createBitmap(400, 400, Bitmap.Config.RGB_565);
            new Canvas(createBitmap).drawColor(Color.parseColor(str2));
            if (z) {
                if (f != null && f.floatValue() > 0.0f) {
                    createBitmap = ThumbnailUtils.extractThumbnail(createBitmap, (int) (f.floatValue() * 300.0f), 300);
                } else {
                    createBitmap = ThumbnailUtils.extractThumbnail(createBitmap, 300, 300);
                }
            }
            addDarkGradient(createBitmap);
            if (num != null) {
                return getRoundedCornerBitmap(createBitmap, num.intValue());
            }
            return createBitmap;
        }
        try {
            DownloadFileState downloadOrGetFile = Downloader.downloadOrGetFile(str, false, lruDiskCache, null, null);
            if (downloadOrGetFile != null && (file = downloadOrGetFile.file) != null) {
                Bitmap decodeFile = decodeFile(file);
                if (z) {
                    if (f != null && f.floatValue() > 0.0f) {
                        decodeFile = ThumbnailUtils.extractThumbnail(decodeFile, (int) (f.floatValue() * 300.0f), 300);
                    } else {
                        decodeFile = ThumbnailUtils.extractThumbnail(decodeFile, 300, 300);
                    }
                }
                addDarkGradient(decodeFile);
                if (num != null) {
                    return getRoundedCornerBitmap(decodeFile, num.intValue());
                }
                return decodeFile;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean imageViewReused(b bVar) {
        String str = this.imageViews.get(bVar.b);
        if (str != null && str.equals(bVar.a)) {
            return false;
        }
        return true;
    }

    public void displayImage(String str, int i, ImageView imageView, LruDiskCache lruDiskCache) {
        try {
            this.stub_id = i;
            this.imageViews.put(imageView, str);
            Bitmap bitmap = this.memoryCache.get(str);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                if (imageView instanceof GeneratedImageView) {
                    ((GeneratedImageView) imageView).onLoaded();
                }
            } else {
                queuePhoto(str, imageView, lruDiskCache);
            }
        } catch (Exception unused) {
        }
    }
}
