package defpackage;
/* compiled from: AssistantGeneratorInteractor_Factory.java */
/* renamed from: kt  reason: default package */
/* loaded from: classes2.dex */
public final class kt implements no3<jt> {
    private final as8<et> a;
    private final as8<eu> b;
    private final as8<hq3> c;
    private final as8<kx1> d;

    public kt(as8<et> as8Var, as8<eu> as8Var2, as8<hq3> as8Var3, as8<kx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static kt a(as8<et> as8Var, as8<eu> as8Var2, as8<hq3> as8Var3, as8<kx1> as8Var4) {
        return new kt(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static jt c(et etVar, eu euVar, hq3 hq3Var, kx1 kx1Var) {
        return new jt(etVar, euVar, hq3Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jt get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
