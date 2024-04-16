package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import java.util.List;
import kotlin.Metadata;
/* compiled from: QuickReplyItem.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lim/threads/business/models/QuickReplyItem;", "Lim/threads/business/models/ChatItem;", "items", "", "Lim/threads/business/models/QuickReply;", "timeStamp", "", "(Ljava/util/List;J)V", "getItems", "()Ljava/util/List;", "threadId", "getThreadId", "()Ljava/lang/Long;", "getTimeStamp", "()J", "isTheSameItem", "", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickReplyItem implements ChatItem {
    private final List<QuickReply> items;
    private final long timeStamp;

    public QuickReplyItem(List<QuickReply> list, long j) {
        z65.h(list, "items");
        this.items = list;
        this.timeStamp = j;
    }

    public final List<QuickReply> getItems() {
        return this.items;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return null;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return chatItem instanceof QuickReplyItem;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }
}
