package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: LoyaltyProductVO.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u000e\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\"\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Le26;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "g", "()Z", "isStopped", "b", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_SHOPPING_ID, c.a, Action.NAME_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "description", "Ltl8;", "Ltl8;", "()Ltl8;", ElementGenerator.TYPE_IMAGE, "", "f", "D", "()D", "price", Image.TYPE_HIGH, "(Z)V", "isPurchaseAvailable", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl8;DZ)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e26  reason: default package */
/* loaded from: classes2.dex */
public final class e26 {
    private final boolean a;
    private final String b;
    private final String c;
    private final String d;
    private final tl8 e;
    private final double f;
    private boolean g;

    public e26(boolean z, String str, String str2, String str3, tl8 tl8Var, double d, boolean z2) {
        z65.h(str, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(tl8Var, ElementGenerator.TYPE_IMAGE);
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = tl8Var;
        this.f = d;
        this.g = z2;
    }

    public final String a() {
        return this.d;
    }

    public final tl8 b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final double d() {
        return this.f;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e26)) {
            return false;
        }
        e26 e26Var = (e26) obj;
        if (this.a == e26Var.a && z65.c(this.b, e26Var.b) && z65.c(this.c, e26Var.c) && z65.c(this.d, e26Var.d) && z65.c(this.e, e26Var.e) && Double.compare(this.f, e26Var.f) == 0 && this.g == e26Var.g) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.a;
    }

    public final void h(boolean z) {
        this.g = z;
    }

    public int hashCode() {
        return (((((((((((a91.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + nkb.a(this.f)) * 31) + a91.a(this.g);
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        tl8 tl8Var = this.e;
        double d = this.f;
        boolean z2 = this.g;
        return "LoyaltyProductVO(isStopped=" + z + ", shoppingId=" + str + ", name=" + str2 + ", description=" + str3 + ", image=" + tl8Var + ", price=" + d + ", isPurchaseAvailable=" + z2 + ")";
    }
}
