package androidx.compose.ui.focus;

import androidx.compose.ui.focus.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: FocusTraversal.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "focusDirection", "Lqm5;", "layoutDirection", "Landroidx/compose/ui/focus/g;", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILqm5;)Landroidx/compose/ui/focus/g;", "Lkotlin/Function1;", "", "onFound", com.huawei.hms.push.e.a, "(Landroidx/compose/ui/focus/FocusTargetNode;ILqm5;Lkotlin/jvm/functions/Function1;)Z", "Lk99;", DateTokenConverter.CONVERTER_KEY, "b", com.huawei.hms.opendevice.c.a, "g", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class j {

    /* compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[qm5.values().length];
            try {
                iArr[qm5.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qm5.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[l24.values().length];
            try {
                iArr2[l24.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[l24.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[l24.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[l24.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final g a(FocusTargetNode focusTargetNode, int i, qm5 qm5Var) {
        g f;
        z65.h(focusTargetNode, "$this$customFocusSearch");
        z65.h(qm5Var, "layoutDirection");
        e j1 = focusTargetNode.j1();
        b.a aVar = b.b;
        if (b.l(i, aVar.e())) {
            return j1.a();
        }
        if (b.l(i, aVar.f())) {
            return j1.k();
        }
        if (b.l(i, aVar.h())) {
            return j1.b();
        }
        if (b.l(i, aVar.a())) {
            return j1.g();
        }
        if (b.l(i, aVar.d())) {
            int i2 = a.$EnumSwitchMapping$0[qm5Var.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    f = j1.f();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                f = j1.d();
            }
            if (f == g.b.b()) {
                f = null;
            }
            if (f == null) {
                return j1.e();
            }
        } else if (b.l(i, aVar.g())) {
            int i3 = a.$EnumSwitchMapping$0[qm5Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    f = j1.d();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                f = j1.f();
            }
            if (f == g.b.b()) {
                f = null;
            }
            if (f == null) {
                return j1.u();
            }
        } else if (b.l(i, aVar.b())) {
            return j1.i().invoke(b.i(i));
        } else {
            if (b.l(i, aVar.c())) {
                return j1.c().invoke(b.i(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0054, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.z65.h(r10, r0)
            l24 r0 = r10.l1()
            int[] r1 = androidx.compose.ui.focus.j.a.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Ldc
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto Ldc
            r10 = 4
            if (r0 != r10) goto L1f
            return r3
        L1f:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L25:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = defpackage.qz6.a(r0)
            sm6$c r2 = r10.I()
            boolean r2 = r2.M0()
            if (r2 == 0) goto Ld0
            gr6 r2 = new gr6
            r4 = 16
            sm6$c[] r5 = new defpackage.sm6.c[r4]
            r6 = 0
            r2.<init>(r5, r6)
            sm6$c r5 = r10.I()
            sm6$c r5 = r5.D0()
            if (r5 != 0) goto L51
            sm6$c r10 = r10.I()
            defpackage.au2.a(r2, r10)
            goto L54
        L51:
            r2.b(r5)
        L54:
            boolean r10 = r2.v()
            if (r10 == 0) goto Lcf
            int r10 = r2.s()
            int r10 = r10 - r1
            java.lang.Object r10 = r2.z(r10)
            sm6$c r10 = (defpackage.sm6.c) r10
            int r5 = r10.C0()
            r5 = r5 & r0
            if (r5 != 0) goto L70
            defpackage.au2.a(r2, r10)
            goto L54
        L70:
            if (r10 == 0) goto L54
            int r5 = r10.H0()
            r5 = r5 & r0
            if (r5 == 0) goto Lca
            r5 = r3
        L7a:
            if (r10 == 0) goto L54
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L89
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.focus.FocusTargetNode r10 = b(r10)
            if (r10 == 0) goto Lc5
            return r10
        L89:
            int r7 = r10.H0()
            r7 = r7 & r0
            if (r7 == 0) goto Lc5
            boolean r7 = r10 instanceof defpackage.fu2
            if (r7 == 0) goto Lc5
            r7 = r10
            fu2 r7 = (defpackage.fu2) r7
            sm6$c r7 = r7.g1()
            r8 = 0
        L9c:
            if (r7 == 0) goto Lc2
            int r9 = r7.H0()
            r9 = r9 & r0
            if (r9 == 0) goto Lbd
            int r8 = r8 + 1
            if (r8 != r1) goto Lab
            r10 = r7
            goto Lbd
        Lab:
            if (r5 != 0) goto Lb4
            gr6 r5 = new gr6
            sm6$c[] r9 = new defpackage.sm6.c[r4]
            r5.<init>(r9, r6)
        Lb4:
            if (r10 == 0) goto Lba
            r5.b(r10)
            r10 = r3
        Lba:
            r5.b(r7)
        Lbd:
            sm6$c r7 = r7.D0()
            goto L9c
        Lc2:
            if (r8 != r1) goto Lc5
            goto L7a
        Lc5:
            sm6$c r10 = defpackage.au2.b(r5)
            goto L7a
        Lca:
            sm6$c r10 = r10.D0()
            goto L70
        Lcf:
            return r3
        Ld0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Ldc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.j.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        mz6 e0;
        int a2 = qz6.a(1024);
        if (focusTargetNode.I().M0()) {
            sm6.c J0 = focusTargetNode.I().J0();
            en5 i = au2.i(focusTargetNode);
            while (i != null) {
                if ((i.e0().k().C0() & a2) != 0) {
                    while (J0 != null) {
                        if ((J0.H0() & a2) != 0) {
                            sm6.c cVar = J0;
                            gr6 gr6Var = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.j1().j()) {
                                        return focusTargetNode2;
                                    }
                                } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                    int i2 = 0;
                                    for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                        if ((g1.H0() & a2) != 0) {
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
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final k99 d(FocusTargetNode focusTargetNode) {
        k99 x;
        z65.h(focusTargetNode, "<this>");
        oz6 E0 = focusTargetNode.E0();
        if (E0 == null || (x = pm5.d(E0).x(E0, false)) == null) {
            return k99.e.a();
        }
        return x;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i, qm5 qm5Var, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNode2;
        int g;
        Boolean t;
        z65.h(focusTargetNode, "$this$focusSearch");
        z65.h(qm5Var, "layoutDirection");
        z65.h(function1, "onFound");
        b.a aVar = b.b;
        if (b.l(i, aVar.e()) || b.l(i, aVar.f())) {
            return l.f(focusTargetNode, i, function1);
        }
        if (b.l(i, aVar.d()) || b.l(i, aVar.g()) || b.l(i, aVar.h()) || b.l(i, aVar.a())) {
            Boolean t2 = m.t(focusTargetNode, i, function1);
            if (t2 != null) {
                return t2.booleanValue();
            }
        } else if (b.l(i, aVar.b())) {
            int i2 = a.$EnumSwitchMapping$0[qm5Var.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    g = aVar.d();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                g = aVar.g();
            }
            FocusTargetNode b = b(focusTargetNode);
            if (b != null && (t = m.t(b, g, function1)) != null) {
                return t.booleanValue();
            }
        } else if (b.l(i, aVar.c())) {
            FocusTargetNode b2 = b(focusTargetNode);
            if (b2 != null) {
                focusTargetNode2 = c(b2);
            } else {
                focusTargetNode2 = null;
            }
            if (focusTargetNode2 != null && !z65.c(focusTargetNode2, focusTargetNode)) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.n(i))).toString());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0040, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.z65.h(r10, r0)
            sm6$c r0 = r10.I()
            boolean r0 = r0.M0()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = defpackage.qz6.a(r0)
            sm6$c r2 = r10.I()
            boolean r2 = r2.M0()
            if (r2 == 0) goto Lcc
            gr6 r2 = new gr6
            r3 = 16
            sm6$c[] r4 = new defpackage.sm6.c[r3]
            r5 = 0
            r2.<init>(r4, r5)
            sm6$c r4 = r10.I()
            sm6$c r4 = r4.D0()
            if (r4 != 0) goto L3d
            sm6$c r10 = r10.I()
            defpackage.au2.a(r2, r10)
            goto L40
        L3d:
            r2.b(r4)
        L40:
            boolean r10 = r2.v()
            if (r10 == 0) goto Lcb
            int r10 = r2.s()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.z(r10)
            sm6$c r10 = (defpackage.sm6.c) r10
            int r6 = r10.C0()
            r6 = r6 & r0
            if (r6 != 0) goto L5d
            defpackage.au2.a(r2, r10)
            goto L40
        L5d:
            if (r10 == 0) goto L40
            int r6 = r10.H0()
            r6 = r6 & r0
            if (r6 == 0) goto Lc6
            r6 = r1
        L67:
            if (r10 == 0) goto L40
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L85
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            l24 r7 = r10.l1()
            int[] r8 = androidx.compose.ui.focus.j.a.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L84
            r8 = 2
            if (r7 == r8) goto L84
            r8 = 3
            if (r7 == r8) goto L84
            goto Lc1
        L84:
            return r10
        L85:
            int r7 = r10.H0()
            r7 = r7 & r0
            if (r7 == 0) goto Lc1
            boolean r7 = r10 instanceof defpackage.fu2
            if (r7 == 0) goto Lc1
            r7 = r10
            fu2 r7 = (defpackage.fu2) r7
            sm6$c r7 = r7.g1()
            r8 = 0
        L98:
            if (r7 == 0) goto Lbe
            int r9 = r7.H0()
            r9 = r9 & r0
            if (r9 == 0) goto Lb9
            int r8 = r8 + 1
            if (r8 != r4) goto La7
            r10 = r7
            goto Lb9
        La7:
            if (r6 != 0) goto Lb0
            gr6 r6 = new gr6
            sm6$c[] r9 = new defpackage.sm6.c[r3]
            r6.<init>(r9, r5)
        Lb0:
            if (r10 == 0) goto Lb6
            r6.b(r10)
            r10 = r1
        Lb6:
            r6.b(r7)
        Lb9:
            sm6$c r7 = r7.D0()
            goto L98
        Lbe:
            if (r8 != r4) goto Lc1
            goto L67
        Lc1:
            sm6$c r10 = defpackage.au2.b(r6)
            goto L67
        Lc6:
            sm6$c r10 = r10.D0()
            goto L5d
        Lcb:
            return r1
        Lcc:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.j.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        en5 L0;
        oz6 E0;
        en5 L02;
        z65.h(focusTargetNode, "<this>");
        oz6 E02 = focusTargetNode.E0();
        if (E02 != null && (L0 = E02.L0()) != null && L0.b() && (E0 = focusTargetNode.E0()) != null && (L02 = E0.L0()) != null && L02.C0()) {
            return true;
        }
        return false;
    }
}
