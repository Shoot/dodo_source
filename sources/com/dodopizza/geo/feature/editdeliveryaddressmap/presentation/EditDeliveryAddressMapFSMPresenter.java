package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.google.android.gms.maps.model.LatLng;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k9a;
import defpackage.ko3;
import defpackage.l95;
import defpackage.qw1;
import defpackage.y6;
import defpackage.yv5;
import im.threads.business.transport.MessageAttributes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressComponentDesignDto;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003s;?BA\b\u0007\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R¢\u0006\u0004\bq\u0010rJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020%2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020*2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010/\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u00100\u001a\u00020\u00052\u0006\u0010(\u001a\u00020%H\u0002J\u0014\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000401H\u0016J0\u00106\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000404\u0012\u0004\u0012\u00020\u000503j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`5H\u0016J\u001e\u00108\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u0002072\u0006\u0010-\u001a\u00020,2\u0006\u0010\n\u001a\u00020\tJ\u000e\u00109\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tR\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010m\u001a\n j*\u0004\u0018\u00010i0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0011\u0010p\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006t"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/i;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "", "w0", "", "y0", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "h0", "s0", "t0", "onBackPressed", "c0", "o0", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "k0", "Lqw1;", MessageAttributes.COORDINATES, "f0", "g0", "u0", "Lyv5;", "result", "isInitialRequest", "p0", "v0", "b0", "", "fieldId", "text", "m0", "n0", "j0", "Le91;", "location", "q0", "newClientDeliveryLocation", "z0", "Lk9a$a;", "e0", "Lk9a$b;", "request", "isNewLocality", "r0", "x0", "Lbua;", "t", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "i0", "l0", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;", "b", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;", "interactor", "Lpd3;", com.huawei.hms.opendevice.c.a, "Lpd3;", "routingHandler", "Lwv5;", DateTokenConverter.CONVERTER_KEY, "Lwv5;", "locationPermissionChecker", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "f", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "args", "Lhq3;", "g", "Lhq3;", "featureService", "Ldo;", Image.TYPE_HIGH, "Ldo;", "appInitializer", "Lx56;", "i", "Lx56;", "mapAddressViewCurrentState", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "j", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "fieldsDesignDto", "Ljx2;", "k", "Ljx2;", "defaultDeliveryLocation", "l", "Le91;", "oldClientDeliveryLocation", "Ll95;", Image.TYPE_MEDIUM, "Ll95;", "currentRequest", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "n", "Lorg/slf4j/Logger;", "logger", "d0", "()Z", "showDeleteButton", "<init>", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;Lpd3;Lwv5;Lgc;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;Lhq3;Ldo;)V", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EditDeliveryAddressMapFSMPresenter extends MoxyFSMPresenter<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i, c, a> {
    private final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e b;
    private final pd3 c;
    private final wv5 d;
    private final gc e;
    private final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a f;
    private final hq3 g;
    private final Cdo h;
    private x56 i;
    private AddressDetailsFieldDesignDto j;
    private final jx2 k;
    private final e91 l;
    private l95 m;
    private final Logger n;

    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0136a extends a {
            public static final C0136a a = new C0136a();

            private C0136a() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lx56;", "a", "Lx56;", "()Lx56;", "b", "(Lx56;)V", "mapAddressStateVO", "<init>", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends a {
            private x56 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x56 x56Var) {
                super(null);
                z65.h(x56Var, "mapAddressStateVO");
                this.a = x56Var;
            }

            public final x56 a() {
                return this.a;
            }

            public final void b(x56 x56Var) {
                z65.h(x56Var, "<set-?>");
                this.a = x56Var;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                x56 x56Var = this.a;
                return "MapAddressViewData(mapAddressStateVO=" + x56Var + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "Lok3;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$d;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$e;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$f;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$g;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$h;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$i;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$j;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$k;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$l;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$m;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class b extends ok3 {

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "a", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "b", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;", "result", "Lk9a$b;", "Lk9a$b;", "()Lk9a$b;", "request", "<init>", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter$a;Lk9a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0137b extends b {
            private final EditDeliveryAddressMapPresenter.a a;
            private final k9a.b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0137b(EditDeliveryAddressMapPresenter.a aVar, k9a.b bVar) {
                super(null);
                z65.h(aVar, "result");
                z65.h(bVar, "request");
                this.a = aVar;
                this.b = bVar;
            }

            public final k9a.b a() {
                return this.b;
            }

            public final EditDeliveryAddressMapPresenter.a b() {
                return this.a;
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$d;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class d extends b {
            public static final d a = new d();

            private d() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$e;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "fieldId", "b", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class e extends b {
            private final String a;
            private final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, String str2) {
                super(null);
                z65.h(str, "fieldId");
                z65.h(str2, "text");
                this.a = str;
                this.b = str2;
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$f;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "fieldId", "<init>", "(Ljava/lang/String;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class f extends b {
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str) {
                super(null);
                z65.h(str, "fieldId");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$g;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "Lyv5;", "a", "Lyv5;", "()Lyv5;", "result", "", "b", "Z", "()Z", "isInitialRequest", "<init>", "(Lyv5;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class g extends b {
            private final yv5 a;
            private final boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(yv5 yv5Var, boolean z) {
                super(null);
                z65.h(yv5Var, "result");
                this.a = yv5Var;
                this.b = z;
            }

            public final yv5 a() {
                return this.a;
            }

            public final boolean b() {
                return this.b;
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$h;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class h extends b {
            public static final h a = new h();

            private h() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$i;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class i extends b {
            public static final i a = new i();

            private i() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$j;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "Lcom/google/android/gms/maps/model/LatLng;", "a", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", MessageAttributes.COORDINATES, "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class j extends b {
            private final LatLng a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(LatLng latLng) {
                super(null);
                z65.h(latLng, MessageAttributes.COORDINATES);
                this.a = latLng;
            }

            public final LatLng a() {
                return this.a;
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$k;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class k extends b {
            public static final k a = new k();

            private k() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$l;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class l extends b {
            public static final l a = new l();

            private l() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$m;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class m extends b {
            public static final m a = new m();

            private m() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c$b;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "initialData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$getInitialData$1", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e.b bVar = (e.b) this.b;
                if (bVar instanceof e.b.c) {
                    EditDeliveryAddressMapFSMPresenter.this.j = ((e.b.c) bVar).a();
                }
                EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter = EditDeliveryAddressMapFSMPresenter.this;
                editDeliveryAddressMapFSMPresenter.i = j87.a(editDeliveryAddressMapFSMPresenter.i, bVar, EditDeliveryAddressMapFSMPresenter.this.k);
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapFSMPresenter.this.getViewState()).D5(EditDeliveryAddressMapFSMPresenter.this.i);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$getInitialData$2", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.n.warn("Can't fetch localityId, Failed get address design", (Throwable) this.b);
                EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter = EditDeliveryAddressMapFSMPresenter.this;
                editDeliveryAddressMapFSMPresenter.i = j87.a(editDeliveryAddressMapFSMPresenter.i, e.b.C0147b.a, EditDeliveryAddressMapFSMPresenter.this.k);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le91;", "cdl", "", "localityId", "", "a", "(Le91;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function2<e91, String, Unit> {
        final /* synthetic */ a.b a;
        final /* synthetic */ EditDeliveryAddressMapFSMPresenter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a.b bVar, EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
            super(2);
            this.a = bVar;
            this.b = editDeliveryAddressMapFSMPresenter;
        }

        public final void a(e91 e91Var, String str) {
            z65.h(e91Var, "cdl");
            z65.h(str, "localityId");
            a.b bVar = this.a;
            bVar.b(y56.o(bVar.a(), this.b.j, str, e91Var.c()));
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) this.b.getViewState()).D5(this.a.a());
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) this.b.getViewState()).Q2(e91Var.c().d().f(), false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(e91 e91Var, String str) {
            a(e91Var, str);
            return Unit.a;
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<ko3<c, a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function1<ko3<c, a>.a<c, a>, Unit> {
            final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0138a extends ej5 implements Function2<a.C0211a, a.C0136a, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0138a(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(a.C0211a c0211a, a.C0136a c0136a) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(c0136a, "<anonymous parameter 1>");
                    this.a.e.a(md4.c());
                    this.a.c0();
                    ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) this.a.getViewState()).D5(this.a.i);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$h;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$h;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class b extends ej5 implements Function2<b.h, a.C0136a, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.h hVar, a.C0136a c0136a) {
                    z65.h(hVar, "<anonymous parameter 0>");
                    z65.h(c0136a, "<anonymous parameter 1>");
                    this.a.w0();
                    return new bua<>(c.b.a, new a.b(this.a.i));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                super(1);
                this.a = editDeliveryAddressMapFSMPresenter;
            }

            public final void a(ko3<c, a>.a<c, a> aVar) {
                z65.h(aVar, "$this$state");
                C0138a c0138a = new C0138a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.C0136a.class, (Function2) unb.e(c0138a, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.h.class)) {
                    aVar.b().put(b.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map2 = aVar.b().get(b.h.class);
                z65.e(map2);
                map2.put(a.C0136a.class, (Function2) unb.e(bVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<c, a>.a<c, a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function1<ko3<c, a>.a<c, a>, Unit> {
            final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$d;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$d;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class a extends ej5 implements Function2<b.d, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.d dVar, a.b bVar) {
                    z65.h(dVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.l0(bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$m;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$m;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$g$b$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0139b extends ej5 implements Function2<b.m, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0139b(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.m mVar, a.b bVar) {
                    z65.h(mVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.h0(bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$b;", "event", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$b;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class c extends ej5 implements Function2<b.C0137b, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.C0137b c0137b, a.b bVar) {
                    z65.h(c0137b, "event");
                    z65.h(bVar, "data");
                    this.a.i0(c0137b.b(), c0137b.a(), bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$k;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$k;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class d extends ej5 implements Function2<b.k, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.k kVar, a.b bVar) {
                    z65.h(kVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.o0(bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$j;", "event", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$j;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class e extends ej5 implements Function2<b.j, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.j jVar, a.b bVar) {
                    z65.h(jVar, "event");
                    z65.h(bVar, "data");
                    this.a.k0(jVar.a(), bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$g;", "event", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$g;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class f extends ej5 implements Function2<b.g, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.g gVar, a.b bVar) {
                    z65.h(gVar, "event");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.p0(gVar.a(), gVar.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$i;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$i;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$g$b$g  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0140g extends ej5 implements Function2<b.i, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0140g(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.i iVar, a.b bVar) {
                    z65.h(iVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.e.a(md4.b());
                    this.a.e.a(md4.e());
                    this.a.b0(bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$e;", "event", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$e;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class h extends ej5 implements Function2<b.e, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.e eVar, a.b bVar) {
                    z65.h(eVar, "event");
                    z65.h(bVar, "data");
                    this.a.m0(eVar.a(), eVar.b(), bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$f;", "event", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$f;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class i extends ej5 implements Function2<b.f, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.f fVar, a.b bVar) {
                    z65.h(fVar, "event");
                    z65.h(bVar, "data");
                    this.a.n0(fVar.a(), bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$a;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$a;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class j extends ej5 implements Function2<b.a, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.a aVar, a.b bVar) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.onBackPressed();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$l;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "data", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$l;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class k extends ej5 implements Function2<b.l, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.l lVar, a.b bVar) {
                    z65.h(lVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.j0(bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$c;", "<anonymous parameter 0>", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a;", "a", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$b$c;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter$a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class l extends ej5 implements Function2<b.c, a.b, bua<? extends c, a>> {
                final /* synthetic */ EditDeliveryAddressMapFSMPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                    super(2);
                    this.a = editDeliveryAddressMapFSMPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends c, a> invoke(b.c cVar, a.b bVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) this.a.getViewState()).y0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter) {
                super(1);
                this.a = editDeliveryAddressMapFSMPresenter;
            }

            public final void a(ko3<c, a>.a<c, a> aVar) {
                z65.h(aVar, "$this$state");
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(b.k.class)) {
                    aVar.b().put(b.k.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map = aVar.b().get(b.k.class);
                z65.e(map);
                map.put(a.b.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(b.j.class)) {
                    aVar.b().put(b.j.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map2 = aVar.b().get(b.j.class);
                z65.e(map2);
                map2.put(a.b.class, (Function2) unb.e(eVar, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(b.g.class)) {
                    aVar.b().put(b.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map3 = aVar.b().get(b.g.class);
                z65.e(map3);
                map3.put(a.b.class, (Function2) unb.e(fVar, 2));
                C0140g c0140g = new C0140g(this.a);
                if (!aVar.b().containsKey(b.i.class)) {
                    aVar.b().put(b.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map4 = aVar.b().get(b.i.class);
                z65.e(map4);
                map4.put(a.b.class, (Function2) unb.e(c0140g, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(b.e.class)) {
                    aVar.b().put(b.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map5 = aVar.b().get(b.e.class);
                z65.e(map5);
                map5.put(a.b.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(b.f.class)) {
                    aVar.b().put(b.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map6 = aVar.b().get(b.f.class);
                z65.e(map6);
                map6.put(a.b.class, (Function2) unb.e(iVar, 2));
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map7 = aVar.b().get(b.a.class);
                z65.e(map7);
                map7.put(a.b.class, (Function2) unb.e(jVar, 2));
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(b.l.class)) {
                    aVar.b().put(b.l.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map8 = aVar.b().get(b.l.class);
                z65.e(map8);
                map8.put(a.b.class, (Function2) unb.e(kVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(b.c.class)) {
                    aVar.b().put(b.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map9 = aVar.b().get(b.c.class);
                z65.e(map9);
                map9.put(a.b.class, (Function2) unb.e(lVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.d.class)) {
                    aVar.b().put(b.d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map10 = aVar.b().get(b.d.class);
                z65.e(map10);
                map10.put(a.b.class, (Function2) unb.e(aVar2, 2));
                C0139b c0139b = new C0139b(this.a);
                if (!aVar.b().containsKey(b.m.class)) {
                    aVar.b().put(b.m.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map11 = aVar.b().get(b.m.class);
                z65.e(map11);
                map11.put(a.b.class, (Function2) unb.e(c0139b, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.C0137b.class)) {
                    aVar.b().put(b.C0137b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>> map12 = aVar.b().get(b.C0137b.class);
                z65.e(map12);
                map12.put(a.b.class, (Function2) unb.e(cVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<c, a>.a<c, a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        g() {
            super(1);
        }

        public final void a(ko3<c, a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(EditDeliveryAddressMapFSMPresenter.this);
            Map<Class<? extends c>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>>>> c = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c.put(c.a.class, aVar2.a());
            b bVar = new b(EditDeliveryAddressMapFSMPresenter.this);
            Map<Class<? extends c>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, a, bua<? extends c, a>>>>> c2 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c2.put(c.b.class, aVar3.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<c, a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$onDeleteConfirm$1", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a.b b;
        final /* synthetic */ EditDeliveryAddressMapFSMPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a.b bVar, EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.b = bVar;
            this.c = editDeliveryAddressMapFSMPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(this.b, this.c, cv1Var);
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
                a.b bVar = this.b;
                bVar.b(y56.m(bVar.a()));
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) this.c.getViewState()).D5(this.b.a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$onDeleteConfirm$2", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((i) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.e.a(y6.a.b(ck1.s));
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapFSMPresenter.this.getViewState()).a();
                EditDeliveryAddressMapFSMPresenter.this.c.c(EditDeliveryAddressMapFSMPresenter.this.l, EditDeliveryAddressMapFSMPresenter.this.f.i());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$onDeleteConfirm$3", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ a.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(a.b bVar, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.d = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(this.d, cv1Var);
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
                EditDeliveryAddressMapFSMPresenter.this.t0(this.d);
                EditDeliveryAddressMapFSMPresenter.this.n.error("Failed to delete delivery location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$saveClientDeliveryLocationToProfile$1", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(a.b bVar, cv1<? super k> cv1Var) {
            super(1, cv1Var);
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.s0(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$saveClientDeliveryLocationToProfile$2", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e91 e91Var, cv1<? super l> cv1Var) {
            super(2, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((l) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.x0(this.c);
                pd3 pd3Var = EditDeliveryAddressMapFSMPresenter.this.c;
                e91 e91Var = this.c;
                boolean i = EditDeliveryAddressMapFSMPresenter.this.f.i();
                if (EditDeliveryAddressMapFSMPresenter.this.f.e() == a.EnumC0142a.a) {
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
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$saveClientDeliveryLocationToProfile$3", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.n.error("Failed to save delivery location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$saveDeliveryLocationToProfileAndSetToState$1", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(a.b bVar, cv1<? super n> cv1Var) {
            super(1, cv1Var);
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new n(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((n) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.s0(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$saveDeliveryLocationToProfileAndSetToState$2", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends f3b implements Function2<sk9<? extends a.b>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ e91 d;
        final /* synthetic */ boolean e;
        final /* synthetic */ a.b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(e91 e91Var, boolean z, a.b bVar, cv1<? super o> cv1Var) {
            super(2, cv1Var);
            this.d = e91Var;
            this.e = z;
            this.f = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(this.d, this.e, this.f, cv1Var);
            oVar.b = obj;
            return oVar;
        }

        public final Object i(Object obj, cv1<? super Unit> cv1Var) {
            return ((o) create(sk9.a(obj), cv1Var)).invokeSuspend(Unit.a);
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
                EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter = EditDeliveryAddressMapFSMPresenter.this;
                e91 e91Var = this.d;
                boolean z2 = this.e;
                if (sk9.i(k)) {
                    a.b bVar = (a.b) k;
                    editDeliveryAddressMapFSMPresenter.x0(e91Var);
                    if (!editDeliveryAddressMapFSMPresenter.f.k()) {
                        pd3 pd3Var = editDeliveryAddressMapFSMPresenter.c;
                        boolean i = editDeliveryAddressMapFSMPresenter.f.i();
                        if (editDeliveryAddressMapFSMPresenter.f.e() == a.EnumC0142a.a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        pd3Var.b(e91Var, i, z, z2, bVar.a());
                    } else {
                        editDeliveryAddressMapFSMPresenter.h.m();
                    }
                }
                EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter2 = EditDeliveryAddressMapFSMPresenter.this;
                a.b bVar2 = this.f;
                Throwable d = sk9.d(k);
                if (d != null) {
                    editDeliveryAddressMapFSMPresenter2.n.error("Error select new DeliverablePlace with new locality", d);
                    editDeliveryAddressMapFSMPresenter2.t0(bVar2);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$saveDeliveryLocationToProfileAndSetToState$3", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ a.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(a.b bVar, cv1<? super p> cv1Var) {
            super(2, cv1Var);
            this.d = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(this.d, cv1Var);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((p) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.n.error("Error select new DeliverablePlace with new locality", (Throwable) this.b);
                EditDeliveryAddressMapFSMPresenter.this.t0(this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$showAddressFromGeocode$1", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a.b b;
        final /* synthetic */ EditDeliveryAddressMapFSMPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(a.b bVar, EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter, cv1<? super q> cv1Var) {
            super(1, cv1Var);
            this.b = bVar;
            this.c = editDeliveryAddressMapFSMPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new q(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((q) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = this.b;
                bVar.b(y56.p(bVar.a()));
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) this.c.getViewState()).D5(this.b.a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "getAddressResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$showAddressFromGeocode$2", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends f3b implements Function2<e.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ a.b c;
        final /* synthetic */ EditDeliveryAddressMapFSMPresenter d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(a.b bVar, EditDeliveryAddressMapFSMPresenter editDeliveryAddressMapFSMPresenter, cv1<? super r> cv1Var) {
            super(2, cv1Var);
            this.c = bVar;
            this.d = editDeliveryAddressMapFSMPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r rVar = new r(this.c, this.d, cv1Var);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(e.a aVar, cv1<? super Unit> cv1Var) {
            return ((r) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = this.c;
                bVar.b(f87.a(bVar.a(), (e.a) this.b, this.d.j));
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) this.d.getViewState()).D5(this.c.a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$showAddressFromGeocode$3", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ a.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(a.b bVar, cv1<? super s> cv1Var) {
            super(2, cv1Var);
            this.d = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s sVar = new s(this.d, cv1Var);
            sVar.b = obj;
            return sVar;
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
                EditDeliveryAddressMapFSMPresenter.this.n.error("Failed to convert coordinates to address", (Throwable) this.b);
                a.b bVar = this.d;
                bVar.b(f87.a(bVar.a(), e.a.C0146a.a, EditDeliveryAddressMapFSMPresenter.this.j));
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapFSMPresenter.this.getViewState()).D5(this.d.a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$showAddressFromGeocode$4", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new t(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((t) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.m = null;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lc66;", "bounds", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$showInitialCountryMapBounds$1", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends f3b implements Function2<c66, cv1<? super Unit>, Object> {
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
        public final Object invoke(c66 c66Var, cv1<? super Unit> cv1Var) {
            return ((u) create(c66Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) EditDeliveryAddressMapFSMPresenter.this.getViewState()).m(d66.c((c66) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$showInitialCountryMapBounds$2", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v(cv1<? super v> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v vVar = new v(cv1Var);
            vVar.b = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((v) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.n.warn("Can't fetch country map bounds", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$1", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(a.b bVar, cv1<? super w> cv1Var) {
            super(1, cv1Var);
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new w(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((w) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.s0(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk9a$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$2", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x extends f3b implements Function2<k9a.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ a.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(a.b bVar, cv1<? super x> cv1Var) {
            super(2, cv1Var);
            this.d = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x xVar = new x(this.d, cv1Var);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(k9a.a aVar, cv1<? super Unit> cv1Var) {
            return ((x) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.e0((k9a.a) this.b, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter$trySetClientDeliveryLocationToStateAndSaveToProfile$3", f = "EditDeliveryAddressMapFSMPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y(cv1<? super y> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y yVar = new y(cv1Var);
            yVar.b = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((y) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                EditDeliveryAddressMapFSMPresenter.this.n.error("Error handleSelectedAddress", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public EditDeliveryAddressMapFSMPresenter(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e eVar, pd3 pd3Var, wv5 wv5Var, gc gcVar, com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a aVar, hq3 hq3Var, Cdo cdo) {
        z65.h(eVar, "interactor");
        z65.h(pd3Var, "routingHandler");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(gcVar, "analytics");
        z65.h(aVar, "args");
        z65.h(hq3Var, "featureService");
        z65.h(cdo, "appInitializer");
        this.b = eVar;
        this.c = pd3Var;
        this.d = wv5Var;
        this.e = gcVar;
        this.f = aVar;
        this.g = hq3Var;
        this.h = cdo;
        this.i = x56.f.a();
        this.k = aVar.a().c();
        this.l = aVar.a();
        this.n = LoggerFactory.getLogger("DeliveryMapPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(a.b bVar) {
        if (!bVar.a().a()) {
            return;
        }
        if (this.d.a() == ry7.DENIED_FOREVER) {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).c();
        } else {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).E0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        p(z77.a(y87.a(this.b.f(this.k.d()), new d(null)), new e(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(k9a.a aVar, a.b bVar) {
        jx2 jx2Var;
        if (aVar instanceof k9a.a.C0407a) {
            this.c.d();
        } else if (aVar instanceof k9a.a.e) {
            r0(((k9a.a.e) aVar).a(), false, bVar);
        } else if (aVar instanceof k9a.a.c) {
            r0(((k9a.a.c) aVar).a(), true, bVar);
        } else if (aVar instanceof k9a.a.d) {
            t0(bVar);
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).q(((k9a.a.d) aVar).a());
        } else if (aVar instanceof k9a.a.b) {
            x56 a2 = bVar.a();
            e91 e2 = ru2.e(((k9a.a.b) aVar).a());
            if (e2 != null) {
                jx2Var = e2.c();
            } else {
                jx2Var = null;
            }
            z65.e(jx2Var);
            y56.s(a2, jx2Var);
            bVar.b(a2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mh5.a(Unit.a);
    }

    private final boolean f0(a.b bVar, qw1 qw1Var) {
        if (g0(qw1Var, bVar) && bVar.a().u() == f9.k) {
            return true;
        }
        return false;
    }

    private final boolean g0(qw1 qw1Var, a.b bVar) {
        qw1 d2 = bVar.a().s().d();
        qw1.a aVar = qw1.c;
        if ((aVar.c(d2) && d2.e(qw1Var)) || (aVar.b(d2) && aVar.b(qw1Var))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(a.b bVar) {
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).a();
        this.c.a(bVar.a().s().f(), this.f.b(), PresenterScopeKt.getPresenterScope(this), bVar.a().s().d(), new f(bVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(a.b bVar) {
        AddressDetailsFieldDesignDto addressDetailsFieldDesignDto;
        int w2;
        int e2;
        int e3;
        if (y56.h(bVar.a().l())) {
            bVar.b(y56.r(bVar.a()));
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).D5(bVar.a());
            return;
        }
        jx2 s2 = bVar.a().s();
        if (!this.f.k() && (addressDetailsFieldDesignDto = this.j) != null) {
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
        e91 b2 = e91.b(this.l, null, s2, false, 5, null);
        if (this.f.e() != a.EnumC0142a.a && !this.f.i()) {
            q0(b2, bVar);
        } else {
            z0(b2, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(LatLng latLng, a.b bVar) {
        qw1 a2 = rw1.a(latLng);
        if (!g0(a2, bVar) && bVar.a().a()) {
            this.e.a(md4.d(latLng.a, latLng.b));
            u0(a2, bVar);
        } else if (f0(bVar, a2)) {
            t0(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(String str, String str2, a.b bVar) {
        bVar.b(y56.i(bVar.a(), str, str2));
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).D5(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(String str, a.b bVar) {
        x56 a2 = bVar.a();
        e87 g2 = y56.g(a2, str);
        if (g2.b()) {
            this.e.a(md4.a(str, this.f.f(), true));
        }
        g2.a();
        bVar.b(a2);
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).D5(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(a.b bVar) {
        bVar.b(s87.a(bVar.a()));
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).D5(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackPressed() {
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(yv5 yv5Var, boolean z) {
        boolean z2 = yv5Var instanceof yv5.b;
        if (z2) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            yv5.b bVar = (yv5.b) yv5Var;
            i.a.a((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) viewState, uv5.a(bVar.a()), false, 2, null);
            this.e.a(md4.f(bVar.a()));
        } else if (yv5Var instanceof yv5.a) {
            this.n.warn("Failed to request location. ", ((yv5.a) yv5Var).a());
        } else {
            boolean z3 = yv5Var instanceof yv5.c;
        }
        if (!z2 && z) {
            v0();
        }
    }

    private final void q0(e91 e91Var, a.b bVar) {
        p(z77.a(y87.a(r77.a(this.b.g(e91Var), new k(bVar, null)), new l(e91Var, null)), new m(null)));
    }

    private final void r0(k9a.b bVar, boolean z, a.b bVar2) {
        boolean z2;
        e91 c2 = bVar.c();
        com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e eVar = this.b;
        if (this.f.e() == a.EnumC0142a.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        p(z77.a(y87.a(r77.a(eVar.e(bVar, z2), new n(bVar2, null)), new o(c2, z, bVar2, null)), new p(bVar2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(a.b bVar) {
        bVar.b(y56.k(bVar.a()));
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).D5(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(a.b bVar) {
        bVar.b(y56.n(bVar.a()));
        ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).D5(bVar.a());
    }

    private final void u0(qw1 qw1Var, a.b bVar) {
        l95 l95Var = this.m;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.m = p(o77.a(z77.a(y87.a(r77.a(this.b.a(qw1Var), new q(bVar, this, null)), new r(bVar, this, null)), new s(bVar, null)), new t(null)));
    }

    private final void v0() {
        p(z77.a(y87.a(this.b.c(), new u(null)), new v(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0() {
        qw1 d2;
        if (this.i.u() == f9.l) {
            return;
        }
        qw1.a aVar = qw1.c;
        if (aVar.b(this.i.s().d())) {
            d2 = this.k.d();
        } else {
            d2 = this.i.s().d();
        }
        if (aVar.c(d2)) {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).d0(d2.f());
        } else if (!y0()) {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(e91 e91Var) {
        if (this.f.e() == a.EnumC0142a.a) {
            this.e.a(y6.a.e(this.f.f(), true));
        }
        this.e.a(y6.a.c(this.f.f(), true, e91Var, this.l));
    }

    private final boolean y0() {
        if (this.d.a() != ry7.DENIED_FOREVER) {
            ((com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i) getViewState()).E0(true);
            return true;
        }
        return false;
    }

    private final void z0(e91 e91Var, a.b bVar) {
        p(z77.a(y87.a(r77.a(this.b.h(e91Var), new w(bVar, null)), new x(bVar, null)), new y(null)));
    }

    public final boolean d0() {
        if (this.f.e() == a.EnumC0142a.b && this.g.a(bq3.Y5)) {
            return true;
        }
        return false;
    }

    public final void i0(EditDeliveryAddressMapPresenter.a aVar, k9a.b bVar, a.b bVar2) {
        z65.h(aVar, "result");
        z65.h(bVar, "request");
        z65.h(bVar2, "data");
        if (aVar instanceof EditDeliveryAddressMapPresenter.a.b) {
            this.e.a(y6.a.g(y6.b.b));
            r0(bVar, true, bVar2);
            return;
        }
        this.e.a(y6.a.g(y6.b.c));
    }

    public final void l0(a.b bVar) {
        z65.h(bVar, "data");
        p(z77.a(y87.a(r77.a(this.b.d(this.l), new h(bVar, this, null)), new i(null)), new j(bVar, null)));
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<c, a> t() {
        return new bua<>(c.a.a, a.C0136a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<c, a>, Unit> v() {
        return new g();
    }
}
