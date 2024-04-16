package defpackage;

import com.dodopizza.onboarding.feature.selectcountry.presentation.SelectCountryPresenter;
/* compiled from: SelectCountryPresenter_Factory.java */
/* renamed from: x4a  reason: default package */
/* loaded from: classes2.dex */
public final class x4a implements no3<SelectCountryPresenter> {
    private final as8<n4a> a;
    private final as8<y4a> b;
    private final as8<r4a> c;

    public x4a(as8<n4a> as8Var, as8<y4a> as8Var2, as8<r4a> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static x4a a(as8<n4a> as8Var, as8<y4a> as8Var2, as8<r4a> as8Var3) {
        return new x4a(as8Var, as8Var2, as8Var3);
    }

    public static SelectCountryPresenter c(n4a n4aVar, y4a y4aVar, r4a r4aVar) {
        return new SelectCountryPresenter(n4aVar, y4aVar, r4aVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SelectCountryPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
