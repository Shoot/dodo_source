package defpackage;

import defpackage.ym;
import kotlin.Pair;
import ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter;
/* compiled from: HalvesProductCardModule_ProvideHalvesProductCardPresenterFactory.java */
/* renamed from: tl4  reason: default package */
/* loaded from: classes3.dex */
public final class tl4 implements no3<HalvesProductCardPresenter> {
    private final as8<Pair<String, String>> a;
    private final as8<ym.d> b;
    private final as8<String> c;
    private final as8<ql4> d;
    private final as8<f63> e;

    public tl4(as8<Pair<String, String>> as8Var, as8<ym.d> as8Var2, as8<String> as8Var3, as8<ql4> as8Var4, as8<f63> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static tl4 a(as8<Pair<String, String>> as8Var, as8<ym.d> as8Var2, as8<String> as8Var3, as8<ql4> as8Var4, as8<f63> as8Var5) {
        return new tl4(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static HalvesProductCardPresenter c(Pair<String, String> pair, ym.d dVar, String str, ql4 ql4Var, f63 f63Var) {
        return (HalvesProductCardPresenter) jh8.e(rl4.a.b(pair, dVar, str, ql4Var, f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public HalvesProductCardPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
