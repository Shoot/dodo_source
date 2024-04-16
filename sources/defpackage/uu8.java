package defpackage;
/* compiled from: Query.java */
/* renamed from: uu8  reason: default package */
/* loaded from: classes3.dex */
public abstract class uu8 {
    protected int a;
    private long b;

    public uu8(int i) {
        this.a = i;
    }

    public abstract void a();

    public abstract long b();

    public long c() {
        return this.b;
    }

    public abstract boolean d();

    public void e(long j) {
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.a == ((uu8) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}
