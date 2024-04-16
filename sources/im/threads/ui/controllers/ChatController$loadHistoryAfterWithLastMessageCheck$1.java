package im.threads.ui.controllers;

import im.threads.business.transport.HistoryLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$loadHistoryAfterWithLastMessageCheck$1", f = "ChatController.kt", l = {572}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$loadHistoryAfterWithLastMessageCheck$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ boolean $applyUiChanges;
    final /* synthetic */ HistoryLoader.HistoryLoadingCallback $callback;
    final /* synthetic */ boolean $forceLoad;
    final /* synthetic */ boolean $fromQuickAnswerController;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$loadHistoryAfterWithLastMessageCheck$1(ChatController chatController, boolean z, boolean z2, HistoryLoader.HistoryLoadingCallback historyLoadingCallback, boolean z3, cv1<? super ChatController$loadHistoryAfterWithLastMessageCheck$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
        this.$applyUiChanges = z;
        this.$fromQuickAnswerController = z2;
        this.$callback = historyLoadingCallback;
        this.$forceLoad = z3;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        ChatController$loadHistoryAfterWithLastMessageCheck$1 chatController$loadHistoryAfterWithLastMessageCheck$1 = new ChatController$loadHistoryAfterWithLastMessageCheck$1(this.this$0, this.$applyUiChanges, this.$fromQuickAnswerController, this.$callback, this.$forceLoad, cv1Var);
        chatController$loadHistoryAfterWithLastMessageCheck$1.L$0 = obj;
        return chatController$loadHistoryAfterWithLastMessageCheck$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$loadHistoryAfterWithLastMessageCheck$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        hs2 b;
        Object l0;
        d = c75.d();
        int i = this.label;
        Unit unit = null;
        if (i != 0) {
            if (i == 1) {
                vk9.b(obj);
                l0 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            b = sh0.b((qx1) this.L$0, v33.b(), null, new ChatController$loadHistoryAfterWithLastMessageCheck$1$lastTimeStampDef$1(this.this$0, null), 2, null);
            this.label = 1;
            l0 = b.l0(this);
            if (l0 == d) {
                return d;
            }
        }
        Long l = (Long) l0;
        if (l != null) {
            ChatController.loadHistory$threads_release$default(this.this$0, nf0.d(l.longValue()), nf0.a(true), true, this.$forceLoad, this.$applyUiChanges, this.$fromQuickAnswerController, null, this.$callback, 64, null);
            unit = Unit.a;
        }
        if (unit == null) {
            ChatController.loadHistory$threads_release$default(this.this$0, null, null, false, false, this.$applyUiChanges, this.$fromQuickAnswerController, null, this.$callback, 79, null);
        }
        return Unit.a;
    }
}
