package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PersonalOffer.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b6\u00107J\u0099\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b0\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105¨\u00068"}, d2 = {"Lzz7;", "", "", "id", "offerImageUrl", "offerName", "offerConditions", "Lj08;", "offerType", "Le08;", "applyingType", "beginDateUtc", "endDateUtc", "promocode", "", "isCollaboration", "collaborationForwardLink", "", "Ljk7;", "orderTypes", "Ln2a;", "secretAction", "a", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", Image.TYPE_HIGH, c.a, "i", DateTokenConverter.CONVERTER_KEY, "g", e.a, "Lj08;", "j", "()Lj08;", "Le08;", "getApplyingType", "()Le08;", "l", "Z", "n", "()Z", "k", "Ljava/util/List;", "()Ljava/util/List;", Image.TYPE_MEDIUM, "Ln2a;", "()Ln2a;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj08;Le08;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ln2a;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zz7  reason: default package */
/* loaded from: classes4.dex */
public final class zz7 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final j08 e;
    private final e08 f;
    private final String g;
    private final String h;
    private final String i;
    private final boolean j;
    private final String k;
    private final List<jk7> l;
    private final n2a m;

    /* JADX WARN: Multi-variable type inference failed */
    public zz7(String str, String str2, String str3, String str4, j08 j08Var, e08 e08Var, String str5, String str6, String str7, boolean z, String str8, List<? extends jk7> list, n2a n2aVar) {
        z65.h(str, "id");
        z65.h(str2, "offerImageUrl");
        z65.h(str3, "offerName");
        z65.h(str4, "offerConditions");
        z65.h(j08Var, "offerType");
        z65.h(e08Var, "applyingType");
        z65.h(str8, "collaborationForwardLink");
        z65.h(list, "orderTypes");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j08Var;
        this.f = e08Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z;
        this.k = str8;
        this.l = list;
        this.m = n2aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zz7 b(zz7 zz7Var, String str, String str2, String str3, String str4, j08 j08Var, e08 e08Var, String str5, String str6, String str7, boolean z, String str8, List list, n2a n2aVar, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        j08 j08Var2;
        e08 e08Var2;
        String str13;
        String str14;
        String str15;
        boolean z2;
        String str16;
        List<jk7> list2;
        n2a n2aVar2;
        if ((i & 1) != 0) {
            str9 = zz7Var.a;
        } else {
            str9 = str;
        }
        if ((i & 2) != 0) {
            str10 = zz7Var.b;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            str11 = zz7Var.c;
        } else {
            str11 = str3;
        }
        if ((i & 8) != 0) {
            str12 = zz7Var.d;
        } else {
            str12 = str4;
        }
        if ((i & 16) != 0) {
            j08Var2 = zz7Var.e;
        } else {
            j08Var2 = j08Var;
        }
        if ((i & 32) != 0) {
            e08Var2 = zz7Var.f;
        } else {
            e08Var2 = e08Var;
        }
        if ((i & 64) != 0) {
            str13 = zz7Var.g;
        } else {
            str13 = str5;
        }
        if ((i & 128) != 0) {
            str14 = zz7Var.h;
        } else {
            str14 = str6;
        }
        if ((i & 256) != 0) {
            str15 = zz7Var.i;
        } else {
            str15 = str7;
        }
        if ((i & 512) != 0) {
            z2 = zz7Var.j;
        } else {
            z2 = z;
        }
        if ((i & 1024) != 0) {
            str16 = zz7Var.k;
        } else {
            str16 = str8;
        }
        if ((i & 2048) != 0) {
            list2 = zz7Var.l;
        } else {
            list2 = list;
        }
        if ((i & 4096) != 0) {
            n2aVar2 = zz7Var.m;
        } else {
            n2aVar2 = n2aVar;
        }
        return zz7Var.a(str9, str10, str11, str12, j08Var2, e08Var2, str13, str14, str15, z2, str16, list2, n2aVar2);
    }

    public final zz7 a(String str, String str2, String str3, String str4, j08 j08Var, e08 e08Var, String str5, String str6, String str7, boolean z, String str8, List<? extends jk7> list, n2a n2aVar) {
        z65.h(str, "id");
        z65.h(str2, "offerImageUrl");
        z65.h(str3, "offerName");
        z65.h(str4, "offerConditions");
        z65.h(j08Var, "offerType");
        z65.h(e08Var, "applyingType");
        z65.h(str8, "collaborationForwardLink");
        z65.h(list, "orderTypes");
        return new zz7(str, str2, str3, str4, j08Var, e08Var, str5, str6, str7, z, str8, list, n2aVar);
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.k;
    }

    public final String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz7)) {
            return false;
        }
        zz7 zz7Var = (zz7) obj;
        if (z65.c(this.a, zz7Var.a) && z65.c(this.b, zz7Var.b) && z65.c(this.c, zz7Var.c) && z65.c(this.d, zz7Var.d) && this.e == zz7Var.e && this.f == zz7Var.f && z65.c(this.g, zz7Var.g) && z65.c(this.h, zz7Var.h) && z65.c(this.i, zz7Var.i) && this.j == zz7Var.j && z65.c(this.k, zz7Var.k) && z65.c(this.l, zz7Var.l) && z65.c(this.m, zz7Var.m)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.h;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.i;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int a = (((((((i3 + hashCode3) * 31) + a91.a(this.j)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31;
        n2a n2aVar = this.m;
        if (n2aVar != null) {
            i = n2aVar.hashCode();
        }
        return a + i;
    }

    public final String i() {
        return this.c;
    }

    public final j08 j() {
        return this.e;
    }

    public final List<jk7> k() {
        return this.l;
    }

    public final String l() {
        return this.i;
    }

    public final n2a m() {
        return this.m;
    }

    public final boolean n() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        j08 j08Var = this.e;
        e08 e08Var = this.f;
        String str5 = this.g;
        String str6 = this.h;
        String str7 = this.i;
        boolean z = this.j;
        String str8 = this.k;
        List<jk7> list = this.l;
        n2a n2aVar = this.m;
        return "PersonalOffer(id=" + str + ", offerImageUrl=" + str2 + ", offerName=" + str3 + ", offerConditions=" + str4 + ", offerType=" + j08Var + ", applyingType=" + e08Var + ", beginDateUtc=" + str5 + ", endDateUtc=" + str6 + ", promocode=" + str7 + ", isCollaboration=" + z + ", collaborationForwardLink=" + str8 + ", orderTypes=" + list + ", secretAction=" + n2aVar + ")";
    }
}
