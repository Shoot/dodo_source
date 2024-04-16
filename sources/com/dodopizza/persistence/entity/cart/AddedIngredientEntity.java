package com.dodopizza.persistence.entity.cart;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddedIngredientEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0005\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\t¨\u0006&"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/AddedIngredientEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "", "count", "I", "getCount", "()I", "setCount", "(I)V", Action.NAME_ATTRIBUTE, "getName", "setName", "", "price", "D", "getPrice", "()D", "setPrice", "(D)V", "", "isInStop", "Z", "()Z", "setInStop", "(Z)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;ILjava/lang/String;DZ)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class AddedIngredientEntity extends n0 implements yi3, hfc {
    private int count;
    private String externalId;
    private String id;
    private boolean isInStop;
    private String name;
    private double price;

    public AddedIngredientEntity() {
        this(null, 0, null, 0.0d, false, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public int getCount() {
        return realmGet$count();
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getName() {
        return realmGet$name();
    }

    public double getPrice() {
        return realmGet$price();
    }

    public boolean isInStop() {
        return realmGet$isInStop();
    }

    @Override // defpackage.hfc
    public int realmGet$count() {
        return this.count;
    }

    @Override // defpackage.hfc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.hfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.hfc
    public boolean realmGet$isInStop() {
        return this.isInStop;
    }

    @Override // defpackage.hfc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.hfc
    public double realmGet$price() {
        return this.price;
    }

    @Override // defpackage.hfc
    public void realmSet$count(int i) {
        this.count = i;
    }

    @Override // defpackage.hfc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.hfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.hfc
    public void realmSet$isInStop(boolean z) {
        this.isInStop = z;
    }

    @Override // defpackage.hfc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.hfc
    public void realmSet$price(double d) {
        this.price = d;
    }

    public void setCount(int i) {
        realmSet$count(i);
    }

    public void setExternalId(String str) {
        z65.h(str, "<set-?>");
        realmSet$externalId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
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

    public /* synthetic */ AddedIngredientEntity(String str, int i, String str2, double d, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? false : z);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public AddedIngredientEntity(String str, int i, String str2, double d, boolean z) {
        z65.h(str, ShoppingInfoEntity.FIELD_EXTERNAL_ID);
        z65.h(str2, Action.NAME_ATTRIBUTE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$count(i);
        realmSet$name(str2);
        realmSet$price(d);
        realmSet$isInStop(z);
    }
}
