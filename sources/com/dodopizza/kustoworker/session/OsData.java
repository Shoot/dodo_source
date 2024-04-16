package com.dodopizza.kustoworker.session;

import android.os.Build;
import com.dodopizza.kustoworker.CommonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionData.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/kustoworker/session/OsData;", "", "version", "", "versionName", "sdkVersion", "", "isRooted", "", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "()Z", "getSdkVersion", "()I", "getVersion", "()Ljava/lang/String;", "getVersionName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class OsData {
    public static final Companion Companion = new Companion(null);
    private final boolean isRooted;
    private final int sdkVersion;
    private final String version;
    private final String versionName;

    /* compiled from: SessionData.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/kustoworker/session/OsData$Companion;", "", "()V", "create", "Lcom/dodopizza/kustoworker/session/OsData;", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OsData create() {
            String str = Build.VERSION.RELEASE;
            z65.g(str, "VERSION.RELEASE");
            String str2 = Build.VERSION.CODENAME;
            z65.g(str2, "VERSION.CODENAME");
            return new OsData(str, str2, Build.VERSION.SDK_INT, CommonUtils.INSTANCE.isRooted());
        }
    }

    public OsData(String str, String str2, int i, boolean z) {
        z65.h(str, "version");
        z65.h(str2, "versionName");
        this.version = str;
        this.versionName = str2;
        this.sdkVersion = i;
        this.isRooted = z;
    }

    public static /* synthetic */ OsData copy$default(OsData osData, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = osData.version;
        }
        if ((i2 & 2) != 0) {
            str2 = osData.versionName;
        }
        if ((i2 & 4) != 0) {
            i = osData.sdkVersion;
        }
        if ((i2 & 8) != 0) {
            z = osData.isRooted;
        }
        return osData.copy(str, str2, i, z);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.versionName;
    }

    public final int component3() {
        return this.sdkVersion;
    }

    public final boolean component4() {
        return this.isRooted;
    }

    public final OsData copy(String str, String str2, int i, boolean z) {
        z65.h(str, "version");
        z65.h(str2, "versionName");
        return new OsData(str, str2, i, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OsData) {
                OsData osData = (OsData) obj;
                if (!z65.c(this.version, osData.version) || !z65.c(this.versionName, osData.versionName) || this.sdkVersion != osData.sdkVersion || this.isRooted != osData.isRooted) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        String str = this.version;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.versionName;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i4 = (((i3 + i2) * 31) + this.sdkVersion) * 31;
        boolean z = this.isRooted;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public final boolean isRooted() {
        return this.isRooted;
    }

    public String toString() {
        return "OsData(version=" + this.version + ", versionName=" + this.versionName + ", sdkVersion=" + this.sdkVersion + ", isRooted=" + this.isRooted + ")";
    }
}
