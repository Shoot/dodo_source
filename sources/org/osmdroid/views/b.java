package org.osmdroid.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
/* compiled from: MapController.java */
/* loaded from: classes3.dex */
public class b implements bs4, MapView.f {
    protected final MapView a;
    private Animator c;
    private double b = 0.0d;
    private c d = new c(this, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapController.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.AnimateToGeoPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.AnimateToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.SetCenterPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.ZoomToSpanPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapController.java */
    /* loaded from: classes3.dex */
    public enum d {
        ZoomToSpanPoint,
        AnimateToPoint,
        AnimateToGeoPoint,
        SetCenterPoint
    }

    public b(MapView mapView) {
        this.a = mapView;
        if (!mapView.w()) {
            mapView.m(this);
        }
    }

    @Override // defpackage.bs4
    public boolean B() {
        return p(null);
    }

    @Override // org.osmdroid.views.MapView.f
    public void a(View view, int i, int i2, int i3, int i4) {
        this.d.c();
    }

    @Override // defpackage.bs4
    public void b(vr4 vr4Var) {
        e(vr4Var, null, null);
    }

    @Override // defpackage.bs4
    public boolean c(int i, int i2) {
        return o(i, i2, null);
    }

    @Override // defpackage.bs4
    public void d(vr4 vr4Var) {
        if (!this.a.w()) {
            this.d.d(vr4Var);
        } else {
            this.a.setExpectedCenter(vr4Var);
        }
    }

    @Override // defpackage.bs4
    public void e(vr4 vr4Var, Double d2, Long l) {
        i(vr4Var, d2, l, null);
    }

    @Override // defpackage.bs4
    public void f(boolean z) {
        if (!this.a.getScroller().isFinished()) {
            if (z) {
                MapView mapView = this.a;
                mapView.g = false;
                mapView.getScroller().abortAnimation();
            } else {
                m();
            }
        }
        Animator animator = this.c;
        if (this.a.i.get()) {
            if (z) {
                animator.end();
            } else {
                animator.cancel();
            }
        }
    }

    @Override // defpackage.bs4
    public double g(double d2) {
        return this.a.N(d2);
    }

    public void h(int i, int i2) {
        if (!this.a.w()) {
            this.d.a(i, i2);
        } else if (!this.a.u()) {
            MapView mapView = this.a;
            mapView.g = false;
            int mapScrollX = (int) mapView.getMapScrollX();
            int mapScrollY = (int) this.a.getMapScrollY();
            int width = i - (this.a.getWidth() / 2);
            int height = i2 - (this.a.getHeight() / 2);
            if (width != mapScrollX || height != mapScrollY) {
                this.a.getScroller().startScroll(mapScrollX, mapScrollY, width, height, dq1.a().w());
                this.a.postInvalidate();
            }
        }
    }

    public void i(vr4 vr4Var, Double d2, Long l, Float f) {
        j(vr4Var, d2, l, f, null);
    }

    public void j(vr4 vr4Var, Double d2, Long l, Float f, Boolean bool) {
        if (!this.a.w()) {
            this.d.b(vr4Var, d2, l, f, bool);
            return;
        }
        C0469b c0469b = new C0469b(this, Double.valueOf(this.a.getZoomLevelDouble()), d2, new GeoPoint(this.a.m60getProjection().k()), vr4Var, Float.valueOf(this.a.getMapOrientation()), f, bool);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(c0469b);
        ofFloat.addUpdateListener(c0469b);
        if (l == null) {
            ofFloat.setDuration(dq1.a().w());
        } else {
            ofFloat.setDuration(l.longValue());
        }
        Animator animator = this.c;
        if (animator != null) {
            c0469b.onAnimationCancel(animator);
        }
        this.c = ofFloat;
        ofFloat.start();
    }

    protected void k() {
        this.a.i.set(false);
        this.a.B();
        this.c = null;
        this.a.invalidate();
    }

    protected void l() {
        this.a.i.set(true);
    }

    public void m() {
        MapView mapView = this.a;
        mapView.g = false;
        mapView.getScroller().forceFinished(true);
    }

    public boolean n(Long l) {
        return q(this.a.getZoomLevelDouble() + 1.0d, l);
    }

    public boolean o(int i, int i2, Long l) {
        return s(this.a.getZoomLevelDouble() + 1.0d, i, i2, l);
    }

    public boolean p(Long l) {
        return q(this.a.getZoomLevelDouble() - 1.0d, l);
    }

    public boolean q(double d2, Long l) {
        return s(d2, this.a.getWidth() / 2, this.a.getHeight() / 2, l);
    }

    @Override // defpackage.bs4
    public boolean r() {
        return n(null);
    }

    public boolean s(double d2, int i, int i2, Long l) {
        double d3;
        if (d2 > this.a.getMaxZoomLevel()) {
            d3 = this.a.getMaxZoomLevel();
        } else {
            d3 = d2;
        }
        if (d3 < this.a.getMinZoomLevel()) {
            d3 = this.a.getMinZoomLevel();
        }
        double zoomLevelDouble = this.a.getZoomLevelDouble();
        if (((d3 >= zoomLevelDouble || !this.a.o()) && (d3 <= zoomLevelDouble || !this.a.n())) || this.a.i.getAndSet(true)) {
            return false;
        }
        edc edcVar = null;
        for (r66 r66Var : this.a.d5) {
            if (edcVar == null) {
                edcVar = new edc(this.a, d3);
            }
            r66Var.a(edcVar);
        }
        this.a.K(i, i2);
        this.a.O();
        Math.pow(2.0d, d3 - zoomLevelDouble);
        C0469b c0469b = new C0469b(this, Double.valueOf(zoomLevelDouble), Double.valueOf(d3), null, null, null, null, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(c0469b);
        ofFloat.addUpdateListener(c0469b);
        if (l == null) {
            ofFloat.setDuration(dq1.a().D());
        } else {
            ofFloat.setDuration(l.longValue());
        }
        this.c = ofFloat;
        ofFloat.start();
        return true;
    }

    public void t(double d2, double d3) {
        if (d2 > 0.0d && d3 > 0.0d) {
            if (!this.a.w()) {
                this.d.e(d2, d3);
                return;
            }
            BoundingBox h = this.a.m60getProjection().h();
            double C = this.a.m60getProjection().C();
            double max = Math.max(d2 / h.m(), d3 / h.q());
            if (max > 1.0d) {
                this.a.N(C - pr6.e((float) max));
            } else if (max < 0.5d) {
                this.a.N((C + pr6.e(1.0f / ((float) max))) - 1.0d);
            }
        }
    }

    public void u(int i, int i2) {
        t(i * 1.0E-6d, i2 * 1.0E-6d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapController.java */
    /* loaded from: classes3.dex */
    public class c {
        private LinkedList<a> a;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MapController.java */
        /* loaded from: classes3.dex */
        public class a {
            private d a;
            private Point b;
            private vr4 c;
            private final Long d;
            private final Double e;
            private final Float f;
            private final Boolean g;

            public a(c cVar, d dVar, Point point, vr4 vr4Var) {
                this(dVar, point, vr4Var, null, null, null, null);
            }

            public a(d dVar, Point point, vr4 vr4Var, Double d, Long l, Float f, Boolean bool) {
                this.a = dVar;
                this.b = point;
                this.c = vr4Var;
                this.d = l;
                this.e = d;
                this.f = f;
                this.g = bool;
            }
        }

        private c() {
            this.a = new LinkedList<>();
        }

        public void a(int i, int i2) {
            this.a.add(new a(this, d.AnimateToPoint, new Point(i, i2), null));
        }

        public void b(vr4 vr4Var, Double d, Long l, Float f, Boolean bool) {
            this.a.add(new a(d.AnimateToGeoPoint, null, vr4Var, d, l, f, bool));
        }

        public void c() {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                int i = a.a[next.a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && next.b != null) {
                                b.this.u(next.b.x, next.b.y);
                            }
                        } else if (next.c != null) {
                            b.this.d(next.c);
                        }
                    } else if (next.b != null) {
                        b.this.h(next.b.x, next.b.y);
                    }
                } else if (next.c != null) {
                    b.this.j(next.c, next.e, next.d, next.f, next.g);
                }
            }
            this.a.clear();
        }

        public void d(vr4 vr4Var) {
            this.a.add(new a(this, d.SetCenterPoint, null, vr4Var));
        }

        public void e(double d, double d2) {
            this.a.add(new a(this, d.ZoomToSpanPoint, new Point((int) (d * 1000000.0d), (int) (d2 * 1000000.0d)), null));
        }

        /* synthetic */ c(b bVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapController.java */
    @TargetApi(11)
    /* renamed from: org.osmdroid.views.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0469b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        private final GeoPoint a = new GeoPoint(0.0d, 0.0d);
        private final b b;
        private final Double c;
        private final Double d;
        private final vr4 e;
        private final vr4 f;
        private final Float g;
        private final Float h;

        public C0469b(b bVar, Double d, Double d2, vr4 vr4Var, vr4 vr4Var2, Float f, Float f2, Boolean bool) {
            this.b = bVar;
            this.c = d;
            this.d = d2;
            this.e = vr4Var;
            this.f = vr4Var2;
            if (f2 == null) {
                this.g = null;
                this.h = null;
                return;
            }
            this.g = f;
            this.h = Float.valueOf((float) pr6.d(f.floatValue(), f2.floatValue(), bool));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.k();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.k();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.b.l();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.d != null) {
                this.b.a.N(this.c.doubleValue() + ((this.d.doubleValue() - this.c.doubleValue()) * floatValue));
            }
            if (this.h != null) {
                this.b.a.setMapOrientation(this.g.floatValue() + (this.h.floatValue() * floatValue));
            }
            if (this.f != null) {
                MapView mapView = this.b.a;
                cgb tileSystem = MapView.getTileSystem();
                double g = tileSystem.g(this.e.c());
                double d = floatValue;
                double g2 = tileSystem.g(g + ((tileSystem.g(this.f.c()) - g) * d));
                double f = tileSystem.f(this.e.b());
                this.a.e(tileSystem.f(f + ((tileSystem.f(this.f.b()) - f) * d)), g2);
                this.b.a.setExpectedCenter(this.a);
            }
            this.b.a.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
