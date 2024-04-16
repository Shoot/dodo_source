package com.inappstory.sdk.lrudiskcache;

import android.util.Log;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.lrudiskcache.Utils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class CacheJournal {
    public static final int VERSION = 1;
    private long currentSize;
    FileManager fileManager;
    private File journalFile;
    private final Object lock = new Object();
    private final Map<String, CacheJournalItem> itemsLinks = new HashMap();

    public CacheJournal(FileManager fileManager) {
        this.fileManager = fileManager;
        readJournal();
    }

    private void putLink(CacheJournalItem cacheJournalItem) {
        this.itemsLinks.put(cacheJournalItem.getKey(), cacheJournalItem);
        this.currentSize += cacheJournalItem.getSize();
    }

    private void readJournal() {
        DataInputStream dataInputStream;
        CacheJournalItem cacheJournalItem;
        synchronized (this.lock) {
            File journalFile = this.fileManager.getJournalFile();
            this.journalFile = journalFile;
            long j = 0;
            if (journalFile.length() == 0) {
                return;
            }
            DataInputStream dataInputStream2 = null;
            try {
                try {
                    try {
                        dataInputStream = new DataInputStream(new FileInputStream(this.journalFile));
                    } catch (IOException unused) {
                    }
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                try {
                                    dataInputStream2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        e = e;
                        dataInputStream2 = dataInputStream;
                        e.printStackTrace();
                        if (dataInputStream2 != null) {
                            dataInputStream2.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (dataInputStream.readShort() != 1) {
                Log.d(InAppStoryManager.IAS_ERROR_TAG, "Invalid journal " + this.journalFile.getCanonicalPath() + " format version");
                try {
                    dataInputStream.close();
                } catch (IOException unused3) {
                }
                try {
                    dataInputStream.close();
                } catch (IOException unused4) {
                }
                return;
            }
            int readInt = dataInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                String readUTF = dataInputStream.readUTF();
                String readUTF2 = dataInputStream.readUTF();
                long readLong = dataInputStream.readLong();
                long readLong2 = dataInputStream.readLong();
                j += readLong2;
                try {
                    cacheJournalItem = new CacheJournalItem(readUTF, readUTF2, readLong, readLong2, dataInputStream.readLong());
                } catch (Exception unused5) {
                    cacheJournalItem = new CacheJournalItem(readUTF, readUTF2, readLong, readLong2);
                }
                putLink(cacheJournalItem);
            }
            setCurrentCacheSize(j);
            dataInputStream.close();
        }
    }

    private void removeOld(long j, long j2) throws IOException {
        if (this.currentSize + j > j2) {
            ArrayList arrayList = new ArrayList(this.itemsLinks.values());
            Collections.sort(arrayList, new Utils.TimeComparator());
            for (int size = arrayList.size() - 1; size > 0; size--) {
                CacheJournalItem cacheJournalItem = (CacheJournalItem) arrayList.remove(size);
                this.fileManager.delete(cacheJournalItem.getName());
                this.itemsLinks.remove(cacheJournalItem.getKey());
                long size2 = this.currentSize - cacheJournalItem.getSize();
                this.currentSize = size2;
                if (size2 + j < j2) {
                    return;
                }
            }
        }
    }

    private void setCurrentCacheSize(long j) {
        this.currentSize = j;
    }

    private void updateTime(CacheJournalItem cacheJournalItem) {
        if (cacheJournalItem != null) {
            cacheJournalItem.setTime(System.currentTimeMillis());
        }
    }

    public CacheJournalItem delete(String str, boolean z) throws IOException {
        CacheJournalItem remove = this.itemsLinks.remove(str);
        if (remove != null) {
            this.currentSize -= remove.getSize();
            if (z) {
                this.fileManager.delete(remove.getName());
            }
        }
        return remove;
    }

    public CacheJournalItem get(String str) {
        CacheJournalItem cacheJournalItem = this.itemsLinks.get(str);
        updateTime(cacheJournalItem);
        return cacheJournalItem;
    }

    public long getCurrentCacheSize() {
        return this.currentSize;
    }

    public long getJournalSize() {
        return this.journalFile.length();
    }

    public Set<String> keySet() {
        return Collections.unmodifiableSet(this.itemsLinks.keySet());
    }

    public void put(CacheJournalItem cacheJournalItem, long j) throws IOException {
        long size = cacheJournalItem.getSize();
        if (size > j) {
            return;
        }
        removeOld(size, j);
        putLink(cacheJournalItem);
    }

    public void writeJournal() {
        synchronized (this.lock) {
            DataOutputStream dataOutputStream = null;
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(this.journalFile));
                try {
                    dataOutputStream2.writeShort(1);
                    dataOutputStream2.writeInt(this.itemsLinks.size());
                    for (CacheJournalItem cacheJournalItem : this.itemsLinks.values()) {
                        dataOutputStream2.writeUTF(cacheJournalItem.getKey());
                        dataOutputStream2.writeUTF(cacheJournalItem.getName());
                        dataOutputStream2.writeLong(cacheJournalItem.getTime());
                        dataOutputStream2.writeLong(cacheJournalItem.getSize());
                        dataOutputStream2.writeLong(cacheJournalItem.getDownloadedSize());
                    }
                } catch (IOException unused) {
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            } catch (IOException unused3) {
            }
        }
    }
}
