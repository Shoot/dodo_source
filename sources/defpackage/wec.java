package defpackage;

import com.dodopizza.persistence.entity.PackageWidgetDataEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_PackageInfoEntityRealmProxyInterface.java */
/* renamed from: wec  reason: default package */
/* loaded from: classes3.dex */
public interface wec {
    k0<String> realmGet$availableTypes();

    String realmGet$type();

    PackageWidgetDataEntity realmGet$widgetData();

    void realmSet$availableTypes(k0<String> k0Var);

    void realmSet$type(String str);

    void realmSet$widgetData(PackageWidgetDataEntity packageWidgetDataEntity);
}
