package im.threads.ui.views.recordview;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.views.recordview.VoiceRecordLockView;
import kotlin.Metadata;
/* compiled from: VoiceRecordLockView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0013J\"\u0010#\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0015J\u0006\u0010'\u001a\u00020 J\u000e\u0010(\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010)\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010*\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010+\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0013H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lim/threads/ui/views/recordview/VoiceRecordLockView;", "Landroid/view/View;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomLockDrawable", "Landroid/graphics/drawable/Drawable;", "bottomLockRect", "Landroid/graphics/Rect;", "circleColor", "circleLockedColor", "defaultCircleColor", "fiveDp", "", "fourDp", "initialTopLockBottom", "initialTopLockTop", "lockColor", "recordLockAlpha", "recordLockViewListener", "Lim/threads/ui/views/recordview/VoiceRecordLockViewListener;", "topLockBottom", "topLockDrawable", "topLockTop", "twoDp", "animateAlpha", "", "animateLock", "fraction", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "setCircleLockedColor", "setDefaultCircleColor", "setLockColor", "setRecordLockViewListener", "startValueAnimators", "newTop", "newBottom", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VoiceRecordLockView extends View {
    private Drawable bottomLockDrawable;
    private Rect bottomLockRect;
    private int circleColor;
    private int circleLockedColor;
    private Context context;
    private int defaultCircleColor;
    private float fiveDp;
    private float fourDp;
    private float initialTopLockBottom;
    private float initialTopLockTop;
    private int lockColor;
    private int recordLockAlpha;
    private VoiceRecordLockViewListener recordLockViewListener;
    private float topLockBottom;
    private Drawable topLockDrawable;
    private float topLockTop;
    private float twoDp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordLockView(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.defaultCircleColor = Color.parseColor("#0A81AB");
        this.circleLockedColor = Color.parseColor("#314E52");
        this.circleColor = this.defaultCircleColor;
        this.recordLockAlpha = 255;
        this.lockColor = -1;
        init(context, null, 0);
    }

    private final void animateAlpha() {
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d2c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoiceRecordLockView.animateAlpha$lambda$0(VoiceRecordLockView.this, valueAnimator);
            }
        });
        ofInt.setDuration(700L);
        ofInt.setInterpolator(new AnticipateInterpolator());
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateAlpha$lambda$0(VoiceRecordLockView voiceRecordLockView, ValueAnimator valueAnimator) {
        z65.h(voiceRecordLockView, "this$0");
        z65.h(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        voiceRecordLockView.recordLockAlpha = ((Integer) animatedValue).intValue();
        voiceRecordLockView.invalidate();
    }

    private final void init(Context context, AttributeSet attributeSet, int i) {
        this.context = context;
        this.bottomLockDrawable = on.b(context, R.drawable.recv_lock_bottom);
        this.topLockDrawable = on.b(context, R.drawable.recv_lock_top);
        this.fiveDp = ViewExtensionsKt.dpToPx(context, 5);
        this.fourDp = ViewExtensionsKt.dpToPx(context, 4);
        this.twoDp = ViewExtensionsKt.dpToPx(context, 2);
        if (attributeSet != null && i == 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.VoiceRecordLockView, i, 0);
            z65.g(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
            int color = obtainStyledAttributes.getColor(R.styleable.VoiceRecordLockView_circle_color, -1);
            int color2 = obtainStyledAttributes.getColor(R.styleable.VoiceRecordLockView_circle_locked_color, -1);
            int color3 = obtainStyledAttributes.getColor(R.styleable.VoiceRecordLockView_lock_color, -1);
            if (color != -1) {
                this.circleColor = color;
            }
            if (color2 != -1) {
                this.circleLockedColor = color2;
            }
            if (color3 != -1) {
                this.lockColor = color3;
                Drawable drawable = this.bottomLockDrawable;
                z65.e(drawable);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(color3, mode));
                Drawable drawable2 = this.topLockDrawable;
                z65.e(drawable2);
                drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private final void startValueAnimators(float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e2c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoiceRecordLockView.startValueAnimators$lambda$1(VoiceRecordLockView.this, valueAnimator);
            }
        });
        ofFloat.setDuration(0L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f2c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoiceRecordLockView.startValueAnimators$lambda$2(VoiceRecordLockView.this, valueAnimator);
            }
        });
        ofFloat2.setDuration(0L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(0L).setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startValueAnimators$lambda$1(VoiceRecordLockView voiceRecordLockView, ValueAnimator valueAnimator) {
        z65.h(voiceRecordLockView, "this$0");
        z65.h(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        voiceRecordLockView.topLockTop = ((Float) animatedValue).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startValueAnimators$lambda$2(VoiceRecordLockView voiceRecordLockView, ValueAnimator valueAnimator) {
        z65.h(voiceRecordLockView, "this$0");
        z65.h(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        voiceRecordLockView.topLockBottom = ((Float) animatedValue).floatValue();
    }

    public final void animateLock(float f) {
        Drawable drawable;
        Rect rect;
        Rect rect2;
        int i;
        if (this.bottomLockRect == null) {
            return;
        }
        double d = f;
        float f2 = (float) (0.25d + d);
        z65.e(this.topLockDrawable);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() / 2.0d);
        float f3 = this.initialTopLockTop;
        z65.e(this.bottomLockRect);
        float f4 = this.initialTopLockBottom;
        z65.e(this.bottomLockRect);
        float f5 = ((rect.top - intrinsicHeight) - f3) + (f3 * f2);
        float f6 = ((rect2.top + intrinsicHeight) - f4) + (f4 * f2);
        if (d >= 0.85d) {
            VoiceRecordLockViewListener voiceRecordLockViewListener = this.recordLockViewListener;
            z65.e(voiceRecordLockViewListener);
            voiceRecordLockViewListener.onFractionReached();
            animateAlpha();
            i = this.circleLockedColor;
        } else {
            i = this.defaultCircleColor;
        }
        this.circleColor = i;
        if (f2 <= 1.0f && d > 0.2d) {
            startValueAnimators(f5, f6);
        }
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        z65.h(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int height = getHeight();
        Paint paint = new Paint();
        paint.setColor(this.circleColor);
        paint.setAlpha(this.recordLockAlpha);
        paint.setAntiAlias(true);
        float height2 = getHeight() / 2;
        canvas.drawCircle(width, height2, (getMeasuredWidth() / 2) + this.fourDp, paint);
        z65.e(this.bottomLockDrawable);
        z65.e(this.bottomLockDrawable);
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() / 1.5d)) / 2;
        float f = this.fiveDp;
        Rect rect = new Rect(width - intrinsicWidth, (int) ((height2 + f) - (((int) (drawable2.getIntrinsicHeight() / 2.0d)) / 2)), width + intrinsicWidth, (int) (height - f));
        if (this.bottomLockRect == null) {
            this.bottomLockRect = rect;
        }
        Drawable drawable4 = this.bottomLockDrawable;
        z65.e(drawable4);
        drawable4.setBounds(rect);
        z65.e(this.topLockDrawable);
        int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() / 1.3d);
        if (this.topLockTop == 0.0f) {
            float f2 = -this.twoDp;
            this.topLockTop = f2;
            float f3 = intrinsicHeight;
            this.topLockBottom = f3;
            this.initialTopLockTop = f2;
            this.initialTopLockBottom = f3;
        }
        Drawable drawable5 = this.topLockDrawable;
        z65.e(drawable5);
        drawable5.setBounds(new Rect(rect.left, (int) this.topLockTop, rect.right, (int) this.topLockBottom));
        Drawable drawable6 = this.topLockDrawable;
        z65.e(drawable6);
        drawable6.setAlpha(this.recordLockAlpha);
        Drawable drawable7 = this.bottomLockDrawable;
        z65.e(drawable7);
        drawable7.setAlpha(this.recordLockAlpha);
        Drawable drawable8 = this.topLockDrawable;
        z65.e(drawable8);
        drawable8.draw(canvas);
        Drawable drawable9 = this.bottomLockDrawable;
        z65.e(drawable9);
        drawable9.draw(canvas);
    }

    public final void reset() {
        this.recordLockAlpha = 255;
        this.circleColor = this.defaultCircleColor;
        this.topLockTop = this.initialTopLockTop;
        this.topLockBottom = this.initialTopLockBottom;
        invalidate();
    }

    public final void setCircleLockedColor(int i) {
        this.circleLockedColor = i;
        invalidate();
    }

    public final void setDefaultCircleColor(int i) {
        this.defaultCircleColor = i;
        invalidate();
    }

    public final void setLockColor(int i) {
        this.lockColor = i;
        Drawable drawable = this.bottomLockDrawable;
        z65.e(drawable);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
        Drawable drawable2 = this.topLockDrawable;
        z65.e(drawable2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i, mode));
        invalidate();
    }

    public final void setRecordLockViewListener(VoiceRecordLockViewListener voiceRecordLockViewListener) {
        this.recordLockViewListener = voiceRecordLockViewListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.defaultCircleColor = Color.parseColor("#0A81AB");
        this.circleLockedColor = Color.parseColor("#314E52");
        this.circleColor = this.defaultCircleColor;
        this.recordLockAlpha = 255;
        this.lockColor = -1;
        init(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordLockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.defaultCircleColor = Color.parseColor("#0A81AB");
        this.circleLockedColor = Color.parseColor("#314E52");
        this.circleColor = this.defaultCircleColor;
        this.recordLockAlpha = 255;
        this.lockColor = -1;
        init(context, attributeSet, i);
    }
}
