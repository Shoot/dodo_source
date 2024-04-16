package defpackage;

import defpackage.sm6;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lzt2;", "Lqz6;", MessageAttributes.TYPE, "stopType", "Lsm6$c;", "b", "(Lzt2;II)Lsm6$c;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: pz6  reason: default package */
/* loaded from: classes.dex */
public final class pz6 {
    public static final /* synthetic */ sm6.c a(zt2 zt2Var, int i, int i2) {
        return b(zt2Var, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sm6.c b(zt2 zt2Var, int i, int i2) {
        sm6.c D0 = zt2Var.I().D0();
        if (D0 == null || (D0.C0() & i) == 0) {
            return null;
        }
        while (D0 != null) {
            int H0 = D0.H0();
            if ((H0 & i2) != 0) {
                return null;
            }
            if ((H0 & i) != 0) {
                return D0;
            }
            D0 = D0.D0();
        }
        return null;
    }
}
