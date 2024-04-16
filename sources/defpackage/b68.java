package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PickupPizzeriaVO.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b?\u0010@J\u008c\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010,\u001a\u0004\b \u0010-\"\u0004\b.\u0010/R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b\u0010\u00102\"\u0004\b3\u00104R\"\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00101\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b\u0012\u00102\"\u0004\b8\u00104R$\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b7\u0010;\"\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u00102¨\u0006A"}, d2 = {"Lb68;", "", "", "id", "localityName", "localityId", "Ld88;", "pizzeria", "pizzeriaAddress", "Ljb7;", "operationalTypeVo", "La68;", "schedule", "Lx58;", "distanceToUser", "", "isForceDisabled", "isLoading", "isSelected", "isNearest", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld88;Ljava/lang/String;Ljb7;La68;Lx58;ZZZLjava/lang/Boolean;)Lb68;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", e.a, c.a, "getLocalityId", "Ld88;", "g", "()Ld88;", "getPizzeriaAddress", "f", "Ljb7;", "()Ljb7;", "La68;", Image.TYPE_HIGH, "()La68;", "Lx58;", "()Lx58;", "setDistanceToUser", "(Lx58;)V", "i", "Z", "()Z", "setForceDisabled", "(Z)V", "j", "setLoading", "k", "setSelected", "l", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setNearest", "(Ljava/lang/Boolean;)V", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld88;Ljava/lang/String;Ljb7;La68;Lx58;ZZZLjava/lang/Boolean;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b68  reason: default package */
/* loaded from: classes2.dex */
public final class b68 {
    private final String a;
    private final String b;
    private final String c;
    private final d88 d;
    private final String e;
    private final jb7 f;
    private final a68 g;
    private x58 h;
    private boolean i;
    private boolean j;
    private boolean k;
    private Boolean l;

    public b68(String str, String str2, String str3, d88 d88Var, String str4, jb7 jb7Var, a68 a68Var, x58 x58Var, boolean z, boolean z2, boolean z3, Boolean bool) {
        z65.h(str, "id");
        z65.h(str2, "localityName");
        z65.h(str3, "localityId");
        z65.h(d88Var, "pizzeria");
        z65.h(str4, "pizzeriaAddress");
        z65.h(jb7Var, "operationalTypeVo");
        z65.h(a68Var, "schedule");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d88Var;
        this.e = str4;
        this.f = jb7Var;
        this.g = a68Var;
        this.h = x58Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = bool;
    }

    public static /* synthetic */ b68 b(b68 b68Var, String str, String str2, String str3, d88 d88Var, String str4, jb7 jb7Var, a68 a68Var, x58 x58Var, boolean z, boolean z2, boolean z3, Boolean bool, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        d88 d88Var2;
        String str8;
        jb7 jb7Var2;
        a68 a68Var2;
        x58 x58Var2;
        boolean z4;
        boolean z5;
        boolean z6;
        Boolean bool2;
        if ((i & 1) != 0) {
            str5 = b68Var.a;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            str6 = b68Var.b;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            str7 = b68Var.c;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            d88Var2 = b68Var.d;
        } else {
            d88Var2 = d88Var;
        }
        if ((i & 16) != 0) {
            str8 = b68Var.e;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            jb7Var2 = b68Var.f;
        } else {
            jb7Var2 = jb7Var;
        }
        if ((i & 64) != 0) {
            a68Var2 = b68Var.g;
        } else {
            a68Var2 = a68Var;
        }
        if ((i & 128) != 0) {
            x58Var2 = b68Var.h;
        } else {
            x58Var2 = x58Var;
        }
        if ((i & 256) != 0) {
            z4 = b68Var.i;
        } else {
            z4 = z;
        }
        if ((i & 512) != 0) {
            z5 = b68Var.j;
        } else {
            z5 = z2;
        }
        if ((i & 1024) != 0) {
            z6 = b68Var.k;
        } else {
            z6 = z3;
        }
        if ((i & 2048) != 0) {
            bool2 = b68Var.l;
        } else {
            bool2 = bool;
        }
        return b68Var.a(str5, str6, str7, d88Var2, str8, jb7Var2, a68Var2, x58Var2, z4, z5, z6, bool2);
    }

    public final b68 a(String str, String str2, String str3, d88 d88Var, String str4, jb7 jb7Var, a68 a68Var, x58 x58Var, boolean z, boolean z2, boolean z3, Boolean bool) {
        z65.h(str, "id");
        z65.h(str2, "localityName");
        z65.h(str3, "localityId");
        z65.h(d88Var, "pizzeria");
        z65.h(str4, "pizzeriaAddress");
        z65.h(jb7Var, "operationalTypeVo");
        z65.h(a68Var, "schedule");
        return new b68(str, str2, str3, d88Var, str4, jb7Var, a68Var, x58Var, z, z2, z3, bool);
    }

    public final x58 c() {
        return this.h;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b68)) {
            return false;
        }
        b68 b68Var = (b68) obj;
        if (z65.c(this.a, b68Var.a) && z65.c(this.b, b68Var.b) && z65.c(this.c, b68Var.c) && z65.c(this.d, b68Var.d) && z65.c(this.e, b68Var.e) && this.f == b68Var.f && z65.c(this.g, b68Var.g) && z65.c(this.h, b68Var.h) && this.i == b68Var.i && this.j == b68Var.j && this.k == b68Var.k && z65.c(this.l, b68Var.l)) {
            return true;
        }
        return false;
    }

    public final jb7 f() {
        return this.f;
    }

    public final d88 g() {
        return this.d;
    }

    public final a68 h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        x58 x58Var = this.h;
        int i = 0;
        if (x58Var == null) {
            hashCode = 0;
        } else {
            hashCode = x58Var.hashCode();
        }
        int a = (((((((hashCode2 + hashCode) * 31) + a91.a(this.i)) * 31) + a91.a(this.j)) * 31) + a91.a(this.k)) * 31;
        Boolean bool = this.l;
        if (bool != null) {
            i = bool.hashCode();
        }
        return a + i;
    }

    public final boolean i() {
        if (!this.i && this.f != jb7.e) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return this.j;
    }

    public final Boolean k() {
        return this.l;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        d88 d88Var = this.d;
        String str4 = this.e;
        jb7 jb7Var = this.f;
        a68 a68Var = this.g;
        x58 x58Var = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        Boolean bool = this.l;
        return "PickupPizzeriaVO(id=" + str + ", localityName=" + str2 + ", localityId=" + str3 + ", pizzeria=" + d88Var + ", pizzeriaAddress=" + str4 + ", operationalTypeVo=" + jb7Var + ", schedule=" + a68Var + ", distanceToUser=" + x58Var + ", isForceDisabled=" + z + ", isLoading=" + z2 + ", isSelected=" + z3 + ", isNearest=" + bool + ")";
    }

    public /* synthetic */ b68(String str, String str2, String str3, d88 d88Var, String str4, jb7 jb7Var, a68 a68Var, x58 x58Var, boolean z, boolean z2, boolean z3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d88Var, str4, jb7Var, a68Var, x58Var, z, z2, z3, (i & 2048) != 0 ? null : bool);
    }
}
