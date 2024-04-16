package com.dodopizza.persistence.entity.deliverylocation;

import im.threads.business.transport.MessageAttributes;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryLocationEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006!"}, d2 = {"Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "Lyi3;", "Lio/realm/n0;", "", "formattedAddress", "Ljava/lang/String;", "getFormattedAddress", "()Ljava/lang/String;", "setFormattedAddress", "(Ljava/lang/String;)V", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/deliverylocation/AddressAdditionEntity;", "additions", "Lio/realm/k0;", "getAdditions", "()Lio/realm/k0;", "setAdditions", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;", MessageAttributes.COORDINATES, "Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;", "getCoordinates", "()Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;", "setCoordinates", "(Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;)V", "encodedComponents", "getEncodedComponents", "setEncodedComponents", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Lio/realm/k0;Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DeliveryLocationEntity extends n0 implements yi3, jgc {
    private k0<AddressAdditionEntity> additions;
    private CoordinatesEntity coordinates;
    private String encodedComponents;
    private String formattedAddress;
    private String id;

    public DeliveryLocationEntity() {
        this(null, null, null, null, 15, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public k0<AddressAdditionEntity> getAdditions() {
        return realmGet$additions();
    }

    public CoordinatesEntity getCoordinates() {
        return realmGet$coordinates();
    }

    public String getEncodedComponents() {
        return realmGet$encodedComponents();
    }

    public String getFormattedAddress() {
        return realmGet$formattedAddress();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.jgc
    public k0 realmGet$additions() {
        return this.additions;
    }

    @Override // defpackage.jgc
    public CoordinatesEntity realmGet$coordinates() {
        return this.coordinates;
    }

    @Override // defpackage.jgc
    public String realmGet$encodedComponents() {
        return this.encodedComponents;
    }

    @Override // defpackage.jgc
    public String realmGet$formattedAddress() {
        return this.formattedAddress;
    }

    @Override // defpackage.jgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.jgc
    public void realmSet$additions(k0 k0Var) {
        this.additions = k0Var;
    }

    @Override // defpackage.jgc
    public void realmSet$coordinates(CoordinatesEntity coordinatesEntity) {
        this.coordinates = coordinatesEntity;
    }

    @Override // defpackage.jgc
    public void realmSet$encodedComponents(String str) {
        this.encodedComponents = str;
    }

    @Override // defpackage.jgc
    public void realmSet$formattedAddress(String str) {
        this.formattedAddress = str;
    }

    @Override // defpackage.jgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setAdditions(k0<AddressAdditionEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$additions(k0Var);
    }

    public void setCoordinates(CoordinatesEntity coordinatesEntity) {
        realmSet$coordinates(coordinatesEntity);
    }

    public void setEncodedComponents(String str) {
        z65.h(str, "<set-?>");
        realmSet$encodedComponents(str);
    }

    public void setFormattedAddress(String str) {
        z65.h(str, "<set-?>");
        realmSet$formattedAddress(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ DeliveryLocationEntity(String str, k0 k0Var, CoordinatesEntity coordinatesEntity, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new k0() : k0Var, (i & 4) != 0 ? null : coordinatesEntity, (i & 8) != 0 ? "" : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DeliveryLocationEntity(String str, k0<AddressAdditionEntity> k0Var, CoordinatesEntity coordinatesEntity, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(k0Var, "additions");
        z65.h(str2, "encodedComponents");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$formattedAddress(str);
        realmSet$additions(k0Var);
        realmSet$coordinates(coordinatesEntity);
        realmSet$encodedComponents(str2);
    }
}
