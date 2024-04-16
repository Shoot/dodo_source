package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import java.util.Calendar;
import kotlin.Metadata;
/* compiled from: SearchingConsult.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lim/threads/business/models/SearchingConsult;", "Lim/threads/business/models/ChatItem;", "()V", "threadId", "", "getThreadId", "()Ljava/lang/Long;", "timeStamp", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "equals", "", "o", "", "hashCode", "", "isTheSameItem", "otherItem", "setDate", "", "date", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchingConsult implements ChatItem {
    private long timeStamp;

    public SearchingConsult() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        setTimeStamp(calendar.getTimeInMillis());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z65.c(SearchingConsult.class, obj.getClass()) && getTimeStamp() == ((SearchingConsult) obj).getTimeStamp()) {
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
        return chatItem instanceof SearchingConsult;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public final void setDate(long j) {
        setTimeStamp(j);
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public String toString() {
        long timeStamp = getTimeStamp();
        return "SearchingConsult{date=" + timeStamp + "}";
    }
}
