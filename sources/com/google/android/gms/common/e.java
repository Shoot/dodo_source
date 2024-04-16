package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.RestrictedInheritance;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class e {
    private static e c;
    private final Context a;
    private volatile String b;

    public e(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    @NonNull
    public static e a(@NonNull Context context) {
        gh8.j(context);
        synchronized (e.class) {
            try {
                if (c == null) {
                    r.d(context);
                    c = new e(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    static final n d(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        o oVar = new o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(oVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }

    public static final boolean e(@NonNull PackageInfo packageInfo, boolean z) {
        n d;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z) {
                d = d(packageInfo, q.a);
            } else {
                d = d(packageInfo, q.a[0]);
            }
            if (d != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final w f(String str, boolean z, boolean z2) {
        w c2;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return w.c("null pkg");
        }
        if (!str.equals(this.b)) {
            if (r.e()) {
                c2 = r.b(str, d.e(this.a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                    boolean e = d.e(this.a);
                    if (packageInfo == null) {
                        c2 = w.c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            o oVar = new o(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            w a = r.a(str2, oVar, e, false);
                            if (a.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && r.a(str2, oVar, false, true).a) {
                                c2 = w.c("debuggable release cert app rejected");
                            } else {
                                c2 = a;
                            }
                        } else {
                            c2 = w.c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    return w.d("no pkg ".concat(str), e2);
                }
            }
            if (c2.a) {
                this.b = str;
            }
            return c2;
        }
        return w.b();
    }

    public boolean b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (d.e(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i) {
        w c2;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2 = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c2 = f(packagesForUid[i2], false, false);
                    if (c2.a) {
                        break;
                    }
                    i2++;
                } else {
                    gh8.j(c2);
                    break;
                }
            }
        } else {
            c2 = w.c("no pkgs");
        }
        c2.e();
        return c2.a;
    }
}
