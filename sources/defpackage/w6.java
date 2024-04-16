package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.address.AddressEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Address.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001\u0012B_\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000Jw\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b*\u0010\u001bR\u0017\u0010.\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lw6;", "Ljava/io/Serializable;", "address", "", "q", "", "id", "Lbza;", "street", AddressEntity.HOUSE_NUMBER_FIELD_NAME, "building", AddressEntity.APARTMENT_FIELD_NAME, "entrance", "floor", "intercome", "addressName", "comment", "postcode", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lbza;", "n", "()Lbza;", c.a, "k", DateTokenConverter.CONVERTER_KEY, e.a, "f", "i", "g", "j", Image.TYPE_HIGH, "l", Image.TYPE_MEDIUM, "Z", "o", "()Z", "isLocal", "<init>", "(Ljava/lang/String;Lbza;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w6  reason: default package */
/* loaded from: classes4.dex */
public final class w6 implements Serializable {
    public static final a m = new a(null);
    public static final w6 n;
    private final String a;
    private final bza b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;

    /* compiled from: Address.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lw6$a;", "", "", "a", "Lw6;", "DEFAULT", "Lw6;", "", "LOCAL_ID_LENGTH", "I", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return String.valueOf(System.currentTimeMillis());
        }
    }

    static {
        bza bzaVar = bza.d;
        z65.g(bzaVar, "DEFAULT");
        n = new w6("", bzaVar, "", "", "", "", "", "", "", "", "");
    }

    public w6(String str, bza bzaVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        boolean z;
        z65.h(str, "id");
        z65.h(bzaVar, "street");
        z65.h(str2, AddressEntity.HOUSE_NUMBER_FIELD_NAME);
        z65.h(str3, "building");
        z65.h(str4, AddressEntity.APARTMENT_FIELD_NAME);
        z65.h(str5, "entrance");
        z65.h(str6, "floor");
        z65.h(str7, "intercome");
        z65.h(str8, "addressName");
        z65.h(str9, "comment");
        z65.h(str10, "postcode");
        this.a = str;
        this.b = bzaVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        if (str.length() == 13 && hbb.b(str)) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
    }

    public static /* synthetic */ w6 b(w6 w6Var, String str, bza bzaVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11;
        bza bzaVar2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        if ((i & 1) != 0) {
            str11 = w6Var.a;
        } else {
            str11 = str;
        }
        if ((i & 2) != 0) {
            bzaVar2 = w6Var.b;
        } else {
            bzaVar2 = bzaVar;
        }
        if ((i & 4) != 0) {
            str12 = w6Var.c;
        } else {
            str12 = str2;
        }
        if ((i & 8) != 0) {
            str13 = w6Var.d;
        } else {
            str13 = str3;
        }
        if ((i & 16) != 0) {
            str14 = w6Var.e;
        } else {
            str14 = str4;
        }
        if ((i & 32) != 0) {
            str15 = w6Var.f;
        } else {
            str15 = str5;
        }
        if ((i & 64) != 0) {
            str16 = w6Var.g;
        } else {
            str16 = str6;
        }
        if ((i & 128) != 0) {
            str17 = w6Var.h;
        } else {
            str17 = str7;
        }
        if ((i & 256) != 0) {
            str18 = w6Var.i;
        } else {
            str18 = str8;
        }
        if ((i & 512) != 0) {
            str19 = w6Var.j;
        } else {
            str19 = str9;
        }
        if ((i & 1024) != 0) {
            str20 = w6Var.k;
        } else {
            str20 = str10;
        }
        return w6Var.a(str11, bzaVar2, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public final w6 a(String str, bza bzaVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        z65.h(str, "id");
        z65.h(bzaVar, "street");
        z65.h(str2, AddressEntity.HOUSE_NUMBER_FIELD_NAME);
        z65.h(str3, "building");
        z65.h(str4, AddressEntity.APARTMENT_FIELD_NAME);
        z65.h(str5, "entrance");
        z65.h(str6, "floor");
        z65.h(str7, "intercome");
        z65.h(str8, "addressName");
        z65.h(str9, "comment");
        z65.h(str10, "postcode");
        return new w6(str, bzaVar, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final String c() {
        return this.i;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        if (z65.c(this.a, w6Var.a) && z65.c(this.b, w6Var.b) && z65.c(this.c, w6Var.c) && z65.c(this.d, w6Var.d) && z65.c(this.e, w6Var.e) && z65.c(this.f, w6Var.f) && z65.c(this.g, w6Var.g) && z65.c(this.h, w6Var.h) && z65.c(this.i, w6Var.i) && z65.c(this.j, w6Var.j) && z65.c(this.k, w6Var.k)) {
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

    public int hashCode() {
        return (((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.h;
    }

    public final String m() {
        return this.k;
    }

    public final bza n() {
        return this.b;
    }

    public final boolean o() {
        return this.l;
    }

    public final boolean q(w6 w6Var) {
        z65.h(w6Var, "address");
        if (z65.c(this.b.b(), w6Var.b.b()) && z65.c(this.c, w6Var.c) && z65.c(this.d, w6Var.d) && z65.c(this.e, w6Var.e) && z65.c(this.f, w6Var.f) && z65.c(this.g, w6Var.g) && z65.c(this.h, w6Var.h) && z65.c(this.k, w6Var.k)) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.a;
        bza bzaVar = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.g;
        String str7 = this.h;
        String str8 = this.i;
        String str9 = this.j;
        String str10 = this.k;
        return "Address(id=" + str + ", street=" + bzaVar + ", houseNumber=" + str2 + ", building=" + str3 + ", apartment=" + str4 + ", entrance=" + str5 + ", floor=" + str6 + ", intercome=" + str7 + ", addressName=" + str8 + ", comment=" + str9 + ", postcode=" + str10 + ")";
    }
}
