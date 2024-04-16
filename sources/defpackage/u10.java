package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* renamed from: u10  reason: default package */
/* loaded from: classes2.dex */
final class u10 extends j12.e.a.b {
    private final String a;

    @Override // defpackage.j12.e.a.b
    @NonNull
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j12.e.a.b) {
            return this.a.equals(((j12.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }
}
