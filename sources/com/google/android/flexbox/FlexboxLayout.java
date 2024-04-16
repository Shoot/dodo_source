package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements a {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private c o;
    private List<b> p;
    private c.b q;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.p.get(i2).c() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean l(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View r = r(i - i3);
            if (r != null && r.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.p.get(i3);
            for (int i4 = 0; i4 < bVar.h; i4++) {
                int i5 = bVar.o + i4;
                View r = r(i5);
                if (r != null && r.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (s(i5, i4)) {
                        if (z) {
                            left = r.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (r.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l;
                        }
                        p(canvas, left, bVar.b, bVar.g);
                    }
                    if (i4 == bVar.h - 1 && (this.j & 4) > 0) {
                        if (z) {
                            right = (r.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l;
                        } else {
                            right = r.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        p(canvas, right, bVar.b, bVar.g);
                    }
                }
            }
            if (t(i3)) {
                if (z2) {
                    i2 = bVar.d;
                } else {
                    i2 = bVar.b - this.k;
                }
                o(canvas, paddingLeft, i2, max);
            }
            if (u(i3) && (this.i & 4) > 0) {
                if (z2) {
                    i = bVar.b - this.k;
                } else {
                    i = bVar.d;
                }
                o(canvas, paddingLeft, i, max);
            }
        }
    }

    private void n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.p.get(i3);
            for (int i4 = 0; i4 < bVar.h; i4++) {
                int i5 = bVar.o + i4;
                View r = r(i5);
                if (r != null && r.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (s(i5, i4)) {
                        if (z2) {
                            top = r.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (r.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k;
                        }
                        o(canvas, bVar.a, top, bVar.g);
                    }
                    if (i4 == bVar.h - 1 && (this.i & 4) > 0) {
                        if (z2) {
                            bottom = (r.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k;
                        } else {
                            bottom = r.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        o(canvas, bVar.a, bottom, bVar.g);
                    }
                }
            }
            if (t(i3)) {
                if (z) {
                    i2 = bVar.c;
                } else {
                    i2 = bVar.a - this.l;
                }
                p(canvas, i2, paddingTop, max);
            }
            if (u(i3) && (this.j & 4) > 0) {
                if (z) {
                    i = bVar.a - this.l;
                } else {
                    i = bVar.c;
                }
                p(canvas, i, paddingTop, max);
            }
        }
    }

    private void o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    private void p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    private boolean s(int i, int i2) {
        if (l(i, i2)) {
            if (k()) {
                if ((this.j & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.i & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (k()) {
            if ((this.j & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.i & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean t(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        if (a(i)) {
            if (k()) {
                if ((this.i & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.j & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (k()) {
            if ((this.i & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.j & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean u(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.p.size(); i2++) {
            if (this.p.get(i2).c() > 0) {
                return false;
            }
        }
        if (k()) {
            if ((this.i & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.j & 4) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    private void x(int i, int i2) {
        this.p.clear();
        this.q.a();
        this.o.c(this.q, i, i2);
        this.p = this.q.a;
        this.o.p(i, i2);
        if (this.d == 3) {
            for (b bVar : this.p) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < bVar.h; i4++) {
                    View r = r(bVar.o + i4);
                    if (r != null && r.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                        if (this.b != 2) {
                            i3 = Math.max(i3, r.getMeasuredHeight() + Math.max(bVar.l - r.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        } else {
                            i3 = Math.max(i3, r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((bVar.l - r.getMeasuredHeight()) + r.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                }
                bVar.g = i3;
            }
        }
        this.o.o(i, i2, getPaddingTop() + getPaddingBottom());
        this.o.X();
        z(this.a, i, i2, this.q.b);
    }

    private void y(int i, int i2) {
        this.p.clear();
        this.q.a();
        this.o.f(this.q, i, i2);
        this.p = this.q.a;
        this.o.p(i, i2);
        this.o.o(i, i2, getPaddingLeft() + getPaddingRight());
        this.o.X();
        z(this.a, i, i2, this.q.b);
    }

    private void z(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i4 = View.combineMeasuredStates(i4, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
            }
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        this.m = this.o.n(view, i, layoutParams, this.n);
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i, int i2, b bVar) {
        if (s(i, i2)) {
            if (k()) {
                int i3 = bVar.e;
                int i4 = this.l;
                bVar.e = i3 + i4;
                bVar.f += i4;
                return;
            }
            int i5 = bVar.e;
            int i6 = this.k;
            bVar.e = i5 + i6;
            bVar.f += i6;
        }
    }

    @Override // com.google.android.flexbox.a
    public int c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.a
    public View d(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.a
    public int e(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.a
    public int f(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public void g(b bVar) {
        if (k()) {
            if ((this.j & 4) > 0) {
                int i = bVar.e;
                int i2 = this.l;
                bVar.e = i + i2;
                bVar.f += i2;
            }
        } else if ((this.i & 4) > 0) {
            int i3 = bVar.e;
            int i4 = this.k;
            bVar.e = i3 + i4;
            bVar.f += i4;
        }
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.e;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.a;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.p.size());
        for (b bVar : this.p) {
            if (bVar.c() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<b> getFlexLinesInternal() {
        return this.p;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (b bVar : this.p) {
            i = Math.max(i, bVar.e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f;
    }

    public int getShowDividerHorizontal() {
        return this.i;
    }

    public int getShowDividerVertical() {
        return this.j;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.p.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.p.get(i4);
            if (t(i4)) {
                if (k()) {
                    i2 = this.k;
                } else {
                    i2 = this.l;
                }
                i3 += i2;
            }
            if (u(i4)) {
                if (k()) {
                    i = this.k;
                } else {
                    i = this.l;
                }
                i3 += i;
            }
            i3 += bVar.g;
        }
        return i3;
    }

    @Override // com.google.android.flexbox.a
    public View h(int i) {
        return r(i);
    }

    @Override // com.google.android.flexbox.a
    public int j(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (k()) {
            if (s(i, i2)) {
                i4 = this.l;
            }
            if ((this.j & 4) > 0) {
                i3 = this.l;
            } else {
                return i4;
            }
        } else {
            if (s(i, i2)) {
                i4 = this.k;
            }
            if ((this.i & 4) > 0) {
                i3 = this.k;
            } else {
                return i4;
            }
        }
        return i4 + i3;
    }

    @Override // com.google.android.flexbox.a
    public boolean k() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int E = syb.E(this);
        int i = this.a;
        boolean z3 = false;
        boolean z4 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (E == 1) {
                            z3 = true;
                        }
                        if (this.b == 2) {
                            z3 = !z3;
                        }
                        n(canvas, z3, true);
                        return;
                    }
                    return;
                }
                if (E != 1) {
                    z4 = false;
                }
                if (this.b == 2) {
                    z4 = !z4;
                }
                n(canvas, z4, false);
                return;
            }
            if (E != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.b == 2) {
                z3 = true;
            }
            m(canvas, z2, z3);
            return;
        }
        if (E == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.b == 2) {
            z3 = true;
        }
        m(canvas, z, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int E = syb.E(this);
        int i5 = this.a;
        boolean z6 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (E == 1) {
                            z6 = true;
                        }
                        if (this.b == 2) {
                            z5 = !z6;
                        } else {
                            z5 = z6;
                        }
                        w(z5, true, i, i2, i3, i4);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.a);
                }
                if (E == 1) {
                    z6 = true;
                }
                if (this.b == 2) {
                    z4 = !z6;
                } else {
                    z4 = z6;
                }
                w(z4, false, i, i2, i3, i4);
                return;
            }
            if (E != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            v(z3, i, i2, i3, i4);
            return;
        }
        if (E == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        v(z2, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        if (this.o.O(this.n)) {
            this.m = this.o.m(this.n);
        }
        int i3 = this.a;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.a);
            }
            y(i, i2);
            return;
        }
        x(i, i2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View r(int i) {
        if (i >= 0) {
            int[] iArr = this.m;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        if (drawable != null) {
            this.k = drawable.getIntrinsicHeight();
        } else {
            this.k = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
        } else {
            this.l = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<b> list) {
        this.p = list;
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new c(this);
        this.p = new ArrayList();
        this.q = new c.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z19.b, i, 0);
        this.a = obtainStyledAttributes.getInt(z19.h, 0);
        this.b = obtainStyledAttributes.getInt(z19.i, 0);
        this.c = obtainStyledAttributes.getInt(z19.j, 0);
        this.d = obtainStyledAttributes.getInt(z19.d, 0);
        this.e = obtainStyledAttributes.getInt(z19.c, 0);
        this.f = obtainStyledAttributes.getInt(z19.k, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(z19.e);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(z19.f);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(z19.g);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(z19.l, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(z19.n, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(z19.m, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private int a;
        private float b;
        private float c;
        private int d;
        private float e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z19.o);
            this.a = obtainStyledAttributes.getInt(z19.x, 1);
            this.b = obtainStyledAttributes.getFloat(z19.r, 0.0f);
            this.c = obtainStyledAttributes.getFloat(z19.s, 1.0f);
            this.d = obtainStyledAttributes.getInt(z19.p, -1);
            this.e = obtainStyledAttributes.getFraction(z19.q, 1, 1, -1.0f);
            this.f = obtainStyledAttributes.getDimensionPixelSize(z19.w, -1);
            this.g = obtainStyledAttributes.getDimensionPixelSize(z19.v, -1);
            this.h = obtainStyledAttributes.getDimensionPixelSize(z19.u, 16777215);
            this.i = obtainStyledAttributes.getDimensionPixelSize(z19.t, 16777215);
            this.j = obtainStyledAttributes.getBoolean(z19.y, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public int F0() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int H1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int J1() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int P() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int P1() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float Q() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int T() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int e0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void e1(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int f1() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int i1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void l0(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float m0() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float r0() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean x0() {
            return this.j;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    @Override // com.google.android.flexbox.a
    public void i(int i, View view) {
    }
}
