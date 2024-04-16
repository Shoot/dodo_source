package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultPhrase;
import im.threads.ui.activities.QuickAnswerActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: QuickAnswerController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.QuickAnswerController$onBind$1$onLoaded$1", f = "QuickAnswerController.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QuickAnswerController$onBind$1$onLoaded$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ QuickAnswerActivity $activity;
    final /* synthetic */ List<ChatItem> $items;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuickAnswerController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickAnswerController$onBind$1$onLoaded$1(QuickAnswerActivity quickAnswerActivity, QuickAnswerController quickAnswerController, List<? extends ChatItem> list, cv1<? super QuickAnswerController$onBind$1$onLoaded$1> cv1Var) {
        super(2, cv1Var);
        this.$activity = quickAnswerActivity;
        this.this$0 = quickAnswerController;
        this.$items = list;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        QuickAnswerController$onBind$1$onLoaded$1 quickAnswerController$onBind$1$onLoaded$1 = new QuickAnswerController$onBind$1$onLoaded$1(this.$activity, this.this$0, this.$items, cv1Var);
        quickAnswerController$onBind$1$onLoaded$1.L$0 = obj;
        return quickAnswerController$onBind$1$onLoaded$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((QuickAnswerController$onBind$1$onLoaded$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        hs2 b;
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
            qx1 qx1Var = (qx1) this.L$0;
            b = sh0.b(qx1Var, v33.b(), null, new QuickAnswerController$onBind$1$onLoaded$1$lastConsultPhraseDef$1(this.this$0, this.$items, null), 2, null);
            if (rx1.g(qx1Var)) {
                this.label = 1;
                obj = b.l0(this);
                if (obj == d) {
                    return d;
                }
            }
            return Unit.a;
        }
        this.$activity.setLastUnreadMessage((ConsultPhrase) obj);
        return Unit.a;
    }
}
