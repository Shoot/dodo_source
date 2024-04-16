package defpackage;
/* compiled from: ListBlockParser.java */
/* renamed from: wq5  reason: default package */
/* loaded from: classes3.dex */
public class wq5 extends x0 {
    private final vq5 a;
    private boolean b;
    private int c;

    /* compiled from: ListBlockParser.java */
    /* renamed from: wq5$a */
    /* loaded from: classes3.dex */
    public static class a extends y0 {
        @Override // defpackage.ed0
        public jd0 a(ir7 ir7Var, u96 u96Var) {
            boolean z;
            dd0 b = u96Var.b();
            if (ir7Var.d() >= jr7.a) {
                return jd0.c();
            }
            int e = ir7Var.e();
            int c = ir7Var.c() + ir7Var.d();
            if (u96Var.a() != null) {
                z = true;
            } else {
                z = false;
            }
            b n = wq5.n(ir7Var.b(), e, c, z);
            if (n == null) {
                return jd0.c();
            }
            int i = n.b;
            br5 br5Var = new br5(i - ir7Var.c());
            if ((b instanceof wq5) && wq5.m((vq5) b.e(), n.a)) {
                return jd0.d(br5Var).a(i);
            }
            wq5 wq5Var = new wq5(n.a);
            n.a.o(true);
            return jd0.d(wq5Var, br5Var).a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBlockParser.java */
    /* renamed from: wq5$b */
    /* loaded from: classes3.dex */
    public static class b {
        final vq5 a;
        final int b;

        b(vq5 vq5Var, int i) {
            this.a = vq5Var;
            this.b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBlockParser.java */
    /* renamed from: wq5$c */
    /* loaded from: classes3.dex */
    public static class c {
        final vq5 a;
        final int b;

        c(vq5 vq5Var, int i) {
            this.a = vq5Var;
            this.b = i;
        }
    }

    public wq5(vq5 vq5Var) {
        this.a = vq5Var;
    }

    private static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    private static boolean l(CharSequence charSequence, int i) {
        char charAt;
        if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\t' || charAt == ' ') {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(vq5 vq5Var, vq5 vq5Var2) {
        if ((vq5Var instanceof th0) && (vq5Var2 instanceof th0)) {
            return k(Character.valueOf(((th0) vq5Var).p()), Character.valueOf(((th0) vq5Var2).p()));
        }
        if ((vq5Var instanceof yl7) && (vq5Var2 instanceof yl7)) {
            return k(Character.valueOf(((yl7) vq5Var).p()), Character.valueOf(((yl7) vq5Var2).p()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b n(CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        c o = o(charSequence, i);
        if (o == null) {
            return null;
        }
        vq5 vq5Var = o.a;
        int i3 = o.b;
        int i4 = i2 + (i3 - i);
        int length = charSequence.length();
        int i5 = i4;
        while (true) {
            if (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt == '\t') {
                    i5 += jr7.a(i5);
                } else if (charAt == ' ') {
                    i5++;
                } else {
                    z2 = true;
                    break;
                }
                i3++;
            } else {
                z2 = false;
                break;
            }
        }
        if (z && (((vq5Var instanceof yl7) && ((yl7) vq5Var).q() != 1) || !z2)) {
            return null;
        }
        if (!z2 || i5 - i4 > jr7.a) {
            i5 = i4 + 1;
        }
        return new b(vq5Var, i5);
    }

    private static c o(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt != '*' && charAt != '+' && charAt != '-') {
            return p(charSequence, i);
        }
        int i2 = i + 1;
        if (l(charSequence, i2)) {
            th0 th0Var = new th0();
            th0Var.q(charAt);
            return new c(th0Var, i2);
        }
        return null;
    }

    private static c p(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = i; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt != ')' && charAt != '.') {
                switch (charAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i2++;
                        if (i2 > 9) {
                            return null;
                        }
                    default:
                        return null;
                }
            } else {
                if (i2 >= 1) {
                    int i4 = i3 + 1;
                    if (l(charSequence, i4)) {
                        String charSequence2 = charSequence.subSequence(i, i3).toString();
                        yl7 yl7Var = new yl7();
                        yl7Var.s(Integer.parseInt(charSequence2));
                        yl7Var.r(charAt);
                        return new c(yl7Var, i4);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.x0, defpackage.dd0
    public boolean a() {
        return true;
    }

    @Override // defpackage.x0, defpackage.dd0
    public boolean d(wc0 wc0Var) {
        if (!(wc0Var instanceof ar5)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.o(false);
            this.b = false;
        }
        return true;
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        if (ir7Var.a()) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return ad0.b(ir7Var.getIndex());
    }
}
