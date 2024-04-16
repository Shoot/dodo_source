package defpackage;

import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
/* compiled from: AuthorizationService_Factory.java */
/* renamed from: h00  reason: default package */
/* loaded from: classes4.dex */
public final class h00 implements no3<g00> {
    private final as8<AuthorizationAPI> a;
    private final as8<b00> b;
    private final as8<gc> c;
    private final as8<pq> d;
    private final as8<e00> e;
    private final as8<k63> f;

    public h00(as8<AuthorizationAPI> as8Var, as8<b00> as8Var2, as8<gc> as8Var3, as8<pq> as8Var4, as8<e00> as8Var5, as8<k63> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static h00 a(as8<AuthorizationAPI> as8Var, as8<b00> as8Var2, as8<gc> as8Var3, as8<pq> as8Var4, as8<e00> as8Var5, as8<k63> as8Var6) {
        return new h00(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static g00 c(as8<AuthorizationAPI> as8Var, b00 b00Var, gc gcVar, pq pqVar, e00 e00Var, k63 k63Var) {
        return new g00(as8Var, b00Var, gcVar, pqVar, e00Var, k63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public g00 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
