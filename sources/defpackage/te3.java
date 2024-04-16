package defpackage;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
/* compiled from: ElevationOverlayProvider.java */
/* renamed from: te3  reason: default package */
/* loaded from: classes2.dex */
public class te3 {
    private static final int f = (int) Math.round(5.1000000000000005d);
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    public te3(@NonNull Context context) {
        this(x96.b(context, qv8.elevationOverlayEnabled, false), ba6.b(context, qv8.elevationOverlayColor, 0), ba6.b(context, qv8.elevationOverlayAccentColor, 0), ba6.b(context, qv8.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i) {
        if (qf1.p(i, 255) == this.d) {
            return true;
        }
        return false;
    }

    public float a(float f2) {
        float f3 = this.e;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        int i2;
        float a = a(f2);
        int alpha = Color.alpha(i);
        int h = ba6.h(qf1.p(i, 255), this.b, a);
        if (a > 0.0f && (i2 = this.c) != 0) {
            h = ba6.g(h, qf1.p(i2, f));
        }
        return qf1.p(h, alpha);
    }

    public int c(int i, float f2) {
        if (this.a && f(i)) {
            return b(i, f2);
        }
        return i;
    }

    public int d(float f2) {
        return c(this.d, f2);
    }

    public boolean e() {
        return this.a;
    }

    public te3(boolean z, int i, int i2, int i3, float f2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
