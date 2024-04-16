package defpackage;
/* compiled from: EasyBonusModule_ProvideEasyBonusInteractorFactory.java */
/* renamed from: cc3  reason: default package */
/* loaded from: classes3.dex */
public final class cc3 implements no3<zb3> {
    private final as8<f8c> a;
    private final as8<ec3> b;

    public cc3(as8<f8c> as8Var, as8<ec3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static cc3 a(as8<f8c> as8Var, as8<ec3> as8Var2) {
        return new cc3(as8Var, as8Var2);
    }

    public static zb3 c(f8c f8cVar, ec3 ec3Var) {
        return (zb3) jh8.e(ac3.a.b(f8cVar, ec3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zb3 get() {
        return c(this.a.get(), this.b.get());
    }
}
