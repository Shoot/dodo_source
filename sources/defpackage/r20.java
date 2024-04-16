package defpackage;

import androidx.annotation.NonNull;
import defpackage.v45;
/* compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* renamed from: r20  reason: default package */
/* loaded from: classes2.dex */
final class r20 extends v45.a {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r20(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    @Override // defpackage.v45.a
    @NonNull
    public String c() {
        return this.a;
    }

    @Override // defpackage.v45.a
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v45.a)) {
            return false;
        }
        v45.a aVar = (v45.a) obj;
        if (this.a.equals(aVar.c())) {
            String str = this.b;
            if (str == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.a + ", firebaseInstallationId=" + this.b + "}";
    }
}
