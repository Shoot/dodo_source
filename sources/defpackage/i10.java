package defpackage;

import androidx.annotation.NonNull;
import java.util.List;
/* compiled from: AutoValue_BatchedLogRequest.java */
/* renamed from: i10  reason: default package */
/* loaded from: classes2.dex */
final class i10 extends v90 {
    private final List<tw5> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i10(List<tw5> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // defpackage.v90
    @NonNull
    public List<tw5> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v90) {
            return this.a.equals(((v90) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
