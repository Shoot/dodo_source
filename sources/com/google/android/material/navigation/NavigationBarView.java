package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.e0;
import androidx.customview.view.AbsSavedState;
/* loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {
    @NonNull
    private final su6 a;
    @NonNull
    private final com.google.android.material.navigation.b b;
    @NonNull
    private final NavigationBarPresenter c;
    private ColorStateList d;
    private MenuInflater e;
    private c f;
    private b g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Bundle c;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(@NonNull MenuItem menuItem);
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(@NonNull MenuItem menuItem);
    }

    public NavigationBarView(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(ia6.c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.c = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = b29.p5;
        int i3 = b29.A5;
        int i4 = b29.z5;
        e0 i5 = sdb.i(context2, attributeSet, iArr, i, i2, i3, i4);
        su6 su6Var = new su6(context2, getClass(), getMaxItemCount());
        this.a = su6Var;
        com.google.android.material.navigation.b d = d(context2);
        this.b = d;
        navigationBarPresenter.c(d);
        navigationBarPresenter.b(1);
        d.setPresenter(navigationBarPresenter);
        su6Var.b(navigationBarPresenter);
        navigationBarPresenter.l(getContext(), su6Var);
        int i6 = b29.v5;
        if (i5.s(i6)) {
            d.setIconTintList(i5.c(i6));
        } else {
            d.setIconTintList(d.e(16842808));
        }
        setItemIconSize(i5.f(b29.u5, getResources().getDimensionPixelSize(ww8.mtrl_navigation_bar_item_default_icon_size)));
        if (i5.s(i3)) {
            setItemTextAppearanceInactive(i5.n(i3, 0));
        }
        if (i5.s(i4)) {
            setItemTextAppearanceActive(i5.n(i4, 0));
        }
        int i7 = b29.B5;
        if (i5.s(i7)) {
            setItemTextColor(i5.c(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            syb.y0(this, c(context2));
        }
        int i8 = b29.x5;
        if (i5.s(i8)) {
            setItemPaddingTop(i5.f(i8, 0));
        }
        int i9 = b29.w5;
        if (i5.s(i9)) {
            setItemPaddingBottom(i5.f(i9, 0));
        }
        int i10 = b29.r5;
        if (i5.s(i10)) {
            setElevation(i5.f(i10, 0));
        }
        f83.o(getBackground().mutate(), ea6.b(context2, i5, b29.q5));
        setLabelVisibilityMode(i5.l(b29.C5, -1));
        int n = i5.n(b29.t5, 0);
        if (n != 0) {
            d.setItemBackgroundRes(n);
        } else {
            setItemRippleColor(ea6.b(context2, i5, b29.y5));
        }
        int n2 = i5.n(b29.s5, 0);
        if (n2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(n2, b29.j5);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(b29.l5, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(b29.k5, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(b29.n5, 0));
            setItemActiveIndicatorColor(ea6.a(context2, obtainStyledAttributes, b29.m5));
            setItemActiveIndicatorShapeAppearance(uga.b(context2, obtainStyledAttributes.getResourceId(b29.o5, 0), 0).m());
            obtainStyledAttributes.recycle();
        }
        int i11 = b29.D5;
        if (i5.s(i11)) {
            g(i5.n(i11, 0));
        }
        i5.w();
        addView(d);
        su6Var.V(new a());
    }

    @NonNull
    private fa6 c(Context context) {
        fa6 fa6Var = new fa6();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            fa6Var.b0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        fa6Var.Q(context);
        return fa6Var;
    }

    private MenuInflater getMenuInflater() {
        if (this.e == null) {
            this.e = new r2b(getContext());
        }
        return this.e;
    }

    @NonNull
    protected abstract com.google.android.material.navigation.b d(@NonNull Context context);

    public com.google.android.material.badge.a e(int i) {
        return this.b.i(i);
    }

    @NonNull
    public com.google.android.material.badge.a f(int i) {
        return this.b.j(i);
    }

    public void g(int i) {
        this.c.m(true);
        getMenuInflater().inflate(i, this.a);
        this.c.m(false);
        this.c.i(true);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.b.getItemActiveIndicatorMarginHorizontal();
    }

    public uga getItemActiveIndicatorShapeAppearance() {
        return this.b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.d;
    }

    public int getItemTextAppearanceActive() {
        return this.b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.a;
    }

    @NonNull
    public k getMenuView() {
        return this.b;
    }

    @NonNull
    public NavigationBarPresenter getPresenter() {
        return this.c;
    }

    public int getSelectedItemId() {
        return this.b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ga6.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.a.S(savedState.c);
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.c = bundle;
        this.a.U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ga6.d(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(uga ugaVar) {
        this.b.setItemActiveIndicatorShapeAppearance(ugaVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.b.setItemBackground(drawable);
        this.d = null;
    }

    public void setItemBackgroundResource(int i) {
        this.b.setItemBackgroundRes(i);
        this.d = null;
    }

    public void setItemIconSize(int i) {
        this.b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.d == colorStateList) {
            if (colorStateList == null && this.b.getItemBackground() != null) {
                this.b.setItemBackground(null);
                return;
            }
            return;
        }
        this.d = colorStateList;
        if (colorStateList == null) {
            this.b.setItemBackground(null);
            return;
        }
        this.b.setItemBackground(new RippleDrawable(rm9.a(colorStateList), null, null));
    }

    public void setItemTextAppearanceActive(int i) {
        this.b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.b.getLabelVisibilityMode() != i) {
            this.b.setLabelVisibilityMode(i);
            this.c.i(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
        this.g = bVar;
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f = cVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.a.findItem(i);
        if (findItem != null && !this.a.O(findItem, this.c, 0)) {
            findItem.setChecked(true);
        }
    }

    /* loaded from: classes2.dex */
    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, @NonNull MenuItem menuItem) {
            if (NavigationBarView.this.g != null && menuItem.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                NavigationBarView.this.g.a(menuItem);
                return true;
            } else if (NavigationBarView.this.f != null && !NavigationBarView.this.f.a(menuItem)) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }
}
