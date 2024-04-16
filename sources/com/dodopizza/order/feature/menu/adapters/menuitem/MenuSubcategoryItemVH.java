package com.dodopizza.order.feature.menu.adapters.menuitem;

import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: MenuSubcategoryItemVH.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuSubcategoryItemVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setTitle", "setAllTitle", "", "isSelected", "setSelected", "Lkotlin/Function0;", "listener", "setOnClickListener", "Lcom/google/android/material/card/MaterialCardView;", "cardView$delegate", "Lk79;", "getCardView", "()Lcom/google/android/material/card/MaterialCardView;", "cardView", "Landroid/widget/TextView;", "subcategoryName$delegate", "getSubcategoryName", "()Landroid/widget/TextView;", "subcategoryName", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MenuSubcategoryItemVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(MenuSubcategoryItemVH.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(MenuSubcategoryItemVH.class, "subcategoryName", "getSubcategoryName()Landroid/widget/TextView;", 0))};
    public static final int $stable = 8;
    private final k79 cardView$delegate;
    private final k79 subcategoryName$delegate;

    /* compiled from: MenuSubcategoryItemVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuSubcategoryItemVH(kzb kzbVar) {
        super(kzbVar, gz8.menu_subcategory_item);
        z65.h(kzbVar, "viewInflater");
        this.cardView$delegate = kb0.g(this, gy8.card_view);
        this.subcategoryName$delegate = kb0.g(this, gy8.menu_subcategory_item);
    }

    private final MaterialCardView getCardView() {
        return (MaterialCardView) this.cardView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getSubcategoryName() {
        return (TextView) this.subcategoryName$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setAllTitle() {
        getSubcategoryName().setText(getSubcategoryName().getContext().getString(r09.all_category_title));
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setSelected(boolean z) {
        getCardView().setChecked(z);
    }

    public final void setTitle(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getSubcategoryName().setText(str);
    }
}
