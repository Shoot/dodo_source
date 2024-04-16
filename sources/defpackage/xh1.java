package defpackage;

import defpackage.ym;
import ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter;
import ru.dodopizza.app.presentation.product.card.combo.b;
/* compiled from: ComboProductCardModule_ProvideComboCardPresenterFactory.java */
/* renamed from: xh1  reason: default package */
/* loaded from: classes3.dex */
public final class xh1 implements no3<ComboProductCardPresenter> {
    private final as8<String> a;
    private final as8<String> b;
    private final as8<ym.d> c;
    private final as8<hq3> d;
    private final as8<b> e;
    private final as8<ah1> f;
    private final as8<ti0> g;
    private final as8<f63> h;
    private final as8<jn6> i;

    public xh1(as8<String> as8Var, as8<String> as8Var2, as8<ym.d> as8Var3, as8<hq3> as8Var4, as8<b> as8Var5, as8<ah1> as8Var6, as8<ti0> as8Var7, as8<f63> as8Var8, as8<jn6> as8Var9) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
    }

    public static xh1 a(as8<String> as8Var, as8<String> as8Var2, as8<ym.d> as8Var3, as8<hq3> as8Var4, as8<b> as8Var5, as8<ah1> as8Var6, as8<ti0> as8Var7, as8<f63> as8Var8, as8<jn6> as8Var9) {
        return new xh1(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static ComboProductCardPresenter c(String str, String str2, ym.d dVar, hq3 hq3Var, b bVar, ah1 ah1Var, ti0 ti0Var, f63 f63Var, jn6 jn6Var) {
        return (ComboProductCardPresenter) jh8.e(vh1.a.b(str, str2, dVar, hq3Var, bVar, ah1Var, ti0Var, f63Var, jn6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ComboProductCardPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
