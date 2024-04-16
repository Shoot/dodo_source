package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.shoppingcart.adapter.good.pizza.PizzaCartProductViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PizzaCartProductBinder.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0089\u0001\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u0015\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b/\u00100J\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0002J\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0014\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0014\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0014\u0010\u000f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0014\u0010\u0010\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018¨\u00061"}, d2 = {"Lz68;", "Loyb;", "Lcom/dodopizza/order/feature/shoppingcart/adapter/good/pizza/PizzaCartProductViewHolder;", "Lo4c;", "", "timeRemain", "", "p", "data", "t", "Lhn6;", Image.TYPE_MEDIUM, "r", "q", Image.TYPE_SMALL, "n", "o", "view", "", "position", "l", "Lkotlin/Function1;", "Lnq0;", "a", "Lkotlin/jvm/functions/Function1;", "minusCountListener", "b", "plusCountListener", com.huawei.hms.opendevice.c.a, "removeListener", "Lv23;", DateTokenConverter.CONVERTER_KEY, "discountListener", "Lkotlin/Function0;", com.huawei.hms.push.e.a, "Lkotlin/jvm/functions/Function0;", "personalPriceTimerListener", "Lu18;", "f", "Lu18;", "timerFormatter", "Lf5b;", "g", "Lf5b;", "timeProvider", Image.TYPE_HIGH, "editButtonClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lu18;Lf5b;Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z68  reason: default package */
/* loaded from: classes2.dex */
public final class z68 extends oyb<PizzaCartProductViewHolder, o4c> {
    private final Function1<nq0, Unit> a;
    private final Function1<nq0, Unit> b;
    private final Function1<nq0, Unit> c;
    private final Function1<v23, Unit> d;
    private final Function0<Unit> e;
    private final u18 f;
    private final f5b g;
    private final Function1<nq0, Unit> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.h.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$i */
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$j */
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        public static final j a = new j();

        j() {
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
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$k */
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.d.invoke(this.b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$l */
    /* loaded from: classes2.dex */
    public static final class l extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.d.invoke(this.b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$m */
    /* loaded from: classes2.dex */
    public static final class m extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxq0;", "productIngredient", "", "a", "(Lxq0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z68$n */
    /* loaded from: classes2.dex */
    public static final class n extends ej5 implements Function1<xq0, CharSequence> {
        public static final n a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(xq0 xq0Var) {
            z65.h(xq0Var, "productIngredient");
            return qhb.a(xq0Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxq0;", "productIngredient", "", "a", "(Lxq0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z68$o */
    /* loaded from: classes2.dex */
    public static final class o extends ej5 implements Function1<xq0, CharSequence> {
        public static final o a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(xq0 xq0Var) {
            z65.h(xq0Var, "productIngredient");
            return qhb.a(xq0Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxq0;", "topping", "", "a", "(Lxq0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z68$p */
    /* loaded from: classes2.dex */
    public static final class p extends ej5 implements Function1<xq0, CharSequence> {
        public static final p a = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(xq0 xq0Var) {
            z65.h(xq0Var, "topping");
            return qhb.a(xq0Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$q */
    /* loaded from: classes2.dex */
    public static final class q extends ej5 implements Function0<Unit> {
        final /* synthetic */ PizzaCartProductViewHolder a;
        final /* synthetic */ z68 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(PizzaCartProductViewHolder pizzaCartProductViewHolder, z68 z68Var) {
            super(0);
            this.a = pizzaCartProductViewHolder;
            this.b = z68Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.enablePersonalPriceBadge(false);
            PizzaCartProductViewHolder pizzaCartProductViewHolder = this.a;
            pizzaCartProductViewHolder.setTextInPersonalPriceBadge(jzb.a(pizzaCartProductViewHolder, r09.personal_price_badge_discount_expired));
            this.b.e.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$r */
    /* loaded from: classes2.dex */
    public static final class r extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z68$s */
    /* loaded from: classes2.dex */
    public static final class s extends ej5 implements Function0<Unit> {
        final /* synthetic */ o4c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(o4c o4cVar) {
            super(0);
            this.b = o4cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z68.this.b.invoke(this.b.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z68(Function1<? super nq0, Unit> function1, Function1<? super nq0, Unit> function12, Function1<? super nq0, Unit> function13, Function1<? super v23, Unit> function14, Function0<Unit> function0, u18 u18Var, f5b f5bVar, Function1<? super nq0, Unit> function15) {
        z65.h(function1, "minusCountListener");
        z65.h(function12, "plusCountListener");
        z65.h(function13, "removeListener");
        z65.h(function14, "discountListener");
        z65.h(function0, "personalPriceTimerListener");
        z65.h(u18Var, "timerFormatter");
        z65.h(f5bVar, "timeProvider");
        z65.h(function15, "editButtonClickListener");
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
        this.e = function0;
        this.f = u18Var;
        this.g = f5bVar;
        this.h = function15;
    }

    private final hn6 m(o4c o4cVar) {
        hn6 i2 = o4cVar.i();
        v23 d2 = o4cVar.d();
        z65.e(d2);
        return rn6.f(i2, rn6.g(d2.a(), Math.max(o4cVar.a(), 1)));
    }

    private final void n(PizzaCartProductViewHolder pizzaCartProductViewHolder, o4c o4cVar) {
        String i0;
        String i02;
        if (!o4cVar.k().isEmpty()) {
            i02 = sc1.i0(o4cVar.k(), null, null, null, 0, null, o.a, 31, null);
            pizzaCartProductViewHolder.showAddedToppings(i02);
        } else {
            pizzaCartProductViewHolder.hideToppings();
        }
        if (!o4cVar.j().isEmpty()) {
            i0 = sc1.i0(o4cVar.j(), null, null, null, 0, null, n.a, 31, null);
            pizzaCartProductViewHolder.showRemovedIngredients(i0);
            return;
        }
        pizzaCartProductViewHolder.hideRemovedIngredients();
    }

    private final void o(PizzaCartProductViewHolder pizzaCartProductViewHolder, o4c o4cVar) {
        String i0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : o4cVar.k()) {
            if (((xq0) obj).a()) {
                arrayList.add(obj);
            }
        }
        i0 = sc1.i0(arrayList, null, null, null, 0, null, p.a, 31, null);
        if (i0.length() > 0) {
            pizzaCartProductViewHolder.showStopToppings(i0);
        } else {
            pizzaCartProductViewHolder.showStop();
        }
    }

    private final void p(PizzaCartProductViewHolder pizzaCartProductViewHolder, long j2) {
        pizzaCartProductViewHolder.showPersonalPriceBadge();
        if (j2 > 0) {
            pizzaCartProductViewHolder.enablePersonalPriceBadge(true);
            pizzaCartProductViewHolder.setTimerInPersonalPriceBadge(this.f, j2);
            pizzaCartProductViewHolder.launchPersonalPriceTimer(this.f, j2, new q(pizzaCartProductViewHolder, this));
            return;
        }
        pizzaCartProductViewHolder.hidePersonalPriceBadge();
    }

    private final void q(PizzaCartProductViewHolder pizzaCartProductViewHolder, o4c o4cVar) {
        if (o4cVar.a() > 0) {
            pizzaCartProductViewHolder.enableMinusCounter();
        } else {
            pizzaCartProductViewHolder.disableMinusCounter();
        }
        if (o4cVar.a() < o4cVar.g()) {
            pizzaCartProductViewHolder.enablePlusCounter();
        } else {
            pizzaCartProductViewHolder.disablePlusCounter();
        }
    }

    private final void r(PizzaCartProductViewHolder pizzaCartProductViewHolder, o4c o4cVar) {
        hn6 m2 = m(o4cVar);
        if (rn6.c(m2, o4cVar.i()) > 0) {
            pizzaCartProductViewHolder.showPriceSector();
            pizzaCartProductViewHolder.setFinalPrice(un6.b(o4cVar.i()));
            pizzaCartProductViewHolder.showRawPrice(un6.b(m2));
        } else if (o4cVar.i().e()) {
            pizzaCartProductViewHolder.showPriceSector();
            pizzaCartProductViewHolder.setFinalPrice(un6.b(o4cVar.i()));
            pizzaCartProductViewHolder.hideRawPrice();
        } else {
            pizzaCartProductViewHolder.hidePriceSector();
        }
    }

    private final void s(PizzaCartProductViewHolder pizzaCartProductViewHolder, o4c o4cVar) {
        if (o4cVar.a() != 0) {
            pizzaCartProductViewHolder.showAddedGift();
            pizzaCartProductViewHolder.setOnRemoveClickListener(new r(o4cVar));
            return;
        }
        pizzaCartProductViewHolder.showRemovedGift();
        pizzaCartProductViewHolder.setOnRemoveClickListener(new s(o4cVar));
    }

    private final void t(PizzaCartProductViewHolder pizzaCartProductViewHolder, o4c o4cVar, long j2) {
        if (j2 <= 0) {
            pizzaCartProductViewHolder.showPriceSector();
            pizzaCartProductViewHolder.setFinalPrice(un6.b(m(o4cVar)));
            pizzaCartProductViewHolder.hideRawPrice();
            return;
        }
        r(pizzaCartProductViewHolder, o4cVar);
    }

    @Override // defpackage.oyb
    /* renamed from: l */
    public void b(PizzaCartProductViewHolder pizzaCartProductViewHolder, o4c o4cVar, int i2) {
        n18 n18Var;
        z65.h(pizzaCartProductViewHolder, "view");
        z65.h(o4cVar, "data");
        pizzaCartProductViewHolder.setTitle(o4cVar.h());
        pizzaCartProductViewHolder.setDoughDescription(o4cVar.e());
        pizzaCartProductViewHolder.showImage(o4cVar.f());
        n(pizzaCartProductViewHolder, o4cVar);
        pizzaCartProductViewHolder.setEditButtonVisibility(o4cVar.l());
        pizzaCartProductViewHolder.setOnEditButtonClickListener(new e(o4cVar));
        v23 d2 = o4cVar.d();
        if (d2 != null) {
            n18Var = d2.e();
        } else {
            n18Var = null;
        }
        if (n18Var != null) {
            long a2 = n18Var.a() - this.g.b();
            p(pizzaCartProductViewHolder, a2);
            if (o4cVar.b()) {
                o(pizzaCartProductViewHolder, o4cVar);
                pizzaCartProductViewHolder.hidePriceSector();
                pizzaCartProductViewHolder.showRemoveButton();
                s(pizzaCartProductViewHolder, o4cVar);
                return;
            }
            pizzaCartProductViewHolder.hideStop();
            t(pizzaCartProductViewHolder, o4cVar, a2);
            pizzaCartProductViewHolder.showCounterButton();
            pizzaCartProductViewHolder.setOnMinusCounterClickListener(new f(o4cVar));
            pizzaCartProductViewHolder.setCounter(String.valueOf(o4cVar.a()));
            pizzaCartProductViewHolder.setOnPlusCounterClickListener(new g(o4cVar));
            q(pizzaCartProductViewHolder, o4cVar);
        } else if (o4cVar.d() != null && o4cVar.m()) {
            pizzaCartProductViewHolder.hidePersonalPriceBadge();
            if (o4cVar.b()) {
                o(pizzaCartProductViewHolder, o4cVar);
                pizzaCartProductViewHolder.hidePriceSector();
                pizzaCartProductViewHolder.showRemoveButton();
                s(pizzaCartProductViewHolder, o4cVar);
            } else if (o4cVar.g() > 1 && o4cVar.a() != 0) {
                pizzaCartProductViewHolder.hideStop();
                r(pizzaCartProductViewHolder, o4cVar);
                pizzaCartProductViewHolder.showCounterButton();
                pizzaCartProductViewHolder.setOnMinusCounterClickListener(new h(o4cVar));
                pizzaCartProductViewHolder.setCounter(String.valueOf(o4cVar.a()));
                pizzaCartProductViewHolder.setOnPlusCounterClickListener(new i(o4cVar));
                q(pizzaCartProductViewHolder, o4cVar);
            } else {
                pizzaCartProductViewHolder.hideStop();
                r(pizzaCartProductViewHolder, o4cVar);
                pizzaCartProductViewHolder.showRemoveButton();
                s(pizzaCartProductViewHolder, o4cVar);
            }
            if (o4cVar.d().d() > 0) {
                pizzaCartProductViewHolder.setLoyaltyGiftTitle(o4cVar.d().d());
                pizzaCartProductViewHolder.setOnDiscountClickListener(j.a);
                return;
            }
            pizzaCartProductViewHolder.setGiftTitle(o4cVar.d().f());
            pizzaCartProductViewHolder.setOnDiscountClickListener(new k(o4cVar));
        } else if (o4cVar.d() != null && !o4cVar.m()) {
            pizzaCartProductViewHolder.hidePersonalPriceBadge();
            pizzaCartProductViewHolder.setDiscountTitle(o4cVar.d().f());
            pizzaCartProductViewHolder.setOnDiscountClickListener(new l(o4cVar));
            if (o4cVar.b()) {
                o(pizzaCartProductViewHolder, o4cVar);
                pizzaCartProductViewHolder.hidePriceSector();
                pizzaCartProductViewHolder.showRemoveButton();
                s(pizzaCartProductViewHolder, o4cVar);
                return;
            }
            pizzaCartProductViewHolder.hideStop();
            r(pizzaCartProductViewHolder, o4cVar);
            pizzaCartProductViewHolder.showCounterButton();
            pizzaCartProductViewHolder.setOnMinusCounterClickListener(new m(o4cVar));
            pizzaCartProductViewHolder.setCounter(String.valueOf(o4cVar.a()));
            pizzaCartProductViewHolder.setOnPlusCounterClickListener(new a(o4cVar));
            q(pizzaCartProductViewHolder, o4cVar);
        } else {
            pizzaCartProductViewHolder.hidePersonalPriceBadge();
            pizzaCartProductViewHolder.hideGift();
            if (o4cVar.b()) {
                o(pizzaCartProductViewHolder, o4cVar);
                pizzaCartProductViewHolder.hidePriceSector();
                pizzaCartProductViewHolder.showRemoveButton();
                pizzaCartProductViewHolder.setOnRemoveClickListener(new b(o4cVar));
                return;
            }
            pizzaCartProductViewHolder.hideStop();
            pizzaCartProductViewHolder.showPriceSector();
            pizzaCartProductViewHolder.setFinalPrice(un6.b(o4cVar.i()));
            pizzaCartProductViewHolder.hideRawPrice();
            pizzaCartProductViewHolder.showCounterButton();
            pizzaCartProductViewHolder.setOnMinusCounterClickListener(new c(o4cVar));
            pizzaCartProductViewHolder.setCounter(String.valueOf(o4cVar.a()));
            pizzaCartProductViewHolder.setOnPlusCounterClickListener(new d(o4cVar));
            q(pizzaCartProductViewHolder, o4cVar);
        }
    }
}
