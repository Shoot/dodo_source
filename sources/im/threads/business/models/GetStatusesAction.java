package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import java.util.List;
import kotlin.Metadata;
/* compiled from: GetStatusesAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lim/threads/business/models/GetStatusesAction;", "Lim/threads/business/models/ChatItem;", "messageId", "", "", "(Ljava/util/List;)V", "getMessageId", "()Ljava/util/List;", "threadId", "", "getThreadId", "()Ljava/lang/Long;", "setThreadId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "timeStamp", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "equals", "", "other", "", "hashCode", "", "isTheSameItem", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class GetStatusesAction implements ChatItem {
    private final List<String> messageId;
    private Long threadId;
    private long timeStamp;

    public GetStatusesAction(List<String> list) {
        z65.h(list, "messageId");
        this.messageId = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z65.c(getClass(), obj.getClass())) {
            return p57.a(this.messageId, ((GetStatusesAction) obj).messageId);
        }
        return false;
    }

    public final List<String> getMessageId() {
        return this.messageId;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return this.threadId;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return p57.b(this.messageId);
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return chatItem instanceof GetStatusesAction;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public void setThreadId(Long l) {
        this.threadId = l;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
