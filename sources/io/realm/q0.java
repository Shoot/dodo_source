package io.realm;

import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: RealmSchema.java */
/* loaded from: classes3.dex */
public abstract class q0 {
    private final Map<String, Table> a = new HashMap();
    private final Map<Class<? extends o89>, Table> b = new HashMap();
    private final Map<Class<? extends o89>, o0> c = new HashMap();
    private final Map<String, o0> d = new HashMap();
    private OsKeyPathMapping e = null;
    final a f;
    private final rf1 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(a aVar, rf1 rf1Var) {
        this.f = aVar;
        this.g = rf1Var;
    }

    private void a() {
        if (l()) {
            return;
        }
        throw new IllegalStateException("Attempt to use column key before set.");
    }

    private boolean m(Class<? extends o89> cls, Class<? extends o89> cls2) {
        return cls.equals(cls2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public void c() {
        this.e = new OsKeyPathMapping(this.f.e.getNativePtr());
    }

    public abstract Set<o0> d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final sf1 e(Class<? extends o89> cls) {
        a();
        return this.g.a(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final sf1 f(String str) {
        a();
        return this.g.b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final OsKeyPathMapping g() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0 h(Class<? extends o89> cls) {
        o0 o0Var = this.c.get(cls);
        if (o0Var != null) {
            return o0Var;
        }
        Class<? extends o89> c = Util.c(cls);
        if (m(c, cls)) {
            o0Var = this.c.get(c);
        }
        if (o0Var == null) {
            q qVar = new q(this.f, this, j(cls), e(c));
            this.c.put(c, qVar);
            o0Var = qVar;
        }
        if (m(c, cls)) {
            this.c.put(cls, o0Var);
        }
        return o0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0 i(String str) {
        String q = Table.q(str);
        o0 o0Var = this.d.get(q);
        if (o0Var == null || !o0Var.b().w() || !o0Var.a().equals(str)) {
            if (this.f.x().hasTable(q)) {
                a aVar = this.f;
                q qVar = new q(aVar, this, aVar.x().getTable(q));
                this.d.put(q, qVar);
                return qVar;
            }
            throw new IllegalArgumentException("The class " + str + " doesn't exist in this Realm.");
        }
        return o0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table j(Class<? extends o89> cls) {
        Table table = this.b.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends o89> c = Util.c(cls);
        if (m(c, cls)) {
            table = this.b.get(c);
        }
        if (table == null) {
            table = this.f.x().getTable(Table.q(this.f.s().o().m(c)));
            this.b.put(c, table);
        }
        if (m(c, cls)) {
            this.b.put(cls, table);
        }
        return table;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table k(String str) {
        String q = Table.q(str);
        Table table = this.a.get(q);
        if (table != null) {
            return table;
        }
        Table table2 = this.f.x().getTable(q);
        this.a.put(q, table2);
        return table2;
    }

    final boolean l() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        rf1 rf1Var = this.g;
        if (rf1Var != null) {
            rf1Var.c();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }
}
