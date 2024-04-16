package com.dodopizza.order.feature.selectionmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter;
import com.dodopizza.order.feature.selectionmap.presentation.b;
import com.dodopizza.order.feature.selectionmap.presentation.c;
import com.dodopizza.order.feature.selectionmap.presentation.d;
import com.dodopizza.order.feature.selectionmap.presentation.g;
import com.dodopizza.order.feature.selectionmap.presentation.j;
import com.dodopizza.order.feature.selectionmap.presentation.k;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c7a;
import defpackage.ko3;
import defpackage.l95;
import defpackage.qw1;
import defpackage.yv5;
import im.threads.business.transport.MessageAttributes;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SelectionMapPresenter.kt */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \u0097\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0098\u0001BK\b\u0007\u0012\u0006\u0010X\u001a\u00020U\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010l\u001a\u00020i\u0012\u0006\u0010p\u001a\u00020m\u0012\u0006\u0010t\u001a\u00020q¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J0\u0010\t\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\bH\u0016J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\"H\u0002J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\"H\u0002J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\"H\u0002J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\"H\u0002J\u0018\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010(\u001a\u00020'H\u0002J\u0018\u0010-\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\"H\u0002J\u0018\u00101\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020+H\u0002J\b\u00102\u001a\u00020\u0007H\u0002J\b\u00103\u001a\u00020+H\u0002J\u0010\u00104\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\"H\u0002J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020+H\u0002J\b\u00107\u001a\u00020\u0007H\u0002J\u0016\u0010;\u001a\u00020\u00072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\"\u0010>\u001a\u0004\u0018\u0001092\f\u0010:\u001a\b\u0012\u0004\u0012\u000209082\b\u0010=\u001a\u0004\u0018\u00010<H\u0002J:\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u0001092\b\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010B\u001a\u00020+H\u0002J\u0010\u0010E\u001a\u00020\u00072\u0006\u0010D\u001a\u00020<H\u0002J \u0010I\u001a\u0004\u0018\u0001092\f\u0010G\u001a\b\u0012\u0004\u0012\u0002090F2\u0006\u0010H\u001a\u00020@H\u0002J\u0018\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u0002092\u0006\u0010A\u001a\u00020@H\u0002J\u0018\u0010M\u001a\u00020+2\u0006\u0010A\u001a\u00020@2\u0006\u0010L\u001a\u000209H\u0002J\u0018\u0010P\u001a\u00020\u00072\u0006\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020+H\u0002J\u0010\u0010Q\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@H\u0002J\b\u0010R\u001a\u00020\rH\u0002J\u0016\u0010S\u001a\u00020\u00072\f\u0010G\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\b\u0010T\u001a\u00020\u0007H\u0002R\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\"\u0010\u008c\u0001\u001a\r \u0089\u0001*\u0005\u0018\u00010\u0088\u00010\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010{R\u001a\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0091\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/SelectionMapPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lcom/dodopizza/order/feature/selectionmap/presentation/k;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "Lkotlin/Function1;", "Lko3;", "", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "Lnaa;", "newMapType", "h0", "Le91;", "clientDeliveryLocation", "", "localityId", "g0", "Lbua;", "t", "Lc7a$a;", KustoStorage.KustoTable.COLUMN_SOURCE, "J0", "K0", "M0", "k0", "Ls88;", "pizzeriaFilterVO", "i0", "Ljaa;", "data", "D0", "m0", "F0", "Lx9a;", "x0", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "w0", "Lqw1;", MessageAttributes.COORDINATES, "B0", "A0", "", "s0", "t0", "Lyv5;", "result", "isInitialRequest", "y0", "E0", "N0", "j0", "focusOnUser", "r0", "v0", "", "Lb68;", "pizzeriasVo", "H0", "Ld88;", "tappedPizzeria", "p0", "tappedPizzeriaVO", "Lov5;", "userLocation", "focusOnUserLocation", "O0", "pizzeria", "L0", "", "pizzerias", "location", "n0", "nearestPizzeriaVO", "G0", "pizzeriaVO", "u0", "selectedPizzeriaVO", "isSelectedFromMap", "z0", "I0", "l0", "C0", "q0", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "b", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "initialData", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lhq3;", com.huawei.hms.push.e.a, "Lhq3;", "featureService", "Lr43;", "f", "Lr43;", "distanceMeasurer", "Lla8;", "g", "Lla8;", "pizzeriasFilterService", "Lcom/dodopizza/order/feature/selectionmap/presentation/g;", Image.TYPE_HIGH, "Lcom/dodopizza/order/feature/selectionmap/presentation/g;", "selectionMapInteractor", "Lwv5;", "i", "Lwv5;", "locationPermissionChecker", "Lhn3;", "j", "Lhn3;", "expectedPizzeriaType", "Ll95;", "k", "Ll95;", "deliveryGeocodeRequest", "Laaa;", "l", "Laaa;", "mapDeliveryCurrentState", "Ljx2;", Image.TYPE_MEDIUM, "Ljx2;", "defaultDeliveryLocation", "n", "Lnaa;", "currentMapType", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "o", "Lorg/slf4j/Logger;", "logger", "p", "loadPizzeriasJob", "", "q", "I", "deliveryShowedCount", "r", "pizzeriaShowedCount", "<init>", "(Lcom/dodopizza/order/feature/selectionmap/presentation/f;Lf63;Lgc;Lhq3;Lr43;Lla8;Lcom/dodopizza/order/feature/selectionmap/presentation/g;Lwv5;)V", Image.TYPE_SMALL, "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SelectionMapPresenter extends MoxyFSMPresenter<com.dodopizza.order.feature.selectionmap.presentation.k, com.dodopizza.order.feature.selectionmap.presentation.j, Object> {
    public static final a s = new a(null);
    public static final int t = 8;
    private final com.dodopizza.order.feature.selectionmap.presentation.f b;
    private final f63 c;
    private final gc d;
    private final hq3 e;
    private final r43 f;
    private final la8 g;
    private final com.dodopizza.order.feature.selectionmap.presentation.g h;
    private final wv5 i;
    private final hn3 j;
    private l95 k;
    private aaa l;
    private final jx2 m;
    private naa n;
    private final Logger o;
    private l95 p;
    private int q;
    private int r;

    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/SelectionMapPresenter$a;", "", "", "NEAREST_PIZZERIA_DISTANCE_LIMIT_IN_METER", "I", "REPEAT_MAX_COUNT", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$getDeliveryInitialData$1", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<g.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(g.b bVar, cv1<? super Unit> cv1Var) {
            return ((b) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                g.b bVar = (g.b) this.b;
                if (bVar instanceof g.b.a) {
                    SelectionMapPresenter selectionMapPresenter = SelectionMapPresenter.this;
                    selectionMapPresenter.l = selectionMapPresenter.l.r(((g.b.a) bVar).a(), SelectionMapPresenter.this.m);
                }
                ((com.dodopizza.order.feature.selectionmap.presentation.k) SelectionMapPresenter.this.getViewState()).Ne(SelectionMapPresenter.this.l, SelectionMapPresenter.this.l0());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$getDeliveryInitialData$2", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
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
                SelectionMapPresenter selectionMapPresenter = SelectionMapPresenter.this;
                selectionMapPresenter.l = selectionMapPresenter.l.q();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb68;", "kotlin.jvm.PlatformType", "pizzeria1", "pizzeria2", "", "a", "(Lb68;Lb68;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function2<b68, b68, Integer> {
        final /* synthetic */ ov5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ov5 ov5Var) {
            super(2);
            this.b = ov5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Integer invoke(b68 b68Var, b68 b68Var2) {
            return Integer.valueOf(Float.compare(SelectionMapPresenter.this.f.a(b68Var.g().x(), this.b), SelectionMapPresenter.this.f.a(b68Var2.g().x(), this.b)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$loadPizzerias$1", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.order.feature.selectionmap.presentation.k) SelectionMapPresenter.this.getViewState()).L5(c.b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljaa;", "selectPizzeriaVOData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$loadPizzerias$2", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<jaa, cv1<? super Unit>, Object> {
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
        public final Object invoke(jaa jaaVar, cv1<? super Unit> cv1Var) {
            return ((f) create(jaaVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            bua buaVar;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                jaa jaaVar = (jaa) this.b;
                List<b68> f = SelectionMapPresenter.this.h.f(jaaVar);
                SelectionMapPresenter.this.H0(f);
                if (SelectionMapPresenter.this.r <= 1) {
                    buaVar = SelectionMapPresenter.P0(SelectionMapPresenter.this, jaaVar, SelectionMapPresenter.this.p0(f, jaaVar.d()), jaaVar.e(), false, 8, null);
                } else {
                    buaVar = new bua(j.d.a, new z9a(jaa.b(jaaVar, null, null, jaaVar.e(), 3, null), null));
                }
                SelectionMapPresenter.this.y(buaVar);
                Unit unit = Unit.a;
                SelectionMapPresenter selectionMapPresenter = SelectionMapPresenter.this;
                if (selectionMapPresenter.r <= 1) {
                    ((com.dodopizza.order.feature.selectionmap.presentation.k) selectionMapPresenter.getViewState()).o(false);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$loadPizzerias$3", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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
                ((com.dodopizza.order.feature.selectionmap.presentation.k) SelectionMapPresenter.this.getViewState()).L5(c.a.a);
                SelectionMapPresenter.this.z(j.c.a, y9a.a);
                SelectionMapPresenter.this.o.error("Failed to get pizzeria list\n", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function1<ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function1<ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object>, Unit> {
            final /* synthetic */ SelectionMapPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Ly9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Ly9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0197a extends ej5 implements Function2<a.C0211a, y9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0197a(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(a.C0211a c0211a, y9a y9aVar) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(y9aVar, "<anonymous parameter 1>");
                    if (this.a.n == naa.b) {
                        ((com.dodopizza.order.feature.selectionmap.presentation.k) this.a.getViewState()).L5(c.b.a);
                        this.a.g.b();
                        this.a.M0();
                        this.a.d.a(ix9.a("restaurant"));
                        this.a.r++;
                    } else {
                        this.a.d.a(md4.c());
                        this.a.d.a(ix9.a("delivery"));
                        this.a.m0();
                        ((com.dodopizza.order.feature.selectionmap.presentation.k) this.a.getViewState()).Ne(new x9a(new aaa(f9.j, null, null, null, null, 30, null)).a(), this.a.l0());
                        this.a.q++;
                    }
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$i;", "<anonymous parameter 0>", "Ly9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$i;Ly9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class b extends ej5 implements Function2<d.i, y9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.i iVar, y9a y9aVar) {
                    z65.h(iVar, "<anonymous parameter 0>");
                    z65.h(y9aVar, "<anonymous parameter 1>");
                    if (this.a.n != naa.b) {
                        this.a.F0();
                        return new bua<>(j.d.a, new x9a(this.a.l));
                    }
                    this.a.z(j.e.a, y9a.a);
                    this.a.v0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SelectionMapPresenter selectionMapPresenter) {
                super(1);
                this.a = selectionMapPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object> aVar) {
                z65.h(aVar, "$this$state");
                C0197a c0197a = new C0197a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(y9a.class, (Function2) unb.e(c0197a, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(d.i.class)) {
                    aVar.b().put(d.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map2 = aVar.b().get(d.i.class);
                z65.e(map2);
                map2.put(y9a.class, (Function2) unb.e(bVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function1<ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object>, Unit> {
            final /* synthetic */ SelectionMapPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$o;", "<anonymous parameter 0>", "Ly9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$o;Ly9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class a extends ej5 implements Function2<d.o, y9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.o oVar, y9a y9aVar) {
                    z65.h(oVar, "<anonymous parameter 0>");
                    z65.h(y9aVar, "<anonymous parameter 1>");
                    this.a.z(j.e.a, y9a.a);
                    this.a.v0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$g;", "<anonymous parameter 0>", "Ly9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$g;Ly9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$h$b$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0198b extends ej5 implements Function2<d.g, y9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0198b(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.g gVar, y9a y9aVar) {
                    z65.h(gVar, "<anonymous parameter 0>");
                    z65.h(y9aVar, "<anonymous parameter 1>");
                    this.a.q0();
                    return new bua<>(j.a.a, y9a.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SelectionMapPresenter selectionMapPresenter) {
                super(1);
                this.a = selectionMapPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.o.class)) {
                    aVar.b().put(d.o.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map = aVar.b().get(d.o.class);
                z65.e(map);
                map.put(y9a.class, (Function2) unb.e(aVar2, 2));
                C0198b c0198b = new C0198b(this.a);
                if (!aVar.b().containsKey(d.g.class)) {
                    aVar.b().put(d.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map2 = aVar.b().get(d.g.class);
                z65.e(map2);
                map2.put(y9a.class, (Function2) unb.e(c0198b, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function1<ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object>, Unit> {
            final /* synthetic */ SelectionMapPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$k;", "<anonymous parameter 0>", "Lx9a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$k;Lx9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class a extends ej5 implements Function2<d.k, x9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.k kVar, x9a x9aVar) {
                    z65.h(kVar, "<anonymous parameter 0>");
                    z65.h(x9aVar, "data");
                    this.a.x0(x9aVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$j;", "event", "Lx9a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$j;Lx9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class b extends ej5 implements Function2<d.j, x9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.j jVar, x9a x9aVar) {
                    z65.h(jVar, "event");
                    z65.h(x9aVar, "data");
                    this.a.w0(jVar.a(), x9aVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$h;", "event", "Lx9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$h;Lx9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$h$c$c  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0199c extends ej5 implements Function2<d.h, x9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0199c(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.h hVar, x9a x9aVar) {
                    z65.h(hVar, "event");
                    z65.h(x9aVar, "<anonymous parameter 1>");
                    this.a.d.a(c7a.a.c());
                    this.a.y0(hVar.a(), hVar.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$e;", "<anonymous parameter 0>", "Lx9a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$e;Lx9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class d extends ej5 implements Function2<d.e, x9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.e eVar, x9a x9aVar) {
                    z65.h(eVar, "<anonymous parameter 0>");
                    z65.h(x9aVar, "data");
                    this.a.d.a(md4.b());
                    this.a.d.a(md4.e());
                    this.a.j0(x9aVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$g;", "<anonymous parameter 0>", "Lz9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$g;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class e extends ej5 implements Function2<d.g, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.g gVar, z9a z9aVar) {
                    z65.h(gVar, "<anonymous parameter 0>");
                    z65.h(z9aVar, "<anonymous parameter 1>");
                    this.a.q0();
                    return new bua<>(j.a.a, y9a.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$a;", "event", "Lz9a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$a;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class f extends ej5 implements Function2<d.a, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.a aVar, z9a z9aVar) {
                    z65.h(aVar, "event");
                    z65.h(z9aVar, "data");
                    s88 a = aVar.a();
                    if (a != null) {
                        this.a.d.a(gd.f(a.a(), !a.b()));
                    }
                    s88 a2 = aVar.a();
                    if (a2 != null) {
                        this.a.i0(a2);
                    }
                    this.a.D0(z9aVar.a());
                    this.a.k0();
                    return new bua<>(j.d.a, new z9a(z9aVar.a(), null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$m;", "event", "Lz9a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$m;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class g extends ej5 implements Function2<d.m, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.m mVar, z9a z9aVar) {
                    z65.h(mVar, "event");
                    z65.h(z9aVar, "data");
                    this.a.d.a(c7a.a.j(mVar.a(), c7a.c.c, Integer.valueOf(mVar.b() + 1)));
                    return SelectionMapPresenter.P0(this.a, z9aVar.a(), this.a.p0(this.a.h.f(z9aVar.a()), mVar.a()), z9aVar.a().e(), false, 8, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$p;", "<anonymous parameter 0>", "Lz9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$p;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$h$c$h  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0200h extends ej5 implements Function2<d.p, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0200h(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.p pVar, z9a z9aVar) {
                    z65.h(pVar, "<anonymous parameter 0>");
                    z65.h(z9aVar, "<anonymous parameter 1>");
                    this.a.d.a(c7a.a.a());
                    this.a.J0(c7a.a.c);
                    this.a.r0(false);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$n;", "event", "Lz9a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$n;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class i extends ej5 implements Function2<d.n, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.n nVar, z9a z9aVar) {
                    z65.h(nVar, "event");
                    z65.h(z9aVar, "data");
                    this.a.d.a(c7a.k(c7a.a, nVar.a().g(), c7a.c.b, null, 4, null));
                    return SelectionMapPresenter.P0(this.a, z9aVar.a(), nVar.a(), z9aVar.a().e(), false, 8, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$c;", "<anonymous parameter 0>", "Lz9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$c;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class j extends ej5 implements Function2<d.c, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.c cVar, z9a z9aVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(z9aVar, "<anonymous parameter 1>");
                    ((com.dodopizza.order.feature.selectionmap.presentation.k) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$d;", "<anonymous parameter 0>", "Lz9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$d;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class k extends ej5 implements Function2<d.C0204d, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.C0204d c0204d, z9a z9aVar) {
                    z65.h(c0204d, "<anonymous parameter 0>");
                    z65.h(z9aVar, "<anonymous parameter 1>");
                    ((com.dodopizza.order.feature.selectionmap.presentation.k) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$f;", "event", "Lz9a;", "data", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$f;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class l extends ej5 implements Function2<d.f, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.f fVar, z9a z9aVar) {
                    z65.h(fVar, "event");
                    z65.h(z9aVar, "data");
                    View viewState = this.a.getViewState();
                    z65.g(viewState, "getViewState(...)");
                    k.a.a((com.dodopizza.order.feature.selectionmap.presentation.k) viewState, uv5.a(fVar.b()), false, 2, null);
                    return this.a.O0(z9aVar.a(), null, fVar.b(), fVar.a());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMapPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$e;", "<anonymous parameter 0>", "Lz9a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/selectionmap/presentation/j;", "", "a", "(Lcom/dodopizza/order/feature/selectionmap/presentation/d$e;Lz9a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class m extends ej5 implements Function2<d.e, z9a, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>> {
                final /* synthetic */ SelectionMapPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                m(SelectionMapPresenter selectionMapPresenter) {
                    super(2);
                    this.a = selectionMapPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object> invoke(d.e eVar, z9a z9aVar) {
                    z65.h(eVar, "<anonymous parameter 0>");
                    z65.h(z9aVar, "<anonymous parameter 1>");
                    this.a.d.a(md4.b());
                    this.a.r0(true);
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(SelectionMapPresenter selectionMapPresenter) {
                super(1);
                this.a = selectionMapPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object> aVar) {
                z65.h(aVar, "$this$state");
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(d.g.class)) {
                    aVar.b().put(d.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map = aVar.b().get(d.g.class);
                z65.e(map);
                map.put(z9a.class, (Function2) unb.e(eVar, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(d.a.class)) {
                    aVar.b().put(d.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map2 = aVar.b().get(d.a.class);
                z65.e(map2);
                map2.put(z9a.class, (Function2) unb.e(fVar, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(d.m.class)) {
                    aVar.b().put(d.m.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map3 = aVar.b().get(d.m.class);
                z65.e(map3);
                map3.put(z9a.class, (Function2) unb.e(gVar, 2));
                C0200h c0200h = new C0200h(this.a);
                if (!aVar.b().containsKey(d.p.class)) {
                    aVar.b().put(d.p.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map4 = aVar.b().get(d.p.class);
                z65.e(map4);
                map4.put(z9a.class, (Function2) unb.e(c0200h, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(d.n.class)) {
                    aVar.b().put(d.n.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map5 = aVar.b().get(d.n.class);
                z65.e(map5);
                map5.put(z9a.class, (Function2) unb.e(iVar, 2));
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(d.c.class)) {
                    aVar.b().put(d.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map6 = aVar.b().get(d.c.class);
                z65.e(map6);
                map6.put(z9a.class, (Function2) unb.e(jVar, 2));
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(d.C0204d.class)) {
                    aVar.b().put(d.C0204d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map7 = aVar.b().get(d.C0204d.class);
                z65.e(map7);
                map7.put(z9a.class, (Function2) unb.e(kVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(d.f.class)) {
                    aVar.b().put(d.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map8 = aVar.b().get(d.f.class);
                z65.e(map8);
                map8.put(z9a.class, (Function2) unb.e(lVar, 2));
                m mVar = new m(this.a);
                if (!aVar.b().containsKey(d.e.class)) {
                    aVar.b().put(d.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map9 = aVar.b().get(d.e.class);
                z65.e(map9);
                map9.put(z9a.class, (Function2) unb.e(mVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.k.class)) {
                    aVar.b().put(d.k.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map10 = aVar.b().get(d.k.class);
                z65.e(map10);
                map10.put(x9a.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(d.j.class)) {
                    aVar.b().put(d.j.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map11 = aVar.b().get(d.j.class);
                z65.e(map11);
                map11.put(x9a.class, (Function2) unb.e(bVar, 2));
                C0199c c0199c = new C0199c(this.a);
                if (!aVar.b().containsKey(d.h.class)) {
                    aVar.b().put(d.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map12 = aVar.b().get(d.h.class);
                z65.e(map12);
                map12.put(x9a.class, (Function2) unb.e(c0199c, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(d.e.class)) {
                    aVar.b().put(d.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>> map13 = aVar.b().get(d.e.class);
                z65.e(map13);
                map13.put(x9a.class, (Function2) unb.e(dVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>.a<com.dodopizza.order.feature.selectionmap.presentation.j, Object> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        h() {
            super(1);
        }

        public final void a(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(SelectionMapPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.selectionmap.presentation.j>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(j.b.class, aVar2.a());
            b bVar = new b(SelectionMapPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.selectionmap.presentation.j>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c3.put(j.c.class, aVar3.a());
            c cVar = new c(SelectionMapPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.selectionmap.presentation.j>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, Object, bua<? extends com.dodopizza.order.feature.selectionmap.presentation.j, Object>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(j.d.class, aVar4.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$showAddressFromGeocode$1", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ x9a b;
        final /* synthetic */ SelectionMapPresenter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(x9a x9aVar, SelectionMapPresenter selectionMapPresenter, cv1<? super i> cv1Var) {
            super(1, cv1Var);
            this.b = x9aVar;
            this.c = selectionMapPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new i(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                x9a x9aVar = this.b;
                x9aVar.b(aaa.b(x9aVar.a(), f9.l, null, null, x7.c(x7.a(this.b.a().c(), false), false), null, 22, null));
                ((com.dodopizza.order.feature.selectionmap.presentation.k) this.c.getViewState()).Ne(this.b.a(), this.c.l0());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "getAddressResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$showAddressFromGeocode$2", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<g.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ x9a c;
        final /* synthetic */ SelectionMapPresenter d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(x9a x9aVar, SelectionMapPresenter selectionMapPresenter, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.c = x9aVar;
            this.d = selectionMapPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(this.c, this.d, cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(g.a aVar, cv1<? super Unit> cv1Var) {
            return ((j) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                x9a x9aVar = this.c;
                x9aVar.b(com.dodopizza.order.feature.selectionmap.presentation.a.a(x9aVar.a(), (g.a) this.b));
                ((com.dodopizza.order.feature.selectionmap.presentation.k) this.d.getViewState()).Ne(this.c.a(), this.d.l0());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$showAddressFromGeocode$3", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ x9a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(x9a x9aVar, cv1<? super k> cv1Var) {
            super(2, cv1Var);
            this.d = x9aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(this.d, cv1Var);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((k) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectionMapPresenter.this.o.error("Failed to convert coordinates to address", (Throwable) this.b);
                x9a x9aVar = this.d;
                x9aVar.b(com.dodopizza.order.feature.selectionmap.presentation.a.a(x9aVar.a(), g.a.C0206a.a));
                ((com.dodopizza.order.feature.selectionmap.presentation.k) SelectionMapPresenter.this.getViewState()).Ne(this.d.a(), SelectionMapPresenter.this.l0());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$showAddressFromGeocode$4", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(cv1Var);
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
                SelectionMapPresenter.this.k = null;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lc66;", "bounds", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$showInitialCountryMapBounds$1", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function2<c66, cv1<? super Unit>, Object> {
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
        public final Object invoke(c66 c66Var, cv1<? super Unit> cv1Var) {
            return ((m) create(c66Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.order.feature.selectionmap.presentation.k) SelectionMapPresenter.this.getViewState()).m(d66.c((c66) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$showInitialCountryMapBounds$2", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectionMapPresenter.this.o.warn("Can't fetch country map bounds", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter$trackSelectPizzeriaScreen$1", f = "SelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
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
                SelectionMapPresenter.this.o.warn("Failed to track select pizzeria screen", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SelectionMapPresenter(com.dodopizza.order.feature.selectionmap.presentation.f fVar, f63 f63Var, gc gcVar, hq3 hq3Var, r43 r43Var, la8 la8Var, com.dodopizza.order.feature.selectionmap.presentation.g gVar, wv5 wv5Var) {
        jx2 jx2Var;
        z65.h(fVar, "initialData");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(r43Var, "distanceMeasurer");
        z65.h(la8Var, "pizzeriasFilterService");
        z65.h(gVar, "selectionMapInteractor");
        z65.h(wv5Var, "locationPermissionChecker");
        this.b = fVar;
        this.c = f63Var;
        this.d = gcVar;
        this.e = hq3Var;
        this.f = r43Var;
        this.g = la8Var;
        this.h = gVar;
        this.i = wv5Var;
        hn3 c2 = fVar.c();
        this.j = c2 == null ? hn3.c : c2;
        this.l = new aaa(f9.j, null, null, null, null, 30, null);
        e91 a2 = fVar.a();
        if (a2 != null) {
            jx2Var = a2.c();
        } else {
            jx2Var = null;
        }
        this.m = jx2Var;
        this.n = fVar.k();
        this.o = LoggerFactory.getLogger("SelectionMapPresenter");
    }

    private final void A0(x9a x9aVar) {
        x9aVar.b(aaa.b(x9aVar.a(), f9.m, null, null, null, null, 30, null));
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).Ne(x9aVar.a(), l0());
    }

    private final void B0(qw1 qw1Var, x9a x9aVar) {
        l95 l95Var = this.k;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.k = p(o77.a(z77.a(y87.a(r77.a(this.h.a(qw1Var), new i(x9aVar, this, null)), new j(x9aVar, this, null)), new k(x9aVar, null)), new l(null)));
    }

    private final void C0(List<b68> list) {
        if (list.isEmpty()) {
            return;
        }
        LatLngBounds.a h2 = LatLngBounds.h();
        z65.g(h2, "builder(...)");
        for (b68 b68Var : list) {
            h2.b(uv5.a(b68Var.g().x()));
        }
        LatLngBounds a2 = h2.a();
        z65.g(a2, "build(...)");
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).m(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(jaa jaaVar) {
        List<b68> f2 = this.h.f(jaaVar);
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).L5(new c.C0203c(this.g.c(f2), this.g.e(f2), this.e.a(bq3.q)));
    }

    private final void E0() {
        p(z77.a(y87.a(this.h.c(), new m(null)), new n(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0() {
        qw1 d2;
        if (this.l.l() == f9.l) {
            return;
        }
        qw1.a aVar = qw1.c;
        if (aVar.b(this.l.j().d())) {
            jx2 jx2Var = this.m;
            if (jx2Var != null) {
                d2 = jx2Var.d();
            } else {
                d2 = null;
            }
        } else {
            d2 = this.l.j().d();
        }
        if (d2 != null && aVar.c(d2)) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            k.a.a((com.dodopizza.order.feature.selectionmap.presentation.k) viewState, d2.f(), false, 2, null);
        } else if (!N0()) {
            E0();
        }
    }

    private final void G0(b68 b68Var, ov5 ov5Var) {
        boolean z;
        LatLngBounds.a b2 = LatLngBounds.h().b(uv5.a(b68Var.g().x())).b(uv5.a(ov5Var));
        z65.g(b2, "include(...)");
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).c0(b68Var);
        LatLngBounds a2 = b2.a();
        z65.g(a2, "build(...)");
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).m(a2);
        com.dodopizza.order.feature.selectionmap.presentation.k kVar = (com.dodopizza.order.feature.selectionmap.presentation.k) getViewState();
        d88 g2 = b68Var.g();
        jb7 f2 = b68Var.f();
        hn3 hn3Var = this.j;
        boolean a3 = this.e.a(bq3.q);
        Boolean k2 = b68Var.k();
        if (k2 != null) {
            z = k2.booleanValue();
        } else {
            z = false;
        }
        kVar.W7(g2, f2, hn3Var, a3, false, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(List<b68> list) {
        List<b68> list2 = list;
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).L5(new c.C0203c(this.g.c(list2), this.g.e(list2), this.e.a(bq3.q)));
    }

    private final void I0(ov5 ov5Var) {
        View viewState = getViewState();
        z65.g(viewState, "getViewState(...)");
        k.a.a((com.dodopizza.order.feature.selectionmap.presentation.k) viewState, uv5.a(ov5Var), false, 2, null);
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).x0(uv5.a(ov5Var));
    }

    private final void L0(d88 d88Var) {
        this.d.a(c7a.k(c7a.a, d88Var, c7a.c.d, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0() {
        p(z77.a(this.h.b(), new o(null)));
    }

    private final boolean N0() {
        if (this.i.a() != ry7.DENIED_FOREVER) {
            ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).E0(true);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<com.dodopizza.order.feature.selectionmap.presentation.j, Object> O0(jaa jaaVar, b68 b68Var, ov5 ov5Var, boolean z) {
        d88 d88Var;
        Object Z;
        d88 d88Var2 = null;
        if (b68Var != null) {
            d88Var = b68Var.g();
        } else {
            d88Var = null;
        }
        jaa b2 = jaa.b(jaaVar, null, null, ov5Var, 3, null);
        List<b68> f2 = this.h.f(jaaVar);
        if (ov5Var != null && z) {
            I0(ov5Var);
            return new bua<>(j.d.a, new z9a(b2, d88Var));
        } else if (b2.c().size() == 1) {
            Z = sc1.Z(f2);
            b68 b68Var2 = (b68) Z;
            z0(b68Var2, false);
            L0(b68Var2.g());
            return new bua<>(j.d.a, new z9a(b2, b68Var2.g()));
        } else if (ov5Var != null && d88Var == null) {
            I0(ov5Var);
            b68 n0 = n0(f2, ov5Var);
            if (n0 != null && u0(ov5Var, n0)) {
                d88Var2 = n0.g();
                G0(n0, ov5Var);
                ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).x3(d88Var2);
                L0(n0.g());
            } else {
                C0(f2);
            }
            return new bua<>(j.d.a, new z9a(b2, d88Var2));
        } else if (ov5Var != null && d88Var != null) {
            z0(b68Var, true);
            return new bua<>(j.d.a, new z9a(b2, d88Var));
        } else if (ov5Var == null && b68Var == null) {
            C0(f2);
            return new bua<>(j.d.a, new z9a(b2, null));
        } else if (ov5Var == null && b68Var != null) {
            z0(b68Var, true);
            return new bua<>(j.d.a, new z9a(b2, d88Var));
        } else {
            return new bua<>(j.d.a, new z9a(b2, d88Var));
        }
    }

    static /* synthetic */ bua P0(SelectionMapPresenter selectionMapPresenter, jaa jaaVar, b68 b68Var, ov5 ov5Var, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        return selectionMapPresenter.O0(jaaVar, b68Var, ov5Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(s88 s88Var) {
        if (s88Var.b()) {
            this.g.d(s88Var.a());
        } else {
            this.g.f(s88Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(x9a x9aVar) {
        if (!x9aVar.a().h()) {
            return;
        }
        if (this.i.a() == ry7.DENIED_FOREVER) {
            ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).c();
        } else {
            ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).E0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        List<i88> a2 = this.g.a();
        if (!a2.isEmpty()) {
            this.d.a(gd.c(a2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e91 l0() {
        e91 a2 = this.b.a();
        if (a2 == null) {
            return e91.e;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        qw1 qw1Var;
        jx2 jx2Var = this.m;
        if (jx2Var != null) {
            qw1Var = jx2Var.d();
        } else {
            qw1Var = null;
        }
        if (qw1Var == null) {
            return;
        }
        p(z77.a(y87.a(this.h.e(this.m.d()), new b(null)), new c(null)));
    }

    private final b68 n0(Collection<b68> collection, ov5 ov5Var) {
        List y0;
        Object b0;
        final d dVar = new d(ov5Var);
        y0 = sc1.y0(collection, new Comparator() { // from class: kaa
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int o0;
                o0 = SelectionMapPresenter.o0(Function2.this, obj, obj2);
                return o0;
            }
        });
        b0 = sc1.b0(y0);
        return (b68) b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o0(Function2 function2, Object obj, Object obj2) {
        z65.h(function2, "$tmp0");
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b68 p0(List<b68> list, d88 d88Var) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((b68) next).g().getId();
            if (d88Var != null) {
                obj = d88Var.getId();
            }
            if (z65.c(id, obj)) {
                obj = next;
                break;
            }
        }
        return (b68) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        this.c.i(this.b.f(), b.C0202b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(boolean z) {
        if (this.i.a() == ry7.DENIED_FOREVER) {
            J0(c7a.a.d);
            ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).c();
            return;
        }
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).o(z);
    }

    private final boolean s0(x9a x9aVar, qw1 qw1Var) {
        if (t0(qw1Var, x9aVar) && x9aVar.a().l() == f9.k) {
            return true;
        }
        return false;
    }

    private final boolean t0(qw1 qw1Var, x9a x9aVar) {
        qw1 d2 = x9aVar.a().j().d();
        qw1.a aVar = qw1.c;
        if ((aVar.c(d2) && d2.e(qw1Var)) || (aVar.b(d2) && aVar.b(qw1Var))) {
            return true;
        }
        return false;
    }

    private final boolean u0(ov5 ov5Var, b68 b68Var) {
        if (this.f.a(ov5Var, b68Var.g().x()) < 25000.0f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        this.p = p(z77.a(y87.a(r77.a(this.h.d(), new e(null)), new f(null)), new g(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(LatLng latLng, x9a x9aVar) {
        qw1 a2 = rw1.a(latLng);
        if (!t0(a2, x9aVar) && x9aVar.a().h()) {
            this.d.a(md4.d(latLng.a, latLng.b));
            B0(a2, x9aVar);
        } else if (s0(x9aVar, a2)) {
            A0(x9aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(x9a x9aVar) {
        x9aVar.b(aaa.b(x9aVar.a(), f9.k, null, null, null, null, 30, null));
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).Ne(x9aVar.a(), l0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(yv5 yv5Var, boolean z) {
        boolean z2 = yv5Var instanceof yv5.b;
        if (z2) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            yv5.b bVar = (yv5.b) yv5Var;
            k.a.a((com.dodopizza.order.feature.selectionmap.presentation.k) viewState, uv5.a(bVar.a()), false, 2, null);
            this.d.a(md4.f(bVar.a()));
        } else if (yv5Var instanceof yv5.a) {
            this.o.warn("Failed to request location. ", ((yv5.a) yv5Var).a());
        } else {
            boolean z3 = yv5Var instanceof yv5.c;
        }
        if (!z2 && z) {
            E0();
        }
    }

    private final void z0(b68 b68Var, boolean z) {
        boolean z2;
        View viewState = getViewState();
        z65.g(viewState, "getViewState(...)");
        k.a.a((com.dodopizza.order.feature.selectionmap.presentation.k) viewState, uv5.a(b68Var.g().x()), false, 2, null);
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).c0(b68Var);
        com.dodopizza.order.feature.selectionmap.presentation.k kVar = (com.dodopizza.order.feature.selectionmap.presentation.k) getViewState();
        d88 g2 = b68Var.g();
        jb7 f2 = b68Var.f();
        hn3 hn3Var = this.j;
        boolean a2 = this.e.a(bq3.q);
        Boolean k2 = b68Var.k();
        if (k2 != null) {
            z2 = k2.booleanValue();
        } else {
            z2 = false;
        }
        kVar.W7(g2, f2, hn3Var, a2, z, z2);
    }

    public final void J0(c7a.a aVar) {
        z65.h(aVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.d.a(c7a.a.b(aVar));
    }

    public final void K0() {
        this.d.a(c7a.a.c());
    }

    public final void g0(e91 e91Var, String str) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(str, "localityId");
        this.q = 0;
        this.l = this.l.r(str, e91Var.c());
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).Ne(this.l, l0());
        ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).Yd(e91Var.c().d().f(), false);
    }

    public final void h0(naa naaVar) {
        z65.h(naaVar, "newMapType");
        this.n = naaVar;
        if (naaVar == naa.a) {
            this.q++;
            l95 l95Var = this.p;
            if (l95Var != null) {
                l95.a.a(l95Var, null, 1, null);
            }
            ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).y7();
            if (!z65.c(r().c(), j.e.a) && !z65.c(r().c(), j.b.a)) {
                if (this.q <= 1) {
                    m0();
                }
                z(j.d.a, new x9a(this.l));
                if (this.q <= 1) {
                    ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).Ne(new x9a(new aaa(f9.j, null, null, null, null, 30, null)).a(), l0());
                    F0();
                    return;
                }
                ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).K7(new x9a(new aaa(f9.j, null, null, null, null, 30, null)).a(), l0());
                return;
            }
            return;
        }
        com.dodopizza.order.feature.selectionmap.presentation.j c2 = r().c();
        j.e eVar = j.e.a;
        if (!z65.c(c2, eVar) && !z65.c(r().c(), j.b.a)) {
            l95 l95Var2 = this.k;
            if (l95Var2 != null) {
                l95.a.a(l95Var2, null, 1, null);
            }
            this.r++;
            ((com.dodopizza.order.feature.selectionmap.presentation.k) getViewState()).d6();
            z(eVar, y9a.a);
            v0();
        }
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<com.dodopizza.order.feature.selectionmap.presentation.j, Object> t() {
        return new bua<>(j.b.a, y9a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<com.dodopizza.order.feature.selectionmap.presentation.j, Object>, Unit> v() {
        return new h();
    }
}
