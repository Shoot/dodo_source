package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: pn7  reason: default package */
/* loaded from: classes3.dex */
public class pn7 implements xc0 {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private xc0 e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public pn7(xc0 xc0Var, boolean z) {
        this.e = xc0Var;
        this.i = z;
        int a = xc0Var.a();
        this.g = a;
        this.a = new byte[a];
        this.b = new byte[a];
        this.c = new byte[a];
        this.d = new byte[a];
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.g;
        if (i + i3 <= bArr.length) {
            if (i3 + i2 <= bArr2.length) {
                int i4 = 0;
                this.e.b(this.b, 0, this.c, 0);
                for (int i5 = 0; i5 < this.g; i5++) {
                    bArr2[i2 + i5] = g(bArr[i + i5], i5);
                }
                while (true) {
                    int i6 = this.g;
                    if (i4 < i6) {
                        this.b[i4] = bArr[i + i4];
                        i4++;
                    } else {
                        return i6;
                    }
                }
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4 = this.g;
        if (i + i4 <= bArr.length) {
            if (i2 + i4 <= bArr2.length) {
                int i5 = this.f;
                if (i5 == 0) {
                    for (int i6 = 0; i6 < this.g; i6++) {
                        this.b[i6] = bArr[i + i6];
                    }
                    this.e.b(this.b, 0, this.c, 0);
                    this.f += this.g;
                    return 0;
                } else if (i5 == i4) {
                    System.arraycopy(bArr, i, this.d, 0, i4);
                    byte[] bArr3 = this.b;
                    System.arraycopy(bArr3, 2, bArr3, 0, this.g - 2);
                    byte[] bArr4 = this.b;
                    int i7 = this.g;
                    byte[] bArr5 = this.d;
                    bArr4[i7 - 2] = bArr5[0];
                    bArr4[i7 - 1] = bArr5[1];
                    this.e.b(bArr4, 0, this.c, 0);
                    int i8 = 0;
                    while (true) {
                        int i9 = this.g;
                        if (i8 < i9 - 2) {
                            bArr2[i2 + i8] = g(this.d[i8 + 2], i8);
                            i8++;
                        } else {
                            System.arraycopy(this.d, 2, this.b, 0, i9 - 2);
                            this.f += 2;
                            return this.g - 2;
                        }
                    }
                } else {
                    if (i5 >= i4 + 2) {
                        System.arraycopy(bArr, i, this.d, 0, i4);
                        bArr2[i2] = g(this.d[0], this.g - 2);
                        bArr2[i2 + 1] = g(this.d[1], this.g - 1);
                        System.arraycopy(this.d, 0, this.b, this.g - 2, 2);
                        this.e.b(this.b, 0, this.c, 0);
                        int i10 = 0;
                        while (true) {
                            i3 = this.g;
                            if (i10 >= i3 - 2) {
                                break;
                            }
                            bArr2[i2 + i10 + 2] = g(this.d[i10 + 2], i10);
                            i10++;
                        }
                        System.arraycopy(this.d, 2, this.b, 0, i3 - 2);
                    }
                    return this.g;
                }
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    private int e(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.g;
        if (i + i3 <= bArr.length) {
            if (i3 + i2 <= bArr2.length) {
                int i4 = 0;
                this.e.b(this.b, 0, this.c, 0);
                for (int i5 = 0; i5 < this.g; i5++) {
                    bArr2[i2 + i5] = g(bArr[i + i5], i5);
                }
                while (true) {
                    int i6 = this.g;
                    if (i4 < i6) {
                        this.b[i4] = bArr2[i2 + i4];
                        i4++;
                    } else {
                        return i6;
                    }
                }
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    private int f(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4;
        int i5 = this.g;
        if (i + i5 <= bArr.length) {
            int i6 = this.f;
            if (i6 == 0) {
                if ((i5 * 2) + i2 + 2 <= bArr2.length) {
                    this.e.b(this.b, 0, this.c, 0);
                    int i7 = 0;
                    while (true) {
                        i4 = this.g;
                        if (i7 >= i4) {
                            break;
                        }
                        bArr2[i2 + i7] = g(this.a[i7], i7);
                        i7++;
                    }
                    System.arraycopy(bArr2, i2, this.b, 0, i4);
                    this.e.b(this.b, 0, this.c, 0);
                    int i8 = this.g;
                    bArr2[i2 + i8] = g(this.a[i8 - 2], 0);
                    int i9 = this.g;
                    bArr2[i2 + i9 + 1] = g(this.a[i9 - 1], 1);
                    System.arraycopy(bArr2, i2 + 2, this.b, 0, this.g);
                    this.e.b(this.b, 0, this.c, 0);
                    int i10 = 0;
                    while (true) {
                        int i11 = this.g;
                        if (i10 < i11) {
                            bArr2[i11 + i2 + 2 + i10] = g(bArr[i + i10], i10);
                            i10++;
                        } else {
                            System.arraycopy(bArr2, i2 + i11 + 2, this.b, 0, i11);
                            int i12 = this.f;
                            int i13 = this.g;
                            this.f = i12 + (i13 * 2) + 2;
                            return (i13 * 2) + 2;
                        }
                    }
                } else {
                    throw new OutputLengthException("output buffer too short");
                }
            } else {
                if (i6 >= i5 + 2) {
                    if (i5 + i2 <= bArr2.length) {
                        this.e.b(this.b, 0, this.c, 0);
                        int i14 = 0;
                        while (true) {
                            i3 = this.g;
                            if (i14 >= i3) {
                                break;
                            }
                            bArr2[i2 + i14] = g(bArr[i + i14], i14);
                            i14++;
                        }
                        System.arraycopy(bArr2, i2, this.b, 0, i3);
                    } else {
                        throw new OutputLengthException("output buffer too short");
                    }
                }
                return this.g;
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    private byte g(byte b, int i) {
        return (byte) (b ^ this.c[i]);
    }

    @Override // defpackage.xc0
    public int a() {
        return this.e.a();
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.i) {
            if (this.h) {
                return f(bArr, i, bArr2, i2);
            }
            return d(bArr, i, bArr2, i2);
        } else if (this.h) {
            return e(bArr, i, bArr2, i2);
        } else {
            return c(bArr, i, bArr2, i2);
        }
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        StringBuilder sb;
        String str;
        if (this.i) {
            sb = new StringBuilder();
            sb.append(this.e.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb = new StringBuilder();
            sb.append(this.e.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        this.h = z;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            int length = a.length;
            byte[] bArr = this.a;
            if (length < bArr.length) {
                System.arraycopy(a, 0, bArr, bArr.length - a.length, a.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.a;
                    if (i >= bArr2.length - a.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(a, 0, bArr, 0, bArr.length);
            }
            reset();
            xc0Var = this.e;
            v71Var = pq7Var.b();
        } else {
            reset();
            xc0Var = this.e;
        }
        xc0Var.init(true, v71Var);
    }

    @Override // defpackage.xc0
    public void reset() {
        this.f = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i != bArr.length) {
                if (this.i) {
                    bArr[i] = 0;
                } else {
                    bArr[i] = this.a[i];
                }
                i++;
            } else {
                this.e.reset();
                return;
            }
        }
    }
}
