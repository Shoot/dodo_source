package defpackage;

import defpackage.ym;
import ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter;
/* compiled from: SnackProductCardModule_ProvidePresenterFactory.java */
/* renamed from: moa  reason: default package */
/* loaded from: classes3.dex */
public final class moa implements no3<SnackProductCardPresenter> {
    private final as8<String> a;
    private final as8<String> b;
    private final as8<ym.d> c;
    private final as8<koa> d;
    private final as8<f63> e;
    private final as8<f5b> f;
    private final as8<t18> g;

    public moa(as8<String> as8Var, as8<String> as8Var2, as8<ym.d> as8Var3, as8<koa> as8Var4, as8<f63> as8Var5, as8<f5b> as8Var6, as8<t18> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static moa a(as8<String> as8Var, as8<String> as8Var2, as8<ym.d> as8Var3, as8<koa> as8Var4, as8<f63> as8Var5, as8<f5b> as8Var6, as8<t18> as8Var7) {
        return new moa(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static SnackProductCardPresenter c(String str, String str2, ym.d dVar, koa koaVar, f63 f63Var, f5b f5bVar, t18 t18Var) {
        return (SnackProductCardPresenter) jh8.e(loa.a.a(str, str2, dVar, koaVar, f63Var, f5bVar, t18Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SnackProductCardPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
