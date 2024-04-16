package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.push.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorResult.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\n\u000f\u0012BE\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0014\u0010\"R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001e8F¢\u0006\u0006\u001a\u0004\b\n\u0010\"¨\u0006("}, d2 = {"Lnt;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "t", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "b", "getName", Action.NAME_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "description", DateTokenConverter.CONVERTER_KEY, "imageUrl", "Lhn6;", e.a, "Lhn6;", "()Lhn6;", "totalPrice", "f", "X", "shoppingItemId", "", "Lnt$c;", "g", "Ljava/util/List;", "()Ljava/util/List;", "ingredients", "Lnt$a;", "addedIngredients", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;Ljava/lang/String;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nt  reason: default package */
/* loaded from: classes2.dex */
public final class nt implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final hn6 e;
    private final String f;
    private final List<c> g;

    /* compiled from: AssistantGeneratorResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0017"}, d2 = {"Lnt$a;", "Ljava/io/Serializable;", "Lnt$c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", Action.NAME_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nt$a */
    /* loaded from: classes2.dex */
    public static final class a implements Serializable, c {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            z65.h(str, "id");
            z65.h(str2, Action.NAME_ATTRIBUTE);
            z65.h(str3, "imageUrl");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public String a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public final String getId() {
            return this.a;
        }

        @Override // defpackage.nt.c
        public String getName() {
            return this.b;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            return "AddedIngredient(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ")";
        }
    }

    /* compiled from: AssistantGeneratorResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0019"}, d2 = {"Lnt$b;", "Ljava/io/Serializable;", "Lnt$c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "imageUrl", "", com.huawei.hms.opendevice.c.a, "Ljava/util/List;", "()Ljava/util/List;", "ingredients", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nt$b */
    /* loaded from: classes2.dex */
    public static final class b implements Serializable, c {
        private final String a;
        private final String b;
        private final List<String> c;

        public b(String str, String str2, List<String> list) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "imageUrl");
            z65.h(list, "ingredients");
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public String a() {
            return this.b;
        }

        public final List<String> b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.nt.c
        public String getName() {
            return this.a;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            List<String> list = this.c;
            return "BaseIngredient(name=" + str + ", imageUrl=" + str2 + ", ingredients=" + list + ")";
        }
    }

    /* compiled from: AssistantGeneratorResult.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lnt$c;", "Ljava/io/Serializable;", "", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lnt$a;", "Lnt$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nt$c */
    /* loaded from: classes2.dex */
    public interface c extends Serializable {
        String getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nt(String str, String str2, String str3, String str4, hn6 hn6Var, String str5, List<? extends c> list) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(str4, "imageUrl");
        z65.h(hn6Var, "totalPrice");
        z65.h(str5, "shoppingItemId");
        z65.h(list, "ingredients");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hn6Var;
        this.f = str5;
        this.g = list;
    }

    public final String X() {
        return this.f;
    }

    public final List<a> a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.g) {
            if (obj instanceof a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final List<c> d() {
        return this.g;
    }

    public final hn6 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        if (z65.c(this.a, ntVar.a) && z65.c(this.b, ntVar.b) && z65.c(this.c, ntVar.c) && z65.c(this.d, ntVar.d) && z65.c(this.e, ntVar.e) && z65.c(this.f, ntVar.f) && z65.c(this.g, ntVar.g)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String t() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        hn6 hn6Var = this.e;
        String str5 = this.f;
        List<c> list = this.g;
        return "AssistantGeneratorResult(productId=" + str + ", name=" + str2 + ", description=" + str3 + ", imageUrl=" + str4 + ", totalPrice=" + hn6Var + ", shoppingItemId=" + str5 + ", ingredients=" + list + ")";
    }
}
