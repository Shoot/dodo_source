package defpackage;
/* compiled from: LiveActivityInteractor_Factory.java */
/* renamed from: qr5  reason: default package */
/* loaded from: classes.dex */
public final class qr5 implements no3<pr5> {
    private final as8<xda> a;
    private final as8<kx1> b;
    private final as8<qx1> c;

    public qr5(as8<xda> as8Var, as8<kx1> as8Var2, as8<qx1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static qr5 a(as8<xda> as8Var, as8<kx1> as8Var2, as8<qx1> as8Var3) {
        return new qr5(as8Var, as8Var2, as8Var3);
    }

    public static pr5 c(xda xdaVar, kx1 kx1Var, qx1 qx1Var) {
        return new pr5(xdaVar, kx1Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pr5 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
