package com.dodopizza.persistence.entity.personalization;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DynamicDeliveryEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\nR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/persistence/entity/personalization/DynamicDeliveryEntity;", "Lyi3;", "Lio/realm/n0;", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/personalization/MapEntry;", "additionalData", "Lio/realm/k0;", "getAdditionalData", "()Lio/realm/k0;", "setAdditionalData", "(Lio/realm/k0;)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DynamicDeliveryEntity extends n0 implements yi3, hhc {
    private k0<MapEntry> additionalData;
    private String id;

    public DynamicDeliveryEntity() {
        this(null, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public k0<MapEntry> getAdditionalData() {
        return realmGet$additionalData();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.hhc
    public k0 realmGet$additionalData() {
        return this.additionalData;
    }

    @Override // defpackage.hhc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.hhc
    public void realmSet$additionalData(k0 k0Var) {
        this.additionalData = k0Var;
    }

    @Override // defpackage.hhc
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setAdditionalData(k0<MapEntry> k0Var) {
        realmSet$additionalData(k0Var);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ DynamicDeliveryEntity(k0 k0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : k0Var);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DynamicDeliveryEntity(k0<MapEntry> k0Var) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$additionalData(k0Var);
    }
}
