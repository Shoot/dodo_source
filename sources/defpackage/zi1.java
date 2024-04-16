package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ComboTemplateProduct.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\u0004\b>\u0010?J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bJQ\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00038\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010.\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u00103\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R \u00106\u001a\b\u0012\u0004\u0012\u0002040\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b5\u0010'R\u001a\u0010;\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010\u001c\u001a\u0004\b<\u0010\u001e¨\u0006@"}, d2 = {"Lzi1;", "Lfl8;", "Ljava/io/Serializable;", "", "", "compositeProductIds", "Ldj1;", Image.TYPE_SMALL, "", "selectedProducts", "u", "id", Action.NAME_ATTRIBUTE, "category", "description", "Ltl8;", "images", "Lcj1;", "productSlots", "o", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getName", c.a, e.a, DateTokenConverter.CONVERTER_KEY, "f", "Ljava/util/Collection;", "j", "()Ljava/util/Collection;", "Ljava/util/List;", "r", "()Ljava/util/List;", "g", "allergens", Image.TYPE_HIGH, "allergensCanContain", "Lrl8;", "i", "Lrl8;", "()Lrl8;", "foodValue", "Lul8;", "k", "ingredients", "Lkm8;", "Lkm8;", Image.TYPE_MEDIUM, "()Lkm8;", "size", "l", "metaProductId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: zi1  reason: default package */
/* loaded from: classes.dex */
public final class zi1 extends fl8 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Collection<tl8> e;
    private final List<cj1> f;
    private final String g;
    private final String h;
    private final rl8 i;
    private final Collection<ul8> j;
    private final km8 k;
    private final String l;

    public zi1(String str, String str2, String str3, String str4, Collection<tl8> collection, List<cj1> list) {
        List l;
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "category");
        z65.h(str4, "description");
        z65.h(collection, "images");
        z65.h(list, "productSlots");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = collection;
        this.f = list;
        this.g = "";
        this.h = "";
        this.i = new rl8(null, null, null, null, null, 31, null);
        l = kc1.l();
        this.j = l;
        this.k = new km8(null, null, 3, null);
        this.l = "";
    }

    public static /* synthetic */ zi1 q(zi1 zi1Var, String str, String str2, String str3, String str4, Collection collection, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zi1Var.a;
        }
        if ((i & 2) != 0) {
            str2 = zi1Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = zi1Var.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = zi1Var.d;
        }
        String str7 = str4;
        Collection<tl8> collection2 = collection;
        if ((i & 16) != 0) {
            collection2 = zi1Var.e;
        }
        Collection collection3 = collection2;
        List<cj1> list2 = list;
        if ((i & 32) != 0) {
            list2 = zi1Var.f;
        }
        return zi1Var.o(str, str5, str6, str7, collection3, list2);
    }

    @Override // defpackage.fl8
    public String b() {
        return this.g;
    }

    @Override // defpackage.fl8
    public String c() {
        return this.h;
    }

    @Override // defpackage.fl8
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi1)) {
            return false;
        }
        zi1 zi1Var = (zi1) obj;
        if (z65.c(this.a, zi1Var.a) && z65.c(this.b, zi1Var.b) && z65.c(this.c, zi1Var.c) && z65.c(this.d, zi1Var.d) && z65.c(this.e, zi1Var.e) && z65.c(this.f, zi1Var.f)) {
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
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @Override // defpackage.fl8
    public rl8 i() {
        return this.i;
    }

    @Override // defpackage.fl8
    public Collection<tl8> j() {
        return this.e;
    }

    @Override // defpackage.fl8
    public Collection<ul8> k() {
        return this.j;
    }

    @Override // defpackage.fl8
    public String l() {
        return this.l;
    }

    @Override // defpackage.fl8
    public km8 m() {
        return this.k;
    }

    public final zi1 o(String str, String str2, String str3, String str4, Collection<tl8> collection, List<cj1> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "category");
        z65.h(str4, "description");
        z65.h(collection, "images");
        z65.h(list, "productSlots");
        return new zi1(str, str2, str3, str4, collection, list);
    }

    public final List<cj1> r() {
        return this.f;
    }

    public final List<dj1> s(List<String> list) {
        ArrayList arrayList;
        int w;
        Object obj;
        Object Z;
        int w2;
        z65.h(list, "compositeProductIds");
        if (list.isEmpty()) {
            List<cj1> list2 = this.f;
            w2 = lc1.w(list2, 10);
            arrayList = new ArrayList(w2);
            for (cj1 cj1Var : list2) {
                arrayList.add(cj1Var.d());
            }
        } else {
            List<String> list3 = list;
            w = lc1.w(list3, 10);
            arrayList = new ArrayList(w);
            int i = 0;
            for (Object obj2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                String str = (String) obj2;
                Iterator<T> it = this.f.get(i).h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (z65.c(((dj1) obj).d(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                dj1 dj1Var = (dj1) obj;
                if (dj1Var == null) {
                    Z = sc1.Z(this.f.get(i).h());
                    dj1Var = (dj1) Z;
                }
                arrayList.add(dj1Var);
                i = i2;
            }
        }
        return arrayList;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        Collection<tl8> collection = this.e;
        List<cj1> list = this.f;
        return "ComboTemplateProduct(id=" + str + ", name=" + str2 + ", category=" + str3 + ", description=" + str4 + ", images=" + collection + ", productSlots=" + list + ")";
    }

    public final List<dj1> u(Collection<String> collection) {
        ArrayList arrayList;
        int w;
        Object obj;
        Object Z;
        int w2;
        z65.h(collection, "selectedProducts");
        if (collection.isEmpty()) {
            List<cj1> list = this.f;
            w2 = lc1.w(list, 10);
            arrayList = new ArrayList(w2);
            for (cj1 cj1Var : list) {
                arrayList.add(cj1Var.d());
            }
        } else {
            Collection<String> collection2 = collection;
            w = lc1.w(collection2, 10);
            arrayList = new ArrayList(w);
            int i = 0;
            for (Object obj2 : collection2) {
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                String str = (String) obj2;
                Iterator<T> it = this.f.get(i).h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (z65.c(((dj1) obj).g().getId(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                dj1 dj1Var = (dj1) obj;
                if (dj1Var == null) {
                    Z = sc1.Z(this.f.get(i).h());
                    dj1Var = (dj1) Z;
                }
                arrayList.add(dj1Var);
                i = i2;
            }
        }
        return arrayList;
    }
}
