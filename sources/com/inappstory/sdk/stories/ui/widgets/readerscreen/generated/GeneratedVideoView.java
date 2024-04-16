package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.lrudiskcache.Utils;
import com.inappstory.sdk.stories.cache.Downloader;
import java.io.File;
import java.io.IOException;
/* loaded from: classes3.dex */
public class GeneratedVideoView extends RelativeLayout implements TextureView.SurfaceTextureListener, GeneratedViewCallback {
    LruDiskCache cache;
    ImageView cover;
    File file;
    boolean isGenerated;
    boolean isLoaded;
    boolean isMpPrepared;
    boolean isVideoLoaded;
    MediaPlayer mp;
    String storyId;
    Surface surface;
    TextureView tv;
    String url;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements MediaPlayer.OnPreparedListener {

        /* renamed from: com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedVideoView$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0268a implements Runnable {
            RunnableC0268a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                GeneratedVideoView.this.cover.setVisibility(8);
            }
        }

        a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            GeneratedVideoView.this.isMpPrepared = true;
            mediaPlayer.setLooping(true);
            GeneratedVideoView generatedVideoView = GeneratedVideoView.this;
            generatedVideoView.updateTextureViewSize(generatedVideoView.getWidth(), GeneratedVideoView.this.getHeight(), mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.start();
            new Handler().postDelayed(new RunnableC0268a(), 500L);
        }
    }

    public GeneratedVideoView(Context context) {
        super(context);
        this.cache = InAppStoryService.getInstance().getCommonCache();
        this.storyId = null;
        this.file = null;
        init(context);
    }

    private void init(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.tv = new TextureView(context);
        this.cover = new ImageView(context);
        this.tv.setLayoutParams(layoutParams);
        this.cover.setElevation(8.0f);
        this.cover.setLayoutParams(layoutParams);
        this.cover.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.tv);
        addView(this.cover);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTextureViewSize(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f / f2;
        float f7 = f3 / f4;
        float f8 = 1.0f;
        if (f3 / f > f4 / f2) {
            f8 = f7 / f6;
            f5 = 1.0f;
        } else {
            f5 = f6 / f7;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f5, f / 2.0f, f2 / 2.0f);
        this.tv.setTransform(matrix);
    }

    public void changePlayState() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.mp.pause();
            } else {
                this.mp.start();
            }
        }
    }

    public void destroy() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mp.reset();
            this.mp.release();
            this.mp = null;
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedViewCallback
    public boolean isLoaded() {
        return this.isVideoLoaded;
    }

    public void loadCover(String str) {
        File fullFile;
        if (str == null) {
            this.cover.setBackgroundColor(-16777216);
            return;
        }
        if (this.cache.hasKey(str)) {
            try {
                fullFile = this.cache.getFullFile(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (fullFile == null && fullFile.exists()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                this.cover.setImageBitmap(BitmapFactory.decodeFile(fullFile.getAbsolutePath(), options));
                onLoaded();
                return;
            }
            ImageLoader.getInstance().displayImage(str, -1, this.cover, InAppStoryService.getInstance().getCommonCache());
        }
        fullFile = null;
        if (fullFile == null) {
        }
        ImageLoader.getInstance().displayImage(str, -1, this.cover, InAppStoryService.getInstance().getCommonCache());
    }

    public void loadVideo(String str, String str2) {
        String str3 = this.url;
        if (str3 == null || !str3.equals(str)) {
            this.file = null;
        }
        this.url = str;
        this.isLoaded = true;
        this.storyId = str2;
        if (this.tv.isAvailable()) {
            prepareVideo(this.tv.getSurfaceTexture());
        }
        this.tv.setSurfaceTextureListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedViewCallback
    public void onLoaded() {
        this.isVideoLoaded = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.isMpPrepared = false;
        prepareVideo(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mp.reset();
            this.mp.release();
            this.mp = null;
            return false;
        }
        return false;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public void pausePlay() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void prepareVideo(SurfaceTexture surfaceTexture) {
        this.surface = new Surface(surfaceTexture);
        if (this.mp == null) {
            this.mp = new MediaPlayer();
        }
        this.mp.setSurface(this.surface);
        try {
            if (this.storyId == null) {
                this.storyId = Utils.hash(Downloader.cropUrlOld(this.url, false));
            }
            if (this.file == null && this.cache.hasKey(this.url)) {
                this.file = this.cache.getFullFile(this.url);
            }
            File file = this.file;
            if (file != null && file.exists()) {
                File file2 = this.file;
                boolean renameTo = file2.renameTo(file2);
                if (this.file.length() > 10 && renameTo) {
                    this.mp.setDataSource(this.file.getAbsolutePath());
                } else {
                    this.mp.setDataSource(this.url);
                }
            } else {
                this.mp.setDataSource(this.url);
                Downloader.downloadFileBackground(this.url, false, this.cache, null);
            }
            this.mp.prepareAsync();
            this.mp.setOnPreparedListener(new a());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
        } catch (SecurityException e4) {
            e4.printStackTrace();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void release() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mp.reset();
            this.mp.release();
            this.mp = null;
        }
    }

    public void soundOnOff(boolean z) {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    public boolean startPlay() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            this.mp.start();
            return true;
        }
        return false;
    }

    public void stopPlay() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(0);
            this.mp.pause();
        }
    }

    public GeneratedVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cache = InAppStoryService.getInstance().getCommonCache();
        this.storyId = null;
        this.file = null;
        init(context);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
