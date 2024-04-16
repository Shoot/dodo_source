package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SimpleSystemMessage.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lim/threads/business/models/SimpleSystemMessage;", "Lim/threads/business/models/ChatItem;", "Lim/threads/business/models/SystemMessage;", MessageAttributes.UUID, "", MessageAttributes.TYPE, "timeStamp", "", "text", "threadId", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V", "getThreadId", "()Ljava/lang/Long;", "getTimeStamp", "()J", "getUuid", "()Ljava/lang/String;", "equals", "", "other", "", "getText", "getType", "hashCode", "", "isTheSameItem", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SimpleSystemMessage implements ChatItem, SystemMessage {
    private final String text;
    private final long threadId;
    private final long timeStamp;
    private final String type;
    private final String uuid;

    public SimpleSystemMessage(String str, String str2, long j, String str3, long j2) {
        this.uuid = str;
        this.type = str2;
        this.timeStamp = j;
        this.text = str3;
        this.threadId = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(SimpleSystemMessage.class, obj.getClass())) {
            return false;
        }
        SimpleSystemMessage simpleSystemMessage = (SimpleSystemMessage) obj;
        if (getTimeStamp() == simpleSystemMessage.getTimeStamp() && p57.a(this.uuid, simpleSystemMessage.uuid) && p57.a(this.type, simpleSystemMessage.type) && p57.a(this.text, simpleSystemMessage.text) && p57.a(getThreadId(), simpleSystemMessage.getThreadId())) {
            return true;
        }
        return false;
    }

    @Override // im.threads.business.models.SystemMessage
    public String getText() {
        String str = this.text;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return Long.valueOf(this.threadId);
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // im.threads.business.models.SystemMessage
    public String getType() {
        String str = this.type;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return p57.b(this.uuid, this.type, Long.valueOf(getTimeStamp()), this.text, getThreadId());
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        if (chatItem instanceof SimpleSystemMessage) {
            return p57.a(this.uuid, ((SimpleSystemMessage) chatItem).uuid);
        }
        return false;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }
}
