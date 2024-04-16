package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import defpackage.pm7;
import java.util.LinkedList;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.c;
/* compiled from: MyLocationNewOverlay.java */
/* renamed from: or6  reason: default package */
/* loaded from: classes3.dex */
public class or6 extends pm7 implements hs4, pm7.a {
    public static final int C = pm7.c();
    protected Bitmap h;
    protected Bitmap i;
    protected MapView j;
    private bs4 k;
    public is4 l;
    private Handler p;
    private Location s;
    protected final PointF x;
    protected float y;
    protected float z;
    protected Paint f = new Paint();
    protected Paint g = new Paint();
    private final LinkedList<Runnable> m = new LinkedList<>();
    private final Point n = new Point();
    private final Point o = new Point();
    private Object q = new Object();
    protected boolean r = true;
    private final GeoPoint t = new GeoPoint(0, 0);
    private boolean u = false;
    protected boolean v = false;
    protected boolean w = true;
    private boolean A = true;
    private boolean B = false;

    public or6(is4 is4Var, MapView mapView) {
        this.j = mapView;
        this.k = mapView.getController();
        this.g.setARGB(0, 100, 100, 255);
        this.g.setAntiAlias(true);
        this.f.setFilterBitmap(true);
        I(((BitmapDrawable) mapView.getContext().getResources().getDrawable(fx8.a)).getBitmap());
        C(((BitmapDrawable) mapView.getContext().getResources().getDrawable(fx8.b)).getBitmap());
        this.x = new PointF();
        G(0.5f, 0.8125f);
        B(0.5f, 0.5f);
        this.p = new Handler(Looper.getMainLooper());
        F(is4Var);
    }

    public boolean A() {
        return this.u;
    }

    public void B(float f, float f2) {
        this.y = this.i.getWidth() * f;
        this.z = this.i.getHeight() * f2;
    }

    public void C(Bitmap bitmap) {
        this.i = bitmap;
    }

    public void D(boolean z) {
        this.w = z;
    }

    protected void E(Location location) {
        this.s = location;
        this.t.e(location.getLatitude(), this.s.getLongitude());
        if (this.v) {
            this.k.b(this.t);
            return;
        }
        MapView mapView = this.j;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    protected void F(is4 is4Var) {
        if (is4Var != null) {
            if (A()) {
                J();
            }
            this.l = is4Var;
            return;
        }
        throw new RuntimeException("You must pass an IMyLocationProvider to setMyLocationProvider()");
    }

    public void G(float f, float f2) {
        this.x.set(this.h.getWidth() * f, this.h.getHeight() * f2);
    }

    @Deprecated
    public void H(float f, float f2) {
        this.x.set(f, f2);
    }

    public void I(Bitmap bitmap) {
        this.h = bitmap;
    }

    protected void J() {
        Object obj;
        is4 is4Var = this.l;
        if (is4Var != null) {
            is4Var.c();
        }
        Handler handler = this.p;
        if (handler != null && (obj = this.q) != null) {
            handler.removeCallbacksAndMessages(obj);
        }
    }

    @Override // defpackage.pm7
    public void b(Canvas canvas, c cVar) {
        if (this.s != null && A()) {
            v(canvas, cVar, this.s);
        }
    }

    @Override // defpackage.pm7
    public void f(MapView mapView) {
        u();
        this.j = null;
        this.p = null;
        this.g = null;
        this.q = null;
        this.s = null;
        this.k = null;
        is4 is4Var = this.l;
        if (is4Var != null) {
            is4Var.destroy();
        }
        this.l = null;
        super.f(mapView);
    }

    @Override // defpackage.pm7
    public boolean r(MotionEvent motionEvent, MapView mapView) {
        boolean z;
        if (motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 0 && this.r) {
            t();
        } else if (z && z()) {
            return true;
        }
        return super.r(motionEvent, mapView);
    }

    public void t() {
        this.k.f(false);
        this.v = false;
    }

    public void u() {
        this.u = false;
        J();
        MapView mapView = this.j;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    protected void v(Canvas canvas, c cVar, Location location) {
        cVar.J(this.t, this.n);
        if (this.w) {
            float accuracy = location.getAccuracy() / ((float) cgb.c(location.getLatitude(), cVar.C()));
            this.g.setAlpha(50);
            this.g.setStyle(Paint.Style.FILL);
            Point point = this.n;
            canvas.drawCircle(point.x, point.y, accuracy, this.g);
            this.g.setAlpha(150);
            this.g.setStyle(Paint.Style.STROKE);
            Point point2 = this.n;
            canvas.drawCircle(point2.x, point2.y, accuracy, this.g);
        }
        if (location.hasBearing()) {
            canvas.save();
            float bearing = location.getBearing();
            if (bearing >= 360.0f) {
                bearing -= 360.0f;
            }
            Point point3 = this.n;
            canvas.rotate(bearing, point3.x, point3.y);
            Bitmap bitmap = this.i;
            Point point4 = this.n;
            canvas.drawBitmap(bitmap, point4.x - this.y, point4.y - this.z, this.f);
            canvas.restore();
            return;
        }
        canvas.save();
        Point point5 = this.n;
        canvas.rotate(-this.j.getMapOrientation(), point5.x, point5.y);
        Bitmap bitmap2 = this.h;
        Point point6 = this.n;
        PointF pointF = this.x;
        canvas.drawBitmap(bitmap2, point6.x - pointF.x, point6.y - pointF.y, this.f);
        canvas.restore();
    }

    public boolean w() {
        return x(this.l);
    }

    public boolean x(is4 is4Var) {
        Location b;
        F(is4Var);
        boolean a = this.l.a(this);
        this.u = a;
        if (a && (b = this.l.b()) != null) {
            E(b);
        }
        MapView mapView = this.j;
        if (mapView != null) {
            mapView.postInvalidate();
        }
        return a;
    }

    @Override // defpackage.pm7.a
    public boolean y(int i, int i2, Point point, es4 es4Var) {
        boolean z = false;
        if (this.s != null) {
            this.j.m60getProjection().J(this.t, this.o);
            Point point2 = this.o;
            point.x = point2.x;
            point.y = point2.y;
            double d = i - point2.x;
            double d2 = i2 - point2.y;
            if ((d * d) + (d2 * d2) < 64.0d) {
                z = true;
            }
            if (dq1.a().v()) {
                Log.d("OsmDroid", "snap=" + z);
            }
        }
        return z;
    }

    public boolean z() {
        return this.v;
    }
}
