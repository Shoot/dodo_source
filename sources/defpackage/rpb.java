package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.net.URI;
/* compiled from: URLAllowlist.java */
/* renamed from: rpb  reason: default package */
/* loaded from: classes2.dex */
public class rpb {
    private static String[] a;

    public static boolean a(@NonNull URI uri, @NonNull Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        sh.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (a == null) {
            a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
