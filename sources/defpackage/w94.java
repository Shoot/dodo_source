package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: w94  reason: default package */
/* loaded from: classes3.dex */
public class w94 extends qya {
    private final int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private final int f;
    private final xc0 g;
    private int h;
    private boolean i;

    public w94(xc0 xc0Var) {
        this(xc0Var, xc0Var.a() * 8);
    }

    private byte[] e() {
        byte[] bArr = this.c;
        byte[] bArr2 = new byte[bArr.length];
        this.g.b(bArr, 0, bArr2, 0);
        return ac4.b(bArr2, this.b);
    }

    private void f() {
        byte[] bArr = this.c;
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + 1);
    }

    private void g() {
        int i = this.f;
        this.d = new byte[i / 2];
        this.c = new byte[i];
        this.e = new byte[this.b];
    }

    @Override // defpackage.xc0
    public int a() {
        return this.b;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, this.b, bArr2, i2);
        return this.b;
    }

    @Override // defpackage.qya
    protected byte c(byte b) {
        if (this.h == 0) {
            this.e = e();
        }
        byte[] bArr = this.e;
        int i = this.h;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = i + 1;
        this.h = i2;
        if (i2 == this.b) {
            this.h = 0;
            f();
        }
        return b2;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/GCTR";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            g();
            byte[] h = tr.h(pq7Var.a());
            this.d = h;
            if (h.length == this.f / 2) {
                System.arraycopy(h, 0, this.c, 0, h.length);
                for (int length = this.d.length; length < this.f; length++) {
                    this.c[length] = 0;
                }
                if (pq7Var.b() != null) {
                    xc0Var = this.g;
                    v71Var = pq7Var.b();
                    xc0Var.init(true, v71Var);
                }
                this.i = true;
            }
            throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
        }
        g();
        if (v71Var != null) {
            xc0Var = this.g;
            xc0Var.init(true, v71Var);
        }
        this.i = true;
    }

    @Override // defpackage.xc0
    public void reset() {
        if (this.i) {
            byte[] bArr = this.d;
            System.arraycopy(bArr, 0, this.c, 0, bArr.length);
            for (int length = this.d.length; length < this.f; length++) {
                this.c[length] = 0;
            }
            this.h = 0;
            this.g.reset();
        }
    }

    public w94(xc0 xc0Var, int i) {
        super(xc0Var);
        this.h = 0;
        if (i < 0 || i > xc0Var.a() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (xc0Var.a() * 8));
        }
        this.g = xc0Var;
        int a = xc0Var.a();
        this.f = a;
        this.b = i / 8;
        this.c = new byte[a];
    }
}
