package defpackage;
/* compiled from: InfrastructureModule_ProvideCurrentLocaleProviderFactory.java */
/* renamed from: u15  reason: default package */
/* loaded from: classes3.dex */
public final class u15 implements no3<i32> {
    private final m15 a;
    private final as8<wl5> b;
    private final as8<jo> c;

    public u15(m15 m15Var, as8<wl5> as8Var, as8<jo> as8Var2) {
        this.a = m15Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static u15 a(m15 m15Var, as8<wl5> as8Var, as8<jo> as8Var2) {
        return new u15(m15Var, as8Var, as8Var2);
    }

    public static i32 c(m15 m15Var, wl5 wl5Var, jo joVar) {
        return (i32) jh8.e(m15Var.k(wl5Var, joVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i32 get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
