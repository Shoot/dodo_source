package im.threads.business.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MediaHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\r"}, d2 = {"Lim/threads/business/utils/MediaHelper;", "", "()V", "getAllPhotos", "Landroid/database/Cursor;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "grantPermissionsForImageUri", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "imageUri", "Landroid/net/Uri;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaHelper {
    public static final MediaHelper INSTANCE = new MediaHelper();

    private MediaHelper() {
    }

    public static final Cursor getAllPhotos(Context context) {
        if (context == null) {
            return null;
        }
        return context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_display_name", "bucket_display_name", "_id"}, "mime_type = ? OR mime_type = ?", new String[]{"image/png", "image/jpeg"}, "datetaken desc");
    }

    public static final void grantPermissionsForImageUri(Context context, Intent intent, Uri uri) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (intent != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            z65.g(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
            if (!queryIntentActivities.isEmpty()) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str = resolveInfo.activityInfo.packageName;
                    context.grantUriPermission(str, uri, 1);
                    context.grantUriPermission(str, uri, 2);
                }
            }
        }
    }
}
