package com.dodopizza.persistence.entity.cart;

import com.dodopizza.persistence.entity.BonusActionEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DataPromoCodeEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 %2\u00020\u0001:\u0001%BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0004\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;", "Lio/realm/n0;", "", "promoCode", "Ljava/lang/String;", "getPromoCode", "()Ljava/lang/String;", "setPromoCode", "(Ljava/lang/String;)V", "", "status", "I", "getStatus", "()I", "setStatus", "(I)V", "Lcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;", "appliedInfo", "Lcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;", "getAppliedInfo", "()Lcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;", "setAppliedInfo", "(Lcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;)V", "description", "getDescription", "setDescription", "getDescription$annotations", "()V", "Lcom/dodopizza/persistence/entity/BonusActionEntity;", "bonusAction", "Lcom/dodopizza/persistence/entity/BonusActionEntity;", "getBonusAction", "()Lcom/dodopizza/persistence/entity/BonusActionEntity;", "setBonusAction", "(Lcom/dodopizza/persistence/entity/BonusActionEntity;)V", "<init>", "(Ljava/lang/String;ILcom/dodopizza/persistence/entity/cart/AppliedInfoEntity;Ljava/lang/String;Lcom/dodopizza/persistence/entity/BonusActionEntity;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DataPromoCodeEntity extends n0 implements qfc {
    public static final Companion Companion = new Companion(null);
    public static final int DOES_NOT_EXIST = 3;
    public static final int STATUS_OK = 1;
    public static final int WRONG_CONDITIONS = 2;
    private AppliedInfoEntity appliedInfo;
    private BonusActionEntity bonusAction;
    private String description;
    private String promoCode;
    private int status;

    /* compiled from: DataPromoCodeEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity$Companion;", "", "()V", "DOES_NOT_EXIST", "", "STATUS_OK", "WRONG_CONDITIONS", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DataPromoCodeEntity() {
        this(null, 0, null, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public AppliedInfoEntity getAppliedInfo() {
        return realmGet$appliedInfo();
    }

    public BonusActionEntity getBonusAction() {
        return realmGet$bonusAction();
    }

    public String getDescription() {
        return realmGet$description();
    }

    public String getPromoCode() {
        return realmGet$promoCode();
    }

    public int getStatus() {
        return realmGet$status();
    }

    @Override // defpackage.qfc
    public AppliedInfoEntity realmGet$appliedInfo() {
        return this.appliedInfo;
    }

    @Override // defpackage.qfc
    public BonusActionEntity realmGet$bonusAction() {
        return this.bonusAction;
    }

    @Override // defpackage.qfc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.qfc
    public String realmGet$promoCode() {
        return this.promoCode;
    }

    @Override // defpackage.qfc
    public int realmGet$status() {
        return this.status;
    }

    @Override // defpackage.qfc
    public void realmSet$appliedInfo(AppliedInfoEntity appliedInfoEntity) {
        this.appliedInfo = appliedInfoEntity;
    }

    @Override // defpackage.qfc
    public void realmSet$bonusAction(BonusActionEntity bonusActionEntity) {
        this.bonusAction = bonusActionEntity;
    }

    @Override // defpackage.qfc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.qfc
    public void realmSet$promoCode(String str) {
        this.promoCode = str;
    }

    @Override // defpackage.qfc
    public void realmSet$status(int i) {
        this.status = i;
    }

    public void setAppliedInfo(AppliedInfoEntity appliedInfoEntity) {
        realmSet$appliedInfo(appliedInfoEntity);
    }

    public void setBonusAction(BonusActionEntity bonusActionEntity) {
        realmSet$bonusAction(bonusActionEntity);
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public void setPromoCode(String str) {
        realmSet$promoCode(str);
    }

    public void setStatus(int i) {
        realmSet$status(i);
    }

    public /* synthetic */ DataPromoCodeEntity(String str, int i, AppliedInfoEntity appliedInfoEntity, String str2, BonusActionEntity bonusActionEntity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new AppliedInfoEntity(0, null, 3, null) : appliedInfoEntity, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : bonusActionEntity);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DataPromoCodeEntity(String str, int i, AppliedInfoEntity appliedInfoEntity, String str2, BonusActionEntity bonusActionEntity) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$promoCode(str);
        realmSet$status(i);
        realmSet$appliedInfo(appliedInfoEntity);
        realmSet$description(str2);
        realmSet$bonusAction(bonusActionEntity);
    }

    public static /* synthetic */ void getDescription$annotations() {
    }
}
