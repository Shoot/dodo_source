package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: DelegatableNode.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a%\u0010\t\u001a\u00020\b*\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\f*\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0005H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0005H\u0000\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0001H\u0000\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0002\"\u0018\u0010\u0018\u001a\u00020\b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lgr6;", "Lsm6$c;", "node", "", c.a, "Lzt2;", "Lqz6;", MessageAttributes.TYPE, "", e.a, "(Lzt2;I)Z", "kind", "Loz6;", Image.TYPE_HIGH, "(Lzt2;I)Loz6;", "Len5;", "i", "Lum7;", "j", "Lzm5;", DateTokenConverter.CONVERTER_KEY, "g", "f", "(Lzt2;)Z", "isDelegationRoot", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: au2 */
/* loaded from: classes.dex */
public final class au2 {
    public static final void c(gr6<sm6.c> gr6Var, sm6.c cVar) {
        gr6<en5> o0 = i(cVar).o0();
        int s = o0.s();
        if (s > 0) {
            int i = s - 1;
            en5[] r = o0.r();
            do {
                gr6Var.b(r[i].e0().k());
                i--;
            } while (i >= 0);
        }
    }

    public static final zm5 d(sm6.c cVar) {
        z65.h(cVar, "<this>");
        if ((qz6.a(2) & cVar.H0()) != 0) {
            if (cVar instanceof zm5) {
                return (zm5) cVar;
            }
            if (cVar instanceof fu2) {
                sm6.c g1 = ((fu2) cVar).g1();
                while (g1 != null) {
                    if (g1 instanceof zm5) {
                        return (zm5) g1;
                    }
                    if ((g1 instanceof fu2) && (qz6.a(2) & g1.H0()) != 0) {
                        g1 = ((fu2) g1).g1();
                    } else {
                        g1 = g1.D0();
                    }
                }
            }
        }
        return null;
    }

    public static final boolean e(zt2 zt2Var, int i) {
        z65.h(zt2Var, "$this$has");
        if ((zt2Var.I().C0() & i) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean f(zt2 zt2Var) {
        z65.h(zt2Var, "<this>");
        if (zt2Var.I() == zt2Var) {
            return true;
        }
        return false;
    }

    public static final sm6.c g(gr6<sm6.c> gr6Var) {
        if (gr6Var != null && !gr6Var.u()) {
            return gr6Var.z(gr6Var.s() - 1);
        }
        return null;
    }

    public static final oz6 h(zt2 zt2Var, int i) {
        z65.h(zt2Var, "$this$requireCoordinator");
        oz6 E0 = zt2Var.I().E0();
        z65.e(E0);
        if (E0.z1() == zt2Var && rz6.i(i)) {
            oz6 A1 = E0.A1();
            z65.e(A1);
            return A1;
        }
        return E0;
    }

    public static final en5 i(zt2 zt2Var) {
        z65.h(zt2Var, "<this>");
        oz6 E0 = zt2Var.I().E0();
        if (E0 != null) {
            return E0.L0();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    public static final um7 j(zt2 zt2Var) {
        z65.h(zt2Var, "<this>");
        um7 g0 = i(zt2Var).g0();
        if (g0 != null) {
            return g0;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
