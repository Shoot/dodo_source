package im.threads.business.transport.models;

import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SpeechMessageUpdatedContent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lim/threads/business/transport/models/SpeechMessageUpdatedContent;", "", MessageAttributes.UUID, "", "speechStatus", MessageAttributes.ATTACHMENTS, "", "Lim/threads/business/transport/models/Attachment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getSpeechStatus", "()Ljava/lang/String;", "getUuid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeechMessageUpdatedContent {
    private final List<Attachment> attachments;
    private final String speechStatus;
    private final String uuid;

    public SpeechMessageUpdatedContent() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpeechMessageUpdatedContent copy$default(SpeechMessageUpdatedContent speechMessageUpdatedContent, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = speechMessageUpdatedContent.uuid;
        }
        if ((i & 2) != 0) {
            str2 = speechMessageUpdatedContent.speechStatus;
        }
        if ((i & 4) != 0) {
            list = speechMessageUpdatedContent.attachments;
        }
        return speechMessageUpdatedContent.copy(str, str2, list);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component2() {
        return this.speechStatus;
    }

    public final List<Attachment> component3() {
        return this.attachments;
    }

    public final SpeechMessageUpdatedContent copy(String str, String str2, List<Attachment> list) {
        return new SpeechMessageUpdatedContent(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechMessageUpdatedContent)) {
            return false;
        }
        SpeechMessageUpdatedContent speechMessageUpdatedContent = (SpeechMessageUpdatedContent) obj;
        if (z65.c(this.uuid, speechMessageUpdatedContent.uuid) && z65.c(this.speechStatus, speechMessageUpdatedContent.speechStatus) && z65.c(this.attachments, speechMessageUpdatedContent.attachments)) {
            return true;
        }
        return false;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getSpeechStatus() {
        return this.speechStatus;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.uuid;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.speechStatus;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Attachment> list = this.attachments;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.uuid;
        String str2 = this.speechStatus;
        List<Attachment> list = this.attachments;
        return "SpeechMessageUpdatedContent(uuid=" + str + ", speechStatus=" + str2 + ", attachments=" + list + ")";
    }

    public SpeechMessageUpdatedContent(String str, String str2, List<Attachment> list) {
        this.uuid = str;
        this.speechStatus = str2;
        this.attachments = list;
    }

    public /* synthetic */ SpeechMessageUpdatedContent(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
