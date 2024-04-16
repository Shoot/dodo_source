package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ym;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzaProductCardData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"Lo78;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "menuItemId", "b", "cartItemId", "defaultShoppingItem", DateTokenConverter.CONVERTER_KEY, "I", "()I", "positionInMenu", "Lym$d;", e.a, "Lym$d;", "()Lym$d;", "screen", "f", "Z", "()Z", "isHeroProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILym$d;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o78  reason: default package */
/* loaded from: classes2.dex */
public final class o78 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final ym.d e;
    private final boolean f;

    public o78(String str, String str2, String str3, int i, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(dVar, "screen");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = dVar;
        this.f = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final ym.d e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o78)) {
            return false;
        }
        o78 o78Var = (o78) obj;
        if (z65.c(this.a, o78Var.a) && z65.c(this.b, o78Var.b) && z65.c(this.c, o78Var.c) && this.d == o78Var.d && this.e == o78Var.e && this.f == o78Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        ym.d dVar = this.e;
        boolean z = this.f;
        return "PizzaProductCardData(menuItemId=" + str + ", cartItemId=" + str2 + ", defaultShoppingItem=" + str3 + ", positionInMenu=" + i + ", screen=" + dVar + ", isHeroProduct=" + z + ")";
    }

    public /* synthetic */ o78(String str, String str2, String str3, int i, ym.d dVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i, dVar, (i2 & 32) != 0 ? false : z);
    }
}
