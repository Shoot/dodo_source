package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: BuyMoreItem.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u001c"}, d2 = {"Lvi0;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "G0", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_SHOPPING_ID, "b", "getName", Action.NAME_ATTRIBUTE, "Lhn6;", c.a, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", DateTokenConverter.CONVERTER_KEY, "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vi0  reason: default package */
/* loaded from: classes4.dex */
public final class vi0 implements Serializable {
    private final String a;
    private final String b;
    private final hn6 c;
    private final String d;

    public vi0(String str, String str2, hn6 hn6Var, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        z65.h(str3, "imageUrl");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = str3;
    }

    public final String G0() {
        return this.a;
    }

    public final String a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi0)) {
            return false;
        }
        vi0 vi0Var = (vi0) obj;
        if (z65.c(this.a, vi0Var.a) && z65.c(this.b, vi0Var.b) && z65.c(this.c, vi0Var.c) && z65.c(this.d, vi0Var.d)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.b;
    }

    public final hn6 h() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        String str3 = this.d;
        return "BuyMoreItem(shoppingId=" + str + ", name=" + str2 + ", price=" + hn6Var + ", imageUrl=" + str3 + ")";
    }
}
