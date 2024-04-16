package defpackage;

import java.lang.reflect.Array;
/* renamed from: vb4  reason: default package */
/* loaded from: classes3.dex */
public class vb4 implements nn3, sc6 {
    private static final byte[] s = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private byte[][] e;
    private byte[] f;
    private int g;
    private long h;
    private xc0 i;
    private byte[] j;
    private byte[] k;
    byte[] l;
    short[] m;
    short[] n;
    byte[] o;
    byte[] p;
    byte[] q;
    byte[] r;

    public vb4() {
        this.a = new byte[32];
        this.b = new byte[32];
        this.c = new byte[32];
        this.d = new byte[32];
        this.e = (byte[][]) Array.newInstance(Byte.TYPE, 4, 32);
        this.f = new byte[32];
        this.i = new ua4();
        this.k = new byte[32];
        this.l = new byte[8];
        this.m = new short[16];
        this.n = new short[16];
        this.o = new byte[32];
        this.p = new byte[32];
        this.q = new byte[32];
        this.r = new byte[32];
        byte[] h = ua4.h("D-A");
        this.j = h;
        this.i.init(true, new rq7(null, h));
        reset();
    }

    private byte[] d(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.l[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.l, 0, bArr, 24, 8);
        return bArr;
    }

    private void e(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.i.init(true, new lf5(bArr));
        this.i.b(bArr3, i2, bArr2, i);
    }

    private byte[] f(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte[] bArr2 = this.k;
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
        }
        return this.k;
    }

    private void g(byte[] bArr, short[] sArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
        }
    }

    private void h(short[] sArr, byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            short s2 = sArr[i];
            bArr[i2 + 1] = (byte) (s2 >> 8);
            bArr[i2] = (byte) s2;
        }
    }

    private void i() {
        mo7.v(this.h * 8, this.b, 0);
        while (this.g != 0) {
            update((byte) 0);
        }
        k(this.b, 0);
        k(this.d, 0);
    }

    private void j(byte[] bArr) {
        g(bArr, this.m);
        short[] sArr = this.n;
        short[] sArr2 = this.m;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        h(this.n, bArr);
    }

    private void l(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.d;
            if (i != bArr2.length) {
                int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
                bArr2[i] = (byte) i3;
                i2 = i3 >>> 8;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new vb4(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        vb4 vb4Var = (vb4) sc6Var;
        byte[] bArr = vb4Var.j;
        this.j = bArr;
        this.i.init(true, new rq7(null, bArr));
        reset();
        byte[] bArr2 = vb4Var.a;
        System.arraycopy(bArr2, 0, this.a, 0, bArr2.length);
        byte[] bArr3 = vb4Var.b;
        System.arraycopy(bArr3, 0, this.b, 0, bArr3.length);
        byte[] bArr4 = vb4Var.c;
        System.arraycopy(bArr4, 0, this.c, 0, bArr4.length);
        byte[] bArr5 = vb4Var.d;
        System.arraycopy(bArr5, 0, this.d, 0, bArr5.length);
        byte[] bArr6 = vb4Var.e[1];
        System.arraycopy(bArr6, 0, this.e[1], 0, bArr6.length);
        byte[] bArr7 = vb4Var.e[2];
        System.arraycopy(bArr7, 0, this.e[2], 0, bArr7.length);
        byte[] bArr8 = vb4Var.e[3];
        System.arraycopy(bArr8, 0, this.e[3], 0, bArr8.length);
        byte[] bArr9 = vb4Var.f;
        System.arraycopy(bArr9, 0, this.f, 0, bArr9.length);
        this.g = vb4Var.g;
        this.h = vb4Var.h;
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        i();
        byte[] bArr2 = this.a;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        reset();
        return 32;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // defpackage.nn3
    public int getByteLength() {
        return 32;
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 32;
    }

    protected void k(byte[] bArr, int i) {
        System.arraycopy(bArr, i, this.c, 0, 32);
        System.arraycopy(this.a, 0, this.p, 0, 32);
        System.arraycopy(this.c, 0, this.q, 0, 32);
        for (int i2 = 0; i2 < 32; i2++) {
            this.r[i2] = (byte) (this.p[i2] ^ this.q[i2]);
        }
        e(f(this.r), this.o, 0, this.a, 0);
        for (int i3 = 1; i3 < 4; i3++) {
            byte[] d = d(this.p);
            for (int i4 = 0; i4 < 32; i4++) {
                this.p[i4] = (byte) (d[i4] ^ this.e[i3][i4]);
            }
            this.q = d(d(this.q));
            for (int i5 = 0; i5 < 32; i5++) {
                this.r[i5] = (byte) (this.p[i5] ^ this.q[i5]);
            }
            int i6 = i3 * 8;
            e(f(this.r), this.o, i6, this.a, i6);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            j(this.o);
        }
        for (int i8 = 0; i8 < 32; i8++) {
            byte[] bArr2 = this.o;
            bArr2[i8] = (byte) (bArr2[i8] ^ this.c[i8]);
        }
        j(this.o);
        for (int i9 = 0; i9 < 32; i9++) {
            byte[] bArr3 = this.o;
            bArr3[i9] = (byte) (this.a[i9] ^ bArr3[i9]);
        }
        for (int i10 = 0; i10 < 61; i10++) {
            j(this.o);
        }
        byte[] bArr4 = this.o;
        byte[] bArr5 = this.a;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // defpackage.e23
    public void reset() {
        this.h = 0L;
        this.g = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.b;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.c;
            if (i3 >= bArr3.length) {
                break;
            }
            bArr3[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.e[1];
            if (i4 >= bArr4.length) {
                break;
            }
            bArr4[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr5 = this.e[3];
            if (i5 >= bArr5.length) {
                break;
            }
            bArr5[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr6 = this.d;
            if (i6 >= bArr6.length) {
                break;
            }
            bArr6[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr7 = this.f;
            if (i7 < bArr7.length) {
                bArr7[i7] = 0;
                i7++;
            } else {
                byte[] bArr8 = s;
                System.arraycopy(bArr8, 0, this.e[2], 0, bArr8.length);
                return;
            }
        }
    }

    @Override // defpackage.e23
    public void update(byte b) {
        byte[] bArr = this.f;
        int i = this.g;
        int i2 = i + 1;
        this.g = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            l(bArr);
            k(this.f, 0);
            this.g = 0;
        }
        this.h++;
    }

    public vb4(vb4 vb4Var) {
        this.a = new byte[32];
        this.b = new byte[32];
        this.c = new byte[32];
        this.d = new byte[32];
        this.e = (byte[][]) Array.newInstance(Byte.TYPE, 4, 32);
        this.f = new byte[32];
        this.i = new ua4();
        this.k = new byte[32];
        this.l = new byte[8];
        this.m = new short[16];
        this.n = new short[16];
        this.o = new byte[32];
        this.p = new byte[32];
        this.q = new byte[32];
        this.r = new byte[32];
        b(vb4Var);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        while (this.g != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.f;
            if (i2 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            l(this.f);
            k(this.f, 0);
            byte[] bArr3 = this.f;
            i += bArr3.length;
            i2 -= bArr3.length;
            this.h += bArr3.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public vb4(byte[] bArr) {
        this.a = new byte[32];
        this.b = new byte[32];
        this.c = new byte[32];
        this.d = new byte[32];
        this.e = (byte[][]) Array.newInstance(Byte.TYPE, 4, 32);
        this.f = new byte[32];
        this.i = new ua4();
        this.k = new byte[32];
        this.l = new byte[8];
        this.m = new short[16];
        this.n = new short[16];
        this.o = new byte[32];
        this.p = new byte[32];
        this.q = new byte[32];
        this.r = new byte[32];
        byte[] h = tr.h(bArr);
        this.j = h;
        this.i.init(true, new rq7(null, h));
        reset();
    }
}
