package defpackage;
/* compiled from: BlockQuoteParser.java */
/* renamed from: gd0  reason: default package */
/* loaded from: classes3.dex */
public class gd0 extends x0 {
    private final fd0 a = new fd0();

    /* compiled from: BlockQuoteParser.java */
    /* renamed from: gd0$a */
    /* loaded from: classes3.dex */
    public static class a extends y0 {
        @Override // defpackage.ed0
        public jd0 a(ir7 ir7Var, u96 u96Var) {
            int e = ir7Var.e();
            if (gd0.k(ir7Var, e)) {
                int c = ir7Var.c() + ir7Var.d();
                int i = c + 1;
                if (jr7.i(ir7Var.b(), e + 1)) {
                    i = c + 2;
                }
                return jd0.d(new gd0()).a(i);
            }
            return jd0.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(ir7 ir7Var, int i) {
        CharSequence b = ir7Var.b();
        if (ir7Var.d() < jr7.a && i < b.length() && b.charAt(i) == '>') {
            return true;
        }
        return false;
    }

    @Override // defpackage.x0, defpackage.dd0
    public boolean a() {
        return true;
    }

    @Override // defpackage.x0, defpackage.dd0
    public boolean d(wc0 wc0Var) {
        return true;
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        int e = ir7Var.e();
        if (k(ir7Var, e)) {
            int c = ir7Var.c() + ir7Var.d();
            int i = c + 1;
            if (jr7.i(ir7Var.b(), e + 1)) {
                i = c + 2;
            }
            return ad0.a(i);
        }
        return ad0.d();
    }

    @Override // defpackage.dd0
    /* renamed from: j */
    public fd0 e() {
        return this.a;
    }
}
