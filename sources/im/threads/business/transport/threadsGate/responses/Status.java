package im.threads.business.transport.threadsGate.responses;

import im.threads.business.models.MessageStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Status.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lim/threads/business/transport/threadsGate/responses/Status;", "", "correlationId", "", "messageId", "status", "Lim/threads/business/models/MessageStatus;", "(Ljava/lang/String;Ljava/lang/String;Lim/threads/business/models/MessageStatus;)V", "getCorrelationId", "()Ljava/lang/String;", "setCorrelationId", "(Ljava/lang/String;)V", "getMessageId", "getStatus", "()Lim/threads/business/models/MessageStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Status {
    private String correlationId;
    private final String messageId;
    private final MessageStatus status;

    public Status(String str, String str2, MessageStatus messageStatus) {
        z65.h(messageStatus, "status");
        this.correlationId = str;
        this.messageId = str2;
        this.status = messageStatus;
    }

    public static /* synthetic */ Status copy$default(Status status, String str, String str2, MessageStatus messageStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = status.correlationId;
        }
        if ((i & 2) != 0) {
            str2 = status.messageId;
        }
        if ((i & 4) != 0) {
            messageStatus = status.status;
        }
        return status.copy(str, str2, messageStatus);
    }

    public final String component1() {
        return this.correlationId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final MessageStatus component3() {
        return this.status;
    }

    public final Status copy(String str, String str2, MessageStatus messageStatus) {
        z65.h(messageStatus, "status");
        return new Status(str, str2, messageStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (z65.c(this.correlationId, status.correlationId) && z65.c(this.messageId, status.messageId) && this.status == status.status) {
            return true;
        }
        return false;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final MessageStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        String str = this.correlationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.messageId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i2 + i) * 31) + this.status.hashCode();
    }

    public final void setCorrelationId(String str) {
        this.correlationId = str;
    }

    public String toString() {
        String str = this.correlationId;
        String str2 = this.messageId;
        MessageStatus messageStatus = this.status;
        return "Status(correlationId=" + str + ", messageId=" + str2 + ", status=" + messageStatus + ")";
    }

    public /* synthetic */ Status(String str, String str2, MessageStatus messageStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, messageStatus);
    }
}
