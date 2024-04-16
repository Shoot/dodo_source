package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* loaded from: classes2.dex */
public final class g {
    private final Context a;
    @NonNull
    private final TextInputLayout b;
    private LinearLayout c;
    private int d;
    private FrameLayout e;
    private Animator f;
    private final float g;
    private int h;
    private int i;
    private CharSequence j;
    private boolean k;
    private TextView l;
    private CharSequence m;
    private int n;
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private int s;
    private ColorStateList t;
    private Typeface u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;
        final /* synthetic */ TextView b;
        final /* synthetic */ int c;
        final /* synthetic */ TextView d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.h = this.a;
            g.this.f = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && g.this.l != null) {
                    g.this.l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes2.dex */
    public class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = g.this.b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public g(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.g = context.getResources().getDimensionPixelSize(ww8.design_textinput_caption_translate_y);
    }

    private void C(int i, int i2) {
        TextView m;
        TextView m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m2 = m(i2)) != null) {
            m2.setVisibility(0);
            m2.setAlpha(1.0f);
        }
        if (i != 0 && (m = m(i)) != null) {
            m.setVisibility(4);
            if (i == 1) {
                m.setText((CharSequence) null);
            }
        }
        this.h = i2;
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, @NonNull CharSequence charSequence) {
        if (syb.Y(this.b) && this.b.isEnabled() && (this.i != this.h || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    private void Q(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.q, this.r, 2, i, i2);
            i(arrayList, this.k, this.l, 1, i, i2);
            yk.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m(i), i, m(i2)));
            animatorSet.start();
        } else {
            C(i, i2);
        }
        this.b.r0();
        this.b.w0(z);
        this.b.E0();
    }

    private boolean g() {
        if (this.c != null && this.b.getEditText() != null) {
            return true;
        }
        return false;
    }

    private void i(@NonNull List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(j(textView, z2));
                if (i3 == i) {
                    list.add(k(textView));
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(sk.a);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(sk.d);
        return ofFloat;
    }

    private TextView m(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.r;
        }
        return this.l;
    }

    private int u(boolean z, int i, int i2) {
        if (z) {
            return this.a.getResources().getDimensionPixelSize(i);
        }
        return i2;
    }

    private boolean x(int i) {
        if (i == 1 && this.l != null && !TextUtils.isEmpty(this.j)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.c == null) {
            return;
        }
        if (y(i) && (frameLayout = this.e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.c.removeView(textView);
        }
        int i2 = this.d - 1;
        this.d = i2;
        M(this.c, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(CharSequence charSequence) {
        this.m = charSequence;
        TextView textView = this.l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(boolean z) {
        if (this.k == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.a);
            this.l = appCompatTextView;
            appCompatTextView.setId(ky8.textinput_error);
            this.l.setTextAlignment(5);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.l.setTypeface(typeface);
            }
            F(this.n);
            G(this.o);
            D(this.m);
            this.l.setVisibility(4);
            syb.w0(this.l, 1);
            e(this.l, 0);
        } else {
            v();
            B(this.l, 0);
            this.l = null;
            this.b.r0();
            this.b.E0();
        }
        this.k = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(int i) {
        this.n = i;
        TextView textView = this.l;
        if (textView != null) {
            this.b.d0(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i) {
        this.s = i;
        TextView textView = this.r;
        if (textView != null) {
            edb.o(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z) {
        if (this.q == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.a);
            this.r = appCompatTextView;
            appCompatTextView.setId(ky8.textinput_helper_text);
            this.r.setTextAlignment(5);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            this.r.setVisibility(4);
            syb.w0(this.r, 1);
            H(this.s);
            J(this.t);
            e(this.r, 1);
            this.r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.r, 1);
            this.r = null;
            this.b.r0();
            this.b.E0();
        }
        this.q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            K(this.l, typeface);
            K(this.r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(CharSequence charSequence) {
        h();
        this.j = charSequence;
        this.l.setText(charSequence);
        int i = this.h;
        if (i != 1) {
            this.i = 1;
        }
        Q(i, this.i, N(this.l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(CharSequence charSequence) {
        h();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i = this.h;
        if (i != 2) {
            this.i = 2;
        }
        Q(i, this.i, N(this.r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(TextView textView, int i) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                f();
            }
        }
        if (y(i)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.b.getEditText();
            boolean i = ea6.i(this.a);
            LinearLayout linearLayout = this.c;
            int i2 = ww8.material_helper_text_font_1_3_padding_horizontal;
            syb.J0(linearLayout, u(i, i2, syb.J(editText)), u(i, ww8.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(ww8.material_helper_text_default_padding_top)), u(i, i2, syb.I(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return x(this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence n() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence o() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList q() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence r() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View s() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        this.j = null;
        h();
        if (this.h == 1) {
            if (this.q && !TextUtils.isEmpty(this.p)) {
                this.i = 2;
            } else {
                this.i = 0;
            }
        }
        Q(this.h, this.i, N(this.l, ""));
    }

    void w() {
        h();
        int i = this.h;
        if (i == 2) {
            this.i = 0;
        }
        Q(i, this.i, N(this.r, ""));
    }

    boolean y(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.k;
    }
}
