package defpackage;

import com.dodopizza.persistence.entity.deliverylocation.AddressAdditionEntity;
import com.dodopizza.persistence.entity.deliverylocation.CoordinatesEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxyInterface.java */
/* renamed from: jgc  reason: default package */
/* loaded from: classes3.dex */
public interface jgc {
    k0<AddressAdditionEntity> realmGet$additions();

    CoordinatesEntity realmGet$coordinates();

    String realmGet$encodedComponents();

    String realmGet$formattedAddress();

    String realmGet$id();

    void realmSet$additions(k0<AddressAdditionEntity> k0Var);

    void realmSet$coordinates(CoordinatesEntity coordinatesEntity);

    void realmSet$encodedComponents(String str);

    void realmSet$formattedAddress(String str);

    void realmSet$id(String str);
}
