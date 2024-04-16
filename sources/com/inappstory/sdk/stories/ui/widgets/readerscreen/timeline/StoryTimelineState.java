package com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public class StoryTimelineState {
    private int currentSlideIndex;
    private float currentSlideProgress;
    private StoryTimelineSegmentState currentSlideState;
    private ArrayList<Integer> currentStoryDurations;
    private boolean hideTimeline;
    private final Object lock;
    private int slidesCount;
    private boolean timelineIsActive;

    public StoryTimelineState() {
        this.lock = new Object();
        this.timelineIsActive = false;
        this.slidesCount = 0;
        this.currentStoryDurations = new ArrayList<>();
        this.currentSlideProgress = 0.0f;
        this.currentSlideIndex = 0;
        this.currentSlideState = StoryTimelineSegmentState.EMPTY;
        this.hideTimeline = false;
    }

    public void clearTimelineProgress() {
        synchronized (this.lock) {
            this.currentSlideIndex = 0;
            this.currentSlideState = StoryTimelineSegmentState.EMPTY;
            this.currentSlideProgress = 0.0f;
        }
    }

    public int getCurrentSlideIndex() {
        int i;
        synchronized (this.lock) {
            i = this.currentSlideIndex;
        }
        return i;
    }

    public float getCurrentSlideProgress() {
        float f;
        synchronized (this.lock) {
            f = this.currentSlideProgress;
        }
        return f;
    }

    public StoryTimelineSegmentState getCurrentSlideState() {
        StoryTimelineSegmentState storyTimelineSegmentState;
        synchronized (this.lock) {
            storyTimelineSegmentState = this.currentSlideState;
        }
        return storyTimelineSegmentState;
    }

    public long getCurrentStoryDuration() {
        synchronized (this.lock) {
            try {
                int size = this.currentStoryDurations.size();
                int i = this.currentSlideIndex;
                if (size <= i) {
                    return 0L;
                }
                return this.currentStoryDurations.get(i).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ArrayList<Integer> getCurrentStoryDurations() {
        ArrayList<Integer> arrayList;
        synchronized (this.lock) {
            arrayList = this.currentStoryDurations;
        }
        return arrayList;
    }

    public int getSlidesCount() {
        int i;
        synchronized (this.lock) {
            i = this.slidesCount;
        }
        return i;
    }

    public boolean isTimelineHidden() {
        boolean z;
        synchronized (this.lock) {
            z = this.hideTimeline;
        }
        return z;
    }

    public void setCurrentSlideIndex(int i) {
        synchronized (this.lock) {
            this.currentSlideIndex = i;
            this.currentSlideProgress = 0.0f;
            this.currentSlideState = StoryTimelineSegmentState.EMPTY;
        }
    }

    public void setCurrentSlideProgress(float f) {
        synchronized (this.lock) {
            this.currentSlideProgress = f;
        }
    }

    public void setCurrentSlideState(StoryTimelineSegmentState storyTimelineSegmentState) {
        synchronized (this.lock) {
            try {
                this.currentSlideState = storyTimelineSegmentState;
                if (storyTimelineSegmentState == StoryTimelineSegmentState.EMPTY) {
                    this.currentSlideProgress = 0.0f;
                } else if (storyTimelineSegmentState == StoryTimelineSegmentState.FILLED) {
                    this.currentSlideProgress = 1.0f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCurrentStoryDurations(ArrayList<Integer> arrayList) {
        synchronized (this.lock) {
            try {
                this.currentStoryDurations = arrayList;
                this.slidesCount = arrayList.size();
                boolean z = true;
                if (arrayList.isEmpty()) {
                    this.hideTimeline = true;
                } else if (arrayList.size() == 1) {
                    if (arrayList.get(0).intValue() != 0) {
                        z = false;
                    }
                    this.hideTimeline = z;
                } else {
                    this.hideTimeline = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSlidesCount(int i) {
        synchronized (this.lock) {
            this.slidesCount = i;
        }
    }

    public void setTimelineIsActive(boolean z) {
        synchronized (this.lock) {
            this.timelineIsActive = z;
        }
    }

    public boolean timelineIsActive() {
        boolean z;
        synchronized (this.lock) {
            z = this.timelineIsActive;
        }
        return z;
    }

    public StoryTimelineState(boolean z, int i, ArrayList<Integer> arrayList, float f, int i2, StoryTimelineSegmentState storyTimelineSegmentState) {
        this.lock = new Object();
        this.timelineIsActive = false;
        this.slidesCount = 0;
        this.currentStoryDurations = new ArrayList<>();
        this.currentSlideProgress = 0.0f;
        this.currentSlideIndex = 0;
        this.currentSlideState = StoryTimelineSegmentState.EMPTY;
        this.hideTimeline = false;
        synchronized (this) {
            this.timelineIsActive = z;
            this.slidesCount = i;
            this.currentStoryDurations = arrayList;
            this.currentSlideProgress = f;
            this.currentSlideIndex = i2;
            this.currentSlideState = storyTimelineSegmentState;
        }
    }
}
