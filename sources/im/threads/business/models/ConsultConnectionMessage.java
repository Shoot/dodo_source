package im.threads.business.models;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: ConsultConnectionMessage.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0081\u0001\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0002\u0010\u0014B\u008b\u0001\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0002\u0010\u0016J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0002H\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u00062"}, d2 = {"Lim/threads/business/models/ConsultConnectionMessage;", "Lim/threads/business/models/ConsultChatPhrase;", "Lim/threads/business/models/ChatItem;", "Lim/threads/business/models/SystemMessage;", MessageAttributes.UUID, "", "consultId", MessageAttributes.TYPE, Action.NAME_ATTRIBUTE, "sex", "", "date", "", "avatarPath", "status", "title", "orgUnit", "displayMessage", "text", "threadId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V", "role", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V", "connectionType", "getConnectionType", "()Ljava/lang/String;", "display", "getDisplay", "()Z", "getName", "getOrgUnit", "getRole", "getSex", "getStatus", "getThreadId", "()Ljava/lang/Long;", "timeStamp", "getTimeStamp", "()J", "getTitle", "getUuid", "equals", "other", "", "getText", "getType", "hashCode", "", "isTheSameItem", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsultConnectionMessage extends ConsultChatPhrase implements ChatItem, SystemMessage {
    private final String connectionType;
    @uca("display")
    private final boolean display;
    private final String name;
    private final String orgUnit;
    private final String role;
    private final boolean sex;
    private final String status;
    private final String text;
    private final long threadId;
    private final long timeStamp;
    private final String title;
    private final String uuid;

    public ConsultConnectionMessage(String str, String str2, String str3, String str4, boolean z, long j, String str5, String str6, String str7, String str8, boolean z2, String str9, long j2) {
        super(str5, str2);
        this.uuid = str;
        this.connectionType = str3;
        this.name = str4;
        this.sex = z;
        this.timeStamp = j;
        this.status = str6;
        this.title = str7;
        this.orgUnit = str8;
        this.role = null;
        this.display = z2;
        this.text = str9;
        this.threadId = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(ConsultConnectionMessage.class, obj.getClass())) {
            return false;
        }
        ConsultConnectionMessage consultConnectionMessage = (ConsultConnectionMessage) obj;
        if (this.sex == consultConnectionMessage.sex && getTimeStamp() == consultConnectionMessage.getTimeStamp() && this.display == consultConnectionMessage.display && p57.a(this.uuid, consultConnectionMessage.uuid) && p57.a(this.connectionType, consultConnectionMessage.connectionType) && p57.a(this.name, consultConnectionMessage.name) && p57.a(this.status, consultConnectionMessage.status) && p57.a(this.title, consultConnectionMessage.title) && p57.a(this.orgUnit, consultConnectionMessage.orgUnit) && p57.a(this.role, consultConnectionMessage.role) && p57.a(this.text, consultConnectionMessage.text)) {
            return true;
        }
        return false;
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final boolean getDisplay() {
        return this.display;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrgUnit() {
        return this.orgUnit;
    }

    public final String getRole() {
        return this.role;
    }

    public final boolean getSex() {
        return this.sex;
    }

    public final String getStatus() {
        return this.status;
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

    public final String getTitle() {
        return this.title;
    }

    @Override // im.threads.business.models.SystemMessage
    public String getType() {
        String str = this.connectionType;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return p57.b(this.uuid, this.connectionType, this.name, Boolean.valueOf(this.sex), Long.valueOf(getTimeStamp()), this.status, this.title, this.orgUnit, this.role, Boolean.valueOf(this.display), this.text);
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        if (chatItem instanceof ConsultConnectionMessage) {
            return p57.a(this.uuid, ((ConsultConnectionMessage) chatItem).uuid);
        }
        return false;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public ConsultConnectionMessage(String str, String str2, String str3, String str4, boolean z, long j, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, long j2) {
        super(str5, str2);
        this.uuid = str;
        this.connectionType = str3;
        this.name = str4;
        this.sex = z;
        this.timeStamp = j;
        this.status = str6;
        this.title = str7;
        this.orgUnit = str8;
        this.role = str9;
        this.display = z2;
        this.text = str10;
        this.threadId = j2;
    }
}
