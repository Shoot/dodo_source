package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import kotlin.Metadata;
/* compiled from: Space.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lim/threads/business/models/Space;", "Lim/threads/business/models/ChatItem;", "height", "", "timeStamp", "", "(IJ)V", "getHeight", "()I", "threadId", "getThreadId", "()Ljava/lang/Long;", "getTimeStamp", "()J", "equals", "", "other", "", "hashCode", "isTheSameItem", "otherItem", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Space implements ChatItem {
    private final int height;
    private final long timeStamp;

    public Space(int i, long j) {
        this.height = i;
        this.timeStamp = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(Space.class, obj.getClass())) {
            return false;
        }
        Space space = (Space) obj;
        if (this.height == space.height && getTimeStamp() == space.getTimeStamp()) {
            return true;
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
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
        return p57.b(Integer.valueOf(this.height), Long.valueOf(getTimeStamp()));
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return chatItem instanceof Space;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public String toString() {
        int i = this.height;
        long timeStamp = getTimeStamp();
        return "Space{height=" + i + ", timeStamp=" + timeStamp + "}";
    }
}
