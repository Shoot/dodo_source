package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements e.b, androidx.appcompat.view.menu.k {
    e A;
    private androidx.appcompat.view.menu.e p;
    private Context q;
    private int r;
    private boolean s;
    private ActionMenuPresenter t;
    private j.a u;
    e.a v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            if (eVar2 != null && eVar2.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = false;
        if (actionMenuItemView != null && actionMenuItemView.c()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
                if (!cVar.a && z) {
                    z2 = true;
                }
                cVar.d = z2;
                cVar.b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!cVar.a) {
            z2 = true;
        }
        cVar.d = z2;
        cVar.b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    private void M(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        int i8;
        ?? r14;
        boolean z6;
        int i9;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i10 = size - paddingLeft;
        int i11 = this.y;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = i11 + (i13 / i12);
        int childCount = getChildCount();
        int i15 = 0;
        int i16 = 0;
        boolean z7 = false;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            int i20 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i21 = i17 + 1;
                if (z8) {
                    int i22 = this.z;
                    i8 = i21;
                    r14 = 0;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i8 = i21;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f = r14;
                cVar.c = r14;
                cVar.b = r14;
                cVar.d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                if (z8 && ((ActionMenuItemView) childAt).c()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                cVar.e = z6;
                if (cVar.a) {
                    i9 = 1;
                } else {
                    i9 = i12;
                }
                int L = L(childAt, i14, i9, childMeasureSpec, paddingTop);
                i18 = Math.max(i18, L);
                if (cVar.d) {
                    i19++;
                }
                if (cVar.a) {
                    z7 = true;
                }
                i12 -= L;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= 1 << i16;
                    i15 = i15;
                }
                i17 = i8;
            }
            i16++;
            size2 = i20;
        }
        int i23 = size2;
        if (z7 && i17 == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z9 = false;
        while (i19 > 0 && i12 > 0) {
            int i24 = 0;
            int i25 = 0;
            int i26 = Integer.MAX_VALUE;
            long j2 = 0;
            while (i25 < childCount) {
                boolean z10 = z9;
                c cVar2 = (c) getChildAt(i25).getLayoutParams();
                int i27 = i15;
                if (cVar2.d) {
                    int i28 = cVar2.b;
                    if (i28 < i26) {
                        j2 = 1 << i25;
                        i26 = i28;
                        i24 = 1;
                    } else if (i28 == i26) {
                        i24++;
                        j2 |= 1 << i25;
                    }
                }
                i25++;
                i15 = i27;
                z9 = z10;
            }
            z2 = z9;
            i5 = i15;
            j |= j2;
            if (i24 > i12) {
                i3 = mode;
                i4 = i10;
                break;
            }
            int i29 = i26 + 1;
            int i30 = 0;
            while (i30 < childCount) {
                View childAt2 = getChildAt(i30);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i31 = i10;
                int i32 = mode;
                long j3 = 1 << i30;
                if ((j2 & j3) == 0) {
                    if (cVar3.b == i29) {
                        j |= j3;
                    }
                    z5 = z;
                } else {
                    if (z && cVar3.e && i12 == 1) {
                        int i33 = this.z;
                        z5 = z;
                        childAt2.setPadding(i33 + i14, 0, i33, 0);
                    } else {
                        z5 = z;
                    }
                    cVar3.b++;
                    cVar3.f = true;
                    i12--;
                }
                i30++;
                mode = i32;
                i10 = i31;
                z = z5;
            }
            i15 = i5;
            z9 = true;
        }
        i3 = mode;
        i4 = i10;
        z2 = z9;
        i5 = i15;
        if (!z7 && i17 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i12 > 0 && j != 0 && (i12 < i17 - 1 || z3 || i18 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z3) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount - 1;
                if ((j & (1 << i34)) != 0 && !((c) getChildAt(i34).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i7 = (int) ((i12 * i14) / bitCount);
            } else {
                i7 = 0;
            }
            z4 = z2;
            for (int i35 = 0; i35 < childCount; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.c = i7;
                        cVar4.f = true;
                        if (i35 == 0 && !cVar4.e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i7) / 2;
                        }
                    } else if (cVar4.a) {
                        cVar4.c = i7;
                        cVar4.f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i7) / 2;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i7 / 2;
                        }
                        if (i35 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i7 / 2;
                        }
                    }
                    z4 = true;
                }
            }
        } else {
            z4 = z2;
        }
        if (z4) {
            for (int i36 = 0; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i14) + cVar5.c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i3 != 1073741824) {
            i6 = i5;
        } else {
            i6 = i23;
        }
        setMeasuredDimension(i4, i6);
    }

    public void B() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return m();
    }

    public c F() {
        c m = m();
        m.a = true;
        return m;
    }

    protected boolean G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = ((a) childAt).a();
        }
        if (i > 0 && (childAt2 instanceof a)) {
            return z | ((a) childAt2).b();
        }
        return z;
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null && actionMenuPresenter.E()) {
            return true;
        }
        return false;
    }

    public boolean I() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null && actionMenuPresenter.G()) {
            return true;
        }
        return false;
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null && actionMenuPresenter.H()) {
            return true;
        }
        return false;
    }

    public boolean K() {
        return this.s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.u = aVar;
        this.v = aVar2;
    }

    public boolean P() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null && actionMenuPresenter.N()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(androidx.appcompat.view.menu.e eVar) {
        this.p = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean e(androidx.appcompat.view.menu.g gVar) {
        return this.p.N(gVar, 0);
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.p = eVar;
            eVar.V(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.t = actionMenuPresenter;
            actionMenuPresenter.M(true);
            ActionMenuPresenter actionMenuPresenter2 = this.t;
            j.a aVar = this.u;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.e(aVar);
            this.p.c(this.t, this.q);
            this.t.K(this);
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.t.D();
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i(false);
            if (this.t.H()) {
                this.t.E();
                this.t.N();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = b1c.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        androidx.appcompat.view.menu.e eVar;
        boolean z2 = this.w;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        if (z2 != z) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.w && (eVar = this.p) != null && size != this.x) {
            this.x = size;
            eVar.M(true);
        }
        int childCount = getChildCount();
        if (this.w && childCount > 0) {
            M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c cVar = (c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.J(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.t.L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.t = actionMenuPresenter;
        actionMenuPresenter.K(this);
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(@NonNull androidx.appcompat.view.menu.e eVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(@NonNull androidx.appcompat.view.menu.e eVar, boolean z) {
        }
    }
}
