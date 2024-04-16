package defpackage;

import com.dodopizza.order.feature.menu.adapters.promotion.FoodMenuPromotingProductViewHolder;
import defpackage.lq8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PopularProductBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lof8;", "Loyb;", "Lcom/dodopizza/order/feature/menu/adapters/promotion/FoodMenuPromotingProductViewHolder;", "Lrf8;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "popularItemClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: of8  reason: default package */
/* loaded from: classes2.dex */
public final class of8 extends oyb<FoodMenuPromotingProductViewHolder, rf8> {
    private final Function1<rf8, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PopularProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: of8$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ rf8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rf8 rf8Var) {
            super(0);
            this.b = rf8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            of8.this.a.invoke(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PopularProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: of8$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ rf8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rf8 rf8Var) {
            super(0);
            this.b = rf8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            of8.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public of8(Function1<? super rf8, Unit> function1) {
        z65.h(function1, "popularItemClickListener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(FoodMenuPromotingProductViewHolder foodMenuPromotingProductViewHolder, rf8 rf8Var, int i) {
        z65.h(foodMenuPromotingProductViewHolder, "view");
        z65.h(rf8Var, "data");
        foodMenuPromotingProductViewHolder.showImage(rf8Var.b());
        foodMenuPromotingProductViewHolder.setTitle(rf8Var.a());
        foodMenuPromotingProductViewHolder.setOnItemClickListener(new a(rf8Var));
        foodMenuPromotingProductViewHolder.setOnButtonClickListener(new b(rf8Var));
        lq8 f = rf8Var.f();
        if (f instanceof lq8.d) {
            foodMenuPromotingProductViewHolder.setRangePriceViewTitle(rf8Var.e(), rf8Var.g());
        } else if (f instanceof lq8.b) {
            foodMenuPromotingProductViewHolder.setBuildPizzaText(rf8Var.g());
        } else if (f instanceof lq8.a) {
            foodMenuPromotingProductViewHolder.setupAssistantStartButton(rf8Var.g());
        } else if (f instanceof lq8.c) {
            foodMenuPromotingProductViewHolder.setPriceViewTitle(rf8Var.e(), rf8Var.g());
            if (rf8Var.g()) {
                foodMenuPromotingProductViewHolder.showProductSize(((lq8.c) rf8Var.f()).a());
            }
        }
    }
}
