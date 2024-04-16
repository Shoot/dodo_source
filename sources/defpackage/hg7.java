package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity;
import com.dodopizza.persistence.entity.personalization.MapEntry;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntityKt;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.du7;
import defpackage.jp7;
import defpackage.ko5;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.data.dto.response.OrderResponse;
import ru.dodopizza.app.data.dto.response.OrderResponseKt;
import ru.dodopizza.backend.domain.cart.dto.OrderResponseDto;
import ru.dodopizza.backend.domain.order.OrderApi;
import ru.dodopizza.backend.domain.order.dto.CancelOrderRequest;
import ru.dodopizza.backend.domain.order.dto.DataOrderDto;
import ru.dodopizza.backend.domain.order.dto.OrderPersonalization;
import ru.dodopizza.backend.domain.order.dto.RepeatOrderDto;
import ru.dodopizza.backend.domain.state.dto.personalization.MinDeliveryPrice;
import ru.dodopizza.backend.domain.state.dto.personalization.UpsellProducts;
/* compiled from: OrderManagerImpl.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001\"BY\b\u0007\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D¢\u0006\u0004\bS\u0010TJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\nH\u0016R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010L\u001a\n I*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010R\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006V"}, d2 = {"Lhg7;", "Lli7;", "Ls51;", "checkoutRequest", "Lfnb;", "Lru/dodopizza/app/data/dto/response/OrderResponse;", "v", "orderResponse", "", "t", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "", "attemptsCount", "Ljp7;", "A", "Lbc7;", "dataOrder", Image.TYPE_SMALL, "z", BonusActionEntity.ORDER, "x", "", "w", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "currentState", "Lru/dodopizza/backend/domain/order/dto/OrderPersonalization;", "u", "f", "orderId", DateTokenConverter.CONVERTER_KEY, "getActiveOrders", "g", "Llp7;", "a", com.huawei.hms.push.e.a, "Lwf8;", com.huawei.hms.opendevice.c.a, "b", "Lfi7;", "Lfi7;", "orderRepository", "Lru/dodopizza/backend/domain/order/OrderApi;", "Lru/dodopizza/backend/domain/order/OrderApi;", "orderApi", "Lbd;", "Lbd;", "analyticsHelper", "Llg7;", "Llg7;", "orderMapper", "Lvc6;", "Lvc6;", "memoryDataSource", "Ldua;", "Ldua;", "stateAnalyzer", "Lko5;", "Lko5;", "legacyCartService", "Li22;", Image.TYPE_HIGH, "Li22;", "createOrderWithApiLogic", "Lan;", "i", "Lan;", "appBackgroundStateDetector", "Lhq3;", "j", "Lhq3;", "featureService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "k", "Lorg/slf4j/Logger;", "logger", "", "l", "Lrn5;", "y", "()Z", "isTransparentImageUrlEnabled", "<init>", "(Lfi7;Lru/dodopizza/backend/domain/order/OrderApi;Lbd;Llg7;Lvc6;Ldua;Lko5;Li22;Lan;Lhq3;)V", Image.TYPE_MEDIUM, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hg7  reason: default package */
/* loaded from: classes4.dex */
public final class hg7 implements li7 {
    public static final a m = new a(null);
    private final fi7 a;
    private final OrderApi b;
    private final bd c;
    private final lg7 d;
    private final vc6 e;
    private final dua f;
    private final ko5 g;
    private final i22 h;
    private final an i;
    private final hq3 j;
    private final Logger k;
    private final rn5 l;

    /* compiled from: OrderManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lhg7$a;", "", "", "CREATE_ORDER_ATTEMPTS_COUNT", "I", "", "CREATE_ORDER_TIMEOUT_MS", "J", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hg7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OrderManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/app/data/dto/response/OrderResponse;", "it", "", "a", "(Lru/dodopizza/app/data/dto/response/OrderResponse;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hg7$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<OrderResponse, Unit> {
        b() {
            super(1);
        }

        public final void a(OrderResponse orderResponse) {
            z65.h(orderResponse, "it");
            hg7.this.t(orderResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OrderResponse orderResponse) {
            a(orderResponse);
            return Unit.a;
        }
    }

    /* compiled from: OrderManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hg7$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<Throwable, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "it");
            hg7.this.k.error("Failed to create order", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/data/dto/response/OrderResponse;", "a", "()Lru/dodopizza/app/data/dto/response/OrderResponse;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hg7$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function0<OrderResponse> {
        final /* synthetic */ s51 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s51 s51Var) {
            super(0);
            this.b = s51Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderResponse invoke() {
            StateEntity c = hg7.this.f.c();
            Integer step = c.getStep();
            Object obj = null;
            bc7 bc7Var = null;
            if (step != null && step.intValue() == 2) {
                OrderResponseDto a = hg7.this.h.a(this.b, hg7.this.u(c));
                StateEntity d = hg7.this.f.d(a.getState());
                DataOrderDto createdOrder = a.getCreatedOrder();
                if (createdOrder != null) {
                    hg7 hg7Var = hg7.this;
                    bc7Var = hg7Var.d.b(createdOrder, hg7Var.y());
                }
                return new OrderResponse(d, bc7Var);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : hg7.this.w()) {
                if (z65.c(((bc7) obj2).t(), c.getPlacedOrderId())) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int e = ((bc7) obj).e();
                    do {
                        Object next = it.next();
                        int e2 = ((bc7) next).e();
                        if (e < e2) {
                            obj = next;
                            e = e2;
                        }
                    } while (it.hasNext());
                }
            }
            return new OrderResponse(c, (bc7) obj);
        }
    }

    /* compiled from: OrderManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hg7$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            hg7.this.c.c();
        }
    }

    /* compiled from: OrderManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hg7$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ ea9<jp7> a;
        final /* synthetic */ hg7 b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ea9<jp7> ea9Var, hg7 hg7Var, String str, int i) {
            super(0);
            this.a = ea9Var;
            this.b = hg7Var;
            this.c = str;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [jp7, T] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.a = this.b.A(this.c, this.d);
        }
    }

    /* compiled from: OrderManagerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hg7$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<Boolean> {
        g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(hg7.this.j.a(bq3.j6));
        }
    }

    public hg7(fi7 fi7Var, OrderApi orderApi, bd bdVar, lg7 lg7Var, vc6 vc6Var, dua duaVar, ko5 ko5Var, i22 i22Var, an anVar, hq3 hq3Var) {
        rn5 b2;
        z65.h(fi7Var, "orderRepository");
        z65.h(orderApi, "orderApi");
        z65.h(bdVar, "analyticsHelper");
        z65.h(lg7Var, "orderMapper");
        z65.h(vc6Var, "memoryDataSource");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(ko5Var, "legacyCartService");
        z65.h(i22Var, "createOrderWithApiLogic");
        z65.h(anVar, "appBackgroundStateDetector");
        z65.h(hq3Var, "featureService");
        this.a = fi7Var;
        this.b = orderApi;
        this.c = bdVar;
        this.d = lg7Var;
        this.e = vc6Var;
        this.f = duaVar;
        this.g = ko5Var;
        this.h = i22Var;
        this.i = anVar;
        this.j = hq3Var;
        this.k = LoggerFactory.getLogger("OrderService");
        b2 = yn5.b(new g());
        this.l = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jp7 A(String str, int i) {
        bc7 bc7Var;
        OrderResponse orderResponse;
        OrderResponse orderResponse2 = null;
        while (i > 0) {
            try {
                OrderResponseDto payedOrder = this.b.getPayedOrder(str);
                StateEntity d2 = this.f.d(payedOrder.getState());
                DataOrderDto createdOrder = payedOrder.getCreatedOrder();
                if (createdOrder != null) {
                    bc7Var = this.d.b(createdOrder, y());
                } else {
                    bc7Var = null;
                }
                orderResponse = new OrderResponse(d2, bc7Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
            } catch (Throwable th2) {
                th = th2;
                orderResponse2 = orderResponse;
                this.k.error("Failed to get order place response", th);
            }
            if (OrderResponseKt.isFailed(orderResponse)) {
                return z(orderResponse);
            }
            if (!OrderResponseKt.isSuccessful(orderResponse)) {
                ig7.d(3000L);
                i--;
                orderResponse2 = orderResponse;
            } else {
                this.c.b(orderResponse);
                x(orderResponse.getCreatedOrder());
                if (orderResponse.getCreatedOrder() != null) {
                    jp7.a aVar = jp7.d;
                    bc7 createdOrder2 = orderResponse.getCreatedOrder();
                    z65.e(createdOrder2);
                    return aVar.c(createdOrder2.t());
                }
                return jp7.d.a();
            }
        }
        if (orderResponse2 != null && OrderResponseKt.isFailedToPlace(orderResponse2)) {
            this.a.b(lp7.c);
            this.e.f(oqb.c);
            return jp7.d.b();
        }
        this.a.b(lp7.b);
        return jp7.d.a();
    }

    private final void s(bc7 bc7Var) {
        List I0;
        I0 = sc1.I0(getActiveOrders());
        List<bc7> list = I0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (bc7 bc7Var2 : list) {
                if (z65.c(bc7Var2.t(), bc7Var.t())) {
                    break;
                }
            }
        }
        I0.add(0, bc7Var);
        this.a.c(I0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(OrderResponse orderResponse) {
        StateEntity state = orderResponse.getState();
        Logger logger = this.k;
        Integer step = state.getStep();
        logger.info("Order successfully created [current step = " + step + "]");
        Integer step2 = state.getStep();
        Integer num = null;
        if (step2 != null && step2.intValue() == 3) {
            du7.a aVar = du7.b;
            DataPaymentEntity dataPayment = state.getDataPayment();
            if (dataPayment != null) {
                num = Integer.valueOf(dataPayment.getPaymentMethodType());
            }
            if (aVar.a(num).o()) {
                this.a.b(lp7.b);
            }
            this.c.b(orderResponse);
            x(orderResponse.getCreatedOrder());
            return;
        }
        ko5.a.a(this.g, state, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderPersonalization u(StateEntity stateEntity) {
        DeliveryExperimentEntity deliveryExperimentEntity;
        k0<MapEntry> k0Var;
        UpsellProductsEntity upsellProducts;
        PersonalizationEntity personalization = stateEntity.getPersonalization();
        k0<MapEntry> k0Var2 = null;
        if (personalization != null) {
            deliveryExperimentEntity = personalization.getDeliveryExperimentInfo();
        } else {
            deliveryExperimentEntity = null;
        }
        PersonalizationEntity personalization2 = stateEntity.getPersonalization();
        if (personalization2 != null && (upsellProducts = personalization2.getUpsellProducts()) != null) {
            k0Var = upsellProducts.getAdditionalData();
        } else {
            k0Var = null;
        }
        double minDeliveryPrice = stateEntity.getMinDeliveryPrice();
        double minDeliveryPriceCustomized = stateEntity.getMinDeliveryPriceCustomized();
        Double valueOf = Double.valueOf(minDeliveryPrice);
        Double valueOf2 = Double.valueOf(minDeliveryPriceCustomized);
        if (deliveryExperimentEntity != null) {
            k0Var2 = deliveryExperimentEntity.getAdditionalData();
        }
        return new OrderPersonalization(new MinDeliveryPrice(valueOf, valueOf2, UpsellProductsEntityKt.realmListToMap(k0Var2)), new UpsellProducts(UpsellProductsEntityKt.realmListToMap(k0Var)));
    }

    private final fnb<OrderResponse> v(s51 s51Var) {
        fnb<OrderResponse> c2;
        c2 = ig7.c(3, 1000L, new d(s51Var));
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<bc7> w() {
        int w;
        List x0;
        List<DataOrderDto> activeOrders = this.b.getActiveOrders();
        w = lc1.w(activeOrders, 10);
        ArrayList arrayList = new ArrayList(w);
        for (DataOrderDto dataOrderDto : activeOrders) {
            arrayList.add(this.d.b(dataOrderDto, y()));
        }
        x0 = sc1.x0(arrayList);
        return x0;
    }

    private final void x(bc7 bc7Var) {
        if (bc7Var != null) {
            s(bc7Var);
            this.a.b(lp7.a);
            return;
        }
        this.a.b(lp7.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    private final jp7 z(OrderResponse orderResponse) {
        int w;
        String str;
        k0<StateErrorEntity> errors = orderResponse.getState().getErrors();
        if (!(errors instanceof Collection) || !errors.isEmpty()) {
            for (StateErrorEntity stateErrorEntity : errors) {
                Integer errorCode = stateErrorEntity.getErrorCode();
                if (errorCode != null && errorCode.intValue() == 27) {
                    this.a.b(lp7.d);
                    k0<StateErrorEntity> errors2 = orderResponse.getState().getErrors();
                    w = lc1.w(errors2, 10);
                    ArrayList arrayList = new ArrayList(w);
                    for (StateErrorEntity stateErrorEntity2 : errors2) {
                        Integer num = null;
                        if (stateErrorEntity2 != null) {
                            str = stateErrorEntity2.getDescription();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (stateErrorEntity2 != null) {
                            num = stateErrorEntity2.getErrorCode();
                        }
                        arrayList.add(new ik3(str, ((Number) mh5.c(num, 0)).intValue()));
                    }
                    return jp7.d.d(arrayList);
                }
            }
        }
        this.a.b(lp7.c);
        this.e.f(oqb.c);
        return jp7.d.b();
    }

    @Override // defpackage.li7
    public lp7 a() {
        return this.a.a();
    }

    @Override // defpackage.li7
    public synchronized void b(String str) {
        z65.h(str, "orderId");
        try {
            bc7 g2 = g(str);
            if (g2 != null) {
                this.c.d(g2);
                Integer component1 = this.b.cancelOrder(new CancelOrderRequest(str)).component1();
                if (component1 != null && component1.intValue() == 1) {
                    this.e.e(g2.e());
                    this.a.clear();
                } else {
                    throw new IllegalStateException(("Can`t cancel order: error " + component1 + " ").toString());
                }
            } else {
                throw new IllegalStateException(("Order " + str + " not exists ").toString());
            }
        } catch (Exception e2) {
            Logger logger = this.k;
            z65.g(logger, "logger");
            hq4.a(logger, e2, "Can`t cancel order " + str + " ");
            throw e2;
        }
    }

    @Override // defpackage.li7
    public synchronized wf8 c(String str) {
        OrderApi orderApi;
        List<String> e2;
        z65.h(str, "orderId");
        orderApi = this.b;
        e2 = jc1.e(str);
        return this.d.c(orderApi.getPositionCourier(e2));
    }

    @Override // defpackage.li7
    public void d(String str, String str2) {
        z65.h(str, "orderId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        this.f.d(this.b.repeatOrder(new RepeatOrderDto(str, str2)).getState());
    }

    @Override // defpackage.li7
    public jp7 e(String str, int i) {
        jp7 jp7Var;
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        this.c.a();
        ea9 ea9Var = new ea9();
        this.i.c(new e()).a(new f(ea9Var, this, str, i));
        bd bdVar = this.c;
        T t = ea9Var.a;
        if (t == 0) {
            z65.z("paidOrderResponse");
            jp7Var = null;
        } else {
            jp7Var = (jp7) t;
        }
        bdVar.e(!jp7Var.d());
        T t2 = ea9Var.a;
        if (t2 == 0) {
            z65.z("paidOrderResponse");
            return null;
        }
        return (jp7) t2;
    }

    @Override // defpackage.li7
    public OrderResponse f(s51 s51Var) {
        z65.h(s51Var, "checkoutRequest");
        return (OrderResponse) hnb.b(hnb.c(v(s51Var), new b()), new c()).c();
    }

    @Override // defpackage.li7
    public synchronized bc7 g(String str) {
        Object obj;
        try {
            z65.h(str, "orderId");
            Iterator<T> it = getActiveOrders().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((bc7) obj).t(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (bc7) obj;
    }

    @Override // defpackage.li7
    public synchronized Collection<bc7> getActiveOrders() {
        Collection<bc7> activeOrders;
        activeOrders = this.a.getActiveOrders();
        if (activeOrders == null) {
            activeOrders = w();
            this.a.c(activeOrders);
        }
        return activeOrders;
    }
}
