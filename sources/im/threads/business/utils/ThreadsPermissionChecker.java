package im.threads.business.utils;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ThreadsPermissionChecker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\n"}, d2 = {"Lim/threads/business/utils/ThreadsPermissionChecker;", "", "()V", "isCameraPermissionGranted", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "isReadExternalPermissionGranted", "isRecordAudioPermissionGranted", "isWriteExternalPermissionGranted", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadsPermissionChecker {
    public static final ThreadsPermissionChecker INSTANCE = new ThreadsPermissionChecker();

    private ThreadsPermissionChecker() {
    }

    public static final boolean isCameraPermissionGranted(Context context) {
        if (context == null || gy7.b(context, "android.permission.CAMERA") != 0) {
            return false;
        }
        return true;
    }

    public static final boolean isReadExternalPermissionGranted(Context context) {
        boolean z;
        String[] strArr;
        int i;
        if (context == null) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i2 == 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        } else {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        if (z) {
            i = yr.I(strArr, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        } else {
            i = -1;
        }
        if (i > 0 && gy7.b(context, strArr[i]) == 0) {
            return true;
        }
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (gy7.b(context, strArr[i3]) == -1 && i3 != i) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isRecordAudioPermissionGranted(Context context) {
        if (context == null || gy7.b(context, "android.permission.RECORD_AUDIO") != 0) {
            return false;
        }
        return true;
    }

    public static final boolean isWriteExternalPermissionGranted(Context context) {
        if (context == null || gy7.b(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }
}
