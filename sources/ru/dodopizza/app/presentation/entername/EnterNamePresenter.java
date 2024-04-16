package ru.dodopizza.app.presentation.entername;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter;
import com.dodopizza.presentation.presenters.BasePresenter;
import defpackage.fy5;
import defpackage.zw9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: EnterNamePresenter.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/dodopizza/app/presentation/entername/EnterNamePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lqi3;", "", "u", "onFirstViewAttach", "view", "t", "onBackPressed", "v", "", "newName", "w", "", "isSubscribed", "x", "Lei3;", "a", "Lei3;", "data", "Lji3;", "b", "Lji3;", "interactor", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "Lorg/slf4j/Logger;", "logger", "Loi3;", "f", "Loi3;", "enterNameData", "<init>", "(Lei3;Lji3;Lf63;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EnterNamePresenter extends BasePresenter<qi3> {
    private final ei3 a;
    private final ji3 b;
    private final f63 c;
    private final gc d;
    private final Logger e;
    private oi3 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterNamePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Loi3;", "currentEnterNameData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNamePresenter$loadUserPersonalOffersSubscription$1", f = "EnterNamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<oi3, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(oi3 oi3Var, cv1<? super Unit> cv1Var) {
            return ((a) create(oi3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                oi3 oi3Var = (oi3) this.b;
                EnterNamePresenter.this.f = oi3Var;
                if (oi3Var.d()) {
                    ((qi3) EnterNamePresenter.this.getViewState()).u1();
                } else {
                    ((qi3) EnterNamePresenter.this.getViewState()).Bg();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EnterNamePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNamePresenter$loadUserPersonalOffersSubscription$2", f = "EnterNamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                EnterNamePresenter.this.e.error("Can`t get user subscription", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EnterNamePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNamePresenter$onApplyButtonPressed$1", f = "EnterNamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((qi3) EnterNamePresenter.this.getViewState()).mb();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EnterNamePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNamePresenter$onApplyButtonPressed$2", f = "EnterNamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((d) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((qi3) EnterNamePresenter.this.getViewState()).a();
                EnterNamePresenter.this.c.i(ShoppingCartPresenter.z.d(), fy5.b.a.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EnterNamePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNamePresenter$onApplyButtonPressed$3", f = "EnterNamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EnterNamePresenter.this.e.warn("Failed to set name", (Throwable) this.b);
                ((qi3) EnterNamePresenter.this.getViewState()).e();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EnterNamePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNamePresenter$onApplyButtonPressed$4", f = "EnterNamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(cv1Var);
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
                ((qi3) EnterNamePresenter.this.getViewState()).rf();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public EnterNamePresenter(ei3 ei3Var, ji3 ji3Var, f63 f63Var, gc gcVar) {
        z65.h(ei3Var, "data");
        z65.h(ji3Var, "interactor");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        this.a = ei3Var;
        this.b = ji3Var;
        this.c = f63Var;
        this.d = gcVar;
        this.e = LoggerFactory.getLogger("EnterNamePresenter");
        this.f = new oi3("", false);
    }

    private final void u() {
        p(z77.a(y87.a(this.b.f(), new a(null)), new b(null)));
    }

    public final void onBackPressed() {
        ((qi3) getViewState()).a();
        this.c.i(ShoppingCartPresenter.z.d(), fy5.b.C0318b.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        u();
    }

    @Override // moxy.MvpPresenter
    /* renamed from: t */
    public void attachView(qi3 qi3Var) {
        z65.h(qi3Var, "view");
        super.attachView(qi3Var);
        this.d.a(new zw9.e(this.a.a()));
    }

    public final void v() {
        p(o77.a(z77.a(y87.a(r77.a(this.b.c(this.f), new c(null)), new d(null)), new e(null)), new f(null)));
    }

    public final void w(String str) {
        boolean y;
        z65.h(str, "newName");
        this.f = oi3.b(this.f, str, false, 2, null);
        y = l0b.y(str);
        if (!y) {
            ((qi3) getViewState()).Y8();
        } else {
            ((qi3) getViewState()).U5();
        }
    }

    public final void x(boolean z) {
        this.f = oi3.b(this.f, null, z, 1, null);
    }
}
