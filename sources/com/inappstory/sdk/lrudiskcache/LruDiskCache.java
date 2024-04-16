package com.inappstory.sdk.lrudiskcache;

import com.inappstory.sdk.stories.cache.DownloadFileState;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class LruDiskCache {
    public static final long MB_1 = 1048576;
    public static final long MB_10 = 10485760;
    public static final long MB_100 = 104857600;
    public static final long MB_200 = 209715200;
    public static final long MB_2000 = 2097152000;
    public static final long MB_5 = 5242880;
    public static final long MB_50 = 52428800;
    private static Object cacheLock = new Object();
    private static LruDiskCache commonCache;
    private static LruDiskCache fastCache;
    private static LruDiskCache infiniteCache;
    private long cacheSize;
    public CacheType cacheType;
    private final CacheJournal journal;
    private FileManager manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CacheType.values().length];
            a = iArr;
            try {
                iArr[CacheType.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CacheType.FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CacheType.INFINITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private LruDiskCache(File file, String str, long j, CacheType cacheType) throws IOException {
        FileManager fileManager = new FileManager(file, str);
        this.manager = fileManager;
        this.journal = new CacheJournal(fileManager);
        this.cacheSize = j;
        this.cacheType = cacheType;
    }

    public static void clear() throws IOException {
        LruDiskCache lruDiskCache = fastCache;
        if (lruDiskCache != null) {
            lruDiskCache.clearCache();
        }
        LruDiskCache lruDiskCache2 = commonCache;
        if (lruDiskCache2 != null) {
            lruDiskCache2.clearCache();
        }
        LruDiskCache lruDiskCache3 = infiniteCache;
        if (lruDiskCache3 != null) {
            lruDiskCache3.clearCache();
        }
        fastCache = null;
        commonCache = null;
        infiniteCache = null;
    }

    public static LruDiskCache create(File file, String str, long j, CacheType cacheType) throws IOException {
        long j2;
        synchronized (cacheLock) {
            if (j < 1048576) {
                j2 = 1048576;
            } else {
                j2 = j;
            }
            try {
                int i = a.a[cacheType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        if (infiniteCache == null) {
                            infiniteCache = new LruDiskCache(file, str + "infiniteCache", j2, cacheType);
                        }
                        return infiniteCache;
                    }
                    if (fastCache == null) {
                        fastCache = new LruDiskCache(file, str + "fastCache", j2, cacheType);
                    }
                    return fastCache;
                }
                if (commonCache == null) {
                    commonCache = new LruDiskCache(file, str + "commonCache", j2, cacheType);
                }
                return commonCache;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void keyIsValid(String str) {
        if (str != null && str.length() != 0) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid key value: '%s'", str));
    }

    public void clearCache() throws IOException {
        synchronized (this.journal) {
            try {
                for (String str : new HashSet(this.journal.keySet())) {
                    delete(str, false);
                }
                this.journal.writeJournal();
            } catch (Throwable th) {
                throw th;
            }
        }
        FileManager.deleteFolderRecursive(getCacheDir(), false);
    }

    public void delete(String str) throws IOException {
        delete(str, true);
    }

    public DownloadFileState get(String str) {
        synchronized (this.journal) {
            try {
                try {
                    keyIsValid(str);
                    CacheJournalItem cacheJournalItem = this.journal.get(str);
                    if (cacheJournalItem != null) {
                        File file = new File(cacheJournalItem.getName());
                        if (!file.exists()) {
                            this.journal.delete(str, false);
                            file = null;
                        }
                        this.journal.writeJournal();
                        if (file != null) {
                            return new DownloadFileState(file, cacheJournalItem.getSize(), cacheJournalItem.getDownloadedSize());
                        }
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public File getCacheDir() {
        return this.manager.getCacheDir();
    }

    public long getCacheSize() {
        long j;
        synchronized (this.journal) {
            j = this.cacheSize;
        }
        return j;
    }

    public File getFileFromKey(String str) {
        return new File(getCacheDir().getAbsolutePath() + File.separator + getNameFromKey(str));
    }

    public long getFreeSpace() {
        long currentCacheSize;
        synchronized (this.journal) {
            currentCacheSize = this.cacheSize - this.journal.getCurrentCacheSize();
        }
        return currentCacheSize;
    }

    public File getFullFile(String str) {
        return FileManager.getFullFile(get(str));
    }

    public long getJournalSize() {
        long journalSize;
        synchronized (this.journal) {
            journalSize = this.journal.getJournalSize();
        }
        return journalSize;
    }

    public String getNameFromKey(String str) {
        return Utils.hash(str);
    }

    public long getUsedSpace() {
        long currentCacheSize;
        synchronized (this.journal) {
            currentCacheSize = this.journal.getCurrentCacheSize();
        }
        return currentCacheSize;
    }

    public boolean hasKey(String str) {
        boolean z;
        synchronized (this.journal) {
            keyIsValid(str);
            if (this.journal.get(str) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public Set<String> keySet() {
        Set<String> keySet;
        synchronized (this.journal) {
            keySet = this.journal.keySet();
        }
        return keySet;
    }

    public File put(String str, File file) throws IOException {
        File put;
        synchronized (this.journal) {
            keyIsValid(str);
            String absolutePath = file.getAbsolutePath();
            CacheJournalItem cacheJournalItem = new CacheJournalItem(str, absolutePath, System.currentTimeMillis(), this.manager.getFileSize(file));
            put = this.manager.put(file, absolutePath);
            this.journal.delete(str, false);
            this.journal.put(cacheJournalItem, this.cacheSize);
            this.journal.writeJournal();
        }
        return put;
    }

    public void setCacheSize(long j) {
        synchronized (this.journal) {
            this.cacheSize = j;
        }
    }

    private void delete(String str, boolean z) throws IOException {
        synchronized (this.journal) {
            try {
                keyIsValid(str);
                if (this.journal.delete(str, true) != null && z) {
                    this.journal.writeJournal();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public File put(String str, File file, long j, long j2) throws IOException {
        File put;
        synchronized (this.journal) {
            keyIsValid(str);
            String absolutePath = file.getAbsolutePath();
            CacheJournalItem cacheJournalItem = new CacheJournalItem(str, absolutePath, System.currentTimeMillis(), j, j2);
            put = this.manager.put(file, absolutePath);
            this.journal.delete(str, false);
            this.journal.put(cacheJournalItem, this.cacheSize);
            this.journal.writeJournal();
        }
        return put;
    }
}
