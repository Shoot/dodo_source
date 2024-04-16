package com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class StoryTimelineManager implements IStoryTimelineManager {
    private TimelineCallback timelineCallback;
    StoryTimelineState timelineState = new StoryTimelineState();
    private ArrayList<Integer> startedDurations = new ArrayList<>();
    private long resumedTime = System.currentTimeMillis();
    private long startedTime = System.currentTimeMillis();
    private long restTime = 0;
    boolean paused = false;
    Handler handler = new Handler();
    Runnable loopedTimer = new a();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoryTimelineManager storyTimelineManager = StoryTimelineManager.this;
            if (storyTimelineManager.paused || !storyTimelineManager.timelineState.timelineIsActive()) {
                return;
            }
            if (StoryTimelineManager.this.timelineState.getCurrentStoryDurations().size() > 0 && StoryTimelineManager.this.timelineState.getCurrentStoryDuration() > 0 && StoryTimelineManager.this.timelineState.getCurrentSlideState() == StoryTimelineSegmentState.ANIMATED) {
                long currentTimeMillis = System.currentTimeMillis() - StoryTimelineManager.this.resumedTime;
                if (currentTimeMillis <= StoryTimelineManager.this.restTime) {
                    StoryTimelineManager.this.updateProgress(currentTimeMillis);
                } else {
                    StoryTimelineManager.this.next();
                }
            }
            StoryTimelineManager storyTimelineManager2 = StoryTimelineManager.this;
            if (!storyTimelineManager2.paused && storyTimelineManager2.timelineState.timelineIsActive()) {
                StoryTimelineManager.this.clearAndPost(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndPost(Runnable runnable) {
        try {
            this.handler.removeCallbacks(runnable);
        } catch (Exception unused) {
        }
        this.handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress(long j) {
        if (this.paused) {
            return;
        }
        this.timelineState.setCurrentSlideProgress(Math.max(0.0f, Math.min(1.0f, 1.0f - ((((float) (this.restTime - j)) * 1.0f) / ((float) this.timelineState.getCurrentStoryDuration())))));
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void active(boolean z) {
        if (this.timelineState.timelineIsActive() == z) {
            return;
        }
        this.timelineState.setTimelineIsActive(z);
        if (z) {
            clearAndPost(this.loopedTimer);
            return;
        }
        this.handler.removeCallbacks(this.loopedTimer);
        stop();
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void clear() {
        this.timelineState.clearTimelineProgress();
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void next() {
        this.timelineState.setCurrentSlideState(StoryTimelineSegmentState.FILLED);
        TimelineCallback timelineCallback = this.timelineCallback;
        if (timelineCallback != null) {
            timelineCallback.nextSlide(this.timelineState.getCurrentSlideIndex() + 1);
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void pause() {
        this.paused = true;
        this.handler.removeCallbacks(this.loopedTimer);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void prev() {
        if (this.timelineState.getCurrentSlideIndex() > 0) {
            startSegment(this.timelineState.getCurrentSlideIndex() - 1);
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void resetDurations() {
        this.timelineState.setCurrentStoryDurations(new ArrayList<>(this.startedDurations));
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void resume() {
        this.resumedTime = System.currentTimeMillis();
        if (!this.paused) {
            return;
        }
        this.paused = false;
        this.restTime = (1.0f - this.timelineState.getCurrentSlideProgress()) * ((float) this.timelineState.getCurrentStoryDuration());
        clearAndPost(this.loopedTimer);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void setDurations(List<Integer> list, boolean z) {
        if (z) {
            this.startedDurations = new ArrayList<>(list);
        }
        this.timelineState.setCurrentStoryDurations(new ArrayList<>(list));
    }

    public void setNextTimelineCallback(TimelineCallback timelineCallback) {
        this.timelineCallback = timelineCallback;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void setSegment(int i) {
        if (i <= this.timelineState.getCurrentStoryDurations().size() - 1 && i >= 0) {
            this.timelineState.setCurrentSlideIndex(i);
            this.timelineState.setCurrentSlideState(StoryTimelineSegmentState.EMPTY);
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void setSlidesCount(int i) {
        this.timelineState.setSlidesCount(i);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void startSegment(int i) {
        if (!this.paused && i <= this.timelineState.getCurrentStoryDurations().size() - 1 && i >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.resumedTime = currentTimeMillis;
            this.startedTime = currentTimeMillis;
            this.timelineState.setCurrentSlideIndex(i);
            long currentStoryDuration = this.timelineState.getCurrentStoryDuration();
            this.restTime = currentStoryDuration;
            if (currentStoryDuration > 0) {
                this.timelineState.setCurrentSlideState(StoryTimelineSegmentState.ANIMATED);
            }
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.IStoryTimelineManager
    public void stop() {
        this.timelineState.setCurrentSlideState(StoryTimelineSegmentState.EMPTY);
    }
}
