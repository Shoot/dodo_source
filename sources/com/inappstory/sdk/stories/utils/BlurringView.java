package com.inappstory.sdk.stories.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.view.View;
import com.inappstory.sdk.R;
/* loaded from: classes3.dex */
public class BlurringView extends View {
    private Bitmap mBitmapToBlur;
    private Allocation mBlurInput;
    private Allocation mBlurOutput;
    private ScriptIntrinsicBlur mBlurScript;
    private Bitmap mBlurredBitmap;
    private View mBlurredView;
    private int mBlurredViewHeight;
    private int mBlurredViewWidth;
    private Canvas mBlurringCanvas;
    private int mDownsampleFactor;
    private boolean mDownsampleFactorChanged;
    private int mOverlayColor;
    private RenderScript mRenderScript;

    public BlurringView(Context context) {
        this(context, null);
    }

    private void initializeRenderScript(Context context) {
        RenderScript create = RenderScript.create(context);
        this.mRenderScript = create;
        this.mBlurScript = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    protected void blur() {
        this.mBlurInput.copyFrom(this.mBitmapToBlur);
        this.mBlurScript.setInput(this.mBlurInput);
        this.mBlurScript.forEach(this.mBlurOutput);
        this.mBlurOutput.copyTo(this.mBlurredBitmap);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RenderScript renderScript = this.mRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mBlurredView != null) {
            if (prepare()) {
                if (this.mBlurredView.getBackground() != null && (this.mBlurredView.getBackground() instanceof ColorDrawable)) {
                    this.mBitmapToBlur.eraseColor(((ColorDrawable) this.mBlurredView.getBackground()).getColor());
                } else {
                    this.mBitmapToBlur.eraseColor(0);
                }
                this.mBlurredView.draw(this.mBlurringCanvas);
                blur();
                canvas.save();
                canvas.translate(this.mBlurredView.getX() - getX(), this.mBlurredView.getY() - getY());
                int i = this.mDownsampleFactor;
                canvas.scale(i, i);
                canvas.drawBitmap(this.mBlurredBitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
            }
            canvas.drawColor(this.mOverlayColor);
        }
    }

    protected boolean prepare() {
        int width = this.mBlurredView.getWidth();
        int height = this.mBlurredView.getHeight();
        if (this.mBlurringCanvas == null || this.mDownsampleFactorChanged || this.mBlurredViewWidth != width || this.mBlurredViewHeight != height) {
            this.mDownsampleFactorChanged = false;
            this.mBlurredViewWidth = width;
            this.mBlurredViewHeight = height;
            int i = this.mDownsampleFactor;
            int i2 = width / i;
            int i3 = height / i;
            int i4 = (i2 - (i2 % 4)) + 4;
            int i5 = (i3 - (i3 % 4)) + 4;
            Bitmap bitmap = this.mBlurredBitmap;
            if (bitmap == null || bitmap.getWidth() != i4 || this.mBlurredBitmap.getHeight() != i5) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(i4, i5, config);
                this.mBitmapToBlur = createBitmap;
                if (createBitmap == null) {
                    return false;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(i4, i5, config);
                this.mBlurredBitmap = createBitmap2;
                if (createBitmap2 == null) {
                    return false;
                }
            }
            Canvas canvas = new Canvas(this.mBitmapToBlur);
            this.mBlurringCanvas = canvas;
            int i6 = this.mDownsampleFactor;
            canvas.scale(1.0f / i6, 1.0f / i6);
            Allocation createFromBitmap = Allocation.createFromBitmap(this.mRenderScript, this.mBitmapToBlur, Allocation.MipmapControl.MIPMAP_NONE, 1);
            this.mBlurInput = createFromBitmap;
            this.mBlurOutput = Allocation.createTyped(this.mRenderScript, createFromBitmap.getType());
        }
        return true;
    }

    public void setBlurRadius(float f) {
        this.mBlurScript.setRadius(f);
    }

    public void setBlurredView(View view) {
        this.mBlurredView = view;
    }

    public void setDownsampleFactor(int i) {
        if (i > 0) {
            if (this.mDownsampleFactor != i) {
                this.mDownsampleFactor = i;
                this.mDownsampleFactorChanged = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Downsample factor must be greater than 0.");
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
    }

    public BlurringView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        int integer = resources.getInteger(R.integer.default_blur_radius);
        int integer2 = resources.getInteger(R.integer.default_downsample_factor);
        int color = resources.getColor(R.color.default_overlay_color);
        initializeRenderScript(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.StoriesSDKAppTheme_BlurringView);
        setBlurRadius(obtainStyledAttributes.getInt(R.styleable.StoriesSDKAppTheme_BlurringView_cblurRadius, integer));
        setDownsampleFactor(obtainStyledAttributes.getInt(R.styleable.StoriesSDKAppTheme_BlurringView_cdownsampleFactor, integer2));
        setOverlayColor(obtainStyledAttributes.getColor(R.styleable.StoriesSDKAppTheme_BlurringView_coverlayColor, color));
        obtainStyledAttributes.recycle();
    }
}
