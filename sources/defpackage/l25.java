package defpackage;
/* compiled from: InfrastructureModule_ProvideUrlValidatorFactory.java */
/* renamed from: l25  reason: default package */
/* loaded from: classes3.dex */
public final class l25 implements no3<aub> {
    private final m15 a;

    public l25(m15 m15Var) {
        this.a = m15Var;
    }

    public static l25 a(m15 m15Var) {
        return new l25(m15Var);
    }

    public static aub c(m15 m15Var) {
        return (aub) jh8.e(m15Var.B());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public aub get() {
        return c(this.a);
    }
}
