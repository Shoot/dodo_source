package im.threads.business.transport.threadsGate.responses;

import java.util.Date;
import kotlin.Metadata;
/* compiled from: SendMessageData.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lim/threads/business/transport/threadsGate/responses/SendMessageData;", "", "()V", "messageId", "", "getMessageId", "()Ljava/lang/String;", "sentAt", "Ljava/util/Date;", "getSentAt", "()Ljava/util/Date;", "status", "getStatus", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SendMessageData {
    private final String messageId;
    private final Date sentAt;
    private final String status;

    public final String getMessageId() {
        return this.messageId;
    }

    public final Date getSentAt() {
        return this.sentAt;
    }

    public final String getStatus() {
        return this.status;
    }
}
