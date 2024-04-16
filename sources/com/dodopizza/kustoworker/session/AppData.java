package com.dodopizza.kustoworker.session;

import android.content.Context;
import android.content.pm.PackageInfo;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionData.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/dodopizza/kustoworker/session/AppData;", "", "appName", "", "packageName", "versionName", "versionCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "getVersionCode", "getVersionName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class AppData {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_VERSION_NAME = "0.0";
    private final String appName;
    private final String packageName;
    private final String versionCode;
    private final String versionName;

    /* compiled from: SessionData.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dodopizza/kustoworker/session/AppData$Companion;", "", "()V", "DEFAULT_VERSION_NAME", "", "create", "Lcom/dodopizza/kustoworker/session/AppData;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppData create(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            String valueOf = String.valueOf(packageInfo.versionCode);
            String str = packageInfo.versionName;
            if (str == null) {
                str = AppData.DEFAULT_VERSION_NAME;
            }
            z65.g(packageName, "packageName");
            z65.g(str, "versionName");
            return new AppData(packageName, packageName, str, valueOf);
        }
    }

    public AppData(String str, String str2, String str3, String str4) {
        z65.h(str, "appName");
        z65.h(str2, "packageName");
        z65.h(str3, "versionName");
        z65.h(str4, "versionCode");
        this.appName = str;
        this.packageName = str2;
        this.versionName = str3;
        this.versionCode = str4;
    }

    public static /* synthetic */ AppData copy$default(AppData appData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appData.appName;
        }
        if ((i & 2) != 0) {
            str2 = appData.packageName;
        }
        if ((i & 4) != 0) {
            str3 = appData.versionName;
        }
        if ((i & 8) != 0) {
            str4 = appData.versionCode;
        }
        return appData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.appName;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.versionName;
    }

    public final String component4() {
        return this.versionCode;
    }

    public final AppData copy(String str, String str2, String str3, String str4) {
        z65.h(str, "appName");
        z65.h(str2, "packageName");
        z65.h(str3, "versionName");
        z65.h(str4, "versionCode");
        return new AppData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppData) {
                AppData appData = (AppData) obj;
                if (!z65.c(this.appName, appData.appName) || !z65.c(this.packageName, appData.packageName) || !z65.c(this.versionName, appData.versionName) || !z65.c(this.versionCode, appData.versionCode)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.appName;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.packageName;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.versionName;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.versionCode;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        return "AppData(appName=" + this.appName + ", packageName=" + this.packageName + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ")";
    }
}
