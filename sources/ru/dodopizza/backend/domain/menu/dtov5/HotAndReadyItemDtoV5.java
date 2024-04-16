package ru.dodopizza.backend.domain.menu.dtov5;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: HotAndReadyItemDtoV5.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/HotAndReadyItemDtoV5;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "(Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotAndReadyItemDtoV5 {
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String productId;

    public HotAndReadyItemDtoV5(String str) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        this.productId = str;
    }

    public static /* synthetic */ HotAndReadyItemDtoV5 copy$default(HotAndReadyItemDtoV5 hotAndReadyItemDtoV5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotAndReadyItemDtoV5.productId;
        }
        return hotAndReadyItemDtoV5.copy(str);
    }

    public final String component1() {
        return this.productId;
    }

    public final HotAndReadyItemDtoV5 copy(String str) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        return new HotAndReadyItemDtoV5(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HotAndReadyItemDtoV5) && z65.c(this.productId, ((HotAndReadyItemDtoV5) obj).productId)) {
            return true;
        }
        return false;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return this.productId.hashCode();
    }

    public String toString() {
        String str = this.productId;
        return "HotAndReadyItemDtoV5(productId=" + str + ")";
    }
}
