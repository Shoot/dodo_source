package com.dodopizza.loyalty.referralsystem;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ReferralSystemPresenter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/dodopizza/loyalty/referralsystem/ReferralSystemPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lzb9;", "", "v", "onFirstViewAttach", "onBackPressed", "x", "w", "Lqb9;", "b", "Lqb9;", "referralSystemInteractor", "Lf63;", c.a, "Lf63;", "router", "Llb9;", DateTokenConverter.CONVERTER_KEY, "Llb9;", "externalRouter", "Lhq3;", e.a, "Lhq3;", "featureService", "Lgc;", "f", "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "Lac9;", Image.TYPE_HIGH, "Lac9;", "referrerData", "<init>", "(Lqb9;Lf63;Llb9;Lhq3;Lgc;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReferralSystemPresenter extends BasePresenter2<zb9> {
    private final qb9 b;
    private final f63 c;
    private final lb9 d;
    private final hq3 e;
    private final gc f;
    private final Logger g;
    private ac9 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemPresenter$applyReferrersInfo$1", f = "ReferralSystemPresenter.kt", l = {70, 71}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        Object a;
        int b;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.loyalty.referralsystem.ReferralSystemPresenter.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemPresenter$applyReferrersInfo$2", f = "ReferralSystemPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ReferralSystemPresenter.this.g.error("Can`t load referrer info", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ReferralSystemPresenter(qb9 qb9Var, f63 f63Var, lb9 lb9Var, hq3 hq3Var, gc gcVar) {
        z65.h(qb9Var, "referralSystemInteractor");
        z65.h(f63Var, "router");
        z65.h(lb9Var, "externalRouter");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        this.b = qb9Var;
        this.c = f63Var;
        this.d = lb9Var;
        this.e = hq3Var;
        this.f = gcVar;
        this.g = LoggerFactory.getLogger("ReferralSystemPresenter");
    }

    private final void v() {
        wj1.b(z77.a(hy.a(new a(null)), new b(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void onBackPressed() {
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        v();
    }

    public final void w() {
        this.d.c();
    }

    public final void x() {
        ac9 ac9Var = this.h;
        if (ac9Var != null) {
            this.c.e(new xb9(ac9Var.d(), ac9Var.a(), ac9Var.b(), this.e.a(bq3.m6)));
        }
    }
}
