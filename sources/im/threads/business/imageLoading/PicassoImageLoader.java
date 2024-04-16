package im.threads.business.imageLoading;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.s58;
import im.threads.business.imageLoading.ImageLoader;
import kotlin.Metadata;
/* compiled from: PicassoImageLoader.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lim/threads/business/imageLoading/PicassoImageLoader;", "Lim/threads/business/imageLoading/ImageLoaderRealisation;", "Lim/threads/business/imageLoading/ImageLoader$Config;", "config", "Lo6b;", "getPicassoTarget", "", "load", "getBitmap", "Landroid/graphics/Bitmap;", "getBitmapSync", "Lim/threads/business/imageLoading/ImageRequestBuilder;", "requestBuilder", "Lim/threads/business/imageLoading/ImageRequestBuilder;", "Lqx1;", "coroutineScope", "Lqx1;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PicassoImageLoader implements ImageLoaderRealisation {
    private final ImageRequestBuilder requestBuilder = new ImageRequestBuilder();
    private final qx1 coroutineScope = rx1.a(v33.c());

    /* JADX INFO: Access modifiers changed from: private */
    public final o6b getPicassoTarget(final ImageLoader.Config config) {
        return new o6b() { // from class: im.threads.business.imageLoading.PicassoImageLoader$getPicassoTarget$1
            @Override // defpackage.o6b
            public void onBitmapFailed(Exception exc, Drawable drawable) {
                ImageView imageView = ImageLoader.Config.this.getImageView();
                if (imageView != null) {
                    imageView.setImageDrawable(drawable);
                }
                ImageLoader.ImageLoaderCallback callback = ImageLoader.Config.this.getCallback();
                if (callback != null) {
                    callback.onImageLoadError();
                }
            }

            @Override // defpackage.o6b
            public void onBitmapLoaded(Bitmap bitmap, s58.e eVar) {
                z65.h(bitmap, "bitmap");
                z65.h(eVar, RemoteMessageConst.FROM);
                ImageView imageView = ImageLoader.Config.this.getImageView();
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                ImageLoader.ImageLoaderCallback callback = ImageLoader.Config.this.getCallback();
                if (callback != null) {
                    callback.onBitmapLoaded(bitmap);
                }
            }

            @Override // defpackage.o6b
            public void onPrepareLoad(Drawable drawable) {
            }
        };
    }

    @Override // im.threads.business.imageLoading.ImageLoaderRealisation
    public void getBitmap(ImageLoader.Config config) {
        z65.h(config, "config");
        if (config.getCallback() != null) {
            sh0.d(this.coroutineScope, null, null, new PicassoImageLoader$getBitmap$1(this, config, null), 3, null);
        }
    }

    @Override // im.threads.business.imageLoading.ImageLoaderRealisation
    public Bitmap getBitmapSync(ImageLoader.Config config) {
        z65.h(config, "config");
        pi9 imageRequestBuilder = this.requestBuilder.getImageRequestBuilder(config);
        if (imageRequestBuilder != null) {
            return imageRequestBuilder.g();
        }
        return null;
    }

    @Override // im.threads.business.imageLoading.ImageLoaderRealisation
    public void load(ImageLoader.Config config) {
        z65.h(config, "config");
        sh0.d(this.coroutineScope, null, null, new PicassoImageLoader$load$1(config, this, null), 3, null);
    }
}
