package com.dodopizza.order.feature.menu.ordertypeswitcher;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeSwitcherPresenter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0016\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0016\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Lok3;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", Image.TYPE_SMALL, "t", "u", "v", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$c;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$d;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$e;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$g;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$h;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$i;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$j;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$l;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$m;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$n;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$o;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$p;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$q;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$r;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$s;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$t;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$u;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$v;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class b extends ok3 {

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0184b extends b {
        public static final C0184b a = new C0184b();

        private C0184b() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$c;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "Llk7$d;", "b", "Llk7$d;", "()Llk7$d;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Ld88;Llk7$d;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends b {
        private final d88 a;
        private final lk7.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d88 d88Var, lk7.d dVar) {
            super(null);
            z65.h(d88Var, "pizzeria");
            z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = d88Var;
            this.b = dVar;
        }

        public final d88 a() {
            return this.a;
        }

        public final lk7.d b() {
            return this.b;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$d;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d extends b {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$e;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends b {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$f;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends b {
        private final ou2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ou2 ou2Var) {
            super(null);
            z65.h(ou2Var, "deliverablePlace");
            this.a = ou2Var;
        }

        public final ou2 a() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$g;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class g extends b {
        private final ou2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ou2 ou2Var) {
            super(null);
            z65.h(ou2Var, "deliverablePlace");
            this.a = ou2Var;
        }

        public final ou2 a() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$h;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h extends b {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$i;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i extends b {
        public static final i a = new i();

        private i() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$j;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class j extends b {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "a", "b", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class k extends b {

        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends k {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: OrderTypeSwitcherPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$k;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.b$k$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0185b extends k {
            public static final C0185b a = new C0185b();

            private C0185b() {
                super(null);
            }
        }

        public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private k() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$l;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Ley5;", "a", "Ley5;", "()Ley5;", "loginReason", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class l extends b {
        private final ey5 a;

        public final ey5 a() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$m;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Ley5;", "a", "Ley5;", "()Ley5;", "loginReason", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class m extends b {
        private final ey5 a;

        public final ey5 a() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$n;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Lov5;", "a", "Lov5;", "()Lov5;", "location", "<init>", "(Lov5;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class n extends b {
        private final ov5 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ov5 ov5Var) {
            super(null);
            z65.h(ov5Var, "location");
            this.a = ov5Var;
        }

        public final ov5 a() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$o;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class o extends b {
        public static final o a = new o();

        private o() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$p;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class p extends b {
        public static final p a = new p();

        private p() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$q;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "<init>", "(Ld88;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class q extends b {
        private final d88 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(d88 d88Var) {
            super(null);
            z65.h(d88Var, "pizzeria");
            this.a = d88Var;
        }

        public final d88 a() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$r;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class r extends b {
        public static final r a = new r();

        private r() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$s;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class s extends b {
        public static final s a = new s();

        private s() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$t;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "Llk7$d;", "b", "Llk7$d;", "()Llk7$d;", KustoStorage.KustoTable.COLUMN_SOURCE, "", com.huawei.hms.opendevice.c.a, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isNearestPizzeria", "<init>", "(Ld88;Llk7$d;Ljava/lang/Boolean;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class t extends b {
        private final d88 a;
        private final lk7.d b;
        private final Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(d88 d88Var, lk7.d dVar, Boolean bool) {
            super(null);
            z65.h(d88Var, "pizzeria");
            z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = d88Var;
            this.b = dVar;
            this.c = bool;
        }

        public final d88 a() {
            return this.a;
        }

        public final lk7.d b() {
            return this.b;
        }

        public final Boolean c() {
            return this.c;
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$u;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class u extends b {
        public static final u a = new u();

        private u() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b$v;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/b;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class v extends b {
        public static final v a = new v();

        private v() {
            super(null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
