package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import defpackage.cn0;
import defpackage.iva;
/* compiled from: CollapsingTextHelper.java */
/* renamed from: tb1  reason: default package */
/* loaded from: classes2.dex */
public final class tb1 {
    private static final boolean t0 = false;
    @NonNull
    private static final Paint u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private cn0 E;
    private cn0 F;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    @NonNull
    private final TextPaint V;
    @NonNull
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;
    private final View a;
    private float a0;
    private boolean b;
    private float b0;
    private float c;
    private ColorStateList c0;
    private boolean d;
    private float d0;
    private float e;
    private float e0;
    private float f;
    private float f0;
    private int g;
    private ColorStateList g0;
    @NonNull
    private final Rect h;
    private float h0;
    @NonNull
    private final Rect i;
    private float i0;
    @NonNull
    private final RectF j;
    private float j0;
    private StaticLayout k0;
    private float l0;
    private float m0;
    private float n0;
    private ColorStateList o;
    private CharSequence o0;
    private ColorStateList p;
    private int q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private Typeface x;
    private Typeface y;
    private Typeface z;
    private int k = 16;
    private int l = 16;
    private float m = 15.0f;
    private float n = 15.0f;
    private boolean J = true;
    private int p0 = 1;
    private float q0 = 0.0f;
    private float r0 = 1.0f;
    private int s0 = iva.n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: tb1$a */
    /* loaded from: classes2.dex */
    public class a implements cn0.a {
        a() {
        }

        @Override // defpackage.cn0.a
        public void a(Typeface typeface) {
            tb1.this.h0(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: tb1$b */
    /* loaded from: classes2.dex */
    class b implements cn0.a {
        b() {
        }

        @Override // defpackage.cn0.a
        public void a(Typeface typeface) {
            tb1.this.s0(typeface);
        }
    }

    public tb1(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.i = new Rect();
        this.h = new Rect();
        this.j = new RectF();
        this.f = e();
        V(view.getContext().getResources().getConfiguration());
    }

    private boolean I0() {
        if (this.p0 > 1 && ((!this.I || this.d) && !this.K)) {
            return true;
        }
        return false;
    }

    private Layout.Alignment K() {
        int b2 = ii4.b(this.k, this.I ? 1 : 0) & 7;
        if (b2 != 1) {
            if (b2 != 5) {
                if (this.I) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            } else if (this.I) {
                return Layout.Alignment.ALIGN_NORMAL;
            } else {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private void N(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.n);
        textPaint.setTypeface(this.x);
        textPaint.setLetterSpacing(this.h0);
    }

    private void O(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.i0);
    }

    private void P(float f) {
        Rect rect;
        if (this.d) {
            RectF rectF = this.j;
            if (f < this.f) {
                rect = this.h;
            } else {
                rect = this.i;
            }
            rectF.set(rect);
            return;
        }
        this.j.left = U(this.h.left, this.i.left, f, this.X);
        this.j.top = U(this.r, this.s, f, this.X);
        this.j.right = U(this.h.right, this.i.right, f, this.X);
        this.j.bottom = U(this.h.bottom, this.i.bottom, f, this.X);
    }

    private static boolean Q(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    private boolean R() {
        if (syb.E(this.a) == 1) {
            return true;
        }
        return false;
    }

    private boolean T(@NonNull CharSequence charSequence, boolean z) {
        pab pabVar;
        if (z) {
            pabVar = qab.d;
        } else {
            pabVar = qab.c;
        }
        return pabVar.a(charSequence, 0, charSequence.length());
    }

    private static float U(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return sk.a(f, f2, f3);
    }

    private float W(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static boolean a0(@NonNull Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }

    private void b(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        i(1.0f, z);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.k0) != null) {
            this.o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.o0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.l0 = W(this.V, charSequence2);
        } else {
            this.l0 = 0.0f;
        }
        int b2 = ii4.b(this.l, this.I ? 1 : 0);
        int i2 = b2 & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.s = this.i.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
            } else {
                this.s = this.i.bottom + this.V.ascent();
            }
        } else {
            this.s = this.i.top;
        }
        int i3 = b2 & 8388615;
        if (i3 != 1) {
            if (i3 != 5) {
                this.u = this.i.left;
            } else {
                this.u = this.i.right - this.l0;
            }
        } else {
            this.u = this.i.centerX() - (this.l0 / 2.0f);
        }
        i(0.0f, z);
        StaticLayout staticLayout2 = this.k0;
        if (staticLayout2 != null) {
            f = staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.k0;
        if (staticLayout3 != null && this.p0 > 1) {
            f2 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                f2 = W(this.V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.k0;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.q = i;
        int b3 = ii4.b(this.k, this.I ? 1 : 0);
        int i4 = b3 & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.r = this.h.centerY() - (f / 2.0f);
            } else {
                this.r = (this.h.bottom - f) + this.V.descent();
            }
        } else {
            this.r = this.h.top;
        }
        int i5 = b3 & 8388615;
        if (i5 != 1) {
            if (i5 != 5) {
                this.t = this.h.left;
            } else {
                this.t = this.h.right - f2;
            }
        } else {
            this.t = this.h.centerX() - (f2 / 2.0f);
        }
        j();
        y0(this.c);
    }

    private void c() {
        g(this.c);
    }

    private float d(float f) {
        float f2 = this.f;
        if (f <= f2) {
            return sk.b(1.0f, 0.0f, this.e, f2, f);
        }
        return sk.b(0.0f, 1.0f, f2, 1.0f, f);
    }

    private float e() {
        float f = this.e;
        return f + ((1.0f - f) * 0.5f);
    }

    private void e0(float f) {
        this.m0 = f;
        syb.l0(this.a);
    }

    private boolean f(@NonNull CharSequence charSequence) {
        boolean R = R();
        if (this.J) {
            return T(charSequence, R);
        }
        return R;
    }

    private void g(float f) {
        float f2;
        P(f);
        if (this.d) {
            if (f < this.f) {
                this.v = this.t;
                this.w = this.r;
                y0(0.0f);
                f2 = 0.0f;
            } else {
                this.v = this.u;
                this.w = this.s - Math.max(0, this.g);
                y0(1.0f);
                f2 = 1.0f;
            }
        } else {
            this.v = U(this.t, this.u, f, this.X);
            this.w = U(this.r, this.s, f, this.X);
            y0(f);
            f2 = f;
        }
        TimeInterpolator timeInterpolator = sk.b;
        e0(1.0f - U(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        o0(U(1.0f, 0.0f, f, timeInterpolator));
        if (this.p != this.o) {
            this.V.setColor(a(x(), v(), f2));
        } else {
            this.V.setColor(v());
        }
        float f3 = this.h0;
        float f4 = this.i0;
        if (f3 != f4) {
            this.V.setLetterSpacing(U(f4, f3, f, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f3);
        }
        this.P = U(this.d0, this.Z, f, null);
        this.Q = U(this.e0, this.a0, f, null);
        this.R = U(this.f0, this.b0, f, null);
        int a2 = a(w(this.g0), w(this.c0), f);
        this.S = a2;
        this.V.setShadowLayer(this.P, this.Q, this.R, a2);
        if (this.d) {
            int alpha = this.V.getAlpha();
            this.V.setAlpha((int) (d(f) * alpha));
        }
        syb.l0(this.a);
    }

    private void h(float f) {
        i(f, false);
    }

    private void i(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.G == null) {
            return;
        }
        float width = this.i.width();
        float width2 = this.h.width();
        boolean z6 = false;
        int i = 1;
        if (Q(f, 1.0f)) {
            f2 = this.n;
            f3 = this.h0;
            this.N = 1.0f;
            Typeface typeface = this.D;
            Typeface typeface2 = this.x;
            if (typeface != typeface2) {
                this.D = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f4 = this.m;
            float f5 = this.i0;
            Typeface typeface3 = this.D;
            Typeface typeface4 = this.A;
            if (typeface3 != typeface4) {
                this.D = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Q(f, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = U(this.m, this.n, f, this.Y) / this.m;
            }
            float f6 = this.n / this.m;
            float f7 = width2 * f6;
            if (z || f7 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f6, width2);
            }
            f2 = f4;
            f3 = f5;
            z3 = z2;
        }
        if (width > 0.0f) {
            if (this.O != f2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.j0 != f3) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z4 && !z5 && !this.U && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.O = f2;
            this.j0 = f3;
            this.U = false;
        }
        if (this.H == null || z3) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.D);
            this.V.setLetterSpacing(this.j0);
            TextPaint textPaint = this.V;
            if (this.N != 1.0f) {
                z6 = true;
            }
            textPaint.setLinearText(z6);
            this.I = f(this.G);
            if (I0()) {
                i = this.p0;
            }
            StaticLayout k = k(i, width, this.I);
            this.k0 = k;
            this.H = k.getText();
        }
    }

    private boolean i0(Typeface typeface) {
        cn0 cn0Var = this.F;
        if (cn0Var != null) {
            cn0Var.c();
        }
        if (this.z != typeface) {
            this.z = typeface;
            Typeface b2 = bpb.b(this.a.getContext().getResources().getConfiguration(), typeface);
            this.y = b2;
            if (b2 == null) {
                b2 = this.z;
            }
            this.x = b2;
            return true;
        }
        return false;
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private StaticLayout k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        Layout.Alignment K;
        try {
            if (i == 1) {
                K = Layout.Alignment.ALIGN_NORMAL;
            } else {
                K = K();
            }
            staticLayout = iva.c(this.G, this.V, (int) f).e(TextUtils.TruncateAt.END).h(z).d(K).g(false).j(i).i(this.q0, this.r0).f(this.s0).a();
        } catch (iva.a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) kh8.f(staticLayout);
    }

    private void m(@NonNull Canvas canvas, float f, float f2) {
        int alpha = this.V.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.V.setAlpha((int) (this.n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.V;
            textPaint.setShadowLayer(this.P, this.Q, this.R, ba6.a(this.S, textPaint.getAlpha()));
        }
        this.k0.draw(canvas);
        this.V.setAlpha((int) (this.m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, ba6.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.k0.getLineBaseline(0);
        CharSequence charSequence = this.o0;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.V);
        if (i >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (!this.d) {
            String trim = this.o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.k0.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.V);
        }
    }

    private void n() {
        if (this.L == null && !this.h.isEmpty() && !TextUtils.isEmpty(this.H)) {
            g(0.0f);
            int width = this.k0.getWidth();
            int height = this.k0.getHeight();
            if (width > 0 && height > 0) {
                this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.k0.draw(new Canvas(this.L));
                if (this.M == null) {
                    this.M = new Paint(3);
                }
            }
        }
    }

    private void o0(float f) {
        this.n0 = f;
        syb.l0(this.a);
    }

    private float s(int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.I) {
                    return this.i.right - this.l0;
                }
                return this.i.left;
            } else if (this.I) {
                return this.i.left;
            } else {
                return this.i.right - this.l0;
            }
        }
        return (i / 2.0f) - (this.l0 / 2.0f);
    }

    private float t(@NonNull RectF rectF, int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.I) {
                    return this.i.right;
                }
                return rectF.left + this.l0;
            } else if (this.I) {
                return rectF.left + this.l0;
            } else {
                return this.i.right;
            }
        }
        return (i / 2.0f) + (this.l0 / 2.0f);
    }

    private boolean t0(Typeface typeface) {
        cn0 cn0Var = this.E;
        if (cn0Var != null) {
            cn0Var.c();
        }
        if (this.C != typeface) {
            this.C = typeface;
            Typeface b2 = bpb.b(this.a.getContext().getResources().getConfiguration(), typeface);
            this.B = b2;
            if (b2 == null) {
                b2 = this.C;
            }
            this.A = b2;
            return true;
        }
        return false;
    }

    private int w(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int x() {
        return w(this.o);
    }

    private void y0(float f) {
        boolean z;
        h(f);
        if (t0 && this.N != 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.K = z;
        if (z) {
            n();
        }
        syb.l0(this.a);
    }

    public int A() {
        return this.k;
    }

    public void A0(float f) {
        this.r0 = f;
    }

    public float B() {
        O(this.W);
        return -this.W.ascent();
    }

    public void B0(int i) {
        if (i != this.p0) {
            this.p0 = i;
            j();
            Y();
        }
    }

    public Typeface C() {
        Typeface typeface = this.A;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public void C0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        Y();
    }

    public float D() {
        return this.c;
    }

    public void D0(boolean z) {
        this.J = z;
    }

    public float E() {
        return this.f;
    }

    public final boolean E0(int[] iArr) {
        this.T = iArr;
        if (S()) {
            Y();
            return true;
        }
        return false;
    }

    public int F() {
        return this.s0;
    }

    public void F0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            Y();
        }
    }

    public int G() {
        StaticLayout staticLayout = this.k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        Y();
    }

    public float H() {
        return this.k0.getSpacingAdd();
    }

    public void H0(Typeface typeface) {
        boolean i0 = i0(typeface);
        boolean t02 = t0(typeface);
        if (i0 || t02) {
            Y();
        }
    }

    public float I() {
        return this.k0.getSpacingMultiplier();
    }

    public int J() {
        return this.p0;
    }

    public TimeInterpolator L() {
        return this.X;
    }

    public CharSequence M() {
        return this.G;
    }

    public final boolean S() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.p;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.o) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    public void V(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.z;
            if (typeface != null) {
                this.y = bpb.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = bpb.b(configuration, typeface2);
            }
            Typeface typeface3 = this.y;
            if (typeface3 == null) {
                typeface3 = this.z;
            }
            this.x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            Z(true);
        }
    }

    void X() {
        boolean z;
        if (this.i.width() > 0 && this.i.height() > 0 && this.h.width() > 0 && this.h.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
    }

    public void Y() {
        Z(false);
    }

    public void Z(boolean z) {
        if ((this.a.getHeight() > 0 && this.a.getWidth() > 0) || z) {
            b(z);
            c();
        }
    }

    public void b0(int i, int i2, int i3, int i4) {
        if (!a0(this.i, i, i2, i3, i4)) {
            this.i.set(i, i2, i3, i4);
            this.U = true;
            X();
        }
    }

    public void c0(@NonNull Rect rect) {
        b0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(int i) {
        fab fabVar = new fab(this.a.getContext(), i);
        if (fabVar.i() != null) {
            this.p = fabVar.i();
        }
        if (fabVar.j() != 0.0f) {
            this.n = fabVar.j();
        }
        ColorStateList colorStateList = fabVar.c;
        if (colorStateList != null) {
            this.c0 = colorStateList;
        }
        this.a0 = fabVar.h;
        this.b0 = fabVar.i;
        this.Z = fabVar.j;
        this.h0 = fabVar.l;
        cn0 cn0Var = this.F;
        if (cn0Var != null) {
            cn0Var.c();
        }
        this.F = new cn0(new a(), fabVar.e());
        fabVar.g(this.a.getContext(), this.F);
        Y();
    }

    public void f0(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            Y();
        }
    }

    public void g0(int i) {
        if (this.l != i) {
            this.l = i;
            Y();
        }
    }

    public void h0(Typeface typeface) {
        if (i0(typeface)) {
            Y();
        }
    }

    public void j0(int i) {
        this.g = i;
    }

    public void k0(int i, int i2, int i3, int i4) {
        if (!a0(this.h, i, i2, i3, i4)) {
            this.h.set(i, i2, i3, i4);
            this.U = true;
            X();
        }
    }

    public void l(@NonNull Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.H != null && this.b) {
            this.V.setTextSize(this.O);
            float f = this.v;
            float f2 = this.w;
            if (this.K && this.L != null) {
                z = true;
            } else {
                z = false;
            }
            float f3 = this.N;
            if (f3 != 1.0f && !this.d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.L, f, f2, this.M);
                canvas.restoreToCount(save);
                return;
            }
            if (I0() && (!this.d || this.c > this.f)) {
                m(canvas, this.v - this.k0.getLineStart(0), f2);
            } else {
                canvas.translate(f, f2);
                this.k0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void l0(@NonNull Rect rect) {
        k0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void m0(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            Y();
        }
    }

    public void n0(int i) {
        fab fabVar = new fab(this.a.getContext(), i);
        if (fabVar.i() != null) {
            this.o = fabVar.i();
        }
        if (fabVar.j() != 0.0f) {
            this.m = fabVar.j();
        }
        ColorStateList colorStateList = fabVar.c;
        if (colorStateList != null) {
            this.g0 = colorStateList;
        }
        this.e0 = fabVar.h;
        this.f0 = fabVar.i;
        this.d0 = fabVar.j;
        this.i0 = fabVar.l;
        cn0 cn0Var = this.E;
        if (cn0Var != null) {
            cn0Var.c();
        }
        this.E = new cn0(new b(), fabVar.e());
        fabVar.g(this.a.getContext(), this.E);
        Y();
    }

    public void o(@NonNull RectF rectF, int i, int i2) {
        this.I = f(this.G);
        rectF.left = s(i, i2);
        rectF.top = this.i.top;
        rectF.right = t(rectF, i, i2);
        rectF.bottom = this.i.top + r();
    }

    public ColorStateList p() {
        return this.p;
    }

    public void p0(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            Y();
        }
    }

    public int q() {
        return this.l;
    }

    public void q0(int i) {
        if (this.k != i) {
            this.k = i;
            Y();
        }
    }

    public float r() {
        N(this.W);
        return -this.W.ascent();
    }

    public void r0(float f) {
        if (this.m != f) {
            this.m = f;
            Y();
        }
    }

    public void s0(Typeface typeface) {
        if (t0(typeface)) {
            Y();
        }
    }

    public Typeface u() {
        Typeface typeface = this.x;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public void u0(float f) {
        float a2 = na6.a(f, 0.0f, 1.0f);
        if (a2 != this.c) {
            this.c = a2;
            c();
        }
    }

    public int v() {
        return w(this.p);
    }

    public void v0(boolean z) {
        this.d = z;
    }

    public void w0(float f) {
        this.e = f;
        this.f = e();
    }

    public void x0(int i) {
        this.s0 = i;
    }

    public int y() {
        return this.q;
    }

    public float z() {
        O(this.W);
        return (-this.W.ascent()) + this.W.descent();
    }

    public void z0(float f) {
        this.q0 = f;
    }
}
