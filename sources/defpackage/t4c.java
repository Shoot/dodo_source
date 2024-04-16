package defpackage;

import defpackage.hr1;
import defpackage.lr1;
/* compiled from: WidgetRun.java */
/* renamed from: t4c  reason: default package */
/* loaded from: classes.dex */
public abstract class t4c implements e03 {
    public int a;
    lr1 b;
    op9 c;
    protected lr1.b d;
    m23 e = new m23(this);
    public int f = 0;
    boolean g = false;
    public i03 h = new i03(this);
    public i03 i = new i03(this);
    protected b j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetRun.java */
    /* renamed from: t4c$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[hr1.b.values().length];
            a = iArr;
            try {
                iArr[hr1.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[hr1.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[hr1.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[hr1.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[hr1.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* renamed from: t4c$b */
    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public t4c(lr1 lr1Var) {
        this.b = lr1Var;
    }

    private void l(int i, int i2) {
        t4c t4cVar;
        float f;
        int i3;
        int i4 = this.a;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        lr1 lr1Var = this.b;
                        t4c t4cVar2 = lr1Var.e;
                        lr1.b bVar = t4cVar2.d;
                        lr1.b bVar2 = lr1.b.MATCH_CONSTRAINT;
                        if (bVar == bVar2 && t4cVar2.a == 3) {
                            gyb gybVar = lr1Var.f;
                            if (gybVar.d == bVar2 && gybVar.a == 3) {
                                return;
                            }
                        }
                        if (i == 0) {
                            t4cVar2 = lr1Var.f;
                        }
                        if (t4cVar2.e.j) {
                            float w = lr1Var.w();
                            if (i == 1) {
                                i3 = (int) ((t4cVar2.e.g / w) + 0.5f);
                            } else {
                                i3 = (int) ((w * t4cVar2.e.g) + 0.5f);
                            }
                            this.e.d(i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                lr1 L = this.b.L();
                if (L != null) {
                    if (i == 0) {
                        t4cVar = L.e;
                    } else {
                        t4cVar = L.f;
                    }
                    m23 m23Var = t4cVar.e;
                    if (m23Var.j) {
                        lr1 lr1Var2 = this.b;
                        if (i == 0) {
                            f = lr1Var2.A;
                        } else {
                            f = lr1Var2.D;
                        }
                        this.e.d(g((int) ((m23Var.g * f) + 0.5f), i));
                        return;
                    }
                    return;
                }
                return;
            }
            this.e.d(Math.min(g(this.e.m, i), i2));
            return;
        }
        this.e.d(g(i2, i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(i03 i03Var, i03 i03Var2, int i) {
        i03Var.l.add(i03Var2);
        i03Var.f = i;
        i03Var2.k.add(i03Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(i03 i03Var, i03 i03Var2, int i, m23 m23Var) {
        i03Var.l.add(i03Var2);
        i03Var.l.add(this.e);
        i03Var.h = i;
        i03Var.i = m23Var;
        i03Var2.k.add(i03Var);
        m23Var.k.add(i03Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            lr1 lr1Var = this.b;
            int i3 = lr1Var.z;
            max = Math.max(lr1Var.y, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            lr1 lr1Var2 = this.b;
            int i4 = lr1Var2.C;
            max = Math.max(lr1Var2.B, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final i03 h(hr1 hr1Var) {
        hr1 hr1Var2 = hr1Var.f;
        if (hr1Var2 == null) {
            return null;
        }
        lr1 lr1Var = hr1Var2.d;
        int i = a.a[hr1Var2.e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return lr1Var.f.i;
                    }
                    return lr1Var.f.k;
                }
                return lr1Var.f.h;
            }
            return lr1Var.e.i;
        }
        return lr1Var.e.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final i03 i(hr1 hr1Var, int i) {
        t4c t4cVar;
        hr1 hr1Var2 = hr1Var.f;
        if (hr1Var2 == null) {
            return null;
        }
        lr1 lr1Var = hr1Var2.d;
        if (i == 0) {
            t4cVar = lr1Var.e;
        } else {
            t4cVar = lr1Var.f;
        }
        int i2 = a.a[hr1Var2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return t4cVar.i;
        }
        return t4cVar.h;
    }

    public long j() {
        m23 m23Var = this.e;
        if (m23Var.j) {
            return m23Var.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(e03 e03Var, hr1 hr1Var, hr1 hr1Var2, int i) {
        float P;
        i03 h = h(hr1Var);
        i03 h2 = h(hr1Var2);
        if (h.j && h2.j) {
            int f = h.g + hr1Var.f();
            int f2 = h2.g - hr1Var2.f();
            int i2 = f2 - f;
            if (!this.e.j && this.d == lr1.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            m23 m23Var = this.e;
            if (!m23Var.j) {
                return;
            }
            if (m23Var.g == i2) {
                this.h.d(f);
                this.i.d(f2);
                return;
            }
            lr1 lr1Var = this.b;
            if (i == 0) {
                P = lr1Var.z();
            } else {
                P = lr1Var.P();
            }
            if (h == h2) {
                f = h.g;
                f2 = h2.g;
                P = 0.5f;
            }
            this.h.d((int) (f + 0.5f + (((f2 - f) - this.e.g) * P)));
            this.i.d(this.h.g + this.e.g);
        }
    }

    @Override // defpackage.e03
    public void a(e03 e03Var) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(e03 e03Var) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(e03 e03Var) {
    }
}
