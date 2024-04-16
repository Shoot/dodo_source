package im.threads.business.models;

import android.net.Uri;
import kotlin.Metadata;
/* compiled from: FileDescriptionUri.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lim/threads/business/models/FileDescriptionUri;", "", "downloadPath", "", "fileUri", "Landroid/net/Uri;", "(Ljava/lang/String;Landroid/net/Uri;)V", "getDownloadPath", "()Ljava/lang/String;", "getFileUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileDescriptionUri {
    private final String downloadPath;
    private final Uri fileUri;

    public FileDescriptionUri(String str, Uri uri) {
        z65.h(str, "downloadPath");
        z65.h(uri, "fileUri");
        this.downloadPath = str;
        this.fileUri = uri;
    }

    public static /* synthetic */ FileDescriptionUri copy$default(FileDescriptionUri fileDescriptionUri, String str, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileDescriptionUri.downloadPath;
        }
        if ((i & 2) != 0) {
            uri = fileDescriptionUri.fileUri;
        }
        return fileDescriptionUri.copy(str, uri);
    }

    public final String component1() {
        return this.downloadPath;
    }

    public final Uri component2() {
        return this.fileUri;
    }

    public final FileDescriptionUri copy(String str, Uri uri) {
        z65.h(str, "downloadPath");
        z65.h(uri, "fileUri");
        return new FileDescriptionUri(str, uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDescriptionUri)) {
            return false;
        }
        FileDescriptionUri fileDescriptionUri = (FileDescriptionUri) obj;
        if (z65.c(this.downloadPath, fileDescriptionUri.downloadPath) && z65.c(this.fileUri, fileDescriptionUri.fileUri)) {
            return true;
        }
        return false;
    }

    public final String getDownloadPath() {
        return this.downloadPath;
    }

    public final Uri getFileUri() {
        return this.fileUri;
    }

    public int hashCode() {
        return (this.downloadPath.hashCode() * 31) + this.fileUri.hashCode();
    }

    public String toString() {
        String str = this.downloadPath;
        Uri uri = this.fileUri;
        return "FileDescriptionUri(downloadPath=" + str + ", fileUri=" + uri + ")";
    }
}
