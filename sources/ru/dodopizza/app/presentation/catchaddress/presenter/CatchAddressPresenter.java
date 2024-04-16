package ru.dodopizza.app.presentation.catchaddress.presenter;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: CatchAddressPresenter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0014J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ltt0;", "", "withCarryout", "", "v", "", "addressId", "u", "Lw6;", "address", "A", "z", "onFirstViewAttach", "onDestroy", "onBackPressed", "w", "y", "a", "Z", "b", "Ljava/lang/String;", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "dodoRouter", "Llt0;", DateTokenConverter.CONVERTER_KEY, "Llt0;", "interactor", "Li00;", com.huawei.hms.push.e.a, "Li00;", "authorizationState", "f", "subscribed", "g", "Lw6;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "<init>", "(ZLjava/lang/String;Lf63;Llt0;Li00;)V", "i", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CatchAddressPresenter extends BasePresenter<tt0> {
    public static final a i = new a(null);
    private final boolean a;
    private final String b;
    private final f63 c;
    private final lt0 d;
    private final i00 e;
    private boolean f;
    private w6 g;
    private final Logger h;

    /* compiled from: CatchAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter$a;", "", "", "SELECT_CARRYOUT", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatchAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lw6;", "address", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter$applyAddress$1", f = "CatchAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<w6, cv1<? super Unit>, Object> {
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
        public final Object invoke(w6 w6Var, cv1<? super Unit> cv1Var) {
            return ((b) create(w6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CatchAddressPresenter.this.g = (w6) this.b;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatchAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter$applyAddress$2", f = "CatchAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                CatchAddressPresenter.this.h.error("Failed to get address by Id", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatchAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter$subscribeSms$1", f = "CatchAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
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
                ((tt0) CatchAddressPresenter.this.getViewState()).p0(true);
                ((tt0) CatchAddressPresenter.this.getViewState()).y2(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatchAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter$subscribeSms$2", f = "CatchAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((e) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CatchAddressPresenter.this.z();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatchAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter$subscribeSms$3", f = "CatchAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                ((tt0) CatchAddressPresenter.this.getViewState()).Of();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatchAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter$subscribeSms$4", f = "CatchAddressPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new g(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((tt0) CatchAddressPresenter.this.getViewState()).p0(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public CatchAddressPresenter(boolean z, String str, f63 f63Var, lt0 lt0Var, i00 i00Var) {
        z65.h(str, "addressId");
        z65.h(f63Var, "dodoRouter");
        z65.h(lt0Var, "interactor");
        z65.h(i00Var, "authorizationState");
        this.a = z;
        this.b = str;
        this.c = f63Var;
        this.d = lt0Var;
        this.e = i00Var;
        this.g = w6.n;
        this.h = LoggerFactory.getLogger("CatchAddressPresenter");
    }

    private final void A(w6 w6Var) {
        p(o77.a(z77.a(y87.a(r77.a(this.d.a(w6Var), new d(null)), new e(null)), new f(null)), new g(null)));
    }

    private final void u(String str, boolean z) {
        p(z77.a(y87.a(this.d.b(str, z), new b(null)), new c(null)));
    }

    private final void v(boolean z) {
        if (this.e.b()) {
            ((tt0) getViewState()).a5();
        } else {
            ((tt0) getViewState()).I6();
        }
        if (z) {
            ((tt0) getViewState()).G8();
        } else {
            ((tt0) getViewState()).O7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(CatchAddressPresenter catchAddressPresenter, w6 w6Var, Object obj) {
        z65.h(catchAddressPresenter, "this$0");
        z65.h(w6Var, "$currentAddress");
        catchAddressPresenter.A(w6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.f = true;
        ((tt0) getViewState()).a4();
        if (this.a) {
            ((tt0) getViewState()).w8();
            ((tt0) getViewState()).y2(false);
            return;
        }
        ((tt0) getViewState()).X6();
        ((tt0) getViewState()).rd();
        ((tt0) getViewState()).Ge(false);
        ((tt0) getViewState()).y2(true);
    }

    public final void onBackPressed() {
        this.c.d();
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.c.j(R.id.register_success_result);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        u(this.b, this.a);
        v(this.a);
    }

    public final void w() {
        final w6 b2 = w6.b(this.g, null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        if (!this.f) {
            if (this.e.b()) {
                A(b2);
                return;
            }
            this.c.m(R.id.register_success_result, new wk9() { // from class: qt0
                @Override // defpackage.wk9
                public final void onResult(Object obj) {
                    CatchAddressPresenter.x(CatchAddressPresenter.this, b2, obj);
                }
            });
            g63.a(this.c, "registration_phone_fragment", new ru.dodopizza.app.presentation.phonenumberlogin.e(e.a.c));
            return;
        }
        this.c.d();
    }

    public final void y() {
        if (this.a) {
            this.c.i(R.id.select_carryout, null);
        } else {
            this.c.d();
        }
    }
}
