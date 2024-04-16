package io.realm.internal;

import io.realm.j0;
/* loaded from: classes3.dex */
public class OsObjectStore {
    public static boolean a(j0 j0Var, Runnable runnable) {
        return nativeCallWithLock(j0Var.k(), runnable);
    }

    public static String b(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.d() + str);
    }

    public static long c(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    public static void d(OsSharedRealm osSharedRealm, long j) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j);
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native String nativeGetPrimaryKeyForObject(long j, String str);

    private static native long nativeGetSchemaVersion(long j);

    private static native void nativeSetSchemaVersion(long j, long j2);
}
