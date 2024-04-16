package defpackage;
/* compiled from: ShowLimiterModule_ProviderShowLimiterFactory.java */
/* renamed from: cka  reason: default package */
/* loaded from: classes3.dex */
public final class cka implements no3<zja> {
    private final as8<ml0> a;

    public cka(as8<ml0> as8Var) {
        this.a = as8Var;
    }

    public static cka a(as8<ml0> as8Var) {
        return new cka(as8Var);
    }

    public static zja c(ml0 ml0Var) {
        return (zja) jh8.e(bka.a.a(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zja get() {
        return c(this.a.get());
    }
}
