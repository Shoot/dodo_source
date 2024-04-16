package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
/* compiled from: MenuItem.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006*\u0014\u0019\u0017\u000f\fB\t\b\u0004¢\u0006\u0004\b9\u0010:J\u0016\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0014\u0010\u001f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\rR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0004\u0018\u0001018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010'R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0001\u0005;<=>?¨\u0006@"}, d2 = {"Lqd6;", "", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "promoActions", "q", "other", "", "equals", "", "hashCode", "", "f", "()Ljava/lang/String;", "id", com.huawei.hms.push.e.a, "forwardCompatibilityId", "i", Action.NAME_ATTRIBUTE, "Lkl8;", "b", "()Lkl8;", "category", DateTokenConverter.CONVERTER_KEY, "description", com.huawei.hms.opendevice.c.a, "compositeDescription", "g", "imageUrl", "l", "()I", "priority", Image.TYPE_HIGH, "menuCategoryId", "", "n", "()Ljava/util/List;", "subMenuCategoryIds", "o", "()Z", "isEnabled", "Lqd6$a;", "a", "()Lqd6$a;", "addingToCartFromMenu", "Lhn6;", "k", "()Lhn6;", "price", "Ll18;", "j", "()Ll18;", "personalPrice", "p", "isStopped", Image.TYPE_MEDIUM, "()Ljava/util/Collection;", "<init>", "()V", "Lqd6$b;", "Lqd6$c;", "Lqd6$d;", "Lqd6$e;", "Lqd6$f;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qd6  reason: default package */
/* loaded from: classes4.dex */
public abstract class qd6 {

    /* compiled from: MenuItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lqd6$a;", "", "", "a", "()Ljava/lang/String;", "shoppingItemId", "<init>", "()V", "b", "Lqd6$a$a;", "Lqd6$a$b;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qd6$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* compiled from: MenuItem.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lqd6$a$a;", "Lqd6$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "shoppingItemId", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: qd6$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0484a extends a {
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0484a(String str) {
                super(null);
                z65.h(str, "shoppingItemId");
                this.a = str;
            }

            @Override // defpackage.qd6.a
            public String a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0484a) && z65.c(this.a, ((C0484a) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                String str = this.a;
                return "CanAddingToCartFromMenu(shoppingItemId=" + str + ")";
            }
        }

        /* compiled from: MenuItem.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lqd6$a$b;", "Lqd6$a;", "", "a", "()Ljava/lang/String;", "shoppingItemId", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: qd6$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }

            @Override // defpackage.qd6.a
            public String a() {
                return "";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();
    }

    /* compiled from: MenuItem.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\bK\u0010LJ\u0016\u0010\u0005\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u008d\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b%\u0010 R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b(\u0010 R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b,\u0010 R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b9\u0010:R\u001a\u0010@\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010B\u001a\u0004\b1\u0010CR\u001a\u0010F\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bE\u0010:R\u001c\u0010J\u001a\u0004\u0018\u00010G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\b0\u0010I¨\u0006M"}, d2 = {"Lqd6$b;", "Lqd6;", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "promoActions", "q", "", "id", "forwardCompatibilityId", Action.NAME_ATTRIBUTE, "Lkl8;", "category", "description", "compositeDescription", "", "priority", "imageUrl", "Lqja;", "shoppingInfo", "menuCategoryId", "", "subMenuCategoryIds", "r", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "i", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", "g", "I", "l", "()I", Image.TYPE_HIGH, "Lqja;", "u", "()Lqja;", "j", "k", "Ljava/util/List;", "n", "()Ljava/util/List;", "Ljava/util/Collection;", Image.TYPE_MEDIUM, "()Ljava/util/Collection;", "Z", "o", "()Z", "isEnabled", "Lqd6$a$b;", "Lqd6$a$b;", "t", "()Lqd6$a$b;", "addingToCartFromMenu", "Lhn6;", "Lhn6;", "()Lhn6;", "price", "p", "isStopped", "Ll18;", "Ll18;", "()Ll18;", "personalPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lqja;Ljava/lang/String;Ljava/util/List;Ljava/util/Collection;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qd6$b */
    /* loaded from: classes4.dex */
    public static final class b extends qd6 {
        private final String a;
        private final String b;
        private final String c;
        private final kl8 d;
        private final String e;
        private final String f;
        private final int g;
        private final String h;
        private final qja i;
        private final String j;
        private final List<String> k;
        private final Collection<ProductPromoAction> l;
        private final boolean m;
        private final a.b n;
        private final hn6 o;
        private final boolean p;
        private final l18 q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, int i, String str6, qja qjaVar, String str7, List<String> list, Collection<ProductPromoAction> collection) {
            super(null);
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(qjaVar, "shoppingInfo");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection, "promoActions");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = kl8Var;
            this.e = str4;
            this.f = str5;
            this.g = i;
            this.h = str6;
            this.i = qjaVar;
            this.j = str7;
            this.k = list;
            this.l = collection;
            this.m = true;
            this.n = a.b.a;
            this.o = kn6.f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b s(b bVar, String str, String str2, String str3, kl8 kl8Var, String str4, String str5, int i, String str6, qja qjaVar, String str7, List list, Collection collection, int i2, Object obj) {
            String str8;
            String str9;
            String str10;
            kl8 kl8Var2;
            String str11;
            String str12;
            int i3;
            String str13;
            qja qjaVar2;
            String str14;
            List<String> list2;
            Collection<ProductPromoAction> collection2;
            if ((i2 & 1) != 0) {
                str8 = bVar.a;
            } else {
                str8 = str;
            }
            if ((i2 & 2) != 0) {
                str9 = bVar.b;
            } else {
                str9 = str2;
            }
            if ((i2 & 4) != 0) {
                str10 = bVar.c;
            } else {
                str10 = str3;
            }
            if ((i2 & 8) != 0) {
                kl8Var2 = bVar.d;
            } else {
                kl8Var2 = kl8Var;
            }
            if ((i2 & 16) != 0) {
                str11 = bVar.e;
            } else {
                str11 = str4;
            }
            if ((i2 & 32) != 0) {
                str12 = bVar.f;
            } else {
                str12 = str5;
            }
            if ((i2 & 64) != 0) {
                i3 = bVar.g;
            } else {
                i3 = i;
            }
            if ((i2 & 128) != 0) {
                str13 = bVar.h;
            } else {
                str13 = str6;
            }
            if ((i2 & 256) != 0) {
                qjaVar2 = bVar.i;
            } else {
                qjaVar2 = qjaVar;
            }
            if ((i2 & 512) != 0) {
                str14 = bVar.j;
            } else {
                str14 = str7;
            }
            if ((i2 & 1024) != 0) {
                list2 = bVar.k;
            } else {
                list2 = list;
            }
            if ((i2 & 2048) != 0) {
                collection2 = bVar.l;
            } else {
                collection2 = collection;
            }
            return bVar.r(str8, str9, str10, kl8Var2, str11, str12, i3, str13, qjaVar2, str14, list2, collection2);
        }

        @Override // defpackage.qd6
        public kl8 b() {
            return this.d;
        }

        @Override // defpackage.qd6
        public String c() {
            return this.f;
        }

        @Override // defpackage.qd6
        public String d() {
            return this.e;
        }

        @Override // defpackage.qd6
        public String e() {
            return this.b;
        }

        @Override // defpackage.qd6
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && this.d == bVar.d && z65.c(this.e, bVar.e) && z65.c(this.f, bVar.f) && this.g == bVar.g && z65.c(this.h, bVar.h) && z65.c(this.i, bVar.i) && z65.c(this.j, bVar.j) && z65.c(this.k, bVar.k) && z65.c(this.l, bVar.l)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.qd6
        public String f() {
            return this.a;
        }

        @Override // defpackage.qd6
        public String g() {
            return this.h;
        }

        @Override // defpackage.qd6
        public String h() {
            return this.j;
        }

        @Override // defpackage.qd6
        public int hashCode() {
            return (((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
        }

        @Override // defpackage.qd6
        public String i() {
            return this.c;
        }

        @Override // defpackage.qd6
        public l18 j() {
            return this.q;
        }

        @Override // defpackage.qd6
        public hn6 k() {
            return this.o;
        }

        @Override // defpackage.qd6
        public int l() {
            return this.g;
        }

        @Override // defpackage.qd6
        public Collection<ProductPromoAction> m() {
            return this.l;
        }

        @Override // defpackage.qd6
        public List<String> n() {
            return this.k;
        }

        @Override // defpackage.qd6
        public boolean o() {
            return this.m;
        }

        @Override // defpackage.qd6
        public boolean p() {
            return this.p;
        }

        @Override // defpackage.qd6
        public qd6 q(Collection<ProductPromoAction> collection) {
            z65.h(collection, "promoActions");
            return s(this, null, null, null, null, null, null, 0, null, null, null, null, collection, 2047, null);
        }

        public final b r(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, int i, String str6, qja qjaVar, String str7, List<String> list, Collection<ProductPromoAction> collection) {
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(qjaVar, "shoppingInfo");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection, "promoActions");
            return new b(str, str2, str3, kl8Var, str4, str5, i, str6, qjaVar, str7, list, collection);
        }

        @Override // defpackage.qd6
        /* renamed from: t */
        public a.b a() {
            return this.n;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            kl8 kl8Var = this.d;
            String str4 = this.e;
            String str5 = this.f;
            int i = this.g;
            String str6 = this.h;
            qja qjaVar = this.i;
            String str7 = this.j;
            List<String> list = this.k;
            Collection<ProductPromoAction> collection = this.l;
            return "AssistantMenuItem(id=" + str + ", forwardCompatibilityId=" + str2 + ", name=" + str3 + ", category=" + kl8Var + ", description=" + str4 + ", compositeDescription=" + str5 + ", priority=" + i + ", imageUrl=" + str6 + ", shoppingInfo=" + qjaVar + ", menuCategoryId=" + str7 + ", subMenuCategoryIds=" + list + ", promoActions=" + collection + ")";
        }

        public final qja u() {
            return this.i;
        }
    }

    /* compiled from: MenuItem.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\bP\u0010QJ\u0016\u0010\u0005\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0097\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b'\u0010\"R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b*\u0010\"R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010 \u001a\u0004\b+\u0010\"R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u001a\u0010@\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010B\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\bA\u0010?R\u001a\u0010G\u001a\u00020C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010K\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\b6\u0010JR\u001c\u0010O\u001a\u0004\u0018\u00010L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010M\u001a\u0004\b2\u0010N¨\u0006R"}, d2 = {"Lqd6$c;", "Lqd6;", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "promoActions", "q", "", "id", "forwardCompatibilityId", Action.NAME_ATTRIBUTE, "Lkl8;", "category", "description", "compositeDescription", "imageUrl", "", "priority", "Lqja;", "shoppingInfo", "Lkm8;", "size", "menuCategoryId", "", "subMenuCategoryIds", "r", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "i", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", "g", Image.TYPE_HIGH, "I", "l", "()I", "Lqja;", "u", "()Lqja;", "j", "Lkm8;", "v", "()Lkm8;", "k", "Ljava/util/List;", "n", "()Ljava/util/List;", Image.TYPE_MEDIUM, "Ljava/util/Collection;", "()Ljava/util/Collection;", "Z", "o", "()Z", "isEnabled", "p", "isStopped", "Lqd6$a$b;", "Lqd6$a$b;", "t", "()Lqd6$a$b;", "addingToCartFromMenu", "Lhn6;", "Lhn6;", "()Lhn6;", "price", "Ll18;", "Ll18;", "()Ll18;", "personalPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILqja;Lkm8;Ljava/lang/String;Ljava/util/List;Ljava/util/Collection;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qd6$c */
    /* loaded from: classes4.dex */
    public static final class c extends qd6 {
        private final String a;
        private final String b;
        private final String c;
        private final kl8 d;
        private final String e;
        private final String f;
        private final String g;
        private final int h;
        private final qja i;
        private final km8 j;
        private final String k;
        private final List<String> l;
        private final Collection<ProductPromoAction> m;
        private final boolean n;
        private final boolean o;
        private final a.b p;
        private final hn6 q;
        private final l18 r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, qja qjaVar, km8 km8Var, String str7, List<String> list, Collection<ProductPromoAction> collection) {
            super(null);
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(qjaVar, "shoppingInfo");
            z65.h(km8Var, "size");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection, "promoActions");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = kl8Var;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = i;
            this.i = qjaVar;
            this.j = km8Var;
            this.k = str7;
            this.l = list;
            this.m = collection;
            this.n = true;
            this.o = qjaVar.p();
            this.p = a.b.a;
            this.q = qjaVar.h();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c s(c cVar, String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, qja qjaVar, km8 km8Var, String str7, List list, Collection collection, int i2, Object obj) {
            String str8;
            String str9;
            String str10;
            kl8 kl8Var2;
            String str11;
            String str12;
            String str13;
            int i3;
            qja qjaVar2;
            km8 km8Var2;
            String str14;
            List<String> list2;
            Collection<ProductPromoAction> collection2;
            if ((i2 & 1) != 0) {
                str8 = cVar.a;
            } else {
                str8 = str;
            }
            if ((i2 & 2) != 0) {
                str9 = cVar.b;
            } else {
                str9 = str2;
            }
            if ((i2 & 4) != 0) {
                str10 = cVar.c;
            } else {
                str10 = str3;
            }
            if ((i2 & 8) != 0) {
                kl8Var2 = cVar.d;
            } else {
                kl8Var2 = kl8Var;
            }
            if ((i2 & 16) != 0) {
                str11 = cVar.e;
            } else {
                str11 = str4;
            }
            if ((i2 & 32) != 0) {
                str12 = cVar.f;
            } else {
                str12 = str5;
            }
            if ((i2 & 64) != 0) {
                str13 = cVar.g;
            } else {
                str13 = str6;
            }
            if ((i2 & 128) != 0) {
                i3 = cVar.h;
            } else {
                i3 = i;
            }
            if ((i2 & 256) != 0) {
                qjaVar2 = cVar.i;
            } else {
                qjaVar2 = qjaVar;
            }
            if ((i2 & 512) != 0) {
                km8Var2 = cVar.j;
            } else {
                km8Var2 = km8Var;
            }
            if ((i2 & 1024) != 0) {
                str14 = cVar.k;
            } else {
                str14 = str7;
            }
            if ((i2 & 2048) != 0) {
                list2 = cVar.l;
            } else {
                list2 = list;
            }
            if ((i2 & 4096) != 0) {
                collection2 = cVar.m;
            } else {
                collection2 = collection;
            }
            return cVar.r(str8, str9, str10, kl8Var2, str11, str12, str13, i3, qjaVar2, km8Var2, str14, list2, collection2);
        }

        @Override // defpackage.qd6
        public kl8 b() {
            return this.d;
        }

        @Override // defpackage.qd6
        public String c() {
            return this.f;
        }

        @Override // defpackage.qd6
        public String d() {
            return this.e;
        }

        @Override // defpackage.qd6
        public String e() {
            return this.b;
        }

        @Override // defpackage.qd6
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b) && z65.c(this.c, cVar.c) && this.d == cVar.d && z65.c(this.e, cVar.e) && z65.c(this.f, cVar.f) && z65.c(this.g, cVar.g) && this.h == cVar.h && z65.c(this.i, cVar.i) && z65.c(this.j, cVar.j) && z65.c(this.k, cVar.k) && z65.c(this.l, cVar.l) && z65.c(this.m, cVar.m)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.qd6
        public String f() {
            return this.a;
        }

        @Override // defpackage.qd6
        public String g() {
            return this.g;
        }

        @Override // defpackage.qd6
        public String h() {
            return this.k;
        }

        @Override // defpackage.qd6
        public int hashCode() {
            return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
        }

        @Override // defpackage.qd6
        public String i() {
            return this.c;
        }

        @Override // defpackage.qd6
        public l18 j() {
            return this.r;
        }

        @Override // defpackage.qd6
        public hn6 k() {
            return this.q;
        }

        @Override // defpackage.qd6
        public int l() {
            return this.h;
        }

        @Override // defpackage.qd6
        public Collection<ProductPromoAction> m() {
            return this.m;
        }

        @Override // defpackage.qd6
        public List<String> n() {
            return this.l;
        }

        @Override // defpackage.qd6
        public boolean o() {
            return this.n;
        }

        @Override // defpackage.qd6
        public boolean p() {
            return this.o;
        }

        @Override // defpackage.qd6
        public qd6 q(Collection<ProductPromoAction> collection) {
            z65.h(collection, "promoActions");
            return s(this, null, null, null, null, null, null, null, 0, null, null, null, null, collection, 4095, null);
        }

        public final c r(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, qja qjaVar, km8 km8Var, String str7, List<String> list, Collection<ProductPromoAction> collection) {
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(qjaVar, "shoppingInfo");
            z65.h(km8Var, "size");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection, "promoActions");
            return new c(str, str2, str3, kl8Var, str4, str5, str6, i, qjaVar, km8Var, str7, list, collection);
        }

        @Override // defpackage.qd6
        /* renamed from: t */
        public a.b a() {
            return this.p;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            kl8 kl8Var = this.d;
            String str4 = this.e;
            String str5 = this.f;
            String str6 = this.g;
            int i = this.h;
            qja qjaVar = this.i;
            km8 km8Var = this.j;
            String str7 = this.k;
            List<String> list = this.l;
            Collection<ProductPromoAction> collection = this.m;
            return "ComboTemplateMenuItem(id=" + str + ", forwardCompatibilityId=" + str2 + ", name=" + str3 + ", category=" + kl8Var + ", description=" + str4 + ", compositeDescription=" + str5 + ", imageUrl=" + str6 + ", priority=" + i + ", shoppingInfo=" + qjaVar + ", size=" + km8Var + ", menuCategoryId=" + str7 + ", subMenuCategoryIds=" + list + ", promoActions=" + collection + ")";
        }

        public final qja u() {
            return this.i;
        }

        public final km8 v() {
            return this.j;
        }
    }

    /* compiled from: MenuItem.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\bK\u0010LJ\u0016\u0010\u0005\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J£\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b&\u0010!R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b)\u0010!R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b-\u0010!R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b5\u00106R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b7\u00100R\u001a\u0010;\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b9\u0010:R\u001a\u0010@\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010E\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b3\u0010DR\u001a\u0010F\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\bB\u0010:R\u001c\u0010J\u001a\u0004\u0018\u00010G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\b1\u0010I¨\u0006M"}, d2 = {"Lqd6$d;", "Lqd6;", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "promoActions", "q", "", "id", "forwardCompatibilityId", Action.NAME_ATTRIBUTE, "Lkl8;", "category", "description", "compositeDescription", "", "priority", "imageUrl", "Lqja;", "products", "customShoppingItems", "menuCategoryId", "", "subMenuCategoryIds", "r", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "i", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", "g", "I", "l", "()I", Image.TYPE_HIGH, "Ljava/util/Collection;", "v", "()Ljava/util/Collection;", "j", "u", "k", "Ljava/util/List;", "n", "()Ljava/util/List;", Image.TYPE_MEDIUM, "Z", "o", "()Z", "isEnabled", "Lqd6$a$b;", "Lqd6$a$b;", "t", "()Lqd6$a$b;", "addingToCartFromMenu", "Lhn6;", "p", "Lhn6;", "()Lhn6;", "price", "isStopped", "Ll18;", "Ll18;", "()Ll18;", "personalPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/String;Ljava/util/List;Ljava/util/Collection;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qd6$d */
    /* loaded from: classes4.dex */
    public static final class d extends qd6 {
        private final String a;
        private final String b;
        private final String c;
        private final kl8 d;
        private final String e;
        private final String f;
        private final int g;
        private final String h;
        private final Collection<qja> i;
        private final Collection<qja> j;
        private final String k;
        private final List<String> l;
        private final Collection<ProductPromoAction> m;
        private final boolean n;
        private final a.b o;
        private final hn6 p;
        private final boolean q;
        private final l18 r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, int i, String str6, Collection<? extends qja> collection, Collection<? extends qja> collection2, String str7, List<String> list, Collection<ProductPromoAction> collection3) {
            super(null);
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(collection, "products");
            z65.h(collection2, "customShoppingItems");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection3, "promoActions");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = kl8Var;
            this.e = str4;
            this.f = str5;
            this.g = i;
            this.h = str6;
            this.i = collection;
            this.j = collection2;
            this.k = str7;
            this.l = list;
            this.m = collection3;
            this.n = true;
            this.o = a.b.a;
            this.p = kn6.f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d s(d dVar, String str, String str2, String str3, kl8 kl8Var, String str4, String str5, int i, String str6, Collection collection, Collection collection2, String str7, List list, Collection collection3, int i2, Object obj) {
            String str8;
            String str9;
            String str10;
            kl8 kl8Var2;
            String str11;
            String str12;
            int i3;
            String str13;
            Collection<qja> collection4;
            Collection<qja> collection5;
            String str14;
            List<String> list2;
            Collection<ProductPromoAction> collection6;
            if ((i2 & 1) != 0) {
                str8 = dVar.a;
            } else {
                str8 = str;
            }
            if ((i2 & 2) != 0) {
                str9 = dVar.b;
            } else {
                str9 = str2;
            }
            if ((i2 & 4) != 0) {
                str10 = dVar.c;
            } else {
                str10 = str3;
            }
            if ((i2 & 8) != 0) {
                kl8Var2 = dVar.d;
            } else {
                kl8Var2 = kl8Var;
            }
            if ((i2 & 16) != 0) {
                str11 = dVar.e;
            } else {
                str11 = str4;
            }
            if ((i2 & 32) != 0) {
                str12 = dVar.f;
            } else {
                str12 = str5;
            }
            if ((i2 & 64) != 0) {
                i3 = dVar.g;
            } else {
                i3 = i;
            }
            if ((i2 & 128) != 0) {
                str13 = dVar.h;
            } else {
                str13 = str6;
            }
            if ((i2 & 256) != 0) {
                collection4 = dVar.i;
            } else {
                collection4 = collection;
            }
            if ((i2 & 512) != 0) {
                collection5 = dVar.j;
            } else {
                collection5 = collection2;
            }
            if ((i2 & 1024) != 0) {
                str14 = dVar.k;
            } else {
                str14 = str7;
            }
            if ((i2 & 2048) != 0) {
                list2 = dVar.l;
            } else {
                list2 = list;
            }
            if ((i2 & 4096) != 0) {
                collection6 = dVar.m;
            } else {
                collection6 = collection3;
            }
            return dVar.r(str8, str9, str10, kl8Var2, str11, str12, i3, str13, collection4, collection5, str14, list2, collection6);
        }

        @Override // defpackage.qd6
        public kl8 b() {
            return this.d;
        }

        @Override // defpackage.qd6
        public String c() {
            return this.f;
        }

        @Override // defpackage.qd6
        public String d() {
            return this.e;
        }

        @Override // defpackage.qd6
        public String e() {
            return this.b;
        }

        @Override // defpackage.qd6
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (z65.c(this.a, dVar.a) && z65.c(this.b, dVar.b) && z65.c(this.c, dVar.c) && this.d == dVar.d && z65.c(this.e, dVar.e) && z65.c(this.f, dVar.f) && this.g == dVar.g && z65.c(this.h, dVar.h) && z65.c(this.i, dVar.i) && z65.c(this.j, dVar.j) && z65.c(this.k, dVar.k) && z65.c(this.l, dVar.l) && z65.c(this.m, dVar.m)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.qd6
        public String f() {
            return this.a;
        }

        @Override // defpackage.qd6
        public String g() {
            return this.h;
        }

        @Override // defpackage.qd6
        public String h() {
            return this.k;
        }

        @Override // defpackage.qd6
        public int hashCode() {
            return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
        }

        @Override // defpackage.qd6
        public String i() {
            return this.c;
        }

        @Override // defpackage.qd6
        public l18 j() {
            return this.r;
        }

        @Override // defpackage.qd6
        public hn6 k() {
            return this.p;
        }

        @Override // defpackage.qd6
        public int l() {
            return this.g;
        }

        @Override // defpackage.qd6
        public Collection<ProductPromoAction> m() {
            return this.m;
        }

        @Override // defpackage.qd6
        public List<String> n() {
            return this.l;
        }

        @Override // defpackage.qd6
        public boolean o() {
            return this.n;
        }

        @Override // defpackage.qd6
        public boolean p() {
            return this.q;
        }

        @Override // defpackage.qd6
        public qd6 q(Collection<ProductPromoAction> collection) {
            z65.h(collection, "promoActions");
            return s(this, null, null, null, null, null, null, 0, null, null, null, null, null, collection, 4095, null);
        }

        public final d r(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, int i, String str6, Collection<? extends qja> collection, Collection<? extends qja> collection2, String str7, List<String> list, Collection<ProductPromoAction> collection3) {
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(collection, "products");
            z65.h(collection2, "customShoppingItems");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection3, "promoActions");
            return new d(str, str2, str3, kl8Var, str4, str5, i, str6, collection, collection2, str7, list, collection3);
        }

        @Override // defpackage.qd6
        /* renamed from: t */
        public a.b a() {
            return this.o;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            kl8 kl8Var = this.d;
            String str4 = this.e;
            String str5 = this.f;
            int i = this.g;
            String str6 = this.h;
            Collection<qja> collection = this.i;
            Collection<qja> collection2 = this.j;
            String str7 = this.k;
            List<String> list = this.l;
            Collection<ProductPromoAction> collection3 = this.m;
            return "HalvesMenuItem(id=" + str + ", forwardCompatibilityId=" + str2 + ", name=" + str3 + ", category=" + kl8Var + ", description=" + str4 + ", compositeDescription=" + str5 + ", priority=" + i + ", imageUrl=" + str6 + ", products=" + collection + ", customShoppingItems=" + collection2 + ", menuCategoryId=" + str7 + ", subMenuCategoryIds=" + list + ", promoActions=" + collection3 + ")";
        }

        public final Collection<qja> u() {
            return this.j;
        }

        public final Collection<qja> v() {
            return this.i;
        }
    }

    /* compiled from: MenuItem.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bO\u0010PJ\u0016\u0010\u0005\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u00ad\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010!\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b*\u0010%R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b(\u0010%R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b-\u0010%R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b.\u0010%R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b;\u0010<R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\b5\u0010AR\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u001a\u0010I\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b9\u0010HR\u001a\u0010J\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bF\u0010DR\u001a\u0010N\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\b\"\u0010M¨\u0006Q"}, d2 = {"Lqd6$e;", "Lqd6;", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "promoActions", "q", "", "id", "forwardCompatibilityId", Action.NAME_ATTRIBUTE, "Lkl8;", "category", "description", "compositeDescription", "imageUrl", "", "priority", "Lqja;", "shoppingInfo", "Lkm8;", "size", "menuCategoryId", "", "subMenuCategoryIds", "Ll18;", "personalPrice", "", "isEnabled", "r", "toString", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "i", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", "g", Image.TYPE_HIGH, "I", "l", "()I", "Lqja;", "t", "()Lqja;", "j", "Lkm8;", "u", "()Lkm8;", "k", "Ljava/util/List;", "n", "()Ljava/util/List;", Image.TYPE_MEDIUM, "Ljava/util/Collection;", "()Ljava/util/Collection;", "Ll18;", "()Ll18;", "o", "Z", "()Z", "Lhn6;", "p", "Lhn6;", "()Lhn6;", "price", "isStopped", "Lqd6$a;", "Lqd6$a;", "()Lqd6$a;", "addingToCartFromMenu", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILqja;Lkm8;Ljava/lang/String;Ljava/util/List;Ljava/util/Collection;Ll18;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qd6$e */
    /* loaded from: classes4.dex */
    public static final class e extends qd6 {
        private final String a;
        private final String b;
        private final String c;
        private final kl8 d;
        private final String e;
        private final String f;
        private final String g;
        private final int h;
        private final qja i;
        private final km8 j;
        private final String k;
        private final List<String> l;
        private final Collection<ProductPromoAction> m;
        private final l18 n;
        private final boolean o;
        private final hn6 p;
        private final boolean q;
        private final a r;

        public /* synthetic */ e(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, qja qjaVar, km8 km8Var, String str7, List list, Collection collection, l18 l18Var, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, kl8Var, str4, str5, str6, i, qjaVar, km8Var, str7, list, collection, l18Var, (i2 & 16384) != 0 ? true : z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e s(e eVar, String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, qja qjaVar, km8 km8Var, String str7, List list, Collection collection, l18 l18Var, boolean z, int i2, Object obj) {
            return eVar.r((i2 & 1) != 0 ? eVar.a : str, (i2 & 2) != 0 ? eVar.b : str2, (i2 & 4) != 0 ? eVar.c : str3, (i2 & 8) != 0 ? eVar.d : kl8Var, (i2 & 16) != 0 ? eVar.e : str4, (i2 & 32) != 0 ? eVar.f : str5, (i2 & 64) != 0 ? eVar.g : str6, (i2 & 128) != 0 ? eVar.h : i, (i2 & 256) != 0 ? eVar.i : qjaVar, (i2 & 512) != 0 ? eVar.j : km8Var, (i2 & 1024) != 0 ? eVar.k : str7, (i2 & 2048) != 0 ? eVar.l : list, (i2 & 4096) != 0 ? eVar.m : collection, (i2 & 8192) != 0 ? eVar.n : l18Var, (i2 & 16384) != 0 ? eVar.o : z);
        }

        @Override // defpackage.qd6
        public a a() {
            return this.r;
        }

        @Override // defpackage.qd6
        public kl8 b() {
            return this.d;
        }

        @Override // defpackage.qd6
        public String c() {
            return this.f;
        }

        @Override // defpackage.qd6
        public String d() {
            return this.e;
        }

        @Override // defpackage.qd6
        public String e() {
            return this.b;
        }

        @Override // defpackage.qd6
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (z65.c(this.a, eVar.a) && z65.c(this.b, eVar.b) && z65.c(this.c, eVar.c) && this.d == eVar.d && z65.c(this.e, eVar.e) && z65.c(this.f, eVar.f) && z65.c(this.g, eVar.g) && this.h == eVar.h && z65.c(this.i, eVar.i) && z65.c(this.j, eVar.j) && z65.c(this.k, eVar.k) && z65.c(this.l, eVar.l) && z65.c(this.m, eVar.m) && z65.c(this.n, eVar.n) && this.o == eVar.o) {
                return true;
            }
            return false;
        }

        @Override // defpackage.qd6
        public String f() {
            return this.a;
        }

        @Override // defpackage.qd6
        public String g() {
            return this.g;
        }

        @Override // defpackage.qd6
        public String h() {
            return this.k;
        }

        @Override // defpackage.qd6
        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31;
            l18 l18Var = this.n;
            if (l18Var == null) {
                hashCode = 0;
            } else {
                hashCode = l18Var.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + a91.a(this.o);
        }

        @Override // defpackage.qd6
        public String i() {
            return this.c;
        }

        @Override // defpackage.qd6
        public l18 j() {
            return this.n;
        }

        @Override // defpackage.qd6
        public hn6 k() {
            return this.p;
        }

        @Override // defpackage.qd6
        public int l() {
            return this.h;
        }

        @Override // defpackage.qd6
        public Collection<ProductPromoAction> m() {
            return this.m;
        }

        @Override // defpackage.qd6
        public List<String> n() {
            return this.l;
        }

        @Override // defpackage.qd6
        public boolean o() {
            return this.o;
        }

        @Override // defpackage.qd6
        public boolean p() {
            return this.q;
        }

        @Override // defpackage.qd6
        public qd6 q(Collection<ProductPromoAction> collection) {
            z65.h(collection, "promoActions");
            return s(this, null, null, null, null, null, null, null, 0, null, null, null, null, collection, null, false, 28671, null);
        }

        public final e r(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, qja qjaVar, km8 km8Var, String str7, List<String> list, Collection<ProductPromoAction> collection, l18 l18Var, boolean z) {
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(qjaVar, "shoppingInfo");
            z65.h(km8Var, "size");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection, "promoActions");
            return new e(str, str2, str3, kl8Var, str4, str5, str6, i, qjaVar, km8Var, str7, list, collection, l18Var, z);
        }

        public final qja t() {
            return this.i;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            kl8 kl8Var = this.d;
            String str4 = this.e;
            String str5 = this.f;
            String str6 = this.g;
            int i = this.h;
            qja qjaVar = this.i;
            km8 km8Var = this.j;
            String str7 = this.k;
            List<String> list = this.l;
            Collection<ProductPromoAction> collection = this.m;
            l18 l18Var = this.n;
            boolean z = this.o;
            return "SimpleMenuItem(id=" + str + ", forwardCompatibilityId=" + str2 + ", name=" + str3 + ", category=" + kl8Var + ", description=" + str4 + ", compositeDescription=" + str5 + ", imageUrl=" + str6 + ", priority=" + i + ", shoppingInfo=" + qjaVar + ", size=" + km8Var + ", menuCategoryId=" + str7 + ", subMenuCategoryIds=" + list + ", promoActions=" + collection + ", personalPrice=" + l18Var + ", isEnabled=" + z + ")";
        }

        public final km8 u() {
            return this.j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, qja qjaVar, km8 km8Var, String str7, List<String> list, Collection<ProductPromoAction> collection, l18 l18Var, boolean z) {
            super(null);
            a aVar;
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(qjaVar, "shoppingInfo");
            z65.h(km8Var, "size");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection, "promoActions");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = kl8Var;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = i;
            this.i = qjaVar;
            this.j = km8Var;
            this.k = str7;
            this.l = list;
            this.m = collection;
            this.n = l18Var;
            this.o = z;
            this.p = qjaVar.h();
            this.q = qjaVar.p();
            if (!p() && b() != kl8.i) {
                aVar = new a.C0484a(qjaVar.getId());
            } else {
                aVar = a.b.a;
            }
            this.r = aVar;
        }
    }

    /* compiled from: MenuItem.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\bJ\u0010KJ\u0016\u0010\u0005\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J³\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0016HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u000fHÖ\u0001J\u0013\u0010 \u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b)\u0010$R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b'\u0010$R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b,\u0010$R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b-\u0010$R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b<\u00103R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b4\u0010>R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b?\u0010;R\u001a\u0010D\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b!\u0010CR\u001a\u0010H\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\b5\u0010GR\u001a\u0010I\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\bA\u0010;¨\u0006L"}, d2 = {"Lqd6$f;", "Lqd6;", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "promoActions", "q", "", "id", "forwardCompatibilityId", Action.NAME_ATTRIBUTE, "Lkl8;", "category", "description", "compositeDescription", "imageUrl", "", "priority", "Lqja;", "products", "menuCategoryId", "", "subMenuCategoryIds", "", "isPizza", "Ll18;", "personalPrice", "isEnabled", "r", "toString", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "i", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", "g", Image.TYPE_HIGH, "I", "l", "()I", "Ljava/util/Collection;", "t", "()Ljava/util/Collection;", "j", "k", "Ljava/util/List;", "n", "()Ljava/util/List;", "Z", "u", "()Z", Image.TYPE_MEDIUM, "Ll18;", "()Ll18;", "o", "Lqd6$a;", "p", "Lqd6$a;", "()Lqd6$a;", "addingToCartFromMenu", "Lhn6;", "Lhn6;", "()Lhn6;", "price", "isStopped", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Collection;Ljava/lang/String;Ljava/util/List;ZLjava/util/Collection;Ll18;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qd6$f */
    /* loaded from: classes4.dex */
    public static final class f extends qd6 {
        private final String a;
        private final String b;
        private final String c;
        private final kl8 d;
        private final String e;
        private final String f;
        private final String g;
        private final int h;
        private final Collection<qja> i;
        private final String j;
        private final List<String> k;
        private final boolean l;
        private final Collection<ProductPromoAction> m;
        private final l18 n;
        private final boolean o;
        private final a p;
        private final hn6 q;
        private final boolean r;

        public /* synthetic */ f(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, Collection collection, String str7, List list, boolean z, Collection collection2, l18 l18Var, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, kl8Var, str4, str5, str6, i, collection, str7, list, z, collection2, l18Var, (i2 & 16384) != 0 ? true : z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ f s(f fVar, String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, Collection collection, String str7, List list, boolean z, Collection collection2, l18 l18Var, boolean z2, int i2, Object obj) {
            return fVar.r((i2 & 1) != 0 ? fVar.a : str, (i2 & 2) != 0 ? fVar.b : str2, (i2 & 4) != 0 ? fVar.c : str3, (i2 & 8) != 0 ? fVar.d : kl8Var, (i2 & 16) != 0 ? fVar.e : str4, (i2 & 32) != 0 ? fVar.f : str5, (i2 & 64) != 0 ? fVar.g : str6, (i2 & 128) != 0 ? fVar.h : i, (i2 & 256) != 0 ? fVar.i : collection, (i2 & 512) != 0 ? fVar.j : str7, (i2 & 1024) != 0 ? fVar.k : list, (i2 & 2048) != 0 ? fVar.l : z, (i2 & 4096) != 0 ? fVar.m : collection2, (i2 & 8192) != 0 ? fVar.n : l18Var, (i2 & 16384) != 0 ? fVar.o : z2);
        }

        @Override // defpackage.qd6
        public a a() {
            return this.p;
        }

        @Override // defpackage.qd6
        public kl8 b() {
            return this.d;
        }

        @Override // defpackage.qd6
        public String c() {
            return this.f;
        }

        @Override // defpackage.qd6
        public String d() {
            return this.e;
        }

        @Override // defpackage.qd6
        public String e() {
            return this.b;
        }

        @Override // defpackage.qd6
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (z65.c(this.a, fVar.a) && z65.c(this.b, fVar.b) && z65.c(this.c, fVar.c) && this.d == fVar.d && z65.c(this.e, fVar.e) && z65.c(this.f, fVar.f) && z65.c(this.g, fVar.g) && this.h == fVar.h && z65.c(this.i, fVar.i) && z65.c(this.j, fVar.j) && z65.c(this.k, fVar.k) && this.l == fVar.l && z65.c(this.m, fVar.m) && z65.c(this.n, fVar.n) && this.o == fVar.o) {
                return true;
            }
            return false;
        }

        @Override // defpackage.qd6
        public String f() {
            return this.a;
        }

        @Override // defpackage.qd6
        public String g() {
            return this.g;
        }

        @Override // defpackage.qd6
        public String h() {
            return this.j;
        }

        @Override // defpackage.qd6
        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + a91.a(this.l)) * 31) + this.m.hashCode()) * 31;
            l18 l18Var = this.n;
            if (l18Var == null) {
                hashCode = 0;
            } else {
                hashCode = l18Var.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + a91.a(this.o);
        }

        @Override // defpackage.qd6
        public String i() {
            return this.c;
        }

        @Override // defpackage.qd6
        public l18 j() {
            return this.n;
        }

        @Override // defpackage.qd6
        public hn6 k() {
            return this.q;
        }

        @Override // defpackage.qd6
        public int l() {
            return this.h;
        }

        @Override // defpackage.qd6
        public Collection<ProductPromoAction> m() {
            return this.m;
        }

        @Override // defpackage.qd6
        public List<String> n() {
            return this.k;
        }

        @Override // defpackage.qd6
        public boolean o() {
            return this.o;
        }

        @Override // defpackage.qd6
        public boolean p() {
            return this.r;
        }

        @Override // defpackage.qd6
        public qd6 q(Collection<ProductPromoAction> collection) {
            z65.h(collection, "promoActions");
            return s(this, null, null, null, null, null, null, null, 0, null, null, null, false, collection, null, false, 28671, null);
        }

        public final f r(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, Collection<? extends qja> collection, String str7, List<String> list, boolean z, Collection<ProductPromoAction> collection2, l18 l18Var, boolean z2) {
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(collection, "products");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection2, "promoActions");
            return new f(str, str2, str3, kl8Var, str4, str5, str6, i, collection, str7, list, z, collection2, l18Var, z2);
        }

        public final Collection<qja> t() {
            return this.i;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            kl8 kl8Var = this.d;
            String str4 = this.e;
            String str5 = this.f;
            String str6 = this.g;
            int i = this.h;
            Collection<qja> collection = this.i;
            String str7 = this.j;
            List<String> list = this.k;
            boolean z = this.l;
            Collection<ProductPromoAction> collection2 = this.m;
            l18 l18Var = this.n;
            boolean z2 = this.o;
            return "VariableMenuItem(id=" + str + ", forwardCompatibilityId=" + str2 + ", name=" + str3 + ", category=" + kl8Var + ", description=" + str4 + ", compositeDescription=" + str5 + ", imageUrl=" + str6 + ", priority=" + i + ", products=" + collection + ", menuCategoryId=" + str7 + ", subMenuCategoryIds=" + list + ", isPizza=" + z + ", promoActions=" + collection2 + ", personalPrice=" + l18Var + ", isEnabled=" + z2 + ")";
        }

        public final boolean u() {
            return this.l;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(String str, String str2, String str3, kl8 kl8Var, String str4, String str5, String str6, int i, Collection<? extends qja> collection, String str7, List<String> list, boolean z, Collection<ProductPromoAction> collection2, l18 l18Var, boolean z2) {
            super(null);
            a aVar;
            z65.h(str, "id");
            z65.h(str2, "forwardCompatibilityId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(kl8Var, "category");
            z65.h(str4, "description");
            z65.h(str5, "compositeDescription");
            z65.h(str6, "imageUrl");
            z65.h(collection, "products");
            z65.h(str7, "menuCategoryId");
            z65.h(list, "subMenuCategoryIds");
            z65.h(collection2, "promoActions");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = kl8Var;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = i;
            this.i = collection;
            this.j = str7;
            this.k = list;
            this.l = z;
            this.m = collection2;
            this.n = l18Var;
            this.o = z2;
            boolean z3 = true;
            if (collection.size() == 1) {
                aVar = new a.C0484a(((qja) ic1.Y(collection)).G0());
            } else {
                aVar = a.b.a;
            }
            this.p = aVar;
            this.q = ((qja) Collections.min(collection, sn6.a)).h();
            Collection<? extends qja> collection3 = collection;
            if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                Iterator it = collection3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!((qja) it.next()).p()) {
                        z3 = false;
                        break;
                    }
                }
            }
            this.r = z3;
        }
    }

    private qd6() {
    }

    public /* synthetic */ qd6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract a a();

    public abstract kl8 b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(cls2, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.domain.menu.item.MenuItem");
        qd6 qd6Var = (qd6) obj;
        if (z65.c(f(), qd6Var.f()) && b() == qd6Var.b() && z65.c(k(), qd6Var.k())) {
            return true;
        }
        return false;
    }

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public int hashCode() {
        return (((f().hashCode() * 31) + b().hashCode()) * 31) + k().hashCode();
    }

    public abstract String i();

    public abstract l18 j();

    public abstract hn6 k();

    public abstract int l();

    public abstract Collection<ProductPromoAction> m();

    public abstract List<String> n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract qd6 q(Collection<ProductPromoAction> collection);
}
