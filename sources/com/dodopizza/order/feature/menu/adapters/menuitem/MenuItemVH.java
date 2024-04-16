package com.dodopizza.order.feature.menu.adapters.menuitem;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.order.feature.personalprice.PersonalPriceBadgeView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuItemVH.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003456B\u001b\b\u0004\u0012\u0006\u00100\u001a\u00020/\u0012\b\b\u0001\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011R\u001b\u0010\u0019\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001dR\u001b\u0010&\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u001dR\u001b\u0010.\u001a\u00020*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010-\u0082\u0001\u0005789:;¨\u0006<"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/BaseVH;", "", RemoteMessageConst.Notification.URL, "", "placeholderResId", "", "showImage", "showNotAvailable", "price", "showVariable", "showVariableOneVariation", "showBuildHalves", "showAssistantStartButton", "productName", "Lkl8;", "productCategory", "Lkm8;", "productSize", "setTitleWithMeasure", "Landroid/widget/ImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "title", "description$delegate", "getDescription", "description", "Landroid/widget/Button;", "selectButton$delegate", "getSelectButton", "()Landroid/widget/Button;", "selectButton", "rawPrice$delegate", "getRawPrice", "rawPrice", "Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "personalPriceBadge$delegate", "getPersonalPriceBadge", "()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "personalPriceBadge", "Lkzb;", "viewInflater", "viewLayoutId", "<init>", "(Lkzb;I)V", "HeroMenuItemVH", "MenuItemBigImageVH", "MenuItemRegularVH", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/AssistantMenuItemVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$HeroMenuItemVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$MenuItemBigImageVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$MenuItemRegularVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/TwoColumnMenuItemRegularVH;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class MenuItemVH extends BaseVH {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(MenuItemVH.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(MenuItemVH.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(MenuItemVH.class, "description", "getDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(MenuItemVH.class, "selectButton", "getSelectButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(MenuItemVH.class, "rawPrice", "getRawPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(MenuItemVH.class, "personalPriceBadge", "getPersonalPriceBadge()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", 0))};
    public static final int $stable = 8;
    private final k79 description$delegate;
    private final k79 imageView$delegate;
    private final k79 personalPriceBadge$delegate;
    private final k79 rawPrice$delegate;
    private final k79 selectButton$delegate;
    private final k79 title$delegate;

    /* compiled from: MenuItemVH.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$HeroMenuItemVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class HeroMenuItemVH extends MenuItemVH {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeroMenuItemVH(kzb kzbVar) {
            super(kzbVar, gz8.hero_menu_item_product_list, null);
            z65.h(kzbVar, "viewInflater");
        }
    }

    /* compiled from: MenuItemVH.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$MenuItemBigImageVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class MenuItemBigImageVH extends MenuItemVH {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MenuItemBigImageVH(kzb kzbVar) {
            super(kzbVar, gz8.menu_item_big_image_product_list, null);
            z65.h(kzbVar, "viewInflater");
        }
    }

    /* compiled from: MenuItemVH.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$MenuItemRegularVH;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class MenuItemRegularVH extends MenuItemVH {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MenuItemRegularVH(kzb kzbVar) {
            super(kzbVar, gz8.menu_item_product_list, null);
            z65.h(kzbVar, "viewInflater");
        }
    }

    public /* synthetic */ MenuItemVH(kzb kzbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kzbVar, i);
    }

    @Override // com.dodopizza.order.feature.menu.adapters.menuitem.BaseVH
    public TextView getDescription() {
        return (TextView) this.description$delegate.a(this, $$delegatedProperties[2]);
    }

    @Override // com.dodopizza.order.feature.menu.adapters.menuitem.BaseVH
    public ImageView getImageView() {
        return (ImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
    }

    @Override // com.dodopizza.order.feature.menu.adapters.menuitem.BaseVH
    public PersonalPriceBadgeView getPersonalPriceBadge() {
        return (PersonalPriceBadgeView) this.personalPriceBadge$delegate.a(this, $$delegatedProperties[5]);
    }

    @Override // com.dodopizza.order.feature.menu.adapters.menuitem.BaseVH
    public TextView getRawPrice() {
        return (TextView) this.rawPrice$delegate.a(this, $$delegatedProperties[4]);
    }

    @Override // com.dodopizza.order.feature.menu.adapters.menuitem.BaseVH
    public Button getSelectButton() {
        return (Button) this.selectButton$delegate.a(this, $$delegatedProperties[3]);
    }

    @Override // com.dodopizza.order.feature.menu.adapters.menuitem.BaseVH
    public TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setTitleWithMeasure(String str, kl8 kl8Var, km8 km8Var) {
        z65.h(str, "productName");
        z65.h(kl8Var, "productCategory");
        z65.h(km8Var, "productSize");
        TextView title = getTitle();
        Context context = this.itemView.getContext();
        z65.g(context, "getContext(...)");
        title.setText(ql8.c(context, kl8Var, str, km8Var));
    }

    public final void showAssistantStartButton() {
        getSelectButton().setText(this.itemView.getContext().getString(r09.assistant_menu_card_start_button));
    }

    public final void showBuildHalves() {
        getSelectButton().setText(this.itemView.getResources().getString(r09.build_pizza));
    }

    @Override // com.dodopizza.order.feature.menu.adapters.menuitem.BaseVH
    public void showImage(String str, int i) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        com.bumptech.glide.b.u(getImageView()).t(str).a0(i).i(i).b0(yj8.IMMEDIATE).o0(new mo9(mpb.a(8.0f, this.itemView.getContext()))).G0(getImageView());
    }

    public final void showNotAvailable() {
        getSelectButton().setText(this.itemView.getResources().getString(r09.l1));
    }

    public final void showVariable(String str) {
        z65.h(str, "price");
        getSelectButton().setText(this.itemView.getResources().getString(r09.variable_menu_item_price_title, str));
    }

    public final void showVariableOneVariation(String str) {
        z65.h(str, "price");
        getSelectButton().setText(str);
    }

    private MenuItemVH(kzb kzbVar, int i) {
        super(kzbVar, i);
        this.imageView$delegate = kb0.g(this, gy8.menu_item_product_image);
        this.title$delegate = kb0.g(this, gy8.menu_item_product_title);
        this.description$delegate = kb0.g(this, gy8.menu_item_product_description);
        this.selectButton$delegate = kb0.g(this, gy8.menu_item_select_button);
        this.rawPrice$delegate = kb0.g(this, gy8.menu_item_raw_price);
        this.personalPriceBadge$delegate = kb0.g(this, gy8.personal_price_badge);
    }
}
