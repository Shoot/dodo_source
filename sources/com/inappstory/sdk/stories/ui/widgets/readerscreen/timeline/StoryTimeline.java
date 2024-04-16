package com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class StoryTimeline extends View {
    StoryTimelineAppearance appearance;
    private Paint backgroundPaint;
    private Paint fillPaint;
    StoryTimelineManager timelineManager;

    public StoryTimeline(Context context) {
        super(context);
        this.timelineManager = new StoryTimelineManager();
        this.fillPaint = new Paint();
        this.backgroundPaint = new Paint();
        this.appearance = new StoryTimelineAppearance();
        setAppearance(new StoryTimelineAppearance().convertDpToPx(context));
    }

    private Pair<List<RectF>, List<Integer>> drawSegment(int i, StoryTimelineState storyTimelineState, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        float slidesCount = (f - ((storyTimelineState.getSlidesCount() - 1) * f3)) / storyTimelineState.getSlidesCount();
        float f4 = i;
        float f5 = (f4 * slidesCount) + (f4 * f3);
        float currentSlideProgress = (storyTimelineState.getCurrentSlideProgress() * slidesCount) + f5;
        float f6 = slidesCount + f5;
        StoryTimelineSegmentState storyTimelineSegmentState = StoryTimelineSegmentState.EMPTY;
        if (storyTimelineState.getCurrentSlideIndex() == i) {
            storyTimelineSegmentState = storyTimelineState.getCurrentSlideState();
        } else if (storyTimelineState.getCurrentSlideIndex() > i) {
            storyTimelineSegmentState = StoryTimelineSegmentState.FILLED;
        }
        if (storyTimelineSegmentState == StoryTimelineSegmentState.FILLED) {
            i2 = 0;
        }
        arrayList.add(new RectF(f5, 0.0f, f6, f2));
        arrayList2.add(Integer.valueOf(i2));
        if (storyTimelineSegmentState == StoryTimelineSegmentState.ANIMATED) {
            arrayList.add(new RectF(f5, 0.0f, currentSlideProgress, f2));
            arrayList2.add(0);
        }
        return new Pair<>(arrayList, arrayList2);
    }

    private void drawTimeline(StoryTimelineState storyTimelineState, float f, float f2, float f3, float f4, Canvas canvas) {
        Paint paint;
        if (storyTimelineState.isTimelineHidden()) {
            return;
        }
        for (int i = 0; i < storyTimelineState.getSlidesCount(); i++) {
            Pair<List<RectF>, List<Integer>> drawSegment = drawSegment(i, storyTimelineState, f, f2, f4);
            List list = (List) drawSegment.first;
            List list2 = (List) drawSegment.second;
            for (int i2 = 0; i2 < list.size(); i2++) {
                RectF rectF = (RectF) list.get(i2);
                if (((Integer) list2.get(i2)).intValue() == 0) {
                    paint = this.fillPaint;
                } else {
                    paint = this.backgroundPaint;
                }
                canvas.drawRoundRect(rectF, f3, f3, paint);
            }
        }
    }

    public StoryTimelineManager getTimelineManager() {
        return this.timelineManager;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        StoryTimelineState storyTimelineState = this.timelineManager.timelineState;
        float measuredWidth = getMeasuredWidth();
        StoryTimelineAppearance storyTimelineAppearance = this.appearance;
        drawTimeline(storyTimelineState, measuredWidth, storyTimelineAppearance.height, storyTimelineAppearance.cornerRadius, storyTimelineAppearance.gapWidth, canvas);
        invalidate();
    }

    public void setAppearance(StoryTimelineAppearance storyTimelineAppearance) {
        this.appearance = storyTimelineAppearance;
        this.fillPaint.setColor(storyTimelineAppearance.fillColor);
        this.backgroundPaint.setColor(storyTimelineAppearance.backgroundColor);
    }

    public StoryTimeline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.timelineManager = new StoryTimelineManager();
        this.fillPaint = new Paint();
        this.backgroundPaint = new Paint();
        this.appearance = new StoryTimelineAppearance();
        setAppearance(new StoryTimelineAppearance().convertDpToPx(context));
    }

    public StoryTimeline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.timelineManager = new StoryTimelineManager();
        this.fillPaint = new Paint();
        this.backgroundPaint = new Paint();
        this.appearance = new StoryTimelineAppearance();
        setAppearance(new StoryTimelineAppearance().convertDpToPx(context));
    }
}
