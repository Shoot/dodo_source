package im.threads.business.models;

import android.net.Uri;
import kotlin.Metadata;
/* compiled from: PhotoBucketItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lim/threads/business/models/PhotoBucketItem;", "", "bucketName", "", "bucketSize", "imagePath", "Landroid/net/Uri;", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "getBucketName", "()Ljava/lang/String;", "getBucketSize", "getImagePath", "()Landroid/net/Uri;", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhotoBucketItem {
    private final String bucketName;
    private final String bucketSize;
    private final Uri imagePath;

    public PhotoBucketItem(String str, String str2, Uri uri) {
        z65.h(str, "bucketName");
        z65.h(str2, "bucketSize");
        z65.h(uri, "imagePath");
        this.bucketName = str;
        this.bucketSize = str2;
        this.imagePath = uri;
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public final String getBucketSize() {
        return this.bucketSize;
    }

    public final Uri getImagePath() {
        return this.imagePath;
    }

    public String toString() {
        String str = this.bucketName;
        String str2 = this.bucketSize;
        Uri uri = this.imagePath;
        return "PhotoBucketItem{bucketName='" + str + "', bucketSize='" + str2 + "', imagePath='" + uri + "'}";
    }
}
