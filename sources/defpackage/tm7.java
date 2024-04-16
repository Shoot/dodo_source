package defpackage;

import defpackage.um7;
/* compiled from: Owner.kt */
/* renamed from: tm7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tm7 {
    static {
        um7.a aVar = um7.P;
    }

    public static /* synthetic */ void a(um7 um7Var, en5 en5Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            um7Var.g(en5Var, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    public static /* synthetic */ void b(um7 um7Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            um7Var.a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    public static /* synthetic */ void c(um7 um7Var, en5 en5Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            um7Var.q(en5Var, z, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    public static /* synthetic */ void d(um7 um7Var, en5 en5Var, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            um7Var.k(en5Var, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }
}
