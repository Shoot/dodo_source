package im.threads.business.models;

import kotlin.Metadata;
/* compiled from: ConsultChatPhrase.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lim/threads/business/models/ConsultChatPhrase;", "", "avatarPath", "", "consultId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatarPath", "()Ljava/lang/String;", "setAvatarPath", "(Ljava/lang/String;)V", "getConsultId", "setConsultId", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ConsultChatPhrase {
    private String avatarPath;
    private String consultId;

    public ConsultChatPhrase(String str, String str2) {
        this.avatarPath = str;
        this.consultId = str2;
    }

    public final String getAvatarPath() {
        return this.avatarPath;
    }

    public final String getConsultId() {
        return this.consultId;
    }

    public final void setAvatarPath(String str) {
        this.avatarPath = str;
    }

    public final void setConsultId(String str) {
        this.consultId = str;
    }
}
