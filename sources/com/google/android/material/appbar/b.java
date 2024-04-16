package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes2.dex */
public abstract class b extends c<View> {
    final Rect a;
    final Rect b;
    private int c;
    private int d;

    public b() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    private static int g(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    abstract View a(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(View view) {
        if (this.d == 0) {
            return 0;
        }
        float c = c(view);
        int i = this.d;
        return na6.b((int) (c * i), 0, i);
    }

    float c(View view) {
        return 1.0f;
    }

    public final int d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f() {
        return this.c;
    }

    public final void h(int i) {
        this.d = i;
    }

    protected boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View a = a(coordinatorLayout.l(view));
        if (a != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, a.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            c5c lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && syb.B(coordinatorLayout) && !syb.B(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.b;
            ii4.a(g(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int b = b(a);
            view.layout(rect2.left, rect2.top - b, rect2.right, rect2.bottom - b);
            this.c = rect2.top - a.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
        View a;
        int i5;
        c5c lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (a = a(coordinatorLayout.l(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (syb.B(a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.l() + lastWindowInsets.i();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int e = size + e(a);
            int measuredHeight = a.getMeasuredHeight();
            if (i()) {
                view.setTranslationY(-measuredHeight);
            } else {
                e -= measuredHeight;
            }
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            coordinatorLayout.D(view, i, i2, View.MeasureSpec.makeMeasureSpec(e, i5), i4);
            return true;
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
