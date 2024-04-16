package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: u94  reason: default package */
/* loaded from: classes3.dex */
public class u94 implements xc0 {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private xc0 e;
    private boolean f = false;
    private boolean g;

    public u94(xc0 xc0Var) {
        this.b = xc0Var.a();
        this.e = xc0Var;
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] b = ac4.b(this.c, this.b);
        byte[] c = ac4.c(bArr, this.b, i);
        byte[] bArr3 = new byte[c.length];
        this.e.b(c, 0, bArr3, 0);
        byte[] d = ac4.d(bArr3, b);
        System.arraycopy(d, 0, bArr2, i2, d.length);
        if (bArr2.length > i2 + d.length) {
            e(c);
        }
        return d.length;
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] d = ac4.d(ac4.c(bArr, this.b, i), ac4.b(this.c, this.b));
        int length = d.length;
        byte[] bArr3 = new byte[length];
        this.e.b(d, 0, bArr3, 0);
        System.arraycopy(bArr3, 0, bArr2, i2, length);
        if (bArr2.length > i2 + d.length) {
            e(bArr3);
        }
        return length;
    }

    private void e(byte[] bArr) {
        byte[] a = ac4.a(this.c, this.a - this.b);
        System.arraycopy(a, 0, this.c, 0, a.length);
        System.arraycopy(bArr, 0, this.c, a.length, this.a - a.length);
    }

    private void f() {
        int i = this.a;
        this.c = new byte[i];
        this.d = new byte[i];
    }

    private void g() {
        this.a = this.b;
    }

    @Override // defpackage.xc0
    public int a() {
        return this.b;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.g) {
            return d(bArr, i, bArr2, i2);
        }
        return c(bArr, i, bArr2, i2);
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.e.getAlgorithmName() + "/CBC";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        this.g = z;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            if (a.length >= this.b) {
                this.a = a.length;
                f();
                byte[] h = tr.h(a);
                this.d = h;
                System.arraycopy(h, 0, this.c, 0, h.length);
                if (pq7Var.b() != null) {
                    xc0Var = this.e;
                    v71Var = pq7Var.b();
                    xc0Var.init(z, v71Var);
                }
                this.f = true;
            }
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        g();
        f();
        byte[] bArr = this.d;
        System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        if (v71Var != null) {
            xc0Var = this.e;
            xc0Var.init(z, v71Var);
        }
        this.f = true;
    }

    @Override // defpackage.xc0
    public void reset() {
        if (this.f) {
            byte[] bArr = this.d;
            System.arraycopy(bArr, 0, this.c, 0, bArr.length);
            this.e.reset();
        }
    }
}
