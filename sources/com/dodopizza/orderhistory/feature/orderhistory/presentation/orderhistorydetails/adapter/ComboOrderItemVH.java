package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ComboOrderItemVH.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001c\u0010\u000e\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/adapter/ComboOrderItemVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setName", "Lhn6;", "price", "setPrice", "", "Lxg7;", "products", "Lg78;", "pizzaDoughNameFormatter", "setProducts", "Landroid/widget/TextView;", "comboName$delegate", "Lk79;", "getComboName", "()Landroid/widget/TextView;", "comboName", "price$delegate", "getPrice", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ComboOrderItemVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ComboOrderItemVH.class, "comboName", "getComboName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboOrderItemVH.class, "price", "getPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ComboOrderItemVH.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};
    private final k79 comboName$delegate;
    private final k79 price$delegate;
    private final k79 recyclerView$delegate;

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function1<Object, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof xg7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final b a = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = ComboProductViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboOrderItemVH(kzb kzbVar) {
        super(kzbVar, hz8.history_combo_order_item);
        z65.h(kzbVar, "viewInflater");
        this.comboName$delegate = kb0.g(this, hy8.combo_name);
        this.price$delegate = kb0.g(this, hy8.B);
        this.recyclerView$delegate = kb0.g(this, hy8.D);
    }

    private final TextView getComboName() {
        return (TextView) this.comboName$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getPrice() {
        return (TextView) this.price$delegate.a(this, $$delegatedProperties[1]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getComboName().setText(this.itemView.getContext().getString(s09.combo_label_with_name, str));
    }

    public final void setPrice(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        getPrice().setText(un6.b(hn6Var));
    }

    public final void setProducts(List<xg7> list, g78 g78Var) {
        z65.h(list, "products");
        z65.h(g78Var, "pizzaDoughNameFormatter");
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
        getRecyclerView().setAdapter(new k6.a(new k6(list), a.a, new rh1(g78Var), b.a).b().d());
    }
}
