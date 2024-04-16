package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.shoppingcart.adapter.good.pizza.PizzaCartProductViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: HalvesCartProductBinder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BW\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001c"}, d2 = {"Lck4;", "Loyb;", "Lcom/dodopizza/order/feature/shoppingcart/adapter/good/pizza/PizzaCartProductViewHolder;", "Ljl4;", "data", "", Image.TYPE_MEDIUM, "k", "l", "n", "view", "", "position", "j", "Lkotlin/Function1;", "Lnq0;", "a", "Lkotlin/jvm/functions/Function1;", "minusCountListener", "b", "plusCountListener", com.huawei.hms.opendevice.c.a, "removeListener", "Lv23;", DateTokenConverter.CONVERTER_KEY, "discountListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ck4  reason: default package */
/* loaded from: classes2.dex */
public final class ck4 extends oyb<PizzaCartProductViewHolder, jl4> {
    private final Function1<nq0, Unit> a;
    private final Function1<nq0, Unit> b;
    private final Function1<nq0, Unit> c;
    private final Function1<v23, Unit> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        public static final d a = new d();

        d() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.d.invoke(this.b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.d.invoke(this.b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$i */
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$j */
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmr0;", "half", "", "a", "(Lmr0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ck4$k */
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function1<mr0, CharSequence> {
        public static final k a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(mr0 mr0Var) {
            z65.h(mr0Var, "half");
            return qhb.a(mr0Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$l */
    /* loaded from: classes2.dex */
    public static final class l extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ck4$m */
    /* loaded from: classes2.dex */
    public static final class m extends ej5 implements Function0<Unit> {
        final /* synthetic */ jl4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(jl4 jl4Var) {
            super(0);
            this.b = jl4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ck4.this.b.invoke(this.b.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ck4(Function1<? super nq0, Unit> function1, Function1<? super nq0, Unit> function12, Function1<? super nq0, Unit> function13, Function1<? super v23, Unit> function14) {
        z65.h(function1, "minusCountListener");
        z65.h(function12, "plusCountListener");
        z65.h(function13, "removeListener");
        z65.h(function14, "discountListener");
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
    }

    private final void k(PizzaCartProductViewHolder pizzaCartProductViewHolder, jl4 jl4Var) {
        List o;
        String i0;
        o = kc1.o(jl4Var.f(), jl4Var.k());
        ArrayList arrayList = new ArrayList();
        for (Object obj : o) {
            if (((mr0) obj).e()) {
                arrayList.add(obj);
            }
        }
        i0 = sc1.i0(arrayList, null, null, null, 0, null, k.a, 31, null);
        pizzaCartProductViewHolder.showStopHalves(i0);
    }

    private final void l(PizzaCartProductViewHolder pizzaCartProductViewHolder, jl4 jl4Var) {
        if (jl4Var.a() > 0) {
            pizzaCartProductViewHolder.enableMinusCounter();
        } else {
            pizzaCartProductViewHolder.disableMinusCounter();
        }
        if (jl4Var.a() < jl4Var.g()) {
            pizzaCartProductViewHolder.enablePlusCounter();
        } else {
            pizzaCartProductViewHolder.disablePlusCounter();
        }
    }

    private final void m(PizzaCartProductViewHolder pizzaCartProductViewHolder, jl4 jl4Var) {
        hn6 j2 = jl4Var.j();
        v23 d2 = jl4Var.d();
        z65.e(d2);
        hn6 f2 = rn6.f(j2, rn6.g(d2.a(), Math.max(jl4Var.a(), 1)));
        if (rn6.c(f2, jl4Var.j()) > 0) {
            pizzaCartProductViewHolder.showPriceSector();
            pizzaCartProductViewHolder.setFinalPrice(un6.b(jl4Var.j()));
            pizzaCartProductViewHolder.showRawPrice(un6.b(f2));
        } else if (jl4Var.j().e()) {
            pizzaCartProductViewHolder.showPriceSector();
            pizzaCartProductViewHolder.setFinalPrice(un6.b(jl4Var.j()));
            pizzaCartProductViewHolder.hideRawPrice();
        } else {
            pizzaCartProductViewHolder.hidePriceSector();
        }
    }

    private final void n(PizzaCartProductViewHolder pizzaCartProductViewHolder, jl4 jl4Var) {
        if (jl4Var.a() != 0) {
            pizzaCartProductViewHolder.showAddedGift();
            pizzaCartProductViewHolder.setOnRemoveClickListener(new l(jl4Var));
            return;
        }
        pizzaCartProductViewHolder.showRemovedGift();
        pizzaCartProductViewHolder.setOnRemoveClickListener(new m(jl4Var));
    }

    @Override // defpackage.oyb
    /* renamed from: j */
    public void b(PizzaCartProductViewHolder pizzaCartProductViewHolder, jl4 jl4Var, int i2) {
        z65.h(pizzaCartProductViewHolder, "view");
        z65.h(jl4Var, "data");
        pizzaCartProductViewHolder.setTitle(jl4Var.h());
        pizzaCartProductViewHolder.setDoughDescription(jl4Var.e());
        pizzaCartProductViewHolder.prepareImageView(jl4Var.i());
        pizzaCartProductViewHolder.showHalvesImage(jl4Var.f().c(), jl4Var.k().c());
        if (jl4Var.d() != null && jl4Var.l()) {
            if (jl4Var.b()) {
                k(pizzaCartProductViewHolder, jl4Var);
                pizzaCartProductViewHolder.hidePriceSector();
                pizzaCartProductViewHolder.showRemoveButton();
                n(pizzaCartProductViewHolder, jl4Var);
            } else if (jl4Var.g() > 1 && jl4Var.a() != 0) {
                pizzaCartProductViewHolder.hideStop();
                m(pizzaCartProductViewHolder, jl4Var);
                pizzaCartProductViewHolder.showCounterButton();
                pizzaCartProductViewHolder.setOnMinusCounterClickListener(new b(jl4Var));
                pizzaCartProductViewHolder.setCounter(String.valueOf(jl4Var.a()));
                pizzaCartProductViewHolder.setOnPlusCounterClickListener(new c(jl4Var));
                l(pizzaCartProductViewHolder, jl4Var);
            } else {
                pizzaCartProductViewHolder.hideStop();
                m(pizzaCartProductViewHolder, jl4Var);
                pizzaCartProductViewHolder.showRemoveButton();
                n(pizzaCartProductViewHolder, jl4Var);
            }
            if (jl4Var.d().d() > 0) {
                pizzaCartProductViewHolder.setLoyaltyGiftTitle(jl4Var.d().d());
                pizzaCartProductViewHolder.setOnDiscountClickListener(d.a);
                return;
            }
            pizzaCartProductViewHolder.setGiftTitle(jl4Var.d().f());
            pizzaCartProductViewHolder.setOnDiscountClickListener(new e(jl4Var));
        } else if (jl4Var.d() != null && !jl4Var.l()) {
            pizzaCartProductViewHolder.setDiscountTitle(jl4Var.d().f());
            pizzaCartProductViewHolder.setOnDiscountClickListener(new f(jl4Var));
            if (jl4Var.b()) {
                k(pizzaCartProductViewHolder, jl4Var);
                pizzaCartProductViewHolder.hidePriceSector();
                pizzaCartProductViewHolder.showRemoveButton();
                n(pizzaCartProductViewHolder, jl4Var);
                return;
            }
            pizzaCartProductViewHolder.hideStop();
            m(pizzaCartProductViewHolder, jl4Var);
            pizzaCartProductViewHolder.showCounterButton();
            pizzaCartProductViewHolder.setOnMinusCounterClickListener(new g(jl4Var));
            pizzaCartProductViewHolder.setCounter(String.valueOf(jl4Var.a()));
            pizzaCartProductViewHolder.setOnPlusCounterClickListener(new h(jl4Var));
            l(pizzaCartProductViewHolder, jl4Var);
        } else {
            pizzaCartProductViewHolder.hideGift();
            if (jl4Var.b()) {
                k(pizzaCartProductViewHolder, jl4Var);
                pizzaCartProductViewHolder.hidePriceSector();
                pizzaCartProductViewHolder.showRemoveButton();
                pizzaCartProductViewHolder.setOnRemoveClickListener(new i(jl4Var));
                return;
            }
            pizzaCartProductViewHolder.hideStop();
            pizzaCartProductViewHolder.showPriceSector();
            pizzaCartProductViewHolder.setFinalPrice(un6.b(jl4Var.j()));
            pizzaCartProductViewHolder.hideRawPrice();
            pizzaCartProductViewHolder.showCounterButton();
            pizzaCartProductViewHolder.setOnMinusCounterClickListener(new j(jl4Var));
            pizzaCartProductViewHolder.setCounter(String.valueOf(jl4Var.a()));
            pizzaCartProductViewHolder.setOnPlusCounterClickListener(new a(jl4Var));
            l(pizzaCartProductViewHolder, jl4Var);
        }
    }
}
