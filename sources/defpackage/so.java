package defpackage;

import com.dodopizza.onboarding.feature.apprestartapprove.presentation.AppRestartApprovePresenter;
/* compiled from: AppRestartApprovePresenter_Factory.java */
/* renamed from: so  reason: default package */
/* loaded from: classes2.dex */
public final class so implements no3<AppRestartApprovePresenter> {
    private final as8<no> a;
    private final as8<f63> b;

    public so(as8<no> as8Var, as8<f63> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static so a(as8<no> as8Var, as8<f63> as8Var2) {
        return new so(as8Var, as8Var2);
    }

    public static AppRestartApprovePresenter c(no noVar, f63 f63Var) {
        return new AppRestartApprovePresenter(noVar, f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AppRestartApprovePresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
