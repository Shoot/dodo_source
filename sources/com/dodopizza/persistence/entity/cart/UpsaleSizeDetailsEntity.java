package com.dodopizza.persistence.entity.cart;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleSizeDetailsEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b!\u0010\"R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006#"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;", "Lyi3;", "Lio/realm/n0;", "", "doughTypeId", "Ljava/lang/Integer;", "getDoughTypeId", "()Ljava/lang/Integer;", "setDoughTypeId", "(Ljava/lang/Integer;)V", "", "doughTypeName", "Ljava/lang/String;", "getDoughTypeName", "()Ljava/lang/String;", "setDoughTypeName", "(Ljava/lang/String;)V", "sizeGroupId", "getSizeGroupId", "setSizeGroupId", "sizeGroupName", "getSizeGroupName", "setSizeGroupName", "Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;", "measureInfo", "Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;", "getMeasureInfo", "()Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;", "setMeasureInfo", "(Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;)V", "id", "getId", "setId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class UpsaleSizeDetailsEntity extends n0 implements yi3, dgc {
    private Integer doughTypeId;
    private String doughTypeName;
    private String id;
    private UpsaleMeasureInfoEntity measureInfo;
    private Integer sizeGroupId;
    private String sizeGroupName;

    public UpsaleSizeDetailsEntity() {
        this(null, null, null, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public Integer getDoughTypeId() {
        return realmGet$doughTypeId();
    }

    public String getDoughTypeName() {
        return realmGet$doughTypeName();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public UpsaleMeasureInfoEntity getMeasureInfo() {
        return realmGet$measureInfo();
    }

    public Integer getSizeGroupId() {
        return realmGet$sizeGroupId();
    }

    public String getSizeGroupName() {
        return realmGet$sizeGroupName();
    }

    @Override // defpackage.dgc
    public Integer realmGet$doughTypeId() {
        return this.doughTypeId;
    }

    @Override // defpackage.dgc
    public String realmGet$doughTypeName() {
        return this.doughTypeName;
    }

    @Override // defpackage.dgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.dgc
    public UpsaleMeasureInfoEntity realmGet$measureInfo() {
        return this.measureInfo;
    }

    @Override // defpackage.dgc
    public Integer realmGet$sizeGroupId() {
        return this.sizeGroupId;
    }

    @Override // defpackage.dgc
    public String realmGet$sizeGroupName() {
        return this.sizeGroupName;
    }

    @Override // defpackage.dgc
    public void realmSet$doughTypeId(Integer num) {
        this.doughTypeId = num;
    }

    @Override // defpackage.dgc
    public void realmSet$doughTypeName(String str) {
        this.doughTypeName = str;
    }

    @Override // defpackage.dgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.dgc
    public void realmSet$measureInfo(UpsaleMeasureInfoEntity upsaleMeasureInfoEntity) {
        this.measureInfo = upsaleMeasureInfoEntity;
    }

    @Override // defpackage.dgc
    public void realmSet$sizeGroupId(Integer num) {
        this.sizeGroupId = num;
    }

    @Override // defpackage.dgc
    public void realmSet$sizeGroupName(String str) {
        this.sizeGroupName = str;
    }

    public void setDoughTypeId(Integer num) {
        realmSet$doughTypeId(num);
    }

    public void setDoughTypeName(String str) {
        realmSet$doughTypeName(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setMeasureInfo(UpsaleMeasureInfoEntity upsaleMeasureInfoEntity) {
        realmSet$measureInfo(upsaleMeasureInfoEntity);
    }

    public void setSizeGroupId(Integer num) {
        realmSet$sizeGroupId(num);
    }

    public void setSizeGroupName(String str) {
        realmSet$sizeGroupName(str);
    }

    public /* synthetic */ UpsaleSizeDetailsEntity(Integer num, String str, Integer num2, String str2, UpsaleMeasureInfoEntity upsaleMeasureInfoEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : upsaleMeasureInfoEntity);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public UpsaleSizeDetailsEntity(Integer num, String str, Integer num2, String str2, UpsaleMeasureInfoEntity upsaleMeasureInfoEntity) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$doughTypeId(num);
        realmSet$doughTypeName(str);
        realmSet$sizeGroupId(num2);
        realmSet$sizeGroupName(str2);
        realmSet$measureInfo(upsaleMeasureInfoEntity);
    }
}
