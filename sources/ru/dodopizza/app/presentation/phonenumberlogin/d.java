package ru.dodopizza.app.presentation.phonenumberlogin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.ox1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.phonenumberlogin.c;
/* compiled from: PhoneNumberLoginInteractor.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\b\b\u0002\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001a\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u000f0\nj\u0002`\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/d;", "Lr38;", "Lox1;", "Ljt5;", "localityInfo", "Lru/dodopizza/app/presentation/phonenumberlogin/c$b;", "k", "Lru/dodopizza/app/presentation/phonenumberlogin/c;", "b", "(Lcv1;)Ljava/lang/Object;", "Lwx;", "Lj28;", "a", "", "phoneNumber", "", "Lcom/dodopizza/async/AsyncJob;", com.huawei.hms.opendevice.c.a, "Lhq3;", "Lhq3;", "featureService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ldt5;", "Ldt5;", "currentLocality", "Lrt5;", DateTokenConverter.CONVERTER_KEY, "Lrt5;", "localityInfoService", "Lg00;", com.huawei.hms.push.e.a, "Lg00;", "authorizationService", "Lru/dodopizza/app/presentation/phonenumberlogin/b;", "f", "Lru/dodopizza/app/presentation/phonenumberlogin/b;", "legalInfoBlockMapper", "Lkx1;", "g", "Lkx1;", "ioDispatcher", "<init>", "(Lhq3;Lru/dodopizza/app/domain/country/CountryService;Ldt5;Lrt5;Lg00;Lru/dodopizza/app/presentation/phonenumberlogin/b;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d implements r38, ox1 {
    private final hq3 a;
    private final CountryService b;
    private final dt5 c;
    private final rt5 d;
    private final g00 e;
    private final ru.dodopizza.app.presentation.phonenumberlogin.b f;
    private final kx1 g;

    /* compiled from: PhoneNumberLoginInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lru/dodopizza/app/presentation/phonenumberlogin/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginInteractorImpl$getPhoneNumberLoginInfo$2", f = "PhoneNumberLoginInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super ru.dodopizza.app.presentation.phonenumberlogin.c>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super ru.dodopizza.app.presentation.phonenumberlogin.c> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                jt5 a = d.this.d.a(d.this.c);
                return new ru.dodopizza.app.presentation.phonenumberlogin.c(a.b(), d.this.k(a));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PhoneNumberLoginInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj28;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginInteractorImpl$getPhonePrefixForCurrentCountry$1", f = "PhoneNumberLoginInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super j28>, Object> {
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
        public final Object invoke(cv1<? super j28> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            Object Z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                d dVar = d.this;
                ArrayList<ay1> arrayList = new ArrayList();
                for (Object obj2 : d.this.b.g()) {
                    if (z65.c(((ay1) obj2).getCode(), dVar.c.a())) {
                        arrayList.add(obj2);
                    }
                }
                w = lc1.w(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (ay1 ay1Var : arrayList) {
                    arrayList2.add(new j28(ay1Var.l().getCode(), ay1Var.f()));
                }
                Z = sc1.Z(arrayList2);
                return Z;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PhoneNumberLoginInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginInteractorImpl$sendSms$1", f = "PhoneNumberLoginInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
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
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                d.this.e.h(this.c, d.this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public d(hq3 hq3Var, CountryService countryService, dt5 dt5Var, rt5 rt5Var, g00 g00Var, ru.dodopizza.app.presentation.phonenumberlogin.b bVar, kx1 kx1Var) {
        z65.h(hq3Var, "featureService");
        z65.h(countryService, "countryService");
        z65.h(dt5Var, "currentLocality");
        z65.h(rt5Var, "localityInfoService");
        z65.h(g00Var, "authorizationService");
        z65.h(bVar, "legalInfoBlockMapper");
        z65.h(kx1Var, "ioDispatcher");
        this.a = hq3Var;
        this.b = countryService;
        this.c = dt5Var;
        this.d = rt5Var;
        this.e = g00Var;
        this.f = bVar;
        this.g = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.b k(jt5 jt5Var) {
        if (this.a.a(bq3.L5)) {
            return this.f.a(jt5Var);
        }
        if (this.a.a(bq3.R5)) {
            return this.f.b(jt5Var);
        }
        return this.f.c(jt5Var);
    }

    @Override // defpackage.r38
    public wx<j28> a() {
        return i(new b(null));
    }

    @Override // defpackage.r38
    public Object b(cv1<? super ru.dodopizza.app.presentation.phonenumberlogin.c> cv1Var) {
        return qh0.g(this.g, new a(null), cv1Var);
    }

    @Override // defpackage.r38
    public wx<Unit> c(String str) {
        z65.h(str, "phoneNumber");
        return j(new c(str, null));
    }

    public <T> wx<T> i(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> j(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public /* synthetic */ d(hq3 hq3Var, CountryService countryService, dt5 dt5Var, rt5 rt5Var, g00 g00Var, ru.dodopizza.app.presentation.phonenumberlogin.b bVar, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hq3Var, countryService, dt5Var, rt5Var, g00Var, bVar, (i & 64) != 0 ? v33.b() : kx1Var);
    }
}
