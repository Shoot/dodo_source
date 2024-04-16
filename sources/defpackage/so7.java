package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
/* compiled from: PackageManagerHelper.java */
/* renamed from: so7  reason: default package */
/* loaded from: classes.dex */
public class so7 {
    private static final String a = nx5.f("PackageManagerHelper");

    public static void a(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        int i;
        Object obj;
        String str = "disabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            nx5 c = nx5.c();
            String str2 = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (!z) {
                obj = "disabled";
            } else {
                obj = "enabled";
            }
            objArr[1] = obj;
            c.a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            nx5 c2 = nx5.c();
            String str3 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (z) {
                str = "enabled";
            }
            objArr2[1] = str;
            c2.a(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}
