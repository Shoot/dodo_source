package im.threads.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
/* loaded from: classes3.dex */
public final class MyCircleProgress extends View {
    private RectF finishedOuterRect;
    private Paint finishedPaint;
    private float finishedStrokeSize;
    private int max;
    private final int minSize;
    private int progress;

    public MyCircleProgress(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (this.progress / this.max) * 360.0f;
    }

    private void initPaint() {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        int i = chatStyle.chatBodyIconsTint;
        if (i == 0 && (i = chatStyle.downloadButtonTintResId) == 0) {
            i = chatStyle.loaderTintResId;
        }
        Paint paint = new Paint();
        this.finishedPaint = paint;
        if (i != 0) {
            paint.setColor(iu1.c(getContext(), i));
        }
        this.finishedPaint.setStyle(Paint.Style.STROKE);
        this.finishedPaint.setAntiAlias(true);
        this.finishedPaint.setStrokeWidth(this.finishedStrokeSize);
        setRotation(-90.0f);
    }

    private int measure(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i2 = this.minSize;
            if (mode == Integer.MIN_VALUE) {
                return Math.min(i2, size);
            }
            return i2;
        }
        return size;
    }

    @Override // android.view.View
    public void invalidate() {
        initPaint();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.finishedOuterRect;
        float f = this.finishedStrokeSize;
        rectF.set(f, f, getWidth() - this.finishedStrokeSize, getHeight() - this.finishedStrokeSize);
        canvas.drawArc(this.finishedOuterRect, 0.0f, getProgressAngle(), false, this.finishedPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(measure(i), measure(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setProgress(int i) {
        this.progress = i;
        int i2 = this.max;
        if (i > i2) {
            this.progress = i % i2;
        }
        invalidate();
    }

    public MyCircleProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyCircleProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.finishedOuterRect = new RectF();
        this.progress = 0;
        this.max = 100;
        this.finishedStrokeSize = getContext().getResources().getDisplayMetrics().density;
        this.minSize = 100;
        initPaint();
    }
}
