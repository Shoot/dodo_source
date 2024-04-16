package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
/* loaded from: classes3.dex */
public class RealmQuery<E> {
    private final Table a;
    private final a b;
    private final TableQuery c;
    private final o0 d;
    private Class<E> e;
    private String f;
    private final boolean g;
    private final em7 h;

    private RealmQuery(d0 d0Var, Class<E> cls) {
        this.b = d0Var;
        this.e = cls;
        boolean z = !l(cls);
        this.g = z;
        if (!z) {
            o0 h = d0Var.u().h(cls);
            this.d = h;
            Table b = h.b();
            this.a = b;
            this.h = null;
            this.c = b.H();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends o89> RealmQuery<E> b(d0 d0Var, Class<E> cls) {
        return new RealmQuery<>(d0Var, cls);
    }

    private p0<E> c(TableQuery tableQuery, boolean z) {
        p0<E> p0Var;
        OsResults c = OsResults.c(this.b.e, tableQuery);
        if (m()) {
            p0Var = new p0<>(this.b, c, this.f);
        } else {
            p0Var = new p0<>(this.b, c, this.e);
        }
        if (z) {
            p0Var.d();
        }
        return p0Var;
    }

    private long i() {
        return this.c.g();
    }

    private static boolean l(Class<?> cls) {
        return o89.class.isAssignableFrom(cls);
    }

    private boolean m() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public RealmQuery<E> a() {
        this.b.c();
        this.c.a();
        return this;
    }

    public RealmQuery<E> d(String str, e0 e0Var, is0 is0Var) {
        this.b.c();
        if (is0Var == is0.SENSITIVE) {
            this.c.d(this.b.u().g(), str, e0Var);
        } else {
            this.c.e(this.b.u().g(), str, e0Var);
        }
        return this;
    }

    public RealmQuery<E> e(String str, String str2) {
        return f(str, str2, is0.SENSITIVE);
    }

    public RealmQuery<E> f(String str, String str2, is0 is0Var) {
        this.b.c();
        d(str, e0.f(str2), is0Var);
        return this;
    }

    public p0<E> g() {
        this.b.c();
        this.b.b();
        return c(this.c, true);
    }

    public E h() {
        this.b.c();
        this.b.b();
        if (this.g) {
            return null;
        }
        long i = i();
        if (i < 0) {
            return null;
        }
        return (E) this.b.q(this.e, this.f, i);
    }

    public RealmQuery<E> j(String str, String[] strArr) {
        return k(str, strArr, is0.SENSITIVE);
    }

    public RealmQuery<E> k(String str, String[] strArr, is0 is0Var) {
        this.b.c();
        if (strArr != null && strArr.length != 0) {
            e0[] e0VarArr = new e0[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                if (str2 != null) {
                    e0VarArr[i] = e0.f(str2);
                } else {
                    e0VarArr[i] = null;
                }
            }
            if (is0Var == is0.SENSITIVE) {
                this.c.i(this.b.u().g(), str, e0VarArr);
            } else {
                this.c.j(this.b.u().g(), str, e0VarArr);
            }
        } else {
            a();
        }
        return this;
    }
}
