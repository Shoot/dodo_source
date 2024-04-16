package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ComboSlotsService.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J<\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0002J<\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0002J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016JV\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lhi1;", "Lgi1;", "Lao1;", "compositeProduct", "", "Lfi1;", DateTokenConverter.CONVERTER_KEY, "Lzi1;", "comboTemplateProduct", "", "menuItemId", "cartItemId", "", "takePreferredSlotProducts", "Lsi8;", "preferredSlotProducts", e.a, "Ldj1;", c.a, "a", "", "selectedIds", "productIdsStopList", "hotAndReadyList", "b", "Lah6;", "Lah6;", "menuService", "Lmxa;", "Lmxa;", "stopRepository", "Lgp4;", "Lgp4;", "hotAndReadyService", "Lg78;", "Lg78;", "doughFormatter", "Lds0;", "Lds0;", "cartService", "Lc62;", "f", "Lc62;", "customizationService", "Lei1;", "g", "Lei1;", "comboSlotProductSelector", "<init>", "(Lah6;Lmxa;Lgp4;Lg78;Lds0;Lc62;Lei1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hi1  reason: default package */
/* loaded from: classes4.dex */
public final class hi1 implements gi1 {
    private final ah6 a;
    private final mxa b;
    private final gp4 c;
    private final g78 d;
    private final ds0 e;
    private final c62 f;
    private final ei1 g;

    public hi1(ah6 ah6Var, mxa mxaVar, gp4 gp4Var, g78 g78Var, ds0 ds0Var, c62 c62Var, ei1 ei1Var) {
        z65.h(ah6Var, "menuService");
        z65.h(mxaVar, "stopRepository");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(g78Var, "doughFormatter");
        z65.h(ds0Var, "cartService");
        z65.h(c62Var, "customizationService");
        z65.h(ei1Var, "comboSlotProductSelector");
        this.a = ah6Var;
        this.b = mxaVar;
        this.c = gp4Var;
        this.d = g78Var;
        this.e = ds0Var;
        this.f = c62Var;
        this.g = ei1Var;
    }

    private final List<dj1> c(String str, zi1 zi1Var, String str2, boolean z, List<si8> list) {
        ArrayList arrayList;
        Object obj;
        List l;
        List<dq0> w0;
        int w;
        if (str2.length() > 0) {
            Iterator<T> it = this.e.c().iterator();
            while (true) {
                arrayList = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((nq0) obj).j().getValue(), str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            nq0 nq0Var = (nq0) obj;
            if (nq0Var != null && (w0 = nq0Var.w0()) != null) {
                List<dq0> list2 = w0;
                w = lc1.w(list2, 10);
                arrayList = new ArrayList(w);
                for (dq0 dq0Var : list2) {
                    arrayList.add(dq0Var.getId());
                }
            }
            l = kc1.l();
            return zi1Var.s((List) mh5.c(arrayList, l));
        }
        return b(zi1Var, this.f.k(str), this.b.b(), this.c.e(), z, list);
    }

    private final List<fi1> d(ao1 ao1Var) {
        int w;
        Collection<String> b = this.b.b();
        Collection<fl8> o = ao1Var.o();
        w = lc1.w(o, 10);
        ArrayList arrayList = new ArrayList(w);
        for (fl8 fl8Var : o) {
            arrayList.add(new fi1(fl8Var, kn6.f(), kn6.f(), this.d.a(fl8Var), b.contains(fl8Var.getId()), false, null, 96, null));
        }
        return arrayList;
    }

    private final List<fi1> e(zi1 zi1Var, String str, String str2, boolean z, List<si8> list) {
        int w;
        boolean z2;
        boolean z3;
        Collection<String> b = this.b.b();
        List<String> e = this.c.e();
        List<dj1> c = c(str, zi1Var, str2, z, list);
        w = lc1.w(c, 10);
        ArrayList arrayList = new ArrayList(w);
        int i = 0;
        for (Object obj : c) {
            int i2 = i + 1;
            if (i < 0) {
                kc1.v();
            }
            dj1 dj1Var = (dj1) obj;
            if (!b.contains(dj1Var.g().getId()) && !bj1.b(dj1Var.g(), e)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (zi1Var.r().get(i).h().size() > 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList.add(new fi1(dj1Var.g(), dj1Var.e(), dj1Var.c(), this.d.a(dj1Var.g()), z2, z3, null, 64, null));
            i = i2;
        }
        return arrayList;
    }

    @Override // defpackage.gi1
    public List<fi1> a(String str, String str2, boolean z, List<si8> list) {
        Object t0;
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(list, "preferredSlotProducts");
        t0 = sc1.t0(this.a.s(str));
        fl8 Y = ((tja) t0).Y();
        if (Y instanceof ao1) {
            return d((ao1) Y);
        }
        if (Y instanceof zi1) {
            return e((zi1) Y, str, str2, z, list);
        }
        throw new IllegalStateException("unknown product: " + Y);
    }

    @Override // defpackage.gi1
    public List<dj1> b(zi1 zi1Var, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, boolean z, List<si8> list) {
        List F0;
        int w;
        Object c0;
        Object obj;
        z65.h(zi1Var, "comboTemplateProduct");
        z65.h(collection, "selectedIds");
        z65.h(collection2, "productIdsStopList");
        z65.h(collection3, "hotAndReadyList");
        z65.h(list, "preferredSlotProducts");
        F0 = sc1.F0(collection);
        List<cj1> r = zi1Var.r();
        w = lc1.w(r, 10);
        ArrayList arrayList = new ArrayList(w);
        int i = 0;
        for (Object obj2 : r) {
            int i2 = i + 1;
            if (i < 0) {
                kc1.v();
            }
            cj1 cj1Var = (cj1) obj2;
            String str = null;
            if (z) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (z65.c(((si8) obj).a(), cj1Var.e())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                si8 si8Var = (si8) obj;
                if (si8Var != null) {
                    str = si8Var.t();
                }
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            }
            c0 = sc1.c0(F0, i);
            arrayList.add(this.g.f(cj1Var, new una(str, (String) c0, collection2, collection3)));
            i = i2;
        }
        return arrayList;
    }
}
