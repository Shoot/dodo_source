package com.inappstory.sdk.stories.managers;

import android.os.Handler;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPageManager;
/* loaded from: classes3.dex */
public class TimerManager {
    int currentDuration;
    ReaderPageManager pageManager;
    private long pauseShift;
    public long startPauseTime;
    private long timerDuration;
    private long timerStart;
    private long totalTimerDuration;
    private Handler timerHandler = new Handler();
    Runnable timerTask = new a();
    public long pauseTime = 0;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TimerManager.this.timerDuration > 0 && System.currentTimeMillis() - TimerManager.this.timerStart >= TimerManager.this.timerDuration) {
                TimerManager.this.timerHandler.removeCallbacks(TimerManager.this.timerTask);
                TimerManager.this.pauseShift = 0L;
                ReaderPageManager readerPageManager = TimerManager.this.pageManager;
                if (readerPageManager != null) {
                    readerPageManager.nextSlide(3);
                    return;
                }
                return;
            }
            TimerManager.this.timerHandler.postDelayed(TimerManager.this.timerTask, 50L);
        }
    }

    public void pauseLocalTimer() {
        try {
            this.timerHandler.removeCallbacks(this.timerTask);
        } catch (Exception unused) {
        }
        this.pauseShift = System.currentTimeMillis() - this.timerStart;
    }

    public void pauseTimer() {
        Story.StoryType storyType;
        String str;
        if (InAppStoryService.isNull()) {
            return;
        }
        ReaderPageManager readerPageManager = this.pageManager;
        if (readerPageManager != null) {
            storyType = readerPageManager.getStoryType();
        } else {
            storyType = Story.StoryType.COMMON;
        }
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), storyType);
        if (storyById != null) {
            StatisticManager statisticManager = StatisticManager.getInstance();
            int i = storyById.id;
            Integer valueOf = Integer.valueOf(storyById.lastIndex);
            Integer valueOf2 = Integer.valueOf(storyById.getSlidesCount());
            ReaderPageManager readerPageManager2 = this.pageManager;
            if (readerPageManager2 != null) {
                str = readerPageManager2.getFeedId();
            } else {
                str = null;
            }
            statisticManager.addFakeEvents(i, valueOf, valueOf2, str);
        }
        pauseLocalTimer();
        this.startPauseTime = System.currentTimeMillis();
        OldStatisticManager.getInstance().closeStatisticEvent(null, true);
        OldStatisticManager.getInstance().sendStatistic();
        OldStatisticManager.getInstance().eventCount++;
    }

    public void restartTimer(long j) {
        startTimer(j, true);
    }

    public void resumeLocalTimer() {
        startTimer(this.timerDuration - this.pauseShift, false);
    }

    public void resumeTimer() {
        StatisticManager.getInstance().cleanFakeEvents();
        resumeLocalTimer();
        if (OldStatisticManager.getInstance().currentEvent == null) {
            return;
        }
        OldStatisticManager.getInstance().currentEvent.eventType = 1;
        OldStatisticManager.getInstance().currentEvent.timer = System.currentTimeMillis();
        this.pauseTime += System.currentTimeMillis() - this.startPauseTime;
        if (StatisticManager.getInstance() != null && StatisticManager.getInstance().currentState != null) {
            StatisticManager.getInstance().currentState.storyPause = this.pauseTime;
        }
        this.startPauseTime = 0L;
    }

    public void setCurrentDuration(Integer num) {
        if (num != null) {
            this.currentDuration = num.intValue();
        }
    }

    public void setPageManager(ReaderPageManager readerPageManager) {
        this.pageManager = readerPageManager;
    }

    public void setTimerDuration(long j) {
        this.timerDuration = j;
    }

    public void startCurrentTimer() {
        int i = this.currentDuration;
        if (i != 0) {
            startTimer(i, false);
        }
    }

    public void startTimer(long j, boolean z) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            try {
                this.timerHandler.removeCallbacks(this.timerTask);
                this.timerDuration = j;
                if (z) {
                    this.totalTimerDuration = j;
                }
            } catch (Exception unused) {
            }
        } else if (i < 0) {
        } else {
            this.pauseShift = 0L;
            this.timerStart = System.currentTimeMillis();
            this.timerDuration = j;
            try {
                this.timerHandler.removeCallbacks(this.timerTask);
            } catch (Exception unused2) {
            }
            this.timerHandler.post(this.timerTask);
        }
    }

    public void stopTimer() {
        try {
            this.timerHandler.removeCallbacks(this.timerTask);
        } catch (Exception unused) {
        }
    }

    public void resumeTimer(int i) {
        StatisticManager.getInstance().cleanFakeEvents();
        startTimer(i, false);
        if (OldStatisticManager.getInstance().currentEvent == null) {
            return;
        }
        OldStatisticManager.getInstance().currentEvent.eventType = 1;
        OldStatisticManager.getInstance().currentEvent.timer = System.currentTimeMillis();
        this.pauseTime += System.currentTimeMillis() - this.startPauseTime;
        StatisticManager.getInstance().currentState.storyPause = this.pauseTime;
        this.startPauseTime = 0L;
    }
}
