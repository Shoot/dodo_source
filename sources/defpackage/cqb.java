package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.e;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: cqb  reason: default package */
/* loaded from: classes2.dex */
public final class cqb {
    public static boolean a(@NonNull Context context, int i) {
        if (!b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return e.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(@NonNull Context context, int i, @NonNull String str) {
        return t8c.a(context).g(i, str);
    }
}
