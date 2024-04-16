package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: DependencyNode.java */
/* renamed from: i03  reason: default package */
/* loaded from: classes.dex */
public class i03 implements e03 {
    t4c d;
    int f;
    public int g;
    public e03 a = null;
    public boolean b = false;
    public boolean c = false;
    a e = a.UNKNOWN;
    int h = 1;
    m23 i = null;
    public boolean j = false;
    List<e03> k = new ArrayList();
    List<i03> l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DependencyNode.java */
    /* renamed from: i03$a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public i03(t4c t4cVar) {
        this.d = t4cVar;
    }

    @Override // defpackage.e03
    public void a(e03 e03Var) {
        for (i03 i03Var : this.l) {
            if (!i03Var.j) {
                return;
            }
        }
        this.c = true;
        e03 e03Var2 = this.a;
        if (e03Var2 != null) {
            e03Var2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        i03 i03Var2 = null;
        int i = 0;
        for (i03 i03Var3 : this.l) {
            if (!(i03Var3 instanceof m23)) {
                i++;
                i03Var2 = i03Var3;
            }
        }
        if (i03Var2 != null && i == 1 && i03Var2.j) {
            m23 m23Var = this.i;
            if (m23Var != null) {
                if (m23Var.j) {
                    this.f = this.h * m23Var.g;
                } else {
                    return;
                }
            }
            d(i03Var2.g + this.f);
        }
        e03 e03Var3 = this.a;
        if (e03Var3 != null) {
            e03Var3.a(this);
        }
    }

    public void b(e03 e03Var) {
        this.k.add(e03Var);
        if (this.j) {
            e03Var.a(e03Var);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (e03 e03Var : this.k) {
            e03Var.a(e03Var);
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.u());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
