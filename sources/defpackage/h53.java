package defpackage;

import defpackage.wi3;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.select.c;
/* compiled from: Document.java */
/* renamed from: h53  reason: default package */
/* loaded from: classes3.dex */
public class h53 extends re3 {
    private static final c q = new c.n0("title");
    private nq1 k;
    private a l;
    private fr7 m;
    private b n;
    private final String o;
    private boolean p;

    /* compiled from: Document.java */
    /* renamed from: h53$a */
    /* loaded from: classes3.dex */
    public static class a implements Cloneable {
        wi3.b d;
        private wi3.c a = wi3.c.base;
        private Charset b = xl2.b;
        private final ThreadLocal<CharsetEncoder> c = new ThreadLocal<>();
        private boolean e = true;
        private boolean f = false;
        private int g = 1;
        private int h = 30;
        private EnumC0345a i = EnumC0345a.html;

        /* compiled from: Document.java */
        /* renamed from: h53$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum EnumC0345a {
            html,
            xml
        }

        public a b(String str) {
            c(Charset.forName(str));
            return this;
        }

        public a c(Charset charset) {
            this.b = charset;
            return this;
        }

        public Charset d() {
            return this.b;
        }

        /* renamed from: e */
        public a clone() {
            try {
                a aVar = (a) super.clone();
                aVar.b(this.b.name());
                aVar.a = wi3.c.valueOf(this.a.name());
                return aVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CharsetEncoder f() {
            CharsetEncoder charsetEncoder = this.c.get();
            if (charsetEncoder == null) {
                return m();
            }
            return charsetEncoder;
        }

        public a g(wi3.c cVar) {
            this.a = cVar;
            return this;
        }

        public wi3.c h() {
            return this.a;
        }

        public int i() {
            return this.g;
        }

        public int j() {
            return this.h;
        }

        public boolean l() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CharsetEncoder m() {
            CharsetEncoder newEncoder = this.b.newEncoder();
            this.c.set(newEncoder);
            this.d = wi3.b.i(newEncoder.charset().name());
            return newEncoder;
        }

        public a n(boolean z) {
            this.e = z;
            return this;
        }

        public boolean o() {
            return this.e;
        }

        public EnumC0345a p() {
            return this.i;
        }

        public a q(EnumC0345a enumC0345a) {
            this.i = enumC0345a;
            return this;
        }
    }

    /* compiled from: Document.java */
    /* renamed from: h53$b */
    /* loaded from: classes3.dex */
    public enum b {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public h53(String str) {
        super(g6b.r("#root", br7.c), str);
        this.l = new a();
        this.n = b.noQuirks;
        this.p = false;
        this.o = str;
        this.m = fr7.b();
    }

    private void c1() {
        if (this.p) {
            a.EnumC0345a p = f1().p();
            if (p == a.EnumC0345a.html) {
                re3 O0 = O0("meta[charset]");
                if (O0 != null) {
                    O0.g0("charset", Y0().displayName());
                } else {
                    d1().b0("meta").g0("charset", Y0().displayName());
                }
                N0("meta[name=charset]").w();
            } else if (p == a.EnumC0345a.xml) {
                kz6 kz6Var = q().get(0);
                if (kz6Var instanceof wbc) {
                    wbc wbcVar = (wbc) kz6Var;
                    if (wbcVar.b0().equals("xml")) {
                        wbcVar.d("encoding", Y0().displayName());
                        if (wbcVar.r("version")) {
                            wbcVar.d("version", "1.0");
                            return;
                        }
                        return;
                    }
                    wbc wbcVar2 = new wbc("xml", false);
                    wbcVar2.d("version", "1.0");
                    wbcVar2.d("encoding", Y0().displayName());
                    G0(wbcVar2);
                    return;
                }
                wbc wbcVar3 = new wbc("xml", false);
                wbcVar3.d("version", "1.0");
                wbcVar3.d("encoding", Y0().displayName());
                G0(wbcVar3);
            }
        }
    }

    private re3 e1() {
        for (re3 re3Var : j0()) {
            if (re3Var.C0().equals("html")) {
                return re3Var;
            }
        }
        return b0("html");
    }

    @Override // defpackage.kz6
    public String A() {
        return super.u0();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.re3 X0() {
        /*
            r5 = this;
            re3 r0 = r5.e1()
            java.util.List r1 = r0.j0()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "body"
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            re3 r2 = (defpackage.re3) r2
            java.lang.String r4 = r2.C0()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L30
            java.lang.String r3 = "frameset"
            java.lang.String r4 = r2.C0()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc
        L30:
            return r2
        L31:
            re3 r0 = r0.b0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h53.X0():re3");
    }

    public Charset Y0() {
        return this.l.d();
    }

    public void Z0(Charset charset) {
        l1(true);
        this.l.c(charset);
        c1();
    }

    @Override // defpackage.re3, defpackage.kz6
    /* renamed from: a1 */
    public h53 m() {
        h53 h53Var = (h53) super.m();
        h53Var.l = this.l.clone();
        return h53Var;
    }

    public h53 b1(nq1 nq1Var) {
        vvb.j(nq1Var);
        this.k = nq1Var;
        return this;
    }

    public re3 d1() {
        re3 e1 = e1();
        for (re3 re3Var : e1.j0()) {
            if (re3Var.C0().equals("head")) {
                return re3Var;
            }
        }
        return e1.H0("head");
    }

    public a f1() {
        return this.l;
    }

    public h53 g1(fr7 fr7Var) {
        this.m = fr7Var;
        return this;
    }

    public fr7 h1() {
        return this.m;
    }

    public b i1() {
        return this.n;
    }

    public h53 j1(b bVar) {
        this.n = bVar;
        return this;
    }

    public h53 k1() {
        h53 h53Var = new h53(g());
        hz hzVar = this.g;
        if (hzVar != null) {
            h53Var.g = hzVar.clone();
        }
        h53Var.l = this.l.clone();
        return h53Var;
    }

    public void l1(boolean z) {
        this.p = z;
    }

    @Override // defpackage.re3, defpackage.kz6
    public String y() {
        return "#document";
    }
}
