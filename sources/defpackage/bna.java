package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: bna  reason: default package */
/* loaded from: classes3.dex */
public class bna implements x36 {
    protected final int a;
    protected final int b;
    protected long c;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    protected long i;
    protected int j;
    protected int k;

    public bna() {
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.a = 2;
        this.b = 4;
    }

    protected static long d(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            long j5 = j + j2;
            long j6 = j3 + j4;
            long d = d(j2, 13) ^ j5;
            long d2 = d(j4, 16) ^ j6;
            long j7 = j6 + d;
            j = d(j5, 32) + d2;
            j2 = d(d, 17) ^ j7;
            j4 = d(d2, 21) ^ j;
            j3 = d(j7, 32);
        }
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public long b() throws DataLengthException, IllegalStateException {
        int i;
        this.i = ((this.i >>> ((7 - this.j) << 3)) >>> 8) | ((((this.k << 3) + i) & 255) << 56);
        c();
        this.g ^= 255;
        a(this.b);
        long j = ((this.e ^ this.f) ^ this.g) ^ this.h;
        reset();
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.k++;
        this.h ^= this.i;
        a(this.a);
        this.e ^= this.i;
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        mo7.v(b(), bArr, i);
        return 8;
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return "SipHash-" + this.a + "-" + this.b;
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return 8;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) throws IllegalArgumentException {
        if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            if (a.length == 16) {
                this.c = mo7.p(a, 0);
                this.d = mo7.p(a, 8);
                reset();
                return;
            }
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
    }

    @Override // defpackage.x36
    public void reset() {
        long j = this.c;
        this.e = 8317987319222330741L ^ j;
        long j2 = this.d;
        this.f = 7237128888997146477L ^ j2;
        this.g = j ^ 7816392313619706465L;
        this.h = 8387220255154660723L ^ j2;
        this.i = 0L;
        this.j = 0;
        this.k = 0;
    }

    @Override // defpackage.x36
    public void update(byte b) throws IllegalStateException {
        this.i = (this.i >>> 8) | ((b & 255) << 56);
        int i = this.j + 1;
        this.j = i;
        if (i == 8) {
            c();
            this.j = 0;
        }
    }

    public bna(int i, int i2) {
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = i2 & (-8);
        int i4 = this.j;
        int i5 = 0;
        if (i4 == 0) {
            while (i5 < i3) {
                this.i = mo7.p(bArr, i + i5);
                c();
                i5 += 8;
            }
            while (i5 < i2) {
                this.i = (this.i >>> 8) | ((bArr[i + i5] & 255) << 56);
                i5++;
            }
            this.j = i2 - i3;
            return;
        }
        int i6 = i4 << 3;
        int i7 = 0;
        while (i7 < i3) {
            long p = mo7.p(bArr, i + i7);
            this.i = (this.i >>> (-i6)) | (p << i6);
            c();
            this.i = p;
            i7 += 8;
        }
        while (i7 < i2) {
            this.i = (this.i >>> 8) | ((bArr[i + i7] & 255) << 56);
            int i8 = this.j + 1;
            this.j = i8;
            if (i8 == 8) {
                c();
                this.j = 0;
            }
            i7++;
        }
    }
}
