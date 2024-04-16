package im.threads.ui.permissions;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: PermissionsChecker.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\tH\u0002J'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lim/threads/ui/permissions/PermissionsChecker;", "", "()V", "clickedNeverAskAgain", "", "activity", "Landroid/app/Activity;", "permissions", "", "", "(Landroid/app/Activity;[Ljava/lang/String;)Z", "permission", "permissionDenied", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "permissionsDenied", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionsChecker {
    public static final PermissionsChecker INSTANCE = new PermissionsChecker();

    private PermissionsChecker() {
    }

    private final boolean permissionDenied(Context context, String str) {
        if (iu1.a(context, str) == -1) {
            return true;
        }
        return false;
    }

    public final boolean clickedNeverAskAgain(Activity activity, String... strArr) {
        z65.h(activity, "activity");
        z65.h(strArr, "permissions");
        for (String str : strArr) {
            boolean permissionDenied = permissionDenied(activity, str);
            boolean clickedNeverAskAgain = clickedNeverAskAgain(activity, str);
            if (permissionDenied && !clickedNeverAskAgain) {
                return false;
            }
        }
        return true;
    }

    public final boolean permissionsDenied(Activity activity, String... strArr) {
        z65.h(activity, "activity");
        z65.h(strArr, "permissions");
        for (String str : strArr) {
            if (permissionDenied(activity, str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean clickedNeverAskAgain(Activity activity, String str) {
        return !l5.w(activity, str);
    }
}
