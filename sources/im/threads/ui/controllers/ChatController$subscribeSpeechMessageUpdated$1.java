package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.SpeechMessageUpdate;
import im.threads.business.secureDatabase.DatabaseHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lim/threads/business/models/ChatItem;", "kotlin.jvm.PlatformType", "speechMessageUpdate", "Lim/threads/business/models/SpeechMessageUpdate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeSpeechMessageUpdated$1 extends ej5 implements Function1<SpeechMessageUpdate, ChatItem> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeSpeechMessageUpdated$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatItem invoke(SpeechMessageUpdate speechMessageUpdate) {
        DatabaseHolder database;
        DatabaseHolder database2;
        z65.h(speechMessageUpdate, "speechMessageUpdate");
        database = this.this$0.getDatabase();
        database.saveSpeechMessageUpdate(speechMessageUpdate);
        database2 = this.this$0.getDatabase();
        ChatItem chatItemByCorrelationId = database2.getChatItemByCorrelationId(speechMessageUpdate.getUuid());
        return chatItemByCorrelationId == null ? speechMessageUpdate : chatItemByCorrelationId;
    }
}
