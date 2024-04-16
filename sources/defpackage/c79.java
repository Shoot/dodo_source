package defpackage;

import ru.dodopizza.app.presentation.main.a;
/* compiled from: RawDeepLinksProcessor_Factory.java */
/* renamed from: c79  reason: default package */
/* loaded from: classes4.dex */
public final class c79 implements no3<a> {
    private final as8<gc> a;
    private final as8<y69> b;
    private final as8<bv0> c;
    private final as8<ok6> d;
    private final as8<n07> e;
    private final as8<qx1> f;
    private final as8<kx1> g;

    public c79(as8<gc> as8Var, as8<y69> as8Var2, as8<bv0> as8Var3, as8<ok6> as8Var4, as8<n07> as8Var5, as8<qx1> as8Var6, as8<kx1> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static c79 a(as8<gc> as8Var, as8<y69> as8Var2, as8<bv0> as8Var3, as8<ok6> as8Var4, as8<n07> as8Var5, as8<qx1> as8Var6, as8<kx1> as8Var7) {
        return new c79(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static a c(gc gcVar, y69 y69Var, bv0 bv0Var, ok6 ok6Var, n07 n07Var, qx1 qx1Var, kx1 kx1Var) {
        return new a(gcVar, y69Var, bv0Var, ok6Var, n07Var, qx1Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
