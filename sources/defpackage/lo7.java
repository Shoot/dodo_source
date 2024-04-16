package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
/* renamed from: lo7  reason: default package */
/* loaded from: classes3.dex */
public class lo7 implements oka {
    private e23 g;
    private e23 h;
    private rx i;
    private SecureRandom j;
    private int k;
    private int l;
    private boolean m = false;
    private int n;
    private int o;
    private byte[] p;
    private byte[] q;
    private byte[] r;
    private byte s;

    public lo7(rx rxVar, e23 e23Var, e23 e23Var2, int i, byte b) {
        this.i = rxVar;
        this.g = e23Var;
        this.h = e23Var2;
        this.k = e23Var.getDigestSize();
        this.l = e23Var2.getDigestSize();
        this.n = i;
        this.p = new byte[i];
        this.q = new byte[i + 8 + this.k];
        this.s = b;
    }

    private void c(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private void d(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private byte[] e(byte[] bArr, int i, int i2, int i3) {
        e23 e23Var = this.h;
        if (e23Var instanceof acc) {
            byte[] bArr2 = new byte[i3];
            e23Var.update(bArr, i, i2);
            ((acc) this.h).c(bArr2, 0, i3);
            return bArr2;
        }
        return f(bArr, i, i2, i3);
    }

    private byte[] f(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.l];
        byte[] bArr4 = new byte[4];
        this.h.reset();
        int i5 = 0;
        while (true) {
            i4 = this.l;
            if (i5 >= i3 / i4) {
                break;
            }
            c(i5, bArr4);
            this.h.update(bArr, i, i2);
            this.h.update(bArr4, 0, 4);
            this.h.doFinal(bArr3, 0);
            int i6 = this.l;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            c(i5, bArr4);
            this.h.update(bArr, i, i2);
            this.h.update(bArr4, 0, 4);
            this.h.doFinal(bArr3, 0);
            int i7 = this.l;
            System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
        }
        return bArr2;
    }

    @Override // defpackage.oka
    public boolean a(byte[] bArr) {
        byte[] bArr2;
        int length;
        byte b;
        e23 e23Var = this.g;
        byte[] bArr3 = this.q;
        e23Var.doFinal(bArr3, (bArr3.length - this.k) - this.n);
        try {
            byte[] c = this.i.c(bArr, 0, bArr.length);
            byte[] bArr4 = this.r;
            tr.z(bArr4, 0, bArr4.length - c.length, (byte) 0);
            byte[] bArr5 = this.r;
            System.arraycopy(c, 0, bArr5, bArr5.length - c.length, c.length);
            bArr2 = this.r;
            length = 255 >>> ((bArr2.length * 8) - this.o);
            b = bArr2[0];
        } catch (Exception unused) {
        }
        if ((b & 255) == (b & length) && bArr2[bArr2.length - 1] == this.s) {
            int length2 = bArr2.length;
            int i = this.k;
            byte[] e = e(bArr2, (length2 - i) - 1, i, (bArr2.length - i) - 1);
            for (int i2 = 0; i2 != e.length; i2++) {
                byte[] bArr6 = this.r;
                bArr6[i2] = (byte) (bArr6[i2] ^ e[i2]);
            }
            byte[] bArr7 = this.r;
            bArr7[0] = (byte) (length & bArr7[0]);
            int i3 = 0;
            while (true) {
                byte[] bArr8 = this.r;
                int length3 = bArr8.length;
                int i4 = this.k;
                int i5 = this.n;
                if (i3 != ((length3 - i4) - i5) - 2) {
                    if (bArr8[i3] != 0) {
                        d(bArr8);
                        return false;
                    }
                    i3++;
                } else if (bArr8[((bArr8.length - i4) - i5) - 2] != 1) {
                    d(bArr8);
                    return false;
                } else {
                    if (this.m) {
                        byte[] bArr9 = this.p;
                        byte[] bArr10 = this.q;
                        System.arraycopy(bArr9, 0, bArr10, bArr10.length - i5, i5);
                    } else {
                        byte[] bArr11 = this.q;
                        System.arraycopy(bArr8, ((bArr8.length - i5) - i4) - 1, bArr11, bArr11.length - i5, i5);
                    }
                    e23 e23Var2 = this.g;
                    byte[] bArr12 = this.q;
                    e23Var2.update(bArr12, 0, bArr12.length);
                    e23 e23Var3 = this.g;
                    byte[] bArr13 = this.q;
                    e23Var3.doFinal(bArr13, bArr13.length - this.k);
                    int length4 = this.r.length;
                    int i6 = this.k;
                    int i7 = (length4 - i6) - 1;
                    int length5 = this.q.length - i6;
                    while (true) {
                        byte[] bArr14 = this.q;
                        if (length5 != bArr14.length) {
                            if ((this.r[i7] ^ bArr14[length5]) != 0) {
                                d(bArr14);
                                d(this.r);
                                return false;
                            }
                            i7++;
                            length5++;
                        } else {
                            d(bArr14);
                            d(this.r);
                            return true;
                        }
                    }
                }
            }
        } else {
            d(bArr2);
            return false;
        }
    }

    @Override // defpackage.oka
    public byte[] b() throws CryptoException, DataLengthException {
        e23 e23Var = this.g;
        byte[] bArr = this.q;
        e23Var.doFinal(bArr, (bArr.length - this.k) - this.n);
        if (this.n != 0) {
            if (!this.m) {
                this.j.nextBytes(this.p);
            }
            byte[] bArr2 = this.p;
            byte[] bArr3 = this.q;
            int length = bArr3.length;
            int i = this.n;
            System.arraycopy(bArr2, 0, bArr3, length - i, i);
        }
        int i2 = this.k;
        byte[] bArr4 = new byte[i2];
        e23 e23Var2 = this.g;
        byte[] bArr5 = this.q;
        e23Var2.update(bArr5, 0, bArr5.length);
        this.g.doFinal(bArr4, 0);
        byte[] bArr6 = this.r;
        int length2 = bArr6.length;
        int i3 = this.n;
        int i4 = this.k;
        bArr6[(((length2 - i3) - 1) - i4) - 1] = 1;
        System.arraycopy(this.p, 0, bArr6, ((bArr6.length - i3) - i4) - 1, i3);
        byte[] e = e(bArr4, 0, i2, (this.r.length - this.k) - 1);
        for (int i5 = 0; i5 != e.length; i5++) {
            byte[] bArr7 = this.r;
            bArr7[i5] = (byte) (bArr7[i5] ^ e[i5]);
        }
        byte[] bArr8 = this.r;
        int length3 = bArr8.length;
        int i6 = this.k;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i6) - 1, i6);
        byte[] bArr9 = this.r;
        bArr9[0] = (byte) ((255 >>> ((bArr9.length * 8) - this.o)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.s;
        byte[] c = this.i.c(bArr9, 0, bArr9.length);
        d(this.r);
        return c;
    }

    public void g() {
        this.g.reset();
    }

    @Override // defpackage.oka
    public void init(boolean z, v71 v71Var) {
        v71 v71Var2;
        n39 n39Var;
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            v71Var2 = qq7Var.a();
            this.j = qq7Var.b();
        } else {
            if (z) {
                this.j = b32.b();
            }
            v71Var2 = v71Var;
        }
        if (v71Var2 instanceof h39) {
            n39Var = ((h39) v71Var2).a();
            this.i.init(z, v71Var);
        } else {
            n39Var = (n39) v71Var2;
            this.i.init(z, v71Var2);
        }
        int bitLength = n39Var.c().bitLength();
        int i = bitLength - 1;
        this.o = i;
        if (i >= (this.k * 8) + (this.n * 8) + 9) {
            this.r = new byte[(bitLength + 6) / 8];
            g();
            return;
        }
        throw new IllegalArgumentException("key too small for specified hash and salt lengths");
    }

    @Override // defpackage.oka
    public void update(byte b) {
        this.g.update(b);
    }

    @Override // defpackage.oka
    public void update(byte[] bArr, int i, int i2) {
        this.g.update(bArr, i, i2);
    }
}
