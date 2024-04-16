package defpackage;

import com.dodopizza.controlling.feature.fullscreenimage.presentation.FullscreenImagePresenter;
/* compiled from: FullscreenImageModule_ProvidePresenterFactory.java */
/* renamed from: d84  reason: default package */
/* loaded from: classes.dex */
public final class d84 implements no3<FullscreenImagePresenter> {
    private final as8<v74> a;
    private final as8<f63> b;

    public d84(as8<v74> as8Var, as8<f63> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static d84 a(as8<v74> as8Var, as8<f63> as8Var2) {
        return new d84(as8Var, as8Var2);
    }

    public static FullscreenImagePresenter c(v74 v74Var, f63 f63Var) {
        return (FullscreenImagePresenter) jh8.e(c84.a.a(v74Var, f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public FullscreenImagePresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
