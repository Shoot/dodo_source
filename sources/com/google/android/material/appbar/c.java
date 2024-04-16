package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private d viewOffsetHelper;

    public c() {
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    public int getLeftAndRightOffset() {
        d dVar = this.viewOffsetHelper;
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        d dVar = this.viewOffsetHelper;
        if (dVar != null) {
            return dVar.d();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        d dVar = this.viewOffsetHelper;
        if (dVar != null && dVar.e()) {
            return true;
        }
        return false;
    }

    public boolean isVerticalOffsetEnabled() {
        d dVar = this.viewOffsetHelper;
        if (dVar != null && dVar.f()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.C(v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new d(v);
        }
        this.viewOffsetHelper.g();
        this.viewOffsetHelper.a();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.j(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 != 0) {
            this.viewOffsetHelper.i(i3);
            this.tempLeftRightOffset = 0;
            return true;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        d dVar = this.viewOffsetHelper;
        if (dVar != null) {
            dVar.h(z);
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        d dVar = this.viewOffsetHelper;
        if (dVar != null) {
            return dVar.i(i);
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        d dVar = this.viewOffsetHelper;
        if (dVar != null) {
            return dVar.j(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        d dVar = this.viewOffsetHelper;
        if (dVar != null) {
            dVar.k(z);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }
}
