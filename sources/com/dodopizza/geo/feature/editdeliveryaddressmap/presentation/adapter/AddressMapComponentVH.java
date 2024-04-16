package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.android.textinputlayout.DodoEditTextInputLayout;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.adapter.AddressMapComponentVH;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressMapComponentVH.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002JJ\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tJ\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0010R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/adapter/AddressMapComponentVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Ld7;", "vo", "Lkotlin/Function2;", "", "", "onEditListener", "setOnEditListener", "Lkotlin/Function1;", "onFocusLostListener", "setOnFocusLostListener", "Lkotlin/Function0;", "onNextListener", "setOnNextListener", "setImeOptions", "", "showError", "validateRequiredField", "isRequired", "", "setBackgroundToRequiredField", "setSize", "", "componentCountOnLine", "componentViewInit", "totalMarginHorizontalPx", "showAddressComponent", "isEnabled", "setEnabled", "Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "addressMapTextInputLayout$delegate", "Lk79;", "getAddressMapTextInputLayout", "()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "addressMapTextInputLayout", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class AddressMapComponentVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AddressMapComponentVH.class, "addressMapTextInputLayout", "getAddressMapTextInputLayout()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", 0))};
    public static final a Companion = new a(null);
    public static final int DEFAULT_COMPONENT_MARGIN = 8;
    public static final int MAX_LINES = 100;
    public static final int THREE_IN_ONE_LINE = 3;
    public static final int TOTAL_PARENT_MARGIN = 24;
    public static final int TWO_IN_ONE_LINE = 2;
    private final k79 addressMapTextInputLayout$delegate;

    /* compiled from: AddressMapComponentVH.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/adapter/AddressMapComponentVH$a;", "", "", "DEFAULT_COMPONENT_MARGIN", "I", "MAX_LINES", "THREE_IN_ONE_LINE", "TOTAL_PARENT_MARGIN", "TWO_IN_ONE_LINE", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AddressMapComponentVH.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c7.values().length];
            try {
                iArr[c7.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c7.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c7.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c7.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapComponentVH(kzb kzbVar) {
        super(kzbVar, dz8.address_map_component_item);
        z65.h(kzbVar, "viewInflater");
        this.addressMapTextInputLayout$delegate = kb0.g(this, dy8.E);
    }

    private final void componentViewInit(int i) {
        EditText editText = getAddressMapTextInputLayout().getEditText();
        if (editText != null) {
            editText.setInputType(1);
        }
        jx9 jx9Var = jx9.a;
        Context context = this.itemView.getContext();
        z65.g(context, "getContext(...)");
        int e = (jx9Var.e(context) - totalMarginHorizontalPx(i)) / i;
        DodoEditTextInputLayout addressMapTextInputLayout = getAddressMapTextInputLayout();
        ViewGroup.LayoutParams layoutParams = addressMapTextInputLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = e;
            addressMapTextInputLayout.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodoEditTextInputLayout getAddressMapTextInputLayout() {
        return (DodoEditTextInputLayout) this.addressMapTextInputLayout$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence setBackgroundToRequiredField(boolean z) {
        Editable editable;
        EditText editText = getAddressMapTextInputLayout().getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        if (String.valueOf(editable).length() != 0 || !z) {
            return null;
        }
        return "";
    }

    private final void setImeOptions(d7 d7Var) {
        int i;
        EditText editText = getAddressMapTextInputLayout().getEditText();
        if (editText != null) {
            if (d7Var.k()) {
                i = 6;
            } else {
                i = 5;
            }
            editText.setImeOptions(i);
        }
    }

    private final void setOnEditListener(d7 d7Var, Function2<? super d7, ? super String, Unit> function2) {
        EditText editText = getAddressMapTextInputLayout().getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new c(d7Var, function2));
        }
    }

    private final void setOnFocusLostListener(final d7 d7Var, final Function1<? super d7, Unit> function1) {
        EditText editText = getAddressMapTextInputLayout().getEditText();
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c9
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    AddressMapComponentVH.setOnFocusLostListener$lambda$3(Function1.this, d7Var, view, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnFocusLostListener$lambda$3(Function1 function1, d7 d7Var, View view, boolean z) {
        z65.h(function1, "$onFocusLostListener");
        z65.h(d7Var, "$vo");
        if (!z) {
            function1.invoke(d7Var);
        }
    }

    private final void setOnNextListener(final Function0<Unit> function0) {
        EditText editText = getAddressMapTextInputLayout().getEditText();
        if (editText != null) {
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: d9
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean onNextListener$lambda$4;
                    onNextListener$lambda$4 = AddressMapComponentVH.setOnNextListener$lambda$4(Function0.this, textView, i, keyEvent);
                    return onNextListener$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnNextListener$lambda$4(Function0 function0, TextView textView, int i, KeyEvent keyEvent) {
        z65.h(function0, "$onNextListener");
        if (i != 5 && i != 6) {
            return false;
        }
        function0.invoke();
        return true;
    }

    private final void setSize(d7 d7Var) {
        int i = b.$EnumSwitchMapping$0[d7Var.g().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        EditText editText = getAddressMapTextInputLayout().getEditText();
                        if (editText != null) {
                            editText.setRawInputType(1);
                        }
                        EditText editText2 = getAddressMapTextInputLayout().getEditText();
                        if (editText2 != null) {
                            editText2.setMaxLines(100);
                        }
                        EditText editText3 = getAddressMapTextInputLayout().getEditText();
                        if (editText3 != null) {
                            editText3.setInputType(131072);
                        }
                        EditText editText4 = getAddressMapTextInputLayout().getEditText();
                        if (editText4 != null) {
                            editText4.setHorizontallyScrolling(false);
                        }
                        EditText editText5 = getAddressMapTextInputLayout().getEditText();
                        if (editText5 != null) {
                            editText5.setVerticalScrollBarEnabled(true);
                        }
                        EditText editText6 = getAddressMapTextInputLayout().getEditText();
                        if (editText6 != null) {
                            editText6.setHorizontalScrollBarEnabled(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                DodoEditTextInputLayout addressMapTextInputLayout = getAddressMapTextInputLayout();
                ViewGroup.LayoutParams layoutParams = addressMapTextInputLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    addressMapTextInputLayout.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            componentViewInit(3);
            return;
        }
        componentViewInit(2);
    }

    private final int totalMarginHorizontalPx(int i) {
        return jx9.a.a((i * 8) + 24);
    }

    private final void validateRequiredField(boolean z) {
        getAddressMapTextInputLayout().setError(setBackgroundToRequiredField(z));
        EditText editText = getAddressMapTextInputLayout().getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new d(z));
        }
    }

    public final void setEnabled(boolean z) {
        getAddressMapTextInputLayout().setEnabled(z);
    }

    public final void showAddressComponent(d7 d7Var, Function0<Unit> function0, Function2<? super d7, ? super String, Unit> function2, Function1<? super d7, Unit> function1) {
        z65.h(d7Var, "vo");
        z65.h(function0, "onNextListener");
        z65.h(function2, "onEditListener");
        z65.h(function1, "onFocusLostListener");
        DodoEditTextInputLayout addressMapTextInputLayout = getAddressMapTextInputLayout();
        addressMapTextInputLayout.setEnabled(d7Var.j());
        addressMapTextInputLayout.setHint(d7Var.h());
        EditText editText = addressMapTextInputLayout.getEditText();
        if (editText != null) {
            editText.setText(d7Var.i());
        }
        addressMapTextInputLayout.setCounterMaxLength(d7Var.d());
        ViewGroup.LayoutParams layoutParams = addressMapTextInputLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            jx9 jx9Var = jx9.a;
            marginLayoutParams.setMarginStart(jx9Var.a(8));
            marginLayoutParams.topMargin = jx9Var.a(8);
            addressMapTextInputLayout.setLayoutParams(marginLayoutParams);
            EditText editText2 = getAddressMapTextInputLayout().getEditText();
            if (editText2 != null) {
                editText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(d7Var.d())});
            }
            setOnEditListener(d7Var, function2);
            setOnFocusLostListener(d7Var, function1);
            setOnNextListener(function0);
            setSize(d7Var);
            setImeOptions(d7Var);
            validateRequiredField(d7Var.f());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"com/dodopizza/geo/feature/editdeliveryaddressmap/presentation/adapter/AddressMapComponentVH$c", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        final /* synthetic */ d7 a;
        final /* synthetic */ Function2 b;

        public c(d7 d7Var, Function2 function2) {
            this.a = d7Var;
            this.b = function2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!z65.c(this.a.i(), String.valueOf(editable))) {
                this.a.u(String.valueOf(editable));
                this.b.invoke(this.a, (editable == null || (r3 = editable.toString()) == null) ? "" : "");
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"com/dodopizza/geo/feature/editdeliveryaddressmap/presentation/adapter/AddressMapComponentVH$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        final /* synthetic */ boolean b;

        public d(boolean z) {
            this.b = z;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AddressMapComponentVH.this.getAddressMapTextInputLayout().setError(AddressMapComponentVH.this.setBackgroundToRequiredField(this.b));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
