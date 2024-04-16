package im.threads.ui.views.shimmerLayout;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: ShimmerLayout.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 K2\u00020\u0001:\u0002KLB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020CH\u0014J\u0010\u0010D\u001a\u00020>2\u0006\u0010B\u001a\u00020CH\u0002J\u0006\u0010E\u001a\u00020>J\b\u0010F\u001a\u00020>H\u0014J\"\u0010\u000f\u001a\u00020>2\u0014\b\u0004\u0010#\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00070GH\u0086\bø\u0001\u0000J\"\u0010\u0016\u001a\u00020>2\u0014\b\u0004\u0010#\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00140GH\u0086\bø\u0001\u0000J\"\u0010\u001a\u001a\u00020>2\u0014\b\u0004\u0010#\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00180GH\u0086\bø\u0001\u0000J\u0010\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0007H\u0016J\u0006\u0010J\u001a\u00020>R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, d2 = {"Lim/threads/ui/views/shimmerLayout/ShimmerLayout;", "Landroid/widget/FrameLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animating", "", "colorEvaluator", "Lim/threads/ui/views/shimmerLayout/ShimmerLayout$Evaluator;", "getColorEvaluator", "()Lim/threads/ui/views/shimmerLayout/ShimmerLayout$Evaluator;", "setColorEvaluator", "(Lim/threads/ui/views/shimmerLayout/ShimmerLayout$Evaluator;)V", "maskPaint", "Landroid/graphics/Paint;", "matrixEvaluator", "Landroid/graphics/Matrix;", "getMatrixEvaluator", "setMatrixEvaluator", "shaderEvaluator", "Landroid/graphics/Shader;", "getShaderEvaluator", "setShaderEvaluator", "shimmerAngle", "getShimmerAngle", "()I", "setShimmerAngle", "(I)V", "shimmerCenterWidth", "getShimmerCenterWidth", "setShimmerCenterWidth", "value", "shimmerColor", "getShimmerColor", "setShimmerColor", "shimmerDuration", "", "getShimmerDuration", "()J", "setShimmerDuration", "(J)V", "shimmerGroup", "Lim/threads/ui/views/shimmerLayout/ShimmerGroup;", "getShimmerGroup", "()Lim/threads/ui/views/shimmerLayout/ShimmerGroup;", "setShimmerGroup", "(Lim/threads/ui/views/shimmerLayout/ShimmerGroup;)V", "shimmerWidth", "getShimmerWidth", "setShimmerWidth", "timeInterpolator", "Landroid/animation/TimeInterpolator;", "getTimeInterpolator", "()Landroid/animation/TimeInterpolator;", "setTimeInterpolator", "(Landroid/animation/TimeInterpolator;)V", "translateRange", "customizePaint", "", "animatedValue", "", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchDrawUsingPaint", "ensureAnimationStarted", "onDetachedFromWindow", "Lkotlin/Function1;", "setVisibility", RemoteMessageConst.Notification.VISIBILITY, "stopShimmerAnimation", "Companion", "Evaluator", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerLayout extends FrameLayout {
    private static final int DEFAULT_ANGLE = 20;
    private static final int DEFAULT_DURATION = 1200;
    private boolean animating;
    private Evaluator<Integer> colorEvaluator;
    private final Paint maskPaint;
    private Evaluator<? extends Matrix> matrixEvaluator;
    private Evaluator<? extends Shader> shaderEvaluator;
    private int shimmerAngle;
    private int shimmerCenterWidth;
    private int shimmerColor;
    private long shimmerDuration;
    private ShimmerGroup shimmerGroup;
    private int shimmerWidth;
    private TimeInterpolator timeInterpolator;
    private int translateRange;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_COLOR = R.color.ecc_default_foreground_color;
    private static final int DEFAULT_CENTER_WIDTH = R.dimen.ecc_shimmer_width_center_default;
    private static final int DEFAULT_SHADOW_WIDTH = R.dimen.ecc_shimmer_width_default;

    /* compiled from: ShimmerLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lim/threads/ui/views/shimmerLayout/ShimmerLayout$Companion;", "", "()V", "DEFAULT_ANGLE", "", "DEFAULT_CENTER_WIDTH", "DEFAULT_COLOR", "DEFAULT_DURATION", "DEFAULT_SHADOW_WIDTH", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ShimmerLayout.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/ui/views/shimmerLayout/ShimmerLayout$Evaluator;", "T", "", "evaluate", "fraction", "", "(F)Ljava/lang/Object;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Evaluator<T> {
        T evaluate(float f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerLayout(Context context) {
        this(context, null, 0, 6, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    private final void customizePaint(float f) {
        Evaluator<? extends Shader> evaluator = this.shaderEvaluator;
        if (evaluator != null) {
            this.maskPaint.setShader(evaluator.evaluate(f));
        }
        Evaluator<Integer> evaluator2 = this.colorEvaluator;
        if (evaluator2 != null) {
            setShimmerColor(evaluator2.evaluate(f).intValue());
        }
        Evaluator<? extends Matrix> evaluator3 = this.matrixEvaluator;
        if (evaluator3 != null) {
            this.maskPaint.getShader().setLocalMatrix(evaluator3.evaluate(f));
        }
    }

    private final void dispatchDrawUsingPaint(Canvas canvas) {
        ShimmerGroup shimmerGroup = this.shimmerGroup;
        if (shimmerGroup == null) {
            return;
        }
        canvas.saveLayer(null, null);
        super.dispatchDraw(canvas);
        customizePaint(shimmerGroup.getAnimatedValue$threads_release());
        canvas.drawPaint(this.maskPaint);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
        if (getWidth() > 0 && getHeight() > 0) {
            ensureAnimationStarted();
            dispatchDrawUsingPaint(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void ensureAnimationStarted() {
        int e;
        if (!this.animating && getWidth() > 0 && isShown()) {
            if (this.shimmerGroup == null) {
                this.shimmerGroup = new ShimmerGroup();
            }
            if (this.shaderEvaluator == null) {
                this.maskPaint.setShader(ShimmerUtil.INSTANCE.getShimmerShader$threads_release(getWidth(), this.shimmerAngle, this.shimmerWidth, this.shimmerCenterWidth));
            }
            e = i.e(getWidth(), getHeight());
            this.translateRange = e;
            ShimmerGroup shimmerGroup = this.shimmerGroup;
            if (shimmerGroup != null) {
                shimmerGroup.addView$threads_release(this, this.shimmerDuration, this.timeInterpolator);
            }
            this.animating = true;
        }
    }

    public final Evaluator<Integer> getColorEvaluator() {
        return this.colorEvaluator;
    }

    public final Evaluator<Matrix> getMatrixEvaluator() {
        return this.matrixEvaluator;
    }

    public final Evaluator<Shader> getShaderEvaluator() {
        return this.shaderEvaluator;
    }

    public final int getShimmerAngle() {
        return this.shimmerAngle;
    }

    public final int getShimmerCenterWidth() {
        return this.shimmerCenterWidth;
    }

    public final int getShimmerColor() {
        return this.shimmerColor;
    }

    public final long getShimmerDuration() {
        return this.shimmerDuration;
    }

    public final ShimmerGroup getShimmerGroup() {
        return this.shimmerGroup;
    }

    public final int getShimmerWidth() {
        return this.shimmerWidth;
    }

    public final TimeInterpolator getTimeInterpolator() {
        return this.timeInterpolator;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        stopShimmerAnimation();
        super.onDetachedFromWindow();
    }

    public final void setColorEvaluator(Evaluator<Integer> evaluator) {
        this.colorEvaluator = evaluator;
    }

    public final void setMatrixEvaluator(Evaluator<? extends Matrix> evaluator) {
        this.matrixEvaluator = evaluator;
    }

    public final void setShaderEvaluator(Evaluator<? extends Shader> evaluator) {
        this.shaderEvaluator = evaluator;
    }

    public final void setShimmerAngle(int i) {
        this.shimmerAngle = i;
    }

    public final void setShimmerCenterWidth(int i) {
        this.shimmerCenterWidth = i;
    }

    public final void setShimmerColor(int i) {
        this.maskPaint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        this.shimmerColor = i;
    }

    public final void setShimmerDuration(long j) {
        this.shimmerDuration = j;
    }

    public final void setShimmerGroup(ShimmerGroup shimmerGroup) {
        this.shimmerGroup = shimmerGroup;
    }

    public final void setShimmerWidth(int i) {
        this.shimmerWidth = i;
    }

    public final void setTimeInterpolator(TimeInterpolator timeInterpolator) {
        z65.h(timeInterpolator, "<set-?>");
        this.timeInterpolator = timeInterpolator;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (!isShown()) {
            stopShimmerAnimation();
        }
    }

    public final void stopShimmerAnimation() {
        ShimmerGroup shimmerGroup = this.shimmerGroup;
        if (shimmerGroup != null) {
            shimmerGroup.removeView$threads_release(this);
        }
        this.animating = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public final void setColorEvaluator(final Function1<? super Float, Integer> function1) {
        z65.h(function1, "value");
        setColorEvaluator(new Evaluator<Integer>() { // from class: im.threads.ui.views.shimmerLayout.ShimmerLayout$setColorEvaluator$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // im.threads.ui.views.shimmerLayout.ShimmerLayout.Evaluator
            public Integer evaluate(float f) {
                return function1.invoke(Float.valueOf(f));
            }
        });
    }

    public final void setMatrixEvaluator(final Function1<? super Float, ? extends Matrix> function1) {
        z65.h(function1, "value");
        setMatrixEvaluator(new Evaluator<Matrix>() { // from class: im.threads.ui.views.shimmerLayout.ShimmerLayout$setMatrixEvaluator$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // im.threads.ui.views.shimmerLayout.ShimmerLayout.Evaluator
            public Matrix evaluate(float f) {
                return function1.invoke(Float.valueOf(f));
            }
        });
    }

    public final void setShaderEvaluator(final Function1<? super Float, ? extends Shader> function1) {
        z65.h(function1, "value");
        setShaderEvaluator(new Evaluator<Shader>() { // from class: im.threads.ui.views.shimmerLayout.ShimmerLayout$setShaderEvaluator$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // im.threads.ui.views.shimmerLayout.ShimmerLayout.Evaluator
            public Shader evaluate(float f) {
                return function1.invoke(Float.valueOf(f));
            }
        });
    }

    public /* synthetic */ ShimmerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.shimmerLayoutStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.timeInterpolator = new LinearInterpolator();
        this.matrixEvaluator = new Evaluator<Matrix>() { // from class: im.threads.ui.views.shimmerLayout.ShimmerLayout$matrixEvaluator$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // im.threads.ui.views.shimmerLayout.ShimmerLayout.Evaluator
            public Matrix evaluate(float f) {
                int i2;
                Matrix matrix = new Matrix();
                i2 = ShimmerLayout.this.translateRange;
                matrix.setTranslate(((f * 2) - 1) * i2, 0.0f);
                return matrix;
            }
        };
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.maskPaint = paint;
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ShimmerLayout, i, 0);
        z65.g(obtainStyledAttributes, "context.theme.obtainStyl…rLayout, defStyleAttr, 0)");
        try {
            this.shimmerAngle = obtainStyledAttributes.getInteger(R.styleable.ShimmerLayout_shimmer_angle, 20);
            this.shimmerDuration = obtainStyledAttributes.getInteger(R.styleable.ShimmerLayout_shimmer_duration, DEFAULT_DURATION);
            int i2 = R.styleable.ShimmerLayout_shimmer_color;
            ShimmerUtil shimmerUtil = ShimmerUtil.INSTANCE;
            Context context2 = getContext();
            z65.g(context2, "getContext()");
            setShimmerColor(obtainStyledAttributes.getColor(i2, shimmerUtil.getColor$threads_release(context2, DEFAULT_COLOR)));
            this.shimmerWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ShimmerLayout_shimmer_width, getResources().getDimensionPixelSize(DEFAULT_SHADOW_WIDTH));
            this.shimmerCenterWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ShimmerLayout_shimmer_center_width, getResources().getDimensionPixelSize(DEFAULT_CENTER_WIDTH));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
