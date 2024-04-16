package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: LayoutIntrinsics.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001eR\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u001e¨\u0006#"}, d2 = {"Lum5;", "", "", "a", "Ljava/lang/CharSequence;", "charSequence", "Landroid/text/TextPaint;", "b", "Landroid/text/TextPaint;", "textPaint", "", c.a, "I", "textDirectionHeuristic", "", DateTokenConverter.CONVERTER_KEY, "F", "_maxIntrinsicWidth", e.a, "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", "f", "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", "g", "Z", "boringMetricsIsInit", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "()F", "minIntrinsicWidth", "maxIntrinsicWidth", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: um5  reason: default package */
/* loaded from: classes.dex */
public final class um5 {
    private final CharSequence a;
    private final TextPaint b;
    private final int c;
    private float d;
    private float e;
    private BoringLayout.Metrics f;
    private boolean g;

    public um5(CharSequence charSequence, TextPaint textPaint, int i) {
        z65.h(charSequence, "charSequence");
        z65.h(textPaint, "textPaint");
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = Float.NaN;
        this.e = Float.NaN;
    }

    public final BoringLayout.Metrics a() {
        if (!this.g) {
            this.f = te0.a.c(this.a, this.b, acb.j(this.c));
            this.g = true;
        }
        return this.f;
    }

    public final float b() {
        Float f;
        boolean e;
        if (!Float.isNaN(this.d)) {
            return this.d;
        }
        BoringLayout.Metrics a = a();
        if (a != null) {
            f = Float.valueOf(a.width);
        } else {
            f = null;
        }
        if (f == null) {
            CharSequence charSequence = this.a;
            f = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.b)));
        }
        e = wm5.e(f.floatValue(), this.a, this.b);
        if (e) {
            f = Float.valueOf(f.floatValue() + 0.5f);
        }
        float floatValue = f.floatValue();
        this.d = floatValue;
        return floatValue;
    }

    public final float c() {
        if (!Float.isNaN(this.e)) {
            return this.e;
        }
        float c = wm5.c(this.a, this.b);
        this.e = c;
        return c;
    }
}
