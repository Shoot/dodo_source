package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: unc  reason: default package */
/* loaded from: classes2.dex */
public final class unc {
    private static final Object a = new Object();
    private static boolean b;
    private static String c;
    private static int d;

    public static int a(Context context) {
        b(context);
        return d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    bundle = t8c.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
                if (bundle == null) {
                    return;
                }
                c = bundle.getString("com.google.app.id");
                d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
