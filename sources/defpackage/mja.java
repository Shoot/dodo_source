package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity;
import com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.eoa;
import defpackage.qd6;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ShoppingCartVOBuilder.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00106\u001a\u000204\u0012\u0006\u00109\u001a\u000207\u0012\u0006\u0010<\u001a\u00020:\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bC\u0010DJ\u001e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\f2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0006\u0010'\u001a\u00020&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010A¨\u0006E"}, d2 = {"Lmja;", "", "Llia;", "shoppingCart", "", "Lqd6;", "menu", "k", "Lcom/dodopizza/persistence/entity/ClientDeliveryFeeLevelEntity;", "level", "Llq3;", e.a, "", "Ldj1;", "comboSlotProductList", "Lnq0;", "goods", Image.TYPE_HIGH, "comboSlotProduct", "Ldq0;", "comboProduct", com.huawei.hms.opendevice.c.a, "Lhn6;", "deliveryFee", "Lex2;", DateTokenConverter.CONVERTER_KEY, "Lor0;", "i", "cartItem", "Leoa$a;", "l", "j", "slotProduct", "Leq0;", "b", "Lxq0;", "g", "f", "Llja;", "a", "Lfq0;", "Lfq0;", "cartContentService", "Lg78;", "Lg78;", "doughFormatter", "Luja;", "Luja;", "shoppingItemRepository", "Le78;", "Le78;", "pizzaConceptService", "Lhq3;", "Lhq3;", "featureService", "Lava;", "Lava;", "stateProvider", "Lej6;", "Lej6;", "minDeliveryPriceInfoProvider", "Lah6;", "Lah6;", "menuService", "Ljn6;", "Ljn6;", "moneyFactory", "<init>", "(Lfq0;Lg78;Luja;Le78;Lhq3;Lava;Lej6;Lah6;Ljn6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mja  reason: default package */
/* loaded from: classes2.dex */
public final class mja {
    private final fq0 a;
    private final g78 b;
    private final uja c;
    private final e78 d;
    private final hq3 e;
    private final ava f;
    private final ej6 g;
    private final ah6 h;
    private final jn6 i;

    /* compiled from: ShoppingCartVOBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mja$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kl8.values().length];
            try {
                iArr[kl8.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl8.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mja$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((nq0) t).s()), Integer.valueOf(((nq0) t2).s()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mja$c */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Double.valueOf(((nq0) t2).h().a()), Double.valueOf(((nq0) t).h().a()));
            return d;
        }
    }

    public mja(fq0 fq0Var, g78 g78Var, uja ujaVar, e78 e78Var, hq3 hq3Var, ava avaVar, ej6 ej6Var, ah6 ah6Var, jn6 jn6Var) {
        z65.h(fq0Var, "cartContentService");
        z65.h(g78Var, "doughFormatter");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(hq3Var, "featureService");
        z65.h(avaVar, "stateProvider");
        z65.h(ej6Var, "minDeliveryPriceInfoProvider");
        z65.h(ah6Var, "menuService");
        z65.h(jn6Var, "moneyFactory");
        this.a = fq0Var;
        this.b = g78Var;
        this.c = ujaVar;
        this.d = e78Var;
        this.e = hq3Var;
        this.f = avaVar;
        this.g = ej6Var;
        this.h = ah6Var;
        this.i = jn6Var;
    }

    private final eq0 b(dq0 dq0Var) {
        return new eq0(dq0Var.getId(), dq0Var.getName(), dq0Var.i(), dq0Var.c(), dq0Var.h(), dq0Var.k(), this.b.b(dq0Var.m(), dq0Var.f()), dq0Var.o(), g(dq0Var), f(dq0Var));
    }

    private final dq0 c(dj1 dj1Var, dq0 dq0Var) {
        dq0 a2;
        dq0 a3;
        fl8 g = dj1Var.g();
        a2 = dq0Var.a((r30 & 1) != 0 ? dq0Var.a : null, (r30 & 2) != 0 ? dq0Var.b : null, (r30 & 4) != 0 ? dq0Var.c : null, (r30 & 8) != 0 ? dq0Var.d : null, (r30 & 16) != 0 ? dq0Var.e : null, (r30 & 32) != 0 ? dq0Var.f : 0, (r30 & 64) != 0 ? dq0Var.g : null, (r30 & 128) != 0 ? dq0Var.h : null, (r30 & 256) != 0 ? dq0Var.i : 0, (r30 & 512) != 0 ? dq0Var.j : null, (r30 & 1024) != 0 ? dq0Var.k : false, (r30 & 2048) != 0 ? dq0Var.l : null, (r30 & 4096) != 0 ? dq0Var.m : g.k(), (r30 & 8192) != 0 ? dq0Var.n : null);
        dq0 a4 = g instanceof swb ? a2.a((r30 & 1) != 0 ? a2.a : null, (r30 & 2) != 0 ? a2.b : null, (r30 & 4) != 0 ? a2.c : null, (r30 & 8) != 0 ? a2.d : null, (r30 & 16) != 0 ? a2.e : null, (r30 & 32) != 0 ? a2.f : 0, (r30 & 64) != 0 ? a2.g : null, (r30 & 128) != 0 ? a2.h : ((swb) g).r().e(), (r30 & 256) != 0 ? a2.i : 0, (r30 & 512) != 0 ? a2.j : null, (r30 & 1024) != 0 ? a2.k : false, (r30 & 2048) != 0 ? a2.l : null, (r30 & 4096) != 0 ? a2.m : null, (r30 & 8192) != 0 ? a2.n : null) : a2.a((r30 & 1) != 0 ? a2.a : null, (r30 & 2) != 0 ? a2.b : null, (r30 & 4) != 0 ? a2.c : null, (r30 & 8) != 0 ? a2.d : null, (r30 & 16) != 0 ? a2.e : null, (r30 & 32) != 0 ? a2.f : 0, (r30 & 64) != 0 ? a2.g : g.m(), (r30 & 128) != 0 ? a2.h : g.m().getValue(), (r30 & 256) != 0 ? a2.i : 0, (r30 & 512) != 0 ? a2.j : null, (r30 & 1024) != 0 ? a2.k : false, (r30 & 2048) != 0 ? a2.l : null, (r30 & 4096) != 0 ? a2.m : null, (r30 & 8192) != 0 ? a2.n : null);
        if (g instanceof m78) {
            m78 m78Var = (m78) g;
            a4 = a4.a((r30 & 1) != 0 ? a4.a : null, (r30 & 2) != 0 ? a4.b : null, (r30 & 4) != 0 ? a4.c : null, (r30 & 8) != 0 ? a4.d : null, (r30 & 16) != 0 ? a4.e : null, (r30 & 32) != 0 ? a4.f : 0, (r30 & 64) != 0 ? a4.g : null, (r30 & 128) != 0 ? a4.h : m78Var.s().e(), (r30 & 256) != 0 ? a4.i : 0, (r30 & 512) != 0 ? a4.j : m78Var.o().e(), (r30 & 1024) != 0 ? a4.k : false, (r30 & 2048) != 0 ? a4.l : null, (r30 & 4096) != 0 ? a4.m : null, (r30 & 8192) != 0 ? a4.n : null);
        }
        dq0 dq0Var2 = a4;
        if (g instanceof um8) {
            a3 = dq0Var2.a((r30 & 1) != 0 ? dq0Var2.a : null, (r30 & 2) != 0 ? dq0Var2.b : null, (r30 & 4) != 0 ? dq0Var2.c : null, (r30 & 8) != 0 ? dq0Var2.d : null, (r30 & 16) != 0 ? dq0Var2.e : null, (r30 & 32) != 0 ? dq0Var2.f : 0, (r30 & 64) != 0 ? dq0Var2.g : null, (r30 & 128) != 0 ? dq0Var2.h : null, (r30 & 256) != 0 ? dq0Var2.i : 0, (r30 & 512) != 0 ? dq0Var2.j : null, (r30 & 1024) != 0 ? dq0Var2.k : false, (r30 & 2048) != 0 ? dq0Var2.l : null, (r30 & 4096) != 0 ? dq0Var2.m : null, (r30 & 8192) != 0 ? dq0Var2.n : ((um8) g).a());
            return a3;
        }
        return dq0Var2;
    }

    private final ex2 d(hn6 hn6Var) {
        if (this.e.a(bq3.c5)) {
            return ex2.b;
        }
        if (hn6Var.d()) {
            return ex2.c;
        }
        return ex2.a;
    }

    private final lq3 e(ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity) {
        return new lq3(this.i.b(clientDeliveryFeeLevelEntity.getMin()), this.i.b(clientDeliveryFeeLevelEntity.getMax()), this.i.b(clientDeliveryFeeLevelEntity.getFee()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<xq0> f(dq0 dq0Var) {
        List<xq0> l;
        Collection<xq0> a2;
        int w;
        qq0 d = dq0Var.d();
        if (d == null || (a2 = d.a()) == null) {
            l = kc1.l();
            return l;
        }
        Collection<xq0> collection = a2;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        for (xq0 xq0Var : collection) {
            if (xq0Var.getName().length() == 0) {
                Collection<ejb> n = dq0Var.n();
                ejb ejbVar = null;
                if (n != null) {
                    Iterator<T> it = n.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (z65.c(xq0Var.getId(), ((ejb) next).d())) {
                            ejbVar = next;
                            break;
                        }
                    }
                    ejbVar = ejbVar;
                }
                if (ejbVar != null) {
                    xq0Var = new xq0(ejbVar.d(), ejbVar.getName(), ejbVar.h(), ejbVar.b(), false, 16, null);
                }
            }
            arrayList.add(xq0Var);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<xq0> g(dq0 dq0Var) {
        List<xq0> l;
        Collection<xq0> b2;
        int w;
        qq0 d = dq0Var.d();
        if (d == null || (b2 = d.b()) == null) {
            l = kc1.l();
            return l;
        }
        Collection<xq0> collection = b2;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        for (xq0 xq0Var : collection) {
            if (xq0Var.getName().length() == 0) {
                Collection<ul8> j = dq0Var.j();
                ul8 ul8Var = null;
                if (j != null) {
                    Iterator<T> it = j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (z65.c(xq0Var.getId(), ((ul8) next).getId())) {
                            ul8Var = next;
                            break;
                        }
                    }
                    ul8Var = ul8Var;
                }
                if (ul8Var != null) {
                    xq0Var = new xq0(ul8Var.getId(), ul8Var.getName(), null, null, false, 28, null);
                }
            }
            arrayList.add(xq0Var);
        }
        return arrayList;
    }

    private final List<nq0> h(List<dj1> list, List<nq0> list2) {
        int w;
        List<nq0> y0;
        int w2;
        Object obj;
        List<nq0> list3 = list2;
        w = lc1.w(list3, 10);
        ArrayList arrayList = new ArrayList(w);
        for (nq0 nq0Var : list3) {
            if (nq0Var.m() == kl8.i) {
                List<dq0> w0 = nq0Var.w0();
                w2 = lc1.w(w0, 10);
                ArrayList arrayList2 = new ArrayList(w2);
                for (dq0 dq0Var : w0) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (z65.c(((dj1) obj).d(), dq0Var.getId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    dj1 dj1Var = (dj1) obj;
                    if (dj1Var != null) {
                        dq0Var = c(dj1Var, dq0Var);
                    }
                    arrayList2.add(dq0Var);
                }
                nq0Var = nq0Var.a((r44 & 1) != 0 ? nq0Var.a : null, (r44 & 2) != 0 ? nq0Var.b : 0, (r44 & 4) != 0 ? nq0Var.c : null, (r44 & 8) != 0 ? nq0Var.d : 0, (r44 & 16) != 0 ? nq0Var.e : 0, (r44 & 32) != 0 ? nq0Var.f : null, (r44 & 64) != 0 ? nq0Var.g : null, (r44 & 128) != 0 ? nq0Var.h : 0, (r44 & 256) != 0 ? nq0Var.i : 0.0f, (r44 & 512) != 0 ? nq0Var.j : null, (r44 & 1024) != 0 ? nq0Var.k : null, (r44 & 2048) != 0 ? nq0Var.l : false, (r44 & 4096) != 0 ? nq0Var.m : 0, (r44 & 8192) != 0 ? nq0Var.n : null, (r44 & 16384) != 0 ? nq0Var.o : 0, (r44 & 32768) != 0 ? nq0Var.p : null, (r44 & 65536) != 0 ? nq0Var.q : 0, (r44 & 131072) != 0 ? nq0Var.r : null, (r44 & 262144) != 0 ? nq0Var.s : null, (r44 & 524288) != 0 ? nq0Var.t : null, (r44 & 1048576) != 0 ? nq0Var.u : null, (r44 & 2097152) != 0 ? nq0Var.v : 0, (r44 & 4194304) != 0 ? nq0Var.w : null, (r44 & 8388608) != 0 ? nq0Var.x : arrayList2, (r44 & 16777216) != 0 ? nq0Var.y : null, (r44 & 33554432) != 0 ? nq0Var.z : false);
            }
            arrayList.add(nq0Var);
        }
        y0 = sc1.y0(arrayList, new b());
        return y0;
    }

    private final List<or0> i(lia liaVar) {
        int w;
        Object o4cVar;
        Object Z;
        Object k0;
        int w2;
        List<nq0> e = liaVar.e();
        w = lc1.w(e, 10);
        ArrayList arrayList = new ArrayList(w);
        for (nq0 nq0Var : e) {
            int i = a.$EnumSwitchMapping$0[nq0Var.m().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    o4cVar = new eoa(nq0Var.u(), nq0Var.k(), nq0Var.w(), nq0Var.d(), nq0Var.l(), nq0Var.y(), nq0Var.e(), nq0Var, nq0Var.m(), nq0Var.v0(), l(nq0Var), nq0Var.I().a(), nq0Var.x());
                } else {
                    String u = nq0Var.u();
                    String k = nq0Var.k();
                    hn6 w3 = nq0Var.w();
                    int d = nq0Var.d();
                    int l = nq0Var.l();
                    boolean y = nq0Var.y();
                    v23 e2 = nq0Var.e();
                    List<dq0> w0 = nq0Var.w0();
                    w2 = lc1.w(w0, 10);
                    ArrayList arrayList2 = new ArrayList(w2);
                    for (dq0 dq0Var : w0) {
                        arrayList2.add(b(dq0Var));
                    }
                    o4cVar = new vg1(u, k, w3, d, l, y, e2, nq0Var, arrayList2, nq0Var.x());
                }
            } else if (nq0Var.G()) {
                if (nq0Var.z().size() == 2) {
                    String u2 = nq0Var.u();
                    String k2 = nq0Var.k();
                    hn6 w4 = nq0Var.w();
                    int d2 = nq0Var.d();
                    int l2 = nq0Var.l();
                    boolean y2 = nq0Var.y();
                    String b2 = this.b.b(nq0Var.o(), nq0Var.i());
                    boolean v0 = nq0Var.v0();
                    v23 e3 = nq0Var.e();
                    Z = sc1.Z(nq0Var.z());
                    mr0 mr0Var = (mr0) Z;
                    k0 = sc1.k0(nq0Var.z());
                    o4cVar = new jl4(u2, k2, w4, d2, l2, y2, nq0Var, b2, v0, e3, mr0Var, (mr0) k0, this.d.a());
                } else {
                    throw new IllegalStateException("Only 2 halves permitted".toString());
                }
            } else {
                o4cVar = new o4c(nq0Var.u(), nq0Var.k(), nq0Var.w(), nq0Var.d(), nq0Var.l(), nq0Var.y(), nq0Var, this.b.b(nq0Var.o(), nq0Var.i()), nq0Var.v0(), nq0Var.e(), nq0Var.I().b(), nq0Var.I().a(), nq0Var.x());
            }
            arrayList.add(o4cVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        r2 = defpackage.sc1.y0(r2, new defpackage.mja.c());
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<defpackage.nq0> j(defpackage.lia r36) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mja.j(lia):java.util.List");
    }

    private final lia k(lia liaVar, Collection<? extends qd6> collection) {
        lia a2;
        ArrayList arrayList = new ArrayList();
        ArrayList<qd6.c> arrayList2 = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof qd6.c) {
                arrayList2.add(obj);
            }
        }
        ArrayList<tja> arrayList3 = new ArrayList();
        for (qd6.c cVar : arrayList2) {
            pc1.C(arrayList3, this.h.s(cVar.f()));
        }
        ArrayList<cj1> arrayList4 = new ArrayList();
        for (tja tjaVar : arrayList3) {
            pc1.C(arrayList4, ((zi1) tjaVar.t0()).r());
        }
        for (cj1 cj1Var : arrayList4) {
            arrayList.addAll(cj1Var.h());
        }
        a2 = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : h(arrayList, liaVar.e()), (r28 & 4) != 0 ? liaVar.c : 0, (r28 & 8) != 0 ? liaVar.d : null, (r28 & 16) != 0 ? liaVar.e : null, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : null, (r28 & 2048) != 0 ? liaVar.l : false);
        return a2;
    }

    private final eoa.a l(nq0 nq0Var) {
        String o = nq0Var.o();
        if (o.length() > 0) {
            return new eoa.a.C0307a(o);
        }
        return new eoa.a.b(nb6.a.a(nq0Var.q()), nq0Var.r());
    }

    public final lja a() {
        int i;
        List l;
        ArrayList arrayList;
        k0<ClientDeliveryFeeLevelEntity> feeLevels;
        int w;
        lia k = k(this.a.a(), this.h.r());
        List<nq0> j = j(k);
        List<or0> i2 = i(k);
        int i3 = 0;
        for (or0 or0Var : i2) {
            i3 += or0Var.a();
        }
        hn6 i4 = k.i();
        hn6 d = k.d();
        long g = (long) k.g();
        gx2 gx2Var = new gx2(k.c().a(), d(k.c().a()));
        hn6 n = k.n();
        hn6 j2 = k.j();
        hn6 l2 = k.l();
        int m = k.m();
        jk7 c2 = jua.c(this.f.e());
        boolean q = k.q();
        List<nq0> f = k.f();
        boolean z = true;
        if (!(f instanceof Collection) || !f.isEmpty()) {
            Iterator<T> it = f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((nq0) it.next()).d() != 0) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cj6 b2 = this.g.b();
        DeliveryFeeLevelsEntity delivery = this.f.e().getDelivery();
        if (delivery != null && (feeLevels = delivery.getFeeLevels()) != null) {
            i = m;
            w = lc1.w(feeLevels, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (ClientDeliveryFeeLevelEntity clientDeliveryFeeLevelEntity : feeLevels) {
                arrayList2.add(e(clientDeliveryFeeLevelEntity));
            }
            arrayList = arrayList2;
        } else {
            i = m;
            l = kc1.l();
            arrayList = l;
        }
        return new lja(i3, i2, j, i4, d, g, gx2Var, n, j2, b2, l2, i, c2, q, z, arrayList);
    }
}
