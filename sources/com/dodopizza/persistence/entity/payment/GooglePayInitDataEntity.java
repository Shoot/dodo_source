package com.dodopizza.persistence.entity.payment;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GooglePayInitDataEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;", "Lyi3;", "Lio/realm/n0;", "", "environment", "Ljava/lang/String;", "getEnvironment", "()Ljava/lang/String;", "setEnvironment", "(Ljava/lang/String;)V", "isReadyToPayRequest", "setReadyToPayRequest", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class GooglePayInitDataEntity extends n0 implements yi3, ehc {
    private String environment;
    private String id;
    private String isReadyToPayRequest;

    public GooglePayInitDataEntity() {
        this(null, null, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getEnvironment() {
        return realmGet$environment();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String isReadyToPayRequest() {
        return realmGet$isReadyToPayRequest();
    }

    @Override // defpackage.ehc
    public String realmGet$environment() {
        return this.environment;
    }

    @Override // defpackage.ehc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ehc
    public String realmGet$isReadyToPayRequest() {
        return this.isReadyToPayRequest;
    }

    @Override // defpackage.ehc
    public void realmSet$environment(String str) {
        this.environment = str;
    }

    @Override // defpackage.ehc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ehc
    public void realmSet$isReadyToPayRequest(String str) {
        this.isReadyToPayRequest = str;
    }

    public void setEnvironment(String str) {
        realmSet$environment(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setReadyToPayRequest(String str) {
        realmSet$isReadyToPayRequest(str);
    }

    public /* synthetic */ GooglePayInitDataEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public GooglePayInitDataEntity(String str, String str2) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$environment(str);
        realmSet$isReadyToPayRequest(str2);
    }
}
