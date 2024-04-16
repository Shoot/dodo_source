package defpackage;
/* compiled from: SelectDeliveryAddressModule_ProvideDeliveryLocationSuggestionsRouterFactory.java */
/* renamed from: k5a  reason: default package */
/* loaded from: classes2.dex */
public final class k5a implements no3<jz2> {
    private final as8<f63> a;

    public k5a(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static k5a a(as8<f63> as8Var) {
        return new k5a(as8Var);
    }

    public static jz2 c(f63 f63Var) {
        return (jz2) jh8.e(i5a.a.b(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jz2 get() {
        return c(this.a.get());
    }
}
