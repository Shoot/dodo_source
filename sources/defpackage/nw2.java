package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.google.android.gms.maps.model.LatLngBounds;
import com.huawei.hms.push.e;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DeliveryAddressMapInteractor.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lnw2;", "Lmw2;", "Lox1;", "", "l", "", "lat", "lon", "Loz3;", "La66;", "a", "Le91;", "clientDeliveryLocation", "Lwx;", "", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/maps/model/LatLngBounds;", com.huawei.hms.opendevice.c.a, "Ljx2;", "deliveryLocation", "", "clientPhoneNumber", "Lcom/dodopizza/async/AsyncJob;", "b", "Lrw2;", "Lrw2;", "deliveryAddressMapVOService", "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Li00;", "Li00;", "authorizationState", "Lx42;", e.a, "Lx42;", "customerAddressService", "Lhq3;", "f", "Lhq3;", "featureService", "Lb7;", "g", "Lb7;", "addressCatcherSubscriptionService", "<init>", "(Lrw2;Ljava/lang/String;Lru/dodopizza/app/domain/country/CountryService;Li00;Lx42;Lhq3;Lb7;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nw2  reason: default package */
/* loaded from: classes2.dex */
public final class nw2 implements mw2, ox1 {
    private final rw2 a;
    private final String b;
    private final CountryService c;
    private final i00 d;
    private final x42 e;
    private final hq3 f;
    private final b7 g;

    /* compiled from: DeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "La66;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nw2$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<oz3<? extends a66>> {
        final /* synthetic */ double b;
        final /* synthetic */ double c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(double d, double d2) {
            super(0);
            this.b = d;
            this.c = d2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<a66> invoke() {
            return nw2.this.a.a(this.b, this.c);
        }
    }

    /* compiled from: DeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapInteractorImpl$saveAddressToProfile$1", f = "DeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nw2$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e91 e91Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
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
                if (nw2.this.l()) {
                    nw2.this.e.a(this.c);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapInteractorImpl$subscribeDeliveryAddressUpdates$1", f = "DeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nw2$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ jx2 c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(jx2 jx2Var, String str, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = jx2Var;
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
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
                nw2.this.g.a(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public nw2(rw2 rw2Var, String str, CountryService countryService, i00 i00Var, x42 x42Var, hq3 hq3Var, b7 b7Var) {
        z65.h(rw2Var, "deliveryAddressMapVOService");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(countryService, "countryService");
        z65.h(i00Var, "authorizationState");
        z65.h(x42Var, "customerAddressService");
        z65.h(hq3Var, "featureService");
        z65.h(b7Var, "addressCatcherSubscriptionService");
        this.a = rw2Var;
        this.b = str;
        this.c = countryService;
        this.d = i00Var;
        this.e = x42Var;
        this.f = hq3Var;
        this.g = b7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        if (this.d.b() && this.f.a(bq3.d5)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mw2
    public oz3<a66> a(double d, double d2) {
        return k(new a(d, d2));
    }

    @Override // defpackage.mw2
    public wx<Unit> b(jx2 jx2Var, String str) {
        z65.h(jx2Var, "deliveryLocation");
        z65.h(str, "clientPhoneNumber");
        return j(new c(jx2Var, str, null));
    }

    @Override // defpackage.mw2
    public LatLngBounds c() {
        return d66.c(d66.b(this.c.c(this.b).j()));
    }

    @Override // defpackage.mw2
    public wx<Unit> d(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        return i(new b(e91Var, null));
    }

    public <T> wx<T> i(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> j(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public <T> oz3<T> k(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }
}
