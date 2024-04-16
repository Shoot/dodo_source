package defpackage;

import defpackage.bn2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateTimeParseContext.java */
/* renamed from: cn2  reason: default package */
/* loaded from: classes3.dex */
public final class cn2 {
    private Locale a;
    private oo2 b;
    private p71 c;
    private vcc d;
    private boolean e;
    private boolean f;
    private final ArrayList<b> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeParseContext.java */
    /* renamed from: cn2$b */
    /* loaded from: classes3.dex */
    public final class b extends lq2 {
        p71 a;
        vcc b;
        final Map<u8b, Long> c;
        boolean d;
        cy7 e;
        List<Object[]> f;

        @Override // defpackage.q8b
        public boolean G(u8b u8bVar) {
            return this.c.containsKey(u8bVar);
        }

        @Override // defpackage.lq2, defpackage.q8b
        public <R> R M(w8b<R> w8bVar) {
            if (w8bVar == v8b.a()) {
                return (R) this.a;
            }
            if (w8bVar != v8b.g() && w8bVar != v8b.f()) {
                return (R) super.M(w8bVar);
            }
            return (R) this.b;
        }

        protected b N() {
            b bVar = new b();
            bVar.a = this.a;
            bVar.b = this.b;
            bVar.c.putAll(this.c);
            bVar.d = this.d;
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public zm2 P() {
            zm2 zm2Var = new zm2();
            zm2Var.a.putAll(this.c);
            zm2Var.b = cn2.this.h();
            vcc vccVar = this.b;
            if (vccVar != null) {
                zm2Var.c = vccVar;
            } else {
                zm2Var.c = cn2.this.d;
            }
            zm2Var.f = this.d;
            zm2Var.g = this.e;
            return zm2Var;
        }

        @Override // defpackage.q8b
        public long q(u8b u8bVar) {
            if (this.c.containsKey(u8bVar)) {
                return this.c.get(u8bVar).longValue();
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }

        public String toString() {
            return this.c.toString() + "," + this.a + "," + this.b;
        }

        @Override // defpackage.lq2, defpackage.q8b
        public int w(u8b u8bVar) {
            if (this.c.containsKey(u8bVar)) {
                return g95.p(this.c.get(u8bVar).longValue());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
        }

        private b() {
            this.a = null;
            this.b = null;
            this.c = new HashMap();
            this.e = cy7.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn2(an2 an2Var) {
        this.e = true;
        this.f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.a = an2Var.f();
        this.b = an2Var.e();
        this.c = an2Var.d();
        this.d = an2Var.g();
        arrayList.add(new b());
    }

    static boolean d(char c, char c2) {
        if (c != c2 && Character.toUpperCase(c) != Character.toUpperCase(c2) && Character.toLowerCase(c) != Character.toLowerCase(c2)) {
            return false;
        }
        return true;
    }

    private b f() {
        ArrayList<b> arrayList = this.g;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(bn2.n nVar, long j, int i, int i2) {
        b f = f();
        if (f.f == null) {
            f.f = new ArrayList(2);
        }
        f.f.add(new Object[]{nVar, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(char c, char c2) {
        if (l()) {
            if (c == c2) {
                return true;
            }
            return false;
        }
        return d(c, c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn2 e() {
        return new cn2(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z) {
        if (z) {
            ArrayList<b> arrayList = this.g;
            arrayList.remove(arrayList.size() - 2);
            return;
        }
        ArrayList<b> arrayList2 = this.g;
        arrayList2.remove(arrayList2.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p71 h() {
        p71 p71Var = f().a;
        if (p71Var == null) {
            p71 p71Var2 = this.c;
            if (p71Var2 == null) {
                return t75.e;
            }
            return p71Var2;
        }
        return p71Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale i() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long j(u8b u8bVar) {
        return f().c.get(u8bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public oo2 k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z) {
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(vcc vccVar) {
        g95.i(vccVar, "zone");
        f().b = vccVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p(u8b u8bVar, long j, int i, int i2) {
        g95.i(u8bVar, "field");
        Long put = f().c.put(u8bVar, Long.valueOf(j));
        if (put != null && put.longValue() != j) {
            return ~i;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        f().d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z) {
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        this.g.add(f().N());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (l()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return f().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b u() {
        return f();
    }

    cn2(cn2 cn2Var) {
        this.e = true;
        this.f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.a = cn2Var.a;
        this.b = cn2Var.b;
        this.c = cn2Var.c;
        this.d = cn2Var.d;
        this.e = cn2Var.e;
        this.f = cn2Var.f;
        arrayList.add(new b());
    }
}
