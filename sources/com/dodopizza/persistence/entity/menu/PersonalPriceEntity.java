package com.dodopizza.persistence.entity.menu;

import com.dodopizza.persistence.entity.MoneyType;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalPriceEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0016\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\"\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\t¨\u0006("}, d2 = {"Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "Lcom/dodopizza/persistence/entity/MoneyType;", "personalPrice", "Lcom/dodopizza/persistence/entity/MoneyType;", "getPersonalPrice", "()Lcom/dodopizza/persistence/entity/MoneyType;", "setPersonalPrice", "(Lcom/dodopizza/persistence/entity/MoneyType;)V", "", "discountEndTime", "J", "getDiscountEndTime", "()J", "setDiscountEndTime", "(J)V", "", "personalDiscount", "I", "getPersonalDiscount", "()I", "setPersonalDiscount", "(I)V", "discountMode", "getDiscountMode", "setDiscountMode", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Lcom/dodopizza/persistence/entity/MoneyType;JII)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PersonalPriceEntity extends n0 implements yi3, ugc {
    public static final Companion Companion = new Companion(null);
    public static final int FINAL_PRICE = 1;
    public static final int PERCENTAGE = 2;
    private long discountEndTime;
    private int discountMode;
    private String id;
    private int personalDiscount;
    private MoneyType personalPrice;
    private String productId;

    /* compiled from: PersonalPriceEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity$Companion;", "", "()V", "FINAL_PRICE", "", "PERCENTAGE", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PersonalPriceEntity() {
        this(null, null, 0L, 0, 0, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public long getDiscountEndTime() {
        return realmGet$discountEndTime();
    }

    public int getDiscountMode() {
        return realmGet$discountMode();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public int getPersonalDiscount() {
        return realmGet$personalDiscount();
    }

    public MoneyType getPersonalPrice() {
        return realmGet$personalPrice();
    }

    public String getProductId() {
        return realmGet$productId();
    }

    @Override // defpackage.ugc
    public long realmGet$discountEndTime() {
        return this.discountEndTime;
    }

    @Override // defpackage.ugc
    public int realmGet$discountMode() {
        return this.discountMode;
    }

    @Override // defpackage.ugc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ugc
    public int realmGet$personalDiscount() {
        return this.personalDiscount;
    }

    @Override // defpackage.ugc
    public MoneyType realmGet$personalPrice() {
        return this.personalPrice;
    }

    @Override // defpackage.ugc
    public String realmGet$productId() {
        return this.productId;
    }

    @Override // defpackage.ugc
    public void realmSet$discountEndTime(long j) {
        this.discountEndTime = j;
    }

    @Override // defpackage.ugc
    public void realmSet$discountMode(int i) {
        this.discountMode = i;
    }

    @Override // defpackage.ugc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ugc
    public void realmSet$personalDiscount(int i) {
        this.personalDiscount = i;
    }

    @Override // defpackage.ugc
    public void realmSet$personalPrice(MoneyType moneyType) {
        this.personalPrice = moneyType;
    }

    @Override // defpackage.ugc
    public void realmSet$productId(String str) {
        this.productId = str;
    }

    public void setDiscountEndTime(long j) {
        realmSet$discountEndTime(j);
    }

    public void setDiscountMode(int i) {
        realmSet$discountMode(i);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setPersonalDiscount(int i) {
        realmSet$personalDiscount(i);
    }

    public void setPersonalPrice(MoneyType moneyType) {
        realmSet$personalPrice(moneyType);
    }

    public void setProductId(String str) {
        z65.h(str, "<set-?>");
        realmSet$productId(str);
    }

    public /* synthetic */ PersonalPriceEntity(String str, MoneyType moneyType, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : moneyType, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 1 : i2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PersonalPriceEntity(String str, MoneyType moneyType, long j, int i, int i2) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$productId(str);
        realmSet$personalPrice(moneyType);
        realmSet$discountEndTime(j);
        realmSet$personalDiscount(i);
        realmSet$discountMode(i2);
    }
}
