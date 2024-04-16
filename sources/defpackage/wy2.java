package defpackage;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideDeliveryLocationFactoryFactory.java */
/* renamed from: wy2  reason: default package */
/* loaded from: classes2.dex */
public final class wy2 implements no3<g91> {
    private final as8<ht4> a;
    private final as8<q9a> b;

    public wy2(as8<ht4> as8Var, as8<q9a> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static wy2 a(as8<ht4> as8Var, as8<q9a> as8Var2) {
        return new wy2(as8Var, as8Var2);
    }

    public static g91 c(ht4 ht4Var, q9a q9aVar) {
        return (g91) jh8.e(vy2.a.a(ht4Var, q9aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public g91 get() {
        return c(this.a.get(), this.b.get());
    }
}
