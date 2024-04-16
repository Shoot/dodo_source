package com.dodopizza.kustoworker;

import kotlin.Metadata;
/* compiled from: KustoAppEnvironment.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/kustoworker/KustoAppEnvironment;", "", "applicationName", "", "applicationVersion", "environmentName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationName", "()Ljava/lang/String;", "getApplicationVersion", "getEnvironmentName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoAppEnvironment {
    private final String applicationName;
    private final String applicationVersion;
    private final String environmentName;

    public KustoAppEnvironment(String str, String str2, String str3) {
        z65.h(str, "applicationName");
        z65.h(str2, "applicationVersion");
        z65.h(str3, "environmentName");
        this.applicationName = str;
        this.applicationVersion = str2;
        this.environmentName = str3;
    }

    public static /* synthetic */ KustoAppEnvironment copy$default(KustoAppEnvironment kustoAppEnvironment, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kustoAppEnvironment.applicationName;
        }
        if ((i & 2) != 0) {
            str2 = kustoAppEnvironment.applicationVersion;
        }
        if ((i & 4) != 0) {
            str3 = kustoAppEnvironment.environmentName;
        }
        return kustoAppEnvironment.copy(str, str2, str3);
    }

    public final String component1() {
        return this.applicationName;
    }

    public final String component2() {
        return this.applicationVersion;
    }

    public final String component3() {
        return this.environmentName;
    }

    public final KustoAppEnvironment copy(String str, String str2, String str3) {
        z65.h(str, "applicationName");
        z65.h(str2, "applicationVersion");
        z65.h(str3, "environmentName");
        return new KustoAppEnvironment(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KustoAppEnvironment) {
                KustoAppEnvironment kustoAppEnvironment = (KustoAppEnvironment) obj;
                if (!z65.c(this.applicationName, kustoAppEnvironment.applicationName) || !z65.c(this.applicationVersion, kustoAppEnvironment.applicationVersion) || !z65.c(this.environmentName, kustoAppEnvironment.environmentName)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    public final String getEnvironmentName() {
        return this.environmentName;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.applicationName;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.applicationVersion;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.environmentName;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "KustoAppEnvironment(applicationName=" + this.applicationName + ", applicationVersion=" + this.applicationVersion + ", environmentName=" + this.environmentName + ")";
    }
}
