package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ShoppingData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lpja;", "Ljava/io/Serializable;", "Ltja;", "a", "()Ltja;", "shoppingItem", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "<init>", "()V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lpja$a;", "Lpja$b;", "Lpja$c;", "Lpja$d;", "Lpja$e;", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: pja  reason: default package */
/* loaded from: classes.dex */
public abstract class pja implements Serializable {

    /* compiled from: ShoppingData.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0016\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0018\u00010\b\u0012\u0016\u0010\u0012\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t\u0018\u00010\b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R'\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR'\u0010\u0012\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lpja$a;", "Lpja;", "Ljava/io/Serializable;", "Ltja;", "a", "Ltja;", "()Ltja;", "shoppingItem", "", "", "Lul8;", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "removedIngredients", "Lejb;", com.huawei.hms.opendevice.c.a, "addedToppings", "", "setCompositeProductIds", "(Ljava/util/List;)V", "compositeProductIds", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "<init>", "(Ltja;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pja$a */
    /* loaded from: classes.dex */
    public static final class a extends pja implements Serializable {
        private final tja a;
        private final List<Collection<ul8>> b;
        private final List<Collection<ejb>> c;
        private List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(tja tjaVar, List<? extends Collection<ul8>> list, List<? extends Collection<ejb>> list2, List<String> list3) {
            super(null);
            z65.h(tjaVar, "shoppingItem");
            z65.h(list3, "compositeProductIds");
            this.a = tjaVar;
            this.b = list;
            this.c = list2;
            this.d = list3;
        }

        @Override // defpackage.pja
        public tja a() {
            return this.a;
        }

        public final List<Collection<ejb>> b() {
            return this.c;
        }

        public final List<String> c() {
            return this.d;
        }

        public final List<Collection<ul8>> d() {
            return this.b;
        }

        @Override // defpackage.pja
        public hn6 h() {
            List l;
            double d;
            hn6 h = a().h();
            List<Collection<ejb>> list = this.c;
            l = kc1.l();
            double d2 = 0.0d;
            for (Collection<ejb> collection : (Iterable) mh5.c(list, l)) {
                if (collection != null) {
                    d = 0.0d;
                    for (ejb ejbVar : collection) {
                        d += ejbVar.h().a();
                    }
                } else {
                    d = 0.0d;
                }
                d2 += d;
            }
            return rn6.e(h, d2);
        }
    }

    /* compiled from: ShoppingData.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpja$b;", "Lpja;", "Ljava/io/Serializable;", "Ltja;", "a", "Ltja;", "()Ltja;", "shoppingItem", "b", "firstHalf", com.huawei.hms.opendevice.c.a, "secondHalf", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "<init>", "(Ltja;Ltja;Ltja;)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pja$b */
    /* loaded from: classes.dex */
    public static final class b extends pja implements Serializable {
        private final tja a;
        private final tja b;
        private final tja c;
        private final hn6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tja tjaVar, tja tjaVar2, tja tjaVar3) {
            super(null);
            z65.h(tjaVar, "shoppingItem");
            z65.h(tjaVar2, "firstHalf");
            z65.h(tjaVar3, "secondHalf");
            this.a = tjaVar;
            this.b = tjaVar2;
            this.c = tjaVar3;
            this.d = a().h();
        }

        @Override // defpackage.pja
        public tja a() {
            return this.a;
        }

        public final tja b() {
            return this.b;
        }

        public final tja c() {
            return this.c;
        }

        @Override // defpackage.pja
        public hn6 h() {
            return this.d;
        }
    }

    /* compiled from: ShoppingData.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lpja$d;", "Lpja;", "Ljava/io/Serializable;", "Ltja;", "a", "Ltja;", "()Ltja;", "shoppingItem", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "<init>", "(Ltja;)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pja$d */
    /* loaded from: classes.dex */
    public static final class d extends pja implements Serializable {
        private final tja a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tja tjaVar) {
            super(null);
            z65.h(tjaVar, "shoppingItem");
            this.a = tjaVar;
        }

        @Override // defpackage.pja
        public tja a() {
            return this.a;
        }

        @Override // defpackage.pja
        public hn6 h() {
            return a().h();
        }
    }

    /* compiled from: ShoppingData.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpja$e;", "Lpja;", "Ljava/io/Serializable;", "Ltja;", "a", "Ltja;", "()Ltja;", "shoppingItem", "", "", "b", "Ljava/util/Collection;", com.huawei.hms.opendevice.c.a, "()Ljava/util/Collection;", "removedIngredients", "", "Lejb;", "Ljava/util/Set;", "()Ljava/util/Set;", "addedToppings", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "<init>", "(Ltja;Ljava/util/Collection;Ljava/util/Set;)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pja$e */
    /* loaded from: classes.dex */
    public static final class e extends pja implements Serializable {
        private final tja a;
        private final Collection<String> b;
        private final Set<ejb> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tja tjaVar, Collection<String> collection, Set<ejb> set) {
            super(null);
            z65.h(tjaVar, "shoppingItem");
            z65.h(collection, "removedIngredients");
            z65.h(set, "addedToppings");
            this.a = tjaVar;
            this.b = collection;
            this.c = set;
        }

        @Override // defpackage.pja
        public tja a() {
            return this.a;
        }

        public final Set<ejb> b() {
            return this.c;
        }

        public final Collection<String> c() {
            return this.b;
        }

        @Override // defpackage.pja
        public hn6 h() {
            hn6 h = a().h();
            double d = 0.0d;
            for (ejb ejbVar : this.c) {
                d += ejbVar.h().a();
            }
            return rn6.e(h, d);
        }
    }

    private pja() {
    }

    public /* synthetic */ pja(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract tja a();

    public abstract hn6 h();

    /* compiled from: ShoppingData.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpja$c;", "Lpja;", "Ljava/io/Serializable;", "Ltja;", "a", "Ltja;", "()Ltja;", "shoppingItem", "", "Lxq0;", "b", "Ljava/util/Collection;", com.huawei.hms.opendevice.c.a, "()Ljava/util/Collection;", "removedIngredients", "", "Lejb;", "Ljava/util/Set;", "()Ljava/util/Set;", "addedToppings", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "<init>", "(Ltja;Ljava/util/Collection;Ljava/util/Set;)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pja$c */
    /* loaded from: classes.dex */
    public static final class c extends pja implements Serializable {
        private final tja a;
        private final Collection<xq0> b;
        private final Set<ejb> c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ c(defpackage.tja r1, java.util.Collection r2, java.util.Set r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto La
                java.util.List r2 = defpackage.ic1.l()
                java.util.Collection r2 = (java.util.Collection) r2
            La:
                r4 = r4 & 4
                if (r4 == 0) goto L12
                java.util.Set r3 = defpackage.qfa.e()
            L12:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pja.c.<init>(tja, java.util.Collection, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // defpackage.pja
        public tja a() {
            return this.a;
        }

        public final Set<ejb> b() {
            return this.c;
        }

        public final Collection<xq0> c() {
            return this.b;
        }

        @Override // defpackage.pja
        public hn6 h() {
            hn6 h = a().h();
            double d = 0.0d;
            for (ejb ejbVar : this.c) {
                d += ejbVar.h().a();
            }
            return rn6.e(h, d);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tja tjaVar, Collection<xq0> collection, Set<ejb> set) {
            super(null);
            z65.h(tjaVar, "shoppingItem");
            z65.h(collection, "removedIngredients");
            z65.h(set, "addedToppings");
            this.a = tjaVar;
            this.b = collection;
            this.c = set;
        }
    }
}
