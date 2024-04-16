package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: ct9  reason: default package */
/* loaded from: classes3.dex */
public class ct9 implements rya {
    private static final int[] j = mo7.o(a0b.e("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] k = a0b.e("expand 32-byte k");
    protected static final byte[] l = a0b.e("expand 16-byte k");
    protected int a;
    private int b;
    protected int[] c;
    protected int[] d;
    private byte[] e;
    private boolean f;
    private int g;
    private int h;
    private int i;

    public ct9() {
        this(20);
    }

    private boolean d(int i) {
        int i2 = this.g + i;
        this.g = i2;
        if (i2 >= i || i2 < 0) {
            return false;
        }
        int i3 = this.h + 1;
        this.h = i3;
        if (i3 != 0) {
            return false;
        }
        int i4 = this.i + 1;
        this.i = i4;
        if ((i4 & 32) == 0) {
            return false;
        }
        return true;
    }

    private void g() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public static void h(int i, int[] iArr, int[] iArr2) {
        if (iArr.length == 16) {
            if (iArr2.length == 16) {
                if (i % 2 == 0) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    int i6 = iArr[4];
                    int i7 = iArr[5];
                    int i8 = iArr[6];
                    int i9 = 7;
                    int i10 = iArr[7];
                    int i11 = iArr[8];
                    int i12 = 9;
                    int i13 = iArr[9];
                    int i14 = iArr[10];
                    int i15 = iArr[11];
                    int i16 = iArr[12];
                    int i17 = 13;
                    int i18 = iArr[13];
                    int i19 = iArr[14];
                    int i20 = iArr[15];
                    int i21 = i19;
                    int i22 = i18;
                    int i23 = i16;
                    int i24 = i15;
                    int i25 = i14;
                    int i26 = i13;
                    int i27 = i11;
                    int i28 = i10;
                    int i29 = i8;
                    int i30 = i7;
                    int i31 = i6;
                    int i32 = i5;
                    int i33 = i4;
                    int i34 = i3;
                    int i35 = i2;
                    int i36 = i;
                    while (i36 > 0) {
                        int c = g65.c(i35 + i23, i9) ^ i31;
                        int c2 = i27 ^ g65.c(c + i35, i12);
                        int c3 = i23 ^ g65.c(c2 + c, i17);
                        int c4 = g65.c(c3 + c2, 18) ^ i35;
                        int c5 = i26 ^ g65.c(i30 + i34, i9);
                        int c6 = i22 ^ g65.c(c5 + i30, i12);
                        int c7 = i34 ^ g65.c(c6 + c5, i17);
                        int c8 = g65.c(c7 + c6, 18) ^ i30;
                        int c9 = i21 ^ g65.c(i25 + i29, 7);
                        int c10 = i33 ^ g65.c(c9 + i25, 9);
                        int c11 = i29 ^ g65.c(c10 + c9, 13);
                        int c12 = i25 ^ g65.c(c11 + c10, 18);
                        int c13 = i32 ^ g65.c(i20 + i24, 7);
                        int c14 = i28 ^ g65.c(c13 + i20, 9);
                        int i37 = i36;
                        int c15 = i24 ^ g65.c(c14 + c13, 13);
                        int c16 = i20 ^ g65.c(c15 + c14, 18);
                        i34 = c7 ^ g65.c(c4 + c13, 7);
                        i33 = c10 ^ g65.c(i34 + c4, 9);
                        int c17 = c13 ^ g65.c(i33 + i34, 13);
                        int c18 = c4 ^ g65.c(c17 + i33, 18);
                        i29 = c11 ^ g65.c(c8 + c, 7);
                        i28 = c14 ^ g65.c(i29 + c8, 9);
                        int c19 = g65.c(i28 + i29, 13) ^ c;
                        i30 = c8 ^ g65.c(c19 + i28, 18);
                        i24 = c15 ^ g65.c(c12 + c5, 7);
                        int c20 = g65.c(i24 + c12, 9) ^ c2;
                        i26 = c5 ^ g65.c(c20 + i24, 13);
                        i25 = c12 ^ g65.c(i26 + c20, 18);
                        i23 = c3 ^ g65.c(c16 + c9, 7);
                        i22 = c6 ^ g65.c(i23 + c16, 9);
                        i21 = c9 ^ g65.c(i22 + i23, 13);
                        i20 = c16 ^ g65.c(i21 + i22, 18);
                        i32 = c17;
                        i27 = c20;
                        i35 = c18;
                        i31 = c19;
                        i17 = 13;
                        i12 = 9;
                        i9 = 7;
                        i36 = i37 - 2;
                    }
                    iArr2[0] = i35 + iArr[0];
                    iArr2[1] = i34 + iArr[1];
                    iArr2[2] = i33 + iArr[2];
                    iArr2[3] = i32 + iArr[3];
                    iArr2[4] = i31 + iArr[4];
                    iArr2[5] = i30 + iArr[5];
                    iArr2[6] = i29 + iArr[6];
                    iArr2[7] = i28 + iArr[7];
                    iArr2[8] = i27 + iArr[8];
                    iArr2[9] = i26 + iArr[9];
                    iArr2[10] = i25 + iArr[10];
                    iArr2[11] = i24 + iArr[11];
                    iArr2[12] = i23 + iArr[12];
                    iArr2[13] = i22 + iArr[13];
                    iArr2[14] = i21 + iArr[14];
                    iArr2[15] = i20 + iArr[15];
                    return;
                }
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    protected void a() {
        int[] iArr = this.c;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void b(byte[] bArr) {
        h(this.a, this.c, this.d);
        mo7.j(this.d, bArr, 0);
    }

    protected int c() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(int i, int[] iArr, int i2) {
        int i3 = (i - 16) / 4;
        int[] iArr2 = j;
        iArr[i2] = iArr2[i3];
        iArr[i2 + 1] = iArr2[i3 + 1];
        iArr[i2 + 2] = iArr2[i3 + 2];
        iArr[i2 + 3] = iArr2[i3 + 3];
    }

    protected void f() {
        int[] iArr = this.c;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        if (this.a == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.c;
            int[] iArr2 = j;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            mo7.n(bArr, 0, iArr, 1, 4);
            mo7.n(bArr, bArr.length - 16, this.c, 11, 4);
        }
        mo7.n(bArr2, 0, this.c, 6, 2);
    }

    @Override // defpackage.rya
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            if (a != null && a.length == c()) {
                v71 b = pq7Var.b();
                if (b == null) {
                    if (this.f) {
                        i(null, a);
                    } else {
                        throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
                    }
                } else if (b instanceof lf5) {
                    i(((lf5) b).a(), a);
                } else {
                    throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
                }
                reset();
                this.f = true;
                return;
            }
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + c() + " bytes of IV");
        }
        throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.f) {
            if (i + i2 <= bArr.length) {
                if (i3 + i2 <= bArr2.length) {
                    if (!d(i2)) {
                        for (int i4 = 0; i4 < i2; i4++) {
                            byte[] bArr3 = this.e;
                            int i5 = this.b;
                            bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
                            int i6 = (i5 + 1) & 63;
                            this.b = i6;
                            if (i6 == 0) {
                                a();
                                b(this.e);
                            }
                        }
                        return i2;
                    }
                    throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // defpackage.rya
    public void reset() {
        this.b = 0;
        g();
        f();
        b(this.e);
    }

    public ct9(int i) {
        this.b = 0;
        this.c = new int[16];
        this.d = new int[16];
        this.e = new byte[64];
        this.f = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.a = i;
    }
}
