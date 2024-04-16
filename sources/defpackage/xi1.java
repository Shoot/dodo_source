package defpackage;

import defpackage.ym;
import ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter;
/* compiled from: ComboTemplateModule_ProvideComboTemplatePresenterFactory.java */
/* renamed from: xi1  reason: default package */
/* loaded from: classes3.dex */
public final class xi1 implements no3<ComboTemplateConstructorPresenter> {
    private final as8<String> a;
    private final as8<Integer> b;
    private final as8<String> c;
    private final as8<ym.d> d;
    private final as8<qi1> e;
    private final as8<ah1> f;
    private final as8<gc> g;

    public xi1(as8<String> as8Var, as8<Integer> as8Var2, as8<String> as8Var3, as8<ym.d> as8Var4, as8<qi1> as8Var5, as8<ah1> as8Var6, as8<gc> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static xi1 a(as8<String> as8Var, as8<Integer> as8Var2, as8<String> as8Var3, as8<ym.d> as8Var4, as8<qi1> as8Var5, as8<ah1> as8Var6, as8<gc> as8Var7) {
        return new xi1(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static ComboTemplateConstructorPresenter c(String str, int i, String str2, ym.d dVar, qi1 qi1Var, ah1 ah1Var, gc gcVar) {
        return (ComboTemplateConstructorPresenter) jh8.e(ui1.a.c(str, i, str2, dVar, qi1Var, ah1Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ComboTemplateConstructorPresenter get() {
        return c(this.a.get(), this.b.get().intValue(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
