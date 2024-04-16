package ru.dodopizza.app.infrastracture.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.appbar.AppBarLayout;
import im.threads.business.transport.MessageAttributes;
import java.lang.reflect.Field;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AppBarLayoutBehavior.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J@\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0013H\u0016JH\u0010(\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J8\u0010-\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J(\u00100\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lru/dodopizza/app/infrastracture/utils/AppBarLayoutBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "flingRunnableField", "", "isFlinging", "", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "mFlingRunnableField", "mScrollerField", "scrollerField", "shouldBlockNestedScroll", "typeFling", "", "getFlingRunnableField", "Ljava/lang/reflect/Field;", "getScrollerField", "onInterceptTouchEvent", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Lcom/google/android/material/appbar/AppBarLayout;", "ev", "Landroid/view/MotionEvent;", "onNestedPreScroll", "", "coordinatorLayout", "target", "Landroid/view/View;", "dx", "dy", "consumed", "", MessageAttributes.TYPE, "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onStartNestedScroll", "directTargetChild", "nestedScrollAxes", "onStopNestedScroll", "abl", "stopAppbarLayoutFling", "appBarLayout", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppBarLayoutBehavior extends AppBarLayout.Behavior {
    private final String flingRunnableField;
    private boolean isFlinging;
    private final Logger logger;
    private final String mFlingRunnableField;
    private final String mScrollerField;
    private final String scrollerField;
    private boolean shouldBlockNestedScroll;
    private final int typeFling;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attrs");
        this.typeFling = 1;
        this.mFlingRunnableField = "mFlingRunnable";
        this.flingRunnableField = "flingRunnable";
        this.mScrollerField = "mScroller";
        this.scrollerField = "scroller";
        this.logger = LoggerFactory.getLogger("AppBarLayoutBehavior");
    }

    private final Field getFlingRunnableField() throws NoSuchFieldException {
        Class superclass;
        Class superclass2;
        Class superclass3;
        try {
            Class superclass4 = AppBarLayoutBehavior.class.getSuperclass();
            if (superclass4 == null || (superclass3 = superclass4.getSuperclass()) == null) {
                return null;
            }
            return superclass3.getDeclaredField(this.mFlingRunnableField);
        } catch (NoSuchFieldException unused) {
            Class superclass5 = AppBarLayoutBehavior.class.getSuperclass();
            if (superclass5 == null || (superclass = superclass5.getSuperclass()) == null || (superclass2 = superclass.getSuperclass()) == null) {
                return null;
            }
            return superclass2.getDeclaredField(this.flingRunnableField);
        }
    }

    private final Field getScrollerField() throws NoSuchFieldException {
        Class superclass;
        Class superclass2;
        Class superclass3;
        try {
            Class superclass4 = AppBarLayoutBehavior.class.getSuperclass();
            if (superclass4 == null || (superclass3 = superclass4.getSuperclass()) == null) {
                return null;
            }
            return superclass3.getDeclaredField(this.mScrollerField);
        } catch (NoSuchFieldException unused) {
            Class superclass5 = AppBarLayoutBehavior.class.getSuperclass();
            if (superclass5 == null || (superclass = superclass5.getSuperclass()) == null || (superclass2 = superclass.getSuperclass()) == null) {
                return null;
            }
            return superclass2.getDeclaredField(this.scrollerField);
        }
    }

    private final void stopAppbarLayoutFling(AppBarLayout appBarLayout) {
        Object obj;
        Runnable runnable;
        Object obj2;
        try {
            Field flingRunnableField = getFlingRunnableField();
            OverScroller overScroller = null;
            if (flingRunnableField != null) {
                flingRunnableField.setAccessible(true);
            } else {
                flingRunnableField = null;
            }
            Field scrollerField = getScrollerField();
            if (scrollerField != null) {
                scrollerField.setAccessible(true);
            } else {
                scrollerField = null;
            }
            if (flingRunnableField != null) {
                obj = flingRunnableField.get(this);
            } else {
                obj = null;
            }
            if (obj instanceof Runnable) {
                runnable = (Runnable) obj;
            } else {
                runnable = null;
            }
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                flingRunnableField.set(this, null);
            }
            if (scrollerField != null) {
                obj2 = scrollerField.get(this);
            } else {
                obj2 = null;
            }
            if (obj2 instanceof OverScroller) {
                overScroller = (OverScroller) obj2;
            }
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
        } catch (IllegalStateException e) {
            this.logger.error("IllegalStateException: " + e);
        } catch (NoSuchFieldException e2) {
            this.logger.error("No such field: " + e2);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        z65.h(coordinatorLayout, "parent");
        z65.h(appBarLayout, "child");
        z65.h(motionEvent, "ev");
        this.shouldBlockNestedScroll = this.isFlinging;
        if (motionEvent.getActionMasked() == 0) {
            stopAppbarLayoutFling(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, (View) appBarLayout, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        z65.h(coordinatorLayout, "coordinatorLayout");
        z65.h(appBarLayout, "child");
        z65.h(view, "target");
        z65.h(iArr, "consumed");
        if (i3 == this.typeFling) {
            this.isFlinging = true;
        }
        if (this.shouldBlockNestedScroll) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        z65.h(coordinatorLayout, "coordinatorLayout");
        z65.h(appBarLayout, "child");
        z65.h(view, "target");
        if (this.shouldBlockNestedScroll) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, i3, i4, i5);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        z65.h(coordinatorLayout, "parent");
        z65.h(appBarLayout, "child");
        z65.h(view, "directTargetChild");
        z65.h(view2, "target");
        stopAppbarLayoutFling(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        z65.h(coordinatorLayout, "coordinatorLayout");
        z65.h(appBarLayout, "abl");
        z65.h(view, "target");
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.isFlinging = false;
        this.shouldBlockNestedScroll = false;
    }
}
