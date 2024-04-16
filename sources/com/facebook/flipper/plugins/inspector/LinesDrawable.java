package com.facebook.flipper.plugins.inspector;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class LinesDrawable extends Drawable {
    private static Map<View, LinesDrawable> sInstanceMap;
    private final float mDensity;
    private final Rect mWorkRect = new Rect();
    private final Rect mMarginBounds = new Rect();
    private final Rect mPaddingBounds = new Rect();
    private final Rect mContentBounds = new Rect();

    private LinesDrawable(float f) {
        this.mDensity = f;
    }

    public static LinesDrawable getInstance(View view, float f, Rect rect, Rect rect2, Rect rect3) {
        LinesDrawable linesDrawable = getInstance(view, f);
        linesDrawable.setBounds(rect, rect2, rect3);
        return linesDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-8388608);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        int i = this.mContentBounds.right;
        canvas.drawLine(i, 0.0f, i, 100000.0f, paint);
        int i2 = this.mContentBounds.left;
        canvas.drawLine(i2, 0.0f, i2, 100000.0f, paint);
        int i3 = this.mContentBounds.top;
        canvas.drawLine(0.0f, i3, 100000.0f, i3, paint);
        int i4 = this.mContentBounds.bottom;
        canvas.drawLine(0.0f, i4, 100000.0f, i4, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void setBounds(Rect rect, Rect rect2, Rect rect3) {
        this.mMarginBounds.set(rect);
        this.mPaddingBounds.set(rect2);
        this.mContentBounds.set(rect3);
        setBounds(rect);
    }

    public static LinesDrawable getInstance(View view, float f) {
        if (sInstanceMap == null) {
            sInstanceMap = new WeakHashMap();
        }
        if (sInstanceMap.containsKey(view)) {
            return sInstanceMap.get(view);
        }
        LinesDrawable linesDrawable = new LinesDrawable(f);
        sInstanceMap.put(view, linesDrawable);
        return linesDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
