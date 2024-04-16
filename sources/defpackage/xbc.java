package defpackage;

import defpackage.h53;
import defpackage.kib;
import defpackage.wi3;
import java.io.Reader;
/* compiled from: XmlTreeBuilder.java */
/* renamed from: xbc  reason: default package */
/* loaded from: classes3.dex */
public class xbc extends pmb {

    /* compiled from: XmlTreeBuilder.java */
    /* renamed from: xbc$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kib.j.values().length];
            a = iArr;
            try {
                iArr[kib.j.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kib.j.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kib.j.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[kib.j.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[kib.j.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[kib.j.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.pmb
    public br7 c() {
        return br7.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pmb
    public void e(Reader reader, String str, fr7 fr7Var) {
        super.e(reader, str, fr7Var);
        this.e.add(this.d);
        this.d.f1().q(h53.a.EnumC0345a.xml).g(wi3.c.xhtml).n(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pmb
    public boolean i(kib kibVar) {
        switch (a.a[kibVar.a.ordinal()]) {
            case 1:
                p(kibVar.e());
                return true;
            case 2:
                u(kibVar.d());
                return true;
            case 3:
                r(kibVar.b());
                return true;
            case 4:
                q(kibVar.a());
                return true;
            case 5:
                s(kibVar.c());
                return true;
            case 6:
                return true;
            default:
                vvb.a("Unexpected token type: " + kibVar.a);
                return true;
        }
    }

    re3 p(kib.h hVar) {
        g6b n = n(hVar.H(), this.h);
        if (hVar.E()) {
            hVar.n.B(this.h);
        }
        re3 re3Var = new re3(n, null, this.h.c(hVar.n));
        t(re3Var, hVar);
        if (hVar.F()) {
            if (!n.i()) {
                n.p();
            }
        } else {
            this.e.add(re3Var);
        }
        return re3Var;
    }

    void q(kib.c cVar) {
        kz6 fcbVar;
        String u = cVar.u();
        if (cVar.h()) {
            fcbVar = new xk0(u);
        } else {
            fcbVar = new fcb(u);
        }
        t(fcbVar, cVar);
    }

    void r(kib.d dVar) {
        wbc Z;
        kj1 kj1Var = new kj1(dVar.w());
        if (dVar.f && kj1Var.c0() && (Z = kj1Var.Z()) != null) {
            kj1Var = Z;
        }
        t(kj1Var, dVar);
    }

    void s(kib.e eVar) {
        o53 o53Var = new o53(this.h.d(eVar.t()), eVar.v(), eVar.w());
        o53Var.a0(eVar.u());
        t(o53Var, eVar);
    }

    protected void t(kz6 kz6Var, kib kibVar) {
        a().Z(kz6Var);
        g(kz6Var, kibVar);
    }

    protected void u(kib.g gVar) {
        re3 re3Var;
        String d = this.h.d(gVar.d);
        int size = this.e.size();
        int i = size - 1 >= 256 ? size - 257 : 0;
        int size2 = this.e.size() - 1;
        while (true) {
            if (size2 >= i) {
                re3Var = this.e.get(size2);
                if (re3Var.y().equals(d)) {
                    break;
                }
                size2--;
            } else {
                re3Var = null;
                break;
            }
        }
        if (re3Var == null) {
            return;
        }
        for (int size3 = this.e.size() - 1; size3 >= 0; size3--) {
            re3 re3Var2 = this.e.get(size3);
            this.e.remove(size3);
            if (re3Var2 == re3Var) {
                f(re3Var2, gVar);
                return;
            }
        }
    }
}
