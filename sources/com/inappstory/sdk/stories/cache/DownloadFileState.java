package com.inappstory.sdk.stories.cache;

import java.io.File;
/* loaded from: classes3.dex */
public class DownloadFileState {
    public long downloadedSize;
    public File file;
    public long totalSize;

    public DownloadFileState(File file, long j, long j2) {
        this.file = file;
        this.totalSize = j;
        this.downloadedSize = j2;
    }

    public File getFullFile() {
        if (this.downloadedSize == this.totalSize && this.file.exists()) {
            return this.file;
        }
        return null;
    }
}
