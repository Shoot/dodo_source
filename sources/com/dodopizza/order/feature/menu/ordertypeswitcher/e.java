package com.dodopizza.order.feature.menu.ordertypeswitcher;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.a;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk7;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeSwitcherInteractor.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001$B\u007f\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020A\u0012\u0006\u0010F\u001a\u00020D\u0012\u0006\u0010I\u001a\u00020G\u0012\u0006\u0010L\u001a\u00020J\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010S\u001a\u00020Q\u0012\u0006\u0010V\u001a\u00020T¢\u0006\u0004\bW\u0010XJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016J\u0012\u0010!\u001a\f\u0012\u0004\u0012\u00020\u001f0\u0013j\u0002` H\u0016J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\"0\u0013H\u0016J\u0010\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013H\u0016J\u0012\u0010%\u001a\f\u0012\u0004\u0012\u00020\u001f0\u0013j\u0002` H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0013H\u0016R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010U¨\u0006Z"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/e;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/d;", "Lox1;", "Loz3;", "Lb61;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "O", "", "N", com.huawei.hms.opendevice.c.a, "Ld88;", "pizzeria", "Llk7$d;", "pizzeriaSource", "t", "", "isNearestPizzeria", "k", "(Ld88;Llk7$d;Ljava/lang/Boolean;)Loz3;", "Lwx;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "f", "Lou2;", "deliverablePlace", "Llk7$a;", "addressSource", Image.TYPE_HIGH, "j", "n", "o", DateTokenConverter.CONVERTER_KEY, "", "Lcom/dodopizza/async/AsyncJob;", "l", "", com.huawei.hms.push.e.a, "a", "b", "g", "", "i", "Lgy3;", "Lgy3;", "firebaseToggleService", "Lv61;", "Lv61;", "checkoutStateService", "Lx42;", "Lx42;", "customerAddressService", "Li00;", "Li00;", "authorizationState", "Lqd;", "Lqd;", "analyticsSender", "Lhq3;", "Lhq3;", "featureService", "Lv52;", "Lv52;", "customerSettingsService", "Ldt5;", "Ldt5;", "locality", "Le98;", "Le98;", "pizzeriaService", "Lok7;", "Lok7;", "orderTypeDiscountFormatter", "Ltk7;", "Ltk7;", "orderTypeDiscountService", "Lava;", "Lava;", "stateProvider", "Lld9;", Image.TYPE_MEDIUM, "Lld9;", "remoteConfigService", "Lbo;", "Lbo;", "appInitializationStateProvider", "Ldua;", "Ldua;", "stateAnalyzer", "<init>", "(Lgy3;Lv61;Lx42;Li00;Lqd;Lhq3;Lv52;Ldt5;Le98;Lok7;Ltk7;Lava;Lld9;Lbo;Ldua;)V", "p", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e implements com.dodopizza.order.feature.menu.ordertypeswitcher.d, ox1 {
    public static final a p = new a(null);
    public static final int q = 8;
    private static volatile boolean r;
    private static volatile boolean s;
    private final gy3 a;
    private final v61 b;
    private final x42 c;
    private final i00 d;
    private final qd e;
    private final hq3 f;
    private final v52 g;
    private final dt5 h;
    private final e98 i;
    private final ok7 j;
    private final tk7 k;
    private final ava l;
    private final ld9 m;
    private final bo n;
    private final dua o;

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/e$a;", "", "", "isNoPaymentMethodsShown", "Z", "isSelectOrderTypeShown", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$actualizeMinDeliveryPrice$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super StateEntity>, Object> {
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
        public final Object invoke(cv1<? super StateEntity> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return e.this.o.c();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ld88;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$getAllRestaurantPizzerias$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super List<? extends d88>>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<d88>> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : e.this.i.a(e.this.h)) {
                    if (((d88) obj2).G().contains(ib7.e)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<oz3<? extends a.b>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderTypeSwitcherInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$getCurrentData$1$1", f = "OrderTypeSwitcherInteractor.kt", l = {96}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements Function2<pz3<? super a.b>, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ e b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = eVar;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(pz3<? super a.b> pz3Var, cv1<? super Unit> cv1Var) {
                return ((a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                    bo boVar = this.b.n;
                    this.a = 1;
                    if (co.b(boVar, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<a.b> invoke() {
            e eVar = e.this;
            return wz3.H(eVar.O(eVar.b.m()), new a(e.this, null));
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$getNoPaymentMethodsFlashMessage$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0191e extends f3b implements Function1<cv1<? super String>, Object> {
        int a;

        C0191e(cv1<? super C0191e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new C0191e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((C0191e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            StateWarningEntity stateWarningEntity;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (!e.this.f.a(bq3.j5) || e.r) {
                    return null;
                }
                Iterator<StateWarningEntity> it = e.this.l.e().getWarnings().iterator();
                while (true) {
                    if (it.hasNext()) {
                        stateWarningEntity = it.next();
                        Integer code = stateWarningEntity.getCode();
                        if (code != null && code.intValue() == 101) {
                            break;
                        }
                    } else {
                        stateWarningEntity = null;
                        break;
                    }
                }
                StateWarningEntity stateWarningEntity2 = stateWarningEntity;
                if (stateWarningEntity2 == null) {
                    return null;
                }
                return stateWarningEntity2.getDescription();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$getRestaurantDiscount$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function1<cv1<? super String>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                vk7 a = e.this.k.a();
                String b = a.b();
                e eVar = e.this;
                if (b.length() == 0) {
                    return eVar.j.a(a.a());
                }
                return b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$isNeedToShowCovidWarning$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function1<cv1<? super Boolean>, Object> {
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
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (e.this.g.b("order_type_switcher_covid_warning_show") && e.this.f.a(bq3.o)) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$properDistanceToDeliveryAddress$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function1<cv1<? super Integer>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Integer> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int i;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (e.this.f.a(bq3.M5) && e.this.a.a(bq3.V6)) {
                    i = Integer.parseInt(e.this.m.a("distance_to_delivery_address_validation_segment"));
                } else {
                    i = 0;
                }
                return nf0.c(i);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function0<oz3<? extends a.b>> {
        final /* synthetic */ d88 b;
        final /* synthetic */ lk7.d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(d88 d88Var, lk7.d dVar) {
            super(0);
            this.b = d88Var;
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<a.b> invoke() {
            e eVar = e.this;
            return eVar.O(eVar.b.i(this.b, this.c, e.this.e));
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function0<oz3<? extends a.b>> {
        final /* synthetic */ ou2 b;
        final /* synthetic */ lk7.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ou2 ou2Var, lk7.a aVar) {
            super(0);
            this.b = ou2Var;
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<a.b> invoke() {
            e eVar = e.this;
            return eVar.O(eVar.b.e(this.b, true, this.c, e.this.e));
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function0<oz3<? extends a.b>> {
        final /* synthetic */ lk7.d a;
        final /* synthetic */ e b;
        final /* synthetic */ d88 c;
        final /* synthetic */ Boolean d;

        /* compiled from: OrderTypeSwitcherInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[lk7.d.values().length];
                try {
                    iArr[lk7.d.e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(lk7.d dVar, e eVar, d88 d88Var, Boolean bool) {
            super(0);
            this.a = dVar;
            this.b = eVar;
            this.c = d88Var;
            this.d = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<a.b> invoke() {
            qd qdVar;
            if (a.$EnumSwitchMapping$0[this.a.ordinal()] != 1) {
                qdVar = this.b.e;
            } else {
                qdVar = ck1.Z;
            }
            e eVar = this.b;
            return eVar.O(eVar.b.h(this.c, this.a, qdVar, this.d));
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$setCovidWarningShown$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class l extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new l(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((l) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e.this.g.c("order_type_switcher_covid_warning_show", false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$setNoPaymentMethodsFlashShown$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class m extends f3b implements Function1<cv1<? super Unit>, Object> {
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e.r = true;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class n extends ej5 implements Function0<oz3<? extends a.b>> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<a.b> invoke() {
            e eVar = e.this;
            return eVar.O(eVar.b.p(e.this.e));
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class o extends ej5 implements Function0<oz3<? extends a.b>> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<a.b> invoke() {
            e eVar = e.this;
            return eVar.O(eVar.b.j(e.this.e));
        }
    }

    /* compiled from: OrderTypeSwitcherInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$tryToShowSelectOrderType$1", f = "OrderTypeSwitcherInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class p extends f3b implements Function1<cv1<? super Boolean>, Object> {
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
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((p) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                boolean z = e.s;
                e.s = true;
                return nf0.a(!z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class q implements oz3<a.b> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ e b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ e b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherInteractorImpl$withExtraInfo$$inlined$map$1$2", f = "OrderTypeSwitcherInteractor.kt", l = {223}, m = "emit")
            /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.e$q$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0192a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0192a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, e eVar) {
                this.a = pz3Var;
                this.b = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, defpackage.cv1 r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.dodopizza.order.feature.menu.ordertypeswitcher.e.q.a.C0192a
                    if (r0 == 0) goto L13
                    r0 = r11
                    com.dodopizza.order.feature.menu.ordertypeswitcher.e$q$a$a r0 = (com.dodopizza.order.feature.menu.ordertypeswitcher.e.q.a.C0192a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.order.feature.menu.ordertypeswitcher.e$q$a$a r0 = new com.dodopizza.order.feature.menu.ordertypeswitcher.e$q$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r11)
                    goto L73
                L29:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L31:
                    defpackage.vk9.b(r11)
                    pz3 r11 = r9.a
                    b61 r10 = (defpackage.b61) r10
                    com.dodopizza.order.feature.menu.ordertypeswitcher.a$b r2 = new com.dodopizza.order.feature.menu.ordertypeswitcher.a$b
                    bo3 r4 = new bo3
                    com.dodopizza.order.feature.menu.ordertypeswitcher.e r5 = r9.b
                    i00 r5 = com.dodopizza.order.feature.menu.ordertypeswitcher.e.q(r5)
                    boolean r5 = r5.b()
                    com.dodopizza.order.feature.menu.ordertypeswitcher.e r6 = r9.b
                    x42 r6 = com.dodopizza.order.feature.menu.ordertypeswitcher.e.s(r6)
                    boolean r6 = r6.g()
                    com.dodopizza.order.feature.menu.ordertypeswitcher.e r7 = r9.b
                    java.lang.String r7 = com.dodopizza.order.feature.menu.ordertypeswitcher.e.y(r7)
                    com.dodopizza.order.feature.menu.ordertypeswitcher.e r8 = r9.b
                    ava r8 = com.dodopizza.order.feature.menu.ordertypeswitcher.e.E(r8)
                    com.dodopizza.persistence.entity.cart.StateEntity r8 = r8.e()
                    int r8 = r8.getPizzeriaAverageServiceTimeMinutes()
                    r4.<init>(r5, r6, r7, r8)
                    r2.<init>(r10, r4)
                    r0.b = r3
                    java.lang.Object r10 = r11.emit(r2, r0)
                    if (r10 != r1) goto L73
                    return r1
                L73:
                    kotlin.Unit r10 = kotlin.Unit.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.menu.ordertypeswitcher.e.q.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public q(oz3 oz3Var, e eVar) {
            this.a = oz3Var;
            this.b = eVar;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super a.b> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public e(gy3 gy3Var, v61 v61Var, x42 x42Var, i00 i00Var, qd qdVar, hq3 hq3Var, v52 v52Var, dt5 dt5Var, e98 e98Var, ok7 ok7Var, tk7 tk7Var, ava avaVar, ld9 ld9Var, bo boVar, dua duaVar) {
        z65.h(gy3Var, "firebaseToggleService");
        z65.h(v61Var, "checkoutStateService");
        z65.h(x42Var, "customerAddressService");
        z65.h(i00Var, "authorizationState");
        z65.h(qdVar, "analyticsSender");
        z65.h(hq3Var, "featureService");
        z65.h(v52Var, "customerSettingsService");
        z65.h(dt5Var, "locality");
        z65.h(e98Var, "pizzeriaService");
        z65.h(ok7Var, "orderTypeDiscountFormatter");
        z65.h(tk7Var, "orderTypeDiscountService");
        z65.h(avaVar, "stateProvider");
        z65.h(ld9Var, "remoteConfigService");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(duaVar, "stateAnalyzer");
        this.a = gy3Var;
        this.b = v61Var;
        this.c = x42Var;
        this.d = i00Var;
        this.e = qdVar;
        this.f = hq3Var;
        this.g = v52Var;
        this.h = dt5Var;
        this.i = e98Var;
        this.j = ok7Var;
        this.k = tk7Var;
        this.l = avaVar;
        this.m = ld9Var;
        this.n = boVar;
        this.o = duaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String N() {
        StateErrorEntity stateErrorEntity;
        Iterator<StateErrorEntity> it = this.l.e().getErrors().iterator();
        while (true) {
            if (it.hasNext()) {
                stateErrorEntity = it.next();
                Integer errorCode = stateErrorEntity.getErrorCode();
                if (errorCode != null && errorCode.intValue() == 103) {
                    break;
                }
            } else {
                stateErrorEntity = null;
                break;
            }
        }
        StateErrorEntity stateErrorEntity2 = stateErrorEntity;
        if (stateErrorEntity2 == null) {
            return null;
        }
        return stateErrorEntity2.getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<a.b> O(oz3<b61> oz3Var) {
        return new q(oz3Var, this);
    }

    public <T> wx<T> K(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> L(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public <T> oz3<T> M(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<String> a() {
        return K(new C0191e(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<Unit> b() {
        return L(new m(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public oz3<a.b> c() {
        return M(new d());
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<Boolean> d() {
        return K(new g(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<List<d88>> e() {
        return K(new c(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<StateEntity> f() {
        return K(new b(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<Boolean> g() {
        return K(new p(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public oz3<a.b> h(ou2 ou2Var, lk7.a aVar) {
        z65.h(ou2Var, "deliverablePlace");
        z65.h(aVar, "addressSource");
        return M(new j(ou2Var, aVar));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<Integer> i() {
        return K(new h(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public oz3<a.b> j() {
        return M(new o());
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public oz3<a.b> k(d88 d88Var, lk7.d dVar, Boolean bool) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, "pizzeriaSource");
        return M(new k(dVar, this, d88Var, bool));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<Unit> l() {
        return L(new l(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public oz3<a.b> n() {
        return M(new n());
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public wx<String> o() {
        return K(new f(null));
    }

    @Override // com.dodopizza.order.feature.menu.ordertypeswitcher.d
    public oz3<a.b> t(d88 d88Var, lk7.d dVar) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, "pizzeriaSource");
        return M(new i(d88Var, dVar));
    }
}
