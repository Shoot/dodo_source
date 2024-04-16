package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* renamed from: op9  reason: default package */
/* loaded from: classes.dex */
public class op9 {
    public static int h;
    t4c c;
    t4c d;
    int f;
    int g;
    public int a = 0;
    public boolean b = false;
    ArrayList<t4c> e = new ArrayList<>();

    public op9(t4c t4cVar, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = t4cVar;
        this.d = t4cVar;
        this.g = i;
    }

    private long c(i03 i03Var, long j) {
        t4c t4cVar = i03Var.d;
        if (t4cVar instanceof do4) {
            return j;
        }
        int size = i03Var.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            e03 e03Var = i03Var.k.get(i);
            if (e03Var instanceof i03) {
                i03 i03Var2 = (i03) e03Var;
                if (i03Var2.d != t4cVar) {
                    j2 = Math.min(j2, c(i03Var2, i03Var2.f + j));
                }
            }
        }
        if (i03Var == t4cVar.i) {
            long j3 = j - t4cVar.j();
            return Math.min(Math.min(j2, c(t4cVar.h, j3)), j3 - t4cVar.h.f);
        }
        return j2;
    }

    private long d(i03 i03Var, long j) {
        t4c t4cVar = i03Var.d;
        if (t4cVar instanceof do4) {
            return j;
        }
        int size = i03Var.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            e03 e03Var = i03Var.k.get(i);
            if (e03Var instanceof i03) {
                i03 i03Var2 = (i03) e03Var;
                if (i03Var2.d != t4cVar) {
                    j2 = Math.max(j2, d(i03Var2, i03Var2.f + j));
                }
            }
        }
        if (i03Var == t4cVar.h) {
            long j3 = j + t4cVar.j();
            return Math.max(Math.max(j2, d(t4cVar.i, j3)), j3 - t4cVar.i.f);
        }
        return j2;
    }

    public void a(t4c t4cVar) {
        this.e.add(t4cVar);
        this.d = t4cVar;
    }

    public long b(mr1 mr1Var, int i) {
        t4c t4cVar;
        t4c t4cVar2;
        t4c t4cVar3;
        long j;
        int i2;
        i03 i03Var;
        i03 i03Var2;
        t4c t4cVar4;
        t4c t4cVar5 = this.c;
        long j2 = 0;
        if (t4cVar5 instanceof wu0) {
            if (((wu0) t4cVar5).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(t4cVar5 instanceof ap4)) {
                return 0L;
            }
        } else if (!(t4cVar5 instanceof gyb)) {
            return 0L;
        }
        if (i == 0) {
            t4cVar = mr1Var.e;
        } else {
            t4cVar = mr1Var.f;
        }
        i03 i03Var3 = t4cVar.h;
        if (i == 0) {
            t4cVar2 = mr1Var.e;
        } else {
            t4cVar2 = mr1Var.f;
        }
        i03 i03Var4 = t4cVar2.i;
        boolean contains = t4cVar5.h.l.contains(i03Var3);
        boolean contains2 = this.c.i.l.contains(i03Var4);
        long j3 = this.c.j();
        if (contains && contains2) {
            long d = d(this.c.h, 0L);
            long c = c(this.c.i, 0L);
            long j4 = d - j3;
            t4c t4cVar6 = this.c;
            int i3 = t4cVar6.i.f;
            if (j4 >= (-i3)) {
                j4 += i3;
            }
            int i4 = t4cVar6.h.f;
            long j5 = ((-c) - j3) - i4;
            if (j5 >= i4) {
                j5 -= i4;
            }
            float r = t4cVar6.b.r(i);
            if (r > 0.0f) {
                j2 = (((float) j5) / r) + (((float) j4) / (1.0f - r));
            }
            float f = (float) j2;
            long j6 = (f * r) + 0.5f + j3 + (f * (1.0f - r)) + 0.5f;
            j = t4cVar4.h.f + j6;
            i2 = this.c.i.f;
        } else if (contains) {
            return Math.max(d(this.c.h, i03Var2.f), this.c.h.f + j3);
        } else if (contains2) {
            return Math.max(-c(this.c.i, i03Var.f), (-this.c.i.f) + j3);
        } else {
            j = t4cVar3.h.f + this.c.j();
            i2 = this.c.i.f;
        }
        return j - i2;
    }
}
