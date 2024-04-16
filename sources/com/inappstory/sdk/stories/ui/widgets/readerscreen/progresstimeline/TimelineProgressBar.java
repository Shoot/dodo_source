package com.inappstory.sdk.stories.ui.widgets.readerscreen.progresstimeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.inappstory.sdk.stories.utils.Sizes;
import java.util.Random;
/* loaded from: classes3.dex */
public class TimelineProgressBar extends View {
    boolean animationActive;
    private final int animationStep;
    private Paint backgroundPaint;
    Context context;
    float currentProgress;
    Runnable currentRunnable;
    Long duration;
    private Paint foregroundPaint;
    Handler handler;
    String id;
    boolean isActive;
    private Object pauseLock;
    boolean paused;
    boolean progressForegroundVisibility;
    int radius;
    private int timelineHeight;
    int timelineWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TimelineProgressBar timelineProgressBar = TimelineProgressBar.this;
            if (timelineProgressBar.progressForegroundVisibility) {
                timelineProgressBar.progressForegroundVisibility = false;
                timelineProgressBar.setCurrentProgress(0.0f);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TimelineProgressBar.this.setCurrentProgress(0.0f);
            TimelineProgressBar timelineProgressBar = TimelineProgressBar.this;
            timelineProgressBar.progressForegroundVisibility = true;
            Long l = timelineProgressBar.duration;
            if (l != null && l.longValue() != 0) {
                TimelineProgressBar.this.createTimelineRunnable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ Long b;

        c(long j, Long l) {
            this.a = j;
            this.b = l;
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            float longValue = ((float) (currentTimeMillis - this.a)) / (((float) this.b.longValue()) * 1.0f);
            TimelineProgressBar timelineProgressBar = TimelineProgressBar.this;
            if (timelineProgressBar.isActive) {
                timelineProgressBar.setCurrentProgress(Math.min(longValue, 1.0f));
                if (currentTimeMillis - this.a <= this.b.longValue() && !TimelineProgressBar.this.isPaused()) {
                    TimelineProgressBar timelineProgressBar2 = TimelineProgressBar.this;
                    timelineProgressBar2.animationActive = true;
                    timelineProgressBar2.handler.postDelayed(this, 25L);
                    return;
                }
            }
            TimelineProgressBar.this.animationActive = false;
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TimelineProgressBar.this.setCurrentProgress(0.0f);
            Long l = TimelineProgressBar.this.duration;
            if (l != null && l.longValue() != 0) {
                TimelineProgressBar.this.createTimelineRunnable();
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            final /* synthetic */ long a;
            final /* synthetic */ long b;
            final /* synthetic */ Long c;

            a(long j, long j2, Long l) {
                this.a = j;
                this.b = j2;
                this.c = l;
            }

            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                float longValue = 1.0f - (((float) (this.a - (currentTimeMillis - this.b))) / (((float) this.c.longValue()) * 1.0f));
                TimelineProgressBar timelineProgressBar = TimelineProgressBar.this;
                if (timelineProgressBar.isActive) {
                    timelineProgressBar.setCurrentProgress(Math.min(Math.max(0.0f, longValue), 1.0f));
                    if (currentTimeMillis - this.b <= this.a && !TimelineProgressBar.this.isPaused()) {
                        TimelineProgressBar timelineProgressBar2 = TimelineProgressBar.this;
                        timelineProgressBar2.animationActive = true;
                        timelineProgressBar2.handler.postDelayed(this, 25L);
                        return;
                    }
                }
                TimelineProgressBar.this.animationActive = false;
            }
        }

        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Long l = TimelineProgressBar.this.duration;
            if (l != null && l.longValue() != 0) {
                TimelineProgressBar.this.handler.post(new a(((float) TimelineProgressBar.this.getDuration().longValue()) * Math.max(0.0f, 1.0f - TimelineProgressBar.this.currentProgress), System.currentTimeMillis(), TimelineProgressBar.this.getDuration()));
            }
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        final /* synthetic */ float a;

        f(float f) {
            this.a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TimelineProgressBar timelineProgressBar = TimelineProgressBar.this;
            timelineProgressBar.progressForegroundVisibility = true;
            timelineProgressBar.setCurrentProgress(this.a);
        }
    }

    public TimelineProgressBar(@NonNull Context context) {
        super(context);
        this.timelineHeight = Sizes.dpToPxExt(3, getContext());
        this.timelineWidth = getWidth();
        this.radius = this.timelineHeight / 2;
        this.progressForegroundVisibility = false;
        this.currentProgress = 0.0f;
        this.isActive = false;
        this.animationStep = 25;
        this.paused = false;
        this.pauseLock = new Object();
        this.handler = new Handler(Looper.getMainLooper());
        this.animationActive = false;
        int dpToPxExt = Sizes.dpToPxExt(3, context);
        this.timelineHeight = dpToPxExt;
        this.radius = dpToPxExt / 2;
        this.context = context;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createTimelineRunnable() {
        this.handler.post(new c(System.currentTimeMillis(), getDuration()));
    }

    private Paint getBackgroundPaint() {
        if (this.backgroundPaint == null) {
            Paint paint = new Paint();
            this.backgroundPaint = paint;
            paint.setColor(Color.parseColor("#8affffff"));
        }
        return this.backgroundPaint;
    }

    private Paint getForegroundPaint() {
        if (this.foregroundPaint == null) {
            Paint paint = new Paint();
            this.foregroundPaint = paint;
            paint.setColor(Color.parseColor("#ffffff"));
        }
        return this.foregroundPaint;
    }

    private void init() {
        this.id = new Random().nextDouble() + "";
        getBackgroundPaint();
        getForegroundPaint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPaused() {
        boolean z;
        synchronized (this.pauseLock) {
            z = this.paused;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentProgress(float f2) {
        this.currentProgress = f2;
    }

    private void setPaused(boolean z) {
        synchronized (this.pauseLock) {
            this.paused = z;
        }
    }

    public void clear() {
        new Handler(Looper.getMainLooper()).post(new a());
    }

    public void clearInLooper() {
        if (this.progressForegroundVisibility) {
            this.progressForegroundVisibility = false;
            setCurrentProgress(0.0f);
        }
    }

    public void createAnimation() {
        this.isActive = true;
    }

    public Long getDuration() {
        Long l = this.duration;
        if (l != null && l.longValue() != 0) {
            return this.duration;
        }
        return 1000L;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.timelineWidth = getWidth();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), this.timelineHeight);
        int i = this.radius;
        canvas.drawRoundRect(rectF, i, i, getBackgroundPaint());
        if (this.progressForegroundVisibility) {
            RectF rectF2 = new RectF(0.0f, 0.0f, this.currentProgress * getWidth(), this.timelineHeight);
            int i2 = this.radius;
            canvas.drawRoundRect(rectF2, i2, i2, getForegroundPaint());
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void pause() {
        synchronized (this.pauseLock) {
            setPaused(true);
        }
    }

    public void restart() {
        if (!this.isActive) {
            return;
        }
        setPaused(false);
        if (this.animationActive) {
            return;
        }
        this.handler.postDelayed(new d(), 100L);
    }

    public void resume() {
        if (!this.isActive) {
            return;
        }
        setPaused(false);
        if (this.animationActive) {
            return;
        }
        this.handler.post(new e());
    }

    public void setDuration(Long l) {
        this.duration = l;
    }

    public void setMax() {
        this.progressForegroundVisibility = true;
        setCurrentProgress(1.0f);
    }

    public void setMin() {
        this.progressForegroundVisibility = true;
        setCurrentProgress(0.0f);
    }

    public void setProgress(float f2) {
        Long l = this.duration;
        if (l != null && l.longValue() != 0) {
            if (f2 <= 0.0f) {
                clear();
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new f(f2));
                return;
            }
        }
        clear();
    }

    public void start() {
        if (!this.isActive) {
            return;
        }
        setPaused(false);
        if (this.animationActive) {
            return;
        }
        this.handler.postDelayed(new b(), 100L);
    }

    public void stop() {
        this.isActive = false;
    }

    public TimelineProgressBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.timelineHeight = Sizes.dpToPxExt(3, getContext());
        this.timelineWidth = getWidth();
        this.radius = this.timelineHeight / 2;
        this.progressForegroundVisibility = false;
        this.currentProgress = 0.0f;
        this.isActive = false;
        this.animationStep = 25;
        this.paused = false;
        this.pauseLock = new Object();
        this.handler = new Handler(Looper.getMainLooper());
        this.animationActive = false;
        this.context = context;
        init();
    }

    public TimelineProgressBar(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.timelineHeight = Sizes.dpToPxExt(3, getContext());
        this.timelineWidth = getWidth();
        this.radius = this.timelineHeight / 2;
        this.progressForegroundVisibility = false;
        this.currentProgress = 0.0f;
        this.isActive = false;
        this.animationStep = 25;
        this.paused = false;
        this.pauseLock = new Object();
        this.handler = new Handler(Looper.getMainLooper());
        this.animationActive = false;
        this.context = context;
        init();
    }

    public void stopInLooper() {
    }
}
