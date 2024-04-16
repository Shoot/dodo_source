package defpackage;
/* compiled from: OrderRatingModule_ProvideOrderRatingInteractorFactory.java */
/* renamed from: qh7  reason: default package */
/* loaded from: classes.dex */
public final class qh7 implements no3<mh7> {
    private final as8<o69> a;
    private final as8<li7> b;
    private final as8<k69> c;
    private final as8<x49> d;
    private final as8<eb0> e;
    private final as8<ah7> f;

    public qh7(as8<o69> as8Var, as8<li7> as8Var2, as8<k69> as8Var3, as8<x49> as8Var4, as8<eb0> as8Var5, as8<ah7> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static qh7 a(as8<o69> as8Var, as8<li7> as8Var2, as8<k69> as8Var3, as8<x49> as8Var4, as8<eb0> as8Var5, as8<ah7> as8Var6) {
        return new qh7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static mh7 c(o69 o69Var, li7 li7Var, k69 k69Var, x49 x49Var, eb0 eb0Var, ah7 ah7Var) {
        return (mh7) jh8.e(nh7.a.c(o69Var, li7Var, k69Var, x49Var, eb0Var, ah7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mh7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
