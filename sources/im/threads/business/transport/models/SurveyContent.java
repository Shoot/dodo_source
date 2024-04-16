package im.threads.business.transport.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SurveyContent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lim/threads/business/transport/models/SurveyContent;", "", "", MessageAttributes.UUID, "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "text", "getText", "Lmb5;", RemoteMessageConst.Notification.CONTENT, "Lmb5;", "getContent", "()Lmb5;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SurveyContent {
    private final mb5 content;
    private final String text;
    private final String uuid;

    public final mb5 getContent() {
        return this.content;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUuid() {
        return this.uuid;
    }
}
