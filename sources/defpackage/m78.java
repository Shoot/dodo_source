package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PizzaProduct.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0089\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0!\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00102\u001a\u00020\u0006\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030!\u0012\u0006\u00109\u001a\u000205\u0012\u0006\u0010>\u001a\u00020:\u0012\u0006\u0010D\u001a\u00020?¢\u0006\u0004\bK\u0010LJ\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010+\u001a\b\u0012\u0004\u0012\u00020(0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001a\u00100\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b1\u0010\u0010R \u00104\u001a\b\u0012\u0004\u0012\u0002030!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\r\u0010&R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108R\u0017\u0010>\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010E\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010H\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bI\u0010G¨\u0006M"}, d2 = {"Lm78;", "Lfl8;", "Lum8;", "Ljava/io/Serializable;", "", "w", "", "toString", "", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", Action.NAME_ATTRIBUTE, c.a, "f", "description", DateTokenConverter.CONVERTER_KEY, "allergens", e.a, "allergensCanContain", "Lrl8;", "Lrl8;", "i", "()Lrl8;", "foodValue", "", "Lul8;", "g", "Ljava/util/Collection;", "k", "()Ljava/util/Collection;", "ingredients", "Ltl8;", Image.TYPE_HIGH, "j", "images", "Lkm8;", "Lkm8;", Image.TYPE_MEDIUM, "()Lkm8;", "size", "l", "metaProductId", "Lejb;", "toppings", "Lfna;", "Lfna;", Image.TYPE_SMALL, "()Lfna;", "sizeGroup", "Lw63;", "Lw63;", "o", "()Lw63;", "doughType", "Lm78$a;", "n", "Lm78$a;", "r", "()Lm78$a;", "portion", "category", "u", "()I", "sizeGroupId", "q", "doughTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl8;Ljava/util/Collection;Ljava/util/Collection;Lkm8;Ljava/lang/String;Ljava/util/Collection;Lfna;Lw63;Lm78$a;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: m78  reason: default package */
/* loaded from: classes.dex */
public final class m78 extends fl8 implements um8, Serializable {
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
    private final Collection<ejb> k;
    private final fna l;
    private final w63 m;
    private final a n;
    private final String o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PizzaProduct.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lm78$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m78$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a("FULL", 0);
        public static final a b = new a("HALF", 1);
        private static final /* synthetic */ a[] c;
        private static final /* synthetic */ kj3 d;

        static {
            a[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public m78(String str, String str2, String str3, String str4, String str5, rl8 rl8Var, Collection<ul8> collection, Collection<tl8> collection2, km8 km8Var, String str6, Collection<ejb> collection3, fna fnaVar, w63 w63Var, a aVar) {
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
        z65.h(collection3, "toppings");
        z65.h(fnaVar, "sizeGroup");
        z65.h(w63Var, "doughType");
        z65.h(aVar, "portion");
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
        this.k = collection3;
        this.l = fnaVar;
        this.m = w63Var;
        this.n = aVar;
        this.o = kl8.b.getId();
    }

    @Override // defpackage.um8
    public Collection<ejb> a() {
        return this.k;
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
        return this.o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m78)) {
            return false;
        }
        m78 m78Var = (m78) obj;
        if (z65.c(this.a, m78Var.a) && z65.c(this.b, m78Var.b) && z65.c(this.c, m78Var.c) && z65.c(this.d, m78Var.d) && z65.c(this.e, m78Var.e) && z65.c(this.f, m78Var.f) && z65.c(this.g, m78Var.g) && z65.c(this.h, m78Var.h) && z65.c(this.i, m78Var.i) && z65.c(this.j, m78Var.j) && z65.c(this.k, m78Var.k) && z65.c(this.l, m78Var.l) && z65.c(this.m, m78Var.m) && this.n == m78Var.n) {
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
        return (((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
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

    public final w63 o() {
        return this.m;
    }

    public final int q() {
        return this.m.d();
    }

    public final a r() {
        return this.n;
    }

    public final fna s() {
        return this.l;
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
        Collection<ejb> collection3 = this.k;
        fna fnaVar = this.l;
        w63 w63Var = this.m;
        a aVar = this.n;
        return "PizzaProduct(id=" + str + ", name=" + str2 + ", description=" + str3 + ", allergens=" + str4 + ", allergensCanContain=" + str5 + ", foodValue=" + rl8Var + ", ingredients=" + collection + ", images=" + collection2 + ", size=" + km8Var + ", metaProductId=" + str6 + ", toppings=" + collection3 + ", sizeGroup=" + fnaVar + ", doughType=" + w63Var + ", portion=" + aVar + ")";
    }

    public final int u() {
        return this.l.d();
    }

    public final boolean w() {
        if (this.n == a.a) {
            return true;
        }
        return false;
    }
}
