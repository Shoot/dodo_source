package com.dodopizza.order.feature.menu.adapters.menuitem;

import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AssistantMenuItemVH.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/AssistantMenuItemVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "Lcom/google/android/material/card/MaterialCardView;", "cardBackground$delegate", "Lk79;", "getCardBackground", "()Lcom/google/android/material/card/MaterialCardView;", "cardBackground", "Landroidx/appcompat/widget/AppCompatImageView;", "cardTopViewBackground$delegate", "getCardTopViewBackground", "()Landroidx/appcompat/widget/AppCompatImageView;", "cardTopViewBackground", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantMenuItemVH extends MenuItemVH {
    public static final int cornerRadiusDp = 16;
    private final k79 cardBackground$delegate;
    private final k79 cardTopViewBackground$delegate;
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AssistantMenuItemVH.class, "cardBackground", "getCardBackground()Lcom/google/android/material/card/MaterialCardView;", 0)), bc9.f(new ar8(AssistantMenuItemVH.class, "cardTopViewBackground", "getCardTopViewBackground()Landroidx/appcompat/widget/AppCompatImageView;", 0))};
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* compiled from: AssistantMenuItemVH.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/AssistantMenuItemVH$a;", "", "", "cornerRadiusDp", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantMenuItemVH(kzb kzbVar) {
        super(kzbVar, gz8.assistant_promo_menu_item, null);
        z65.h(kzbVar, "viewInflater");
        this.cardBackground$delegate = kb0.g(this, gy8.card_background);
        this.cardTopViewBackground$delegate = kb0.g(this, gy8.card_top_view_background);
        com.bumptech.glide.b.u(this.itemView).s(Integer.valueOf(bx8.assistant_card_top_view)).o0(new mo9(jx9.a.a(16))).G0(getCardTopViewBackground());
        getCardBackground().setCardBackgroundColor(iu1.c(this.itemView.getContext(), ew8.assistant_card_background_color));
    }

    private final MaterialCardView getCardBackground() {
        return (MaterialCardView) this.cardBackground$delegate.a(this, $$delegatedProperties[0]);
    }

    private final AppCompatImageView getCardTopViewBackground() {
        return (AppCompatImageView) this.cardTopViewBackground$delegate.a(this, $$delegatedProperties[1]);
    }
}
