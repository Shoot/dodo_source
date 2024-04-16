package im.threads.business.transport.threadsGate.responses;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: BaseMessage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lim/threads/business/transport/threadsGate/responses/BaseMessage;", "", "", "messageId", "Ljava/lang/String;", "getMessageId", "()Ljava/lang/String;", "Ljava/util/Date;", "sentAt", "Ljava/util/Date;", "getSentAt", "()Ljava/util/Date;", RemoteMessageConst.NOTIFICATION, "getNotification", "Lmb5;", RemoteMessageConst.Notification.CONTENT, "Lmb5;", "getContent", "()Lmb5;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class BaseMessage {
    private final mb5 content;
    private final String messageId;
    private final String notification;
    private final Date sentAt;

    public final mb5 getContent() {
        return this.content;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getNotification() {
        return this.notification;
    }

    public final Date getSentAt() {
        return this.sentAt;
    }
}
