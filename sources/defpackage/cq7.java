package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\b\u0002\u00100\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0002J\n\u0010\b\u001a\u00020\u0007*\u00020\u0007J\n\u0010\t\u001a\u00020\u0007*\u00020\u0007J\u0017\u0010\u000b\u001a\u00020\n*\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u00020\r*\u00020\rJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010%R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b \u0010\u001e\"\u0004\b'\u0010%R\"\u0010.\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b\u0016\u0010+\"\u0004\b/\u0010-R\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcq7;", "", "", "n", "j", "o", "k", "", "l", "p", "Ls67;", Image.TYPE_MEDIUM, "(J)J", "Lk99;", "i", "", "toString", "hashCode", "other", "", "equals", "Lbq7;", "a", "Lbq7;", e.a, "()Lbq7;", "paragraph", "b", "I", "f", "()I", "startIndex", c.a, "endIndex", DateTokenConverter.CONVERTER_KEY, "g", "setStartLineIndex", "(I)V", "startLineIndex", "setEndLineIndex", "endLineIndex", "F", Image.TYPE_HIGH, "()F", "setTop", "(F)V", "top", "setBottom", "bottom", "length", "<init>", "(Lbq7;IIIIFF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cq7  reason: default package */
/* loaded from: classes.dex */
public final class cq7 {
    private final bq7 a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    private float f;
    private float g;

    public cq7(bq7 bq7Var, int i, int i2, int i3, int i4, float f, float f2) {
        z65.h(bq7Var, "paragraph");
        this.a = bq7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final float a() {
        return this.g;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.c - this.b;
    }

    public final bq7 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq7)) {
            return false;
        }
        cq7 cq7Var = (cq7) obj;
        if (z65.c(this.a, cq7Var.a) && this.b == cq7Var.b && this.c == cq7Var.c && this.d == cq7Var.d && this.e == cq7Var.e && Float.compare(this.f, cq7Var.f) == 0 && Float.compare(this.g, cq7Var.g) == 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }

    public final float h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final k99 i(k99 k99Var) {
        z65.h(k99Var, "<this>");
        return k99Var.n(x67.a(0.0f, this.f));
    }

    public final int j(int i) {
        return i + this.b;
    }

    public final int k(int i) {
        return i + this.d;
    }

    public final float l(float f) {
        return f + this.f;
    }

    public final long m(long j) {
        return x67.a(s67.l(j), s67.m(j) - this.f);
    }

    public final int n(int i) {
        int l;
        l = i.l(i, this.b, this.c);
        return l - this.b;
    }

    public final int o(int i) {
        return i - this.d;
    }

    public final float p(float f) {
        return f - this.f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
