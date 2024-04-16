package com.dodopizza.persistence.entity.personalization;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
/* compiled from: DeliveryExperimentEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/dodopizza/persistence/entity/personalization/DeliveryExperimentEntity;", "Lyi3;", "Lio/realm/n0;", "", "departmentMinDeliveryPrice", "Ljava/lang/Double;", "getDepartmentMinDeliveryPrice", "()Ljava/lang/Double;", "setDepartmentMinDeliveryPrice", "(Ljava/lang/Double;)V", "personalizedMinDeliveryPrice", "getPersonalizedMinDeliveryPrice", "setPersonalizedMinDeliveryPrice", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/personalization/MapEntry;", "additionalData", "Lio/realm/k0;", "getAdditionalData", "()Lio/realm/k0;", "setAdditionalData", "(Lio/realm/k0;)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Lio/realm/k0;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DeliveryExperimentEntity extends n0 implements yi3, ghc {
    private k0<MapEntry> additionalData;
    private Double departmentMinDeliveryPrice;
    private String id;
    private Double personalizedMinDeliveryPrice;

    public DeliveryExperimentEntity() {
        this(null, null, null, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public k0<MapEntry> getAdditionalData() {
        return realmGet$additionalData();
    }

    public Double getDepartmentMinDeliveryPrice() {
        return realmGet$departmentMinDeliveryPrice();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public Double getPersonalizedMinDeliveryPrice() {
        return realmGet$personalizedMinDeliveryPrice();
    }

    @Override // defpackage.ghc
    public k0 realmGet$additionalData() {
        return this.additionalData;
    }

    @Override // defpackage.ghc
    public Double realmGet$departmentMinDeliveryPrice() {
        return this.departmentMinDeliveryPrice;
    }

    @Override // defpackage.ghc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ghc
    public Double realmGet$personalizedMinDeliveryPrice() {
        return this.personalizedMinDeliveryPrice;
    }

    @Override // defpackage.ghc
    public void realmSet$additionalData(k0 k0Var) {
        this.additionalData = k0Var;
    }

    @Override // defpackage.ghc
    public void realmSet$departmentMinDeliveryPrice(Double d) {
        this.departmentMinDeliveryPrice = d;
    }

    @Override // defpackage.ghc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ghc
    public void realmSet$personalizedMinDeliveryPrice(Double d) {
        this.personalizedMinDeliveryPrice = d;
    }

    public void setAdditionalData(k0<MapEntry> k0Var) {
        realmSet$additionalData(k0Var);
    }

    public void setDepartmentMinDeliveryPrice(Double d) {
        realmSet$departmentMinDeliveryPrice(d);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setPersonalizedMinDeliveryPrice(Double d) {
        realmSet$personalizedMinDeliveryPrice(d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DeliveryExperimentEntity(java.lang.Double r3, java.lang.Double r4, io.realm.k0 r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r2 = this;
            r7 = r6 & 1
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            if (r7 == 0) goto Lb
            r3 = r0
        Lb:
            r7 = r6 & 2
            if (r7 == 0) goto L10
            r4 = r0
        L10:
            r6 = r6 & 4
            if (r6 == 0) goto L15
            r5 = 0
        L15:
            r2.<init>(r3, r4, r5)
            boolean r3 = r2 instanceof defpackage.r89
            if (r3 == 0) goto L22
            r3 = r2
            r89 r3 = (defpackage.r89) r3
            r3.b()
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity.<init>(java.lang.Double, java.lang.Double, io.realm.k0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public DeliveryExperimentEntity(Double d, Double d2, k0<MapEntry> k0Var) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$departmentMinDeliveryPrice(d);
        realmSet$personalizedMinDeliveryPrice(d2);
        realmSet$additionalData(k0Var);
    }
}
