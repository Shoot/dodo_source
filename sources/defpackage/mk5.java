package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: LandingPhoneInputInteractor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lmk5;", "Llk5;", "Lox1;", "Lwx;", "Lj28;", "a", "Ltk5;", "b", "Lml5;", "Lml5;", "landingService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "", c.a, "Ljava/lang/String;", "locationId", DateTokenConverter.CONVERTER_KEY, LocalityEntity.FIELD_COUNTRY_CODE, "<init>", "(Lml5;Lru/dodopizza/app/domain/country/CountryService;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mk5  reason: default package */
/* loaded from: classes4.dex */
public final class mk5 implements lk5, ox1 {
    private final ml5 a;
    private final CountryService b;
    private final String c;
    private final String d;

    /* compiled from: LandingPhoneInputInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Ltk5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputInteractorImpl$getLandingPhoneNumberInputVO$1", f = "LandingPhoneInputInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mk5$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super tk5>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super tk5> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                hj5 landingInfo = mk5.this.a.getLandingInfo(mk5.this.c, mk5.this.d);
                if (landingInfo != null) {
                    return new tk5(landingInfo.d(), landingInfo.c(), landingInfo.g(), landingInfo.a(), landingInfo.b());
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LandingPhoneInputInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj28;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputInteractorImpl$getPhonePrefixForCurrentCountry$1", f = "LandingPhoneInputInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mk5$b */
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
                mk5 mk5Var = mk5.this;
                ArrayList<ay1> arrayList = new ArrayList();
                for (Object obj2 : mk5.this.b.g()) {
                    if (z65.c(((ay1) obj2).getCode(), mk5Var.d)) {
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

    public mk5(ml5 ml5Var, CountryService countryService, String str, String str2) {
        z65.h(ml5Var, "landingService");
        z65.h(countryService, "countryService");
        z65.h(str, "locationId");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a = ml5Var;
        this.b = countryService;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.lk5
    public wx<j28> a() {
        return g(new b(null));
    }

    @Override // defpackage.lk5
    public wx<tk5> b() {
        return g(new a(null));
    }

    public <T> wx<T> g(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
