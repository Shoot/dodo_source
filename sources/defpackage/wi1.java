package defpackage;
/* compiled from: ComboTemplateModule_ProvideComboTemplateInteractorFactory.java */
/* renamed from: wi1  reason: default package */
/* loaded from: classes3.dex */
public final class wi1 implements no3<qi1> {
    private final as8<ah6> a;
    private final as8<c62> b;
    private final as8<mxa> c;
    private final as8<gp4> d;
    private final as8<hq3> e;

    public wi1(as8<ah6> as8Var, as8<c62> as8Var2, as8<mxa> as8Var3, as8<gp4> as8Var4, as8<hq3> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static wi1 a(as8<ah6> as8Var, as8<c62> as8Var2, as8<mxa> as8Var3, as8<gp4> as8Var4, as8<hq3> as8Var5) {
        return new wi1(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static qi1 c(ah6 ah6Var, c62 c62Var, mxa mxaVar, gp4 gp4Var, hq3 hq3Var) {
        return (qi1) jh8.e(ui1.a.b(ah6Var, c62Var, mxaVar, gp4Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qi1 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
