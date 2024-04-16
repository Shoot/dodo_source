package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ShoppingInfo.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u000e¨\u0006)"}, d2 = {"Lrja;", "Lqja;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lhn6;", "b", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", c.a, "t", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Ll18;", DateTokenConverter.CONVERTER_KEY, "Ll18;", "v", "()Ll18;", "personalPrice", e.a, "Z", "p", "()Z", "isStopped", "f", "G0", ShoppingInfoEntity.FIELD_SHOPPING_ID, "<init>", "(Ljava/lang/String;Lhn6;Ljava/lang/String;Ll18;ZLjava/lang/String;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: rja  reason: default package */
/* loaded from: classes.dex */
public final class rja implements qja, Serializable {
    private final String a;
    private final hn6 b;
    private final String c;
    private final l18 d;
    private final boolean e;
    private final String f;

    public rja(String str, hn6 hn6Var, String str2, l18 l18Var, boolean z, String str3) {
        z65.h(str, "id");
        z65.h(hn6Var, "price");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str3, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        this.a = str;
        this.b = hn6Var;
        this.c = str2;
        this.d = l18Var;
        this.e = z;
        this.f = str3;
    }

    @Override // defpackage.qja
    public String G0() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rja)) {
            return false;
        }
        rja rjaVar = (rja) obj;
        if (z65.c(this.a, rjaVar.a) && z65.c(this.b, rjaVar.b) && z65.c(this.c, rjaVar.c) && z65.c(this.d, rjaVar.d) && this.e == rjaVar.e && z65.c(this.f, rjaVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qja
    public String getId() {
        return this.a;
    }

    @Override // defpackage.qja
    public hn6 h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        l18 l18Var = this.d;
        if (l18Var == null) {
            hashCode = 0;
        } else {
            hashCode = l18Var.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + a91.a(this.e)) * 31) + this.f.hashCode();
    }

    @Override // defpackage.qja
    public boolean p() {
        return this.e;
    }

    @Override // defpackage.qja
    public String t() {
        return this.c;
    }

    public String toString() {
        String str = this.a;
        hn6 hn6Var = this.b;
        String str2 = this.c;
        l18 l18Var = this.d;
        boolean z = this.e;
        String str3 = this.f;
        return "ShoppingInfoImpl(id=" + str + ", price=" + hn6Var + ", productId=" + str2 + ", personalPrice=" + l18Var + ", isStopped=" + z + ", shoppingId=" + str3 + ")";
    }

    @Override // defpackage.qja
    public l18 v() {
        return this.d;
    }
}
