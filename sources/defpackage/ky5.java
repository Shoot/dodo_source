package defpackage;
/* renamed from: ky5  reason: default package */
/* loaded from: classes3.dex */
public abstract class ky5 implements nn3, sc6 {
    static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    private byte[] a;
    private int b;
    private long c;
    private long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    protected long i;
    protected long j;
    protected long k;
    protected long l;
    private long[] m;
    private int n;

    /* JADX INFO: Access modifiers changed from: protected */
    public ky5() {
        this.a = new byte[8];
        this.m = new long[80];
        this.b = 0;
        reset();
    }

    private long d(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    private long e(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private long f(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private long g(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private long h(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private long i(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    private void j() {
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            this.c = j & 2305843009213693951L;
        }
    }

    @Override // defpackage.nn3
    public int getByteLength() {
        return 128;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(ky5 ky5Var) {
        byte[] bArr = ky5Var.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = ky5Var.b;
        this.c = ky5Var.c;
        this.d = ky5Var.d;
        this.e = ky5Var.e;
        this.f = ky5Var.f;
        this.g = ky5Var.g;
        this.h = ky5Var.h;
        this.i = ky5Var.i;
        this.j = ky5Var.j;
        this.k = ky5Var.k;
        this.l = ky5Var.l;
        long[] jArr = ky5Var.m;
        System.arraycopy(jArr, 0, this.m, 0, jArr.length);
        this.n = ky5Var.n;
    }

    public void l() {
        j();
        long j = this.c << 3;
        long j2 = this.d;
        byte b = Byte.MIN_VALUE;
        while (true) {
            update(b);
            if (this.b != 0) {
                b = 0;
            } else {
                n(j, j2);
                m();
                return;
            }
        }
    }

    protected void m() {
        j();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.m;
            long g = g(jArr[i - 2]);
            long[] jArr2 = this.m;
            jArr[i] = g + jArr2[i - 7] + f(jArr2[i - 15]) + this.m[i - 16];
        }
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        long j5 = this.i;
        long j6 = this.j;
        long j7 = this.k;
        long j8 = j6;
        long j9 = j4;
        int i2 = 0;
        long j10 = j2;
        long j11 = j3;
        long j12 = j5;
        int i3 = 0;
        long j13 = this.l;
        long j14 = j;
        long j15 = j7;
        while (i3 < 10) {
            long j16 = j12;
            long[] jArr3 = o;
            int i4 = i2 + 1;
            long i5 = j13 + i(j12) + d(j12, j8, j15) + jArr3[i2] + this.m[i2];
            long j17 = j9 + i5;
            long h = i5 + h(j14) + e(j14, j10, j11);
            int i6 = i2 + 2;
            long i7 = j15 + i(j17) + d(j17, j16, j8) + jArr3[i4] + this.m[i4];
            long j18 = j11 + i7;
            long h2 = i7 + h(h) + e(h, j14, j10);
            int i8 = i2 + 3;
            long i9 = j8 + i(j18) + d(j18, j17, j16) + jArr3[i6] + this.m[i6];
            long j19 = j10 + i9;
            long h3 = i9 + h(h2) + e(h2, h, j14);
            int i10 = i2 + 4;
            long i11 = j16 + i(j19) + d(j19, j18, j17) + jArr3[i8] + this.m[i8];
            long j20 = j14 + i11;
            long h4 = i11 + h(h3) + e(h3, h2, h);
            int i12 = i2 + 5;
            long i13 = j17 + i(j20) + d(j20, j19, j18) + jArr3[i10] + this.m[i10];
            long j21 = h + i13;
            long h5 = i13 + h(h4) + e(h4, h3, h2);
            int i14 = i2 + 6;
            long i15 = j18 + i(j21) + d(j21, j20, j19) + jArr3[i12] + this.m[i12];
            long j22 = h2 + i15;
            long h6 = i15 + h(h5) + e(h5, h4, h3);
            j15 = j22;
            int i16 = i2 + 7;
            long i17 = j19 + i(j22) + d(j22, j21, j20) + jArr3[i14] + this.m[i14];
            long j23 = h3 + i17;
            j8 = j23;
            j10 = i17 + h(h6) + e(h6, h5, h4);
            i2 += 8;
            long i18 = j20 + i(j23) + d(j23, j15, j21) + jArr3[i16] + this.m[i16];
            long h7 = i18 + h(j10) + e(j10, h6, h5);
            i3++;
            j12 = h4 + i18;
            j11 = h6;
            j13 = j21;
            j9 = h5;
            j14 = h7;
        }
        this.e += j14;
        this.f += j10;
        this.g += j11;
        this.h += j9;
        this.i += j12;
        this.j += j8;
        this.k += j15;
        this.l += j13;
        this.n = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.m[i19] = 0;
        }
    }

    protected void n(long j, long j2) {
        if (this.n > 14) {
            m();
        }
        long[] jArr = this.m;
        jArr[14] = j2;
        jArr[15] = j;
    }

    protected void o(byte[] bArr, int i) {
        this.m[this.n] = mo7.c(bArr, i);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            m();
        }
    }

    @Override // defpackage.e23
    public void reset() {
        this.c = 0L;
        this.d = 0L;
        int i = 0;
        this.b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.e23
    public void update(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            o(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ky5(ky5 ky5Var) {
        this.a = new byte[8];
        this.m = new long[80];
        k(ky5Var);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        while (this.b != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.a.length) {
            o(bArr, i);
            byte[] bArr2 = this.a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.c += bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
