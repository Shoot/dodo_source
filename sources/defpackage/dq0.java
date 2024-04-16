package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartComboSlotProduct.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015¢\u0006\u0004\bC\u0010DJ©\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010 \u001a\u0004\b6\u0010\"\"\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b*\u00101R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010 \u001a\u0004\b.\u0010\"\"\u0004\b:\u00108R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b4\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\b'\u0010?R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\b9\u0010AR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\bB\u0010A¨\u0006E"}, d2 = {"Ldq0;", "Ljava/io/Serializable;", "", "id", Action.NAME_ATTRIBUTE, "imageUrl", "Lkl8;", "category", "Lhn6;", "price", "", "size", "Lkm8;", "productSize", "sizeGroupName", "dough", "doughTypeName", "", "isInStop", "Lqq0;", "customization", "", "Lul8;", "ingredients", "Lejb;", "toppings", "a", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getName", c.a, "i", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", e.a, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "f", "I", "l", "()I", "g", "Lkm8;", "k", "()Lkm8;", Image.TYPE_MEDIUM, "setSizeGroupName", "(Ljava/lang/String;)V", "j", "setDoughTypeName", "Z", "o", "()Z", "Lqq0;", "()Lqq0;", "Ljava/util/Collection;", "()Ljava/util/Collection;", "n", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Lhn6;ILkm8;Ljava/lang/String;ILjava/lang/String;ZLqq0;Ljava/util/Collection;Ljava/util/Collection;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: dq0  reason: default package */
/* loaded from: classes.dex */
public final class dq0 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final kl8 d;
    private final hn6 e;
    private final int f;
    private final km8 g;
    private String h;
    private final int i;
    private String j;
    private final boolean k;
    private final qq0 l;
    private final Collection<ul8> m;
    private final Collection<ejb> n;

    public dq0(String str, String str2, String str3, kl8 kl8Var, hn6 hn6Var, int i, km8 km8Var, String str4, int i2, String str5, boolean z, qq0 qq0Var, Collection<ul8> collection, Collection<ejb> collection2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "imageUrl");
        z65.h(kl8Var, "category");
        z65.h(hn6Var, "price");
        z65.h(str4, "sizeGroupName");
        z65.h(str5, "doughTypeName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = kl8Var;
        this.e = hn6Var;
        this.f = i;
        this.g = km8Var;
        this.h = str4;
        this.i = i2;
        this.j = str5;
        this.k = z;
        this.l = qq0Var;
        this.m = collection;
        this.n = collection2;
    }

    public final dq0 a(String str, String str2, String str3, kl8 kl8Var, hn6 hn6Var, int i, km8 km8Var, String str4, int i2, String str5, boolean z, qq0 qq0Var, Collection<ul8> collection, Collection<ejb> collection2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "imageUrl");
        z65.h(kl8Var, "category");
        z65.h(hn6Var, "price");
        z65.h(str4, "sizeGroupName");
        z65.h(str5, "doughTypeName");
        return new dq0(str, str2, str3, kl8Var, hn6Var, i, km8Var, str4, i2, str5, z, qq0Var, collection, collection2);
    }

    public final kl8 c() {
        return this.d;
    }

    public final qq0 d() {
        return this.l;
    }

    public final int e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq0)) {
            return false;
        }
        dq0 dq0Var = (dq0) obj;
        if (z65.c(this.a, dq0Var.a) && z65.c(this.b, dq0Var.b) && z65.c(this.c, dq0Var.c) && this.d == dq0Var.d && z65.c(this.e, dq0Var.e) && this.f == dq0Var.f && z65.c(this.g, dq0Var.g) && z65.c(this.h, dq0Var.h) && this.i == dq0Var.i && z65.c(this.j, dq0Var.j) && this.k == dq0Var.k && z65.c(this.l, dq0Var.l) && z65.c(this.m, dq0Var.m) && z65.c(this.n, dq0Var.n)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.j;
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31;
        km8 km8Var = this.g;
        int i = 0;
        if (km8Var == null) {
            hashCode = 0;
        } else {
            hashCode = km8Var.hashCode();
        }
        int hashCode5 = (((((((((hashCode4 + hashCode) * 31) + this.h.hashCode()) * 31) + this.i) * 31) + this.j.hashCode()) * 31) + a91.a(this.k)) * 31;
        qq0 qq0Var = this.l;
        if (qq0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = qq0Var.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        Collection<ul8> collection = this.m;
        if (collection == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = collection.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Collection<ejb> collection2 = this.n;
        if (collection2 != null) {
            i = collection2.hashCode();
        }
        return i3 + i;
    }

    public final String i() {
        return this.c;
    }

    public final Collection<ul8> j() {
        return this.m;
    }

    public final km8 k() {
        return this.g;
    }

    public final int l() {
        return this.f;
    }

    public final String m() {
        return this.h;
    }

    public final Collection<ejb> n() {
        return this.n;
    }

    public final boolean o() {
        return this.k;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        kl8 kl8Var = this.d;
        hn6 hn6Var = this.e;
        int i = this.f;
        km8 km8Var = this.g;
        String str4 = this.h;
        int i2 = this.i;
        String str5 = this.j;
        boolean z = this.k;
        qq0 qq0Var = this.l;
        Collection<ul8> collection = this.m;
        Collection<ejb> collection2 = this.n;
        return "CartComboSlotProduct(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", category=" + kl8Var + ", price=" + hn6Var + ", size=" + i + ", productSize=" + km8Var + ", sizeGroupName=" + str4 + ", dough=" + i2 + ", doughTypeName=" + str5 + ", isInStop=" + z + ", customization=" + qq0Var + ", ingredients=" + collection + ", toppings=" + collection2 + ")";
    }

    public /* synthetic */ dq0(String str, String str2, String str3, kl8 kl8Var, hn6 hn6Var, int i, km8 km8Var, String str4, int i2, String str5, boolean z, qq0 qq0Var, Collection collection, Collection collection2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? kl8.j : kl8Var, (i3 & 16) != 0 ? kn6.f() : hn6Var, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? null : km8Var, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) == 0 ? str5 : "", (i3 & 1024) == 0 ? z : false, (i3 & 2048) != 0 ? null : qq0Var, (i3 & 4096) != 0 ? null : collection, (i3 & 8192) == 0 ? collection2 : null);
    }
}
