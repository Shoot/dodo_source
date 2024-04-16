package com.dodopizza.order.feature.combinedmap.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.order.feature.combinedmap.presentation.PizzeriaCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriaCard.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010?\u001a\u00020>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\b\b\u0002\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001b\u0010\u001e\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014R\u001b\u0010)\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014R\u001b\u0010,\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0014R\u001b\u0010/\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014R\u001b\u00102\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0012\u001a\u0004\b9\u00106R\u001b\u0010=\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0012\u001a\u0004\b<\u00106¨\u0006F"}, d2 = {"Lcom/dodopizza/order/feature/combinedmap/presentation/PizzeriaCard;", "Landroidx/core/widget/NestedScrollView;", "Lkotlin/Function1;", "", "", "listener", "setPhoneTextListener", "Ld88;", "pizzeria", "Ljb7;", "operationalTypeVo", "Lhn3;", "pizzeriaType", "", "isShortStreetNameEnabled", "Q", "Landroid/widget/TextView;", "I", "Lk79;", "getNamePizzeriaText", "()Landroid/widget/TextView;", "namePizzeriaText", "S4", "getStreetPizzeriaText", "streetPizzeriaText", "T4", "getStatusPizzeriaText", "statusPizzeriaText", "U4", "getOperationalTypeText", "operationalTypeText", "Landroid/widget/LinearLayout;", "V4", "getOperationalTypeContainer", "()Landroid/widget/LinearLayout;", "operationalTypeContainer", "W4", "getDeliveryWorkTimeTitle", "deliveryWorkTimeTitle", "X4", "getDeliveryAndPickupTimeText", "deliveryAndPickupTimeText", "Y4", "getRestaurantTimeText", "restaurantTimeText", "Z4", "getEqualWorkTimeText", "equalWorkTimeText", "a5", "getPhoneText", "phoneText", "Landroid/widget/RelativeLayout;", "b5", "getRestaurantWorkTime", "()Landroid/widget/RelativeLayout;", "restaurantWorkTime", "c5", "getEqualWorkTime", "equalWorkTime", "d5", "getDeliveryWorkTime", "deliveryWorkTime", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PizzeriaCard extends NestedScrollView {
    static final /* synthetic */ je5<Object>[] e5 = {bc9.f(new ar8(PizzeriaCard.class, "namePizzeriaText", "getNamePizzeriaText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "streetPizzeriaText", "getStreetPizzeriaText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "statusPizzeriaText", "getStatusPizzeriaText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "operationalTypeText", "getOperationalTypeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "operationalTypeContainer", "getOperationalTypeContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(PizzeriaCard.class, "deliveryWorkTimeTitle", "getDeliveryWorkTimeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "deliveryAndPickupTimeText", "getDeliveryAndPickupTimeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "restaurantTimeText", "getRestaurantTimeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "equalWorkTimeText", "getEqualWorkTimeText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "phoneText", "getPhoneText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaCard.class, "restaurantWorkTime", "getRestaurantWorkTime()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(PizzeriaCard.class, "equalWorkTime", "getEqualWorkTime()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(PizzeriaCard.class, "deliveryWorkTime", "getDeliveryWorkTime()Landroid/widget/RelativeLayout;", 0))};
    public static final int f5 = 8;
    private final k79 I;
    private final k79 S4;
    private final k79 T4;
    private final k79 U4;
    private final k79 V4;
    private final k79 W4;
    private final k79 X4;
    private final k79 Y4;
    private final k79 Z4;
    private final k79 a5;
    private final k79 b5;
    private final k79 c5;
    private final k79 d5;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PizzeriaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Function1 function1, PizzeriaCard pizzeriaCard, View view) {
        z65.h(function1, "$listener");
        z65.h(pizzeriaCard, "this$0");
        function1.invoke(pizzeriaCard.getPhoneText().getText().toString());
    }

    private final TextView getDeliveryAndPickupTimeText() {
        return (TextView) this.X4.a(this, e5[6]);
    }

    private final RelativeLayout getDeliveryWorkTime() {
        return (RelativeLayout) this.d5.a(this, e5[12]);
    }

    private final TextView getDeliveryWorkTimeTitle() {
        return (TextView) this.W4.a(this, e5[5]);
    }

    private final RelativeLayout getEqualWorkTime() {
        return (RelativeLayout) this.c5.a(this, e5[11]);
    }

    private final TextView getEqualWorkTimeText() {
        return (TextView) this.Z4.a(this, e5[8]);
    }

    private final TextView getNamePizzeriaText() {
        return (TextView) this.I.a(this, e5[0]);
    }

    private final LinearLayout getOperationalTypeContainer() {
        return (LinearLayout) this.V4.a(this, e5[4]);
    }

    private final TextView getOperationalTypeText() {
        return (TextView) this.U4.a(this, e5[3]);
    }

    private final TextView getPhoneText() {
        return (TextView) this.a5.a(this, e5[9]);
    }

    private final TextView getRestaurantTimeText() {
        return (TextView) this.Y4.a(this, e5[7]);
    }

    private final RelativeLayout getRestaurantWorkTime() {
        return (RelativeLayout) this.b5.a(this, e5[10]);
    }

    private final TextView getStatusPizzeriaText() {
        return (TextView) this.T4.a(this, e5[2]);
    }

    private final TextView getStreetPizzeriaText() {
        return (TextView) this.S4.a(this, e5[1]);
    }

    public final void Q(d88 d88Var, jb7 jb7Var, hn3 hn3Var, boolean z) {
        z65.h(d88Var, "pizzeria");
        z65.h(jb7Var, "operationalTypeVo");
        z65.h(hn3Var, "pizzeriaType");
        if (hn3Var == hn3.b && d88Var.G().contains(ib7.e)) {
            getDeliveryWorkTimeTitle().setText(getResources().getString(r09.q0));
        } else {
            getDeliveryWorkTimeTitle().setText(getResources().getString(r09.delivery_and_pickup_time));
        }
        getNamePizzeriaText().setText(d88Var.getName());
        if (z) {
            getStreetPizzeriaText().setText(d88Var.u());
        } else {
            getStreetPizzeriaText().setText(d88Var.q());
        }
        getPhoneText().setText(d88Var.E());
        getStatusPizzeriaText().setText(ov9.e(d88Var.H(), d88Var.L(), getContext()));
        if (jb7Var == jb7.e) {
            getOperationalTypeContainer().setVisibility(0);
            getOperationalTypeText().setText(getResources().getString(r09.u0));
        } else if (jb7Var == jb7.d) {
            getOperationalTypeContainer().setVisibility(0);
            getOperationalTypeText().setText(getResources().getString(r09.L));
        } else {
            getOperationalTypeContainer().setVisibility(8);
        }
        if (z65.c(d88Var.H(), d88Var.o())) {
            getEqualWorkTime().setVisibility(0);
            getRestaurantWorkTime().setVisibility(8);
            getDeliveryWorkTime().setVisibility(8);
            getEqualWorkTimeText().setText(ov9.a(d88Var.o(), getContext()));
            return;
        }
        getEqualWorkTime().setVisibility(8);
        getRestaurantWorkTime().setVisibility(0);
        getDeliveryWorkTime().setVisibility(0);
        getDeliveryAndPickupTimeText().setText(ov9.a(d88Var.o(), getContext()));
        getRestaurantTimeText().setText(ov9.a(d88Var.H(), getContext()));
    }

    public final void setPhoneTextListener(final Function1<? super String, Unit> function1) {
        z65.h(function1, "listener");
        getPhoneText().setOnClickListener(new View.OnClickListener() { // from class: f88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PizzeriaCard.R(Function1.this, this, view);
            }
        });
    }

    public /* synthetic */ PizzeriaCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PizzeriaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.I = kb0.d(this, gy8.name_pizzeria_text);
        this.S4 = kb0.d(this, gy8.street_pizzeria_text);
        this.T4 = kb0.d(this, gy8.status_pizzeria_text);
        this.U4 = kb0.d(this, gy8.operational_type_text);
        this.V4 = kb0.d(this, gy8.operational_type_container);
        this.W4 = kb0.d(this, gy8.title_delivery_work_time);
        this.X4 = kb0.d(this, gy8.delivery_and_pickup_time_text);
        this.Y4 = kb0.d(this, gy8.restaurant_time_text);
        this.Z4 = kb0.d(this, gy8.work_time);
        this.a5 = kb0.d(this, gy8.phone_text);
        this.b5 = kb0.d(this, gy8.restaurant_work_time);
        this.c5 = kb0.d(this, gy8.equal_work_time);
        this.d5 = kb0.d(this, gy8.delivery_work_time);
        View.inflate(context, gz8.pizzeria_card, this);
    }
}
