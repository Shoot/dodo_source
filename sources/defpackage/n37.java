package defpackage;
/* compiled from: NotificationsStatusInteractor_Factory.java */
/* renamed from: n37  reason: default package */
/* loaded from: classes.dex */
public final class n37 implements no3<m37> {
    private final as8<gc> a;
    private final as8<ci8> b;
    private final as8<k37> c;
    private final as8<kx1> d;
    private final as8<qx1> e;

    public n37(as8<gc> as8Var, as8<ci8> as8Var2, as8<k37> as8Var3, as8<kx1> as8Var4, as8<qx1> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static n37 a(as8<gc> as8Var, as8<ci8> as8Var2, as8<k37> as8Var3, as8<kx1> as8Var4, as8<qx1> as8Var5) {
        return new n37(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static m37 c(gc gcVar, ci8 ci8Var, k37 k37Var, kx1 kx1Var, qx1 qx1Var) {
        return new m37(gcVar, ci8Var, k37Var, kx1Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public m37 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
