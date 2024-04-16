package com.dodopizza.geo.feature.deliveryaddresslist.adapter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: DeliveryAddressWithSelectionVH.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0011R\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001b\u0010!\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/adapter/DeliveryAddressWithSelectionVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Landroid/widget/TextView;", "", RemoteMessageConst.Notification.COLOR, "", "setColor", "Lkotlin/Function0;", "listener", "setOnEditPressedListener", "setOnSelectPressedListener", "", "addressText", "setAddressText", "text", "showCommentText", "hideCommentText", "", "isChecked", "checkIsSelectedFlag", "setLabelsColorsForEnabledState", "setLabelsColorsForDisabledState", "show", "showErrorAddressWithoutLocality", "addressText$delegate", "Lk79;", "getAddressText", "()Landroid/widget/TextView;", "commentText$delegate", "getCommentText", "commentText", "errorText$delegate", "getErrorText", "errorText", "Landroid/widget/ImageButton;", "editButton$delegate", "getEditButton", "()Landroid/widget/ImageButton;", "editButton", "Landroid/widget/RadioButton;", "isSelectedFlag$delegate", "isSelectedFlag", "()Landroid/widget/RadioButton;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryAddressWithSelectionVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(DeliveryAddressWithSelectionVH.class, "addressText", "getAddressText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryAddressWithSelectionVH.class, "commentText", "getCommentText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryAddressWithSelectionVH.class, "errorText", "getErrorText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryAddressWithSelectionVH.class, "editButton", "getEditButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(DeliveryAddressWithSelectionVH.class, "isSelectedFlag", "isSelectedFlag()Landroid/widget/RadioButton;", 0))};
    private final k79 addressText$delegate;
    private final k79 commentText$delegate;
    private final k79 editButton$delegate;
    private final k79 errorText$delegate;
    private final k79 isSelectedFlag$delegate;

    /* compiled from: DeliveryAddressWithSelectionVH.kt */
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

    /* compiled from: DeliveryAddressWithSelectionVH.kt */
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
    public DeliveryAddressWithSelectionVH(kzb kzbVar) {
        super(kzbVar, dz8.address_delivery_with_selection_item);
        z65.h(kzbVar, "viewInflater");
        this.addressText$delegate = kb0.g(this, dy8.address_delivery_with_selection_address_text);
        this.commentText$delegate = kb0.g(this, dy8.address_delivery_with_selection_comment_label);
        this.errorText$delegate = kb0.g(this, dy8.address_delivery_with_selection_error_label);
        this.editButton$delegate = kb0.g(this, dy8.address_delivery_with_selection_edit_button);
        this.isSelectedFlag$delegate = kb0.g(this, dy8.address_delivery_with_selection_is_selected_flag);
    }

    private final TextView getAddressText() {
        return (TextView) this.addressText$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getCommentText() {
        return (TextView) this.commentText$delegate.a(this, $$delegatedProperties[1]);
    }

    private final ImageButton getEditButton() {
        return (ImageButton) this.editButton$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getErrorText() {
        return (TextView) this.errorText$delegate.a(this, $$delegatedProperties[2]);
    }

    private final RadioButton isSelectedFlag() {
        return (RadioButton) this.isSelectedFlag$delegate.a(this, $$delegatedProperties[4]);
    }

    private final void setColor(TextView textView, int i) {
        textView.setTextColor(iu1.c(textView.getContext(), i));
    }

    public final void checkIsSelectedFlag(boolean z) {
        isSelectedFlag().setChecked(z);
    }

    public final void hideCommentText() {
        un3.e(getCommentText());
    }

    public final void setAddressText(String str) {
        z65.h(str, "addressText");
        getAddressText().setText(str);
    }

    public final void setLabelsColorsForDisabledState() {
        TextView addressText = getAddressText();
        int i = nw8.e;
        setColor(addressText, i);
        setColor(getCommentText(), i);
    }

    public final void setLabelsColorsForEnabledState() {
        setColor(getAddressText(), nw8.c);
        setColor(getCommentText(), nw8.d);
    }

    public final void setOnEditPressedListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getEditButton(), new a(function0));
    }

    public final void setOnSelectPressedListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new b(function0));
    }

    public final void showCommentText(String str) {
        z65.h(str, "text");
        getCommentText().setText(str);
        un3.k(getCommentText());
    }

    public final void showErrorAddressWithoutLocality(boolean z) {
        un3.o(getErrorText(), z);
    }
}
