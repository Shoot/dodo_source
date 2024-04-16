package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: MapTileProviderBase.java */
/* renamed from: p76  reason: default package */
/* loaded from: classes3.dex */
public abstract class p76 implements ds4 {
    private static int f = -3355444;
    protected final e76 a;
    private final Collection<Handler> b;
    protected boolean c;
    protected Drawable d;
    private org.osmdroid.tileprovider.tilesource.a e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapTileProviderBase.java */
    /* renamed from: p76$b */
    /* loaded from: classes3.dex */
    public abstract class b extends yfb {
        protected final HashMap<Long, Bitmap> e;
        protected int f;
        protected int g;
        protected int h;
        protected int i;
        protected Rect j;
        protected Rect k;
        protected Paint l;
        private boolean m;

        private b() {
            this.e = new HashMap<>();
        }

        @Override // defpackage.yfb
        public void a() {
            while (!this.e.isEmpty()) {
                long longValue = this.e.keySet().iterator().next().longValue();
                i(longValue, this.e.remove(Long.valueOf(longValue)));
            }
        }

        @Override // defpackage.yfb
        public void b(long j, int i, int i2) {
            if (this.m && p76.this.k(j) == null) {
                try {
                    g(j, i, i2);
                } catch (OutOfMemoryError unused) {
                    Log.e("OsmDroid", "OutOfMemoryError rescaling cache");
                }
            }
        }

        @Override // defpackage.yfb
        public void c() {
            boolean z;
            super.c();
            int abs = Math.abs(this.b - this.f);
            this.h = abs;
            this.i = this.g >> abs;
            if (abs != 0) {
                z = true;
            } else {
                z = false;
            }
            this.m = z;
        }

        protected abstract void g(long j, int i, int i2);

        public void h(double d, p99 p99Var, double d2, int i) {
            this.j = new Rect();
            this.k = new Rect();
            this.l = new Paint();
            this.f = cgb.l(d2);
            this.g = i;
            d(d, p99Var);
        }

        protected void i(long j, Bitmap bitmap) {
            p76.this.q(j, new bm9(bitmap), -3);
            if (dq1.a().v()) {
                Log.d("OsmDroid", "Created scaled tile: " + k76.h(j));
                this.l.setTextSize(40.0f);
                new Canvas(bitmap).drawText("scaled", 50.0f, 50.0f, this.l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapTileProviderBase.java */
    /* renamed from: p76$c */
    /* loaded from: classes3.dex */
    public class c extends b {
        private c() {
            super();
        }

        @Override // defpackage.p76.b
        public void g(long j, int i, int i2) {
            Bitmap r;
            Drawable e = p76.this.a.e(k76.b(this.f, k76.c(j) >> this.h, k76.d(j) >> this.h));
            if ((e instanceof BitmapDrawable) && (r = x66.r((BitmapDrawable) e, j, this.h)) != null) {
                this.e.put(Long.valueOf(j), r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapTileProviderBase.java */
    /* renamed from: p76$d */
    /* loaded from: classes3.dex */
    public class d extends b {
        private d() {
            super();
        }

        @Override // defpackage.p76.b
        protected void g(long j, int i, int i2) {
            Bitmap bitmap;
            if (this.h >= 4) {
                return;
            }
            int c = k76.c(j) << this.h;
            int d = k76.d(j);
            int i3 = this.h;
            int i4 = d << i3;
            int i5 = 1 << i3;
            Bitmap bitmap2 = null;
            Canvas canvas = null;
            for (int i6 = 0; i6 < i5; i6++) {
                for (int i7 = 0; i7 < i5; i7++) {
                    Drawable e = p76.this.a.e(k76.b(this.f, c + i6, i4 + i7));
                    if ((e instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) e).getBitmap()) != null) {
                        if (bitmap2 == null) {
                            bitmap2 = x66.t(this.g);
                            canvas = new Canvas(bitmap2);
                            canvas.drawColor(p76.f);
                        }
                        Rect rect = this.k;
                        int i8 = this.i;
                        rect.set(i6 * i8, i7 * i8, (i6 + 1) * i8, i8 * (i7 + 1));
                        canvas.drawBitmap(bitmap, (Rect) null, this.k, (Paint) null);
                    }
                }
            }
            if (bitmap2 != null) {
                this.e.put(Long.valueOf(j), bitmap2);
            }
        }
    }

    public p76(org.osmdroid.tileprovider.tilesource.a aVar) {
        this(aVar, null);
    }

    private void s(int i) {
        for (int i2 = 0; i2 < 3 && !t(i); i2++) {
        }
    }

    private boolean t(int i) {
        for (Handler handler : this.b) {
            try {
                if (handler != null) {
                    handler.sendEmptyMessage(i);
                }
            } catch (ConcurrentModificationException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ds4
    public void a(r76 r76Var, Drawable drawable) {
        q(r76Var.b(), drawable, -1);
        s(0);
        if (dq1.a().h()) {
            Log.d("OsmDroid", "MapTileProviderBase.mapTileRequestCompleted(): " + k76.h(r76Var.b()));
        }
    }

    @Override // defpackage.ds4
    public void b(r76 r76Var, Drawable drawable) {
        q(r76Var.b(), drawable, jn3.a(drawable));
        s(0);
        if (dq1.a().h()) {
            Log.d("OsmDroid", "MapTileProviderBase.mapTileRequestExpiredTile(): " + k76.h(r76Var.b()));
        }
    }

    @Override // defpackage.ds4
    public void e(r76 r76Var) {
        if (this.d != null) {
            q(r76Var.b(), this.d, -4);
            s(0);
        } else {
            s(1);
        }
        if (dq1.a().h()) {
            Log.d("OsmDroid", "MapTileProviderBase.mapTileRequestFailed(): " + k76.h(r76Var.b()));
        }
    }

    public void g() {
        this.a.a();
    }

    public e76 h() {
        return new e76();
    }

    public void i() {
        g();
        Drawable drawable = this.d;
        if (drawable != null && (drawable instanceof bm9)) {
            fc0.d().f((bm9) this.d);
        }
        this.d = null;
        g();
    }

    public void j(int i) {
        this.a.b(i);
    }

    public abstract Drawable k(long j);

    public abstract int l();

    public abstract int m();

    public e76 n() {
        return this.a;
    }

    public Collection<Handler> o() {
        return this.b;
    }

    public org.osmdroid.tileprovider.tilesource.a p() {
        return this.e;
    }

    protected void q(long j, Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        Drawable e = this.a.e(j);
        if (e != null && jn3.a(e) > i) {
            return;
        }
        jn3.b(drawable, i);
        this.a.m(j, drawable);
    }

    public void r(org.osmdroid.views.c cVar, double d2, double d3, Rect rect) {
        b dVar;
        if (cgb.l(d2) == cgb.l(d3)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (dq1.a().h()) {
            Log.i("OsmDroid", "rescale tile cache from " + d3 + " to " + d2);
        }
        gd8 I = cVar.I(rect.left, rect.top, null);
        gd8 I2 = cVar.I(rect.right, rect.bottom, null);
        p99 p99Var = new p99(I.a, I.b, I2.a, I2.b);
        if (d2 > d3) {
            dVar = new c();
        } else {
            dVar = new d();
        }
        dVar.h(d2, p99Var, d3, p().c());
        long currentTimeMillis2 = System.currentTimeMillis();
        if (dq1.a().h()) {
            Log.i("OsmDroid", "Finished rescale in " + (currentTimeMillis2 - currentTimeMillis) + "ms");
        }
    }

    public void u(org.osmdroid.tileprovider.tilesource.a aVar) {
        this.e = aVar;
        g();
    }

    public void v(boolean z) {
        this.c = z;
    }

    public boolean w() {
        return this.c;
    }

    public p76(org.osmdroid.tileprovider.tilesource.a aVar, Handler handler) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.c = true;
        this.d = null;
        this.a = h();
        linkedHashSet.add(handler);
        this.e = aVar;
    }
}
