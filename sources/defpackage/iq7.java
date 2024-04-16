package defpackage;

import java.util.List;
/* compiled from: ParagraphParser.java */
/* renamed from: iq7  reason: default package */
/* loaded from: classes3.dex */
public class iq7 extends x0 {
    private final aq7 a = new aq7();
    private lq5 b = new lq5();

    @Override // defpackage.x0, defpackage.dd0
    public void b(e35 e35Var) {
        CharSequence d = this.b.d();
        if (d.length() > 0) {
            e35Var.a(d.toString(), this.a);
        }
    }

    @Override // defpackage.x0, defpackage.dd0
    public boolean c() {
        return true;
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.x0, defpackage.dd0
    public void f(CharSequence charSequence) {
        this.b.f(charSequence);
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        if (!ir7Var.a()) {
            return ad0.b(ir7Var.getIndex());
        }
        return ad0.d();
    }

    @Override // defpackage.x0, defpackage.dd0
    public void h() {
        if (this.b.d().length() == 0) {
            this.a.l();
        }
    }

    public CharSequence i() {
        return this.b.d();
    }

    public List<kq5> j() {
        return this.b.c();
    }
}
