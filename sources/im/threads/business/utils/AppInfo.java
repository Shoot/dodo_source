package im.threads.business.utils;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import im.threads.BuildConfig;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import kotlin.Metadata;
/* compiled from: AppInfo.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lim/threads/business/utils/AppInfo;", "", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "appName", "getAppName", "appVersion", "getAppVersion", "libVersion", "getLibVersion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppInfo {
    public final String getAppId() {
        ApplicationInfo applicationInfo = BaseConfig.Companion.getInstance().context.getApplicationInfo();
        if (applicationInfo != null) {
            try {
                String str = applicationInfo.packageName;
                z65.g(str, "applicationInfo.packageName");
                return str;
            } catch (Exception e) {
                LoggerEdna.error("getAppId", e);
                return "";
            }
        }
        return "";
    }

    public final String getAppName() {
        BaseConfig.Companion companion = BaseConfig.Companion;
        ApplicationInfo applicationInfo = companion.getInstance().context.getApplicationInfo();
        if (applicationInfo != null) {
            try {
                return applicationInfo.loadLabel(companion.getInstance().context.getPackageManager()).toString();
            } catch (Exception e) {
                LoggerEdna.error("getAppName", e);
                return "Unknown";
            }
        }
        return "Unknown";
    }

    public final String getAppVersion() {
        PackageInfo packageInfo;
        String str;
        try {
            BaseConfig.Companion companion = BaseConfig.Companion;
            packageInfo = companion.getInstance().context.getPackageManager().getPackageInfo(companion.getInstance().context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            LoggerEdna.error("getAppVersion", e);
            packageInfo = null;
        }
        if (packageInfo == null) {
            str = "";
        } else {
            try {
                str = packageInfo.versionName;
            } catch (Exception unused) {
                return "";
            }
        }
        z65.g(str, "{\n                if (pI…ame else \"\"\n            }");
        return str;
    }

    public final String getLibVersion() {
        return BuildConfig.VERSION_NAME;
    }
}
