package com.dodopizza.persistence.entity.cart;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartProductEntity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0014\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b>\u0010?R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\"\u0010(\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR$\u0010+\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0005\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\"\u0010/\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b/\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0005\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\t¨\u0006@"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/CartComboSlotProductEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "category", "getCategory", "setCategory", "", "price", "D", "getPrice", "()D", "setPrice", "(D)V", "", "size", "I", "getSize", "()I", "setSize", "(I)V", "sizeGroupName", "getSizeGroupName", "setSizeGroupName", "Lcom/dodopizza/persistence/entity/ImageEntity;", ElementGenerator.TYPE_IMAGE, "Lcom/dodopizza/persistence/entity/ImageEntity;", "getImage", "()Lcom/dodopizza/persistence/entity/ImageEntity;", "setImage", "(Lcom/dodopizza/persistence/entity/ImageEntity;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "dough", "getDough", "setDough", "doughTypeName", "getDoughTypeName", "setDoughTypeName", "", "isInStop", "Z", "()Z", "setInStop", "(Z)V", "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "customization", "Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "getCustomization", "()Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "setCustomization", "(Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Lcom/dodopizza/persistence/entity/ImageEntity;Ljava/lang/String;ILjava/lang/String;ZLcom/dodopizza/persistence/entity/cart/CustomizationEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CartComboSlotProductEntity extends n0 implements yi3, kfc {
    private String category;
    private CustomizationEntity customization;
    private int dough;
    private String doughTypeName;
    private String externalId;
    private String id;
    private ImageEntity image;
    private boolean isInStop;
    private String name;
    private double price;
    private int size;
    private String sizeGroupName;

    public CartComboSlotProductEntity() {
        this(null, null, 0.0d, 0, null, null, null, 0, null, false, null, 2047, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCategory() {
        return realmGet$category();
    }

    public CustomizationEntity getCustomization() {
        return realmGet$customization();
    }

    public int getDough() {
        return realmGet$dough();
    }

    public String getDoughTypeName() {
        return realmGet$doughTypeName();
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public ImageEntity getImage() {
        return realmGet$image();
    }

    public String getName() {
        return realmGet$name();
    }

    public double getPrice() {
        return realmGet$price();
    }

    public int getSize() {
        return realmGet$size();
    }

    public String getSizeGroupName() {
        return realmGet$sizeGroupName();
    }

    public boolean isInStop() {
        return realmGet$isInStop();
    }

    @Override // defpackage.kfc
    public String realmGet$category() {
        return this.category;
    }

    @Override // defpackage.kfc
    public CustomizationEntity realmGet$customization() {
        return this.customization;
    }

    @Override // defpackage.kfc
    public int realmGet$dough() {
        return this.dough;
    }

    @Override // defpackage.kfc
    public String realmGet$doughTypeName() {
        return this.doughTypeName;
    }

    @Override // defpackage.kfc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.kfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.kfc
    public ImageEntity realmGet$image() {
        return this.image;
    }

    @Override // defpackage.kfc
    public boolean realmGet$isInStop() {
        return this.isInStop;
    }

    @Override // defpackage.kfc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.kfc
    public double realmGet$price() {
        return this.price;
    }

    @Override // defpackage.kfc
    public int realmGet$size() {
        return this.size;
    }

    @Override // defpackage.kfc
    public String realmGet$sizeGroupName() {
        return this.sizeGroupName;
    }

    @Override // defpackage.kfc
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // defpackage.kfc
    public void realmSet$customization(CustomizationEntity customizationEntity) {
        this.customization = customizationEntity;
    }

    @Override // defpackage.kfc
    public void realmSet$dough(int i) {
        this.dough = i;
    }

    @Override // defpackage.kfc
    public void realmSet$doughTypeName(String str) {
        this.doughTypeName = str;
    }

    @Override // defpackage.kfc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.kfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.kfc
    public void realmSet$image(ImageEntity imageEntity) {
        this.image = imageEntity;
    }

    @Override // defpackage.kfc
    public void realmSet$isInStop(boolean z) {
        this.isInStop = z;
    }

    @Override // defpackage.kfc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.kfc
    public void realmSet$price(double d) {
        this.price = d;
    }

    @Override // defpackage.kfc
    public void realmSet$size(int i) {
        this.size = i;
    }

    @Override // defpackage.kfc
    public void realmSet$sizeGroupName(String str) {
        this.sizeGroupName = str;
    }

    public void setCategory(String str) {
        z65.h(str, "<set-?>");
        realmSet$category(str);
    }

    public void setCustomization(CustomizationEntity customizationEntity) {
        realmSet$customization(customizationEntity);
    }

    public void setDough(int i) {
        realmSet$dough(i);
    }

    public void setDoughTypeName(String str) {
        realmSet$doughTypeName(str);
    }

    public void setExternalId(String str) {
        realmSet$externalId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setImage(ImageEntity imageEntity) {
        realmSet$image(imageEntity);
    }

    public void setInStop(boolean z) {
        realmSet$isInStop(z);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setPrice(double d) {
        realmSet$price(d);
    }

    public void setSize(int i) {
        realmSet$size(i);
    }

    public void setSizeGroupName(String str) {
        realmSet$sizeGroupName(str);
    }

    public /* synthetic */ CartComboSlotProductEntity(String str, String str2, double d, int i, String str3, ImageEntity imageEntity, String str4, int i2, String str5, boolean z, CustomizationEntity customizationEntity, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : imageEntity, (i3 & 64) == 0 ? str4 : "", (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : str5, (i3 & 512) == 0 ? z : false, (i3 & 1024) == 0 ? customizationEntity : null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CartComboSlotProductEntity(String str, String str2, double d, int i, String str3, ImageEntity imageEntity, String str4, int i2, String str5, boolean z, CustomizationEntity customizationEntity) {
        z65.h(str2, "category");
        z65.h(str4, Action.NAME_ATTRIBUTE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$category(str2);
        realmSet$price(d);
        realmSet$size(i);
        realmSet$sizeGroupName(str3);
        realmSet$image(imageEntity);
        realmSet$name(str4);
        realmSet$dough(i2);
        realmSet$doughTypeName(str5);
        realmSet$isInStop(z);
        realmSet$customization(customizationEntity);
    }
}
