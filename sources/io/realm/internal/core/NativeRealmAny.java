package io.realm.internal.core;

import io.realm.e0;
import io.realm.internal.Keep;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.c;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
@Keep
/* loaded from: classes3.dex */
public class NativeRealmAny implements ku6 {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;

    public NativeRealmAny(long j) {
        this.nativePtr = j;
        c.c.a(this);
    }

    private static long createRealmAnyLink(r89 r89Var) {
        fp9 g = r89Var.a().g();
        return nativeCreateLink(g.o().getNativePtr(), g.E0());
    }

    private static native byte[] nativeAsBinary(long j);

    private static native boolean nativeAsBoolean(long j);

    private static native long nativeAsDate(long j);

    private static native long[] nativeAsDecimal128(long j);

    private static native double nativeAsDouble(long j);

    private static native float nativeAsFloat(long j);

    private static native long nativeAsLong(long j);

    private static native String nativeAsObjectId(long j);

    private static native String nativeAsString(long j);

    private static native String nativeAsUUID(long j);

    private static native long nativeCreateBinary(byte[] bArr);

    private static native long nativeCreateBoolean(boolean z);

    private static native long nativeCreateDate(long j);

    private static native long nativeCreateDecimal128(long j, long j2);

    private static native long nativeCreateDouble(double d);

    private static native long nativeCreateFloat(float f);

    private static native long nativeCreateLink(long j, long j2);

    private static native long nativeCreateLong(long j);

    private static native long nativeCreateNull();

    private static native long nativeCreateObjectId(String str);

    private static native long nativeCreateString(String str);

    private static native long nativeCreateUUID(String str);

    private static native boolean nativeEquals(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmModelRowKey(long j);

    private static native String nativeGetRealmModelTableName(long j, long j2);

    private static native int nativeGetType(long j);

    public byte[] asBinary() {
        return nativeAsBinary(this.nativePtr);
    }

    public boolean asBoolean() {
        return nativeAsBoolean(this.nativePtr);
    }

    public Date asDate() {
        return new Date(nativeAsDate(this.nativePtr));
    }

    public Decimal128 asDecimal128() {
        long[] nativeAsDecimal128 = nativeAsDecimal128(this.nativePtr);
        return Decimal128.fromIEEE754BIDEncoding(nativeAsDecimal128[1], nativeAsDecimal128[0]);
    }

    public double asDouble() {
        return nativeAsDouble(this.nativePtr);
    }

    public float asFloat() {
        return nativeAsFloat(this.nativePtr);
    }

    public long asLong() {
        return nativeAsLong(this.nativePtr);
    }

    public ObjectId asObjectId() {
        return new ObjectId(nativeAsObjectId(this.nativePtr));
    }

    public String asString() {
        return nativeAsString(this.nativePtr);
    }

    public UUID asUUID() {
        return UUID.fromString(nativeAsUUID(this.nativePtr));
    }

    public boolean coercedEquals(NativeRealmAny nativeRealmAny) {
        return nativeEquals(this.nativePtr, nativeRealmAny.nativePtr);
    }

    public <T extends o89> Class<T> getModelClass(OsSharedRealm osSharedRealm, t89 t89Var) {
        return t89Var.f(Table.h(nativeGetRealmModelTableName(this.nativePtr, osSharedRealm.getNativePtr())));
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getRealmModelRowKey() {
        return nativeGetRealmModelRowKey(this.nativePtr);
    }

    public String getRealmModelTableName(OsSharedRealm osSharedRealm) {
        return nativeGetRealmModelTableName(this.nativePtr, osSharedRealm.getNativePtr());
    }

    public e0.a getType() {
        return e0.a.a(nativeGetType(this.nativePtr));
    }

    public NativeRealmAny(Boolean bool) {
        this(nativeCreateBoolean(bool.booleanValue()));
    }

    public NativeRealmAny(Number number) {
        this(nativeCreateLong(number.longValue()));
    }

    public NativeRealmAny(Float f) {
        this(nativeCreateFloat(f.floatValue()));
    }

    public NativeRealmAny(Double d) {
        this(nativeCreateDouble(d.doubleValue()));
    }

    public NativeRealmAny(String str) {
        this(nativeCreateString(str));
    }

    public NativeRealmAny(byte[] bArr) {
        this(nativeCreateBinary(bArr));
    }

    public NativeRealmAny(Date date) {
        this(nativeCreateDate(date.getTime()));
    }

    public NativeRealmAny(ObjectId objectId) {
        this(nativeCreateObjectId(objectId.toString()));
    }

    public NativeRealmAny(Decimal128 decimal128) {
        this(nativeCreateDecimal128(decimal128.s(), decimal128.q()));
    }

    public NativeRealmAny(UUID uuid) {
        this(nativeCreateUUID(uuid.toString()));
    }

    public NativeRealmAny(r89 r89Var) {
        this(createRealmAnyLink(r89Var));
    }

    public NativeRealmAny() {
        this(nativeCreateNull());
    }
}
