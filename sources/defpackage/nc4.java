package defpackage;

import kotlin.Metadata;
/* compiled from: GameEnvironmentSettingsVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, d2 = {"Lnc4;", "", "", "toString", "", "hashCode", "other", "", "equals", "client", "I", "getClient", "()I", "clientVersion", "Ljava/lang/String;", "getClientVersion", "()Ljava/lang/String;", "countryId", "getCountryId", "languageCode", "getLanguageCode", "environmentUrl", "getEnvironmentUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nc4  reason: default package */
/* loaded from: classes2.dex */
public final class nc4 {
    private final int client;
    private final String clientVersion;
    private final String countryId;
    private final String environmentUrl;
    private final String languageCode;

    public nc4(int i, String str, String str2, String str3, String str4) {
        z65.h(str, "clientVersion");
        z65.h(str2, "countryId");
        z65.h(str3, "languageCode");
        z65.h(str4, "environmentUrl");
        this.client = i;
        this.clientVersion = str;
        this.countryId = str2;
        this.languageCode = str3;
        this.environmentUrl = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc4)) {
            return false;
        }
        nc4 nc4Var = (nc4) obj;
        if (this.client == nc4Var.client && z65.c(this.clientVersion, nc4Var.clientVersion) && z65.c(this.countryId, nc4Var.countryId) && z65.c(this.languageCode, nc4Var.languageCode) && z65.c(this.environmentUrl, nc4Var.environmentUrl)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.client * 31) + this.clientVersion.hashCode()) * 31) + this.countryId.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.environmentUrl.hashCode();
    }

    public String toString() {
        int i = this.client;
        String str = this.clientVersion;
        String str2 = this.countryId;
        String str3 = this.languageCode;
        String str4 = this.environmentUrl;
        return "GameEnvironmentSettingsVO(client=" + i + ", clientVersion=" + str + ", countryId=" + str2 + ", languageCode=" + str3 + ", environmentUrl=" + str4 + ")";
    }
}
