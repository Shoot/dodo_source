package defpackage;

import defpackage.pna;
/* renamed from: nna  reason: default package */
/* loaded from: classes3.dex */
public class nna implements x36 {
    private mna a;

    public nna(int i, int i2) {
        this.a = new mna(i, i2);
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        return this.a.g(bArr, i);
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return "Skein-MAC-" + (this.a.h() * 8) + "-" + (this.a.i() * 8);
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.a.i();
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) throws IllegalArgumentException {
        pna a;
        if (v71Var instanceof pna) {
            a = (pna) v71Var;
        } else if (v71Var instanceof lf5) {
            a = new pna.b().c(((lf5) v71Var).a()).a();
        } else {
            throw new IllegalArgumentException("Invalid parameter passed to Skein MAC init - " + v71Var.getClass().getName());
        }
        if (a.a() != null) {
            this.a.j(a);
            return;
        }
        throw new IllegalArgumentException("Skein MAC requires a key parameter.");
    }

    @Override // defpackage.x36
    public void reset() {
        this.a.n();
    }

    @Override // defpackage.x36
    public void update(byte b) {
        this.a.s(b);
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) {
        this.a.t(bArr, i, i2);
    }
}
