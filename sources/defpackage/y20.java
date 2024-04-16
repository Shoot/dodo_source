package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_PersistedEvent.java */
/* renamed from: y20  reason: default package */
/* loaded from: classes2.dex */
public final class y20 extends xy7 {
    private final long a;
    private final wlb b;
    private final wk3 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y20(long j, wlb wlbVar, wk3 wk3Var) {
        this.a = j;
        if (wlbVar != null) {
            this.b = wlbVar;
            if (wk3Var != null) {
                this.c = wk3Var;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // defpackage.xy7
    public wk3 b() {
        return this.c;
    }

    @Override // defpackage.xy7
    public long c() {
        return this.a;
    }

    @Override // defpackage.xy7
    public wlb d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xy7)) {
            return false;
        }
        xy7 xy7Var = (xy7) obj;
        if (this.a == xy7Var.c() && this.b.equals(xy7Var.d()) && this.c.equals(xy7Var.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
