package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import org.osmdroid.views.MapView;
/* compiled from: CustomZoomButtonsDisplay.java */
/* renamed from: m42  reason: default package */
/* loaded from: classes3.dex */
public class m42 {
    private final MapView a;
    private final Point b = new Point();
    private Bitmap c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;
    private Paint g;
    private int h;
    private b i;
    private c j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomZoomButtonsDisplay.java */
    /* renamed from: m42$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: CustomZoomButtonsDisplay.java */
    /* renamed from: m42$b */
    /* loaded from: classes3.dex */
    public enum b {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: CustomZoomButtonsDisplay.java */
    /* renamed from: m42$c */
    /* loaded from: classes3.dex */
    public enum c {
        TOP,
        CENTER,
        BOTTOM
    }

    public m42(MapView mapView) {
        this.a = mapView;
        n(true, b.CENTER, c.BOTTOM);
        m(0.5f, 0.5f);
    }

    private Bitmap b(boolean z, boolean z2) {
        if (this.c == null) {
            l(g(true, true), g(true, false), g(false, true), g(false, false));
        }
        if (z) {
            if (z2) {
                return this.c;
            }
            return this.e;
        } else if (z2) {
            return this.d;
        } else {
            return this.f;
        }
    }

    private float c(int i) {
        float f;
        float f2;
        int i2 = a.a[this.i.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    float f3 = i / 2.0f;
                    if (this.k) {
                        float f4 = this.m;
                        int i3 = this.h;
                        f2 = ((f4 * i3) / 2.0f) + i3;
                    } else {
                        f2 = this.h / 2.0f;
                    }
                    return f3 - f2;
                }
                throw new IllegalArgumentException();
            }
            float f5 = i - this.t;
            int i4 = this.h;
            float f6 = f5 - i4;
            if (this.k) {
                f = (this.m * i4) + i4;
            } else {
                f = 0.0f;
            }
            return f6 - f;
        }
        return this.r;
    }

    private float d(int i) {
        float f;
        float f2;
        int i2 = a.b[this.j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    float f3 = i / 2.0f;
                    if (this.k) {
                        f2 = this.h / 2.0f;
                    } else {
                        float f4 = this.m;
                        int i3 = this.h;
                        f2 = ((f4 * i3) / 2.0f) + i3;
                    }
                    return f3 - f2;
                }
                throw new IllegalArgumentException();
            }
            float f5 = i - this.u;
            int i4 = this.h;
            float f6 = f5 - i4;
            if (this.k) {
                f = 0.0f;
            } else {
                f = i4 + (this.m * i4);
            }
            return f6 - f;
        }
        return this.s;
    }

    private float f(boolean z, boolean z2) {
        int i;
        float f;
        float f2;
        if (z2) {
            float c2 = c(this.a.getWidth());
            if (!this.k) {
                return c2;
            }
            if (!z) {
                return c2;
            }
            i = this.h;
            f = c2 + i;
            f2 = this.m;
        } else {
            float d = d(this.a.getHeight());
            if (this.k) {
                return d;
            }
            if (z) {
                return d;
            }
            i = this.h;
            f = d + i;
            f2 = this.m;
        }
        return f + (f2 * i);
    }

    private boolean h(int i, int i2, boolean z) {
        if (j(z, true, i) && j(z, false, i2)) {
            return true;
        }
        return false;
    }

    private boolean j(boolean z, boolean z2, float f) {
        float f2 = f(z, z2);
        if (f >= f2 && f <= f2 + this.h) {
            return true;
        }
        return false;
    }

    private void k() {
        float f = this.l * this.h;
        this.r = this.n + f;
        this.s = this.o + f;
        this.t = this.p + f;
        this.u = f + this.q;
    }

    public void a(Canvas canvas, float f, boolean z, boolean z2) {
        Paint paint;
        if (f == 0.0f) {
            return;
        }
        if (f == 1.0f) {
            paint = null;
        } else {
            if (this.g == null) {
                this.g = new Paint();
            }
            this.g.setAlpha((int) (f * 255.0f));
            paint = this.g;
        }
        canvas.drawBitmap(b(true, z), f(true, true), f(true, false), paint);
        canvas.drawBitmap(b(false, z2), f(false, true), f(false, false), paint);
    }

    protected Bitmap e(boolean z) {
        int i;
        if (z) {
            i = fx8.c;
        } else {
            i = fx8.d;
        }
        return ((BitmapDrawable) this.a.getResources().getDrawable(i)).getBitmap();
    }

    protected Bitmap g(boolean z, boolean z2) {
        int i;
        Bitmap e = e(z);
        this.h = e.getWidth();
        k();
        int i2 = this.h;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        if (z2) {
            i = -1;
        } else {
            i = -3355444;
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        int i3 = this.h;
        canvas.drawRect(0.0f, 0.0f, i3 - 1, i3 - 1, paint);
        canvas.drawBitmap(e, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public boolean i(MotionEvent motionEvent, boolean z) {
        if (motionEvent.getAction() == 1) {
            return h((int) motionEvent.getX(), (int) motionEvent.getY(), z);
        }
        return false;
    }

    public void l(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
        this.c = bitmap;
        this.e = bitmap2;
        this.d = bitmap3;
        this.f = bitmap4;
        this.h = bitmap.getWidth();
        k();
    }

    public void m(float f, float f2) {
        this.l = f;
        this.m = f2;
        k();
    }

    public void n(boolean z, b bVar, c cVar) {
        this.k = z;
        this.i = bVar;
        this.j = cVar;
    }
}
