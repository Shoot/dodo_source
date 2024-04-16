package im.threads.business.models;

import im.threads.business.models.enums.ModificationStateEnum;
import kotlin.Metadata;
/* compiled from: ChatItem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000H&J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lim/threads/business/models/ChatItem;", "", "threadId", "", "getThreadId", "()Ljava/lang/Long;", "timeStamp", "getTimeStamp", "()J", "isTheSameItem", "", "otherItem", "modified", "Lim/threads/business/models/enums/ModificationStateEnum;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ChatItem {

    /* compiled from: ChatItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static ModificationStateEnum modified(ChatItem chatItem) {
            return ModificationStateEnum.NONE;
        }
    }

    Long getThreadId();

    long getTimeStamp();

    boolean isTheSameItem(ChatItem chatItem);

    ModificationStateEnum modified();
}
