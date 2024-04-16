package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: Transition.java */
/* renamed from: clb  reason: default package */
/* loaded from: classes.dex */
public abstract class clb implements Cloneable {
    private static final int[] S4 = {2, 1, 3, 4};
    private static final yr7 T4 = new a();
    private static ThreadLocal<lr<Animator, d>> U4 = new ThreadLocal<>();
    private e X;
    private lr<String, String> Y;
    private ArrayList<mlb> t;
    private ArrayList<mlb> u;
    private String a = getClass().getName();
    private long b = -1;
    long c = -1;
    private TimeInterpolator d = null;
    ArrayList<Integer> e = new ArrayList<>();
    ArrayList<View> f = new ArrayList<>();
    private ArrayList<String> g = null;
    private ArrayList<Class<?>> h = null;
    private ArrayList<Integer> i = null;
    private ArrayList<View> j = null;
    private ArrayList<Class<?>> k = null;
    private ArrayList<String> l = null;
    private ArrayList<Integer> m = null;
    private ArrayList<View> n = null;
    private ArrayList<Class<?>> o = null;
    private nlb p = new nlb();
    private nlb q = new nlb();
    jlb r = null;
    private int[] s = S4;
    private ViewGroup v = null;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> I = new ArrayList<>();
    private yr7 Z = T4;

    /* compiled from: Transition.java */
    /* renamed from: clb$a */
    /* loaded from: classes.dex */
    static class a extends yr7 {
        a() {
        }

        @Override // defpackage.yr7
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* renamed from: clb$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ lr a;

        b(lr lrVar) {
            this.a = lrVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            clb.this.x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            clb.this.x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* renamed from: clb$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            clb.this.q();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* renamed from: clb$d */
    /* loaded from: classes.dex */
    public static class d {
        View a;
        String b;
        mlb c;
        z4c d;
        clb e;

        d(View view, String str, clb clbVar, z4c z4cVar, mlb mlbVar) {
            this.a = view;
            this.b = str;
            this.c = mlbVar;
            this.d = z4cVar;
            this.e = clbVar;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: clb$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    /* renamed from: clb$f */
    /* loaded from: classes.dex */
    public interface f {
        void a(@NonNull clb clbVar);

        void b(@NonNull clb clbVar);

        void c(@NonNull clb clbVar);

        void d(@NonNull clb clbVar);

        void e(@NonNull clb clbVar);
    }

    private static lr<Animator, d> A() {
        lr<Animator, d> lrVar = U4.get();
        if (lrVar == null) {
            lr<Animator, d> lrVar2 = new lr<>();
            U4.set(lrVar2);
            return lrVar2;
        }
        return lrVar;
    }

    private static boolean L(mlb mlbVar, mlb mlbVar2, String str) {
        Object obj = mlbVar.a.get(str);
        Object obj2 = mlbVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    private void M(lr<View, mlb> lrVar, lr<View, mlb> lrVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && K(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && K(view)) {
                mlb mlbVar = lrVar.get(valueAt);
                mlb mlbVar2 = lrVar2.get(view);
                if (mlbVar != null && mlbVar2 != null) {
                    this.t.add(mlbVar);
                    this.u.add(mlbVar2);
                    lrVar.remove(valueAt);
                    lrVar2.remove(view);
                }
            }
        }
    }

    private void N(lr<View, mlb> lrVar, lr<View, mlb> lrVar2) {
        mlb remove;
        for (int size = lrVar.size() - 1; size >= 0; size--) {
            View k = lrVar.k(size);
            if (k != null && K(k) && (remove = lrVar2.remove(k)) != null && K(remove.b)) {
                this.t.add(lrVar.m(size));
                this.u.add(remove);
            }
        }
    }

    private void O(lr<View, mlb> lrVar, lr<View, mlb> lrVar2, py5<View> py5Var, py5<View> py5Var2) {
        View g;
        int o = py5Var.o();
        for (int i = 0; i < o; i++) {
            View p = py5Var.p(i);
            if (p != null && K(p) && (g = py5Var2.g(py5Var.j(i))) != null && K(g)) {
                mlb mlbVar = lrVar.get(p);
                mlb mlbVar2 = lrVar2.get(g);
                if (mlbVar != null && mlbVar2 != null) {
                    this.t.add(mlbVar);
                    this.u.add(mlbVar2);
                    lrVar.remove(p);
                    lrVar2.remove(g);
                }
            }
        }
    }

    private void P(lr<View, mlb> lrVar, lr<View, mlb> lrVar2, lr<String, View> lrVar3, lr<String, View> lrVar4) {
        View view;
        int size = lrVar3.size();
        for (int i = 0; i < size; i++) {
            View o = lrVar3.o(i);
            if (o != null && K(o) && (view = lrVar4.get(lrVar3.k(i))) != null && K(view)) {
                mlb mlbVar = lrVar.get(o);
                mlb mlbVar2 = lrVar2.get(view);
                if (mlbVar != null && mlbVar2 != null) {
                    this.t.add(mlbVar);
                    this.u.add(mlbVar2);
                    lrVar.remove(o);
                    lrVar2.remove(view);
                }
            }
        }
    }

    private void Q(nlb nlbVar, nlb nlbVar2) {
        lr<View, mlb> lrVar = new lr<>(nlbVar.a);
        lr<View, mlb> lrVar2 = new lr<>(nlbVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.s;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                O(lrVar, lrVar2, nlbVar.c, nlbVar2.c);
                            }
                        } else {
                            M(lrVar, lrVar2, nlbVar.b, nlbVar2.b);
                        }
                    } else {
                        P(lrVar, lrVar2, nlbVar.d, nlbVar2.d);
                    }
                } else {
                    N(lrVar, lrVar2);
                }
                i++;
            } else {
                d(lrVar, lrVar2);
                return;
            }
        }
    }

    private void X(Animator animator, lr<Animator, d> lrVar) {
        if (animator != null) {
            animator.addListener(new b(lrVar));
            f(animator);
        }
    }

    private void d(lr<View, mlb> lrVar, lr<View, mlb> lrVar2) {
        for (int i = 0; i < lrVar.size(); i++) {
            mlb o = lrVar.o(i);
            if (K(o.b)) {
                this.t.add(o);
                this.u.add(null);
            }
        }
        for (int i2 = 0; i2 < lrVar2.size(); i2++) {
            mlb o2 = lrVar2.o(i2);
            if (K(o2.b)) {
                this.u.add(o2);
                this.t.add(null);
            }
        }
    }

    private static void e(nlb nlbVar, View view, mlb mlbVar) {
        nlbVar.a.put(view, mlbVar);
        int id = view.getId();
        if (id >= 0) {
            if (nlbVar.b.indexOfKey(id) >= 0) {
                nlbVar.b.put(id, null);
            } else {
                nlbVar.b.put(id, view);
            }
        }
        String N = syb.N(view);
        if (N != null) {
            if (nlbVar.d.containsKey(N)) {
                nlbVar.d.put(N, null);
            } else {
                nlbVar.d.put(N, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (nlbVar.c.i(itemIdAtPosition) >= 0) {
                    View g = nlbVar.c.g(itemIdAtPosition);
                    if (g != null) {
                        syb.E0(g, false);
                        nlbVar.c.l(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                syb.E0(view, true);
                nlbVar.c.l(itemIdAtPosition, view);
            }
        }
    }

    private void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.i;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.j;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.k;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.k.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            mlb mlbVar = new mlb(view);
            if (z) {
                j(mlbVar);
            } else {
                g(mlbVar);
            }
            mlbVar.c.add(this);
            i(mlbVar);
            if (z) {
                e(this.p, view, mlbVar);
            } else {
                e(this.q, view, mlbVar);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.m;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
                return;
            }
            ArrayList<View> arrayList5 = this.n;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList<Class<?>> arrayList6 = this.o;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (this.o.get(i2).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                h(viewGroup.getChildAt(i3), z);
            }
        }
    }

    public long B() {
        return this.b;
    }

    @NonNull
    public List<Integer> C() {
        return this.e;
    }

    public List<String> D() {
        return this.g;
    }

    public List<Class<?>> F() {
        return this.h;
    }

    @NonNull
    public List<View> G() {
        return this.f;
    }

    public String[] H() {
        return null;
    }

    public mlb I(@NonNull View view, boolean z) {
        nlb nlbVar;
        jlb jlbVar = this.r;
        if (jlbVar != null) {
            return jlbVar.I(view, z);
        }
        if (z) {
            nlbVar = this.p;
        } else {
            nlbVar = this.q;
        }
        return nlbVar.a.get(view);
    }

    public boolean J(mlb mlbVar, mlb mlbVar2) {
        if (mlbVar == null || mlbVar2 == null) {
            return false;
        }
        String[] H = H();
        if (H != null) {
            for (String str : H) {
                if (!L(mlbVar, mlbVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : mlbVar.a.keySet()) {
            if (L(mlbVar, mlbVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.k.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.l != null && syb.N(view) != null && this.l.contains(syb.N(view))) {
            return false;
        }
        if ((this.e.size() == 0 && this.f.size() == 0 && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.g) == null || arrayList2.isEmpty()))) || this.e.contains(Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.g;
        if (arrayList6 != null && arrayList6.contains(syb.N(view))) {
            return true;
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (this.h.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void R(View view) {
        if (!this.A) {
            lr<Animator, d> A = A();
            int size = A.size();
            z4c d2 = a1c.d(view);
            for (int i = size - 1; i >= 0; i--) {
                d o = A.o(i);
                if (o.a != null && d2.equals(o.d)) {
                    zk.b(A.k(i));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((f) arrayList2.get(i2)).e(this);
                }
            }
            this.z = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(ViewGroup viewGroup) {
        d dVar;
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        Q(this.p, this.q);
        lr<Animator, d> A = A();
        int size = A.size();
        z4c d2 = a1c.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator k = A.k(i);
            if (k != null && (dVar = A.get(k)) != null && dVar.a != null && d2.equals(dVar.d)) {
                mlb mlbVar = dVar.c;
                View view = dVar.a;
                mlb I = I(view, true);
                mlb v = v(view, true);
                if (I == null && v == null) {
                    v = this.q.a.get(view);
                }
                if ((I != null || v != null) && dVar.e.J(mlbVar, v)) {
                    if (!k.isRunning() && !k.isStarted()) {
                        A.remove(k);
                    } else {
                        k.cancel();
                    }
                }
            }
        }
        p(viewGroup, this.p, this.q, this.t, this.u);
        Y();
    }

    @NonNull
    public clb T(@NonNull f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    @NonNull
    public clb U(@NonNull View view) {
        this.f.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.z) {
            if (!this.A) {
                lr<Animator, d> A = A();
                int size = A.size();
                z4c d2 = a1c.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d o = A.o(i);
                    if (o.a != null && d2.equals(o.d)) {
                        zk.c(A.k(i));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).d(this);
                    }
                }
            }
            this.z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Y() {
        f0();
        lr<Animator, d> A = A();
        Iterator<Animator> it = this.I.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (A.containsKey(next)) {
                f0();
                X(next, A);
            }
        }
        this.I.clear();
        q();
    }

    @NonNull
    public clb Z(long j) {
        this.c = j;
        return this;
    }

    public void a0(e eVar) {
        this.X = eVar;
    }

    @NonNull
    public clb b(@NonNull f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    @NonNull
    public clb b0(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    @NonNull
    public clb c(@NonNull View view) {
        this.f.add(view);
        return this;
    }

    public void c0(yr7 yr7Var) {
        if (yr7Var == null) {
            this.Z = T4;
        } else {
            this.Z = yr7Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).cancel();
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((f) arrayList2.get(i)).c(this);
            }
        }
    }

    @NonNull
    public clb e0(long j) {
        this.b = j;
        return this;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (t() != null) {
            animator.setInterpolator(t());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f0() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public abstract void g(@NonNull mlb mlbVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.c != -1) {
            str2 = str2 + "dur(" + this.c + ") ";
        }
        if (this.b != -1) {
            str2 = str2 + "dly(" + this.b + ") ";
        }
        if (this.d != null) {
            str2 = str2 + "interp(" + this.d + ") ";
        }
        if (this.e.size() > 0 || this.f.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.e.size() > 0) {
                for (int i = 0; i < this.e.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.e.get(i);
                }
            }
            if (this.f.size() > 0) {
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public abstract void j(@NonNull mlb mlbVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        lr<String, String> lrVar;
        m(z);
        if ((this.e.size() <= 0 && this.f.size() <= 0) || (((arrayList = this.g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.h) != null && !arrayList2.isEmpty()))) {
            h(viewGroup, z);
        } else {
            for (int i = 0; i < this.e.size(); i++) {
                View findViewById = viewGroup.findViewById(this.e.get(i).intValue());
                if (findViewById != null) {
                    mlb mlbVar = new mlb(findViewById);
                    if (z) {
                        j(mlbVar);
                    } else {
                        g(mlbVar);
                    }
                    mlbVar.c.add(this);
                    i(mlbVar);
                    if (z) {
                        e(this.p, findViewById, mlbVar);
                    } else {
                        e(this.q, findViewById, mlbVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                View view = this.f.get(i2);
                mlb mlbVar2 = new mlb(view);
                if (z) {
                    j(mlbVar2);
                } else {
                    g(mlbVar2);
                }
                mlbVar2.c.add(this);
                i(mlbVar2);
                if (z) {
                    e(this.p, view, mlbVar2);
                } else {
                    e(this.q, view, mlbVar2);
                }
            }
        }
        if (!z && (lrVar = this.Y) != null) {
            int size = lrVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.p.d.remove(this.Y.k(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.p.d.put(this.Y.o(i4), view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z) {
        if (z) {
            this.p.a.clear();
            this.p.b.clear();
            this.p.c.c();
            return;
        }
        this.q.a.clear();
        this.q.b.clear();
        this.q.c.c();
    }

    @Override // 
    /* renamed from: n */
    public clb clone() {
        try {
            clb clbVar = (clb) super.clone();
            clbVar.I = new ArrayList<>();
            clbVar.p = new nlb();
            clbVar.q = new nlb();
            clbVar.t = null;
            clbVar.u = null;
            return clbVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(@NonNull ViewGroup viewGroup, mlb mlbVar, mlb mlbVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(ViewGroup viewGroup, nlb nlbVar, nlb nlbVar2, ArrayList<mlb> arrayList, ArrayList<mlb> arrayList2) {
        View view;
        Animator animator;
        mlb mlbVar;
        int i;
        Animator animator2;
        mlb mlbVar2;
        lr<Animator, d> A = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            mlb mlbVar3 = arrayList.get(i2);
            mlb mlbVar4 = arrayList2.get(i2);
            if (mlbVar3 != null && !mlbVar3.c.contains(this)) {
                mlbVar3 = null;
            }
            if (mlbVar4 != null && !mlbVar4.c.contains(this)) {
                mlbVar4 = null;
            }
            if ((mlbVar3 != null || mlbVar4 != null) && (mlbVar3 == null || mlbVar4 == null || J(mlbVar3, mlbVar4))) {
                Animator o = o(viewGroup, mlbVar3, mlbVar4);
                if (o != null) {
                    if (mlbVar4 != null) {
                        View view2 = mlbVar4.b;
                        String[] H = H();
                        if (H != null && H.length > 0) {
                            mlbVar2 = new mlb(view2);
                            mlb mlbVar5 = nlbVar2.a.get(view2);
                            if (mlbVar5 != null) {
                                int i3 = 0;
                                while (i3 < H.length) {
                                    Map<String, Object> map = mlbVar2.a;
                                    Animator animator3 = o;
                                    String str = H[i3];
                                    map.put(str, mlbVar5.a.get(str));
                                    i3++;
                                    o = animator3;
                                    H = H;
                                }
                            }
                            Animator animator4 = o;
                            int size2 = A.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    d dVar = A.get(A.k(i4));
                                    if (dVar.c != null && dVar.a == view2 && dVar.b.equals(w()) && dVar.c.equals(mlbVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = o;
                            mlbVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        mlbVar = mlbVar2;
                    } else {
                        view = mlbVar3.b;
                        animator = o;
                        mlbVar = null;
                    }
                    if (animator != null) {
                        i = size;
                        A.put(animator, new d(view, w(), this, a1c.d(viewGroup), mlbVar));
                        this.I.add(animator);
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = this.I.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).b(this);
                }
            }
            for (int i3 = 0; i3 < this.p.c.o(); i3++) {
                View p = this.p.c.p(i3);
                if (p != null) {
                    syb.E0(p, false);
                }
            }
            for (int i4 = 0; i4 < this.q.c.o(); i4++) {
                View p2 = this.q.c.p(i4);
                if (p2 != null) {
                    syb.E0(p2, false);
                }
            }
            this.A = true;
        }
    }

    public long r() {
        return this.c;
    }

    public e s() {
        return this.X;
    }

    public TimeInterpolator t() {
        return this.d;
    }

    public String toString() {
        return g0("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mlb v(View view, boolean z) {
        ArrayList<mlb> arrayList;
        ArrayList<mlb> arrayList2;
        jlb jlbVar = this.r;
        if (jlbVar != null) {
            return jlbVar.v(view, z);
        }
        if (z) {
            arrayList = this.t;
        } else {
            arrayList = this.u;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                mlb mlbVar = arrayList.get(i);
                if (mlbVar == null) {
                    return null;
                }
                if (mlbVar.b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.u;
        } else {
            arrayList2 = this.t;
        }
        return arrayList2.get(i);
    }

    @NonNull
    public String w() {
        return this.a;
    }

    @NonNull
    public yr7 y() {
        return this.Z;
    }

    public ilb z() {
        return null;
    }

    public void d0(ilb ilbVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(mlb mlbVar) {
    }
}
