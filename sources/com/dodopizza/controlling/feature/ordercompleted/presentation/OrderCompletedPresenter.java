package com.dodopizza.controlling.feature.ordercompleted.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.feature.webinfo.presentation.d;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
/* compiled from: OrderCompletedPresenter.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b1\u00102J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\u0005R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-¨\u00063"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/presentation/OrderCompletedPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lxc7;", "Lfz1;", "Ltr6;", "", "onFirstViewAttach", "view", "x", "Lv1b;", "selectedTips", "l", "", "available", "i", "k", "", RemoteMessageConst.Notification.URL, "b", "y", "onBackPressed", "Lic7;", "a", "Lic7;", "data", "Loc7;", "Loc7;", "interactor", "Lgc;", c.a, "Lgc;", "analytics", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "Ljc7;", e.a, "Ljc7;", "tipsFeatureState", "Lah7;", "f", "Lah7;", "autoSubmitFeatureState", "g", "Z", "rnDigitalCardConfigured", Image.TYPE_HIGH, "feedbackButtonsMovedDown", "<init>", "(Lic7;Loc7;Lgc;Lf63;Ljc7;Lah7;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderCompletedPresenter extends BasePresenter<xc7> implements fz1, tr6 {
    private final ic7 a;
    private final oc7 b;
    private final gc c;
    private final f63 d;
    private final jc7 e;
    private final ah7 f;
    private boolean g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderCompletedPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.ordercompleted.presentation.OrderCompletedPresenter$attachView$1", f = "OrderCompletedPresenter.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oc7 oc7Var = OrderCompletedPresenter.this.b;
                String b = OrderCompletedPresenter.this.a.b();
                this.a = 1;
                obj = oc7Var.b(b, this);
                if (obj == d) {
                    return d;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (!OrderCompletedPresenter.this.h && booleanValue) {
                OrderCompletedPresenter.this.h = true;
                ((xc7) OrderCompletedPresenter.this.getViewState()).B8();
            }
            if (!OrderCompletedPresenter.this.g && bh7.a(OrderCompletedPresenter.this.f) && booleanValue) {
                OrderCompletedPresenter.this.g = true;
                ((xc7) OrderCompletedPresenter.this.getViewState()).s(new vm9(OrderCompletedPresenter.this.a.b(), false, ck1.y));
            }
            return Unit.a;
        }
    }

    public OrderCompletedPresenter(ic7 ic7Var, oc7 oc7Var, gc gcVar, f63 f63Var, jc7 jc7Var, ah7 ah7Var) {
        z65.h(ic7Var, "data");
        z65.h(oc7Var, "interactor");
        z65.h(gcVar, "analytics");
        z65.h(f63Var, "router");
        z65.h(jc7Var, "tipsFeatureState");
        z65.h(ah7Var, "autoSubmitFeatureState");
        this.a = ic7Var;
        this.b = oc7Var;
        this.c = gcVar;
        this.d = f63Var;
        this.e = jc7Var;
        this.f = ah7Var;
    }

    @Override // defpackage.tr6
    public void b(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.d.e(d.a(new com.dodopizza.feature.webinfo.presentation.a((String) null, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }

    @Override // defpackage.fz1
    public void i(boolean z) {
        ((xc7) getViewState()).q0(z);
    }

    @Override // defpackage.tr6
    public void k(boolean z) {
        ((xc7) getViewState()).wc(z);
    }

    @Override // defpackage.fz1
    public void l(v1b v1bVar) {
        if (v1bVar != null) {
            ((xc7) getViewState()).d(v1bVar.b());
        }
    }

    public final void onBackPressed() {
        this.c.a(hc7.a.a(this.a.b()));
        this.d.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.c.a(hc7.a.b(this.a.b(), this.a.a()));
        ((xc7) getViewState()).w4(new ll1(this.a.b()));
        String b = this.a.b();
        ck1 ck1Var = ck1.y;
        ((xc7) getViewState()).V6(new pq3(b, ck1Var));
        ((xc7) getViewState()).h7(new sr6(this.a.b(), mi7.l, ck1Var));
        if (kc7.a(this.e)) {
            ((xc7) getViewState()).t0(new ez1(this.a.b(), ck1Var));
        }
    }

    @Override // moxy.MvpPresenter
    /* renamed from: x */
    public void attachView(xc7 xc7Var) {
        super.attachView(xc7Var);
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void y(boolean z) {
        ((xc7) getViewState()).H(z);
    }
}
