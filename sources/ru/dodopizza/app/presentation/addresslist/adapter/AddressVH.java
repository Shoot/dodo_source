package ru.dodopizza.app.presentation.addresslist.adapter;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.addresslist.adapter.AddressVH;
/* compiled from: AddressVH.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nJ\u0014\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\nR\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010$\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R$\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00064"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/adapter/AddressVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "addressText", "", "setAddress", "commentText", "setComment", "setLabelsColorsForEnabledState", "setLabelsColorsForDisabledState", "", "isShown", "setCommentVisibility", "isSelected", "setIsSelected", "Lkotlin/Function0;", "listener", "setListener", "show", "showMessageAddressWithoutLocality", "isLoading", "setIsLoading", "Landroid/widget/TextView;", "address$delegate", "Lk79;", "getAddress", "()Landroid/widget/TextView;", "address", "comment$delegate", "getComment", "comment", "error$delegate", "getError", "error", "Landroid/view/View;", "isSelectedFlag$delegate", "isSelectedFlag", "()Landroid/view/View;", "Landroid/widget/ProgressBar;", "progress$delegate", "getProgress", "()Landroid/widget/ProgressBar;", "progress", "value", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddressVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AddressVH.class, "address", "getAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AddressVH.class, "comment", "getComment()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AddressVH.class, "error", "getError()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AddressVH.class, "isSelectedFlag", "isSelectedFlag()Landroid/view/View;", 0)), bc9.f(new ar8(AddressVH.class, "progress", "getProgress()Landroid/widget/ProgressBar;", 0))};
    private final k79 address$delegate;
    private final k79 comment$delegate;
    private final k79 error$delegate;
    private final k79 isSelectedFlag$delegate;
    private final k79 progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressVH(kzb kzbVar) {
        super(kzbVar, R.layout.address_item_list);
        z65.h(kzbVar, "viewInflater");
        this.address$delegate = kb0.g(this, R.id.address_label);
        this.comment$delegate = kb0.g(this, R.id.comment_label);
        this.error$delegate = kb0.g(this, R.id.error_label);
        this.isSelectedFlag$delegate = kb0.g(this, R.id.selected_flag);
        this.progress$delegate = kb0.g(this, R.id.progress);
    }

    private final TextView getAddress() {
        return (TextView) this.address$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getComment() {
        return (TextView) this.comment$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getError() {
        return (TextView) this.error$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ProgressBar getProgress() {
        return (ProgressBar) this.progress$delegate.a(this, $$delegatedProperties[4]);
    }

    private final View isSelectedFlag() {
        return (View) this.isSelectedFlag$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(Function0 function0, View view) {
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

    public final void setEnabled(boolean z) {
        this.itemView.setEnabled(z);
    }

    public final void setIsLoading(boolean z) {
        un3.o(getProgress(), z);
    }

    public final void setIsSelected(boolean z) {
        un3.o(isSelectedFlag(), z);
    }

    public final void setLabelsColorsForDisabledState() {
        getAddress().setTextColor(getAddress().getResources().getColor(R.color.textIconTertiaryColor));
        getComment().setTextColor(getAddress().getResources().getColor(R.color.textIconTertiaryColor));
    }

    public final void setLabelsColorsForEnabledState() {
        getAddress().setTextColor(getAddress().getResources().getColor(R.color.textIconPrimaryColor));
        getComment().setTextColor(getAddress().getResources().getColor(R.color.textIconSecondaryColor));
    }

    public final void setListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: h9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressVH.setListener$lambda$1(Function0.this, view);
            }
        });
    }

    public final void showMessageAddressWithoutLocality(boolean z) {
        un3.o(getError(), z);
    }
}
