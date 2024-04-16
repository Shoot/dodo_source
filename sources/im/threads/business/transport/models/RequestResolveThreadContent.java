package im.threads.business.transport.models;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: RequestResolveThreadContent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lim/threads/business/transport/models/RequestResolveThreadContent;", "", "()V", "hideAfter", "", "getHideAfter", "()J", "threadId", "getThreadId", MessageAttributes.UUID, "", "getUuid", "()Ljava/lang/String;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestResolveThreadContent {
    private final long hideAfter;
    private final long threadId;
    private final String uuid;

    public final long getHideAfter() {
        return this.hideAfter;
    }

    public final long getThreadId() {
        return this.threadId;
    }

    public final String getUuid() {
        return this.uuid;
    }
}
