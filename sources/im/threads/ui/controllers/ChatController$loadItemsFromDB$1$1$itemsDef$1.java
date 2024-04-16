package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.secureDatabase.DatabaseHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "Lim/threads/business/models/ChatItem;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$loadItemsFromDB$1$1$itemsDef$1", f = "ChatController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$loadItemsFromDB$1$1$itemsDef$1 extends f3b implements Function2<qx1, cv1<? super List<? extends ChatItem>>, Object> {
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$loadItemsFromDB$1$1$itemsDef$1(ChatController chatController, cv1<? super ChatController$loadItemsFromDB$1$1$itemsDef$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$loadItemsFromDB$1$1$itemsDef$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super List<? extends ChatItem>> cv1Var) {
        return ((ChatController$loadItemsFromDB$1$1$itemsDef$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        DatabaseHolder database;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            database = this.this$0.getDatabase();
            return database.getChatItems(0, -1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
