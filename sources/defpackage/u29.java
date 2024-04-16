package defpackage;
/* renamed from: u29  reason: default package */
/* loaded from: classes3.dex */
public class u29 implements xc0 {
    private int a = 12;
    private long[] b = null;
    private boolean c;

    private long c(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + (bArr[i2 + i] & 255);
        }
        return j;
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        long c = c(bArr, i);
        long c2 = c(bArr, i + 8);
        for (int i3 = this.a; i3 >= 1; i3--) {
            int i4 = i3 * 2;
            c2 = g(c2 - this.b[i4 + 1], c) ^ c;
            c = g(c - this.b[i4], c2) ^ c2;
        }
        i(c - this.b[0], bArr2, i2);
        i(c2 - this.b[1], bArr2, i2 + 8);
        return 16;
    }

    private int e(byte[] bArr, int i, byte[] bArr2, int i2) {
        long c = c(bArr, i) + this.b[0];
        long c2 = c(bArr, i + 8) + this.b[1];
        for (int i3 = 1; i3 <= this.a; i3++) {
            int i4 = i3 * 2;
            c = f(c ^ c2, c2) + this.b[i4];
            c2 = f(c2 ^ c, c) + this.b[i4 + 1];
        }
        i(c, bArr2, i2);
        i(c2, bArr2, i2 + 8);
        return 16;
    }

    private long f(long j, long j2) {
        long j3 = j2 & 63;
        return (j >>> ((int) (64 - j3))) | (j << ((int) j3));
    }

    private long g(long j, long j2) {
        long j3 = j2 & 63;
        return (j << ((int) (64 - j3))) | (j >>> ((int) j3));
    }

    private void h(byte[] bArr) {
        long[] jArr;
        int length;
        int length2 = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length2];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 8;
            jArr2[i2] = jArr2[i2] + ((bArr[i] & 255) << ((i % 8) * 8));
        }
        long[] jArr3 = new long[(this.a + 1) * 2];
        this.b = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i3 = 1;
        while (true) {
            jArr = this.b;
            if (i3 >= jArr.length) {
                break;
            }
            jArr[i3] = jArr[i3 - 1] - 7046029254386353131L;
            i3++;
        }
        if (length2 > jArr.length) {
            length = length2 * 3;
        } else {
            length = jArr.length * 3;
        }
        long j = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = this.b;
            j = f(jArr4[i4] + j + j2, 3L);
            jArr4[i4] = j;
            j2 = f(jArr2[i5] + j + j2, j2 + j);
            jArr2[i5] = j2;
            i4 = (i4 + 1) % this.b.length;
            i5 = (i5 + 1) % length2;
        }
    }

    private void i(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) j;
            j >>>= 8;
        }
    }

    @Override // defpackage.xc0
    public int a() {
        return 16;
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
        return "RC5-64";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof v29) {
            v29 v29Var = (v29) v71Var;
            this.c = z;
            this.a = v29Var.b();
            h(v29Var.a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
