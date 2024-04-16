package defpackage;

import androidx.annotation.NonNull;
import defpackage.z86;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MarkwonVisitorImpl.java */
/* renamed from: b96  reason: default package */
/* loaded from: classes3.dex */
class b96 implements z86 {
    private final s86 a;
    private final dg9 b;
    private final zqa c;
    private final Map<Class<? extends jz6>, z86.c<? extends jz6>> d;
    private final z86.a e;

    /* compiled from: MarkwonVisitorImpl.java */
    /* renamed from: b96$a */
    /* loaded from: classes3.dex */
    static class a implements z86.b {
        private final Map<Class<? extends jz6>, z86.c<? extends jz6>> a = new HashMap();
        private z86.a b;

        @Override // defpackage.z86.b
        @NonNull
        public z86 a(@NonNull s86 s86Var, @NonNull dg9 dg9Var) {
            z86.a aVar = this.b;
            if (aVar == null) {
                aVar = new cd0();
            }
            return new b96(s86Var, dg9Var, new zqa(), Collections.unmodifiableMap(this.a), aVar);
        }

        @Override // defpackage.z86.b
        @NonNull
        public <N extends jz6> z86.b b(@NonNull Class<N> cls, z86.c<? super N> cVar) {
            if (cVar == null) {
                this.a.remove(cls);
            } else {
                this.a.put(cls, cVar);
            }
            return this;
        }
    }

    b96(@NonNull s86 s86Var, @NonNull dg9 dg9Var, @NonNull zqa zqaVar, @NonNull Map<Class<? extends jz6>, z86.c<? extends jz6>> map, @NonNull z86.a aVar) {
        this.a = s86Var;
        this.b = dg9Var;
        this.c = zqaVar;
        this.d = map;
        this.e = aVar;
    }

    private void I(@NonNull jz6 jz6Var) {
        z86.c<? extends jz6> cVar = this.d.get(jz6Var.getClass());
        if (cVar != null) {
            cVar.a(this, jz6Var);
        } else {
            n(jz6Var);
        }
    }

    @Override // defpackage.w1c
    public void A(hqa hqaVar) {
        I(hqaVar);
    }

    @Override // defpackage.w1c
    public void B(z32 z32Var) {
        I(z32Var);
    }

    @Override // defpackage.z86
    public void C() {
        if (this.c.length() > 0 && '\n' != this.c.h()) {
            this.c.append('\n');
        }
    }

    @Override // defpackage.w1c
    public void D(bu4 bu4Var) {
        I(bu4Var);
    }

    @Override // defpackage.w1c
    public void E(aq7 aq7Var) {
        I(aq7Var);
    }

    @Override // defpackage.z86
    public void F(@NonNull jz6 jz6Var) {
        this.e.b(this, jz6Var);
    }

    @Override // defpackage.w1c
    public void G(fd0 fd0Var) {
        I(fd0Var);
    }

    public <N extends jz6> void H(@NonNull Class<N> cls, int i) {
        tqa a2 = this.a.e().a(cls);
        if (a2 != null) {
            g(i, a2.a(this.a, this.b));
        }
    }

    @Override // defpackage.w1c
    public void a(yl7 yl7Var) {
        I(yl7Var);
    }

    @Override // defpackage.w1c
    public void b(kn4 kn4Var) {
        I(kn4Var);
    }

    @Override // defpackage.w1c
    public void c(tp4 tp4Var) {
        I(tp4Var);
    }

    @Override // defpackage.w1c
    public void d(g9b g9bVar) {
        I(g9bVar);
    }

    @Override // defpackage.w1c
    public void e(t0b t0bVar) {
        I(t0bVar);
    }

    @Override // defpackage.z86
    @NonNull
    public zqa f() {
        return this.c;
    }

    @Override // defpackage.z86
    public void g(int i, Object obj) {
        zqa zqaVar = this.c;
        zqa.j(zqaVar, obj, i, zqaVar.length());
    }

    @Override // defpackage.w1c
    public void h(odb odbVar) {
        I(odbVar);
    }

    @Override // defpackage.w1c
    public void i(cs3 cs3Var) {
        I(cs3Var);
    }

    @Override // defpackage.z86
    public void j(@NonNull jz6 jz6Var) {
        this.e.a(this, jz6Var);
    }

    @Override // defpackage.w1c
    public void k(zf3 zf3Var) {
        I(zf3Var);
    }

    @Override // defpackage.w1c
    public void l(wm4 wm4Var) {
        I(wm4Var);
    }

    @Override // defpackage.z86
    public int length() {
        return this.c.length();
    }

    @Override // defpackage.w1c
    public void m(iq5 iq5Var) {
        I(iq5Var);
    }

    @Override // defpackage.z86
    public void n(@NonNull jz6 jz6Var) {
        jz6 c = jz6Var.c();
        while (c != null) {
            jz6 e = c.e();
            c.a(this);
            c = e;
        }
    }

    @Override // defpackage.w1c
    public void o(kq5 kq5Var) {
        I(kq5Var);
    }

    @Override // defpackage.w1c
    public void p(ar5 ar5Var) {
        I(ar5Var);
    }

    @Override // defpackage.z86
    @NonNull
    public dg9 q() {
        return this.b;
    }

    @Override // defpackage.w1c
    public void r(th0 th0Var) {
        I(th0Var);
    }

    @Override // defpackage.z86
    public boolean s(@NonNull jz6 jz6Var) {
        if (jz6Var.e() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w1c
    public void t(wp4 wp4Var) {
        I(wp4Var);
    }

    @Override // defpackage.w1c
    public void u(h05 h05Var) {
        I(h05Var);
    }

    @Override // defpackage.z86
    public <N extends jz6> void v(@NonNull N n, int i) {
        H(n.getClass(), i);
    }

    @Override // defpackage.w1c
    public void w(i53 i53Var) {
        I(i53Var);
    }

    @Override // defpackage.z86
    @NonNull
    public s86 x() {
        return this.a;
    }

    @Override // defpackage.w1c
    public void y(ma1 ma1Var) {
        I(ma1Var);
    }

    @Override // defpackage.z86
    public void z() {
        this.c.append('\n');
    }
}
