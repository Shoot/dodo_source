package com.dodopizza.onboarding.feature.apprestartapprove.presentation;

import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: AppRestartApprovePresenter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/onboarding/feature/apprestartapprove/presentation/AppRestartApprovePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "", "", "r", Image.TYPE_SMALL, "Lno;", "b", "Lno;", "data", "Lf63;", c.a, "Lf63;", "router", "<init>", "(Lno;Lf63;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AppRestartApprovePresenter extends BasePresenter2<Object> {
    private final no b;
    private final f63 c;

    public AppRestartApprovePresenter(no noVar, f63 f63Var) {
        z65.h(noVar, "data");
        z65.h(f63Var, "router");
        this.b = noVar;
        this.c = f63Var;
    }

    public final void r() {
        this.c.l(this.b.a(), to.a);
    }

    public final void s() {
        this.c.l(this.b.a(), to.b);
    }
}
