package defpackage;

import kotlin.Metadata;
/* compiled from: menuitempersonalpriceext.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\b"}, d2 = {"Lvf6;", "Ll18;", "b", "Lqja;", "Lhn6;", "rawPrice", "personalPrice", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ph6  reason: default package */
/* loaded from: classes4.dex */
public final class ph6 {
    public static final qja a(qja qjaVar, hn6 hn6Var, l18 l18Var) {
        z65.h(qjaVar, "<this>");
        z65.h(hn6Var, "rawPrice");
        String id = qjaVar.getId();
        String t = qjaVar.t();
        boolean p = qjaVar.p();
        String G0 = qjaVar.G0();
        if (l18Var == null) {
            l18Var = qjaVar.v();
        }
        return new rja(id, hn6Var, t, l18Var, p, G0);
    }

    public static final l18 b(vf6 vf6Var) {
        z65.h(vf6Var, "<this>");
        return new l18(vf6Var.g(), vf6Var.c(), vf6Var.b(), vf6Var.a(), vf6Var.d());
    }
}
