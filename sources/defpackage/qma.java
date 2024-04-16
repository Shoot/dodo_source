package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: SingleProduct.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003By\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\"\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00102\u001a\u00020\u0004\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\"¢\u0006\u0004\b5\u00106J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u001b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010+\u001a\b\u0012\u0004\u0012\u00020)0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b*\u0010'R\u001a\u00100\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b1\u0010\u000fR \u00104\u001a\b\u0012\u0004\u0012\u0002030\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b\f\u0010'¨\u00067"}, d2 = {"Lqma;", "Lfl8;", "Lum8;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", Action.NAME_ATTRIBUTE, c.a, e.a, "category", DateTokenConverter.CONVERTER_KEY, "f", "description", "allergens", "allergensCanContain", "Lrl8;", "g", "Lrl8;", "i", "()Lrl8;", "foodValue", "", "Lul8;", Image.TYPE_HIGH, "Ljava/util/Collection;", "k", "()Ljava/util/Collection;", "ingredients", "Ltl8;", "j", "images", "Lkm8;", "Lkm8;", Image.TYPE_MEDIUM, "()Lkm8;", "size", "l", "metaProductId", "Lejb;", "toppings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl8;Ljava/util/Collection;Ljava/util/Collection;Lkm8;Ljava/lang/String;Ljava/util/Collection;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: qma  reason: default package */
/* loaded from: classes.dex */
public final class qma extends fl8 implements um8, Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final rl8 g;
    private final Collection<ul8> h;
    private final Collection<tl8> i;
    private final km8 j;
    private final String k;
    private final Collection<ejb> l;

    public qma(String str, String str2, String str3, String str4, String str5, String str6, rl8 rl8Var, Collection<ul8> collection, Collection<tl8> collection2, km8 km8Var, String str7, Collection<ejb> collection3) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "category");
        z65.h(str4, "description");
        z65.h(str5, "allergens");
        z65.h(str6, "allergensCanContain");
        z65.h(rl8Var, "foodValue");
        z65.h(collection, "ingredients");
        z65.h(collection2, "images");
        z65.h(km8Var, "size");
        z65.h(str7, "metaProductId");
        z65.h(collection3, "toppings");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = rl8Var;
        this.h = collection;
        this.i = collection2;
        this.j = km8Var;
        this.k = str7;
        this.l = collection3;
    }

    @Override // defpackage.um8
    public Collection<ejb> a() {
        return this.l;
    }

    @Override // defpackage.fl8
    public String b() {
        return this.e;
    }

    @Override // defpackage.fl8
    public String c() {
        return this.f;
    }

    @Override // defpackage.fl8
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qma)) {
            return false;
        }
        qma qmaVar = (qma) obj;
        if (z65.c(this.a, qmaVar.a) && z65.c(this.b, qmaVar.b) && z65.c(this.c, qmaVar.c) && z65.c(this.d, qmaVar.d) && z65.c(this.e, qmaVar.e) && z65.c(this.f, qmaVar.f) && z65.c(this.g, qmaVar.g) && z65.c(this.h, qmaVar.h) && z65.c(this.i, qmaVar.i) && z65.c(this.j, qmaVar.j) && z65.c(this.k, qmaVar.k) && z65.c(this.l, qmaVar.l)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fl8
    public String f() {
        return this.d;
    }

    @Override // defpackage.fl8
    public String getId() {
        return this.a;
    }

    @Override // defpackage.fl8
    public String getName() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    @Override // defpackage.fl8
    public rl8 i() {
        return this.g;
    }

    @Override // defpackage.fl8
    public Collection<tl8> j() {
        return this.i;
    }

    @Override // defpackage.fl8
    public Collection<ul8> k() {
        return this.h;
    }

    @Override // defpackage.fl8
    public String l() {
        return this.k;
    }

    @Override // defpackage.fl8
    public km8 m() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        rl8 rl8Var = this.g;
        Collection<ul8> collection = this.h;
        Collection<tl8> collection2 = this.i;
        km8 km8Var = this.j;
        String str7 = this.k;
        Collection<ejb> collection3 = this.l;
        return "SingleProduct(id=" + str + ", name=" + str2 + ", category=" + str3 + ", description=" + str4 + ", allergens=" + str5 + ", allergensCanContain=" + str6 + ", foodValue=" + rl8Var + ", ingredients=" + collection + ", images=" + collection2 + ", size=" + km8Var + ", metaProductId=" + str7 + ", toppings=" + collection3 + ")";
    }
}
