package defpackage;

import com.dodopizza.order.feature.menu.adapters.promotion.FoodMenuPromotingProductViewHolder;
import defpackage.lq8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: FavoriteProductBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lip3;", "Loyb;", "Lcom/dodopizza/order/feature/menu/adapters/promotion/FoodMenuPromotingProductViewHolder;", "Lnp3;", "view", "data", "", "position", "", "g", "Lkotlin/Function2;", "a", "Lkotlin/jvm/functions/Function2;", "favoriteItemClickListener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ip3  reason: default package */
/* loaded from: classes2.dex */
public final class ip3 extends oyb<FoodMenuPromotingProductViewHolder, np3> {
    private final Function2<np3, Integer, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FavoriteProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ip3$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ np3 b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(np3 np3Var, int i) {
            super(0);
            this.b = np3Var;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ip3.this.a.invoke(this.b, Integer.valueOf(this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FavoriteProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ip3$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ np3 b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(np3 np3Var, int i) {
            super(0);
            this.b = np3Var;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ip3.this.a.invoke(this.b, Integer.valueOf(this.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ip3(Function2<? super np3, ? super Integer, Unit> function2) {
        z65.h(function2, "favoriteItemClickListener");
        this.a = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(FoodMenuPromotingProductViewHolder foodMenuPromotingProductViewHolder, np3 np3Var, int i) {
        z65.h(foodMenuPromotingProductViewHolder, "view");
        z65.h(np3Var, "data");
        foodMenuPromotingProductViewHolder.showImage(np3Var.b());
        foodMenuPromotingProductViewHolder.setTitle(np3Var.a());
        foodMenuPromotingProductViewHolder.setOnItemClickListener(new a(np3Var, i));
        foodMenuPromotingProductViewHolder.setOnButtonClickListener(new b(np3Var, i));
        lq8 g = np3Var.g();
        if (g instanceof lq8.d) {
            foodMenuPromotingProductViewHolder.setRangePriceViewTitle(np3Var.e(), np3Var.h());
        } else if (g instanceof lq8.b) {
            foodMenuPromotingProductViewHolder.setBuildPizzaText(np3Var.h());
        } else if (g instanceof lq8.a) {
            foodMenuPromotingProductViewHolder.setupAssistantStartButton(np3Var.h());
        } else if (g instanceof lq8.c) {
            foodMenuPromotingProductViewHolder.setPriceViewTitle(np3Var.e(), np3Var.h());
            if (np3Var.h()) {
                foodMenuPromotingProductViewHolder.showProductSize(((lq8.c) np3Var.g()).a());
            }
        }
    }
}
