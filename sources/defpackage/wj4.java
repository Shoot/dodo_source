package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HalfPizzaIngredientsModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\b\b\u0002\u0010&\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\n\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lwj4;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "pizzaId", c.a, "pizzaName", "", "Lul8;", "Ljava/util/Collection;", "()Ljava/util/Collection;", "ingredients", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "", "Llm8;", e.a, "Ljava/util/List;", "()Ljava/util/List;", "productTags", "f", "Z", "p", "()Z", "isStopped", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Lhn6;Ljava/util/List;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wj4  reason: default package */
/* loaded from: classes2.dex */
public final class wj4 implements Serializable {
    private final String a;
    private final String b;
    private final Collection<ul8> c;
    private final hn6 d;
    private final List<lm8> e;
    private final boolean f;

    public wj4(String str, String str2, Collection<ul8> collection, hn6 hn6Var, List<lm8> list, boolean z) {
        z65.h(str, "pizzaId");
        z65.h(str2, "pizzaName");
        z65.h(collection, "ingredients");
        z65.h(hn6Var, "price");
        z65.h(list, "productTags");
        this.a = str;
        this.b = str2;
        this.c = collection;
        this.d = hn6Var;
        this.e = list;
        this.f = z;
    }

    public final Collection<ul8> a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final List<lm8> d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj4)) {
            return false;
        }
        wj4 wj4Var = (wj4) obj;
        if (z65.c(this.a, wj4Var.a) && z65.c(this.b, wj4Var.b) && z65.c(this.c, wj4Var.c) && z65.c(this.d, wj4Var.d) && z65.c(this.e, wj4Var.e) && this.f == wj4Var.f) {
            return true;
        }
        return false;
    }

    public final hn6 h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public final boolean p() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        Collection<ul8> collection = this.c;
        hn6 hn6Var = this.d;
        List<lm8> list = this.e;
        boolean z = this.f;
        return "HalfPizzaIngredientsModel(pizzaId=" + str + ", pizzaName=" + str2 + ", ingredients=" + collection + ", price=" + hn6Var + ", productTags=" + list + ", isStopped=" + z + ")";
    }
}
