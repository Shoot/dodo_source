package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import com.huawei.hms.opendevice.c;
import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: FocusEventModifierNode.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"Lu14;", "", "b", "Lk24;", "a", "Landroidx/compose/ui/focus/FocusTargetNode;", c.a, "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: v14  reason: default package */
/* loaded from: classes.dex */
public final class v14 {

    /* compiled from: FocusEventModifierNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v14$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l24.values().length];
            try {
                iArr[l24.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l24.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l24.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l24.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x009a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.k24 a(defpackage.u14 r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v14.a(u14):k24");
    }

    public static final void b(u14 u14Var) {
        z65.h(u14Var, "<this>");
        au2.j(u14Var).getFocusOwner().d(u14Var);
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        mz6 e0;
        z65.h(focusTargetNode, "<this>");
        int a2 = qz6.a(4096);
        int a3 = qz6.a(1024);
        sm6.c I = focusTargetNode.I();
        int i = a2 | a3;
        if (focusTargetNode.I().M0()) {
            sm6.c I2 = focusTargetNode.I();
            en5 i2 = au2.i(focusTargetNode);
            while (i2 != null) {
                if ((i2.e0().k().C0() & i) != 0) {
                    while (I2 != null) {
                        if ((I2.H0() & i) != 0) {
                            if (I2 == I || (I2.H0() & a3) == 0) {
                                if ((I2.H0() & a2) != 0) {
                                    sm6.c cVar = I2;
                                    gr6 gr6Var = null;
                                    while (cVar != null) {
                                        if (cVar instanceof u14) {
                                            u14 u14Var = (u14) cVar;
                                            u14Var.r(a(u14Var));
                                        } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                            int i3 = 0;
                                            for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                                if ((g1.H0() & a2) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
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
                                            if (i3 == 1) {
                                            }
                                        }
                                        cVar = au2.g(gr6Var);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        I2 = I2.J0();
                    }
                }
                i2 = i2.h0();
                if (i2 != null && (e0 = i2.e0()) != null) {
                    I2 = e0.o();
                } else {
                    I2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
