package defpackage;

import defpackage.mwa;
/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* renamed from: l30  reason: default package */
/* loaded from: classes2.dex */
final class l30 extends mwa.c {
    private final String a;
    private final String b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l30(String str, String str2, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // defpackage.mwa.c
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.mwa.c
    public String c() {
        return this.b;
    }

    @Override // defpackage.mwa.c
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mwa.c)) {
            return false;
        }
        mwa.c cVar = (mwa.c) obj;
        if (this.a.equals(cVar.d()) && this.b.equals(cVar.c()) && this.c == cVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
