package defpackage;

import defpackage.hr1;
import defpackage.i03;
import defpackage.lr1;
import defpackage.t4c;
/* compiled from: VerticalWidgetRun.java */
/* renamed from: gyb  reason: default package */
/* loaded from: classes.dex */
public class gyb extends t4c {
    public i03 k;
    m23 l;

    /* compiled from: VerticalWidgetRun.java */
    /* renamed from: gyb$a */
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

    public gyb(lr1 lr1Var) {
        super(lr1Var);
        i03 i03Var = new i03(this);
        this.k = i03Var;
        this.l = null;
        this.h.e = i03.a.TOP;
        this.i.e = i03.a.BOTTOM;
        i03Var.e = i03.a.BASELINE;
        this.f = 1;
    }

    @Override // defpackage.t4c, defpackage.e03
    public void a(e03 e03Var) {
        m23 m23Var;
        float f;
        float w;
        float f2;
        int i;
        lr1 lr1Var;
        int i2 = a.a[this.j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    lr1 lr1Var2 = this.b;
                    n(e03Var, lr1Var2.Q, lr1Var2.S, 1);
                    return;
                }
            } else {
                o(e03Var);
            }
        } else {
            p(e03Var);
        }
        m23 m23Var2 = this.e;
        if (m23Var2.c && !m23Var2.j && this.d == lr1.b.MATCH_CONSTRAINT) {
            lr1 lr1Var3 = this.b;
            int i3 = lr1Var3.w;
            if (i3 != 2) {
                if (i3 == 3 && lr1Var3.e.e.j) {
                    int x = lr1Var3.x();
                    if (x != -1) {
                        if (x != 0) {
                            if (x != 1) {
                                i = 0;
                                this.e.d(i);
                            } else {
                                lr1 lr1Var4 = this.b;
                                f = lr1Var4.e.e.g;
                                w = lr1Var4.w();
                            }
                        } else {
                            f2 = lr1Var.e.e.g * this.b.w();
                            i = (int) (f2 + 0.5f);
                            this.e.d(i);
                        }
                    } else {
                        lr1 lr1Var5 = this.b;
                        f = lr1Var5.e.e.g;
                        w = lr1Var5.w();
                    }
                    f2 = f / w;
                    i = (int) (f2 + 0.5f);
                    this.e.d(i);
                }
            } else {
                lr1 L = lr1Var3.L();
                if (L != null) {
                    if (L.f.e.j) {
                        this.e.d((int) ((m23Var.g * this.b.D) + 0.5f));
                    }
                }
            }
        }
        i03 i03Var = this.h;
        if (i03Var.c) {
            i03 i03Var2 = this.i;
            if (i03Var2.c) {
                if (i03Var.j && i03Var2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == lr1.b.MATCH_CONSTRAINT) {
                    lr1 lr1Var6 = this.b;
                    if (lr1Var6.v == 0 && !lr1Var6.i0()) {
                        int i4 = this.h.l.get(0).g;
                        i03 i03Var3 = this.h;
                        int i5 = i4 + i03Var3.f;
                        int i6 = this.i.l.get(0).g + this.i.f;
                        i03Var3.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == lr1.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                    m23 m23Var3 = this.e;
                    int i8 = m23Var3.m;
                    if (i7 < i8) {
                        m23Var3.d(i7);
                    } else {
                        m23Var3.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    i03 i03Var4 = this.h.l.get(0);
                    i03 i03Var5 = this.i.l.get(0);
                    int i9 = i03Var4.g + this.h.f;
                    int i10 = i03Var5.g + this.i.f;
                    float P = this.b.P();
                    if (i03Var4 == i03Var5) {
                        i9 = i03Var4.g;
                        i10 = i03Var5.g;
                        P = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * P)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void d() {
        lr1 L;
        lr1 L2;
        lr1 lr1Var = this.b;
        if (lr1Var.a) {
            this.e.d(lr1Var.y());
        }
        if (!this.e.j) {
            this.d = this.b.R();
            if (this.b.X()) {
                this.l = new u80(this);
            }
            lr1.b bVar = this.d;
            if (bVar != lr1.b.MATCH_CONSTRAINT) {
                if (bVar == lr1.b.MATCH_PARENT && (L2 = this.b.L()) != null && L2.R() == lr1.b.FIXED) {
                    int y = (L2.y() - this.b.Q.f()) - this.b.S.f();
                    b(this.h, L2.f.h, this.b.Q.f());
                    b(this.i, L2.f.i, -this.b.S.f());
                    this.e.d(y);
                    return;
                } else if (this.d == lr1.b.FIXED) {
                    this.e.d(this.b.y());
                }
            }
        } else if (this.d == lr1.b.MATCH_PARENT && (L = this.b.L()) != null && L.R() == lr1.b.FIXED) {
            b(this.h, L.f.h, this.b.Q.f());
            b(this.i, L.f.i, -this.b.S.f());
            return;
        }
        m23 m23Var = this.e;
        boolean z = m23Var.j;
        if (z) {
            lr1 lr1Var2 = this.b;
            if (lr1Var2.a) {
                hr1[] hr1VarArr = lr1Var2.X;
                hr1 hr1Var = hr1VarArr[2];
                hr1 hr1Var2 = hr1Var.f;
                if (hr1Var2 != null && hr1VarArr[3].f != null) {
                    if (lr1Var2.i0()) {
                        this.h.f = this.b.X[2].f();
                        this.i.f = -this.b.X[3].f();
                    } else {
                        i03 h = h(this.b.X[2]);
                        if (h != null) {
                            b(this.h, h, this.b.X[2].f());
                        }
                        i03 h2 = h(this.b.X[3]);
                        if (h2 != null) {
                            b(this.i, h2, -this.b.X[3].f());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.X()) {
                        b(this.k, this.h, this.b.q());
                        return;
                    }
                    return;
                } else if (hr1Var2 != null) {
                    i03 h3 = h(hr1Var);
                    if (h3 != null) {
                        b(this.h, h3, this.b.X[2].f());
                        b(this.i, this.h, this.e.g);
                        if (this.b.X()) {
                            b(this.k, this.h, this.b.q());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    hr1 hr1Var3 = hr1VarArr[3];
                    if (hr1Var3.f != null) {
                        i03 h4 = h(hr1Var3);
                        if (h4 != null) {
                            b(this.i, h4, -this.b.X[3].f());
                            b(this.h, this.i, -this.e.g);
                        }
                        if (this.b.X()) {
                            b(this.k, this.h, this.b.q());
                            return;
                        }
                        return;
                    }
                    hr1 hr1Var4 = hr1VarArr[4];
                    if (hr1Var4.f != null) {
                        i03 h5 = h(hr1Var4);
                        if (h5 != null) {
                            b(this.k, h5, 0);
                            b(this.h, this.k, -this.b.q());
                            b(this.i, this.h, this.e.g);
                            return;
                        }
                        return;
                    } else if (!(lr1Var2 instanceof co4) && lr1Var2.L() != null && this.b.p(hr1.b.CENTER).f == null) {
                        b(this.h, this.b.L().f.h, this.b.W());
                        b(this.i, this.h, this.e.g);
                        if (this.b.X()) {
                            b(this.k, this.h, this.b.q());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z && this.d == lr1.b.MATCH_CONSTRAINT) {
            lr1 lr1Var3 = this.b;
            int i = lr1Var3.w;
            if (i != 2) {
                if (i == 3 && !lr1Var3.i0()) {
                    lr1 lr1Var4 = this.b;
                    if (lr1Var4.v != 3) {
                        m23 m23Var2 = lr1Var4.e.e;
                        this.e.l.add(m23Var2);
                        m23Var2.k.add(this.e);
                        m23 m23Var3 = this.e;
                        m23Var3.b = true;
                        m23Var3.k.add(this.h);
                        this.e.k.add(this.i);
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
        } else {
            m23Var.b(this);
        }
        lr1 lr1Var5 = this.b;
        hr1[] hr1VarArr2 = lr1Var5.X;
        hr1 hr1Var5 = hr1VarArr2[2];
        hr1 hr1Var6 = hr1Var5.f;
        if (hr1Var6 != null && hr1VarArr2[3].f != null) {
            if (lr1Var5.i0()) {
                this.h.f = this.b.X[2].f();
                this.i.f = -this.b.X[3].f();
            } else {
                i03 h6 = h(this.b.X[2]);
                i03 h7 = h(this.b.X[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = t4c.b.CENTER;
            }
            if (this.b.X()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (hr1Var6 != null) {
            i03 h8 = h(hr1Var5);
            if (h8 != null) {
                b(this.h, h8, this.b.X[2].f());
                c(this.i, this.h, 1, this.e);
                if (this.b.X()) {
                    c(this.k, this.h, 1, this.l);
                }
                lr1.b bVar2 = this.d;
                lr1.b bVar3 = lr1.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.w() > 0.0f) {
                    ap4 ap4Var = this.b.e;
                    if (ap4Var.d == bVar3) {
                        ap4Var.e.k.add(this.e);
                        this.e.l.add(this.b.e.e);
                        this.e.a = this;
                    }
                }
            }
        } else {
            hr1 hr1Var7 = hr1VarArr2[3];
            if (hr1Var7.f != null) {
                i03 h9 = h(hr1Var7);
                if (h9 != null) {
                    b(this.i, h9, -this.b.X[3].f());
                    c(this.h, this.i, -1, this.e);
                    if (this.b.X()) {
                        c(this.k, this.h, 1, this.l);
                    }
                }
            } else {
                hr1 hr1Var8 = hr1VarArr2[4];
                if (hr1Var8.f != null) {
                    i03 h10 = h(hr1Var8);
                    if (h10 != null) {
                        b(this.k, h10, 0);
                        c(this.h, this.k, -1, this.l);
                        c(this.i, this.h, 1, this.e);
                    }
                } else if (!(lr1Var5 instanceof co4) && lr1Var5.L() != null) {
                    b(this.h, this.b.L().f.h, this.b.W());
                    c(this.i, this.h, 1, this.e);
                    if (this.b.X()) {
                        c(this.k, this.h, 1, this.l);
                    }
                    lr1.b bVar4 = this.d;
                    lr1.b bVar5 = lr1.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.w() > 0.0f) {
                        ap4 ap4Var2 = this.b.e;
                        if (ap4Var2.d == bVar5) {
                            ap4Var2.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // defpackage.t4c
    public void e() {
        i03 i03Var = this.h;
        if (i03Var.j) {
            this.b.i1(i03Var.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public boolean m() {
        if (this.d != lr1.b.MATCH_CONSTRAINT || this.b.w == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.u();
    }
}
