package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: IngredientV5.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\f¨\u0006%"}, d2 = {"Lo25;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMaterialTypeId", "()Ljava/lang/String;", "materialTypeId", "b", "getName", Action.NAME_ATTRIBUTE, c.a, "I", "getQuantity", "()I", "quantity", "", "Ltu8;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getQuantityVariations", "()Ljava/util/List;", "quantityVariations", e.a, "getIndex", "index", "f", "getImageLink", "imageLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/lang/String;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: o25  reason: default package */
/* loaded from: classes.dex */
public final class o25 {
    private final String a;
    private final String b;
    private final int c;
    private final List<tu8> d;
    private final int e;
    private final String f;

    public o25(String str, String str2, int i, List<tu8> list, int i2, String str3) {
        z65.h(str, "materialTypeId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(list, "quantityVariations");
        z65.h(str3, "imageLink");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
        this.e = i2;
        this.f = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o25)) {
            return false;
        }
        o25 o25Var = (o25) obj;
        if (z65.c(this.a, o25Var.a) && z65.c(this.b, o25Var.b) && this.c == o25Var.c && z65.c(this.d, o25Var.d) && this.e == o25Var.e && z65.c(this.f, o25Var.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        List<tu8> list = this.d;
        int i2 = this.e;
        String str3 = this.f;
        return "IngredientV5(materialTypeId=" + str + ", name=" + str2 + ", quantity=" + i + ", quantityVariations=" + list + ", index=" + i2 + ", imageLink=" + str3 + ")";
    }
}
