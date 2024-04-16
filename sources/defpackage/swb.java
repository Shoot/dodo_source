package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: VariableProduct.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0081\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b>\u0010?J\u009d\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b'\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b,\u0010-R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b7\u0010$R\u001a\u0010\u0014\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b*\u0010$R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b!\u00101R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b9\u0010:R\u0011\u0010=\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lswb;", "Lfl8;", "Lum8;", "Ljava/io/Serializable;", "", "id", Action.NAME_ATTRIBUTE, "description", "allergens", "allergensCanContain", "Lrl8;", "foodValue", "", "Lul8;", "ingredients", "Ltl8;", "images", "Lkm8;", "size", "metaProductId", "category", "Lejb;", "toppings", "Lfna;", "sizeGroup", "o", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getName", c.a, "f", DateTokenConverter.CONVERTER_KEY, e.a, "Lrl8;", "i", "()Lrl8;", "g", "Ljava/util/Collection;", "k", "()Ljava/util/Collection;", Image.TYPE_HIGH, "j", "Lkm8;", Image.TYPE_MEDIUM, "()Lkm8;", "l", "Lfna;", "r", "()Lfna;", Image.TYPE_SMALL, "()I", "sizeGroupId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl8;Ljava/util/Collection;Ljava/util/Collection;Lkm8;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Lfna;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: swb  reason: default package */
/* loaded from: classes.dex */
public final class swb extends fl8 implements um8, Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final rl8 f;
    private final Collection<ul8> g;
    private final Collection<tl8> h;
    private final km8 i;
    private final String j;
    private final String k;
    private final Collection<ejb> l;
    private final fna m;

    public swb(String str, String str2, String str3, String str4, String str5, rl8 rl8Var, Collection<ul8> collection, Collection<tl8> collection2, km8 km8Var, String str6, String str7, Collection<ejb> collection3, fna fnaVar) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(str4, "allergens");
        z65.h(str5, "allergensCanContain");
        z65.h(rl8Var, "foodValue");
        z65.h(collection, "ingredients");
        z65.h(collection2, "images");
        z65.h(km8Var, "size");
        z65.h(str6, "metaProductId");
        z65.h(str7, "category");
        z65.h(collection3, "toppings");
        z65.h(fnaVar, "sizeGroup");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = rl8Var;
        this.g = collection;
        this.h = collection2;
        this.i = km8Var;
        this.j = str6;
        this.k = str7;
        this.l = collection3;
        this.m = fnaVar;
    }

    @Override // defpackage.um8
    public Collection<ejb> a() {
        return this.l;
    }

    @Override // defpackage.fl8
    public String b() {
        return this.d;
    }

    @Override // defpackage.fl8
    public String c() {
        return this.e;
    }

    @Override // defpackage.fl8
    public String e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swb)) {
            return false;
        }
        swb swbVar = (swb) obj;
        if (z65.c(this.a, swbVar.a) && z65.c(this.b, swbVar.b) && z65.c(this.c, swbVar.c) && z65.c(this.d, swbVar.d) && z65.c(this.e, swbVar.e) && z65.c(this.f, swbVar.f) && z65.c(this.g, swbVar.g) && z65.c(this.h, swbVar.h) && z65.c(this.i, swbVar.i) && z65.c(this.j, swbVar.j) && z65.c(this.k, swbVar.k) && z65.c(this.l, swbVar.l) && z65.c(this.m, swbVar.m)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fl8
    public String f() {
        return this.c;
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
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    @Override // defpackage.fl8
    public rl8 i() {
        return this.f;
    }

    @Override // defpackage.fl8
    public Collection<tl8> j() {
        return this.h;
    }

    @Override // defpackage.fl8
    public Collection<ul8> k() {
        return this.g;
    }

    @Override // defpackage.fl8
    public String l() {
        return this.j;
    }

    @Override // defpackage.fl8
    public km8 m() {
        return this.i;
    }

    public final swb o(String str, String str2, String str3, String str4, String str5, rl8 rl8Var, Collection<ul8> collection, Collection<tl8> collection2, km8 km8Var, String str6, String str7, Collection<ejb> collection3, fna fnaVar) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(str4, "allergens");
        z65.h(str5, "allergensCanContain");
        z65.h(rl8Var, "foodValue");
        z65.h(collection, "ingredients");
        z65.h(collection2, "images");
        z65.h(km8Var, "size");
        z65.h(str6, "metaProductId");
        z65.h(str7, "category");
        z65.h(collection3, "toppings");
        z65.h(fnaVar, "sizeGroup");
        return new swb(str, str2, str3, str4, str5, rl8Var, collection, collection2, km8Var, str6, str7, collection3, fnaVar);
    }

    public final fna r() {
        return this.m;
    }

    public final int s() {
        return this.m.d();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        rl8 rl8Var = this.f;
        Collection<ul8> collection = this.g;
        Collection<tl8> collection2 = this.h;
        km8 km8Var = this.i;
        String str6 = this.j;
        String str7 = this.k;
        Collection<ejb> collection3 = this.l;
        fna fnaVar = this.m;
        return "VariableProduct(id=" + str + ", name=" + str2 + ", description=" + str3 + ", allergens=" + str4 + ", allergensCanContain=" + str5 + ", foodValue=" + rl8Var + ", ingredients=" + collection + ", images=" + collection2 + ", size=" + km8Var + ", metaProductId=" + str6 + ", category=" + str7 + ", toppings=" + collection3 + ", sizeGroup=" + fnaVar + ")";
    }
}
