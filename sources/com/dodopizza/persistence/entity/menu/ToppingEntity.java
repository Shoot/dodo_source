package com.dodopizza.persistence.entity.menu;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.MoneyType;
import im.threads.business.transport.MessageAttributes;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ToppingEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010 \u001a\u00020\u001a¢\u0006\u0004\b&\u0010'R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0005\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\t¨\u0006("}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ToppingEntity;", "Lyi3;", "Lio/realm/n0;", "", MessageAttributes.UUID, "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "parentUuid", "getParentUuid", "setParentUuid", Action.NAME_ATTRIBUTE, "getName", "setName", "imageUrl", "getImageUrl", "setImageUrl", "Lcom/dodopizza/persistence/entity/MoneyType;", "price", "Lcom/dodopizza/persistence/entity/MoneyType;", "getPrice", "()Lcom/dodopizza/persistence/entity/MoneyType;", "setPrice", "(Lcom/dodopizza/persistence/entity/MoneyType;)V", "", "isInStop", "Z", "()Z", "setInStop", "(Z)V", "canAddToVariation", "getCanAddToVariation", "setCanAddToVariation", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dodopizza/persistence/entity/MoneyType;ZZ)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ToppingEntity extends n0 implements yi3, ahc {
    private boolean canAddToVariation;
    private String id;
    private String imageUrl;
    private boolean isInStop;
    private String name;
    private String parentUuid;
    private MoneyType price;
    private String uuid;

    public ToppingEntity() {
        this(null, null, null, null, null, false, false, 127, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public boolean getCanAddToVariation() {
        return realmGet$canAddToVariation();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getImageUrl() {
        return realmGet$imageUrl();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getParentUuid() {
        return realmGet$parentUuid();
    }

    public MoneyType getPrice() {
        return realmGet$price();
    }

    public String getUuid() {
        return realmGet$uuid();
    }

    public boolean isInStop() {
        return realmGet$isInStop();
    }

    @Override // defpackage.ahc
    public boolean realmGet$canAddToVariation() {
        return this.canAddToVariation;
    }

    @Override // defpackage.ahc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ahc
    public String realmGet$imageUrl() {
        return this.imageUrl;
    }

    @Override // defpackage.ahc
    public boolean realmGet$isInStop() {
        return this.isInStop;
    }

    @Override // defpackage.ahc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.ahc
    public String realmGet$parentUuid() {
        return this.parentUuid;
    }

    @Override // defpackage.ahc
    public MoneyType realmGet$price() {
        return this.price;
    }

    @Override // defpackage.ahc
    public String realmGet$uuid() {
        return this.uuid;
    }

    @Override // defpackage.ahc
    public void realmSet$canAddToVariation(boolean z) {
        this.canAddToVariation = z;
    }

    @Override // defpackage.ahc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ahc
    public void realmSet$imageUrl(String str) {
        this.imageUrl = str;
    }

    @Override // defpackage.ahc
    public void realmSet$isInStop(boolean z) {
        this.isInStop = z;
    }

    @Override // defpackage.ahc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.ahc
    public void realmSet$parentUuid(String str) {
        this.parentUuid = str;
    }

    @Override // defpackage.ahc
    public void realmSet$price(MoneyType moneyType) {
        this.price = moneyType;
    }

    @Override // defpackage.ahc
    public void realmSet$uuid(String str) {
        this.uuid = str;
    }

    public void setCanAddToVariation(boolean z) {
        realmSet$canAddToVariation(z);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setImageUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$imageUrl(str);
    }

    public void setInStop(boolean z) {
        realmSet$isInStop(z);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setParentUuid(String str) {
        z65.h(str, "<set-?>");
        realmSet$parentUuid(str);
    }

    public void setPrice(MoneyType moneyType) {
        realmSet$price(moneyType);
    }

    public void setUuid(String str) {
        z65.h(str, "<set-?>");
        realmSet$uuid(str);
    }

    public /* synthetic */ ToppingEntity(String str, String str2, String str3, String str4, MoneyType moneyType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : moneyType, (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ToppingEntity(String str, String str2, String str3, String str4, MoneyType moneyType, boolean z, boolean z2) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(str2, "parentUuid");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "imageUrl");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$uuid(str);
        realmSet$parentUuid(str2);
        realmSet$name(str3);
        realmSet$imageUrl(str4);
        realmSet$price(moneyType);
        realmSet$isInStop(z);
        realmSet$canAddToVariation(z2);
    }
}
