package im.threads.business.models;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import kotlin.Metadata;
/* compiled from: UnreadMessages.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lim/threads/business/models/UnreadMessages;", "Lim/threads/business/models/ChatItem;", "timeStamp", "", "count", "", "(JI)V", "getCount", "()I", "setCount", "(I)V", "threadId", "getThreadId", "()Ljava/lang/Long;", "getTimeStamp", "()J", "equals", "", "other", "", "getMessage", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "hashCode", "isTheSameItem", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnreadMessages implements ChatItem {
    private int count;
    private final long timeStamp;

    public UnreadMessages(long j, int i) {
        this.timeStamp = j;
        this.count = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(UnreadMessages.class, obj.getClass())) {
            return false;
        }
        UnreadMessages unreadMessages = (UnreadMessages) obj;
        if (getTimeStamp() == unreadMessages.getTimeStamp() && this.count == unreadMessages.count) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getMessage(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Resources resources = context.getResources();
        int i = R.plurals.ecc_unread_messages;
        int i2 = this.count;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        z65.g(quantityString, "context.resources.getQua…d_messages, count, count)");
        return quantityString;
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
        return p57.b(Long.valueOf(getTimeStamp()), Integer.valueOf(this.count));
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return chatItem instanceof UnreadMessages;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public final void setCount(int i) {
        this.count = i;
    }
}
