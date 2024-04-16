package im.threads.business.rest.models;

import kotlin.Metadata;
/* compiled from: SettingsResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lim/threads/business/rest/models/SettingsResponse;", "", "()V", "clientNotificationDisplayType", "", "getClientNotificationDisplayType", "()Ljava/lang/String;", "setClientNotificationDisplayType", "(Ljava/lang/String;)V", "typingMessagesIntervalSeconds", "", "getTypingMessagesIntervalSeconds", "()Ljava/lang/Integer;", "setTypingMessagesIntervalSeconds", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsResponse {
    private String clientNotificationDisplayType;
    private Integer typingMessagesIntervalSeconds;

    public final String getClientNotificationDisplayType() {
        return this.clientNotificationDisplayType;
    }

    public final Integer getTypingMessagesIntervalSeconds() {
        return this.typingMessagesIntervalSeconds;
    }

    public final void setClientNotificationDisplayType(String str) {
        this.clientNotificationDisplayType = str;
    }

    public final void setTypingMessagesIntervalSeconds(Integer num) {
        this.typingMessagesIntervalSeconds = num;
    }
}
