package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: fzc  reason: default package */
/* loaded from: classes2.dex */
public final class fzc {
    private static final lr<String, Uri> a = new lr<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (fzc.class) {
            lr<String, Uri> lrVar = a;
            uri = lrVar.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                lrVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            if (!str2.contains("dev-keys") && !str2.contains("test-keys")) {
                return false;
            }
            return true;
        }
        return false;
    }
}
