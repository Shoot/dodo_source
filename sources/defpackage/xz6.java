package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: xz6  reason: default package */
/* loaded from: classes3.dex */
public class xz6 implements xc0 {
    private static final byte[] d = {Byte.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, -68, 99, -58, -105, 53, 106, -44};
    private final int[] a = new int[4];
    private boolean b = false;
    private boolean c;

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int a = mo7.a(bArr, i);
        int a2 = mo7.a(bArr, i + 4);
        int a3 = mo7.a(bArr, i + 8);
        int a4 = mo7.a(bArr, i + 12);
        int[] iArr = this.a;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = 16;
        while (true) {
            int i8 = a ^ a3;
            int c = i8 ^ (g65.c(i8, 8) ^ g65.c(i8, 24));
            int i9 = a2 ^ i4;
            int i10 = a4 ^ i6;
            int i11 = i9 ^ i10;
            int c2 = (g65.c(i11, 24) ^ g65.c(i11, 8)) ^ i11;
            int i12 = i9 ^ c;
            int i13 = (a3 ^ i5) ^ c2;
            int i14 = i10 ^ c;
            int i15 = ((a ^ i3) ^ c2) ^ (d[i7] & 255);
            i7--;
            if (i7 < 0) {
                mo7.f(i15, bArr2, i2);
                mo7.f(i12, bArr2, i2 + 4);
                mo7.f(i13, bArr2, i2 + 8);
                mo7.f(i14, bArr2, i2 + 12);
                return 16;
            }
            int c3 = g65.c(i12, 1);
            int c4 = g65.c(i13, 5);
            int c5 = g65.c(i14, 2);
            int i16 = c3 ^ (c5 | c4);
            int i17 = ~i16;
            int i18 = i15 ^ (c4 & i17);
            int i19 = (c4 ^ (i17 ^ c5)) ^ i18;
            int i20 = i16 ^ (i18 | i19);
            a2 = g65.c(i20, 31);
            a3 = g65.c(i19, 27);
            int c6 = g65.c(i18, 30);
            a = c5 ^ (i19 & i20);
            a4 = c6;
        }
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        int a = mo7.a(bArr, i);
        int a2 = mo7.a(bArr, i + 4);
        int a3 = mo7.a(bArr, i + 8);
        int a4 = mo7.a(bArr, i + 12);
        int[] iArr = this.a;
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        while (true) {
            int i8 = a ^ (d[i3] & 255);
            int i9 = i8 ^ a3;
            int c = i9 ^ (g65.c(i9, 8) ^ g65.c(i9, 24));
            int i10 = a2 ^ i5;
            int i11 = a4 ^ i7;
            int i12 = i10 ^ i11;
            int c2 = i12 ^ (g65.c(i12, 24) ^ g65.c(i12, 8));
            int i13 = (i8 ^ i4) ^ c2;
            int i14 = i10 ^ c;
            int i15 = (a3 ^ i6) ^ c2;
            int i16 = i11 ^ c;
            i3++;
            if (i3 > 16) {
                mo7.f(i13, bArr2, i2);
                mo7.f(i14, bArr2, i2 + 4);
                mo7.f(i15, bArr2, i2 + 8);
                mo7.f(i16, bArr2, i2 + 12);
                return 16;
            }
            int c3 = g65.c(i14, 1);
            int c4 = g65.c(i15, 5);
            int c5 = g65.c(i16, 2);
            int i17 = c3 ^ (c5 | c4);
            int i18 = ~i17;
            int i19 = i13 ^ (c4 & i18);
            int i20 = (c4 ^ (i18 ^ c5)) ^ i19;
            int i21 = i17 ^ (i19 | i20);
            a2 = g65.c(i21, 31);
            a3 = g65.c(i20, 27);
            int c6 = g65.c(i19, 30);
            a = c5 ^ (i20 & i21);
            a4 = c6;
        }
    }

    @Override // defpackage.xc0
    public int a() {
        return 16;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.b) {
            if (i <= bArr.length - 16) {
                if (i2 <= bArr2.length - 16) {
                    if (this.c) {
                        return d(bArr, i, bArr2, i2);
                    }
                    return c(bArr, i, bArr2, i2);
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            if (a.length == 16) {
                mo7.b(a, 0, this.a, 0, 4);
                if (!z) {
                    int[] iArr = this.a;
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = iArr[2];
                    int i4 = iArr[3];
                    int i5 = i ^ i3;
                    int c = i5 ^ (g65.c(i5, 8) ^ g65.c(i5, 24));
                    int i6 = i2 ^ i4;
                    int c2 = (g65.c(i6, 8) ^ g65.c(i6, 24)) ^ i6;
                    int i7 = i2 ^ c;
                    int i8 = i4 ^ c;
                    int[] iArr2 = this.a;
                    iArr2[0] = i ^ c2;
                    iArr2[1] = i7;
                    iArr2[2] = i3 ^ c2;
                    iArr2[3] = i8;
                }
                this.c = z;
                this.b = true;
                return;
            }
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
