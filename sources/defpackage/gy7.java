package defpackage;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
/* compiled from: PermissionChecker.java */
/* renamed from: gy7  reason: default package */
/* loaded from: classes.dex */
public final class gy7 {
    public static int a(@NonNull Context context, @NonNull String str, int i, int i2, String str2) {
        int b;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = io.c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i2 && p57.a(packageName, str2)) {
            b = io.a(context, i2, c, str2);
        } else {
            b = io.b(context, c, str2);
        }
        if (b == 0) {
            return 0;
        }
        return -2;
    }

    public static int b(@NonNull Context context, @NonNull String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
