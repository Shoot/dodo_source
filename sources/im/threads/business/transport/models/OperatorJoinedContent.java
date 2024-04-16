package im.threads.business.transport.models;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: OperatorJoinedContent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lim/threads/business/transport/models/OperatorJoinedContent;", "", "()V", "display", "", "getDisplay", "()Z", "id", "", "getId", "()J", "operator", "Lim/threads/business/transport/models/Operator;", "getOperator", "()Lim/threads/business/transport/models/Operator;", "text", "", "getText", "()Ljava/lang/String;", "threadId", "getThreadId", "title", "getTitle", MessageAttributes.TYPE, "getType", MessageAttributes.UUID, "getUuid", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperatorJoinedContent {
    private final boolean display;
    private final long id;
    private final Operator operator;
    private final String text;
    private final long threadId;
    private final String title;
    private final String type;
    private final String uuid;

    public final boolean getDisplay() {
        return this.display;
    }

    public final long getId() {
        return this.id;
    }

    public final Operator getOperator() {
        return this.operator;
    }

    public final String getText() {
        return this.text;
    }

    public final long getThreadId() {
        return this.threadId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }
}
