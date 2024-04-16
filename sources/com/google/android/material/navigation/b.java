package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import defpackage.d4;
import java.util.HashSet;
/* compiled from: NavigationBarMenuView.java */
/* loaded from: classes2.dex */
public abstract class b extends ViewGroup implements k {
    private static final int[] I = {16842912};
    private static final int[] S4 = {-16842910};
    private NavigationBarPresenter A;
    private e B;
    private final jlb a;
    @NonNull
    private final View.OnClickListener b;
    private final jf8<com.google.android.material.navigation.a> c;
    @NonNull
    private final SparseArray<View.OnTouchListener> d;
    private int e;
    private com.google.android.material.navigation.a[] f;
    private int g;
    private int h;
    private ColorStateList i;
    private int j;
    private ColorStateList k;
    private final ColorStateList l;
    private int m;
    private int n;
    private Drawable o;
    private int p;
    @NonNull
    private final SparseArray<com.google.android.material.badge.a> q;
    private int r;
    private int s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private uga x;
    private boolean y;
    private ColorStateList z;

    /* compiled from: NavigationBarMenuView.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g itemData = ((com.google.android.material.navigation.a) view).getItemData();
            if (!b.this.B.O(itemData, b.this.A, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public b(@NonNull Context context) {
        super(context);
        this.c = new nf8(5);
        this.d = new SparseArray<>(5);
        this.g = 0;
        this.h = 0;
        this.q = new SparseArray<>(5);
        this.r = -1;
        this.s = -1;
        this.y = false;
        this.l = e(16842808);
        if (isInEditMode()) {
            this.a = null;
        } else {
            e10 e10Var = new e10();
            this.a = e10Var;
            e10Var.t0(0);
            e10Var.Z(dp6.d(getContext(), qv8.motionDurationLong1, getResources().getInteger(zy8.material_motion_duration_long_1)));
            e10Var.b0(dp6.e(getContext(), qv8.motionEasingStandard, sk.b));
            e10Var.j0(new lcb());
        }
        this.b = new a();
        syb.F0(this, 1);
    }

    private Drawable f() {
        if (this.x != null && this.z != null) {
            fa6 fa6Var = new fa6(this.x);
            fa6Var.b0(this.z);
            return fa6Var;
        }
        return null;
    }

    private com.google.android.material.navigation.a getNewItem() {
        com.google.android.material.navigation.a b = this.c.b();
        if (b == null) {
            return g(getContext());
        }
        return b;
    }

    private boolean l(int i) {
        if (i != -1) {
            return true;
        }
        return false;
    }

    private void m() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.B.size(); i++) {
            hashSet.add(Integer.valueOf(this.B.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            int keyAt = this.q.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.q.delete(keyAt);
            }
        }
    }

    private void q(int i) {
        if (l(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }

    private void setBadgeIfNeeded(@NonNull com.google.android.material.navigation.a aVar) {
        com.google.android.material.badge.a aVar2;
        int id = aVar.getId();
        if (l(id) && (aVar2 = this.q.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(@NonNull e eVar) {
        this.B = eVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void d() {
        removeAllViews();
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar != null) {
                    this.c.a(aVar);
                    aVar.h();
                }
            }
        }
        if (this.B.size() == 0) {
            this.g = 0;
            this.h = 0;
            this.f = null;
            return;
        }
        m();
        this.f = new com.google.android.material.navigation.a[this.B.size()];
        boolean k = k(this.e, this.B.G().size());
        for (int i = 0; i < this.B.size(); i++) {
            this.A.m(true);
            this.B.getItem(i).setCheckable(true);
            this.A.m(false);
            com.google.android.material.navigation.a newItem = getNewItem();
            this.f[i] = newItem;
            newItem.setIconTintList(this.i);
            newItem.setIconSize(this.j);
            newItem.setTextColor(this.l);
            newItem.setTextAppearanceInactive(this.m);
            newItem.setTextAppearanceActive(this.n);
            newItem.setTextColor(this.k);
            int i2 = this.r;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.s;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.u);
            newItem.setActiveIndicatorHeight(this.v);
            newItem.setActiveIndicatorMarginHorizontal(this.w);
            newItem.setActiveIndicatorDrawable(f());
            newItem.setActiveIndicatorResizeable(this.y);
            newItem.setActiveIndicatorEnabled(this.t);
            Drawable drawable = this.o;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.p);
            }
            newItem.setShifting(k);
            newItem.setLabelVisibilityMode(this.e);
            g gVar = (g) this.B.getItem(i);
            newItem.d(gVar, 0);
            newItem.setItemPosition(i);
            int itemId = gVar.getItemId();
            newItem.setOnTouchListener(this.d.get(itemId));
            newItem.setOnClickListener(this.b);
            int i4 = this.g;
            if (i4 != 0 && itemId == i4) {
                this.h = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.B.size() - 1, this.h);
        this.h = min;
        this.B.getItem(min).setChecked(true);
    }

    public ColorStateList e(int i) {
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
        int[] iArr = S4;
        return new ColorStateList(new int[][]{iArr, I, ViewGroup.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    protected abstract com.google.android.material.navigation.a g(@NonNull Context context);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.q;
    }

    public ColorStateList getIconTintList() {
        return this.i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.z;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.t;
    }

    public int getItemActiveIndicatorHeight() {
        return this.v;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.w;
    }

    public uga getItemActiveIndicatorShapeAppearance() {
        return this.x;
    }

    public int getItemActiveIndicatorWidth() {
        return this.u;
    }

    public Drawable getItemBackground() {
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null && aVarArr.length > 0) {
            return aVarArr[0].getBackground();
        }
        return this.o;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.p;
    }

    public int getItemIconSize() {
        return this.j;
    }

    public int getItemPaddingBottom() {
        return this.s;
    }

    public int getItemPaddingTop() {
        return this.r;
    }

    public int getItemTextAppearanceActive() {
        return this.n;
    }

    public int getItemTextAppearanceInactive() {
        return this.m;
    }

    public ColorStateList getItemTextColor() {
        return this.k;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e getMenu() {
        return this.B;
    }

    public int getSelectedItemId() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public com.google.android.material.navigation.a h(int i) {
        q(i);
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar.getId() == i) {
                    return aVar;
                }
            }
            return null;
        }
        return null;
    }

    public com.google.android.material.badge.a i(int i) {
        return this.q.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.badge.a j(int i) {
        q(i);
        com.google.android.material.badge.a aVar = this.q.get(i);
        if (aVar == null) {
            aVar = com.google.android.material.badge.a.d(getContext());
            this.q.put(i, aVar);
        }
        com.google.android.material.navigation.a h = h(i);
        if (h != null) {
            h.setBadge(aVar);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k(int i, int i2) {
        if (i == -1) {
            if (i2 <= 3) {
                return false;
            }
        } else if (i != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(SparseArray<com.google.android.material.badge.a> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.q.indexOfKey(keyAt) < 0) {
                this.q.append(keyAt, sparseArray.get(keyAt));
            }
        }
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setBadge(this.q.get(aVar.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i) {
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.B.getItem(i2);
            if (i == item.getItemId()) {
                this.g = i;
                this.h = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d4.d1(accessibilityNodeInfo).p0(d4.b.d(1, this.B.G().size(), false, 1));
    }

    public void p() {
        jlb jlbVar;
        e eVar = this.B;
        if (eVar != null && this.f != null) {
            int size = eVar.size();
            if (size != this.f.length) {
                d();
                return;
            }
            int i = this.g;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.B.getItem(i2);
                if (item.isChecked()) {
                    this.g = item.getItemId();
                    this.h = i2;
                }
            }
            if (i != this.g && (jlbVar = this.a) != null) {
                hlb.a(this, jlbVar);
            }
            boolean k = k(this.e, this.B.G().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.A.m(true);
                this.f[i3].setLabelVisibilityMode(this.e);
                this.f[i3].setShifting(k);
                this.f[i3].d((g) this.B.getItem(i3), 0);
                this.A.m(false);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.t = z;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.v = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.w = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z) {
        this.y = z;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(uga ugaVar) {
        this.x = ugaVar;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.u = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.o = drawable;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.p = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.j = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.s = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.r = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.n = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.m = i;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.k = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.e = i;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.A = navigationBarPresenter;
    }
}
