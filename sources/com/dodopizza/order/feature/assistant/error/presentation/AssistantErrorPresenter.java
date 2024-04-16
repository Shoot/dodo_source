package com.dodopizza.order.feature.assistant.error.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: AssistantErrorPresenter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/assistant/error/presentation/AssistantErrorPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "", "", "p", "r", "onBackPressed", "Lus;", "b", "Lus;", "data", "Lf63;", c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "<init>", "(Lus;Lf63;Lgc;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantErrorPresenter extends BasePresenter2<Object> {
    private final us b;
    private final f63 c;
    private final gc d;

    public AssistantErrorPresenter(us usVar, f63 f63Var, gc gcVar) {
        z65.h(usVar, "data");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        this.b = usVar;
        this.c = f63Var;
        this.d = gcVar;
    }

    public final void onBackPressed() {
        this.d.a(ps.a.h(rv.c));
        this.c.c(i56.a(n56.a));
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        this.d.a(ps.a.p());
    }

    public final void r() {
        this.c.i(this.b.a(), ys.a);
    }
}
