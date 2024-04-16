package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: RequestResolveThread.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lim/threads/business/models/RequestResolveThread;", "Lim/threads/business/models/ChatItem;", MessageAttributes.UUID, "", "hideAfter", "", "timeStamp", "threadId", "isRead", "", "(Ljava/lang/String;JJJZ)V", "getHideAfter", "()J", "()Z", "getThreadId", "()Ljava/lang/Long;", "getTimeStamp", "getUuid", "()Ljava/lang/String;", "equals", "other", "", "hashCode", "", "isTheSameItem", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestResolveThread implements ChatItem {
    private final long hideAfter;
    private final boolean isRead;
    private final long threadId;
    private final long timeStamp;
    private final String uuid;

    public RequestResolveThread(String str, long j, long j2, long j3, boolean z) {
        this.uuid = str;
        this.hideAfter = j;
        this.timeStamp = j2;
        this.threadId = j3;
        this.isRead = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(RequestResolveThread.class, obj.getClass())) {
            return false;
        }
        RequestResolveThread requestResolveThread = (RequestResolveThread) obj;
        if (p57.a(this.uuid, requestResolveThread.uuid) && getTimeStamp() == requestResolveThread.getTimeStamp() && p57.a(Long.valueOf(this.hideAfter), Long.valueOf(requestResolveThread.hideAfter)) && p57.a(getThreadId(), requestResolveThread.getThreadId())) {
            return true;
        }
        return false;
    }

    public final long getHideAfter() {
        return this.hideAfter;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return Long.valueOf(this.threadId);
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return p57.b(this.uuid, Long.valueOf(this.hideAfter), Long.valueOf(getTimeStamp()), getThreadId());
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        if (chatItem instanceof RequestResolveThread) {
            return p57.a(this.uuid, ((RequestResolveThread) chatItem).uuid);
        }
        return false;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }
}
