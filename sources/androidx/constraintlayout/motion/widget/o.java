package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.dia;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ViewTransitionController.java */
/* loaded from: classes.dex */
public class o {
    private final MotionLayout a;
    private HashSet<View> c;
    ArrayList<n.b> e;
    private ArrayList<n> b = new ArrayList<>();
    private String d = "ViewTransitionController";
    ArrayList<n.b> f = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTransitionController.java */
    /* loaded from: classes.dex */
    public class a implements dia.a {
        final /* synthetic */ n a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        a(n nVar, int i, boolean z, int i2) {
            this.a = nVar;
            this.b = i;
            this.c = z;
            this.d = i2;
        }
    }

    public o(MotionLayout motionLayout) {
        this.a = motionLayout;
    }

    private void e(n nVar, boolean z) {
        ConstraintLayout.getSharedValues().a(nVar.h(), new a(nVar, nVar.h(), z, nVar.g()));
    }

    private void i(n nVar, View... viewArr) {
        int currentState = this.a.getCurrentState();
        if (nVar.e != 2) {
            if (currentState == -1) {
                String str = this.d;
                Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.a.toString());
                return;
            }
            androidx.constraintlayout.widget.d P = this.a.P(currentState);
            if (P == null) {
                return;
            }
            nVar.c(this, this.a, currentState, P, viewArr);
            return;
        }
        nVar.c(this, this.a, currentState, null, viewArr);
    }

    public void a(n nVar) {
        this.b.add(nVar);
        this.c = null;
        if (nVar.i() == 4) {
            e(nVar, true);
        } else if (nVar.i() == 5) {
            e(nVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(n.b bVar) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.e.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        ArrayList<n.b> arrayList = this.e;
        if (arrayList == null) {
            return;
        }
        Iterator<n.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.e.removeAll(this.f);
        this.f.clear();
        if (this.e.isEmpty()) {
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.a.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(n.b bVar) {
        this.f.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(MotionEvent motionEvent) {
        n nVar;
        int currentState = this.a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.c == null) {
            this.c = new HashSet<>();
            Iterator<n> it = this.b.iterator();
            while (it.hasNext()) {
                n next = it.next();
                int childCount = this.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.a.getChildAt(i);
                    if (next.k(childAt)) {
                        childAt.getId();
                        this.c.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<n.b> arrayList = this.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<n.b> it2 = this.e.iterator();
            while (it2.hasNext()) {
                it2.next().d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.d P = this.a.P(currentState);
            Iterator<n> it3 = this.b.iterator();
            while (it3.hasNext()) {
                n next2 = it3.next();
                if (next2.m(action)) {
                    Iterator<View> it4 = this.c.iterator();
                    while (it4.hasNext()) {
                        View next3 = it4.next();
                        if (next2.k(next3)) {
                            next3.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                nVar = next2;
                                next2.c(this, this.a, currentState, P, next3);
                            } else {
                                nVar = next2;
                            }
                            next2 = nVar;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<n> it = this.b.iterator();
        n nVar = null;
        while (it.hasNext()) {
            n next = it.next();
            if (next.e() == i) {
                for (View view : viewArr) {
                    if (next.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    i(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                nVar = next;
            }
        }
        if (nVar == null) {
            Log.e(this.d, " Could not find ViewTransition");
        }
    }
}
