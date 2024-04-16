package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.UserPhrase;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.transport.threadsGate.responses.Status;
import im.threads.business.utils.messenger.Messenger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "status", "Lim/threads/business/transport/threadsGate/responses/Status;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToOutgoingMessageStatusChanged$2 extends ej5 implements Function1<Status, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToOutgoingMessageStatusChanged$2(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Status status) {
        invoke2(status);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Status status) {
        DatabaseHolder database;
        DatabaseHolder database2;
        DatabaseHolder database3;
        ChatItem chatItemByCorrelationId;
        Messenger messenger;
        Messenger messenger2;
        DatabaseHolder database4;
        DatabaseHolder database5;
        z65.h(status, "status");
        database = this.this$0.getDatabase();
        database.setOrUpdateMessageId(status.getCorrelationId(), status.getMessageId());
        if (status.getMessageId() != null) {
            database4 = this.this$0.getDatabase();
            database4.setStateOfUserPhraseByBackendMessageId(status.getMessageId(), status.getStatus());
            database5 = this.this$0.getDatabase();
            chatItemByCorrelationId = database5.getChatItemByBackendMessageId(status.getMessageId());
        } else {
            database2 = this.this$0.getDatabase();
            database2.setStateOfUserPhraseByCorrelationId(status.getCorrelationId(), status.getStatus());
            database3 = this.this$0.getDatabase();
            chatItemByCorrelationId = database3.getChatItemByCorrelationId(status.getCorrelationId());
        }
        if (chatItemByCorrelationId instanceof UserPhrase) {
            MessageStatus status2 = status.getStatus();
            MessageStatus messageStatus = MessageStatus.FAILED;
            if (status2.compareTo(messageStatus) > 0) {
                messenger2 = this.this$0.messenger;
                messenger2.removeUserMessageFromQueue((UserPhrase) chatItemByCorrelationId);
            } else if (status.getStatus() == messageStatus) {
                messenger = this.this$0.messenger;
                messenger.addMsgToResendQueue((UserPhrase) chatItemByCorrelationId);
            }
        }
    }
}
