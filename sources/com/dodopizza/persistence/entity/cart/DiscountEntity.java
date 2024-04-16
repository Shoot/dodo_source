package com.dodopizza.persistence.entity.cart;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DiscountEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b(\u0010)R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\t¨\u0006*"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "Lyi3;", "Lio/realm/n0;", "", "bonusActionId", "Ljava/lang/String;", "getBonusActionId", "()Ljava/lang/String;", "setBonusActionId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "description", "getDescription", "setDescription", "", "amount", "D", "getAmount", "()D", "setAmount", "(D)V", "", "loyaltyCoinsUsed", "J", "getLoyaltyCoinsUsed", "()J", "setLoyaltyCoinsUsed", "(J)V", "Lcom/dodopizza/persistence/entity/cart/PersonalPriceDiscountEntity;", "personalPriceDiscount", "Lcom/dodopizza/persistence/entity/cart/PersonalPriceDiscountEntity;", "getPersonalPriceDiscount", "()Lcom/dodopizza/persistence/entity/cart/PersonalPriceDiscountEntity;", "setPersonalPriceDiscount", "(Lcom/dodopizza/persistence/entity/cart/PersonalPriceDiscountEntity;)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJLcom/dodopizza/persistence/entity/cart/PersonalPriceDiscountEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DiscountEntity extends n0 implements yi3, rfc {
    private double amount;
    private String bonusActionId;
    private String description;
    private String id;
    private long loyaltyCoinsUsed;
    private PersonalPriceDiscountEntity personalPriceDiscount;
    private String title;

    public DiscountEntity() {
        this(null, null, null, 0.0d, 0L, null, 63, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public double getAmount() {
        return realmGet$amount();
    }

    public String getBonusActionId() {
        return realmGet$bonusActionId();
    }

    public String getDescription() {
        return realmGet$description();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public long getLoyaltyCoinsUsed() {
        return realmGet$loyaltyCoinsUsed();
    }

    public PersonalPriceDiscountEntity getPersonalPriceDiscount() {
        return realmGet$personalPriceDiscount();
    }

    public String getTitle() {
        return realmGet$title();
    }

    @Override // defpackage.rfc
    public double realmGet$amount() {
        return this.amount;
    }

    @Override // defpackage.rfc
    public String realmGet$bonusActionId() {
        return this.bonusActionId;
    }

    @Override // defpackage.rfc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.rfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.rfc
    public long realmGet$loyaltyCoinsUsed() {
        return this.loyaltyCoinsUsed;
    }

    @Override // defpackage.rfc
    public PersonalPriceDiscountEntity realmGet$personalPriceDiscount() {
        return this.personalPriceDiscount;
    }

    @Override // defpackage.rfc
    public String realmGet$title() {
        return this.title;
    }

    @Override // defpackage.rfc
    public void realmSet$amount(double d) {
        this.amount = d;
    }

    @Override // defpackage.rfc
    public void realmSet$bonusActionId(String str) {
        this.bonusActionId = str;
    }

    @Override // defpackage.rfc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.rfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.rfc
    public void realmSet$loyaltyCoinsUsed(long j) {
        this.loyaltyCoinsUsed = j;
    }

    @Override // defpackage.rfc
    public void realmSet$personalPriceDiscount(PersonalPriceDiscountEntity personalPriceDiscountEntity) {
        this.personalPriceDiscount = personalPriceDiscountEntity;
    }

    @Override // defpackage.rfc
    public void realmSet$title(String str) {
        this.title = str;
    }

    public void setAmount(double d) {
        realmSet$amount(d);
    }

    public void setBonusActionId(String str) {
        realmSet$bonusActionId(str);
    }

    public void setDescription(String str) {
        z65.h(str, "<set-?>");
        realmSet$description(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setLoyaltyCoinsUsed(long j) {
        realmSet$loyaltyCoinsUsed(j);
    }

    public void setPersonalPriceDiscount(PersonalPriceDiscountEntity personalPriceDiscountEntity) {
        realmSet$personalPriceDiscount(personalPriceDiscountEntity);
    }

    public void setTitle(String str) {
        z65.h(str, "<set-?>");
        realmSet$title(str);
    }

    public /* synthetic */ DiscountEntity(String str, String str2, String str3, double d, long j, PersonalPriceDiscountEntity personalPriceDiscountEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0L : j, (i & 32) == 0 ? personalPriceDiscountEntity : null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DiscountEntity(String str, String str2, String str3, double d, long j, PersonalPriceDiscountEntity personalPriceDiscountEntity) {
        z65.h(str2, "title");
        z65.h(str3, "description");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$bonusActionId(str);
        realmSet$title(str2);
        realmSet$description(str3);
        realmSet$amount(d);
        realmSet$loyaltyCoinsUsed(j);
        realmSet$personalPriceDiscount(personalPriceDiscountEntity);
    }
}
