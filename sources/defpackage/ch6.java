package defpackage;

import com.dodopizza.order.feature.menu.adapters.menuitem.MenuSubcategoryItemVH;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: MenuSubcategoryItemBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R.\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lch6;", "Loyb;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuSubcategoryItemVH;", "Ldh6;", "view", "data", "", "position", "", Image.TYPE_HIGH, "Lkotlin/Function3;", "a", "Ly84;", "onClick", "b", "I", "itemPosition", "<init>", "(Ly84;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ch6  reason: default package */
/* loaded from: classes2.dex */
public final class ch6 extends oyb<MenuSubcategoryItemVH, dh6> {
    private final y84<dh6, Integer, Integer, Unit> a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuSubcategoryItemBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ch6$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ dh6 b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dh6 dh6Var, int i) {
            super(0);
            this.b = dh6Var;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            y84 y84Var = ch6.this.a;
            if (y84Var != null) {
                y84Var.invoke(this.b, Integer.valueOf(ch6.this.b), Integer.valueOf(this.c));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ch6(y84<? super dh6, ? super Integer, ? super Integer, Unit> y84Var, int i) {
        this.a = y84Var;
        this.b = i;
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(MenuSubcategoryItemVH menuSubcategoryItemVH, dh6 dh6Var, int i) {
        z65.h(menuSubcategoryItemVH, "view");
        z65.h(dh6Var, "data");
        if (z65.c(dh6Var.c(), dh6Var.b())) {
            menuSubcategoryItemVH.setAllTitle();
        } else {
            menuSubcategoryItemVH.setTitle(dh6Var.d());
        }
        menuSubcategoryItemVH.setSelected(dh6Var.g());
        menuSubcategoryItemVH.setOnClickListener(new a(dh6Var, i));
    }
}
