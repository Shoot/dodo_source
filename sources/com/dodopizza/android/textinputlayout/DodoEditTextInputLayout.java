package com.dodopizza.android.textinputlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DodoEditTextInputLayout.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "", "errorText", "", "G0", "H0", "setError", "", "isEnabled", "F0", "inProgress", "setProgress", "Landroidx/appcompat/widget/AppCompatTextView;", "V5", "Landroidx/appcompat/widget/AppCompatTextView;", "errorView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DodoEditTextInputLayout extends TextInputLayout {
    private final AppCompatTextView V5;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DodoEditTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    private final void G0(CharSequence charSequence) {
        if (charSequence == null) {
            un3.o(this.V5, false);
            EditText editText = getEditText();
            if (editText != null) {
                editText.setBackground(iu1.e(getContext(), kx8.rounded_corners_12dp_borders_grey_1dp));
            }
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setTextColor(iu1.c(getContext(), jw8.n));
            }
            invalidate();
            return;
        }
        if (charSequence.length() > 0) {
            this.V5.setText(charSequence);
            un3.o(this.V5, true);
        }
        EditText editText3 = getEditText();
        if (editText3 != null) {
            editText3.setBackground(iu1.e(getContext(), kx8.white_round12_shape_error));
        }
        EditText editText4 = getEditText();
        if (editText4 != null) {
            editText4.setTextColor(iu1.c(getContext(), jw8.p));
        }
        invalidate();
    }

    private final void H0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        addView(this.V5, -1, -2);
        AppCompatTextView appCompatTextView = this.V5;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        p45.j(appCompatTextView, 0, i + 22, 0, 0, 13, null);
        gdb.a.b(this.V5, p19.TextAppearance_Dodo_Text_M);
        this.V5.setTextColor(iu1.c(getContext(), jw8.p));
    }

    public final void F0(boolean z) {
        EditText editText = getEditText();
        z65.f(editText, "null cannot be cast to non-null type com.dodopizza.android.textinputlayout.DodoEditText");
        ((DodoEditText) editText).g(z);
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(CharSequence charSequence) {
        G0(charSequence);
    }

    public final void setProgress(boolean z) {
        EditText editText = getEditText();
        z65.f(editText, "null cannot be cast to non-null type com.dodopizza.android.textinputlayout.DodoEditText");
        ((DodoEditText) editText).setProgress(z);
    }

    public /* synthetic */ DodoEditTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DodoEditTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.V5 = appCompatTextView;
        super.setErrorEnabled(false);
        un3.o(appCompatTextView, false);
        H0();
    }
}
