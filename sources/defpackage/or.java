package defpackage;

import defpackage.gq5;
import defpackage.lqa;
import java.util.ArrayList;
/* compiled from: ArrayRow.java */
/* renamed from: or  reason: default package */
/* loaded from: classes.dex */
public class or implements gq5.a {
    public a e;
    lqa a = null;
    float b = 0.0f;
    boolean c = false;
    ArrayList<lqa> d = new ArrayList<>();
    boolean f = false;

    /* compiled from: ArrayRow.java */
    /* renamed from: or$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(lqa lqaVar);

        lqa b(int i);

        void c();

        void clear();

        float d(or orVar, boolean z);

        float e(lqa lqaVar);

        int f();

        void g(lqa lqaVar, float f, boolean z);

        float h(int i);

        float i(lqa lqaVar, boolean z);

        void j(float f);

        void k(lqa lqaVar, float f);
    }

    public or() {
    }

    private boolean u(lqa lqaVar, gq5 gq5Var) {
        if (lqaVar.m <= 1) {
            return true;
        }
        return false;
    }

    private lqa w(boolean[] zArr, lqa lqaVar) {
        lqa.a aVar;
        int f = this.e.f();
        lqa lqaVar2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < f; i++) {
            float h = this.e.h(i);
            if (h < 0.0f) {
                lqa b = this.e.b(i);
                if ((zArr == null || !zArr[b.c]) && b != lqaVar && (((aVar = b.j) == lqa.a.SLACK || aVar == lqa.a.ERROR) && h < f2)) {
                    f2 = h;
                    lqaVar2 = b;
                }
            }
        }
        return lqaVar2;
    }

    public void A(gq5 gq5Var, lqa lqaVar, boolean z) {
        if (lqaVar != null && lqaVar.g) {
            this.b += lqaVar.f * this.e.e(lqaVar);
            this.e.i(lqaVar, z);
            if (z) {
                lqaVar.i(this);
            }
            if (gq5.t && this.e.f() == 0) {
                this.f = true;
                gq5Var.a = true;
            }
        }
    }

    public void B(gq5 gq5Var, or orVar, boolean z) {
        this.b += orVar.b * this.e.d(orVar, z);
        if (z) {
            orVar.a.i(this);
        }
        if (gq5.t && this.a != null && this.e.f() == 0) {
            this.f = true;
            gq5Var.a = true;
        }
    }

    public void C(gq5 gq5Var, lqa lqaVar, boolean z) {
        if (lqaVar != null && lqaVar.n) {
            float e = this.e.e(lqaVar);
            this.b += lqaVar.p * e;
            this.e.i(lqaVar, z);
            if (z) {
                lqaVar.i(this);
            }
            this.e.g(gq5Var.n.d[lqaVar.o], e, z);
            if (gq5.t && this.e.f() == 0) {
                this.f = true;
                gq5Var.a = true;
            }
        }
    }

    public void D(gq5 gq5Var) {
        if (gq5Var.g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int f = this.e.f();
            for (int i = 0; i < f; i++) {
                lqa b = this.e.b(i);
                if (b.d != -1 || b.g || b.n) {
                    this.d.add(b);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    lqa lqaVar = this.d.get(i2);
                    if (lqaVar.g) {
                        A(gq5Var, lqaVar, true);
                    } else if (lqaVar.n) {
                        C(gq5Var, lqaVar, true);
                    } else {
                        B(gq5Var, gq5Var.g[lqaVar.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (gq5.t && this.a != null && this.e.f() == 0) {
            this.f = true;
            gq5Var.a = true;
        }
    }

    @Override // defpackage.gq5.a
    public void a(lqa lqaVar) {
        int i = lqaVar.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.k(lqaVar, f);
    }

    @Override // defpackage.gq5.a
    public lqa b(gq5 gq5Var, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // defpackage.gq5.a
    public void c(gq5.a aVar) {
        if (aVar instanceof or) {
            or orVar = (or) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < orVar.e.f(); i++) {
                this.e.g(orVar.e.b(i), orVar.e.h(i), true);
            }
        }
    }

    @Override // defpackage.gq5.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public or d(gq5 gq5Var, int i) {
        this.e.k(gq5Var.o(i, "ep"), 1.0f);
        this.e.k(gq5Var.o(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public or e(lqa lqaVar, int i) {
        this.e.k(lqaVar, i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(gq5 gq5Var) {
        boolean z;
        lqa g = g(gq5Var);
        if (g == null) {
            z = true;
        } else {
            x(g);
            z = false;
        }
        if (this.e.f() == 0) {
            this.f = true;
        }
        return z;
    }

    lqa g(gq5 gq5Var) {
        boolean u;
        boolean u2;
        int f = this.e.f();
        lqa lqaVar = null;
        lqa lqaVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i = 0; i < f; i++) {
            float h = this.e.h(i);
            lqa b = this.e.b(i);
            if (b.j == lqa.a.UNRESTRICTED) {
                if (lqaVar == null) {
                    u2 = u(b, gq5Var);
                } else if (f2 > h) {
                    u2 = u(b, gq5Var);
                } else if (!z && u(b, gq5Var)) {
                    f2 = h;
                    lqaVar = b;
                    z = true;
                }
                z = u2;
                f2 = h;
                lqaVar = b;
            } else if (lqaVar == null && h < 0.0f) {
                if (lqaVar2 == null) {
                    u = u(b, gq5Var);
                } else if (f3 > h) {
                    u = u(b, gq5Var);
                } else if (!z2 && u(b, gq5Var)) {
                    f3 = h;
                    lqaVar2 = b;
                    z2 = true;
                }
                z2 = u;
                f3 = h;
                lqaVar2 = b;
            }
        }
        if (lqaVar != null) {
            return lqaVar;
        }
        return lqaVar2;
    }

    @Override // defpackage.gq5.a
    public lqa getKey() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public or h(lqa lqaVar, lqa lqaVar2, int i, float f, lqa lqaVar3, lqa lqaVar4, int i2) {
        if (lqaVar2 == lqaVar3) {
            this.e.k(lqaVar, 1.0f);
            this.e.k(lqaVar4, 1.0f);
            this.e.k(lqaVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.k(lqaVar, 1.0f);
            this.e.k(lqaVar2, -1.0f);
            this.e.k(lqaVar3, -1.0f);
            this.e.k(lqaVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.e.k(lqaVar, -1.0f);
            this.e.k(lqaVar2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.e.k(lqaVar4, -1.0f);
            this.e.k(lqaVar3, 1.0f);
            this.b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.e.k(lqaVar, f2 * 1.0f);
            this.e.k(lqaVar2, f2 * (-1.0f));
            this.e.k(lqaVar3, (-1.0f) * f);
            this.e.k(lqaVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public or i(lqa lqaVar, int i) {
        this.a = lqaVar;
        float f = i;
        lqaVar.f = f;
        this.b = f;
        this.f = true;
        return this;
    }

    @Override // defpackage.gq5.a
    public boolean isEmpty() {
        if (this.a == null && this.b == 0.0f && this.e.f() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public or j(lqa lqaVar, lqa lqaVar2, float f) {
        this.e.k(lqaVar, -1.0f);
        this.e.k(lqaVar2, f);
        return this;
    }

    public or k(lqa lqaVar, lqa lqaVar2, lqa lqaVar3, lqa lqaVar4, float f) {
        this.e.k(lqaVar, -1.0f);
        this.e.k(lqaVar2, 1.0f);
        this.e.k(lqaVar3, f);
        this.e.k(lqaVar4, -f);
        return this;
    }

    public or l(float f, float f2, float f3, lqa lqaVar, lqa lqaVar2, lqa lqaVar3, lqa lqaVar4) {
        this.b = 0.0f;
        if (f2 != 0.0f && f != f3) {
            if (f == 0.0f) {
                this.e.k(lqaVar, 1.0f);
                this.e.k(lqaVar2, -1.0f);
            } else if (f3 == 0.0f) {
                this.e.k(lqaVar3, 1.0f);
                this.e.k(lqaVar4, -1.0f);
            } else {
                float f4 = (f / f2) / (f3 / f2);
                this.e.k(lqaVar, 1.0f);
                this.e.k(lqaVar2, -1.0f);
                this.e.k(lqaVar4, f4);
                this.e.k(lqaVar3, -f4);
            }
        } else {
            this.e.k(lqaVar, 1.0f);
            this.e.k(lqaVar2, -1.0f);
            this.e.k(lqaVar4, 1.0f);
            this.e.k(lqaVar3, -1.0f);
        }
        return this;
    }

    public or m(lqa lqaVar, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.k(lqaVar, 1.0f);
        } else {
            this.b = i;
            this.e.k(lqaVar, -1.0f);
        }
        return this;
    }

    public or n(lqa lqaVar, lqa lqaVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.k(lqaVar, 1.0f);
                this.e.k(lqaVar2, -1.0f);
                return this;
            }
        }
        this.e.k(lqaVar, -1.0f);
        this.e.k(lqaVar2, 1.0f);
        return this;
    }

    public or o(lqa lqaVar, lqa lqaVar2, lqa lqaVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.k(lqaVar, 1.0f);
                this.e.k(lqaVar2, -1.0f);
                this.e.k(lqaVar3, -1.0f);
                return this;
            }
        }
        this.e.k(lqaVar, -1.0f);
        this.e.k(lqaVar2, 1.0f);
        this.e.k(lqaVar3, 1.0f);
        return this;
    }

    public or p(lqa lqaVar, lqa lqaVar2, lqa lqaVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.k(lqaVar, 1.0f);
                this.e.k(lqaVar2, -1.0f);
                this.e.k(lqaVar3, 1.0f);
                return this;
            }
        }
        this.e.k(lqaVar, -1.0f);
        this.e.k(lqaVar2, 1.0f);
        this.e.k(lqaVar3, -1.0f);
        return this;
    }

    public or q(lqa lqaVar, lqa lqaVar2, lqa lqaVar3, lqa lqaVar4, float f) {
        this.e.k(lqaVar3, 0.5f);
        this.e.k(lqaVar4, 0.5f);
        this.e.k(lqaVar, -0.5f);
        this.e.k(lqaVar2, -0.5f);
        this.b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        lqa lqaVar = this.a;
        if (lqaVar != null && (lqaVar.j == lqa.a.UNRESTRICTED || this.b >= 0.0f)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(lqa lqaVar) {
        return this.e.a(lqaVar);
    }

    public String toString() {
        return z();
    }

    public lqa v(lqa lqaVar) {
        return w(null, lqaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(lqa lqaVar) {
        lqa lqaVar2 = this.a;
        if (lqaVar2 != null) {
            this.e.k(lqaVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float i = this.e.i(lqaVar, true) * (-1.0f);
        this.a = lqaVar;
        if (i == 1.0f) {
            return;
        }
        this.b /= i;
        this.e.j(i);
    }

    public void y() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.z():java.lang.String");
    }

    public or(kl0 kl0Var) {
        this.e = new kr(this, kl0Var);
    }
}
