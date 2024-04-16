package defpackage;
/* renamed from: q72  reason: default package */
/* loaded from: classes3.dex */
public class q72 {
    private byte[] a;
    private int b;

    public q72(byte[] bArr, int i) {
        this.a = tr.h(bArr);
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public byte[] b() {
        return tr.h(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q72)) {
            return false;
        }
        q72 q72Var = (q72) obj;
        if (q72Var.b != this.b) {
            return false;
        }
        return tr.c(this.a, q72Var.a);
    }

    public int hashCode() {
        return this.b ^ tr.F(this.a);
    }
}
