package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: HeadingParser.java */
/* renamed from: ln4  reason: default package */
/* loaded from: classes3.dex */
public class ln4 extends x0 {
    private final kn4 a;
    private final String b;

    /* compiled from: HeadingParser.java */
    /* renamed from: ln4$a */
    /* loaded from: classes3.dex */
    public static class a extends y0 {
        @Override // defpackage.ed0
        public jd0 a(ir7 ir7Var, u96 u96Var) {
            CharSequence a;
            if (ir7Var.d() >= jr7.a) {
                return jd0.c();
            }
            CharSequence b = ir7Var.b();
            int e = ir7Var.e();
            ln4 k = ln4.k(b, e);
            if (k == null) {
                int l = ln4.l(b, e);
                if (l > 0 && (a = u96Var.a()) != null) {
                    return jd0.d(new ln4(l, a.toString())).b(b.length()).e();
                }
                return jd0.c();
            }
            return jd0.d(k).b(b.length());
        }
    }

    public ln4(int i, String str) {
        kn4 kn4Var = new kn4();
        this.a = kn4Var;
        kn4Var.o(i);
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ln4 k(CharSequence charSequence, int i) {
        int k = jr7.k('#', charSequence, i, charSequence.length()) - i;
        if (k == 0 || k > 6) {
            return null;
        }
        int i2 = i + k;
        if (i2 >= charSequence.length()) {
            return new ln4(k, "");
        }
        char charAt = charSequence.charAt(i2);
        if (charAt != ' ' && charAt != '\t') {
            return null;
        }
        int n = jr7.n(charSequence, charSequence.length() - 1, i2);
        int l = jr7.l('#', charSequence, n, i2);
        int n2 = jr7.n(charSequence, l, i2);
        if (n2 != l) {
            return new ln4(k, charSequence.subSequence(i2, n2 + 1).toString());
        }
        return new ln4(k, charSequence.subSequence(i2, n + 1).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt != '-') {
            if (charAt == '=') {
                if (m(charSequence, i + 1, '=')) {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        if (m(charSequence, i + 1, CoreConstants.DASH_CHAR)) {
            return 2;
        }
        return 0;
    }

    private static boolean m(CharSequence charSequence, int i, char c) {
        if (jr7.m(charSequence, jr7.k(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x0, defpackage.dd0
    public void b(e35 e35Var) {
        e35Var.a(this.b, this.a);
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        return ad0.d();
    }
}
