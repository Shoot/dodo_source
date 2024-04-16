package defpackage;
/* compiled from: AssistantWelcomeDataInteractor_Factory.java */
/* renamed from: pw  reason: default package */
/* loaded from: classes4.dex */
public final class pw implements no3<ow> {
    private final as8<ah6> a;
    private final as8<i00> b;
    private final as8<t52> c;
    private final as8<f8c> d;

    public pw(as8<ah6> as8Var, as8<i00> as8Var2, as8<t52> as8Var3, as8<f8c> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static pw a(as8<ah6> as8Var, as8<i00> as8Var2, as8<t52> as8Var3, as8<f8c> as8Var4) {
        return new pw(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ow c(ah6 ah6Var, i00 i00Var, t52 t52Var, f8c f8cVar) {
        return new ow(ah6Var, i00Var, t52Var, f8cVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ow get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
