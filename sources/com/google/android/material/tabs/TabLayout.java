package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.adapter.internal.CommonCode;
import defpackage.d4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
@ViewPager.e
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int g5 = i19.Widget_Design_TabLayout;
    private static final jf8<g> h5 = new nf8(16);
    boolean A;
    boolean B;
    int I;
    int S4;
    boolean T4;
    private com.google.android.material.tabs.c U4;
    private c V4;
    private final ArrayList<c> W4;
    private c X4;
    private ValueAnimator Y4;
    ViewPager Z4;
    private final ArrayList<g> a;
    private androidx.viewpager.widget.a a5;
    private g b;
    private DataSetObserver b5;
    @NonNull
    final f c;
    private h c5;
    int d;
    private b d5;
    int e;
    private boolean e5;
    int f;
    private final jf8<i> f5;
    int g;
    int h;
    ColorStateList i;
    ColorStateList j;
    ColorStateList k;
    @NonNull
    Drawable l;
    private int m;
    PorterDuff.Mode n;
    float o;
    float p;
    final int q;
    int r;
    private final int s;
    private final int t;
    private final int u;
    private int v;
    int w;
    int x;
    int y;
    int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements ViewPager.i {
        private boolean a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(@NonNull ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.Z4 == viewPager) {
                tabLayout.J(aVar2, this.a);
            }
        }

        void b(boolean z) {
            this.a = z;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    /* loaded from: classes2.dex */
    public interface d extends c<g> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.B();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends LinearLayout {
        ValueAnimator a;
        int b;
        float c;
        private int d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ View a;
            final /* synthetic */ View b;

            a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                f.this.h(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b extends AnimatorListenerAdapter {
            final /* synthetic */ int a;

            b(int i) {
                this.a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.b = this.a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.b = this.a;
            }
        }

        f(Context context) {
            super(context);
            this.b = -1;
            this.d = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            View childAt = getChildAt(this.b);
            com.google.android.material.tabs.c cVar = TabLayout.this.U4;
            TabLayout tabLayout = TabLayout.this;
            cVar.c(tabLayout, childAt, tabLayout.l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.c cVar = TabLayout.this.U4;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f, tabLayout.l);
            } else {
                Drawable drawable = TabLayout.this.l;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.l.getBounds().bottom);
            }
            syb.l0(this);
        }

        private void i(boolean z, int i, int i2) {
            View childAt = getChildAt(this.b);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.a = valueAnimator;
                valueAnimator.setInterpolator(sk.b);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i));
                valueAnimator.start();
                return;
            }
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(aVar);
        }

        void c(int i, int i2) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.a.cancel();
            }
            i(true, i, i2);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int height2 = TabLayout.this.l.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.l.getIntrinsicHeight();
            }
            int i = TabLayout.this.y;
            if (i != 0) {
                if (i != 1) {
                    height = 0;
                    if (i != 2) {
                        if (i != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.l.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.l.getBounds();
                TabLayout.this.l.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.l;
                if (tabLayout.m != 0) {
                    drawable = f83.r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.m, PorterDuff.Mode.SRC_IN);
                    } else {
                        f83.n(drawable, TabLayout.this.m);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(null);
                } else {
                    f83.o(drawable, null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        void f(int i, float f) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.a.cancel();
            }
            this.b = i;
            this.c = f;
            h(getChildAt(i), getChildAt(this.b + 1), this.c);
        }

        void g(int i) {
            Rect bounds = TabLayout.this.l.getBounds();
            TabLayout.this.l.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                i(false, this.b, -1);
            } else {
                e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.w == 1 || tabLayout.z == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) z0c.c(getContext(), 16)) * 2)) {
                    boolean z = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.w = 0;
                    tabLayout2.R(false);
                }
                super.onMeasure(i, i2);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.d != i) {
                requestLayout();
                this.d = i;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class g {
        private Object a;
        private Drawable b;
        private CharSequence c;
        private CharSequence d;
        private View f;
        public TabLayout h;
        @NonNull
        public i i;
        private int e = -1;
        private int g = 1;
        private int j = -1;

        public View e() {
            return this.f;
        }

        public Drawable f() {
            return this.b;
        }

        public int g() {
            return this.e;
        }

        public int h() {
            return this.g;
        }

        public CharSequence i() {
            return this.c;
        }

        public boolean j() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void k() {
            this.h = null;
            this.i = null;
            this.a = null;
            this.b = null;
            this.j = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void l() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                tabLayout.H(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        public g m(CharSequence charSequence) {
            this.d = charSequence;
            s();
            return this;
        }

        @NonNull
        public g n(int i) {
            return o(LayoutInflater.from(this.i.getContext()).inflate(i, (ViewGroup) this.i, false));
        }

        @NonNull
        public g o(View view) {
            this.f = view;
            s();
            return this;
        }

        @NonNull
        public g p(Drawable drawable) {
            this.b = drawable;
            TabLayout tabLayout = this.h;
            if (tabLayout.w == 1 || tabLayout.z == 2) {
                tabLayout.R(true);
            }
            s();
            if (com.google.android.material.badge.b.a && this.i.l() && this.i.e.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }

        void q(int i) {
            this.e = i;
        }

        @NonNull
        public g r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.c = charSequence;
            s();
            return this;
        }

        void s() {
            i iVar = this.i;
            if (iVar != null) {
                iVar.t();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements ViewPager.j {
        @NonNull
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public h(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        void a() {
            this.c = 0;
            this.b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
            this.b = this.c;
            this.c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z2 = false;
                if (i3 == 2 && this.b != 1) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.L(i, f, z, (i3 == 2 && this.b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.c;
                if (i2 != 0 && (i2 != 2 || this.b != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.I(tabLayout.x(i), z);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class i extends LinearLayout {
        private g a;
        private TextView b;
        private ImageView c;
        private View d;
        private com.google.android.material.badge.a e;
        private View f;
        private TextView g;
        private ImageView h;
        private Drawable i;
        private int j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements View.OnLayoutChangeListener {
            final /* synthetic */ View a;

            a(View view) {
                this.a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.a.getVisibility() == 0) {
                    i.this.s(this.a);
                }
            }
        }

        public i(@NonNull Context context) {
            super(context);
            this.j = 2;
            u(context);
            syb.J0(this, TabLayout.this.d, TabLayout.this.e, TabLayout.this.f, TabLayout.this.g);
            setGravity(17);
            setOrientation(!TabLayout.this.A ? 1 : 0);
            setClickable(true);
            syb.K0(this, qd8.b(getContext(), CommonCode.BusInterceptor.PRIVACY_CANCEL));
        }

        private void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float g(@NonNull Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private com.google.android.material.badge.a getBadge() {
            return this.e;
        }

        @NonNull
        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.e == null) {
                this.e = com.google.android.material.badge.a.d(getContext());
            }
            r();
            com.google.android.material.badge.a aVar = this.e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @NonNull
        private FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(@NonNull Canvas canvas) {
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.i.draw(canvas);
            }
        }

        private FrameLayout k(@NonNull View view) {
            if ((view != this.c && view != this.b) || !com.google.android.material.badge.b.a) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l() {
            if (this.e != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.b.a) {
                frameLayout = i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(kz8.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.c = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.b.a) {
                frameLayout = i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(kz8.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.b = textView;
            frameLayout.addView(textView);
        }

        private void p(View view) {
            if (l() && view != null) {
                h(false);
                com.google.android.material.badge.b.b(this.e, view, k(view));
                this.d = view;
            }
        }

        private void q() {
            if (!l()) {
                return;
            }
            h(true);
            View view = this.d;
            if (view != null) {
                com.google.android.material.badge.b.e(this.e, view);
                this.d = null;
            }
        }

        private void r() {
            g gVar;
            g gVar2;
            if (!l()) {
                return;
            }
            if (this.f != null) {
                q();
            } else if (this.c != null && (gVar2 = this.a) != null && gVar2.f() != null) {
                View view = this.d;
                ImageView imageView = this.c;
                if (view != imageView) {
                    q();
                    p(this.c);
                    return;
                }
                s(imageView);
            } else if (this.b != null && (gVar = this.a) != null && gVar.h() == 1) {
                View view2 = this.d;
                TextView textView = this.b;
                if (view2 != textView) {
                    q();
                    p(this.b);
                    return;
                }
                s(textView);
            } else {
                q();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(@NonNull View view) {
            if (l() && view == this.d) {
                com.google.android.material.badge.b.f(this.e, view, k(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void u(Context context) {
            int i = TabLayout.this.q;
            GradientDrawable gradientDrawable = null;
            if (i != 0) {
                Drawable b = on.b(context, i);
                this.i = b;
                if (b != null && b.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            } else {
                this.i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.k != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a2 = rm9.a(TabLayout.this.k);
                boolean z = TabLayout.this.T4;
                if (z) {
                    gradientDrawable2 = null;
                }
                if (!z) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a2, gradientDrawable2, gradientDrawable);
            }
            syb.y0(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        private void w(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            g gVar = this.a;
            CharSequence charSequence2 = null;
            if (gVar != null && gVar.f() != null) {
                drawable = f83.r(this.a.f()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                f83.o(drawable, TabLayout.this.j);
                PorterDuff.Mode mode = TabLayout.this.n;
                if (mode != null) {
                    f83.p(drawable, mode);
                }
            }
            g gVar2 = this.a;
            if (gVar2 != null) {
                charSequence = gVar2.i();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.a.g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = (int) z0c.c(getContext(), 8);
                } else {
                    i = 0;
                }
                if (TabLayout.this.A) {
                    if (i != j86.a(marginLayoutParams)) {
                        j86.c(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    j86.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.a;
            if (gVar3 != null) {
                charSequence2 = gVar3.d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    charSequence = charSequence2;
                }
                yib.a(this, charSequence);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.i;
            if (drawable != null && drawable.isStateful() && this.i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.b, this.c, this.f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public g getTab() {
            return this.a;
        }

        void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.e.i()));
            }
            d4 d1 = d4.d1(accessibilityNodeInfo);
            d1.q0(d4.c.f(0, 1, this.a.g(), 1, false, isSelected()));
            if (isSelected()) {
                d1.o0(false);
                d1.e0(d4.a.i);
            }
            d1.N0(getResources().getString(w09.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.r, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.b != null) {
                float f = TabLayout.this.o;
                int i3 = this.j;
                ImageView imageView = this.c;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.p;
                    }
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int d = edb.d(this.b);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.z != 1 || i4 <= 0 || lineCount != 1 || ((layout = this.b.getLayout()) != null && g(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.b.setTextSize(0, f);
                        this.b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.a.l();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.a) {
                this.a = gVar;
                t();
            }
        }

        final void t() {
            View view;
            boolean z;
            g gVar = this.a;
            if (gVar != null) {
                view = gVar.e();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f = view;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.g = textView2;
                if (textView2 != null) {
                    this.j = edb.d(textView2);
                }
                this.h = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f;
                if (view2 != null) {
                    removeView(view2);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    m();
                }
                if (this.b == null) {
                    n();
                    this.j = edb.d(this.b);
                }
                edb.o(this.b, TabLayout.this.h);
                ColorStateList colorStateList = TabLayout.this.i;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                w(this.b, this.c);
                r();
                f(this.c);
                f(this.b);
            } else {
                TextView textView3 = this.g;
                if (textView3 != null || this.h != null) {
                    w(textView3, this.h);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.d)) {
                setContentDescription(gVar.d);
            }
            if (gVar != null && gVar.j()) {
                z = true;
            } else {
                z = false;
            }
            setSelected(z);
        }

        final void v() {
            setOrientation(!TabLayout.this.A ? 1 : 0);
            TextView textView = this.g;
            if (textView == null && this.h == null) {
                w(this.b, this.c);
            } else {
                w(textView, this.h);
            }
        }
    }

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.tabStyle);
    }

    private void G(int i2) {
        i iVar = (i) this.c.getChildAt(i2);
        this.c.removeViewAt(i2);
        if (iVar != null) {
            iVar.o();
            this.f5.a(iVar);
        }
        requestLayout();
    }

    private void O(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.Z4;
        if (viewPager2 != null) {
            h hVar = this.c5;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.d5;
            if (bVar != null) {
                this.Z4.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.X4;
        if (cVar != null) {
            E(cVar);
            this.X4 = null;
        }
        if (viewPager != null) {
            this.Z4 = viewPager;
            if (this.c5 == null) {
                this.c5 = new h(this);
            }
            this.c5.a();
            viewPager.addOnPageChangeListener(this.c5);
            j jVar = new j(viewPager);
            this.X4 = jVar;
            c(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                J(adapter, z);
            }
            if (this.d5 == null) {
                this.d5 = new b();
            }
            this.d5.b(z);
            viewPager.addOnAdapterChangeListener(this.d5);
            K(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.Z4 = null;
            J(null, false);
        }
        this.e5 = z2;
    }

    private void P() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.get(i2).s();
        }
    }

    private void Q(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.z == 1 && this.w == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            g gVar = this.a.get(i2);
            if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.i())) {
                if (!this.A) {
                    return 72;
                }
            } else {
                i2++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.z;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        return this.u;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(@NonNull m5b m5bVar) {
        g A = A();
        CharSequence charSequence = m5bVar.a;
        if (charSequence != null) {
            A.r(charSequence);
        }
        Drawable drawable = m5bVar.b;
        if (drawable != null) {
            A.p(drawable);
        }
        int i2 = m5bVar.c;
        if (i2 != 0) {
            A.n(i2);
        }
        if (!TextUtils.isEmpty(m5bVar.getContentDescription())) {
            A.m(m5bVar.getContentDescription());
        }
        e(A);
    }

    private void i(@NonNull g gVar) {
        i iVar = gVar.i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.c.addView(iVar, gVar.g(), q());
    }

    private void j(View view) {
        if (view instanceof m5b) {
            h((m5b) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void k(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null && syb.Y(this) && !this.c.d()) {
            int scrollX = getScrollX();
            int n = n(i2, 0.0f);
            if (scrollX != n) {
                w();
                this.Y4.setIntValues(scrollX, n);
                this.Y4.start();
            }
            this.c.c(i2, this.x);
            return;
        }
        K(i2, 0.0f, true);
    }

    private void l(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
            } else {
                this.c.setGravity(1);
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.c.setGravity(8388611);
    }

    private void m() {
        int max;
        int i2 = this.z;
        if (i2 != 0 && i2 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.v - this.d);
        }
        syb.J0(this.c, max, 0, 0, 0);
        int i3 = this.z;
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                if (this.w == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.c.setGravity(1);
            }
        } else {
            l(this.w);
        }
        R(true);
    }

    private int n(int i2, float f2) {
        View childAt;
        View view;
        int i3 = this.z;
        int i4 = 0;
        if ((i3 != 0 && i3 != 2) || (childAt = this.c.getChildAt(i2)) == null) {
            return 0;
        }
        int i5 = i2 + 1;
        if (i5 < this.c.getChildCount()) {
            view = this.c.getChildAt(i5);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i6 = (int) ((width + i4) * 0.5f * f2);
        if (syb.E(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    private void o(@NonNull g gVar, int i2) {
        gVar.q(i2);
        this.a.add(i2, gVar);
        int size = this.a.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.a.get(i2).q(i2);
            } else {
                return;
            }
        }
    }

    @NonNull
    private static ColorStateList p(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    @NonNull
    private LinearLayout.LayoutParams q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        Q(layoutParams);
        return layoutParams;
    }

    @NonNull
    private i s(@NonNull g gVar) {
        i iVar;
        jf8<i> jf8Var = this.f5;
        if (jf8Var != null) {
            iVar = jf8Var.b();
        } else {
            iVar = null;
        }
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.d)) {
            iVar.setContentDescription(gVar.c);
        } else {
            iVar.setContentDescription(gVar.d);
        }
        return iVar;
    }

    private void setSelectedTabView(int i2) {
        boolean z;
        int childCount = this.c.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.c.getChildAt(i3);
                boolean z2 = true;
                if (i3 == i2) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    private void t(@NonNull g gVar) {
        for (int size = this.W4.size() - 1; size >= 0; size--) {
            this.W4.get(size).c(gVar);
        }
    }

    private void u(@NonNull g gVar) {
        for (int size = this.W4.size() - 1; size >= 0; size--) {
            this.W4.get(size).a(gVar);
        }
    }

    private void v(@NonNull g gVar) {
        for (int size = this.W4.size() - 1; size >= 0; size--) {
            this.W4.get(size).b(gVar);
        }
    }

    private void w() {
        if (this.Y4 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Y4 = valueAnimator;
            valueAnimator.setInterpolator(sk.b);
            this.Y4.setDuration(this.x);
            this.Y4.addUpdateListener(new a());
        }
    }

    private boolean y() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    @NonNull
    public g A() {
        g r = r();
        r.h = this;
        r.i = s(r);
        if (r.j != -1) {
            r.i.setId(r.j);
        }
        return r;
    }

    void B() {
        int currentItem;
        D();
        androidx.viewpager.widget.a aVar = this.a5;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                g(A().r(this.a5.getPageTitle(i2)), false);
            }
            ViewPager viewPager = this.Z4;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                H(x(currentItem));
            }
        }
    }

    protected boolean C(g gVar) {
        return h5.a(gVar);
    }

    public void D() {
        for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
            G(childCount);
        }
        Iterator<g> it = this.a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.k();
            C(next);
        }
        this.b = null;
    }

    @Deprecated
    public void E(c cVar) {
        this.W4.remove(cVar);
    }

    public void F(@NonNull d dVar) {
        E(dVar);
    }

    public void H(g gVar) {
        I(gVar, true);
    }

    public void I(g gVar, boolean z) {
        int i2;
        g gVar2 = this.b;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                t(gVar);
                k(gVar.g());
                return;
            }
            return;
        }
        if (gVar != null) {
            i2 = gVar.g();
        } else {
            i2 = -1;
        }
        if (z) {
            if ((gVar2 == null || gVar2.g() == -1) && i2 != -1) {
                K(i2, 0.0f, true);
            } else {
                k(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.b = gVar;
        if (gVar2 != null) {
            v(gVar2);
        }
        if (gVar != null) {
            u(gVar);
        }
    }

    void J(androidx.viewpager.widget.a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.a5;
        if (aVar2 != null && (dataSetObserver = this.b5) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.a5 = aVar;
        if (z && aVar != null) {
            if (this.b5 == null) {
                this.b5 = new e();
            }
            aVar.registerDataSetObserver(this.b5);
        }
        B();
    }

    public void K(int i2, float f2, boolean z) {
        L(i2, f2, z, true);
    }

    public void L(int i2, float f2, boolean z, boolean z2) {
        int n;
        int round = Math.round(i2 + f2);
        if (round >= 0 && round < this.c.getChildCount()) {
            if (z2) {
                this.c.f(i2, f2);
            }
            ValueAnimator valueAnimator = this.Y4;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.Y4.cancel();
            }
            if (i2 < 0) {
                n = 0;
            } else {
                n = n(i2, f2);
            }
            scrollTo(n, 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void M(int i2, int i3) {
        setTabTextColors(p(i2, i3));
    }

    public void N(ViewPager viewPager, boolean z) {
        O(viewPager, z, false);
    }

    void R(boolean z) {
        for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
            View childAt = this.c.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            Q((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        j(view);
    }

    @Deprecated
    public void c(c cVar) {
        if (!this.W4.contains(cVar)) {
            this.W4.add(cVar);
        }
    }

    public void d(@NonNull d dVar) {
        c(dVar);
    }

    public void e(@NonNull g gVar) {
        g(gVar, this.a.isEmpty());
    }

    public void f(@NonNull g gVar, int i2, boolean z) {
        if (gVar.h == this) {
            o(gVar, i2);
            i(gVar);
            if (z) {
                gVar.l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void g(@NonNull g gVar, boolean z) {
        f(gVar, this.a.size(), z);
    }

    public int getSelectedTabPosition() {
        g gVar = this.b;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.a.size();
    }

    public int getTabGravity() {
        return this.w;
    }

    public ColorStateList getTabIconTint() {
        return this.j;
    }

    public int getTabIndicatorAnimationMode() {
        return this.S4;
    }

    public int getTabIndicatorGravity() {
        return this.y;
    }

    int getTabMaxWidth() {
        return this.r;
    }

    public int getTabMode() {
        return this.z;
    }

    public ColorStateList getTabRippleColor() {
        return this.k;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.l;
    }

    public ColorStateList getTabTextColors() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ga6.e(this);
        if (this.Z4 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                O((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.e5) {
            setupWithViewPager(null);
            this.e5 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
            View childAt = this.c.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d4.d1(accessibilityNodeInfo).p0(d4.b.d(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (y() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int round = Math.round(z0c.c(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.t;
            if (i4 <= 0) {
                i4 = (int) (size - z0c.c(getContext(), 56));
            }
            this.r = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.z;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !y()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected g r() {
        g b2 = h5.b();
        if (b2 == null) {
            return new g();
        }
        return b2;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ga6.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.A != z) {
            this.A = z;
            for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                View childAt = this.c.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).v();
                }
            }
            m();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        w();
        this.Y4.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.l != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.l = drawable;
            int i2 = this.I;
            if (i2 == -1) {
                i2 = drawable.getIntrinsicHeight();
            }
            this.c.g(i2);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.m = i2;
        R(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.y != i2) {
            this.y = i2;
            syb.l0(this.c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.I = i2;
        this.c.g(i2);
    }

    public void setTabGravity(int i2) {
        if (this.w != i2) {
            this.w = i2;
            m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            P();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(on.a(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.S4 = i2;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.U4 = new com.google.android.material.tabs.b();
                    return;
                }
                throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
            }
            this.U4 = new com.google.android.material.tabs.a();
            return;
        }
        this.U4 = new com.google.android.material.tabs.c();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.B = z;
        this.c.e();
        syb.l0(this.c);
    }

    public void setTabMode(int i2) {
        if (i2 != this.z) {
            this.z = i2;
            m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                View childAt = this.c.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(on.a(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            P();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        J(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.T4 != z) {
            this.T4 = z;
            for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                View childAt = this.c.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        N(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public g x(int i2) {
        if (i2 >= 0 && i2 < getTabCount()) {
            return this.a.get(i2);
        }
        return null;
    }

    public boolean z() {
        return this.B;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        j(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.V4;
        if (cVar2 != null) {
            E(cVar2);
        }
        this.V4 = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(on.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* loaded from: classes2.dex */
    public static class j implements d {
        private final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@NonNull g gVar) {
            this.a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }
}
