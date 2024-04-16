package defpackage;

import kotlin.Metadata;
/* compiled from: LayoutModifierNodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"Lsy5;", "Lhb;", "alignmentLine", "", "b", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: bn5  reason: default package */
/* loaded from: classes.dex */
public final class bn5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(sy5 sy5Var, hb hbVar) {
        int h;
        sy5 I0 = sy5Var.I0();
        if (I0 != null) {
            if (sy5Var.M0().d().containsKey(hbVar)) {
                Integer num = sy5Var.M0().d().get(hbVar);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int H0 = I0.H0(hbVar);
            if (H0 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            I0.U0(true);
            sy5Var.T0(true);
            sy5Var.S0();
            I0.U0(false);
            sy5Var.T0(false);
            if (hbVar instanceof yo4) {
                h = s55.i(I0.O0());
            } else {
                h = s55.h(I0.O0());
            }
            return H0 + h;
        }
        throw new IllegalStateException(("Child of " + sy5Var + " cannot be null when calculating alignment line").toString());
    }
}
