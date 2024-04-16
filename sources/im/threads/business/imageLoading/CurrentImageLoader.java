package im.threads.business.imageLoading;

import kotlin.Metadata;
/* compiled from: CurrentImageLoader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lim/threads/business/imageLoading/CurrentImageLoader;", "", "()V", "imageLoader", "Lim/threads/business/imageLoading/ImageLoaderRealisation;", "clearLoader", "", "getImageLoader", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrentImageLoader {
    public static final CurrentImageLoader INSTANCE = new CurrentImageLoader();
    private static ImageLoaderRealisation imageLoader = new PicassoImageLoader();

    private CurrentImageLoader() {
    }

    public final void clearLoader() {
        imageLoader = null;
    }

    public final ImageLoaderRealisation getImageLoader() {
        if (imageLoader == null) {
            imageLoader = new PicassoImageLoader();
        }
        ImageLoaderRealisation imageLoaderRealisation = imageLoader;
        if (imageLoaderRealisation == null) {
            return new PicassoImageLoader();
        }
        return imageLoaderRealisation;
    }
}
