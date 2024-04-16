package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import defpackage.qm7;
import java.util.List;
import org.osmdroid.views.MapView;
/* compiled from: ItemizedIconOverlay.java */
/* renamed from: z75  reason: default package */
/* loaded from: classes3.dex */
public class z75<Item extends qm7> extends a85<Item> {
    protected List<Item> s;
    protected d<Item> t;

    /* compiled from: ItemizedIconOverlay.java */
    /* renamed from: z75$a */
    /* loaded from: classes3.dex */
    class a implements c {
        final /* synthetic */ MapView a;

        a(MapView mapView) {
            this.a = mapView;
        }

        @Override // defpackage.z75.c
        public boolean a(int i) {
            z75 z75Var = z75.this;
            if (z75Var.t == null) {
                return false;
            }
            return z75Var.J(i, z75Var.s.get(i), this.a);
        }
    }

    /* compiled from: ItemizedIconOverlay.java */
    /* renamed from: z75$b */
    /* loaded from: classes3.dex */
    class b implements c {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.z75.c
        public boolean a(int i) {
            z75 z75Var = z75.this;
            if (z75Var.t == null) {
                return false;
            }
            return z75Var.I(i, z75Var.x(i));
        }
    }

    /* compiled from: ItemizedIconOverlay.java */
    /* renamed from: z75$c */
    /* loaded from: classes3.dex */
    public interface c {
        boolean a(int i);
    }

    /* compiled from: ItemizedIconOverlay.java */
    /* renamed from: z75$d */
    /* loaded from: classes3.dex */
    public interface d<T> {
        boolean a(int i, T t);

        boolean b(int i, T t);
    }

    public z75(List<Item> list, Drawable drawable, d<Item> dVar, Context context) {
        super(drawable);
        this.s = list;
        this.t = dVar;
        C();
    }

    private boolean G(MotionEvent motionEvent, MapView mapView, c cVar) {
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        for (int i = 0; i < this.s.size(); i++) {
            if (z(x(i), round, round2, mapView) && cVar.a(i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a85
    public int F() {
        return Math.min(this.s.size(), this.f);
    }

    public boolean H(List<Item> list) {
        boolean addAll = this.s.addAll(list);
        C();
        return addAll;
    }

    protected boolean I(int i, Item item) {
        return this.t.b(i, item);
    }

    protected boolean J(int i, Item item, MapView mapView) {
        return this.t.a(i, item);
    }

    public void K() {
        L(true);
    }

    public void L(boolean z) {
        this.s.clear();
        if (z) {
            C();
        }
    }

    @Override // defpackage.pm7
    public void f(MapView mapView) {
        List<Item> list = this.s;
        if (list != null) {
            list.clear();
        }
        this.s = null;
        this.t = null;
    }

    @Override // defpackage.pm7
    public boolean m(MotionEvent motionEvent, MapView mapView) {
        if (G(motionEvent, mapView, new b())) {
            return true;
        }
        return super.m(motionEvent, mapView);
    }

    @Override // defpackage.a85, defpackage.pm7
    public boolean p(MotionEvent motionEvent, MapView mapView) {
        if (G(motionEvent, mapView, new a(mapView))) {
            return true;
        }
        return super.p(motionEvent, mapView);
    }

    @Override // defpackage.a85
    protected Item v(int i) {
        return this.s.get(i);
    }

    @Override // defpackage.pm7.a
    public boolean y(int i, int i2, Point point, es4 es4Var) {
        return false;
    }
}
