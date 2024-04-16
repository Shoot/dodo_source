package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: OrderHistoryVH.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0014\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010J\u0014\u0010\u0013\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010J\u0014\u0010\u0017\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0003\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010\u0006\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010!R\u001b\u0010&\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010!R\u001b\u0010\u000b\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010!R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,R\u001b\u0010\u000e\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010!R\u001b\u00102\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010!¨\u00067"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/OrderHistoryVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "number", "", "setNumber", "title", "setTitle", "", "typeTextStringResId", "setOrderTypeLabel", "address", "setAddress", "Lhn6;", "price", "setPrice", "Lkotlin/Function0;", "listener", "setRepeatButtonListener", "setCardClickListener", "", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b;", "imageUrls", "setImageUrls", "Landroidx/cardview/widget/CardView;", "cardView$delegate", "Lk79;", "getCardView", "()Landroidx/cardview/widget/CardView;", "cardView", "Landroid/widget/TextView;", "number$delegate", "getNumber", "()Landroid/widget/TextView;", "title$delegate", "getTitle", "type$delegate", "getType", MessageAttributes.TYPE, "address$delegate", "getAddress", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "price$delegate", "getPrice", "repeatOrderButton$delegate", "getRepeatOrderButton", "repeatOrderButton", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OrderHistoryVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(OrderHistoryVH.class, "cardView", "getCardView()Landroidx/cardview/widget/CardView;", 0)), bc9.f(new ar8(OrderHistoryVH.class, "number", "getNumber()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderHistoryVH.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderHistoryVH.class, MessageAttributes.TYPE, "getType()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderHistoryVH.class, "address", "getAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderHistoryVH.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(OrderHistoryVH.class, "price", "getPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderHistoryVH.class, "repeatOrderButton", "getRepeatOrderButton()Landroid/widget/TextView;", 0))};
    private final k79 address$delegate;
    private final k79 cardView$delegate;
    private final k79 number$delegate;
    private final k79 price$delegate;
    private final k79 recyclerView$delegate;
    private final k79 repeatOrderButton$delegate;
    private final k79 title$delegate;
    private final k79 type$delegate;

    /* compiled from: OrderHistoryVH.kt */
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

    /* compiled from: OrderHistoryVH.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke();
        }
    }

    /* compiled from: OrderHistoryVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
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
    public OrderHistoryVH(kzb kzbVar) {
        super(kzbVar, hz8.item_row_order_history);
        z65.h(kzbVar, "viewInflater");
        this.cardView$delegate = kb0.g(this, hy8.order_history_item_card);
        this.number$delegate = kb0.g(this, hy8.number);
        this.title$delegate = kb0.g(this, hy8.G);
        this.type$delegate = kb0.g(this, hy8.type);
        this.address$delegate = kb0.g(this, hy8.a);
        this.recyclerView$delegate = kb0.g(this, hy8.D);
        this.price$delegate = kb0.g(this, hy8.B);
        this.repeatOrderButton$delegate = kb0.g(this, hy8.repeat_order_button);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
    }

    private final TextView getAddress() {
        return (TextView) this.address$delegate.a(this, $$delegatedProperties[4]);
    }

    private final CardView getCardView() {
        return (CardView) this.cardView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getNumber() {
        return (TextView) this.number$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getPrice() {
        return (TextView) this.price$delegate.a(this, $$delegatedProperties[6]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView$delegate.a(this, $$delegatedProperties[5]);
    }

    private final TextView getRepeatOrderButton() {
        return (TextView) this.repeatOrderButton$delegate.a(this, $$delegatedProperties[7]);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getType() {
        return (TextView) this.type$delegate.a(this, $$delegatedProperties[3]);
    }

    public final void setAddress(String str) {
        z65.h(str, "address");
        getAddress().setText(str);
    }

    public final void setCardClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getCardView(), new a(function0));
        wma.b(getRecyclerView(), new b(function0));
    }

    public final void setImageUrls(List<? extends com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.b> list) {
        z65.h(list, "imageUrls");
        getRecyclerView().setAdapter(new ImageAdapter(list));
    }

    public final void setNumber(String str) {
        z65.h(str, "number");
        getNumber().setText(this.itemView.getContext().getString(s09.order_history_number_label, str));
    }

    public final void setOrderTypeLabel(int i) {
        getType().setText(this.itemView.getContext().getString(i));
    }

    public final void setPrice(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        getPrice().setText(un6.b(hn6Var));
    }

    public final void setRepeatButtonListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getRepeatOrderButton(), new c(function0));
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitle().setText(str);
    }
}
