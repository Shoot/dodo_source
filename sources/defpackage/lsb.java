package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleAnalytics.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\f\t\rB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002¨\u0006\u000e"}, d2 = {"Llsb;", "", "", "Lkotlin/Pair;", "", "Lzsb;", "upsaleProducts", "", "", "b", "<init>", "()V", "a", com.huawei.hms.opendevice.c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lsb  reason: default package */
/* loaded from: classes4.dex */
public final class lsb {
    public static final lsb a = new lsb();

    /* compiled from: UpsaleAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Llsb$a;", "Ldc;", "Lqc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lsb$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        public static final a a = new a();

        private a() {
        }

        @Override // defpackage.dc
        public qc a() {
            return new bc("upsale_added").a();
        }
    }

    /* compiled from: UpsaleAnalytics.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u0003B'\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006!"}, d2 = {"Llsb$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Llsb$b$a$a;", "b", "Llsb$b$a$a;", "getScrollDirection", "()Llsb$b$a$a;", "scrollDirection", com.huawei.hms.opendevice.c.a, "I", "getPosition", "()I", "position", DateTokenConverter.CONVERTER_KEY, "getProductCount", "productCount", "<init>", "(Ljava/lang/String;Llsb$b$a$a;II)V", e.a, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lsb$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        public static final a e = new a(null);
        private final String a;
        private final a.EnumC0428a b;
        private final int c;
        private final int d;

        /* compiled from: UpsaleAnalytics.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llsb$b$a;", "", "<init>", "()V", "a", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lsb$b$a */
        /* loaded from: classes4.dex */
        public static final class a {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: UpsaleAnalytics.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Llsb$b$a$a;", "", "", "a", "Ljava/lang/String;", "getEventParam", "()Ljava/lang/String;", "eventParam", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
            /* renamed from: lsb$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class EnumC0428a {
                public static final EnumC0428a b = new EnumC0428a("LEFT", 0, ElementGenerator.TEXT_ALIGN_LEFT);
                public static final EnumC0428a c = new EnumC0428a("RIGHT", 1, ElementGenerator.TEXT_ALIGN_RIGHT);
                public static final EnumC0428a d = new EnumC0428a("STAND", 2, "stand");
                private static final /* synthetic */ EnumC0428a[] e;
                private static final /* synthetic */ kj3 f;
                private final String a;

                static {
                    EnumC0428a[] a = a();
                    e = a;
                    f = lj3.a(a);
                }

                private EnumC0428a(String str, int i, String str2) {
                    this.a = str2;
                }

                private static final /* synthetic */ EnumC0428a[] a() {
                    return new EnumC0428a[]{b, c, d};
                }

                public static EnumC0428a valueOf(String str) {
                    return (EnumC0428a) Enum.valueOf(EnumC0428a.class, str);
                }

                public static EnumC0428a[] values() {
                    return (EnumC0428a[]) e.clone();
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(String str, a.EnumC0428a enumC0428a, int i, int i2) {
            z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
            z65.h(enumC0428a, "scrollDirection");
            this.a = str;
            this.b = enumC0428a;
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(bc.e(bc.e(bc.e(new bc("upsell_scrolling"), ShoppingInfoEntity.FIELD_PRODUCT_ID, Integer.valueOf(this.d), false, 4, null), "scrollDirection", this.b, false, 4, null), "position", Integer.valueOf(this.c), false, 4, null), "products_count", Integer.valueOf(this.d), false, 4, null).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
        }

        public String toString() {
            String str = this.a;
            a.EnumC0428a enumC0428a = this.b;
            int i = this.c;
            int i2 = this.d;
            return "UpsaleScrollingEvent(productId=" + str + ", scrollDirection=" + enumC0428a + ", position=" + i + ", productCount=" + i2 + ")";
        }
    }

    /* compiled from: UpsaleAnalytics.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Llsb$c;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lkotlin/Pair;", "Lzsb;", "Ljava/util/List;", "getShownProducts", "()Ljava/util/List;", "shownProducts", "", "b", "Ljava/util/Map;", "getAdditionalData", "()Ljava/util/Map;", "additionalData", com.huawei.hms.opendevice.c.a, "I", "getProductCount", "()I", "productCount", "<init>", "(Ljava/util/List;Ljava/util/Map;I)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lsb$c */
    /* loaded from: classes4.dex */
    public static final class c implements dc {
        private final List<Pair<Integer, zsb>> a;
        private final Map<String, String> b;
        private final int c;

        public c(List<Pair<Integer, zsb>> list, Map<String, String> map, int i) {
            z65.h(list, "shownProducts");
            z65.h(map, "additionalData");
            this.a = list;
            this.b = map;
            this.c = i;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(bc.e(bc.e(new bc("upsell_shown"), "products", lsb.a.b(this.a), false, 4, null), "products_count", Integer.valueOf(this.c), false, 4, null), "additionalData", this.b, false, 4, null).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b) && this.c == cVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
        }

        public String toString() {
            List<Pair<Integer, zsb>> list = this.a;
            Map<String, String> map = this.b;
            int i = this.c;
            return "UpsaleShownEvent(shownProducts=" + list + ", additionalData=" + map + ", productCount=" + i + ")";
        }
    }

    private lsb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Map<String, Object>> b(List<Pair<Integer, zsb>> list) {
        int w;
        Map k;
        List<Pair<Integer, zsb>> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int intValue = ((Number) pair.a()).intValue();
            zsb zsbVar = (zsb) pair.b();
            k = g86.k(lnb.a("position", Integer.valueOf(intValue)), lnb.a(ShoppingInfoEntity.FIELD_PRODUCT_ID, zsbVar.b()), lnb.a(Action.NAME_ATTRIBUTE, zsbVar.d()), lnb.a("category", zsbVar.a()), lnb.a("rawPrice", Double.valueOf(zsbVar.f())));
            arrayList.add(k);
        }
        return arrayList;
    }
}
