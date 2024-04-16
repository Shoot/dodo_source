package defpackage;

import com.dodopizza.profile.feature.profilelocalelist.presentation.ProfileLocaleListPresenter;
/* compiled from: ProfileLocaleListPresenter_Factory.java */
/* renamed from: tn8  reason: default package */
/* loaded from: classes2.dex */
public final class tn8 implements no3<ProfileLocaleListPresenter> {
    private final as8<qn8> a;
    private final as8<Cdo> b;
    private final as8<gc> c;
    private final as8<f63> d;

    public tn8(as8<qn8> as8Var, as8<Cdo> as8Var2, as8<gc> as8Var3, as8<f63> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static tn8 a(as8<qn8> as8Var, as8<Cdo> as8Var2, as8<gc> as8Var3, as8<f63> as8Var4) {
        return new tn8(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ProfileLocaleListPresenter c(qn8 qn8Var, Cdo cdo, gc gcVar, f63 f63Var) {
        return new ProfileLocaleListPresenter(qn8Var, cdo, gcVar, f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ProfileLocaleListPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
