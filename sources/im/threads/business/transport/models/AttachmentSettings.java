package im.threads.business.transport.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: AttachmentSettings.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lim/threads/business/transport/models/AttachmentSettings;", "", "()V", MessageAttributes.CLIENT_ID, "", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", RemoteMessageConst.Notification.CONTENT, "Lim/threads/business/transport/models/AttachmentSettings$Content;", "getContent", "()Lim/threads/business/transport/models/AttachmentSettings$Content;", "setContent", "(Lim/threads/business/transport/models/AttachmentSettings$Content;)V", "Content", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AttachmentSettings {
    private String clientId;
    private Content content;

    /* compiled from: AttachmentSettings.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lim/threads/business/transport/models/AttachmentSettings$Content;", "", "maxSize", "", "fileExtensions", "", "", "(I[Ljava/lang/String;)V", "<set-?>", "getFileExtensions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getMaxSize", "()I", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Content {
        private String[] fileExtensions;
        private int maxSize;

        public Content(int i, String[] strArr) {
            z65.h(strArr, "fileExtensions");
            this.maxSize = i;
            this.fileExtensions = strArr;
        }

        public final String[] getFileExtensions() {
            return this.fileExtensions;
        }

        public final int getMaxSize() {
            return this.maxSize;
        }
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Content getContent() {
        return this.content;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setContent(Content content) {
        this.content = content;
    }
}
