package defpackage;
/* compiled from: EmphasisDelimiterProcessor.java */
/* renamed from: ag3  reason: default package */
/* loaded from: classes3.dex */
public abstract class ag3 implements mu2 {
    private final char a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ag3(char c) {
        this.a = c;
    }

    @Override // defpackage.mu2
    public void a(g9b g9bVar, g9b g9bVar2, int i) {
        jz6 t0bVar;
        String valueOf = String.valueOf(d());
        if (i == 1) {
            t0bVar = new zf3(valueOf);
        } else {
            t0bVar = new t0b(valueOf + valueOf);
        }
        jz6 e = g9bVar.e();
        while (e != null && e != g9bVar2) {
            jz6 e2 = e.e();
            t0bVar.b(e);
            e = e2;
        }
        g9bVar.h(t0bVar);
    }

    @Override // defpackage.mu2
    public char b() {
        return this.a;
    }

    @Override // defpackage.mu2
    public int c() {
        return 1;
    }

    @Override // defpackage.mu2
    public char d() {
        return this.a;
    }

    @Override // defpackage.mu2
    public int e(nu2 nu2Var, nu2 nu2Var2) {
        if ((nu2Var.a() || nu2Var2.c()) && nu2Var2.b() % 3 != 0 && (nu2Var.b() + nu2Var2.b()) % 3 == 0) {
            return 0;
        }
        if (nu2Var.length() >= 2 && nu2Var2.length() >= 2) {
            return 2;
        }
        return 1;
    }
}
