package defpackage;

import android.net.Uri;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
/* compiled from: MediaStoreUtil.java */
/* renamed from: oc6  reason: default package */
/* loaded from: classes.dex */
public final class oc6 {
    public static boolean a(Uri uri) {
        if (c(uri) && uri.getPathSegments().contains("picker")) {
            return true;
        }
        return false;
    }

    public static boolean b(Uri uri) {
        if (c(uri) && !f(uri)) {
            return true;
        }
        return false;
    }

    public static boolean c(Uri uri) {
        if (uri != null && RemoteMessageConst.Notification.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean d(Uri uri) {
        if (c(uri) && f(uri)) {
            return true;
        }
        return false;
    }

    public static boolean e(int i, int i2) {
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            return true;
        }
        return false;
    }

    private static boolean f(Uri uri) {
        return uri.getPathSegments().contains(ElementGenerator.TYPE_VIDEO);
    }
}
