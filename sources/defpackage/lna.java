package defpackage;
/* renamed from: lna  reason: default package */
/* loaded from: classes3.dex */
public class lna implements nn3, sc6 {
    private mna a;

    public lna(int i, int i2) {
        this.a = new mna(i, i2);
        d(null);
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new lna(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        this.a.b(((lna) sc6Var).a);
    }

    public void d(pna pnaVar) {
        this.a.j(pnaVar);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        return this.a.g(bArr, i);
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "Skein-" + (this.a.h() * 8) + "-" + (this.a.i() * 8);
    }

    @Override // defpackage.nn3
    public int getByteLength() {
        return this.a.h();
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return this.a.i();
    }

    @Override // defpackage.e23
    public void reset() {
        this.a.n();
    }

    @Override // defpackage.e23
    public void update(byte b) {
        this.a.s(b);
    }

    public lna(lna lnaVar) {
        this.a = new mna(lnaVar.a);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        this.a.t(bArr, i, i2);
    }
}
