package defpackage;

import org.bouncycastle.crypto.CryptoException;
/* renamed from: xs4  reason: default package */
/* loaded from: classes3.dex */
public class xs4 implements oka {
    private e23 g;
    private rx h;
    private int i;
    private int j;
    private byte[] k;
    private byte[] l;
    private int m;
    private boolean n;
    private byte[] o;
    private byte[] p;
    private byte[] q;

    public xs4(rx rxVar, e23 e23Var, boolean z) {
        int intValue;
        this.h = rxVar;
        this.g = e23Var;
        if (z) {
            intValue = 188;
        } else {
            Integer a = at4.a(e23Var);
            if (a != null) {
                intValue = a.intValue();
            } else {
                throw new IllegalArgumentException("no valid trailer for digest: " + e23Var.getAlgorithmName());
            }
        }
        this.i = intValue;
    }

    private void c(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private boolean d(byte[] bArr, byte[] bArr2) {
        int i = this.m;
        byte[] bArr3 = this.l;
        boolean z = true;
        if (i > bArr3.length) {
            if (bArr3.length > bArr2.length) {
                z = false;
            }
            for (int i2 = 0; i2 != this.l.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                }
            }
        } else {
            if (i != bArr2.length) {
                z = false;
            }
            for (int i3 = 0; i3 != bArr2.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    z = false;
                }
            }
        }
        return z;
    }

    private boolean f(byte[] bArr) {
        this.m = 0;
        c(this.l);
        c(bArr);
        return false;
    }

    @Override // defpackage.oka
    public boolean a(byte[] bArr) {
        byte[] c;
        int i;
        byte[] bArr2 = this.p;
        if (bArr2 == null) {
            try {
                c = this.h.c(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else if (tr.c(bArr2, bArr)) {
            c = this.q;
            this.p = null;
            this.q = null;
        } else {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        if (((c[0] & 192) ^ 64) != 0) {
            return f(c);
        }
        if (((c[c.length - 1] & 15) ^ 12) != 0) {
            return f(c);
        }
        if (((c[c.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            i = 2;
            int i2 = ((c[c.length - 2] & 255) << 8) | (c[c.length - 1] & 255);
            Integer a = at4.a(this.g);
            if (a != null) {
                int intValue = a.intValue();
                if (i2 != intValue && (intValue != 15052 || i2 != 16588)) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i2);
                }
            } else {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
        }
        int i3 = 0;
        while (i3 != c.length && ((c[i3] & 15) ^ 10) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int digestSize = this.g.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int length = (c.length - i) - digestSize;
        int i5 = length - i4;
        if (i5 <= 0) {
            return f(c);
        }
        if ((c[0] & 32) == 0) {
            this.n = true;
            if (this.m > i5) {
                return f(c);
            }
            this.g.reset();
            this.g.update(c, i4, i5);
            this.g.doFinal(bArr3, 0);
            boolean z = true;
            for (int i6 = 0; i6 != digestSize; i6++) {
                int i7 = length + i6;
                byte b = (byte) (c[i7] ^ bArr3[i6]);
                c[i7] = b;
                if (b != 0) {
                    z = false;
                }
            }
            if (!z) {
                return f(c);
            }
            byte[] bArr4 = new byte[i5];
            this.o = bArr4;
            System.arraycopy(c, i4, bArr4, 0, bArr4.length);
        } else {
            this.n = false;
            this.g.doFinal(bArr3, 0);
            boolean z2 = true;
            for (int i8 = 0; i8 != digestSize; i8++) {
                int i9 = length + i8;
                byte b2 = (byte) (c[i9] ^ bArr3[i8]);
                c[i9] = b2;
                if (b2 != 0) {
                    z2 = false;
                }
            }
            if (!z2) {
                return f(c);
            }
            byte[] bArr5 = new byte[i5];
            this.o = bArr5;
            System.arraycopy(c, i4, bArr5, 0, bArr5.length);
        }
        if (this.m != 0 && !d(this.l, this.o)) {
            return f(c);
        }
        c(this.l);
        c(c);
        this.m = 0;
        return true;
    }

    @Override // defpackage.oka
    public byte[] b() throws CryptoException {
        int length;
        int i;
        int i2;
        int i3;
        int digestSize = this.g.getDigestSize();
        boolean z = true;
        if (this.i == 188) {
            byte[] bArr = this.k;
            length = (bArr.length - digestSize) - 1;
            this.g.doFinal(bArr, length);
            byte[] bArr2 = this.k;
            bArr2[bArr2.length - 1] = -68;
            i = 8;
        } else {
            byte[] bArr3 = this.k;
            length = (bArr3.length - digestSize) - 2;
            this.g.doFinal(bArr3, length);
            byte[] bArr4 = this.k;
            int i4 = this.i;
            bArr4[bArr4.length - 2] = (byte) (i4 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i4;
            i = 16;
        }
        int i5 = this.m;
        int i6 = ((((digestSize + i5) * 8) + i) + 4) - this.j;
        if (i6 > 0) {
            int i7 = i5 - ((i6 + 7) / 8);
            i2 = length - i7;
            System.arraycopy(this.l, 0, this.k, i2, i7);
            this.o = new byte[i7];
            i3 = 96;
        } else {
            i2 = length - i5;
            System.arraycopy(this.l, 0, this.k, i2, i5);
            this.o = new byte[this.m];
            i3 = 64;
        }
        int i8 = i2 - 1;
        if (i8 > 0) {
            for (int i9 = i8; i9 != 0; i9--) {
                this.k[i9] = -69;
            }
            byte[] bArr5 = this.k;
            bArr5[i8] = (byte) (bArr5[i8] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (11 | i3);
        } else {
            byte[] bArr6 = this.k;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i3);
        }
        rx rxVar = this.h;
        byte[] bArr7 = this.k;
        byte[] c = rxVar.c(bArr7, 0, bArr7.length);
        if ((i3 & 32) != 0) {
            z = false;
        }
        this.n = z;
        byte[] bArr8 = this.l;
        byte[] bArr9 = this.o;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.m = 0;
        c(this.l);
        c(this.k);
        return c;
    }

    public void e() {
        this.g.reset();
        this.m = 0;
        c(this.l);
        byte[] bArr = this.o;
        if (bArr != null) {
            c(bArr);
        }
        this.o = null;
        this.n = false;
        if (this.p != null) {
            this.p = null;
            c(this.q);
            this.q = null;
        }
    }

    @Override // defpackage.oka
    public void init(boolean z, v71 v71Var) {
        n39 n39Var = (n39) v71Var;
        this.h.init(z, n39Var);
        int bitLength = n39Var.c().bitLength();
        this.j = bitLength;
        byte[] bArr = new byte[(bitLength + 7) / 8];
        this.k = bArr;
        int i = this.i;
        int length = bArr.length;
        if (i == 188) {
            this.l = new byte[(length - this.g.getDigestSize()) - 2];
        } else {
            this.l = new byte[(length - this.g.getDigestSize()) - 3];
        }
        e();
    }

    @Override // defpackage.oka
    public void update(byte b) {
        this.g.update(b);
        int i = this.m;
        byte[] bArr = this.l;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.m = i + 1;
    }

    @Override // defpackage.oka
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.m < this.l.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.g.update(bArr, i, i2);
        this.m += i2;
    }
}
