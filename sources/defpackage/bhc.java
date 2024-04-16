package defpackage;

import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxyInterface.java */
/* renamed from: bhc  reason: default package */
/* loaded from: classes3.dex */
public interface bhc {
    Boolean realmGet$binaryRatingPositive();

    String realmGet$comment();

    String realmGet$id();

    boolean realmGet$isEditable();

    boolean realmGet$isSent();

    int realmGet$rating();

    k0<String> realmGet$tagsIds();

    void realmSet$binaryRatingPositive(Boolean bool);

    void realmSet$comment(String str);

    void realmSet$id(String str);

    void realmSet$isEditable(boolean z);

    void realmSet$isSent(boolean z);

    void realmSet$rating(int i);

    void realmSet$tagsIds(k0<String> k0Var);
}
