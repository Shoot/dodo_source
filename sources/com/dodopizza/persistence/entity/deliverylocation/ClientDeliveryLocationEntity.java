package com.dodopizza.persistence.entity.deliverylocation;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ClientDeliveryLocationEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "deliveryLocation", "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "getDeliveryLocation", "()Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "setDeliveryLocation", "(Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;)V", "", "requiresAdditions", "Z", "getRequiresAdditions", "()Z", "setRequiresAdditions", "(Z)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;Z)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ClientDeliveryLocationEntity extends n0 implements yi3, ggc {
    private DeliveryLocationEntity deliveryLocation;
    private String externalId;
    private String id;
    private boolean requiresAdditions;

    public ClientDeliveryLocationEntity() {
        this(null, null, false, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DeliveryLocationEntity getDeliveryLocation() {
        return realmGet$deliveryLocation();
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public boolean getRequiresAdditions() {
        return realmGet$requiresAdditions();
    }

    @Override // defpackage.ggc
    public DeliveryLocationEntity realmGet$deliveryLocation() {
        return this.deliveryLocation;
    }

    @Override // defpackage.ggc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.ggc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ggc
    public boolean realmGet$requiresAdditions() {
        return this.requiresAdditions;
    }

    @Override // defpackage.ggc
    public void realmSet$deliveryLocation(DeliveryLocationEntity deliveryLocationEntity) {
        this.deliveryLocation = deliveryLocationEntity;
    }

    @Override // defpackage.ggc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.ggc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ggc
    public void realmSet$requiresAdditions(boolean z) {
        this.requiresAdditions = z;
    }

    public void setDeliveryLocation(DeliveryLocationEntity deliveryLocationEntity) {
        realmSet$deliveryLocation(deliveryLocationEntity);
    }

    public void setExternalId(String str) {
        z65.h(str, "<set-?>");
        realmSet$externalId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setRequiresAdditions(boolean z) {
        realmSet$requiresAdditions(z);
    }

    public /* synthetic */ ClientDeliveryLocationEntity(String str, DeliveryLocationEntity deliveryLocationEntity, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : deliveryLocationEntity, (i & 4) != 0 ? true : z);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ClientDeliveryLocationEntity(String str, DeliveryLocationEntity deliveryLocationEntity, boolean z) {
        z65.h(str, ShoppingInfoEntity.FIELD_EXTERNAL_ID);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$deliveryLocation(deliveryLocationEntity);
        realmSet$requiresAdditions(z);
    }
}
