package defpackage;

import com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxyInterface.java */
/* renamed from: nhc  reason: default package */
/* loaded from: classes3.dex */
public interface nhc {
    String realmGet$id();

    String realmGet$legalDocumentUrl();

    k0<PrizotekaLevelEntity> realmGet$levels();

    String realmGet$subtitle();

    String realmGet$title();

    void realmSet$id(String str);

    void realmSet$legalDocumentUrl(String str);

    void realmSet$levels(k0<PrizotekaLevelEntity> k0Var);

    void realmSet$subtitle(String str);

    void realmSet$title(String str);
}
