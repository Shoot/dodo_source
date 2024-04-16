package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes2.dex */
public class d extends com.google.android.material.textfield.e {
    private static final boolean r = true;
    private final TextWatcher e;
    private final View.OnFocusChangeListener f;
    private final TextInputLayout.e g;
    private final TextInputLayout.f h;
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.g i;
    private boolean j;
    private boolean k;
    private long l;
    private StateListDrawable m;
    private fa6 n;
    private AccessibilityManager o;
    private ValueAnimator p;
    private ValueAnimator q;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class a extends kdb {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0236a implements Runnable {
            final /* synthetic */ AutoCompleteTextView a;

            RunnableC0236a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.a.isPopupShowing();
                d.this.E(isPopupShowing);
                d.this.j = isPopupShowing;
            }
        }

        a() {
        }

        @Override // defpackage.kdb, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y = d.y(d.this.a.getEditText());
            if (d.this.o.isTouchExplorationEnabled() && d.D(y) && !d.this.c.hasFocus()) {
                y.dismissDropDown();
            }
            y.post(new RunnableC0236a(y));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.c.setChecked(dVar.k);
            d.this.q.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            d.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class View$OnFocusChangeListenerC0237d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0237d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.a.setEndIconActivated(z);
            if (!z) {
                d.this.E(false);
                d.this.j = false;
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class e extends TextInputLayout.e {
        e(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            if (!d.D(d.this.a.getEditText())) {
                d4Var.n0(Spinner.class.getName());
            }
            if (d4Var.X()) {
                d4Var.A0(null);
            }
        }

        @Override // defpackage.s2
        public void h(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView y = d.y(d.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.o.isEnabled() && !d.D(d.this.a.getEditText())) {
                d.this.H(y);
                d.this.I();
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class f implements TextInputLayout.f {
        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(@NonNull TextInputLayout textInputLayout) {
            AutoCompleteTextView y = d.y(textInputLayout.getEditText());
            d.this.F(y);
            d.this.v(y);
            d.this.G(y);
            y.setThreshold(0);
            y.removeTextChangedListener(d.this.e);
            y.addTextChangedListener(d.this.e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(y) && d.this.o.isTouchExplorationEnabled()) {
                syb.F0(d.this.c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class g implements TextInputLayout.g {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            final /* synthetic */ AutoCompleteTextView a;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeTextChangedListener(d.this.e);
            }
        }

        g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(@NonNull TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (d.r) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class i implements AccessibilityManager.TouchExplorationStateChangeListener {
        i() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            int i;
            if (d.this.a.getEditText() != null && !d.D(d.this.a.getEditText())) {
                CheckableImageButton checkableImageButton = d.this.c;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                syb.F0(checkableImageButton, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class j implements View.OnTouchListener {
        final /* synthetic */ AutoCompleteTextView a;

        j(AutoCompleteTextView autoCompleteTextView) {
            this.a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.j = false;
                }
                d.this.H(this.a);
                d.this.I();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class k implements AutoCompleteTextView.OnDismissListener {
        k() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.I();
            d.this.E(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(@NonNull TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.e = new a();
        this.f = new View$OnFocusChangeListenerC0237d();
        this.g = new e(this.a);
        this.h = new f();
        this.i = new g();
        this.j = false;
        this.k = false;
        this.l = Long.MAX_VALUE;
    }

    private fa6 A(float f2, float f3, float f4, int i2) {
        uga m = uga.a().D(f2).H(f2).v(f3).z(f3).m();
        fa6 m2 = fa6.m(this.b, f4);
        m2.setShapeAppearanceModel(m);
        m2.d0(0, i2, 0, i2);
        return m2;
    }

    private void B() {
        this.q = z(67, 0.0f, 1.0f);
        ValueAnimator z = z(50, 1.0f, 0.0f);
        this.p = z;
        z.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(@NonNull EditText editText) {
        if (editText.getKeyListener() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.q.cancel();
            this.p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (r) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void G(@NonNull AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new j(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f);
        if (r) {
            autoCompleteTextView.setOnDismissListener(new k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.j = false;
        }
        if (!this.j) {
            if (r) {
                E(!this.k);
            } else {
                this.k = !this.k;
                this.c.toggle();
            }
            if (this.k) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        this.j = true;
        this.l = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        fa6 boxBackground = this.a.getBoxBackground();
        int d = ba6.d(autoCompleteTextView, qv8.l);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, d, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, d, iArr, boxBackground);
        }
    }

    private void w(@NonNull AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @NonNull fa6 fa6Var) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {ba6.h(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (r) {
            syb.y0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), fa6Var, fa6Var));
            return;
        }
        fa6 fa6Var2 = new fa6(fa6Var.E());
        fa6Var2.b0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fa6Var, fa6Var2});
        int J = syb.J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int I = syb.I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        syb.y0(autoCompleteTextView, layerDrawable);
        syb.J0(autoCompleteTextView, J, paddingTop, I, paddingBottom);
    }

    private void x(@NonNull AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @NonNull fa6 fa6Var) {
        LayerDrawable layerDrawable;
        int d = ba6.d(autoCompleteTextView, qv8.colorSurface);
        fa6 fa6Var2 = new fa6(fa6Var.E());
        int h2 = ba6.h(i2, d, 0.1f);
        fa6Var2.b0(new ColorStateList(iArr, new int[]{h2, 0}));
        if (r) {
            fa6Var2.setTint(d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h2, d});
            fa6 fa6Var3 = new fa6(fa6Var.E());
            fa6Var3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fa6Var2, fa6Var3), fa6Var});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{fa6Var2, fa6Var});
        }
        syb.y0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(sk.a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (!D(autoCompleteTextView) && this.a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            v(autoCompleteTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(ww8.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.b.getResources().getDimensionPixelOffset(ww8.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(ww8.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        fa6 A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        fa6 A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.m.addState(new int[0], A2);
        int i2 = this.d;
        if (i2 == 0) {
            if (r) {
                i2 = dx8.mtrl_dropdown_arrow;
            } else {
                i2 = dx8.mtrl_ic_arrow_drop_down;
            }
        }
        this.a.setEndIconDrawable(i2);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(w09.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new h());
        this.a.g(this.h);
        this.a.h(this.i);
        B();
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getSystemService("accessibility");
        this.o = accessibilityManager;
        accessibilityManager.addTouchExplorationStateChangeListener(new i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean b(int i2) {
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean d() {
        return true;
    }
}
