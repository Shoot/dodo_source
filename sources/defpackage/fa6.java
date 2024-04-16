package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.hha;
import defpackage.uga;
import defpackage.vga;
import java.util.BitSet;
/* compiled from: MaterialShapeDrawable.java */
/* renamed from: fa6  reason: default package */
/* loaded from: classes2.dex */
public class fa6 extends Drawable implements ghb, oha {
    private static final String x = "fa6";
    private static final Paint y;
    private c a;
    private final hha.g[] b;
    private final hha.g[] c;
    private final BitSet d;
    private boolean e;
    private final Matrix f;
    private final Path g;
    private final Path h;
    private final RectF i;
    private final RectF j;
    private final Region k;
    private final Region l;
    private uga m;
    private final Paint n;
    private final Paint o;
    private final pga p;
    @NonNull
    private final vga.b q;
    private final vga r;
    private PorterDuffColorFilter s;
    private PorterDuffColorFilter t;
    private int u;
    @NonNull
    private final RectF v;
    private boolean w;

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: fa6$a */
    /* loaded from: classes2.dex */
    class a implements vga.b {
        a() {
        }

        @Override // defpackage.vga.b
        public void a(@NonNull hha hhaVar, Matrix matrix, int i) {
            fa6.this.d.set(i + 4, hhaVar.e());
            fa6.this.c[i] = hhaVar.f(matrix);
        }

        @Override // defpackage.vga.b
        public void b(@NonNull hha hhaVar, Matrix matrix, int i) {
            fa6.this.d.set(i, hhaVar.e());
            fa6.this.b[i] = hhaVar.f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: fa6$b */
    /* loaded from: classes2.dex */
    public class b implements uga.c {
        final /* synthetic */ float a;

        b(float f) {
            this.a = f;
        }

        @Override // defpackage.uga.c
        @NonNull
        public dx1 a(@NonNull dx1 dx1Var) {
            if (!(dx1Var instanceof sc9)) {
                return new k9(this.a, dx1Var);
            }
            return dx1Var;
        }
    }

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ fa6(c cVar, a aVar) {
        this(cVar);
    }

    private float G() {
        if (P()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean N() {
        c cVar = this.a;
        int i = cVar.q;
        if (i != 1 && cVar.r > 0 && (i == 2 || X())) {
            return true;
        }
        return false;
    }

    private boolean O() {
        Paint.Style style = this.a.v;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    private boolean P() {
        Paint.Style style = this.a.v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(@NonNull Canvas canvas) {
        if (!N()) {
            return;
        }
        canvas.save();
        W(canvas);
        if (!this.w) {
            n(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.v.width() - getBounds().width());
        int height = (int) (this.v.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.a.r * 2) + width, ((int) this.v.height()) + (this.a.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.a.r) - width;
            float f2 = (getBounds().top - this.a.r) - height;
            canvas2.translate(-f, -f2);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    private static int V(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private void W(@NonNull Canvas canvas) {
        canvas.translate(B(), C());
    }

    private PorterDuffColorFilter f(@NonNull Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int l = l(color);
            this.u = l;
            if (l != color) {
                return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    private void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.a.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.v, true);
    }

    private void i() {
        uga y2 = E().y(new b(-G()));
        this.m = y2;
        this.r.e(y2, this.a.k, v(), this.h);
    }

    @NonNull
    private PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        this.u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @NonNull
    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z);
        }
        return f(paint, z);
    }

    @NonNull
    public static fa6 m(Context context, float f) {
        int c2 = ba6.c(context, qv8.colorSurface, fa6.class.getSimpleName());
        fa6 fa6Var = new fa6();
        fa6Var.Q(context);
        fa6Var.b0(ColorStateList.valueOf(c2));
        fa6Var.a0(f);
        return fa6Var;
    }

    private boolean m0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.a.d != null && color2 != (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            this.n.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.a.e != null && color != (colorForState = this.a.e.getColorForState(iArr, (color = this.o.getColor())))) {
            this.o.setColor(colorForState);
            return true;
        }
        return z;
    }

    private void n(@NonNull Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.s != 0) {
            canvas.drawPath(this.g, this.p.c());
        }
        for (int i = 0; i < 4; i++) {
            this.b[i].a(this.p, this.a.r, canvas);
            this.c[i].a(this.p, this.a.r, canvas);
        }
        if (this.w) {
            int B = B();
            int C = C();
            canvas.translate(-B, -C);
            canvas.drawPath(this.g, y);
            canvas.translate(B, C);
        }
    }

    private boolean n0() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.a;
        this.s = k(cVar.g, cVar.h, this.n, true);
        c cVar2 = this.a;
        this.t = k(cVar2.f, cVar2.h, this.o, false);
        c cVar3 = this.a;
        if (cVar3.u) {
            this.p.d(cVar3.g.getColorForState(getState(), 0));
        }
        if (!p57.a(porterDuffColorFilter, this.s) || !p57.a(porterDuffColorFilter2, this.t)) {
            return true;
        }
        return false;
    }

    private void o(@NonNull Canvas canvas) {
        p(canvas, this.n, this.g, this.a.a, u());
    }

    private void o0() {
        float M = M();
        this.a.r = (int) Math.ceil(0.75f * M);
        this.a.s = (int) Math.ceil(M * 0.25f);
        n0();
        R();
    }

    private void p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull uga ugaVar, @NonNull RectF rectF) {
        if (ugaVar.u(rectF)) {
            float a2 = ugaVar.t().a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    @NonNull
    private RectF v() {
        this.j.set(u());
        float G = G();
        this.j.inset(G, G);
        return this.j;
    }

    public int A() {
        return this.u;
    }

    public int B() {
        c cVar = this.a;
        return (int) (cVar.s * Math.sin(Math.toRadians(cVar.t)));
    }

    public int C() {
        c cVar = this.a;
        return (int) (cVar.s * Math.cos(Math.toRadians(cVar.t)));
    }

    public int D() {
        return this.a.r;
    }

    @NonNull
    public uga E() {
        return this.a.a;
    }

    public ColorStateList F() {
        return this.a.e;
    }

    public float H() {
        return this.a.l;
    }

    public ColorStateList I() {
        return this.a.g;
    }

    public float J() {
        return this.a.a.r().a(u());
    }

    public float K() {
        return this.a.a.t().a(u());
    }

    public float L() {
        return this.a.p;
    }

    public float M() {
        return w() + L();
    }

    public void Q(Context context) {
        this.a.b = new te3(context);
        o0();
    }

    public boolean S() {
        te3 te3Var = this.a.b;
        if (te3Var != null && te3Var.e()) {
            return true;
        }
        return false;
    }

    public boolean T() {
        return this.a.a.u(u());
    }

    public boolean X() {
        int i = Build.VERSION.SDK_INT;
        if (!T() && !this.g.isConvex() && i < 29) {
            return true;
        }
        return false;
    }

    public void Y(float f) {
        setShapeAppearanceModel(this.a.a.w(f));
    }

    public void Z(@NonNull dx1 dx1Var) {
        setShapeAppearanceModel(this.a.a.x(dx1Var));
    }

    public void a0(float f) {
        c cVar = this.a;
        if (cVar.o != f) {
            cVar.o = f;
            o0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f) {
        c cVar = this.a;
        if (cVar.k != f) {
            cVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public void d0(int i, int i2, int i3, int i4) {
        c cVar = this.a;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.a.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(V(alpha, this.a.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.a.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(V(alpha2, this.a.m));
        if (this.e) {
            i();
            g(u(), this.g);
            this.e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public void e0(float f) {
        c cVar = this.a;
        if (cVar.n != f) {
            cVar.n = f;
            o0();
        }
    }

    public void f0(boolean z) {
        this.w = z;
    }

    public void g0(int i) {
        this.p.d(i);
        this.a.u = false;
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.a.q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.a.k);
            return;
        }
        g(u(), this.g);
        if (this.g.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.k.set(getBounds());
        g(u(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(@NonNull RectF rectF, @NonNull Path path) {
        vga vgaVar = this.r;
        c cVar = this.a;
        vgaVar.d(cVar.a, cVar.k, rectF, this.q, path);
    }

    public void h0(int i) {
        c cVar = this.a;
        if (cVar.q != i) {
            cVar.q = i;
            R();
        }
    }

    public void i0(float f, int i) {
        l0(f);
        k0(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.a.g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.a.f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.a.e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.a.d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public void j0(float f, ColorStateList colorStateList) {
        l0(f);
        k0(colorStateList);
    }

    public void k0(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l(int i) {
        float M = M() + z();
        te3 te3Var = this.a.b;
        if (te3Var != null) {
            return te3Var.c(i, M);
        }
        return i;
    }

    public void l0(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.a = new c(this.a);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, defpackage.tab.b
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean m0 = m0(iArr);
        boolean n0 = n0();
        if (!m0 && !n0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        p(canvas, paint, path, this.a.a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(@NonNull Canvas canvas) {
        p(canvas, this.o, this.h, this.m, v());
    }

    public float s() {
        return this.a.a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.a;
        if (cVar.m != i) {
            cVar.m = i;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        R();
    }

    @Override // defpackage.oha
    public void setShapeAppearanceModel(@NonNull uga ugaVar) {
        this.a.a = ugaVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        n0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.a;
        if (cVar.h != mode) {
            cVar.h = mode;
            n0();
            R();
        }
    }

    public float t() {
        return this.a.a.l().a(u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public RectF u() {
        this.i.set(getBounds());
        return this.i;
    }

    public float w() {
        return this.a.o;
    }

    public ColorStateList x() {
        return this.a.d;
    }

    public float y() {
        return this.a.k;
    }

    public float z() {
        return this.a.n;
    }

    public fa6() {
        this(new uga());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: fa6$c */
    /* loaded from: classes2.dex */
    public static final class c extends Drawable.ConstantState {
        @NonNull
        public uga a;
        public te3 b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(uga ugaVar, te3 te3Var) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = ugaVar;
            this.b = te3Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            fa6 fa6Var = new fa6(this, null);
            fa6Var.e = true;
            return fa6Var;
        }

        public c(@NonNull c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }

    public fa6(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        this(uga.e(context, attributeSet, i, i2).m());
    }

    public fa6(@NonNull uga ugaVar) {
        this(new c(ugaVar, null));
    }

    private fa6(@NonNull c cVar) {
        vga vgaVar;
        this.b = new hha.g[4];
        this.c = new hha.g[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new pga();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            vgaVar = vga.k();
        } else {
            vgaVar = new vga();
        }
        this.r = vgaVar;
        this.v = new RectF();
        this.w = true;
        this.a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n0();
        m0(getState());
        this.q = new a();
    }
}
