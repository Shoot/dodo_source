package im.threads.business.transport.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: ContentAttachmentSettings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lim/threads/business/transport/models/ContentAttachmentSettings;", "", "()V", RemoteMessageConst.Notification.CONTENT, "Lim/threads/business/transport/models/AttachmentSettings;", "getContent", "()Lim/threads/business/transport/models/AttachmentSettings;", "setContent", "(Lim/threads/business/transport/models/AttachmentSettings;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentAttachmentSettings {
    private AttachmentSettings content;

    public final AttachmentSettings getContent() {
        return this.content;
    }

    public final void setContent(AttachmentSettings attachmentSettings) {
        this.content = attachmentSettings;
    }
}
