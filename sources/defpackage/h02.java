package defpackage;
/* compiled from: CovidWarningModule_ProvideInteractorFactory.java */
/* renamed from: h02  reason: default package */
/* loaded from: classes3.dex */
public final class h02 implements no3<e02> {
    private final as8<yz1> a;

    public h02(as8<yz1> as8Var) {
        this.a = as8Var;
    }

    public static h02 a(as8<yz1> as8Var) {
        return new h02(as8Var);
    }

    public static e02 c(yz1 yz1Var) {
        return (e02) jh8.e(g02.a.a(yz1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e02 get() {
        return c(this.a.get());
    }
}
