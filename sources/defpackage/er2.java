package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import defpackage.pm7;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.osmdroid.views.MapView;
import org.osmdroid.views.c;
/* compiled from: DefaultOverlayManager.java */
/* renamed from: er2  reason: default package */
/* loaded from: classes3.dex */
public class er2 extends AbstractList<pm7> implements rm7 {
    private fgb a;
    private final CopyOnWriteArrayList<pm7> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultOverlayManager.java */
    /* renamed from: er2$a */
    /* loaded from: classes3.dex */
    public class a implements Iterable<pm7> {

        /* compiled from: DefaultOverlayManager.java */
        /* renamed from: er2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0308a implements Iterator<pm7> {
            final /* synthetic */ ListIterator a;

            C0308a(ListIterator listIterator) {
                this.a = listIterator;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public pm7 next() {
                return (pm7) this.a.previous();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasPrevious();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
            }
        }

        a() {
        }

        private ListIterator<pm7> a() {
            while (true) {
                try {
                    return er2.this.b.listIterator(er2.this.b.size());
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }

        @Override // java.lang.Iterable
        public Iterator<pm7> iterator() {
            return new C0308a(a());
        }
    }

    public er2(fgb fgbVar) {
        Z0(fgbVar);
        this.b = new CopyOnWriteArrayList<>();
    }

    private void g(Canvas canvas, MapView mapView, c cVar) {
        fgb fgbVar = this.a;
        if (fgbVar != null) {
            fgbVar.F(canvas, cVar);
        }
        Iterator<pm7> it = this.b.iterator();
        while (it.hasNext()) {
            pm7 next = it.next();
            if (next != null && next.e() && (next instanceof fgb)) {
                ((fgb) next).F(canvas, cVar);
            }
        }
        fgb fgbVar2 = this.a;
        if (fgbVar2 != null && fgbVar2.e()) {
            if (mapView != null) {
                this.a.a(canvas, mapView, false);
            } else {
                this.a.b(canvas, cVar);
            }
        }
        Iterator<pm7> it2 = this.b.iterator();
        while (it2.hasNext()) {
            pm7 next2 = it2.next();
            if (next2 != null && next2.e()) {
                if (mapView != null) {
                    next2.a(canvas, mapView, false);
                } else {
                    next2.b(canvas, cVar);
                }
            }
        }
    }

    @Override // defpackage.rm7
    public boolean D1(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.m(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public boolean E0(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.j(motionEvent, motionEvent2, f, f2, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public void F1(Canvas canvas, MapView mapView) {
        g(canvas, mapView, mapView.m60getProjection());
    }

    @Override // defpackage.rm7
    public void K0(MapView mapView) {
        fgb fgbVar = this.a;
        if (fgbVar != null) {
            fgbVar.f(mapView);
        }
        for (pm7 pm7Var : h()) {
            pm7Var.f(mapView);
        }
        clear();
    }

    @Override // defpackage.rm7
    public boolean M(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.q(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public List<pm7> M0() {
        return this.b;
    }

    @Override // defpackage.rm7
    public void N(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            pm7Var.o(motionEvent, mapView);
        }
    }

    @Override // defpackage.rm7
    public boolean Q1(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.h(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public void Z0(fgb fgbVar) {
        this.a = fgbVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, pm7 pm7Var) {
        if (pm7Var == null) {
            Log.e("OsmDroid", "Attempt to add a null overlay to the collection. This is probably a bug and should be reported!", new Exception());
        } else {
            this.b.add(i, pm7Var);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public pm7 get(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.rm7
    public boolean f0(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.n(motionEvent, motionEvent2, f, f2, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public boolean g1(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.g(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<pm7> h() {
        return new a();
    }

    @Override // defpackage.rm7
    public boolean j0(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.r(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public boolean j1(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.p(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public pm7 remove(int i) {
        return this.b.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p */
    public pm7 set(int i, pm7 pm7Var) {
        if (pm7Var == null) {
            Log.e("OsmDroid", "Attempt to set a null overlay to the collection. This is probably a bug and should be reported!", new Exception());
            return null;
        }
        return this.b.set(i, pm7Var);
    }

    @Override // defpackage.rm7
    public boolean s1(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.i(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b.size();
    }

    @Override // defpackage.rm7
    public boolean t1(MotionEvent motionEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.s(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public boolean x1(int i, KeyEvent keyEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.l(i, keyEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public boolean y(int i, int i2, Point point, es4 es4Var) {
        for (pm7 pm7Var : h()) {
            if ((pm7Var instanceof pm7.a) && ((pm7.a) pm7Var).y(i, i2, point, es4Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm7
    public boolean y1(int i, KeyEvent keyEvent, MapView mapView) {
        for (pm7 pm7Var : h()) {
            if (pm7Var.k(i, keyEvent, mapView)) {
                return true;
            }
        }
        return false;
    }
}
