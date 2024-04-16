package defpackage;
/* renamed from: nc0  reason: default package */
/* loaded from: classes3.dex */
public class nc0 implements nn3 {
    private static final long[] m = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    private static final byte[][] n = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    private static int o = 12;
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private int g;
    private long[] h;
    private long[] i;
    private long j;
    private long k;
    private long l;

    public nc0() {
        this(512);
    }

    private void a(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.h;
        long j3 = jArr[i] + jArr[i2] + j;
        jArr[i] = j3;
        jArr[i4] = qy5.b(jArr[i4] ^ j3, 32);
        long[] jArr2 = this.h;
        long j4 = jArr2[i3] + jArr2[i4];
        jArr2[i3] = j4;
        jArr2[i2] = qy5.b(j4 ^ jArr2[i2], 24);
        long[] jArr3 = this.h;
        long j5 = jArr3[i] + jArr3[i2] + j2;
        jArr3[i] = j5;
        jArr3[i4] = qy5.b(jArr3[i4] ^ j5, 16);
        long[] jArr4 = this.h;
        long j6 = jArr4[i3] + jArr4[i4];
        jArr4[i3] = j6;
        jArr4[i2] = qy5.b(j6 ^ jArr4[i2], 63);
    }

    private void b(byte[] bArr, int i) {
        e();
        long[] jArr = new long[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            jArr[i3] = mo7.p(bArr, (i3 * 8) + i);
        }
        for (int i4 = 0; i4 < o; i4++) {
            byte[][] bArr2 = n;
            byte[] bArr3 = bArr2[i4];
            a(jArr[bArr3[0]], jArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i4];
            a(jArr[bArr4[2]], jArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i4];
            a(jArr[bArr5[4]], jArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i4];
            a(jArr[bArr6[6]], jArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i4];
            a(jArr[bArr7[8]], jArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i4];
            a(jArr[bArr8[10]], jArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i4];
            a(jArr[bArr9[12]], jArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i4];
            a(jArr[bArr10[14]], jArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.i;
            if (i2 < jArr2.length) {
                long j = jArr2[i2];
                long[] jArr3 = this.h;
                jArr2[i2] = (j ^ jArr3[i2]) ^ jArr3[i2 + 8];
                i2++;
            } else {
                return;
            }
        }
    }

    private void d() {
        if (this.i == null) {
            this.i = r1;
            long[] jArr = m;
            long j = jArr[4];
            long[] jArr2 = {jArr[0] ^ ((this.a | (this.b << 8)) | 16842752), jArr[1], jArr[2], jArr[3], j, jArr[5]};
            byte[] bArr = this.c;
            if (bArr != null) {
                jArr2[4] = j ^ mo7.p(bArr, 0);
                long[] jArr3 = this.i;
                jArr3[5] = jArr3[5] ^ mo7.p(this.c, 8);
            }
            long[] jArr4 = this.i;
            long j2 = jArr[6];
            jArr4[6] = j2;
            jArr4[7] = jArr[7];
            byte[] bArr2 = this.d;
            if (bArr2 != null) {
                jArr4[6] = mo7.p(bArr2, 0) ^ j2;
                long[] jArr5 = this.i;
                jArr5[7] = jArr5[7] ^ mo7.p(this.d, 8);
            }
        }
    }

    private void e() {
        long[] jArr = this.i;
        System.arraycopy(jArr, 0, this.h, 0, jArr.length);
        long[] jArr2 = m;
        System.arraycopy(jArr2, 0, this.h, this.i.length, 4);
        long[] jArr3 = this.h;
        jArr3[12] = this.j ^ jArr2[4];
        jArr3[13] = this.k ^ jArr2[5];
        jArr3[14] = this.l ^ jArr2[6];
        jArr3[15] = jArr2[7];
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        long[] jArr;
        int i2;
        this.l = -1L;
        long j = this.j;
        int i3 = this.g;
        long j2 = j + i3;
        this.j = j2;
        if (i3 > 0 && j2 == 0) {
            this.k++;
        }
        b(this.f, 0);
        tr.y(this.f, (byte) 0);
        tr.C(this.h, 0L);
        int i4 = 0;
        while (true) {
            jArr = this.i;
            if (i4 >= jArr.length || (i2 = i4 * 8) >= this.a) {
                break;
            }
            byte[] y = mo7.y(jArr[i4]);
            int i5 = this.a;
            if (i2 < i5 - 8) {
                System.arraycopy(y, 0, bArr, i2 + i, 8);
            } else {
                System.arraycopy(y, 0, bArr, i + i2, i5 - i2);
            }
            i4++;
        }
        tr.C(jArr, 0L);
        reset();
        return this.a;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // defpackage.nn3
    public int getByteLength() {
        return 128;
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return this.a;
    }

    @Override // defpackage.e23
    public void reset() {
        this.g = 0;
        this.l = 0L;
        this.j = 0L;
        this.k = 0L;
        this.i = null;
        tr.y(this.f, (byte) 0);
        byte[] bArr = this.e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f, 0, bArr.length);
            this.g = 128;
        }
        d();
    }

    @Override // defpackage.e23
    public void update(byte b) {
        int i = this.g;
        if (128 - i != 0) {
            this.f[i] = b;
            this.g = i + 1;
            return;
        }
        long j = this.j + 128;
        this.j = j;
        if (j == 0) {
            this.k++;
        }
        b(this.f, 0);
        tr.y(this.f, (byte) 0);
        this.f[0] = b;
        this.g = 1;
    }

    public nc0(int i) {
        this.a = 64;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h = new long[16];
        this.i = null;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f = new byte[128];
        this.b = 0;
        this.a = i / 8;
        d();
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.g;
        if (i4 != 0) {
            i3 = 128 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.f, i4, i2);
                this.g += i2;
            }
            System.arraycopy(bArr, i, this.f, i4, i3);
            long j = this.j + 128;
            this.j = j;
            if (j == 0) {
                this.k++;
            }
            b(this.f, 0);
            this.g = 0;
            tr.y(this.f, (byte) 0);
        } else {
            i3 = 0;
        }
        int i5 = i2 + i;
        int i6 = i5 - 128;
        int i7 = i + i3;
        while (i7 < i6) {
            long j2 = this.j + 128;
            this.j = j2;
            if (j2 == 0) {
                this.k++;
            }
            b(bArr, i7);
            i7 += 128;
        }
        i2 = i5 - i7;
        System.arraycopy(bArr, i7, this.f, 0, i2);
        this.g += i2;
    }

    public nc0(nc0 nc0Var) {
        this.a = 64;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h = new long[16];
        this.i = null;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.g = nc0Var.g;
        this.f = tr.h(nc0Var.f);
        this.b = nc0Var.b;
        this.e = tr.h(nc0Var.e);
        this.a = nc0Var.a;
        this.i = tr.l(nc0Var.i);
        this.d = tr.h(nc0Var.d);
        this.c = tr.h(nc0Var.c);
        this.j = nc0Var.j;
        this.k = nc0Var.k;
        this.l = nc0Var.l;
    }
}
