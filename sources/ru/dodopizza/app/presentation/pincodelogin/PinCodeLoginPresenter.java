package ru.dodopizza.app.presentation.pincodelogin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fy5;
import defpackage.g00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.domain.authorization.WrongCredentialsException;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: PinCodeLoginPresenter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010\"\u001a\u00020\u0013\u0012\b\b\u0001\u0010$\u001a\u00020\u0013\u0012\u0006\u0010(\u001a\u00020%\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b4\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00103\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinCodeLoginPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lo68;", "", "E", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "requestContext", "D", "B", "", "isNewUser", "A", "C", "Lfy5$b;", "result", "w", "F", "onFirstViewAttach", "onBackPressed", "", "pin", "x", "y", "z", "Lf63;", "a", "Lf63;", "router", "Lgc;", "b", "Lgc;", "analytics", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", "phoneNumber", DateTokenConverter.CONVERTER_KEY, "formattedPhoneNumber", "Li68;", com.huawei.hms.push.e.a, "Li68;", "interactor", "f", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "Lru/dodopizza/app/presentation/phonenumberlogin/a;", "g", "Lru/dodopizza/app/presentation/phonenumberlogin/a;", "analyticsSenderMapper", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lf63;Lgc;Ljava/lang/String;Ljava/lang/String;Li68;Lru/dodopizza/app/presentation/phonenumberlogin/e$a;Lru/dodopizza/app/presentation/phonenumberlogin/a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinCodeLoginPresenter extends BasePresenter<o68> {
    private final f63 a;
    private final gc b;
    private final String c;
    private final String d;
    private final i68 e;
    private final e.a f;
    private final ru.dodopizza.app.presentation.phonenumberlogin.a g;
    private final Logger h;

    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$onPinEntered$1", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((o68) PinCodeLoginPresenter.this.getViewState()).l(true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lg00$a;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$onPinEntered$2", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<g00.a, cv1<? super Unit>, Object> {
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
        public final Object invoke(g00.a aVar, cv1<? super Unit> cv1Var) {
            return ((c) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PinCodeLoginPresenter.this.A(((g00.a) this.b).a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$onPinEntered$3", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                if (((Throwable) this.b) instanceof WrongCredentialsException) {
                    PinCodeLoginPresenter.this.B();
                } else {
                    ((o68) PinCodeLoginPresenter.this.getViewState()).y3();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$onResendPin$1", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
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
                PinCodeLoginPresenter.this.h.error("Failed to resend SMS. ", (Throwable) this.b);
                ((o68) PinCodeLoginPresenter.this.getViewState()).y3();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$onVerificationSuccess$1", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
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
                PinCodeLoginPresenter.this.C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$onVerificationSuccess$2", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PinCodeLoginPresenter.this.h.error("Failed to register user in mindbox", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ln42;", "customer", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$processExit$1", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<n42, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(n42 n42Var, cv1<? super Unit> cv1Var) {
            return ((h) create(n42Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((n42) this.b).h().length() == 0) {
                    PinCodeLoginPresenter.this.F();
                } else {
                    PinCodeLoginPresenter.this.w(fy5.b.a.a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter$processExit$2", f = "PinCodeLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PinCodeLoginPresenter.this.h.warn("Failed to get the current customer", (Throwable) this.b);
                PinCodeLoginPresenter.this.w(fy5.b.C0318b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PinCodeLoginPresenter(f63 f63Var, gc gcVar, String str, String str2, i68 i68Var, e.a aVar, ru.dodopizza.app.presentation.phonenumberlogin.a aVar2) {
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(str, "phoneNumber");
        z65.h(str2, "formattedPhoneNumber");
        z65.h(i68Var, "interactor");
        z65.h(aVar, "requestContext");
        z65.h(aVar2, "analyticsSenderMapper");
        this.a = f63Var;
        this.b = gcVar;
        this.c = str;
        this.d = str2;
        this.e = i68Var;
        this.f = aVar;
        this.g = aVar2;
        this.h = LoggerFactory.getLogger("PinCodeLoginPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z) {
        ((o68) getViewState()).l(false);
        p(z77.a(o77.a(this.e.s(this.f, z), new f(null)), new g(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        ((o68) getViewState()).l(false);
        ((o68) getViewState()).R5();
        ((o68) getViewState()).f0(1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        p(z77.a(y87.a(this.e.q(), new h(null)), new i(null)));
    }

    private final void D(e.a aVar) {
        int i2 = a.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                ((o68) getViewState()).ac(R.string.pin_code_title_default);
                ((o68) getViewState()).k8(R.string.pin_code_subtitle_default, this.d);
                return;
            }
            ((o68) getViewState()).ac(R.string.pin_code_title_contacts);
            ((o68) getViewState()).k8(R.string.pin_code_subtitle_contacts, this.d);
            return;
        }
        ((o68) getViewState()).ac(R.string.pin_code_title_promocode);
        ((o68) getViewState()).k8(R.string.pin_code_subtitle_promocode, this.d);
    }

    private final void E() {
        ((o68) getViewState()).Z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        this.a.c(new g8c("registration_phone_fragment", null, false, 6, null));
        this.a.g(new ni3(new ei3(this.g.a(this.f))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(fy5.b bVar) {
        this.a.c(new g8c("registration_phone_fragment", null, false, 6, null));
        this.a.i(R.id.register_success_result, bVar);
    }

    public final void onBackPressed() {
        this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((o68) getViewState()).Qc(true);
        ((o68) getViewState()).M9(true);
        ((o68) getViewState()).Sc();
        D(this.f);
        E();
    }

    public final void x(String str) {
        z65.h(str, "pin");
        this.b.a(lz.a.a());
        p(z77.a(y87.a(r77.a(this.e.p(str, this.c), new b(null)), new c(null)), new d(null)));
    }

    public final void y() {
        ((o68) getViewState()).Sc();
        ((o68) getViewState()).Qc(true);
        ((o68) getViewState()).M9(true);
        p(z77.a(this.e.r(this.c), new e(null)));
    }

    public final void z() {
        ((o68) getViewState()).M9(false);
        ((o68) getViewState()).Qc(false);
    }
}
