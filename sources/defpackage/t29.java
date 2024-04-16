package defpackage;
/* renamed from: t29  reason: default package */
/* loaded from: classes3.dex */
public class t29 implements xc0 {
    private int a = 12;
    private int[] b = null;
    private boolean c;

    private int c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i);
        int c2 = c(bArr, i + 4);
        for (int i3 = this.a; i3 >= 1; i3--) {
            int i4 = i3 * 2;
            c2 = g(c2 - this.b[i4 + 1], c) ^ c;
            c = g(c - this.b[i4], c2) ^ c2;
        }
        i(c - this.b[0], bArr2, i2);
        i(c2 - this.b[1], bArr2, i2 + 4);
        return 8;
    }

    private int e(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i) + this.b[0];
        int c2 = c(bArr, i + 4) + this.b[1];
        for (int i3 = 1; i3 <= this.a; i3++) {
            int i4 = i3 * 2;
            c = f(c ^ c2, c2) + this.b[i4];
            c2 = f(c2 ^ c, c) + this.b[i4 + 1];
        }
        i(c, bArr2, i2);
        i(c2, bArr2, i2 + 4);
        return 8;
    }

    private int f(int i, int i2) {
        int i3 = i2 & 31;
        return (i >>> (32 - i3)) | (i << i3);
    }

    private int g(int i, int i2) {
        int i3 = i2 & 31;
        return (i << (32 - i3)) | (i >>> i3);
    }

    private void h(byte[] bArr) {
        int[] iArr;
        int length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[(this.a + 1) * 2];
        this.b = iArr3;
        iArr3[0] = -1209970333;
        int i3 = 1;
        while (true) {
            iArr = this.b;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] - 1640531527;
            i3++;
        }
        if (length2 > iArr.length) {
            length = length2 * 3;
        } else {
            length = iArr.length * 3;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int[] iArr4 = this.b;
            i5 = f(iArr4[i4] + i5 + i6, 3);
            iArr4[i4] = i5;
            i6 = f(iArr2[i7] + i5 + i6, i6 + i5);
            iArr2[i7] = i6;
            i4 = (i4 + 1) % this.b.length;
            i7 = (i7 + 1) % length2;
        }
    }

    private void i(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    @Override // defpackage.xc0
    public int a() {
        return 8;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.c) {
            return e(bArr, i, bArr2, i2);
        }
        return d(bArr, i, bArr2, i2);
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof v29) {
            v29 v29Var = (v29) v71Var;
            this.a = v29Var.b();
            h(v29Var.a());
        } else if (v71Var instanceof lf5) {
            h(((lf5) v71Var).a());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + v71Var.getClass().getName());
        }
        this.c = z;
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
