package ru.dodopizza.app.domain.menu.promo;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: ProductPromoAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "code", "kind", "", "params", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getKind", "()I", "getParams", "getProductId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductPromoAction {
    private final String code;
    private final int kind;
    private final String params;
    private final String productId;

    public ProductPromoAction(String str, String str2, int i, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, "code");
        z65.h(str3, "params");
        this.productId = str;
        this.code = str2;
        this.kind = i;
        this.params = str3;
    }

    public static /* synthetic */ ProductPromoAction copy$default(ProductPromoAction productPromoAction, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = productPromoAction.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = productPromoAction.code;
        }
        if ((i2 & 4) != 0) {
            i = productPromoAction.kind;
        }
        if ((i2 & 8) != 0) {
            str3 = productPromoAction.params;
        }
        return productPromoAction.copy(str, str2, i, str3);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.code;
    }

    public final int component3() {
        return this.kind;
    }

    public final String component4() {
        return this.params;
    }

    public final ProductPromoAction copy(String str, String str2, int i, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, "code");
        z65.h(str3, "params");
        return new ProductPromoAction(str, str2, i, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPromoAction)) {
            return false;
        }
        ProductPromoAction productPromoAction = (ProductPromoAction) obj;
        if (z65.c(this.productId, productPromoAction.productId) && z65.c(this.code, productPromoAction.code) && this.kind == productPromoAction.kind && z65.c(this.params, productPromoAction.params)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getKind() {
        return this.kind;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return (((((this.productId.hashCode() * 31) + this.code.hashCode()) * 31) + this.kind) * 31) + this.params.hashCode();
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.code;
        int i = this.kind;
        String str3 = this.params;
        return "ProductPromoAction(productId=" + str + ", code=" + str2 + ", kind=" + i + ", params=" + str3 + ")";
    }
}
