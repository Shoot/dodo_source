package im.threads.business.transport.models;

import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Quote.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lim/threads/business/transport/models/Quote;", "", "()V", MessageAttributes.ATTACHMENTS, "", "Lim/threads/business/transport/models/Attachment;", "getAttachments", "()Ljava/util/List;", "id", "", "getId", "()J", "modified", "Lim/threads/business/models/enums/ModificationStateEnum;", "getModified", "()Lim/threads/business/models/enums/ModificationStateEnum;", "operator", "Lim/threads/business/transport/models/Operator;", "getOperator", "()Lim/threads/business/transport/models/Operator;", MessageAttributes.RECEIVED_DATE, "Ljava/util/Date;", "getReceivedDate", "()Ljava/util/Date;", "text", "", "getText", "()Ljava/lang/String;", MessageAttributes.UUID, "getUuid", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Quote {
    private final List<Attachment> attachments;
    private final long id;
    private final ModificationStateEnum modified = ModificationStateEnum.NONE;
    private final Operator operator;
    private final Date receivedDate;
    private final String text;
    private final String uuid;

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final long getId() {
        return this.id;
    }

    public final ModificationStateEnum getModified() {
        return this.modified;
    }

    public final Operator getOperator() {
        return this.operator;
    }

    public final Date getReceivedDate() {
        return this.receivedDate;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUuid() {
        return this.uuid;
    }
}
