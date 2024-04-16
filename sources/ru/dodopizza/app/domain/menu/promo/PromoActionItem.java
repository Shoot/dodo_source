package ru.dodopizza.app.domain.menu.promo;

import java.util.List;
import kotlin.Metadata;
/* compiled from: PromoActionItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\nJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "", "applyToProducts", "", "", "code", "id", "kind", "", "params", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V", "getApplyToProducts", "()Ljava/util/List;", "getCode", "()Ljava/lang/String;", "getId", "getKind", "()I", "getParams", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoActionItem {
    private final List<String> applyToProducts;
    private final String code;
    private final String id;
    private final int kind;
    private final Object params;

    public PromoActionItem(List<String> list, String str, String str2, int i, Object obj) {
        z65.h(list, "applyToProducts");
        z65.h(str, "code");
        z65.h(str2, "id");
        this.applyToProducts = list;
        this.code = str;
        this.id = str2;
        this.kind = i;
        this.params = obj;
    }

    public static /* synthetic */ PromoActionItem copy$default(PromoActionItem promoActionItem, List list, String str, String str2, int i, Object obj, int i2, Object obj2) {
        List<String> list2 = list;
        if ((i2 & 1) != 0) {
            list2 = promoActionItem.applyToProducts;
        }
        if ((i2 & 2) != 0) {
            str = promoActionItem.code;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = promoActionItem.id;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = promoActionItem.kind;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            obj = promoActionItem.params;
        }
        return promoActionItem.copy(list2, str3, str4, i3, obj);
    }

    public final List<String> component1() {
        return this.applyToProducts;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.id;
    }

    public final int component4() {
        return this.kind;
    }

    public final Object component5() {
        return this.params;
    }

    public final PromoActionItem copy(List<String> list, String str, String str2, int i, Object obj) {
        z65.h(list, "applyToProducts");
        z65.h(str, "code");
        z65.h(str2, "id");
        return new PromoActionItem(list, str, str2, i, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoActionItem)) {
            return false;
        }
        PromoActionItem promoActionItem = (PromoActionItem) obj;
        if (z65.c(this.applyToProducts, promoActionItem.applyToProducts) && z65.c(this.code, promoActionItem.code) && z65.c(this.id, promoActionItem.id) && this.kind == promoActionItem.kind && z65.c(this.params, promoActionItem.params)) {
            return true;
        }
        return false;
    }

    public final List<String> getApplyToProducts() {
        return this.applyToProducts;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.id;
    }

    public final int getKind() {
        return this.kind;
    }

    public final Object getParams() {
        return this.params;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.applyToProducts.hashCode() * 31) + this.code.hashCode()) * 31) + this.id.hashCode()) * 31) + this.kind) * 31;
        Object obj = this.params;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        List<String> list = this.applyToProducts;
        String str = this.code;
        String str2 = this.id;
        int i = this.kind;
        Object obj = this.params;
        return "PromoActionItem(applyToProducts=" + list + ", code=" + str + ", id=" + str2 + ", kind=" + i + ", params=" + obj + ")";
    }
}
