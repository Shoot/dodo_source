package com.dodopizza.geo.feature.deliveryaddressmap.presentation;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.google.android.gms.maps.model.LatLngBounds;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.h37;
import defpackage.hv0;
import defpackage.l95;
import defpackage.yv5;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryAddressMapPresenter.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002.2BQ\b\u0007\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010F\u001a\u00020D\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K¢\u0006\u0004\b`\u0010aJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\tH\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\tH\u0014J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0006\u0010\u001a\u001a\u00020\tJ\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"J\u0006\u0010%\u001a\u00020\tJ\u0006\u0010&\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020'J\u0006\u0010*\u001a\u00020\tJ\u0006\u0010+\u001a\u00020\tJ\u0006\u0010,\u001a\u00020\tR\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010S\u001a\n P*\u0004\u0018\u00010O0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006c"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lvw2;", "Lh37$a;", "", "lat", "lon", "", "y", "", "K", "Le91;", "clientDeliveryLocation", "I", "J", "O", "w", "Ljx2;", "location", "", "clientPhoneNumber", "N", "onFirstViewAttach", "Lry7;", "status", "g", "onBackPressed", "A", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b;", "x", "z", "maxZoomLevelReached", "G", "H", "Lyv5;", "result", "F", "B", com.huawei.hms.push.e.a, "Lgqb;", "addressVO", "L", "C", "E", "D", "Lf63;", "a", "Lf63;", "onboardingRouter", "Lgc;", "b", "Lgc;", "analytics", "Lmw2;", com.huawei.hms.opendevice.c.a, "Lmw2;", "interactor", "Lwv5;", DateTokenConverter.CONVERTER_KEY, "Lwv5;", "locationPermissionChecker", "Lhq3;", "Lhq3;", "featureService", "Lck1;", "f", "Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lm37;", "Lm37;", "notificationsStatusInteractor", "Li00;", Image.TYPE_HIGH, "Li00;", "authorizationState", "Lm52;", "i", "Lm52;", "customerPhoneNumberService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "La66;", "k", "La66;", "currentState", "Ll95;", "l", "Ll95;", "currentRequest", "Lqw1;", Image.TYPE_MEDIUM, "Lqw1;", "currentCoordinate", "<init>", "(Lf63;Lgc;Lmw2;Lwv5;Lhq3;Lck1;Lm37;Li00;Lm52;)V", "n", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryAddressMapPresenter extends BasePresenter<vw2> implements h37.a {
    public static final a n = new a(null);
    private static final int o = dy8.change_locality_request_id;
    private final f63 a;
    private final gc b;
    private final mw2 c;
    private final wv5 d;
    private final hq3 e;
    private final ck1 f;
    private final m37 g;
    private final i00 h;
    private final m52 i;
    private final Logger j;
    private a66 k;
    private l95 l;
    private qw1 m;

    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$a;", "", "", "CHANGE_LOCALITY_REQUEST_ID", "I", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b$a;", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b$b;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: DeliveryAddressMapPresenter.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b$a;", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "<init>", "(Lcom/google/android/gms/maps/model/LatLngBounds;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends b {
            private final LatLngBounds a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LatLngBounds latLngBounds) {
                super(null);
                z65.h(latLngBounds, "latLngBounds");
                this.a = latLngBounds;
            }

            public final LatLngBounds a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                LatLngBounds latLngBounds = this.a;
                return "InitialLatLngBounds(latLngBounds=" + latLngBounds + ")";
            }
        }

        /* compiled from: DeliveryAddressMapPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b$b;", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0133b extends b {
            public static final C0133b a = new C0133b();

            private C0133b() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$saveToProfile$1", f = "DeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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
                DeliveryAddressMapPresenter.this.j.error("Error select new delivery location on map", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$saveToProfile$2", f = "DeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
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
                DeliveryAddressMapPresenter.this.b.a(y6.a.e(DeliveryAddressMapPresenter.this.f, true));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"La66;", "addressVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$showAddress$1", f = "DeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<a66, cv1<? super Unit>, Object> {
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
        public final Object invoke(a66 a66Var, cv1<? super Unit> cv1Var) {
            return ((e) create(a66Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a66 a66Var = (a66) this.b;
                ((vw2) DeliveryAddressMapPresenter.this.getViewState()).P5(a66Var);
                DeliveryAddressMapPresenter.this.k = a66Var;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "La66;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$showAddress$2", f = "DeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements y84<pz3<? super a66>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a66> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressMapPresenter.this.j.error("Failed to convert coordinates to address", (Throwable) this.b);
                ((vw2) DeliveryAddressMapPresenter.this.getViewState()).P5(p7.j);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lpz3;", "La66;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$showAddress$3", f = "DeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements y84<pz3<? super a66>, Throwable, cv1<? super Unit>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a66> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new g(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryAddressMapPresenter.this.l = null;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter$h", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public h(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(a38.class.getModifiers())) {
                String name = a38.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + a38.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a38, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public a38 a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La38;", "a", "()La38;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function0<a38> {
        public static final i a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final a38 invoke() {
            return new a38().Ah();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$subscribeUserForUpdates$1", f = "DeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((vw2) DeliveryAddressMapPresenter.this.getViewState()).e();
                DeliveryAddressMapPresenter.this.j.error("Failed to subscribe for updates", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter$subscribeUserForUpdates$2", f = "DeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((k) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((vw2) DeliveryAddressMapPresenter.this.getViewState()).Rf();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DeliveryAddressMapPresenter(f63 f63Var, gc gcVar, mw2 mw2Var, wv5 wv5Var, hq3 hq3Var, ck1 ck1Var, m37 m37Var, i00 i00Var, m52 m52Var) {
        z65.h(f63Var, "onboardingRouter");
        z65.h(gcVar, "analytics");
        z65.h(mw2Var, "interactor");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(hq3Var, "featureService");
        z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(m37Var, "notificationsStatusInteractor");
        z65.h(i00Var, "authorizationState");
        z65.h(m52Var, "customerPhoneNumberService");
        this.a = f63Var;
        this.b = gcVar;
        this.c = mw2Var;
        this.d = wv5Var;
        this.e = hq3Var;
        this.f = ck1Var;
        this.g = m37Var;
        this.h = i00Var;
        this.i = m52Var;
        this.j = LoggerFactory.getLogger("DeliveryAddressMapPresenter");
        this.k = l13.j;
    }

    private final void I(e91 e91Var) {
        p(y87.a(z77.a(this.c.d(e91Var), new c(null)), new d(null)));
    }

    private final void J() {
        boolean a2 = this.e.a(bq3.X4);
        ((vw2) getViewState()).y9(a2);
        ((vw2) getViewState()).q9(a2);
    }

    private final void K(double d2, double d3) {
        l95 l95Var = this.l;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.l = o(wz3.E(wz3.h(wz3.F(this.c.a(d2, d3), new e(null)), new f(null)), new g(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(DeliveryAddressMapPresenter deliveryAddressMapPresenter, gqb gqbVar, Object obj) {
        z65.h(deliveryAddressMapPresenter, "this$0");
        z65.h(gqbVar, "$addressVO");
        if (obj instanceof g38) {
            ((vw2) deliveryAddressMapPresenter.getViewState()).l(true);
            deliveryAddressMapPresenter.N(gqbVar.j().c(), ((g38) obj).a());
        }
    }

    private final void N(jx2 jx2Var, String str) {
        p(y87.a(z77.a(this.c.b(jx2Var, str), new j(null)), new k(null)));
    }

    private final boolean O() {
        if (this.e.a(bq3.X4) && this.d.a() != ry7.DENIED_FOREVER) {
            this.b.a(md4.e());
            ((vw2) getViewState()).dh();
            return true;
        }
        return false;
    }

    private final void w() {
        if (this.d.a() == ry7.DENIED_FOREVER) {
            ((vw2) getViewState()).c();
        } else {
            ((vw2) getViewState()).dh();
        }
    }

    private final boolean y(double d2, double d3) {
        Double d4;
        qw1 qw1Var = this.m;
        if (qw1Var != null) {
            Double d5 = null;
            if (qw1Var != null) {
                d4 = Double.valueOf(qw1Var.b());
            } else {
                d4 = null;
            }
            if (z65.a(d4, d2)) {
                qw1 qw1Var2 = this.m;
                if (qw1Var2 != null) {
                    d5 = Double.valueOf(qw1Var2.c());
                }
                if (z65.a(d5, d3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A(double d2, double d3) {
        if (y(d2, d3)) {
            return;
        }
        this.m = new qw1(d2, d3);
        if (this.e.a(bq3.Y4)) {
            this.b.a(md4.d(d2, d3));
        }
        K(d2, d3);
    }

    public final void B() {
        this.a.d();
    }

    public final void C() {
        ((vw2) getViewState()).kb();
    }

    public final void D() {
        throw new k07(null, 1, null);
    }

    public final void E() {
        throw new k07(null, 1, null);
    }

    public final void F(yv5 yv5Var) {
        z65.h(yv5Var, "result");
        if (yv5Var instanceof yv5.b) {
            yv5.b bVar = (yv5.b) yv5Var;
            ((vw2) getViewState()).w7(bVar.a());
            this.b.a(md4.f(bVar.a()));
        } else if (yv5Var instanceof yv5.a) {
            ((vw2) getViewState()).G1(this.c.c());
            this.j.warn("Failed to request location. ", ((yv5.a) yv5Var).a());
        } else if (yv5Var instanceof yv5.c) {
            ((vw2) getViewState()).G1(this.c.c());
        }
    }

    public final void G(boolean z) {
        ((vw2) getViewState()).ea(z);
    }

    public final void H(boolean z) {
        ((vw2) getViewState()).K5(z);
    }

    public final void L(final gqb gqbVar) {
        z65.h(gqbVar, "addressVO");
        if (this.h.b()) {
            N(gqbVar.j().c(), this.i.a());
            return;
        }
        this.a.e(new h(false, i.a));
        this.a.m(dy8.phone_number_send_result_id, new wk9() { // from class: pw2
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                DeliveryAddressMapPresenter.M(DeliveryAddressMapPresenter.this, gqbVar, obj);
            }
        });
    }

    public final void e() {
        this.b.a(md4.b());
        this.b.a(md4.e());
        w();
    }

    @Override // defpackage.h37.a
    public void g(ry7 ry7Var) {
        z65.h(ry7Var, "status");
        this.g.f(ck1.u);
    }

    @Override // defpackage.h37.a
    public void h(ry7 ry7Var) {
        h37.a.C0342a.a(this, ry7Var);
    }

    public final void onBackPressed() {
        this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.b.a(dx9.a.e());
        ((vw2) getViewState()).P5(this.k);
        J();
    }

    public final b x() {
        if (O()) {
            return b.C0133b.a;
        }
        return new b.a(this.c.c());
    }

    public final void z() {
        a66 a66Var = this.k;
        if (!(a66Var instanceof i9)) {
            a66Var = null;
        }
        i9 i9Var = (i9) a66Var;
        if (i9Var != null) {
            this.k = new r9a(i9Var.a(), i9Var.b());
            ((vw2) getViewState()).P5(this.k);
            this.a.l(o, new hv0.a(i9Var.k(), i9Var.j(), false, null, 8, null));
            I(i9Var.j());
        }
    }
}
