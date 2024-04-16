package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import kotlin.Metadata;
/* compiled from: DateRow.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lim/threads/business/models/DateRow;", "Lim/threads/business/models/ChatItem;", "Lim/threads/business/models/MediaAndFileItem;", "timeStamp", "", "(J)V", "threadId", "getThreadId", "()Ljava/lang/Long;", "getTimeStamp", "()J", "equals", "", "other", "", "hashCode", "", "isTheSameItem", "otherItem", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateRow implements ChatItem, MediaAndFileItem {
    private final long timeStamp;

    public DateRow(long j) {
        this.timeStamp = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z65.c(DateRow.class, obj.getClass()) && getTimeStamp() == ((DateRow) obj).getTimeStamp()) {
            return true;
        }
        return false;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return null;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return p57.b(Long.valueOf(getTimeStamp()));
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return chatItem instanceof DateRow;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public String toString() {
        long timeStamp = getTimeStamp();
        return "DateRow{date=" + timeStamp + "}";
    }
}
