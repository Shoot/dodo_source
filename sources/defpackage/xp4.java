package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.kib;
import defpackage.yp4;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HtmlTreeBuilder.java */
/* renamed from: xp4  reason: default package */
/* loaded from: classes3.dex */
public class xp4 extends pmb {
    static final String[] A = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] B = {"ol", "ul"};
    static final String[] C = {"button"};
    static final String[] D = {"html", "table"};
    static final String[] E = {"optgroup", "option"};
    static final String[] F = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    static final String[] G = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] H = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", ElementGenerator.TEXT_ALIGN_CENTER, "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", ElementGenerator.TYPE_LINK, "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", RemoteMessageConst.MessageBody.PARAM, "plaintext", "pre", "script", "section", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    private yp4 m;
    private yp4 n;
    private boolean o;
    private re3 p;
    private l54 q;
    private re3 r;
    private ArrayList<re3> s;
    private ArrayList<yp4> t;
    private List<String> u;
    private kib.g v;
    private boolean w;
    private boolean x;
    private boolean y;
    private String[] z = {null};

    private void L0(ArrayList<re3> arrayList, re3 re3Var, re3 re3Var2) {
        boolean z;
        int lastIndexOf = arrayList.lastIndexOf(re3Var);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        vvb.d(z);
        arrayList.set(lastIndexOf, re3Var2);
    }

    private boolean S(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.z;
        strArr3[0] = str;
        return T(strArr3, strArr, strArr2);
    }

    private boolean T(String[] strArr, String[] strArr2, String[] strArr3) {
        int i;
        int size = this.e.size();
        int i2 = size - 1;
        if (i2 > 100) {
            i = size - 101;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            String C0 = this.e.get(i2).C0();
            if (wza.d(C0, strArr)) {
                return true;
            }
            if (wza.d(C0, strArr2)) {
                return false;
            }
            if (strArr3 != null && wza.d(C0, strArr3)) {
                return false;
            }
            i2--;
        }
        return false;
    }

    private void X(re3 re3Var, kib kibVar) {
        e0(re3Var, kibVar);
        this.e.add(re3Var);
    }

    private void e0(kz6 kz6Var, kib kibVar) {
        l54 l54Var;
        if (this.e.isEmpty()) {
            this.d.Z(kz6Var);
        } else if (i0() && wza.d(a().C0(), yp4.z.A)) {
            c0(kz6Var);
        } else {
            a().Z(kz6Var);
        }
        if (kz6Var instanceof re3) {
            re3 re3Var = (re3) kz6Var;
            if (re3Var.R0().g() && (l54Var = this.q) != null) {
                l54Var.X0(re3Var);
            }
        }
        g(kz6Var, kibVar);
    }

    private boolean l0(re3 re3Var, re3 re3Var2) {
        if (re3Var.C0().equals(re3Var2.C0()) && re3Var.f().equals(re3Var2.f())) {
            return true;
        }
        return false;
    }

    private void s(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            re3 re3Var = this.e.get(size);
            if (!wza.c(re3Var.C0(), strArr) && !re3Var.C0().equals("html")) {
                this.e.remove(size);
            } else {
                return;
            }
        }
    }

    private static boolean t0(ArrayList<re3> arrayList, re3 re3Var) {
        int i;
        int size = arrayList.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            if (arrayList.get(i2) == re3Var) {
                return true;
            }
            i2--;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int A0(re3 re3Var) {
        for (int i = 0; i < this.s.size(); i++) {
            if (re3Var == this.s.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        D(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B0(kib kibVar, yp4 yp4Var) {
        this.g = kibVar;
        return yp4Var.G(kibVar, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(String str) {
        while (wza.d(a().C0(), F)) {
            if (str == null || !b(str)) {
                v0();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0(re3 re3Var) {
        this.e.add(re3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(boolean z) {
        String[] strArr;
        if (z) {
            strArr = G;
        } else {
            strArr = F;
        }
        while (wza.d(a().C0(), strArr)) {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(re3 re3Var) {
        q(re3Var);
        this.s.add(re3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 E(String str) {
        for (int size = this.s.size() - 1; size >= 0; size--) {
            re3 re3Var = this.s.get(size);
            if (re3Var != null) {
                if (re3Var.C0().equals(str)) {
                    return re3Var;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0(yp4 yp4Var) {
        this.t.add(yp4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String F() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F0(re3 re3Var, int i) {
        q(re3Var);
        try {
            this.s.add(i, re3Var);
        } catch (IndexOutOfBoundsException unused) {
            this.s.add(re3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h53 G() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G0() {
        /*
            r8 = this;
            java.util.ArrayList<re3> r0 = r8.e
            int r0 = r0.size()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto Lb
            return
        Lb:
            re3 r0 = r8.n0()
            if (r0 == 0) goto L6e
            boolean r1 = r8.r0(r0)
            if (r1 == 0) goto L18
            goto L6e
        L18:
            java.util.ArrayList<re3> r1 = r8.s
            int r1 = r1.size()
            int r2 = r1 + (-12)
            r3 = 0
            if (r2 >= 0) goto L24
            r2 = 0
        L24:
            r4 = 1
            int r1 = r1 - r4
            r5 = r1
        L27:
            if (r5 != r2) goto L2a
            goto L3d
        L2a:
            java.util.ArrayList<re3> r0 = r8.s
            int r5 = r5 + (-1)
            java.lang.Object r0 = r0.get(r5)
            re3 r0 = (defpackage.re3) r0
            if (r0 == 0) goto L3c
            boolean r6 = r8.r0(r0)
            if (r6 == 0) goto L27
        L3c:
            r4 = 0
        L3d:
            if (r4 != 0) goto L49
            java.util.ArrayList<re3> r0 = r8.s
            int r5 = r5 + 1
            java.lang.Object r0 = r0.get(r5)
            re3 r0 = (defpackage.re3) r0
        L49:
            defpackage.vvb.j(r0)
            re3 r2 = new re3
            java.lang.String r4 = r0.C0()
            br7 r6 = r8.h
            g6b r4 = r8.n(r4, r6)
            hz r6 = r0.f()
            hz r6 = r6.clone()
            r7 = 0
            r2.<init>(r4, r7, r6)
            r8.W(r2)
            java.util.ArrayList<re3> r4 = r8.s
            r4.set(r5, r2)
            if (r5 != r1) goto L3c
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp4.G0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l54 H() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H0(re3 re3Var) {
        for (int size = this.s.size() - 1; size >= 0; size--) {
            if (this.s.get(size) == re3Var) {
                this.s.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 I(String str) {
        int i;
        int size = this.e.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            re3 re3Var = this.e.get(i2);
            if (re3Var.C0().equals(str)) {
                return re3Var;
            }
            i2--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I0(re3 re3Var) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == re3Var) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 J() {
        return this.p;
    }

    re3 J0() {
        int size = this.s.size();
        if (size > 0) {
            return this.s.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> K() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(re3 re3Var, re3 re3Var2) {
        L0(this.s, re3Var, re3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<re3> L() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M(String str) {
        return P(str, C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M0(re3 re3Var, re3 re3Var2) {
        L0(this.e, re3Var, re3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N(String str) {
        return P(str, B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0() {
        if (!s0("body")) {
            this.e.add(this.d.X0());
        }
        U0(yp4.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O(String str) {
        return P(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O0() {
        int i;
        String str;
        yp4 yp4Var;
        int size = this.e.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        yp4 yp4Var2 = this.m;
        if (this.e.size() == 0) {
            U0(yp4.g);
        }
        boolean z = false;
        while (true) {
            if (i2 >= i) {
                re3 re3Var = this.e.get(i2);
                if (i2 == i) {
                    if (this.y) {
                        re3Var = this.r;
                    }
                    z = true;
                }
                if (re3Var != null) {
                    str = re3Var.C0();
                } else {
                    str = "";
                }
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals("frameset")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1321546630:
                        if (str.equals("template")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -906021636:
                        if (str.equals(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -636197633:
                        if (str.equals("colgroup")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3696:
                        if (str.equals("td")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3700:
                        if (str.equals("th")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3710:
                        if (str.equals("tr")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3029410:
                        if (str.equals("body")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3198432:
                        if (str.equals("head")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 3213227:
                        if (str.equals("html")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 110115790:
                        if (str.equals("table")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            c = 14;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        U0(yp4.t);
                        break;
                    case 1:
                        yp4 x = x();
                        vvb.k(x, "Bug: no template insertion mode on stack!");
                        U0(x);
                        break;
                    case 2:
                        U0(yp4.p);
                        break;
                    case 3:
                        U0(yp4.l);
                        break;
                    case 4:
                    case 5:
                        if (!z) {
                            U0(yp4.o);
                            break;
                        }
                        break;
                    case 6:
                        U0(yp4.n);
                        break;
                    case 7:
                        U0(yp4.g);
                        break;
                    case '\b':
                        if (!z) {
                            U0(yp4.d);
                            break;
                        }
                        break;
                    case '\t':
                        if (this.p == null) {
                            yp4Var = yp4.c;
                        } else {
                            yp4Var = yp4.f;
                        }
                        U0(yp4Var);
                        break;
                    case '\n':
                        U0(yp4.i);
                        break;
                    case 11:
                    case '\f':
                    case '\r':
                        U0(yp4.m);
                        break;
                    case 14:
                        U0(yp4.k);
                        break;
                }
                if (z) {
                    U0(yp4.g);
                } else {
                    i2--;
                }
            }
        }
        if (this.m == yp4Var2) {
            return false;
        }
        return true;
    }

    boolean P(String str, String[] strArr) {
        return S(str, A, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(l54 l54Var) {
        this.q = l54Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q(String[] strArr) {
        return T(strArr, A, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(boolean z) {
        this.x = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String C0 = this.e.get(size).C0();
            if (C0.equals(str)) {
                return true;
            }
            if (!wza.d(C0, E)) {
                return false;
            }
        }
        vvb.a("Should not be reachable");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0(re3 re3Var) {
        this.p = re3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yp4 S0() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int T0() {
        return this.t.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean U(String str) {
        return S(str, D, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(yp4 yp4Var) {
        this.m = yp4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 V(kib.h hVar) {
        if (hVar.E() && !hVar.n.isEmpty() && hVar.n.B(this.h) > 0) {
            d("Dropped duplicate attribute(s) in tag [%s]", hVar.e);
        }
        if (hVar.F()) {
            re3 a0 = a0(hVar);
            this.e.add(a0);
            this.c.x(uib.a);
            this.c.l(this.v.o().G(a0.S0()));
            return a0;
        }
        re3 re3Var = new re3(n(hVar.H(), this.h), null, this.h.c(hVar.n));
        X(re3Var, hVar);
        return re3Var;
    }

    void W(re3 re3Var) {
        e0(re3Var, null);
        this.e.add(re3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(kib.c cVar) {
        kz6 fcbVar;
        re3 a = a();
        String C0 = a.C0();
        String u = cVar.u();
        if (cVar.h()) {
            fcbVar = new xk0(u);
        } else if (h0(C0)) {
            fcbVar = new al2(u);
        } else {
            fcbVar = new fcb(u);
        }
        a.Z(fcbVar);
        g(fcbVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(kib.d dVar) {
        e0(new kj1(dVar.w()), dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 a0(kib.h hVar) {
        g6b n = n(hVar.H(), this.h);
        re3 re3Var = new re3(n, null, this.h.c(hVar.n));
        e0(re3Var, hVar);
        if (hVar.F()) {
            if (n.i()) {
                if (!n.f()) {
                    this.c.u("Tag [%s] cannot be self closing; not a void tag", n.m());
                }
            } else {
                n.p();
            }
        }
        return re3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l54 b0(kib.h hVar, boolean z, boolean z2) {
        l54 l54Var = new l54(n(hVar.H(), this.h), null, this.h.c(hVar.n));
        if (z2) {
            if (!s0("template")) {
                P0(l54Var);
            }
        } else {
            P0(l54Var);
        }
        e0(l54Var, hVar);
        if (z) {
            this.e.add(l54Var);
        }
        return l54Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.pmb
    public br7 c() {
        return br7.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(kz6 kz6Var) {
        re3 re3Var;
        re3 I = I("table");
        boolean z = false;
        if (I != null) {
            if (I.G() != null) {
                re3Var = I.G();
                z = true;
            } else {
                re3Var = p(I);
            }
        } else {
            re3Var = this.e.get(0);
        }
        if (z) {
            vvb.j(I);
            I.h0(kz6Var);
            return;
        }
        re3Var.Z(kz6Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0() {
        this.s.add(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pmb
    public void e(Reader reader, String str, fr7 fr7Var) {
        super.e(reader, str, fr7Var);
        this.m = yp4.a;
        this.n = null;
        this.o = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        this.u = new ArrayList();
        this.v = new kib.g();
        this.w = true;
        this.x = false;
        this.y = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(re3 re3Var, re3 re3Var2) {
        boolean z;
        int lastIndexOf = this.e.lastIndexOf(re3Var);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        vvb.d(z);
        this.e.add(lastIndexOf + 1, re3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 g0(String str) {
        re3 re3Var = new re3(n(str, this.h), null);
        W(re3Var);
        return re3Var;
    }

    protected boolean h0(String str) {
        if (!str.equals("script") && !str.equals("style")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pmb
    public boolean i(kib kibVar) {
        this.g = kibVar;
        return this.m.G(kibVar, this);
    }

    boolean i0() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j0() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k0(re3 re3Var) {
        return t0(this.s, re3Var);
    }

    @Override // defpackage.pmb
    public /* bridge */ /* synthetic */ boolean l(String str, hz hzVar) {
        return super.l(str, hzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m0(re3 re3Var) {
        return wza.d(re3Var.C0(), H);
    }

    re3 n0() {
        if (this.s.size() > 0) {
            ArrayList<re3> arrayList = this.s;
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0() {
        this.n = this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 p(re3 re3Var) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == re3Var) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p0(re3 re3Var) {
        if (this.o) {
            return;
        }
        String b = re3Var.b("href");
        if (b.length() != 0) {
            this.f = b;
            this.o = true;
            this.d.Q(b);
        }
    }

    void q(re3 re3Var) {
        int size = this.s.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            re3 re3Var2 = this.s.get(i3);
            if (re3Var2 != null) {
                if (l0(re3Var, re3Var2)) {
                    i2++;
                }
                if (i2 == 3) {
                    this.s.remove(i3);
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0() {
        this.u = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        while (!this.s.isEmpty() && J0() != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r0(re3 re3Var) {
        return t0(this.e, re3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s0(String str) {
        if (I(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        s("tbody", "tfoot", "thead", "template");
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.m + ", currentElement=" + a() + CoreConstants.CURLY_RIGHT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        s("table", "template");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yp4 u0() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        s("tr", "template");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 v0() {
        return this.e.remove(this.e.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(String str) {
        C(str);
        if (!str.equals(a().C0())) {
            y(S0());
        }
        x0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0(String str) {
        for (int size = this.e.size() - 1; size >= 0 && !this.e.get(size).C0().equals(str); size--) {
            this.e.remove(size);
        }
    }

    yp4 x() {
        if (this.t.size() > 0) {
            ArrayList<yp4> arrayList = this.t;
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public re3 x0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            re3 re3Var = this.e.get(size);
            this.e.remove(size);
            if (re3Var.C0().equals(str)) {
                kib kibVar = this.g;
                if (kibVar instanceof kib.g) {
                    f(re3Var, kibVar);
                }
                return re3Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(yp4 yp4Var) {
        if (this.a.a().d()) {
            this.a.a().add(new zq7(this.b, "Unexpected %s token [%s] when in state [%s]", this.g.s(), this.g, yp4Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y0(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            this.e.remove(size);
            if (wza.d(this.e.get(size).C0(), strArr)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z) {
        this.w = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yp4 z0() {
        if (this.t.size() > 0) {
            ArrayList<yp4> arrayList = this.t;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }
}
