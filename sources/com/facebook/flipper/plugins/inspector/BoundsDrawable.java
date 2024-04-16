package com.facebook.flipper.plugins.inspector;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class BoundsDrawable extends Drawable {
    public static final int COLOR_HIGHLIGHT_CONTENT = -2004322875;
    public static final int COLOR_HIGHLIGHT_MARGIN = -1997031557;
    public static final int COLOR_HIGHLIGHT_PADDING = -2002923131;
    private static Map<View, BoundsDrawable> sInstanceMap;
    private final float mAscentOffset;
    private final Paint mContentPaint;
    private final float mDensity;
    private final Paint mMarginPaint;
    private final Paint mPaddingPaint;
    private final int mStrokeWidth;
    private final TextPaint mTextPaint;
    private final Rect mWorkRect = new Rect();
    private final Rect mMarginBounds = new Rect();
    private final Rect mPaddingBounds = new Rect();
    private final Rect mContentBounds = new Rect();

    private BoundsDrawable(float f) {
        this.mDensity = f;
        TextPaint textPaint = new TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(dpToPx(8.0f));
        this.mAscentOffset = (-textPaint.ascent()) / 2.0f;
        this.mStrokeWidth = dpToPx(2.0f);
        Paint paint = new Paint();
        this.mPaddingPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(COLOR_HIGHLIGHT_PADDING);
        Paint paint2 = new Paint();
        this.mContentPaint = paint2;
        paint2.setStyle(style);
        paint2.setColor(COLOR_HIGHLIGHT_CONTENT);
        Paint paint3 = new Paint();
        this.mMarginPaint = paint3;
        paint3.setStyle(style);
        paint3.setColor(COLOR_HIGHLIGHT_MARGIN);
    }

    private int dpToPx(float f) {
        return (int) (f * this.mDensity);
    }

    private void drawBoundsDimension(Canvas canvas, Rect rect, int i) {
        if (i <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.centerX(), rect.centerY());
        drawOutlinedText(canvas, i + "px");
        canvas.restoreToCount(save);
    }

    private void drawBoundsDimensions(Canvas canvas, Rect rect) {
        int save = canvas.save();
        canvas.translate(rect.centerX(), rect.centerY());
        drawOutlinedText(canvas, rect.width() + "px  ×  " + rect.height() + "px");
        canvas.restoreToCount(save);
    }

    private void drawCardinalDimensionsBetween(Canvas canvas, Rect rect, Rect rect2) {
        this.mWorkRect.set(rect);
        Rect rect3 = this.mWorkRect;
        rect3.left = rect2.left;
        rect3.right = rect.left;
        drawBoundsDimension(canvas, rect3, rect3.width());
        Rect rect4 = this.mWorkRect;
        rect4.left = rect.right;
        rect4.right = rect2.right;
        drawBoundsDimension(canvas, rect4, rect4.width());
        this.mWorkRect.set(rect2);
        Rect rect5 = this.mWorkRect;
        rect5.bottom = rect.top;
        drawBoundsDimension(canvas, rect5, rect5.height());
        Rect rect6 = this.mWorkRect;
        rect6.bottom = rect2.bottom;
        rect6.top = rect.bottom;
        drawBoundsDimension(canvas, rect6, rect6.height());
    }

    private void drawOutlinedText(Canvas canvas, String str) {
        this.mTextPaint.setColor(-16777216);
        this.mTextPaint.setStrokeWidth(this.mStrokeWidth);
        this.mTextPaint.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, 0.0f, this.mAscentOffset, this.mTextPaint);
        this.mTextPaint.setColor(-1);
        this.mTextPaint.setStrokeWidth(0.0f);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str, 0.0f, this.mAscentOffset, this.mTextPaint);
    }

    public static BoundsDrawable getInstance(View view, float f, Rect rect, Rect rect2, Rect rect3) {
        BoundsDrawable boundsDrawable = getInstance(view, f);
        boundsDrawable.setBounds(rect, rect2, rect3);
        return boundsDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(this.mContentBounds, this.mContentPaint);
        int save = canvas.save();
        Rect rect = this.mContentBounds;
        Region.Op op = Region.Op.DIFFERENCE;
        canvas.clipRect(rect, op);
        canvas.drawRect(this.mPaddingBounds, this.mPaddingPaint);
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.clipRect(this.mPaddingBounds, op);
        canvas.drawRect(this.mMarginBounds, this.mMarginPaint);
        canvas.restoreToCount(save2);
        drawBoundsDimensions(canvas, this.mContentBounds);
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

    public static BoundsDrawable getInstance(View view, float f) {
        if (sInstanceMap == null) {
            sInstanceMap = new WeakHashMap();
        }
        if (sInstanceMap.containsKey(view)) {
            return sInstanceMap.get(view);
        }
        BoundsDrawable boundsDrawable = new BoundsDrawable(f);
        sInstanceMap.put(view, boundsDrawable);
        return boundsDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
