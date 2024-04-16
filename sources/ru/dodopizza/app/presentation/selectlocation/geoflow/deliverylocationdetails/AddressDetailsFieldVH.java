package ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.textfield.TextInputEditText;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.AddressDetailsFieldVH;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a;
/* compiled from: AddressDetailsFieldVH.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J\f\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002JP\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/AddressDetailsFieldVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "vo", "Lkotlin/Function2;", "", "", "onFocusLostListener", "setOnFocusLostListener", "getLabel", "field", "editListener", "Lkotlin/Function0;", "doneListener", "setField", "Landroid/widget/TextView;", "label$delegate", "Lk79;", "()Landroid/widget/TextView;", "label", "Lcom/google/android/material/textfield/TextInputEditText;", "textLayout$delegate", "getTextLayout", "()Lcom/google/android/material/textfield/TextInputEditText;", "textLayout", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddressDetailsFieldVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AddressDetailsFieldVH.class, "label", "getLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AddressDetailsFieldVH.class, "textLayout", "getTextLayout()Lcom/google/android/material/textfield/TextInputEditText;", 0))};
    private final k79 label$delegate;
    private final k79 textLayout$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsFieldVH(kzb kzbVar) {
        super(kzbVar, R.layout.view_delivery_location_details_field);
        z65.h(kzbVar, "viewInflater");
        this.label$delegate = kb0.g(this, R.id.delivery_location_details_text_view);
        this.textLayout$delegate = kb0.g(this, R.id.delivery_location_details_edit_text);
    }

    private final TextView getLabel() {
        return (TextView) this.label$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextInputEditText getTextLayout() {
        return (TextInputEditText) this.textLayout$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setField$lambda$1(Function0 function0, TextView textView, int i, KeyEvent keyEvent) {
        z65.h(function0, "$doneListener");
        if (i == 6) {
            function0.invoke();
            return true;
        }
        return false;
    }

    private final void setOnFocusLostListener(final ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, final Function2<? super ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a, ? super String, Unit> function2) {
        getTextLayout().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                AddressDetailsFieldVH.setOnFocusLostListener$lambda$2(Function2.this, aVar, this, view, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnFocusLostListener$lambda$2(Function2 function2, ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, AddressDetailsFieldVH addressDetailsFieldVH, View view, boolean z) {
        z65.h(function2, "$onFocusLostListener");
        z65.h(aVar, "$vo");
        z65.h(addressDetailsFieldVH, "this$0");
        if (!z) {
            function2.invoke(aVar, String.valueOf(addressDetailsFieldVH.getTextLayout().getText()));
        }
    }

    public final void setField(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, Function2<? super ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a, ? super String, Unit> function2, final Function0<Unit> function0, Function2<? super ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a, ? super String, Unit> function22) {
        z65.h(aVar, "field");
        z65.h(function2, "editListener");
        z65.h(function0, "doneListener");
        z65.h(function22, "onFocusLostListener");
        getLabel().setText(getLabel(aVar));
        getTextLayout().setText(b.c(aVar));
        getTextLayout().setInputType(16384);
        getTextLayout().setTag(b.b(aVar));
        if (b.d(aVar)) {
            getTextLayout().setHeight(jx9.a.a(112));
        }
        setOnFocusLostListener(aVar, function22);
        getTextLayout().addTextChangedListener(new a(function2, aVar));
        if (b.e(aVar)) {
            getTextLayout().setImeOptions(6);
            getTextLayout().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: k7
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean field$lambda$1;
                    field$lambda$1 = AddressDetailsFieldVH.setField$lambda$1(Function0.this, textView, i, keyEvent);
                    return field$lambda$1;
                }
            });
        }
    }

    private final String getLabel(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar) {
        if (aVar instanceof a.b) {
            return jzb.a(this, ox2.a(((a.b) aVar).c()));
        }
        if (aVar instanceof a.C0607a) {
            return ((a.C0607a) aVar).d();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/AddressDetailsFieldVH$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a implements TextWatcher {
        final /* synthetic */ Function2 a;
        final /* synthetic */ ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a b;

        public a(Function2 function2, ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar) {
            this.a = function2;
            this.b = aVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.a.invoke(this.b, (editable == null || (r3 = editable.toString()) == null) ? "" : "");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
