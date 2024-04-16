package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: LayoutNodeDrawScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Lzt2;", "Lsm6$c;", "b", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: hn5  reason: default package */
/* loaded from: classes.dex */
public final class hn5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final sm6.c b(zt2 zt2Var) {
        int a = qz6.a(4);
        int a2 = qz6.a(2);
        sm6.c D0 = zt2Var.I().D0();
        if (D0 == null || (D0.C0() & a) == 0) {
            return null;
        }
        while (D0 != null && (D0.H0() & a2) == 0) {
            if ((D0.H0() & a) != 0) {
                return D0;
            }
            D0 = D0.D0();
        }
        return null;
    }
}
