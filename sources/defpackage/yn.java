package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
/* compiled from: AppData.java */
/* renamed from: yn  reason: default package */
/* loaded from: classes2.dex */
public class yn {
    public final String a;
    public final String b;
    public final List<lh0> c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final p13 h;

    public yn(String str, String str2, List<lh0> list, String str3, String str4, String str5, String str6, p13 p13Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = p13Var;
    }

    public static yn a(Context context, gt4 gt4Var, String str, String str2, List<lh0> list, p13 p13Var) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g = gt4Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new yn(str, str2, list, g, packageName, b, str3, p13Var);
    }

    private static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }
}
