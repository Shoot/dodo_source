package defpackage;
/* compiled from: OrderTypeSwitcherModule_ProvideSuggestionAddressProviderFactory.java */
/* renamed from: pl7  reason: default package */
/* loaded from: classes3.dex */
public final class pl7 implements no3<x1b> {
    private final as8<pu2> a;

    public pl7(as8<pu2> as8Var) {
        this.a = as8Var;
    }

    public static pl7 a(as8<pu2> as8Var) {
        return new pl7(as8Var);
    }

    public static x1b c(pu2 pu2Var) {
        return (x1b) jh8.e(ll7.a.d(pu2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public x1b get() {
        return c(this.a.get());
    }
}
