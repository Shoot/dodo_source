package im.threads.ui.holders;

import im.threads.business.ogParser.OGData;
import im.threads.business.ogParser.OpenGraphParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: BaseHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lim/threads/business/ogParser/OGData;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.holders.BaseHolder$bindOGData$2$requestJob$1", f = "BaseHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BaseHolder$bindOGData$2$requestJob$1 extends f3b implements Function2<qx1, cv1<? super OGData>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ String $messageText;
    int label;
    final /* synthetic */ BaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHolder$bindOGData$2$requestJob$1(BaseHolder baseHolder, String str, String str2, cv1<? super BaseHolder$bindOGData$2$requestJob$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = baseHolder;
        this.$link = str;
        this.$messageText = str2;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new BaseHolder$bindOGData$2$requestJob$1(this.this$0, this.$link, this.$messageText, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super OGData> cv1Var) {
        return ((BaseHolder$bindOGData$2$requestJob$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        OpenGraphParser openGraphParser;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            openGraphParser = this.this$0.openGraphParser;
            return openGraphParser.getContents(this.$link, this.$messageText);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
