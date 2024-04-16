package com.dodopizza.android.buttons;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.android.buttons.DodoButton;
import com.google.android.material.button.MaterialButton;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DodoButton.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 22\u00020\u0001:\u000234B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0017J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0014J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0014J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0014R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/dodopizza/android/buttons/DodoButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "l", Image.TYPE_MEDIUM, "o", "", "fullWidth", "k", "onAttachedToWindow", "onDetachedFromWindow", "", "enabled", "setEnabled", "Lcom/dodopizza/android/buttons/DodoButton$a;", "buttonState", "setState", "extraSpace", "", "onCreateDrawableState", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Paint;", "q", "Landroid/graphics/Paint;", "progressPaint", "r", "Z", "isProgress", "Landroid/animation/ValueAnimator;", Image.TYPE_SMALL, "Landroid/animation/ValueAnimator;", "progressAnimator", "", "value", "t", "F", "setProgressStartAngle", "(F)V", "progressStartAngle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "u", "a", "b", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DodoButton extends MaterialButton {
    public static final b u = new b(null);
    private static final int[] v = {yv8.state_progress};
    private static final float w = kx9.a(2);
    private static final float x;
    private static final float y;
    private static final float z;
    private final Paint q;
    private boolean r;
    private ValueAnimator s;
    private float t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DodoButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/android/buttons/DodoButton$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a("IDLE", 0);
        public static final a b = new a("PROGRESS", 1);
        public static final a c = new a("DISABLED", 2);
        private static final /* synthetic */ a[] d;
        private static final /* synthetic */ kj3 e;

        static {
            a[] a2 = a();
            d = a2;
            e = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* compiled from: DodoButton.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/android/buttons/DodoButton$b;", "", "", "ANIMATION_DURATION", "J", "", "PROGRESS_END_ANGLE", "F", "PROGRESS_OFFSET_PX", "PROGRESS_SIZE_PX", "PROGRESS_START_ANGLE", "PROGRESS_STROKE_WIDTH_PX", "PROGRESS_SWEEP_ANGLE", "PROGRESS_TEXT_OFFSET", "", "STATE_PROGRESS", "[I", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DodoButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float a2 = kx9.a(16);
        x = a2;
        float a3 = kx9.a(16);
        y = a3;
        z = (a3 * 2) + a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DodoButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attributeSet");
        Paint paint = new Paint();
        paint.setStrokeWidth(w);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.q = paint;
        l(context, attributeSet);
    }

    private final int k(int i) {
        if (this.r) {
            return (int) (i - (z * 2));
        }
        return i;
    }

    private final void l(Context context, AttributeSet attributeSet) {
        o(context, attributeSet);
    }

    private final void m() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: s53
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DodoButton.n(DodoButton.this, valueAnimator);
            }
        });
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        this.s = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(DodoButton dodoButton, ValueAnimator valueAnimator) {
        z65.h(dodoButton, "this$0");
        z65.h(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        dodoButton.setProgressStartAngle(((Float) animatedValue).floatValue());
    }

    private final void o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w19.f0, 0, 0);
        try {
            this.q.setColor(obtainStyledAttributes.getColor(w19.g0, iu1.c(context, jw8.g)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setProgressStartAngle(float f) {
        this.t = f;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArr = v;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        if (this.r) {
            View.mergeDrawableStates(onCreateDrawableState, iArr);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        z65.h(canvas, "canvas");
        if (this.r) {
            canvas.save();
            canvas.translate(z, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
            float f2 = 2;
            float measuredHeight = getMeasuredHeight() / f2;
            float f3 = x;
            float f4 = f3 / f2;
            float f5 = measuredHeight - f4;
            float f6 = measuredHeight + f4;
            CharSequence text = getText();
            z65.g(text, "getText(...)");
            if (text.length() == 0) {
                f = (getMeasuredWidth() / 2) - f4;
            } else {
                f = y;
            }
            float f7 = f;
            canvas.drawArc(f7, f5, f7 + f3, f6, this.t, 270.0f, false, this.q);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.r) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(k(size), 1073741824), i2);
            setMeasuredDimension(size, getMeasuredHeight());
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public final void setState(a aVar) {
        z65.h(aVar, "buttonState");
        int i = c.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    super.setEnabled(false);
                    this.r = false;
                }
            } else {
                this.r = true;
                super.setEnabled(false);
            }
        } else {
            this.r = false;
            super.setEnabled(true);
        }
        refreshDrawableState();
        requestLayout();
        invalidate();
    }
}
