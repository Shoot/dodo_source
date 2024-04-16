package org.osmdroid.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.ZoomButtonsController;
import defpackage.xp6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.a;
/* loaded from: classes3.dex */
public class MapView extends ViewGroup implements es4, xp6.a<Object> {
    private static cgb n5 = new dgb();
    private int A;
    private p76 B;
    private Handler I;
    private boolean S4;
    private float T4;
    final Point U4;
    private final Point V4;
    private final LinkedList<f> W4;
    private boolean X4;
    private boolean Y4;
    private boolean Z4;
    private double a;
    private GeoPoint a5;
    private rm7 b;
    private long b5;
    protected org.osmdroid.views.c c;
    private long c5;
    private fgb d;
    protected List<r66> d5;
    private final GestureDetector e;
    private double e5;
    private final Scroller f;
    private boolean f5;
    protected boolean g;
    private final u76 g5;
    private boolean h;
    private final Rect h5;
    protected final AtomicBoolean i;
    private boolean i5;
    protected Double j;
    private int j5;
    protected Double k;
    private int k5;
    private final org.osmdroid.views.b l;
    private boolean l5;
    private final org.osmdroid.views.a m;
    private boolean m5;
    private xp6<Object> n;
    private final PointF o;
    private final GeoPoint p;
    private PointF q;
    private float r;
    private final Rect s;
    private boolean t;
    private double u;
    private double v;
    private boolean w;
    private double x;
    private double y;
    private int z;

    /* loaded from: classes3.dex */
    private class c implements GestureDetector.OnDoubleTapListener {
        private c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (MapView.this.getOverlayManager().g1(motionEvent, MapView.this)) {
                return true;
            }
            MapView.this.m60getProjection().F((int) motionEvent.getX(), (int) motionEvent.getY(), MapView.this.U4);
            bs4 controller = MapView.this.getController();
            Point point = MapView.this.U4;
            return controller.c(point.x, point.y);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (MapView.this.getOverlayManager().Q1(motionEvent, MapView.this)) {
                return true;
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (MapView.this.getOverlayManager().j1(motionEvent, MapView.this)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    private class d implements GestureDetector.OnGestureListener {
        private d() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            MapView mapView = MapView.this;
            if (mapView.g) {
                if (mapView.f != null) {
                    MapView.this.f.abortAnimation();
                }
                MapView.this.g = false;
            }
            if (!MapView.this.getOverlayManager().s1(motionEvent, MapView.this) && MapView.this.m != null) {
                MapView.this.m.i();
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!MapView.this.l5 || MapView.this.m5) {
                MapView.this.m5 = false;
                return false;
            } else if (MapView.this.getOverlayManager().E0(motionEvent, motionEvent2, f, f2, MapView.this)) {
                return true;
            } else {
                if (MapView.this.h) {
                    MapView.this.h = false;
                    return false;
                }
                MapView mapView = MapView.this;
                mapView.g = true;
                if (mapView.f != null) {
                    MapView.this.f.fling((int) MapView.this.getMapScrollX(), (int) MapView.this.getMapScrollY(), -((int) f), -((int) f2), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
                return true;
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (MapView.this.n != null && MapView.this.n.d()) {
                return;
            }
            MapView.this.getOverlayManager().D1(motionEvent, MapView.this);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (MapView.this.getOverlayManager().f0(motionEvent, motionEvent2, f, f2, MapView.this)) {
                return true;
            }
            MapView.this.scrollBy((int) f, (int) f2);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            MapView.this.getOverlayManager().N(motionEvent, MapView.this);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (MapView.this.getOverlayManager().M(motionEvent, MapView.this)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(View view, int i, int i2, int i3, int i4);
    }

    public MapView(Context context, p76 p76Var, Handler handler, AttributeSet attributeSet) {
        this(context, p76Var, handler, attributeSet, dq1.a().p());
    }

    private void C() {
        this.c = null;
    }

    private MotionEvent F(MotionEvent motionEvent) {
        if (getMapOrientation() == 0.0f) {
            return motionEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.transform(m60getProjection().l());
        return obtain;
    }

    private void P(org.osmdroid.tileprovider.tilesource.a aVar) {
        float f2;
        float c2 = aVar.c();
        float f3 = (getResources().getDisplayMetrics().density * 256.0f) / c2;
        if (x()) {
            f2 = f3 * this.T4;
        } else {
            f2 = this.T4;
        }
        int i = (int) (c2 * f2);
        if (dq1.a().A()) {
            Log.d("OsmDroid", "Scaling tiles to " + i);
        }
        cgb.M(i);
    }

    public static cgb getTileSystem() {
        return n5;
    }

    private void p() {
        this.m.r(n());
        this.m.s(o());
    }

    public static void setTileSystem(cgb cgbVar) {
        n5 = cgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [org.osmdroid.tileprovider.tilesource.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.StringBuilder] */
    private org.osmdroid.tileprovider.tilesource.a t(AttributeSet attributeSet) {
        String attributeValue;
        da7 da7Var = zfb.d;
        if (attributeSet != null && (attributeValue = attributeSet.getAttributeValue(null, "tilesource")) != null) {
            try {
                ?? a2 = zfb.a(attributeValue);
                Log.i("OsmDroid", "Using tile source specified in layout attributes: " + a2);
                da7Var = a2;
            } catch (IllegalArgumentException unused) {
                Log.w("OsmDroid", "Invalid tile source specified in layout attributes: " + da7Var);
            }
        }
        if (attributeSet != null && (da7Var instanceof bt4)) {
            String attributeValue2 = attributeSet.getAttributeValue(null, "style");
            if (attributeValue2 == null) {
                Log.i("OsmDroid", "Using default style: 1");
            } else {
                Log.i("OsmDroid", "Using style specified in layout attributes: " + attributeValue2);
                ((bt4) da7Var).g(attributeValue2);
            }
        }
        Log.i("OsmDroid", "Using tile source: " + da7Var.name());
        return da7Var;
    }

    public void A() {
        getOverlayManager().K0(this);
        this.B.i();
        org.osmdroid.views.a aVar = this.m;
        if (aVar != null) {
            aVar.o();
        }
        Handler handler = this.I;
        if (handler instanceof hla) {
            ((hla) handler).a();
        }
        this.I = null;
        org.osmdroid.views.c cVar = this.c;
        if (cVar != null) {
            cVar.e();
        }
        this.c = null;
        this.g5.a();
        this.d5.clear();
    }

    public void B() {
        this.q = null;
    }

    public void D() {
        this.t = false;
    }

    public void E() {
        this.w = false;
    }

    public void G(vr4 vr4Var, long j, long j2) {
        GeoPoint k = m60getProjection().k();
        this.a5 = (GeoPoint) vr4Var;
        I(-j, -j2);
        C();
        if (!m60getProjection().k().equals(k)) {
            ox9 ox9Var = null;
            for (r66 r66Var : this.d5) {
                if (ox9Var == null) {
                    ox9Var = new ox9(this, 0, 0);
                }
                r66Var.b(ox9Var);
            }
        }
        invalidate();
    }

    public void H(float f2, boolean z) {
        this.r = f2 % 360.0f;
        if (z) {
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(long j, long j2) {
        this.b5 = j;
        this.c5 = j2;
        requestLayout();
    }

    protected void J(float f2, float f3) {
        this.q = new PointF(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(float f2, float f3) {
        this.o.set(f2, f3);
        Point L = m60getProjection().L((int) f2, (int) f3, null);
        m60getProjection().f(L.x, L.y, this.p);
        J(f2, f3);
    }

    public void L(double d2, double d3, int i) {
        this.t = true;
        this.u = d2;
        this.v = d3;
        this.A = i;
    }

    public void M(double d2, double d3, int i) {
        this.w = true;
        this.x = d2;
        this.y = d3;
        this.z = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double N(double d2) {
        double max = Math.max(getMinZoomLevel(), Math.min(getMaxZoomLevel(), d2));
        double d3 = this.a;
        int i = (max > d3 ? 1 : (max == d3 ? 0 : -1));
        if (i != 0) {
            Scroller scroller = this.f;
            if (scroller != null) {
                scroller.forceFinished(true);
            }
            this.g = false;
        }
        GeoPoint k = m60getProjection().k();
        this.a = max;
        setExpectedCenter(k);
        p();
        edc edcVar = null;
        if (w()) {
            getController().d(k);
            Point point = new Point();
            org.osmdroid.views.c m60getProjection = m60getProjection();
            rm7 overlayManager = getOverlayManager();
            PointF pointF = this.o;
            if (overlayManager.y((int) pointF.x, (int) pointF.y, point, this)) {
                getController().b(m60getProjection.g(point.x, point.y, null, false));
            }
            this.B.r(m60getProjection, max, d3, s(this.h5));
            this.m5 = true;
        }
        if (i != 0) {
            for (r66 r66Var : this.d5) {
                if (edcVar == null) {
                    edcVar = new edc(this, max);
                }
                r66Var.a(edcVar);
            }
        }
        requestLayout();
        invalidate();
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O() {
        this.e5 = getZoomLevelDouble();
    }

    public double Q(BoundingBox boundingBox, boolean z, int i, double d2, Long l) {
        int i2 = i * 2;
        double h = n5.h(boundingBox, getWidth() - i2, getHeight() - i2);
        if (h == Double.MIN_VALUE || h > d2) {
            h = d2;
        }
        double min = Math.min(getMaxZoomLevel(), Math.max(h, getMinZoomLevel()));
        GeoPoint j = boundingBox.j();
        org.osmdroid.views.c cVar = new org.osmdroid.views.c(min, getWidth(), getHeight(), j, getMapOrientation(), v(), y(), getMapCenterOffsetX(), getMapCenterOffsetY());
        Point point = new Point();
        double f2 = boundingBox.f();
        cVar.J(new GeoPoint(boundingBox.c(), f2), point);
        int i3 = point.y;
        cVar.J(new GeoPoint(boundingBox.d(), f2), point);
        int height = ((getHeight() - point.y) - i3) / 2;
        if (height != 0) {
            cVar.b(0L, height);
            cVar.f(getWidth() / 2, getHeight() / 2, j);
        }
        if (z) {
            getController().e(j, Double.valueOf(min), l);
        } else {
            getController().g(min);
            getController().d(j);
        }
        return min;
    }

    public void R(BoundingBox boundingBox, boolean z) {
        S(boundingBox, z, 0);
    }

    public void S(BoundingBox boundingBox, boolean z, int i) {
        Q(boundingBox, z, i, getMaxZoomLevel(), null);
    }

    @Override // defpackage.xp6.a
    public void a(Object obj, xp6.b bVar) {
        if (this.f5) {
            this.a = Math.round(this.a);
            invalidate();
        }
        B();
    }

    @Override // defpackage.xp6.a
    public void b(Object obj, xp6.c cVar) {
        O();
        PointF pointF = this.o;
        cVar.n(pointF.x, pointF.y, true, 1.0f, false, 0.0f, 0.0f, false, 0.0f);
    }

    @Override // defpackage.xp6.a
    public boolean c(Object obj, xp6.c cVar, xp6.b bVar) {
        J(cVar.k(), cVar.l());
        setMultiTouchScale(cVar.j());
        requestLayout();
        invalidate();
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.f;
        if (scroller == null || !this.g || !scroller.computeScrollOffset()) {
            return;
        }
        if (this.f.isFinished()) {
            this.g = false;
            return;
        }
        scrollTo(this.f.getCurrX(), this.f.getCurrY());
        postInvalidate();
    }

    @Override // defpackage.xp6.a
    public Object d(xp6.b bVar) {
        if (u()) {
            return null;
        }
        K(bVar.i(), bVar.j());
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        C();
        m60getProjection().G(canvas, true, false);
        try {
            getOverlayManager().F1(canvas, this);
            m60getProjection().E(canvas, false);
            org.osmdroid.views.a aVar = this.m;
            if (aVar != null) {
                aVar.k(canvas);
            }
            super.dispatchDraw(canvas);
        } catch (Exception e2) {
            Log.e("OsmDroid", "error dispatchDraw, probably in edit mode", e2);
        }
        if (dq1.a().A()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.d("OsmDroid", "Rendering overall: " + (currentTimeMillis2 - currentTimeMillis) + "ms");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (dq1.a().A()) {
            Log.d("OsmDroid", "dispatchTouchEvent(" + motionEvent + ")");
        }
        if (this.m.m(motionEvent)) {
            this.m.i();
            return true;
        }
        MotionEvent F = F(motionEvent);
        try {
            if (super.dispatchTouchEvent(motionEvent)) {
                if (dq1.a().A()) {
                    Log.d("OsmDroid", "super handled onTouchEvent");
                }
                return true;
            } else if (getOverlayManager().j0(F, this)) {
                if (F != motionEvent) {
                    F.recycle();
                }
                return true;
            } else {
                xp6<Object> xp6Var = this.n;
                if (xp6Var != null && xp6Var.f(motionEvent)) {
                    if (dq1.a().A()) {
                        Log.d("OsmDroid", "mMultiTouchController handled onTouchEvent");
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (this.e.onTouchEvent(F)) {
                    if (dq1.a().A()) {
                        Log.d("OsmDroid", "mGestureDetector handled onTouchEvent");
                    }
                } else if (!z) {
                    if (F != motionEvent) {
                        F.recycle();
                    }
                    if (dq1.a().A()) {
                        Log.d("OsmDroid", "no-one handled onTouchEvent");
                    }
                    return false;
                }
                if (F != motionEvent) {
                    F.recycle();
                }
                return true;
            }
        } finally {
            if (F != motionEvent) {
                F.recycle();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2, null, 8, 0, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public BoundingBox getBoundingBox() {
        return m60getProjection().h();
    }

    public bs4 getController() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeoPoint getExpectedCenter() {
        return this.a5;
    }

    public double getLatitudeSpanDouble() {
        return getBoundingBox().m();
    }

    public double getLongitudeSpanDouble() {
        return getBoundingBox().q();
    }

    public vr4 getMapCenter() {
        return r(null);
    }

    public int getMapCenterOffsetX() {
        return this.j5;
    }

    public int getMapCenterOffsetY() {
        return this.k5;
    }

    public float getMapOrientation() {
        return this.r;
    }

    public fgb getMapOverlay() {
        return this.d;
    }

    @Deprecated
    public float getMapScale() {
        return 1.0f;
    }

    public long getMapScrollX() {
        return this.b5;
    }

    public long getMapScrollY() {
        return this.c5;
    }

    public double getMaxZoomLevel() {
        Double d2 = this.k;
        if (d2 == null) {
            return this.d.B();
        }
        return d2.doubleValue();
    }

    public double getMinZoomLevel() {
        Double d2 = this.j;
        if (d2 == null) {
            return this.d.C();
        }
        return d2.doubleValue();
    }

    public rm7 getOverlayManager() {
        return this.b;
    }

    public List<pm7> getOverlays() {
        return getOverlayManager().M0();
    }

    public u76 getRepository() {
        return this.g5;
    }

    public Scroller getScroller() {
        return this.f;
    }

    public p76 getTileProvider() {
        return this.B;
    }

    public Handler getTileRequestCompleteHandler() {
        return this.I;
    }

    public float getTilesScaleFactor() {
        return this.T4;
    }

    public org.osmdroid.views.a getZoomController() {
        return this.m;
    }

    @Deprecated
    public int getZoomLevel() {
        return (int) getZoomLevelDouble();
    }

    public double getZoomLevelDouble() {
        return this.a;
    }

    public void m(f fVar) {
        if (!w()) {
            this.W4.add(fVar);
        }
    }

    public boolean n() {
        if (this.a < getMaxZoomLevel()) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.a > getMinZoomLevel()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.i5) {
            A();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!getOverlayManager().y1(i, keyEvent, this) && !super.onKeyDown(i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!getOverlayManager().x1(i, keyEvent, this) && !super.onKeyUp(i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (getOverlayManager().t1(motionEvent, this)) {
            return true;
        }
        scrollBy((int) (motionEvent.getX() * 25.0f), (int) (motionEvent.getY() * 25.0f));
        return super.onTrackballEvent(motionEvent);
    }

    public Rect q(Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.set(0, 0, getWidth(), getHeight());
        return rect;
    }

    public vr4 r(GeoPoint geoPoint) {
        return m60getProjection().g(getWidth() / 2, getHeight() / 2, geoPoint, false);
    }

    public Rect s(Rect rect) {
        Rect q = q(rect);
        if (getMapOrientation() != 0.0f && getMapOrientation() != 180.0f) {
            ue4.c(q, q.centerX(), q.centerY(), getMapOrientation(), q);
        }
        return q;
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        scrollTo((int) (getMapScrollX() + i), (int) (getMapScrollY() + i2));
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        I(i, i2);
        C();
        invalidate();
        if (getMapOrientation() != 0.0f) {
            z(true, getLeft(), getTop(), getRight(), getBottom());
        }
        ox9 ox9Var = null;
        for (r66 r66Var : this.d5) {
            if (ox9Var == null) {
                ox9Var = new ox9(this, i, i2);
            }
            r66Var.b(ox9Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.d.H(i);
        invalidate();
    }

    @Deprecated
    public void setBuiltInZoomControls(boolean z) {
        a.f fVar;
        org.osmdroid.views.a aVar = this.m;
        if (z) {
            fVar = a.f.SHOW_AND_FADEOUT;
        } else {
            fVar = a.f.NEVER;
        }
        aVar.q(fVar);
    }

    public void setDestroyMode(boolean z) {
        this.i5 = z;
    }

    public void setExpectedCenter(vr4 vr4Var) {
        G(vr4Var, 0L, 0L);
    }

    public void setFlingEnabled(boolean z) {
        this.l5 = z;
    }

    public void setHorizontalMapRepetitionEnabled(boolean z) {
        this.Y4 = z;
        this.d.G(z);
        C();
        invalidate();
    }

    @Deprecated
    public void setInitCenter(vr4 vr4Var) {
        setExpectedCenter(vr4Var);
    }

    @Deprecated
    void setMapCenter(vr4 vr4Var) {
        getController().b(vr4Var);
    }

    @Deprecated
    public void setMapListener(r66 r66Var) {
        this.d5.add(r66Var);
    }

    public void setMapOrientation(float f2) {
        H(f2, true);
    }

    public void setMaxZoomLevel(Double d2) {
        this.k = d2;
    }

    public void setMinZoomLevel(Double d2) {
        this.j = d2;
    }

    public void setMultiTouchControls(boolean z) {
        xp6<Object> xp6Var;
        if (z) {
            xp6Var = new xp6<>(this, false);
        } else {
            xp6Var = null;
        }
        this.n = xp6Var;
    }

    protected void setMultiTouchScale(float f2) {
        N((Math.log(f2) / Math.log(2.0d)) + this.e5);
    }

    public void setOverlayManager(rm7 rm7Var) {
        this.b = rm7Var;
    }

    @Deprecated
    protected void setProjection(org.osmdroid.views.c cVar) {
        this.c = cVar;
    }

    public void setScrollableAreaLimitDouble(BoundingBox boundingBox) {
        if (boundingBox == null) {
            D();
            E();
            return;
        }
        L(boundingBox.c(), boundingBox.d(), 0);
        M(boundingBox.o(), boundingBox.n(), 0);
    }

    public void setTileProvider(p76 p76Var) {
        this.B.i();
        this.B.g();
        this.B = p76Var;
        p76Var.o().add(this.I);
        P(this.B.p());
        fgb fgbVar = new fgb(this.B, getContext(), this.Y4, this.Z4);
        this.d = fgbVar;
        this.b.Z0(fgbVar);
        invalidate();
    }

    public void setTileSource(org.osmdroid.tileprovider.tilesource.a aVar) {
        this.B.u(aVar);
        P(aVar);
        p();
        N(this.a);
        postInvalidate();
    }

    public void setTilesScaleFactor(float f2) {
        this.T4 = f2;
        P(getTileProvider().p());
    }

    public void setTilesScaledToDpi(boolean z) {
        this.S4 = z;
        P(getTileProvider().p());
    }

    public void setUseDataConnection(boolean z) {
        this.d.J(z);
    }

    public void setVerticalMapRepetitionEnabled(boolean z) {
        this.Z4 = z;
        this.d.K(z);
        C();
        invalidate();
    }

    public void setZoomRounding(boolean z) {
        this.f5 = z;
    }

    public boolean u() {
        return this.i.get();
    }

    public boolean v() {
        return this.Y4;
    }

    public boolean w() {
        return this.X4;
    }

    public boolean x() {
        return this.S4;
    }

    public boolean y() {
        return this.Z4;
    }

    protected void z(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        long paddingTop2;
        int i5;
        long j;
        int paddingTop3;
        C();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int measuredWidth = childAt.getMeasuredWidth();
                m60getProjection().J(bVar.a, this.V4);
                if (getMapOrientation() != 0.0f) {
                    org.osmdroid.views.c m60getProjection = m60getProjection();
                    Point point = this.V4;
                    Point F = m60getProjection.F(point.x, point.y, null);
                    Point point2 = this.V4;
                    point2.x = F.x;
                    point2.y = F.y;
                }
                Point point3 = this.V4;
                long j2 = point3.x;
                long j3 = point3.y;
                switch (bVar.b) {
                    case 1:
                        j2 += getPaddingLeft();
                        paddingTop = getPaddingTop();
                        j3 += paddingTop;
                        long j4 = j2 + bVar.c;
                        long j5 = j3 + bVar.d;
                        childAt.layout(cgb.P(j4), cgb.P(j5), cgb.P(j4 + measuredWidth), cgb.P(j5 + measuredHeight));
                        break;
                    case 2:
                        j2 = (getPaddingLeft() + j2) - (measuredWidth / 2);
                        paddingTop = getPaddingTop();
                        j3 += paddingTop;
                        long j42 = j2 + bVar.c;
                        long j52 = j3 + bVar.d;
                        childAt.layout(cgb.P(j42), cgb.P(j52), cgb.P(j42 + measuredWidth), cgb.P(j52 + measuredHeight));
                        break;
                    case 3:
                        j2 = (getPaddingLeft() + j2) - measuredWidth;
                        paddingTop = getPaddingTop();
                        j3 += paddingTop;
                        long j422 = j2 + bVar.c;
                        long j522 = j3 + bVar.d;
                        childAt.layout(cgb.P(j422), cgb.P(j522), cgb.P(j422 + measuredWidth), cgb.P(j522 + measuredHeight));
                        break;
                    case 4:
                        j2 += getPaddingLeft();
                        paddingTop2 = getPaddingTop() + j3;
                        i5 = measuredHeight / 2;
                        j = i5;
                        j3 = paddingTop2 - j;
                        long j4222 = j2 + bVar.c;
                        long j5222 = j3 + bVar.d;
                        childAt.layout(cgb.P(j4222), cgb.P(j5222), cgb.P(j4222 + measuredWidth), cgb.P(j5222 + measuredHeight));
                        break;
                    case 5:
                        j2 = (getPaddingLeft() + j2) - (measuredWidth / 2);
                        paddingTop2 = getPaddingTop() + j3;
                        i5 = measuredHeight / 2;
                        j = i5;
                        j3 = paddingTop2 - j;
                        long j42222 = j2 + bVar.c;
                        long j52222 = j3 + bVar.d;
                        childAt.layout(cgb.P(j42222), cgb.P(j52222), cgb.P(j42222 + measuredWidth), cgb.P(j52222 + measuredHeight));
                        break;
                    case 6:
                        j2 = (getPaddingLeft() + j2) - measuredWidth;
                        paddingTop2 = getPaddingTop() + j3;
                        i5 = measuredHeight / 2;
                        j = i5;
                        j3 = paddingTop2 - j;
                        long j422222 = j2 + bVar.c;
                        long j522222 = j3 + bVar.d;
                        childAt.layout(cgb.P(j422222), cgb.P(j522222), cgb.P(j422222 + measuredWidth), cgb.P(j522222 + measuredHeight));
                        break;
                    case 7:
                        j2 += getPaddingLeft();
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j3;
                        j = measuredHeight;
                        j3 = paddingTop2 - j;
                        long j4222222 = j2 + bVar.c;
                        long j5222222 = j3 + bVar.d;
                        childAt.layout(cgb.P(j4222222), cgb.P(j5222222), cgb.P(j4222222 + measuredWidth), cgb.P(j5222222 + measuredHeight));
                        break;
                    case 8:
                        j2 = (getPaddingLeft() + j2) - (measuredWidth / 2);
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j3;
                        j = measuredHeight;
                        j3 = paddingTop2 - j;
                        long j42222222 = j2 + bVar.c;
                        long j52222222 = j3 + bVar.d;
                        childAt.layout(cgb.P(j42222222), cgb.P(j52222222), cgb.P(j42222222 + measuredWidth), cgb.P(j52222222 + measuredHeight));
                        break;
                    case 9:
                        j2 = (getPaddingLeft() + j2) - measuredWidth;
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j3;
                        j = measuredHeight;
                        j3 = paddingTop2 - j;
                        long j422222222 = j2 + bVar.c;
                        long j522222222 = j3 + bVar.d;
                        childAt.layout(cgb.P(j422222222), cgb.P(j522222222), cgb.P(j422222222 + measuredWidth), cgb.P(j522222222 + measuredHeight));
                        break;
                    default:
                        long j4222222222 = j2 + bVar.c;
                        long j5222222222 = j3 + bVar.d;
                        childAt.layout(cgb.P(j4222222222), cgb.P(j5222222222), cgb.P(j4222222222 + measuredWidth), cgb.P(j5222222222 + measuredHeight));
                        break;
                }
            }
        }
        if (!w()) {
            this.X4 = true;
            Iterator<f> it = this.W4.iterator();
            while (it.hasNext()) {
                it.next().a(this, i, i2, i3, i4);
            }
            this.W4.clear();
        }
        C();
    }

    /* loaded from: classes3.dex */
    public static class b extends ViewGroup.LayoutParams {
        public vr4 a;
        public int b;
        public int c;
        public int d;

        public b(int i, int i2, vr4 vr4Var, int i3, int i4, int i5) {
            super(i, i2);
            if (vr4Var != null) {
                this.a = vr4Var;
            } else {
                this.a = new GeoPoint(0.0d, 0.0d);
            }
            this.b = i3;
            this.c = i4;
            this.d = i5;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = new GeoPoint(0.0d, 0.0d);
            this.b = 8;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public MapView(Context context, p76 p76Var, Handler handler, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.a = 0.0d;
        this.i = new AtomicBoolean(false);
        this.o = new PointF();
        this.p = new GeoPoint(0.0d, 0.0d);
        this.r = 0.0f;
        this.s = new Rect();
        this.S4 = false;
        this.T4 = 1.0f;
        this.U4 = new Point();
        this.V4 = new Point();
        this.W4 = new LinkedList<>();
        this.X4 = false;
        this.Y4 = true;
        this.Z4 = true;
        this.d5 = new ArrayList();
        this.g5 = new u76(this);
        this.h5 = new Rect();
        this.i5 = true;
        this.l5 = true;
        this.m5 = false;
        dq1.a().s(context);
        if (isInEditMode()) {
            this.I = null;
            this.l = null;
            this.m = null;
            this.f = null;
            this.e = null;
            return;
        }
        if (!z) {
            setLayerType(1, null);
        }
        this.l = new org.osmdroid.views.b(this);
        this.f = new Scroller(context);
        p76Var = p76Var == null ? new q76(context.getApplicationContext(), t(attributeSet)) : p76Var;
        this.I = handler == null ? new hla(this) : handler;
        this.B = p76Var;
        p76Var.o().add(this.I);
        P(this.B.p());
        this.d = new fgb(this.B, context, this.Y4, this.Z4);
        this.b = new er2(this.d);
        org.osmdroid.views.a aVar = new org.osmdroid.views.a(this);
        this.m = aVar;
        aVar.p(new e());
        p();
        GestureDetector gestureDetector = new GestureDetector(context, new d());
        this.e = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
        if (dq1.a().a()) {
            setHasTransientState(true);
        }
        aVar.q(a.f.SHOW_AND_FADEOUT);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    /* renamed from: getProjection */
    public org.osmdroid.views.c m60getProjection() {
        if (this.c == null) {
            org.osmdroid.views.c cVar = new org.osmdroid.views.c(this);
            this.c = cVar;
            cVar.c(this.p, this.q);
            if (this.t) {
                cVar.a(this.u, this.v, true, this.A);
            }
            if (this.w) {
                cVar.a(this.x, this.y, false, this.z);
            }
            this.h = cVar.H(this);
        }
        return this.c;
    }

    /* loaded from: classes3.dex */
    private class e implements a.e, ZoomButtonsController.OnZoomListener {
        private e() {
        }

        @Override // org.osmdroid.views.a.e, android.widget.ZoomButtonsController.OnZoomListener
        public void onZoom(boolean z) {
            if (z) {
                MapView.this.getController().r();
            } else {
                MapView.this.getController().B();
            }
        }

        @Override // android.widget.ZoomButtonsController.OnZoomListener
        public void onVisibilityChanged(boolean z) {
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        this(context, null, null, attributeSet);
    }
}
