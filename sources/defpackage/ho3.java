package defpackage;
/* renamed from: ho3  reason: default package */
/* loaded from: classes3.dex */
public class ho3 extends fo3 {
    public ho3(xc0 xc0Var) {
        super(xc0Var);
        if (xc0Var.a() == 16) {
            if (!pq8.c("org.bouncycastle.fpe.disable")) {
                return;
            }
            throw new UnsupportedOperationException("FPE disabled");
        }
        throw new IllegalArgumentException("base cipher needs to be 128 bits");
    }

    @Override // defpackage.fo3
    protected int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] p;
        if (this.c.b() > 256) {
            p = fo3.f(vq9.q(this.a, this.c.b(), this.c.c(), fo3.g(bArr), i, i2 / 2));
        } else {
            p = vq9.p(this.a, this.c.b(), this.c.c(), bArr, i, i2);
        }
        System.arraycopy(p, 0, bArr2, i3, i2);
        return i2;
    }

    @Override // defpackage.fo3
    protected int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] w;
        if (this.c.b() > 256) {
            w = fo3.f(vq9.x(this.a, this.c.b(), this.c.c(), fo3.g(bArr), i, i2 / 2));
        } else {
            w = vq9.w(this.a, this.c.b(), this.c.c(), bArr, i, i2);
        }
        System.arraycopy(w, 0, bArr2, i3, i2);
        return i2;
    }

    @Override // defpackage.fo3
    public String c() {
        return "FF3-1";
    }

    @Override // defpackage.fo3
    public void d(boolean z, v71 v71Var) {
        this.b = z;
        jo3 jo3Var = (jo3) v71Var;
        this.c = jo3Var;
        this.a.init(!jo3Var.d(), new lf5(tr.P(this.c.a().a())));
        if (this.c.c().length == 7) {
            return;
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }
}
