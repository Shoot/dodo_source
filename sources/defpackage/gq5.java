package defpackage;

import defpackage.hr1;
import defpackage.lqa;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: LinearSystem.java */
/* renamed from: gq5  reason: default package */
/* loaded from: classes.dex */
public class gq5 {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static long x;
    public static long y;
    private a d;
    or[] g;
    final kl0 n;
    private a q;
    public boolean a = false;
    int b = 0;
    private HashMap<String, lqa> c = null;
    private int e = 32;
    private int f = 32;
    public boolean h = false;
    public boolean i = false;
    private boolean[] j = new boolean[32];
    int k = 1;
    int l = 0;
    private int m = 32;
    private lqa[] o = new lqa[w];
    private int p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: gq5$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(lqa lqaVar);

        lqa b(gq5 gq5Var, boolean[] zArr);

        void c(a aVar);

        void clear();

        lqa getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: gq5$b */
    /* loaded from: classes.dex */
    public class b extends or {
        public b(kl0 kl0Var) {
            this.e = new mqa(this, kl0Var);
        }
    }

    public gq5() {
        this.g = null;
        this.g = new or[32];
        D();
        kl0 kl0Var = new kl0();
        this.n = kl0Var;
        this.d = new zj8(kl0Var);
        if (v) {
            this.q = new b(kl0Var);
        } else {
            this.q = new or(kl0Var);
        }
    }

    private final int C(a aVar, boolean z) {
        for (int i = 0; i < this.k; i++) {
            this.j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().c] = true;
            }
            lqa b2 = aVar.b(this, this.j);
            if (b2 != null) {
                boolean[] zArr = this.j;
                int i3 = b2.c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (b2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.l; i5++) {
                    or orVar = this.g[i5];
                    if (orVar.a.j != lqa.a.UNRESTRICTED && !orVar.f && orVar.t(b2)) {
                        float e = orVar.e.e(b2);
                        if (e < 0.0f) {
                            float f2 = (-orVar.b) / e;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    or orVar2 = this.g[i4];
                    orVar2.a.d = -1;
                    orVar2.x(b2);
                    lqa lqaVar = orVar2.a;
                    lqaVar.d = i4;
                    lqaVar.q(this, orVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    private void D() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                or orVar = this.g[i];
                if (orVar != null) {
                    this.n.a.a(orVar);
                }
                this.g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            or orVar2 = this.g[i];
            if (orVar2 != null) {
                this.n.b.a(orVar2);
            }
            this.g[i] = null;
            i++;
        }
    }

    private lqa a(lqa.a aVar, String str) {
        lqa b2 = this.n.c.b();
        if (b2 == null) {
            b2 = new lqa(aVar, str);
            b2.p(aVar, str);
        } else {
            b2.k();
            b2.p(aVar, str);
        }
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (lqa[]) Arrays.copyOf(this.o, i3);
        }
        lqa[] lqaVarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        lqaVarArr[i4] = b2;
        return b2;
    }

    private final void l(or orVar) {
        int i;
        if (t && orVar.f) {
            orVar.a.o(this, orVar.b);
        } else {
            or[] orVarArr = this.g;
            int i2 = this.l;
            orVarArr[i2] = orVar;
            lqa lqaVar = orVar.a;
            lqaVar.d = i2;
            this.l = i2 + 1;
            lqaVar.q(this, orVar);
        }
        if (t && this.a) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                or orVar2 = this.g[i3];
                if (orVar2 != null && orVar2.f) {
                    orVar2.a.o(this, orVar2.b);
                    if (v) {
                        this.n.a.a(orVar2);
                    } else {
                        this.n.b.a(orVar2);
                    }
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        or[] orVarArr2 = this.g;
                        int i6 = i4 - 1;
                        or orVar3 = orVarArr2[i4];
                        orVarArr2[i6] = orVar3;
                        lqa lqaVar2 = orVar3.a;
                        if (lqaVar2.d == i4) {
                            lqaVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    private void n() {
        for (int i = 0; i < this.l; i++) {
            or orVar = this.g[i];
            orVar.a.f = orVar.b;
        }
    }

    public static or s(gq5 gq5Var, lqa lqaVar, lqa lqaVar2, float f) {
        return gq5Var.r().j(lqaVar, lqaVar2, f);
    }

    private int u(a aVar) throws Exception {
        for (int i = 0; i < this.l; i++) {
            or orVar = this.g[i];
            if (orVar.a.j != lqa.a.UNRESTRICTED && orVar.b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.l) {
                            break;
                        }
                        or orVar2 = this.g[i3];
                        if (orVar2.a.j != lqa.a.UNRESTRICTED && !orVar2.f && orVar2.b < 0.0f) {
                            int i7 = 9;
                            if (u) {
                                int f2 = orVar2.e.f();
                                int i8 = 0;
                                while (i8 < f2) {
                                    lqa b2 = orVar2.e.b(i8);
                                    float e = orVar2.e.e(b2);
                                    if (e > 0.0f) {
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            float f3 = b2.h[i9] / e;
                                            if ((f3 < f && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = b2.c;
                                                i4 = i3;
                                                f = f3;
                                            }
                                            i9++;
                                            i7 = 9;
                                        }
                                    }
                                    i8++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i10 = 1; i10 < this.k; i10++) {
                                    lqa lqaVar = this.n.d[i10];
                                    float e2 = orVar2.e.e(lqaVar);
                                    if (e2 > 0.0f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f4 = lqaVar.h[i11] / e2;
                                            if ((f4 < f && i11 == i6) || i11 > i6) {
                                                i4 = i3;
                                                i5 = i10;
                                                i6 = i11;
                                                f = f4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        or orVar3 = this.g[i4];
                        orVar3.a.d = -1;
                        orVar3.x(this.n.d[i5]);
                        lqa lqaVar2 = orVar3.a;
                        lqaVar2.d = i4;
                        lqaVar2.q(this, orVar3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.k / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    public static yi6 x() {
        return null;
    }

    private void z() {
        int i = this.e * 2;
        this.e = i;
        this.g = (or[]) Arrays.copyOf(this.g, i);
        kl0 kl0Var = this.n;
        kl0Var.d = (lqa[]) Arrays.copyOf(kl0Var.d, this.e);
        int i2 = this.e;
        this.j = new boolean[i2];
        this.f = i2;
        this.m = i2;
    }

    public void A() throws Exception {
        if (this.d.isEmpty()) {
            n();
        } else if (!this.h && !this.i) {
            B(this.d);
        } else {
            for (int i = 0; i < this.l; i++) {
                if (!this.g[i].f) {
                    B(this.d);
                    return;
                }
            }
            n();
        }
    }

    void B(a aVar) throws Exception {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        kl0 kl0Var;
        int i = 0;
        while (true) {
            kl0Var = this.n;
            lqa[] lqaVarArr = kl0Var.d;
            if (i >= lqaVarArr.length) {
                break;
            }
            lqa lqaVar = lqaVarArr[i];
            if (lqaVar != null) {
                lqaVar.k();
            }
            i++;
        }
        kl0Var.c.c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap<String, lqa> hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.b = 0;
        this.d.clear();
        this.k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            or orVar = this.g[i2];
            if (orVar != null) {
                orVar.c = false;
            }
        }
        D();
        this.l = 0;
        if (v) {
            this.q = new b(this.n);
        } else {
            this.q = new or(this.n);
        }
    }

    public void b(lr1 lr1Var, lr1 lr1Var2, float f, int i) {
        hr1.b bVar = hr1.b.LEFT;
        lqa q = q(lr1Var.p(bVar));
        hr1.b bVar2 = hr1.b.TOP;
        lqa q2 = q(lr1Var.p(bVar2));
        hr1.b bVar3 = hr1.b.RIGHT;
        lqa q3 = q(lr1Var.p(bVar3));
        hr1.b bVar4 = hr1.b.BOTTOM;
        lqa q4 = q(lr1Var.p(bVar4));
        lqa q5 = q(lr1Var2.p(bVar));
        lqa q6 = q(lr1Var2.p(bVar2));
        lqa q7 = q(lr1Var2.p(bVar3));
        lqa q8 = q(lr1Var2.p(bVar4));
        or r2 = r();
        double d = f;
        double d2 = i;
        r2.q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        d(r2);
        or r3 = r();
        r3.q(q, q3, q5, q7, (float) (Math.cos(d) * d2));
        d(r3);
    }

    public void c(lqa lqaVar, lqa lqaVar2, int i, float f, lqa lqaVar3, lqa lqaVar4, int i2, int i3) {
        or r2 = r();
        r2.h(lqaVar, lqaVar2, i, f, lqaVar3, lqaVar4, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
    }

    public void d(or orVar) {
        lqa v2;
        if (orVar == null) {
            return;
        }
        boolean z = true;
        if (this.l + 1 >= this.m || this.k + 1 >= this.f) {
            z();
        }
        if (!orVar.f) {
            orVar.D(this);
            if (orVar.isEmpty()) {
                return;
            }
            orVar.r();
            if (orVar.f(this)) {
                lqa p = p();
                orVar.a = p;
                int i = this.l;
                l(orVar);
                if (this.l == i + 1) {
                    this.q.c(orVar);
                    C(this.q, true);
                    if (p.d == -1) {
                        if (orVar.a == p && (v2 = orVar.v(p)) != null) {
                            orVar.x(v2);
                        }
                        if (!orVar.f) {
                            orVar.a.q(this, orVar);
                        }
                        if (v) {
                            this.n.a.a(orVar);
                        } else {
                            this.n.b.a(orVar);
                        }
                        this.l--;
                    }
                    if (!orVar.s() || z) {
                        return;
                    }
                }
            }
            z = false;
            if (!orVar.s()) {
                return;
            }
            return;
        }
        l(orVar);
    }

    public or e(lqa lqaVar, lqa lqaVar2, int i, int i2) {
        if (s && i2 == 8 && lqaVar2.g && lqaVar.d == -1) {
            lqaVar.o(this, lqaVar2.f + i);
            return null;
        }
        or r2 = r();
        r2.n(lqaVar, lqaVar2, i);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
        return r2;
    }

    public void f(lqa lqaVar, int i) {
        if (s && lqaVar.d == -1) {
            float f = i;
            lqaVar.o(this, f);
            for (int i2 = 0; i2 < this.b + 1; i2++) {
                lqa lqaVar2 = this.n.d[i2];
                if (lqaVar2 != null && lqaVar2.n && lqaVar2.o == lqaVar.c) {
                    lqaVar2.o(this, lqaVar2.p + f);
                }
            }
            return;
        }
        int i3 = lqaVar.d;
        if (i3 != -1) {
            or orVar = this.g[i3];
            if (orVar.f) {
                orVar.b = i;
                return;
            } else if (orVar.e.f() == 0) {
                orVar.f = true;
                orVar.b = i;
                return;
            } else {
                or r2 = r();
                r2.m(lqaVar, i);
                d(r2);
                return;
            }
        }
        or r3 = r();
        r3.i(lqaVar, i);
        d(r3);
    }

    public void g(lqa lqaVar, lqa lqaVar2, int i, boolean z) {
        or r2 = r();
        lqa t2 = t();
        t2.e = 0;
        r2.o(lqaVar, lqaVar2, t2, i);
        d(r2);
    }

    public void h(lqa lqaVar, lqa lqaVar2, int i, int i2) {
        or r2 = r();
        lqa t2 = t();
        t2.e = 0;
        r2.o(lqaVar, lqaVar2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.e(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void i(lqa lqaVar, lqa lqaVar2, int i, boolean z) {
        or r2 = r();
        lqa t2 = t();
        t2.e = 0;
        r2.p(lqaVar, lqaVar2, t2, i);
        d(r2);
    }

    public void j(lqa lqaVar, lqa lqaVar2, int i, int i2) {
        or r2 = r();
        lqa t2 = t();
        t2.e = 0;
        r2.p(lqaVar, lqaVar2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.e(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void k(lqa lqaVar, lqa lqaVar2, lqa lqaVar3, lqa lqaVar4, float f, int i) {
        or r2 = r();
        r2.k(lqaVar, lqaVar2, lqaVar3, lqaVar4, f);
        if (i != 8) {
            r2.d(this, i);
        }
        d(r2);
    }

    void m(or orVar, int i, int i2) {
        orVar.e(o(i2, null), i);
    }

    public lqa o(int i, String str) {
        if (this.k + 1 >= this.f) {
            z();
        }
        lqa a2 = a(lqa.a.ERROR, str);
        int i2 = this.b + 1;
        this.b = i2;
        this.k++;
        a2.c = i2;
        a2.e = i;
        this.n.d[i2] = a2;
        this.d.a(a2);
        return a2;
    }

    public lqa p() {
        if (this.k + 1 >= this.f) {
            z();
        }
        lqa a2 = a(lqa.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.c = i;
        this.n.d[i] = a2;
        return a2;
    }

    public lqa q(Object obj) {
        lqa lqaVar = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            z();
        }
        if (obj instanceof hr1) {
            hr1 hr1Var = (hr1) obj;
            lqaVar = hr1Var.i();
            if (lqaVar == null) {
                hr1Var.s(this.n);
                lqaVar = hr1Var.i();
            }
            int i = lqaVar.c;
            if (i == -1 || i > this.b || this.n.d[i] == null) {
                if (i != -1) {
                    lqaVar.k();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.k++;
                lqaVar.c = i2;
                lqaVar.j = lqa.a.UNRESTRICTED;
                this.n.d[i2] = lqaVar;
            }
        }
        return lqaVar;
    }

    public or r() {
        or b2;
        if (v) {
            b2 = this.n.a.b();
            if (b2 == null) {
                b2 = new b(this.n);
                y++;
            } else {
                b2.y();
            }
        } else {
            b2 = this.n.b.b();
            if (b2 == null) {
                b2 = new or(this.n);
                x++;
            } else {
                b2.y();
            }
        }
        lqa.h();
        return b2;
    }

    public lqa t() {
        if (this.k + 1 >= this.f) {
            z();
        }
        lqa a2 = a(lqa.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.c = i;
        this.n.d[i] = a2;
        return a2;
    }

    public kl0 w() {
        return this.n;
    }

    public int y(Object obj) {
        lqa i = ((hr1) obj).i();
        if (i != null) {
            return (int) (i.f + 0.5f);
        }
        return 0;
    }

    public void v(yi6 yi6Var) {
    }
}
