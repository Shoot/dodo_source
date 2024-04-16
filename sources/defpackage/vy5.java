package defpackage;

import kotlin.Metadata;
/* compiled from: LookaheadLayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Lty5;", "a", "(Lty5;)Lty5;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: vy5  reason: default package */
/* loaded from: classes.dex */
public final class vy5 {
    public static final ty5 a(ty5 ty5Var) {
        en5 en5Var;
        z65.h(ty5Var, "<this>");
        en5 L0 = ty5Var.L0();
        while (true) {
            en5 h0 = L0.h0();
            en5 en5Var2 = null;
            if (h0 != null) {
                en5Var = h0.U();
            } else {
                en5Var = null;
            }
            if (en5Var != null) {
                en5 h02 = L0.h0();
                if (h02 != null) {
                    en5Var2 = h02.U();
                }
                z65.e(en5Var2);
                if (en5Var2.E0()) {
                    L0 = L0.h0();
                    z65.e(L0);
                } else {
                    en5 h03 = L0.h0();
                    z65.e(h03);
                    L0 = h03.U();
                    z65.e(L0);
                }
            } else {
                ty5 v1 = L0.f0().v1();
                z65.e(v1);
                return v1;
            }
        }
    }
}
