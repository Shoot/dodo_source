package defpackage;

import com.dodopizza.onboarding.feature.chooseordertype.presentation.a;
/* compiled from: OnboardingModule_ProvideChooseOrderTypeRouterFactory.java */
/* renamed from: o97  reason: default package */
/* loaded from: classes3.dex */
public final class o97 implements no3<a> {
    private final as8<yo9> a;
    private final as8<hq3> b;
    private final as8<ih4> c;

    public o97(as8<yo9> as8Var, as8<hq3> as8Var2, as8<ih4> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static o97 a(as8<yo9> as8Var, as8<hq3> as8Var2, as8<ih4> as8Var3) {
        return new o97(as8Var, as8Var2, as8Var3);
    }

    public static a c(yo9 yo9Var, hq3 hq3Var, ih4 ih4Var) {
        return (a) jh8.e(m97.a.b(yo9Var, hq3Var, ih4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
