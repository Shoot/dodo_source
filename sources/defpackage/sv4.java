package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageSpanCompat.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 22\u00020\u0001:\u0001\u000eB%\b\u0007\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020&¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J0\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J2\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016JP\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0018\u0010,\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0014\u0010/\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lsv4;", "Landroid/text/style/ReplacementSpan;", "", DateTokenConverter.CONVERTER_KEY, "", "ascent", "descent", c.a, "baseline", "top", "bottom", "b", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "a", "offsetAbove", "offsetBelow", e.a, "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "getSize", "Landroid/graphics/Canvas;", "canvas", "", "x", "y", "draw", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "drawable", "I", "mAlignment", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "margin", "mWidth", "mHeight", "f", "mBounds", "g", "Landroid/graphics/Paint$FontMetricsInt;", "mFontMetricsInt", "<init>", "(Landroid/graphics/drawable/Drawable;ILandroid/graphics/Rect;)V", Image.TYPE_HIGH, "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sv4  reason: default package */
/* loaded from: classes2.dex */
public final class sv4 extends ReplacementSpan {
    public static final a h = new a(null);
    private final Drawable a;
    private final int b;
    private final Rect c;
    private int d;
    private int e;
    private Rect f;
    private final Paint.FontMetricsInt g;

    /* compiled from: ImageSpanCompat.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lsv4$a;", "", "", "ALIGN_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sv4$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ sv4(Drawable drawable, int i, Rect rect, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? new Rect() : rect);
    }

    private final int a(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        int c = c(fontMetricsInt.ascent, fontMetricsInt.descent);
        int i2 = this.e + c;
        if (this.b == 2) {
            Rect rect = this.c;
            i = c - rect.top;
            i2 += rect.bottom;
        } else {
            i = c - this.c.top;
        }
        e(fontMetricsInt, i, i2);
        return this.d;
    }

    private final int b(int i, int i2, int i3, int i4, int i5) {
        Paint.FontMetricsInt fontMetricsInt = this.g;
        return i + c(fontMetricsInt.ascent, fontMetricsInt.descent);
    }

    private final int c(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.b;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    i3 = -this.e;
                    i4 = this.c.bottom;
                } else {
                    Rect rect = this.c;
                    int i6 = rect.bottom;
                    return (i + (((((i2 - i) + rect.top) + i6) - this.e) / 2)) - i6;
                }
            } else {
                i3 = -this.e;
                i4 = this.c.bottom;
            }
            return i3 - i4;
        }
        return (i2 - this.e) - this.c.bottom;
    }

    private final void d() {
        Rect bounds = this.a.getBounds();
        this.f = bounds;
        z65.e(bounds);
        int width = bounds.width();
        Rect rect = this.c;
        this.d = width + rect.left + rect.right;
        Rect rect2 = this.f;
        z65.e(rect2);
        this.e = rect2.height();
    }

    private final void e(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        if (i < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = i;
        }
        if (i < fontMetricsInt.top) {
            fontMetricsInt.top = i;
        }
        if (i2 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i2;
        }
        if (i2 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i2;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        z65.h(canvas, "canvas");
        z65.h(charSequence, "text");
        z65.h(paint, "paint");
        paint.getFontMetricsInt(this.g);
        Paint.FontMetricsInt fontMetricsInt = this.g;
        float f2 = f + this.c.left;
        float b = b(i4, fontMetricsInt.ascent, fontMetricsInt.descent, i3, i5);
        canvas.translate(f2, b);
        this.a.draw(canvas);
        canvas.translate(-f2, -b);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        z65.h(paint, "paint");
        z65.h(charSequence, "text");
        d();
        if (fontMetricsInt != null) {
            return a(fontMetricsInt);
        }
        return this.d;
    }

    public sv4(Drawable drawable, int i, Rect rect) {
        z65.h(drawable, "drawable");
        z65.h(rect, "margin");
        this.a = drawable;
        this.b = i;
        this.c = rect;
        this.g = new Paint.FontMetricsInt();
        d();
    }
}
