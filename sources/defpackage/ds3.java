package defpackage;
/* compiled from: FencedCodeBlockParser.java */
/* renamed from: ds3  reason: default package */
/* loaded from: classes3.dex */
public class ds3 extends x0 {
    private final cs3 a;
    private String b;
    private StringBuilder c;

    /* compiled from: FencedCodeBlockParser.java */
    /* renamed from: ds3$a */
    /* loaded from: classes3.dex */
    public static class a extends y0 {
        @Override // defpackage.ed0
        public jd0 a(ir7 ir7Var, u96 u96Var) {
            int d = ir7Var.d();
            if (d >= jr7.a) {
                return jd0.c();
            }
            int e = ir7Var.e();
            ds3 k = ds3.k(ir7Var.b(), e, d);
            if (k != null) {
                return jd0.d(k).b(e + k.a.p());
            }
            return jd0.c();
        }
    }

    public ds3(char c, int i, int i2) {
        cs3 cs3Var = new cs3();
        this.a = cs3Var;
        this.c = new StringBuilder();
        cs3Var.s(c);
        cs3Var.u(i);
        cs3Var.t(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ds3 k(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (charAt != '`') {
                if (charAt != '~') {
                    break;
                }
                i4++;
            } else {
                i3++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (jr7.b('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new ds3('`', i3, i2);
        } else if (i4 < 3 || i3 != 0) {
            return null;
        } else {
            return new ds3('~', i4, i2);
        }
    }

    private boolean l(CharSequence charSequence, int i) {
        char n = this.a.n();
        int p = this.a.p();
        int k = jr7.k(n, charSequence, i, charSequence.length()) - i;
        if (k < p || jr7.m(charSequence, i + k, charSequence.length()) != charSequence.length()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.x0, defpackage.dd0
    public void f(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        this.c.append(charSequence);
        this.c.append('\n');
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        int e = ir7Var.e();
        int index = ir7Var.getIndex();
        CharSequence b = ir7Var.b();
        if (ir7Var.d() < jr7.a && l(b, e)) {
            return ad0.c();
        }
        int length = b.length();
        for (int o = this.a.o(); o > 0 && index < length && b.charAt(index) == ' '; o--) {
            index++;
        }
        return ad0.b(index);
    }

    @Override // defpackage.x0, defpackage.dd0
    public void h() {
        this.a.v(mk3.e(this.b.trim()));
        this.a.w(this.c.toString());
    }
}
