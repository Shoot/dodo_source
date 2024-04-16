package com.dodopizza.order.feature.halves.constructor.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HalvesScrollView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u000bB\u001d\b\u0016\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0014R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006-"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesScrollView;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attrs", "", com.huawei.hms.opendevice.c.a, "attr", DateTokenConverter.CONVERTER_KEY, "", "getStartAngel", "indicatorSize", "a", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "position", "b", "count", "setPositionsCount", "Landroid/graphics/Canvas;", "canvas", "onDraw", "F", "scroll_height", "I", "gravity", "startAngel", "positionsCount", com.huawei.hms.push.e.a, "Landroid/graphics/RectF;", "f", "Landroid/graphics/RectF;", "rectPath", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "pathPaint", Image.TYPE_HIGH, "indicatorPaint", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "i", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HalvesScrollView extends View {
    public static final a i = new a(null);
    public static final int j = 8;
    private float a;
    private int b;
    private float c;
    private int d;
    private int e;
    private RectF f;
    private final Paint g;
    private final Paint h;

    /* compiled from: HalvesScrollView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesScrollView$a;", "", "", "START_LEFT_ANGEL", "F", "START_RIGHT_ANGEL", "SWEEP_ANGEL", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HalvesScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 3;
        this.c = 150.0f;
        this.d = 1;
        this.f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        paint.setColor(iu1.c(getContext(), ew8.w));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setFlags(1);
        paint.setStrokeWidth(mpb.a(4.0f, getContext()));
        this.g = paint;
        Paint paint2 = new Paint();
        paint2.setColor(iu1.c(getContext(), ew8.x));
        paint2.setStyle(style);
        paint2.setFlags(1);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(mpb.a(4.0f, getContext()));
        this.h = paint2;
        c(attributeSet);
    }

    private final float a(float f) {
        float f2;
        float f3;
        if (this.b == 3) {
            f2 = ((this.d - this.e) - 1) * f;
            f3 = 150.0f;
        } else {
            f2 = this.e * f;
            f3 = 330.0f;
        }
        return f2 + f3;
    }

    private final void c(AttributeSet attributeSet) {
        float f;
        if (attributeSet != null) {
            d(attributeSet);
        }
        if (this.b == 3) {
            f = 150.0f;
        } else {
            f = 330.0f;
        }
        this.c = f;
        this.f = new RectF(getPaddingLeft(), 0.0f, this.a - getPaddingRight(), this.a);
    }

    private final void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, y19.E0);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.a = obtainStyledAttributes.getDimension(y19.G0, 0.0f);
        this.b = obtainStyledAttributes.getInteger(y19.F0, 3);
        obtainStyledAttributes.recycle();
    }

    private final float getStartAngel() {
        if (this.b == 3) {
            return 150.0f;
        }
        return 330.0f;
    }

    public final void b(int i2) {
        this.e = i2;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.f, getStartAngel(), 60.0f, false, this.g);
        float f = 60.0f / this.d;
        canvas.drawArc(this.f, a(f), f, false, this.h);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        float f = this.a;
        setMeasuredDimension((int) f, (int) f);
    }

    public final void setPositionsCount(int i2) {
        this.d = i2;
        invalidate();
    }
}
