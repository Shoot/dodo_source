package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lz;
import defpackage.ox1;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.data.dto.response.CheckAvailabilityResponse;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: MainActivityInteractor.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001By\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\b\b\u0001\u0010J\u001a\u00020G¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002J\u0018\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00042\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J\u0010\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J\u0018\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\rJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002J\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010N\u001a\n K*\u0004\u0018\u00010#0#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Ll46;", "Lox1;", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "t", "Lay1;", "q", "", "isNewLaunch", "x", "w", Image.TYPE_SMALL, "(Lcv1;)Ljava/lang/Object;", "v", "isEnable", "y", "Lb31;", "o", "Lru/dodopizza/app/data/dto/response/CheckAvailabilityResponse;", "p", "u", "Ljv5;", "a", "Ljv5;", "localityService", "Lru/dodopizza/app/domain/country/CountryService;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lxu8;", com.huawei.hms.opendevice.c.a, "Lxu8;", "queryHandler", "Las8;", "Lru/dodopizza/app/domain/DodopizzaApi;", DateTokenConverter.CONVERTER_KEY, "Las8;", "dodoPizzaApiProvider", "Lava;", com.huawei.hms.push.e.a, "Lava;", "stateProvider", "Lgc;", "f", "Lgc;", "analytics", "Lxda;", "g", "Lxda;", "servicePushService", "Ltda;", Image.TYPE_HIGH, "Ltda;", "serverTimeService", "La98;", "i", "La98;", "pizzeriaRepository", "Lv52;", "j", "Lv52;", "customerSettingsService", "Lfm;", "k", "Lfm;", "apiCheckService", "Lbo;", "l", "Lbo;", "appInitializationStateProvider", "Lkx1;", Image.TYPE_MEDIUM, "Lkx1;", "ioDispatcher", "kotlin.jvm.PlatformType", "r", "()Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "<init>", "(Ljv5;Lru/dodopizza/app/domain/country/CountryService;Lxu8;Las8;Lava;Lgc;Lxda;Ltda;La98;Lv52;Lfm;Lbo;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: l46  reason: default package */
/* loaded from: classes4.dex */
public final class l46 implements ox1 {
    private final jv5 a;
    private final CountryService b;
    private final xu8 c;
    private final as8<DodopizzaApi> d;
    private final ava e;
    private final gc f;
    private final xda g;
    private final tda h;
    private final a98 i;
    private final v52 j;
    private final fm k;
    private final bo l;
    private final kx1 m;

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lb31;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$checkApi$2", f = "MainActivityInteractor.kt", l = {98}, m = "invokeSuspend")
    /* renamed from: l46$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super b31>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super b31> cv1Var) {
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
                fm fmVar = l46.this.k;
                this.a = 1;
                obj = fmVar.f(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/data/dto/response/CheckAvailabilityResponse;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$checkAvailAbility$1", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super CheckAvailabilityResponse>, Object> {
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
        public final Object invoke(cv1<? super CheckAvailabilityResponse> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return l46.this.r().checkAvailability();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lay1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$getCurrentCountry$1", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super ay1>, Object> {
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
        public final Object invoke(cv1<? super ay1> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String a;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dt5 i = l46.this.a.i();
                if (i != null && (a = i.a()) != null) {
                    return l46.this.b.c(a);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$isLocalitySelected$2", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$d */
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (l46.this.a.i() != null) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$registerServicePush$1", f = "MainActivityInteractor.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: l46$e */
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
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
                bo boVar = l46.this.l;
                this.a = 1;
                if (co.b(boVar, this) == d) {
                    return d;
                }
            }
            l46.this.g.c();
            return Unit.a;
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$resetCovidWarningShown$1", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$f */
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                l46.this.j.c("order_type_switcher_covid_warning_show", true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$syncServerTime$1", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$g */
    /* loaded from: classes4.dex */
    static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                l46.this.h.a();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$trackApplicationClose$1", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$h */
    /* loaded from: classes4.dex */
    static final class h extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                l46.this.f.a(new ym.a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$trackApplicationOpen$1", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$i */
    /* loaded from: classes4.dex */
    static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z, cv1<? super i> cv1Var) {
            super(1, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new i(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            d88 d88Var;
            String str;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String orderPizzeriaId = l46.this.e.e().getOrderPizzeriaId();
                String str2 = null;
                if (orderPizzeriaId != null) {
                    d88Var = l46.this.i.a(orderPizzeriaId);
                } else {
                    d88Var = null;
                }
                if (this.c) {
                    l46.this.f.a(lz.a.a);
                }
                gc gcVar = l46.this.f;
                boolean z = this.c;
                if (d88Var != null) {
                    str = d88Var.getId();
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                if (d88Var != null) {
                    str2 = d88Var.getName();
                }
                if (str2 != null) {
                    str3 = str2;
                }
                gcVar.a(new ym.b(z, str, str3));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivityInteractor$updatesEnabled$1", f = "MainActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l46$j */
    /* loaded from: classes4.dex */
    static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ l46 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z, l46 l46Var, cv1<? super j> cv1Var) {
            super(1, cv1Var);
            this.b = z;
            this.c = l46Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b) {
                    this.c.c.f();
                } else {
                    this.c.c.e();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public l46(jv5 jv5Var, CountryService countryService, xu8 xu8Var, as8<DodopizzaApi> as8Var, ava avaVar, gc gcVar, xda xdaVar, tda tdaVar, a98 a98Var, v52 v52Var, fm fmVar, bo boVar, kx1 kx1Var) {
        z65.h(jv5Var, "localityService");
        z65.h(countryService, "countryService");
        z65.h(xu8Var, "queryHandler");
        z65.h(as8Var, "dodoPizzaApiProvider");
        z65.h(avaVar, "stateProvider");
        z65.h(gcVar, "analytics");
        z65.h(xdaVar, "servicePushService");
        z65.h(tdaVar, "serverTimeService");
        z65.h(a98Var, "pizzeriaRepository");
        z65.h(v52Var, "customerSettingsService");
        z65.h(fmVar, "apiCheckService");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(kx1Var, "ioDispatcher");
        this.a = jv5Var;
        this.b = countryService;
        this.c = xu8Var;
        this.d = as8Var;
        this.e = avaVar;
        this.f = gcVar;
        this.g = xdaVar;
        this.h = tdaVar;
        this.i = a98Var;
        this.j = v52Var;
        this.k = fmVar;
        this.l = boVar;
        this.m = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodopizzaApi r() {
        return this.d.get();
    }

    public <T> wx<T> m(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> n(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final Object o(cv1<? super b31> cv1Var) {
        return qh0.g(this.m, new a(null), cv1Var);
    }

    public final wx<CheckAvailabilityResponse> p() {
        return m(new b(null));
    }

    public final wx<ay1> q() {
        return m(new c(null));
    }

    public final Object s(cv1<? super Boolean> cv1Var) {
        return qh0.g(this.m, new d(null), cv1Var);
    }

    public final wx<Unit> t() {
        return n(new e(null));
    }

    public final wx<Unit> u() {
        return n(new f(null));
    }

    public final wx<Unit> v() {
        return n(new g(null));
    }

    public final wx<Unit> w() {
        return n(new h(null));
    }

    public final wx<Unit> x(boolean z) {
        return n(new i(z, null));
    }

    public final wx<Unit> y(boolean z) {
        return n(new j(z, this, null));
    }
}
