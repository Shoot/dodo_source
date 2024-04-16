package im.threads.business.transport;

import kotlin.Metadata;
/* compiled from: ChatItemProviderData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lim/threads/business/transport/ChatItemProviderData;", "", MessageAttributes.UUID, "", "messageId", "sentAt", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getMessageId", "()Ljava/lang/String;", "getSentAt", "()J", "getUuid", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatItemProviderData {
    private final String messageId;
    private final long sentAt;
    private final String uuid;

    public ChatItemProviderData(String str, String str2, long j) {
        z65.h(str, MessageAttributes.UUID);
        this.uuid = str;
        this.messageId = str2;
        this.sentAt = j;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final long getSentAt() {
        return this.sentAt;
    }

    public final String getUuid() {
        return this.uuid;
    }
}
