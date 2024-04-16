package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.google.android.gms.maps.model.LatLng;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k9a;
import defpackage.l95;
import defpackage.qw1;
import defpackage.y6;
import defpackage.yv5;
import im.threads.business.transport.MessageAttributes;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressComponentDesignDto;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: EditDeliveryAddressMapPresenter.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002?CB[\b\u0007\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010P\u001a\u00020N\u0012\u0006\u0010V\u001a\u00020Q\u0012\u0006\u0010\\\u001a\u00020W\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010h\u001a\u00020e¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\u0003H\u0014J\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%J\u0006\u0010(\u001a\u00020\u0003J\u0016\u0010+\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020)2\u0006\u0010*\u001a\u00020\bJ\u0016\u0010.\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eJ\u000e\u0010/\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001eJ\u0006\u00100\u001a\u00020\u0003J\u0006\u00101\u001a\u00020\u0003J\u0006\u00102\u001a\u00020\u0003J\u0016\u00104\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u00105\u001a\u00020\u0003J\u0006\u00106\u001a\u00020\u0003J\u0006\u00107\u001a\u00020\u0003J\u000e\u00108\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\bJ\u000e\u00109\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\bJ\u000e\u0010:\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\bJ\u000e\u0010<\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u001eJ\u0006\u0010=\u001a\u00020\u0003R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010OR\u0017\u0010V\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\\\u001a\u00020W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010m\u001a\n j*\u0004\u0018\u00010i0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010}\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0014\u0010\u0086\u0001\u001a\u00020\b8F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/i;", "", "J", "f0", "Lqw1;", MessageAttributes.COORDINATES, "", "K", "e0", "m0", "Le91;", "location", "a0", "newClientDeliveryLocation", "n0", "Lk9a$a;", "result", "I", "Lk9a$b;", "request", "isNewLocality", "b0", "l0", "c0", "d0", "F", "h0", "Ljx2;", "", "clientPhoneNumber", "j0", "isOnboardingFlow", "Z", "onFirstViewAttach", "g0", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "P", "X", "Lyv5;", "isInitialRequest", "Y", "fieldId", "text", "S", "T", "O", "R", "Q", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "N", com.huawei.hms.push.e.a, "L", "U", "M", "V", "W", "address", "k0", "onBackPressed", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;", "a", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;", "interactor", "Ldo;", "b", "Ldo;", "appInitializer", "Lpd3;", com.huawei.hms.opendevice.c.a, "Lpd3;", "routingHandler", "Lwv5;", DateTokenConverter.CONVERTER_KEY, "Lwv5;", "locationPermissionChecker", "Lgc;", "Lgc;", "analytics", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "f", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "G", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "data", "Lhq3;", "g", "Lhq3;", "getFeatureService", "()Lhq3;", "featureService", "Li00;", Image.TYPE_HIGH, "Li00;", "authorizationState", "Lm52;", "i", "Lm52;", "customerPhoneNumberService", "Lf63;", "j", "Lf63;", "router", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "k", "Lorg/slf4j/Logger;", "logger", "Lfr6;", "Lx56;", "l", "Lfr6;", "currentState", "Ll95;", Image.TYPE_MEDIUM, "Ll95;", "currentRequest", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "n", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "fieldsDesignDto", "o", "Ljx2;", "defaultDeliveryLocation", "p", "Le91;", "oldClientDeliveryLocation", "q", "Ljava/lang/String;", "lastAddressAnalyticsTrack", "H", "()Z", "showDeleteButton", "<init>", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;Ldo;Lpd3;Lwv5;Lgc;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;Lhq3;Li00;Lm52;Lf63;)V", "r", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EditDeliveryAddressMapPresenter extends BasePresenter<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
    public static final b r = new b(null);
    private static final int s = dy8.pickup_menu_flow_request_id;
    private static final int t = dy8.pickup_onboarding_flow_request_id;
    private final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e a;
    private final Cdo b;
    private final pd3 c;
    private final wv5 d;
    private final gc e;
    private final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a f;
    private final hq3 g;
    private final i00 h;
    private final m52 i;
    private final f63 j;
    private final Logger k;
    private final fr6<x56> l;
    private l95 m;
    private AddressDetailsFieldDesignDto n;
    private final jx2 o;
    private final e91 p;
    private String q;

    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a$b;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: EditDeliveryAddressMapPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0141a extends a {
            public static final C0141a a = new C0141a();

            private C0141a() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk9a$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a0 extends f3b implements Function2<k9a.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a0(cv1<? super a0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(cv1Var);
            a0Var.b = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(k9a.a aVar, cv1<? super Unit> cv1Var) {
            return ((a0) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.I((k9a.a) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$b;", "", "", "PICKUP_MENU_FLOW_REQUEST_ID", "I", "PICKUP_ONBOARDING_FLOW_REQUEST_ID", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$3", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b0(cv1<? super b0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b0 b0Var = new b0(cv1Var);
            b0Var.b = obj;
            return b0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.k.error("Error handleSelectedAddress", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lx56;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$init$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<x56, cv1<? super Unit>, Object> {
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
        public final Object invoke(x56 x56Var, cv1<? super Unit> cv1Var) {
            return ((c) create(x56Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapPresenter.this.getViewState()).D5((x56) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "initialData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$init$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<e.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(e.b bVar, cv1<? super Unit> cv1Var) {
            return ((d) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object value;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e.b bVar = (e.b) this.b;
                if (bVar instanceof e.b.c) {
                    EditDeliveryAddressMapPresenter.this.n = ((e.b.c) bVar).a();
                }
                fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
                EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter = EditDeliveryAddressMapPresenter.this;
                do {
                    value = fr6Var.getValue();
                } while (!fr6Var.d(value, j87.a((x56) value, bVar, editDeliveryAddressMapPresenter.o)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$init$3", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
            Object value;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.k.warn("Can't fetch localityId, Failed get address design", (Throwable) this.b);
                fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
                EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter = EditDeliveryAddressMapPresenter.this;
                do {
                    value = fr6Var.getValue();
                } while (!fr6Var.d(value, j87.a((x56) value, e.b.C0147b.a, editDeliveryAddressMapPresenter.o)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le91;", "cdl", "", "localityId", "", "a", "(Le91;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function2<e91, String, Unit> {
        f() {
            super(2);
        }

        public final void a(e91 e91Var, String str) {
            Object value;
            z65.h(e91Var, "cdl");
            z65.h(str, "localityId");
            fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
            EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter = EditDeliveryAddressMapPresenter.this;
            do {
                value = fr6Var.getValue();
            } while (!fr6Var.d(value, y56.o((x56) value, editDeliveryAddressMapPresenter.n, str, e91Var.c())));
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapPresenter.this.getViewState()).Q2(e91Var.c().d().f(), false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(e91 e91Var, String str) {
            a(e91Var, str);
            return Unit.a;
        }
    }

    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$onDeleteConfirm$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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
            Object value;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
                do {
                    value = fr6Var.getValue();
                } while (!fr6Var.d(value, y56.m((x56) value)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$onDeleteConfirm$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((h) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.e.a(y6.a.b(ck1.s));
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapPresenter.this.getViewState()).a();
                EditDeliveryAddressMapPresenter.this.c.c(EditDeliveryAddressMapPresenter.this.p, EditDeliveryAddressMapPresenter.this.G().i());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$onDeleteConfirm$3", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                EditDeliveryAddressMapPresenter.this.d0();
                EditDeliveryAddressMapPresenter.this.k.error("Failed to delete delivery location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$saveClientDeliveryLocationToProfile$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(cv1Var);
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
                EditDeliveryAddressMapPresenter.this.c0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$saveClientDeliveryLocationToProfile$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(e91 e91Var, cv1<? super k> cv1Var) {
            super(2, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((k) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.l0(this.c);
                pd3 pd3Var = EditDeliveryAddressMapPresenter.this.c;
                e91 e91Var = this.c;
                boolean i = EditDeliveryAddressMapPresenter.this.G().i();
                if (EditDeliveryAddressMapPresenter.this.G().e() == a.EnumC0142a.a) {
                    z = true;
                } else {
                    z = false;
                }
                pd3Var.b(e91Var, i, z, false, a.b.C0152b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$saveClientDeliveryLocationToProfile$3", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((l) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.k.error("Failed to save delivery location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$saveDeliveryLocationToProfileAndSetToState$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new m(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((m) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object value;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
                do {
                    value = fr6Var.getValue();
                } while (!fr6Var.d(value, y56.k((x56) value)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$saveDeliveryLocationToProfileAndSetToState$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function2<sk9<? extends a.b>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ e91 d;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(e91 e91Var, boolean z, cv1<? super n> cv1Var) {
            super(2, cv1Var);
            this.d = e91Var;
            this.e = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(this.d, this.e, cv1Var);
            nVar.b = obj;
            return nVar;
        }

        public final Object i(Object obj, cv1<? super Unit> cv1Var) {
            return ((n) create(sk9.a(obj), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(sk9<? extends a.b> sk9Var, cv1<? super Unit> cv1Var) {
            return i(sk9Var.k(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Object k = ((sk9) this.b).k();
                EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter = EditDeliveryAddressMapPresenter.this;
                e91 e91Var = this.d;
                boolean z2 = this.e;
                if (sk9.i(k)) {
                    a.b bVar = (a.b) k;
                    editDeliveryAddressMapPresenter.l0(e91Var);
                    if (!editDeliveryAddressMapPresenter.G().k()) {
                        pd3 pd3Var = editDeliveryAddressMapPresenter.c;
                        boolean i = editDeliveryAddressMapPresenter.G().i();
                        if (editDeliveryAddressMapPresenter.G().e() == a.EnumC0142a.a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        pd3Var.b(e91Var, i, z, z2, bVar.a());
                    } else {
                        editDeliveryAddressMapPresenter.b.m();
                    }
                }
                EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter2 = EditDeliveryAddressMapPresenter.this;
                Throwable d = sk9.d(k);
                if (d != null) {
                    editDeliveryAddressMapPresenter2.k.error("Error select new DeliverablePlace with new locality", d);
                    editDeliveryAddressMapPresenter2.d0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$saveDeliveryLocationToProfileAndSetToState$3", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((o) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.k.error("Error select new DeliverablePlace with new locality", (Throwable) this.b);
                EditDeliveryAddressMapPresenter.this.d0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$showAddressFromGeocode$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        p(cv1<? super p> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new p(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((p) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object value;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
                do {
                    value = fr6Var.getValue();
                } while (!fr6Var.d(value, y56.p((x56) value)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "getAddressResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$showAddressFromGeocode$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends f3b implements Function2<e.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q(cv1<? super q> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q qVar = new q(cv1Var);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(e.a aVar, cv1<? super Unit> cv1Var) {
            return ((q) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object value;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e.a aVar = (e.a) this.b;
                fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
                EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter = EditDeliveryAddressMapPresenter.this;
                do {
                    value = fr6Var.getValue();
                } while (!fr6Var.d(value, f87.a((x56) value, aVar, editDeliveryAddressMapPresenter.n)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$showAddressFromGeocode$3", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r(cv1<? super r> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r rVar = new r(cv1Var);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((r) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object value;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.k.error("Failed to convert coordinates to address", (Throwable) this.b);
                fr6 fr6Var = EditDeliveryAddressMapPresenter.this.l;
                EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter = EditDeliveryAddressMapPresenter.this;
                do {
                    value = fr6Var.getValue();
                } while (!fr6Var.d(value, f87.a((x56) value, e.a.C0146a.a, editDeliveryAddressMapPresenter.n)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$showAddressFromGeocode$4", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        s(cv1<? super s> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new s(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((s) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.m = null;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lc66;", "bounds", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$showInitialCountryMapBounds$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends f3b implements Function2<c66, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(c66 c66Var, cv1<? super Unit> cv1Var) {
            return ((t) create(c66Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapPresenter.this.getViewState()).m(d66.c((c66) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$showInitialCountryMapBounds$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((u) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.k.warn("Can't fetch country map bounds", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$v", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class v implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public v(boolean z, Function0 function0) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La38;", "a", "()La38;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class w extends ej5 implements Function0<a38> {
        public static final w a = new w();

        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final a38 invoke() {
            return new a38().Ah();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$subscribeUserForUpdates$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x(cv1<? super x> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x xVar = new x(cv1Var);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((x) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapPresenter.this.getViewState()).m7();
                EditDeliveryAddressMapPresenter.this.k.error("Failed to subscribe for updates", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$subscribeUserForUpdates$2", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        y(cv1<? super y> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new y(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((y) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapPresenter.this.getViewState()).Jg();
                EditDeliveryAddressMapPresenter.this.e.a(a7.f(((x56) EditDeliveryAddressMapPresenter.this.l.getValue()).s().d(), ((x56) EditDeliveryAddressMapPresenter.this.l.getValue()).s().f()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$1", f = "EditDeliveryAddressMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        z(cv1<? super z> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new z(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((z) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapPresenter.this.c0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public EditDeliveryAddressMapPresenter(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e eVar, Cdo cdo, pd3 pd3Var, wv5 wv5Var, gc gcVar, com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a aVar, hq3 hq3Var, i00 i00Var, m52 m52Var, f63 f63Var) {
        z65.h(eVar, "interactor");
        z65.h(cdo, "appInitializer");
        z65.h(pd3Var, "routingHandler");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(gcVar, "analytics");
        z65.h(aVar, "data");
        z65.h(hq3Var, "featureService");
        z65.h(i00Var, "authorizationState");
        z65.h(m52Var, "customerPhoneNumberService");
        z65.h(f63Var, "router");
        this.a = eVar;
        this.b = cdo;
        this.c = pd3Var;
        this.d = wv5Var;
        this.e = gcVar;
        this.f = aVar;
        this.g = hq3Var;
        this.h = i00Var;
        this.i = m52Var;
        this.j = f63Var;
        this.k = LoggerFactory.getLogger("DeliveryAddressMapPresenter");
        this.l = mua.a(x56.f.a());
        this.o = aVar.a().c();
        this.p = aVar.a();
    }

    private final void F() {
        if (!this.l.getValue().a()) {
            return;
        }
        if (this.d.a() == ry7.DENIED_FOREVER) {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).c();
        } else {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).E0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(k9a.a aVar) {
        x56 value;
        x56 x56Var;
        jx2 jx2Var;
        if (aVar instanceof k9a.a.C0407a) {
            this.c.d();
        } else if (aVar instanceof k9a.a.e) {
            b0(((k9a.a.e) aVar).a(), false);
        } else if (aVar instanceof k9a.a.c) {
            b0(((k9a.a.c) aVar).a(), true);
        } else if (aVar instanceof k9a.a.d) {
            d0();
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).q(((k9a.a.d) aVar).a());
        } else if (aVar instanceof k9a.a.b) {
            fr6<x56> fr6Var = this.l;
            do {
                value = fr6Var.getValue();
                x56Var = value;
                e91 e2 = ru2.e(((k9a.a.b) aVar).a());
                if (e2 != null) {
                    jx2Var = e2.c();
                } else {
                    jx2Var = null;
                }
                z65.e(jx2Var);
            } while (!fr6Var.d(value, y56.s(x56Var, jx2Var)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mh5.a(Unit.a);
    }

    private final void J() {
        o(wz3.F(this.l, new c(null)));
        p(z77.a(y87.a(this.a.f(this.o.d()), new d(null)), new e(null)));
    }

    private final boolean K(qw1 qw1Var) {
        qw1 d2 = this.l.getValue().s().d();
        qw1.a aVar = qw1.c;
        if ((aVar.c(d2) && d2.e(qw1Var)) || (aVar.b(d2) && aVar.b(qw1Var))) {
            return true;
        }
        return false;
    }

    private final void Z(boolean z2) {
        if (z2) {
            this.j.i(t, Unit.a);
        } else {
            this.j.i(s, Unit.a);
        }
    }

    private final void a0(e91 e91Var) {
        p(z77.a(y87.a(r77.a(this.a.g(e91Var), new j(null)), new k(e91Var, null)), new l(null)));
    }

    private final void b0(k9a.b bVar, boolean z2) {
        boolean z3;
        e91 c2 = bVar.c();
        com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e eVar = this.a;
        if (this.f.e() == a.EnumC0142a.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        p(z77.a(y87.a(r77.a(eVar.e(bVar, z3), new m(null)), new n(c2, z2, null)), new o(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        x56 value;
        fr6<x56> fr6Var = this.l;
        do {
            value = fr6Var.getValue();
        } while (!fr6Var.d(value, y56.k(value)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        x56 value;
        fr6<x56> fr6Var = this.l;
        do {
            value = fr6Var.getValue();
        } while (!fr6Var.d(value, y56.n(value)));
    }

    private final void e0(qw1 qw1Var) {
        l95 l95Var = this.m;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.m = p(o77.a(z77.a(y87.a(r77.a(this.a.a(qw1Var), new p(null)), new q(null)), new r(null)), new s(null)));
    }

    private final void f0() {
        p(z77.a(y87.a(this.a.c(), new t(null)), new u(null)));
    }

    private final void h0() {
        if (this.h.b()) {
            j0(this.l.getValue().s(), this.i.a());
            return;
        }
        this.j.e(new v(false, w.a));
        this.j.m(dy8.phone_number_send_result_id, new wk9() { // from class: nd3
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                EditDeliveryAddressMapPresenter.i0(EditDeliveryAddressMapPresenter.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(EditDeliveryAddressMapPresenter editDeliveryAddressMapPresenter, Object obj) {
        z65.h(editDeliveryAddressMapPresenter, "this$0");
        if (obj instanceof g38) {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) editDeliveryAddressMapPresenter.getViewState()).B4();
            editDeliveryAddressMapPresenter.j0(editDeliveryAddressMapPresenter.l.getValue().s(), ((g38) obj).a());
        }
    }

    private final void j0(jx2 jx2Var, String str) {
        p(y87.a(z77.a(this.a.b(jx2Var, str), new x(null)), new y(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(e91 e91Var) {
        if (this.f.e() == a.EnumC0142a.a) {
            this.e.a(y6.a.e(this.f.f(), true));
        }
        this.e.a(y6.a.c(this.f.f(), true, e91Var, this.p));
    }

    private final boolean m0() {
        if (this.d.a() != ry7.DENIED_FOREVER) {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).E0(true);
            return true;
        }
        return false;
    }

    private final void n0(e91 e91Var) {
        p(z77.a(y87.a(r77.a(this.a.h(e91Var), new z(null)), new a0(null)), new b0(null)));
    }

    public final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a G() {
        return this.f;
    }

    public final boolean H() {
        if (this.f.e() == a.EnumC0142a.b && this.g.a(bq3.Y5)) {
            return true;
        }
        return false;
    }

    public final void L() {
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).a();
        this.c.a(this.l.getValue().s().f(), this.f.b(), PresenterScopeKt.getPresenterScope(this), this.l.getValue().s().d(), new f());
    }

    public final void M(boolean z2) {
        Z(z2);
        this.e.a(a7.e(this.l.getValue().s().d(), this.l.getValue().s().f()));
    }

    public final void N(a aVar, k9a.b bVar) {
        z65.h(aVar, "result");
        z65.h(bVar, "request");
        if (aVar instanceof a.b) {
            this.e.a(y6.a.g(y6.b.b));
            b0(bVar, true);
            return;
        }
        this.e.a(y6.a.g(y6.b.c));
    }

    public final void O() {
        AddressDetailsFieldDesignDto addressDetailsFieldDesignDto;
        int w2;
        int e2;
        int e3;
        x56 value;
        if (y56.h(this.l.getValue().l())) {
            fr6<x56> fr6Var = this.l;
            do {
                value = fr6Var.getValue();
            } while (!fr6Var.d(value, y56.r(value)));
            return;
        }
        jx2 s2 = this.l.getValue().s();
        if (!this.f.k() && (addressDetailsFieldDesignDto = this.n) != null) {
            List<AddressComponentDesignDto> fields = addressDetailsFieldDesignDto.getFields();
            w2 = lc1.w(fields, 10);
            e2 = f86.e(w2);
            e3 = kotlin.ranges.i.e(e2, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(e3);
            for (AddressComponentDesignDto addressComponentDesignDto : fields) {
                String id = addressComponentDesignDto.getId();
                String str = s2.c().get(addressComponentDesignDto.getId());
                if (str == null) {
                    str = "";
                }
                Pair a2 = lnb.a(id, str);
                linkedHashMap.put(a2.c(), a2.d());
            }
            s2 = jx2.b(s2, null, null, linkedHashMap, null, 11, null);
        }
        e91 b2 = e91.b(this.p, null, s2, false, 5, null);
        if (this.f.e() != a.EnumC0142a.a && !this.f.i()) {
            a0(b2);
        } else {
            n0(b2);
        }
    }

    public final void P(LatLng latLng) {
        z65.h(latLng, "latLng");
        qw1 a2 = rw1.a(latLng);
        if (!K(a2) && this.l.getValue().a()) {
            this.e.a(md4.d(latLng.a, latLng.b));
            e0(a2);
        }
    }

    public final void Q() {
        p(z77.a(y87.a(r77.a(this.a.d(this.p), new g(null)), new h(null)), new i(null)));
    }

    public final void R() {
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).y0();
    }

    public final void S(String str, String str2) {
        x56 value;
        z65.h(str, "fieldId");
        z65.h(str2, "text");
        fr6<x56> fr6Var = this.l;
        do {
            value = fr6Var.getValue();
        } while (!fr6Var.d(value, y56.i(value, str, str2)));
    }

    public final void T(String str) {
        x56 value;
        e87 g2;
        z65.h(str, "fieldId");
        fr6<x56> fr6Var = this.l;
        do {
            value = fr6Var.getValue();
            g2 = y56.g(value, str);
            if (g2.b()) {
                this.e.a(md4.a(str, this.f.f(), true));
            }
        } while (!fr6Var.d(value, g2.a()));
    }

    public final void U() {
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).B4();
        h0();
        this.e.a(a7.b(this.l.getValue().s().d(), this.l.getValue().s().f()));
    }

    public final void V(boolean z2) {
        Z(z2);
        this.e.a(a7.c(ck1.U4, this.l.getValue().s().d(), this.l.getValue().s().f()));
    }

    public final void W(boolean z2) {
        Z(z2);
        this.e.a(a7.c(ck1.V4, this.l.getValue().s().d(), this.l.getValue().s().f()));
    }

    public final void X() {
        x56 value;
        fr6<x56> fr6Var = this.l;
        do {
            value = fr6Var.getValue();
        } while (!fr6Var.d(value, s87.a(value)));
    }

    public final void Y(yv5 yv5Var, boolean z2) {
        z65.h(yv5Var, "result");
        boolean z3 = yv5Var instanceof yv5.b;
        if (z3) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            yv5.b bVar = (yv5.b) yv5Var;
            i.a.a((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) viewState, uv5.a(bVar.a()), false, 2, null);
            this.e.a(md4.f(bVar.a()));
        } else if (yv5Var instanceof yv5.a) {
            this.k.warn("Failed to request location. ", ((yv5.a) yv5Var).a());
        } else {
            boolean z4 = yv5Var instanceof yv5.c;
        }
        if (!z3 && z2) {
            f0();
        }
    }

    public final void e() {
        this.e.a(md4.b());
        this.e.a(md4.e());
        F();
    }

    public final void g0() {
        qw1 d2;
        if (this.l.getValue().u() == f9.l) {
            return;
        }
        qw1.a aVar = qw1.c;
        if (aVar.b(this.l.getValue().s().d())) {
            d2 = this.o.d();
        } else {
            d2 = this.l.getValue().s().d();
        }
        if (aVar.c(d2)) {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).d0(d2.f());
        } else if (!m0()) {
            f0();
        }
    }

    public final void k0(String str) {
        z65.h(str, "address");
        if (!z65.c(str, this.q)) {
            this.e.a(a7.d(this.l.getValue().s().d(), this.l.getValue().s().f()));
            this.q = str;
        }
    }

    public final void onBackPressed() {
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.e.a(md4.c());
        J();
    }
}
