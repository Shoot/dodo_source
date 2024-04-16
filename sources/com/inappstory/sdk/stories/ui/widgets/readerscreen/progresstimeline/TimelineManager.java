package com.inappstory.sdk.stories.ui.widgets.readerscreen.progresstimeline;

import android.os.Handler;
import android.os.Looper;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPageManager;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class TimelineManager {
    int activeInd = 0;
    List<Integer> durations;
    private long mAnimationRest;
    public ReaderPageManager pageManager;
    Timeline timeline;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: com.inappstory.sdk.stories.ui.widgets.readerscreen.progresstimeline.TimelineManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0269a implements Runnable {
            RunnableC0269a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                try {
                    TimelineProgressBar timelineProgressBar = TimelineManager.this.timeline.getProgressBars().get(TimelineManager.this.activeInd);
                    int i2 = 0;
                    while (true) {
                        TimelineManager timelineManager = TimelineManager.this;
                        i = timelineManager.activeInd;
                        if (i2 >= i) {
                            break;
                        }
                        timelineManager.timeline.getProgressBars().get(i2).setMax();
                        i2++;
                    }
                    while (true) {
                        i++;
                        if (i < TimelineManager.this.timeline.getProgressBars().size()) {
                            TimelineManager.this.timeline.getProgressBars().get(i).clearInLooper();
                        } else {
                            timelineProgressBar.setMin();
                            timelineProgressBar.createAnimation();
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < TimelineManager.this.timeline.getProgressBars().size(); i++) {
                TimelineManager.this.timeline.getProgressBars().get(i).stopInLooper();
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0269a(), 100L);
        }
    }

    public void createFirstAnimation() {
        if (this.activeInd == 0) {
            this.timeline.setActiveProgressBar(0, true);
        }
    }

    public TimelineProgressBar getCurrentBar() {
        if (this.timeline.getProgressBars().size() <= this.pageManager.getSlideIndex()) {
            return new TimelineProgressBar(this.timeline.getContext());
        }
        return this.timeline.getProgressBars().get(this.pageManager.getSlideIndex());
    }

    public void pause() {
        getCurrentBar().pause();
    }

    public void restart() {
        getCurrentBar().createAnimation();
        getCurrentBar().restart();
    }

    public void resume() {
        getCurrentBar().resume();
    }

    public void setCurrentSlide(int i) {
        boolean z;
        if (i < 0) {
            return;
        }
        Timeline timeline = this.timeline;
        if (i > timeline.slidesCount || timeline.getProgressBars().isEmpty()) {
            return;
        }
        this.activeInd = i;
        for (int i2 = 0; i2 < this.timeline.getProgressBars().size(); i2++) {
            Timeline timeline2 = this.timeline;
            if (i2 == this.activeInd) {
                z = true;
            } else {
                z = false;
            }
            timeline2.setActiveProgressBar(i2, z);
        }
        new Handler(Looper.getMainLooper()).post(new a());
    }

    public void setSlidesCount(int i) {
        this.timeline.setSlidesCount(i);
    }

    public void setStoryDurations(List<Integer> list, boolean z) {
        if (list == null) {
            return;
        }
        if (this.durations == null) {
            this.durations = new ArrayList();
        }
        this.durations.clear();
        this.durations.addAll(list);
        this.timeline.setDurations(list);
        if (z) {
            createFirstAnimation();
        }
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public void start() {
        this.mAnimationRest = -1L;
        getCurrentBar().start();
    }

    public void stop() {
        getCurrentBar().stop();
    }
}
