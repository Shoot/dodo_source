package defpackage;
/* compiled from: StrikethroughDelimiterProcessor.java */
/* renamed from: kza  reason: default package */
/* loaded from: classes3.dex */
public class kza implements mu2 {
    @Override // defpackage.mu2
    public void a(g9b g9bVar, g9b g9bVar2, int i) {
        jza jzaVar = new jza();
        jz6 e = g9bVar.e();
        while (e != null && e != g9bVar2) {
            jz6 e2 = e.e();
            jzaVar.b(e);
            e = e2;
        }
        g9bVar.h(jzaVar);
    }

    @Override // defpackage.mu2
    public char b() {
        return '~';
    }

    @Override // defpackage.mu2
    public int c() {
        return 2;
    }

    @Override // defpackage.mu2
    public char d() {
        return '~';
    }

    @Override // defpackage.mu2
    public int e(nu2 nu2Var, nu2 nu2Var2) {
        if (nu2Var.length() >= 2 && nu2Var2.length() >= 2) {
            return 2;
        }
        return 0;
    }
}
