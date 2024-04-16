package defpackage;

import defpackage.c8c;
import defpackage.d41;
import defpackage.ov0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CheckoutDetailsError.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"Lov0;", "changeWorkflowResult", "", "Ld41;", "a", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: e41  reason: default package */
/* loaded from: classes4.dex */
public final class e41 {
    public static final Collection<d41> a(ov0 ov0Var) {
        List l;
        d41 d41Var;
        List e;
        List e2;
        List e3;
        List e4;
        z65.h(ov0Var, "changeWorkflowResult");
        if (ov0Var instanceof ov0.a.c) {
            e4 = jc1.e(d41.p.c);
            return e4;
        } else if (z65.c(ov0Var, ov0.a.C0471a.a)) {
            e3 = jc1.e(d41.c.c);
            return e3;
        } else if (z65.c(ov0Var, ov0.a.d.a)) {
            e2 = jc1.e(d41.q.c);
            return e2;
        } else if (z65.c(ov0Var, ov0.a.b.a)) {
            e = jc1.e(d41.o.c);
            return e;
        } else if (!(ov0Var instanceof ov0.a.e)) {
            l = kc1.l();
            return l;
        } else {
            ArrayList arrayList = new ArrayList();
            for (c8c c8cVar : ((ov0.a.e) ov0Var).a()) {
                if (c8cVar instanceof c8c.b) {
                    d41Var = new d41.h(((c8c.b) c8cVar).a());
                } else if (c8cVar instanceof c8c.d) {
                    d41Var = new d41.k(((c8c.d) c8cVar).a());
                } else if (z65.c(c8cVar, c8c.f.a)) {
                    d41Var = d41.l.c;
                } else if (z65.c(c8cVar, c8c.g.a)) {
                    d41Var = d41.m.c;
                } else if (z65.c(c8cVar, c8c.k.a)) {
                    d41Var = d41.v.c;
                } else if (z65.c(c8cVar, c8c.c.a)) {
                    d41Var = d41.f.c;
                } else if (z65.c(c8cVar, c8c.a.a)) {
                    d41Var = d41.a.c;
                } else if (z65.c(c8cVar, c8c.j.a)) {
                    d41Var = d41.u.c;
                } else if (z65.c(c8cVar, c8c.i.a)) {
                    d41Var = d41.t.c;
                } else if (c8cVar instanceof c8c.h) {
                    d41Var = new d41.r(((c8c.h) c8cVar).a());
                } else {
                    d41Var = null;
                }
                if (d41Var != null) {
                    arrayList.add(d41Var);
                }
            }
            return arrayList;
        }
    }
}
