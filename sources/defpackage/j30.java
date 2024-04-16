package defpackage;

import defpackage.mwa;
/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* renamed from: j30  reason: default package */
/* loaded from: classes2.dex */
final class j30 extends mwa.a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final p13 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j30(String str, String str2, String str3, String str4, int i, p13 p13Var) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        if (p13Var != null) {
                            this.f = p13Var;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // defpackage.mwa.a
    public String a() {
        return this.a;
    }

    @Override // defpackage.mwa.a
    public int c() {
        return this.e;
    }

    @Override // defpackage.mwa.a
    public p13 d() {
        return this.f;
    }

    @Override // defpackage.mwa.a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mwa.a)) {
            return false;
        }
        mwa.a aVar = (mwa.a) obj;
        if (this.a.equals(aVar.a()) && this.b.equals(aVar.f()) && this.c.equals(aVar.g()) && this.d.equals(aVar.e()) && this.e == aVar.c() && this.f.equals(aVar.d())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mwa.a
    public String f() {
        return this.b;
    }

    @Override // defpackage.mwa.a
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
