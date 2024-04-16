package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: WidgetGroup.java */
/* renamed from: s4c  reason: default package */
/* loaded from: classes.dex */
public class s4c {
    static int g;
    int b;
    int d;
    ArrayList<lr1> a = new ArrayList<>();
    boolean c = false;
    ArrayList<a> e = null;
    private int f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetGroup.java */
    /* renamed from: s4c$a */
    /* loaded from: classes.dex */
    public class a {
        WeakReference<lr1> a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public a(lr1 lr1Var, gq5 gq5Var, int i) {
            this.a = new WeakReference<>(lr1Var);
            this.b = gq5Var.y(lr1Var.P);
            this.c = gq5Var.y(lr1Var.Q);
            this.d = gq5Var.y(lr1Var.R);
            this.e = gq5Var.y(lr1Var.S);
            this.f = gq5Var.y(lr1Var.T);
            this.g = i;
        }
    }

    public s4c(int i) {
        int i2 = g;
        g = i2 + 1;
        this.b = i2;
        this.d = i;
    }

    private String e() {
        int i = this.d;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return "Both";
        }
        return "Unknown";
    }

    private int j(gq5 gq5Var, ArrayList<lr1> arrayList, int i) {
        int y;
        int y2;
        mr1 mr1Var = (mr1) arrayList.get(0).L();
        gq5Var.E();
        mr1Var.g(gq5Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(gq5Var, false);
        }
        if (i == 0 && mr1Var.e1 > 0) {
            tu0.b(mr1Var, gq5Var, arrayList, 0);
        }
        if (i == 1 && mr1Var.f1 > 0) {
            tu0.b(mr1Var, gq5Var, arrayList, 1);
        }
        try {
            gq5Var.A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new a(arrayList.get(i3), gq5Var, i));
        }
        if (i == 0) {
            y = gq5Var.y(mr1Var.P);
            y2 = gq5Var.y(mr1Var.R);
            gq5Var.E();
        } else {
            y = gq5Var.y(mr1Var.Q);
            y2 = gq5Var.y(mr1Var.S);
            gq5Var.E();
        }
        return y2 - y;
    }

    public boolean a(lr1 lr1Var) {
        if (this.a.contains(lr1Var)) {
            return false;
        }
        this.a.add(lr1Var);
        return true;
    }

    public void b(ArrayList<s4c> arrayList) {
        int size = this.a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                s4c s4cVar = arrayList.get(i);
                if (this.f == s4cVar.b) {
                    g(this.d, s4cVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int f(gq5 gq5Var, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return j(gq5Var, this.a, i);
    }

    public void g(int i, s4c s4cVar) {
        Iterator<lr1> it = this.a.iterator();
        while (it.hasNext()) {
            lr1 next = it.next();
            s4cVar.a(next);
            if (i == 0) {
                next.Q0 = s4cVar.c();
            } else {
                next.R0 = s4cVar.c();
            }
        }
        this.f = s4cVar.b;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i) {
        this.d = i;
    }

    public String toString() {
        Iterator<lr1> it;
        String str = e() + " [" + this.b + "] <";
        while (this.a.iterator().hasNext()) {
            str = str + " " + it.next().u();
        }
        return str + " >";
    }
}
