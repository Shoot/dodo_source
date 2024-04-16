package com.dodopizza.persistence.entity.menu;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PromoActionEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "code", "getCode", "setCode", "", "kind", "I", "getKind", "()I", "setKind", "(I)V", "params", "getParams", "setParams", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PromoActionEntity extends n0 implements yi3, xgc {
    private String code;
    private String id;
    private int kind;
    private String params;
    private String productId;

    public PromoActionEntity() {
        this(null, null, 0, null, 15, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCode() {
        return realmGet$code();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public int getKind() {
        return realmGet$kind();
    }

    public String getParams() {
        return realmGet$params();
    }

    public String getProductId() {
        return realmGet$productId();
    }

    @Override // defpackage.xgc
    public String realmGet$code() {
        return this.code;
    }

    @Override // defpackage.xgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.xgc
    public int realmGet$kind() {
        return this.kind;
    }

    @Override // defpackage.xgc
    public String realmGet$params() {
        return this.params;
    }

    @Override // defpackage.xgc
    public String realmGet$productId() {
        return this.productId;
    }

    @Override // defpackage.xgc
    public void realmSet$code(String str) {
        this.code = str;
    }

    @Override // defpackage.xgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.xgc
    public void realmSet$kind(int i) {
        this.kind = i;
    }

    @Override // defpackage.xgc
    public void realmSet$params(String str) {
        this.params = str;
    }

    @Override // defpackage.xgc
    public void realmSet$productId(String str) {
        this.productId = str;
    }

    public void setCode(String str) {
        z65.h(str, "<set-?>");
        realmSet$code(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setKind(int i) {
        realmSet$kind(i);
    }

    public void setParams(String str) {
        z65.h(str, "<set-?>");
        realmSet$params(str);
    }

    public void setProductId(String str) {
        z65.h(str, "<set-?>");
        realmSet$productId(str);
    }

    public /* synthetic */ PromoActionEntity(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PromoActionEntity(String str, String str2, int i, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, "code");
        z65.h(str3, "params");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$productId(str);
        realmSet$code(str2);
        realmSet$kind(i);
        realmSet$params(str3);
    }
}
