package defpackage;
/* compiled from: BaseUrlService_Factory.java */
/* renamed from: t80  reason: default package */
/* loaded from: classes.dex */
public final class t80 implements no3<s80> {
    private final as8<mh0> a;
    private final as8<q80> b;
    private final as8<xj3> c;

    public t80(as8<mh0> as8Var, as8<q80> as8Var2, as8<xj3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static t80 a(as8<mh0> as8Var, as8<q80> as8Var2, as8<xj3> as8Var3) {
        return new t80(as8Var, as8Var2, as8Var3);
    }

    public static s80 c(mh0 mh0Var, q80 q80Var, xj3 xj3Var) {
        return new s80(mh0Var, q80Var, xj3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public s80 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
