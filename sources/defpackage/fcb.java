package defpackage;

import defpackage.h53;
import java.io.IOException;
/* compiled from: TextNode.java */
/* renamed from: fcb  reason: default package */
/* loaded from: classes3.dex */
public class fcb extends io5 {
    public fcb(String str) {
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c0(StringBuilder sb) {
        if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ') {
            return true;
        }
        return false;
    }

    @Override // defpackage.kz6
    void C(Appendable appendable, int i, h53.a aVar) throws IOException {
        re3 re3Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean o = aVar.o();
        kz6 kz6Var = this.a;
        if (kz6Var instanceof re3) {
            re3Var = (re3) kz6Var;
        } else {
            re3Var = null;
        }
        boolean z5 = true;
        if (o && !re3.J0(kz6Var)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((this.b == 0 && re3Var != null && re3Var.R0().e()) || (this.a instanceof h53)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = (w() == null && re3Var != null && re3Var.R0().e()) ? false : false;
            kz6 w = w();
            if ((((w instanceof re3) && ((re3) w).P0(aVar)) || ((w instanceof fcb) && ((fcb) w).b0())) && b0()) {
                return;
            }
            if ((this.b == 0 && re3Var != null && re3Var.R0().c() && !b0()) || (aVar.l() && U().size() > 0 && !b0())) {
                v(appendable, i, aVar);
            }
            z2 = z4;
            z3 = z5;
        } else {
            z2 = false;
            z3 = false;
        }
        wi3.e(appendable, V(), aVar, false, z, z2, z3);
    }

    @Override // defpackage.kz6
    /* renamed from: Z */
    public fcb m() {
        return (fcb) super.clone();
    }

    public String a0() {
        return V();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String b(String str) {
        return super.b(str);
    }

    public boolean b0() {
        return wza.g(V());
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String e(String str) {
        return super.e(str);
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String g() {
        return super.g();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ kz6 p() {
        return super.p();
    }

    @Override // defpackage.kz6
    public String toString() {
        return A();
    }

    @Override // defpackage.kz6
    public String y() {
        return "#text";
    }

    @Override // defpackage.kz6
    void D(Appendable appendable, int i, h53.a aVar) {
    }
}
