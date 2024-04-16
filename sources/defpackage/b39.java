package defpackage;

import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: b39  reason: default package */
/* loaded from: classes3.dex */
public class b39 implements l8c {
    private xc0 a;
    private lf5 b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private byte[] f = null;

    public b39(xc0 xc0Var) {
        byte[] bArr = {-90, 89, 89, -90};
        this.d = bArr;
        this.e = bArr;
        this.a = xc0Var;
    }

    private byte[] c(byte[] bArr) {
        int length = bArr.length;
        int i = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i != 0) {
            System.arraycopy(new byte[i], 0, bArr2, length, i);
        }
        return bArr2;
    }

    private byte[] d(byte[] bArr, int i, int i2) {
        int i3 = i2 - 8;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i, bArr3, 0, 8);
        System.arraycopy(bArr, i + 8, bArr2, 0, i3);
        this.a.init(false, this.b);
        int i4 = (i2 / 8) - 1;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = i4; i6 >= 1; i6--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i7 = (i6 - 1) * 8;
                System.arraycopy(bArr2, i7, bArr4, 8, 8);
                int i8 = (i4 * i5) + i6;
                int i9 = 1;
                while (i8 != 0) {
                    int i10 = 8 - i9;
                    bArr4[i10] = (byte) (((byte) i8) ^ bArr4[i10]);
                    i8 >>>= 8;
                    i9++;
                }
                this.a.b(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i7, 8);
            }
        }
        this.f = bArr3;
        return bArr2;
    }

    @Override // defpackage.l8c
    public byte[] a(byte[] bArr, int i, int i2) {
        if (this.c) {
            byte[] bArr2 = new byte[8];
            byte[] h = mo7.h(i2);
            byte[] bArr3 = this.e;
            int i3 = 0;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            System.arraycopy(h, 0, bArr2, this.e.length, h.length);
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            byte[] c = c(bArr4);
            if (c.length == 8) {
                int length = c.length + 8;
                byte[] bArr5 = new byte[length];
                System.arraycopy(bArr2, 0, bArr5, 0, 8);
                System.arraycopy(c, 0, bArr5, 8, c.length);
                this.a.init(true, this.b);
                while (i3 < length) {
                    this.a.b(bArr5, i3, bArr5, i3);
                    i3 += this.a.a();
                }
                return bArr5;
            }
            z29 z29Var = new z29(this.a);
            z29Var.init(true, new pq7(this.b, bArr2));
            return z29Var.a(c, 0, c.length);
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // defpackage.l8c
    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] d;
        if (!this.c) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                if (i3 > 1) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, i, bArr2, 0, i2);
                    byte[] bArr3 = new byte[i2];
                    if (i3 == 2) {
                        this.a.init(false, this.b);
                        int i4 = 0;
                        while (i4 < i2) {
                            this.a.b(bArr2, i4, bArr3, i4);
                            i4 += this.a.a();
                        }
                        byte[] bArr4 = new byte[8];
                        this.f = bArr4;
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
                        byte[] bArr5 = this.f;
                        int length = i2 - bArr5.length;
                        d = new byte[length];
                        System.arraycopy(bArr3, bArr5.length, d, 0, length);
                    } else {
                        d = d(bArr, i, i2);
                    }
                    int i5 = 4;
                    byte[] bArr6 = new byte[4];
                    byte[] bArr7 = new byte[4];
                    System.arraycopy(this.f, 0, bArr6, 0, 4);
                    System.arraycopy(this.f, 4, bArr7, 0, 4);
                    int a = mo7.a(bArr7, 0);
                    boolean u = tr.u(bArr6, this.e);
                    int length2 = d.length;
                    if (a <= length2 - 8) {
                        u = false;
                    }
                    if (a > length2) {
                        u = false;
                    }
                    int i6 = length2 - a;
                    if (i6 < 8 && i6 >= 0) {
                        i5 = i6;
                    } else {
                        u = false;
                    }
                    byte[] bArr8 = new byte[i5];
                    System.arraycopy(d, d.length - i5, bArr8, 0, i5);
                    if (tr.u(bArr8, new byte[i5]) && u) {
                        byte[] bArr9 = new byte[a];
                        System.arraycopy(d, 0, bArr9, 0, a);
                        return bArr9;
                    }
                    throw new InvalidCipherTextException("checksum failed");
                }
                throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
            }
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // defpackage.l8c
    public String getAlgorithmName() {
        return this.a.getAlgorithmName();
    }

    @Override // defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        this.c = z;
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        if (v71Var instanceof lf5) {
            this.b = (lf5) v71Var;
            this.e = this.d;
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.e = pq7Var.a();
            this.b = (lf5) pq7Var.b();
            if (this.e.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }
}
