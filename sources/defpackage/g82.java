package defpackage;
/* renamed from: g82  reason: default package */
/* loaded from: classes3.dex */
public class g82 {
    private int a;
    private byte[] b;
    private int c;

    public g82(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public int a() {
        return this.c;
    }

    public byte[] b() {
        return tr.h(this.b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g82)) {
            return false;
        }
        g82 g82Var = (g82) obj;
        if (g82Var.c != this.c) {
            return false;
        }
        return tr.c(this.b, g82Var.b);
    }

    public int hashCode() {
        return this.c ^ tr.F(this.b);
    }

    public g82(byte[] bArr, int i, int i2) {
        this.b = tr.h(bArr);
        this.c = i;
        this.a = i2;
    }
}
