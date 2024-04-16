package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.pja;
import defpackage.uq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartItemData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lrq0;", "", "", "a", "I", "()I", "count", "<init>", "(I)V", "b", com.huawei.hms.opendevice.c.a, "Lrq0$a;", "Lrq0$b;", "Lrq0$c;", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: rq0  reason: default package */
/* loaded from: classes.dex */
public abstract class rq0 {
    private final int a;

    /* compiled from: CartItemData.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lrq0$c;", "Lrq0;", "", "toString", "", "hashCode", "", "other", "", "equals", "Luq0;", "b", "Luq0;", "()Luq0;", "cartItemId", com.huawei.hms.opendevice.c.a, "I", "a", "()I", "count", "<init>", "(Luq0;I)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rq0$c */
    /* loaded from: classes.dex */
    public static final class c extends rq0 {
        private final uq0 b;
        private final int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(uq0 uq0Var, int i) {
            super(i, null);
            z65.h(uq0Var, "cartItemId");
            this.b = uq0Var;
            this.c = i;
        }

        @Override // defpackage.rq0
        public int a() {
            return this.c;
        }

        public final uq0 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.b, cVar.b) && this.c == cVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c;
        }

        public String toString() {
            uq0 uq0Var = this.b;
            int i = this.c;
            return "RemoveCartItemData(cartItemId=" + uq0Var + ", count=" + i + ")";
        }
    }

    public /* synthetic */ rq0(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public int a() {
        return this.a;
    }

    private rq0(int i) {
        this.a = i;
    }

    /* compiled from: CartItemData.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 ?2\u00020\u0001:\u0001;B\u0097\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\b\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000+\u0012\b\b\u0002\u00105\u001a\u000202\u0012\b\u00109\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u0010<\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b%\u0010\rR\u0017\u0010*\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b\n\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000+8\u0006¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\b\"\u0010.R\u0017\u00105\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b\u000f\u00104R\u0019\u00109\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b\u0012\u00108R\u001a\u0010<\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010\u0013\u001a\u0004\b;\u0010\u0015¨\u0006@"}, d2 = {"Lrq0$a;", "Lrq0;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "g", "imageUrl", DateTokenConverter.CONVERTER_KEY, "I", e.a, "()I", "doughId", "f", "doughTypeName", "n", "sizeId", Image.TYPE_MEDIUM, "sizeGroupName", "Lhn6;", "Lhn6;", "j", "()Lhn6;", "price", "i", "l", "shoppingItemId", "k", "productCategory", "Z", "o", "()Z", "isGift", "", "Ldq0;", "Ljava/util/List;", "()Ljava/util/List;", "comboProducts", "Lmr0;", "pizzaHalves", "Lqq0;", "Lqq0;", "()Lqq0;", "customization", "Lv23;", "Lv23;", "()Lv23;", "discount", "p", "a", "count", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lhn6;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Lqq0;Lv23;I)V", "q", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rq0$a */
    /* loaded from: classes.dex */
    public static final class a extends rq0 {
        public static final C0504a q = new C0504a(null);
        private final String b;
        private final String c;
        private final int d;
        private final String e;
        private final int f;
        private final String g;
        private final hn6 h;
        private final String i;
        private final String j;
        private final boolean k;
        private final List<dq0> l;
        private final List<mr0> m;
        private final qq0 n;
        private final v23 o;
        private final int p;

        /* compiled from: CartItemData.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lrq0$a$a;", "", "Lhn6;", "rawPrice", "Ll18;", "personalPrice", "Lv23;", "b", "Lpja;", "shoppingData", "Lrq0$a;", "a", "", GrsBaseInfo.CountryCodeSource.UNKNOWN, "I", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
        /* renamed from: rq0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0504a {
            private C0504a() {
            }

            public /* synthetic */ C0504a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final v23 b(hn6 hn6Var, l18 l18Var) {
                return new v23("", "", "", rn6.d(hn6Var, l18Var.c()), 0L, new n18(l18Var.d()));
            }

            public final a a(pja pjaVar) {
                int w;
                v23 v23Var;
                Collection<ul8> collection;
                List l;
                int w2;
                Collection<ejb> collection2;
                List l2;
                int w3;
                List o;
                int w4;
                v23 v23Var2;
                int w5;
                int w6;
                v23 v23Var3;
                a aVar;
                int w7;
                v23 v23Var4;
                hn6 h;
                v23 v23Var5;
                z65.h(pjaVar, "shoppingData");
                if (pjaVar instanceof pja.d) {
                    tja a = pjaVar.a();
                    String name = a.Y().getName();
                    String n = a.Y().n();
                    l18 v = a.v();
                    if (v == null || (h = v.c()) == null) {
                        h = a.h();
                    }
                    hn6 hn6Var = h;
                    String id = a.getId();
                    String e = a.Y().e();
                    l18 v2 = a.v();
                    if (v2 != null) {
                        v23Var5 = a.q.b(a.h(), v2);
                    } else {
                        v23Var5 = null;
                    }
                    return new a(name, n, 0, "", 0, "", hn6Var, id, e, false, null, null, null, v23Var5, 0, 24064, null);
                }
                if (pjaVar instanceof pja.c) {
                    tja a2 = pjaVar.a();
                    String name2 = a2.Y().getName();
                    String n2 = a2.Y().n();
                    hn6 h2 = a2.h();
                    String id2 = a2.getId();
                    String e2 = a2.Y().e();
                    pja.c cVar = (pja.c) pjaVar;
                    Collection<xq0> c = cVar.c();
                    Set<ejb> b = cVar.b();
                    w7 = lc1.w(b, 10);
                    ArrayList arrayList = new ArrayList(w7);
                    for (ejb ejbVar : b) {
                        arrayList.add(new xq0(ejbVar.c(), ejbVar.getName(), ejbVar.h(), ejbVar.b(), ejbVar.e()));
                    }
                    qq0 qq0Var = new qq0(c, arrayList);
                    fl8 Y = a2.Y();
                    z65.f(Y, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                    int q = ((m78) Y).q();
                    fl8 Y2 = a2.Y();
                    z65.f(Y2, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                    String e3 = ((m78) Y2).o().e();
                    fl8 Y3 = a2.Y();
                    z65.f(Y3, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                    int u = ((m78) Y3).u();
                    fl8 Y4 = a2.Y();
                    z65.f(Y4, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                    String e4 = ((m78) Y4).s().e();
                    l18 v3 = a2.v();
                    if (v3 != null) {
                        v23Var4 = a.q.b(a2.h(), v3);
                    } else {
                        v23Var4 = null;
                    }
                    aVar = new a(name2, n2, q, e3, u, e4, h2, id2, e2, false, null, null, qq0Var, v23Var4, 0, 19968, null);
                } else if (pjaVar instanceof pja.e) {
                    tja a3 = pjaVar.a();
                    String name3 = a3.Y().getName();
                    String n3 = a3.Y().n();
                    hn6 h3 = a3.h();
                    String id3 = a3.getId();
                    String e5 = a3.Y().e();
                    pja.e eVar = (pja.e) pjaVar;
                    Collection<String> c2 = eVar.c();
                    w5 = lc1.w(c2, 10);
                    ArrayList arrayList2 = new ArrayList(w5);
                    for (String str : c2) {
                        arrayList2.add(new xq0(str, str, null, null, false, 28, null));
                    }
                    Set<ejb> b2 = eVar.b();
                    w6 = lc1.w(b2, 10);
                    ArrayList arrayList3 = new ArrayList(w6);
                    for (ejb ejbVar2 : b2) {
                        arrayList3.add(new xq0(ejbVar2.c(), ejbVar2.getName(), ejbVar2.h(), ejbVar2.b(), ejbVar2.e()));
                    }
                    qq0 qq0Var2 = new qq0(arrayList2, arrayList3);
                    fl8 Y5 = a3.Y();
                    z65.f(Y5, "null cannot be cast to non-null type com.dodopizza.common.product.VariableProduct");
                    int s = ((swb) Y5).s();
                    fl8 Y6 = a3.Y();
                    z65.f(Y6, "null cannot be cast to non-null type com.dodopizza.common.product.VariableProduct");
                    String e6 = ((swb) Y6).r().e();
                    l18 v4 = a3.v();
                    if (v4 != null) {
                        v23Var3 = a.q.b(a3.h(), v4);
                    } else {
                        v23Var3 = null;
                    }
                    aVar = new a(name3, n3, 0, "", s, e6, h3, id3, e5, false, null, null, qq0Var2, v23Var3, 0, 19968, null);
                } else {
                    int i = 0;
                    if (pjaVar instanceof pja.b) {
                        tja a4 = pjaVar.a();
                        String name4 = a4.Y().getName();
                        String n4 = a4.Y().n();
                        hn6 h4 = a4.h();
                        String id4 = a4.getId();
                        String e7 = a4.Y().e();
                        pja.b bVar = (pja.b) pjaVar;
                        o = kc1.o(bVar.b(), bVar.c());
                        List<tja> list = o;
                        w4 = lc1.w(list, 10);
                        ArrayList arrayList4 = new ArrayList(w4);
                        for (tja tjaVar : list) {
                            arrayList4.add(new mr0(tjaVar.getId(), tjaVar.Y().getName(), tjaVar.Y().n(), kl8.b, tjaVar.h(), 0, 0, tjaVar.p(), 96, null));
                        }
                        fl8 Y7 = a4.Y();
                        z65.f(Y7, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                        int q2 = ((m78) Y7).q();
                        fl8 Y8 = a4.Y();
                        z65.f(Y8, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                        String e8 = ((m78) Y8).o().e();
                        fl8 Y9 = a4.Y();
                        z65.f(Y9, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                        int u2 = ((m78) Y9).u();
                        fl8 Y10 = a4.Y();
                        z65.f(Y10, "null cannot be cast to non-null type com.dodopizza.common.product.PizzaProduct");
                        String e9 = ((m78) Y10).s().e();
                        l18 v5 = a4.v();
                        if (v5 != null) {
                            v23Var2 = a.q.b(a4.h(), v5);
                        } else {
                            v23Var2 = null;
                        }
                        return new a(name4, n4, q2, e8, u2, e9, h4, id4, e7, false, null, arrayList4, null, v23Var2, 0, 22016, null);
                    } else if (pjaVar instanceof pja.a) {
                        tja a5 = pjaVar.a();
                        String name5 = a5.Y().getName();
                        String n5 = a5.Y().n();
                        hn6 h5 = a5.h();
                        String id5 = a5.getId();
                        String e10 = a5.Y().e();
                        pja.a aVar2 = (pja.a) pjaVar;
                        List<String> c3 = aVar2.c();
                        w = lc1.w(c3, 10);
                        ArrayList arrayList5 = new ArrayList(w);
                        for (Object obj : c3) {
                            int i2 = i + 1;
                            if (i < 0) {
                                kc1.v();
                            }
                            String str2 = (String) obj;
                            List<Collection<ul8>> d = aVar2.d();
                            if (d != null) {
                                collection = d.get(i);
                            } else {
                                collection = null;
                            }
                            l = kc1.l();
                            Iterable<ul8> iterable = (Iterable) mh5.c(collection, l);
                            w2 = lc1.w(iterable, 10);
                            ArrayList arrayList6 = new ArrayList(w2);
                            for (ul8 ul8Var : iterable) {
                                arrayList6.add(new xq0(ul8Var.getId(), ul8Var.getName(), null, null, false, 28, null));
                            }
                            List<Collection<ejb>> b3 = aVar2.b();
                            if (b3 != null) {
                                collection2 = b3.get(i);
                            } else {
                                collection2 = null;
                            }
                            l2 = kc1.l();
                            Iterable<ejb> iterable2 = (Iterable) mh5.c(collection2, l2);
                            w3 = lc1.w(iterable2, 10);
                            ArrayList arrayList7 = new ArrayList(w3);
                            for (ejb ejbVar3 : iterable2) {
                                arrayList7.add(new xq0(ejbVar3.c(), ejbVar3.getName(), ejbVar3.h(), ejbVar3.b(), ejbVar3.e()));
                            }
                            arrayList5.add(new dq0(str2, null, null, null, null, 0, null, null, 0, null, false, new qq0(arrayList6, arrayList7), null, null, 14334, null));
                            i = i2;
                        }
                        l18 v6 = a5.v();
                        if (v6 != null) {
                            v23Var = a.q.b(a5.h(), v6);
                        } else {
                            v23Var = null;
                        }
                        return new a(name5, n5, 0, "", 0, "", h5, id5, e10, false, arrayList5, null, null, v23Var, 0, 23040, null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return aVar;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ a(java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, int r23, java.lang.String r24, defpackage.hn6 r25, java.lang.String r26, java.lang.String r27, boolean r28, java.util.List r29, java.util.List r30, defpackage.qq0 r31, defpackage.v23 r32, int r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
            /*
                r18 = this;
                r0 = r34
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L9
                r1 = 0
                r12 = 0
                goto Lb
            L9:
                r12 = r28
            Lb:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L15
                java.util.List r1 = defpackage.ic1.l()
                r13 = r1
                goto L17
            L15:
                r13 = r29
            L17:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L21
                java.util.List r1 = defpackage.ic1.l()
                r14 = r1
                goto L23
            L21:
                r14 = r30
            L23:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L30
                qq0 r1 = new qq0
                r2 = 3
                r3 = 0
                r1.<init>(r3, r3, r2, r3)
                r15 = r1
                goto L32
            L30:
                r15 = r31
            L32:
                r0 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r0 == 0) goto L3a
                r0 = 1
                r17 = 1
                goto L3c
            L3a:
                r17 = r33
            L3c:
                r2 = r18
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r9 = r25
                r10 = r26
                r11 = r27
                r16 = r32
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rq0.a.<init>(java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, hn6, java.lang.String, java.lang.String, boolean, java.util.List, java.util.List, qq0, v23, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // defpackage.rq0
        public int a() {
            return this.p;
        }

        public final List<dq0> b() {
            return this.l;
        }

        public final qq0 c() {
            return this.n;
        }

        public final v23 d() {
            return this.o;
        }

        public final int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && this.d == aVar.d && z65.c(this.e, aVar.e) && this.f == aVar.f && z65.c(this.g, aVar.g) && z65.c(this.h, aVar.h) && z65.c(this.i, aVar.i) && z65.c(this.j, aVar.j) && this.k == aVar.k && z65.c(this.l, aVar.l) && z65.c(this.m, aVar.m) && z65.c(this.n, aVar.n) && z65.c(this.o, aVar.o) && this.p == aVar.p) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.e;
        }

        public final String g() {
            return this.c;
        }

        public final String h() {
            return this.b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((((((((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + a91.a(this.k)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31;
            v23 v23Var = this.o;
            if (v23Var == null) {
                hashCode = 0;
            } else {
                hashCode = v23Var.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.p;
        }

        public final List<mr0> i() {
            return this.m;
        }

        public final hn6 j() {
            return this.h;
        }

        public final String k() {
            return this.j;
        }

        public final String l() {
            return this.i;
        }

        public final String m() {
            return this.g;
        }

        public final int n() {
            return this.f;
        }

        public final boolean o() {
            return this.k;
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            int i = this.d;
            String str3 = this.e;
            int i2 = this.f;
            String str4 = this.g;
            hn6 hn6Var = this.h;
            String str5 = this.i;
            String str6 = this.j;
            boolean z = this.k;
            List<dq0> list = this.l;
            List<mr0> list2 = this.m;
            qq0 qq0Var = this.n;
            v23 v23Var = this.o;
            int i3 = this.p;
            return "AddCartItemData(name=" + str + ", imageUrl=" + str2 + ", doughId=" + i + ", doughTypeName=" + str3 + ", sizeId=" + i2 + ", sizeGroupName=" + str4 + ", price=" + hn6Var + ", shoppingItemId=" + str5 + ", productCategory=" + str6 + ", isGift=" + z + ", comboProducts=" + list + ", pizzaHalves=" + list2 + ", customization=" + qq0Var + ", discount=" + v23Var + ", count=" + i3 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, int i, String str3, int i2, String str4, hn6 hn6Var, String str5, String str6, boolean z, List<dq0> list, List<mr0> list2, qq0 qq0Var, v23 v23Var, int i3) {
            super(i3, null);
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "imageUrl");
            z65.h(str3, "doughTypeName");
            z65.h(str4, "sizeGroupName");
            z65.h(hn6Var, "price");
            z65.h(str5, "shoppingItemId");
            z65.h(str6, "productCategory");
            z65.h(list, "comboProducts");
            z65.h(list2, "pizzaHalves");
            z65.h(qq0Var, "customization");
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = str3;
            this.f = i2;
            this.g = str4;
            this.h = hn6Var;
            this.i = str5;
            this.j = str6;
            this.k = z;
            this.l = list;
            this.m = list2;
            this.n = qq0Var;
            this.o = v23Var;
            this.p = i3;
        }
    }

    /* compiled from: CartItemData.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001%BA\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0012\b\b\u0002\u0010!\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006&"}, d2 = {"Lrq0$b;", "Lrq0;", "", "toString", "", "hashCode", "", "other", "", "equals", "Luq0;", "b", "Luq0;", "()Luq0;", "cartItemId", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "shoppingItemId", "", "Ldq0;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "comboProducts", "Lmr0;", "getPizzaHalves", "pizzaHalves", "Lqq0;", "f", "Lqq0;", "()Lqq0;", "customization", "<init>", "(Luq0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lqq0;)V", "g", "a", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rq0$b */
    /* loaded from: classes.dex */
    public static final class b extends rq0 {
        public static final a g = new a(null);
        private final uq0 b;
        private final String c;
        private final List<dq0> d;
        private final List<mr0> e;
        private final qq0 f;

        /* compiled from: CartItemData.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lrq0$b$a;", "", "", "cartItemId", "Lpja;", "shoppingData", "Lrq0$b;", "a", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
        /* renamed from: rq0$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str, pja pjaVar) {
                int w;
                Collection<ul8> collection;
                List l;
                int w2;
                Collection<ejb> collection2;
                List l2;
                int w3;
                int w4;
                int w5;
                z65.h(str, "cartItemId");
                z65.h(pjaVar, "shoppingData");
                Collection<ul8> collection3 = null;
                if (!(pjaVar instanceof pja.d)) {
                    if (pjaVar instanceof pja.c) {
                        uq0.a aVar = new uq0.a(str);
                        String id = pjaVar.a().getId();
                        pja.c cVar = (pja.c) pjaVar;
                        Collection<xq0> c = cVar.c();
                        Set<ejb> b = cVar.b();
                        w5 = lc1.w(b, 10);
                        ArrayList arrayList = new ArrayList(w5);
                        for (ejb ejbVar : b) {
                            arrayList.add(new xq0(ejbVar.c(), ejbVar.getName(), ejbVar.h(), ejbVar.b(), ejbVar.e()));
                        }
                        return new b(aVar, id, null, null, new qq0(c, arrayList), 12, null);
                    } else if (pjaVar instanceof pja.e) {
                        uq0.a aVar2 = new uq0.a(str);
                        String id2 = pjaVar.a().getId();
                        Set<ejb> b2 = ((pja.e) pjaVar).b();
                        w4 = lc1.w(b2, 10);
                        ArrayList arrayList2 = new ArrayList(w4);
                        for (ejb ejbVar2 : b2) {
                            arrayList2.add(new xq0(ejbVar2.c(), ejbVar2.getName(), ejbVar2.h(), ejbVar2.b(), ejbVar2.e()));
                        }
                        return new b(aVar2, id2, null, null, new qq0(null, arrayList2, 1, null), 12, null);
                    } else if (!(pjaVar instanceof pja.b)) {
                        if (pjaVar instanceof pja.a) {
                            uq0.a aVar3 = new uq0.a(str);
                            String id3 = pjaVar.a().getId();
                            pja.a aVar4 = (pja.a) pjaVar;
                            List<String> c2 = aVar4.c();
                            w = lc1.w(c2, 10);
                            ArrayList arrayList3 = new ArrayList(w);
                            int i = 0;
                            for (Object obj : c2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    kc1.v();
                                }
                                String str2 = (String) obj;
                                List<Collection<ul8>> d = aVar4.d();
                                if (d != null) {
                                    collection = d.get(i);
                                } else {
                                    collection = collection3;
                                }
                                l = kc1.l();
                                Iterable<ul8> iterable = (Iterable) mh5.c(collection, l);
                                w2 = lc1.w(iterable, 10);
                                ArrayList arrayList4 = new ArrayList(w2);
                                for (ul8 ul8Var : iterable) {
                                    arrayList4.add(new xq0(ul8Var.getId(), ul8Var.getName(), null, null, false, 28, null));
                                }
                                List<Collection<ejb>> b3 = aVar4.b();
                                if (b3 != null) {
                                    collection2 = b3.get(i);
                                } else {
                                    collection2 = null;
                                }
                                l2 = kc1.l();
                                Iterable<ejb> iterable2 = (Iterable) mh5.c(collection2, l2);
                                w3 = lc1.w(iterable2, 10);
                                ArrayList arrayList5 = new ArrayList(w3);
                                for (ejb ejbVar3 : iterable2) {
                                    arrayList5.add(new xq0(ejbVar3.c(), ejbVar3.getName(), ejbVar3.h(), ejbVar3.b(), false));
                                }
                                arrayList3.add(new dq0(str2, null, null, null, null, 0, null, null, 0, null, false, new qq0(arrayList4, arrayList5), null, null, 14334, null));
                                i = i2;
                                collection3 = null;
                            }
                            return new b(aVar3, id3, arrayList3, null, null, 24, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    } else {
                        throw new k07(null, 1, null);
                    }
                }
                throw new k07(null, 1, null);
            }
        }

        public /* synthetic */ b(uq0 uq0Var, String str, List list, List list2, qq0 qq0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uq0Var, str, (i & 4) != 0 ? kc1.l() : list, (i & 8) != 0 ? kc1.l() : list2, (i & 16) != 0 ? new qq0(null, null, 3, null) : qq0Var);
        }

        public final uq0 b() {
            return this.b;
        }

        public final List<dq0> c() {
            return this.d;
        }

        public final qq0 d() {
            return this.f;
        }

        public final String e() {
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
            if (z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && z65.c(this.d, bVar.d) && z65.c(this.e, bVar.e) && z65.c(this.f, bVar.f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        }

        public String toString() {
            uq0 uq0Var = this.b;
            String str = this.c;
            List<dq0> list = this.d;
            List<mr0> list2 = this.e;
            qq0 qq0Var = this.f;
            return "EditCartItemData(cartItemId=" + uq0Var + ", shoppingItemId=" + str + ", comboProducts=" + list + ", pizzaHalves=" + list2 + ", customization=" + qq0Var + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(uq0 uq0Var, String str, List<dq0> list, List<mr0> list2, qq0 qq0Var) {
            super(1, null);
            z65.h(uq0Var, "cartItemId");
            z65.h(str, "shoppingItemId");
            z65.h(list, "comboProducts");
            z65.h(list2, "pizzaHalves");
            z65.h(qq0Var, "customization");
            this.b = uq0Var;
            this.c = str;
            this.d = list;
            this.e = list2;
            this.f = qq0Var;
        }
    }
}
