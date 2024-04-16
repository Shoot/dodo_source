package defpackage;

import androidx.annotation.NonNull;
import java.util.Set;
/* compiled from: AutoValue_ConfigUpdate.java */
/* renamed from: k10  reason: default package */
/* loaded from: classes2.dex */
final class k10 extends yp1 {
    private final Set<String> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k10(Set<String> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    @Override // defpackage.yp1
    @NonNull
    public Set<String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yp1) {
            return this.a.equals(((yp1) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
