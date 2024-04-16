package im.threads.business.imageLoading;

import android.widget.ImageView;
import im.threads.business.imageLoading.ImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PicassoImageLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.imageLoading.PicassoImageLoader$load$1", f = "PicassoImageLoader.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PicassoImageLoader$load$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ ImageLoader.Config $config;
    int label;
    final /* synthetic */ PicassoImageLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PicassoImageLoader$load$1(ImageLoader.Config config, PicassoImageLoader picassoImageLoader, cv1<? super PicassoImageLoader$load$1> cv1Var) {
        super(2, cv1Var);
        this.$config = config;
        this.this$0 = picassoImageLoader;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new PicassoImageLoader$load$1(this.$config, this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((PicassoImageLoader$load$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            kx1 b = v33.b();
            PicassoImageLoader$load$1$request$1 picassoImageLoader$load$1$request$1 = new PicassoImageLoader$load$1$request$1(this.this$0, this.$config, null);
            this.label = 1;
            obj = qh0.g(b, picassoImageLoader$load$1$request$1, this);
            if (obj == d) {
                return d;
            }
        }
        pi9 pi9Var = (pi9) obj;
        if (this.$config.getCallback() != null) {
            if (pi9Var != null) {
                ImageView imageView = this.$config.getImageView();
                final ImageLoader.Config config = this.$config;
                pi9Var.k(imageView, new gm0() { // from class: im.threads.business.imageLoading.PicassoImageLoader$load$1.1
                    @Override // defpackage.gm0
                    public void onError(Exception exc) {
                        ImageLoader.ImageLoaderCallback callback = ImageLoader.Config.this.getCallback();
                        if (callback != null) {
                            callback.onImageLoadError();
                        }
                    }

                    @Override // defpackage.gm0
                    public void onSuccess() {
                        ImageLoader.ImageLoaderCallback callback = ImageLoader.Config.this.getCallback();
                        if (callback != null) {
                            callback.onImageLoaded();
                        }
                    }
                });
            }
        } else if (pi9Var != null) {
            pi9Var.j(this.$config.getImageView());
        }
        return Unit.a;
    }
}
