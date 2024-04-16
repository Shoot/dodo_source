package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a \u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000\u001a \u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0007*\u00020\u0010H\u0002\u001a\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0010H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001f\u0010\u0018\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u00158@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lsm6$b;", "element", "", "f", "Lsm6$c;", "node", "g", "", DateTokenConverter.CONVERTER_KEY, "a", e.a, "remainingSet", "phase", "b", "selfKindSet", c.a, "Lg24;", "j", "", "k", Image.TYPE_HIGH, "Lqz6;", "i", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: rz6  reason: default package */
/* loaded from: classes.dex */
public final class rz6 {
    public static final void a(sm6.c cVar) {
        z65.h(cVar, "node");
        if (cVar.M0()) {
            b(cVar, -1, 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void b(sm6.c cVar, int i, int i2) {
        z65.h(cVar, "node");
        if (cVar instanceof fu2) {
            fu2 fu2Var = (fu2) cVar;
            c(cVar, fu2Var.h1() & i, i2);
            int i3 = (~fu2Var.h1()) & i;
            for (sm6.c g1 = fu2Var.g1(); g1 != null; g1 = g1.D0()) {
                b(g1, i3, i2);
            }
            return;
        }
        c(cVar, i & cVar.H0(), i2);
    }

    private static final void c(sm6.c cVar, int i, int i2) {
        if (i2 == 0 && !cVar.K0()) {
            return;
        }
        if ((qz6.a(2) & i) != 0 && (cVar instanceof zm5)) {
            cn5.b((zm5) cVar);
            if (i2 == 2) {
                au2.h(cVar, qz6.a(2)).V1();
            }
        }
        if ((qz6.a(256) & i) != 0 && (cVar instanceof jg4)) {
            au2.i(cVar).y0();
        }
        if ((qz6.a(4) & i) != 0 && (cVar instanceof v73)) {
            w73.a((v73) cVar);
        }
        if ((qz6.a(8) & i) != 0 && (cVar instanceof yaa)) {
            zaa.b((yaa) cVar);
        }
        if ((qz6.a(64) & i) != 0 && (cVar instanceof wq7)) {
            xq7.a((wq7) cVar);
        }
        if ((qz6.a(1024) & i) != 0 && (cVar instanceof FocusTargetNode)) {
            if (i2 == 2) {
                cVar.R0();
            } else {
                au2.j(cVar).getFocusOwner().g((FocusTargetNode) cVar);
            }
        }
        if ((qz6.a(2048) & i) != 0 && (cVar instanceof g24)) {
            g24 g24Var = (g24) cVar;
            if (k(g24Var)) {
                if (i2 == 2) {
                    j(g24Var);
                } else {
                    h24.a(g24Var);
                }
            }
        }
        if ((i & qz6.a(4096)) != 0 && (cVar instanceof u14)) {
            v14.b((u14) cVar);
        }
    }

    public static final void d(sm6.c cVar) {
        z65.h(cVar, "node");
        if (cVar.M0()) {
            b(cVar, -1, 2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void e(sm6.c cVar) {
        z65.h(cVar, "node");
        if (cVar.M0()) {
            b(cVar, -1, 0);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final int f(sm6.b bVar) {
        z65.h(bVar, "element");
        int a = qz6.a(1);
        if (bVar instanceof ym5) {
            a |= qz6.a(2);
        }
        if (bVar instanceof t73) {
            a |= qz6.a(4);
        }
        if (bVar instanceof vaa) {
            a |= qz6.a(8);
        }
        if (bVar instanceof de8) {
            a |= qz6.a(16);
        }
        if ((bVar instanceof vm6) || (bVar instanceof cn6)) {
            a |= qz6.a(32);
        }
        if (bVar instanceof t14) {
            a |= qz6.a(4096);
        }
        if (bVar instanceof d24) {
            a |= qz6.a(2048);
        }
        if (bVar instanceof g87) {
            a |= qz6.a(256);
        }
        if (bVar instanceof vq7) {
            a |= qz6.a(64);
        }
        if ((bVar instanceof t87) || (bVar instanceof x87)) {
            return a | qz6.a(128);
        }
        return a;
    }

    public static final int g(sm6.c cVar) {
        z65.h(cVar, "node");
        if (cVar.H0() != 0) {
            return cVar.H0();
        }
        int a = qz6.a(1);
        if (cVar instanceof zm5) {
            a |= qz6.a(2);
        }
        if (cVar instanceof v73) {
            a |= qz6.a(4);
        }
        if (cVar instanceof yaa) {
            a |= qz6.a(8);
        }
        if (cVar instanceof fe8) {
            a |= qz6.a(16);
        }
        if (cVar instanceof an6) {
            a |= qz6.a(32);
        }
        if (cVar instanceof wq7) {
            a |= qz6.a(64);
        }
        if (cVar instanceof km5) {
            a |= qz6.a(128);
        }
        if (cVar instanceof jg4) {
            a |= qz6.a(256);
        }
        if (cVar instanceof m65) {
            a |= qz6.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            a |= qz6.a(1024);
        }
        if (cVar instanceof g24) {
            a |= qz6.a(2048);
        }
        if (cVar instanceof u14) {
            a |= qz6.a(4096);
        }
        if (cVar instanceof hf5) {
            a |= qz6.a(8192);
        }
        if (cVar instanceof eo9) {
            a |= qz6.a(16384);
        }
        if (cVar instanceof mo1) {
            a |= qz6.a(32768);
        }
        if (cVar instanceof gqa) {
            return a | qz6.a(131072);
        }
        return a;
    }

    public static final int h(sm6.c cVar) {
        z65.h(cVar, "node");
        if (cVar instanceof fu2) {
            fu2 fu2Var = (fu2) cVar;
            int h1 = fu2Var.h1();
            for (sm6.c g1 = fu2Var.g1(); g1 != null; g1 = g1.D0()) {
                h1 |= h(g1);
            }
            return h1;
        }
        return g(cVar);
    }

    public static final boolean i(int i) {
        if ((i & qz6.a(128)) != 0) {
            return true;
        }
        return false;
    }

    private static final void j(g24 g24Var) {
        int a = qz6.a(1024);
        if (g24Var.I().M0()) {
            gr6 gr6Var = new gr6(new sm6.c[16], 0);
            sm6.c D0 = g24Var.I().D0();
            if (D0 == null) {
                au2.c(gr6Var, g24Var.I());
            } else {
                gr6Var.b(D0);
            }
            while (gr6Var.v()) {
                sm6.c cVar = (sm6.c) gr6Var.z(gr6Var.s() - 1);
                if ((cVar.C0() & a) == 0) {
                    au2.c(gr6Var, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.H0() & a) != 0) {
                            gr6 gr6Var2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    n24.a((FocusTargetNode) cVar);
                                } else if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                                    int i = 0;
                                    for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                        if ((g1.H0() & a) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar = g1;
                                            } else {
                                                if (gr6Var2 == null) {
                                                    gr6Var2 = new gr6(new sm6.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    gr6Var2.b(cVar);
                                                    cVar = null;
                                                }
                                                gr6Var2.b(g1);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVar = au2.g(gr6Var2);
                            }
                        } else {
                            cVar = cVar.D0();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final boolean k(g24 g24Var) {
        wm0 wm0Var = wm0.a;
        wm0Var.m();
        g24Var.e0(wm0Var);
        return wm0Var.l();
    }
}
