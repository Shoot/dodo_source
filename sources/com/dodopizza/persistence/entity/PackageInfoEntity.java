package com.dodopizza.persistence.entity;

import im.threads.business.transport.MessageAttributes;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PackageInfoEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/persistence/entity/PackageInfoEntity;", "Lio/realm/n0;", "", "Lcom/dodopizza/persistence/entity/PackageTypeEntity;", MessageAttributes.TYPE, "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Lio/realm/k0;", "availableTypes", "Lio/realm/k0;", "getAvailableTypes", "()Lio/realm/k0;", "setAvailableTypes", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/PackageWidgetDataEntity;", "widgetData", "Lcom/dodopizza/persistence/entity/PackageWidgetDataEntity;", "getWidgetData", "()Lcom/dodopizza/persistence/entity/PackageWidgetDataEntity;", "setWidgetData", "(Lcom/dodopizza/persistence/entity/PackageWidgetDataEntity;)V", "<init>", "(Ljava/lang/String;Lio/realm/k0;Lcom/dodopizza/persistence/entity/PackageWidgetDataEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PackageInfoEntity extends n0 implements wec {
    private k0<String> availableTypes;
    private String type;
    private PackageWidgetDataEntity widgetData;

    public PackageInfoEntity() {
        this(null, null, null, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public k0<String> getAvailableTypes() {
        return realmGet$availableTypes();
    }

    public String getType() {
        return realmGet$type();
    }

    public PackageWidgetDataEntity getWidgetData() {
        return realmGet$widgetData();
    }

    @Override // defpackage.wec
    public k0 realmGet$availableTypes() {
        return this.availableTypes;
    }

    @Override // defpackage.wec
    public String realmGet$type() {
        return this.type;
    }

    @Override // defpackage.wec
    public PackageWidgetDataEntity realmGet$widgetData() {
        return this.widgetData;
    }

    @Override // defpackage.wec
    public void realmSet$availableTypes(k0 k0Var) {
        this.availableTypes = k0Var;
    }

    @Override // defpackage.wec
    public void realmSet$type(String str) {
        this.type = str;
    }

    @Override // defpackage.wec
    public void realmSet$widgetData(PackageWidgetDataEntity packageWidgetDataEntity) {
        this.widgetData = packageWidgetDataEntity;
    }

    public void setAvailableTypes(k0<String> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$availableTypes(k0Var);
    }

    public void setType(String str) {
        realmSet$type(str);
    }

    public void setWidgetData(PackageWidgetDataEntity packageWidgetDataEntity) {
        realmSet$widgetData(packageWidgetDataEntity);
    }

    public /* synthetic */ PackageInfoEntity(String str, k0 k0Var, PackageWidgetDataEntity packageWidgetDataEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new k0() : k0Var, (i & 4) != 0 ? null : packageWidgetDataEntity);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PackageInfoEntity(String str, k0<String> k0Var, PackageWidgetDataEntity packageWidgetDataEntity) {
        z65.h(k0Var, "availableTypes");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$type(str);
        realmSet$availableTypes(k0Var);
        realmSet$widgetData(packageWidgetDataEntity);
    }
}
