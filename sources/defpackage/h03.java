package defpackage;

import defpackage.lr1;
import defpackage.m90;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: DependencyGraph.java */
/* renamed from: h03  reason: default package */
/* loaded from: classes.dex */
public class h03 {
    private mr1 a;
    private mr1 d;
    private boolean b = true;
    private boolean c = true;
    private ArrayList<t4c> e = new ArrayList<>();
    private ArrayList<op9> f = new ArrayList<>();
    private m90.b g = null;
    private m90.a h = new m90.a();
    ArrayList<op9> i = new ArrayList<>();

    public h03(mr1 mr1Var) {
        this.a = mr1Var;
        this.d = mr1Var;
    }

    private void a(i03 i03Var, int i, int i2, i03 i03Var2, ArrayList<op9> arrayList, op9 op9Var) {
        t4c t4cVar = i03Var.d;
        if (t4cVar.c == null) {
            mr1 mr1Var = this.a;
            if (t4cVar != mr1Var.e && t4cVar != mr1Var.f) {
                if (op9Var == null) {
                    op9Var = new op9(t4cVar, i2);
                    arrayList.add(op9Var);
                }
                t4cVar.c = op9Var;
                op9Var.a(t4cVar);
                for (e03 e03Var : t4cVar.h.k) {
                    if (e03Var instanceof i03) {
                        a((i03) e03Var, i, 0, i03Var2, arrayList, op9Var);
                    }
                }
                for (e03 e03Var2 : t4cVar.i.k) {
                    if (e03Var2 instanceof i03) {
                        a((i03) e03Var2, i, 1, i03Var2, arrayList, op9Var);
                    }
                }
                if (i == 1 && (t4cVar instanceof gyb)) {
                    for (e03 e03Var3 : ((gyb) t4cVar).k.k) {
                        if (e03Var3 instanceof i03) {
                            a((i03) e03Var3, i, 2, i03Var2, arrayList, op9Var);
                        }
                    }
                }
                for (i03 i03Var3 : t4cVar.h.l) {
                    if (i03Var3 == i03Var2) {
                        op9Var.b = true;
                    }
                    a(i03Var3, i, 0, i03Var2, arrayList, op9Var);
                }
                for (i03 i03Var4 : t4cVar.i.l) {
                    if (i03Var4 == i03Var2) {
                        op9Var.b = true;
                    }
                    a(i03Var4, i, 1, i03Var2, arrayList, op9Var);
                }
                if (i == 1 && (t4cVar instanceof gyb)) {
                    for (i03 i03Var5 : ((gyb) t4cVar).k.l) {
                        a(i03Var5, i, 2, i03Var2, arrayList, op9Var);
                    }
                }
            }
        }
    }

    private boolean b(mr1 mr1Var) {
        int i;
        lr1.b bVar;
        int i2;
        lr1.b bVar2;
        lr1.b bVar3;
        lr1.b bVar4;
        Iterator<lr1> it = mr1Var.T0.iterator();
        while (it.hasNext()) {
            lr1 next = it.next();
            lr1.b[] bVarArr = next.a0;
            lr1.b bVar5 = bVarArr[0];
            lr1.b bVar6 = bVarArr[1];
            if (next.T() == 8) {
                next.a = true;
            } else {
                if (next.A < 1.0f && bVar5 == lr1.b.MATCH_CONSTRAINT) {
                    next.v = 2;
                }
                if (next.D < 1.0f && bVar6 == lr1.b.MATCH_CONSTRAINT) {
                    next.w = 2;
                }
                if (next.w() > 0.0f) {
                    lr1.b bVar7 = lr1.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == lr1.b.WRAP_CONTENT || bVar6 == lr1.b.FIXED)) {
                        next.v = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == lr1.b.WRAP_CONTENT || bVar5 == lr1.b.FIXED)) {
                        next.w = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.v == 0) {
                            next.v = 3;
                        }
                        if (next.w == 0) {
                            next.w = 3;
                        }
                    }
                }
                lr1.b bVar8 = lr1.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.v == 1 && (next.P.f == null || next.R.f == null)) {
                    bVar5 = lr1.b.WRAP_CONTENT;
                }
                lr1.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.w == 1 && (next.Q.f == null || next.S.f == null)) {
                    bVar6 = lr1.b.WRAP_CONTENT;
                }
                lr1.b bVar10 = bVar6;
                ap4 ap4Var = next.e;
                ap4Var.d = bVar9;
                int i3 = next.v;
                ap4Var.a = i3;
                gyb gybVar = next.f;
                gybVar.d = bVar10;
                int i4 = next.w;
                gybVar.a = i4;
                lr1.b bVar11 = lr1.b.MATCH_PARENT;
                if ((bVar9 != bVar11 && bVar9 != lr1.b.FIXED && bVar9 != lr1.b.WRAP_CONTENT) || (bVar10 != bVar11 && bVar10 != lr1.b.FIXED && bVar10 != lr1.b.WRAP_CONTENT)) {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = lr1.b.WRAP_CONTENT) || bVar10 == lr1.b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int y = next.y();
                            lr1.b bVar12 = lr1.b.FIXED;
                            l(next, bVar12, (int) ((y * next.e0) + 0.5f), bVar12, y);
                            next.e.e.d(next.U());
                            next.f.e.d(next.y());
                            next.a = true;
                        } else if (i3 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.e.e.m = next.U();
                        } else if (i3 == 2) {
                            lr1.b bVar13 = mr1Var.a0[0];
                            lr1.b bVar14 = lr1.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                l(next, bVar14, (int) ((next.A * mr1Var.U()) + 0.5f), bVar10, next.y());
                                next.e.e.d(next.U());
                                next.f.e.d(next.y());
                                next.a = true;
                            }
                        } else {
                            hr1[] hr1VarArr = next.X;
                            if (hr1VarArr[0].f == null || hr1VarArr[1].f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.e.e.d(next.U());
                                next.f.e.d(next.y());
                                next.a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = lr1.b.WRAP_CONTENT) || bVar9 == lr1.b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int U = next.U();
                            float f = next.e0;
                            if (next.x() == -1) {
                                f = 1.0f / f;
                            }
                            lr1.b bVar15 = lr1.b.FIXED;
                            l(next, bVar15, U, bVar15, (int) ((U * f) + 0.5f));
                            next.e.e.d(next.U());
                            next.f.e.d(next.y());
                            next.a = true;
                        } else if (i4 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f.e.m = next.y();
                        } else if (i4 == 2) {
                            lr1.b bVar16 = mr1Var.a0[1];
                            lr1.b bVar17 = lr1.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                l(next, bVar9, next.U(), bVar17, (int) ((next.D * mr1Var.y()) + 0.5f));
                                next.e.e.d(next.U());
                                next.f.e.d(next.y());
                                next.a = true;
                            }
                        } else {
                            hr1[] hr1VarArr2 = next.X;
                            if (hr1VarArr2[2].f == null || hr1VarArr2[3].f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.e.e.d(next.U());
                                next.f.e.d(next.y());
                                next.a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i3 != 1 && i4 != 1) {
                            if (i4 == 2 && i3 == 2) {
                                lr1.b[] bVarArr2 = mr1Var.a0;
                                lr1.b bVar18 = bVarArr2[0];
                                lr1.b bVar19 = lr1.b.FIXED;
                                if (bVar18 == bVar19 && bVarArr2[1] == bVar19) {
                                    l(next, bVar19, (int) ((next.A * mr1Var.U()) + 0.5f), bVar19, (int) ((next.D * mr1Var.y()) + 0.5f));
                                    next.e.e.d(next.U());
                                    next.f.e.d(next.y());
                                    next.a = true;
                                }
                            }
                        } else {
                            lr1.b bVar20 = lr1.b.WRAP_CONTENT;
                            l(next, bVar20, 0, bVar20, 0);
                            next.e.e.m = next.U();
                            next.f.e.m = next.y();
                        }
                    }
                } else {
                    int U2 = next.U();
                    if (bVar9 == bVar11) {
                        i = (mr1Var.U() - next.P.g) - next.R.g;
                        bVar = lr1.b.FIXED;
                    } else {
                        i = U2;
                        bVar = bVar9;
                    }
                    int y2 = next.y();
                    if (bVar10 == bVar11) {
                        i2 = (mr1Var.y() - next.Q.g) - next.S.g;
                        bVar2 = lr1.b.FIXED;
                    } else {
                        i2 = y2;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, i, bVar2, i2);
                    next.e.e.d(next.U());
                    next.f.e.d(next.y());
                    next.a = true;
                }
            }
        }
        return false;
    }

    private int e(mr1 mr1Var, int i) {
        int size = this.i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.i.get(i2).b(mr1Var, i));
        }
        return (int) j;
    }

    private void i(t4c t4cVar, int i, ArrayList<op9> arrayList) {
        for (e03 e03Var : t4cVar.h.k) {
            if (e03Var instanceof i03) {
                a((i03) e03Var, i, 0, t4cVar.i, arrayList, null);
            } else if (e03Var instanceof t4c) {
                a(((t4c) e03Var).h, i, 0, t4cVar.i, arrayList, null);
            }
        }
        for (e03 e03Var2 : t4cVar.i.k) {
            if (e03Var2 instanceof i03) {
                a((i03) e03Var2, i, 1, t4cVar.h, arrayList, null);
            } else if (e03Var2 instanceof t4c) {
                a(((t4c) e03Var2).i, i, 1, t4cVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (e03 e03Var3 : ((gyb) t4cVar).k.k) {
                if (e03Var3 instanceof i03) {
                    a((i03) e03Var3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(lr1 lr1Var, lr1.b bVar, int i, lr1.b bVar2, int i2) {
        m90.a aVar = this.h;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(lr1Var, aVar);
        lr1Var.f1(this.h.e);
        lr1Var.G0(this.h.f);
        lr1Var.F0(this.h.h);
        lr1Var.v0(this.h.g);
    }

    public void c() {
        d(this.e);
        this.i.clear();
        op9.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList<t4c> arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        Iterator<lr1> it = this.d.T0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            lr1 next = it.next();
            if (next instanceof vi4) {
                arrayList.add(new wi4(next));
            } else {
                if (next.g0()) {
                    if (next.c == null) {
                        next.c = new wu0(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next.i0()) {
                    if (next.d == null) {
                        next.d = new wu0(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.d);
                } else {
                    arrayList.add(next.f);
                }
                if (next instanceof eo4) {
                    arrayList.add(new do4(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<t4c> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<t4c> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            t4c next2 = it3.next();
            if (next2.b != this.d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.b || this.c) {
            Iterator<lr1> it = this.a.T0.iterator();
            while (it.hasNext()) {
                lr1 next = it.next();
                next.o();
                next.a = false;
                next.e.r();
                next.f.q();
            }
            this.a.o();
            mr1 mr1Var = this.a;
            mr1Var.a = false;
            mr1Var.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.h1(0);
        this.a.i1(0);
        lr1.b v = this.a.v(0);
        lr1.b v2 = this.a.v(1);
        if (this.b) {
            c();
        }
        int V = this.a.V();
        int W = this.a.W();
        this.a.e.h.d(V);
        this.a.f.h.d(W);
        m();
        lr1.b bVar = lr1.b.WRAP_CONTENT;
        if (v == bVar || v2 == bVar) {
            if (z4) {
                Iterator<t4c> it2 = this.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && v == lr1.b.WRAP_CONTENT) {
                this.a.K0(lr1.b.FIXED);
                mr1 mr1Var2 = this.a;
                mr1Var2.f1(e(mr1Var2, 0));
                mr1 mr1Var3 = this.a;
                mr1Var3.e.e.d(mr1Var3.U());
            }
            if (z4 && v2 == lr1.b.WRAP_CONTENT) {
                this.a.b1(lr1.b.FIXED);
                mr1 mr1Var4 = this.a;
                mr1Var4.G0(e(mr1Var4, 1));
                mr1 mr1Var5 = this.a;
                mr1Var5.f.e.d(mr1Var5.y());
            }
        }
        mr1 mr1Var6 = this.a;
        lr1.b bVar2 = mr1Var6.a0[0];
        lr1.b bVar3 = lr1.b.FIXED;
        if (bVar2 != bVar3 && bVar2 != lr1.b.MATCH_PARENT) {
            z2 = false;
        } else {
            int U = mr1Var6.U() + V;
            this.a.e.i.d(U);
            this.a.e.e.d(U - V);
            m();
            mr1 mr1Var7 = this.a;
            lr1.b bVar4 = mr1Var7.a0[1];
            if (bVar4 == bVar3 || bVar4 == lr1.b.MATCH_PARENT) {
                int y = mr1Var7.y() + W;
                this.a.f.i.d(y);
                this.a.f.e.d(y - W);
            }
            m();
            z2 = true;
        }
        Iterator<t4c> it3 = this.e.iterator();
        while (it3.hasNext()) {
            t4c next2 = it3.next();
            if (next2.b != this.a || next2.g) {
                next2.e();
            }
        }
        Iterator<t4c> it4 = this.e.iterator();
        while (it4.hasNext()) {
            t4c next3 = it4.next();
            if (z2 || next3.b != this.a) {
                if (!next3.h.j || ((!next3.i.j && !(next3 instanceof wi4)) || (!next3.e.j && !(next3 instanceof wu0) && !(next3 instanceof wi4)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.K0(v);
        this.a.b1(v2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            Iterator<lr1> it = this.a.T0.iterator();
            while (it.hasNext()) {
                lr1 next = it.next();
                next.o();
                next.a = false;
                ap4 ap4Var = next.e;
                ap4Var.e.j = false;
                ap4Var.g = false;
                ap4Var.r();
                gyb gybVar = next.f;
                gybVar.e.j = false;
                gybVar.g = false;
                gybVar.q();
            }
            this.a.o();
            mr1 mr1Var = this.a;
            mr1Var.a = false;
            ap4 ap4Var2 = mr1Var.e;
            ap4Var2.e.j = false;
            ap4Var2.g = false;
            ap4Var2.r();
            gyb gybVar2 = this.a.f;
            gybVar2.e.j = false;
            gybVar2.g = false;
            gybVar2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.h1(0);
        this.a.i1(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        lr1.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        lr1.b v = this.a.v(0);
        lr1.b v2 = this.a.v(1);
        int V = this.a.V();
        int W = this.a.W();
        if (z4 && (v == (bVar = lr1.b.WRAP_CONTENT) || v2 == bVar)) {
            Iterator<t4c> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t4c next = it.next();
                if (next.f == i && !next.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && v == lr1.b.WRAP_CONTENT) {
                    this.a.K0(lr1.b.FIXED);
                    mr1 mr1Var = this.a;
                    mr1Var.f1(e(mr1Var, 0));
                    mr1 mr1Var2 = this.a;
                    mr1Var2.e.e.d(mr1Var2.U());
                }
            } else if (z4 && v2 == lr1.b.WRAP_CONTENT) {
                this.a.b1(lr1.b.FIXED);
                mr1 mr1Var3 = this.a;
                mr1Var3.G0(e(mr1Var3, 1));
                mr1 mr1Var4 = this.a;
                mr1Var4.f.e.d(mr1Var4.y());
            }
        }
        if (i == 0) {
            mr1 mr1Var5 = this.a;
            lr1.b bVar2 = mr1Var5.a0[0];
            if (bVar2 == lr1.b.FIXED || bVar2 == lr1.b.MATCH_PARENT) {
                int U = mr1Var5.U() + V;
                this.a.e.i.d(U);
                this.a.e.e.d(U - V);
                z2 = true;
            }
            z2 = false;
        } else {
            mr1 mr1Var6 = this.a;
            lr1.b bVar3 = mr1Var6.a0[1];
            if (bVar3 == lr1.b.FIXED || bVar3 == lr1.b.MATCH_PARENT) {
                int y = mr1Var6.y() + W;
                this.a.f.i.d(y);
                this.a.f.e.d(y - W);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator<t4c> it2 = this.e.iterator();
        while (it2.hasNext()) {
            t4c next2 = it2.next();
            if (next2.f == i && (next2.b != this.a || next2.g)) {
                next2.e();
            }
        }
        Iterator<t4c> it3 = this.e.iterator();
        while (it3.hasNext()) {
            t4c next3 = it3.next();
            if (next3.f == i && (z2 || next3.b != this.a)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof wu0) && !next3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.K0(v);
        this.a.b1(v2);
        return z3;
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public void m() {
        boolean z;
        m23 m23Var;
        Iterator<lr1> it = this.a.T0.iterator();
        while (it.hasNext()) {
            lr1 next = it.next();
            if (!next.a) {
                lr1.b[] bVarArr = next.a0;
                boolean z2 = false;
                lr1.b bVar = bVarArr[0];
                lr1.b bVar2 = bVarArr[1];
                int i = next.v;
                int i2 = next.w;
                lr1.b bVar3 = lr1.b.WRAP_CONTENT;
                if (bVar != bVar3 && (bVar != lr1.b.MATCH_CONSTRAINT || i != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVar2 == bVar3 || (bVar2 == lr1.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                m23 m23Var2 = next.e.e;
                boolean z3 = m23Var2.j;
                m23 m23Var3 = next.f.e;
                boolean z4 = m23Var3.j;
                if (z3 && z4) {
                    lr1.b bVar4 = lr1.b.FIXED;
                    l(next, bVar4, m23Var2.g, bVar4, m23Var3.g);
                    next.a = true;
                } else if (z3 && z2) {
                    l(next, lr1.b.FIXED, m23Var2.g, bVar3, m23Var3.g);
                    if (bVar2 == lr1.b.MATCH_CONSTRAINT) {
                        next.f.e.m = next.y();
                    } else {
                        next.f.e.d(next.y());
                        next.a = true;
                    }
                } else if (z4 && z) {
                    l(next, bVar3, m23Var2.g, lr1.b.FIXED, m23Var3.g);
                    if (bVar == lr1.b.MATCH_CONSTRAINT) {
                        next.e.e.m = next.U();
                    } else {
                        next.e.e.d(next.U());
                        next.a = true;
                    }
                }
                if (next.a && (m23Var = next.f.l) != null) {
                    m23Var.d(next.q());
                }
            }
        }
    }

    public void n(m90.b bVar) {
        this.g = bVar;
    }
}
