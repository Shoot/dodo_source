package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: ApplicationVersionSignature.java */
/* renamed from: up  reason: default package */
/* loaded from: classes.dex */
public final class up {
    private static final ConcurrentMap<String, se5> a = new ConcurrentHashMap();

    private static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @NonNull
    private static String b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @NonNull
    public static se5 c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, se5> concurrentMap = a;
        se5 se5Var = concurrentMap.get(packageName);
        if (se5Var == null) {
            se5 d = d(context);
            se5 putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return d;
        }
        return se5Var;
    }

    @NonNull
    private static se5 d(@NonNull Context context) {
        return new e57(b(a(context)));
    }
}
