package defpackage;
/* compiled from: OnboardingModule_ProvideRoutersContainerFactory.java */
/* renamed from: u97  reason: default package */
/* loaded from: classes3.dex */
public final class u97 implements no3<yo9> {
    private final as8<f63> a;
    private final as8<f63> b;

    public u97(as8<f63> as8Var, as8<f63> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static u97 a(as8<f63> as8Var, as8<f63> as8Var2) {
        return new u97(as8Var, as8Var2);
    }

    public static yo9 c(f63 f63Var, f63 f63Var2) {
        return (yo9) jh8.e(m97.a.h(f63Var, f63Var2));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yo9 get() {
        return c(this.a.get(), this.b.get());
    }
}
