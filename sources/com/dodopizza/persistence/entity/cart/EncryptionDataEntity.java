package com.dodopizza.persistence.entity.cart;

import im.threads.business.transport.MessageAttributes;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EncryptionDataEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR$\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u0006$"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;", "Lyi3;", "Lio/realm/n0;", "", "timestamp", "Ljava/lang/String;", "getTimestamp", "()Ljava/lang/String;", "setTimestamp", "(Ljava/lang/String;)V", MessageAttributes.UUID, "getUuid", "setUuid", "mdorder", "getMdorder", "setMdorder", "publicKey", "getPublicKey", "setPublicKey", "apiKey", "getApiKey", "setApiKey", "projectId", "getProjectId", "setProjectId", MessageAttributes.CLIENT_ID, "getClientId", "setClientId", "tokenizationHost", "getTokenizationHost", "setTokenizationHost", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class EncryptionDataEntity extends n0 implements yi3, sfc {
    private String apiKey;
    private String clientId;
    private String id;
    private String mdorder;
    private String projectId;
    private String publicKey;
    private String timestamp;
    private String tokenizationHost;
    private String uuid;

    public EncryptionDataEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getApiKey() {
        return realmGet$apiKey();
    }

    public String getClientId() {
        return realmGet$clientId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getMdorder() {
        return realmGet$mdorder();
    }

    public String getProjectId() {
        return realmGet$projectId();
    }

    public String getPublicKey() {
        return realmGet$publicKey();
    }

    public String getTimestamp() {
        return realmGet$timestamp();
    }

    public String getTokenizationHost() {
        return realmGet$tokenizationHost();
    }

    public String getUuid() {
        return realmGet$uuid();
    }

    @Override // defpackage.sfc
    public String realmGet$apiKey() {
        return this.apiKey;
    }

    @Override // defpackage.sfc
    public String realmGet$clientId() {
        return this.clientId;
    }

    @Override // defpackage.sfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.sfc
    public String realmGet$mdorder() {
        return this.mdorder;
    }

    @Override // defpackage.sfc
    public String realmGet$projectId() {
        return this.projectId;
    }

    @Override // defpackage.sfc
    public String realmGet$publicKey() {
        return this.publicKey;
    }

    @Override // defpackage.sfc
    public String realmGet$timestamp() {
        return this.timestamp;
    }

    @Override // defpackage.sfc
    public String realmGet$tokenizationHost() {
        return this.tokenizationHost;
    }

    @Override // defpackage.sfc
    public String realmGet$uuid() {
        return this.uuid;
    }

    @Override // defpackage.sfc
    public void realmSet$apiKey(String str) {
        this.apiKey = str;
    }

    @Override // defpackage.sfc
    public void realmSet$clientId(String str) {
        this.clientId = str;
    }

    @Override // defpackage.sfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.sfc
    public void realmSet$mdorder(String str) {
        this.mdorder = str;
    }

    @Override // defpackage.sfc
    public void realmSet$projectId(String str) {
        this.projectId = str;
    }

    @Override // defpackage.sfc
    public void realmSet$publicKey(String str) {
        this.publicKey = str;
    }

    @Override // defpackage.sfc
    public void realmSet$timestamp(String str) {
        this.timestamp = str;
    }

    @Override // defpackage.sfc
    public void realmSet$tokenizationHost(String str) {
        this.tokenizationHost = str;
    }

    @Override // defpackage.sfc
    public void realmSet$uuid(String str) {
        this.uuid = str;
    }

    public void setApiKey(String str) {
        z65.h(str, "<set-?>");
        realmSet$apiKey(str);
    }

    public void setClientId(String str) {
        z65.h(str, "<set-?>");
        realmSet$clientId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setMdorder(String str) {
        z65.h(str, "<set-?>");
        realmSet$mdorder(str);
    }

    public void setProjectId(String str) {
        z65.h(str, "<set-?>");
        realmSet$projectId(str);
    }

    public void setPublicKey(String str) {
        z65.h(str, "<set-?>");
        realmSet$publicKey(str);
    }

    public void setTimestamp(String str) {
        z65.h(str, "<set-?>");
        realmSet$timestamp(str);
    }

    public void setTokenizationHost(String str) {
        z65.h(str, "<set-?>");
        realmSet$tokenizationHost(str);
    }

    public void setUuid(String str) {
        z65.h(str, "<set-?>");
        realmSet$uuid(str);
    }

    public /* synthetic */ EncryptionDataEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public EncryptionDataEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        z65.h(str, "timestamp");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(str3, "mdorder");
        z65.h(str4, "publicKey");
        z65.h(str5, "apiKey");
        z65.h(str6, "projectId");
        z65.h(str7, MessageAttributes.CLIENT_ID);
        z65.h(str8, "tokenizationHost");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$timestamp(str);
        realmSet$uuid(str2);
        realmSet$mdorder(str3);
        realmSet$publicKey(str4);
        realmSet$apiKey(str5);
        realmSet$projectId(str6);
        realmSet$clientId(str7);
        realmSet$tokenizationHost(str8);
    }
}
