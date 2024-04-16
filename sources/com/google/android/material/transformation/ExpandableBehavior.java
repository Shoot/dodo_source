package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private int a;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ View a;
        final /* synthetic */ int b;
        final /* synthetic */ dn3 c;

        a(View view, int i, dn3 dn3Var) {
            this.a = view;
            this.b = i;
            this.c = dn3Var;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                dn3 dn3Var = this.c;
                expandableBehavior.d((View) dn3Var, this.a, dn3Var.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    private boolean b(boolean z) {
        if (z) {
            int i = this.a;
            if (i != 0 && i != 2) {
                return false;
            }
            return true;
        } else if (this.a != 1) {
            return false;
        } else {
            return true;
        }
    }

    protected dn3 c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> l = coordinatorLayout.l(view);
        int size = l.size();
        for (int i = 0; i < size; i++) {
            View view2 = l.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (dn3) view2;
            }
        }
        return null;
    }

    protected abstract boolean d(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        dn3 dn3Var = (dn3) view2;
        if (b(dn3Var.a())) {
            if (dn3Var.a()) {
                i = 1;
            } else {
                i = 2;
            }
            this.a = i;
            return d((View) dn3Var, view, dn3Var.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        dn3 c;
        int i2;
        if (!syb.Y(view) && (c = c(coordinatorLayout, view)) != null && b(c.a())) {
            if (c.a()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.a = i2;
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, c));
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
