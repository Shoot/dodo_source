package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import com.huawei.hms.adapter.internal.CommonCode;
import defpackage.d4;
/* compiled from: NavigationBarItemView.java */
/* loaded from: classes2.dex */
public abstract class a extends FrameLayout implements k.a {
    private static final int[] I = {16842912};
    private static final d S4 = new d(null);
    private static final d T4 = new e(null);
    private int A;
    private com.google.android.material.badge.a B;
    private boolean a;
    private int b;
    private int c;
    private float d;
    private float e;
    private float f;
    private int g;
    private boolean h;
    private final FrameLayout i;
    private final View j;
    private final ImageView k;
    private final ViewGroup l;
    private final TextView m;
    private final TextView n;
    private int o;
    private g p;
    private ColorStateList q;
    private Drawable r;
    private Drawable s;
    private ValueAnimator t;
    private d u;
    private float v;
    private boolean w;
    private int x;
    private int y;
    private boolean z;

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class View$OnLayoutChangeListenerC0231a implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC0231a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (a.this.k.getVisibility() == 0) {
                a aVar = a.this;
                aVar.u(aVar.k);
            }
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.v(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes2.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ float a;

        c(float f) {
            this.a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes2.dex */
    public static class d {
        private d() {
        }

        /* synthetic */ d(View$OnLayoutChangeListenerC0231a view$OnLayoutChangeListenerC0231a) {
            this();
        }

        protected float a(float f, float f2) {
            float f3;
            float f4;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                f3 = 0.8f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            return sk.b(0.0f, 1.0f, f3, f4, f);
        }

        protected float b(float f, float f2) {
            return sk.a(0.4f, 1.0f, f);
        }

        protected float c(float f, float f2) {
            return 1.0f;
        }

        public void d(float f, float f2, @NonNull View view) {
            view.setScaleX(b(f, f2));
            view.setScaleY(c(f, f2));
            view.setAlpha(a(f, f2));
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes2.dex */
    private static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.a.d
        protected float c(float f, float f2) {
            return b(f, f2);
        }

        /* synthetic */ e(View$OnLayoutChangeListenerC0231a view$OnLayoutChangeListenerC0231a) {
            this();
        }
    }

    public a(@NonNull Context context) {
        super(context);
        this.a = false;
        this.o = -1;
        this.u = S4;
        this.v = 0.0f;
        this.w = false;
        this.x = 0;
        this.y = 0;
        this.z = false;
        this.A = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.i = (FrameLayout) findViewById(ky8.navigation_bar_item_icon_container);
        this.j = findViewById(ky8.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(ky8.navigation_bar_item_icon_view);
        this.k = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(ky8.navigation_bar_item_labels_group);
        this.l = viewGroup;
        TextView textView = (TextView) findViewById(ky8.navigation_bar_item_small_label_view);
        this.m = textView;
        TextView textView2 = (TextView) findViewById(ky8.navigation_bar_item_large_label_view);
        this.n = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.c = viewGroup.getPaddingBottom();
        syb.F0(textView, 2);
        syb.F0(textView2, 2);
        setFocusable(true);
        g(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0231a());
        }
    }

    private void g(float f, float f2) {
        this.d = f - f2;
        this.e = (f2 * 1.0f) / f;
        this.f = (f * 1.0f) / f2;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.i;
        if (frameLayout == null) {
            return this.k;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        int i;
        com.google.android.material.badge.a aVar = this.B;
        if (aVar != null) {
            i = aVar.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.k.getMeasuredWidth() + i;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        com.google.android.material.badge.a aVar = this.B;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.B.k();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.k.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private FrameLayout i(View view) {
        ImageView imageView = this.k;
        if (view != imageView || !com.google.android.material.badge.b.a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private boolean j() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if (this.z && this.g == 2) {
            return true;
        }
        return false;
    }

    private void l(float f) {
        if (this.w && this.a && syb.X(this)) {
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f);
            this.t = ofFloat;
            ofFloat.addUpdateListener(new c(f));
            this.t.setInterpolator(dp6.e(getContext(), qv8.motionEasingStandard, sk.b));
            this.t.setDuration(dp6.d(getContext(), qv8.motionDurationLong1, getResources().getInteger(zy8.material_motion_duration_long_1)));
            this.t.start();
            return;
        }
        o(f, f);
    }

    private void m() {
        g gVar = this.p;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(float f, float f2) {
        View view = this.j;
        if (view != null) {
            this.u.d(f, f2, view);
        }
        this.v = f;
    }

    private static void p(TextView textView, int i) {
        edb.o(textView, i);
        int h = ea6.h(textView.getContext(), i, 0);
        if (h != 0) {
            textView.setTextSize(0, h);
        }
    }

    private static void q(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private static void r(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private void s(View view) {
        if (j() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.b.b(this.B, view, i(view));
        }
    }

    private void t(View view) {
        if (!j()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            com.google.android.material.badge.b.e(this.B, view);
        }
        this.B = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(View view) {
        if (!j()) {
            return;
        }
        com.google.android.material.badge.b.f(this.B, view, i(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i) {
        int i2;
        if (this.j == null) {
            return;
        }
        int min = Math.min(this.x, i - (this.A * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        if (k()) {
            i2 = min;
        } else {
            i2 = this.y;
        }
        layoutParams.height = i2;
        layoutParams.width = min;
        this.j.setLayoutParams(layoutParams);
    }

    private void w() {
        if (k()) {
            this.u = T4;
        } else {
            this.u = S4;
        }
    }

    private static void x(@NonNull View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(@NonNull g gVar, int i) {
        CharSequence title;
        int i2;
        this.p = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(gVar.getTooltipText())) {
            title = gVar.getTooltipText();
        } else {
            title = gVar.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            yib.a(this, title);
        }
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        this.a = true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean f() {
        return false;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.j;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.B;
    }

    protected int getItemBackgroundResId() {
        return dx8.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.p;
    }

    protected int getItemDefaultMarginResId() {
        return ww8.mtrl_navigation_bar_item_default_margin;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.o;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.l.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.l.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        n();
        this.p = null;
        this.v = 0.0f;
        this.a = false;
    }

    void n() {
        t(this.k);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.p;
        if (gVar != null && gVar.isCheckable() && this.p.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.B;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.p.getTitle();
            if (!TextUtils.isEmpty(this.p.getContentDescription())) {
                title = this.p.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.B.i()));
        }
        d4 d1 = d4.d1(accessibilityNodeInfo);
        d1.q0(d4.c.f(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            d1.o0(false);
            d1.e0(d4.a.i);
        }
        d1.N0(getResources().getString(w09.item_view_role_description));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.j;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.w = z;
        View view = this.j;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.y = i;
        v(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.A = i;
        v(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.z = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.x = i;
        v(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(@NonNull com.google.android.material.badge.a aVar) {
        if (this.B == aVar) {
            return;
        }
        if (j() && this.k != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            t(this.k);
        }
        this.B = aVar;
        ImageView imageView = this.k;
        if (imageView != null) {
            s(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        float f;
        TextView textView = this.n;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.n;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.m;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.m;
        textView4.setPivotY(textView4.getBaseline());
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        l(f);
        int i = this.g;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        r(getIconOrContainer(), this.b, 17);
                        this.n.setVisibility(8);
                        this.m.setVisibility(8);
                    }
                } else {
                    x(this.l, this.c);
                    if (z) {
                        r(getIconOrContainer(), (int) (this.b + this.d), 49);
                        q(this.n, 1.0f, 1.0f, 0);
                        TextView textView5 = this.m;
                        float f2 = this.e;
                        q(textView5, f2, f2, 4);
                    } else {
                        r(getIconOrContainer(), this.b, 49);
                        TextView textView6 = this.n;
                        float f3 = this.f;
                        q(textView6, f3, f3, 4);
                        q(this.m, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z) {
                    r(getIconOrContainer(), this.b, 49);
                    x(this.l, this.c);
                    this.n.setVisibility(0);
                } else {
                    r(getIconOrContainer(), this.b, 17);
                    x(this.l, 0);
                    this.n.setVisibility(4);
                }
                this.m.setVisibility(4);
            }
        } else if (this.h) {
            if (z) {
                r(getIconOrContainer(), this.b, 49);
                x(this.l, this.c);
                this.n.setVisibility(0);
            } else {
                r(getIconOrContainer(), this.b, 17);
                x(this.l, 0);
                this.n.setVisibility(4);
            }
            this.m.setVisibility(4);
        } else {
            x(this.l, this.c);
            if (z) {
                r(getIconOrContainer(), (int) (this.b + this.d), 49);
                q(this.n, 1.0f, 1.0f, 0);
                TextView textView7 = this.m;
                float f4 = this.e;
                q(textView7, f4, f4, 4);
            } else {
                r(getIconOrContainer(), this.b, 49);
                TextView textView8 = this.n;
                float f5 = this.f;
                q(textView8, f5, f5, 4);
                q(this.m, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.m.setEnabled(z);
        this.n.setEnabled(z);
        this.k.setEnabled(z);
        if (z) {
            syb.K0(this, qd8.b(getContext(), CommonCode.BusInterceptor.PRIVACY_CANCEL));
        } else {
            syb.K0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.r) {
            return;
        }
        this.r = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = f83.r(drawable).mutate();
            this.s = drawable;
            ColorStateList colorStateList = this.q;
            if (colorStateList != null) {
                f83.o(drawable, colorStateList);
            }
        }
        this.k.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.k.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.q = colorStateList;
        if (this.p != null && (drawable = this.s) != null) {
            f83.o(drawable, colorStateList);
            this.s.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : iu1.e(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.c != i) {
            this.c = i;
            m();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.b != i) {
            this.b = i;
            m();
        }
    }

    public void setItemPosition(int i) {
        this.o = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.g != i) {
            this.g = i;
            w();
            v(getWidth());
            m();
        }
    }

    public void setShifting(boolean z) {
        if (this.h != z) {
            this.h = z;
            m();
        }
    }

    public void setTextAppearanceActive(int i) {
        p(this.n, i);
        g(this.m.getTextSize(), this.n.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        p(this.m, i);
        g(this.m.getTextSize(), this.n.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m.setTextColor(colorStateList);
            this.n.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.m.setText(charSequence);
        this.n.setText(charSequence);
        g gVar = this.p;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.p;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.p.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            yib.a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        syb.y0(this, drawable);
    }
}
