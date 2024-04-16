package defpackage;
/* compiled from: PaymentModule_ProvidePaymentWayServiceFactory.java */
/* renamed from: qv7  reason: default package */
/* loaded from: classes3.dex */
public final class qv7 implements no3<tw7> {
    private final as8<qw7> a;
    private final as8<sp0> b;
    private final as8<dh4> c;
    private final as8<kw7> d;
    private final as8<ut9> e;
    private final as8<rm> f;
    private final as8<Boolean> g;

    public qv7(as8<qw7> as8Var, as8<sp0> as8Var2, as8<dh4> as8Var3, as8<kw7> as8Var4, as8<ut9> as8Var5, as8<rm> as8Var6, as8<Boolean> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static qv7 a(as8<qw7> as8Var, as8<sp0> as8Var2, as8<dh4> as8Var3, as8<kw7> as8Var4, as8<ut9> as8Var5, as8<rm> as8Var6, as8<Boolean> as8Var7) {
        return new qv7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static tw7 c(qw7 qw7Var, sp0 sp0Var, dh4 dh4Var, kw7 kw7Var, ut9 ut9Var, rm rmVar, boolean z) {
        return (tw7) jh8.e(gu7.a.J(qw7Var, sp0Var, dh4Var, kw7Var, ut9Var, rmVar, z));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tw7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get().booleanValue());
    }
}
