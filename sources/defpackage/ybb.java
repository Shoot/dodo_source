package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: TextLayout.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010[\u001a\u00020V\u0012\u0006\u0010\\\u001a\u00020\u0004\u0012\u0006\u0010^\u001a\u00020]\u0012\b\b\u0002\u0010_\u001a\u00020\u0002\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010`\u0012\b\b\u0002\u0010b\u001a\u00020\u0002\u0012\b\b\u0002\u0010c\u001a\u00020\u0004\u0012\b\b\u0003\u0010d\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0015\u0012\b\b\u0002\u0010)\u001a\u00020\u0015\u0012\b\b\u0002\u0010e\u001a\u00020\u0002\u0012\b\b\u0002\u0010f\u001a\u00020\u0002\u0012\b\b\u0002\u0010g\u001a\u00020\u0002\u0012\b\b\u0002\u0010h\u001a\u00020\u0002\u0012\b\b\u0002\u0010i\u001a\u00020\u0002\u0012\b\b\u0002\u0010j\u001a\u00020\u0002\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010k\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010k\u0012\b\b\u0002\u0010.\u001a\u00020*¢\u0006\u0004\bn\u0010oJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eJ\u000f\u0010\"\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\"\u0010#R\u0017\u0010&\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010#R\u0017\u0010)\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010#R\u0017\u0010.\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b,\u0010-R\u0017\u00100\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b'\u0010#R \u00107\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b9\u0010:R \u0010>\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b3\u00108\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010:R \u0010B\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b?\u00108\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010:R\u0014\u0010D\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010CR\u0014\u0010E\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010F\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010$R\u0016\u0010I\u001a\u0004\u0018\u00010G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u0014\u0010J\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010PR\u001b\u0010U\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\b?\u0010TR\u0011\u0010Y\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010Z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010:¨\u0006p"}, d2 = {"Lybb;", "", "", "line", "", e.a, Image.TYPE_SMALL, "j", "i", "lineIndex", "q", "r", "n", "t", Image.TYPE_MEDIUM, "l", "vertical", "p", "horizontal", "u", "offset", "", "upstream", "w", "y", "o", "C", "v", "Landroid/graphics/RectF;", "a", "Landroid/graphics/Canvas;", "canvas", "", "D", "B", "()Z", "Z", "f", "includePadding", "b", c.a, "fallbackLineSpacing", "Lum5;", "Lum5;", "getLayoutIntrinsics", "()Lum5;", "layoutIntrinsics", DateTokenConverter.CONVERTER_KEY, "didExceedMaxLines", "Landroid/text/Layout;", "Landroid/text/Layout;", "g", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "I", "k", "()I", "lineCount", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", Image.TYPE_HIGH, "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "F", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Lzp5;", "[Lzp5;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "rect", "Lrm5;", "Lrn5;", "()Lrm5;", "layoutHelper", "", "A", "()Ljava/lang/CharSequence;", "text", "height", "charSequence", "width", "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILum5;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ybb */
/* loaded from: classes.dex */
public final class ybb {
    private final boolean a;
    private final boolean b;
    private final um5 c;
    private final boolean d;
    private final Layout e;
    private final int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;
    private final boolean k;
    private final Paint.FontMetricsInt l;
    private final int m;
    private final zp5[] n;
    private final Rect o;
    private final rn5 p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrm5;", "a", "()Lrm5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ybb$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<rm5> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            ybb.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final rm5 invoke() {
            return new rm5(ybb.this.g());
        }
    }

    public ybb(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, um5 um5Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        Layout a2;
        long k;
        zp5[] i9;
        long h;
        Paint.FontMetricsInt g;
        rn5 a3;
        z65.h(charSequence, "charSequence");
        z65.h(textPaint, "textPaint");
        z65.h(um5Var, "layoutIntrinsics");
        this.a = z;
        this.b = z2;
        this.c = um5Var;
        this.o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic j = acb.j(i2);
        Layout.Alignment a4 = j9b.a.a(i);
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, w80.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a5 = um5Var.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a5 != null && um5Var.b() <= f && !z3) {
                this.k = true;
                a2 = te0.a.a(charSequence, textPaint, ceil, a5, a4, z, z2, truncateAt, ceil);
                textDirectionHeuristic = j;
            } else {
                this.k = false;
                textDirectionHeuristic = j;
                a2 = gwa.a.a(charSequence, 0, charSequence.length(), textPaint, ceil, j, a4, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            }
            this.e = a2;
            Trace.endSection();
            int min = Math.min(a2.getLineCount(), i3);
            this.f = min;
            int i10 = min - 1;
            this.d = min >= i3 && (a2.getEllipsisCount(i10) > 0 || a2.getLineEnd(i10) != charSequence.length());
            k = acb.k(this);
            i9 = acb.i(this);
            this.n = i9;
            h = acb.h(this, i9);
            this.g = Math.max(fyb.c(k), fyb.c(h));
            this.h = Math.max(fyb.b(k), fyb.b(h));
            g = acb.g(this, textPaint, textDirectionHeuristic, i9);
            this.m = g != null ? g.bottom - ((int) q(i10)) : 0;
            this.l = g;
            this.i = g05.b(a2, i10, null, 2, null);
            this.j = g05.d(a2, i10, null, 2, null);
            a3 = yn5.a(fo5.c, new a());
            this.p = a3;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final float e(int i) {
        if (i == this.f - 1) {
            return this.i + this.j;
        }
        return 0.0f;
    }

    private final rm5 h() {
        return (rm5) this.p.getValue();
    }

    public static /* synthetic */ float x(ybb ybbVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return ybbVar.w(i, z);
    }

    public static /* synthetic */ float z(ybb ybbVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return ybbVar.y(i, z);
    }

    public final CharSequence A() {
        CharSequence text = this.e.getText();
        z65.g(text, "layout.text");
        return text;
    }

    public final boolean B() {
        if (this.k) {
            te0 te0Var = te0.a;
            Layout layout = this.e;
            z65.f(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return te0Var.b((BoringLayout) layout);
        }
        gwa gwaVar = gwa.a;
        Layout layout2 = this.e;
        z65.f(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return gwaVar.c((StaticLayout) layout2, this.b);
    }

    public final boolean C(int i) {
        return this.e.isRtlCharAt(i);
    }

    public final void D(Canvas canvas) {
        dab dabVar;
        z65.h(canvas, "canvas");
        if (!canvas.getClipBounds(this.o)) {
            return;
        }
        int i = this.g;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        dabVar = acb.a;
        dabVar.a(canvas);
        this.e.draw(dabVar);
        int i2 = this.g;
        if (i2 != 0) {
            canvas.translate(0.0f, (-1) * i2);
        }
    }

    public final RectF a(int i) {
        boolean z;
        float y;
        float y2;
        float w;
        float w2;
        int o = o(i);
        float s = s(o);
        float j = j(o);
        if (v(o) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = this.e.isRtlCharAt(i);
        if (z && !isRtlCharAt) {
            y = w(i, false);
            y2 = w(i + 1, true);
        } else {
            if (z && isRtlCharAt) {
                w = y(i, false);
                w2 = y(i + 1, true);
            } else if (isRtlCharAt) {
                w = w(i, false);
                w2 = w(i + 1, true);
            } else {
                y = y(i, false);
                y2 = y(i + 1, true);
            }
            float f = w;
            y = w2;
            y2 = f;
        }
        return new RectF(y, s, y2, j);
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.b;
    }

    public final int d() {
        int height;
        if (this.d) {
            height = this.e.getLineBottom(this.f - 1);
        } else {
            height = this.e.getHeight();
        }
        return height + this.g + this.h + this.m;
    }

    public final boolean f() {
        return this.a;
    }

    public final Layout g() {
        return this.e;
    }

    public final float i(int i) {
        float lineBaseline;
        float f = this.g;
        if (i == this.f - 1 && this.l != null) {
            lineBaseline = s(i) - this.l.ascent;
        } else {
            lineBaseline = this.e.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float j(int i) {
        int i2;
        if (i == this.f - 1 && this.l != null) {
            return this.e.getLineBottom(i - 1) + this.l.bottom;
        }
        float lineBottom = this.g + this.e.getLineBottom(i);
        if (i == this.f - 1) {
            i2 = this.h;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int k() {
        return this.f;
    }

    public final int l(int i) {
        return this.e.getEllipsisCount(i);
    }

    public final int m(int i) {
        return this.e.getEllipsisStart(i);
    }

    public final int n(int i) {
        if (this.e.getEllipsisStart(i) == 0) {
            return this.e.getLineEnd(i);
        }
        return this.e.getText().length();
    }

    public final int o(int i) {
        return this.e.getLineForOffset(i);
    }

    public final int p(int i) {
        return this.e.getLineForVertical(i - this.g);
    }

    public final float q(int i) {
        return j(i) - s(i);
    }

    public final int r(int i) {
        return this.e.getLineStart(i);
    }

    public final float s(int i) {
        int i2;
        float lineTop = this.e.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.g;
        }
        return lineTop + i2;
    }

    public final int t(int i) {
        if (this.e.getEllipsisStart(i) == 0) {
            return this.e.getLineVisibleEnd(i);
        }
        return this.e.getEllipsisStart(i) + this.e.getLineStart(i);
    }

    public final int u(int i, float f) {
        return this.e.getOffsetForHorizontal(i, f + ((-1) * e(i)));
    }

    public final int v(int i) {
        return this.e.getParagraphDirection(i);
    }

    public final float w(int i, boolean z) {
        return h().c(i, true, z) + e(o(i));
    }

    public final float y(int i, boolean z) {
        return h().c(i, false, z) + e(o(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ybb(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, defpackage.um5 r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybb.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], um5, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
