package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.concurrent.atomic.AtomicInteger;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.views.MapView;
import org.osmdroid.views.c;
/* compiled from: Overlay.java */
/* renamed from: pm7  reason: default package */
/* loaded from: classes3.dex */
public abstract class pm7 {
    private static AtomicInteger d = new AtomicInteger();
    private static final Rect e = new Rect();
    private boolean a = true;
    private final cgb b;
    protected BoundingBox c;

    /* compiled from: Overlay.java */
    /* renamed from: pm7$a */
    /* loaded from: classes3.dex */
    public interface a {
        boolean y(int i, int i2, Point point, es4 es4Var);
    }

    public pm7() {
        cgb tileSystem = MapView.getTileSystem();
        this.b = tileSystem;
        this.c = new BoundingBox(tileSystem.s(), tileSystem.t(), tileSystem.z(), tileSystem.A());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int c() {
        return d.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int d(int i) {
        return d.getAndAdd(i);
    }

    public void a(Canvas canvas, MapView mapView, boolean z) {
        if (z) {
            return;
        }
        b(canvas, mapView.m60getProjection());
    }

    public boolean e() {
        return this.a;
    }

    public boolean g(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean h(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean i(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean j(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, MapView mapView) {
        return false;
    }

    public boolean k(int i, KeyEvent keyEvent, MapView mapView) {
        return false;
    }

    public boolean l(int i, KeyEvent keyEvent, MapView mapView) {
        return false;
    }

    public boolean m(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean n(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, MapView mapView) {
        return false;
    }

    public boolean p(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean q(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean r(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public boolean s(MotionEvent motionEvent, MapView mapView) {
        return false;
    }

    public void f(MapView mapView) {
    }

    public void b(Canvas canvas, c cVar) {
    }

    public void o(MotionEvent motionEvent, MapView mapView) {
    }
}
