package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PromoCode.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00032\u00020\u0001:\u0001\nB?\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006#"}, d2 = {"Lop8;", "", "", Image.TYPE_HIGH, "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "promoCode", "b", "I", "getDiscount", "()I", "discount", c.a, "getImageUrl", "imageUrl", "g", "title", e.a, "description", "f", "statusDescription", "Leq8;", "Leq8;", "()Leq8;", "promoCodeStatus", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leq8;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: op8  reason: default package */
/* loaded from: classes4.dex */
public final class op8 {
    public static final a h = new a(null);
    private static final op8 i = new op8("", 0, "", "", "", "", eq8.c);
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final eq8 g;

    /* compiled from: PromoCode.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lop8$a;", "", "Lop8;", "DEFAULT", "Lop8;", "a", "()Lop8;", "getDEFAULT$annotations", "()V", "<init>", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: op8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final op8 a() {
            return op8.i;
        }
    }

    public op8(String str, int i2, String str2, String str3, String str4, String str5, eq8 eq8Var) {
        z65.h(str, "promoCode");
        z65.h(str2, "imageUrl");
        z65.h(str3, "title");
        z65.h(str4, "description");
        z65.h(str5, "statusDescription");
        z65.h(eq8Var, "promoCodeStatus");
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = eq8Var;
    }

    public static final op8 b() {
        return h.a();
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final eq8 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op8)) {
            return false;
        }
        op8 op8Var = (op8) obj;
        if (z65.c(this.a, op8Var.a) && this.b == op8Var.b && z65.c(this.c, op8Var.c) && z65.c(this.d, op8Var.d) && z65.c(this.e, op8Var.e) && z65.c(this.f, op8Var.f) && this.g == op8Var.g) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.d;
    }

    public final boolean h() {
        eq8 eq8Var = this.g;
        if (eq8Var != eq8.a && eq8Var != eq8.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        int i2 = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        eq8 eq8Var = this.g;
        return "PromoCode(promoCode=" + str + ", discount=" + i2 + ", imageUrl=" + str2 + ", title=" + str3 + ", description=" + str4 + ", statusDescription=" + str5 + ", promoCodeStatus=" + eq8Var + ")";
    }
}
