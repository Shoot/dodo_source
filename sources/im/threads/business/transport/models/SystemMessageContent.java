package im.threads.business.transport.models;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SystemMessageContent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lim/threads/business/transport/models/SystemMessageContent;", "", "()V", "text", "", "getText", "()Ljava/lang/String;", "threadId", "", "getThreadId", "()J", MessageAttributes.TYPE, "getType", MessageAttributes.UUID, "getUuid", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemMessageContent {
    private final String text;
    private final long threadId;
    private final String type;
    private final String uuid;

    public final String getText() {
        return this.text;
    }

    public final long getThreadId() {
        return this.threadId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }
}
