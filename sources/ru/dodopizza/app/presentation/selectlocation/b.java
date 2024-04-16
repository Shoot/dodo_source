package ru.dodopizza.app.presentation.selectlocation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import defpackage.i97;
import defpackage.ox1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.selectlocation.a;
/* compiled from: SelectLocationInteractor.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BS\b\u0007\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\b\b\u0001\u0010=\u001a\u00020:¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J,\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/b;", "Lc6a;", "Lox1;", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "o", "Lhv0$b;", "changeLocalityRequest", "Lwx;", "Liv0;", "a", "Lhv0$c;", "changePizzeriaRequest", com.huawei.hms.opendevice.c.a, "Lhv0$a;", "changeDeliveryLocationRequest", "b", "Li97;", "f", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "baseUrl", DateTokenConverter.CONVERTER_KEY, "Lzy1;", "countryVO", "Ldt5;", "currentLocality", "", "isAppRestarted", "Lru/dodopizza/app/presentation/selectlocation/a;", com.huawei.hms.push.e.a, "(Lzy1;Ldt5;ZLcv1;)Ljava/lang/Object;", "Lj97;", "Lj97;", "onboardingFlowResolver", "Lhq3;", "Lhq3;", "onboardingFeatureService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ls80;", "Ls80;", "baseUrlService", "Ljv5;", "Ljv5;", "localityService", "Lk6a;", "Lk6a;", "selectLocationService", "Lv97;", "g", "Lv97;", "selectedCountryService", "Lmh0;", Image.TYPE_HIGH, "Lmh0;", "buildInfo", "Lkx1;", "i", "Lkx1;", "ioDispatcher", "<init>", "(Lj97;Lhq3;Lru/dodopizza/app/domain/country/CountryService;Ls80;Ljv5;Lk6a;Lv97;Lmh0;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b implements c6a, ox1 {
    private final j97 a;
    private final hq3 b;
    private final CountryService c;
    private final s80 d;
    private final jv5 e;
    private final k6a f;
    private final v97 g;
    private final mh0 h;
    private final kx1 i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lbq3;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<List<? extends bq3>> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends bq3> invoke() {
            List<? extends bq3> l;
            if (nh0.b(b.this.h)) {
                l = kc1.l();
                return l;
            }
            return b.this.c.e(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lbq3;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectlocation.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0602b extends ej5 implements Function1<Throwable, List<? extends bq3>> {
        public static final C0602b a = new C0602b();

        C0602b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<bq3> invoke(Throwable th) {
            List<bq3> l;
            z65.h(th, "it");
            l = kc1.l();
            return l;
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Li97;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationInteractorImpl$resolveOnboardingFlow$2", f = "SelectLocationInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<qx1, cv1<? super i97>, Object> {
        int a;
        final /* synthetic */ String b;
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, b bVar, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.b = str;
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super i97> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b != null) {
                    String a = this.c.d.a();
                    String a2 = this.c.c.c(this.b).a();
                    if (z65.c(a, a2)) {
                        this.c.o(this.b);
                    } else {
                        return new i97.a(a2);
                    }
                }
                return this.c.a.a(this.b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationInteractorImpl$selectDeliveryLocation$1", f = "SelectLocationInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function1<cv1<? super iv0>, Object> {
        int a;
        final /* synthetic */ hv0.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(hv0.a aVar, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super iv0> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.f.b(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationInteractorImpl$selectLocality$1", f = "SelectLocationInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function1<cv1<? super iv0>, Object> {
        int a;
        final /* synthetic */ hv0.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(hv0.b bVar, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super iv0> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.f.a(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationInteractorImpl$selectPizzeria$1", f = "SelectLocationInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function1<cv1<? super iv0>, Object> {
        int a;
        final /* synthetic */ hv0.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(hv0.c cVar, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = cVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super iv0> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.f.c(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationInteractorImpl$updateBaseUrl$2", f = "SelectLocationInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new g(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((g) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (b.this.d.h(this.c)) {
                    b.this.e.f();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(j97 j97Var, hq3 hq3Var, CountryService countryService, s80 s80Var, jv5 jv5Var, k6a k6aVar, v97 v97Var, mh0 mh0Var, kx1 kx1Var) {
        z65.h(j97Var, "onboardingFlowResolver");
        z65.h(hq3Var, "onboardingFeatureService");
        z65.h(countryService, "countryService");
        z65.h(s80Var, "baseUrlService");
        z65.h(jv5Var, "localityService");
        z65.h(k6aVar, "selectLocationService");
        z65.h(v97Var, "selectedCountryService");
        z65.h(mh0Var, "buildInfo");
        z65.h(kx1Var, "ioDispatcher");
        this.a = j97Var;
        this.b = hq3Var;
        this.c = countryService;
        this.d = s80Var;
        this.e = jv5Var;
        this.f = k6aVar;
        this.g = v97Var;
        this.h = mh0Var;
        this.i = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(String str) {
        this.b.b((List) fnb.a.a(new a(str)).a(C0602b.a), str);
    }

    @Override // defpackage.c6a
    public wx<iv0> a(hv0.b bVar) {
        z65.h(bVar, "changeLocalityRequest");
        return n(new e(bVar, null));
    }

    @Override // defpackage.c6a
    public wx<iv0> b(hv0.a aVar) {
        z65.h(aVar, "changeDeliveryLocationRequest");
        return n(new d(aVar, null));
    }

    @Override // defpackage.c6a
    public wx<iv0> c(hv0.c cVar) {
        z65.h(cVar, "changePizzeriaRequest");
        return n(new f(cVar, null));
    }

    @Override // defpackage.c6a
    public Object d(String str, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.i, new g(str, null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    @Override // defpackage.c6a
    public Object e(zy1 zy1Var, dt5 dt5Var, boolean z, cv1<? super ru.dodopizza.app.presentation.selectlocation.a> cv1Var) {
        if (zy1Var != null) {
            this.g.c(zy1Var.a());
            return new a.c(zy1Var.a(), zy1Var.b());
        } else if (dt5Var != null) {
            this.g.b();
            return new a.b(dt5Var.a());
        } else {
            String a2 = this.g.a();
            if (a2 != null && z) {
                return new a.d(a2);
            }
            return a.C0601a.a;
        }
    }

    @Override // defpackage.c6a
    public Object f(String str, cv1<? super i97> cv1Var) {
        return qh0.g(this.i, new c(str, this, null), cv1Var);
    }

    public <T> wx<T> n(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
