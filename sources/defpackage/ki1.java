package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ym;
import kotlin.Metadata;
/* compiled from: ComboTemplateConstructorFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\t\u0010 ¨\u0006$"}, d2 = {"Lki1;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "menuId", "I", e.a, "()I", "slot", "Lflb;", c.a, "Lflb;", "f", "()Lflb;", "transitionInfo", DateTokenConverter.CONVERTER_KEY, "selectedProductId", "Lym$d;", "Lym$d;", "()Lym$d;", "screen", "Lgj1;", "Lgj1;", "()Lgj1;", "comboType", "<init>", "(Ljava/lang/String;ILflb;Ljava/lang/String;Lym$d;Lgj1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ki1  reason: default package */
/* loaded from: classes4.dex */
public final class ki1 {
    private final String a;
    private final int b;
    private final flb c;
    private final String d;
    private final ym.d e;
    private final gj1 f;

    public ki1(String str, int i, flb flbVar, String str2, ym.d dVar, gj1 gj1Var) {
        z65.h(str, "menuId");
        z65.h(flbVar, "transitionInfo");
        z65.h(str2, "selectedProductId");
        z65.h(dVar, "screen");
        z65.h(gj1Var, "comboType");
        this.a = str;
        this.b = i;
        this.c = flbVar;
        this.d = str2;
        this.e = dVar;
        this.f = gj1Var;
    }

    public final gj1 a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final ym.d c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki1)) {
            return false;
        }
        ki1 ki1Var = (ki1) obj;
        if (z65.c(this.a, ki1Var.a) && this.b == ki1Var.b && z65.c(this.c, ki1Var.c) && z65.c(this.d, ki1Var.d) && this.e == ki1Var.e && this.f == ki1Var.f) {
            return true;
        }
        return false;
    }

    public final flb f() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        flb flbVar = this.c;
        String str2 = this.d;
        ym.d dVar = this.e;
        gj1 gj1Var = this.f;
        return "ComboTemplateConstructorData(menuId=" + str + ", slot=" + i + ", transitionInfo=" + flbVar + ", selectedProductId=" + str2 + ", screen=" + dVar + ", comboType=" + gj1Var + ")";
    }
}
