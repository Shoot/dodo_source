package defpackage;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zze;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* renamed from: xuc  reason: default package */
/* loaded from: classes2.dex */
public final class xuc extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (str != "com.google.android.gms.iid.MessengerCompat" && (str == null || !str.equals("com.google.android.gms.iid.MessengerCompat"))) {
            return super.loadClass(str, z);
        }
        if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return zze.class;
        }
        return zze.class;
    }
}
