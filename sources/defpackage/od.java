package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AnalyticsProduct.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006 "}, d2 = {"Lod;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", c.a, "id", "", "Ljava/lang/Double;", e.a, "()Ljava/lang/Double;", "price", "currency", "category", "f", "g", "variant", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: od  reason: default package */
/* loaded from: classes4.dex */
public final class od {
    private final String a;
    private final String b;
    private final Double c;
    private final String d;
    private final String e;
    private final String f;
    private final Integer g;

    public od(String str, String str2, Double d, String str3, String str4, String str5, Integer num) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final Double e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        if (z65.c(this.a, odVar.a) && z65.c(this.b, odVar.b) && z65.c(this.c, odVar.c) && z65.c(this.d, odVar.d) && z65.c(this.e, odVar.e) && z65.c(this.f, odVar.f) && z65.c(this.g, odVar.g)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.g;
    }

    public final String g() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Double d = this.c;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.g;
        if (num != null) {
            i = num.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        Double d = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Integer num = this.g;
        return "AnalyticsProduct(name=" + str + ", id=" + str2 + ", price=" + d + ", currency=" + str3 + ", category=" + str4 + ", variant=" + str5 + ", quantity=" + num + ")";
    }

    public /* synthetic */ od(String str, String str2, Double d, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num);
    }
}
