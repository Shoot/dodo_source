package defpackage;

import defpackage.hr1;
import defpackage.i03;
import defpackage.lr1;
import defpackage.t4c;
/* compiled from: HorizontalWidgetRun.java */
/* renamed from: ap4  reason: default package */
/* loaded from: classes.dex */
public class ap4 extends t4c {
    private static int[] k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* renamed from: ap4$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t4c.b.values().length];
            a = iArr;
            try {
                iArr[t4c.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[t4c.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[t4c.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ap4(lr1 lr1Var) {
        super(lr1Var);
        this.h.e = i03.a.LEFT;
        this.i.e = i03.a.RIGHT;
        this.f = 0;
    }

    private void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bd, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // defpackage.t4c, defpackage.e03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.e03 r17) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap4.a(e03):void");
    }

    @Override // defpackage.t4c
    void d() {
        lr1 L;
        lr1 L2;
        lr1 lr1Var = this.b;
        if (lr1Var.a) {
            this.e.d(lr1Var.U());
        }
        if (!this.e.j) {
            lr1.b B = this.b.B();
            this.d = B;
            if (B != lr1.b.MATCH_CONSTRAINT) {
                lr1.b bVar = lr1.b.MATCH_PARENT;
                if (B == bVar && (L2 = this.b.L()) != null && (L2.B() == lr1.b.FIXED || L2.B() == bVar)) {
                    int U = (L2.U() - this.b.P.f()) - this.b.R.f();
                    b(this.h, L2.e.h, this.b.P.f());
                    b(this.i, L2.e.i, -this.b.R.f());
                    this.e.d(U);
                    return;
                } else if (this.d == lr1.b.FIXED) {
                    this.e.d(this.b.U());
                }
            }
        } else {
            lr1.b bVar2 = this.d;
            lr1.b bVar3 = lr1.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (L = this.b.L()) != null && (L.B() == lr1.b.FIXED || L.B() == bVar3)) {
                b(this.h, L.e.h, this.b.P.f());
                b(this.i, L.e.i, -this.b.R.f());
                return;
            }
        }
        m23 m23Var = this.e;
        if (m23Var.j) {
            lr1 lr1Var2 = this.b;
            if (lr1Var2.a) {
                hr1[] hr1VarArr = lr1Var2.X;
                hr1 hr1Var = hr1VarArr[0];
                hr1 hr1Var2 = hr1Var.f;
                if (hr1Var2 != null && hr1VarArr[1].f != null) {
                    if (lr1Var2.g0()) {
                        this.h.f = this.b.X[0].f();
                        this.i.f = -this.b.X[1].f();
                        return;
                    }
                    i03 h = h(this.b.X[0]);
                    if (h != null) {
                        b(this.h, h, this.b.X[0].f());
                    }
                    i03 h2 = h(this.b.X[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.X[1].f());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                } else if (hr1Var2 != null) {
                    i03 h3 = h(hr1Var);
                    if (h3 != null) {
                        b(this.h, h3, this.b.X[0].f());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else {
                    hr1 hr1Var3 = hr1VarArr[1];
                    if (hr1Var3.f != null) {
                        i03 h4 = h(hr1Var3);
                        if (h4 != null) {
                            b(this.i, h4, -this.b.X[1].f());
                            b(this.h, this.i, -this.e.g);
                            return;
                        }
                        return;
                    } else if (!(lr1Var2 instanceof co4) && lr1Var2.L() != null && this.b.p(hr1.b.CENTER).f == null) {
                        b(this.h, this.b.L().e.h, this.b.V());
                        b(this.i, this.h, this.e.g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.d == lr1.b.MATCH_CONSTRAINT) {
            lr1 lr1Var3 = this.b;
            int i = lr1Var3.v;
            if (i != 2) {
                if (i == 3) {
                    if (lr1Var3.w == 3) {
                        this.h.a = this;
                        this.i.a = this;
                        gyb gybVar = lr1Var3.f;
                        gybVar.h.a = this;
                        gybVar.i.a = this;
                        m23Var.a = this;
                        if (lr1Var3.i0()) {
                            this.e.l.add(this.b.f.e);
                            this.b.f.e.k.add(this.e);
                            gyb gybVar2 = this.b.f;
                            gybVar2.e.a = this;
                            this.e.l.add(gybVar2.h);
                            this.e.l.add(this.b.f.i);
                            this.b.f.h.k.add(this.e);
                            this.b.f.i.k.add(this.e);
                        } else if (this.b.g0()) {
                            this.b.f.e.l.add(this.e);
                            this.e.k.add(this.b.f.e);
                        } else {
                            this.b.f.e.l.add(this.e);
                        }
                    } else {
                        m23 m23Var2 = lr1Var3.f.e;
                        m23Var.l.add(m23Var2);
                        m23Var2.k.add(this.e);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                        m23 m23Var3 = this.e;
                        m23Var3.b = true;
                        m23Var3.k.add(this.h);
                        this.e.k.add(this.i);
                        this.h.l.add(this.e);
                        this.i.l.add(this.e);
                    }
                }
            } else {
                lr1 L3 = lr1Var3.L();
                if (L3 != null) {
                    m23 m23Var4 = L3.f.e;
                    this.e.l.add(m23Var4);
                    m23Var4.k.add(this.e);
                    m23 m23Var5 = this.e;
                    m23Var5.b = true;
                    m23Var5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        lr1 lr1Var4 = this.b;
        hr1[] hr1VarArr2 = lr1Var4.X;
        hr1 hr1Var4 = hr1VarArr2[0];
        hr1 hr1Var5 = hr1Var4.f;
        if (hr1Var5 != null && hr1VarArr2[1].f != null) {
            if (lr1Var4.g0()) {
                this.h.f = this.b.X[0].f();
                this.i.f = -this.b.X[1].f();
                return;
            }
            i03 h5 = h(this.b.X[0]);
            i03 h6 = h(this.b.X[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = t4c.b.CENTER;
        } else if (hr1Var5 != null) {
            i03 h7 = h(hr1Var4);
            if (h7 != null) {
                b(this.h, h7, this.b.X[0].f());
                c(this.i, this.h, 1, this.e);
            }
        } else {
            hr1 hr1Var6 = hr1VarArr2[1];
            if (hr1Var6.f != null) {
                i03 h8 = h(hr1Var6);
                if (h8 != null) {
                    b(this.i, h8, -this.b.X[1].f());
                    c(this.h, this.i, -1, this.e);
                }
            } else if (!(lr1Var4 instanceof co4) && lr1Var4.L() != null) {
                b(this.h, this.b.L().e.h, this.b.V());
                c(this.i, this.h, 1, this.e);
            }
        }
    }

    @Override // defpackage.t4c
    public void e() {
        i03 i03Var = this.h;
        if (i03Var.j) {
            this.b.h1(i03Var.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.t4c
    boolean m() {
        if (this.d != lr1.b.MATCH_CONSTRAINT || this.b.v == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.u();
    }
}
