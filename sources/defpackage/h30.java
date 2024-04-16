package defpackage;
/* compiled from: AutoValue_StartupTime.java */
/* renamed from: h30  reason: default package */
/* loaded from: classes2.dex */
final class h30 extends xta {
    private final long a;
    private final long b;
    private final long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h30(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.xta
    public long b() {
        return this.b;
    }

    @Override // defpackage.xta
    public long c() {
        return this.a;
    }

    @Override // defpackage.xta
    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xta)) {
            return false;
        }
        xta xtaVar = (xta) obj;
        if (this.a == xtaVar.c() && this.b == xtaVar.b() && this.c == xtaVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
