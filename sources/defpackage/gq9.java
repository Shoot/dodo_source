package defpackage;
/* renamed from: gq9  reason: default package */
/* loaded from: classes3.dex */
public class gq9 extends ky5 {
    public gq9() {
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new gq9(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        k((gq9) sc6Var);
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
        mo7.s(this.k, bArr, i + 48);
        mo7.s(this.l, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 64;
    }

    @Override // defpackage.ky5, defpackage.e23
    public void reset() {
        super.reset();
        this.e = 7640891576956012808L;
        this.f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.j = -7276294671716946913L;
        this.k = 2270897969802886507L;
        this.l = 6620516959819538809L;
    }

    public gq9(gq9 gq9Var) {
        super(gq9Var);
    }
}
