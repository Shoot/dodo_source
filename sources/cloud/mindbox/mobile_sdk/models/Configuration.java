package cloud.mindbox.mobile_sdk.models;

import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.MindboxConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Configuration.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BW\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0010HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016¨\u00060"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/Configuration;", "", "mindboxConfiguration", "Lcloud/mindbox/mobile_sdk/MindboxConfiguration;", "(Lcloud/mindbox/mobile_sdk/MindboxConfiguration;)V", "configurationId", "", "previousInstallationId", "", "previousDeviceUUID", "endpointId", "domain", "packageName", "versionName", "versionCode", "subscribeCustomerIfCreated", "", "shouldCreateCustomer", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getConfigurationId", "()J", "getDomain", "()Ljava/lang/String;", "getEndpointId", "getPackageName", "getPreviousDeviceUUID", "getPreviousInstallationId", "getShouldCreateCustomer", "()Z", "getSubscribeCustomerIfCreated", "getVersionCode", "getVersionName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Configuration {
    private final long configurationId;
    private final String domain;
    private final String endpointId;
    private final String packageName;
    private final String previousDeviceUUID;
    private final String previousInstallationId;
    private final boolean shouldCreateCustomer;
    private final boolean subscribeCustomerIfCreated;
    private final String versionCode;
    private final String versionName;

    public Configuration(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        z65.h(str, "previousInstallationId");
        z65.h(str2, "previousDeviceUUID");
        z65.h(str3, "endpointId");
        z65.h(str4, "domain");
        z65.h(str5, "packageName");
        z65.h(str6, "versionName");
        z65.h(str7, "versionCode");
        this.configurationId = j;
        this.previousInstallationId = str;
        this.previousDeviceUUID = str2;
        this.endpointId = str3;
        this.domain = str4;
        this.packageName = str5;
        this.versionName = str6;
        this.versionCode = str7;
        this.subscribeCustomerIfCreated = z;
        this.shouldCreateCustomer = z2;
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, int i, Object obj) {
        long j2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z3;
        boolean z4;
        if ((i & 1) != 0) {
            j2 = configuration.configurationId;
        } else {
            j2 = j;
        }
        if ((i & 2) != 0) {
            str8 = configuration.previousInstallationId;
        } else {
            str8 = str;
        }
        if ((i & 4) != 0) {
            str9 = configuration.previousDeviceUUID;
        } else {
            str9 = str2;
        }
        if ((i & 8) != 0) {
            str10 = configuration.endpointId;
        } else {
            str10 = str3;
        }
        if ((i & 16) != 0) {
            str11 = configuration.domain;
        } else {
            str11 = str4;
        }
        if ((i & 32) != 0) {
            str12 = configuration.packageName;
        } else {
            str12 = str5;
        }
        if ((i & 64) != 0) {
            str13 = configuration.versionName;
        } else {
            str13 = str6;
        }
        if ((i & 128) != 0) {
            str14 = configuration.versionCode;
        } else {
            str14 = str7;
        }
        if ((i & 256) != 0) {
            z3 = configuration.subscribeCustomerIfCreated;
        } else {
            z3 = z;
        }
        if ((i & 512) != 0) {
            z4 = configuration.shouldCreateCustomer;
        } else {
            z4 = z2;
        }
        return configuration.copy(j2, str8, str9, str10, str11, str12, str13, str14, z3, z4);
    }

    public final long component1() {
        return this.configurationId;
    }

    public final boolean component10() {
        return this.shouldCreateCustomer;
    }

    public final String component2() {
        return this.previousInstallationId;
    }

    public final String component3() {
        return this.previousDeviceUUID;
    }

    public final String component4() {
        return this.endpointId;
    }

    public final String component5() {
        return this.domain;
    }

    public final String component6() {
        return this.packageName;
    }

    public final String component7() {
        return this.versionName;
    }

    public final String component8() {
        return this.versionCode;
    }

    public final boolean component9() {
        return this.subscribeCustomerIfCreated;
    }

    public final Configuration copy(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        z65.h(str, "previousInstallationId");
        z65.h(str2, "previousDeviceUUID");
        z65.h(str3, "endpointId");
        z65.h(str4, "domain");
        z65.h(str5, "packageName");
        z65.h(str6, "versionName");
        z65.h(str7, "versionCode");
        return new Configuration(j, str, str2, str3, str4, str5, str6, str7, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        if (this.configurationId == configuration.configurationId && z65.c(this.previousInstallationId, configuration.previousInstallationId) && z65.c(this.previousDeviceUUID, configuration.previousDeviceUUID) && z65.c(this.endpointId, configuration.endpointId) && z65.c(this.domain, configuration.domain) && z65.c(this.packageName, configuration.packageName) && z65.c(this.versionName, configuration.versionName) && z65.c(this.versionCode, configuration.versionCode) && this.subscribeCustomerIfCreated == configuration.subscribeCustomerIfCreated && this.shouldCreateCustomer == configuration.shouldCreateCustomer) {
            return true;
        }
        return false;
    }

    public final long getConfigurationId() {
        return this.configurationId;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getEndpointId() {
        return this.endpointId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPreviousDeviceUUID() {
        return this.previousDeviceUUID;
    }

    public final String getPreviousInstallationId() {
        return this.previousInstallationId;
    }

    public final boolean getShouldCreateCustomer() {
        return this.shouldCreateCustomer;
    }

    public final boolean getSubscribeCustomerIfCreated() {
        return this.subscribeCustomerIfCreated;
    }

    public final String getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = ((((((((((((((ax1.a(this.configurationId) * 31) + this.previousInstallationId.hashCode()) * 31) + this.previousDeviceUUID.hashCode()) * 31) + this.endpointId.hashCode()) * 31) + this.domain.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.versionCode.hashCode()) * 31;
        boolean z = this.subscribeCustomerIfCreated;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (a + i2) * 31;
        boolean z2 = this.shouldCreateCustomer;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public String toString() {
        return "Configuration(configurationId=" + this.configurationId + ", previousInstallationId=" + this.previousInstallationId + ", previousDeviceUUID=" + this.previousDeviceUUID + ", endpointId=" + this.endpointId + ", domain=" + this.domain + ", packageName=" + this.packageName + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", subscribeCustomerIfCreated=" + this.subscribeCustomerIfCreated + ", shouldCreateCustomer=" + this.shouldCreateCustomer + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Configuration(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3, str4, str5, str6, str7, z, z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Configuration(MindboxConfiguration mindboxConfiguration) {
        this(0L, mindboxConfiguration.getPreviousInstallationId$sdk_release(), mindboxConfiguration.getPreviousDeviceUUID$sdk_release(), mindboxConfiguration.getEndpointId$sdk_release(), mindboxConfiguration.getDomain$sdk_release(), mindboxConfiguration.getPackageName$sdk_release(), mindboxConfiguration.getVersionName$sdk_release(), mindboxConfiguration.getVersionCode$sdk_release(), mindboxConfiguration.getSubscribeCustomerIfCreated$sdk_release(), mindboxConfiguration.getShouldCreateCustomer$sdk_release(), 1, null);
        z65.h(mindboxConfiguration, "mindboxConfiguration");
    }
}
