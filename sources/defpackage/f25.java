package defpackage;
/* compiled from: InfrastructureModule_ProvideSharedTracesFactory.java */
/* renamed from: f25  reason: default package */
/* loaded from: classes3.dex */
public final class f25 implements no3<bia> {
    private final m15 a;
    private final as8<vjb> b;

    public f25(m15 m15Var, as8<vjb> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static f25 a(m15 m15Var, as8<vjb> as8Var) {
        return new f25(m15Var, as8Var);
    }

    public static bia c(m15 m15Var, vjb vjbVar) {
        return (bia) jh8.e(m15Var.v(vjbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bia get() {
        return c(this.a, this.b.get());
    }
}
