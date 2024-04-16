package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorResultDto.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\t\u000e\u0011\u000f\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\u0011\u0010 ¨\u0006\""}, d2 = {"Ltt;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", com.huawei.hms.push.e.a, "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "b", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "description", "", "D", "g", "()D", "totalPrice", "f", "shoppingItemId", "Ltt$b;", "Ltt$b;", "()Ltt$b;", ElementGenerator.TYPE_IMAGE, "Ltt$e;", "Ltt$e;", "()Ltt$e;", "ingredients", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tt  reason: default package */
/* loaded from: classes2.dex */
public final class tt {
    @uca(ShoppingInfoEntity.FIELD_PRODUCT_ID)
    private final String a;
    @uca(Action.NAME_ATTRIBUTE)
    private final String b;
    @uca("description")
    private final String c;
    @uca("totalPrice")
    private final double d;
    @uca("shoppingItemId")
    private final String e;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final b f;
    @uca("ingredients")
    private final e g;

    /* compiled from: AssistantGeneratorResultDto.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Ltt$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "imageUrl", "doughName", "", "Ltt$d;", com.huawei.hms.opendevice.c.a, "Ljava/util/List;", "()Ljava/util/List;", "ingredients", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tt$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @uca("imageUrl")
        private final String a;
        @uca("doughName")
        private final String b;
        @uca("ingredients")
        private final List<d> c;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final List<d> c() {
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

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            List<d> list = this.c;
            return "BaseIngredientsDto(imageUrl=" + str + ", doughName=" + str2 + ", ingredients=" + list + ")";
        }
    }

    /* compiled from: AssistantGeneratorResultDto.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Ltt$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", RemoteMessageConst.Notification.URL, "Ltt$c;", "b", "Ltt$c;", "()Ltt$c;", "urls", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tt$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @uca(RemoteMessageConst.Notification.URL)
        private final String a;
        @uca("urls")
        private final c b;

        public final String a() {
            return this.a;
        }

        public final c b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            c cVar = this.b;
            return "ImageDto(url=" + str + ", urls=" + cVar + ")";
        }
    }

    /* compiled from: AssistantGeneratorResultDto.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Ltt$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "webp", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tt$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @uca("webp")
        private final String a;

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "ImageUrlsDto(webp=" + str + ")";
        }
    }

    /* compiled from: AssistantGeneratorResultDto.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ltt$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", com.huawei.hms.opendevice.c.a, Action.NAME_ATTRIBUTE, "imageUrl", "", DateTokenConverter.CONVERTER_KEY, "D", "getPrice", "()D", "price", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tt$d */
    /* loaded from: classes2.dex */
    public static final class d {
        @uca("id")
        private final String a;
        @uca(Action.NAME_ATTRIBUTE)
        private final String b;
        @uca("imageUrl")
        private final String c;
        @uca("price")
        private final double d;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (z65.c(this.a, dVar.a) && z65.c(this.b, dVar.b) && z65.c(this.c, dVar.c) && Double.compare(this.d, dVar.d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            double d = this.d;
            return "IngredientDto(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", price=" + d + ")";
        }
    }

    /* compiled from: AssistantGeneratorResultDto.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltt$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ltt$a;", "a", "Ltt$a;", "b", "()Ltt$a;", "base", "", "Ltt$d;", "Ljava/util/List;", "()Ljava/util/List;", "added", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tt$e */
    /* loaded from: classes2.dex */
    public static final class e {
        @uca("base")
        private final a a;
        @uca("added")
        private final List<d> b;

        public final List<d> a() {
            return this.b;
        }

        public final a b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (z65.c(this.a, eVar.a) && z65.c(this.b, eVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            a aVar = this.a;
            List<d> list = this.b;
            return "IngredientsDto(base=" + aVar + ", added=" + list + ")";
        }
    }

    public final String a() {
        return this.c;
    }

    public final b b() {
        return this.f;
    }

    public final e c() {
        return this.g;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        if (z65.c(this.a, ttVar.a) && z65.c(this.b, ttVar.b) && z65.c(this.c, ttVar.c) && Double.compare(this.d, ttVar.d) == 0 && z65.c(this.e, ttVar.e) && z65.c(this.f, ttVar.f) && z65.c(this.g, ttVar.g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.e;
    }

    public final double g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        double d2 = this.d;
        String str4 = this.e;
        b bVar = this.f;
        e eVar = this.g;
        return "AssistantGeneratorResultDto(productId=" + str + ", name=" + str2 + ", description=" + str3 + ", totalPrice=" + d2 + ", shoppingItemId=" + str4 + ", image=" + bVar + ", ingredients=" + eVar + ")";
    }
}
