package im.threads.business.transport.threadsGate;

import im.threads.business.models.ChatItem;
import im.threads.business.transport.MessageParser;
import im.threads.business.transport.threadsGate.responses.BaseMessage;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: ThreadsGateMessageParser.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/business/transport/threadsGate/ThreadsGateMessageParser;", "", "messageParser", "Lim/threads/business/transport/MessageParser;", "(Lim/threads/business/transport/MessageParser;)V", "format", "Lim/threads/business/models/ChatItem;", "message", "Lim/threads/business/transport/threadsGate/responses/BaseMessage;", "getType", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadsGateMessageParser {
    private final MessageParser messageParser;

    public ThreadsGateMessageParser(MessageParser messageParser) {
        z65.h(messageParser, "messageParser");
        this.messageParser = messageParser;
    }

    public final ChatItem format(BaseMessage baseMessage) {
        long j;
        z65.h(baseMessage, "message");
        MessageParser messageParser = this.messageParser;
        Date sentAt = baseMessage.getSentAt();
        if (sentAt != null) {
            j = sentAt.getTime();
        } else {
            j = 0;
        }
        return messageParser.format(j, baseMessage.getNotification(), baseMessage.getContent());
    }

    public final String getType(BaseMessage baseMessage) {
        z65.h(baseMessage, "message");
        mb5 content = baseMessage.getContent();
        if (content == null) {
            content = new mb5();
        }
        return this.messageParser.getType(content);
    }
}
