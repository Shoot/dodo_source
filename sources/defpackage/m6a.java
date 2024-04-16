package defpackage;
/* compiled from: SelectLocationServiceImpl_Factory.java */
/* renamed from: m6a  reason: default package */
/* loaded from: classes4.dex */
public final class m6a implements no3<l6a> {
    private final as8<ev0> a;
    private final as8<bv0> b;
    private final as8<kfa> c;
    private final as8<lh8> d;
    private final as8<wl5> e;
    private final as8<ny1> f;
    private final as8<f8c> g;

    public m6a(as8<ev0> as8Var, as8<bv0> as8Var2, as8<kfa> as8Var3, as8<lh8> as8Var4, as8<wl5> as8Var5, as8<ny1> as8Var6, as8<f8c> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static m6a a(as8<ev0> as8Var, as8<bv0> as8Var2, as8<kfa> as8Var3, as8<lh8> as8Var4, as8<wl5> as8Var5, as8<ny1> as8Var6, as8<f8c> as8Var7) {
        return new m6a(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static l6a c(ev0 ev0Var, bv0 bv0Var, kfa kfaVar, lh8 lh8Var, wl5 wl5Var, ny1 ny1Var, f8c f8cVar) {
        return new l6a(ev0Var, bv0Var, kfaVar, lh8Var, wl5Var, ny1Var, f8cVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public l6a get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
