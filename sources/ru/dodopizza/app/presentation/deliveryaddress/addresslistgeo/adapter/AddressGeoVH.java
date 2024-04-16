package ru.dodopizza.app.presentation.deliveryaddress.addresslistgeo.adapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import defpackage.n8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.deliveryaddress.addresslistgeo.adapter.AddressGeoVH;
/* compiled from: AddressGeoVH.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nJ\u0014\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJ\u0014\u0010\u0012\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010$\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R$\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00064"}, d2 = {"Lru/dodopizza/app/presentation/deliveryaddress/addresslistgeo/adapter/AddressGeoVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "addressText", "", "setAddress", "commentText", "setComment", "setLabelsColorsForEnabledState", "setLabelsColorsForDisabledState", "", "isShown", "setCommentVisibility", "isChecked", "setIsSelected", "Lkotlin/Function0;", "listener", "setSelectListener", "setEditListener", "Ln8$a;", "data", "showMessageAddressWithoutLocality", "Landroid/widget/TextView;", "address$delegate", "Lk79;", "getAddress", "()Landroid/widget/TextView;", "address", "comment$delegate", "getComment", "comment", "error$delegate", "getError", "error", "Landroid/widget/RadioButton;", "isSelectedFlag$delegate", "isSelectedFlag", "()Landroid/widget/RadioButton;", "Landroid/widget/LinearLayout;", "editAddress$delegate", "getEditAddress", "()Landroid/widget/LinearLayout;", "editAddress", "value", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddressGeoVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AddressGeoVH.class, "address", "getAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AddressGeoVH.class, "comment", "getComment()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AddressGeoVH.class, "error", "getError()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AddressGeoVH.class, "isSelectedFlag", "isSelectedFlag()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(AddressGeoVH.class, "editAddress", "getEditAddress()Landroid/widget/LinearLayout;", 0))};
    private final k79 address$delegate;
    private final k79 comment$delegate;
    private final k79 editAddress$delegate;
    private final k79 error$delegate;
    private final k79 isSelectedFlag$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressGeoVH(kzb kzbVar) {
        super(kzbVar, R.layout.address_delivery_geo_item);
        z65.h(kzbVar, "viewInflater");
        this.address$delegate = kb0.g(this, R.id.address_label);
        this.comment$delegate = kb0.g(this, R.id.comment_label);
        this.error$delegate = kb0.g(this, R.id.error_label);
        this.isSelectedFlag$delegate = kb0.g(this, R.id.selected_flag);
        this.editAddress$delegate = kb0.g(this, R.id.edit_address_container);
    }

    private final TextView getAddress() {
        return (TextView) this.address$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getComment() {
        return (TextView) this.comment$delegate.a(this, $$delegatedProperties[1]);
    }

    private final LinearLayout getEditAddress() {
        return (LinearLayout) this.editAddress$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getError() {
        return (TextView) this.error$delegate.a(this, $$delegatedProperties[2]);
    }

    private final RadioButton isSelectedFlag() {
        return (RadioButton) this.isSelectedFlag$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEditListener$lambda$2(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSelectListener$lambda$1(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    public final boolean isEnabled() {
        return this.itemView.isEnabled();
    }

    public final void setAddress(String str) {
        z65.h(str, "addressText");
        getAddress().setText(str);
    }

    public final void setComment(String str) {
        z65.h(str, "commentText");
        getComment().setText(str);
    }

    public final void setCommentVisibility(boolean z) {
        un3.o(getComment(), z);
    }

    public final void setEditListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        getEditAddress().setOnClickListener(new View.OnClickListener() { // from class: k8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressGeoVH.setEditListener$lambda$2(Function0.this, view);
            }
        });
    }

    public final void setEnabled(boolean z) {
        this.itemView.setEnabled(z);
    }

    public final void setIsSelected(boolean z) {
        isSelectedFlag().setChecked(z);
    }

    public final void setLabelsColorsForDisabledState() {
        getAddress().setTextColor(iu1.c(getAddress().getContext(), R.color.textIconTertiaryColor));
        getComment().setTextColor(iu1.c(getComment().getContext(), R.color.textIconTertiaryColor));
    }

    public final void setLabelsColorsForEnabledState() {
        getAddress().setTextColor(iu1.c(getAddress().getContext(), R.color.textIconPrimaryColor));
        getComment().setTextColor(iu1.c(getComment().getContext(), R.color.textIconSecondaryColor));
    }

    public final void setSelectListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        isSelectedFlag().setOnClickListener(new View.OnClickListener() { // from class: l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressGeoVH.setSelectListener$lambda$1(Function0.this, view);
            }
        });
    }

    public final void showMessageAddressWithoutLocality(n8.a aVar) {
        z65.h(aVar, "data");
        un3.o(getError(), !aVar.e());
        isSelectedFlag().setChecked(aVar.e());
    }
}
