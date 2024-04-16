package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.secureDatabase.DatabaseHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$setMessageAsRead$1", f = "ChatController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$setMessageAsRead$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ ChatItem $item;
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$setMessageAsRead$1(ChatController chatController, ChatItem chatItem, cv1<? super ChatController$setMessageAsRead$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
        this.$item = chatItem;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$setMessageAsRead$1(this.this$0, this.$item, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$setMessageAsRead$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        DatabaseHolder database;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            database = this.this$0.getDatabase();
            database.setMessageWasRead(((ConsultPhrase) this.$item).getId());
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
