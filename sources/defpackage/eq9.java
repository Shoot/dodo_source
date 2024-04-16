package defpackage;
/* renamed from: eq9  reason: default package */
/* loaded from: classes3.dex */
public class eq9 extends ky5 {
    public eq9() {
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new eq9(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        super.k((eq9) sc6Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        l();
        mo7.s(this.e, bArr, i);
        mo7.s(this.f, bArr, i + 8);
        mo7.s(this.g, bArr, i + 16);
        mo7.s(this.h, bArr, i + 24);
        mo7.s(this.i, bArr, i + 32);
        mo7.s(this.j, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 48;
    }

    @Override // defpackage.ky5, defpackage.e23
    public void reset() {
        super.reset();
        this.e = -3766243637369397544L;
        this.f = 7105036623409894663L;
        this.g = -7973340178411365097L;
        this.h = 1526699215303891257L;
        this.i = 7436329637833083697L;
        this.j = -8163818279084223215L;
        this.k = -2662702644619276377L;
        this.l = 5167115440072839076L;
    }

    public eq9(eq9 eq9Var) {
        super(eq9Var);
    }
}
