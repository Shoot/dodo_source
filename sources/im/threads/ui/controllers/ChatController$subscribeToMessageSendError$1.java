package im.threads.ui.controllers;

import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ChatItemSendErrorModel;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.UserPhrase;
import im.threads.business.secureDatabase.DatabaseHolder;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003 \u0004*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lim/threads/business/models/ChatItemSendErrorModel;", "<name for destructuring parameter 0>", "Lxa6;", "Lim/threads/business/models/ChatItem;", "kotlin.jvm.PlatformType", "invoke", "(Lim/threads/business/models/ChatItemSendErrorModel;)Lxa6;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatController$subscribeToMessageSendError$1 extends ej5 implements Function1<ChatItemSendErrorModel, xa6<? extends ChatItem>> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToMessageSendError$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final xa6<? extends ChatItem> invoke(ChatItemSendErrorModel chatItemSendErrorModel) {
        DatabaseHolder database;
        DatabaseHolder database2;
        z65.h(chatItemSendErrorModel, "<name for destructuring parameter 0>");
        String component2 = chatItemSendErrorModel.component2();
        database = this.this$0.getDatabase();
        final ChatItem chatItemByCorrelationId = database.getChatItemByCorrelationId(component2);
        if (chatItemByCorrelationId instanceof UserPhrase) {
            ((UserPhrase) chatItemByCorrelationId).setSentState(MessageStatus.FAILED);
            database2 = this.this$0.getDatabase();
            database2.putChatItem(chatItemByCorrelationId);
        }
        if (chatItemByCorrelationId == null) {
            LoggerEdna.error("chatItem not found");
        }
        return sa6.b(new Callable() { // from class: im.threads.ui.controllers.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ChatItem invoke$lambda$0;
                invoke$lambda$0 = ChatController$subscribeToMessageSendError$1.invoke$lambda$0(ChatItem.this);
                return invoke$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatItem invoke$lambda$0(ChatItem chatItem) {
        return chatItem;
    }
}
