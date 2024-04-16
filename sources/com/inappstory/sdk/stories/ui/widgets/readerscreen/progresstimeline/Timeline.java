package com.inappstory.sdk.stories.ui.widgets.readerscreen.progresstimeline;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.inappstory.sdk.stories.utils.Sizes;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class Timeline extends LinearLayout {
    private final LinearLayout.LayoutParams PROGRESS_BAR_LAYOUT_PARAM;
    private final LinearLayout.LayoutParams SPACE_LAYOUT_PARAM;
    ValueAnimator curAnimation;
    List<Integer> durations;
    private final Object lock;
    private List<TimelineProgressBar> progressBars;
    int slidesCount;
    TimelineManager timelineManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (Timeline.this.lock) {
                try {
                    if (Timeline.this.durations.isEmpty()) {
                        Timeline.this.setVisibility(4);
                    } else if (Timeline.this.durations.size() == 1) {
                        if (Timeline.this.durations.get(0).intValue() == 0) {
                            Timeline.this.setVisibility(4);
                        } else {
                            Timeline.this.setVisibility(0);
                        }
                    } else {
                        Timeline.this.setVisibility(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Timeline(Context context) {
        super(context);
        this.slidesCount = -1;
        this.PROGRESS_BAR_LAYOUT_PARAM = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.SPACE_LAYOUT_PARAM = new LinearLayout.LayoutParams(Sizes.dpToPxExt(4, getContext()), -2);
        this.lock = new Object();
        this.progressBars = new ArrayList();
        init();
    }

    private void bindViews() {
        this.progressBars.clear();
        removeAllViews();
        int i = 0;
        while (i < this.slidesCount) {
            TimelineProgressBar createProgressBar = createProgressBar();
            this.progressBars.add(createProgressBar);
            setSlideDuration(i);
            addView(createProgressBar);
            int i2 = i + 1;
            if (i2 < this.slidesCount) {
                addView(createSpace());
            }
            if (i == 0) {
                createProgressBar.setMin();
            }
            i = i2;
        }
    }

    private void checkTimelineVisibility() {
        new Handler(Looper.getMainLooper()).post(new a());
    }

    private TimelineProgressBar createProgressBar() {
        TimelineProgressBar timelineProgressBar = new TimelineProgressBar(getContext());
        timelineProgressBar.setLayoutParams(this.PROGRESS_BAR_LAYOUT_PARAM);
        return timelineProgressBar;
    }

    private View createSpace() {
        View view = new View(getContext());
        view.setLayoutParams(this.SPACE_LAYOUT_PARAM);
        return view;
    }

    private void init() {
        setVisibility(4);
        setOrientation(0);
        bindViews();
        TimelineManager timelineManager = new TimelineManager();
        this.timelineManager = timelineManager;
        timelineManager.setTimeline(this);
    }

    private void setSlideDuration(int i) {
        synchronized (this.lock) {
            try {
                if (this.durations != null && this.progressBars.size() > i && this.durations.size() > i) {
                    this.progressBars.get(i).setDuration(Long.valueOf(this.durations.get(i).intValue()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TimelineManager getManager() {
        return this.timelineManager;
    }

    public List<TimelineProgressBar> getProgressBars() {
        if (this.progressBars == null) {
            this.progressBars = new ArrayList();
        }
        return this.progressBars;
    }

    public void setActiveProgressBar(int i, boolean z) {
        if (this.progressBars == null) {
            this.progressBars = new ArrayList();
        }
        if (this.progressBars.size() > i) {
            this.progressBars.get(i).isActive = z;
        }
    }

    public void setDurations(List<Integer> list) {
        if (list == null) {
            return;
        }
        synchronized (this.lock) {
            this.durations = list;
        }
        checkTimelineVisibility();
        List<TimelineProgressBar> list2 = this.progressBars;
        if (list2 != null && list2.size() == list.size()) {
            for (int i = 0; i < this.progressBars.size(); i++) {
                setSlideDuration(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSlidesCount(int i) {
        if (this.slidesCount != i) {
            this.slidesCount = i;
            bindViews();
        }
    }

    public Timeline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.slidesCount = -1;
        this.PROGRESS_BAR_LAYOUT_PARAM = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.SPACE_LAYOUT_PARAM = new LinearLayout.LayoutParams(Sizes.dpToPxExt(4, getContext()), -2);
        this.lock = new Object();
        this.progressBars = new ArrayList();
        init();
    }

    public Timeline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.slidesCount = -1;
        this.PROGRESS_BAR_LAYOUT_PARAM = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.SPACE_LAYOUT_PARAM = new LinearLayout.LayoutParams(Sizes.dpToPxExt(4, getContext()), -2);
        this.lock = new Object();
        this.progressBars = new ArrayList();
        init();
    }

    public void setCurrentSlide(int i) {
    }
}
