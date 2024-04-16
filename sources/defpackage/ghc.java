package defpackage;

import com.dodopizza.persistence.entity.personalization.MapEntry;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxyInterface.java */
/* renamed from: ghc  reason: default package */
/* loaded from: classes3.dex */
public interface ghc {
    k0<MapEntry> realmGet$additionalData();

    Double realmGet$departmentMinDeliveryPrice();

    String realmGet$id();

    Double realmGet$personalizedMinDeliveryPrice();

    void realmSet$additionalData(k0<MapEntry> k0Var);

    void realmSet$departmentMinDeliveryPrice(Double d);

    void realmSet$id(String str);

    void realmSet$personalizedMinDeliveryPrice(Double d);
}
