package defpackage;
/* compiled from: FormElement.java */
/* renamed from: l54  reason: default package */
/* loaded from: classes3.dex */
public class l54 extends re3 {
    private final se3 k;

    public l54(g6b g6bVar, String str, hz hzVar) {
        super(g6bVar, str, hzVar);
        this.k = new se3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kz6
    public void L(kz6 kz6Var) {
        super.L(kz6Var);
        this.k.remove(kz6Var);
    }

    public l54 X0(re3 re3Var) {
        this.k.add(re3Var);
        return this;
    }

    @Override // defpackage.re3, defpackage.kz6
    /* renamed from: Y0 */
    public l54 m() {
        return (l54) super.m();
    }
}
