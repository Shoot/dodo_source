package defpackage;
/* renamed from: go3  reason: default package */
/* loaded from: classes3.dex */
public class go3 extends fo3 {
    public go3(xc0 xc0Var) {
        super(xc0Var);
        if (xc0Var.a() == 16) {
            if (!pq8.c("org.bouncycastle.fpe.disable") && !pq8.c("org.bouncycastle.fpe.disable_ff1")) {
                return;
            }
            throw new UnsupportedOperationException("FF1 encryption disabled");
        }
        throw new IllegalArgumentException("base cipher needs to be 128 bits");
    }

    @Override // defpackage.fo3
    protected int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] n;
        if (this.c.b() > 256) {
            n = fo3.f(vq9.o(this.a, this.c.b(), this.c.c(), fo3.g(bArr), i, i2 / 2));
        } else {
            n = vq9.n(this.a, this.c.b(), this.c.c(), bArr, i, i2);
        }
        System.arraycopy(n, 0, bArr2, i3, i2);
        return i2;
    }

    @Override // defpackage.fo3
    protected int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] t;
        if (this.c.b() > 256) {
            t = fo3.f(vq9.u(this.a, this.c.b(), this.c.c(), fo3.g(bArr), i, i2 / 2));
        } else {
            t = vq9.t(this.a, this.c.b(), this.c.c(), bArr, i, i2);
        }
        System.arraycopy(t, 0, bArr2, i3, i2);
        return i2;
    }

    @Override // defpackage.fo3
    public String c() {
        return "FF1";
    }

    @Override // defpackage.fo3
    public void d(boolean z, v71 v71Var) {
        this.b = z;
        jo3 jo3Var = (jo3) v71Var;
        this.c = jo3Var;
        this.a.init(!jo3Var.d(), this.c.a());
    }
}
