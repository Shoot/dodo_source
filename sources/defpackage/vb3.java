package defpackage;
/* compiled from: ECommPayApiBuilderFactory_Factory.java */
/* renamed from: vb3  reason: default package */
/* loaded from: classes2.dex */
public final class vb3 implements no3<ub3> {
    private final as8<rn2> a;

    public vb3(as8<rn2> as8Var) {
        this.a = as8Var;
    }

    public static vb3 a(as8<rn2> as8Var) {
        return new vb3(as8Var);
    }

    public static ub3 c(rn2 rn2Var) {
        return new ub3(rn2Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ub3 get() {
        return c(this.a.get());
    }
}
