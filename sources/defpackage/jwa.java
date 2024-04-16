package defpackage;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020\b\u0012\b\u0010+\u001a\u0004\u0018\u00010'\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00105\u001a\u00020.\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010<\u001a\u000207\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010?\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010A\u001a\u00020\b\u0012\b\u0010E\u001a\u0004\u0018\u00010B\u0012\b\u0010F\u001a\u0004\u0018\u00010B¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\"R\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010\fR\u0019\u0010+\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u000e\u0010*R\u0017\u0010-\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00105\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b4\u00102R\u0017\u00106\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010:\u001a\u0002078\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b \u00109R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b;\u00109R\u0017\u0010>\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010?\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b,\u0010\fR\u0017\u0010@\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b/\u0010\fR\u0017\u0010A\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\fR\u0019\u0010E\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\b(\u0010DR\u0019\u0010F\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\b=\u0010D¨\u0006I"}, d2 = {"Ljwa;", "", "", "a", "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "text", "", "b", "I", "q", "()I", "start", c.a, e.a, "end", "Landroid/text/TextPaint;", DateTokenConverter.CONVERTER_KEY, "Landroid/text/TextPaint;", "o", "()Landroid/text/TextPaint;", "paint", "u", "width", "Landroid/text/TextDirectionHeuristic;", "f", "Landroid/text/TextDirectionHeuristic;", Image.TYPE_SMALL, "()Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "g", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "alignment", Image.TYPE_HIGH, "n", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "i", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "ellipsize", "j", "ellipsizedWidth", "", "k", "F", Image.TYPE_MEDIUM, "()F", "lineSpacingMultiplier", "l", "lineSpacingExtra", "justificationMode", "", "Z", "()Z", "includePadding", "t", "useFallbackLineSpacing", "p", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "[I", "()[I", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jwa  reason: default package */
/* loaded from: classes.dex */
final class jwa {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final TextPaint d;
    private final int e;
    private final TextDirectionHeuristic f;
    private final Layout.Alignment g;
    private final int h;
    private final TextUtils.TruncateAt i;
    private final int j;
    private final float k;
    private final float l;
    private final int m;
    private final boolean n;
    private final boolean o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int[] t;
    private final int[] u;

    public jwa(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        z65.h(charSequence, "text");
        z65.h(textPaint, "paint");
        z65.h(textDirectionHeuristic, "textDir");
        z65.h(alignment, "alignment");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = textPaint;
        this.e = i3;
        this.f = textDirectionHeuristic;
        this.g = alignment;
        this.h = i4;
        this.i = truncateAt;
        this.j = i5;
        this.k = f;
        this.l = f2;
        this.m = i6;
        this.n = z;
        this.o = z2;
        this.p = i7;
        this.q = i8;
        this.r = i9;
        this.s = i10;
        this.t = iArr;
        this.u = iArr2;
        if (i >= 0 && i <= i2) {
            int length = charSequence.length();
            if (i2 < 0 || i2 > length) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i4 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i5 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (f < 0.0f) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final Layout.Alignment a() {
        return this.g;
    }

    public final int b() {
        return this.p;
    }

    public final TextUtils.TruncateAt c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.s;
    }

    public final boolean g() {
        return this.n;
    }

    public final int h() {
        return this.m;
    }

    public final int[] i() {
        return this.t;
    }

    public final int j() {
        return this.q;
    }

    public final int k() {
        return this.r;
    }

    public final float l() {
        return this.l;
    }

    public final float m() {
        return this.k;
    }

    public final int n() {
        return this.h;
    }

    public final TextPaint o() {
        return this.d;
    }

    public final int[] p() {
        return this.u;
    }

    public final int q() {
        return this.b;
    }

    public final CharSequence r() {
        return this.a;
    }

    public final TextDirectionHeuristic s() {
        return this.f;
    }

    public final boolean t() {
        return this.o;
    }

    public final int u() {
        return this.e;
    }
}
