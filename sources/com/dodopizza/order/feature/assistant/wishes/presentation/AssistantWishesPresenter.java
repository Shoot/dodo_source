package com.dodopizza.order.feature.assistant.wishes.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AssistantWishesPresenter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR#\u0010\"\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/dodopizza/order/feature/assistant/wishes/presentation/AssistantWishesPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lpx;", "", "x", "p", "Lzw;", "wish", "v", "w", "u", "onBackPressed", "Lex;", "b", "Lex;", "data", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lhx;", e.a, "Lhx;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lrn5;", "t", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lex;Lf63;Lgc;Lhx;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantWishesPresenter extends BasePresenter2<px> {
    private final ex b;
    private final f63 c;
    private final gc d;
    private final hx e;
    private final rn5 f;

    /* compiled from: AssistantWishesPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("AssistantWishesPresenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantWishesPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends j6 implements Function2<nx, cv1<? super Unit>, Object> {
        b(Object obj) {
            super(2, obj, px.class, "setupWishes", "setupWishes(Lcom/dodopizza/order/feature/assistant/wishes/presentation/AssistantWishesVO;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(nx nxVar, cv1<? super Unit> cv1Var) {
            return AssistantWishesPresenter.y((px) this.receiver, nxVar, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantWishesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lnx;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.wishes.presentation.AssistantWishesPresenter$subscribeToWishes$2", f = "AssistantWishesPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements y84<pz3<? super nx>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super nx> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AssistantWishesPresenter.this.t().error("Failed to setup wishes", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AssistantWishesPresenter(ex exVar, f63 f63Var, gc gcVar, hx hxVar) {
        rn5 b2;
        z65.h(exVar, "data");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(hxVar, "interactor");
        this.b = exVar;
        this.c = f63Var;
        this.d = gcVar;
        this.e = hxVar;
        b2 = yn5.b(a.a);
        this.f = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger t() {
        return (Logger) this.f.getValue();
    }

    private final void x() {
        wz3.C(wz3.h(wz3.F(this.e.c(), new b(getViewState())), new c(null)), o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object y(px pxVar, nx nxVar, cv1 cv1Var) {
        pxVar.Xb(nxVar);
        return Unit.a;
    }

    public final void onBackPressed() {
        this.c.d();
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        this.d.a(ps.a.v(this.b.b()));
        x();
    }

    public final void u() {
        this.c.e(du.a(this.e.b()));
    }

    public final void v(zw zwVar) {
        z65.h(zwVar, "wish");
        this.e.d(zwVar);
    }

    public final void w(zw zwVar) {
        z65.h(zwVar, "wish");
        this.e.e(zwVar);
    }
}
