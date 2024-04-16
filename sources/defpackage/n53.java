package defpackage;

import defpackage.ds3;
import defpackage.gd0;
import defpackage.i05;
import defpackage.ln4;
import defpackage.pdb;
import defpackage.up4;
import defpackage.wq5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: DocumentParser.java */
/* renamed from: n53  reason: default package */
/* loaded from: classes3.dex */
public class n53 implements ir7 {
    private static final Set<Class<? extends wc0>> p = new LinkedHashSet(Arrays.asList(fd0.class, kn4.class, cs3.class, tp4.class, odb.class, vq5.class, h05.class));
    private static final Map<Class<? extends wc0>, ed0> q;
    private CharSequence a;
    private boolean d;
    private boolean h;
    private final List<ed0> i;
    private final h35 j;
    private final List<mu2> k;
    private final j53 l;
    private int b = 0;
    private int c = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private final Map<String, kq5> m = new LinkedHashMap();
    private List<dd0> n = new ArrayList();
    private Set<dd0> o = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DocumentParser.java */
    /* renamed from: n53$a */
    /* loaded from: classes3.dex */
    public static class a implements u96 {
        private final dd0 a;

        public a(dd0 dd0Var) {
            this.a = dd0Var;
        }

        @Override // defpackage.u96
        public CharSequence a() {
            dd0 dd0Var = this.a;
            if (!(dd0Var instanceof iq7)) {
                return null;
            }
            CharSequence i = ((iq7) dd0Var).i();
            if (i.length() == 0) {
                return null;
            }
            return i;
        }

        @Override // defpackage.u96
        public dd0 b() {
            return this.a;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(fd0.class, new gd0.a());
        hashMap.put(kn4.class, new ln4.a());
        hashMap.put(cs3.class, new ds3.a());
        hashMap.put(tp4.class, new up4.b());
        hashMap.put(odb.class, new pdb.a());
        hashMap.put(vq5.class, new wq5.a());
        hashMap.put(h05.class, new i05.a());
        q = Collections.unmodifiableMap(hashMap);
    }

    public n53(List<ed0> list, h35 h35Var, List<mu2> list2) {
        this.i = list;
        this.j = h35Var;
        this.k = list2;
        j53 j53Var = new j53();
        this.l = j53Var;
        g(j53Var);
    }

    private void g(dd0 dd0Var) {
        this.n.add(dd0Var);
        this.o.add(dd0Var);
    }

    private <T extends dd0> T h(T t) {
        while (!f().d(t.e())) {
            n(f());
        }
        f().e().b(t.e());
        g(t);
        return t;
    }

    private void i(iq7 iq7Var) {
        for (kq5 kq5Var : iq7Var.j()) {
            iq7Var.e().i(kq5Var);
            String n = kq5Var.n();
            if (!this.m.containsKey(n)) {
                this.m.put(n, kq5Var);
            }
        }
    }

    private void j() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(this.b + 1, charSequence.length());
            int a2 = jr7.a(this.c);
            StringBuilder sb = new StringBuilder(subSequence2.length() + a2);
            for (int i = 0; i < a2; i++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.a;
            subSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        f().f(subSequence);
    }

    private void k() {
        if (this.a.charAt(this.b) == '\t') {
            this.b++;
            int i = this.c;
            this.c = i + jr7.a(i);
            return;
        }
        this.b++;
        this.c++;
    }

    public static List<ed0> l(List<ed0> list, Set<Class<? extends wc0>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        for (Class<? extends wc0> cls : set) {
            arrayList.add(q.get(cls));
        }
        return arrayList;
    }

    private void m() {
        List<dd0> list = this.n;
        list.remove(list.size() - 1);
    }

    private void n(dd0 dd0Var) {
        if (f() == dd0Var) {
            m();
        }
        if (dd0Var instanceof iq7) {
            i((iq7) dd0Var);
        }
        dd0Var.h();
    }

    private i53 o() {
        p(this.n);
        w();
        return this.l.e();
    }

    private void p(List<dd0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            n(list.get(size));
        }
    }

    private kd0 q(dd0 dd0Var) {
        a aVar = new a(dd0Var);
        for (ed0 ed0Var : this.i) {
            jd0 a2 = ed0Var.a(this, aVar);
            if (a2 instanceof kd0) {
                return (kd0) a2;
            }
        }
        return null;
    }

    private void r() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i++;
                    i2++;
                }
            } else {
                i++;
                i2 += 4 - (i2 % 4);
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public static Set<Class<? extends wc0>> s() {
        return p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
        y(r10.e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t(java.lang.CharSequence r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n53.t(java.lang.CharSequence):void");
    }

    private void v() {
        dd0 f = f();
        m();
        this.o.remove(f);
        if (f instanceof iq7) {
            i((iq7) f);
        }
        f.e().l();
    }

    private void w() {
        e35 a2 = this.j.a(new g35(this.k, this.m));
        for (dd0 dd0Var : this.o) {
            dd0Var.b(a2);
        }
    }

    private void x(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            }
            k();
        }
        if (i2 > i) {
            this.b--;
            this.c = i;
            this.d = true;
            return;
        }
        this.d = false;
    }

    private void y(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            }
            k();
        }
        this.d = false;
    }

    @Override // defpackage.ir7
    public boolean a() {
        return this.h;
    }

    @Override // defpackage.ir7
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.ir7
    public int c() {
        return this.c;
    }

    @Override // defpackage.ir7
    public int d() {
        return this.g;
    }

    @Override // defpackage.ir7
    public int e() {
        return this.e;
    }

    @Override // defpackage.ir7
    public dd0 f() {
        List<dd0> list = this.n;
        return list.get(list.size() - 1);
    }

    @Override // defpackage.ir7
    public int getIndex() {
        return this.b;
    }

    public i53 u(String str) {
        int i = 0;
        while (true) {
            int c = jr7.c(str, i);
            if (c == -1) {
                break;
            }
            t(str.substring(i, c));
            i = c + 1;
            if (i < str.length() && str.charAt(c) == '\r' && str.charAt(i) == '\n') {
                i = c + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            t(str.substring(i));
        }
        return o();
    }
}
