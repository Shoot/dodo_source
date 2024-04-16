package im.threads.ui.views;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.threads.R;
/* loaded from: classes3.dex */
public final class MySwipeRefreshLayout extends SwipeRefreshLayout {
    private static final int SWIPE_MIN_DISTANCE = 100;
    private static final float SWIPE_MIN_VELOCITY = 4.5f;
    private static final int SWIPE_X_MIN_DISTANCE = 350;
    private static final int SWIPE_Y_MAX_DISTANCE = 500;
    private float initX;
    private float initY;
    private int mActivePointerId;
    private SwipeListener mSwipeListener;
    int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private RecyclerView nestedRecyclerView;
    private boolean selfCancelled;

    /* loaded from: classes3.dex */
    public interface SwipeListener {
        void onSwipe();
    }

    public MySwipeRefreshLayout(Context context) {
        super(context);
        this.selfCancelled = false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public boolean canChildScrollUp() {
        return isRefreshing();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SwipeListener swipeListener;
        if (this.nestedRecyclerView == null) {
            this.nestedRecyclerView = (RecyclerView) findViewById(R.id.chatItemsRecycler);
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.mVelocityTracker.addMovement(motionEvent);
                    this.mVelocityTracker.computeCurrentVelocity(1);
                    float abs = Math.abs(this.initY - motionEvent.getY());
                    float xVelocity = this.mVelocityTracker.getXVelocity(motionEvent.getPointerId(0));
                    float yVelocity = this.mVelocityTracker.getYVelocity(motionEvent.getPointerId(0));
                    if (Math.abs(xVelocity) > 1.0f && Math.abs(yVelocity) < 1.0f && abs < 50.0f && this.initX < motionEvent.getX()) {
                        SwipeListener swipeListener2 = this.mSwipeListener;
                        if (swipeListener2 != null) {
                            swipeListener2.onSwipe();
                        }
                        this.mVelocityTracker.clear();
                    }
                }
            } else {
                float f = this.initX;
                if (f != -1.0f && this.initY != -1.0f && this.mActivePointerId != -1) {
                    float abs2 = Math.abs(f - motionEvent.getX());
                    float abs3 = Math.abs(this.initY - motionEvent.getY());
                    if (abs2 >= 350.0f && abs3 <= 500.0f) {
                        this.mVelocityTracker.computeCurrentVelocity(1);
                        float xVelocity2 = this.mVelocityTracker.getXVelocity(motionEvent.getPointerId(0));
                        float yVelocity2 = this.mVelocityTracker.getYVelocity(motionEvent.getPointerId(0));
                        if (xVelocity2 > SWIPE_MIN_VELOCITY && abs2 > 100.0f && yVelocity2 < 1.0f && this.initX < motionEvent.getX() && (swipeListener = this.mSwipeListener) != null) {
                            swipeListener.onSwipe();
                        }
                        this.mVelocityTracker.clear();
                    } else {
                        this.mVelocityTracker.clear();
                    }
                } else {
                    this.mVelocityTracker.clear();
                }
            }
        } else {
            this.initX = motionEvent.getX();
            this.initY = motionEvent.getY();
            this.mActivePointerId = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.mVelocityTracker = obtain;
            obtain.addMovement(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        if (isRefreshing()) {
            clearAnimation();
            setRefreshing(false);
            this.selfCancelled = true;
        }
        return super.onSaveInstanceState();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isRefreshing() && super.onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.selfCancelled) {
            setRefreshing(true);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        super.setRefreshing(z);
        this.selfCancelled = false;
    }

    public void setSwipeListener(SwipeListener swipeListener) {
        this.mSwipeListener = swipeListener;
    }

    public MySwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.selfCancelled = false;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
