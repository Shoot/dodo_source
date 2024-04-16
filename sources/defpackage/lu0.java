package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: lu0  reason: default package */
/* loaded from: classes3.dex */
public class lu0 implements n {
    private static final byte[] l = new byte[15];
    private final ru0 a;
    private final x36 b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private byte[] g;
    private long h;
    private long i;
    private int j;
    private int k;

    public lu0() {
        this(new pe8());
    }

    private void c() {
        int i = this.j;
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    i2 = 6;
                    if (i != 5) {
                        if (i != 6) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                } else {
                    throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
                }
            } else {
                return;
            }
        }
        this.j = i2;
    }

    private void d() {
        int i;
        switch (this.j) {
            case 1:
            case 2:
                i = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        e(i);
    }

    private void e(int i) {
        i(this.h);
        this.j = i;
    }

    private void f(int i) {
        i(this.i);
        byte[] bArr = new byte[16];
        mo7.v(this.h, bArr, 0);
        mo7.v(this.i, bArr, 8);
        this.b.update(bArr, 0, 16);
        this.b.doFinal(this.f, 0);
        this.j = i;
    }

    private long g(long j, int i, long j2) {
        long j3 = i;
        if (j - Long.MIN_VALUE <= (j2 - j3) - Long.MIN_VALUE) {
            return j + j3;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    private void h() {
        byte[] bArr = new byte[64];
        try {
            this.a.processBytes(bArr, 0, 64, bArr, 0);
            this.b.init(new lf5(bArr, 0, 32));
        } finally {
            tr.g(bArr);
        }
    }

    private void i(long j) {
        int i = ((int) j) & 15;
        if (i != 0) {
            this.b.update(l, 0, 16 - i);
        }
    }

    private void j(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 <= bArr2.length - i2) {
            this.a.processBytes(bArr, i, i2, bArr2, i3);
            this.i = g(this.i, i2, 274877906880L);
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(boolean z, boolean z2) {
        tr.g(this.e);
        if (z) {
            tr.g(this.f);
        }
        this.h = 0L;
        this.i = 0L;
        this.k = 0;
        switch (this.j) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.j = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.j = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z2) {
            this.a.reset();
        }
        h();
        byte[] bArr = this.g;
        if (bArr != null) {
            b(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.n
    public byte[] a() {
        return tr.h(this.f);
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i <= bArr.length - i2) {
                        c();
                        if (i2 > 0) {
                            this.h = g(this.h, i2, -1L);
                            this.b.update(bArr, i, i2);
                            return;
                        }
                        return;
                    }
                    throw new DataLengthException("Input buffer too short");
                }
                throw new IllegalArgumentException("'len' cannot be negative");
            }
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        throw new NullPointerException("'in' cannot be null");
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int i2;
        if (bArr != null) {
            if (i >= 0) {
                d();
                tr.g(this.f);
                int i3 = this.j;
                if (i3 != 3) {
                    if (i3 == 7) {
                        int i4 = this.k;
                        if (i4 >= 16) {
                            i2 = i4 - 16;
                            if (i <= bArr.length - i2) {
                                if (i2 > 0) {
                                    this.b.update(this.e, 0, i2);
                                    j(this.e, 0, i2, bArr, i);
                                }
                                f(8);
                                if (!tr.t(16, this.f, 0, this.e, i2)) {
                                    throw new InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
                                }
                            } else {
                                throw new OutputLengthException("Output buffer too short");
                            }
                        } else {
                            throw new InvalidCipherTextException("data too short");
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int i5 = this.k;
                    i2 = i5 + 16;
                    if (i <= bArr.length - i2) {
                        if (i5 > 0) {
                            j(this.e, 0, i5, bArr, i);
                            this.b.update(bArr, i, this.k);
                        }
                        f(4);
                        System.arraycopy(this.f, 0, bArr, i + this.k, 16);
                    } else {
                        throw new OutputLengthException("Output buffer too short");
                    }
                }
                k(false, true);
                return i2;
            }
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        throw new NullPointerException("'out' cannot be null");
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        int max = Math.max(0, i) + this.k;
        int i2 = this.j;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                throw new IllegalStateException();
            }
            return Math.max(0, max - 16);
        }
        return max + 16;
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        int max = Math.max(0, i) + this.k;
        int i2 = this.j;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                throw new IllegalStateException();
            }
            max = Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        pq7 pq7Var;
        lf5 lf5Var;
        byte[] a;
        int i;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            int c = pVar.c();
            if (128 == c) {
                lf5Var = pVar.b();
                a = pVar.d();
                pq7Var = new pq7(lf5Var, a);
                this.g = pVar.a();
            } else {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c);
            }
        } else if (v71Var instanceof pq7) {
            pq7Var = (pq7) v71Var;
            lf5Var = (lf5) pq7Var.b();
            a = pq7Var.a();
            this.g = null;
        } else {
            throw new IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
        }
        if (lf5Var == null) {
            if (this.j == 0) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != lf5Var.a().length) {
            throw new IllegalArgumentException("Key must be 256 bits");
        }
        if (a != null && 12 == a.length) {
            if (this.j != 0 && z && tr.c(this.d, a) && (lf5Var == null || tr.c(this.c, lf5Var.a()))) {
                throw new IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
            }
            if (lf5Var != null) {
                System.arraycopy(lf5Var.a(), 0, this.c, 0, 32);
            }
            System.arraycopy(a, 0, this.d, 0, 12);
            this.a.init(true, pq7Var);
            if (z) {
                i = 1;
            } else {
                i = 5;
            }
            this.j = i;
            k(true, false);
            return;
        }
        throw new IllegalArgumentException("Nonce must be 96 bits");
    }

    @Override // defpackage.n
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        d();
        int i2 = this.j;
        if (i2 != 3) {
            if (i2 == 7) {
                byte[] bArr2 = this.e;
                int i3 = this.k;
                bArr2[i3] = b;
                int i4 = i3 + 1;
                this.k = i4;
                if (i4 != bArr2.length) {
                    return 0;
                }
                this.b.update(bArr2, 0, 64);
                j(this.e, 0, 64, bArr, i);
                byte[] bArr3 = this.e;
                System.arraycopy(bArr3, 64, bArr3, 0, 16);
                this.k = 16;
                return 64;
            }
            throw new IllegalStateException();
        }
        byte[] bArr4 = this.e;
        int i5 = this.k;
        bArr4[i5] = b;
        int i6 = i5 + 1;
        this.k = i6;
        if (i6 != 64) {
            return 0;
        }
        j(bArr4, 0, 64, bArr, i);
        this.b.update(bArr, i, 64);
        this.k = 0;
        return 64;
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4;
        int i5 = i;
        int i6 = i2;
        if (bArr != null) {
            if (i5 >= 0) {
                if (i6 >= 0) {
                    if (i5 <= bArr.length - i6) {
                        if (i3 >= 0) {
                            d();
                            int i7 = this.j;
                            if (i7 != 3) {
                                if (i7 == 7) {
                                    i4 = 0;
                                    for (int i8 = 0; i8 < i6; i8++) {
                                        byte[] bArr3 = this.e;
                                        int i9 = this.k;
                                        bArr3[i9] = bArr[i5 + i8];
                                        int i10 = i9 + 1;
                                        this.k = i10;
                                        if (i10 == bArr3.length) {
                                            this.b.update(bArr3, 0, 64);
                                            j(this.e, 0, 64, bArr2, i3 + i4);
                                            byte[] bArr4 = this.e;
                                            System.arraycopy(bArr4, 64, bArr4, 0, 16);
                                            this.k = 16;
                                            i4 += 64;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                if (this.k != 0) {
                                    while (i6 > 0) {
                                        i6--;
                                        byte[] bArr5 = this.e;
                                        int i11 = this.k;
                                        int i12 = i5 + 1;
                                        bArr5[i11] = bArr[i5];
                                        int i13 = i11 + 1;
                                        this.k = i13;
                                        if (i13 == 64) {
                                            j(bArr5, 0, 64, bArr2, i3);
                                            this.b.update(bArr2, i3, 64);
                                            this.k = 0;
                                            i5 = i12;
                                            i4 = 64;
                                            break;
                                        }
                                        i5 = i12;
                                    }
                                }
                                i4 = 0;
                                while (i6 >= 64) {
                                    int i14 = i3 + i4;
                                    j(bArr, i5, 64, bArr2, i14);
                                    this.b.update(bArr2, i14, 64);
                                    i5 += 64;
                                    i6 -= 64;
                                    i4 += 64;
                                }
                                if (i6 > 0) {
                                    System.arraycopy(bArr, i5, this.e, 0, i6);
                                    this.k = i6;
                                }
                            }
                            return i4;
                        }
                        throw new IllegalArgumentException("'outOff' cannot be negative");
                    }
                    throw new DataLengthException("Input buffer too short");
                }
                throw new IllegalArgumentException("'len' cannot be negative");
            }
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        throw new NullPointerException("'in' cannot be null");
    }

    public lu0(x36 x36Var) {
        this.c = new byte[32];
        this.d = new byte[12];
        this.e = new byte[80];
        this.f = new byte[16];
        this.j = 0;
        if (x36Var == null) {
            throw new NullPointerException("'poly1305' cannot be null");
        }
        if (16 != x36Var.getMacSize()) {
            throw new IllegalArgumentException("'poly1305' must be a 128-bit MAC");
        }
        this.a = new ru0();
        this.b = x36Var;
    }
}
