package defpackage;
/* compiled from: InfrastructureModule_ProvideIoDispatcherFactory.java */
/* renamed from: y15  reason: default package */
/* loaded from: classes3.dex */
public final class y15 implements no3<kx1> {
    private final m15 a;

    public y15(m15 m15Var) {
        this.a = m15Var;
    }

    public static y15 a(m15 m15Var) {
        return new y15(m15Var);
    }

    public static kx1 c(m15 m15Var) {
        return (kx1) jh8.e(m15Var.o());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kx1 get() {
        return c(this.a);
    }
}
