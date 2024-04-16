package com.inappstory.sdk.stories.ui.widgets.elasticview;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.api.models.Story;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ElasticDragDismissFrameLayout extends FrameLayout {
    private List<ElasticDragDismissCallback> callbacks;
    private float dragDismissDistance;
    private float dragDismissFraction;
    private float dragDismissScale;
    private float dragElacticity;
    private boolean draggingDown;
    private boolean draggingUp;
    boolean isPaused;
    private int mLastActionEvent;
    private boolean shouldScale;
    private float totalDisabledDrag;
    private float totalDrag;
    public Story.StoryType type;

    public ElasticDragDismissFrameLayout(@NonNull Context context) {
        super(context);
        this.dragDismissDistance = Float.MAX_VALUE;
        this.dragDismissFraction = -1.0f;
        this.dragDismissScale = 1.0f;
        this.shouldScale = false;
        this.dragElacticity = 0.8f;
        this.draggingDown = false;
        this.draggingUp = false;
        this.isPaused = false;
        this.type = Story.StoryType.COMMON;
        init(null);
    }

    private void disabledDragScale(int i) {
        if (i == 0) {
            return;
        }
        this.totalDisabledDrag += i;
    }

    private void dispatchDismissCallback() {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && !list.isEmpty()) {
            for (ElasticDragDismissCallback elasticDragDismissCallback : this.callbacks) {
                if (elasticDragDismissCallback != null) {
                    elasticDragDismissCallback.onDragDismissed();
                }
            }
        }
    }

    private void dispatchDragCallback(float f, float f2, float f3, float f4) {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && !list.isEmpty()) {
            for (ElasticDragDismissCallback elasticDragDismissCallback : this.callbacks) {
                if (elasticDragDismissCallback != null) {
                    elasticDragDismissCallback.onDrag(f, f2, f3, f4);
                }
            }
        }
    }

    private void dispatchDropCallback() {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && !list.isEmpty()) {
            for (ElasticDragDismissCallback elasticDragDismissCallback : this.callbacks) {
                if (elasticDragDismissCallback != null) {
                    elasticDragDismissCallback.onDragDropped();
                }
            }
        }
    }

    private void dragScale(int i) {
        if (i == 0) {
            return;
        }
        this.totalDrag += i;
        float f = 0.0f;
        if (i < 0 && !this.draggingUp && !this.draggingDown) {
            this.draggingDown = true;
            if (this.shouldScale) {
                setPivotY(getHeight());
            }
        } else if (i > 0 && !this.draggingDown && !this.draggingUp) {
            this.draggingUp = true;
            if (this.shouldScale) {
                setPivotY(0.0f);
            }
        }
        float log10 = (float) Math.log10((Math.abs(this.totalDrag) / this.dragDismissDistance) + 1.0f);
        float f2 = this.dragDismissDistance * log10 * this.dragElacticity;
        if (this.draggingUp) {
            f2 *= -1.0f;
        }
        setTranslationY(f2);
        if (this.shouldScale) {
            float f3 = 1.0f - ((1.0f - this.dragDismissScale) * log10);
            setScaleX(f3);
            setScaleY(f3);
        }
        if ((this.draggingDown && this.totalDrag >= 0.0f) || (this.draggingUp && this.totalDrag <= 0.0f)) {
            this.totalDisabledDrag = 0.0f;
            this.totalDrag = 0.0f;
            this.draggingUp = false;
            this.draggingDown = false;
            setTranslationY(0.0f);
            setScaleX(1.0f);
            setScaleY(1.0f);
            f2 = 0.0f;
        } else {
            f = log10;
        }
        dispatchDragCallback(f, f2, Math.min(1.0f, Math.abs(this.totalDrag) / this.dragDismissDistance), this.totalDrag);
    }

    private void swipeDownCallback() {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && !list.isEmpty()) {
            for (ElasticDragDismissCallback elasticDragDismissCallback : this.callbacks) {
                if (elasticDragDismissCallback != null) {
                    elasticDragDismissCallback.swipeDown();
                }
            }
        }
    }

    private void swipeUpCallback() {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && !list.isEmpty()) {
            for (ElasticDragDismissCallback elasticDragDismissCallback : this.callbacks) {
                if (elasticDragDismissCallback != null) {
                    elasticDragDismissCallback.swipeUp();
                }
            }
        }
    }

    private void touchPause() {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && !list.isEmpty()) {
            for (ElasticDragDismissCallback elasticDragDismissCallback : this.callbacks) {
                if (elasticDragDismissCallback != null) {
                    elasticDragDismissCallback.touchPause();
                }
            }
        }
    }

    private void touchResume() {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && !list.isEmpty()) {
            for (ElasticDragDismissCallback elasticDragDismissCallback : this.callbacks) {
                if (elasticDragDismissCallback != null) {
                    elasticDragDismissCallback.touchResume();
                }
            }
        }
    }

    public void addListener(ElasticDragDismissCallback elasticDragDismissCallback) {
        if (this.callbacks == null) {
            this.callbacks = new ArrayList();
        }
        this.callbacks.add(elasticDragDismissCallback);
    }

    public void init(AttributeSet attributeSet) {
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ElasticDragDismissFrameLayout, 0, 0);
        int i = R.styleable.ElasticDragDismissFrameLayout_dragDismissDistance;
        if (obtainStyledAttributes.hasValue(i)) {
            this.dragDismissDistance = obtainStyledAttributes.getDimensionPixelSize(i, 0);
        } else {
            int i2 = R.styleable.ElasticDragDismissFrameLayout_dragDismissFraction;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.dragDismissFraction = obtainStyledAttributes.getFloat(i2, this.dragDismissFraction);
            }
        }
        int i3 = R.styleable.ElasticDragDismissFrameLayout_dragDismissScale;
        if (obtainStyledAttributes.hasValue(i3)) {
            float f = obtainStyledAttributes.getFloat(i3, this.dragDismissScale);
            this.dragDismissScale = f;
            if (f != 1.0f) {
                z = true;
            }
            this.shouldScale = z;
        }
        int i4 = R.styleable.ElasticDragDismissFrameLayout_dragElasticity;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.dragElacticity = obtainStyledAttributes.getFloat(i4, this.dragElacticity);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        this.mLastActionEvent = action;
        if (action == 2) {
            if (!this.isPaused) {
                this.isPaused = true;
            }
            touchPause();
        } else if (action == 1 || action == 3) {
            if (this.isPaused) {
                this.isPaused = false;
            }
            touchResume();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type);
        if ((this.draggingDown && i2 > 0) || (this.draggingUp && i2 < 0)) {
            if (storyById != null && (storyById.disableClose || storyById.hasSwipeUp())) {
                disabledDragScale(i2);
                return;
            }
            dragScale(i2);
            iArr[1] = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type);
        if (storyById != null && (storyById.disableClose || storyById.hasSwipeUp())) {
            disabledDragScale(i4);
        } else {
            dragScale(i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.dragDismissFraction;
        if (f > 0.0f) {
            this.dragDismissDistance = i2 * f;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type);
        float f = this.totalDisabledDrag;
        if (f > 400.0f) {
            swipeUpCallback();
        } else if (storyById != null && !storyById.disableClose && f < -400.0f) {
            swipeDownCallback();
        }
        if (Math.abs(this.totalDrag) >= this.dragDismissDistance && storyById != null && !storyById.disableClose && !storyById.hasSwipeUp()) {
            dispatchDismissCallback();
            return;
        }
        int i = this.mLastActionEvent;
        if (i == 0) {
            setTranslationY(0.0f);
            setScaleX(1.0f);
            setScaleY(1.0f);
        } else {
            if (i == 2) {
                this.isPaused = false;
                touchResume();
            }
            animate().translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(AnimUtils.getFastOutSlowInInterpolator(getContext())).setListener(null).start();
        }
        this.totalDrag = 0.0f;
        this.totalDisabledDrag = 0.0f;
        this.draggingUp = false;
        this.draggingDown = false;
        dispatchDragCallback(0.0f, 0.0f, 0.0f, 0.0f);
        dispatchDropCallback();
    }

    public void removeListener(ElasticDragDismissCallback elasticDragDismissCallback) {
        List<ElasticDragDismissCallback> list = this.callbacks;
        if (list != null && list.size() > 0) {
            this.callbacks.remove(elasticDragDismissCallback);
        }
    }

    public ElasticDragDismissFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dragDismissDistance = Float.MAX_VALUE;
        this.dragDismissFraction = -1.0f;
        this.dragDismissScale = 1.0f;
        this.shouldScale = false;
        this.dragElacticity = 0.8f;
        this.draggingDown = false;
        this.draggingUp = false;
        this.isPaused = false;
        this.type = Story.StoryType.COMMON;
        init(attributeSet);
    }

    public ElasticDragDismissFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dragDismissDistance = Float.MAX_VALUE;
        this.dragDismissFraction = -1.0f;
        this.dragDismissScale = 1.0f;
        this.shouldScale = false;
        this.dragElacticity = 0.8f;
        this.draggingDown = false;
        this.draggingUp = false;
        this.isPaused = false;
        this.type = Story.StoryType.COMMON;
        init(attributeSet);
    }

    public ElasticDragDismissFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.dragDismissDistance = Float.MAX_VALUE;
        this.dragDismissFraction = -1.0f;
        this.dragDismissScale = 1.0f;
        this.shouldScale = false;
        this.dragElacticity = 0.8f;
        this.draggingDown = false;
        this.draggingUp = false;
        this.isPaused = false;
        this.type = Story.StoryType.COMMON;
        init(attributeSet);
    }

    /* loaded from: classes3.dex */
    public static abstract class ElasticDragDismissCallback {
        void onDragDismissed() {
        }

        void onDragDropped() {
        }

        void swipeDown() {
        }

        void swipeUp() {
        }

        void touchPause() {
        }

        void touchResume() {
        }

        void onDrag(float f, float f2, float f3, float f4) {
        }
    }

    /* loaded from: classes3.dex */
    public static class SystemChromeFader extends ElasticDragDismissCallback {
        private final Activity activity;
        private final boolean fadeNavBar;
        private final int navBarAlpha;
        private final int statusBarAlpha;

        public SystemChromeFader(Activity activity) {
            this.activity = activity;
            this.statusBarAlpha = Color.alpha(activity.getWindow().getStatusBarColor());
            this.navBarAlpha = Color.alpha(activity.getWindow().getNavigationBarColor());
            this.fadeNavBar = ViewUtils.isNavBarOnBottom(activity);
        }

        public void onDrag(float f, float f2, float f3, float f4) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i > 0) {
                this.activity.getWindow().setStatusBarColor(ColorUtils.modifyAlpha(this.activity.getWindow().getStatusBarColor(), (int) ((1.0f - f3) * this.statusBarAlpha)));
            } else if (i == 0) {
                this.activity.getWindow().setStatusBarColor(ColorUtils.modifyAlpha(this.activity.getWindow().getStatusBarColor(), this.statusBarAlpha));
                this.activity.getWindow().setNavigationBarColor(ColorUtils.modifyAlpha(this.activity.getWindow().getNavigationBarColor(), this.navBarAlpha));
            } else if (this.fadeNavBar) {
                this.activity.getWindow().setNavigationBarColor(ColorUtils.modifyAlpha(this.activity.getWindow().getNavigationBarColor(), (int) ((1.0f - f3) * this.navBarAlpha)));
            }
        }

        public void onDragDismissed() {
            this.activity.finishAfterTransition();
        }

        public void onDragDropped() {
        }

        public void swipeDown() {
        }

        public void swipeUp() {
        }

        public void touchPause() {
        }

        public void touchResume() {
        }
    }
}
