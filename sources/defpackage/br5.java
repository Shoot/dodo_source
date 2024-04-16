package defpackage;
/* compiled from: ListItemParser.java */
/* renamed from: br5  reason: default package */
/* loaded from: classes3.dex */
public class br5 extends x0 {
    private final ar5 a = new ar5();
    private int b;
    private boolean c;

    public br5(int i) {
        this.b = i;
    }

    @Override // defpackage.x0, defpackage.dd0
    public boolean a() {
        return true;
    }

    @Override // defpackage.x0, defpackage.dd0
    public boolean d(wc0 wc0Var) {
        if (this.c) {
            wc0 f = this.a.f();
            if (f instanceof vq5) {
                ((vq5) f).o(false);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        boolean z;
        if (ir7Var.a()) {
            if (this.a.c() == null) {
                return ad0.d();
            }
            wc0 e = ir7Var.f().e();
            if (!(e instanceof aq7) && !(e instanceof ar5)) {
                z = false;
            } else {
                z = true;
            }
            this.c = z;
            return ad0.b(ir7Var.e());
        } else if (ir7Var.d() >= this.b) {
            return ad0.a(ir7Var.c() + this.b);
        } else {
            return ad0.d();
        }
    }
}
