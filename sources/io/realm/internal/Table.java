package io.realm.internal;

import io.realm.RealmFieldType;
/* loaded from: classes3.dex */
public class Table implements ku6 {
    private static final String d;
    public static final int e;
    private static final long f;
    private final long a;
    private final c b;
    private final OsSharedRealm c;

    static {
        String d2 = Util.d();
        d = d2;
        e = 63 - d2.length();
        f = nativeGetFinalizerPtr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table(OsSharedRealm osSharedRealm, long j) {
        c cVar = osSharedRealm.context;
        this.b = cVar;
        this.c = osSharedRealm;
        this.a = j;
        cVar.a(this);
    }

    private static void G() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        String str2 = d;
        if (!str.startsWith(str2)) {
            return str;
        }
        return str.substring(str2.length());
    }

    private native void nativeClear(long j);

    public static native long nativeFindFirstNull(long j, long j2);

    public static native long nativeFindFirstString(long j, long j2, String str);

    private static native long nativeFreeze(long j, long j2);

    private native long nativeGetColumnCount(long j);

    private native long nativeGetColumnKey(long j, String str);

    private native String nativeGetColumnName(long j, long j2);

    private native String[] nativeGetColumnNames(long j);

    private native int nativeGetColumnType(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private native long nativeGetLinkTarget(long j, long j2);

    private native String nativeGetName(long j);

    private native boolean nativeIsColumnNullable(long j, long j2);

    private static native boolean nativeIsEmbedded(long j);

    private native boolean nativeIsValid(long j);

    private native void nativeMoveLastOver(long j, long j2);

    public static native void nativeNullifyLink(long j, long j2, long j3);

    public static native void nativeSetBoolean(long j, long j2, long j3, boolean z, boolean z2);

    public static native void nativeSetDouble(long j, long j2, long j3, double d2, boolean z);

    public static native void nativeSetFloat(long j, long j2, long j3, float f2, boolean z);

    public static native void nativeSetLink(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetLong(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetNull(long j, long j2, long j3, boolean z);

    public static native void nativeSetString(long j, long j2, long j3, String str, boolean z);

    private native long nativeSize(long j);

    private native long nativeWhere(long j);

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        return d + str;
    }

    public void A(long j, long j2, float f2, boolean z) {
        a();
        nativeSetFloat(this.a, j, j2, f2, z);
    }

    public void B(long j, long j2, long j3, boolean z) {
        a();
        nativeSetLink(this.a, j, j2, j3, z);
    }

    public void C(long j, long j2, long j3, boolean z) {
        a();
        nativeSetLong(this.a, j, j2, j3, z);
    }

    public void D(long j, long j2, boolean z) {
        a();
        nativeSetNull(this.a, j, j2, z);
    }

    public void E(long j, long j2, String str, boolean z) {
        a();
        if (str == null) {
            nativeSetNull(this.a, j, j2, z);
        } else {
            nativeSetString(this.a, j, j2, str, z);
        }
    }

    public long F() {
        return nativeSize(this.a);
    }

    public TableQuery H() {
        return new TableQuery(this.b, this, nativeWhere(this.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (v()) {
            G();
        }
    }

    public void b() {
        a();
        nativeClear(this.a);
    }

    public long c(long j) {
        return nativeFindFirstNull(this.a, j);
    }

    public long d(long j, String str) {
        if (str != null) {
            return nativeFindFirstString(this.a, j, str);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public Table e(OsSharedRealm osSharedRealm) {
        if (osSharedRealm.isFrozen()) {
            return new Table(osSharedRealm, nativeFreeze(osSharedRealm.getNativePtr(), this.a));
        }
        throw new IllegalArgumentException("Frozen Realm required");
    }

    public CheckedRow f(long j) {
        return CheckedRow.f(this.b, this, j);
    }

    public String g() {
        String h = h(o());
        if (!Util.f(h)) {
            return h;
        }
        throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return f;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }

    public long i() {
        return nativeGetColumnCount(this.a);
    }

    public long j(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.a, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public String k(long j) {
        return nativeGetColumnName(this.a, j);
    }

    public String[] l() {
        return nativeGetColumnNames(this.a);
    }

    public RealmFieldType m(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.a, j));
    }

    public Table n(long j) {
        return new Table(this.c, nativeGetLinkTarget(this.a, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long nativeGetRowPtr(long j, long j2);

    public String o() {
        return nativeGetName(this.a);
    }

    public OsSharedRealm p() {
        return this.c;
    }

    public UncheckedRow r(long j) {
        return UncheckedRow.b(this.b, this, j);
    }

    public UncheckedRow s(long j) {
        return UncheckedRow.c(this.b, this, j);
    }

    public boolean t(long j) {
        return nativeIsColumnNullable(this.a, j);
    }

    public String toString() {
        long i = i();
        String o = o();
        StringBuilder sb = new StringBuilder("The Table ");
        if (o != null && !o.isEmpty()) {
            sb.append(o());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(i);
        sb.append(" columns: ");
        String[] l = l();
        int length = l.length;
        boolean z = true;
        int i2 = 0;
        while (i2 < length) {
            String str = l[i2];
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            i2++;
            z = false;
        }
        sb.append(".");
        sb.append(" And ");
        sb.append(F());
        sb.append(" rows.");
        return sb.toString();
    }

    public boolean u() {
        return nativeIsEmbedded(this.a);
    }

    boolean v() {
        OsSharedRealm osSharedRealm = this.c;
        if (osSharedRealm != null && !osSharedRealm.isInTransaction()) {
            return true;
        }
        return false;
    }

    public boolean w() {
        long j = this.a;
        if (j != 0 && nativeIsValid(j)) {
            return true;
        }
        return false;
    }

    public void x(long j) {
        a();
        nativeMoveLastOver(this.a, j);
    }

    public void y(long j, long j2, boolean z, boolean z2) {
        a();
        nativeSetBoolean(this.a, j, j2, z, z2);
    }

    public void z(long j, long j2, double d2, boolean z) {
        a();
        nativeSetDouble(this.a, j, j2, d2, z);
    }
}
