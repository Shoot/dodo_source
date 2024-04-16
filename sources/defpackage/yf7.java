package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderItem.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0086\b\u0018\u0000 22\u00020\u0001:\u0001\u001eB\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b>\u0010?J\u00ad\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b)\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b4\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b5\u0010!R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010!R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b3\u0010;R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b'\u0010=¨\u0006@"}, d2 = {"Lyf7;", "", "", "guid", "Lkl8;", "productCategory", "title", "description", "imageUrl", "", "number", "Lhn6;", "price", "totalPrice", "doughId", "doughTypeName", "sizeId", "sizeGroupName", "", "isFromCombo", "size", "Lnb6;", "measure", "Lzf7;", "customization", "b", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lkl8;", "l", "()Lkl8;", c.a, "p", DateTokenConverter.CONVERTER_KEY, "getDescription", e.a, Image.TYPE_HIGH, "f", "I", "j", "()I", "Lhn6;", "k", "()Lhn6;", "q", "i", "o", "n", Image.TYPE_MEDIUM, "Z", "r", "()Z", "Lnb6;", "()Lnb6;", "Lzf7;", "()Lzf7;", "<init>", "(Ljava/lang/String;Lkl8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILhn6;Lhn6;ILjava/lang/String;ILjava/lang/String;ZLjava/lang/String;Lnb6;Lzf7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yf7  reason: default package */
/* loaded from: classes4.dex */
public final class yf7 {
    public static final a q = new a(null);
    private static final yf7 r;
    private static final List<yf7> s;
    private final String a;
    private final kl8 b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final hn6 g;
    private final hn6 h;
    private final int i;
    private final String j;
    private final int k;
    private final String l;
    private final boolean m;
    private final String n;
    private final nb6 o;
    private final zf7 p;

    /* compiled from: OrderItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lyf7$a;", "", "", "Lyf7;", "DEFAULT_LIST", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yf7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<yf7> a() {
            return yf7.s;
        }
    }

    static {
        List<yf7> l;
        kl8 kl8Var = kl8.h;
        kn6 kn6Var = kn6.c;
        r = new yf7("", kl8Var, "", "", "", -1, kn6Var.c(0), kn6Var.c(0), 0, null, 0, null, false, "", nb6.h, zf7.d.a());
        l = kc1.l();
        s = l;
    }

    public yf7(String str, kl8 kl8Var, String str2, String str3, String str4, int i, hn6 hn6Var, hn6 hn6Var2, int i2, String str5, int i3, String str6, boolean z, String str7, nb6 nb6Var, zf7 zf7Var) {
        z65.h(str, "guid");
        z65.h(kl8Var, "productCategory");
        z65.h(str2, "title");
        z65.h(str3, "description");
        z65.h(str4, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "totalPrice");
        z65.h(str7, "size");
        z65.h(nb6Var, "measure");
        z65.h(zf7Var, "customization");
        this.a = str;
        this.b = kl8Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = hn6Var;
        this.h = hn6Var2;
        this.i = i2;
        this.j = str5;
        this.k = i3;
        this.l = str6;
        this.m = z;
        this.n = str7;
        this.o = nb6Var;
        this.p = zf7Var;
    }

    public final yf7 b(String str, kl8 kl8Var, String str2, String str3, String str4, int i, hn6 hn6Var, hn6 hn6Var2, int i2, String str5, int i3, String str6, boolean z, String str7, nb6 nb6Var, zf7 zf7Var) {
        z65.h(str, "guid");
        z65.h(kl8Var, "productCategory");
        z65.h(str2, "title");
        z65.h(str3, "description");
        z65.h(str4, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "totalPrice");
        z65.h(str7, "size");
        z65.h(nb6Var, "measure");
        z65.h(zf7Var, "customization");
        return new yf7(str, kl8Var, str2, str3, str4, i, hn6Var, hn6Var2, i2, str5, i3, str6, z, str7, nb6Var, zf7Var);
    }

    public final zf7 d() {
        return this.p;
    }

    public final int e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf7)) {
            return false;
        }
        yf7 yf7Var = (yf7) obj;
        if (z65.c(this.a, yf7Var.a) && this.b == yf7Var.b && z65.c(this.c, yf7Var.c) && z65.c(this.d, yf7Var.d) && z65.c(this.e, yf7Var.e) && this.f == yf7Var.f && z65.c(this.g, yf7Var.g) && z65.c(this.h, yf7Var.h) && this.i == yf7Var.i && z65.c(this.j, yf7Var.j) && this.k == yf7Var.k && z65.c(this.l, yf7Var.l) && this.m == yf7Var.m && z65.c(this.n, yf7Var.n) && this.o == yf7Var.o && z65.c(this.p, yf7Var.p)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.j;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i) * 31;
        String str = this.j;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode2 + hashCode) * 31) + this.k) * 31;
        String str2 = this.l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((i2 + i) * 31) + a91.a(this.m)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode();
    }

    public final nb6 i() {
        return this.o;
    }

    public final int j() {
        return this.f;
    }

    public final hn6 k() {
        return this.g;
    }

    public final kl8 l() {
        return this.b;
    }

    public final String m() {
        return this.n;
    }

    public final String n() {
        return this.l;
    }

    public final int o() {
        return this.k;
    }

    public final String p() {
        return this.c;
    }

    public final hn6 q() {
        return this.h;
    }

    public final boolean r() {
        return this.m;
    }

    public String toString() {
        String str = this.a;
        kl8 kl8Var = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        int i = this.f;
        hn6 hn6Var = this.g;
        hn6 hn6Var2 = this.h;
        int i2 = this.i;
        String str5 = this.j;
        int i3 = this.k;
        String str6 = this.l;
        boolean z = this.m;
        String str7 = this.n;
        nb6 nb6Var = this.o;
        zf7 zf7Var = this.p;
        return "OrderItem(guid=" + str + ", productCategory=" + kl8Var + ", title=" + str2 + ", description=" + str3 + ", imageUrl=" + str4 + ", number=" + i + ", price=" + hn6Var + ", totalPrice=" + hn6Var2 + ", doughId=" + i2 + ", doughTypeName=" + str5 + ", sizeId=" + i3 + ", sizeGroupName=" + str6 + ", isFromCombo=" + z + ", size=" + str7 + ", measure=" + nb6Var + ", customization=" + zf7Var + ")";
    }
}
