package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.country.CountryApi;
/* compiled from: CountryService_Factory.java */
/* renamed from: xy1  reason: default package */
/* loaded from: classes4.dex */
public final class xy1 implements no3<CountryService> {
    private final as8<CountryApi> a;
    private final as8<by1> b;
    private final as8<ry1> c;
    private final as8<c63> d;
    private final as8<iy1> e;
    private final as8<ly1> f;
    private final as8<mh0> g;

    public xy1(as8<CountryApi> as8Var, as8<by1> as8Var2, as8<ry1> as8Var3, as8<c63> as8Var4, as8<iy1> as8Var5, as8<ly1> as8Var6, as8<mh0> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static xy1 a(as8<CountryApi> as8Var, as8<by1> as8Var2, as8<ry1> as8Var3, as8<c63> as8Var4, as8<iy1> as8Var5, as8<ly1> as8Var6, as8<mh0> as8Var7) {
        return new xy1(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static CountryService c(as8<CountryApi> as8Var, by1 by1Var, ry1 ry1Var, c63 c63Var, iy1 iy1Var, ly1 ly1Var, mh0 mh0Var) {
        return new CountryService(as8Var, by1Var, ry1Var, c63Var, iy1Var, ly1Var, mh0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CountryService get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
