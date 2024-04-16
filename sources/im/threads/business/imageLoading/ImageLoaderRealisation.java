package im.threads.business.imageLoading;

import android.graphics.Bitmap;
import im.threads.business.imageLoading.ImageLoader;
import kotlin.Metadata;
/* compiled from: ImageLoaderRealisation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lim/threads/business/imageLoading/ImageLoaderRealisation;", "", "getBitmap", "", "config", "Lim/threads/business/imageLoading/ImageLoader$Config;", "getBitmapSync", "Landroid/graphics/Bitmap;", "load", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ImageLoaderRealisation {
    void getBitmap(ImageLoader.Config config);

    Bitmap getBitmapSync(ImageLoader.Config config);

    void load(ImageLoader.Config config);
}
