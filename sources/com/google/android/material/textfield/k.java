package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e0;
import com.google.android.material.internal.CheckableImageButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class k extends LinearLayout {
    private final TextInputLayout a;
    private final TextView b;
    private CharSequence c;
    private final CheckableImageButton d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private View.OnLongClickListener g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(TextInputLayout textInputLayout, e0 e0Var) {
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(kz8.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.b = appCompatTextView;
        g(e0Var);
        f(e0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void f(e0 e0Var) {
        this.b.setVisibility(8);
        this.b.setId(ky8.textinput_prefix_text);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        syb.w0(this.b, 1);
        l(e0Var.n(b29.H9, 0));
        int i = b29.I9;
        if (e0Var.s(i)) {
            m(e0Var.c(i));
        }
        k(e0Var.p(b29.G9));
    }

    private void g(e0 e0Var) {
        if (ea6.i(getContext())) {
            j86.c((ViewGroup.MarginLayoutParams) this.d.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        int i = b29.M9;
        if (e0Var.s(i)) {
            this.e = ea6.b(getContext(), e0Var, i);
        }
        int i2 = b29.N9;
        if (e0Var.s(i2)) {
            this.f = z0c.j(e0Var.k(i2, -1), null);
        }
        int i3 = b29.L9;
        if (e0Var.s(i3)) {
            p(e0Var.g(i3));
            int i4 = b29.K9;
            if (e0Var.s(i4)) {
                o(e0Var.p(i4));
            }
            n(e0Var.a(b29.J9, true));
        }
    }

    private void x() {
        int i;
        int i2 = 8;
        if (this.c != null && !this.h) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 0);
        this.b.setVisibility(i);
        this.a.q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.b.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public TextView c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d() {
        return this.d.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable e() {
        return this.d.getDrawable();
    }

    boolean h() {
        if (this.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z) {
        this.h = z;
        x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        f.c(this.a, this.d, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.c = charSequence2;
        this.b.setText(charSequence);
        x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i) {
        edb.o(this.b, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@NonNull ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z) {
        this.d.setCheckable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            f.a(this.a, this.d, this.e, this.f);
            u(true);
            j();
            return;
        }
        u(false);
        q(null);
        r(null);
        o(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(View.OnClickListener onClickListener) {
        f.e(this.d, onClickListener, this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(View.OnLongClickListener onLongClickListener) {
        this.g = onLongClickListener;
        f.f(this.d, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            f.a(this.a, this.d, colorStateList, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            f.a(this.a, this.d, this.e, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(boolean z) {
        int i;
        if (h() != z) {
            CheckableImageButton checkableImageButton = this.d;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            w();
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(@NonNull d4 d4Var) {
        if (this.b.getVisibility() == 0) {
            d4Var.C0(this.b);
            d4Var.W0(this.b);
            return;
        }
        d4Var.W0(this.d);
    }

    void w() {
        int J;
        EditText editText = this.a.e;
        if (editText == null) {
            return;
        }
        if (h()) {
            J = 0;
        } else {
            J = syb.J(editText);
        }
        syb.J0(this.b, J, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(ww8.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
