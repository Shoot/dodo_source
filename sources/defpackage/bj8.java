package defpackage;
/* compiled from: PresenterModule_ProvideRefreshInteractorFactory.java */
/* renamed from: bj8  reason: default package */
/* loaded from: classes3.dex */
public final class bj8 implements no3<wg6> {
    private final as8<vc6> a;
    private final as8<ava> b;
    private final as8<v53> c;
    private final as8<dua> d;
    private final as8<eh6> e;
    private final as8<qx1> f;

    public bj8(as8<vc6> as8Var, as8<ava> as8Var2, as8<v53> as8Var3, as8<dua> as8Var4, as8<eh6> as8Var5, as8<qx1> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static bj8 a(as8<vc6> as8Var, as8<ava> as8Var2, as8<v53> as8Var3, as8<dua> as8Var4, as8<eh6> as8Var5, as8<qx1> as8Var6) {
        return new bj8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static wg6 c(vc6 vc6Var, ava avaVar, v53 v53Var, dua duaVar, eh6 eh6Var, qx1 qx1Var) {
        return (wg6) jh8.e(aj8.a.a(vc6Var, avaVar, v53Var, duaVar, eh6Var, qx1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wg6 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
