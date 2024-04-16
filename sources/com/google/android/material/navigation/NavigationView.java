package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.e0;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuPresenter;
import defpackage.uga;
/* loaded from: classes2.dex */
public class NavigationView extends mx9 {
    private static final int[] s = {16842912};
    private static final int[] t = {-16842910};
    private static final int u = i19.Widget_Design_NavigationView;
    @NonNull
    private final uu6 f;
    private final NavigationMenuPresenter g;
    c h;
    private final int i;
    private final int[] j;
    private MenuInflater k;
    private ViewTreeObserver.OnGlobalLayoutListener l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private Path q;
    private final RectF r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.j);
            boolean z5 = true;
            if (NavigationView.this.j[1] == 0) {
                z = true;
            } else {
                z = false;
            }
            NavigationView.this.g.C(z);
            NavigationView navigationView2 = NavigationView.this;
            if (z && navigationView2.k()) {
                z2 = true;
            } else {
                z2 = false;
            }
            navigationView2.setDrawTopInsetForeground(z2);
            Activity a = zu1.a(NavigationView.this.getContext());
            if (a != null) {
                if (a.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Color.alpha(a.getWindow().getNavigationBarColor()) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground((z3 && z4 && navigationView3.j()) ? false : false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.navigationViewStyle);
    }

    private ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = on.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(aw8.z, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        int[] iArr = t;
        return new ColorStateList(new int[][]{iArr, s, FrameLayout.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    private Drawable e(@NonNull e0 e0Var) {
        return f(e0Var, ea6.b(getContext(), e0Var, b29.Z5));
    }

    @NonNull
    private Drawable f(@NonNull e0 e0Var, ColorStateList colorStateList) {
        fa6 fa6Var = new fa6(uga.b(getContext(), e0Var.n(b29.X5, 0), e0Var.n(b29.Y5, 0)).m());
        fa6Var.b0(colorStateList);
        return new InsetDrawable((Drawable) fa6Var, e0Var.f(b29.c6, 0), e0Var.f(b29.d6, 0), e0Var.f(b29.b6, 0), e0Var.f(b29.a6, 0));
    }

    private boolean g(@NonNull e0 e0Var) {
        if (!e0Var.s(b29.X5) && !e0Var.s(b29.Y5)) {
            return false;
        }
        return true;
    }

    private MenuInflater getMenuInflater() {
        if (this.k == null) {
            this.k = new r2b(getContext());
        }
        return this.k;
    }

    private void l(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && this.p > 0 && (getBackground() instanceof fa6)) {
            fa6 fa6Var = (fa6) getBackground();
            uga.b v = fa6Var.E().v();
            if (ii4.b(this.o, syb.E(this)) == 3) {
                v.H(this.p);
                v.z(this.p);
            } else {
                v.D(this.p);
                v.v(this.p);
            }
            fa6Var.setShapeAppearanceModel(v.m());
            if (this.q == null) {
                this.q = new Path();
            }
            this.q.reset();
            this.r.set(0.0f, 0.0f, i, i2);
            vga.k().e(fa6Var.E(), fa6Var.y(), this.r, this.q);
            invalidate();
            return;
        }
        this.q = null;
        this.r.setEmpty();
    }

    private void m() {
        this.l = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.l);
    }

    @Override // defpackage.mx9
    protected void a(@NonNull c5c c5cVar) {
        this.g.m(c5cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NonNull Canvas canvas) {
        if (this.q == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.q);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.g.n();
    }

    public int getDividerInsetEnd() {
        return this.g.o();
    }

    public int getDividerInsetStart() {
        return this.g.p();
    }

    public int getHeaderCount() {
        return this.g.q();
    }

    public Drawable getItemBackground() {
        return this.g.r();
    }

    public int getItemHorizontalPadding() {
        return this.g.s();
    }

    public int getItemIconPadding() {
        return this.g.t();
    }

    public ColorStateList getItemIconTintList() {
        return this.g.w();
    }

    public int getItemMaxLines() {
        return this.g.u();
    }

    public ColorStateList getItemTextColor() {
        return this.g.v();
    }

    public int getItemVerticalPadding() {
        return this.g.x();
    }

    @NonNull
    public Menu getMenu() {
        return this.f;
    }

    public int getSubheaderInsetEnd() {
        return this.g.z();
    }

    public int getSubheaderInsetStart() {
        return this.g.A();
    }

    public View h(int i) {
        return this.g.B(i);
    }

    public void i(int i) {
        this.g.V(true);
        getMenuInflater().inflate(i, this.f);
        this.g.V(false);
        this.g.i(false);
    }

    public boolean j() {
        return this.n;
    }

    public boolean k() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mx9, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ga6.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mx9, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.i), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f.S(savedState.c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.c = bundle;
        this.f.U(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        l(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.n = z;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f.findItem(i);
        if (findItem != null) {
            this.g.D((g) findItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.g.E(i);
    }

    public void setDividerInsetStart(int i) {
        this.g.F(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ga6.d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.g.H(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(iu1.e(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.g.J(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.g.J(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.g.K(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.g.K(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.g.L(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.g.M(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.g.N(i);
    }

    public void setItemTextAppearance(int i) {
        this.g.O(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.g.P(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.g.Q(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.g.Q(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.h = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.g;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.R(i);
        }
    }

    public void setSubheaderInsetEnd(int i) {
        this.g.T(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.g.T(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.m = z;
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Bundle c;

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

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.g.D((g) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* loaded from: classes2.dex */
    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            c cVar = NavigationView.this.h;
            if (cVar != null && cVar.a(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }
}
