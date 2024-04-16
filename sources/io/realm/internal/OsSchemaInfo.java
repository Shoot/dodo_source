package io.realm.internal;

import java.util.Collection;
/* loaded from: classes3.dex */
public class OsSchemaInfo implements ku6 {
    private static final long c = nativeGetFinalizerPtr();
    private long a;
    private final OsSharedRealm b;

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.a = nativeCreateFromList(a(collection));
        c.c.a(this);
        this.b = null;
    }

    private static long[] a(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (OsObjectSchemaInfo osObjectSchemaInfo : collection) {
            jArr[i] = osObjectSchemaInfo.getNativePtr();
            i++;
        }
        return jArr;
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j, String str);

    public OsObjectSchemaInfo b(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.a, str));
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return c;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsSchemaInfo(long j, OsSharedRealm osSharedRealm) {
        this.a = j;
        this.b = osSharedRealm;
    }
}
