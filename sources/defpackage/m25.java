package defpackage;
/* compiled from: InfrastructureModule_ProvideVpnCheckerFactory.java */
/* renamed from: m25  reason: default package */
/* loaded from: classes3.dex */
public final class m25 implements no3<j2c> {
    private final m15 a;

    public m25(m15 m15Var) {
        this.a = m15Var;
    }

    public static m25 a(m15 m15Var) {
        return new m25(m15Var);
    }

    public static j2c c(m15 m15Var) {
        return (j2c) jh8.e(m15Var.C());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public j2c get() {
        return c(this.a);
    }
}
