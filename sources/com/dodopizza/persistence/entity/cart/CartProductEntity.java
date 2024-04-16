package com.dodopizza.persistence.entity.cart;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartProductEntity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0014\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b1\u00102R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\"\u0010%\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\"\u0010)\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0005\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\t¨\u00063"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/CartProductEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "category", "getCategory", "setCategory", "", "price", "D", "getPrice", "()D", "setPrice", "(D)V", "", "size", "I", "getSize", "()I", "setSize", "(I)V", "Lcom/dodopizza/persistence/entity/ImageEntity;", ElementGenerator.TYPE_IMAGE, "Lcom/dodopizza/persistence/entity/ImageEntity;", "getImage", "()Lcom/dodopizza/persistence/entity/ImageEntity;", "setImage", "(Lcom/dodopizza/persistence/entity/ImageEntity;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "dough", "getDough", "setDough", "", "isInStop", "Z", "()Z", "setInStop", "(Z)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;DILcom/dodopizza/persistence/entity/ImageEntity;Ljava/lang/String;IZ)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CartProductEntity extends n0 implements yi3, nfc {
    private String category;
    private int dough;
    private String externalId;
    private String id;
    private ImageEntity image;
    private boolean isInStop;
    private String name;
    private double price;
    private int size;

    public CartProductEntity() {
        this(null, null, 0.0d, 0, null, null, 0, false, 255, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCategory() {
        return realmGet$category();
    }

    public int getDough() {
        return realmGet$dough();
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

    public boolean isInStop() {
        return realmGet$isInStop();
    }

    @Override // defpackage.nfc
    public String realmGet$category() {
        return this.category;
    }

    @Override // defpackage.nfc
    public int realmGet$dough() {
        return this.dough;
    }

    @Override // defpackage.nfc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.nfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.nfc
    public ImageEntity realmGet$image() {
        return this.image;
    }

    @Override // defpackage.nfc
    public boolean realmGet$isInStop() {
        return this.isInStop;
    }

    @Override // defpackage.nfc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.nfc
    public double realmGet$price() {
        return this.price;
    }

    @Override // defpackage.nfc
    public int realmGet$size() {
        return this.size;
    }

    @Override // defpackage.nfc
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // defpackage.nfc
    public void realmSet$dough(int i) {
        this.dough = i;
    }

    @Override // defpackage.nfc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.nfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.nfc
    public void realmSet$image(ImageEntity imageEntity) {
        this.image = imageEntity;
    }

    @Override // defpackage.nfc
    public void realmSet$isInStop(boolean z) {
        this.isInStop = z;
    }

    @Override // defpackage.nfc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.nfc
    public void realmSet$price(double d) {
        this.price = d;
    }

    @Override // defpackage.nfc
    public void realmSet$size(int i) {
        this.size = i;
    }

    public void setCategory(String str) {
        z65.h(str, "<set-?>");
        realmSet$category(str);
    }

    public void setDough(int i) {
        realmSet$dough(i);
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

    public /* synthetic */ CartProductEntity(String str, String str2, double d, int i, ImageEntity imageEntity, String str3, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? 0 : i, (i3 & 16) == 0 ? imageEntity : null, (i3 & 32) == 0 ? str3 : "", (i3 & 64) != 0 ? 0 : i2, (i3 & 128) == 0 ? z : false);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CartProductEntity(String str, String str2, double d, int i, ImageEntity imageEntity, String str3, int i2, boolean z) {
        z65.h(str2, "category");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$category(str2);
        realmSet$price(d);
        realmSet$size(i);
        realmSet$image(imageEntity);
        realmSet$name(str3);
        realmSet$dough(i2);
        realmSet$isInStop(z);
    }
}
