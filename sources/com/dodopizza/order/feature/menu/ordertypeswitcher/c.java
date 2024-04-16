package com.dodopizza.order.feature.menu.ordertypeswitcher;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeSwitcherExternalRouter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\u0004\u0019\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H&J6\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H&J>\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H&J6\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0007H&J$\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0007H&JF\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010 \u001a\u00020\u0003H&¨\u0006!"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c;", "", "Loz3;", "", "a", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;", "listener", com.huawei.hms.opendevice.c.a, "", "isEmptyCart", "hasAddresses", "Ljk7;", "orderType", "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, "Le91;", "clientDeliveryLocation", com.huawei.hms.push.e.a, "", "currentAddress", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", Image.TYPE_HIGH, "b", "selectedPizzeriaId", "isNewMapOnPizzeriaCombinedViewEnabled", "isSelectPizzeriaCombinedViewEnabled", "isGooglePlayServicesAvailable", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", "g", "f", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: OrderTypeSwitcherExternalRouter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a$c;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0186a extends a {
            private final ou2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0186a(ou2 ou2Var) {
                super(null);
                z65.h(ou2Var, "deliverablePlace");
                this.a = ou2Var;
            }

            public final ou2 a() {
                return this.a;
            }
        }

        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends a {
            private final ou2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ou2 ou2Var) {
                super(null);
                z65.h(ou2Var, "deliverablePlace");
                this.a = ou2Var;
            }

            public final ou2 a() {
                return this.a;
            }
        }

        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a$c;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.c$a$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0187c extends a {
            public static final C0187c a = new C0187c();

            private C0187c() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OrderTypeSwitcherExternalRouter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", "Ld88;", "a", "Ld88;", "b", "()Ld88;", "pizzeria", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$c;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$c;", "()Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$c;", "mode", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$d;", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$d;", "()Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$d;", "selectedPizzeriaType", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isNearestPizzeria", "<init>", "(Ld88;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$c;Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$d;Ljava/lang/Boolean;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends b {
            private final d88 a;
            private final EnumC0189c b;
            private final d c;
            private final Boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d88 d88Var, EnumC0189c enumC0189c, d dVar, Boolean bool) {
                super(null);
                z65.h(d88Var, "pizzeria");
                z65.h(enumC0189c, "mode");
                z65.h(dVar, "selectedPizzeriaType");
                this.a = d88Var;
                this.b = enumC0189c;
                this.c = dVar;
                this.d = bool;
            }

            public final EnumC0189c a() {
                return this.b;
            }

            public final d88 b() {
                return this.a;
            }

            public final d c() {
                return this.c;
            }

            public final Boolean d() {
                return this.d;
            }
        }

        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0188b extends b {
            public static final C0188b a = new C0188b();

            private C0188b() {
                super(null);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.c$b$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class EnumC0189c {
            public static final EnumC0189c a = new EnumC0189c("MAP", 0);
            public static final EnumC0189c b = new EnumC0189c("LIST", 1);
            private static final /* synthetic */ EnumC0189c[] c;
            private static final /* synthetic */ kj3 d;

            static {
                EnumC0189c[] a2 = a();
                c = a2;
                d = lj3.a(a2);
            }

            private EnumC0189c(String str, int i) {
            }

            private static final /* synthetic */ EnumC0189c[] a() {
                return new EnumC0189c[]{a, b};
            }

            public static EnumC0189c valueOf(String str) {
                return (EnumC0189c) Enum.valueOf(EnumC0189c.class, str);
            }

            public static EnumC0189c[] values() {
                return (EnumC0189c[]) c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class d {
            public static final d a = new d("CARRYOUT", 0);
            public static final d b = new d("RESTAURANT", 1);
            private static final /* synthetic */ d[] c;
            private static final /* synthetic */ kj3 d;

            static {
                d[] a2 = a();
                c = a2;
                d = lj3.a(a2);
            }

            private d(String str, int i) {
            }

            private static final /* synthetic */ d[] a() {
                return new d[]{a, b};
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) c.clone();
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OrderTypeSwitcherExternalRouter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0190c {

        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC0190c {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: OrderTypeSwitcherExternalRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.c$c$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC0190c {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        private AbstractC0190c() {
        }

        public /* synthetic */ AbstractC0190c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    oz3<Unit> a();

    void b(qx1 qx1Var, Function1<? super a, Unit> function1);

    void c(qx1 qx1Var, Function1<? super AbstractC0190c, Unit> function1);

    void d(qx1 qx1Var, boolean z, boolean z2, jk7 jk7Var, Function0<Unit> function0);

    void e(qx1 qx1Var, boolean z, boolean z2, jk7 jk7Var, e91 e91Var, Function0<Unit> function0);

    void f();

    void g(qx1 qx1Var, String str, boolean z, boolean z2, boolean z3, Function1<? super b, Unit> function1);

    void h(qx1 qx1Var, boolean z, String str, Function1<? super a, Unit> function1);
}
