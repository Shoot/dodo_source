package defpackage;

import com.dodopizza.feature.webinfo.presentation.WebInfoPresenter;
import com.dodopizza.feature.webinfo.presentation.a;
/* compiled from: WebInfoModule_ProvideWebInfoPresenterFactory.java */
/* renamed from: k3c  reason: default package */
/* loaded from: classes.dex */
public final class k3c implements no3<WebInfoPresenter> {
    private final as8<a> a;
    private final as8<f63> b;
    private final as8<gc> c;

    public k3c(as8<a> as8Var, as8<f63> as8Var2, as8<gc> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static k3c a(as8<a> as8Var, as8<f63> as8Var2, as8<gc> as8Var3) {
        return new k3c(as8Var, as8Var2, as8Var3);
    }

    public static WebInfoPresenter c(a aVar, f63 f63Var, gc gcVar) {
        return (WebInfoPresenter) jh8.e(j3c.a.a(aVar, f63Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public WebInfoPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
