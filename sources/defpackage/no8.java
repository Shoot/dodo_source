package defpackage;

import com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter;
/* compiled from: ProfileSettingsPresenter_Factory.java */
/* renamed from: no8  reason: default package */
/* loaded from: classes2.dex */
public final class no8 implements no3<ProfileSettingsPresenter> {
    private final as8<f63> a;
    private final as8<lo8> b;
    private final as8<Cdo> c;
    private final as8<ps1> d;
    private final as8<h48> e;
    private final as8<jo> f;
    private final as8<mh0> g;
    private final as8<hq3> h;
    private final as8<gc> i;

    public no8(as8<f63> as8Var, as8<lo8> as8Var2, as8<Cdo> as8Var3, as8<ps1> as8Var4, as8<h48> as8Var5, as8<jo> as8Var6, as8<mh0> as8Var7, as8<hq3> as8Var8, as8<gc> as8Var9) {
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

    public static no8 a(as8<f63> as8Var, as8<lo8> as8Var2, as8<Cdo> as8Var3, as8<ps1> as8Var4, as8<h48> as8Var5, as8<jo> as8Var6, as8<mh0> as8Var7, as8<hq3> as8Var8, as8<gc> as8Var9) {
        return new no8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static ProfileSettingsPresenter c(f63 f63Var, lo8 lo8Var, Cdo cdo, ps1 ps1Var, as8<h48> as8Var, jo joVar, mh0 mh0Var, hq3 hq3Var, gc gcVar) {
        return new ProfileSettingsPresenter(f63Var, lo8Var, cdo, ps1Var, as8Var, joVar, mh0Var, hq3Var, gcVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ProfileSettingsPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e, this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
