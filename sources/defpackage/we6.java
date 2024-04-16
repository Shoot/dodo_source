package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: MenuItemV5PersonalPriceEnricher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lwe6;", "", "Lte6;", "menuItem", "a", "Lhq3;", "Lhq3;", "featureService", "Lzf6;", "b", "Lzf6;", "menuPersonalPriceInfoRepository", "<init>", "(Lhq3;Lzf6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: we6  reason: default package */
/* loaded from: classes4.dex */
public final class we6 {
    private final hq3 a;
    private final zf6 b;

    public we6(hq3 hq3Var, zf6 zf6Var) {
        z65.h(hq3Var, "featureService");
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        this.a = hq3Var;
        this.b = zf6Var;
    }

    public final te6 a(te6 te6Var) {
        vf6 vf6Var;
        Object Z;
        l18 l18Var;
        te6 a;
        boolean v;
        te6 a2;
        z65.h(te6Var, "menuItem");
        if (!this.a.a(bq3.C5)) {
            a2 = te6Var.a((r26 & 1) != 0 ? te6Var.a : null, (r26 & 2) != 0 ? te6Var.b : null, (r26 & 4) != 0 ? te6Var.c : null, (r26 & 8) != 0 ? te6Var.d : null, (r26 & 16) != 0 ? te6Var.e : null, (r26 & 32) != 0 ? te6Var.f : null, (r26 & 64) != 0 ? te6Var.g : null, (r26 & 128) != 0 ? te6Var.h : null, (r26 & 256) != 0 ? te6Var.i : null, (r26 & 512) != 0 ? te6Var.j : null, (r26 & 1024) != 0 ? te6Var.k : null, (r26 & 2048) != 0 ? te6Var.l : null);
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        Collection<vf6> all = this.b.getAll();
        Iterator<T> it = te6Var.l().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            dxb dxbVar = (dxb) it.next();
            Iterator<T> it2 = all.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                v = l0b.v(((vf6) next).g(), dxbVar.a().c(), true);
                if (v) {
                    obj = next;
                    break;
                }
            }
            vf6 vf6Var2 = (vf6) obj;
            if (vf6Var2 != null) {
                arrayList.add(vf6Var2);
            }
        }
        if (arrayList.size() > 1) {
            vf6Var = (vf6) Collections.min(arrayList, wf6.a);
        } else if (!arrayList.isEmpty()) {
            Z = sc1.Z(arrayList);
            vf6Var = (vf6) Z;
        } else {
            vf6Var = null;
        }
        if (vf6Var != null) {
            l18Var = ph6.b(vf6Var);
        } else {
            l18Var = null;
        }
        a = te6Var.a((r26 & 1) != 0 ? te6Var.a : null, (r26 & 2) != 0 ? te6Var.b : null, (r26 & 4) != 0 ? te6Var.c : null, (r26 & 8) != 0 ? te6Var.d : null, (r26 & 16) != 0 ? te6Var.e : null, (r26 & 32) != 0 ? te6Var.f : null, (r26 & 64) != 0 ? te6Var.g : null, (r26 & 128) != 0 ? te6Var.h : null, (r26 & 256) != 0 ? te6Var.i : null, (r26 & 512) != 0 ? te6Var.j : null, (r26 & 1024) != 0 ? te6Var.k : null, (r26 & 2048) != 0 ? te6Var.l : l18Var);
        return a;
    }
}
