package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: nr4  reason: default package */
/* loaded from: classes3.dex */
public class nr4 {
    x80 a;
    q03 b;
    x36 c;
    ch0 d;
    byte[] e;
    boolean f;
    v71 g;
    v71 h;
    qr4 i;
    byte[] j;
    private ck3 k;
    private nf5 l;
    private byte[] m;

    public nr4(x80 x80Var, q03 q03Var, x36 x36Var) {
        this.a = x80Var;
        this.b = q03Var;
        this.c = x36Var;
        this.e = new byte[x36Var.getMacSize()];
        this.d = null;
    }

    private byte[] a(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int h;
        byte[] bArr4;
        if (i2 >= this.j.length + this.c.getMacSize()) {
            if (this.d == null) {
                int length = (i2 - this.j.length) - this.c.getMacSize();
                byte[] bArr5 = new byte[length];
                int c = this.i.c() / 8;
                bArr2 = new byte[c];
                int i3 = length + c;
                byte[] bArr6 = new byte[i3];
                this.b.b(bArr6, 0, i3);
                if (this.j.length != 0) {
                    System.arraycopy(bArr6, 0, bArr2, 0, c);
                    System.arraycopy(bArr6, c, bArr5, 0, length);
                } else {
                    System.arraycopy(bArr6, 0, bArr5, 0, length);
                    System.arraycopy(bArr6, length, bArr2, 0, c);
                }
                bArr3 = new byte[length];
                for (int i4 = 0; i4 != length; i4++) {
                    bArr3[i4] = (byte) (bArr[(this.j.length + i) + i4] ^ bArr5[i4]);
                }
                h = 0;
            } else {
                int d = ((rr4) this.i).d() / 8;
                byte[] bArr7 = new byte[d];
                int c2 = this.i.c() / 8;
                bArr2 = new byte[c2];
                int i5 = d + c2;
                byte[] bArr8 = new byte[i5];
                this.b.b(bArr8, 0, i5);
                System.arraycopy(bArr8, 0, bArr7, 0, d);
                System.arraycopy(bArr8, d, bArr2, 0, c2);
                v71 lf5Var = new lf5(bArr7);
                byte[] bArr9 = this.m;
                if (bArr9 != null) {
                    lf5Var = new pq7(lf5Var, bArr9);
                }
                this.d.f(false, lf5Var);
                bArr3 = new byte[this.d.c((i2 - this.j.length) - this.c.getMacSize())];
                ch0 ch0Var = this.d;
                byte[] bArr10 = this.j;
                h = ch0Var.h(bArr, i + bArr10.length, (i2 - bArr10.length) - this.c.getMacSize(), bArr3, 0);
            }
            byte[] b = this.i.b();
            if (this.j.length != 0) {
                bArr4 = e(b);
            } else {
                bArr4 = null;
            }
            int i6 = i + i2;
            byte[] w = tr.w(bArr, i6 - this.c.getMacSize(), i6);
            int length2 = w.length;
            byte[] bArr11 = new byte[length2];
            this.c.init(new lf5(bArr2));
            x36 x36Var = this.c;
            byte[] bArr12 = this.j;
            x36Var.update(bArr, i + bArr12.length, (i2 - bArr12.length) - length2);
            if (b != null) {
                this.c.update(b, 0, b.length);
            }
            if (this.j.length != 0) {
                this.c.update(bArr4, 0, bArr4.length);
            }
            this.c.doFinal(bArr11, 0);
            if (tr.u(w, bArr11)) {
                ch0 ch0Var2 = this.d;
                if (ch0Var2 == null) {
                    return bArr3;
                }
                return tr.w(bArr3, 0, h + ch0Var2.a(bArr3, h));
            }
            throw new InvalidCipherTextException("invalid MAC");
        }
        throw new InvalidCipherTextException("Length of input must be greater than the MAC and V combined");
    }

    private byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        ch0 ch0Var;
        v71 lf5Var;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        if (this.d == null) {
            byte[] bArr5 = new byte[i2];
            int c = this.i.c() / 8;
            bArr3 = new byte[c];
            int i3 = i2 + c;
            byte[] bArr6 = new byte[i3];
            this.b.b(bArr6, 0, i3);
            if (this.j.length != 0) {
                System.arraycopy(bArr6, 0, bArr3, 0, c);
                System.arraycopy(bArr6, c, bArr5, 0, i2);
            } else {
                System.arraycopy(bArr6, 0, bArr5, 0, i2);
                System.arraycopy(bArr6, i2, bArr3, 0, c);
            }
            bArr2 = new byte[i2];
            for (int i4 = 0; i4 != i2; i4++) {
                bArr2[i4] = (byte) (bArr[i + i4] ^ bArr5[i4]);
            }
        } else {
            int d = ((rr4) this.i).d() / 8;
            byte[] bArr7 = new byte[d];
            int c2 = this.i.c() / 8;
            byte[] bArr8 = new byte[c2];
            int i5 = d + c2;
            byte[] bArr9 = new byte[i5];
            this.b.b(bArr9, 0, i5);
            System.arraycopy(bArr9, 0, bArr7, 0, d);
            System.arraycopy(bArr9, d, bArr8, 0, c2);
            if (this.m != null) {
                ch0Var = this.d;
                lf5Var = new pq7(new lf5(bArr7), this.m);
            } else {
                ch0Var = this.d;
                lf5Var = new lf5(bArr7);
            }
            ch0Var.f(true, lf5Var);
            bArr2 = new byte[this.d.c(i2)];
            int h = this.d.h(bArr, i, i2, bArr2, 0);
            i2 = h + this.d.a(bArr2, h);
            bArr3 = bArr8;
        }
        byte[] b = this.i.b();
        if (this.j.length != 0) {
            bArr4 = e(b);
        } else {
            bArr4 = null;
        }
        int macSize = this.c.getMacSize();
        byte[] bArr10 = new byte[macSize];
        this.c.init(new lf5(bArr3));
        this.c.update(bArr2, 0, bArr2.length);
        if (b != null) {
            this.c.update(b, 0, b.length);
        }
        if (this.j.length != 0) {
            this.c.update(bArr4, 0, bArr4.length);
        }
        this.c.doFinal(bArr10, 0);
        byte[] bArr11 = this.j;
        byte[] bArr12 = new byte[bArr11.length + i2 + macSize];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr2, 0, bArr12, this.j.length, i2);
        System.arraycopy(bArr10, 0, bArr12, this.j.length + i2, macSize);
        return bArr12;
    }

    private void c(v71 v71Var) {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.m = pq7Var.a();
            v71Var = pq7Var.b();
        } else {
            this.m = null;
        }
        this.i = (qr4) v71Var;
    }

    public ch0 d() {
        return this.d;
    }

    protected byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            mo7.s(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public x36 f() {
        return this.c;
    }

    public void g(ux uxVar, v71 v71Var, ck3 ck3Var) {
        this.f = true;
        this.h = uxVar;
        this.k = ck3Var;
        c(v71Var);
    }

    public void h(ux uxVar, v71 v71Var, nf5 nf5Var) {
        this.f = false;
        this.g = uxVar;
        this.l = nf5Var;
        c(v71Var);
    }

    public void i(boolean z, v71 v71Var, v71 v71Var2, v71 v71Var3) {
        this.f = z;
        this.g = v71Var;
        this.h = v71Var2;
        this.j = new byte[0];
        c(v71Var3);
    }

    public byte[] j(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] a;
        if (this.f) {
            ck3 ck3Var = this.k;
            if (ck3Var != null) {
                bk3 a2 = ck3Var.a();
                this.g = a2.b().a();
                this.j = a2.a();
            }
        } else if (this.l != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            try {
                this.h = this.l.a(byteArrayInputStream);
                this.j = tr.w(bArr, i, (i2 - byteArrayInputStream.available()) + i);
            } catch (IOException e) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e2.getMessage(), e2);
            }
        }
        this.a.init(this.g);
        byte[] b = db0.b(this.a.a(), this.a.b(this.h));
        byte[] bArr2 = this.j;
        if (bArr2.length != 0) {
            byte[] p = tr.p(bArr2, b);
            tr.y(b, (byte) 0);
            b = p;
        }
        try {
            this.b.a(new rd5(b, this.i.a()));
            if (this.f) {
                a = b(bArr, i, i2);
            } else {
                a = a(bArr, i, i2);
            }
            tr.y(b, (byte) 0);
            return a;
        } catch (Throwable th) {
            tr.y(b, (byte) 0);
            throw th;
        }
    }

    public nr4(x80 x80Var, q03 q03Var, x36 x36Var, ch0 ch0Var) {
        this.a = x80Var;
        this.b = q03Var;
        this.c = x36Var;
        this.e = new byte[x36Var.getMacSize()];
        this.d = ch0Var;
    }
}
