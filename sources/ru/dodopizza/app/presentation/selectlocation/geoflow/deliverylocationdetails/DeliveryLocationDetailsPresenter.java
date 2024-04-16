package ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.suggestions.presentation.b;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.j6a;
import defpackage.tmb;
import defpackage.y6;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter;
/* compiled from: DeliveryLocationDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\f\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%)B7\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208¢\u0006\u0004\bU\u0010VJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\bH\u0014J\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0003J\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010@\u001a\n =*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00120E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010Q¨\u0006X"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lfy2;", "", "fieldId", "value", "", "R", "", "L", "N", "Q", "M", "", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "addressDetailsVO", "O", "P", "Ljx2;", "deliveryLocation", "K", "onFirstViewAttach", "F", "mainAddress", "H", "field", "text", "E", "onBackPressed", "G", "J", "C", "D", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a;", "result", "B", "Lf63;", "a", "Lf63;", "router", "Lsx2;", "b", "Lsx2;", "interactor", "Lrx2;", com.huawei.hms.opendevice.c.a, "Lrx2;", "data", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lay1;", "f", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "", Image.TYPE_HIGH, "I", "resultId", "Lfr6;", "i", "Lfr6;", "_deliveryLocation", "j", "Ljava/lang/String;", "_initialLocalityId", "", "k", "Ljava/util/Map;", "previousValues", "z", "()Z", "_localityIsChanged", "A", "_mustShowClearCartDialog", "<init>", "(Lf63;Lsx2;Lrx2;Lhq3;Lgc;Lay1;)V", "l", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeliveryLocationDetailsPresenter extends BasePresenter<fy2> {
    public static final b l = new b(null);
    private final f63 a;
    private final sx2 b;
    private final rx2 c;
    private final hq3 d;
    private final gc e;
    private final ay1 f;
    private final Logger g;
    private final int h;
    private final fr6<jx2> i;
    private String j;
    private Map<String, String> k;

    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a$a;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* compiled from: DeliveryLocationDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a$a;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0603a extends a {
            public static final C0603a a = new C0603a();

            private C0603a() {
                super(null);
            }
        }

        /* compiled from: DeliveryLocationDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a$b;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
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

    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter$b;", "", "", "SELECT_DELIVERABLE_PLACE_WITHOUT_CHANGE_ID", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$openSuggestions$$inlined$listenOnce$1$2", f = "DeliveryLocationDetailsPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0604a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0604a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.c.a.C0604a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$c$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.c.a.C0604a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$c$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.suggestions.presentation.b
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends j6 implements Function2<com.dodopizza.geo.feature.suggestions.presentation.b, cv1<? super Unit>, Object> {
        public d(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(com.dodopizza.geo.feature.suggestions.presentation.b bVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, bVar, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e implements oz3<qw1> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$setLocality$$inlined$map$1$2", f = "DeliveryLocationDetailsPresenter.kt", l = {223}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0605a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0605a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.e.a.C0605a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$e$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.e.a.C0605a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$e$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    jx2 r5 = (defpackage.jx2) r5
                    qw1 r5 = r5.d()
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.e.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public e(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super qw1> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqw1;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$setLocality$2", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<qw1, cv1<? super Unit>, Object> {
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
        public final Object invoke(qw1 qw1Var, cv1<? super Unit> cv1Var) {
            return ((f) create(qw1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationDetailsPresenter deliveryLocationDetailsPresenter = DeliveryLocationDetailsPresenter.this;
                deliveryLocationDetailsPresenter.p(deliveryLocationDetailsPresenter.b.d((qw1) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$setLocality$3", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<String, cv1<? super Unit>, Object> {
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
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((g) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationDetailsPresenter.this.j = (String) this.b;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lnv5;", "fields", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$showDynamicFields$1", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<nv5, cv1<? super Unit>, Object> {
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
        public final Object invoke(nv5 nv5Var, cv1<? super Unit> cv1Var) {
            return ((h) create(nv5Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationDetailsPresenter.this.O(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.c.e((nv5) this.b, ((jx2) DeliveryLocationDetailsPresenter.this.i.getValue()).c()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lnv5;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$showDynamicFields$2", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements y84<pz3<? super nv5>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super nv5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = th;
            return iVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = DeliveryLocationDetailsPresenter.this.g;
                String message = ((Throwable) this.b).getMessage();
                logger.warn("Failure to get fields " + message);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j implements oz3<String> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$showMainAddress$$inlined$map$1$2", f = "DeliveryLocationDetailsPresenter.kt", l = {223}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0606a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0606a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.j.a.C0606a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$j$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.j.a.C0606a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$j$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    jx2 r5 = (defpackage.jx2) r5
                    java.lang.String r5 = r5.f()
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter.j.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public j(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super String> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$showMainAddress$2", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((k) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                if (DeliveryLocationDetailsPresenter.this.c.e() && DeliveryLocationDetailsPresenter.this.d.a(bq3.H5)) {
                    ((fy2) DeliveryLocationDetailsPresenter.this.getViewState()).fc(str);
                } else {
                    ((fy2) DeliveryLocationDetailsPresenter.this.getViewState()).bc(str);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$showMainAddress$3", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends f3b implements y84<pz3<? super String>, Throwable, cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super String> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new l(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationDetailsPresenter.this.g.warn("Failure to get main address");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lg7;", "fields", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$showStaticFields$1", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m extends f3b implements Function2<List<? extends g7>, cv1<? super Unit>, Object> {
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
        public final Object invoke(List<g7> list, cv1<? super Unit> cv1Var) {
            return ((m) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationDetailsPresenter.this.O(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.c.f((List) this.b, ((jx2) DeliveryLocationDetailsPresenter.this.i.getValue()).c()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lpz3;", "", "Lg7;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter$showStaticFields$2", f = "DeliveryLocationDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends f3b implements y84<pz3<? super List<? extends g7>>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super List<g7>> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = th;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = DeliveryLocationDetailsPresenter.this.g;
                String message = ((Throwable) this.b).getMessage();
                logger.warn("Failure to get fields " + message);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DeliveryLocationDetailsPresenter(f63 f63Var, sx2 sx2Var, rx2 rx2Var, hq3 hq3Var, gc gcVar, ay1 ay1Var) {
        z65.h(f63Var, "router");
        z65.h(sx2Var, "interactor");
        z65.h(rx2Var, "data");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        this.a = f63Var;
        this.b = sx2Var;
        this.c = rx2Var;
        this.d = hq3Var;
        this.e = gcVar;
        this.f = ay1Var;
        this.g = LoggerFactory.getLogger("DeliveryLocationDetailsPresenter");
        this.h = rx2Var.b();
        this.i = mua.a(rx2Var.a().c());
        this.k = new LinkedHashMap();
    }

    private final boolean A() {
        if (this.c.f() && !this.c.i() && z()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(DeliveryLocationDetailsPresenter deliveryLocationDetailsPresenter, com.dodopizza.geo.feature.suggestions.presentation.b bVar) {
        z65.h(deliveryLocationDetailsPresenter, "this$0");
        z65.h(bVar, "it");
        if (bVar instanceof b.a) {
            deliveryLocationDetailsPresenter.K(((b.a) bVar).a().c());
        }
    }

    private final void K(jx2 jx2Var) {
        fr6<jx2> fr6Var = this.i;
        fr6Var.setValue(jx2.b(jx2Var, null, null, fr6Var.getValue().c(), null, 11, null));
    }

    private final void L() {
        o(wz3.F(wz3.o(new e(this.i)), new f(null)));
        o(wz3.F(wz3.L(wz3.t(this.b.c()), 1), new g(null)));
    }

    private final void M() {
        o(wz3.h(wz3.F(this.b.e(), new h(null)), new i(null)));
    }

    private final void N() {
        if (this.d.a(bq3.H5)) {
            M();
        } else {
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(List<? extends ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> list) {
        Object Z;
        ((fy2) getViewState()).m5(list);
        ((fy2) getViewState()).Ng();
        ((fy2) getViewState()).w();
        if (!list.isEmpty()) {
            Z = sc1.Z(list);
            ((fy2) getViewState()).Sf((ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a) Z);
        }
    }

    private final void P() {
        o(wz3.h(wz3.F(wz3.o(new j(this.i)), new k(null)), new l(null)));
    }

    private final void Q() {
        o(wz3.h(wz3.F(this.b.f(), new m(null)), new n(null)));
    }

    private final boolean R(String str, String str2) {
        return !z65.c(this.k.get(str), str2);
    }

    private final boolean z() {
        return !z65.c(this.b.c().getValue(), this.j);
    }

    public final void B(a aVar) {
        z65.h(aVar, "result");
        if (aVar instanceof a.b) {
            this.e.a(y6.a.g(y6.b.b));
            J();
            return;
        }
        this.e.a(y6.a.g(y6.b.c));
    }

    public final void C() {
        ((fy2) getViewState()).y0();
    }

    public final void D() {
        this.e.a(y6.a.b(ck1.s));
        this.a.i(this.h, new c.a.b(this.c.a(), false));
        ((fy2) getViewState()).a();
    }

    public final void E(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, String str) {
        z65.h(aVar, "field");
        z65.h(str, "text");
        fr6<jx2> fr6Var = this.i;
        fr6Var.setValue(oy2.c(fr6Var.getValue(), ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.b.b(aVar), str));
    }

    public final void F(String str, String str2) {
        z65.h(str, "fieldId");
        z65.h(str2, "value");
        if (R(str, str2)) {
            this.k.put(str, str2);
            this.e.a(md4.a(str, this.c.c(), true));
        }
    }

    public final void G() {
        ((fy2) getViewState()).a();
        if (A()) {
            ((fy2) getViewState()).o2();
        } else {
            J();
        }
    }

    public final void H(String str) {
        z65.h(str, "mainAddress");
        ((fy2) getViewState()).a();
        g63.b(this.a, "select_location_fragment", j6a.a.f(j6a.h, null, this.f.getCode(), true, R.id.select_deliverable_place_without_change_id, str, qw1.c.a(), null, 64, null));
        f63 f63Var = this.a;
        wz3.C(uz3.a.a(new c(f63Var.k(R.id.select_deliverable_place_without_change_id)), new d(new wk9() { // from class: by2
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                DeliveryLocationDetailsPresenter.I(DeliveryLocationDetailsPresenter.this, (b) obj);
            }
        })), PresenterScopeKt.getPresenterScope(this));
    }

    public final void J() {
        this.a.i(this.h, new c.a.C0131a(e91.b(this.c.a(), null, this.i.getValue(), false, 5, null), false, false, false));
    }

    public final void onBackPressed() {
        ((fy2) getViewState()).a();
        this.a.i(this.h, c.a.C0132c.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((fy2) getViewState()).ia();
        ((fy2) getViewState()).P8(this.c.d());
        Map<String, String> c2 = this.i.getValue().c();
        z65.f(c2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        this.k = unb.d(c2);
        L();
        P();
        N();
    }
}
