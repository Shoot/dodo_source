package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.List;
import org.osmdroid.views.MapView;
/* compiled from: OverlayManager.java */
/* renamed from: rm7  reason: default package */
/* loaded from: classes3.dex */
public interface rm7 extends List<pm7> {
    boolean D1(MotionEvent motionEvent, MapView mapView);

    boolean E0(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, MapView mapView);

    void F1(Canvas canvas, MapView mapView);

    void K0(MapView mapView);

    boolean M(MotionEvent motionEvent, MapView mapView);

    List<pm7> M0();

    void N(MotionEvent motionEvent, MapView mapView);

    boolean Q1(MotionEvent motionEvent, MapView mapView);

    void Z0(fgb fgbVar);

    boolean f0(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, MapView mapView);

    boolean g1(MotionEvent motionEvent, MapView mapView);

    boolean j0(MotionEvent motionEvent, MapView mapView);

    boolean j1(MotionEvent motionEvent, MapView mapView);

    boolean s1(MotionEvent motionEvent, MapView mapView);

    boolean t1(MotionEvent motionEvent, MapView mapView);

    boolean x1(int i, KeyEvent keyEvent, MapView mapView);

    boolean y(int i, int i2, Point point, es4 es4Var);

    boolean y1(int i, KeyEvent keyEvent, MapView mapView);
}
