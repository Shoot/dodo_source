package im.threads.business.imageLoading;

import im.threads.business.imageLoading.ImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PicassoImageLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lpi9;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.imageLoading.PicassoImageLoader$load$1$request$1", f = "PicassoImageLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PicassoImageLoader$load$1$request$1 extends f3b implements Function2<qx1, cv1<? super pi9>, Object> {
    final /* synthetic */ ImageLoader.Config $config;
    int label;
    final /* synthetic */ PicassoImageLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PicassoImageLoader$load$1$request$1(PicassoImageLoader picassoImageLoader, ImageLoader.Config config, cv1<? super PicassoImageLoader$load$1$request$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = picassoImageLoader;
        this.$config = config;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new PicassoImageLoader$load$1$request$1(this.this$0, this.$config, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super pi9> cv1Var) {
        return ((PicassoImageLoader$load$1$request$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        ImageRequestBuilder imageRequestBuilder;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            imageRequestBuilder = this.this$0.requestBuilder;
            return imageRequestBuilder.getImageRequestBuilder(this.$config);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
