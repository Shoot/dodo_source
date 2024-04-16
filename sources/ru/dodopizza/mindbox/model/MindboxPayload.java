package ru.dodopizza.mindbox.model;

import kotlin.Metadata;
/* compiled from: MindboxPayload.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/dodopizza/mindbox/model/MindboxPayload;", "", "webViewTitle", "", "(Ljava/lang/String;)V", "getWebViewTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MindboxPayload {
    @uca("webViewTitle")
    private final String webViewTitle;

    public MindboxPayload(String str) {
        this.webViewTitle = str;
    }

    public static /* synthetic */ MindboxPayload copy$default(MindboxPayload mindboxPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mindboxPayload.webViewTitle;
        }
        return mindboxPayload.copy(str);
    }

    public final String component1() {
        return this.webViewTitle;
    }

    public final MindboxPayload copy(String str) {
        return new MindboxPayload(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MindboxPayload) && z65.c(this.webViewTitle, ((MindboxPayload) obj).webViewTitle)) {
            return true;
        }
        return false;
    }

    public final String getWebViewTitle() {
        return this.webViewTitle;
    }

    public int hashCode() {
        String str = this.webViewTitle;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.webViewTitle;
        return "MindboxPayload(webViewTitle=" + str + ")";
    }
}
