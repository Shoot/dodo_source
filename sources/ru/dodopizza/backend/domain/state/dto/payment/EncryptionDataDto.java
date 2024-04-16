package ru.dodopizza.backend.domain.state.dto.payment;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EncryptionDataDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;", "", "mdorder", "", "timestamp", MessageAttributes.UUID, "publicKey", "apiKey", "projectId", MessageAttributes.CLIENT_ID, "tokenizationHost", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getClientId", "getMdorder", "getProjectId", "getPublicKey", "getTimestamp", "getTokenizationHost", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EncryptionDataDto {
    @uca("apiKey")
    private final String apiKey;
    @uca(MessageAttributes.CLIENT_ID)
    private final String clientId;
    @uca("mdorder")
    private final String mdorder;
    @uca("projectId")
    private final String projectId;
    @uca("publicKey")
    private final String publicKey;
    @uca("timestamp")
    private final String timestamp;
    @uca("tokenizationHost")
    private final String tokenizationHost;
    @uca(MessageAttributes.UUID)
    private final String uuid;

    public EncryptionDataDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ EncryptionDataDto copy$default(EncryptionDataDto encryptionDataDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        if ((i & 1) != 0) {
            str9 = encryptionDataDto.mdorder;
        } else {
            str9 = str;
        }
        if ((i & 2) != 0) {
            str10 = encryptionDataDto.timestamp;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            str11 = encryptionDataDto.uuid;
        } else {
            str11 = str3;
        }
        if ((i & 8) != 0) {
            str12 = encryptionDataDto.publicKey;
        } else {
            str12 = str4;
        }
        if ((i & 16) != 0) {
            str13 = encryptionDataDto.apiKey;
        } else {
            str13 = str5;
        }
        if ((i & 32) != 0) {
            str14 = encryptionDataDto.projectId;
        } else {
            str14 = str6;
        }
        if ((i & 64) != 0) {
            str15 = encryptionDataDto.clientId;
        } else {
            str15 = str7;
        }
        if ((i & 128) != 0) {
            str16 = encryptionDataDto.tokenizationHost;
        } else {
            str16 = str8;
        }
        return encryptionDataDto.copy(str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public final String component1() {
        return this.mdorder;
    }

    public final String component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.uuid;
    }

    public final String component4() {
        return this.publicKey;
    }

    public final String component5() {
        return this.apiKey;
    }

    public final String component6() {
        return this.projectId;
    }

    public final String component7() {
        return this.clientId;
    }

    public final String component8() {
        return this.tokenizationHost;
    }

    public final EncryptionDataDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        z65.h(str, "mdorder");
        z65.h(str2, "timestamp");
        z65.h(str3, MessageAttributes.UUID);
        z65.h(str4, "publicKey");
        z65.h(str5, "apiKey");
        z65.h(str6, "projectId");
        z65.h(str7, MessageAttributes.CLIENT_ID);
        z65.h(str8, "tokenizationHost");
        return new EncryptionDataDto(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptionDataDto)) {
            return false;
        }
        EncryptionDataDto encryptionDataDto = (EncryptionDataDto) obj;
        if (z65.c(this.mdorder, encryptionDataDto.mdorder) && z65.c(this.timestamp, encryptionDataDto.timestamp) && z65.c(this.uuid, encryptionDataDto.uuid) && z65.c(this.publicKey, encryptionDataDto.publicKey) && z65.c(this.apiKey, encryptionDataDto.apiKey) && z65.c(this.projectId, encryptionDataDto.projectId) && z65.c(this.clientId, encryptionDataDto.clientId) && z65.c(this.tokenizationHost, encryptionDataDto.tokenizationHost)) {
            return true;
        }
        return false;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getMdorder() {
        return this.mdorder;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTokenizationHost() {
        return this.tokenizationHost;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((((((this.mdorder.hashCode() * 31) + this.timestamp.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.apiKey.hashCode()) * 31) + this.projectId.hashCode()) * 31) + this.clientId.hashCode()) * 31) + this.tokenizationHost.hashCode();
    }

    public String toString() {
        String str = this.mdorder;
        String str2 = this.timestamp;
        String str3 = this.uuid;
        String str4 = this.publicKey;
        String str5 = this.apiKey;
        String str6 = this.projectId;
        String str7 = this.clientId;
        String str8 = this.tokenizationHost;
        return "EncryptionDataDto(mdorder=" + str + ", timestamp=" + str2 + ", uuid=" + str3 + ", publicKey=" + str4 + ", apiKey=" + str5 + ", projectId=" + str6 + ", clientId=" + str7 + ", tokenizationHost=" + str8 + ")";
    }

    public EncryptionDataDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        z65.h(str, "mdorder");
        z65.h(str2, "timestamp");
        z65.h(str3, MessageAttributes.UUID);
        z65.h(str4, "publicKey");
        z65.h(str5, "apiKey");
        z65.h(str6, "projectId");
        z65.h(str7, MessageAttributes.CLIENT_ID);
        z65.h(str8, "tokenizationHost");
        this.mdorder = str;
        this.timestamp = str2;
        this.uuid = str3;
        this.publicKey = str4;
        this.apiKey = str5;
        this.projectId = str6;
        this.clientId = str7;
        this.tokenizationHost = str8;
    }

    public /* synthetic */ EncryptionDataDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
