package im.threads.ui.controllers;

import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$loadHistory$1", f = "ChatController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$loadHistory$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$loadHistory$1(ChatController chatController, cv1<? super ChatController$loadHistory$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$loadHistory$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$loadHistory$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        WeakReference weakReference;
        WeakReference weakReference2;
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            weakReference = this.this$0.fragment;
            if (weakReference != null && (chatFragment2 = (ChatFragment) weakReference.get()) != null) {
                chatFragment2.hideProgressBar();
            }
            weakReference2 = this.this$0.fragment;
            if (weakReference2 != null && (chatFragment = (ChatFragment) weakReference2.get()) != null) {
                ChatFragment.hideErrorView$threads_release$default(chatFragment, false, 1, null);
            }
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
