package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: DeviceInfoForOrder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001d"}, d2 = {"Lv13;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "acceptHeader", "b", c.a, "language", "I", "()I", "colorDepth", DateTokenConverter.CONVERTER_KEY, "screenHeight", e.a, "screenWidth", "f", "timeZone", "g", "userAgent", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v13  reason: default package */
/* loaded from: classes4.dex */
public final class v13 {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;

    public v13(String str, String str2, int i, int i2, int i3, int i4, String str3) {
        z65.h(str, "acceptHeader");
        z65.h(str2, "language");
        z65.h(str3, "userAgent");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str3;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v13)) {
            return false;
        }
        v13 v13Var = (v13) obj;
        if (z65.c(this.a, v13Var.a) && z65.c(this.b, v13Var.b) && this.c == v13Var.c && this.d == v13Var.d && this.e == v13Var.e && this.f == v13Var.f && z65.c(this.g, v13Var.g)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        String str3 = this.g;
        return "DeviceInfoForOrder(acceptHeader=" + str + ", language=" + str2 + ", colorDepth=" + i + ", screenHeight=" + i2 + ", screenWidth=" + i3 + ", timeZone=" + i4 + ", userAgent=" + str3 + ")";
    }
}
