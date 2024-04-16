package defpackage;

import com.dodopizza.order.feature.menu.adapters.promotion.FoodMenuPromotingProductViewHolder;
import defpackage.lq8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PersonalPriceProductBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lr18;", "Loyb;", "Lcom/dodopizza/order/feature/menu/adapters/promotion/FoodMenuPromotingProductViewHolder;", "Ls18;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "popularItemClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: r18  reason: default package */
/* loaded from: classes2.dex */
public final class r18 extends oyb<FoodMenuPromotingProductViewHolder, s18> {
    private final Function1<s18, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalPriceProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r18$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ s18 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s18 s18Var) {
            super(0);
            this.b = s18Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            r18.this.a.invoke(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalPriceProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r18$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ s18 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s18 s18Var) {
            super(0);
            this.b = s18Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            r18.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r18(Function1<? super s18, Unit> function1) {
        z65.h(function1, "popularItemClickListener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(FoodMenuPromotingProductViewHolder foodMenuPromotingProductViewHolder, s18 s18Var, int i) {
        z65.h(foodMenuPromotingProductViewHolder, "view");
        z65.h(s18Var, "data");
        foodMenuPromotingProductViewHolder.showImage(s18Var.b());
        foodMenuPromotingProductViewHolder.setTitle(s18Var.a());
        foodMenuPromotingProductViewHolder.setOnItemClickListener(new a(s18Var));
        foodMenuPromotingProductViewHolder.setOnButtonClickListener(new b(s18Var));
        lq8 g = s18Var.g();
        if (g instanceof lq8.d) {
            foodMenuPromotingProductViewHolder.setRangePriceViewTitle(s18Var.e(), s18Var.h());
        } else if (g instanceof lq8.b) {
            foodMenuPromotingProductViewHolder.setBuildPizzaText(s18Var.h());
        } else if (g instanceof lq8.a) {
            foodMenuPromotingProductViewHolder.setupAssistantStartButton(s18Var.h());
        } else if (g instanceof lq8.c) {
            foodMenuPromotingProductViewHolder.setPriceViewTitle(s18Var.e(), s18Var.h());
            if (s18Var.h()) {
                foodMenuPromotingProductViewHolder.showProductSize(((lq8.c) s18Var.g()).a());
            }
        }
    }
}
