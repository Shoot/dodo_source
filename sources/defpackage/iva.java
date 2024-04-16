package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
/* compiled from: StaticLayoutBuilderCompat.java */
/* renamed from: iva  reason: default package */
/* loaded from: classes2.dex */
final class iva {
    static final int n;
    private static boolean o;
    private static Constructor<StaticLayout> p;
    private static Object q;
    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int e;
    private boolean l;
    private int d = 0;
    private Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    private int g = Integer.MAX_VALUE;
    private float h = 0.0f;
    private float i = 1.0f;
    private int j = n;
    private boolean k = true;
    private TextUtils.TruncateAt m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StaticLayoutBuilderCompat.java */
    /* renamed from: iva$a */
    /* loaded from: classes2.dex */
    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
        } else {
            i = 0;
        }
        n = i;
    }

    private iva(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    private void b() throws a {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        if (o) {
            return;
        }
        try {
            if (this.l && Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            q = textDirectionHeuristic;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            o = true;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    @NonNull
    public static iva c(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i) {
        return new iva(charSequence, textPaint, i);
    }

    public StaticLayout a() throws a {
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout build;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.m);
        }
        int min = Math.min(charSequence.length(), this.e);
        this.e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.l && this.g == 1) {
                this.f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, this.d, min, this.b, max);
            obtain.setAlignment(this.f);
            obtain.setIncludePad(this.k);
            if (this.l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.g);
            float f = this.h;
            if (f != 0.0f || this.i != 1.0f) {
                obtain.setLineSpacing(f, this.i);
            }
            if (this.g > 1) {
                obtain.setHyphenationFrequency(this.j);
            }
            build = obtain.build();
            return build;
        }
        b();
        try {
            return (StaticLayout) ((Constructor) kh8.f(p)).newInstance(charSequence, Integer.valueOf(this.d), Integer.valueOf(this.e), this.b, Integer.valueOf(max), this.f, kh8.f(q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.k), null, Integer.valueOf(max), Integer.valueOf(this.g));
        } catch (Exception e) {
            throw new a(e);
        }
    }

    @NonNull
    public iva d(@NonNull Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    @NonNull
    public iva e(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    @NonNull
    public iva f(int i) {
        this.j = i;
        return this;
    }

    @NonNull
    public iva g(boolean z) {
        this.k = z;
        return this;
    }

    public iva h(boolean z) {
        this.l = z;
        return this;
    }

    @NonNull
    public iva i(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    @NonNull
    public iva j(int i) {
        this.g = i;
        return this;
    }
}
