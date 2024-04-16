package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: x94  reason: default package */
/* loaded from: classes3.dex */
public class x94 extends qya {
    private int b;
    private int c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private xc0 g;
    private int h;
    private boolean i;

    public x94(xc0 xc0Var) {
        super(xc0Var);
        this.i = false;
        int a = xc0Var.a();
        this.c = a;
        this.g = xc0Var;
        this.f = new byte[a];
    }

    private void e() {
        byte[] a = ac4.a(this.d, this.b - this.c);
        System.arraycopy(a, 0, this.d, 0, a.length);
        System.arraycopy(this.f, 0, this.d, a.length, this.b - a.length);
    }

    private void f() {
        this.g.b(ac4.b(this.d, this.c), 0, this.f, 0);
    }

    private void g() {
        int i = this.b;
        this.d = new byte[i];
        this.e = new byte[i];
    }

    private void h() {
        this.b = this.c * 2;
    }

    @Override // defpackage.xc0
    public int a() {
        return this.c;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, this.c, bArr2, i2);
        return this.c;
    }

    @Override // defpackage.qya
    protected byte c(byte b) {
        if (this.h == 0) {
            f();
        }
        byte[] bArr = this.f;
        int i = this.h;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = i + 1;
        this.h = i2;
        if (i2 == a()) {
            this.h = 0;
            e();
        }
        return b2;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/OFB";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            if (a.length >= this.c) {
                this.b = a.length;
                g();
                byte[] h = tr.h(a);
                this.e = h;
                System.arraycopy(h, 0, this.d, 0, h.length);
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
        byte[] bArr = this.e;
        System.arraycopy(bArr, 0, this.d, 0, bArr.length);
        if (v71Var != null) {
            xc0Var = this.g;
            xc0Var.init(true, v71Var);
        }
        this.i = true;
    }

    @Override // defpackage.xc0
    public void reset() {
        if (this.i) {
            byte[] bArr = this.e;
            System.arraycopy(bArr, 0, this.d, 0, bArr.length);
            tr.g(this.f);
            this.h = 0;
            this.g.reset();
        }
    }
}
