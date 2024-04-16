package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes3.dex */
public class UncheckedRow implements ku6, fp9 {
    private static final long d = nativeGetFinalizerPtr();
    protected final c a;
    protected final Table b;
    private final long c;

    public UncheckedRow(c cVar, Table table, long j) {
        this.a = cVar;
        this.b = table;
        this.c = j;
        cVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UncheckedRow b(c cVar, Table table, long j) {
        return new UncheckedRow(cVar, table, table.nativeGetRowPtr(table.getNativePtr(), j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UncheckedRow c(c cVar, Table table, long j) {
        return new UncheckedRow(cVar, table, j);
    }

    private static native long nativeGetFinalizerPtr();

    @Override // defpackage.fp9
    public NativeRealmAny E(long j) {
        return new NativeRealmAny(nativeGetRealmAny(this.c, j));
    }

    @Override // defpackage.fp9
    public long E0() {
        return nativeGetObjectKey(this.c);
    }

    public void G(long j) {
        this.b.a();
        nativeSetNull(this.c, j);
    }

    @Override // defpackage.fp9
    public byte[] H(long j) {
        return nativeGetByteArray(this.c, j);
    }

    @Override // defpackage.fp9
    public double K(long j) {
        return nativeGetDouble(this.c, j);
    }

    @Override // defpackage.fp9
    public long L(long j) {
        return nativeGetLink(this.c, j);
    }

    @Override // defpackage.fp9
    public float M(long j) {
        return nativeGetFloat(this.c, j);
    }

    public OsList N(long j, RealmFieldType realmFieldType) {
        return new OsList(this, j);
    }

    @Override // defpackage.fp9
    public Decimal128 P(long j) {
        long[] nativeGetDecimal128 = nativeGetDecimal128(this.c, j);
        if (nativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeGetDecimal128[1], nativeGetDecimal128[0]);
        }
        return null;
    }

    @Override // defpackage.fp9
    public void Q(long j, boolean z) {
        this.b.a();
        nativeSetBoolean(this.c, j, z);
    }

    public OsSet T(long j) {
        return new OsSet(this, j);
    }

    @Override // defpackage.fp9
    public ObjectId W(long j) {
        return new ObjectId(nativeGetObjectId(this.c, j));
    }

    @Override // defpackage.fp9
    public boolean a() {
        long j = this.c;
        if (j != 0 && nativeIsValid(j)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fp9
    public boolean b0(long j) {
        return nativeGetBoolean(this.c, j);
    }

    public OsMap d(long j) {
        return new OsMap(this, j);
    }

    public void e(long j, byte[] bArr) {
        this.b.a();
        nativeSetByteArray(this.c, j, bArr);
    }

    @Override // defpackage.fp9
    public long e0(long j) {
        return nativeGetLong(this.c, j);
    }

    public OsList f0(long j) {
        return new OsList(this, j);
    }

    @Override // defpackage.fp9
    public String[] getColumnNames() {
        return nativeGetColumnNames(this.c);
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return d;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.c;
    }

    @Override // defpackage.fp9
    public Date h0(long j) {
        return new Date(nativeGetTimestamp(this.c, j));
    }

    @Override // defpackage.fp9
    public void i(long j, String str) {
        this.b.a();
        if (str == null) {
            nativeSetNull(this.c, j);
        } else {
            nativeSetString(this.c, j, str);
        }
    }

    @Override // defpackage.fp9
    public boolean isLoaded() {
        return true;
    }

    @Override // defpackage.fp9
    public void k(long j, float f) {
        this.b.a();
        nativeSetFloat(this.c, j, f);
    }

    @Override // defpackage.fp9
    public void l0(long j) {
        this.b.a();
        nativeNullifyLink(this.c, j);
    }

    @Override // defpackage.fp9
    public long m0(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.c, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public OsMap n0(long j) {
        return new OsMap(this, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public native long nativeFreeze(long j, long j2);

    protected native boolean nativeGetBoolean(long j, long j2);

    protected native byte[] nativeGetByteArray(long j, long j2);

    protected native long nativeGetColumnKey(long j, String str);

    protected native String[] nativeGetColumnNames(long j);

    protected native int nativeGetColumnType(long j, long j2);

    protected native long[] nativeGetDecimal128(long j, long j2);

    protected native double nativeGetDouble(long j, long j2);

    protected native float nativeGetFloat(long j, long j2);

    protected native long nativeGetLink(long j, long j2);

    protected native long nativeGetLong(long j, long j2);

    protected native String nativeGetObjectId(long j, long j2);

    protected native long nativeGetObjectKey(long j);

    protected native long nativeGetRealmAny(long j, long j2);

    protected native String nativeGetString(long j, long j2);

    protected native long nativeGetTimestamp(long j, long j2);

    protected native String nativeGetUUID(long j, long j2);

    protected native boolean nativeIsNull(long j, long j2);

    protected native boolean nativeIsNullLink(long j, long j2);

    protected native boolean nativeIsValid(long j);

    protected native void nativeNullifyLink(long j, long j2);

    protected native void nativeSetBoolean(long j, long j2, boolean z);

    protected native void nativeSetByteArray(long j, long j2, byte[] bArr);

    protected native void nativeSetDouble(long j, long j2, double d2);

    protected native void nativeSetFloat(long j, long j2, float f);

    protected native void nativeSetLink(long j, long j2, long j3);

    protected native void nativeSetLong(long j, long j2, long j3);

    protected native void nativeSetNull(long j, long j2);

    protected native void nativeSetString(long j, long j2, String str);

    @Override // defpackage.fp9
    public Table o() {
        return this.b;
    }

    public boolean o0(long j) {
        return nativeIsNullLink(this.c, j);
    }

    @Override // defpackage.fp9
    public String p0(long j) {
        return nativeGetString(this.c, j);
    }

    @Override // defpackage.fp9
    public UUID q(long j) {
        return UUID.fromString(nativeGetUUID(this.c, j));
    }

    public OsMap q0(long j, RealmFieldType realmFieldType) {
        return new OsMap(this, j);
    }

    @Override // defpackage.fp9
    public RealmFieldType r0(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.c, j));
    }

    @Override // defpackage.fp9
    public void s(long j, long j2) {
        this.b.a();
        nativeSetLink(this.c, j, j2);
    }

    @Override // defpackage.fp9
    public void u(long j, long j2) {
        this.b.a();
        nativeSetLong(this.c, j, j2);
    }

    public boolean w(long j) {
        return nativeIsNull(this.c, j);
    }

    public OsSet x(long j, RealmFieldType realmFieldType) {
        return new OsSet(this, j);
    }

    @Override // defpackage.fp9
    public void x0(long j, double d2) {
        this.b.a();
        nativeSetDouble(this.c, j, d2);
    }

    public fp9 z0(OsSharedRealm osSharedRealm) {
        if (!a()) {
            return g75.INSTANCE;
        }
        return new UncheckedRow(this.a, this.b.e(osSharedRealm), nativeFreeze(this.c, osSharedRealm.getNativePtr()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UncheckedRow(UncheckedRow uncheckedRow) {
        this.a = uncheckedRow.a;
        this.b = uncheckedRow.b;
        this.c = uncheckedRow.c;
    }
}
