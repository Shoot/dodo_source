package com.inappstory.sdk.imageloader;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class RoundedCornerLayout extends FrameLayout {
    private static final float CORNER_RADIUS = 40.0f;
    private Paint maskPaint;
    Path path;
    int radius;

    public RoundedCornerLayout(Context context) {
        super(context);
        this.radius = Sizes.dpToPxExt(16, context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Path path = this.path;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.radius;
        Path path = new Path();
        this.path = path;
        path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), f, f, Path.Direction.CW);
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.radius = Sizes.dpToPxExt(16, context);
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.radius = Sizes.dpToPxExt(16, context);
    }
}
