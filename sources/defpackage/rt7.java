package defpackage;
/* compiled from: PaymentMethodListModule_ProvidePaymentMethodListInteractorFactory.java */
/* renamed from: rt7  reason: default package */
/* loaded from: classes3.dex */
public final class rt7 implements no3<ot7> {
    private final as8<t41> a;
    private final as8<ew7> b;
    private final as8<t52> c;
    private final as8<z7b> d;
    private final as8<gc> e;
    private final as8<vg7> f;

    public rt7(as8<t41> as8Var, as8<ew7> as8Var2, as8<t52> as8Var3, as8<z7b> as8Var4, as8<gc> as8Var5, as8<vg7> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static rt7 a(as8<t41> as8Var, as8<ew7> as8Var2, as8<t52> as8Var3, as8<z7b> as8Var4, as8<gc> as8Var5, as8<vg7> as8Var6) {
        return new rt7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static ot7 c(t41 t41Var, ew7 ew7Var, t52 t52Var, z7b z7bVar, gc gcVar, vg7 vg7Var) {
        return (ot7) jh8.e(qt7.a.a(t41Var, ew7Var, t52Var, z7bVar, gcVar, vg7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ot7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
