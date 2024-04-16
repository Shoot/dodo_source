package im.threads.ui.adapters.utils;

import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.UserPhrase;
import im.threads.business.transport.threadsGate.responses.Status;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: SendingStatusObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.adapters.utils.SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1", f = "SendingStatusObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ UserPhrase $item;
    int label;
    final /* synthetic */ SendingStatusObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1(SendingStatusObserver sendingStatusObserver, UserPhrase userPhrase, cv1<? super SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = sendingStatusObserver;
        this.$item = userPhrase;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1(this.this$0, this.$item, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((SendingStatusObserver$startObserving$1$observedMessagesDef$1$1$1$1$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        ChatUpdateProcessor chatUpdateProcessor;
        List<Status> e;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            chatUpdateProcessor = this.this$0.getChatUpdateProcessor();
            e = jc1.e(new Status(this.$item.getId(), this.$item.getBackendMessageId(), MessageStatus.FAILED));
            chatUpdateProcessor.postOutgoingMessageStatusChanged(e);
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
