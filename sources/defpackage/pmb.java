package defpackage;

import defpackage.f49;
import defpackage.kib;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TreeBuilder.java */
/* renamed from: pmb  reason: default package */
/* loaded from: classes3.dex */
public abstract class pmb {
    protected fr7 a;
    lw0 b;
    tib c;
    protected h53 d;
    protected ArrayList<re3> e;
    protected String f;
    protected kib g;
    protected br7 h;
    protected Map<String, g6b> i;
    private kib.h j = new kib.h();
    private kib.g k = new kib.g();
    private boolean l;

    private void o(kz6 kz6Var, kib kibVar, boolean z) {
        int q;
        if (!this.l || kibVar == null || (q = kibVar.q()) == -1) {
            return;
        }
        f49.a aVar = new f49.a(q, this.b.C(q), this.b.f(q));
        int f = kibVar.f();
        new f49(aVar, new f49.a(f, this.b.C(f), this.b.f(f))).a(kz6Var, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public re3 a() {
        int size = this.e.size();
        if (size > 0) {
            return this.e.get(size - 1);
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(String str) {
        re3 a;
        if (this.e.size() == 0 || (a = a()) == null || !a.C0().equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract br7 c();

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str, Object... objArr) {
        ar7 a = this.a.a();
        if (a.d()) {
            a.add(new zq7(this.b, str, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(Reader reader, String str, fr7 fr7Var) {
        boolean z;
        vvb.k(reader, "String input must not be null");
        vvb.k(str, "BaseURI must not be null");
        vvb.j(fr7Var);
        h53 h53Var = new h53(str);
        this.d = h53Var;
        h53Var.g1(fr7Var);
        this.a = fr7Var;
        this.h = fr7Var.g();
        this.b = new lw0(reader);
        this.l = fr7Var.d();
        lw0 lw0Var = this.b;
        if (!fr7Var.c() && !this.l) {
            z = false;
        } else {
            z = true;
        }
        lw0Var.U(z);
        this.g = null;
        this.c = new tib(this.b, fr7Var.a());
        this.e = new ArrayList<>(32);
        this.i = new HashMap();
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(kz6 kz6Var, kib kibVar) {
        o(kz6Var, kibVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(kz6 kz6Var, kib kibVar) {
        o(kz6Var, kibVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h53 h(Reader reader, String str, fr7 fr7Var) {
        e(reader, str, fr7Var);
        m();
        this.b.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.i = null;
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean i(kib kibVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j(String str) {
        kib kibVar = this.g;
        kib.g gVar = this.k;
        if (kibVar == gVar) {
            return i(new kib.g().G(str));
        }
        return i(gVar.o().G(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k(String str) {
        kib.h hVar = this.j;
        if (this.g == hVar) {
            return i(new kib.h().G(str));
        }
        return i(hVar.o().G(str));
    }

    public boolean l(String str, hz hzVar) {
        kib.h hVar = this.j;
        if (this.g == hVar) {
            return i(new kib.h().N(str, hzVar));
        }
        hVar.o();
        hVar.N(str, hzVar);
        return i(hVar);
    }

    protected void m() {
        kib w;
        tib tibVar = this.c;
        kib.j jVar = kib.j.EOF;
        do {
            w = tibVar.w();
            i(w);
            w.o();
        } while (w.a != jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g6b n(String str, br7 br7Var) {
        g6b g6bVar = this.i.get(str);
        if (g6bVar == null) {
            g6b r = g6b.r(str, br7Var);
            this.i.put(str, r);
            return r;
        }
        return g6bVar;
    }
}
