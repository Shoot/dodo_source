package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: UpsaleProduct.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006("}, d2 = {"Lzsb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, "Ltl8;", c.a, "Ltl8;", "()Ltl8;", ElementGenerator.TYPE_IMAGE, "", "D", "f", "()D", "price", e.a, "I", "()I", "orderInCart", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "category", "Letb;", "g", "Letb;", "()Letb;", "upsaleSizeDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltl8;DILjava/lang/Integer;Letb;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: zsb  reason: default package */
/* loaded from: classes.dex */
public final class zsb {
    private final String a;
    private final String b;
    private final tl8 c;
    private final double d;
    private final int e;
    private final Integer f;
    private final etb g;

    public zsb(String str, String str2, tl8 tl8Var, double d, int i, Integer num, etb etbVar) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(tl8Var, ElementGenerator.TYPE_IMAGE);
        z65.h(etbVar, "upsaleSizeDetails");
        this.a = str;
        this.b = str2;
        this.c = tl8Var;
        this.d = d;
        this.e = i;
        this.f = num;
        this.g = etbVar;
    }

    public final Integer a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final tl8 c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsb)) {
            return false;
        }
        zsb zsbVar = (zsb) obj;
        if (z65.c(this.a, zsbVar.a) && z65.c(this.b, zsbVar.b) && z65.c(this.c, zsbVar.c) && Double.compare(this.d, zsbVar.d) == 0 && this.e == zsbVar.e && z65.c(this.f, zsbVar.f) && z65.c(this.g, zsbVar.g)) {
            return true;
        }
        return false;
    }

    public final double f() {
        return this.d;
    }

    public final etb g() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d)) * 31) + this.e) * 31;
        Integer num = this.f;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        tl8 tl8Var = this.c;
        double d = this.d;
        int i = this.e;
        Integer num = this.f;
        etb etbVar = this.g;
        return "UpsaleProduct(id=" + str + ", name=" + str2 + ", image=" + tl8Var + ", price=" + d + ", orderInCart=" + i + ", category=" + num + ", upsaleSizeDetails=" + etbVar + ")";
    }
}
