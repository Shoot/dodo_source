package defpackage;

import defpackage.sm6;
/* compiled from: ModifierLocalModifierNode.kt */
/* renamed from: zm6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zm6 {
    public static Object a(an6 an6Var, um6 um6Var) {
        mz6 e0;
        z65.h(um6Var, "<this>");
        if (an6Var.I().M0()) {
            int a = qz6.a(32);
            if (an6Var.I().M0()) {
                sm6.c J0 = an6Var.I().J0();
                en5 i = au2.i(an6Var);
                while (i != null) {
                    if ((i.e0().k().C0() & a) != 0) {
                        while (J0 != null) {
                            if ((J0.H0() & a) != 0) {
                                sm6.c cVar = J0;
                                gr6 gr6Var = null;
                                while (cVar != null) {
                                    if (cVar instanceof an6) {
                                        an6 an6Var2 = (an6) cVar;
                                        if (an6Var2.D().a(um6Var)) {
                                            return an6Var2.D().b(um6Var);
                                        }
                                    } else if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                                        int i2 = 0;
                                        for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                            if ((g1.H0() & a) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVar = g1;
                                                } else {
                                                    if (gr6Var == null) {
                                                        gr6Var = new gr6(new sm6.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        gr6Var.b(cVar);
                                                        cVar = null;
                                                    }
                                                    gr6Var.b(g1);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cVar = au2.g(gr6Var);
                                }
                                continue;
                            }
                            J0 = J0.J0();
                        }
                    }
                    i = i.h0();
                    if (i != null && (e0 = i.e0()) != null) {
                        J0 = e0.o();
                    } else {
                        J0 = null;
                    }
                }
                return um6Var.a().invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static ym6 b(an6 an6Var) {
        return og3.a;
    }
}
