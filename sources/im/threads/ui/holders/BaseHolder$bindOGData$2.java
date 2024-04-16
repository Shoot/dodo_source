package im.threads.ui.holders;

import im.threads.business.ogParser.OGData;
import im.threads.business.ogParser.OpenGraphParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.holders.BaseHolder$bindOGData$2", f = "BaseHolder.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseHolder$bindOGData$2 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ String $messageText;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHolder$bindOGData$2(BaseHolder baseHolder, String str, String str2, cv1<? super BaseHolder$bindOGData$2> cv1Var) {
        super(2, cv1Var);
        this.this$0 = baseHolder;
        this.$link = str;
        this.$messageText = str2;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        BaseHolder$bindOGData$2 baseHolder$bindOGData$2 = new BaseHolder$bindOGData$2(this.this$0, this.$link, this.$messageText, cv1Var);
        baseHolder$bindOGData$2.L$0 = obj;
        return baseHolder$bindOGData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((BaseHolder$bindOGData$2) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ks8] */
    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        OpenGraphParser openGraphParser;
        hs2 b;
        OpenGraphParser openGraphParser2;
        ks8<OGData> ks8Var;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ks8Var = (ks8) this.L$0;
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            qx1 qx1Var = (qx1) this.L$0;
            openGraphParser = this.this$0.openGraphParser;
            if (openGraphParser != null) {
                b = sh0.b(qx1Var, v33.b(), null, new BaseHolder$bindOGData$2$requestJob$1(this.this$0, this.$link, this.$messageText, null), 2, null);
                openGraphParser2 = this.this$0.openGraphParser;
                ks8<OGData> openGraphParsingStream = openGraphParser2.getOpenGraphParsingStream();
                this.L$0 = openGraphParsingStream;
                this.label = 1;
                obj = b.l0(this);
                if (obj == d) {
                    return d;
                }
                ks8Var = openGraphParsingStream;
            }
            return Unit.a;
        }
        ks8Var.d(obj);
        return Unit.a;
    }
}
