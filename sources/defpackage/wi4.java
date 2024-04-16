package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuidelineReference.java */
/* renamed from: wi4  reason: default package */
/* loaded from: classes.dex */
public class wi4 extends t4c {
    public wi4(lr1 lr1Var) {
        super(lr1Var);
        lr1Var.e.f();
        lr1Var.f.f();
        this.f = ((vi4) lr1Var).n1();
    }

    private void q(i03 i03Var) {
        this.h.k.add(i03Var);
        i03Var.l.add(this.h);
    }

    @Override // defpackage.t4c, defpackage.e03
    public void a(e03 e03Var) {
        i03 i03Var = this.h;
        if (!i03Var.c || i03Var.j) {
            return;
        }
        this.h.d((int) ((i03Var.l.get(0).g * ((vi4) this.b).q1()) + 0.5f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void d() {
        vi4 vi4Var = (vi4) this.b;
        int o1 = vi4Var.o1();
        int p1 = vi4Var.p1();
        vi4Var.q1();
        if (vi4Var.n1() == 1) {
            if (o1 != -1) {
                this.h.l.add(this.b.b0.e.h);
                this.b.b0.e.h.k.add(this.h);
                this.h.f = o1;
            } else if (p1 != -1) {
                this.h.l.add(this.b.b0.e.i);
                this.b.b0.e.i.k.add(this.h);
                this.h.f = -p1;
            } else {
                i03 i03Var = this.h;
                i03Var.b = true;
                i03Var.l.add(this.b.b0.e.i);
                this.b.b0.e.i.k.add(this.h);
            }
            q(this.b.e.h);
            q(this.b.e.i);
            return;
        }
        if (o1 != -1) {
            this.h.l.add(this.b.b0.f.h);
            this.b.b0.f.h.k.add(this.h);
            this.h.f = o1;
        } else if (p1 != -1) {
            this.h.l.add(this.b.b0.f.i);
            this.b.b0.f.i.k.add(this.h);
            this.h.f = -p1;
        } else {
            i03 i03Var2 = this.h;
            i03Var2.b = true;
            i03Var2.l.add(this.b.b0.f.i);
            this.b.b0.f.i.k.add(this.h);
        }
        q(this.b.f.h);
        q(this.b.f.i);
    }

    @Override // defpackage.t4c
    public void e() {
        if (((vi4) this.b).n1() == 1) {
            this.b.h1(this.h.g);
        } else {
            this.b.i1(this.h.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void f() {
        this.h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public boolean m() {
        return false;
    }
}
