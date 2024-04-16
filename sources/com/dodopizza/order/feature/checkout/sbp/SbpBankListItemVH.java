package com.dodopizza.order.feature.checkout.sbp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SbpBankListItemVH.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/SbpBankListItemVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lou9;", "sbpBankListItemVO", "", "setSbpBankInfo", "Lkotlin/Function0;", "onClick", "setOnClickListener", "Landroid/widget/ImageView;", "sbpBankIcon$delegate", "Lk79;", "getSbpBankIcon", "()Landroid/widget/ImageView;", "sbpBankIcon", "Landroid/widget/TextView;", "sbpBankTitle$delegate", "getSbpBankTitle", "()Landroid/widget/TextView;", "sbpBankTitle", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class SbpBankListItemVH extends SelfInflatingViewHolder {
    private static final int ICON_CORNER_RADIUS = 16;
    private final k79 sbpBankIcon$delegate;
    private final k79 sbpBankTitle$delegate;
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(SbpBankListItemVH.class, "sbpBankIcon", "getSbpBankIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(SbpBankListItemVH.class, "sbpBankTitle", "getSbpBankTitle()Landroid/widget/TextView;", 0))};
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* compiled from: SbpBankListItemVH.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/SbpBankListItemVH$a;", "", "", "ICON_CORNER_RADIUS", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SbpBankListItemVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
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
    public SbpBankListItemVH(kzb kzbVar) {
        super(kzbVar, gz8.sbp_bank_item);
        z65.h(kzbVar, "viewInflater");
        this.sbpBankIcon$delegate = kb0.g(this, gy8.sbp_bank_icon);
        this.sbpBankTitle$delegate = kb0.g(this, gy8.sbp_bank_title);
    }

    private final ImageView getSbpBankIcon() {
        return (ImageView) this.sbpBankIcon$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getSbpBankTitle() {
        return (TextView) this.sbpBankTitle$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new b(function0));
    }

    public final void setSbpBankInfo(ou9 ou9Var) {
        boolean y;
        z65.h(ou9Var, "sbpBankListItemVO");
        getSbpBankTitle().setText(ou9Var.a());
        y = l0b.y(ou9Var.b());
        if (!y) {
            com.bumptech.glide.b.u(getSbpBankIcon()).t(ou9Var.b()).a0(bx8.rounded_corners_12dp).b(new xi9().s0(new wt0(), new mo9(16))).G0(getSbpBankIcon());
        }
    }
}
