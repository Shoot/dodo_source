package com.dodopizza.activeorder.feature.orderdetails.presentation;

import com.dodopizza.activeorder.feature.orderdetails.presentation.a;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: OrderDetailsVOFactory.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/b;", "Lmd7;", "Lbc7;", BonusActionEntity.ORDER, "Ljk7;", "orderType", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "b", "Lyf7;", "item", "Lhd7;", c.a, "Lld7;", "a", "Lg78;", "Lg78;", "doughFormatter", "Lhq3;", "Lhq3;", "featureService", "Le78;", "Le78;", "pizzaConceptService", "<init>", "(Lg78;Lhq3;Le78;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b implements md7 {
    private final g78 a;
    private final hq3 b;
    private final e78 c;

    public b(g78 g78Var, hq3 hq3Var, e78 e78Var) {
        z65.h(g78Var, "doughFormatter");
        z65.h(hq3Var, "featureService");
        z65.h(e78Var, "pizzaConceptService");
        this.a = g78Var;
        this.b = hq3Var;
        this.c = e78Var;
    }

    private final a b(bc7 bc7Var, jk7 jk7Var) {
        if (this.b.a(bq3.a5) && jk7Var == jk7.e) {
            if (bc7Var.o().d()) {
                return a.C0110a.a;
            }
            return new a.c(bc7Var.o());
        }
        return a.b.a;
    }

    private final hd7 c(yf7 yf7Var) {
        int w;
        String p = yf7Var.p();
        kl8 l = yf7Var.l();
        int o = yf7Var.o();
        int e = yf7Var.e();
        String b = this.a.b(yf7Var.n(), yf7Var.f());
        nb6 i = yf7Var.i();
        String m = yf7Var.m();
        hn6 q = yf7Var.q();
        String h = yf7Var.h();
        int j = yf7Var.j();
        String b2 = e62.b(yf7Var);
        String a = e62.a(yf7Var);
        List<bg7> c = yf7Var.d().c();
        w = lc1.w(c, 10);
        ArrayList arrayList = new ArrayList(w);
        for (bg7 bg7Var : c) {
            arrayList.add(bg7Var.a());
        }
        return new hd7(p, l, o, e, b, i, m, false, q, h, j, b2, a, arrayList, yf7Var.r(), this.c.a());
    }

    @Override // defpackage.md7
    public ld7 a(bc7 bc7Var) {
        int w;
        int w2;
        z65.h(bc7Var, BonusActionEntity.ORDER);
        ArrayList<yf7> arrayList = new ArrayList();
        for (Object obj : bc7Var.u()) {
            if (((yf7) obj).l() == kl8.e) {
                arrayList.add(obj);
            }
        }
        hn6 f = kn6.f();
        for (yf7 yf7Var : arrayList) {
            f = rn6.f(f, yf7Var.q());
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((yf7) obj2).k().d()) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : gd7.a.c(bc7Var.u())) {
            if (((yf7) obj3).l() == kl8.e) {
                arrayList3.add(obj3);
            } else {
                arrayList4.add(obj3);
            }
        }
        Pair pair = new Pair(arrayList3, arrayList4);
        List list = (List) pair.a();
        jk7 a = jk7.b.a(bc7Var.E());
        int e = bc7Var.e();
        hn6 D = bc7Var.D();
        String h = bc7Var.h();
        boolean J = bc7Var.J();
        long z = bc7Var.z();
        long w3 = bc7Var.w();
        List<yf7> list2 = (List) pair.b();
        hn6 hn6Var = f;
        w = lc1.w(list2, 10);
        ArrayList arrayList5 = new ArrayList(w);
        for (yf7 yf7Var2 : list2) {
            arrayList5.add(c(yf7Var2));
        }
        List list3 = list;
        w2 = lc1.w(list3, 10);
        ArrayList arrayList6 = new ArrayList(w2);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            yf7 yf7Var3 = (yf7) it.next();
            arrayList6.add(new jd7(yf7Var3.p(), yf7Var3.j(), yf7Var3.h()));
            it = it;
            arrayList5 = arrayList5;
        }
        return new ld7(e, D, h, J, a, z, w3, arrayList5, arrayList6, size, size2, hn6Var, this.b.a(bq3.f), b(bc7Var, a));
    }
}
