package defpackage;

import androidx.annotation.NonNull;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_RolloutsState.java */
/* renamed from: d30  reason: default package */
/* loaded from: classes2.dex */
public final class d30 extends ln9 {
    private final Set<in9> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d30(Set<in9> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    @Override // defpackage.ln9
    @NonNull
    public Set<in9> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ln9) {
            return this.a.equals(((ln9) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
