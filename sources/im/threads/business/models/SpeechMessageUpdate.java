package im.threads.business.models;

import im.threads.business.formatters.SpeechStatus;
import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SpeechMessageUpdate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0016J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lim/threads/business/models/SpeechMessageUpdate;", "Lim/threads/business/models/ChatItem;", MessageAttributes.UUID, "", "speechStatus", "Lim/threads/business/formatters/SpeechStatus;", "fileDescription", "Lim/threads/business/models/FileDescription;", "(Ljava/lang/String;Lim/threads/business/formatters/SpeechStatus;Lim/threads/business/models/FileDescription;)V", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "getSpeechStatus", "()Lim/threads/business/formatters/SpeechStatus;", "threadId", "", "getThreadId", "()Ljava/lang/Long;", "timeStamp", "getTimeStamp", "()J", "getUuid", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "isTheSameItem", "otherItem", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeechMessageUpdate implements ChatItem {
    private final FileDescription fileDescription;
    private final SpeechStatus speechStatus;
    private final String uuid;

    public SpeechMessageUpdate(String str, SpeechStatus speechStatus, FileDescription fileDescription) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(speechStatus, "speechStatus");
        z65.h(fileDescription, "fileDescription");
        this.uuid = str;
        this.speechStatus = speechStatus;
        this.fileDescription = fileDescription;
    }

    public static /* synthetic */ SpeechMessageUpdate copy$default(SpeechMessageUpdate speechMessageUpdate, String str, SpeechStatus speechStatus, FileDescription fileDescription, int i, Object obj) {
        if ((i & 1) != 0) {
            str = speechMessageUpdate.uuid;
        }
        if ((i & 2) != 0) {
            speechStatus = speechMessageUpdate.speechStatus;
        }
        if ((i & 4) != 0) {
            fileDescription = speechMessageUpdate.fileDescription;
        }
        return speechMessageUpdate.copy(str, speechStatus, fileDescription);
    }

    public final String component1() {
        return this.uuid;
    }

    public final SpeechStatus component2() {
        return this.speechStatus;
    }

    public final FileDescription component3() {
        return this.fileDescription;
    }

    public final SpeechMessageUpdate copy(String str, SpeechStatus speechStatus, FileDescription fileDescription) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(speechStatus, "speechStatus");
        z65.h(fileDescription, "fileDescription");
        return new SpeechMessageUpdate(str, speechStatus, fileDescription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechMessageUpdate)) {
            return false;
        }
        SpeechMessageUpdate speechMessageUpdate = (SpeechMessageUpdate) obj;
        if (z65.c(this.uuid, speechMessageUpdate.uuid) && this.speechStatus == speechMessageUpdate.speechStatus && z65.c(this.fileDescription, speechMessageUpdate.fileDescription)) {
            return true;
        }
        return false;
    }

    public final FileDescription getFileDescription() {
        return this.fileDescription;
    }

    public final SpeechStatus getSpeechStatus() {
        return this.speechStatus;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return null;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return 0L;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((this.uuid.hashCode() * 31) + this.speechStatus.hashCode()) * 31) + this.fileDescription.hashCode();
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return chatItem instanceof SpeechMessageUpdate;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public String toString() {
        String str = this.uuid;
        SpeechStatus speechStatus = this.speechStatus;
        FileDescription fileDescription = this.fileDescription;
        return "SpeechMessageUpdate(uuid=" + str + ", speechStatus=" + speechStatus + ", fileDescription=" + fileDescription + ")";
    }
}
