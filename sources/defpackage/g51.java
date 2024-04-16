package defpackage;
/* compiled from: CheckoutModule_ProvideCheckoutInfoConverterFactory.java */
/* renamed from: g51  reason: default package */
/* loaded from: classes3.dex */
public final class g51 implements no3<b51> {
    private final as8<pgb> a;

    public g51(as8<pgb> as8Var) {
        this.a = as8Var;
    }

    public static g51 a(as8<pgb> as8Var) {
        return new g51(as8Var);
    }

    public static b51 c(pgb pgbVar) {
        return (b51) jh8.e(d51.a.c(pgbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b51 get() {
        return c(this.a.get());
    }
}
