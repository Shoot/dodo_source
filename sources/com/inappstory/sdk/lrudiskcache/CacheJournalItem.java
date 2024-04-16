package com.inappstory.sdk.lrudiskcache;
/* loaded from: classes3.dex */
public class CacheJournalItem {
    private long downloadedSize;
    private String key;
    private String name;
    private long size;
    private long time;

    public CacheJournalItem(String str, String str2, long j, long j2) {
        this.key = str;
        this.name = str2;
        this.time = j;
        this.size = j2;
        this.downloadedSize = j2;
    }

    public void copy(CacheJournalItem cacheJournalItem, long j) {
        set(cacheJournalItem.key, cacheJournalItem.name, j, cacheJournalItem.size);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheJournalItem cacheJournalItem = (CacheJournalItem) obj;
        if (this.time != cacheJournalItem.time || !this.key.equals(cacheJournalItem.key)) {
            return false;
        }
        return this.name.equals(cacheJournalItem.name);
    }

    public long getDownloadedSize() {
        return this.downloadedSize;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        long j = this.time;
        long j2 = this.size;
        return (((((this.key.hashCode() * 31) + this.name.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isReady() {
        if (this.downloadedSize == this.size) {
            return true;
        }
        return false;
    }

    public void set(String str, String str2, long j, long j2) {
        this.key = str;
        this.name = str2;
        this.time = j;
        this.size = j2;
        this.downloadedSize = j2;
    }

    public void setDownloadedSize(long j) {
        this.downloadedSize = j;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public CacheJournalItem(String str, String str2, long j, long j2, long j3) {
        this.key = str;
        this.name = str2;
        this.time = j;
        this.size = j2;
        this.downloadedSize = j3;
    }

    public void set(String str, String str2, long j, long j2, long j3) {
        this.key = str;
        this.name = str2;
        this.time = j;
        this.size = j2;
        this.downloadedSize = j3;
    }
}
