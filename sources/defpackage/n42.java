package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Customer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001\u0018Be\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0084\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b&\u0010%R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Ln42;", "", "", "toString", "id", "Lf28;", "phone", "firstName", "lastName", "", "birthDay", "birthMonth", "birthYear", "orderHistoryCount", "", "loyaltyProgramBalance", "email", "", "isSubscribedOnNews", "b", "(Ljava/lang/String;Lf28;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IDLjava/lang/String;Z)Ln42;", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Lf28;", Image.TYPE_MEDIUM, "()Lf28;", c.a, Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, "j", e.a, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "f", "g", "I", "l", "()I", "D", "k", "()D", "Z", "n", "()Z", "<init>", "(Ljava/lang/String;Lf28;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IDLjava/lang/String;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n42  reason: default package */
/* loaded from: classes4.dex */
public final class n42 {
    public static final a l = new a(null);
    private static final f28 m;
    private static final n42 n;
    private final String a;
    private final f28 b;
    private final String c;
    private final String d;
    private final Integer e;
    private final Integer f;
    private final Integer g;
    private final int h;
    private final double i;
    private final String j;
    private final boolean k;

    /* compiled from: Customer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Ln42$a;", "", "Ln42;", "DEFAULT", "Ln42;", "a", "()Ln42;", "", "DEFAULT_ID", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n42$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n42 a() {
            return n42.n;
        }
    }

    static {
        f28 f28Var = new f28("+7", "");
        m = f28Var;
        n = new n42("1", f28Var, "", "", null, null, null, 0, 0.0d, "", false);
    }

    public n42(String str, f28 f28Var, String str2, String str3, Integer num, Integer num2, Integer num3, int i, double d, String str4, boolean z) {
        z65.h(str, "id");
        z65.h(f28Var, "phone");
        z65.h(str2, "firstName");
        z65.h(str3, "lastName");
        z65.h(str4, "email");
        this.a = str;
        this.b = f28Var;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = i;
        this.i = d;
        this.j = str4;
        this.k = z;
    }

    public static /* synthetic */ n42 c(n42 n42Var, String str, f28 f28Var, String str2, String str3, Integer num, Integer num2, Integer num3, int i, double d, String str4, boolean z, int i2, Object obj) {
        String str5;
        f28 f28Var2;
        String str6;
        String str7;
        Integer num4;
        Integer num5;
        Integer num6;
        int i3;
        double d2;
        String str8;
        boolean z2;
        if ((i2 & 1) != 0) {
            str5 = n42Var.a;
        } else {
            str5 = str;
        }
        if ((i2 & 2) != 0) {
            f28Var2 = n42Var.b;
        } else {
            f28Var2 = f28Var;
        }
        if ((i2 & 4) != 0) {
            str6 = n42Var.c;
        } else {
            str6 = str2;
        }
        if ((i2 & 8) != 0) {
            str7 = n42Var.d;
        } else {
            str7 = str3;
        }
        if ((i2 & 16) != 0) {
            num4 = n42Var.e;
        } else {
            num4 = num;
        }
        if ((i2 & 32) != 0) {
            num5 = n42Var.f;
        } else {
            num5 = num2;
        }
        if ((i2 & 64) != 0) {
            num6 = n42Var.g;
        } else {
            num6 = num3;
        }
        if ((i2 & 128) != 0) {
            i3 = n42Var.h;
        } else {
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            d2 = n42Var.i;
        } else {
            d2 = d;
        }
        if ((i2 & 512) != 0) {
            str8 = n42Var.j;
        } else {
            str8 = str4;
        }
        if ((i2 & 1024) != 0) {
            z2 = n42Var.k;
        } else {
            z2 = z;
        }
        return n42Var.b(str5, f28Var2, str6, str7, num4, num5, num6, i3, d2, str8, z2);
    }

    public final n42 b(String str, f28 f28Var, String str2, String str3, Integer num, Integer num2, Integer num3, int i, double d, String str4, boolean z) {
        z65.h(str, "id");
        z65.h(f28Var, "phone");
        z65.h(str2, "firstName");
        z65.h(str3, "lastName");
        z65.h(str4, "email");
        return new n42(str, f28Var, str2, str3, num, num2, num3, i, d, str4, z);
    }

    public final Integer d() {
        return this.e;
    }

    public final Integer e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n42)) {
            return false;
        }
        n42 n42Var = (n42) obj;
        if (z65.c(this.a, n42Var.a) && z65.c(this.b, n42Var.b) && z65.c(this.c, n42Var.c) && z65.c(this.d, n42Var.d) && z65.c(this.e, n42Var.e) && z65.c(this.f, n42Var.f) && z65.c(this.g, n42Var.g) && this.h == n42Var.h && Double.compare(this.i, n42Var.i) == 0 && z65.c(this.j, n42Var.j) && this.k == n42Var.k) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.g;
    }

    public final String g() {
        return this.j;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Integer num = this.e;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Integer num2 = this.f;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num3 = this.g;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return ((((((((i3 + i) * 31) + this.h) * 31) + nkb.a(this.i)) * 31) + this.j.hashCode()) * 31) + a91.a(this.k);
    }

    public final String i() {
        return this.a;
    }

    public final String j() {
        return this.d;
    }

    public final double k() {
        return this.i;
    }

    public final int l() {
        return this.h;
    }

    public final f28 m() {
        return this.b;
    }

    public final boolean n() {
        return this.k;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.a;
        return str + " " + str2;
    }
}
