package defpackage;
/* renamed from: ru0  reason: default package */
/* loaded from: classes3.dex */
public class ru0 extends ct9 {
    @Override // defpackage.ct9
    protected void a() {
        int[] iArr = this.c;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i != 0) {
            return;
        }
        throw new IllegalStateException("attempt to increase counter past 2^32.");
    }

    @Override // defpackage.ct9
    protected void b(byte[] bArr) {
        su0.j(this.a, this.c, this.d);
        mo7.j(this.d, bArr, 0);
    }

    @Override // defpackage.ct9
    protected int c() {
        return 12;
    }

    @Override // defpackage.ct9
    protected void f() {
        this.c[12] = 0;
    }

    @Override // defpackage.ct9, defpackage.rya
    public String getAlgorithmName() {
        return "ChaCha7539";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ct9
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 32) {
                e(bArr.length, this.c, 0);
                mo7.n(bArr, 0, this.c, 4, 8);
            } else {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 256 bit key");
            }
        }
        mo7.n(bArr2, 0, this.c, 13, 3);
    }
}
