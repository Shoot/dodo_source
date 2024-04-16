package defpackage;
/* compiled from: AutoValue_RolloutAssignment.java */
/* renamed from: c30  reason: default package */
/* loaded from: classes2.dex */
final class c30 extends jn9 {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c30(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f = j;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    @Override // defpackage.jn9
    public String c() {
        return this.c;
    }

    @Override // defpackage.jn9
    public String d() {
        return this.d;
    }

    @Override // defpackage.jn9
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jn9)) {
            return false;
        }
        jn9 jn9Var = (jn9) obj;
        if (this.b.equals(jn9Var.e()) && this.c.equals(jn9Var.c()) && this.d.equals(jn9Var.d()) && this.e.equals(jn9Var.g()) && this.f == jn9Var.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jn9
    public long f() {
        return this.f;
    }

    @Override // defpackage.jn9
    public String g() {
        return this.e;
    }

    public int hashCode() {
        long j = this.f;
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.b + ", parameterKey=" + this.c + ", parameterValue=" + this.d + ", variantId=" + this.e + ", templateVersion=" + this.f + "}";
    }
}
