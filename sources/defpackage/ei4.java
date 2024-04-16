package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: ei4  reason: default package */
/* loaded from: classes3.dex */
public class ei4 implements rya {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int[] d;
    private int[] e;
    private int f;
    private int g = 4;
    private boolean h = false;

    private byte a() {
        if (this.g > 3) {
            f();
            this.g = 0;
        }
        byte[] bArr = this.c;
        int i = this.g;
        this.g = i + 1;
        return bArr[i];
    }

    private int b() {
        int[] iArr = this.e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 2) | (i2 << 30);
        int i4 = (i >>> 12) | (i2 << 20);
        int i5 = (i >>> 15) | (i2 << 17);
        int i6 = iArr[2];
        int i7 = (i2 >>> 4) | (i6 << 28);
        int i8 = (i2 >>> 13) | (i6 << 19);
        int i9 = iArr[3];
        int i10 = (i6 >>> 9) | (i9 << 23);
        int i11 = (i6 >>> 25) | (i9 << 7);
        int i12 = (i9 << 1) | (i6 >>> 31);
        int[] iArr2 = this.d;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        int i15 = (i13 >>> 8) | (i14 << 24);
        int i16 = (i13 >>> 13) | (i14 << 19);
        int i17 = (i13 >>> 20) | (i14 << 12);
        int i18 = iArr2[2];
        int i19 = iArr2[3];
        int i20 = i16 & i17;
        int i21 = i12 & i4 & ((i19 << 1) | (i18 >>> 31));
        return ((((((((i21 ^ (((i20 ^ (i4 & i15)) ^ (i12 & ((i14 >>> 10) | (i18 << 22)))) ^ (((i14 >>> 28) | (i18 << 4)) & ((i18 >>> 15) | (i19 << 17))))) ^ ((i18 >>> 29) | (i19 << 3))) ^ i3) ^ i5) ^ i7) ^ i8) ^ i6) ^ i10) ^ i11;
    }

    private int c() {
        int[] iArr = this.d;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 7) | (i2 << 25);
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = (i4 >>> 6) | (i5 << 26);
        return i5 ^ ((((i ^ i3) ^ ((i2 >>> 6) | (i4 << 26))) ^ i6) ^ ((i4 >>> 17) | (i5 << 15)));
    }

    private int d() {
        int[] iArr = this.e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 3) | (i2 << 29);
        int i4 = (i >>> 11) | (i2 << 21);
        int i5 = (i >>> 13) | (i2 << 19);
        int i6 = (i >>> 17) | (i2 << 15);
        int i7 = (i >>> 18) | (i2 << 14);
        int i8 = (i >>> 26) | (i2 << 6);
        int i9 = (i >>> 27) | (i2 << 5);
        int i10 = iArr[2];
        int i11 = (i2 >>> 8) | (i10 << 24);
        int i12 = (i2 >>> 16) | (i10 << 16);
        int i13 = (i2 >>> 24) | (i10 << 8);
        int i14 = (i2 >>> 27) | (i10 << 5);
        int i15 = (i2 >>> 29) | (i10 << 3);
        int i16 = iArr[3];
        return (((((((i16 ^ (((i ^ i8) ^ i13) ^ ((i10 >>> 27) | (i16 << 5)))) ^ (i3 & ((i10 >>> 3) | (i16 << 29)))) ^ (i4 & i5)) ^ (i6 & i7)) ^ (i9 & i14)) ^ (i11 & i12)) ^ (i15 & ((i10 >>> 1) | (i16 << 31)))) ^ (((i10 >>> 4) | (i16 << 28)) & ((i10 >>> 20) | (i16 << 12)));
    }

    private void e() {
        for (int i = 0; i < 8; i++) {
            this.f = b();
            this.e = h(this.e, (d() ^ this.d[0]) ^ this.f);
            this.d = h(this.d, c() ^ this.f);
        }
        this.h = true;
    }

    private void f() {
        int b = b();
        this.f = b;
        byte[] bArr = this.c;
        bArr[0] = (byte) b;
        bArr[1] = (byte) (b >> 8);
        bArr[2] = (byte) (b >> 16);
        bArr[3] = (byte) (b >> 24);
        this.e = h(this.e, d() ^ this.d[0]);
        this.d = h(this.d, c());
    }

    private void g(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.a = bArr;
        this.b = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.e;
            if (i < iArr.length) {
                byte[] bArr3 = this.a;
                int i3 = i2 + 3;
                int i4 = i2 + 2;
                int i5 = (bArr3[i3] << 24) | ((bArr3[i4] << 16) & 16711680);
                int i6 = i2 + 1;
                iArr[i] = (bArr3[i2] & 255) | i5 | ((bArr3[i6] << 8) & 65280);
                int[] iArr2 = this.d;
                byte[] bArr4 = this.b;
                iArr2[i] = (bArr4[i2] & 255) | (bArr4[i3] << 24) | ((bArr4[i4] << 16) & 16711680) | ((bArr4[i6] << 8) & 65280);
                i2 += 4;
                i++;
            } else {
                return;
            }
        }
    }

    private int[] h(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // defpackage.rya
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            if (a != null && a.length == 12) {
                if (pq7Var.b() instanceof lf5) {
                    lf5 lf5Var = (lf5) pq7Var.b();
                    this.b = new byte[lf5Var.a().length];
                    this.a = new byte[lf5Var.a().length];
                    this.d = new int[4];
                    this.e = new int[4];
                    this.c = new byte[4];
                    System.arraycopy(a, 0, this.b, 0, a.length);
                    System.arraycopy(lf5Var.a(), 0, this.a, 0, lf5Var.a().length);
                    reset();
                    return;
                }
                throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
            }
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (this.h) {
            if (i + i2 <= bArr.length) {
                if (i3 + i2 <= bArr2.length) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ a());
                    }
                    return i2;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // defpackage.rya
    public void reset() {
        this.g = 4;
        g(this.a, this.b);
        e();
    }
}
