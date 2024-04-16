package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: LineHeightStyleSpan.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\f\u001a\u00020\u0014\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\b\b\u0001\u0010 \u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0018R$\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b\u0019\u0010+R$\u0010.\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b\u001a\u0010+¨\u00061"}, d2 = {"Lzp5;", "Landroid/text/style/LineHeightSpan;", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "a", "", "text", "", "start", "end", "spanStartVertical", "lineHeight", "chooseHeight", "startIndex", "endIndex", "", "trimFirstLineTop", "b", "(IIZ)Lzp5;", "", "F", "getLineHeight", "()F", "I", c.a, DateTokenConverter.CONVERTER_KEY, "Z", e.a, "()Z", "trimLastLineBottom", "f", "topRatio", "g", "firstAscent", Image.TYPE_HIGH, "ascent", "i", "descent", "j", "lastDescent", "<set-?>", "k", "()I", "firstAscentDiff", "l", "lastDescentDiff", "<init>", "(FIIZZF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zp5  reason: default package */
/* loaded from: classes.dex */
public final class zp5 implements LineHeightSpan {
    private final float a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final float f;
    private int g = Integer.MIN_VALUE;
    private int h = Integer.MIN_VALUE;
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private int k;
    private int l;

    public zp5(float f, int i, int i2, boolean z, boolean z2, float f2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = f2;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int a = aq5.a(fontMetricsInt);
        int ceil2 = (int) Math.ceil(this.a);
        int i = ceil2 - a;
        float f = this.f;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / aq5.a(fontMetricsInt);
        }
        if (i <= 0) {
            ceil = Math.ceil(i * f);
        } else {
            ceil = Math.ceil(i * (1.0f - f));
        }
        int i2 = (int) ceil;
        int i3 = fontMetricsInt.descent;
        int i4 = i2 + i3;
        this.i = i4;
        int i5 = i4 - ceil2;
        this.h = i5;
        if (this.d) {
            i5 = fontMetricsInt.ascent;
        }
        this.g = i5;
        if (this.e) {
            i4 = i3;
        }
        this.j = i4;
        this.k = fontMetricsInt.ascent - i5;
        this.l = i4 - i3;
    }

    public final zp5 b(int i, int i2, boolean z) {
        return new zp5(this.a, i, i2, z, this.e, this.f);
    }

    public final int c() {
        return this.k;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        z65.h(charSequence, "text");
        z65.h(fontMetricsInt, "fontMetricsInt");
        if (aq5.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z2 = false;
        if (i == this.b) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == this.c) {
            z2 = true;
        }
        if (z && z2 && this.d && this.e) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        if (z) {
            i5 = this.g;
        } else {
            i5 = this.h;
        }
        fontMetricsInt.ascent = i5;
        if (z2) {
            i6 = this.j;
        } else {
            i6 = this.i;
        }
        fontMetricsInt.descent = i6;
    }

    public final int d() {
        return this.l;
    }

    public final boolean e() {
        return this.e;
    }
}
