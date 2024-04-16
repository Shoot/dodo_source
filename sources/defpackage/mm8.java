package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: HalvesAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lmm8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "tagKey", "b", "pizzaId", c.a, "pizzaName", DateTokenConverter.CONVERTER_KEY, "price", "Lzc;", "Lzc;", "()Lzc;", "analyticsHalfSide", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzc;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mm8  reason: default package */
/* loaded from: classes2.dex */
public final class mm8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final zc e;

    public mm8(String str, String str2, String str3, String str4, zc zcVar) {
        z65.h(str, "tagKey");
        z65.h(str2, "pizzaId");
        z65.h(str3, "pizzaName");
        z65.h(str4, "price");
        z65.h(zcVar, "analyticsHalfSide");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = zcVar;
    }

    public final zc a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm8)) {
            return false;
        }
        mm8 mm8Var = (mm8) obj;
        if (z65.c(this.a, mm8Var.a) && z65.c(this.b, mm8Var.b) && z65.c(this.c, mm8Var.c) && z65.c(this.d, mm8Var.d) && this.e == mm8Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        zc zcVar = this.e;
        return "ProductTagAnalyticData(tagKey=" + str + ", pizzaId=" + str2 + ", pizzaName=" + str3 + ", price=" + str4 + ", analyticsHalfSide=" + zcVar + ")";
    }
}
