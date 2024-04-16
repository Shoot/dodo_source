package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderDetailsItemVO.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0004\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000205\u0012\u0006\u0010:\u001a\u00020\u0007\u0012\u0006\u0010?\u001a\u00020;¢\u0006\u0004\b@\u0010AJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010)\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010.\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016R\u0019\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b0\u0010\fR\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b#\u0010\fR\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b\u001f\u00107R\u0017\u0010:\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b3\u0010(R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u001b\u0010>¨\u0006B"}, d2 = {"Lhd7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "title", "Lkl8;", "b", "Lkl8;", "()Lkl8;", "category", c.a, "I", "getSizeId", "()I", "sizeId", DateTokenConverter.CONVERTER_KEY, "getDoughId", "doughId", e.a, "i", "sizeDescription", "Lnb6;", "f", "Lnb6;", "()Lnb6;", "measure", "g", Image.TYPE_HIGH, "size", "Z", "n", "()Z", "isGift", "Lhn6;", "Lhn6;", "l", "()Lhn6;", "totalPrice", "imageUrl", "k", "count", "toppingsDescription", Image.TYPE_MEDIUM, "removeIngredientsDescription", "", "Ljava/util/List;", "()Ljava/util/List;", "pizzaHalfImages", "o", "isFromCombo", "Lb78;", "p", "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ljava/lang/String;Lkl8;IILjava/lang/String;Lnb6;Ljava/lang/String;ZLhn6;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLb78;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hd7  reason: default package */
/* loaded from: classes.dex */
public final class hd7 {
    private final String a;
    private final kl8 b;
    private final int c;
    private final int d;
    private final String e;
    private final nb6 f;
    private final String g;
    private final boolean h;
    private final hn6 i;
    private final String j;
    private final int k;
    private final String l;
    private final String m;
    private final List<String> n;
    private final boolean o;
    private final b78 p;

    public hd7(String str, kl8 kl8Var, int i, int i2, String str2, nb6 nb6Var, String str3, boolean z, hn6 hn6Var, String str4, int i3, String str5, String str6, List<String> list, boolean z2, b78 b78Var) {
        z65.h(str, "title");
        z65.h(kl8Var, "category");
        z65.h(str2, "sizeDescription");
        z65.h(nb6Var, "measure");
        z65.h(str3, "size");
        z65.h(hn6Var, "totalPrice");
        z65.h(str4, "imageUrl");
        z65.h(list, "pizzaHalfImages");
        z65.h(b78Var, "pizzaConcept");
        this.a = str;
        this.b = kl8Var;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = nb6Var;
        this.g = str3;
        this.h = z;
        this.i = hn6Var;
        this.j = str4;
        this.k = i3;
        this.l = str5;
        this.m = str6;
        this.n = list;
        this.o = z2;
        this.p = b78Var;
    }

    public final kl8 a() {
        return this.b;
    }

    public final int b() {
        return this.k;
    }

    public final String c() {
        return this.j;
    }

    public final nb6 d() {
        return this.f;
    }

    public final b78 e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd7)) {
            return false;
        }
        hd7 hd7Var = (hd7) obj;
        if (z65.c(this.a, hd7Var.a) && this.b == hd7Var.b && this.c == hd7Var.c && this.d == hd7Var.d && z65.c(this.e, hd7Var.e) && this.f == hd7Var.f && z65.c(this.g, hd7Var.g) && this.h == hd7Var.h && z65.c(this.i, hd7Var.i) && z65.c(this.j, hd7Var.j) && this.k == hd7Var.k && z65.c(this.l, hd7Var.l) && z65.c(this.m, hd7Var.m) && z65.c(this.n, hd7Var.n) && this.o == hd7Var.o && this.p == hd7Var.p) {
            return true;
        }
        return false;
    }

    public final List<String> f() {
        return this.n;
    }

    public final String g() {
        return this.m;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a91.a(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k) * 31;
        String str = this.l;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.m;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((i2 + i) * 31) + this.n.hashCode()) * 31) + a91.a(this.o)) * 31) + this.p.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return this.l;
    }

    public final hn6 l() {
        return this.i;
    }

    public final boolean m() {
        return this.o;
    }

    public final boolean n() {
        return this.h;
    }

    public String toString() {
        String str = this.a;
        kl8 kl8Var = this.b;
        int i = this.c;
        int i2 = this.d;
        String str2 = this.e;
        nb6 nb6Var = this.f;
        String str3 = this.g;
        boolean z = this.h;
        hn6 hn6Var = this.i;
        String str4 = this.j;
        int i3 = this.k;
        String str5 = this.l;
        String str6 = this.m;
        List<String> list = this.n;
        boolean z2 = this.o;
        b78 b78Var = this.p;
        return "OrderDetailsItemVO(title=" + str + ", category=" + kl8Var + ", sizeId=" + i + ", doughId=" + i2 + ", sizeDescription=" + str2 + ", measure=" + nb6Var + ", size=" + str3 + ", isGift=" + z + ", totalPrice=" + hn6Var + ", imageUrl=" + str4 + ", count=" + i3 + ", toppingsDescription=" + str5 + ", removeIngredientsDescription=" + str6 + ", pizzaHalfImages=" + list + ", isFromCombo=" + z2 + ", pizzaConcept=" + b78Var + ")";
    }
}
