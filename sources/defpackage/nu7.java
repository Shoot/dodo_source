package defpackage;
/* compiled from: PaymentModule_ProvideCardRepositoryFactory.java */
/* renamed from: nu7  reason: default package */
/* loaded from: classes3.dex */
public final class nu7 implements no3<sp0> {
    private final as8<jk2> a;

    public nu7(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static nu7 a(as8<jk2> as8Var) {
        return new nu7(as8Var);
    }

    public static sp0 c(jk2 jk2Var) {
        return (sp0) jh8.e(gu7.a.g(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sp0 get() {
        return c(this.a.get());
    }
}
