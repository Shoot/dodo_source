package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: aj4  reason: default package */
/* loaded from: classes3.dex */
public class aj4 implements rya {
    private byte[] d;
    private byte[] e;
    private boolean f;
    private int[] a = new int[512];
    private int[] b = new int[512];
    private int c = 0;
    private byte[] g = new byte[4];
    private int h = 0;

    private static int a(int i, int i2) {
        return k(i - i2);
    }

    private static int b(int i) {
        return (i >>> 3) ^ (m(i, 7) ^ m(i, 18));
    }

    private static int c(int i) {
        return (i >>> 10) ^ (m(i, 17) ^ m(i, 19));
    }

    private int d(int i, int i2, int i3) {
        return (m(i, 10) ^ m(i3, 23)) + m(i2, 8);
    }

    private int e(int i, int i2, int i3) {
        return (l(i, 10) ^ l(i3, 23)) + l(i2, 8);
    }

    private byte f() {
        if (this.h == 0) {
            int n = n();
            byte[] bArr = this.g;
            bArr[0] = (byte) (n & 255);
            bArr[1] = (byte) ((n >> 8) & 255);
            bArr[2] = (byte) ((n >> 16) & 255);
            bArr[3] = (byte) ((n >> 24) & 255);
        }
        byte[] bArr2 = this.g;
        int i = this.h;
        byte b = bArr2[i];
        this.h = 3 & (i + 1);
        return b;
    }

    private int g(int i) {
        int[] iArr = this.b;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    private int h(int i) {
        int[] iArr = this.a;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    private void i() {
        if (this.d.length == 16) {
            this.h = 0;
            this.c = 0;
            int[] iArr = new int[1280];
            for (int i = 0; i < 16; i++) {
                int i2 = i >> 2;
                iArr[i2] = ((this.d[i] & 255) << ((i & 3) * 8)) | iArr[i2];
            }
            System.arraycopy(iArr, 0, iArr, 4, 4);
            int i3 = 0;
            while (true) {
                byte[] bArr = this.e;
                if (i3 >= bArr.length || i3 >= 16) {
                    break;
                }
                int i4 = (i3 >> 2) + 8;
                iArr[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr[i4];
                i3++;
            }
            System.arraycopy(iArr, 8, iArr, 12, 4);
            for (int i5 = 16; i5 < 1280; i5++) {
                iArr[i5] = c(iArr[i5 - 2]) + iArr[i5 - 7] + b(iArr[i5 - 15]) + iArr[i5 - 16] + i5;
            }
            System.arraycopy(iArr, 256, this.a, 0, 512);
            System.arraycopy(iArr, 768, this.b, 0, 512);
            for (int i6 = 0; i6 < 512; i6++) {
                this.a[i6] = n();
            }
            for (int i7 = 0; i7 < 512; i7++) {
                this.b[i7] = n();
            }
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException("The key must be 128 bits long");
    }

    private static int j(int i) {
        return i & 1023;
    }

    private static int k(int i) {
        return i & 511;
    }

    private static int l(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private static int m(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int n() {
        int h;
        int i;
        int k = k(this.c);
        if (this.c < 512) {
            int[] iArr = this.a;
            iArr[k] = iArr[k] + d(iArr[a(k, 3)], this.a[a(k, 10)], this.a[a(k, 511)]);
            h = g(this.a[a(k, 12)]);
            i = this.a[k];
        } else {
            int[] iArr2 = this.b;
            iArr2[k] = iArr2[k] + e(iArr2[a(k, 3)], this.b[a(k, 10)], this.b[a(k, 511)]);
            h = h(this.b[a(k, 12)]);
            i = this.b[k];
        }
        int i2 = i ^ h;
        this.c = j(this.c + 1);
        return i2;
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        return "HC-128";
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
            i();
            this.f = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (this.f) {
            if (i + i2 <= bArr.length) {
                if (i3 + i2 <= bArr2.length) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ f());
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
        i();
    }
}
