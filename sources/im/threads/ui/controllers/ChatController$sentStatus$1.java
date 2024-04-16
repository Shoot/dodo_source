package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.transport.threadsGate.responses.Status;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$sentStatus$1", f = "ChatController.kt", l = {955}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$sentStatus$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Status $status;
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$sentStatus$1(ChatController chatController, Status status, cv1<? super ChatController$sentStatus$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
        this.$status = status;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$sentStatus$1(this.this$0, this.$status, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$sentStatus$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        qx1 qx1Var;
        hs2 b;
        Status messageStatus;
        WeakReference weakReference;
        ChatFragment chatFragment;
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
            qx1Var = this.this$0.coroutineScope;
            b = sh0.b(qx1Var, v33.b(), null, new ChatController$sentStatus$1$result$1(this.this$0, this.$status, null), 2, null);
            this.label = 1;
            obj = b.l0(this);
            if (obj == d) {
                return d;
            }
        }
        messageStatus = this.this$0.getMessageStatus((ChatItem) obj, this.$status);
        weakReference = this.this$0.fragment;
        if (weakReference != null && (chatFragment = (ChatFragment) weakReference.get()) != null) {
            chatFragment.setMessageState(messageStatus.getCorrelationId(), messageStatus.getMessageId(), messageStatus.getStatus());
        }
        return Unit.a;
    }
}
