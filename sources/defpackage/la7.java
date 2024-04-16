package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: la7  reason: default package */
/* loaded from: classes3.dex */
public class la7 implements xc0 {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private xc0 d;
    private int e;
    private int f;
    private boolean g;

    public la7(xc0 xc0Var) {
        this.d = xc0Var;
        int a = xc0Var.a();
        this.f = a;
        this.a = new byte[a];
        this.b = new byte[a];
        this.c = new byte[a];
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4;
        int i5;
        int i6 = this.f;
        if (i + i6 <= bArr.length) {
            if (i2 + i6 <= bArr2.length) {
                int i7 = this.e;
                int i8 = 2;
                int i9 = 0;
                if (i7 > i6) {
                    byte b = bArr[i];
                    this.b[i6 - 2] = b;
                    bArr2[i2] = e(b, i6 - 2);
                    byte b2 = bArr[i + 1];
                    byte[] bArr3 = this.b;
                    int i10 = this.f;
                    bArr3[i10 - 1] = b2;
                    bArr2[i2 + 1] = e(b2, i10 - 1);
                    this.d.b(this.b, 0, this.c, 0);
                    while (i8 < this.f) {
                        byte b3 = bArr[i + i8];
                        int i11 = i8 - 2;
                        this.b[i11] = b3;
                        bArr2[i2 + i8] = e(b3, i11);
                        i8++;
                    }
                } else {
                    if (i7 == 0) {
                        this.d.b(this.b, 0, this.c, 0);
                        while (true) {
                            i5 = this.f;
                            if (i9 >= i5) {
                                break;
                            }
                            int i12 = i + i9;
                            this.b[i9] = bArr[i12];
                            bArr2[i9] = e(bArr[i12], i9);
                            i9++;
                        }
                        i4 = this.e + i5;
                    } else if (i7 == i6) {
                        this.d.b(this.b, 0, this.c, 0);
                        byte b4 = bArr[i];
                        byte b5 = bArr[i + 1];
                        bArr2[i2] = e(b4, 0);
                        bArr2[i2 + 1] = e(b5, 1);
                        byte[] bArr4 = this.b;
                        System.arraycopy(bArr4, 2, bArr4, 0, this.f - 2);
                        byte[] bArr5 = this.b;
                        int i13 = this.f;
                        bArr5[i13 - 2] = b4;
                        bArr5[i13 - 1] = b5;
                        this.d.b(bArr5, 0, this.c, 0);
                        while (true) {
                            i3 = this.f;
                            if (i8 >= i3) {
                                break;
                            }
                            byte b6 = bArr[i + i8];
                            int i14 = i8 - 2;
                            this.b[i14] = b6;
                            bArr2[i2 + i8] = e(b6, i14);
                            i8++;
                        }
                        i4 = this.e + i3;
                    }
                    this.e = i4;
                }
                return this.f;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4 = this.f;
        if (i + i4 <= bArr.length) {
            if (i2 + i4 <= bArr2.length) {
                int i5 = this.e;
                int i6 = 2;
                int i7 = 0;
                if (i5 > i4) {
                    byte[] bArr3 = this.b;
                    int i8 = i4 - 2;
                    byte e = e(bArr[i], i4 - 2);
                    bArr2[i2] = e;
                    bArr3[i8] = e;
                    byte[] bArr4 = this.b;
                    int i9 = this.f;
                    int i10 = i9 - 1;
                    byte e2 = e(bArr[i + 1], i9 - 1);
                    bArr2[i2 + 1] = e2;
                    bArr4[i10] = e2;
                    this.d.b(this.b, 0, this.c, 0);
                    while (i6 < this.f) {
                        byte[] bArr5 = this.b;
                        int i11 = i6 - 2;
                        byte e3 = e(bArr[i + i6], i11);
                        bArr2[i2 + i6] = e3;
                        bArr5[i11] = e3;
                        i6++;
                    }
                } else {
                    if (i5 == 0) {
                        this.d.b(this.b, 0, this.c, 0);
                        while (true) {
                            i3 = this.f;
                            if (i7 >= i3) {
                                break;
                            }
                            byte[] bArr6 = this.b;
                            byte e4 = e(bArr[i + i7], i7);
                            bArr2[i2 + i7] = e4;
                            bArr6[i7] = e4;
                            i7++;
                        }
                    } else if (i5 == i4) {
                        this.d.b(this.b, 0, this.c, 0);
                        bArr2[i2] = e(bArr[i], 0);
                        bArr2[i2 + 1] = e(bArr[i + 1], 1);
                        byte[] bArr7 = this.b;
                        System.arraycopy(bArr7, 2, bArr7, 0, this.f - 2);
                        System.arraycopy(bArr2, i2, this.b, this.f - 2, 2);
                        this.d.b(this.b, 0, this.c, 0);
                        while (true) {
                            i3 = this.f;
                            if (i6 >= i3) {
                                break;
                            }
                            byte[] bArr8 = this.b;
                            int i12 = i6 - 2;
                            byte e5 = e(bArr[i + i6], i12);
                            bArr2[i2 + i6] = e5;
                            bArr8[i12] = e5;
                            i6++;
                        }
                    }
                    this.e += i3;
                }
                return this.f;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    private byte e(byte b, int i) {
        return (byte) (b ^ this.c[i]);
    }

    @Override // defpackage.xc0
    public int a() {
        return this.d.a();
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
        return this.d.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        this.g = z;
        reset();
        this.d.init(true, v71Var);
    }

    @Override // defpackage.xc0
    public void reset() {
        this.e = 0;
        byte[] bArr = this.a;
        byte[] bArr2 = this.b;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.d.reset();
    }
}
