package com.dodopizza.order.feature.menu.adapters.menuitem;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuCategoryItemVH.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J.\u0010\b\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0004R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuCategoryItemVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lkotlin/Function3;", "Ldh6;", "", "", "listener", "menuCategoryPosition", "initialize", "", "title", "setTitle", "", "subcategories", "showSubcategoryTabs", "hideSubcategoryTabs", "position", "scrollToSelectedElement", "Landroid/widget/TextView;", "titleView$delegate", "Lk79;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "Landroidx/recyclerview/widget/RecyclerView;", "menuSubcategoryList$delegate", "getMenuSubcategoryList", "()Landroidx/recyclerview/widget/RecyclerView;", "menuSubcategoryList", "Ll6;", "subcategoryAdapter", "Ll6;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MenuCategoryItemVH extends SelfInflatingViewHolder {
    private static final int SUBCATEGORY_HORIZONTAL_MARGIN = 8;
    private final k79 menuSubcategoryList$delegate;
    private final l6<dh6> subcategoryAdapter;
    private final k79 titleView$delegate;
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(MenuCategoryItemVH.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(MenuCategoryItemVH.class, "menuSubcategoryList", "getMenuSubcategoryList()Landroidx/recyclerview/widget/RecyclerView;", 0))};
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* compiled from: MenuCategoryItemVH.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuCategoryItemVH$a;", "", "", "SUBCATEGORY_HORIZONTAL_MARGIN", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<Object, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof dh6);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = MenuSubcategoryItemVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuCategoryItemVH(kzb kzbVar) {
        super(kzbVar, gz8.menu_item_category_title);
        List l;
        z65.h(kzbVar, "viewInflater");
        this.titleView$delegate = kb0.g(this, gy8.category_title);
        this.menuSubcategoryList$delegate = kb0.g(this, gy8.menu_subcategory_list);
        l = kc1.l();
        this.subcategoryAdapter = new l6<>(l);
        getMenuSubcategoryList().addItemDecoration(new zo4(8, 0, 0));
    }

    private final RecyclerView getMenuSubcategoryList() {
        return (RecyclerView) this.menuSubcategoryList$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void hideSubcategoryTabs() {
        getMenuSubcategoryList().setVisibility(8);
    }

    public final void initialize(y84<? super dh6, ? super Integer, ? super Integer, Unit> y84Var, int i) {
        z65.h(y84Var, "listener");
        RecyclerView menuSubcategoryList = getMenuSubcategoryList();
        k6 k6Var = new k6(this.subcategoryAdapter);
        new k6.a(k6Var, b.a, new ch6(y84Var, i), c.a).b();
        menuSubcategoryList.setAdapter(k6Var.d());
    }

    public final void scrollToSelectedElement(int i) {
        getMenuSubcategoryList().scrollToPosition(i);
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitleView().setText(str);
    }

    public final void showSubcategoryTabs(List<dh6> list) {
        z65.h(list, "subcategories");
        getMenuSubcategoryList().setVisibility(0);
        this.subcategoryAdapter.clear();
        this.subcategoryAdapter.addAll(list);
    }
}
