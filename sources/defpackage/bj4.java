package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: bj4  reason: default package */
/* loaded from: classes3.dex */
public class bj4 implements rya {
    private byte[] d;
    private byte[] e;
    private boolean f;
    private int[] a = new int[1024];
    private int[] b = new int[1024];
    private int c = 0;
    private byte[] g = new byte[4];
    private int h = 0;

    private byte a() {
        if (this.h == 0) {
            int d = d();
            byte[] bArr = this.g;
            bArr[0] = (byte) (d & 255);
            bArr[1] = (byte) ((d >> 8) & 255);
            bArr[2] = (byte) ((d >> 16) & 255);
            bArr[3] = (byte) ((d >> 24) & 255);
        }
        byte[] bArr2 = this.g;
        int i = this.h;
        byte b = bArr2[i];
        this.h = 3 & (i + 1);
        return b;
    }

    private void b() {
        byte[] bArr = this.d;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.e.length >= 16) {
            if (bArr.length != 32) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                byte[] bArr3 = this.d;
                System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
                this.d = bArr2;
            }
            byte[] bArr4 = this.e;
            if (bArr4.length < 32) {
                byte[] bArr5 = new byte[32];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                byte[] bArr6 = this.e;
                System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
                this.e = bArr5;
            }
            this.h = 0;
            this.c = 0;
            int[] iArr = new int[2560];
            for (int i = 0; i < 32; i++) {
                int i2 = i >> 2;
                iArr[i2] = iArr[i2] | ((this.d[i] & 255) << ((i & 3) * 8));
            }
            for (int i3 = 0; i3 < 32; i3++) {
                int i4 = (i3 >> 2) + 8;
                iArr[i4] = iArr[i4] | ((this.e[i3] & 255) << ((i3 & 3) * 8));
            }
            for (int i5 = 16; i5 < 2560; i5++) {
                int i6 = iArr[i5 - 2];
                int i7 = iArr[i5 - 15];
                iArr[i5] = ((i6 >>> 10) ^ (c(i6, 17) ^ c(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (c(i7, 7) ^ c(i7, 18))) + iArr[i5 - 16] + i5;
            }
            System.arraycopy(iArr, 512, this.a, 0, 1024);
            System.arraycopy(iArr, 1536, this.b, 0, 1024);
            for (int i8 = 0; i8 < 4096; i8++) {
                d();
            }
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException("The IV must be at least 128 bits long");
    }

    private static int c(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int d() {
        int i;
        int i2;
        int i3 = this.c;
        int i4 = i3 & 1023;
        if (i3 < 1024) {
            int[] iArr = this.a;
            int i5 = iArr[(i4 - 3) & 1023];
            int i6 = iArr[(i4 - 1023) & 1023];
            int i7 = iArr[i4];
            int c = iArr[(i4 - 10) & 1023] + (c(i6, 23) ^ c(i5, 10));
            int[] iArr2 = this.b;
            iArr[i4] = i7 + c + iArr2[(i5 ^ i6) & 1023];
            int[] iArr3 = this.a;
            int i8 = iArr3[(i4 - 12) & 1023];
            i = iArr2[i8 & 255] + iArr2[((i8 >> 8) & 255) + 256] + iArr2[((i8 >> 16) & 255) + 512] + iArr2[((i8 >> 24) & 255) + 768];
            i2 = iArr3[i4];
        } else {
            int[] iArr4 = this.b;
            int i9 = iArr4[(i4 - 3) & 1023];
            int i10 = iArr4[(i4 - 1023) & 1023];
            int i11 = iArr4[i4];
            int c2 = iArr4[(i4 - 10) & 1023] + (c(i10, 23) ^ c(i9, 10));
            int[] iArr5 = this.a;
            iArr4[i4] = i11 + c2 + iArr5[(i9 ^ i10) & 1023];
            int[] iArr6 = this.b;
            int i12 = iArr6[(i4 - 12) & 1023];
            i = iArr5[i12 & 255] + iArr5[((i12 >> 8) & 255) + 256] + iArr5[((i12 >> 16) & 255) + 512] + iArr5[((i12 >> 24) & 255) + 768];
            i2 = iArr6[i4];
        }
        int i13 = i2 ^ i;
        this.c = (this.c + 1) & 2047;
        return i13;
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // defpackage.rya
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        v71 v71Var2;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.e = pq7Var.a();
            v71Var2 = pq7Var.b();
        } else {
            this.e = new byte[0];
            v71Var2 = v71Var;
        }
        if (v71Var2 instanceof lf5) {
            this.d = ((lf5) v71Var2).a();
            b();
            this.f = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (this.f) {
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
        b();
    }
}
