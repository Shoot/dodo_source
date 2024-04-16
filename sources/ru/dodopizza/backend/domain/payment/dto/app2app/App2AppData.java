package ru.dodopizza.backend.domain.payment.dto.app2app;

import kotlin.Metadata;
/* compiled from: App2AppData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/app2app/App2AppData;", "", "osType", "", "kaspiDeepLink", "(Ljava/lang/String;Ljava/lang/String;)V", "getKaspiDeepLink", "()Ljava/lang/String;", "getOsType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class App2AppData {
    @uca("deeplink")
    private final String kaspiDeepLink;
    @uca("osType")
    private final String osType;

    public App2AppData(String str, String str2) {
        z65.h(str, "osType");
        z65.h(str2, "kaspiDeepLink");
        this.osType = str;
        this.kaspiDeepLink = str2;
    }

    public static /* synthetic */ App2AppData copy$default(App2AppData app2AppData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = app2AppData.osType;
        }
        if ((i & 2) != 0) {
            str2 = app2AppData.kaspiDeepLink;
        }
        return app2AppData.copy(str, str2);
    }

    public final String component1() {
        return this.osType;
    }

    public final String component2() {
        return this.kaspiDeepLink;
    }

    public final App2AppData copy(String str, String str2) {
        z65.h(str, "osType");
        z65.h(str2, "kaspiDeepLink");
        return new App2AppData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof App2AppData)) {
            return false;
        }
        App2AppData app2AppData = (App2AppData) obj;
        if (z65.c(this.osType, app2AppData.osType) && z65.c(this.kaspiDeepLink, app2AppData.kaspiDeepLink)) {
            return true;
        }
        return false;
    }

    public final String getKaspiDeepLink() {
        return this.kaspiDeepLink;
    }

    public final String getOsType() {
        return this.osType;
    }

    public int hashCode() {
        return (this.osType.hashCode() * 31) + this.kaspiDeepLink.hashCode();
    }

    public String toString() {
        String str = this.osType;
        String str2 = this.kaspiDeepLink;
        return "App2AppData(osType=" + str + ", kaspiDeepLink=" + str2 + ")";
    }
}
