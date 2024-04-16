package defpackage;
/* renamed from: q3a  reason: default package */
/* loaded from: classes3.dex */
class q3a {
    private final byte[] a;
    private final byte[] b;
    private final e23 c;
    private int d;
    private int e;

    public q3a(byte[] bArr, byte[] bArr2, e23 e23Var) {
        this.a = bArr;
        this.b = bArr2;
        this.c = e23Var;
    }

    public void a(byte[] bArr, boolean z, int i) {
        b(bArr, i);
        if (z) {
            this.e++;
        }
    }

    public byte[] b(byte[] bArr, int i) {
        if (bArr.length >= this.c.getDigestSize()) {
            e23 e23Var = this.c;
            byte[] bArr2 = this.a;
            e23Var.update(bArr2, 0, bArr2.length);
            this.c.update((byte) (this.d >>> 24));
            this.c.update((byte) (this.d >>> 16));
            this.c.update((byte) (this.d >>> 8));
            this.c.update((byte) this.d);
            this.c.update((byte) (this.e >>> 8));
            this.c.update((byte) this.e);
            this.c.update((byte) -1);
            e23 e23Var2 = this.c;
            byte[] bArr3 = this.b;
            e23Var2.update(bArr3, 0, bArr3.length);
            this.c.doFinal(bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i) {
        this.e = i;
    }

    public void d(int i) {
        this.d = i;
    }
}
