package im.threads.business.imageLoading;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0003-./B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\f\u001a\u00020\u0000J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ#\u0010\u001f\u001a\u00020\u00002\u0016\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 \"\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\u0018\u0010\u001f\u001a\u00020\u00002\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010#J\u0006\u0010$\u001a\u00020\u0000J\u0006\u0010%\u001a\u00020\u0000J\u0016\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fJ\u0016\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fJ\u001f\u0010*\u001a\u00020\u00002\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0 \"\u00020+¢\u0006\u0002\u0010,J\u0016\u0010*\u001a\u00020\u00002\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010#R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u00060"}, d2 = {"Lim/threads/business/imageLoading/ImageLoader;", "", "()V", "config", "Lim/threads/business/imageLoading/ImageLoader$Config;", "getConfig$threads_release", "()Lim/threads/business/imageLoading/ImageLoader$Config;", "autoRotateWithExif", "rotate", "", "callback", "Lim/threads/business/imageLoading/ImageLoader$ImageLoaderCallback;", "disableEdnaSsl", "errorDrawableResourceId", "resourceId", "", "(Ljava/lang/Integer;)Lim/threads/business/imageLoading/ImageLoader;", "getBitmap", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getBitmapSync", "Landroid/graphics/Bitmap;", "into", "imageView", "Landroid/widget/ImageView;", "load", Action.FILE_ATTRIBUTE, "Ljava/io/File;", RemoteMessageConst.Notification.URL, "", "modifications", "", "Lim/threads/business/imageLoading/ImageModifications;", "([Lim/threads/business/imageLoading/ImageModifications;)Lim/threads/business/imageLoading/ImageLoader;", "", "noPlaceholder", "onlyScaleDown", "resize", "targetWidth", "targetHeight", "resizeDimen", "scales", "Landroid/widget/ImageView$ScaleType;", "([Landroid/widget/ImageView$ScaleType;)Lim/threads/business/imageLoading/ImageLoader;", "Companion", "Config", "ImageLoaderCallback", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageLoader {
    public static final Companion Companion = new Companion(null);
    private static ImageLoaderRealisation currentImageLoader = CurrentImageLoader.INSTANCE.getImageLoader();
    private final Config config;

    /* compiled from: ImageLoader.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lim/threads/business/imageLoading/ImageLoader$Companion;", "", "()V", "currentImageLoader", "Lim/threads/business/imageLoading/ImageLoaderRealisation;", "getCurrentImageLoader$threads_release", "()Lim/threads/business/imageLoading/ImageLoaderRealisation;", "setCurrentImageLoader$threads_release", "(Lim/threads/business/imageLoading/ImageLoaderRealisation;)V", "clearLoader", "", "get", "Lim/threads/business/imageLoading/ImageLoader;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearLoader() {
            CurrentImageLoader.INSTANCE.clearLoader();
        }

        public final ImageLoader get() {
            return new ImageLoader(null);
        }

        public final ImageLoaderRealisation getCurrentImageLoader$threads_release() {
            return ImageLoader.currentImageLoader;
        }

        public final void setCurrentImageLoader$threads_release(ImageLoaderRealisation imageLoaderRealisation) {
            z65.h(imageLoaderRealisation, "<set-?>");
            ImageLoader.currentImageLoader = imageLoaderRealisation;
        }
    }

    /* compiled from: ImageLoader.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010)\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R&\u0010+\u001a\f\u0012\u0006\b\u0001\u0012\u00020-\u0018\u00010,X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00103\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\u001e\u0010?\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R&\u0010B\u001a\f\u0012\u0006\b\u0001\u0012\u00020C\u0018\u00010,X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lim/threads/business/imageLoading/ImageLoader$Config;", "", "()V", "callback", "Lim/threads/business/imageLoading/ImageLoader$ImageLoaderCallback;", "getCallback", "()Lim/threads/business/imageLoading/ImageLoader$ImageLoaderCallback;", "setCallback", "(Lim/threads/business/imageLoading/ImageLoader$ImageLoaderCallback;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "errorDrawableResourceId", "", "getErrorDrawableResourceId", "()Ljava/lang/Integer;", "setErrorDrawableResourceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "isAutoRotateWithExif", "", "()Z", "setAutoRotateWithExif", "(Z)V", "isImageUnderSsl", "setImageUnderSsl", "isOnlyScaleDown", "setOnlyScaleDown", "modifications", "", "Lim/threads/business/imageLoading/ImageModifications;", "getModifications", "()[Lim/threads/business/imageLoading/ImageModifications;", "setModifications", "([Lim/threads/business/imageLoading/ImageModifications;)V", "[Lim/threads/business/imageLoading/ImageModifications;", "noPlaceholder", "getNoPlaceholder", "setNoPlaceholder", "resizeDimen", "Landroid/util/Size;", "getResizeDimen", "()Landroid/util/Size;", "setResizeDimen", "(Landroid/util/Size;)V", "resizePair", "getResizePair", "setResizePair", "resourceId", "getResourceId", "setResourceId", "scales", "Landroid/widget/ImageView$ScaleType;", "getScales", "()[Landroid/widget/ImageView$ScaleType;", "setScales", "([Landroid/widget/ImageView$ScaleType;)V", "[Landroid/widget/ImageView$ScaleType;", RemoteMessageConst.Notification.URL, "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Config {
        private ImageLoaderCallback callback;
        public Context context;
        private Integer errorDrawableResourceId;
        private File file;
        private ImageView imageView;
        private boolean isAutoRotateWithExif;
        private boolean isImageUnderSsl = true;
        private boolean isOnlyScaleDown;
        private ImageModifications[] modifications;
        private boolean noPlaceholder;
        private Size resizeDimen;
        private Size resizePair;
        private Integer resourceId;
        private ImageView.ScaleType[] scales;
        private String url;

        public final ImageLoaderCallback getCallback() {
            return this.callback;
        }

        public final Context getContext() {
            Context context = this.context;
            if (context != null) {
                return context;
            }
            z65.z(CoreConstants.CONTEXT_SCOPE_VALUE);
            return null;
        }

        public final Integer getErrorDrawableResourceId() {
            return this.errorDrawableResourceId;
        }

        public final File getFile() {
            return this.file;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final ImageModifications[] getModifications() {
            return this.modifications;
        }

        public final boolean getNoPlaceholder() {
            return this.noPlaceholder;
        }

        public final Size getResizeDimen() {
            return this.resizeDimen;
        }

        public final Size getResizePair() {
            return this.resizePair;
        }

        public final Integer getResourceId() {
            return this.resourceId;
        }

        public final ImageView.ScaleType[] getScales() {
            return this.scales;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isAutoRotateWithExif() {
            return this.isAutoRotateWithExif;
        }

        public final boolean isImageUnderSsl() {
            return this.isImageUnderSsl;
        }

        public final boolean isOnlyScaleDown() {
            return this.isOnlyScaleDown;
        }

        public final void setAutoRotateWithExif(boolean z) {
            this.isAutoRotateWithExif = z;
        }

        public final void setCallback(ImageLoaderCallback imageLoaderCallback) {
            this.callback = imageLoaderCallback;
        }

        public final void setContext(Context context) {
            z65.h(context, "<set-?>");
            this.context = context;
        }

        public final void setErrorDrawableResourceId(Integer num) {
            this.errorDrawableResourceId = num;
        }

        public final void setFile(File file) {
            this.file = file;
        }

        public final void setImageUnderSsl(boolean z) {
            this.isImageUnderSsl = z;
        }

        public final void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public final void setModifications(ImageModifications[] imageModificationsArr) {
            this.modifications = imageModificationsArr;
        }

        public final void setNoPlaceholder(boolean z) {
            this.noPlaceholder = z;
        }

        public final void setOnlyScaleDown(boolean z) {
            this.isOnlyScaleDown = z;
        }

        public final void setResizeDimen(Size size) {
            this.resizeDimen = size;
        }

        public final void setResizePair(Size size) {
            this.resizePair = size;
        }

        public final void setResourceId(Integer num) {
            this.resourceId = num;
        }

        public final void setScales(ImageView.ScaleType[] scaleTypeArr) {
            this.scales = scaleTypeArr;
        }

        public final void setUrl(String str) {
            this.url = str;
        }
    }

    public /* synthetic */ ImageLoader(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final void clearLoader() {
        Companion.clearLoader();
    }

    public static final ImageLoader get() {
        return Companion.get();
    }

    public final ImageLoader autoRotateWithExif(boolean z) {
        this.config.setAutoRotateWithExif(z);
        return this;
    }

    public final ImageLoader callback(ImageLoaderCallback imageLoaderCallback) {
        this.config.setCallback(imageLoaderCallback);
        return this;
    }

    public final ImageLoader disableEdnaSsl() {
        this.config.setImageUnderSsl(false);
        return this;
    }

    public final ImageLoader errorDrawableResourceId(Integer num) {
        this.config.setErrorDrawableResourceId(num);
        return this;
    }

    public final void getBitmap(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.config.setContext(context);
        currentImageLoader.getBitmap(this.config);
    }

    public final Bitmap getBitmapSync(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.config.setContext(context);
        return currentImageLoader.getBitmapSync(this.config);
    }

    public final Config getConfig$threads_release() {
        return this.config;
    }

    public final void into(ImageView imageView) {
        z65.h(imageView, "imageView");
        this.config.setImageView(imageView);
        Config config = this.config;
        Context context = imageView.getContext();
        z65.g(context, "imageView.context");
        config.setContext(context);
        currentImageLoader.load(this.config);
    }

    public final ImageLoader load(String str) {
        this.config.setUrl(str);
        return this;
    }

    public final ImageLoader modifications(ImageModifications... imageModificationsArr) {
        List B;
        z65.h(imageModificationsArr, "modifications");
        B = yr.B(imageModificationsArr);
        ImageModifications[] imageModificationsArr2 = (ImageModifications[]) B.toArray(new ImageModifications[0]);
        Config config = this.config;
        if (imageModificationsArr2.length == 0) {
            imageModificationsArr2 = null;
        }
        config.setModifications(imageModificationsArr2);
        return this;
    }

    public final ImageLoader noPlaceholder() {
        this.config.setNoPlaceholder(true);
        return this;
    }

    public final ImageLoader onlyScaleDown() {
        this.config.setOnlyScaleDown(true);
        return this;
    }

    public final ImageLoader resize(int i, int i2) {
        this.config.setResizePair(new Size(i, i2));
        return this;
    }

    public final ImageLoader resizeDimen(int i, int i2) {
        this.config.setResizePair(new Size(i, i2));
        return this;
    }

    public final ImageLoader scales(ImageView.ScaleType... scaleTypeArr) {
        z65.h(scaleTypeArr, "scales");
        this.config.setScales(scaleTypeArr);
        return this;
    }

    private ImageLoader() {
        this.config = new Config();
    }

    public final ImageLoader load(File file) {
        z65.h(file, Action.FILE_ATTRIBUTE);
        this.config.setFile(file);
        return this;
    }

    public final ImageLoader scales(List<? extends ImageView.ScaleType> list) {
        if (list != null) {
            this.config.setScales((ImageView.ScaleType[]) list.toArray(new ImageView.ScaleType[0]));
        }
        return this;
    }

    public final ImageLoader load(int i) {
        this.config.setResourceId(Integer.valueOf(i));
        return this;
    }

    public final ImageLoader modifications(List<? extends ImageModifications> list) {
        List W;
        if (list != null) {
            W = sc1.W(list);
            ImageModifications[] imageModificationsArr = (ImageModifications[]) W.toArray(new ImageModifications[0]);
            Config config = this.config;
            if (imageModificationsArr.length == 0) {
                imageModificationsArr = null;
            }
            config.setModifications(imageModificationsArr);
        }
        return this;
    }

    /* compiled from: ImageLoader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lim/threads/business/imageLoading/ImageLoader$ImageLoaderCallback;", "", "onBitmapLoaded", "", "bitmap", "Landroid/graphics/Bitmap;", "onImageLoadError", "onImageLoaded", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface ImageLoaderCallback {
        void onBitmapLoaded(Bitmap bitmap);

        void onImageLoadError();

        void onImageLoaded();

        /* compiled from: ImageLoader.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class DefaultImpls {
            public static void onBitmapLoaded(ImageLoaderCallback imageLoaderCallback, Bitmap bitmap) {
                z65.h(bitmap, "bitmap");
            }

            public static void onImageLoadError(ImageLoaderCallback imageLoaderCallback) {
            }

            public static void onImageLoaded(ImageLoaderCallback imageLoaderCallback) {
            }
        }
    }
}
