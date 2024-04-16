package io.realm.internal;

import io.realm.e0;
import io.realm.g0;
import io.realm.internal.objectstore.OsKeyPathMapping;
/* loaded from: classes3.dex */
public class TableQuery implements ku6 {
    private static final long e = nativeGetFinalizerPtr();
    private final Table a;
    private final long b;
    private final g0 c = new g0();
    private boolean d = true;

    public TableQuery(c cVar, Table table, long j) {
        this.a = table;
        this.b = j;
        cVar.a(this);
    }

    private static String f(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "\\ ");
    }

    private native void nativeBeginGroup(long j);

    private native void nativeEndGroup(long j);

    private native long nativeFind(long j);

    private static native long nativeGetFinalizerPtr();

    private native void nativeOr(long j);

    private native void nativeRawPredicate(long j, String str, long[] jArr, long j2);

    private native String nativeValidateQuery(long j);

    public TableQuery a() {
        m(null, "FALSEPREDICATE", new long[0]);
        this.d = false;
        return this;
    }

    public TableQuery b() {
        nativeBeginGroup(this.b);
        this.d = false;
        return this;
    }

    public TableQuery c() {
        nativeEndGroup(this.b);
        this.d = false;
        return this;
    }

    public TableQuery d(OsKeyPathMapping osKeyPathMapping, String str, e0 e0Var) {
        g0 g0Var = this.c;
        g0Var.c(this, osKeyPathMapping, f(str) + " = $0", e0Var);
        this.d = false;
        return this;
    }

    public TableQuery e(OsKeyPathMapping osKeyPathMapping, String str, e0 e0Var) {
        g0 g0Var = this.c;
        g0Var.c(this, osKeyPathMapping, f(str) + " =[c] $0", e0Var);
        this.d = false;
        return this;
    }

    public long g() {
        n();
        return nativeFind(this.b);
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return e;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.b;
    }

    public Table h() {
        return this.a;
    }

    public TableQuery i(OsKeyPathMapping osKeyPathMapping, String str, e0[] e0VarArr) {
        String f = f(str);
        b();
        int length = e0VarArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            e0 e0Var = e0VarArr[i];
            if (!z) {
                l();
            }
            if (e0Var == null) {
                k(osKeyPathMapping, f);
            } else {
                d(osKeyPathMapping, f, e0Var);
            }
            i++;
            z = false;
        }
        c();
        this.d = false;
        return this;
    }

    public TableQuery j(OsKeyPathMapping osKeyPathMapping, String str, e0[] e0VarArr) {
        String f = f(str);
        b();
        int length = e0VarArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            e0 e0Var = e0VarArr[i];
            if (!z) {
                l();
            }
            if (e0Var == null) {
                k(osKeyPathMapping, f);
            } else {
                e(osKeyPathMapping, f, e0Var);
            }
            i++;
            z = false;
        }
        c();
        this.d = false;
        return this;
    }

    public TableQuery k(OsKeyPathMapping osKeyPathMapping, String str) {
        m(osKeyPathMapping, f(str) + " = NULL", new long[0]);
        this.d = false;
        return this;
    }

    public TableQuery l() {
        nativeOr(this.b);
        this.d = false;
        return this;
    }

    public void m(OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        long j;
        long j2 = this.b;
        if (osKeyPathMapping != null) {
            j = osKeyPathMapping.getNativePtr();
        } else {
            j = 0;
        }
        nativeRawPredicate(j2, str, jArr, j);
    }

    public void n() {
        if (!this.d) {
            String nativeValidateQuery = nativeValidateQuery(this.b);
            if ("".equals(nativeValidateQuery)) {
                this.d = true;
                return;
            }
            throw new UnsupportedOperationException(nativeValidateQuery);
        }
    }
}
