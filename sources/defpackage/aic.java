package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
/* renamed from: aic  reason: default package */
/* loaded from: classes3.dex */
public class aic {
    private static final String a = "h";

    public static String a(String str) {
        Context a2 = nec.a();
        if (a2 == null) {
            return "";
        }
        try {
            return a2.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = a;
            xhc.d(str2, "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            String str3 = a;
            xhc.d(str3, "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            xhc.d(a, "throwable");
            return "";
        }
    }
}
