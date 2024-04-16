package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: z94  reason: default package */
/* loaded from: classes3.dex */
public class z94 implements m {
    private xc0 a;
    private ba4 b;
    private aa4 c;
    private boolean d;
    private boolean e;
    private int f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private byte[] q;
    private int r;
    private int s;
    private long t;
    private byte[] u;
    private int v;
    private long w;
    private long x;

    public z94(xc0 xc0Var) {
        this(xc0Var, null);
    }

    private void c() {
        if (!this.e) {
            if (this.d) {
                throw new IllegalStateException("GCM cipher cannot be reused for encryption");
            }
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
    }

    private void d(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            g(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void e(byte[] bArr, byte[] bArr2) {
        ea4.p(bArr, bArr2);
        this.b.b(bArr);
    }

    private void f(byte[] bArr, byte[] bArr2, int i) {
        ea4.q(bArr, bArr2, i);
        this.b.b(bArr);
    }

    private void g(byte[] bArr, byte[] bArr2, int i, int i2) {
        ea4.r(bArr, bArr2, i, i2);
        this.b.b(bArr);
    }

    private void h(byte[] bArr) {
        int i = this.r;
        if (i != 0) {
            this.r = i - 1;
            byte[] bArr2 = this.q;
            int i2 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i2;
            int i3 = (i2 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i4;
            bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
            this.a.b(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void i() {
        if (this.w > 0) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        int i = this.v;
        if (i > 0) {
            g(this.p, this.u, 0, i);
            this.x += this.v;
        }
        if (this.x > 0) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    private void k(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 >= 16) {
            if (this.t == 0) {
                i();
            }
            byte[] bArr3 = new byte[16];
            h(bArr3);
            if (this.d) {
                ea4.q(bArr3, bArr, i);
                e(this.n, bArr3);
                System.arraycopy(bArr3, 0, bArr2, i2, 16);
            } else {
                f(this.n, bArr, i);
                ea4.o(bArr3, 0, bArr, i, bArr2, i2);
            }
            this.t += 16;
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    private void l(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[16];
        h(bArr3);
        if (this.d) {
            ea4.n(bArr, i, bArr3, 0, i2);
            g(this.n, bArr, i, i2);
        } else {
            g(this.n, bArr, i, i2);
            ea4.n(bArr, i, bArr3, 0, i2);
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.t += i2;
    }

    private void n(boolean z) {
        this.a.reset();
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = tr.h(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] bArr = this.l;
        if (bArr != null) {
            tr.y(bArr, (byte) 0);
        }
        if (z) {
            this.m = null;
        }
        if (this.d) {
            this.e = false;
            return;
        }
        byte[] bArr2 = this.i;
        if (bArr2 != null) {
            b(bArr2, 0, bArr2.length);
        }
    }

    @Override // defpackage.n
    public byte[] a() {
        byte[] bArr = this.m;
        if (bArr == null) {
            return new byte[this.f];
        }
        return tr.h(bArr);
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        c();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.u;
            int i4 = this.v;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.v = i5;
            if (i5 == 16) {
                e(this.o, bArr2);
                this.v = 0;
                this.w += 16;
            }
        }
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        c();
        if (this.t == 0) {
            i();
        }
        int i2 = this.s;
        if (this.d) {
            if (bArr.length - i < this.f + i2) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else {
            int i3 = this.f;
            if (i2 >= i3) {
                i2 -= i3;
                if (bArr.length - i < i2) {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        }
        if (i2 > 0) {
            l(this.l, 0, i2, bArr, i);
        }
        long j = this.w;
        int i4 = this.v;
        long j2 = j + i4;
        this.w = j2;
        if (j2 > this.x) {
            if (i4 > 0) {
                g(this.o, this.u, 0, i4);
            }
            if (this.x > 0) {
                ea4.p(this.o, this.p);
            }
            long j3 = ((this.t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.c == null) {
                j90 j90Var = new j90();
                this.c = j90Var;
                j90Var.a(this.j);
            }
            this.c.b(j3, bArr2);
            ea4.i(this.o, bArr2);
            ea4.p(this.n, this.o);
        }
        byte[] bArr3 = new byte[16];
        mo7.s(this.w * 8, bArr3, 0);
        mo7.s(this.t * 8, bArr3, 8);
        e(this.n, bArr3);
        byte[] bArr4 = new byte[16];
        this.a.b(this.k, 0, bArr4, 0);
        ea4.p(bArr4, this.n);
        int i5 = this.f;
        byte[] bArr5 = new byte[i5];
        this.m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i5);
        if (this.d) {
            System.arraycopy(this.m, 0, bArr, i + this.s, this.f);
            i2 += this.f;
        } else {
            int i6 = this.f;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(this.l, i2, bArr6, 0, i6);
            if (!tr.u(this.m, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        n(false);
        return i2;
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/GCM";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        int i2 = i + this.s;
        if (this.d) {
            return i2 + this.f;
        }
        int i3 = this.f;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.m
    public xc0 getUnderlyingCipher() {
        return this.a;
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.s;
        if (!this.d) {
            int i3 = this.f;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        byte[] a;
        lf5 lf5Var;
        int i;
        byte[] bArr;
        this.d = z;
        this.m = null;
        this.e = true;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            a = pVar.d();
            this.i = pVar.a();
            int c = pVar.c();
            if (c >= 32 && c <= 128 && c % 8 == 0) {
                this.f = c / 8;
                lf5Var = pVar.b();
            } else {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c);
            }
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            a = pq7Var.a();
            this.i = null;
            this.f = 16;
            lf5Var = (lf5) pq7Var.b();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        if (z) {
            i = 16;
        } else {
            i = this.f + 16;
        }
        this.l = new byte[i];
        if (a != null && a.length >= 1) {
            if (z && (bArr = this.h) != null && tr.c(bArr, a)) {
                if (lf5Var != null) {
                    byte[] bArr2 = this.g;
                    if (bArr2 != null && tr.c(bArr2, lf5Var.a())) {
                        throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                    }
                } else {
                    throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                }
            }
            this.h = a;
            if (lf5Var != null) {
                this.g = lf5Var.a();
            }
            if (lf5Var != null) {
                this.a.init(true, lf5Var);
                byte[] bArr3 = new byte[16];
                this.j = bArr3;
                this.a.b(bArr3, 0, bArr3, 0);
                this.b.a(this.j);
                this.c = null;
            } else if (this.j == null) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
            byte[] bArr4 = new byte[16];
            this.k = bArr4;
            byte[] bArr5 = this.h;
            if (bArr5.length == 12) {
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                this.k[15] = 1;
            } else {
                d(bArr4, bArr5, bArr5.length);
                byte[] bArr6 = new byte[16];
                mo7.s(this.h.length * 8, bArr6, 8);
                e(this.k, bArr6);
            }
            this.n = new byte[16];
            this.o = new byte[16];
            this.p = new byte[16];
            this.u = new byte[16];
            this.v = 0;
            this.w = 0L;
            this.x = 0L;
            this.q = tr.h(this.k);
            this.r = -2;
            this.s = 0;
            this.t = 0L;
            byte[] bArr7 = this.i;
            if (bArr7 != null) {
                b(bArr7, 0, bArr7.length);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("IV must be at least 1 byte");
    }

    public void j(byte b) {
        c();
        byte[] bArr = this.u;
        int i = this.v;
        bArr[i] = b;
        int i2 = i + 1;
        this.v = i2;
        if (i2 == 16) {
            e(this.o, bArr);
            this.v = 0;
            this.w += 16;
        }
    }

    public void m() {
        n(true);
    }

    @Override // defpackage.n
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        c();
        byte[] bArr2 = this.l;
        int i2 = this.s;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.s = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        k(bArr2, 0, bArr, i);
        if (this.d) {
            this.s = 0;
        } else {
            byte[] bArr3 = this.l;
            System.arraycopy(bArr3, 16, bArr3, 0, this.f);
            this.s = this.f;
        }
        return 16;
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4;
        c();
        if (bArr.length - i >= i2) {
            if (this.d) {
                if (this.s != 0) {
                    while (i2 > 0) {
                        i2--;
                        byte[] bArr3 = this.l;
                        int i5 = this.s;
                        int i6 = i + 1;
                        bArr3[i5] = bArr[i];
                        int i7 = i5 + 1;
                        this.s = i7;
                        if (i7 == 16) {
                            k(bArr3, 0, bArr2, i3);
                            this.s = 0;
                            i = i6;
                            i4 = 16;
                            break;
                        }
                        i = i6;
                    }
                }
                i4 = 0;
                while (i2 >= 16) {
                    k(bArr, i, bArr2, i3 + i4);
                    i += 16;
                    i2 -= 16;
                    i4 += 16;
                }
                if (i2 > 0) {
                    System.arraycopy(bArr, i, this.l, 0, i2);
                    this.s = i2;
                }
            } else {
                i4 = 0;
                for (int i8 = 0; i8 < i2; i8++) {
                    byte[] bArr4 = this.l;
                    int i9 = this.s;
                    bArr4[i9] = bArr[i + i8];
                    int i10 = i9 + 1;
                    this.s = i10;
                    if (i10 == bArr4.length) {
                        k(bArr4, 0, bArr2, i3 + i4);
                        byte[] bArr5 = this.l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f);
                        this.s = this.f;
                        i4 += 16;
                    }
                }
            }
            return i4;
        }
        throw new DataLengthException("Input buffer too short");
    }

    public z94(xc0 xc0Var, ba4 ba4Var) {
        if (xc0Var.a() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        ba4Var = ba4Var == null ? new d6b() : ba4Var;
        this.a = xc0Var;
        this.b = ba4Var;
    }
}
