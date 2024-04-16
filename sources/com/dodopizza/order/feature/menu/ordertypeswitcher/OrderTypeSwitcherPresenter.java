package com.dodopizza.order.feature.menu.ordertypeswitcher;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.a;
import com.dodopizza.order.feature.menu.ordertypeswitcher.b;
import com.dodopizza.order.feature.menu.ordertypeswitcher.c;
import com.dodopizza.order.feature.menu.ordertypeswitcher.f;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.cj6;
import defpackage.ko3;
import defpackage.lk7;
import defpackage.nk9;
import defpackage.uu2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: OrderTypeSwitcherPresenter.kt */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 T2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001VB\u0096\u0001\b\u0007\u0012\u0006\u0010X\u001a\u00020U\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010l\u001a\u00020i\u0012\u0006\u0010p\u001a\u00020m\u0012\u0006\u0010t\u001a\u00020q\u0012\u0006\u0010x\u001a\u00020u\u0012\u0006\u0010|\u001a\u00020y\u0012\u0007\u0010\u0080\u0001\u001a\u00020}\u0012\b\u0010\u0084\u0001\u001a\u00030\u0081\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0085\u0001\u0012\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001\u0012\b\u0010\u0090\u0001\u001a\u00030\u008d\u0001\u0012\b\u0010\u0094\u0001\u001a\u00030\u0091\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001e\u0010\b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\t\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J)\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\nH\u0002J\b\u0010#\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0002J\u001e\u0010(\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010)\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010+\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0002J\b\u00100\u001a\u00020\nH\u0002J\u001e\u00101\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0002J\u0016\u00106\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u0010\u00107\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u00108\u001a\u00020\u0019H\u0002J\b\u00109\u001a\u00020\nH\u0002J\b\u0010:\u001a\u00020\nH\u0002J\b\u0010;\u001a\u00020\nH\u0002J\u0010\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020-H\u0002J\u0016\u0010>\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J \u0010@\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010?\u001a\u00020\u0019H\u0002J\u0014\u0010A\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010B\u001a\u00020\nH\u0002J\b\u0010C\u001a\u00020\nH\u0002J\b\u0010D\u001a\u00020\nH\u0002J\u0018\u0010I\u001a\u00020\n2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0002J\u0018\u0010L\u001a\u00020\n2\u0006\u0010J\u001a\u00020E2\u0006\u0010H\u001a\u00020KH\u0002J \u0010O\u001a\u00020\n2\u0006\u0010J\u001a\u00020E2\u0006\u0010H\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0002J0\u0010S\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040Q\u0012\u0004\u0012\u00020\n0Pj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`RH\u0016J\u0014\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0016R\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\"\u0010\u0099\u0001\u001a\r \u0096\u0001*\u0005\u0018\u00010\u0095\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006 \u0001"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Ltl7;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "B0", "z0", "", "V0", "c1", "U0", "X0", "W0", "g1", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$m;", "event", "A0", "Ld88;", "pizzeria", "Llk7$d;", "pizzeriaSelectionSource", "t0", "", "isNearestPizzeria", "D0", "(Ld88;Llk7$d;Ljava/lang/Boolean;)V", "E0", "L0", "K0", "y0", "Z0", "Y0", "u0", "Lou2;", "deliverablePlace", "w0", "v0", "s0", "x0", "q0", "S0", "T0", "Lb61;", "state", "Q0", "P0", "C0", "G0", "Lcj6;", "minDeliveryPriceInfo", "p0", "I0", "d1", "F0", "a1", "M0", "J0", "checkoutState", "f1", "h1", "needUpdateByTtl", "n0", "O0", "b1", "N0", "R0", "Lov5;", "location", "Lnk9$b;", "orderType", "r0", "currentLocation", "Luu2$a;", "H0", "", "maxDistance", "e1", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "t", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c;", "b", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c;", "router", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/d;", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/d;", "interactor", "Lul7;", DateTokenConverter.CONVERTER_KEY, "Lul7;", "viewBinder", "Lbo;", com.huawei.hms.push.e.a, "Lbo;", "appInitializationStateProvider", "Lhq3;", "f", "Lhq3;", "featureService", "Lgy3;", "g", "Lgy3;", "firebaseToggleService", "Lr43;", Image.TYPE_HIGH, "Lr43;", "distanceMeasurer", "Lwv5;", "i", "Lwv5;", "locationPermissionChecker", "Lew5;", "j", "Lew5;", "locationSettingsChecker", "Lgc;", "k", "Lgc;", "analytics", "Lk63;", "l", "Lk63;", "domainEvents", "Lx1b;", Image.TYPE_MEDIUM, "Lx1b;", "suggestionAddressProvider", "Lr75;", "n", "Lr75;", "isDeepLinkHandled", "Lzja;", "o", "Lzja;", "showLimiter", "Lih4;", "p", "Lih4;", "googlePlayServicesHelper", "Lf5b;", "q", "Lf5b;", "timeProvider", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "r", "Lorg/slf4j/Logger;", "logger", "Lcj6$b;", Image.TYPE_SMALL, "Lcj6$b;", "previousDynamicMinDeliveryPriceInfo", "<init>", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/d;Lul7;Lbo;Lhq3;Lgy3;Lr43;Lwv5;Lew5;Lgc;Lk63;Lx1b;Lr75;Lzja;Lih4;Lf5b;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OrderTypeSwitcherPresenter extends MoxyFSMPresenter<tl7, com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> {
    public static final b t = new b(null);
    public static final int u = 8;
    private final com.dodopizza.order.feature.menu.ordertypeswitcher.c b;
    private final com.dodopizza.order.feature.menu.ordertypeswitcher.d c;
    private final ul7 d;
    private final bo e;
    private final hq3 f;
    private final gy3 g;
    private final r43 h;
    private final wv5 i;
    private final ew5 j;
    private final gc k;
    private final k63 l;
    private final x1b m;
    private final r75 n;
    private final zja o;
    private final ih4 p;
    private final f5b q;
    private final Logger r;
    private cj6.b s;

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((a) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.Z0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "maxDistance", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$properDistanceToDeliveryAddress$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a0 extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;
        final /* synthetic */ ov5 d;
        final /* synthetic */ uu2.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(ov5 ov5Var, uu2.a aVar, cv1<? super a0> cv1Var) {
            super(2, cv1Var);
            this.d = ov5Var;
            this.e = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(this.d, this.e, cv1Var);
            a0Var.b = ((Number) obj).intValue();
            return a0Var;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((a0) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Unit> cv1Var) {
            return i(num.intValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.e1(this.d, this.e, this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "message", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryShowNoPaymentMethodsFlash$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a1 extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a1(cv1<? super a1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a1 a1Var = new a1(cv1Var);
            a1Var.b = obj;
            return a1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((a1) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                if (str != null) {
                    ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).O1(str);
                    OrderTypeSwitcherPresenter.this.N0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter$b;", "", "", "ALWAYS_NEAREST_PIZZERIA", "Z", "", "NEAREST_PIZZERIA_RADIUS", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$requestInitialOrderType$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b0 extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((b0) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = (a.b) this.b;
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, bVar);
                OrderTypeSwitcherPresenter.this.d1(bVar);
                OrderTypeSwitcherPresenter.this.a1();
                OrderTypeSwitcherPresenter.this.b1();
                OrderTypeSwitcherPresenter.this.z(f.a.a, bVar);
                if (OrderTypeSwitcherPresenter.this.p0(bVar.a().i().f())) {
                    OrderTypeSwitcherPresenter.this.w(b.s.a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryShowNoPaymentMethodsFlash$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b1(cv1<? super b1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b1 b1Var = new b1(cv1Var);
            b1Var.b = obj;
            return b1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to get no payment methods flash description. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$actualizeOrderType$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((c) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = (a.b) this.b;
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, bVar);
                Logger logger = OrderTypeSwitcherPresenter.this.r;
                wk7 k = bVar.a().k();
                logger.debug("actualizeOrderType " + k);
                if (this.d && OrderTypeSwitcherPresenter.this.p0(bVar.a().i().f())) {
                    OrderTypeSwitcherPresenter.this.z(f.a.a, bVar);
                    OrderTypeSwitcherPresenter.this.w(b.s.a);
                } else {
                    OrderTypeSwitcherPresenter.this.z(f.a.a, bVar);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$requestInitialOrderType$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c0 extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c0(cv1<? super c0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            c0 c0Var = new c0(cv1Var);
            c0Var.b = th;
            return c0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.error("Failed to get current order type. ", (Throwable) this.b);
                ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).Y0();
                OrderTypeSwitcherPresenter.this.z(f.d.a, a.C0183a.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "shouldShow", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryShowSelectOrderType$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c1 extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        c1(cv1<? super c1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c1 c1Var = new c1(cv1Var);
            c1Var.b = ((Boolean) obj).booleanValue();
            return c1Var;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((c1) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b) {
                    OrderTypeSwitcherPresenter.this.U0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$actualizeOrderType$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.error("Failed to actualize order type.", (Throwable) this.b);
                ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).Y0();
                OrderTypeSwitcherPresenter.this.z(f.d.a, a.C0183a.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$requestOrderTypeFromMemory$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d0(cv1<? super d0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d0 d0Var = new d0(cv1Var);
            d0Var.b = obj;
            return d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((d0) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = (a.b) this.b;
                if (z65.c(OrderTypeSwitcherPresenter.this.s(), f.C0193f.a)) {
                    b61 f1 = OrderTypeSwitcherPresenter.this.f1(bVar.a());
                    ul7 ul7Var = OrderTypeSwitcherPresenter.this.d;
                    View viewState = OrderTypeSwitcherPresenter.this.getViewState();
                    z65.g(viewState, "getViewState(...)");
                    ul7Var.a((tl7) viewState, f1, bVar.b(), false);
                    ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).Jb();
                    ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).r1(false);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryShowSelectOrderType$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d1(cv1<? super d1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d1 d1Var = new d1(cv1Var);
            d1Var.b = obj;
            return d1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to show selected order type. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ld88;", "pizzerias", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$findNearestPizzeria$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<List<? extends d88>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ ov5 d;
        final /* synthetic */ d88 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ov5 ov5Var, d88 d88Var, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.d = ov5Var;
            this.e = d88Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.d, this.e, cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<d88> list, cv1<? super Unit> cv1Var) {
            return ((e) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                ov5 ov5Var = this.d;
                d88 d88Var = this.e;
                Iterator it = ((List) this.b).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (orderTypeSwitcherPresenter.h.a(ov5Var, ((d88) obj2).x()) + ((Number) mh5.c(ov5Var.a(), nf0.b(0.0f))).floatValue() <= 200.0f) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                d88 d88Var2 = (d88) obj2;
                if (d88Var2 != null && !z65.c(d88Var2.getId(), d88Var.getId())) {
                    ((tl7) orderTypeSwitcherPresenter.getViewState()).t1(d88Var2);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$requestOrderTypeFromMemory$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e0 extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e0(cv1<? super e0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            e0 e0Var = new e0(cv1Var);
            e0Var.b = th;
            return e0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to request order type from memory. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "needToShow", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryToRequestLocation$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e1 extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        e1(cv1<? super e1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e1 e1Var = new e1(cv1Var);
            e1Var.b = ((Boolean) obj).booleanValue();
            return e1Var;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((e1) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (!this.b) {
                    ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).k();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$findNearestPizzeria$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to get all restaurant pizzerias. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$setCovidWarningShown$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f0(cv1<? super f0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f0 f0Var = new f0(cv1Var);
            f0Var.b = obj;
            return f0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to set covid warning shown. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryToRequestLocation$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f1(cv1<? super f1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f1 f1Var = new f1(cv1Var);
            f1Var.b = obj;
            return f1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to get covid warning info. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleCarryoutPizzeriaSelected$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((g) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$setNoPaymentMethodsFlashShown$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g0(cv1<? super g0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g0 g0Var = new g0(cv1Var);
            g0Var.b = obj;
            return g0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to set no payment methods flash shown. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "newData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$updateData$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g1 extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g1(cv1<? super g1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g1 g1Var = new g1(cv1Var);
            g1Var.b = obj;
            return g1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((g1) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = (a.b) this.b;
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                orderTypeSwitcherPresenter.z(orderTypeSwitcherPresenter.r().c(), bVar);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter2 = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter2.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter2.O0((tl7) viewState, bVar);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleCarryoutPizzeriaSelected$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((h) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.a1();
                OrderTypeSwitcherPresenter.this.b1();
                OrderTypeSwitcherPresenter.this.z(f.a.a, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", "it", "", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h0 extends ej5 implements Function1<c.a, Unit> {
        h0() {
            super(1);
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "it");
            u5a.a(OrderTypeSwitcherPresenter.this, aVar, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$updateData$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h1 extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h1(cv1<? super h1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            h1 h1Var = new h1(cv1Var);
            h1Var.b = th;
            return h1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to update data", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleCarryoutPizzeriaSelected$3", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = th;
            return iVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to handle carryout pizzeria selection result. ", (Throwable) this.b);
                OrderTypeSwitcherPresenter.o0(OrderTypeSwitcherPresenter.this, false, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", "it", "", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i0 extends ej5 implements Function1<c.a, Unit> {
        i0() {
            super(1);
        }

        public final void a(c.a aVar) {
            z65.h(aVar, "it");
            u5a.a(OrderTypeSwitcherPresenter.this, aVar, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$updateState$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i1 extends f3b implements Function2<StateEntity, cv1<? super Unit>, Object> {
        int a;

        i1(cv1<? super i1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i1(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(StateEntity stateEntity, cv1<? super Unit> cv1Var) {
            return ((i1) create(stateEntity, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.n0(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleClientDeliveryLocationHaveBeenUpdated$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((j) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = (a.b) this.b;
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, bVar);
                OrderTypeSwitcherPresenter.this.b1();
                OrderTypeSwitcherPresenter.this.z(f.a.a, bVar);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "discount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$showRestaurantDiscountIfRequired$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j0 extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j0(cv1<? super j0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j0 j0Var = new j0(cv1Var);
            j0Var.b = obj;
            return j0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((j0) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                if (str.length() > 0) {
                    ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).P0(str);
                } else {
                    ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).W();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$updateState$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j1(cv1<? super j1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j1 j1Var = new j1(cv1Var);
            j1Var.b = obj;
            return j1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.error("Failed to actualize", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleClientDeliveryLocationHaveBeenUpdated$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k(cv1<? super k> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.b = th;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.error("Failed to get current order type. ", (Throwable) this.b);
                ((tl7) OrderTypeSwitcherPresenter.this.getViewState()).Y0();
                OrderTypeSwitcherPresenter.this.z(f.d.a, a.C0183a.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$showRestaurantDiscountIfRequired$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k0(cv1<? super k0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k0 k0Var = new k0(cv1Var);
            k0Var.b = obj;
            return k0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((k0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to get information about discount. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleDeliverablePlaceCreated$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((l) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class l0 extends ej5 implements Function0<Unit> {
        l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OrderTypeSwitcherPresenter.this.w(b.d.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleDeliverablePlaceCreated$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((m) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.b1();
                OrderTypeSwitcherPresenter.this.z(f.a.a, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class m0 extends ej5 implements Function0<Unit> {
        m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OrderTypeSwitcherPresenter.this.w(b.d.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleDeliverablePlaceCreated$3", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = th;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to handle address created result. ", (Throwable) this.b);
                OrderTypeSwitcherPresenter.o0(OrderTypeSwitcherPresenter.this, false, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;", "result", "", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class n0 extends ej5 implements Function1<c.AbstractC0190c, Unit> {
        n0() {
            super(1);
        }

        public final void a(c.AbstractC0190c abstractC0190c) {
            z65.h(abstractC0190c, "result");
            if (z65.c(abstractC0190c, c.AbstractC0190c.a.a)) {
                OrderTypeSwitcherPresenter.this.q(b.j.a);
            } else if (z65.c(abstractC0190c, c.AbstractC0190c.b.a)) {
                OrderTypeSwitcherPresenter.this.q(b.u.a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.AbstractC0190c abstractC0190c) {
            a(abstractC0190c);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleDeliverablePlaceSelection$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((o) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$showSelectOrderTypeAfterApplicationInitialized$1", f = "OrderTypeSwitcherPresenter.kt", l = {313}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o0 extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        o0(cv1<? super o0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new o0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((o0) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                bo boVar = OrderTypeSwitcherPresenter.this.e;
                this.a = 1;
                if (co.b(boVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleDeliverablePlaceSelection$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(cv1Var);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((p) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.b1();
                OrderTypeSwitcherPresenter.this.z(f.a.a, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$showSelectOrderTypeAfterApplicationInitialized$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p0 extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        p0(cv1<? super p0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new p0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((p0) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.c1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleDeliverablePlaceSelection$3", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q(cv1<? super q> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            q qVar = new q(cv1Var);
            qVar.b = th;
            return qVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to handle address selection. ", (Throwable) this.b);
                OrderTypeSwitcherPresenter.o0(OrderTypeSwitcherPresenter.this, false, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$subscribeDomainEvents$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q0 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j63.values().length];
                try {
                    iArr[j63.i.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j63.j.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        q0(cv1<? super q0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q0 q0Var = new q0(cv1Var);
            q0Var.b = obj;
            return q0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((q0) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                int i = a.$EnumSwitchMapping$0[((j63) this.b).ordinal()];
                if (i == 1) {
                    OrderTypeSwitcherPresenter.this.g1();
                } else if (i == 2) {
                    OrderTypeSwitcherPresenter.this.g1();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleFirstViewAttach$1", f = "OrderTypeSwitcherPresenter.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        r(cv1<? super r> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new r(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((r) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                bo boVar = OrderTypeSwitcherPresenter.this.e;
                this.a = 1;
                if (co.b(boVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$subscribeToBasketChangedEvents$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r0 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j63.values().length];
                try {
                    iArr[j63.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        r0(cv1<? super r0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r0 r0Var = new r0(cv1Var);
            r0Var.b = obj;
            return r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((r0) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (a.$EnumSwitchMapping$0[((j63) this.b).ordinal()] == 1) {
                    OrderTypeSwitcherPresenter.this.w(b.C0184b.a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleFirstViewAttach$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
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
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((s) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.w(b.a.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$switchToDelivery$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s0 extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        s0(cv1<? super s0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s0 s0Var = new s0(cv1Var);
            s0Var.b = obj;
            return s0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((s0) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "newData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleLoginSuccessResult$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ b.m d;

        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ey5.values().length];
                try {
                    iArr[ey5.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ey5.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(b.m mVar, cv1<? super t> cv1Var) {
            super(2, cv1Var);
            this.d = mVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(this.d, cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((t) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = (a.b) this.b;
                OrderTypeSwitcherPresenter.this.z(f.e.a, bVar);
                int i = a.$EnumSwitchMapping$0[this.d.a().ordinal()];
                if (i == 1) {
                    OrderTypeSwitcherPresenter.this.q0(bVar);
                } else if (i == 2) {
                    OrderTypeSwitcherPresenter.this.G0(bVar);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$switchToDelivery$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t0 extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t0(cv1<? super t0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t0 t0Var = new t0(cv1Var);
            t0Var.b = obj;
            return t0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((t0) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.b1();
                OrderTypeSwitcherPresenter.this.z(f.a.a, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleLoginSuccessResult$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = th;
            return uVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to handle login success result. ", (Throwable) this.b);
                OrderTypeSwitcherPresenter.o0(OrderTypeSwitcherPresenter.this, false, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$switchToDelivery$3", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u0 extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u0(cv1<? super u0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            u0 u0Var = new u0(cv1Var);
            u0Var.b = th;
            return u0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to handle switch to delivery. ", (Throwable) this.b);
                OrderTypeSwitcherPresenter.o0(OrderTypeSwitcherPresenter.this, false, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleRestaurantPizzeriaSelected$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((v) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$switchToRestaurant$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v0 extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v0(cv1<? super v0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v0 v0Var = new v0(cv1Var);
            v0Var.b = obj;
            return v0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((v0) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = OrderTypeSwitcherPresenter.this;
                View viewState = orderTypeSwitcherPresenter.getViewState();
                z65.g(viewState, "getViewState(...)");
                orderTypeSwitcherPresenter.O0((tl7) viewState, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleRestaurantPizzeriaSelected$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w(cv1<? super w> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w wVar = new w(cv1Var);
            wVar.b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((w) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.b1();
                OrderTypeSwitcherPresenter.this.a1();
                OrderTypeSwitcherPresenter.this.z(f.a.a, (a.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$switchToRestaurant$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w0 extends f3b implements Function2<a.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w0(cv1<? super w0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w0 w0Var = new w0(cv1Var);
            w0Var.b = obj;
            return w0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.b bVar, cv1<? super Unit> cv1Var) {
            return ((w0) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.b bVar = (a.b) this.b;
                if (!(bVar.a().k() instanceof nk9.a)) {
                    OrderTypeSwitcherPresenter.this.a1();
                    OrderTypeSwitcherPresenter.this.b1();
                    OrderTypeSwitcherPresenter.this.z(f.a.a, bVar);
                } else {
                    OrderTypeSwitcherPresenter.this.z(f.e.a, bVar);
                    OrderTypeSwitcherPresenter.this.G0(bVar);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$handleRestaurantPizzeriaSelected$3", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x(cv1<? super x> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            x xVar = new x(cv1Var);
            xVar.b = th;
            return xVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to handle restaurant pizzeria selection result. ", (Throwable) this.b);
                OrderTypeSwitcherPresenter.o0(OrderTypeSwitcherPresenter.this, false, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$switchToRestaurant$3", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x0 extends f3b implements y84<pz3<? super a.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x0(cv1<? super x0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            x0 x0Var = new x0(cv1Var);
            x0Var.b = th;
            return x0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to handle switch to restaurant. ", (Throwable) this.b);
                OrderTypeSwitcherPresenter.o0(OrderTypeSwitcherPresenter.this, false, 1, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class y extends ej5 implements Function1<ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function1<ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>, Unit> {
            final /* synthetic */ OrderTypeSwitcherPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$y$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0180a extends ej5 implements Function2<a.C0211a, a.C0183a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0180a(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(a.C0211a c0211a, a.C0183a c0183a) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(c0183a, "<anonymous parameter 1>");
                    return this.a.z0();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                super(1);
                this.a = orderTypeSwitcherPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                z65.h(aVar, "$this$state");
                C0180a c0180a = new C0180a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(a.C0183a.class, (Function2) unb.e(c0180a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function1<ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>, Unit> {
            final /* synthetic */ OrderTypeSwitcherPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$q;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$q;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class a extends ej5 implements Function2<b.q, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.q qVar, a.b bVar) {
                    z65.h(qVar, "event");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    this.a.k.a(z81.b.c(o98.b));
                    this.a.D0(qVar.a(), lk7.d.e, Boolean.TRUE);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$r;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$r;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$y$b$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0181b extends ej5 implements Function2<b.r, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0181b(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.r rVar, a.b bVar) {
                    z65.h(rVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.k.a(z81.b.c(o98.c));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$b;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$b;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class c extends ej5 implements Function2<b.C0184b, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.C0184b c0184b, a.b bVar) {
                    z65.h(c0184b, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.g1();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$u;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$u;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class d extends ej5 implements Function2<b.u, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.u uVar, a.b bVar) {
                    z65.h(uVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    this.a.E0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$j;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$j;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class e extends ej5 implements Function2<b.j, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.j jVar, a.b bVar) {
                    z65.h(jVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    this.a.y0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$v;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$v;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class f extends ej5 implements Function2<b.v, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.v vVar, a.b bVar) {
                    z65.h(vVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    return OrderTypeSwitcherPresenter.o0(this.a, false, 1, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$h;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$h;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class g extends ej5 implements Function2<b.h, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.h hVar, a.b bVar) {
                    z65.h(hVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    return this.a.s0(bVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$s;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$s;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class h extends ej5 implements Function2<b.s, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.s sVar, a.b bVar) {
                    z65.h(sVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    return this.a.h1();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$o;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$o;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class i extends ej5 implements Function2<b.o, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.o oVar, a.b bVar) {
                    z65.h(oVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.R0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$n;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$n;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class j extends ej5 implements Function2<b.n, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.n nVar, a.b bVar) {
                    z65.h(nVar, "event");
                    z65.h(bVar, "data");
                    wk7 k = bVar.a().k();
                    if (k instanceof nk9.b) {
                        this.a.r0(nVar.a(), (nk9.b) k);
                    } else if (k instanceof uu2.a) {
                        this.a.H0(nVar.a(), (uu2.a) k);
                    }
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$a;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$a;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class k extends ej5 implements Function2<b.k.a, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.k.a aVar, a.b bVar) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.k.a(z81.b.a(w43.b));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$b;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$b;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class l extends ej5 implements Function2<b.k.C0185b, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.k.C0185b c0185b, a.b bVar) {
                    z65.h(c0185b, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.k.a(z81.b.a(w43.c));
                    return this.a.s0(bVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                super(1);
                this.a = orderTypeSwitcherPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                z65.h(aVar, "$this$state");
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(b.u.class)) {
                    aVar.b().put(b.u.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map = aVar.b().get(b.u.class);
                z65.e(map);
                map.put(a.b.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(b.j.class)) {
                    aVar.b().put(b.j.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map2 = aVar.b().get(b.j.class);
                z65.e(map2);
                map2.put(a.b.class, (Function2) unb.e(eVar, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(b.v.class)) {
                    aVar.b().put(b.v.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map3 = aVar.b().get(b.v.class);
                z65.e(map3);
                map3.put(a.b.class, (Function2) unb.e(fVar, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(b.h.class)) {
                    aVar.b().put(b.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map4 = aVar.b().get(b.h.class);
                z65.e(map4);
                map4.put(a.b.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(b.s.class)) {
                    aVar.b().put(b.s.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map5 = aVar.b().get(b.s.class);
                z65.e(map5);
                map5.put(a.b.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(b.o.class)) {
                    aVar.b().put(b.o.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map6 = aVar.b().get(b.o.class);
                z65.e(map6);
                map6.put(a.b.class, (Function2) unb.e(iVar, 2));
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(b.n.class)) {
                    aVar.b().put(b.n.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map7 = aVar.b().get(b.n.class);
                z65.e(map7);
                map7.put(a.b.class, (Function2) unb.e(jVar, 2));
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(b.k.a.class)) {
                    aVar.b().put(b.k.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map8 = aVar.b().get(b.k.a.class);
                z65.e(map8);
                map8.put(a.b.class, (Function2) unb.e(kVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(b.k.C0185b.class)) {
                    aVar.b().put(b.k.C0185b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map9 = aVar.b().get(b.k.C0185b.class);
                z65.e(map9);
                map9.put(a.b.class, (Function2) unb.e(lVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.q.class)) {
                    aVar.b().put(b.q.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map10 = aVar.b().get(b.q.class);
                z65.e(map10);
                map10.put(a.b.class, (Function2) unb.e(aVar2, 2));
                C0181b c0181b = new C0181b(this.a);
                if (!aVar.b().containsKey(b.r.class)) {
                    aVar.b().put(b.r.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map11 = aVar.b().get(b.r.class);
                z65.e(map11);
                map11.put(a.b.class, (Function2) unb.e(c0181b, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.C0184b.class)) {
                    aVar.b().put(b.C0184b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map12 = aVar.b().get(b.C0184b.class);
                z65.e(map12);
                map12.put(a.b.class, (Function2) unb.e(cVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function1<ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>, Unit> {
            final /* synthetic */ OrderTypeSwitcherPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$a;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$a;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class a extends ej5 implements Function2<b.a, a.C0183a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.a aVar, a.C0183a c0183a) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(c0183a, "<anonymous parameter 1>");
                    return this.a.I0();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$o;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$o;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class b extends ej5 implements Function2<b.o, a.C0183a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.o oVar, a.C0183a c0183a) {
                    z65.h(oVar, "<anonymous parameter 0>");
                    z65.h(c0183a, "<anonymous parameter 1>");
                    this.a.R0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                super(1);
                this.a = orderTypeSwitcherPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.a.class)) {
                    aVar.b().put(b.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map = aVar.b().get(b.a.class);
                z65.e(map);
                map.put(a.C0183a.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.o.class)) {
                    aVar.b().put(b.o.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map2 = aVar.b().get(b.o.class);
                z65.e(map2);
                map2.put(a.C0183a.class, (Function2) unb.e(bVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function1<ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>, Unit> {
            final /* synthetic */ OrderTypeSwitcherPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$i;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$i;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class a extends ej5 implements Function2<b.i, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.i iVar, a.b bVar) {
                    z65.h(iVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = this.a;
                    View viewState = orderTypeSwitcherPresenter.getViewState();
                    z65.g(viewState, "getViewState(...)");
                    orderTypeSwitcherPresenter.O0((tl7) viewState, bVar);
                    return new bua<>(f.a.a, bVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$e;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$e;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class b extends ej5 implements Function2<b.e, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.e eVar, a.b bVar) {
                    z65.h(eVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$c;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$c;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class c extends ej5 implements Function2<b.c, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.c cVar, a.b bVar) {
                    z65.h(cVar, "event");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    this.a.t0(cVar.a(), cVar.b());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$t;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$t;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$y$d$d  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0182d extends ej5 implements Function2<b.t, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0182d(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.t tVar, a.b bVar) {
                    z65.h(tVar, "event");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    this.a.D0(tVar.a(), tVar.b(), tVar.c());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$p;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$p;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class e extends ej5 implements Function2<b.p, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.p pVar, a.b bVar) {
                    z65.h(pVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    return this.a.B0(bVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$l;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$l;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class f extends ej5 implements Function2<b.l, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* compiled from: OrderTypeSwitcherPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes2.dex */
                public /* synthetic */ class a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ey5.values().length];
                        try {
                            iArr[ey5.b.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ey5.a.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.l lVar, a.b bVar) {
                    z65.h(lVar, "event");
                    z65.h(bVar, "data");
                    int i = a.$EnumSwitchMapping$0[lVar.a().ordinal()];
                    if (i == 1) {
                        this.a.Y0();
                        return this.a.x();
                    } else if (i == 2) {
                        OrderTypeSwitcherPresenter orderTypeSwitcherPresenter = this.a;
                        View viewState = orderTypeSwitcherPresenter.getViewState();
                        z65.g(viewState, "getViewState(...)");
                        orderTypeSwitcherPresenter.O0((tl7) viewState, bVar);
                        return new bua<>(f.a.a, bVar);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$m;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$m;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class g extends ej5 implements Function2<b.m, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.m mVar, a.b bVar) {
                    z65.h(mVar, "event");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.A0(mVar);
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$f;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$f;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class h extends ej5 implements Function2<b.f, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.f fVar, a.b bVar) {
                    z65.h(fVar, "event");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    this.a.w0(fVar.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$d;", "<anonymous parameter 0>", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "data", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$d;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class i extends ej5 implements Function2<b.d, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.d dVar, a.b bVar) {
                    z65.h(dVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.z(f.e.a, bVar);
                    this.a.u0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OrderTypeSwitcherPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$g;", "event", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "<anonymous parameter 1>", "Lbua;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$g;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes2.dex */
            public static final class j extends ej5 implements Function2<b.g, a.b, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>> {
                final /* synthetic */ OrderTypeSwitcherPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                    super(2);
                    this.a = orderTypeSwitcherPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> invoke(b.g gVar, a.b bVar) {
                    z65.h(gVar, "event");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.v0(gVar.a());
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter) {
                super(1);
                this.a = orderTypeSwitcherPresenter;
            }

            public final void a(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                z65.h(aVar, "$this$state");
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(b.e.class)) {
                    aVar.b().put(b.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map = aVar.b().get(b.e.class);
                z65.e(map);
                map.put(a.b.class, (Function2) unb.e(bVar, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(b.c.class)) {
                    aVar.b().put(b.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map2 = aVar.b().get(b.c.class);
                z65.e(map2);
                map2.put(a.b.class, (Function2) unb.e(cVar, 2));
                C0182d c0182d = new C0182d(this.a);
                if (!aVar.b().containsKey(b.t.class)) {
                    aVar.b().put(b.t.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map3 = aVar.b().get(b.t.class);
                z65.e(map3);
                map3.put(a.b.class, (Function2) unb.e(c0182d, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(b.p.class)) {
                    aVar.b().put(b.p.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map4 = aVar.b().get(b.p.class);
                z65.e(map4);
                map4.put(a.b.class, (Function2) unb.e(eVar, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(b.l.class)) {
                    aVar.b().put(b.l.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map5 = aVar.b().get(b.l.class);
                z65.e(map5);
                map5.put(a.b.class, (Function2) unb.e(fVar, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(b.m.class)) {
                    aVar.b().put(b.m.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map6 = aVar.b().get(b.m.class);
                z65.e(map6);
                map6.put(a.b.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(b.f.class)) {
                    aVar.b().put(b.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map7 = aVar.b().get(b.f.class);
                z65.e(map7);
                map7.put(a.b.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(b.d.class)) {
                    aVar.b().put(b.d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map8 = aVar.b().get(b.d.class);
                z65.e(map8);
                map8.put(a.b.class, (Function2) unb.e(iVar, 2));
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(b.g.class)) {
                    aVar.b().put(b.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map9 = aVar.b().get(b.g.class);
                z65.e(map9);
                map9.put(a.b.class, (Function2) unb.e(jVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(b.i.class)) {
                    aVar.b().put(b.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>> map10 = aVar.b().get(b.i.class);
                z65.e(map10);
                map10.put(a.b.class, (Function2) unb.e(aVar2, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>.a<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        y() {
            super(1);
        }

        public final void a(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(OrderTypeSwitcherPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(f.b.class, aVar2.a());
            b bVar = new b(OrderTypeSwitcherPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c3.put(f.a.class, aVar3.a());
            c cVar = new c(OrderTypeSwitcherPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(f.C0193f.class, aVar4.a());
            d dVar = new d(OrderTypeSwitcherPresenter.this);
            Map<Class<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, com.dodopizza.order.feature.menu.ordertypeswitcher.a, bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>>>>> c5 = ko3Var.c();
            ko3.a aVar5 = new ko3.a();
            dVar.invoke(aVar5);
            c5.put(f.e.class, aVar5.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "needToShow", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryShowCovidWarning$1", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y0 extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        y0(cv1<? super y0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y0 y0Var = new y0(cv1Var);
            y0Var.b = ((Boolean) obj).booleanValue();
            return y0Var;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((y0) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b) {
                    OrderTypeSwitcherPresenter.this.M0();
                    OrderTypeSwitcherPresenter.this.b.f();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", "it", "", "a", "(Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class z extends ej5 implements Function1<c.b, Unit> {
        z() {
            super(1);
        }

        public final void a(c.b bVar) {
            z65.h(bVar, "it");
            m8a.a(OrderTypeSwitcherPresenter.this, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter$tryShowCovidWarning$2", f = "OrderTypeSwitcherPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z0(cv1<? super z0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z0 z0Var = new z0(cv1Var);
            z0Var.b = obj;
            return z0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((z0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderTypeSwitcherPresenter.this.r.warn("Failed to get covid warning info. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public OrderTypeSwitcherPresenter(com.dodopizza.order.feature.menu.ordertypeswitcher.c cVar, com.dodopizza.order.feature.menu.ordertypeswitcher.d dVar, ul7 ul7Var, bo boVar, hq3 hq3Var, gy3 gy3Var, r43 r43Var, wv5 wv5Var, ew5 ew5Var, gc gcVar, k63 k63Var, x1b x1bVar, r75 r75Var, zja zjaVar, ih4 ih4Var, f5b f5bVar) {
        z65.h(cVar, "router");
        z65.h(dVar, "interactor");
        z65.h(ul7Var, "viewBinder");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(gy3Var, "firebaseToggleService");
        z65.h(r43Var, "distanceMeasurer");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        z65.h(gcVar, "analytics");
        z65.h(k63Var, "domainEvents");
        z65.h(x1bVar, "suggestionAddressProvider");
        z65.h(r75Var, "isDeepLinkHandled");
        z65.h(zjaVar, "showLimiter");
        z65.h(ih4Var, "googlePlayServicesHelper");
        z65.h(f5bVar, "timeProvider");
        this.b = cVar;
        this.c = dVar;
        this.d = ul7Var;
        this.e = boVar;
        this.f = hq3Var;
        this.g = gy3Var;
        this.h = r43Var;
        this.i = wv5Var;
        this.j = ew5Var;
        this.k = gcVar;
        this.l = k63Var;
        this.m = x1bVar;
        this.n = r75Var;
        this.o = zjaVar;
        this.p = ih4Var;
        this.q = f5bVar;
        this.r = LoggerFactory.getLogger("OrderTypeSwitcherPresenter");
        this.s = cj6.b.k.a();
        o(wz3.F(cVar.a(), new a(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(b.m mVar) {
        o(wz3.h(uz3.a.b(this.c.c(), new t(mVar, null)), new u(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> B0(a.b bVar) {
        wk7 k2 = bVar.a().k();
        if ((k2 instanceof bq0.b) || (k2 instanceof nk9.a)) {
            Y0();
            return x();
        }
        return o0(this, false, 1, null);
    }

    private final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> C0(a.b bVar) {
        G0(bVar);
        return new bua<>(f.e.a, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(d88 d88Var, lk7.d dVar, Boolean bool) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.k(d88Var, dVar, bool), new v(null)), new w(null)), new x(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0() {
        L0();
        Z0();
    }

    private final boolean F0() {
        if (this.i.a() == ry7.GRANTED && this.j.a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(a.b bVar) {
        String str;
        com.dodopizza.order.feature.menu.ordertypeswitcher.c cVar = this.b;
        qx1 presenterScope = PresenterScopeKt.getPresenterScope(this);
        d88 a2 = yk7.a(bVar.a().k());
        if (a2 != null) {
            str = a2.getId();
        } else {
            str = null;
        }
        cVar.g(presenterScope, str, this.f.a(bq3.e6), this.f.a(bq3.d6), this.p.a(), new z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(ov5 ov5Var, uu2.a aVar) {
        p(y87.a(this.c.i(), new a0(ov5Var, aVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> I0() {
        o(wz3.h(uz3.a.b(this.c.c(), new b0(null)), new c0(null)));
        return x();
    }

    private final void J0() {
        o(wz3.h(wz3.F(this.c.c(), new d0(null)), new e0(null)));
    }

    private final void K0() {
        if (this.f.a(bq3.d6)) {
            this.k.a(lk7.a.e(ck1.e));
        }
    }

    private final void L0() {
        if (this.f.a(bq3.d6)) {
            this.k.a(lk7.a.f(ck1.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0() {
        p(z77.a(this.c.l(), new f0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0() {
        p(z77.a(this.c.b(), new g0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(tl7 tl7Var, a.b bVar) {
        this.d.a(tl7Var, f1(bVar.a()), bVar.b(), true);
    }

    private final void P0() {
        this.b.b(PresenterScopeKt.getPresenterScope(this), new h0());
    }

    private final void Q0(b61 b61Var) {
        this.k.a(y6.a.a(ck1.e, true));
        this.b.h(PresenterScopeKt.getPresenterScope(this), b61Var.r(), this.m.a(b61Var.k()), new i0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0() {
        p(z77.a(y87.a(this.c.o(), new j0(null)), new k0(null)));
    }

    private final void S0(a.b bVar) {
        e91 c2 = yk7.c(bVar.a().k());
        if (!bVar.b().d() && c2 != null) {
            this.b.e(PresenterScopeKt.getPresenterScope(this), bVar.a().r(), bVar.b().b(), k61.a(bVar.a().k()), c2, new m0());
        } else {
            this.b.d(PresenterScopeKt.getPresenterScope(this), bVar.a().r(), bVar.b().b(), k61.a(bVar.a().k()), new l0());
        }
    }

    private final void T0(a.b bVar) {
        if (bVar.b().b()) {
            P0();
        } else {
            Q0(bVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        this.b.c(PresenterScopeKt.getPresenterScope(this), new n0());
    }

    private final void V0() {
        if (this.f.a(bq3.s5) && this.g.a(bq3.Q6)) {
            p(y87.a(hy.a(new o0(null)), new p0(null)));
        }
    }

    private final void W0() {
        o(wz3.F(this.l.c(), new q0(null)));
    }

    private final void X0() {
        o(wz3.F(this.l.c(), new r0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.n(), new s0(null)), new t0(null)), new u0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0() {
        o(wz3.h(uz3.a.b(wz3.F(this.c.j(), new v0(null)), new w0(null)), new x0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a1() {
        p(z77.a(y87.a(this.c.d(), new y0(null)), new z0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1() {
        p(z77.a(y87.a(this.c.a(), new a1(null)), new b1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1() {
        if (!this.n.invoke()) {
            p(z77.a(y87.a(this.c.g(), new c1(null)), new d1(null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(a.b bVar) {
        if (F0() && bVar.b().d()) {
            p(z77.a(y87.a(this.c.d(), new e1(null)), new f1(null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(ov5 ov5Var, uu2.a aVar, int i2) {
        e91 e2;
        if (i2 != 0) {
            zja zjaVar = this.o;
            dka dkaVar = dka.c;
            if (zjaVar.b(dkaVar) && (e2 = ru2.e(aVar.e())) != null && this.h.a(ov5Var, e2.c().d().i()) + ((Number) mh5.c(ov5Var.a(), Float.valueOf(0.0f))).floatValue() > i2) {
                this.k.a(z81.b.b());
                this.o.a(dkaVar);
                ((tl7) getViewState()).F6(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b61 f1(b61 b61Var) {
        if (b61Var.i().f() instanceof cj6.b) {
            cj6.b a2 = dj6.a(this.s, (cj6.b) b61Var.i().f());
            if (a2.m()) {
                this.k.a(new nl6(String.valueOf(a2.i().a()), String.valueOf(a2.c().a()), a2.d(), ck1.e));
            }
            this.s = a2;
            return b61.b(b61Var, null, null, null, null, null, null, in6.b(b61Var.i(), null, null, null, 0, null, false, a2, 63, null), null, null, null, null, false, null, 8127, null);
        }
        return b61Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1() {
        o(wz3.h(uz3.a.b(this.c.c(), new g1(null)), new h1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> h1() {
        p(z77.a(y87.a(this.c.f(), new i1(null)), new j1(null)));
        return x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> n0(boolean z2) {
        o(wz3.h(uz3.a.b(this.c.c(), new c(z2, null)), new d(null)));
        return x();
    }

    static /* synthetic */ bua o0(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return orderTypeSwitcherPresenter.n0(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p0(cj6 cj6Var) {
        if (!this.f.a(bq3.H6) || !(cj6Var instanceof cj6.b) || ((cj6.b) cj6Var).e() - this.q.b() >= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(a.b bVar) {
        if (this.f.a(bq3.a6)) {
            S0(bVar);
        } else {
            T0(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(ov5 ov5Var, nk9.b bVar) {
        p(z77.a(y87.a(this.c.e(), new e(ov5Var, bVar.e(), null)), new f(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> s0(a.b bVar) {
        if (bVar.a().k().b()) {
            return x0(bVar);
        }
        return C0(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(d88 d88Var, lk7.d dVar) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.t(d88Var, dVar), new g(null)), new h(null)), new i(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0() {
        o(wz3.h(uz3.a.b(this.c.c(), new j(null)), new k(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(ou2 ou2Var) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.h(ou2Var, lk7.a.b), new l(null)), new m(null)), new n(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(ou2 ou2Var) {
        o(wz3.h(uz3.a.b(wz3.F(this.c.h(ou2Var, lk7.a.c), new o(null)), new p(null)), new q(null)));
    }

    private final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> x0(a.b bVar) {
        if (bVar.a().k() instanceof uu2) {
            q0(bVar);
            return new bua<>(f.e.a, bVar);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        K0();
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<? extends com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> z0() {
        if (co.a(this.e)) {
            z(f.c.a, a.C0183a.a);
            I0();
        } else {
            z(f.C0193f.a, a.C0183a.a);
            ((tl7) getViewState()).Jb();
            ((tl7) getViewState()).r1(false);
            J0();
            p(y87.a(hy.a(new r(null)), new s(null)));
        }
        V0();
        X0();
        W0();
        return x();
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a> t() {
        return new bua<>(f.b.a, a.C0183a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<com.dodopizza.order.feature.menu.ordertypeswitcher.f, com.dodopizza.order.feature.menu.ordertypeswitcher.a>, Unit> v() {
        return new y();
    }
}
