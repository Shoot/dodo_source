package im.threads.business.models;

import android.net.Uri;
import kotlin.Metadata;
/* compiled from: MediaPhoto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lim/threads/business/models/MediaPhoto;", "", "imageUri", "Landroid/net/Uri;", "displayName", "", "bucketName", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "getBucketName", "()Ljava/lang/String;", "getDisplayName", "getImageUri", "()Landroid/net/Uri;", "isChecked", "", "()Z", "setChecked", "(Z)V", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaPhoto {
    private final String bucketName;
    private final String displayName;
    private final Uri imageUri;
    private boolean isChecked;

    public MediaPhoto(Uri uri, String str, String str2) {
        z65.h(uri, "imageUri");
        z65.h(str, "displayName");
        z65.h(str2, "bucketName");
        this.imageUri = uri;
        this.displayName = str;
        this.bucketName = str2;
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public String toString() {
        Uri uri = this.imageUri;
        String str = this.bucketName;
        boolean z = this.isChecked;
        return "MediaPhoto{imagePath='" + uri + "', bucketName='" + str + "', isChecked=" + z + "}";
    }
}
