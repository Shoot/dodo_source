package com.dodopizza.persistence.entity;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DynamicDeliveryEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0012\u0010\nR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/persistence/entity/DeliveryFeeLevelsEntity;", "Lyi3;", "Lio/realm/n0;", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/ClientDeliveryFeeLevelEntity;", "feeLevels", "Lio/realm/k0;", "getFeeLevels", "()Lio/realm/k0;", "setFeeLevels", "(Lio/realm/k0;)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DeliveryFeeLevelsEntity extends n0 implements yi3, tec {
    private k0<ClientDeliveryFeeLevelEntity> feeLevels;
    private String id;

    public DeliveryFeeLevelsEntity() {
        this(null, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public k0<ClientDeliveryFeeLevelEntity> getFeeLevels() {
        return realmGet$feeLevels();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.tec
    public k0 realmGet$feeLevels() {
        return this.feeLevels;
    }

    @Override // defpackage.tec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.tec
    public void realmSet$feeLevels(k0 k0Var) {
        this.feeLevels = k0Var;
    }

    @Override // defpackage.tec
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setFeeLevels(k0<ClientDeliveryFeeLevelEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$feeLevels(k0Var);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ DeliveryFeeLevelsEntity(k0 k0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new k0() : k0Var);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DeliveryFeeLevelsEntity(k0<ClientDeliveryFeeLevelEntity> k0Var) {
        z65.h(k0Var, "feeLevels");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$feeLevels(k0Var);
    }
}
