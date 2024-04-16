package com.dodopizza.persistence.entity.deliverylocation;

import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ClientDeliveryLocationProfileEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0017\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationProfileEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "deliveryLocation", "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "getDeliveryLocation", "()Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "setDeliveryLocation", "(Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;)V", "", "requiresAdditions", "Z", "getRequiresAdditions", "()Z", "setRequiresAdditions", "(Z)V", "<init>", "(Ljava/lang/String;Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;Z)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ClientDeliveryLocationProfileEntity extends n0 implements yi3, hgc {
    public static final Companion Companion = new Companion(null);
    public static final String ID = "id";
    private DeliveryLocationEntity deliveryLocation;
    private String id;
    private boolean requiresAdditions;

    /* compiled from: ClientDeliveryLocationProfileEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationProfileEntity$Companion;", "", "()V", ServerDeltaTimeEntity.ID_VALUE, "", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ClientDeliveryLocationProfileEntity() {
        this(null, null, false, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DeliveryLocationEntity getDeliveryLocation() {
        return realmGet$deliveryLocation();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public boolean getRequiresAdditions() {
        return realmGet$requiresAdditions();
    }

    @Override // defpackage.hgc
    public DeliveryLocationEntity realmGet$deliveryLocation() {
        return this.deliveryLocation;
    }

    @Override // defpackage.hgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.hgc
    public boolean realmGet$requiresAdditions() {
        return this.requiresAdditions;
    }

    @Override // defpackage.hgc
    public void realmSet$deliveryLocation(DeliveryLocationEntity deliveryLocationEntity) {
        this.deliveryLocation = deliveryLocationEntity;
    }

    @Override // defpackage.hgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.hgc
    public void realmSet$requiresAdditions(boolean z) {
        this.requiresAdditions = z;
    }

    public void setDeliveryLocation(DeliveryLocationEntity deliveryLocationEntity) {
        realmSet$deliveryLocation(deliveryLocationEntity);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setRequiresAdditions(boolean z) {
        realmSet$requiresAdditions(z);
    }

    public /* synthetic */ ClientDeliveryLocationProfileEntity(String str, DeliveryLocationEntity deliveryLocationEntity, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : deliveryLocationEntity, (i & 4) != 0 ? true : z);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ClientDeliveryLocationProfileEntity(String str, DeliveryLocationEntity deliveryLocationEntity, boolean z) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$deliveryLocation(deliveryLocationEntity);
        realmSet$requiresAdditions(z);
    }
}
