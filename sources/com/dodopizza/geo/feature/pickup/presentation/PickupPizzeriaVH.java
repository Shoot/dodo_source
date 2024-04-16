package com.dodopizza.geo.feature.pickup.presentation;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PickupPizzeriaVH.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\r\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002J\u0014\u0010\u0017\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J\u0016\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 J\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020 J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020 J\u0006\u0010-\u001a\u00020\u0004R\u001b\u00102\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u00109R\u001b\u0010@\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u00101R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bG\u00101R\u001b\u0010K\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101R\u001b\u0010N\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u00101R\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010/\u001a\u0004\bQ\u0010RR\u001b\u0010V\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010/\u001a\u0004\bU\u00101R$\u0010\\\u001a\u00020 2\u0006\u0010W\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010]\"\u0004\b^\u0010_¨\u0006d"}, d2 = {"Lcom/dodopizza/geo/feature/pickup/presentation/PickupPizzeriaVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "isEnabled", "", "setLabelColors", "setLabelsEnabled", "setLabelsDisabled", "", "colorRes", "seErrorIconColor", "Landroid/widget/TextView;", RemoteMessageConst.Notification.COLOR, "setColor", "hideErrorIcon", "showErrorIcon", "Landroid/view/View;", "isShouldBeVisible", "switchInvisibility", "isLoading", "setIsLoading", "Lkotlin/Function0;", "listener", "setOnClickListener", "setAvailableOrderTypesDeliveryAndCarryout", "setAvailableOrderTypesDeliveryAndRestaurant", "setAvailableOrderTypesCarryout", "setAvailableOrderTypesCarryoutOnly", "setAvailableOrderTypesDeliveryOnly", "setDescriptionIsOpenToday", "setDescriptionIsClosedToday", "setDescriptionIsUndefinedToday", "", "startWorkTime", "endWorkTime", "setScheduleTimeOpenToday", "setScheduleOpenAroundTheClock", "setScheduleTimeWillBeOpenToday", "setScheduleTimeWillBeOpenTomorrow", "setScheduleTimeEmpty", "text", "setDistanceToUser", "setDistanceToUserVisibility", "cityTitle", "showCityName", "hideCityName", "addressTextView$delegate", "Lk79;", "getAddressTextView", "()Landroid/widget/TextView;", "addressTextView", "openPizzeriaLabelTextView$delegate", "getOpenPizzeriaLabelTextView", "openPizzeriaLabelTextView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "openPizzeriaDescription$delegate", "getOpenPizzeriaDescription", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "openPizzeriaDescription", "closedPizzeriaDescription$delegate", "getClosedPizzeriaDescription", "closedPizzeriaDescription", "openPizzeriaAvailableOrderTypesTextView$delegate", "getOpenPizzeriaAvailableOrderTypesTextView", "openPizzeriaAvailableOrderTypesTextView", "Landroid/widget/ImageView;", "openPizzeriaAvailableOrderTypesErrorIcon$delegate", "getOpenPizzeriaAvailableOrderTypesErrorIcon", "()Landroid/widget/ImageView;", "openPizzeriaAvailableOrderTypesErrorIcon", "openScheduleTextView$delegate", "getOpenScheduleTextView", "openScheduleTextView", "distanceToUser$delegate", "getDistanceToUser", "distanceToUser", "closedScheduleOpenFromTextView$delegate", "getClosedScheduleOpenFromTextView", "closedScheduleOpenFromTextView", "Landroid/widget/ProgressBar;", "progress$delegate", "getProgress", "()Landroid/widget/ProgressBar;", "progress", "cityName$delegate", "getCityName", "cityName", "value", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "address", "()Z", "setEnabled", "(Z)V", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PickupPizzeriaVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PickupPizzeriaVH.class, "addressTextView", "getAddressTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "openPizzeriaLabelTextView", "getOpenPizzeriaLabelTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "openPizzeriaDescription", "getOpenPizzeriaDescription()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "closedPizzeriaDescription", "getClosedPizzeriaDescription()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "openPizzeriaAvailableOrderTypesTextView", "getOpenPizzeriaAvailableOrderTypesTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "openPizzeriaAvailableOrderTypesErrorIcon", "getOpenPizzeriaAvailableOrderTypesErrorIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "openScheduleTextView", "getOpenScheduleTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "distanceToUser", "getDistanceToUser()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "closedScheduleOpenFromTextView", "getClosedScheduleOpenFromTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "progress", "getProgress()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(PickupPizzeriaVH.class, "cityName", "getCityName()Landroid/widget/TextView;", 0))};
    private final k79 addressTextView$delegate;
    private final k79 cityName$delegate;
    private final k79 closedPizzeriaDescription$delegate;
    private final k79 closedScheduleOpenFromTextView$delegate;
    private final k79 distanceToUser$delegate;
    private final k79 openPizzeriaAvailableOrderTypesErrorIcon$delegate;
    private final k79 openPizzeriaAvailableOrderTypesTextView$delegate;
    private final k79 openPizzeriaDescription$delegate;
    private final k79 openPizzeriaLabelTextView$delegate;
    private final k79 openScheduleTextView$delegate;
    private final k79 progress$delegate;

    /* compiled from: PickupPizzeriaVH.kt */
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
    public PickupPizzeriaVH(kzb kzbVar) {
        super(kzbVar, dz8.pickup_pizzeria_geo_list_item);
        z65.h(kzbVar, "viewInflater");
        this.addressTextView$delegate = kb0.g(this, dy8.b);
        this.openPizzeriaLabelTextView$delegate = kb0.g(this, dy8.opened_pizzeria_label);
        this.openPizzeriaDescription$delegate = kb0.g(this, dy8.open_pizzeria_description);
        this.closedPizzeriaDescription$delegate = kb0.g(this, dy8.closed_pizzeria_description);
        this.openPizzeriaAvailableOrderTypesTextView$delegate = kb0.g(this, dy8.open_pizzeria_available_order_types);
        this.openPizzeriaAvailableOrderTypesErrorIcon$delegate = kb0.g(this, dy8.open_pizzeria_available_order_types_error_icon);
        this.openScheduleTextView$delegate = kb0.g(this, dy8.open_pizzeria_schedule);
        this.distanceToUser$delegate = kb0.g(this, dy8.distance_to_user);
        this.closedScheduleOpenFromTextView$delegate = kb0.g(this, dy8.closed_pizzeria_schedule_open_from);
        this.progress$delegate = kb0.g(this, dy8.F0);
        this.cityName$delegate = kb0.g(this, dy8.cityName);
    }

    private final TextView getAddressTextView() {
        return (TextView) this.addressTextView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getCityName() {
        return (TextView) this.cityName$delegate.a(this, $$delegatedProperties[10]);
    }

    private final ConstraintLayout getClosedPizzeriaDescription() {
        return (ConstraintLayout) this.closedPizzeriaDescription$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getClosedScheduleOpenFromTextView() {
        return (TextView) this.closedScheduleOpenFromTextView$delegate.a(this, $$delegatedProperties[8]);
    }

    private final TextView getDistanceToUser() {
        return (TextView) this.distanceToUser$delegate.a(this, $$delegatedProperties[7]);
    }

    private final ImageView getOpenPizzeriaAvailableOrderTypesErrorIcon() {
        return (ImageView) this.openPizzeriaAvailableOrderTypesErrorIcon$delegate.a(this, $$delegatedProperties[5]);
    }

    private final TextView getOpenPizzeriaAvailableOrderTypesTextView() {
        return (TextView) this.openPizzeriaAvailableOrderTypesTextView$delegate.a(this, $$delegatedProperties[4]);
    }

    private final ConstraintLayout getOpenPizzeriaDescription() {
        return (ConstraintLayout) this.openPizzeriaDescription$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getOpenPizzeriaLabelTextView() {
        return (TextView) this.openPizzeriaLabelTextView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getOpenScheduleTextView() {
        return (TextView) this.openScheduleTextView$delegate.a(this, $$delegatedProperties[6]);
    }

    private final ProgressBar getProgress() {
        return (ProgressBar) this.progress$delegate.a(this, $$delegatedProperties[9]);
    }

    private final void hideErrorIcon() {
        getOpenPizzeriaAvailableOrderTypesErrorIcon().setVisibility(8);
    }

    private final void seErrorIconColor(int i) {
        f83.n(getOpenPizzeriaAvailableOrderTypesErrorIcon().getDrawable(), iu1.c(getOpenPizzeriaAvailableOrderTypesErrorIcon().getContext(), i));
    }

    private final void setColor(TextView textView, int i) {
        textView.setTextColor(iu1.c(textView.getContext(), i));
    }

    private final void setLabelColors(boolean z) {
        if (z) {
            setLabelsEnabled();
        } else {
            setLabelsDisabled();
        }
    }

    private final void setLabelsDisabled() {
        TextView addressTextView = getAddressTextView();
        int i = nw8.e;
        setColor(addressTextView, i);
        setColor(getOpenScheduleTextView(), i);
        TextView openPizzeriaAvailableOrderTypesTextView = getOpenPizzeriaAvailableOrderTypesTextView();
        int i2 = nw8.d;
        setColor(openPizzeriaAvailableOrderTypesTextView, i2);
        setColor(getOpenPizzeriaLabelTextView(), i);
        seErrorIconColor(i2);
    }

    private final void setLabelsEnabled() {
        TextView addressTextView = getAddressTextView();
        int i = nw8.c;
        setColor(addressTextView, i);
        setColor(getOpenScheduleTextView(), i);
        setColor(getOpenPizzeriaAvailableOrderTypesTextView(), i);
        setColor(getOpenPizzeriaLabelTextView(), nw8.d);
        seErrorIconColor(i);
    }

    private final void showErrorIcon() {
        getOpenPizzeriaAvailableOrderTypesErrorIcon().setVisibility(0);
    }

    private final void switchInvisibility(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final String getAddress() {
        return getAddressTextView().getText().toString();
    }

    public final void hideCityName() {
        getCityName().setVisibility(8);
    }

    public final boolean isEnabled() {
        return this.itemView.isEnabled();
    }

    public final void setAddress(String str) {
        z65.h(str, "value");
        getAddressTextView().setText(str);
    }

    public final void setAvailableOrderTypesCarryout() {
        getOpenPizzeriaAvailableOrderTypesTextView().setText(this.itemView.getContext().getString(o09.carryout_order_type_label));
        hideErrorIcon();
    }

    public final void setAvailableOrderTypesCarryoutOnly() {
        getOpenPizzeriaAvailableOrderTypesTextView().setText(this.itemView.getContext().getString(o09.j));
        showErrorIcon();
    }

    public final void setAvailableOrderTypesDeliveryAndCarryout() {
        getOpenPizzeriaAvailableOrderTypesTextView().setText(this.itemView.getContext().getString(o09.pickup_pizzeria_delivery_and_carryout_order_types));
        hideErrorIcon();
    }

    public final void setAvailableOrderTypesDeliveryAndRestaurant() {
        setAvailableOrderTypesDeliveryAndCarryout();
    }

    public final void setAvailableOrderTypesDeliveryOnly() {
        getOpenPizzeriaAvailableOrderTypesTextView().setText(this.itemView.getContext().getString(o09.r));
        showErrorIcon();
    }

    public final void setDescriptionIsClosedToday() {
        un3.o(getOpenPizzeriaDescription(), false);
        un3.o(getClosedPizzeriaDescription(), true);
    }

    public final void setDescriptionIsOpenToday() {
        un3.o(getOpenPizzeriaDescription(), true);
        un3.o(getClosedPizzeriaDescription(), false);
    }

    public final void setDescriptionIsUndefinedToday() {
        un3.o(getOpenPizzeriaDescription(), false);
        un3.o(getClosedPizzeriaDescription(), false);
    }

    public final void setDistanceToUser(String str) {
        z65.h(str, "text");
        getDistanceToUser().setText(str);
    }

    public final void setDistanceToUserVisibility(boolean z) {
        un3.o(getDistanceToUser(), z);
    }

    public final void setEnabled(boolean z) {
        this.itemView.setEnabled(z);
        Unit unit = Unit.a;
        setLabelColors(z);
    }

    public final void setIsLoading(boolean z) {
        switchInvisibility(getProgress(), z);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setScheduleOpenAroundTheClock() {
        getOpenScheduleTextView().setText(this.itemView.getContext().getString(o09.openAroundTheClock));
        un3.o(getOpenScheduleTextView(), true);
    }

    public final void setScheduleTimeEmpty() {
        getClosedScheduleOpenFromTextView().setText("");
        un3.o(getOpenScheduleTextView(), false);
    }

    public final void setScheduleTimeOpenToday(String str, String str2) {
        z65.h(str, "startWorkTime");
        z65.h(str2, "endWorkTime");
        getOpenScheduleTextView().setText(this.itemView.getContext().getString(o09.pizzeria_schedule_description_short, str, str2));
        un3.o(getOpenScheduleTextView(), true);
    }

    public final void setScheduleTimeWillBeOpenToday(String str) {
        z65.h(str, "startWorkTime");
        getClosedScheduleOpenFromTextView().setText(this.itemView.getContext().getString(o09.pizzeria_schedule_open_today_from, str));
        un3.o(getOpenScheduleTextView(), false);
    }

    public final void setScheduleTimeWillBeOpenTomorrow(String str) {
        z65.h(str, "startWorkTime");
        getClosedScheduleOpenFromTextView().setText(this.itemView.getContext().getString(o09.pizzeria_schedule_open_tomorrow_from, str));
        un3.o(getOpenScheduleTextView(), false);
    }

    public final void showCityName(String str) {
        z65.h(str, "cityTitle");
        getCityName().setVisibility(0);
        getCityName().setText(str);
    }
}
