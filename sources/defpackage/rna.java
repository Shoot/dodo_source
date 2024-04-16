package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: rna  reason: default package */
/* loaded from: classes3.dex */
public class rna implements xc0 {
    static short[] f = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private int[] a;
    private int[] b;
    private int[] c;
    private int[] d;
    private boolean e;

    private int e(int i, int i2) {
        int i3 = i2 & 255;
        short[] sArr = f;
        int i4 = ((i2 >> 8) & 255) ^ sArr[this.a[i] ^ i3];
        int i5 = i3 ^ sArr[this.b[i] ^ i4];
        int i6 = i4 ^ sArr[this.c[i] ^ i5];
        return (i6 << 8) + (sArr[this.d[i] ^ i6] ^ i5);
    }

    private int f(int i, int i2) {
        int i3 = i2 & 255;
        int i4 = (i2 >> 8) & 255;
        short[] sArr = f;
        int i5 = i3 ^ sArr[this.d[i] ^ i4];
        int i6 = i4 ^ sArr[this.c[i] ^ i5];
        int i7 = i5 ^ sArr[this.b[i] ^ i6];
        return ((sArr[this.a[i] ^ i7] ^ i6) << 8) + i7;
    }

    @Override // defpackage.xc0
    public int a() {
        return 8;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.b != null) {
            if (i + 8 <= bArr.length) {
                if (i2 + 8 <= bArr2.length) {
                    if (this.e) {
                        d(bArr, i, bArr2, i2);
                        return 8;
                    }
                    c(bArr, i, bArr2, i2);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("SKIPJACK engine not initialised");
    }

    public int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i] << 8) + (bArr[i + 1] & 255);
        int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i7 = 31;
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 8) {
                int f2 = f(i7, i4);
                i7--;
                i9++;
                int i10 = i6;
                i6 = i3;
                i3 = f2;
                i4 = (i5 ^ f2) ^ (i7 + 1);
                i5 = i10;
            }
            int i11 = 0;
            while (i11 < 8) {
                int f3 = f(i7, i4);
                i7--;
                i11++;
                int i12 = i6;
                i6 = (i3 ^ i4) ^ (i7 + 1);
                i3 = f3;
                i4 = i5;
                i5 = i12;
            }
        }
        bArr2[i2] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i4 >> 8);
        bArr2[i2 + 3] = (byte) i4;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    public int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i] << 8) + (bArr[i + 1] & 255);
        int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i7 = 0;
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 8) {
                int e = e(i7, i3);
                i7++;
                i9++;
                int i10 = i4;
                i4 = e;
                i3 = (i6 ^ e) ^ i7;
                i6 = i5;
                i5 = i10;
            }
            int i11 = 0;
            while (i11 < 8) {
                int i12 = i7 + 1;
                int i13 = (i4 ^ i3) ^ i12;
                int e2 = e(i7, i3);
                i11++;
                i7 = i12;
                i4 = e2;
                i3 = i6;
                i6 = i5;
                i5 = i13;
            }
        }
        bArr2[i2] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i4 >> 8);
        bArr2[i2 + 3] = (byte) i4;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            this.e = z;
            this.a = new int[32];
            this.b = new int[32];
            this.c = new int[32];
            this.d = new int[32];
            for (int i = 0; i < 32; i++) {
                int i2 = i * 4;
                this.a[i] = a[i2 % 10] & 255;
                this.b[i] = a[(i2 + 1) % 10] & 255;
                this.c[i] = a[(i2 + 2) % 10] & 255;
                this.d[i] = a[(i2 + 3) % 10] & 255;
            }
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
