package defpackage;
/* compiled from: RemoteConfigInteractor_Factory.java */
/* renamed from: hd9  reason: default package */
/* loaded from: classes.dex */
public final class hd9 implements no3<gd9> {
    private final as8<hp> a;
    private final as8<ld9> b;
    private final as8<qx1> c;
    private final as8<kx1> d;

    public hd9(as8<hp> as8Var, as8<ld9> as8Var2, as8<qx1> as8Var3, as8<kx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static hd9 a(as8<hp> as8Var, as8<ld9> as8Var2, as8<qx1> as8Var3, as8<kx1> as8Var4) {
        return new hd9(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static gd9 c(hp hpVar, as8<ld9> as8Var, qx1 qx1Var, kx1 kx1Var) {
        return new gd9(hpVar, as8Var, qx1Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gd9 get() {
        return c(this.a.get(), this.b, this.c.get(), this.d.get());
    }
}
