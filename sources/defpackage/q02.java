package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: q02  reason: default package */
/* loaded from: classes2.dex */
public final class q02 {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(@NonNull Context context, @NonNull Throwable th) {
        try {
            gh8.j(context);
            gh8.j(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
