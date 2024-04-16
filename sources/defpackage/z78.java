package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.vr2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
/* compiled from: PizzaProductCardVOFactory.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u001a\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'¨\u0006+"}, d2 = {"Lz78;", "Ly78;", "Ltja;", "", "id", "f", "menuItemId", "", e.a, "stopToppingIdsList", "", DateTokenConverter.CONVERTER_KEY, "cartItemId", "Lnq0;", c.a, "Lx78;", "g", "Ly68;", "a", "Lah6;", "Lah6;", "menuService", "Lmxa;", "b", "Lmxa;", "stopRepository", "Lg78;", "Lg78;", "doughFormatter", "Le78;", "Le78;", "pizzaConceptService", "Lds0;", "Lds0;", "cartService", "Lc62;", "Lc62;", "customizationService", "Lwr2;", "Lwr2;", "defaultShoppingItemSelectorFactory", "<init>", "(Lah6;Lmxa;Lg78;Le78;Lds0;Lc62;Lwr2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z78  reason: default package */
/* loaded from: classes2.dex */
public final class z78 implements y78 {
    private final ah6 a;
    private final mxa b;
    private final g78 c;
    private final e78 d;
    private final ds0 e;
    private final c62 f;
    private final wr2 g;

    /* compiled from: PizzaProductCardVOFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltja;", "a", "()Ltja;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z78$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<tja> {
        final /* synthetic */ Collection<tja> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends tja> collection) {
            super(0);
            this.b = collection;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final tja invoke() {
            return vr2.a.a(z78.this.g.a(this.b), this.b, 0, 2, null);
        }
    }

    public z78(ah6 ah6Var, mxa mxaVar, g78 g78Var, e78 e78Var, ds0 ds0Var, c62 c62Var, wr2 wr2Var) {
        z65.h(ah6Var, "menuService");
        z65.h(mxaVar, "stopRepository");
        z65.h(g78Var, "doughFormatter");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(ds0Var, "cartService");
        z65.h(c62Var, "customizationService");
        z65.h(wr2Var, "defaultShoppingItemSelectorFactory");
        this.a = ah6Var;
        this.b = mxaVar;
        this.c = g78Var;
        this.d = e78Var;
        this.e = ds0Var;
        this.f = c62Var;
        this.g = wr2Var;
    }

    private final nq0 c(String str) {
        Object obj = null;
        if (str.length() <= 0) {
            return null;
        }
        Iterator<T> it = this.e.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (z65.c(((nq0) next).j().getValue(), str)) {
                obj = next;
                break;
            }
        }
        return (nq0) obj;
    }

    private final List<String> d(String str, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f.h(str)) {
            if (!collection.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Collection<String> e(String str) {
        return this.f.g(str);
    }

    private final String f(tja tjaVar, String str) {
        Object obj;
        Iterator<T> it = tjaVar.Y().k().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((ul8) obj).c(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ul8 ul8Var = (ul8) obj;
        if (ul8Var == null) {
            return null;
        }
        return ul8Var.c();
    }

    private final x78 g(tja tjaVar, Collection<String> collection) {
        boolean z;
        Pair a2 = lnb.a(tjaVar, tjaVar.t0());
        tja tjaVar2 = (tja) a2.a();
        m78 m78Var = (m78) a2.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m78Var.a()) {
            if (true ^ collection.contains(((ejb) obj).c())) {
                arrayList.add(obj);
            }
        }
        String d = m78Var.d();
        String name = m78Var.getName();
        rl8 i = m78Var.i();
        String b = m78Var.b();
        String c = m78Var.c();
        Collection<ul8> k = m78Var.k();
        String f = m78Var.f();
        hn6 a3 = sja.a(tjaVar2);
        hn6 b2 = sja.b(tjaVar2);
        fxb fxbVar = new fxb(m78Var.s().d(), m78Var.s().f(), m78Var.o().d(), m78Var.o().f());
        String a4 = this.c.a(m78Var);
        boolean p = tjaVar2.p();
        if (tjaVar2.v() != null) {
            z = true;
        } else {
            z = false;
        }
        return new x78(d, name, i, b, c, k, f, a3, b2, arrayList, fxbVar, a4, p, z);
    }

    @Override // defpackage.y78
    public y68 a(String str, String str2) {
        l18 l18Var;
        int w;
        Object obj;
        List<String> d;
        Collection<String> e;
        boolean z;
        long j;
        qq0 I;
        Collection<xq0> b;
        int w2;
        String str3;
        qq0 I2;
        Collection<xq0> a2;
        int w3;
        String str4;
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        qd6 a3 = this.a.a(str);
        tja tjaVar = null;
        if (a3 != null) {
            l18Var = a3.j();
        } else {
            l18Var = null;
        }
        Collection<tja> s = this.a.s(str);
        Collection<String> a4 = this.b.a();
        Collection<tja> collection = s;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        for (tja tjaVar2 : collection) {
            arrayList.add(g(tjaVar2, a4));
        }
        nq0 c = c(str2);
        Iterator<T> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String id = ((tja) obj).getId();
                if (c != null) {
                    str4 = c.X();
                } else {
                    str4 = null;
                }
                if (z65.c(id, str4)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        tja tjaVar3 = (tja) obj;
        if (c != null && (I2 = c.I()) != null && (a2 = I2.a()) != null) {
            Collection<xq0> collection2 = a2;
            w3 = lc1.w(collection2, 10);
            d = new ArrayList<>(w3);
            for (xq0 xq0Var : collection2) {
                d.add(xq0Var.getId());
            }
        } else {
            d = d(str, a4);
        }
        if (c != null && (I = c.I()) != null && (b = I.b()) != null) {
            Collection<xq0> collection3 = b;
            w2 = lc1.w(collection3, 10);
            e = new ArrayList<>(w2);
            for (xq0 xq0Var2 : collection3) {
                if (tjaVar3 != null) {
                    str3 = f(tjaVar3, xq0Var2.getId());
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                e.add(str3);
            }
        } else {
            e = e(str);
        }
        Collection<String> collection4 = e;
        if (c != null) {
            tjaVar = tjaVar3;
        }
        x78 g = g((tja) mh5.d(tjaVar, new a(s)), a4);
        List<String> list = d;
        b78 a5 = this.d.a();
        if (l18Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (l18Var != null) {
            j = l18Var.d();
        } else {
            j = 0;
        }
        return new y68(arrayList, g, list, collection4, a5, z, j);
    }
}
