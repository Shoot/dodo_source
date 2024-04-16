package defpackage;

import defpackage.h47;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o2c  reason: default package */
/* loaded from: classes3.dex */
public final class o2c {
    private final q2c a;
    private final kg5 b;
    private byte[] c;
    private byte[] d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2c(q2c q2cVar) {
        if (q2cVar != null) {
            this.a = q2cVar;
            int c = q2cVar.c();
            this.b = new kg5(q2cVar.b(), c);
            this.c = new byte[c];
            this.d = new byte[c];
            return;
        }
        throw new NullPointerException("params == null");
    }

    private byte[] a(byte[] bArr, int i, int i2, h47 h47Var) {
        int c = this.a.c();
        if (bArr != null) {
            if (bArr.length == c) {
                if (h47Var != null) {
                    if (h47Var.d() != null) {
                        int i3 = i + i2;
                        if (i3 <= this.a.d() - 1) {
                            if (i2 == 0) {
                                return bArr;
                            }
                            byte[] a = a(bArr, i, i2 - 1, h47Var);
                            h47 h47Var2 = (h47) new h47.b().g(h47Var.b()).h(h47Var.c()).p(h47Var.g()).n(h47Var.e()).o(i3 - 1).f(0).l();
                            byte[] c2 = this.b.c(this.d, h47Var2.d());
                            byte[] c3 = this.b.c(this.d, ((h47) new h47.b().g(h47Var2.b()).h(h47Var2.c()).p(h47Var2.g()).n(h47Var2.e()).o(h47Var2.f()).f(1).l()).d());
                            byte[] bArr2 = new byte[c];
                            for (int i4 = 0; i4 < c; i4++) {
                                bArr2[i4] = (byte) (a[i4] ^ c3[i4]);
                            }
                            return this.b.a(c2, bArr2);
                        }
                        throw new IllegalArgumentException("max chain length must not be greater than w");
                    }
                    throw new NullPointerException("otsHashAddress byte array == null");
                }
                throw new NullPointerException("otsHashAddress == null");
            }
            throw new IllegalArgumentException("startHash needs to be " + c + "bytes");
        }
        throw new NullPointerException("startHash == null");
    }

    private byte[] b(int i) {
        if (i >= 0 && i < this.a.a()) {
            return this.b.c(this.c, sbc.q(i, 32));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public kg5 c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q2c d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r2c e(h47 h47Var) {
        if (h47Var != null) {
            byte[][] bArr = new byte[this.a.a()];
            for (int i = 0; i < this.a.a(); i++) {
                h47Var = (h47) new h47.b().g(h47Var.b()).h(h47Var.c()).p(h47Var.g()).n(i).o(h47Var.f()).f(h47Var.a()).l();
                bArr[i] = a(b(i), 0, this.a.d() - 1, h47Var);
            }
            return new r2c(this.a, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] f() {
        return tr.h(this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] g(byte[] bArr, h47 h47Var) {
        return this.b.c(bArr, ((h47) new h47.b().g(h47Var.b()).h(h47Var.c()).p(h47Var.g()).l()).d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == this.a.c()) {
                if (bArr2 != null) {
                    if (bArr2.length == this.a.c()) {
                        this.c = bArr;
                        this.d = bArr2;
                        return;
                    }
                    throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
                }
                throw new NullPointerException("publicSeed == null");
            }
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        throw new NullPointerException("secretKeySeed == null");
    }
}
