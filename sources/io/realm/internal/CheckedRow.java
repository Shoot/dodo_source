package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;
/* loaded from: classes3.dex */
public class CheckedRow extends UncheckedRow {
    private UncheckedRow e;

    private CheckedRow(c cVar, Table table, long j) {
        super(cVar, table, j);
    }

    public static CheckedRow f(c cVar, Table table, long j) {
        return new CheckedRow(cVar, table, table.nativeGetRowPtr(table.getNativePtr(), j));
    }

    public static CheckedRow g(UncheckedRow uncheckedRow) {
        return new CheckedRow(uncheckedRow);
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public void G(long j) {
        if (r0(j) == RealmFieldType.BINARY) {
            super.e(j, null);
        } else {
            super.G(j);
        }
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public OsList N(long j, RealmFieldType realmFieldType) {
        if (realmFieldType == o().m(j)) {
            return super.N(j, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", o().k(j), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public OsSet T(long j) {
        return super.T(j);
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public OsList f0(long j) {
        if (o().m(j) == RealmFieldType.LIST) {
            return super.f0(j);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", o().k(j)));
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public OsMap n0(long j) {
        if (o().m(j) == RealmFieldType.STRING_TO_LINK_MAP) {
            return super.d(j);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmDictionary'.", o().k(j)));
    }

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeGetBoolean(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native byte[] nativeGetByteArray(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnKey(long j, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native int nativeGetColumnType(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long[] nativeGetDecimal128(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native double nativeGetDouble(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native float nativeGetFloat(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLink(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLong(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetObjectId(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetString(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetTimestamp(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeIsNullLink(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeNullifyLink(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetBoolean(long j, long j2, boolean z);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetByteArray(long j, long j2, byte[] bArr);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetDouble(long j, long j2, double d);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetFloat(long j, long j2, float f);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLink(long j, long j2, long j3);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLong(long j, long j2, long j3);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetString(long j, long j2, String str);

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public boolean o0(long j) {
        RealmFieldType r0 = r0(j);
        if (r0 != RealmFieldType.OBJECT && r0 != RealmFieldType.LIST) {
            return false;
        }
        return super.o0(j);
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public OsMap q0(long j, RealmFieldType realmFieldType) {
        if (realmFieldType == o().m(j)) {
            return super.q0(j, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", o().k(j), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public boolean w(long j) {
        return super.w(j);
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public OsSet x(long j, RealmFieldType realmFieldType) {
        if (realmFieldType == o().m(j)) {
            return super.x(j, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", o().k(j), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, defpackage.fp9
    public fp9 z0(OsSharedRealm osSharedRealm) {
        if (!a()) {
            return g75.INSTANCE;
        }
        return new CheckedRow(this.a, this.b.e(osSharedRealm), nativeFreeze(getNativePtr(), osSharedRealm.getNativePtr()));
    }

    public CheckedRow(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
        this.e = uncheckedRow;
    }
}
