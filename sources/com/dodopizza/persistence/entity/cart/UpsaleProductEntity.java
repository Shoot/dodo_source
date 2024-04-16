package com.dodopizza.persistence.entity.cart;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.ImageEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleProductEntity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b2\u00103R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0005\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\t¨\u00064"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleProductEntity;", "Lyi3;", "Lio/realm/n0;", "", "upsaleProductId", "Ljava/lang/String;", "getUpsaleProductId", "()Ljava/lang/String;", "setUpsaleProductId", "(Ljava/lang/String;)V", "Lcom/dodopizza/persistence/entity/ImageEntity;", ElementGenerator.TYPE_IMAGE, "Lcom/dodopizza/persistence/entity/ImageEntity;", "getImage", "()Lcom/dodopizza/persistence/entity/ImageEntity;", "setImage", "(Lcom/dodopizza/persistence/entity/ImageEntity;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "", "orderInCart", "I", "getOrderInCart", "()I", "setOrderInCart", "(I)V", "", "price", "D", "getPrice", "()D", "setPrice", "(D)V", "category", "Ljava/lang/Integer;", "getCategory", "()Ljava/lang/Integer;", "setCategory", "(Ljava/lang/Integer;)V", "Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;", "promotingSizeDetailsEntity", "Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;", "getPromotingSizeDetailsEntity", "()Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;", "setPromotingSizeDetailsEntity", "(Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Lcom/dodopizza/persistence/entity/ImageEntity;Ljava/lang/String;IDLjava/lang/Integer;Lcom/dodopizza/persistence/entity/cart/UpsaleSizeDetailsEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class UpsaleProductEntity extends n0 implements yi3, cgc {
    private Integer category;
    private String id;
    private ImageEntity image;
    private String name;
    private int orderInCart;
    private double price;
    private UpsaleSizeDetailsEntity promotingSizeDetailsEntity;
    private String upsaleProductId;

    public UpsaleProductEntity() {
        this(null, null, null, 0, 0.0d, null, null, 127, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public Integer getCategory() {
        return realmGet$category();
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

    public int getOrderInCart() {
        return realmGet$orderInCart();
    }

    public double getPrice() {
        return realmGet$price();
    }

    public UpsaleSizeDetailsEntity getPromotingSizeDetailsEntity() {
        return realmGet$promotingSizeDetailsEntity();
    }

    public String getUpsaleProductId() {
        return realmGet$upsaleProductId();
    }

    @Override // defpackage.cgc
    public Integer realmGet$category() {
        return this.category;
    }

    @Override // defpackage.cgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.cgc
    public ImageEntity realmGet$image() {
        return this.image;
    }

    @Override // defpackage.cgc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.cgc
    public int realmGet$orderInCart() {
        return this.orderInCart;
    }

    @Override // defpackage.cgc
    public double realmGet$price() {
        return this.price;
    }

    @Override // defpackage.cgc
    public UpsaleSizeDetailsEntity realmGet$promotingSizeDetailsEntity() {
        return this.promotingSizeDetailsEntity;
    }

    @Override // defpackage.cgc
    public String realmGet$upsaleProductId() {
        return this.upsaleProductId;
    }

    @Override // defpackage.cgc
    public void realmSet$category(Integer num) {
        this.category = num;
    }

    @Override // defpackage.cgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.cgc
    public void realmSet$image(ImageEntity imageEntity) {
        this.image = imageEntity;
    }

    @Override // defpackage.cgc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.cgc
    public void realmSet$orderInCart(int i) {
        this.orderInCart = i;
    }

    @Override // defpackage.cgc
    public void realmSet$price(double d) {
        this.price = d;
    }

    @Override // defpackage.cgc
    public void realmSet$promotingSizeDetailsEntity(UpsaleSizeDetailsEntity upsaleSizeDetailsEntity) {
        this.promotingSizeDetailsEntity = upsaleSizeDetailsEntity;
    }

    @Override // defpackage.cgc
    public void realmSet$upsaleProductId(String str) {
        this.upsaleProductId = str;
    }

    public void setCategory(Integer num) {
        realmSet$category(num);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setImage(ImageEntity imageEntity) {
        realmSet$image(imageEntity);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setOrderInCart(int i) {
        realmSet$orderInCart(i);
    }

    public void setPrice(double d) {
        realmSet$price(d);
    }

    public void setPromotingSizeDetailsEntity(UpsaleSizeDetailsEntity upsaleSizeDetailsEntity) {
        realmSet$promotingSizeDetailsEntity(upsaleSizeDetailsEntity);
    }

    public void setUpsaleProductId(String str) {
        z65.h(str, "<set-?>");
        realmSet$upsaleProductId(str);
    }

    public /* synthetic */ UpsaleProductEntity(String str, ImageEntity imageEntity, String str2, int i, double d, Integer num, UpsaleSizeDetailsEntity upsaleSizeDetailsEntity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : imageEntity, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? null : num, (i2 & 64) == 0 ? upsaleSizeDetailsEntity : null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public UpsaleProductEntity(String str, ImageEntity imageEntity, String str2, int i, double d, Integer num, UpsaleSizeDetailsEntity upsaleSizeDetailsEntity) {
        z65.h(str, "upsaleProductId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$upsaleProductId(str);
        realmSet$image(imageEntity);
        realmSet$name(str2);
        realmSet$orderInCart(i);
        realmSet$price(d);
        realmSet$category(num);
        realmSet$promotingSizeDetailsEntity(upsaleSizeDetailsEntity);
    }
}
