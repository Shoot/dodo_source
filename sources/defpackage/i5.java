package defpackage;
/* compiled from: ActiveOrderFoodMenuInteractorImpl_Factory.java */
/* renamed from: i5  reason: default package */
/* loaded from: classes.dex */
public final class i5 implements no3<h5> {
    private final as8<li7> a;
    private final as8<b5> b;
    private final as8<kx1> c;

    public i5(as8<li7> as8Var, as8<b5> as8Var2, as8<kx1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static i5 a(as8<li7> as8Var, as8<b5> as8Var2, as8<kx1> as8Var3) {
        return new i5(as8Var, as8Var2, as8Var3);
    }

    public static h5 c(li7 li7Var, b5 b5Var, kx1 kx1Var) {
        return new h5(li7Var, b5Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h5 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
