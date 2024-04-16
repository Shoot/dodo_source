package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartProduct.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u000f\u0010!R\u0017\u0010'\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006*"}, d2 = {"Lmr0;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", Action.NAME_ATTRIBUTE, c.a, "imageUrl", "Lkl8;", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", "category", "Lhn6;", e.a, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "f", "I", "()I", "size", "g", "dough", "Z", "()Z", "isInStop", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Lhn6;IIZ)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: mr0  reason: default package */
/* loaded from: classes.dex */
public final class mr0 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final kl8 d;
    private final hn6 e;
    private final int f;
    private final int g;
    private final boolean h;

    public mr0(String str, String str2, String str3, kl8 kl8Var, hn6 hn6Var, int i, int i2, boolean z) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "imageUrl");
        z65.h(kl8Var, "category");
        z65.h(hn6Var, "price");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = kl8Var;
        this.e = hn6Var;
        this.f = i;
        this.g = i2;
        this.h = z;
    }

    public final kl8 a() {
        return this.d;
    }

    public final int b() {
        return this.g;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.f;
    }

    public final boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr0)) {
            return false;
        }
        mr0 mr0Var = (mr0) obj;
        if (z65.c(this.a, mr0Var.a) && z65.c(this.b, mr0Var.b) && z65.c(this.c, mr0Var.c) && this.d == mr0Var.d && z65.c(this.e, mr0Var.e) && this.f == mr0Var.f && this.g == mr0Var.g && this.h == mr0Var.h) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.a;
    }

    public final String getName() {
        return this.b;
    }

    public final hn6 h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g) * 31) + a91.a(this.h);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        kl8 kl8Var = this.d;
        hn6 hn6Var = this.e;
        int i = this.f;
        int i2 = this.g;
        boolean z = this.h;
        return "CartProduct(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", category=" + kl8Var + ", price=" + hn6Var + ", size=" + i + ", dough=" + i2 + ", isInStop=" + z + ")";
    }

    public /* synthetic */ mr0(String str, String str2, String str3, kl8 kl8Var, hn6 hn6Var, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? kl8.j : kl8Var, (i3 & 16) != 0 ? kn6.f() : hn6Var, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) == 0 ? z : false);
    }
}
