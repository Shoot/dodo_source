package im.threads.ui.controllers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$loadHistoryAfterWithLastMessageCheck$1$lastTimeStampDef$1", f = "ChatController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChatController$loadHistoryAfterWithLastMessageCheck$1$lastTimeStampDef$1 extends f3b implements Function2<qx1, cv1<? super Long>, Object> {
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$loadHistoryAfterWithLastMessageCheck$1$lastTimeStampDef$1(ChatController chatController, cv1<? super ChatController$loadHistoryAfterWithLastMessageCheck$1$lastTimeStampDef$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$loadHistoryAfterWithLastMessageCheck$1$lastTimeStampDef$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Long> cv1Var) {
        return ((ChatController$loadHistoryAfterWithLastMessageCheck$1$lastTimeStampDef$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Long itemTimestampForHistoryLoad;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            itemTimestampForHistoryLoad = this.this$0.getItemTimestampForHistoryLoad();
            return itemTimestampForHistoryLoad;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
