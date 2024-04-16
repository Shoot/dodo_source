package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import im.threads.ui.fragments.ChatFragment;
import org.osmdroid.views.MapView;
import org.osmdroid.views.c;
/* compiled from: TilesOverlay.java */
/* renamed from: fgb  reason: default package */
/* loaded from: classes3.dex */
public class fgb extends pm7 {
    static final float[] D;
    public static final ColorFilter E;
    private Context f;
    protected final p76 g;
    protected c l;
    private Rect x;
    public static final int y = pm7.c();
    public static final int z = pm7.d(zfb.b().size());
    public static final int A = pm7.c();
    public static final int B = pm7.c();
    public static final int C = pm7.c();
    protected Drawable h = null;
    protected final Paint i = new Paint();
    private final Rect j = new Rect();
    protected final p99 k = new p99();
    private boolean m = true;
    private BitmapDrawable n = null;
    private int o = Color.rgb(216, 208, 208);
    private int p = Color.rgb((int) ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, 192, 192);
    private boolean q = true;
    private boolean r = true;
    private ColorFilter s = null;
    private final Rect t = new Rect();
    private final bgb u = new bgb();
    private final a v = new a();
    private final Rect w = new Rect();

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: TilesOverlay.java */
    /* renamed from: fgb$a */
    /* loaded from: classes3.dex */
    public class a extends yfb {
        private Canvas e;

        public a() {
        }

        @Override // defpackage.yfb
        public void a() {
            fgb.this.u.a();
        }

        @Override // defpackage.yfb
        public void b(long j, int i, int i2) {
            bm9 bm9Var;
            Drawable k = fgb.this.g.k(j);
            fgb.this.u.b(k);
            if (this.e == null) {
                return;
            }
            boolean z = k instanceof bm9;
            if (z) {
                bm9Var = (bm9) k;
            } else {
                bm9Var = null;
            }
            if (k == null) {
                k = fgb.this.A();
            }
            if (k != null) {
                fgb fgbVar = fgb.this;
                fgbVar.l.y(i, i2, fgbVar.j);
                if (z) {
                    bm9Var.c();
                }
                if (z) {
                    try {
                        if (!bm9Var.e()) {
                            k = fgb.this.A();
                            z = false;
                        }
                    } catch (Throwable th) {
                        if (z) {
                            bm9Var.d();
                        }
                        throw th;
                    }
                }
                fgb fgbVar2 = fgb.this;
                fgbVar2.E(this.e, k, fgbVar2.j);
                if (z) {
                    bm9Var.d();
                }
            }
            if (dq1.a().h()) {
                fgb fgbVar3 = fgb.this;
                fgbVar3.l.y(i, i2, fgbVar3.j);
                this.e.drawText(k76.h(j), fgb.this.j.left + 1, fgb.this.j.top + fgb.this.i.getTextSize(), fgb.this.i);
                this.e.drawLine(fgb.this.j.left, fgb.this.j.top, fgb.this.j.right, fgb.this.j.top, fgb.this.i);
                this.e.drawLine(fgb.this.j.left, fgb.this.j.top, fgb.this.j.left, fgb.this.j.bottom, fgb.this.i);
            }
        }

        @Override // defpackage.yfb
        public void c() {
            Rect rect = this.a;
            fgb.this.g.j((((rect.bottom - rect.top) + 1) * ((rect.right - rect.left) + 1)) + dq1.a().B());
            fgb.this.u.c();
            super.c();
        }

        public void g(double d, p99 p99Var, Canvas canvas) {
            this.e = canvas;
            d(d, p99Var);
        }
    }

    static {
        float[] fArr = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        D = fArr;
        E = new ColorMatrixColorFilter(fArr);
    }

    public fgb(p76 p76Var, Context context, boolean z2, boolean z3) {
        this.f = context;
        if (p76Var != null) {
            this.g = p76Var;
            G(z2);
            K(z3);
            return;
        }
        throw new IllegalArgumentException("You must pass a valid tile provider to the tiles overlay.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable A() {
        int i;
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        if (this.n == null && this.o != 0) {
            try {
                if (this.g.p() != null) {
                    i = this.g.p().c();
                } else {
                    i = 256;
                }
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                canvas.drawColor(this.o);
                paint.setColor(this.p);
                paint.setStrokeWidth(0.0f);
                int i2 = i / 16;
                for (int i3 = 0; i3 < i; i3 += i2) {
                    float f = i3;
                    float f2 = i;
                    canvas.drawLine(0.0f, f, f2, f, paint);
                    canvas.drawLine(f, 0.0f, f, f2, paint);
                }
                this.n = new BitmapDrawable(createBitmap);
            } catch (NullPointerException unused) {
                Log.e("OsmDroid", "NullPointerException getting loading tile");
                System.gc();
            } catch (OutOfMemoryError unused2) {
                Log.e("OsmDroid", "OutOfMemoryError getting loading tile");
                System.gc();
            }
        }
        return this.n;
    }

    private void w() {
        BitmapDrawable bitmapDrawable = this.n;
        this.n = null;
        fc0.d().c(bitmapDrawable);
    }

    public int B() {
        return this.g.l();
    }

    public int C() {
        return this.g.m();
    }

    protected c D() {
        return this.l;
    }

    protected void E(Canvas canvas, Drawable drawable, Rect rect) {
        drawable.setColorFilter(this.s);
        drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        Rect z2 = z();
        if (z2 == null) {
            drawable.draw(canvas);
        } else if (!this.w.setIntersect(canvas.getClipBounds(), z2)) {
        } else {
            canvas.save();
            canvas.clipRect(this.w);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public void F(Canvas canvas, c cVar) {
        if (!L(canvas, cVar)) {
            return;
        }
        cgb.C(this.k, cgb.D(this.l.C()), this.t);
        this.g.n().f().F(cgb.l(this.l.C()), this.t);
        this.g.n().k();
    }

    public void G(boolean z2) {
        this.q = z2;
        this.v.e(z2);
    }

    public void H(int i) {
        if (this.o != i) {
            this.o = i;
            w();
        }
    }

    protected void I(c cVar) {
        this.l = cVar;
    }

    public void J(boolean z2) {
        this.g.v(z2);
    }

    public void K(boolean z2) {
        this.r = z2;
        this.v.f(z2);
    }

    protected boolean L(Canvas canvas, c cVar) {
        I(cVar);
        D().u(this.k);
        return true;
    }

    @Override // defpackage.pm7
    public void b(Canvas canvas, c cVar) {
        if (dq1.a().h()) {
            Log.d("OsmDroid", "onDraw");
        }
        if (!L(canvas, cVar)) {
            return;
        }
        x(canvas, D(), D().C(), this.k);
    }

    @Override // defpackage.pm7
    public void f(MapView mapView) {
        this.g.i();
        this.f = null;
        fc0.d().c(this.n);
        this.n = null;
        fc0.d().c(this.h);
        this.h = null;
    }

    public void x(Canvas canvas, c cVar, double d, p99 p99Var) {
        this.l = cVar;
        this.v.g(d, p99Var, canvas);
    }

    protected Rect z() {
        return this.x;
    }
}
