package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.internal.OsSharedRealm;
import io.realm.j0;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
/* loaded from: classes3.dex */
public class OsRealmConfig implements ku6 {
    private static final long j = nativeGetFinalizerPtr();
    private final Object a;
    private final Object b;
    private final j0 c;
    private final URI d;
    private final long e;
    private final io.realm.internal.c f;
    private final CompactOnLaunchCallback g;
    private final OsSharedRealm.MigrationCallback h;
    private final OsSharedRealm.InitializationCallback i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b {
        private j0 a;
        private OsSchemaInfo b = null;
        private OsSharedRealm.MigrationCallback c = null;
        private OsSharedRealm.InitializationCallback d = null;
        private boolean e = false;
        private String f = "";

        public b(j0 j0Var) {
            this.a = j0Var;
        }

        public b a(boolean z) {
            this.e = z;
            return this;
        }

        public OsRealmConfig b() {
            return new OsRealmConfig(this.a, this.f, this.e, this.b, this.c, this.d, null);
        }

        public b c(File file) {
            this.f = file.getAbsolutePath();
            return this;
        }

        public b d(OsSharedRealm.InitializationCallback initializationCallback) {
            this.d = initializationCallback;
            return this;
        }

        public b e(OsSharedRealm.MigrationCallback migrationCallback) {
            this.c = migrationCallback;
            return this;
        }

        public b f(OsSchemaInfo osSchemaInfo) {
            this.b = osSchemaInfo;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        FULL(0),
        MEM_ONLY(1);
        
        final int a;

        c(int i) {
            this.a = i;
        }
    }

    /* loaded from: classes3.dex */
    public enum d {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_SOFT_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 5),
        SCHEMA_MODE_MANUAL((byte) 7);
        
        final byte a;

        d(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }
    }

    /* synthetic */ OsRealmConfig(j0 j0Var, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, a aVar) {
        this(j0Var, str, z, osSchemaInfo, migrationCallback, initializationCallback);
    }

    private String b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress.getHostName() != null) {
            return inetSocketAddress.getHostName();
        }
        if (inetSocketAddress.getAddress() != null) {
            InetAddress address = inetSocketAddress.getAddress();
            if (address.getHostName() != null) {
                return address.getHostName();
            }
            return address.getHostAddress();
        }
        return null;
    }

    private static native long nativeCreate(String str, String str2, boolean z, long j2);

    private native String nativeCreateAndSetSyncConfig(long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, byte b2, String str7, String str8, String[] strArr, byte b3, Object obj, Object obj2, String str9, Object obj3);

    private static native void nativeEnableChangeNotification(long j2, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j2, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j2, byte[] bArr);

    private static native void nativeSetInMemory(long j2, boolean z);

    private native void nativeSetInitializationCallback(long j2, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j2, byte b2, long j3, long j4, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j2, byte b2, String str, int i);

    private static native void nativeSetSyncConfigSslSettings(long j2, boolean z, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.realm.internal.c a() {
        return this.f;
    }

    public j0 c() {
        return this.c;
    }

    public URI d() {
        return this.d;
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return j;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private OsRealmConfig(io.realm.j0 r38, java.lang.String r39, boolean r40, io.realm.internal.OsSchemaInfo r41, io.realm.internal.OsSharedRealm.MigrationCallback r42, io.realm.internal.OsSharedRealm.InitializationCallback r43) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.OsRealmConfig.<init>(io.realm.j0, java.lang.String, boolean, io.realm.internal.OsSchemaInfo, io.realm.internal.OsSharedRealm$MigrationCallback, io.realm.internal.OsSharedRealm$InitializationCallback):void");
    }
}
