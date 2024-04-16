package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: LoyaltyProduct.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001e"}, d2 = {"Ly16;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "t", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "b", "G0", ShoppingInfoEntity.FIELD_SHOPPING_ID, c.a, "getName", Action.NAME_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "description", "Ltl8;", e.a, "Ltl8;", "()Ltl8;", ElementGenerator.TYPE_IMAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl8;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y16  reason: default package */
/* loaded from: classes4.dex */
public final class y16 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final tl8 e;

    public y16(String str, String str2, String str3, String str4, tl8 tl8Var) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "description");
        z65.h(tl8Var, ElementGenerator.TYPE_IMAGE);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = tl8Var;
    }

    public final String G0() {
        return this.b;
    }

    public final String a() {
        return this.d;
    }

    public final tl8 b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y16)) {
            return false;
        }
        y16 y16Var = (y16) obj;
        if (z65.c(this.a, y16Var.a) && z65.c(this.b, y16Var.b) && z65.c(this.c, y16Var.c) && z65.c(this.d, y16Var.d) && z65.c(this.e, y16Var.e)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.c;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String t() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        tl8 tl8Var = this.e;
        return "LoyaltyProduct(productId=" + str + ", shoppingId=" + str2 + ", name=" + str3 + ", description=" + str4 + ", image=" + tl8Var + ")";
    }
}
