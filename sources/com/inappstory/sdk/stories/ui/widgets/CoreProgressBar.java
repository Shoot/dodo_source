package com.inappstory.sdk.stories.ui.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class CoreProgressBar extends View {
    private static Paint COLOR_PAINT = null;
    private static final int FRAME_DURATION = 50;
    private static final float STROKE_SIZE_HALF;
    static final float STROKE_WIDTH;
    private RectF arcRect;
    private int color;
    private int currentFrame;
    private long lastFrameShown;
    private int progress;
    Typeface tf;

    static {
        float dpToPxExt = Sizes.dpToPxExt(4);
        STROKE_WIDTH = dpToPxExt;
        STROKE_SIZE_HALF = dpToPxExt / 2.0f;
    }

    public CoreProgressBar(Context context) {
        super(context);
        init(context, null);
    }

    private void drawProgress(Canvas canvas, Paint paint) {
        canvas.save();
        canvas.rotate(-90.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
        canvas.drawArc(this.arcRect, 0.0f, (int) (this.progress * 3.6f), false, paint);
        canvas.restore();
    }

    static Paint getColorPaint(Resources resources) {
        if (COLOR_PAINT == null) {
            Paint paint = new Paint();
            COLOR_PAINT = paint;
            paint.setColor(resources.getColor(R.color.cs_loaderColor));
            COLOR_PAINT.setStyle(Paint.Style.STROKE);
            COLOR_PAINT.setStrokeWidth(STROKE_WIDTH);
            COLOR_PAINT.setAntiAlias(true);
        }
        return COLOR_PAINT;
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.tf = Typeface.DEFAULT;
        setLayerType(1, null);
    }

    public int getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.arcRect == null) {
            float f = STROKE_SIZE_HALF;
            this.arcRect = new RectF(f, f, canvas.getWidth() - f, canvas.getHeight() - f);
        }
        Paint colorPaint = getColorPaint(getResources());
        colorPaint.setAntiAlias(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis > this.lastFrameShown + 50) {
            this.currentFrame++;
            this.lastFrameShown = uptimeMillis;
        }
        int i = this.currentFrame % 24;
        new Matrix();
        colorPaint.setColor(getContext().getResources().getColor(R.color.cs_loaderColor));
        colorPaint.setTypeface(this.tf);
        colorPaint.setTextSize(Sizes.dpToPxExt(12));
        colorPaint.setTextAlign(Paint.Align.CENTER);
        colorPaint.setStyle(Paint.Style.STROKE);
        colorPaint.setStrokeWidth(STROKE_WIDTH);
        drawProgress(canvas, colorPaint);
        invalidate();
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setProgress(int i) {
        if (i >= 0 && i <= 100) {
            this.progress = i;
            return;
        }
        throw new IndexOutOfBoundsException("progress must be 0..100");
    }

    public CoreProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public CoreProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    @TargetApi(21)
    public CoreProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }
}
