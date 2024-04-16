package defpackage;
/* compiled from: InfrastructureModule_ProvideLanguageServiceFactory.java */
/* renamed from: b25  reason: default package */
/* loaded from: classes3.dex */
public final class b25 implements no3<wl5> {
    private final m15 a;
    private final as8<ci8> b;

    public b25(m15 m15Var, as8<ci8> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static b25 a(m15 m15Var, as8<ci8> as8Var) {
        return new b25(m15Var, as8Var);
    }

    public static wl5 c(m15 m15Var, ci8 ci8Var) {
        return (wl5) jh8.e(m15Var.r(ci8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wl5 get() {
        return c(this.a, this.b.get());
    }
}
