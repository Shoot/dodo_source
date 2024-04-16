package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.selectcheck.adapter;

import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SelectCheckVH.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/selectcheck/adapter/SelectCheckVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "showSellCheckName", "showRefundCheckName", "showCheckName", "Lkotlin/Function0;", "callback", "setOnCheckSelectedListener", "Landroid/widget/TextView;", "name$delegate", "Lk79;", "getName", "()Landroid/widget/TextView;", Action.NAME_ATTRIBUTE, "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SelectCheckVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(SelectCheckVH.class, Action.NAME_ATTRIBUTE, "getName()Landroid/widget/TextView;", 0))};
    private final k79 name$delegate;

    /* compiled from: SelectCheckVH.kt */
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
    public SelectCheckVH(kzb kzbVar) {
        super(kzbVar, hz8.item_check);
        z65.h(kzbVar, "viewInflater");
        this.name$delegate = kb0.g(this, hy8.name_text);
    }

    private final TextView getName() {
        return (TextView) this.name$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setOnCheckSelectedListener(Function0<Unit> function0) {
        z65.h(function0, "callback");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void showCheckName() {
        getName().setText(jzb.a(this, s09.order_history_details_receipt));
    }

    public final void showRefundCheckName() {
        getName().setText(jzb.a(this, s09.refund_check_title));
    }

    public final void showSellCheckName() {
        getName().setText(jzb.a(this, s09.sell_check_title));
    }
}
