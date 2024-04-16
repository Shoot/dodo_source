package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_LibraryVersion.java */
/* renamed from: t20  reason: default package */
/* loaded from: classes2.dex */
public final class t20 extends cp5 {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t20(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // defpackage.cp5
    public String b() {
        return this.a;
    }

    @Override // defpackage.cp5
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cp5)) {
            return false;
        }
        cp5 cp5Var = (cp5) obj;
        if (this.a.equals(cp5Var.b()) && this.b.equals(cp5Var.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
