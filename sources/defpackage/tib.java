package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import defpackage.kib;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tokeniser.java */
/* renamed from: tib  reason: default package */
/* loaded from: classes3.dex */
public final class tib {
    private static final char[] u;
    static final int[] v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, SyslogConstants.LOG_LOCAL2, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final lw0 a;
    private final ar7 b;
    private String o;
    private String p;
    private int q;
    private uib c = uib.a;
    private kib d = null;
    private boolean e = false;
    private String f = null;
    private final StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    kib.h i = new kib.h();
    kib.g j = new kib.g();
    kib.i k = this.i;
    kib.c l = new kib.c();
    kib.e m = new kib.e();
    kib.d n = new kib.d();
    private int r = -1;
    private final int[] s = new int[1];
    private final int[] t = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Tokeniser.java */
    /* renamed from: tib$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[uib.values().length];
            a = iArr;
            try {
                iArr[uib.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[uib.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        u = cArr;
        Arrays.sort(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public tib(lw0 lw0Var, ar7 ar7Var) {
        this.a = lw0Var;
        this.b = ar7Var;
    }

    private void d(String str, Object... objArr) {
        if (this.b.d()) {
            ar7 ar7Var = this.b;
            lw0 lw0Var = this.a;
            ar7Var.add(new zq7(lw0Var, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(uib uibVar) {
        x(uibVar);
        this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        if (this.p == null) {
            this.p = "</" + this.o;
        }
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e(Character ch2, boolean z) {
        String j;
        int i;
        int i2;
        if (this.a.x()) {
            return null;
        }
        if ((ch2 != null && ch2.charValue() == this.a.v()) || this.a.J(u)) {
            return null;
        }
        int[] iArr = this.s;
        this.a.D();
        if (this.a.E("#")) {
            boolean F = this.a.F("X");
            lw0 lw0Var = this.a;
            if (F) {
                j = lw0Var.k();
            } else {
                j = lw0Var.j();
            }
            if (j.length() == 0) {
                d("numeric reference with no numerals", new Object[0]);
                this.a.S();
                return null;
            }
            this.a.W();
            if (!this.a.E(";")) {
                d("missing semicolon on [&#%s]", j);
            }
            if (F) {
                i = 16;
            } else {
                i = 10;
            }
            try {
                i2 = Integer.valueOf(j, i).intValue();
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            if (i2 != -1 && ((i2 < 55296 || i2 > 57343) && i2 <= 1114111)) {
                if (i2 >= 128) {
                    int[] iArr2 = v;
                    if (i2 < iArr2.length + 128) {
                        d("character [%s] is not a valid unicode code point", Integer.valueOf(i2));
                        i2 = iArr2[i2 - 128];
                    }
                }
                iArr[0] = i2;
            } else {
                d("character [%s] outside of valid range", Integer.valueOf(i2));
                iArr[0] = 65533;
            }
            return iArr;
        }
        String m = this.a.m();
        boolean G = this.a.G(';');
        if (!wi3.f(m) && (!wi3.g(m) || !G)) {
            this.a.S();
            if (G) {
                d("invalid named reference [%s]", m);
            }
            return null;
        } else if (z && (this.a.N() || this.a.L() || this.a.I('=', CoreConstants.DASH_CHAR, '_'))) {
            this.a.S();
            return null;
        } else {
            this.a.W();
            if (!this.a.E(";")) {
                d("missing semicolon on [&%s]", m);
            }
            int d = wi3.d(m, this.t);
            if (d == 1) {
                iArr[0] = this.t[0];
                return iArr;
            } else if (d == 2) {
                return this.t;
            } else {
                vvb.a("Unexpected characters returned for " + m);
                return this.t;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.n.o();
        this.n.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.n.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.m.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kib.i i(boolean z) {
        kib.i o;
        if (z) {
            o = this.i.o();
        } else {
            o = this.j.o();
        }
        this.k = o;
        return o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        kib.p(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(c);
        }
        this.l.r(this.r);
        this.l.g(this.a.Q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(kib kibVar) {
        vvb.b(this.e);
        this.d = kibVar;
        this.e = true;
        kibVar.r(this.q);
        kibVar.g(this.a.Q());
        this.r = -1;
        kib.j jVar = kibVar.a;
        if (jVar == kib.j.StartTag) {
            this.o = ((kib.h) kibVar).d;
            this.p = null;
        } else if (jVar == kib.j.EndTag) {
            kib.g gVar = (kib.g) kibVar;
            if (gVar.E()) {
                u("Attributes incorrectly present on end tag [/%s]", gVar.J());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str) {
        if (this.f == null) {
            this.f = str;
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(str);
        }
        this.l.r(this.r);
        this.l.g(this.a.Q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append((CharSequence) sb);
        }
        this.l.r(this.r);
        this.l.g(this.a.Q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int[] iArr) {
        m(new String(iArr, 0, iArr.length));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        l(this.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        l(this.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.k.C();
        l(this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(uib uibVar) {
        if (this.b.d()) {
            this.b.add(new zq7(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", uibVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(uib uibVar) {
        if (this.b.d()) {
            ar7 ar7Var = this.b;
            lw0 lw0Var = this.a;
            ar7Var.add(new zq7(lw0Var, "Unexpected character '%s' in input state [%s]", Character.valueOf(lw0Var.v()), uibVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(String str, Object... objArr) {
        if (this.b.d()) {
            this.b.add(new zq7(this.a, str, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        if (this.o != null && this.k.H().equalsIgnoreCase(this.o)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kib w() {
        while (!this.e) {
            this.c.E(this, this.a);
        }
        StringBuilder sb = this.g;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            kib.c t = this.l.t(sb2);
            this.f = null;
            return t;
        }
        String str = this.f;
        if (str != null) {
            kib.c t2 = this.l.t(str);
            this.f = null;
            return t2;
        }
        this.e = false;
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(uib uibVar) {
        int i = a.a[uibVar.ordinal()];
        if (i != 1) {
            if (i == 2 && this.r == -1) {
                this.r = this.a.Q();
            }
        } else {
            this.q = this.a.Q();
        }
        this.c = uibVar;
    }
}
