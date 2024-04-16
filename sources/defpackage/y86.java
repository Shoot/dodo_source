package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: MarkwonTheme.java */
/* renamed from: y86  reason: default package */
/* loaded from: classes3.dex */
public class y86 {
    private static final float[] x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};
    protected final int a;
    protected final boolean b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    protected final int g;
    protected final int h;
    protected final int i;
    protected final int j;
    protected final int k;
    protected final int l;
    protected final int m;
    protected final Typeface n;
    protected final Typeface o;
    protected final int p;
    protected final int q;
    protected final int r;
    protected final int s;
    protected final Typeface t;
    protected final float[] u;
    protected final int v;
    protected final int w;

    /* compiled from: MarkwonTheme.java */
    /* renamed from: y86$a */
    /* loaded from: classes3.dex */
    public static class a {
        private int a;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private Typeface n;
        private Typeface o;
        private int p;
        private int q;
        private int s;
        private Typeface t;
        private float[] u;
        private int v;
        private boolean b = true;
        private int r = -1;
        private int w = -1;

        a() {
        }

        @NonNull
        public y86 A() {
            return new y86(this);
        }

        @NonNull
        public a B(int i) {
            this.g = i;
            return this;
        }

        @NonNull
        public a C(int i) {
            this.h = i;
            return this;
        }

        @NonNull
        public a D(int i) {
            this.k = i;
            return this;
        }

        @NonNull
        public a E(int i) {
            this.l = i;
            return this;
        }

        @NonNull
        public a F(int i) {
            this.m = i;
            return this;
        }

        @NonNull
        public a G(int i) {
            this.j = i;
            return this;
        }

        @NonNull
        public a H(int i) {
            this.q = i;
            return this;
        }

        @NonNull
        public a I(@NonNull Typeface typeface) {
            this.o = typeface;
            return this;
        }

        @NonNull
        public a J(int i) {
            this.i = i;
            return this;
        }

        @NonNull
        public a K(int i) {
            this.p = i;
            return this;
        }

        @NonNull
        public a L(@NonNull Typeface typeface) {
            this.n = typeface;
            return this;
        }

        @NonNull
        public a M(int i) {
            this.s = i;
            return this;
        }

        @NonNull
        public a N(int i) {
            this.r = i;
            return this;
        }

        @NonNull
        public a O(@NonNull float[] fArr) {
            this.u = fArr;
            return this;
        }

        @NonNull
        public a P(@NonNull Typeface typeface) {
            this.t = typeface;
            return this;
        }

        @NonNull
        public a Q(boolean z) {
            this.b = z;
            return this;
        }

        @NonNull
        public a R(int i) {
            this.a = i;
            return this;
        }

        @NonNull
        public a S(int i) {
            this.f = i;
            return this;
        }

        @NonNull
        public a T(int i) {
            this.v = i;
            return this;
        }

        @NonNull
        public a U(int i) {
            this.w = i;
            return this;
        }

        @NonNull
        public a x(int i) {
            this.c = i;
            return this;
        }

        @NonNull
        public a y(int i) {
            this.e = i;
            return this;
        }

        @NonNull
        public a z(int i) {
            this.d = i;
            return this;
        }
    }

    protected y86(@NonNull a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
    }

    @NonNull
    public static a j(@NonNull Context context) {
        n23 a2 = n23.a(context);
        return new a().F(a2.b(8)).x(a2.b(24)).z(a2.b(4)).B(a2.b(1)).N(a2.b(1)).U(a2.b(4));
    }

    public void a(@NonNull Paint paint) {
        int i = this.e;
        if (i == 0) {
            i = pf1.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
    }

    public void b(@NonNull Paint paint) {
        int i = this.j;
        if (i == 0) {
            i = this.i;
        }
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.o;
        if (typeface == null) {
            typeface = this.n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.q;
            if (i2 <= 0) {
                i2 = this.p;
            }
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.q;
        if (i3 <= 0) {
            i3 = this.p;
        }
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i = this.i;
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.p;
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.p;
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int i = this.s;
        if (i == 0) {
            i = pf1.a(paint.getColor(), 75);
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.r;
        if (i2 >= 0) {
            paint.setStrokeWidth(i2);
        }
    }

    public void e(@NonNull Paint paint, int i) {
        Typeface typeface = this.t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.u;
        if (fArr == null) {
            fArr = x;
        }
        if (fArr != null && fArr.length >= i) {
            paint.setTextSize(paint.getTextSize() * fArr[i - 1]);
            return;
        }
        throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i), Arrays.toString(fArr)));
    }

    public void f(@NonNull Paint paint) {
        paint.setUnderlineText(this.b);
        int i = this.a;
        if (i != 0) {
            paint.setColor(i);
        } else if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    public void g(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.b);
        int i = this.a;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void h(@NonNull Paint paint) {
        int i = this.f;
        if (i == 0) {
            i = paint.getColor();
        }
        paint.setColor(i);
        int i2 = this.g;
        if (i2 != 0) {
            paint.setStrokeWidth(i2);
        }
    }

    public void i(@NonNull Paint paint) {
        int i = this.v;
        if (i == 0) {
            i = pf1.a(paint.getColor(), 25);
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.w;
        if (i2 >= 0) {
            paint.setStrokeWidth(i2);
        }
    }

    public int k() {
        return this.c;
    }

    public int l() {
        int i = this.d;
        if (i == 0) {
            return (int) ((this.c * 0.25f) + 0.5f);
        }
        return i;
    }

    public int m(int i) {
        int min = Math.min(this.c, i) / 2;
        int i2 = this.h;
        if (i2 != 0 && i2 <= min) {
            return i2;
        }
        return min;
    }

    public int n(@NonNull Paint paint) {
        int i = this.k;
        if (i == 0) {
            return pf1.a(paint.getColor(), 25);
        }
        return i;
    }

    public int o(@NonNull Paint paint) {
        int i = this.l;
        if (i == 0) {
            i = this.k;
        }
        if (i == 0) {
            return pf1.a(paint.getColor(), 25);
        }
        return i;
    }

    public int p() {
        return this.m;
    }
}
