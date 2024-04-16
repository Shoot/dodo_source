package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\nB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Luq0;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "b", "Luq0$a;", "Luq0$b;", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: uq0  reason: default package */
/* loaded from: classes.dex */
public abstract class uq0 implements Serializable {
    private final String a;

    /* compiled from: CartItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Luq0$a;", "Luq0;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uq0$a */
    /* loaded from: classes.dex */
    public static final class a extends uq0 implements Serializable {
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(str, null);
            z65.h(str, "id");
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.b, ((a) obj).b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "PersistId(id=" + str + ")";
        }
    }

    /* compiled from: CartItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Luq0$b;", "Luq0;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;)V", c.a, "a", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uq0$b */
    /* loaded from: classes.dex */
    public static final class b extends uq0 implements Serializable {
        public static final a c = new a(null);
        private final String b;

        /* compiled from: CartItem.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¨\u0006\u0010"}, d2 = {"Luq0$b$a;", "", "", "shoppingItemId", "Lhn6;", "price", "", "addedIngredientIds", "removedIngredientIds", "", "comboProductIds", "pizzaHalfIds", "Luq0$b;", "a", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
        /* renamed from: uq0$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ b b(a aVar, String str, hn6 hn6Var, Collection collection, Collection collection2, List list, List list2, int i, Object obj) {
                List l;
                List l2;
                List l3;
                List l4;
                List list3 = collection;
                if ((i & 4) != 0) {
                    l4 = kc1.l();
                    list3 = l4;
                }
                Collection collection3 = list3;
                List list4 = collection2;
                if ((i & 8) != 0) {
                    l3 = kc1.l();
                    list4 = l3;
                }
                Collection collection4 = list4;
                List list5 = list;
                if ((i & 16) != 0) {
                    l2 = kc1.l();
                    list5 = l2;
                }
                List list6 = list5;
                List list7 = list2;
                if ((i & 32) != 0) {
                    l = kc1.l();
                    list7 = l;
                }
                return aVar.a(str, hn6Var, collection3, collection4, list6, list7);
            }

            public final b a(String str, hn6 hn6Var, Collection<String> collection, Collection<String> collection2, List<String> list, List<String> list2) {
                String i0;
                String i02;
                String i03;
                String i04;
                z65.h(str, "shoppingItemId");
                z65.h(hn6Var, "price");
                z65.h(collection, "addedIngredientIds");
                z65.h(collection2, "removedIngredientIds");
                z65.h(list, "comboProductIds");
                z65.h(list2, "pizzaHalfIds");
                ht4 ht4Var = ht4.a;
                i0 = sc1.i0(collection, ",", null, null, 0, null, null, 62, null);
                i02 = sc1.i0(collection2, ",", null, null, 0, null, null, 62, null);
                i03 = sc1.i0(list, ",", null, null, 0, null, null, 62, null);
                i04 = sc1.i0(list2, ",", null, null, 0, null, null, 62, null);
                return new b(ht4Var.b(str, hn6Var, i0, i02, i03, i04));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, null);
            z65.h(str, "id");
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.b, ((b) obj).b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "TempId(id=" + str + ")";
        }
    }

    public /* synthetic */ uq0(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getValue() {
        return this.a;
    }

    private uq0(String str) {
        this.a = str;
    }
}
