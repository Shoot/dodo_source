package defpackage;
/* compiled from: CheckoutModule_ProvidePreferredOrderLocationServiceFactory.java */
/* renamed from: n51  reason: default package */
/* loaded from: classes3.dex */
public final class n51 implements no3<qi8> {
    private final as8<oi8> a;
    private final as8<e98> b;
    private final as8<dt5> c;

    public n51(as8<oi8> as8Var, as8<e98> as8Var2, as8<dt5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static n51 a(as8<oi8> as8Var, as8<e98> as8Var2, as8<dt5> as8Var3) {
        return new n51(as8Var, as8Var2, as8Var3);
    }

    public static qi8 c(oi8 oi8Var, e98 e98Var, dt5 dt5Var) {
        return (qi8) jh8.e(d51.a.i(oi8Var, e98Var, dt5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qi8 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
