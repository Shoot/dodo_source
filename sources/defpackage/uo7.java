package defpackage;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: uo7  reason: default package */
/* loaded from: classes2.dex */
public class uo7 {
    @NonNull
    protected final Context a;

    public uo7(@NonNull Context context) {
        this.a = context;
    }

    public int a(@NonNull String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public int b(@NonNull String str, @NonNull String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    public ApplicationInfo c(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    public CharSequence d(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    public PackageInfo e(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean f() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return h55.a(this.a);
        }
        if (ad8.h() && (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = this.a.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    @TargetApi(19)
    public final boolean g(int i, @NonNull String str) {
        if (ad8.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
