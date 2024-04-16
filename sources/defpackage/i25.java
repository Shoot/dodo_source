package defpackage;
/* compiled from: InfrastructureModule_ProvideTimeRounderFactory.java */
/* renamed from: i25  reason: default package */
/* loaded from: classes3.dex */
public final class i25 implements no3<sgb> {
    private final m15 a;

    public i25(m15 m15Var) {
        this.a = m15Var;
    }

    public static i25 a(m15 m15Var) {
        return new i25(m15Var);
    }

    public static sgb c(m15 m15Var) {
        return (sgb) jh8.e(m15Var.y());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sgb get() {
        return c(this.a);
    }
}
