package im.threads.business.imageLoading;

import im.threads.business.imageLoading.ImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PicassoImageLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.imageLoading.PicassoImageLoader$getBitmap$1", f = "PicassoImageLoader.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PicassoImageLoader$getBitmap$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ ImageLoader.Config $config;
    int label;
    final /* synthetic */ PicassoImageLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PicassoImageLoader$getBitmap$1(PicassoImageLoader picassoImageLoader, ImageLoader.Config config, cv1<? super PicassoImageLoader$getBitmap$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = picassoImageLoader;
        this.$config = config;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new PicassoImageLoader$getBitmap$1(this.this$0, this.$config, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((PicassoImageLoader$getBitmap$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        o6b picassoTarget;
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
            PicassoImageLoader$getBitmap$1$request$1 picassoImageLoader$getBitmap$1$request$1 = new PicassoImageLoader$getBitmap$1$request$1(this.this$0, this.$config, null);
            this.label = 1;
            obj = qh0.g(b, picassoImageLoader$getBitmap$1$request$1, this);
            if (obj == d) {
                return d;
            }
        }
        pi9 pi9Var = (pi9) obj;
        if (pi9Var != null) {
            picassoTarget = this.this$0.getPicassoTarget(this.$config);
            pi9Var.i(picassoTarget);
        }
        return Unit.a;
    }
}
