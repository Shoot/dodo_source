package defpackage;

import ch.qos.logback.core.joran.action.Action;
import defpackage.h53;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.select.Selector;
import org.jsoup.select.e;
/* compiled from: Element.java */
/* renamed from: re3  reason: default package */
/* loaded from: classes3.dex */
public class re3 extends kz6 {
    private static final List<re3> h = Collections.emptyList();
    private static final Pattern i = Pattern.compile("\\s+");
    private static final String j = hz.P("baseUri");
    private g6b d;
    private WeakReference<List<re3>> e;
    List<kz6> f;
    hz g;

    /* compiled from: Element.java */
    /* renamed from: re3$a */
    /* loaded from: classes3.dex */
    class a implements wz6 {
        final /* synthetic */ StringBuilder a;

        a(StringBuilder sb) {
            this.a = sb;
        }

        @Override // defpackage.wz6
        public void a(kz6 kz6Var, int i) {
            if (kz6Var instanceof fcb) {
                re3.d0(this.a, (fcb) kz6Var);
            } else if (kz6Var instanceof re3) {
                re3 re3Var = (re3) kz6Var;
                if (this.a.length() > 0) {
                    if ((re3Var.y0() || re3Var.d.m().equals("br")) && !fcb.c0(this.a)) {
                        this.a.append(' ');
                    }
                }
            }
        }

        @Override // defpackage.wz6
        public void b(kz6 kz6Var, int i) {
            if ((kz6Var instanceof re3) && ((re3) kz6Var).y0() && (kz6Var.w() instanceof fcb) && !fcb.c0(this.a)) {
                this.a.append(' ');
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Element.java */
    /* renamed from: re3$b */
    /* loaded from: classes3.dex */
    public static final class b extends jv0<kz6> {
        private final re3 a;

        b(re3 re3Var, int i) {
            super(i);
            this.a = re3Var;
        }

        @Override // defpackage.jv0
        public void d() {
            this.a.z();
        }
    }

    public re3(g6b g6bVar, String str, hz hzVar) {
        vvb.j(g6bVar);
        this.f = kz6.c;
        this.g = hzVar;
        this.d = g6bVar;
        if (str != null) {
            Q(str);
        }
    }

    private boolean A0(h53.a aVar) {
        if (R0().h() && ((G() == null || G().y0()) && I() != null && !aVar.l())) {
            return true;
        }
        return false;
    }

    private void E0(StringBuilder sb) {
        for (int i2 = 0; i2 < j(); i2++) {
            kz6 kz6Var = this.f.get(i2);
            if (kz6Var instanceof fcb) {
                d0(sb, (fcb) kz6Var);
            } else if (kz6Var instanceof re3) {
                e0((re3) kz6Var, sb);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean J0(kz6 kz6Var) {
        if (kz6Var instanceof re3) {
            re3 re3Var = (re3) kz6Var;
            int i2 = 0;
            while (!re3Var.d.n()) {
                re3Var = re3Var.G();
                i2++;
                if (i2 < 6) {
                    if (re3Var == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static String M0(re3 re3Var, String str) {
        while (re3Var != null) {
            hz hzVar = re3Var.g;
            if (hzVar != null && hzVar.F(str)) {
                return re3Var.g.C(str);
            }
            re3Var = re3Var.G();
        }
        return "";
    }

    private static void c0(re3 re3Var, StringBuilder sb) {
        if (re3Var.d.m().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d0(StringBuilder sb, fcb fcbVar) {
        String a0 = fcbVar.a0();
        if (!J0(fcbVar.a) && !(fcbVar instanceof xk0)) {
            wza.a(sb, a0, fcb.c0(sb));
        } else {
            sb.append(a0);
        }
    }

    private static void e0(re3 re3Var, StringBuilder sb) {
        if (re3Var.d.m().equals("br") && !fcb.c0(sb)) {
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f0(kz6 kz6Var, StringBuilder sb) {
        if (kz6Var instanceof fcb) {
            sb.append(((fcb) kz6Var).a0());
        } else if (kz6Var instanceof re3) {
            c0((re3) kz6Var, sb);
        }
    }

    private static <E extends re3> int w0(re3 re3Var, List<E> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == re3Var) {
                return i2;
            }
        }
        return 0;
    }

    private boolean z0(h53.a aVar) {
        if (!this.d.c() && ((G() == null || !G().R0().c()) && !aVar.l())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kz6
    void C(Appendable appendable, int i2, h53.a aVar) throws IOException {
        if (P0(aVar)) {
            if (appendable instanceof StringBuilder) {
                if (((StringBuilder) appendable).length() > 0) {
                    v(appendable, i2, aVar);
                }
            } else {
                v(appendable, i2, aVar);
            }
        }
        appendable.append('<').append(S0());
        hz hzVar = this.g;
        if (hzVar != null) {
            hzVar.I(appendable, aVar);
        }
        if (this.f.isEmpty() && this.d.l()) {
            if (aVar.p() == h53.a.EnumC0345a.html && this.d.f()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    public String C0() {
        return this.d.m();
    }

    @Override // defpackage.kz6
    void D(Appendable appendable, int i2, h53.a aVar) throws IOException {
        if (!this.f.isEmpty() || !this.d.l()) {
            if (aVar.o() && !this.f.isEmpty() && (this.d.c() || (aVar.l() && (this.f.size() > 1 || (this.f.size() == 1 && (this.f.get(0) instanceof re3)))))) {
                v(appendable, i2, aVar);
            }
            appendable.append("</").append(S0()).append('>');
        }
    }

    public String D0() {
        StringBuilder b2 = wza.b();
        E0(b2);
        return wza.o(b2).trim();
    }

    @Override // defpackage.kz6
    /* renamed from: F0 */
    public final re3 G() {
        return (re3) this.a;
    }

    public re3 G0(kz6 kz6Var) {
        vvb.j(kz6Var);
        c(0, kz6Var);
        return this;
    }

    public re3 H0(String str) {
        re3 re3Var = new re3(g6b.r(str, uz6.b(this).g()), g());
        G0(re3Var);
        return re3Var;
    }

    public re3 K0() {
        List<re3> j0;
        int w0;
        if (this.a == null || (w0 = w0(this, (j0 = G().j0()))) <= 0) {
            return null;
        }
        return j0.get(w0 - 1);
    }

    @Override // defpackage.kz6
    /* renamed from: L0 */
    public re3 P() {
        return (re3) super.P();
    }

    public se3 N0(String str) {
        return Selector.a(str, this);
    }

    public re3 O0(String str) {
        return Selector.c(str, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P0(h53.a aVar) {
        if (aVar.o() && z0(aVar) && !A0(aVar)) {
            return true;
        }
        return false;
    }

    public se3 Q0() {
        if (this.a == null) {
            return new se3(0);
        }
        List<re3> j0 = G().j0();
        se3 se3Var = new se3(j0.size() - 1);
        for (re3 re3Var : j0) {
            if (re3Var != this) {
                se3Var.add(re3Var);
            }
        }
        return se3Var;
    }

    public g6b R0() {
        return this.d;
    }

    public String S0() {
        return this.d.d();
    }

    public String T0() {
        StringBuilder b2 = wza.b();
        e.b(new a(b2), this);
        return wza.o(b2).trim();
    }

    public List<fcb> U0() {
        ArrayList arrayList = new ArrayList();
        for (kz6 kz6Var : this.f) {
            if (kz6Var instanceof fcb) {
                arrayList.add((fcb) kz6Var);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String V0() {
        StringBuilder b2 = wza.b();
        int j2 = j();
        for (int i2 = 0; i2 < j2; i2++) {
            f0(this.f.get(i2), b2);
        }
        return wza.o(b2);
    }

    public String W0() {
        final StringBuilder b2 = wza.b();
        e.b(new wz6() { // from class: qe3
            @Override // defpackage.wz6
            public final void a(kz6 kz6Var, int i2) {
                re3.f0(kz6Var, b2);
            }

            @Override // defpackage.wz6
            public /* synthetic */ void b(kz6 kz6Var, int i2) {
                vz6.a(this, kz6Var, i2);
            }
        }, this);
        return wza.o(b2);
    }

    public re3 Z(kz6 kz6Var) {
        vvb.j(kz6Var);
        M(kz6Var);
        q();
        this.f.add(kz6Var);
        kz6Var.S(this.f.size() - 1);
        return this;
    }

    public re3 a0(Collection<? extends kz6> collection) {
        x0(-1, collection);
        return this;
    }

    public re3 b0(String str) {
        re3 re3Var = new re3(g6b.r(str, uz6.b(this).g()), g());
        Z(re3Var);
        return re3Var;
    }

    @Override // defpackage.kz6
    public hz f() {
        if (this.g == null) {
            this.g = new hz();
        }
        return this.g;
    }

    @Override // defpackage.kz6
    public String g() {
        return M0(this, j);
    }

    public re3 g0(String str, String str2) {
        super.d(str, str2);
        return this;
    }

    public re3 h0(kz6 kz6Var) {
        return (re3) super.h(kz6Var);
    }

    public re3 i0(int i2) {
        return j0().get(i2);
    }

    @Override // defpackage.kz6
    public int j() {
        return this.f.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<re3> j0() {
        List<re3> list;
        if (j() == 0) {
            return h;
        }
        WeakReference<List<re3>> weakReference = this.e;
        if (weakReference == null || (list = weakReference.get()) == null) {
            int size = this.f.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                kz6 kz6Var = this.f.get(i2);
                if (kz6Var instanceof re3) {
                    arrayList.add((re3) kz6Var);
                }
            }
            this.e = new WeakReference<>(arrayList);
            return arrayList;
        }
        return list;
    }

    public se3 k0() {
        return new se3(j0());
    }

    @Override // defpackage.kz6
    /* renamed from: l0 */
    public re3 m() {
        return (re3) super.clone();
    }

    public String m0() {
        StringBuilder b2 = wza.b();
        for (kz6 kz6Var : this.f) {
            if (kz6Var instanceof al2) {
                b2.append(((al2) kz6Var).a0());
            } else if (kz6Var instanceof kj1) {
                b2.append(((kj1) kz6Var).b0());
            } else if (kz6Var instanceof re3) {
                b2.append(((re3) kz6Var).m0());
            } else if (kz6Var instanceof xk0) {
                b2.append(((xk0) kz6Var).a0());
            }
        }
        return wza.o(b2);
    }

    @Override // defpackage.kz6
    protected void o(String str) {
        f().U(j, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kz6
    /* renamed from: o0 */
    public re3 n(kz6 kz6Var) {
        hz hzVar;
        re3 re3Var = (re3) super.n(kz6Var);
        hz hzVar2 = this.g;
        if (hzVar2 != null) {
            hzVar = hzVar2.clone();
        } else {
            hzVar = null;
        }
        re3Var.g = hzVar;
        b bVar = new b(re3Var, this.f.size());
        re3Var.f = bVar;
        bVar.addAll(this.f);
        return re3Var;
    }

    public int p0() {
        if (G() == null) {
            return 0;
        }
        return w0(this, G().j0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kz6
    public List<kz6> q() {
        if (this.f == kz6.c) {
            this.f = new b(this, 4);
        }
        return this.f;
    }

    @Override // defpackage.kz6
    /* renamed from: r0 */
    public re3 p() {
        this.f.clear();
        return this;
    }

    @Override // defpackage.kz6
    protected boolean s() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public boolean s0(String str) {
        hz hzVar = this.g;
        if (hzVar == null) {
            return false;
        }
        String D = hzVar.D(Action.CLASS_ATTRIBUTE);
        int length = D.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(D);
            }
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isWhitespace(D.charAt(i3))) {
                    if (!z) {
                        continue;
                    } else if (i3 - i2 == length2 && D.regionMatches(true, i2, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i2 = i3;
                    z = true;
                }
            }
            if (z && length - i2 == length2) {
                return D.regionMatches(true, i2, str, 0, length2);
            }
        }
        return false;
    }

    public <T extends Appendable> T t0(T t) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.get(i2).B(t);
        }
        return t;
    }

    public String u0() {
        StringBuilder b2 = wza.b();
        t0(b2);
        String o = wza.o(b2);
        if (uz6.a(this).o()) {
            return o.trim();
        }
        return o;
    }

    public String v0() {
        hz hzVar = this.g;
        if (hzVar != null) {
            return hzVar.D("id");
        }
        return "";
    }

    public re3 x0(int i2, Collection<? extends kz6> collection) {
        boolean z;
        vvb.k(collection, "Children collection to be inserted must not be null.");
        int j2 = j();
        if (i2 < 0) {
            i2 += j2 + 1;
        }
        if (i2 >= 0 && i2 <= j2) {
            z = true;
        } else {
            z = false;
        }
        vvb.e(z, "Insert position out of bounds.");
        c(i2, (kz6[]) new ArrayList(collection).toArray(new kz6[0]));
        return this;
    }

    @Override // defpackage.kz6
    public String y() {
        return this.d.d();
    }

    public boolean y0() {
        return this.d.e();
    }

    @Override // defpackage.kz6
    void z() {
        super.z();
        this.e = null;
    }

    public re3(g6b g6bVar, String str) {
        this(g6bVar, str, null);
    }
}
