package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: v94  reason: default package */
/* loaded from: classes3.dex */
public class v94 extends qya {
    private final int b;
    private int c;
    private int d;
    private byte[] e;
    private byte[] f;
    private xc0 g;
    private boolean h;
    private boolean i;
    private byte[] j;
    private byte[] k;
    private int l;

    public v94(xc0 xc0Var) {
        this(xc0Var, xc0Var.a() * 8);
    }

    private void g() {
        int i = this.c;
        this.e = new byte[i];
        this.f = new byte[i];
    }

    private void h() {
        this.c = this.d * 2;
    }

    @Override // defpackage.xc0
    public int a() {
        return this.b;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, a(), bArr2, i2);
        return a();
    }

    @Override // defpackage.qya
    protected byte c(byte b) {
        if (this.l == 0) {
            this.j = e();
        }
        byte[] bArr = this.j;
        int i = this.l;
        byte b2 = (byte) (bArr[i] ^ b);
        byte[] bArr2 = this.k;
        int i2 = i + 1;
        this.l = i2;
        if (this.h) {
            b = b2;
        }
        bArr2[i] = b;
        if (i2 == a()) {
            this.l = 0;
            f(this.k);
        }
        return b2;
    }

    byte[] e() {
        byte[] b = ac4.b(this.e, this.d);
        byte[] bArr = new byte[b.length];
        this.g.b(b, 0, bArr, 0);
        return ac4.b(bArr, this.b);
    }

    void f(byte[] bArr) {
        byte[] a = ac4.a(this.e, this.c - this.b);
        System.arraycopy(a, 0, this.e, 0, a.length);
        System.arraycopy(bArr, 0, this.e, a.length, this.c - a.length);
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/CFB" + (this.d * 8);
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        this.h = z;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            if (a.length >= this.d) {
                this.c = a.length;
                g();
                byte[] h = tr.h(a);
                this.f = h;
                System.arraycopy(h, 0, this.e, 0, h.length);
                if (pq7Var.b() != null) {
                    xc0Var = this.g;
                    v71Var = pq7Var.b();
                    xc0Var.init(true, v71Var);
                }
                this.i = true;
            }
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        h();
        g();
        byte[] bArr = this.f;
        System.arraycopy(bArr, 0, this.e, 0, bArr.length);
        if (v71Var != null) {
            xc0Var = this.g;
            xc0Var.init(true, v71Var);
        }
        this.i = true;
    }

    @Override // defpackage.xc0
    public void reset() {
        this.l = 0;
        tr.g(this.k);
        tr.g(this.j);
        if (this.i) {
            byte[] bArr = this.f;
            System.arraycopy(bArr, 0, this.e, 0, bArr.length);
            this.g.reset();
        }
    }

    public v94(xc0 xc0Var, int i) {
        super(xc0Var);
        this.i = false;
        if (i < 0 || i > xc0Var.a() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (xc0Var.a() * 8));
        }
        this.d = xc0Var.a();
        this.g = xc0Var;
        this.b = i / 8;
        this.k = new byte[a()];
    }
}
