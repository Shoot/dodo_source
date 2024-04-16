package ru.dodopizza.app.presentation.selectlocation.landing.smsinput;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.l95;
import defpackage.pl5;
import defpackage.uq9;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b;
/* compiled from: LandingSMSInputPresenter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\u0006\u0010\u000f\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\n '*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00066"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lll5;", "", "x", "Luq9;", "response", "v", "y", "z", "w", "", "timeInMillis", "A", "onFirstViewAttach", "B", "", "pinCode", "t", "a", "Ljava/lang/String;", "phoneNumber", "b", "address", com.huawei.hms.opendevice.c.a, "localityUuid", "Lvfb;", DateTokenConverter.CONVERTER_KEY, "Lvfb;", "timerInteractor", "Lbl5;", com.huawei.hms.push.e.a, "Lbl5;", "interactor", "Lpl5;", "f", "Lpl5;", "landingStateManager", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "Ll95;", Image.TYPE_HIGH, "Ll95;", "u", "()Ll95;", "setTimerJob", "(Ll95;)V", "timerJob", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvfb;Lbl5;Lpl5;)V", "i", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LandingSMSInputPresenter extends BasePresenter<ll5> {
    public static final a i = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final vfb d;
    private final bl5 e;
    private final pl5 f;
    private final Logger g;
    private l95 h;

    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/LandingSMSInputPresenter$a;", "", "", "DEFAULT_PIN_CLEARING_DELAY", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Luq9;", "responseType", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter$confirmCode$1", f = "LandingSMSInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<uq9, cv1<? super Unit>, Object> {
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
        public final Object invoke(uq9 uq9Var, cv1<? super Unit> cv1Var) {
            return ((b) create(uq9Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LandingSMSInputPresenter.this.v((uq9) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Luq9;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter$confirmCode$2", f = "LandingSMSInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements y84<pz3<? super uq9>, Throwable, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super uq9> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new c(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LandingSMSInputPresenter.this.g.warn("code confirmation failure");
                ((ll5) LandingSMSInputPresenter.this.getViewState()).e();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lpz3;", "Luq9;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter$confirmCode$3", f = "LandingSMSInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements y84<pz3<? super uq9>, Throwable, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super uq9> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new d(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ll5) LandingSMSInputPresenter.this.getViewState()).l(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Luq9;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter$confirmCode$4", f = "LandingSMSInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function2<pz3<? super uq9>, cv1<? super Unit>, Object> {
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
        public final Object invoke(pz3<? super uq9> pz3Var, cv1<? super Unit> cv1Var) {
            return ((e) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ll5) LandingSMSInputPresenter.this.getViewState()).Fb();
                ((ll5) LandingSMSInputPresenter.this.getViewState()).l(true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter$makePhoneNumberRequest$1", f = "LandingSMSInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                LandingSMSInputPresenter.this.g.warn("Fail to send code", (Throwable) this.b);
                ((ll5) LandingSMSInputPresenter.this.getViewState()).e();
                ((ll5) LandingSMSInputPresenter.this.getViewState()).R();
                l95 u = LandingSMSInputPresenter.this.u();
                if (u != null) {
                    l95.a.a(u, null, 1, null);
                }
                LandingSMSInputPresenter.this.f.c();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b;", "timeCounter", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter$startTimer$1", f = "LandingSMSInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b bVar, cv1<? super Unit> cv1Var) {
            return ((g) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b bVar = (ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b) this.b;
                if (bVar instanceof b.C0613b) {
                    ((ll5) LandingSMSInputPresenter.this.getViewState()).F9(((b.C0613b) bVar).a());
                } else if (bVar instanceof b.a) {
                    ((ll5) LandingSMSInputPresenter.this.getViewState()).R();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingSMSInputPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter$startTimer$2", f = "LandingSMSInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements y84<pz3<? super ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b>, Throwable, cv1<? super Unit>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new h(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LandingSMSInputPresenter.this.g.warn("TimerInteractor failure");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LandingSMSInputPresenter(String str, String str2, String str3, vfb vfbVar, bl5 bl5Var, pl5 pl5Var) {
        z65.h(str, "phoneNumber");
        z65.h(str2, "address");
        z65.h(str3, "localityUuid");
        z65.h(vfbVar, "timerInteractor");
        z65.h(bl5Var, "interactor");
        z65.h(pl5Var, "landingStateManager");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vfbVar;
        this.e = bl5Var;
        this.f = pl5Var;
        this.g = LoggerFactory.getLogger("LandingSMSInputPresenter");
    }

    private final void A(long j) {
        this.h = o(wz3.h(wz3.F(this.d.a(TimeUnit.MILLISECONDS.toSeconds(j)), new g(null)), new h(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(uq9 uq9Var) {
        if (z65.c(uq9Var, uq9.c.a)) {
            z();
        } else if (z65.c(uq9Var, uq9.a.a)) {
            y();
        } else if (z65.c(uq9Var, uq9.b.a)) {
            ((ll5) getViewState()).Q8();
        }
    }

    private final void w() {
        ((ll5) getViewState()).h0();
        pl5.b e2 = this.f.e(this.a);
        if (e2 instanceof pl5.b.a) {
            x();
            A(e2.a());
        } else if (e2 instanceof pl5.b.C0478b) {
            A(e2.a());
        }
    }

    private final void x() {
        p(z77.a(this.e.b(this.a), new f(null)));
    }

    private final void y() {
        ((ll5) getViewState()).i2();
        this.g.warn("code confirmation failure");
        ((ll5) getViewState()).e();
    }

    private final void z() {
        ((ll5) getViewState()).i2();
        ((ll5) getViewState()).E8();
        ((ll5) getViewState()).f0(1000L);
    }

    public final void B() {
        this.f.c();
        w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((ll5) getViewState()).setAddress(this.b);
        w();
    }

    public final void t(String str) {
        z65.h(str, "pinCode");
        o(wz3.H(wz3.E(wz3.h(wz3.F(this.e.a(this.a, str, this.c), new b(null)), new c(null)), new d(null)), new e(null)));
    }

    public final l95 u() {
        return this.h;
    }
}
