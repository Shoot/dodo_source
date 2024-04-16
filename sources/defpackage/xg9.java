package defpackage;
/* compiled from: RepositoryModule_ProvideCartServiceFactory.java */
/* renamed from: xg9  reason: default package */
/* loaded from: classes3.dex */
public final class xg9 implements no3<ko5> {
    private final tg9 a;
    private final as8<cs0> b;
    private final as8<fs0> c;
    private final as8<ija> d;
    private final as8<oq0> e;
    private final as8<bq> f;

    public xg9(tg9 tg9Var, as8<cs0> as8Var, as8<fs0> as8Var2, as8<ija> as8Var3, as8<oq0> as8Var4, as8<bq> as8Var5) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
    }

    public static xg9 a(tg9 tg9Var, as8<cs0> as8Var, as8<fs0> as8Var2, as8<ija> as8Var3, as8<oq0> as8Var4, as8<bq> as8Var5) {
        return new xg9(tg9Var, as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static ko5 c(tg9 tg9Var, cs0 cs0Var, fs0 fs0Var, ija ijaVar, oq0 oq0Var, bq bqVar) {
        return (ko5) jh8.e(tg9Var.d(cs0Var, fs0Var, ijaVar, oq0Var, bqVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ko5 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
