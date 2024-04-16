package defpackage;
/* compiled from: AppInitializer_Factory.java */
/* renamed from: eo  reason: default package */
/* loaded from: classes.dex */
public final class eo implements no3<Cdo> {
    private final as8<n80> a;
    private final as8<nd0> b;
    private final as8<hp> c;
    private final as8<qx1> d;

    public eo(as8<n80> as8Var, as8<nd0> as8Var2, as8<hp> as8Var3, as8<qx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static eo a(as8<n80> as8Var, as8<nd0> as8Var2, as8<hp> as8Var3, as8<qx1> as8Var4) {
        return new eo(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static Cdo c(as8<n80> as8Var, as8<nd0> as8Var2, hp hpVar, qx1 qx1Var) {
        return new Cdo(as8Var, as8Var2, hpVar, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public Cdo get() {
        return c(this.a, this.b, this.c.get(), this.d.get());
    }
}
