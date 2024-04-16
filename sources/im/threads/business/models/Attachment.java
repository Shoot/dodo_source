package im.threads.business.models;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.models.enums.ErrorStateEnum;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: Attachment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, d2 = {"Lim/threads/business/models/Attachment;", "", "()V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "errorMessage", "getErrorMessage", "setErrorMessage", ElementGenerator.TYPE_LINK, "getLink", "setLink", Action.NAME_ATTRIBUTE, "getName", "setName", "optional", "Lim/threads/business/models/Optional;", "getOptional", "()Lim/threads/business/models/Optional;", "setOptional", "(Lim/threads/business/models/Optional;)V", "result", "getResult", "setResult", "state", "Lim/threads/business/models/enums/AttachmentStateEnum;", "getState", "()Lim/threads/business/models/enums/AttachmentStateEnum;", "setState", "(Lim/threads/business/models/enums/AttachmentStateEnum;)V", MessageAttributes.TYPE, "getType", "setType", "getErrorCodeState", "Lim/threads/business/models/enums/ErrorStateEnum;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Attachment {
    private String errorCode;
    private String link;
    private String name;
    private Optional optional;
    private String result;
    private String type;
    private AttachmentStateEnum state = AttachmentStateEnum.ANY;
    private String errorMessage = "";

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

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        String str = this.name;
        if (str != null && str.length() != 0) {
            return this.name;
        }
        Optional optional = this.optional;
        if (optional != null) {
            return optional.getName();
        }
        return null;
    }

    public final Optional getOptional() {
        return this.optional;
    }

    public final String getResult() {
        return this.result;
    }

    public final AttachmentStateEnum getState() {
        return this.state;
    }

    public final String getType() {
        String str = this.type;
        if (str != null && str.length() != 0) {
            return this.type;
        }
        Optional optional = this.optional;
        if (optional != null) {
            return optional.getType();
        }
        return null;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final void setErrorMessage(String str) {
        z65.h(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOptional(Optional optional) {
        this.optional = optional;
    }

    public final void setResult(String str) {
        this.result = str;
    }

    public final void setState(AttachmentStateEnum attachmentStateEnum) {
        z65.h(attachmentStateEnum, "<set-?>");
        this.state = attachmentStateEnum;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
