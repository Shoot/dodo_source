package im.threads.business.transport.models;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.models.enums.ErrorStateEnum;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Attachment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u0006\u0010!\u001a\u00020\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011¨\u0006#"}, d2 = {"Lim/threads/business/transport/models/Attachment;", "", "id", "", "result", "", "originalUrl", Action.NAME_ATTRIBUTE, "size", MessageAttributes.TYPE, "state", "Lim/threads/business/models/enums/AttachmentStateEnum;", "errorCode", "errorMessage", ElementGenerator.TYPE_LINK, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lim/threads/business/models/enums/AttachmentStateEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "getErrorMessage", "getId", "()J", "getLink", "getName", "getOriginalUrl", "getResult", "getSize", "getState", "()Lim/threads/business/models/enums/AttachmentStateEnum;", "setState", "(Lim/threads/business/models/enums/AttachmentStateEnum;)V", "getType", "getErrorCodeState", "Lim/threads/business/models/enums/ErrorStateEnum;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Attachment {
    private String errorCode;
    private final String errorMessage;
    private final long id;
    private final String link;
    private final String name;
    private final String originalUrl;
    private final String result;
    private final long size;
    private AttachmentStateEnum state;
    private final String type;

    public Attachment() {
        this(0L, null, null, null, 0L, null, null, null, null, null, 1023, null);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final ErrorStateEnum getErrorCodeState() {
        String str = this.errorCode;
        if (str != null) {
            return ErrorStateEnum.Companion.errorStateEnumFromString(str);
        }
        return ErrorStateEnum.ANY;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final long getId() {
        return this.id;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final String getResult() {
        return this.result;
    }

    public final long getSize() {
        return this.size;
    }

    public final AttachmentStateEnum getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final void setState(AttachmentStateEnum attachmentStateEnum) {
        z65.h(attachmentStateEnum, "<set-?>");
        this.state = attachmentStateEnum;
    }

    public Attachment(long j, String str, String str2, String str3, long j2, String str4, AttachmentStateEnum attachmentStateEnum, String str5, String str6, String str7) {
        z65.h(attachmentStateEnum, "state");
        z65.h(str6, "errorMessage");
        this.id = j;
        this.result = str;
        this.originalUrl = str2;
        this.name = str3;
        this.size = j2;
        this.type = str4;
        this.state = attachmentStateEnum;
        this.errorCode = str5;
        this.errorMessage = str6;
        this.link = str7;
    }

    public /* synthetic */ Attachment(long j, String str, String str2, String str3, long j2, String str4, AttachmentStateEnum attachmentStateEnum, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? j2 : 0L, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? AttachmentStateEnum.ANY : attachmentStateEnum, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? str7 : null);
    }
}
