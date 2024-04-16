package defpackage;

import ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter;
/* compiled from: LandingSMSInputModule_ProvideLandingSMSInputPresenterFactory.java */
/* renamed from: fl5  reason: default package */
/* loaded from: classes3.dex */
public final class fl5 implements no3<LandingSMSInputPresenter> {
    private final as8<String> a;
    private final as8<String> b;
    private final as8<String> c;
    private final as8<vfb> d;
    private final as8<bl5> e;
    private final as8<pl5> f;

    public fl5(as8<String> as8Var, as8<String> as8Var2, as8<String> as8Var3, as8<vfb> as8Var4, as8<bl5> as8Var5, as8<pl5> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static fl5 a(as8<String> as8Var, as8<String> as8Var2, as8<String> as8Var3, as8<vfb> as8Var4, as8<bl5> as8Var5, as8<pl5> as8Var6) {
        return new fl5(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static LandingSMSInputPresenter c(String str, String str2, String str3, vfb vfbVar, bl5 bl5Var, pl5 pl5Var) {
        return (LandingSMSInputPresenter) jh8.e(dl5.a.b(str, str2, str3, vfbVar, bl5Var, pl5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LandingSMSInputPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
