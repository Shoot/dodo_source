package ru.dodopizza.mindbox.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MindboxProperties.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/dodopizza/mindbox/model/MindboxProperties;", "", "baseUrl", "", "endpointId", "prevInstallationId", "isFMSPushService", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBaseUrl", "()Ljava/lang/String;", "getEndpointId", "()Z", "getPrevInstallationId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MindboxProperties {
    public static final Companion Companion = new Companion(null);
    private static final MindboxProperties EMPTY = new MindboxProperties("", "", "", true);
    private final String baseUrl;
    private final String endpointId;
    private final boolean isFMSPushService;
    private final String prevInstallationId;

    /* compiled from: MindboxProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/mindbox/model/MindboxProperties$Companion;", "", "()V", "EMPTY", "Lru/dodopizza/mindbox/model/MindboxProperties;", "getEMPTY", "()Lru/dodopizza/mindbox/model/MindboxProperties;", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MindboxProperties getEMPTY() {
            return MindboxProperties.EMPTY;
        }
    }

    public MindboxProperties(String str, String str2, String str3, boolean z) {
        z65.h(str, "baseUrl");
        z65.h(str2, "endpointId");
        z65.h(str3, "prevInstallationId");
        this.baseUrl = str;
        this.endpointId = str2;
        this.prevInstallationId = str3;
        this.isFMSPushService = z;
    }

    public static /* synthetic */ MindboxProperties copy$default(MindboxProperties mindboxProperties, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mindboxProperties.baseUrl;
        }
        if ((i & 2) != 0) {
            str2 = mindboxProperties.endpointId;
        }
        if ((i & 4) != 0) {
            str3 = mindboxProperties.prevInstallationId;
        }
        if ((i & 8) != 0) {
            z = mindboxProperties.isFMSPushService;
        }
        return mindboxProperties.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.baseUrl;
    }

    public final String component2() {
        return this.endpointId;
    }

    public final String component3() {
        return this.prevInstallationId;
    }

    public final boolean component4() {
        return this.isFMSPushService;
    }

    public final MindboxProperties copy(String str, String str2, String str3, boolean z) {
        z65.h(str, "baseUrl");
        z65.h(str2, "endpointId");
        z65.h(str3, "prevInstallationId");
        return new MindboxProperties(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MindboxProperties)) {
            return false;
        }
        MindboxProperties mindboxProperties = (MindboxProperties) obj;
        if (z65.c(this.baseUrl, mindboxProperties.baseUrl) && z65.c(this.endpointId, mindboxProperties.endpointId) && z65.c(this.prevInstallationId, mindboxProperties.prevInstallationId) && this.isFMSPushService == mindboxProperties.isFMSPushService) {
            return true;
        }
        return false;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getEndpointId() {
        return this.endpointId;
    }

    public final String getPrevInstallationId() {
        return this.prevInstallationId;
    }

    public int hashCode() {
        return (((((this.baseUrl.hashCode() * 31) + this.endpointId.hashCode()) * 31) + this.prevInstallationId.hashCode()) * 31) + a91.a(this.isFMSPushService);
    }

    public final boolean isFMSPushService() {
        return this.isFMSPushService;
    }

    public String toString() {
        String str = this.baseUrl;
        String str2 = this.endpointId;
        String str3 = this.prevInstallationId;
        boolean z = this.isFMSPushService;
        return "MindboxProperties(baseUrl=" + str + ", endpointId=" + str2 + ", prevInstallationId=" + str3 + ", isFMSPushService=" + z + ")";
    }
}
