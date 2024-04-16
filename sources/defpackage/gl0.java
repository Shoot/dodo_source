package defpackage;

import org.bouncycastle.util.encoders.b;
/* renamed from: gl0  reason: default package */
/* loaded from: classes3.dex */
public class gl0 implements wq9 {
    private static final byte[] j = b.b("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    private hj3 a;
    private xc0 b;
    private int c;
    private int d;
    private int e;
    private byte[] f;
    private byte[] g;
    private long h = 0;
    private boolean i;

    public gl0(xc0 xc0Var, int i, int i2, hj3 hj3Var, byte[] bArr, byte[] bArr2) {
        this.i = false;
        this.a = hj3Var;
        this.b = xc0Var;
        this.c = i;
        this.e = i2;
        this.d = (xc0Var.a() * 8) + i;
        this.i = n(xc0Var);
        if (i2 <= 256) {
            if (m(xc0Var, i) >= i2) {
                if (hj3Var.entropySize() >= i2) {
                    e(l(), bArr2, bArr);
                    return;
                }
                throw new IllegalArgumentException("Not enough entropy for security strength required");
            }
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private void c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int a = this.b.a();
        byte[] bArr5 = new byte[a];
        int length = bArr4.length / a;
        byte[] bArr6 = new byte[a];
        this.b.init(true, new lf5(k(bArr2)));
        this.b.b(bArr3, 0, bArr5, 0);
        for (int i = 0; i < length; i++) {
            h(bArr6, bArr5, bArr4, i * a);
            this.b.b(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private byte[] d(byte[] bArr, int i) {
        int a = this.b.a();
        int length = bArr.length;
        int i2 = i / 8;
        byte[] bArr2 = new byte[((((length + 9) + a) - 1) / a) * a];
        j(bArr2, length, 0);
        j(bArr2, i2, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = Byte.MIN_VALUE;
        int i3 = this.c;
        int i4 = (i3 / 8) + a;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[a];
        byte[] bArr5 = new byte[a];
        int i5 = i3 / 8;
        byte[] bArr6 = new byte[i5];
        System.arraycopy(j, 0, bArr6, 0, i5);
        int i6 = 0;
        while (true) {
            int i7 = i6 * a;
            if (i7 * 8 >= this.c + (a * 8)) {
                break;
            }
            j(bArr5, i6, 0);
            c(bArr4, bArr6, bArr5, bArr2);
            int i8 = i4 - i7;
            if (i8 > a) {
                i8 = a;
            }
            System.arraycopy(bArr4, 0, bArr3, i7, i8);
            i6++;
        }
        byte[] bArr7 = new byte[a];
        System.arraycopy(bArr3, 0, bArr6, 0, i5);
        System.arraycopy(bArr3, i5, bArr7, 0, a);
        byte[] bArr8 = new byte[i2];
        this.b.init(true, new lf5(k(bArr6)));
        int i9 = 0;
        while (true) {
            int i10 = i9 * a;
            if (i10 < i2) {
                this.b.b(bArr7, 0, bArr7, 0);
                int i11 = i2 - i10;
                if (i11 > a) {
                    i11 = a;
                }
                System.arraycopy(bArr7, 0, bArr8, i10, i11);
                i9++;
            } else {
                return bArr8;
            }
        }
    }

    private void e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] d = d(tr.q(bArr, bArr2, bArr3), this.d);
        int a = this.b.a();
        byte[] bArr4 = new byte[(this.c + 7) / 8];
        this.f = bArr4;
        byte[] bArr5 = new byte[a];
        this.g = bArr5;
        g(d, bArr4, bArr5);
        this.h = 1L;
    }

    private void f(byte[] bArr) {
        g(d(tr.p(l(), bArr), this.d), this.f, this.g);
        this.h = 1L;
    }

    private void g(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this.b.a()];
        int a = this.b.a();
        this.b.init(true, new lf5(k(bArr2)));
        int i = 0;
        while (true) {
            int i2 = i * a;
            if (i2 < bArr.length) {
                i(bArr3);
                this.b.b(bArr3, 0, bArr5, 0);
                int i3 = length - i2;
                if (i3 > a) {
                    i3 = a;
                }
                System.arraycopy(bArr5, 0, bArr4, i2, i3);
                i++;
            } else {
                h(bArr4, bArr, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            }
        }
    }

    private void h(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr2[i2] ^ bArr3[i2 + i]);
        }
    }

    private void i(byte[] bArr) {
        int i = 1;
        for (int i2 = 1; i2 <= bArr.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + i;
            if (i3 > 255) {
                i = 1;
            } else {
                i = 0;
            }
            bArr[bArr.length - i2] = (byte) i3;
        }
    }

    private void j(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private byte[] l() {
        byte[] entropy = this.a.getEntropy();
        if (entropy.length >= (this.e + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private int m(xc0 xc0Var, int i) {
        if (n(xc0Var) && i == 168) {
            return 112;
        }
        if (xc0Var.getAlgorithmName().equals("AES")) {
            return i;
        }
        return -1;
    }

    private boolean n(xc0 xc0Var) {
        if (!xc0Var.getAlgorithmName().equals("DESede") && !xc0Var.getAlgorithmName().equals("TDEA")) {
            return false;
        }
        return true;
    }

    private void o(byte[] bArr, int i, byte[] bArr2, int i2) {
        bArr2[i2] = (byte) (bArr[i] & 254);
        int i3 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i] << 7) | ((bArr[i3] & 252) >>> 1));
        int i4 = i + 2;
        bArr2[i2 + 2] = (byte) ((bArr[i3] << 6) | ((bArr[i4] & 248) >>> 2));
        int i5 = i + 3;
        bArr2[i2 + 3] = (byte) ((bArr[i4] << 5) | ((bArr[i5] & 240) >>> 3));
        int i6 = i + 4;
        bArr2[i2 + 4] = (byte) ((bArr[i5] << 4) | ((bArr[i6] & 224) >>> 4));
        int i7 = i + 5;
        bArr2[i2 + 5] = (byte) ((bArr[i6] << 3) | ((bArr[i7] & 192) >>> 5));
        int i8 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i7] << 2) | ((bArr[i8] & 128) >>> 6));
        int i9 = i2 + 7;
        bArr2[i9] = (byte) (bArr[i8] << 1);
        while (i2 <= i9) {
            byte b = bArr2[i2];
            bArr2[i2] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
            i2++;
        }
    }

    @Override // defpackage.wq9
    public int a(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArr3;
        int length;
        boolean z2 = this.i;
        long j2 = this.h;
        if (z2) {
            if (j2 > 2147483648L) {
                return -1;
            }
            if (jvb.d(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else if (j2 > 140737488355328L) {
            return -1;
        } else {
            if (jvb.d(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z) {
            f(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArr3 = d(bArr2, this.d);
            g(bArr3, this.f, this.g);
        } else {
            bArr3 = new byte[this.d / 8];
        }
        int length2 = this.g.length;
        byte[] bArr4 = new byte[length2];
        this.b.init(true, new lf5(k(this.f)));
        for (int i = 0; i <= bArr.length / length2; i++) {
            int i2 = i * length2;
            if (bArr.length - i2 > length2) {
                length = length2;
            } else {
                length = bArr.length - (this.g.length * i);
            }
            if (length != 0) {
                i(this.g);
                this.b.b(this.g, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr, i2, length);
            }
        }
        g(bArr3, this.f, this.g);
        this.h++;
        return bArr.length * 8;
    }

    @Override // defpackage.wq9
    public void b(byte[] bArr) {
        f(bArr);
    }

    byte[] k(byte[] bArr) {
        if (this.i) {
            byte[] bArr2 = new byte[24];
            o(bArr, 0, bArr2, 0);
            o(bArr, 7, bArr2, 8);
            o(bArr, 14, bArr2, 16);
            return bArr2;
        }
        return bArr;
    }
}
