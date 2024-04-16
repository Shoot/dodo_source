package com.inappstory.sdk.game.reader;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.ui.views.IGameReaderLoaderView;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class GameReaderLoadProgressBar extends View implements IGameReaderLoaderView {
    private static Paint COLOR_PAINT;
    private static Paint GRADIENT_PAINT;
    private float STROKE_SIZE_HALF;
    private float STROKE_WIDTH;
    private RectF arcRect;
    private int currentFrame;
    int[] gradientColors;
    private boolean isIndeterminate;
    float[] positions;
    private int progress;
    private final boolean rounded;
    private final int sizeDP;
    private final int strokeWidthDP;

    public GameReaderLoadProgressBar(Context context) {
        this(context, null);
        initSize();
    }

    private void drawDeterminate(Canvas canvas) {
        canvas.save();
        canvas.drawArc(this.arcRect, -90.0f, 360.0f * (this.progress / 100.0f), false, getColorPaint(getResources()));
        canvas.restore();
    }

    private void drawIndeterminate(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i = this.currentFrame + 1;
        this.currentFrame = i;
        int i2 = i % 450;
        this.currentFrame = i2;
        int i3 = i2 % 90;
        if (i3 >= 12 && i3 <= 78) {
            if (i3 > 33 && i3 < 57) {
                f = 1.0f;
            } else {
                if (i3 >= 57) {
                    f2 = i3;
                    f3 = 78.0f;
                } else {
                    f2 = i3;
                    f3 = 12.0f;
                }
                f = (f2 - f3) / 22.0f;
            }
        } else {
            f = 0.0f;
        }
        drawIndeterminateOutlineArc(canvas, ((i3 % 90) * 72.0f) / 90.0f, f);
    }

    private void drawIndeterminateOutlineArc(Canvas canvas, float f, float f2) {
        canvas.save();
        RectF rectF = this.arcRect;
        float f3 = f - 144.0f;
        if (f2 <= 0.0f) {
            f3 += (1.0f + f2) * 288.0f;
        }
        canvas.drawArc(rectF, f3, Math.abs(f2) * 288.0f, false, getColorGradientPaint(getResources()));
        canvas.restore();
    }

    private void initSize() {
        float dpToPxExt = Sizes.dpToPxExt(4, getContext());
        this.STROKE_WIDTH = dpToPxExt;
        this.STROKE_SIZE_HALF = dpToPxExt / 2.0f;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Sizes.dpToPxExt(36, getContext()), Sizes.dpToPxExt(36, getContext()));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
    }

    Paint getColorGradientPaint(Resources resources) {
        if (GRADIENT_PAINT == null) {
            Paint paint = new Paint();
            GRADIENT_PAINT = paint;
            paint.setColor(resources.getColor(R.color.cs_loaderColor));
            GRADIENT_PAINT.setStyle(Paint.Style.STROKE);
            GRADIENT_PAINT.setStrokeWidth(this.STROKE_WIDTH);
            float dpToPxExt = Sizes.dpToPxExt(36, getContext()) / 2.0f;
            SweepGradient sweepGradient = new SweepGradient(dpToPxExt, dpToPxExt, this.gradientColors, this.positions);
            Matrix matrix = new Matrix();
            matrix.preRotate(200.0f, dpToPxExt, dpToPxExt);
            sweepGradient.setLocalMatrix(matrix);
            GRADIENT_PAINT.setShader(sweepGradient);
            GRADIENT_PAINT.setAntiAlias(true);
        }
        return GRADIENT_PAINT;
    }

    Paint getColorPaint(Resources resources) {
        if (COLOR_PAINT == null) {
            Paint paint = new Paint();
            COLOR_PAINT = paint;
            paint.setColor(resources.getColor(R.color.cs_loaderColor));
            COLOR_PAINT.setStyle(Paint.Style.STROKE);
            COLOR_PAINT.setStrokeWidth(this.STROKE_WIDTH);
            COLOR_PAINT.setAntiAlias(true);
        }
        return COLOR_PAINT;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.arcRect == null) {
            float f = this.STROKE_SIZE_HALF;
            this.arcRect = new RectF(f, f, canvas.getWidth() - this.STROKE_SIZE_HALF, canvas.getHeight() - this.STROKE_SIZE_HALF);
        }
        if (this.isIndeterminate) {
            drawIndeterminate(canvas);
        } else {
            drawDeterminate(canvas);
        }
        invalidate();
    }

    @Override // com.inappstory.sdk.stories.ui.views.IProgressLoaderView
    public void setIndeterminate(boolean z) {
        this.isIndeterminate = z;
    }

    @Override // com.inappstory.sdk.stories.ui.views.IProgressLoaderView
    public void setProgress(int i, int i2) {
        this.progress = i;
    }

    public GameReaderLoadProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        initSize();
    }

    public GameReaderLoadProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentFrame = 0;
        this.isIndeterminate = true;
        this.progress = 0;
        this.strokeWidthDP = 4;
        this.sizeDP = 36;
        this.rounded = false;
        float dpToPxExt = Sizes.dpToPxExt(4);
        this.STROKE_WIDTH = dpToPxExt;
        this.STROKE_SIZE_HALF = dpToPxExt / 2.0f;
        this.gradientColors = new int[]{Color.parseColor("#00FFFFFF"), Color.parseColor("#FFFFFF")};
        this.positions = new float[]{0.0f, 1.0f};
        initSize();
    }

    @Override // com.inappstory.sdk.stories.ui.views.IGameReaderLoaderView
    public View getView(Context context) {
        return this;
    }
}
