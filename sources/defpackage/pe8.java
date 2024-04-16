package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: pe8  reason: default package */
/* loaded from: classes3.dex */
public class pe8 implements x36 {
    private final xc0 a;
    private final byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private final byte[] p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public pe8() {
        this.b = new byte[1];
        this.p = new byte[16];
        this.q = 0;
        this.a = null;
    }

    private static final long a(int i, int i2) {
        return (i & 4294967295L) * i2;
    }

    private void b() {
        int i = this.q;
        if (i < 16) {
            this.p[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.p[i2] = 0;
            }
        }
        long l = mo7.l(this.p, 0);
        long j = l & 4294967295L;
        long l2 = mo7.l(this.p, 4) & 4294967295L;
        long l3 = mo7.l(this.p, 8) & 4294967295L;
        long l4 = 4294967295L & mo7.l(this.p, 12);
        int i3 = (int) (this.r + (l & 67108863));
        this.r = i3;
        this.s = (int) (this.s + ((((l2 << 32) | j) >>> 26) & 67108863));
        this.t = (int) (this.t + (((l2 | (l3 << 32)) >>> 20) & 67108863));
        this.u = (int) (this.u + ((((l4 << 32) | l3) >>> 14) & 67108863));
        int i4 = (int) (this.v + (l4 >>> 8));
        this.v = i4;
        if (this.q == 16) {
            this.v = i4 + 16777216;
        }
        long a = a(i3, this.c) + a(this.s, this.k) + a(this.t, this.j) + a(this.u, this.i) + a(this.v, this.h);
        long a2 = a(this.r, this.d) + a(this.s, this.c) + a(this.t, this.k) + a(this.u, this.j) + a(this.v, this.i);
        long a3 = a(this.r, this.e) + a(this.s, this.d) + a(this.t, this.c) + a(this.u, this.k) + a(this.v, this.j);
        long a4 = a(this.r, this.f) + a(this.s, this.e) + a(this.t, this.d) + a(this.u, this.c) + a(this.v, this.k);
        long j2 = a2 + (a >>> 26);
        long j3 = a3 + (j2 >>> 26);
        this.t = ((int) j3) & 67108863;
        long j4 = a4 + (j3 >>> 26);
        this.u = ((int) j4) & 67108863;
        long a5 = a(this.r, this.g) + a(this.s, this.f) + a(this.t, this.e) + a(this.u, this.d) + a(this.v, this.c) + (j4 >>> 26);
        this.v = ((int) a5) & 67108863;
        int i5 = (((int) a) & 67108863) + (((int) (a5 >>> 26)) * 5);
        this.s = (((int) j2) & 67108863) + (i5 >>> 26);
        this.r = i5 & 67108863;
    }

    private void c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i = 16;
            if (this.a != null && (bArr2 == null || bArr2.length != 16)) {
                throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
            }
            int l = mo7.l(bArr, 0);
            int l2 = mo7.l(bArr, 4);
            int l3 = mo7.l(bArr, 8);
            int l4 = mo7.l(bArr, 12);
            this.c = 67108863 & l;
            int i2 = ((l >>> 26) | (l2 << 6)) & 67108611;
            this.d = i2;
            int i3 = ((l2 >>> 20) | (l3 << 12)) & 67092735;
            this.e = i3;
            int i4 = ((l3 >>> 14) | (l4 << 18)) & 66076671;
            this.f = i4;
            int i5 = (l4 >>> 8) & 1048575;
            this.g = i5;
            this.h = i2 * 5;
            this.i = i3 * 5;
            this.j = i4 * 5;
            this.k = i5 * 5;
            xc0 xc0Var = this.a;
            if (xc0Var != null) {
                byte[] bArr3 = new byte[16];
                xc0Var.init(true, new lf5(bArr, 16, 16));
                this.a.b(bArr2, 0, bArr3, 0);
                bArr = bArr3;
                i = 0;
            }
            this.l = mo7.l(bArr, i);
            this.m = mo7.l(bArr, i + 4);
            this.n = mo7.l(bArr, i + 8);
            this.o = mo7.l(bArr, i + 12);
            return;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i + 16 <= bArr.length) {
            if (this.q > 0) {
                b();
            }
            int i7 = this.s;
            int i8 = this.r;
            int i9 = i7 + (i8 >>> 26);
            int i10 = this.t + (i9 >>> 26);
            int i11 = this.u + (i10 >>> 26);
            int i12 = i10 & 67108863;
            int i13 = this.v + (i11 >>> 26);
            int i14 = i11 & 67108863;
            int i15 = (i8 & 67108863) + ((i13 >>> 26) * 5);
            int i16 = i13 & 67108863;
            int i17 = (i9 & 67108863) + (i15 >>> 26);
            int i18 = i15 & 67108863;
            int i19 = i18 + 5;
            int i20 = (i19 >>> 26) + i17;
            int i21 = (i20 >>> 26) + i12;
            int i22 = (i21 >>> 26) + i14;
            int i23 = 67108863 & i22;
            int i24 = ((i22 >>> 26) + i16) - 67108864;
            int i25 = (i24 >>> 31) - 1;
            int i26 = ~i25;
            this.r = (i18 & i26) | (i19 & 67108863 & i25);
            this.s = (i17 & i26) | (i20 & 67108863 & i25);
            this.t = (i12 & i26) | (i21 & 67108863 & i25);
            this.u = (i23 & i25) | (i14 & i26);
            this.v = (i16 & i26) | (i24 & i25);
            long j = ((i2 | (i3 << 26)) & 4294967295L) + (this.l & 4294967295L);
            mo7.i((int) j, bArr, i);
            long j2 = (((i3 >>> 6) | (i4 << 20)) & 4294967295L) + (this.m & 4294967295L) + (j >>> 32);
            mo7.i((int) j2, bArr, i + 4);
            long j3 = (((i4 >>> 12) | (i5 << 14)) & 4294967295L) + (this.n & 4294967295L) + (j2 >>> 32);
            mo7.i((int) j3, bArr, i + 8);
            mo7.i((int) ((((i5 >>> 18) | (i6 << 8)) & 4294967295L) + (4294967295L & this.o) + (j3 >>> 32)), bArr, i + 12);
            reset();
            return 16;
        }
        throw new OutputLengthException("Output buffer is too short.");
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        if (this.a == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.a.getAlgorithmName();
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return 16;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) throws IllegalArgumentException {
        byte[] bArr;
        if (this.a != null) {
            if (v71Var instanceof pq7) {
                pq7 pq7Var = (pq7) v71Var;
                bArr = pq7Var.a();
                v71Var = pq7Var.b();
            } else {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
        } else {
            bArr = null;
        }
        if (v71Var instanceof lf5) {
            c(((lf5) v71Var).a(), bArr);
            reset();
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    @Override // defpackage.x36
    public void reset() {
        this.q = 0;
        this.v = 0;
        this.u = 0;
        this.t = 0;
        this.s = 0;
        this.r = 0;
    }

    @Override // defpackage.x36
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.b;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    public pe8(xc0 xc0Var) {
        this.b = new byte[1];
        this.p = new byte[16];
        this.q = 0;
        if (xc0Var.a() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.a = xc0Var;
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.q == 16) {
                b();
                this.q = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.q);
            System.arraycopy(bArr, i3 + i, this.p, this.q, min);
            i3 += min;
            this.q += min;
        }
    }
}
