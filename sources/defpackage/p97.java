package defpackage;
/* compiled from: OnboardingModule_ProvideDeliveryLocationSuggestionsRouterFactory.java */
/* renamed from: p97  reason: default package */
/* loaded from: classes3.dex */
public final class p97 implements no3<jz2> {
    private final as8<f63> a;

    public p97(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static p97 a(as8<f63> as8Var) {
        return new p97(as8Var);
    }

    public static jz2 c(f63 f63Var) {
        return (jz2) jh8.e(m97.a.c(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jz2 get() {
        return c(this.a.get());
    }
}
