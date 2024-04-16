package com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.ui.reader.BothSideViewPager;
import com.inappstory.sdk.stories.ui.reader.StoriesFragment;
import com.inappstory.sdk.stories.ui.widgets.viewpagertransforms.CoverTransformer;
import com.inappstory.sdk.stories.ui.widgets.viewpagertransforms.CubeTransformer;
import com.inappstory.sdk.stories.ui.widgets.viewpagertransforms.DepthTransformer;
/* loaded from: classes3.dex */
public class ReaderPager extends BothSideViewPager {
    public boolean canUseNotLoaded;
    boolean closeOnSwipe;
    public boolean cubeAnimation;
    StoriesFragment host;
    private float pressedX;
    private float pressedY;
    boolean startMove;
    private int transformAnimation;
    public static ViewPager.k cubeTransformer = new CubeTransformer();
    public static ViewPager.k depthTransformer = new DepthTransformer();
    public static ViewPager.k coverTransformer = new CoverTransformer();

    public ReaderPager(@NonNull Context context) {
        super(context);
        this.cubeAnimation = false;
        init(context);
    }

    private void init(@NonNull Context context) {
        setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return (i - super.getChildDrawingOrder(i, i2)) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void pageScrolled(float f) {
        if (f == 0.0f) {
            this.cubeAnimation = false;
            requestDisallowInterceptTouchEvent(false);
            return;
        }
        this.cubeAnimation = true;
        requestDisallowInterceptTouchEvent(true);
    }

    public void setHost(StoriesFragment storiesFragment) {
        this.host = storiesFragment;
    }

    public void setParameters(int i) {
        this.transformAnimation = i;
        init();
    }

    public void setTransformAnimation(int i) {
        this.transformAnimation = i;
    }

    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            getContext().obtainStyledAttributes(attributeSet, R.styleable.ReaderPager);
        }
    }

    public ReaderPager(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cubeAnimation = false;
        init(context);
    }

    public void init() {
        int i = this.transformAnimation;
        if (i == 1) {
            setChildrenDrawingOrderEnabled(true);
            setPageTransformer(true, depthTransformer);
        } else if (i == 3) {
            setChildrenDrawingOrderEnabled(true);
            setPageTransformer(true, coverTransformer);
        } else if (i != 4) {
            setChildrenDrawingOrderEnabled(false);
            setPageTransformer(true, cubeTransformer);
        }
    }
}
