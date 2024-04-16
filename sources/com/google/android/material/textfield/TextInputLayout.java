package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.u;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    private static final int U5 = i19.Widget_Design_TextInputLayout;
    private CharSequence A;
    private ColorStateList A5;
    @NonNull
    private final TextView B;
    private PorterDuff.Mode B5;
    private ColorStateList C5;
    private ColorStateList D5;
    private int E5;
    private int F5;
    private int G5;
    private ColorStateList H5;
    private boolean I;
    private int I5;
    private int J5;
    private int K5;
    private int L5;
    private int M5;
    private boolean N5;
    final tb1 O5;
    private boolean P5;
    private boolean Q5;
    private ValueAnimator R5;
    private CharSequence S4;
    private boolean S5;
    private boolean T4;
    private boolean T5;
    private fa6 U4;
    private fa6 V4;
    private fa6 W4;
    @NonNull
    private uga X4;
    private boolean Y4;
    private final int Z4;
    @NonNull
    private final FrameLayout a;
    private int a5;
    @NonNull
    private final k b;
    private int b5;
    @NonNull
    private final LinearLayout c;
    private int c5;
    @NonNull
    private final FrameLayout d;
    private int d5;
    EditText e;
    private int e5;
    private CharSequence f;
    private int f5;
    private int g;
    private int g5;
    private int h;
    private final Rect h5;
    private int i;
    private final Rect i5;
    private int j;
    private final RectF j5;
    private final com.google.android.material.textfield.g k;
    private Typeface k5;
    boolean l;
    private Drawable l5;
    private int m;
    private int m5;
    private boolean n;
    private final LinkedHashSet<f> n5;
    private TextView o;
    private int o5;
    private int p;
    private final SparseArray<com.google.android.material.textfield.e> p5;
    private int q;
    @NonNull
    private final CheckableImageButton q5;
    private CharSequence r;
    private final LinkedHashSet<g> r5;
    private boolean s;
    private ColorStateList s5;
    private TextView t;
    private PorterDuff.Mode t5;
    private ColorStateList u;
    private Drawable u5;
    private int v;
    private int v5;
    private qo3 w;
    private Drawable w5;
    private qo3 x;
    private View.OnLongClickListener x5;
    private ColorStateList y;
    private View.OnLongClickListener y5;
    private ColorStateList z;
    @NonNull
    private final CheckableImageButton z5;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        CharSequence c;
        boolean d;
        CharSequence e;
        CharSequence f;
        CharSequence g;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + " hint=" + ((Object) this.e) + " helperText=" + ((Object) this.f) + " placeholderText=" + ((Object) this.g) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
            TextUtils.writeToParcel(this.e, parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
        }

        SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.c = (CharSequence) creator.createFromParcel(parcel);
            this.d = parcel.readInt() == 1;
            this.e = (CharSequence) creator.createFromParcel(parcel);
            this.f = (CharSequence) creator.createFromParcel(parcel);
            this.g = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.q5.performClick();
            TextInputLayout.this.q5.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.e.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.O5.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends s2 {
        private final TextInputLayout d;

        public e(@NonNull TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.s2
        public void g(@NonNull View view, @NonNull d4 d4Var) {
            CharSequence charSequence;
            String str;
            super.g(view, d4Var);
            EditText editText = this.d.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            boolean z = !isEmpty;
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.d.N();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z2 = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.d.b.v(d4Var);
            if (z) {
                d4Var.U0(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                d4Var.U0(str);
                if (z4 && placeholderText != null) {
                    d4Var.U0(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                d4Var.U0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    d4Var.A0(str);
                } else {
                    if (z) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    d4Var.U0(str);
                }
                d4Var.R0(isEmpty);
            }
            d4Var.F0((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
            if (z2) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                d4Var.w0(error);
            }
            View s = this.d.k.s();
            if (s != null) {
                d4Var.C0(s);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(@NonNull TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.textInputStyle);
    }

    private boolean A() {
        if (this.I && !TextUtils.isEmpty(this.S4) && (this.U4 instanceof com.google.android.material.textfield.c)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(int i) {
        if (i == 0 && !this.N5) {
            h0();
        } else {
            J();
        }
    }

    private void B() {
        Iterator<f> it = this.n5.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void B0(boolean z, boolean z2) {
        int defaultColor = this.H5.getDefaultColor();
        int colorForState = this.H5.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.H5.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f5 = colorForState2;
        } else if (z2) {
            this.f5 = colorForState;
        } else {
            this.f5 = defaultColor;
        }
    }

    private void C(int i) {
        Iterator<g> it = this.r5.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    private void C0() {
        int i;
        if (this.e == null) {
            return;
        }
        if (!K() && !L()) {
            i = syb.I(this.e);
        } else {
            i = 0;
        }
        syb.J0(this.B, getContext().getResources().getDimensionPixelSize(ww8.material_input_text_to_prefix_suffix_padding), this.e.getPaddingTop(), i, this.e.getPaddingBottom());
    }

    private void D(Canvas canvas) {
        fa6 fa6Var;
        if (this.W4 != null && (fa6Var = this.V4) != null) {
            fa6Var.draw(canvas);
            if (this.e.isFocused()) {
                Rect bounds = this.W4.getBounds();
                Rect bounds2 = this.V4.getBounds();
                float D = this.O5.D();
                int centerX = bounds2.centerX();
                bounds.left = sk.c(centerX, bounds2.left, D);
                bounds.right = sk.c(centerX, bounds2.right, D);
                this.W4.draw(canvas);
            }
        }
    }

    private void D0() {
        int i;
        int visibility = this.B.getVisibility();
        boolean z = false;
        if (this.A != null && !N()) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            com.google.android.material.textfield.e endIconDelegate = getEndIconDelegate();
            if (i == 0) {
                z = true;
            }
            endIconDelegate.c(z);
        }
        t0();
        this.B.setVisibility(i);
        q0();
    }

    private void E(@NonNull Canvas canvas) {
        if (this.I) {
            this.O5.l(canvas);
        }
    }

    private void F(boolean z) {
        ValueAnimator valueAnimator = this.R5;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.R5.cancel();
        }
        if (z && this.Q5) {
            k(0.0f);
        } else {
            this.O5.u0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.c) this.U4).p0()) {
            x();
        }
        this.N5 = true;
        J();
        this.b.i(true);
        D0();
    }

    private int G(int i, boolean z) {
        int compoundPaddingLeft = i + this.e.getCompoundPaddingLeft();
        if (getPrefixText() != null && !z) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    private int H(int i, boolean z) {
        int compoundPaddingRight = i - this.e.getCompoundPaddingRight();
        if (getPrefixText() != null && z) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    private boolean I() {
        if (this.o5 != 0) {
            return true;
        }
        return false;
    }

    private void J() {
        TextView textView = this.t;
        if (textView != null && this.s) {
            textView.setText((CharSequence) null);
            hlb.a(this.a, this.x);
            this.t.setVisibility(4);
        }
    }

    private boolean L() {
        if (this.z5.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private boolean P() {
        if (this.a5 == 1 && this.e.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    private void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.a5 != 0) {
            v0();
        }
    }

    private void R() {
        if (!A()) {
            return;
        }
        RectF rectF = this.j5;
        this.O5.o(rectF, this.e.getWidth(), this.e.getGravity());
        n(rectF);
        rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.c5);
        ((com.google.android.material.textfield.c) this.U4).s0(rectF);
    }

    private void S() {
        if (A() && !this.N5) {
            x();
            R();
        }
    }

    private static void T(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z);
            }
        }
    }

    private void X() {
        TextView textView = this.t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            syb.y0(this.e, this.U4);
        }
    }

    private static void a0(@NonNull CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean T = syb.T(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        z2 = (T || z) ? true : true;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(T);
        checkableImageButton.setPressable(T);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        syb.F0(checkableImageButton, i);
    }

    private static void b0(@NonNull CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(@NonNull CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        if ((this.z5.getVisibility() == 0 || ((I() && K()) || this.A != null)) && this.c.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean f0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean g0() {
        EditText editText = this.e;
        if (editText != null && this.U4 != null && editText.getBackground() == null && this.a5 != 0) {
            return true;
        }
        return false;
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.p5.get(this.o5);
        if (eVar == null) {
            return this.p5.get(0);
        }
        return eVar;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.z5.getVisibility() == 0) {
            return this.z5;
        }
        if (I() && K()) {
            return this.q5;
        }
        return null;
    }

    private void h0() {
        if (this.t != null && this.s && !TextUtils.isEmpty(this.r)) {
            this.t.setText(this.r);
            hlb.a(this.a, this.w);
            this.t.setVisibility(0);
            this.t.bringToFront();
            announceForAccessibility(this.r);
        }
    }

    private void i() {
        TextView textView = this.t;
        if (textView != null) {
            this.a.addView(textView);
            this.t.setVisibility(0);
        }
    }

    private void i0(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable mutate = f83.r(getEndIconDrawable()).mutate();
            f83.n(mutate, this.k.p());
            this.q5.setImageDrawable(mutate);
            return;
        }
        com.google.android.material.textfield.f.a(this, this.q5, this.s5, this.t5);
    }

    private void j() {
        if (this.e != null && this.a5 == 1) {
            if (ea6.j(getContext())) {
                EditText editText = this.e;
                syb.J0(editText, syb.J(editText), getResources().getDimensionPixelSize(ww8.material_filled_edittext_font_2_0_padding_top), syb.I(this.e), getResources().getDimensionPixelSize(ww8.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ea6.i(getContext())) {
                EditText editText2 = this.e;
                syb.J0(editText2, syb.J(editText2), getResources().getDimensionPixelSize(ww8.material_filled_edittext_font_1_3_padding_top), syb.I(this.e), getResources().getDimensionPixelSize(ww8.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    private void j0() {
        if (this.a5 == 1) {
            if (ea6.j(getContext())) {
                this.b5 = getResources().getDimensionPixelSize(ww8.material_font_2_0_box_collapsed_padding_top);
            } else if (ea6.i(getContext())) {
                this.b5 = getResources().getDimensionPixelSize(ww8.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void k0(@NonNull Rect rect) {
        fa6 fa6Var = this.V4;
        if (fa6Var != null) {
            int i = rect.bottom;
            fa6Var.setBounds(rect.left, i - this.d5, rect.right, i);
        }
        fa6 fa6Var2 = this.W4;
        if (fa6Var2 != null) {
            int i2 = rect.bottom;
            fa6Var2.setBounds(rect.left, i2 - this.e5, rect.right, i2);
        }
    }

    private void l() {
        fa6 fa6Var = this.U4;
        if (fa6Var == null) {
            return;
        }
        uga E = fa6Var.E();
        uga ugaVar = this.X4;
        if (E != ugaVar) {
            this.U4.setShapeAppearanceModel(ugaVar);
            p0();
        }
        if (v()) {
            this.U4.i0(this.c5, this.f5);
        }
        int p = p();
        this.g5 = p;
        this.U4.b0(ColorStateList.valueOf(p));
        if (this.o5 == 3) {
            this.e.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void l0() {
        int length;
        if (this.o != null) {
            EditText editText = this.e;
            if (editText == null) {
                length = 0;
            } else {
                length = editText.getText().length();
            }
            m0(length);
        }
    }

    private void m() {
        ColorStateList valueOf;
        if (this.V4 != null && this.W4 != null) {
            if (w()) {
                fa6 fa6Var = this.V4;
                if (this.e.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.E5);
                } else {
                    valueOf = ColorStateList.valueOf(this.f5);
                }
                fa6Var.b0(valueOf);
                this.W4.b0(ColorStateList.valueOf(this.f5));
            }
            invalidate();
        }
    }

    private void n(@NonNull RectF rectF) {
        float f2 = rectF.left;
        int i = this.Z4;
        rectF.left = f2 - i;
        rectF.right += i;
    }

    private static void n0(@NonNull Context context, @NonNull TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = w09.character_counter_overflowed_content_description;
        } else {
            i3 = w09.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void o() {
        int i = this.a5;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.I && !(this.U4 instanceof com.google.android.material.textfield.c)) {
                        this.U4 = new com.google.android.material.textfield.c(this.X4);
                    } else {
                        this.U4 = new fa6(this.X4);
                    }
                    this.V4 = null;
                    this.W4 = null;
                    return;
                }
                throw new IllegalArgumentException(this.a5 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.U4 = new fa6(this.X4);
            this.V4 = new fa6();
            this.W4 = new fa6();
            return;
        }
        this.U4 = null;
        this.V4 = null;
        this.W4 = null;
    }

    private void o0() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            if (this.n) {
                i = this.p;
            } else {
                i = this.q;
            }
            d0(textView, i);
            if (!this.n && (colorStateList2 = this.y) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (this.n && (colorStateList = this.z) != null) {
                this.o.setTextColor(colorStateList);
            }
        }
    }

    private int p() {
        int i = this.g5;
        if (this.a5 == 1) {
            return ba6.g(ba6.e(this, qv8.colorSurface, 0), this.g5);
        }
        return i;
    }

    private void p0() {
        if (this.o5 == 3 && this.a5 == 2) {
            ((com.google.android.material.textfield.d) this.p5.get(3)).J((AutoCompleteTextView) this.e);
        }
    }

    @NonNull
    private Rect q(@NonNull Rect rect) {
        if (this.e != null) {
            Rect rect2 = this.i5;
            boolean i = z0c.i(this);
            rect2.bottom = rect.bottom;
            int i2 = this.a5;
            if (i2 != 1) {
                if (i2 != 2) {
                    rect2.left = G(rect.left, i);
                    rect2.top = getPaddingTop();
                    rect2.right = H(rect.right, i);
                    return rect2;
                }
                rect2.left = rect.left + this.e.getPaddingLeft();
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.e.getPaddingRight();
                return rect2;
            }
            rect2.left = G(rect.left, i);
            rect2.top = rect.top + this.b5;
            rect2.right = H(rect.right, i);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int r(@NonNull Rect rect, @NonNull Rect rect2, float f2) {
        if (P()) {
            return (int) (rect2.top + f2);
        }
        return rect.bottom - this.e.getCompoundPaddingBottom();
    }

    private int s(@NonNull Rect rect, float f2) {
        if (P()) {
            return (int) (rect.centerY() - (f2 / 2.0f));
        }
        return rect.top + this.e.getCompoundPaddingTop();
    }

    private boolean s0() {
        int max;
        if (this.e == null || this.e.getMeasuredHeight() >= (max = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.e.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.e == null) {
            if (this.o5 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.e = editText;
            int i = this.g;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.i);
            }
            int i2 = this.h;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.j);
            }
            Q();
            setTextInputAccessibilityDelegate(new e(this));
            this.O5.H0(this.e.getTypeface());
            this.O5.r0(this.e.getTextSize());
            this.O5.m0(this.e.getLetterSpacing());
            int gravity = this.e.getGravity();
            this.O5.g0((gravity & (-113)) | 48);
            this.O5.q0(gravity);
            this.e.addTextChangedListener(new a());
            if (this.C5 == null) {
                this.C5 = this.e.getHintTextColors();
            }
            if (this.I) {
                if (TextUtils.isEmpty(this.S4)) {
                    CharSequence hint = this.e.getHint();
                    this.f = hint;
                    setHint(hint);
                    this.e.setHint((CharSequence) null);
                }
                this.T4 = true;
            }
            if (this.o != null) {
                m0(this.e.getText().length());
            }
            r0();
            this.k.f();
            this.b.bringToFront();
            this.c.bringToFront();
            this.d.bringToFront();
            this.z5.bringToFront();
            B();
            C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.S4)) {
            this.S4 = charSequence;
            this.O5.F0(charSequence);
            if (!this.N5) {
                R();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s == z) {
            return;
        }
        if (z) {
            i();
        } else {
            X();
            this.t = null;
        }
        this.s = z;
    }

    @NonNull
    private Rect t(@NonNull Rect rect) {
        if (this.e != null) {
            Rect rect2 = this.i5;
            float B = this.O5.B();
            rect2.left = rect.left + this.e.getCompoundPaddingLeft();
            rect2.top = s(rect, B);
            rect2.right = rect.right - this.e.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        int i;
        char c2;
        boolean z;
        FrameLayout frameLayout = this.d;
        int i2 = 8;
        if (this.q5.getVisibility() == 0 && !L()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.A != null && !N()) {
            c2 = 0;
        } else {
            c2 = '\b';
        }
        if (!K() && !L() && c2 != 0) {
            z = false;
        } else {
            z = true;
        }
        LinearLayout linearLayout = this.c;
        if (z) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
    }

    private int u() {
        float r;
        if (!this.I) {
            return 0;
        }
        int i = this.a5;
        if (i != 0) {
            if (i != 2) {
                return 0;
            }
            r = this.O5.r() / 2.0f;
        } else {
            r = this.O5.r();
        }
        return (int) r;
    }

    private void u0() {
        boolean z;
        int i = 0;
        if (getErrorIconDrawable() != null && this.k.z() && this.k.l()) {
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton checkableImageButton = this.z5;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        t0();
        C0();
        if (!I()) {
            q0();
        }
    }

    private boolean v() {
        if (this.a5 == 2 && w()) {
            return true;
        }
        return false;
    }

    private void v0() {
        if (this.a5 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            int u = u();
            if (u != layoutParams.topMargin) {
                layoutParams.topMargin = u;
                this.a.requestLayout();
            }
        }
    }

    private boolean w() {
        if (this.c5 > -1 && this.f5 != 0) {
            return true;
        }
        return false;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.c) this.U4).q0();
        }
    }

    private void x0(boolean z, boolean z2) {
        boolean z3;
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.e;
        boolean z4 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.e;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        }
        boolean l = this.k.l();
        ColorStateList colorStateList2 = this.C5;
        if (colorStateList2 != null) {
            this.O5.f0(colorStateList2);
            this.O5.p0(this.C5);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.C5;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.M5);
            } else {
                i = this.M5;
            }
            this.O5.f0(ColorStateList.valueOf(i));
            this.O5.p0(ColorStateList.valueOf(i));
        } else if (l) {
            this.O5.f0(this.k.q());
        } else if (this.n && (textView = this.o) != null) {
            this.O5.f0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.D5) != null) {
            this.O5.f0(colorStateList);
        }
        if (!z3 && this.P5 && (!isEnabled() || !z4)) {
            if (z2 || !this.N5) {
                F(z);
            }
        } else if (z2 || this.N5) {
            y(z);
        }
    }

    private void y(boolean z) {
        ValueAnimator valueAnimator = this.R5;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.R5.cancel();
        }
        if (z && this.Q5) {
            k(1.0f);
        } else {
            this.O5.u0(1.0f);
        }
        this.N5 = false;
        if (A()) {
            R();
        }
        z0();
        this.b.i(false);
        D0();
    }

    private void y0() {
        EditText editText;
        if (this.t != null && (editText = this.e) != null) {
            this.t.setGravity(editText.getGravity());
            this.t.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
    }

    private qo3 z() {
        qo3 qo3Var = new qo3();
        qo3Var.Z(87L);
        qo3Var.b0(sk.a);
        return qo3Var;
    }

    private void z0() {
        int length;
        EditText editText = this.e;
        if (editText == null) {
            length = 0;
        } else {
            length = editText.getText().length();
        }
        A0(length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0() {
        boolean z;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.U4 != null && this.a5 != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.e) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.e) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.f5 = this.M5;
            } else if (this.k.l()) {
                if (this.H5 != null) {
                    B0(z, z2);
                } else {
                    this.f5 = this.k.p();
                }
            } else if (this.n && (textView = this.o) != null) {
                if (this.H5 != null) {
                    B0(z, z2);
                } else {
                    this.f5 = textView.getCurrentTextColor();
                }
            } else if (z) {
                this.f5 = this.G5;
            } else if (z2) {
                this.f5 = this.F5;
            } else {
                this.f5 = this.E5;
            }
            u0();
            V();
            W();
            U();
            if (getEndIconDelegate().d()) {
                i0(this.k.l());
            }
            if (this.a5 == 2) {
                int i = this.c5;
                if (z && isEnabled()) {
                    this.c5 = this.e5;
                } else {
                    this.c5 = this.d5;
                }
                if (this.c5 != i) {
                    S();
                }
            }
            if (this.a5 == 1) {
                if (!isEnabled()) {
                    this.g5 = this.J5;
                } else if (z2 && !z) {
                    this.g5 = this.L5;
                } else if (z) {
                    this.g5 = this.K5;
                } else {
                    this.g5 = this.I5;
                }
            }
            l();
        }
    }

    public boolean K() {
        if (this.d.getVisibility() == 0 && this.q5.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean M() {
        return this.k.A();
    }

    final boolean N() {
        return this.N5;
    }

    public boolean O() {
        return this.T4;
    }

    public void U() {
        com.google.android.material.textfield.f.c(this, this.q5, this.s5);
    }

    public void V() {
        com.google.android.material.textfield.f.c(this, this.z5, this.A5);
    }

    public void W() {
        this.b.j();
    }

    public void Y(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        boolean i = z0c.i(this);
        this.Y4 = i;
        if (i) {
            f6 = f3;
        } else {
            f6 = f2;
        }
        if (!i) {
            f2 = f3;
        }
        if (i) {
            f7 = f5;
        } else {
            f7 = f4;
        }
        if (!i) {
            f4 = f5;
        }
        fa6 fa6Var = this.U4;
        if (fa6Var == null || fa6Var.J() != f6 || this.U4.K() != f2 || this.U4.s() != f7 || this.U4.t() != f4) {
            this.X4 = this.X4.v().D(f6).H(f2).v(f7).z(f4).m();
            l();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.a.addView(view, layoutParams2);
            this.a.setLayoutParams(layoutParams);
            v0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(@NonNull TextView textView, int i) {
        try {
            edb.o(textView, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            edb.o(textView, i19.b);
            textView.setTextColor(iu1.c(getContext(), gw8.design_error));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        AutofillId autofillId;
        ViewStructure newChild;
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f == null) {
            autofillId = getAutofillId();
            viewStructure.setAutofillId(autofillId);
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.a.getChildCount());
            for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
                View childAt = this.a.getChildAt(i2);
                newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.e) {
                    newChild.setHint(getHint());
                }
            }
            return;
        }
        boolean z = this.T4;
        this.T4 = false;
        CharSequence hint = editText.getHint();
        this.e.setHint(this.f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.e.setHint(hint);
            this.T4 = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.T5 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.T5 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z;
        if (this.S5) {
            return;
        }
        boolean z2 = true;
        this.S5 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        tb1 tb1Var = this.O5;
        if (tb1Var != null) {
            z = tb1Var.E0(drawableState);
        } else {
            z = false;
        }
        if (this.e != null) {
            w0((syb.Y(this) && isEnabled()) ? false : false);
        }
        r0();
        E0();
        if (z) {
            invalidate();
        }
        this.S5 = false;
    }

    public void g(@NonNull f fVar) {
        this.n5.add(fVar);
        if (this.e != null) {
            fVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + u();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public fa6 getBoxBackground() {
        int i = this.a5;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.U4;
    }

    public int getBoxBackgroundColor() {
        return this.g5;
    }

    public int getBoxBackgroundMode() {
        return this.a5;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.b5;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (z0c.i(this)) {
            return this.X4.j().a(this.j5);
        }
        return this.X4.l().a(this.j5);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (z0c.i(this)) {
            return this.X4.l().a(this.j5);
        }
        return this.X4.j().a(this.j5);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (z0c.i(this)) {
            return this.X4.r().a(this.j5);
        }
        return this.X4.t().a(this.j5);
    }

    public float getBoxCornerRadiusTopStart() {
        if (z0c.i(this)) {
            return this.X4.t().a(this.j5);
        }
        return this.X4.r().a(this.j5);
    }

    public int getBoxStrokeColor() {
        return this.G5;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H5;
    }

    public int getBoxStrokeWidth() {
        return this.d5;
    }

    public int getBoxStrokeWidthFocused() {
        return this.e5;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.l && this.n && (textView = this.o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.y;
    }

    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C5;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.q5.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.q5.getDrawable();
    }

    public int getEndIconMode() {
        return this.o5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.q5;
    }

    public CharSequence getError() {
        if (this.k.z()) {
            return this.k.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.k.n();
    }

    public int getErrorCurrentTextColors() {
        return this.k.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.z5.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.k.p();
    }

    public CharSequence getHelperText() {
        if (this.k.A()) {
            return this.k.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.k.t();
    }

    public CharSequence getHint() {
        if (this.I) {
            return this.S4;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.O5.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.O5.v();
    }

    public ColorStateList getHintTextColor() {
        return this.D5;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.q5.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.q5.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.b.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d();
    }

    public Drawable getStartIconDrawable() {
        return this.b.e();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.k5;
    }

    public void h(@NonNull g gVar) {
        this.r5.add(gVar);
    }

    void k(float f2) {
        if (this.O5.D() == f2) {
            return;
        }
        if (this.R5 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.R5 = valueAnimator;
            valueAnimator.setInterpolator(sk.b);
            this.R5.setDuration(167L);
            this.R5.addUpdateListener(new d());
        }
        this.R5.setFloatValues(this.O5.D(), f2);
        this.R5.start();
    }

    void m0(int i) {
        boolean z;
        boolean z2 = this.n;
        int i2 = this.m;
        if (i2 == -1) {
            this.o.setText(String.valueOf(i));
            this.o.setContentDescription(null);
            this.n = false;
        } else {
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            this.n = z;
            n0(getContext(), this.o, i, this.m, this.n);
            if (z2 != this.n) {
                o0();
            }
            this.o.setText(bb0.c().j(getContext().getString(w09.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.m))));
        }
        if (this.e != null && z2 != this.n) {
            w0(false);
            E0();
            r0();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.O5.V(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.h5;
            v03.a(this, editText, rect);
            k0(rect);
            if (this.I) {
                this.O5.r0(this.e.getTextSize());
                int gravity = this.e.getGravity();
                this.O5.g0((gravity & (-113)) | 48);
                this.O5.q0(gravity);
                this.O5.c0(q(rect));
                this.O5.l0(t(rect));
                this.O5.Y();
                if (A() && !this.N5) {
                    R();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean s0 = s0();
        boolean q0 = q0();
        if (s0 || q0) {
            this.e.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.c);
        if (savedState.d) {
            this.q5.post(new b());
        }
        setHint(savedState.e);
        setHelperText(savedState.f);
        setPlaceholderText(savedState.g);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        boolean z;
        float f2;
        float f3;
        super.onRtlPropertiesChanged(i);
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.Y4;
        if (z != z3) {
            if (z && !z3) {
                z2 = true;
            }
            float a2 = this.X4.r().a(this.j5);
            float a3 = this.X4.t().a(this.j5);
            float a4 = this.X4.j().a(this.j5);
            float a5 = this.X4.l().a(this.j5);
            if (z2) {
                f2 = a2;
            } else {
                f2 = a3;
            }
            if (z2) {
                a2 = a3;
            }
            if (z2) {
                f3 = a4;
            } else {
                f3 = a5;
            }
            if (z2) {
                a4 = a5;
            }
            Y(f2, a2, f3, a4);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.k.l()) {
            savedState.c = getError();
        }
        if (I() && this.q5.isChecked()) {
            z = true;
        } else {
            z = false;
        }
        savedState.d = z;
        savedState.e = getHint();
        savedState.f = getHelperText();
        savedState.g = getPlaceholderText();
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q0() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        boolean z2 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.e.getPaddingLeft();
            if (this.l5 == null || this.m5 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.l5 = colorDrawable;
                this.m5 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a2 = edb.a(this.e);
            Drawable drawable = a2[0];
            Drawable drawable2 = this.l5;
            if (drawable != drawable2) {
                edb.j(this.e, drawable2, a2[1], a2[2], a2[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.l5 != null) {
                Drawable[] a3 = edb.a(this.e);
                edb.j(this.e, null, a3[1], a3[2], a3[3]);
                this.l5 = null;
                z = true;
            }
            z = false;
        }
        if (e0()) {
            int measuredWidth2 = this.B.getMeasuredWidth() - this.e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + j86.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a4 = edb.a(this.e);
            Drawable drawable3 = this.u5;
            if (drawable3 != null && this.v5 != measuredWidth2) {
                this.v5 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                edb.j(this.e, a4[0], a4[1], this.u5, a4[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.u5 = colorDrawable2;
                    this.v5 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a4[2];
                Drawable drawable5 = this.u5;
                if (drawable4 != drawable5) {
                    this.w5 = drawable4;
                    edb.j(this.e, a4[0], a4[1], drawable5, a4[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.u5 != null) {
            Drawable[] a5 = edb.a(this.e);
            if (a5[2] == this.u5) {
                edb.j(this.e, a5[0], a5[1], this.w5, a5[3]);
            } else {
                z2 = z;
            }
            this.u5 = null;
        } else {
            return z;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.e;
        if (editText == null || this.a5 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (u.a(background)) {
            background = background.mutate();
        }
        if (this.k.l()) {
            background.setColorFilter(androidx.appcompat.widget.i.e(this.k.p(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (textView = this.o) != null) {
            background.setColorFilter(androidx.appcompat.widget.i.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            f83.c(background);
            this.e.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.g5 != i) {
            this.g5 = i;
            this.I5 = i;
            this.K5 = i;
            this.L5 = i;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(iu1.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I5 = defaultColor;
        this.g5 = defaultColor;
        this.J5 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K5 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.L5 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.a5) {
            return;
        }
        this.a5 = i;
        if (this.e != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.b5 = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.G5 != i) {
            this.G5 = i;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.E5 = colorStateList.getDefaultColor();
            this.M5 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.F5 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.G5 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.G5 != colorStateList.getDefaultColor()) {
            this.G5 = colorStateList.getDefaultColor();
        }
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.H5 != colorStateList) {
            this.H5 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.d5 = i;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.e5 = i;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.o = appCompatTextView;
                appCompatTextView.setId(ky8.textinput_counter);
                Typeface typeface = this.k5;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.k.e(this.o, 2);
                j86.d((ViewGroup.MarginLayoutParams) this.o.getLayoutParams(), getResources().getDimensionPixelOffset(ww8.mtrl_textinput_counter_margin_start));
                o0();
                l0();
            } else {
                this.k.B(this.o, 2);
                this.o = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i > 0) {
                this.m = i;
            } else {
                this.m = -1;
            }
            if (this.l) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C5 = colorStateList;
        this.D5 = colorStateList;
        if (this.e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        T(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.q5.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.q5.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? on.b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.o5;
        if (i2 == i) {
            return;
        }
        this.o5 = i;
        C(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        setEndIconVisible(z);
        if (getEndIconDelegate().b(this.a5)) {
            getEndIconDelegate().a();
            com.google.android.material.textfield.f.a(this, this.q5, this.s5, this.t5);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.a5 + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.q5, onClickListener, this.x5);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.x5 = onLongClickListener;
        c0(this.q5, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.s5 != colorStateList) {
            this.s5 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.q5, colorStateList, this.t5);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.t5 != mode) {
            this.t5 = mode;
            com.google.android.material.textfield.f.a(this, this.q5, this.s5, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (K() != z) {
            CheckableImageButton checkableImageButton = this.q5;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.k.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.k.O(charSequence);
        } else {
            this.k.v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.k.D(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.k.E(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? on.b(getContext(), i) : null);
        V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.z5, onClickListener, this.y5);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.y5 = onLongClickListener;
        c0(this.z5, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.A5 != colorStateList) {
            this.A5 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.z5, colorStateList, this.B5);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.B5 != mode) {
            this.B5 = mode;
            com.google.android.material.textfield.f.a(this, this.z5, this.A5, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.k.F(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.k.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.P5 != z) {
            this.P5 = z;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!M()) {
            setHelperTextEnabled(true);
        }
        this.k.P(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.k.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.k.I(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.k.H(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.Q5 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.I) {
            this.I = z;
            if (!z) {
                this.T4 = false;
                if (!TextUtils.isEmpty(this.S4) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.S4);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.S4)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.T4 = true;
            }
            if (this.e != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.O5.d0(i);
        this.D5 = this.O5.p();
        if (this.e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D5 != colorStateList) {
            if (this.C5 == null) {
                this.O5.f0(colorStateList);
            }
            this.D5 = colorStateList;
            if (this.e != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? on.b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.o5 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.s5 = colorStateList;
        com.google.android.material.textfield.f.a(this, this.q5, colorStateList, this.t5);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.t5 = mode;
        com.google.android.material.textfield.f.a(this, this.q5, this.s5, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.t = appCompatTextView;
            appCompatTextView.setId(ky8.textinput_placeholder);
            syb.F0(this.t, 2);
            qo3 z = z();
            this.w = z;
            z.e0(67L);
            this.x = z();
            setPlaceholderTextAppearance(this.v);
            setPlaceholderTextColor(this.u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v = i;
        TextView textView = this.t;
        if (textView != null) {
            edb.o(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b.k(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.b.l(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.b.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.b.n(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? on.b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.b.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.b.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.b.t(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.b.u(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.A = charSequence2;
        this.B.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i) {
        edb.o(this.B, i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            syb.u0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.k5) {
            this.k5 = typeface;
            this.O5.H0(typeface);
            this.k.L(typeface);
            TextView textView = this.o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0(boolean z) {
        x0(z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v83 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r29, android.util.AttributeSet r30, int r31) {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.q5.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.q5.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.f.a(this, this.q5, this.s5, this.t5);
            U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.z5.setImageDrawable(drawable);
        u0();
        com.google.android.material.textfield.f.a(this, this.z5, this.A5, this.B5);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.q5.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.q5.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w0(!textInputLayout.T5);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.l) {
                textInputLayout2.m0(editable.length());
            }
            if (TextInputLayout.this.s) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
