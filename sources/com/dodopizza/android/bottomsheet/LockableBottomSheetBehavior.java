package com.dodopizza.android.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: LockableBottomSheetBehavior.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0016¢\u0006\u0004\b*\u0010+B\u0019\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b*\u00100J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ?\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00061"}, d2 = {"Lcom/dodopizza/android/bottomsheet/LockableBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onTouchEvent", "coordinatorLayout", "directTargetChild", "target", "", "axes", MessageAttributes.TYPE, "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V", "", "velocityX", "velocityY", "onNestedPreFling", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "e0", "Z", "getSwipeEnabled", "()Z", "s0", "(Z)V", "swipeEnabled", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LockableBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    private boolean e0;

    public LockableBottomSheetBehavior() {
        this.e0 = true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        z65.h(coordinatorLayout, "parent");
        z65.h(v, "child");
        z65.h(motionEvent, "event");
        if (this.e0) {
            return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        z65.h(coordinatorLayout, "coordinatorLayout");
        z65.h(v, "child");
        z65.h(view, "target");
        if (this.e0) {
            return super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        z65.h(coordinatorLayout, "coordinatorLayout");
        z65.h(v, "child");
        z65.h(view, "target");
        z65.h(iArr, "consumed");
        if (this.e0) {
            super.onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr, i3);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        z65.h(coordinatorLayout, "coordinatorLayout");
        z65.h(v, "child");
        z65.h(view, "directTargetChild");
        z65.h(view2, "target");
        if (this.e0) {
            return super.onStartNestedScroll(coordinatorLayout, v, view, view2, i, i2);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        z65.h(coordinatorLayout, "coordinatorLayout");
        z65.h(v, "child");
        z65.h(view, "target");
        if (this.e0) {
            super.onStopNestedScroll(coordinatorLayout, v, view, i);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        z65.h(coordinatorLayout, "parent");
        z65.h(v, "child");
        z65.h(motionEvent, "event");
        if (this.e0) {
            return super.onTouchEvent(coordinatorLayout, v, motionEvent);
        }
        return false;
    }

    public final void s0(boolean z) {
        this.e0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attrs");
        this.e0 = true;
    }
}
