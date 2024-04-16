package com.dodopizza.order.feature.assistant.result.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter2;
import defpackage.nt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AssistantGeneratorResultPresenter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR#\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorResultPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lcu;", "", "B", "p", "w", "z", "A", "Lnt$a;", "ingredient", "y", "onBackPressed", "x", "Lst;", "b", "Lst;", "data", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lwt;", com.huawei.hms.push.e.a, "Lwt;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lrn5;", "v", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lst;Lf63;Lgc;Lwt;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantGeneratorResultPresenter extends BasePresenter2<cu> {
    private final st b;
    private final f63 c;
    private final gc d;
    private final wt e;
    private final rn5 f;

    /* compiled from: AssistantGeneratorResultPresenter.kt */
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
            return LoggerFactory.getLogger("AssistantGeneratorResultPresenter");
        }
    }

    /* compiled from: AssistantGeneratorResultPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultPresenter$onAddToCartButtonClick$1", f = "AssistantGeneratorResultPresenter.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
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
                wt wtVar = AssistantGeneratorResultPresenter.this.e;
                this.a = 1;
                if (wtVar.e(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: AssistantGeneratorResultPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultPresenter$onAddToCartButtonClick$2", f = "AssistantGeneratorResultPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((c) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AssistantGeneratorResultPresenter.this.c.c(i56.a(n56.a));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AssistantGeneratorResultPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultPresenter$onAddToCartButtonClick$3", f = "AssistantGeneratorResultPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AssistantGeneratorResultPresenter.this.v().error("Failed to add a pizza to the cart", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantGeneratorResultPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends j6 implements Function2<au, cv1<? super Unit>, Object> {
        e(Object obj) {
            super(2, obj, cu.class, "setupGeneratorResult", "setupGeneratorResult(Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorResultVO;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(au auVar, cv1<? super Unit> cv1Var) {
            return AssistantGeneratorResultPresenter.C((cu) this.receiver, auVar, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantGeneratorResultPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lau;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultPresenter$subscribeToGeneratorResult$2", f = "AssistantGeneratorResultPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements y84<pz3<? super au>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super au> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AssistantGeneratorResultPresenter.this.v().error("Failed to setup generator result", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AssistantGeneratorResultPresenter(st stVar, f63 f63Var, gc gcVar, wt wtVar) {
        rn5 b2;
        z65.h(stVar, "data");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(wtVar, "interactor");
        this.b = stVar;
        this.c = f63Var;
        this.d = gcVar;
        this.e = wtVar;
        b2 = yn5.b(a.a);
        this.f = b2;
    }

    private final void B() {
        wz3.C(wz3.h(wz3.F(this.e.i(), new e(getViewState())), new f(null)), o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object C(cu cuVar, au auVar, cv1 cv1Var) {
        cuVar.i7(auVar);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger v() {
        return (Logger) this.f.getValue();
    }

    public final void A() {
        this.c.e(vu.a(this.e.g()));
    }

    public final void onBackPressed() {
        this.d.a(ps.a.h(rv.d));
        this.c.c(i56.a(n56.a));
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        this.d.a(ps.a.t(this.b.b(), this.b.c(), this.b.e()));
        B();
    }

    public final void w() {
        wj1.b(z77.a(y87.a(hy.a(new b(null)), new c(null)), new d(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void x() {
        this.d.a(ps.a.m(this.b.b(), this.b.c()));
        this.c.e(du.a(this.e.f()));
    }

    public final void y(nt.a aVar) {
        z65.h(aVar, "ingredient");
        this.d.a(ps.a.n(this.b.C(), aVar));
        this.e.j(aVar);
    }

    public final void z() {
        this.d.a(ps.a.w(rv.d));
        this.c.e(iw.a(this.e.h()));
    }
}
