package defpackage;
/* compiled from: CheckoutModule_ProvideOrderTypeConverterFactory.java */
/* renamed from: l51  reason: default package */
/* loaded from: classes3.dex */
public final class l51 implements no3<mk7> {
    private final as8<x42> a;

    public l51(as8<x42> as8Var) {
        this.a = as8Var;
    }

    public static l51 a(as8<x42> as8Var) {
        return new l51(as8Var);
    }

    public static mk7 c(x42 x42Var) {
        return (mk7) jh8.e(d51.a.g(x42Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mk7 get() {
        return c(this.a.get());
    }
}
