package im.threads.ui.controllers;

import im.threads.ui.fragments.ChatFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$loadItemsFromDB$1$1", f = "ChatController.kt", l = {492}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$loadItemsFromDB$1$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ boolean $hideProgressBar;
    final /* synthetic */ ChatFragment $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$loadItemsFromDB$1$1(ChatFragment chatFragment, boolean z, ChatController chatController, cv1<? super ChatController$loadItemsFromDB$1$1> cv1Var) {
        super(2, cv1Var);
        this.$it = chatFragment;
        this.$hideProgressBar = z;
        this.this$0 = chatController;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        ChatController$loadItemsFromDB$1$1 chatController$loadItemsFromDB$1$1 = new ChatController$loadItemsFromDB$1$1(this.$it, this.$hideProgressBar, this.this$0, cv1Var);
        chatController$loadItemsFromDB$1$1.L$0 = obj;
        return chatController$loadItemsFromDB$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$loadItemsFromDB$1$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        hs2 b;
        ChatFragment chatFragment;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                chatFragment = (ChatFragment) this.L$0;
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            b = sh0.b((qx1) this.L$0, v33.b(), null, new ChatController$loadItemsFromDB$1$1$itemsDef$1(this.this$0, null), 2, null);
            ChatFragment chatFragment2 = this.$it;
            this.L$0 = chatFragment2;
            this.label = 1;
            obj = b.l0(this);
            if (obj == d) {
                return d;
            }
            chatFragment = chatFragment2;
        }
        chatFragment.addChatItems((List) obj, true);
        if (this.$hideProgressBar) {
            this.$it.hideProgressBar();
            ChatFragment chatFragment3 = this.$it;
            z65.g(chatFragment3, "it");
            ChatFragment.hideErrorView$threads_release$default(chatFragment3, false, 1, null);
        }
        return Unit.a;
    }
}
