package io.realm.internal;

import ch.qos.logback.core.CoreConstants;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmError;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidRealmNotifier;
import io.realm.j0;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Keep
/* loaded from: classes3.dex */
public final class OsSharedRealm implements Closeable, ku6 {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final ao0 capabilities;
    public final c context;
    final List<WeakReference<OsResults.a>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<f>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    @Keep
    /* loaded from: classes3.dex */
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    @Keep
    /* loaded from: classes3.dex */
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2);
    }

    @Keep
    /* loaded from: classes3.dex */
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    /* loaded from: classes3.dex */
    public static class a implements Comparable<a> {
        public static final a c = new a(-1, -1);
        public final long a;
        public final long b;

        a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            if (aVar != null) {
                long j = this.a;
                long j2 = aVar.a;
                if (j > j2) {
                    return 1;
                }
                if (j < j2) {
                    return -1;
                }
                return 0;
            }
            throw new IllegalArgumentException("Version cannot be compared to a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.a;
            long j2 = this.b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "VersionID{version=" + this.a + ", index=" + this.b + CoreConstants.CURLY_RIGHT;
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        uf ufVar = new uf();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, ufVar);
        c a2 = osRealmConfig.a();
        this.context = a2;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long nativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.getNativePtr(), aVar.a, aVar.b, androidRealmNotifier);
            this.nativePtr = nativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativeGetSharedRealm), this);
            a2.a(this);
            this.capabilities = ufVar;
            this.realmNotifier = androidRealmNotifier;
            if (aVar.equals(a.c)) {
                nativeSetAutoRefresh(nativeGetSharedRealm, ufVar.c());
            }
        } catch (Throwable th) {
            try {
                for (OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                this.tempSharedRealmsForCallback.clear();
                sharedRealmsUnderConstruction.remove(this);
                throw th2;
            }
        }
    }

    private void detachIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                aVar.b();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        for (WeakReference<f> weakReference : this.pendingRows) {
            f fVar = weakReference.get();
            if (fVar != null) {
                fVar.c();
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(j0 j0Var, a aVar) {
        return getInstance(new OsRealmConfig.b(j0Var), aVar);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory != null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("failed to create temporary directory: " + absolutePath);
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        nativeInit(absolutePath);
        temporaryDirectory = file;
    }

    private static native void nativeBeginTransaction(long j);

    private static native void nativeCancelTransaction(long j);

    private static native void nativeCloseSharedRealm(long j);

    private static native void nativeCommitTransaction(long j);

    private static native boolean nativeCompact(long j);

    private static native long nativeCreateTable(long j, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j, String str, String str2, int i, boolean z);

    private static native long nativeFreeze(long j);

    private static native long nativeGetActiveSubscriptionSet(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetLatestSubscriptionSet(long j);

    private static native long nativeGetSchemaInfo(long j);

    private static native long nativeGetSharedRealm(long j, long j2, long j3, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j, String str);

    private static native String[] nativeGetTablesName(long j);

    private static native long[] nativeGetVersionID(long j);

    private static native boolean nativeHasTable(long j, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j);

    private static native boolean nativeIsClosed(long j);

    private static native boolean nativeIsEmpty(long j);

    private static native boolean nativeIsFrozen(long j);

    private static native boolean nativeIsInTransaction(long j);

    private static native long nativeNumberOfVersions(long j);

    private static native void nativeRefresh(long j);

    private static native void nativeRegisterSchemaChangedCallback(long j, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j, String str, String str2);

    private static native void nativeSetAutoRefresh(long j, boolean z);

    private static native long nativeSize(long j);

    private static native void nativeStopWaitForChange(long j);

    private static native boolean nativeWaitForChange(long j);

    private static native void nativeWriteCopy(long j, String str, byte[] bArr);

    private static void runInitializationCallback(long j, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j, osRealmConfig));
    }

    private static void runMigrationCallback(long j, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j2) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j, osRealmConfig), j2, osRealmConfig.c().p());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addIterator(OsResults.a aVar) {
        this.iterators.add(new WeakReference<>(aVar));
    }

    void addPendingRow(f fVar) {
        this.pendingRows.add(new WeakReference<>(fVar));
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z));
    }

    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    public j0 getConfiguration() {
        return this.osRealmConfig.c();
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.c().k();
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public String[] getTablesNames() {
        String[] nativeGetTablesName = nativeGetTablesName(this.nativePtr);
        if (nativeGetTablesName == null) {
            return new String[0];
        }
        return nativeGetTablesName;
    }

    public a getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (nativeGetVersionID != null) {
            return new a(nativeGetVersionID[0], nativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void invalidateIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                aVar.f();
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean isSyncRealm() {
        if (this.osRealmConfig.d() != null) {
            return true;
        }
        return false;
    }

    public void refresh() {
        if (!isFrozen()) {
            nativeRefresh(this.nativePtr);
            return;
        }
        throw new IllegalStateException("It is not possible to refresh frozen Realms.");
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removePendingRow(f fVar) {
        for (WeakReference<f> weakReference : this.pendingRows) {
            f fVar2 = weakReference.get();
            if (fVar2 == null || fVar2 == fVar) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    public void renameTable(String str, String str2) {
        try {
            nativeRenameTable(this.nativePtr, str, str2);
        } catch (IllegalArgumentException e) {
            throw new RealmError(e.getMessage());
        }
    }

    public void setAutoRefresh(boolean z) {
        this.capabilities.b(null);
        nativeSetAutoRefresh(this.nativePtr, z);
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file, byte[] bArr) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        if (isSyncRealm()) {
            Util.a("writeCopyTo() cannot be called from the main thread when using synchronized Realms.");
        }
        try {
            nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (message.contains("Could not write file as not all client changes are integrated in server")) {
                throw new IllegalStateException(message);
            }
            throw e;
        }
    }

    public static OsSharedRealm getInstance(OsRealmConfig.b bVar, a aVar) {
        OsRealmConfig b = bVar.b();
        d.e().j(b);
        return new OsSharedRealm(b, aVar);
    }

    OsSharedRealm(long j, OsRealmConfig osRealmConfig) {
        this(j, osRealmConfig, osRealmConfig.a());
        for (OsSharedRealm osSharedRealm : sharedRealmsUnderConstruction) {
            if (osSharedRealm.context == osRealmConfig.a()) {
                osSharedRealm.tempSharedRealmsForCallback.add(this);
                return;
            }
        }
        throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
    }

    OsSharedRealm(long j, OsRealmConfig osRealmConfig, c cVar) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j), this);
        this.context = cVar;
        cVar.a(this);
        this.capabilities = new uf();
        this.realmNotifier = null;
        nativeSetAutoRefresh(j, false);
    }
}
