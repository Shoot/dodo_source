package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PlaceholderSpan.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 32\u00020\u0001:\u0001\u0015B7\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J4\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017JR\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u001b\u0010\"R$\u0010(\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0015\u0010'R$\u0010*\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b\u001d\u0010\"R$\u0010,\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b\u0018\u0010\"R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00064"}, d2 = {"Lmb8;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "", "draw", "a", "F", "width", "b", "I", "widthUnit", c.a, "height", DateTokenConverter.CONVERTER_KEY, "heightUnit", e.a, "pxPerSp", "f", "()I", "verticalAlign", "<set-?>", "g", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", Image.TYPE_HIGH, "widthPx", "i", "heightPx", "", "j", "Z", "isLaidOut", "<init>", "(FIFIFI)V", "k", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mb8  reason: default package */
/* loaded from: classes.dex */
public final class mb8 extends ReplacementSpan {
    public static final a k = new a(null);
    private final float a;
    private final int b;
    private final float c;
    private final int d;
    private final float e;
    private final int f;
    private Paint.FontMetricsInt g;
    private int h;
    private int i;
    private boolean j;

    /* compiled from: PlaceholderSpan.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lmb8$a;", "", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: mb8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public mb8(float f, int i, float f2, int i2, float f3, int i3) {
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = f3;
        this.f = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        z65.z("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.j) {
            return this.i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        if (this.j) {
            return this.h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        z65.h(canvas, "canvas");
        z65.h(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int a2;
        z65.h(paint, "paint");
        this.j = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        z65.g(fontMetricsInt2, "paint.fontMetricsInt");
        this.g = fontMetricsInt2;
        if (a().descent > a().ascent) {
            int i3 = this.b;
            if (i3 != 0) {
                if (i3 == 1) {
                    f = this.a * textSize;
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                f = this.a * this.e;
            }
            this.h = nb8.a(f);
            int i4 = this.d;
            if (i4 != 0) {
                if (i4 == 1) {
                    a2 = nb8.a(this.c * textSize);
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                a2 = nb8.a(this.c * this.e);
            }
            this.i = a2;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.f) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b;
                            fontMetricsInt.descent = b + b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
