package defpackage;

import com.dodopizza.order.feature.menu.adapters.promotion.VerticalPromotionProductViewHolder;
import com.huawei.hms.opendevice.c;
import defpackage.atb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: VerticalCardUpsellProductBinder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ldyb;", "Loyb;", "Lcom/dodopizza/order/feature/menu/adapters/promotion/VerticalPromotionProductViewHolder;", "Latb$a;", "view", "data", "", "position", "", "g", "Ljn6;", "a", "Ljn6;", "moneyFactory", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "upsellItemClickListener", "Lkotlin/Function2;", c.a, "Lkotlin/jvm/functions/Function2;", "upsellScrollListener", "<init>", "(Ljn6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dyb  reason: default package */
/* loaded from: classes2.dex */
public final class dyb extends oyb<VerticalPromotionProductViewHolder, atb.a> {
    private final jn6 a;
    private final Function1<String, Unit> b;
    private final Function2<atb.a, Integer, Unit> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalCardUpsellProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dyb$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ atb.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(atb.a aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            dyb.this.b.invoke(this.b.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalCardUpsellProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dyb$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ atb.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(atb.a aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            dyb.this.b.invoke(this.b.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dyb(jn6 jn6Var, Function1<? super String, Unit> function1, Function2<? super atb.a, ? super Integer, Unit> function2) {
        z65.h(jn6Var, "moneyFactory");
        z65.h(function1, "upsellItemClickListener");
        z65.h(function2, "upsellScrollListener");
        this.a = jn6Var;
        this.b = function1;
        this.c = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(VerticalPromotionProductViewHolder verticalPromotionProductViewHolder, atb.a aVar, int i) {
        z65.h(verticalPromotionProductViewHolder, "view");
        z65.h(aVar, "data");
        verticalPromotionProductViewHolder.setPriceViewTitle(this.a.b(aVar.f()), false);
        verticalPromotionProductViewHolder.showImage(aVar.c().b());
        verticalPromotionProductViewHolder.setTitleWithPortionDescription(aVar.d(), aVar.g().c(), aVar.g().b());
        verticalPromotionProductViewHolder.setOnItemClickListener(new a(aVar));
        verticalPromotionProductViewHolder.setOnButtonClickListener(new b(aVar));
        this.c.invoke(aVar, Integer.valueOf(i));
    }
}
