package com.dodopizza.controlling.feature.feedbackbuttons.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.e;
import defpackage.c59;
import defpackage.eb0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: FeedbackButtonsPresenter.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b5\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00104\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ldr3;", "", "C", "", "orderId", "Ll95;", "w", "Lar3;", "feedbackButtonsVO", "B", "Lqd7;", "newFeedbackValue", "A", "onFirstViewAttach", "view", "x", "", "isFeedbackPositive", "y", "", "rating", "z", "Lpq3;", "a", "Lpq3;", "data", "Lgc;", "b", "Lgc;", "analytics", "Luq3;", com.huawei.hms.opendevice.c.a, "Luq3;", "interactor", "Lyq3;", DateTokenConverter.CONVERTER_KEY, "Lyq3;", "router", "Leb0;", e.a, "Leb0;", "binaryFeedbackFeatureState", "Lah7;", "f", "Lah7;", "orderRatingAutoSubmitFeatureState", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lpq3;Lgc;Luq3;Lyq3;Leb0;Lah7;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedbackButtonsPresenter extends BasePresenter<dr3> {
    private final pq3 a;
    private final gc b;
    private final uq3 c;
    private final yq3 d;
    private final eb0 e;
    private final ah7 f;
    private final Logger g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lar3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsPresenter$applyOrderFeedbackValue$1", f = "FeedbackButtonsPresenter.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function1<cv1<? super ar3>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ar3> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
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
                uq3 uq3Var = FeedbackButtonsPresenter.this.c;
                String str = this.c;
                this.a = 1;
                obj = uq3Var.f(str, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lar3;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsPresenter$applyOrderFeedbackValue$2", f = "FeedbackButtonsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<ar3, cv1<? super Unit>, Object> {
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
        public final Object invoke(ar3 ar3Var, cv1<? super Unit> cv1Var) {
            return ((b) create(ar3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackButtonsPresenter.this.b.a(new c59.a(FeedbackButtonsPresenter.this.a.a(), FeedbackButtonsPresenter.this.a.b()));
                FeedbackButtonsPresenter.this.B((ar3) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsPresenter$applyOrderFeedbackValue$3", f = "FeedbackButtonsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackButtonsPresenter.this.g.error("Failed to display order feedback value", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsPresenter$processFeedbackValueChange$1", f = "FeedbackButtonsPresenter.kt", l = {103}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qd7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd7 qd7Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = qd7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                yq3 yq3Var = FeedbackButtonsPresenter.this.d;
                eh7 eh7Var = new eh7(FeedbackButtonsPresenter.this.a.b(), this.c, FeedbackButtonsPresenter.this.a.a());
                this.a = 1;
                obj = yq3Var.a(eh7Var, this);
                if (obj == d) {
                    return d;
                }
            }
            ((dr3) FeedbackButtonsPresenter.this.getViewState()).Ya((com.dodopizza.controlling.feature.orderrating.presentation.c) obj);
            return Unit.a;
        }
    }

    public FeedbackButtonsPresenter(pq3 pq3Var, gc gcVar, uq3 uq3Var, yq3 yq3Var, eb0 eb0Var, ah7 ah7Var) {
        z65.h(pq3Var, "data");
        z65.h(gcVar, "analytics");
        z65.h(uq3Var, "interactor");
        z65.h(yq3Var, "router");
        z65.h(eb0Var, "binaryFeedbackFeatureState");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        this.a = pq3Var;
        this.b = gcVar;
        this.c = uq3Var;
        this.d = yq3Var;
        this.e = eb0Var;
        this.f = ah7Var;
        this.g = LoggerFactory.getLogger("FeedbackButtonsPresenter");
    }

    private final void A(qd7 qd7Var) {
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(qd7Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(ar3 ar3Var) {
        qd7 a2 = ar3Var.a();
        if (a2 instanceof g69) {
            ((dr3) getViewState()).B0();
            ((dr3) getViewState()).q1(ar3Var.b());
            int a3 = ((g69) a2).a();
            if (br3.a(ar3Var)) {
                ((dr3) getViewState()).D4(a3);
            } else {
                ((dr3) getViewState()).W0(a3);
            }
        }
        if (a2 instanceof hb0) {
            ((dr3) getViewState()).v0();
            ((dr3) getViewState()).n4(ar3Var.b());
            Boolean a4 = ((hb0) a2).a();
            if (a4 == null) {
                ((dr3) getViewState()).g0();
            } else if (z65.c(a4, Boolean.TRUE)) {
                ((dr3) getViewState()).Db();
            } else if (z65.c(a4, Boolean.FALSE)) {
                ((dr3) getViewState()).Kg();
            }
        }
        ((dr3) getViewState()).d1(yh7.b(ar3Var));
        ((dr3) getViewState()).o3(yh7.a(ar3Var, bh7.a(this.f)));
    }

    private final void C() {
        if (!(this.e instanceof eb0.c)) {
            this.b.a(c59.a.k(this.a.a(), this.a.b()));
        }
    }

    private final l95 w(String str) {
        return p(z77.a(y87.a(hy.a(new a(str, null)), new b(null)), new c(null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        C();
    }

    @Override // moxy.MvpPresenter
    /* renamed from: x */
    public void attachView(dr3 dr3Var) {
        super.attachView(dr3Var);
        w(this.a.b());
    }

    public final void y(boolean z) {
        A(new hb0(Boolean.valueOf(z)));
        this.b.a(c59.a.f(this.a.a(), this.a.b(), z));
    }

    public final void z(int i) {
        A(new g69(i));
        this.b.a(c59.a.e(this.a.a(), this.a.b(), i));
    }
}
