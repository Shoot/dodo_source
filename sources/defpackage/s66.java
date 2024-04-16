package defpackage;

import defpackage.ro6;
import defpackage.t66;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: MapMaker.java */
/* renamed from: s66  reason: default package */
/* loaded from: classes2.dex */
public final class s66 {
    boolean a;
    int b = -1;
    int c = -1;
    t66.p d;
    t66.p e;
    dk3<Object> f;

    public s66 a(int i) {
        boolean z;
        int i2 = this.c;
        boolean z2 = false;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        hh8.o(z, "concurrency level was already set to %s", i2);
        if (i > 0) {
            z2 = true;
        }
        hh8.d(z2);
        this.c = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dk3<Object> d() {
        return (dk3) ro6.a(this.f, e().i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t66.p e() {
        return (t66.p) ro6.a(this.d, t66.p.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t66.p f() {
        return (t66.p) ro6.a(this.e, t66.p.a);
    }

    public s66 g(int i) {
        boolean z;
        int i2 = this.b;
        boolean z2 = false;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        hh8.o(z, "initial capacity was already set to %s", i2);
        if (i >= 0) {
            z2 = true;
        }
        hh8.d(z2);
        this.b = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s66 h(dk3<Object> dk3Var) {
        boolean z;
        dk3<Object> dk3Var2 = this.f;
        if (dk3Var2 == null) {
            z = true;
        } else {
            z = false;
        }
        hh8.p(z, "key equivalence was already set to %s", dk3Var2);
        this.f = (dk3) hh8.i(dk3Var);
        this.a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        if (!this.a) {
            return new ConcurrentHashMap(c(), 0.75f, b());
        }
        return t66.c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s66 j(t66.p pVar) {
        boolean z;
        t66.p pVar2 = this.d;
        if (pVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        hh8.p(z, "Key strength was already set to %s", pVar2);
        this.d = (t66.p) hh8.i(pVar);
        if (pVar != t66.p.a) {
            this.a = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s66 k(t66.p pVar) {
        boolean z;
        t66.p pVar2 = this.e;
        if (pVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        hh8.p(z, "Value strength was already set to %s", pVar2);
        this.e = (t66.p) hh8.i(pVar);
        if (pVar != t66.p.a) {
            this.a = true;
        }
        return this;
    }

    public s66 l() {
        return j(t66.p.b);
    }

    public String toString() {
        ro6.b b = ro6.b(this);
        int i = this.b;
        if (i != -1) {
            b.a("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            b.a("concurrencyLevel", i2);
        }
        t66.p pVar = this.d;
        if (pVar != null) {
            b.b("keyStrength", gs.b(pVar.toString()));
        }
        t66.p pVar2 = this.e;
        if (pVar2 != null) {
            b.b("valueStrength", gs.b(pVar2.toString()));
        }
        if (this.f != null) {
            b.h("keyEquivalence");
        }
        return b.toString();
    }
}
