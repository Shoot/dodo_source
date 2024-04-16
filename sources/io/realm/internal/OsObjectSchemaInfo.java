package io.realm.internal;

import io.realm.RealmFieldType;
/* loaded from: classes3.dex */
public class OsObjectSchemaInfo implements ku6 {
    private static final long b = nativeGetFinalizerPtr();
    private long a;

    /* loaded from: classes3.dex */
    public static class b {
        private final String a;
        private final String b;
        private final long[] c;
        private final boolean d;
        private final long[] f;
        private int e = 0;
        private int g = 0;

        public b(String str, String str2, boolean z, int i, int i2) {
            this.b = str;
            this.a = str2;
            this.d = z;
            this.c = new long[i];
            this.f = new long[i2];
        }

        public b a(String str, String str2, RealmFieldType realmFieldType, String str3) {
            long nativeCreatePersistedLinkProperty = Property.nativeCreatePersistedLinkProperty(str2, str, Property.a(realmFieldType, false), str3);
            long[] jArr = this.c;
            int i = this.e;
            jArr[i] = nativeCreatePersistedLinkProperty;
            this.e = i + 1;
            return this;
        }

        public b b(String str, String str2, RealmFieldType realmFieldType, boolean z, boolean z2, boolean z3) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.a(realmFieldType, z3), z, z2);
            long[] jArr = this.c;
            int i = this.e;
            jArr[i] = nativeCreatePersistedProperty;
            this.e = i + 1;
            return this;
        }

        public b c(String str, String str2, RealmFieldType realmFieldType, boolean z) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.a(realmFieldType, z), false, false);
            long[] jArr = this.c;
            int i = this.e;
            jArr[i] = nativeCreatePersistedProperty;
            this.e = i + 1;
            return this;
        }

        public OsObjectSchemaInfo d() {
            if (this.e != -1 && this.g != -1) {
                OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.b, this.a, this.d);
                OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.a, this.c, this.f);
                this.e = -1;
                this.g = -1;
                return osObjectSchemaInfo;
            }
            throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetProperty(long j, String str);

    public Property c(String str) {
        return new Property(nativeGetProperty(this.a, str));
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return b;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }

    private OsObjectSchemaInfo(String str, String str2, boolean z) {
        this(nativeCreateRealmObjectSchema(str, str2, z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsObjectSchemaInfo(long j) {
        this.a = j;
        c.c.a(this);
    }
}
