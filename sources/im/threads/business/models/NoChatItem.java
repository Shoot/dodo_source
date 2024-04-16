package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NoChatItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lim/threads/business/models/NoChatItem;", "Lim/threads/business/models/ChatItem;", "timeStamp", "", "threadId", "(JLjava/lang/Long;)V", "getThreadId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimeStamp", "()J", "isTheSameItem", "", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoChatItem implements ChatItem {
    private final Long threadId;
    private final long timeStamp;

    public NoChatItem() {
        this(0L, null, 3, null);
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return this.threadId;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return false;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public NoChatItem(long j, Long l) {
        this.timeStamp = j;
        this.threadId = l;
    }

    public /* synthetic */ NoChatItem(long j, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : l);
    }
}
