package com.dodopizza.order.feature.pizzeriasuggestions.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c7a;
import defpackage.w98;
import defpackage.yv5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: PizzeriaSuggestionsPresenter.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\bH\u0010IJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0014J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R#\u0010>\u001a\n 9*\u0004\u0018\u000108088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010CR\u0016\u0010G\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006K"}, d2 = {"Lcom/dodopizza/order/feature/pizzeriasuggestions/presentation/PizzeriaSuggestionsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Laa8;", "", "C", "", "address", "", "withLoading", "D", "", "pizzeriasCount", "v", "onFirstViewAttach", "f", "Ls88;", "pizzeriaFilterVO", "x", "A", "Lyv5;", "result", Image.TYPE_MEDIUM, "B", "w", "j", "Lb68;", "pizzeria", "position", "z", "Lm98;", "a", "Lm98;", "interactor", "Lf63;", "b", "Lf63;", "router", "Lwv5;", com.huawei.hms.opendevice.c.a, "Lwv5;", "locationPermissionChecker", "Lew5;", DateTokenConverter.CONVERTER_KEY, "Lew5;", "locationSettingsChecker", "Li98;", com.huawei.hms.push.e.a, "Li98;", "data", "Lgc;", "Lgc;", "analytics", "Lhq3;", "g", "Lhq3;", "featureService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lrn5;", "y", "()Lorg/slf4j/Logger;", "logger", "Lov5;", "i", "Lov5;", "userLocation", "Ljava/lang/String;", "lookingAddress", "k", "Z", "restaurantInputStarted", "<init>", "(Lm98;Lf63;Lwv5;Lew5;Li98;Lgc;Lhq3;)V", "l", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PizzeriaSuggestionsPresenter extends BasePresenter<aa8> {
    public static final a l = new a(null);
    public static final int m = 8;
    private static final int n = gy8.pizzeria_suggestions_result;
    private final m98 a;
    private final f63 b;
    private final wv5 c;
    private final ew5 d;
    private final i98 e;
    private final gc f;
    private final hq3 g;
    private final rn5 h;
    private ov5 i;
    private String j;
    private boolean k;

    /* compiled from: PizzeriaSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/pizzeriasuggestions/presentation/PizzeriaSuggestionsPresenter$a;", "", "", "ONE_SYMBOL_LENGTH", "I", "PIZZERIA_SUGGESTIONS_RESULT_ID", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PizzeriaSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("PizzeriaSuggestionsPresenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ly98;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsPresenter$updatePizzerias$1", f = "PizzeriaSuggestionsPresenter.kt", l = {156}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function1<cv1<? super y98>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super y98> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
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
                m98 m98Var = PizzeriaSuggestionsPresenter.this.a;
                ov5 ov5Var = PizzeriaSuggestionsPresenter.this.i;
                String str = this.c;
                this.a = 1;
                obj = m98Var.m(ov5Var, str, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsPresenter$updatePizzerias$2", f = "PizzeriaSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ PizzeriaSuggestionsPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z, PizzeriaSuggestionsPresenter pizzeriaSuggestionsPresenter, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.b = z;
            this.c = pizzeriaSuggestionsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b) {
                    ((aa8) this.c.getViewState()).b();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ly98;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsPresenter$updatePizzerias$3", f = "PizzeriaSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<y98, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(y98 y98Var, cv1<? super Unit> cv1Var) {
            return ((e) create(y98Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                y98 y98Var = (y98) this.b;
                PizzeriaSuggestionsPresenter.this.j = y98Var.b();
                ((aa8) PizzeriaSuggestionsPresenter.this.getViewState()).f7(y98Var);
                PizzeriaSuggestionsPresenter.this.v(y98Var.c().size());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzeriaSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsPresenter$updatePizzerias$4", f = "PizzeriaSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzeriaSuggestionsPresenter.this.y().error("Failed to get pizzerias", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PizzeriaSuggestionsPresenter(m98 m98Var, f63 f63Var, wv5 wv5Var, ew5 ew5Var, i98 i98Var, gc gcVar, hq3 hq3Var) {
        rn5 b2;
        z65.h(m98Var, "interactor");
        z65.h(f63Var, "router");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        z65.h(i98Var, "data");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        this.a = m98Var;
        this.b = f63Var;
        this.c = wv5Var;
        this.d = ew5Var;
        this.e = i98Var;
        this.f = gcVar;
        this.g = hq3Var;
        b2 = yn5.b(b.a);
        this.h = b2;
        this.j = "";
    }

    private final void C() {
        if (this.c.a() == ry7.GRANTED && this.d.a()) {
            ((aa8) getViewState()).k();
        } else if (this.e.e()) {
            ((aa8) getViewState()).i6();
        }
    }

    private final void D(String str, boolean z) {
        p(z77.a(y87.a(r77.a(hy.a(new c(str, null)), new d(z, this, null)), new e(null)), new f(null)));
    }

    static /* synthetic */ void E(PizzeriaSuggestionsPresenter pizzeriaSuggestionsPresenter, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pizzeriaSuggestionsPresenter.D(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i) {
        boolean z = true;
        ((aa8) getViewState()).v3((i <= 1 || this.i != null) ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger y() {
        return (Logger) this.h.getValue();
    }

    public final void A() {
        this.f.a(c7a.a.a());
        if (this.c.a() == ry7.DENIED_FOREVER) {
            ((aa8) getViewState()).c();
        } else {
            ((aa8) getViewState()).i6();
        }
    }

    public final void B() {
        this.f.a(c7a.a.b(c7a.a.c));
    }

    public final void f(String str) {
        z65.h(str, "address");
        if (str.length() == 1 && !this.k) {
            this.f.a(c7a.a.i());
            this.k = true;
        }
        E(this, str, false, 2, null);
    }

    public final void j() {
        if (this.e.i() == naa.c) {
            ((aa8) getViewState()).d9();
        } else {
            this.b.i(n, w98.a.a);
        }
    }

    public final void m(yv5 yv5Var) {
        z65.h(yv5Var, "result");
        if (yv5Var instanceof yv5.b) {
            this.i = ((yv5.b) yv5Var).a();
            E(this, this.e.a(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        if (this.e.f()) {
            ((aa8) getViewState()).a9();
        } else {
            ((aa8) getViewState()).h9();
        }
        C();
        D(this.e.a(), true);
    }

    public final void w() {
        this.a.l();
        E(this, null, false, 3, null);
    }

    public final void x(s88 s88Var) {
        z65.h(s88Var, "pizzeriaFilterVO");
        this.a.k(s88Var);
        E(this, null, false, 3, null);
    }

    public final void z(b68 b68Var, int i) {
        boolean z;
        z65.h(b68Var, "pizzeria");
        ((aa8) getViewState()).a();
        this.f.a(c7a.a.j(b68Var.g(), c7a.c.c, Integer.valueOf(i + 1)));
        if (this.e.i() != naa.c && this.e.i() != naa.d) {
            this.b.i(n, new w98.b(b68Var, i, this.j));
            return;
        }
        d88 g = b68Var.g();
        jb7 f2 = b68Var.f();
        hn3 c2 = this.e.c();
        if (c2 == null) {
            c2 = hn3.c;
        }
        hn3 hn3Var = c2;
        boolean a2 = this.g.a(bq3.q);
        Boolean k = b68Var.k();
        if (k != null) {
            z = k.booleanValue();
        } else {
            z = false;
        }
        ((aa8) getViewState()).ab(new t88(g, f2, hn3Var, a2, true, z));
    }
}
