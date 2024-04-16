package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.dodopizza.order.feature.menu.ordertypeswitcher.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: OrderTypeSwitcherExternalRouterImpl.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\fB'\b\u0007\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b1\u00102J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016J6\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0016J>\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0016J6\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u000fH\u0016J$\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u000fH\u0016JF\u0010\"\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\b\u0010#\u001a\u00020\tH\u0016R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0014\u00100\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lgl7;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "scenario", "", "isEmptyCart", "hasAddresses", "Ljk7;", "orderType", "", "p", "Loz3;", "a", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;", "listener", com.huawei.hms.opendevice.c.a, "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, "Le91;", "clientDeliveryLocation", com.huawei.hms.push.e.a, "", "currentAddress", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", Image.TYPE_HIGH, "b", "selectedPizzeriaId", "isNewMapOnPizzeriaCombinedViewEnabled", "isSelectPizzeriaCombinedViewEnabled", "isGooglePlayServicesAvailable", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", "g", "f", "Lf63;", "Lf63;", "router", "Ldt5;", "Ldt5;", "currentLocality", "Las8;", "Lay1;", "Las8;", "countryProvider", "o", "()Ljava/lang/String;", "currentCountryCode", "<init>", "(Lf63;Ldt5;Las8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gl7  reason: default package */
/* loaded from: classes4.dex */
public final class gl7 implements com.dodopizza.order.feature.menu.ordertypeswitcher.c {
    public static final a d = new a(null);
    private final f63 a;
    private final dt5 b;
    private final as8<ay1> c;

    /* compiled from: OrderTypeSwitcherExternalRouterImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lgl7$a;", "", "", "PICKUP_MENU_FLOW_REQUEST_ID", "I", "RESULT_LOGIN", "RESULT_SELECT_ADDRESS", "RESULT_SELECT_DELIVERY_LOCATION", "RESULT_SELECT_ORDER_TYPE", "RESULT_SELECT_PIZZERIA", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$b */
    /* loaded from: classes4.dex */
    public static final class b implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gl7$b$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherExternalRouterImpl$listenForPickupFlowRequests$$inlined$resultsFlowOf$1$2", f = "OrderTypeSwitcherExternalRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: gl7$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0329a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0329a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.gl7.b.a.C0329a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gl7$b$a$a r0 = (defpackage.gl7.b.a.C0329a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gl7$b$a$a r0 = new gl7$b$a$a
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
                    boolean r2 = r5 instanceof kotlin.Unit
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var) {
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

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$c */
    /* loaded from: classes4.dex */
    public static final class c implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gl7$c$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherExternalRouterImpl$showAddressList$$inlined$listenOnce$1$2", f = "OrderTypeSwitcherExternalRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: gl7$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0330a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0330a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.gl7.c.a.C0330a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gl7$c$a$a r0 = (defpackage.gl7.c.a.C0330a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gl7$c$a$a r0 = new gl7$c$a$a
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
                    boolean r2 = r5 instanceof defpackage.su2
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.c.a.emit(java.lang.Object, cv1):java.lang.Object");
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
    /* renamed from: gl7$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends j6 implements Function2<su2, cv1<? super Unit>, Object> {
        public d(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(su2 su2Var, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, su2Var, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$e */
    /* loaded from: classes4.dex */
    public static final class e implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gl7$e$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherExternalRouterImpl$showDeliveryLocation$$inlined$listenOnce$1$2", f = "OrderTypeSwitcherExternalRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: gl7$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0331a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0331a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.gl7.e.a.C0331a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gl7$e$a$a r0 = (defpackage.gl7.e.a.C0331a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gl7$e$a$a r0 = new gl7$e$a$a
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
                    boolean r2 = r5 instanceof defpackage.su2
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.e.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public e(oz3 oz3Var) {
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
    /* renamed from: gl7$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f extends j6 implements Function2<su2, cv1<? super Unit>, Object> {
        public f(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(su2 su2Var, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, su2Var, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$g */
    /* loaded from: classes4.dex */
    public static final class g implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gl7$g$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherExternalRouterImpl$showSelectDeliveryAddressEditAddress$$inlined$listenOnce$1$2", f = "OrderTypeSwitcherExternalRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: gl7$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0332a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0332a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.gl7.g.a.C0332a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gl7$g$a$a r0 = (defpackage.gl7.g.a.C0332a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gl7$g$a$a r0 = new gl7$g$a$a
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
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.selectdeliveryaddress.a.AbstractC0149a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.g.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public g(oz3 oz3Var) {
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
    /* renamed from: gl7$h */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends j6 implements Function2<a.AbstractC0149a, cv1<? super Unit>, Object> {
        public h(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(a.AbstractC0149a abstractC0149a, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, abstractC0149a, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$i */
    /* loaded from: classes4.dex */
    public static final class i implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gl7$i$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherExternalRouterImpl$showSelectDeliveryAddressSelectAddress$$inlined$listenOnce$1$2", f = "OrderTypeSwitcherExternalRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: gl7$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0333a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0333a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.gl7.i.a.C0333a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gl7$i$a$a r0 = (defpackage.gl7.i.a.C0333a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gl7$i$a$a r0 = new gl7$i$a$a
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
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.selectdeliveryaddress.a.AbstractC0149a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.i.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public i(oz3 oz3Var) {
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
    /* renamed from: gl7$j */
    /* loaded from: classes4.dex */
    public /* synthetic */ class j extends j6 implements Function2<a.AbstractC0149a, cv1<? super Unit>, Object> {
        public j(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(a.AbstractC0149a abstractC0149a, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, abstractC0149a, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$k */
    /* loaded from: classes4.dex */
    public static final class k implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gl7$k$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherExternalRouterImpl$showSelectOrderType$$inlined$listenOnce$1$2", f = "OrderTypeSwitcherExternalRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: gl7$k$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0334a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0334a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.gl7.k.a.C0334a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gl7$k$a$a r0 = (defpackage.gl7.k.a.C0334a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gl7$k$a$a r0 = new gl7$k$a$a
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
                    boolean r2 = r5 instanceof ru.dodopizza.app.presentation.selectordertype.a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.k.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public k(oz3 oz3Var) {
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
    /* renamed from: gl7$l */
    /* loaded from: classes4.dex */
    public /* synthetic */ class l extends j6 implements Function2<ru.dodopizza.app.presentation.selectordertype.a, cv1<? super Unit>, Object> {
        public l(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ru.dodopizza.app.presentation.selectordertype.a aVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, aVar, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl7$m */
    /* loaded from: classes4.dex */
    public static final class m implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gl7$m$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.ordertypeswitcher.OrderTypeSwitcherExternalRouterImpl$showSelectPizzeria$$inlined$listenOnce$1$2", f = "OrderTypeSwitcherExternalRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: gl7$m$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0335a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0335a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.gl7.m.a.C0335a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gl7$m$a$a r0 = (defpackage.gl7.m.a.C0335a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gl7$m$a$a r0 = new gl7$m$a$a
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
                    boolean r2 = r5 instanceof defpackage.d98
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.m.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public m(oz3 oz3Var) {
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
    /* renamed from: gl7$n */
    /* loaded from: classes4.dex */
    public /* synthetic */ class n extends j6 implements Function2<d98, cv1<? super Unit>, Object> {
        public n(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(d98 d98Var, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, d98Var, cv1Var);
            return b;
        }
    }

    public gl7(f63 f63Var, dt5 dt5Var, as8<ay1> as8Var) {
        z65.h(f63Var, "router");
        z65.h(dt5Var, "currentLocality");
        z65.h(as8Var, "countryProvider");
        this.a = f63Var;
        this.b = dt5Var;
        this.c = as8Var;
    }

    private final String o() {
        return this.c.get().getCode();
    }

    private final void p(b.a aVar, boolean z, boolean z2, jk7 jk7Var) {
        g63.b(this.a, "select_delivery_address_fragment", new com.dodopizza.geo.feature.selectdeliveryaddress.b(aVar, zo9.S2.b(), z, z2, this.b, o(), jk7Var, ck1.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, su2 su2Var) {
        z65.h(function1, "$listener");
        z65.h(su2Var, "it");
        function1.invoke(hl7.a(su2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, su2 su2Var) {
        z65.h(function1, "$listener");
        z65.h(su2Var, "it");
        function1.invoke(hl7.a(su2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Function0 function0, a.AbstractC0149a abstractC0149a) {
        z65.h(function0, "$listener");
        z65.h(abstractC0149a, "it");
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Function0 function0, a.AbstractC0149a abstractC0149a) {
        z65.h(function0, "$listener");
        z65.h(abstractC0149a, "it");
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function1 function1, ru.dodopizza.app.presentation.selectordertype.a aVar) {
        z65.h(function1, "$listener");
        z65.h(aVar, "it");
        function1.invoke(hl7.c(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Function1 function1, d98 d98Var) {
        z65.h(function1, "$listener");
        z65.h(d98Var, "it");
        function1.invoke(hl7.b(d98Var));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public oz3<Unit> a() {
        return new b(this.a.k(R.id.pickup_menu_flow_request_id));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public void b(qx1 qx1Var, final Function1<? super c.a, Unit> function1) {
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "listener");
        g63.b(this.a, "select_address", new s8(R.id.select_deliverable_place_id, z8.a));
        wz3.C(uz3.a.a(new c(this.a.k(R.id.select_deliverable_place_id)), new d(new wk9() { // from class: bl7
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                gl7.q(Function1.this, (su2) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public void c(qx1 qx1Var, final Function1<? super c.AbstractC0190c, Unit> function1) {
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "listener");
        g63.b(this.a, "select_order_type", new r6a(R.id.select_order_type_result));
        wz3.C(uz3.a.a(new k(this.a.k(R.id.select_order_type_result)), new l(new wk9() { // from class: el7
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                gl7.u(Function1.this, (ru.dodopizza.app.presentation.selectordertype.a) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public void d(qx1 qx1Var, boolean z, boolean z2, jk7 jk7Var, final Function0<Unit> function0) {
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(jk7Var, "orderType");
        z65.h(function0, "listener");
        p(new b.a.c(false), z, z2, jk7Var);
        wz3.C(uz3.a.a(new i(this.a.k(R.id.select_delivery_location_result_id)), new j(new wk9() { // from class: al7
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                gl7.t(Function0.this, (a.AbstractC0149a) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public void e(qx1 qx1Var, boolean z, boolean z2, jk7 jk7Var, e91 e91Var, final Function0<Unit> function0) {
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(jk7Var, "orderType");
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(function0, "listener");
        p(new b.a.C0153a(e91Var), z, z2, jk7Var);
        wz3.C(uz3.a.a(new g(this.a.k(R.id.select_delivery_location_result_id)), new h(new wk9() { // from class: dl7
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                gl7.s(Function0.this, (a.AbstractC0149a) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public void f() {
        this.a.e(j02.a);
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public void g(qx1 qx1Var, String str, boolean z, boolean z2, boolean z3, final Function1<? super c.b, Unit> function1) {
        String str2;
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "listener");
        if (z && z3) {
            str2 = "select_pizzeria_with_google_maps";
        } else if (z2) {
            str2 = "select_pizzeria_combined_view";
        } else {
            str2 = "select_pizzeria";
        }
        g63.b(this.a, str2, new x7a(R.id.select_carryout, true, this.b, n8a.a, str, gn3.b));
        wz3.C(uz3.a.a(new m(this.a.k(R.id.select_carryout)), new n(new wk9() { // from class: cl7
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                gl7.v(Function1.this, (d98) obj);
            }
        })), qx1Var);
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.c
    public void h(qx1 qx1Var, boolean z, String str, final Function1<? super c.a, Unit> function1) {
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "listener");
        g63.b(this.a, "select_location_fragment", j6a.h.b(this.b, o(), z, R.id.select_deliverable_place_id, str, ck1.e));
        wz3.C(uz3.a.a(new e(this.a.k(R.id.select_deliverable_place_id)), new f(new wk9() { // from class: fl7
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                gl7.r(Function1.this, (su2) obj);
            }
        })), qx1Var);
    }
}
