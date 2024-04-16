package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: NotificationMessage.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lu27;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "data", "<init>", "(Ljava/util/Map;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: u27  reason: default package */
/* loaded from: classes3.dex */
public final class u27 {
    private final Map<String, String> a;

    public u27(Map<String, String> map) {
        z65.h(map, "data");
        this.a = map;
    }

    public final Map<String, String> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u27) && z65.c(this.a, ((u27) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        Map<String, String> map = this.a;
        return "NotificationMessage(data=" + map + ")";
    }
}
