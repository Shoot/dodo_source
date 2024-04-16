package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: ana  reason: default package */
/* loaded from: classes3.dex */
public class ana extends bna {
    public ana() {
    }

    @Override // defpackage.bna
    public long b() throws DataLengthException, IllegalStateException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }

    @Override // defpackage.bna, defpackage.x36
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2;
        this.i = ((this.i >>> ((7 - this.j) << 3)) >>> 8) | ((((this.k << 3) + i2) & 255) << 56);
        c();
        this.g ^= 238;
        a(this.b);
        long j = this.e;
        long j2 = this.f;
        long j3 = ((j ^ j2) ^ this.g) ^ this.h;
        this.f = j2 ^ 221;
        a(this.b);
        reset();
        mo7.v(j3, bArr, i);
        mo7.v(((this.e ^ this.f) ^ this.g) ^ this.h, bArr, i + 8);
        return 16;
    }

    @Override // defpackage.bna, defpackage.x36
    public String getAlgorithmName() {
        return "SipHash128-" + this.a + "-" + this.b;
    }

    @Override // defpackage.bna, defpackage.x36
    public int getMacSize() {
        return 16;
    }

    @Override // defpackage.bna, defpackage.x36
    public void reset() {
        super.reset();
        this.f ^= 238;
    }

    public ana(int i, int i2) {
        super(i, i2);
    }
}
