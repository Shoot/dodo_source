package defpackage;
/* renamed from: ub4  reason: default package */
/* loaded from: classes3.dex */
public class ub4 {
    private int a;
    private int b;
    private long c;
    private long d;

    public ub4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ub4)) {
            return false;
        }
        ub4 ub4Var = (ub4) obj;
        if (ub4Var.b != this.b || ub4Var.a != this.a || ub4Var.d != this.d || ub4Var.c != this.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.a ^ this.b;
        long j = this.c;
        long j2 = this.d;
        return (((i ^ ((int) j)) ^ ((int) (j >> 32))) ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }

    public ub4(long j, long j2) {
        this.c = j;
        this.d = j2;
    }
}
