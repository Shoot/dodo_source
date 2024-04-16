package androidx.compose.ui.focus;

import androidx.compose.ui.focus.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import defpackage.va0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a5\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a=\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a \u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a\f\u0010\u0010\u001a\u00020\u0004*\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", com.huawei.hms.opendevice.c.a, "b", "focusedItem", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "i", Image.TYPE_HIGH, "g", com.huawei.hms.push.e.a, "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class l {

    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l24.values().length];
            try {
                iArr[l24.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l24.Active.ordinal()] = 2;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lva0$a;", "", "a", "(Lva0$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<va0.a, Boolean> {
        final /* synthetic */ FocusTargetNode a;
        final /* synthetic */ FocusTargetNode b;
        final /* synthetic */ int c;
        final /* synthetic */ Function1<FocusTargetNode, Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.a = focusTargetNode;
            this.b = focusTargetNode2;
            this.c = i;
            this.d = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(va0.a aVar) {
            z65.h(aVar, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(l.i(this.a, this.b, this.c, this.d));
            if (!valueOf.booleanValue() && aVar.a()) {
                return null;
            }
            return valueOf;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        l24 l1 = focusTargetNode.l1();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[l1.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (!g(focusTargetNode, function1) && (!focusTargetNode.j1().j() || !function1.invoke(focusTargetNode).booleanValue())) {
                        return false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return g(focusTargetNode, function1);
            }
        } else {
            FocusTargetNode f = j.f(focusTargetNode);
            if (f != null) {
                int i2 = iArr[f.l1().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    return d(focusTargetNode, f, androidx.compose.ui.focus.b.b.f(), function1);
                } else if (!b(f, function1) && !d(focusTargetNode, f, androidx.compose.ui.focus.b.b.f(), function1) && (!f.j1().j() || !function1.invoke(f).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int i = a.$EnumSwitchMapping$0[focusTargetNode.l1().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (focusTargetNode.j1().j()) {
                        return function1.invoke(focusTargetNode).booleanValue();
                    }
                    return h(focusTargetNode, function1);
                }
                throw new NoWhenBranchMatchedException();
            }
            return h(focusTargetNode, function1);
        }
        FocusTargetNode f = j.f(focusTargetNode);
        if (f != null) {
            if (c(f, function1) || d(focusTargetNode, f, androidx.compose.ui.focus.b.b.e(), function1)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        if (i(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new b(focusTargetNode, focusTargetNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        sm6.c cVar;
        mz6 e0;
        int a2 = qz6.a(1024);
        if (focusTargetNode.I().M0()) {
            sm6.c J0 = focusTargetNode.I().J0();
            en5 i = au2.i(focusTargetNode);
            loop0: while (true) {
                cVar = null;
                if (i == null) {
                    break;
                }
                if ((i.e0().k().C0() & a2) != 0) {
                    while (J0 != null) {
                        if ((J0.H0() & a2) != 0) {
                            sm6.c cVar2 = J0;
                            gr6 gr6Var = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof FocusTargetNode) {
                                    cVar = cVar2;
                                    break loop0;
                                }
                                if ((cVar2.H0() & a2) != 0 && (cVar2 instanceof fu2)) {
                                    int i2 = 0;
                                    for (sm6.c g1 = ((fu2) cVar2).g1(); g1 != null; g1 = g1.D0()) {
                                        if ((g1.H0() & a2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar2 = g1;
                                            } else {
                                                if (gr6Var == null) {
                                                    gr6Var = new gr6(new sm6.c[16], 0);
                                                }
                                                if (cVar2 != null) {
                                                    gr6Var.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                gr6Var.b(g1);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar2 = au2.g(gr6Var);
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
            if (cVar != null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        z65.h(focusTargetNode, "$this$oneDimensionalFocusSearch");
        z65.h(function1, "onFound");
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.e())) {
            return c(focusTargetNode, function1);
        }
        if (androidx.compose.ui.focus.b.l(i, aVar.f())) {
            return b(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    private static final boolean g(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        gr6 gr6Var = new gr6(new FocusTargetNode[16], 0);
        int a2 = qz6.a(1024);
        if (focusTargetNode.I().M0()) {
            gr6 gr6Var2 = new gr6(new sm6.c[16], 0);
            sm6.c D0 = focusTargetNode.I().D0();
            if (D0 == null) {
                au2.c(gr6Var2, focusTargetNode.I());
            } else {
                gr6Var2.b(D0);
            }
            while (gr6Var2.v()) {
                sm6.c cVar = (sm6.c) gr6Var2.z(gr6Var2.s() - 1);
                if ((cVar.C0() & a2) == 0) {
                    au2.c(gr6Var2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.H0() & a2) != 0) {
                            gr6 gr6Var3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    gr6Var.b((FocusTargetNode) cVar);
                                } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                    int i = 0;
                                    for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                        if ((g1.H0() & a2) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar = g1;
                                            } else {
                                                if (gr6Var3 == null) {
                                                    gr6Var3 = new gr6(new sm6.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    gr6Var3.b(cVar);
                                                    cVar = null;
                                                }
                                                gr6Var3.b(g1);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVar = au2.g(gr6Var3);
                            }
                        } else {
                            cVar = cVar.D0();
                        }
                    }
                }
            }
            gr6Var.D(k.a);
            int s = gr6Var.s();
            if (s <= 0) {
                return false;
            }
            int i2 = s - 1;
            Object[] r = gr6Var.r();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) r[i2];
                if (j.g(focusTargetNode2) && b(focusTargetNode2, function1)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final boolean h(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        gr6 gr6Var = new gr6(new FocusTargetNode[16], 0);
        int a2 = qz6.a(1024);
        if (focusTargetNode.I().M0()) {
            gr6 gr6Var2 = new gr6(new sm6.c[16], 0);
            sm6.c D0 = focusTargetNode.I().D0();
            if (D0 == null) {
                au2.c(gr6Var2, focusTargetNode.I());
            } else {
                gr6Var2.b(D0);
            }
            while (gr6Var2.v()) {
                sm6.c cVar = (sm6.c) gr6Var2.z(gr6Var2.s() - 1);
                if ((cVar.C0() & a2) == 0) {
                    au2.c(gr6Var2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.H0() & a2) != 0) {
                            gr6 gr6Var3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    gr6Var.b((FocusTargetNode) cVar);
                                } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                    int i = 0;
                                    for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                        if ((g1.H0() & a2) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar = g1;
                                            } else {
                                                if (gr6Var3 == null) {
                                                    gr6Var3 = new gr6(new sm6.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    gr6Var3.b(cVar);
                                                    cVar = null;
                                                }
                                                gr6Var3.b(g1);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVar = au2.g(gr6Var3);
                            }
                        } else {
                            cVar = cVar.D0();
                        }
                    }
                }
            }
            gr6Var.D(k.a);
            int s = gr6Var.s();
            if (s <= 0) {
                return false;
            }
            Object[] r = gr6Var.r();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) r[i2];
                if (j.g(focusTargetNode2) && c(focusTargetNode2, function1)) {
                    return true;
                }
                i2++;
            } while (i2 < s);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        if (focusTargetNode.l1() == l24.ActiveParent) {
            gr6 gr6Var = new gr6(new FocusTargetNode[16], 0);
            int a2 = qz6.a(1024);
            if (focusTargetNode.I().M0()) {
                gr6 gr6Var2 = new gr6(new sm6.c[16], 0);
                sm6.c D0 = focusTargetNode.I().D0();
                if (D0 == null) {
                    au2.c(gr6Var2, focusTargetNode.I());
                } else {
                    gr6Var2.b(D0);
                }
                while (gr6Var2.v()) {
                    sm6.c cVar = (sm6.c) gr6Var2.z(gr6Var2.s() - 1);
                    if ((cVar.C0() & a2) == 0) {
                        au2.c(gr6Var2, cVar);
                    } else {
                        while (true) {
                            if (cVar == null) {
                                break;
                            } else if ((cVar.H0() & a2) != 0) {
                                gr6 gr6Var3 = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        gr6Var.b((FocusTargetNode) cVar);
                                    } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                        int i2 = 0;
                                        for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                            if ((g1.H0() & a2) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVar = g1;
                                                } else {
                                                    if (gr6Var3 == null) {
                                                        gr6Var3 = new gr6(new sm6.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        gr6Var3.b(cVar);
                                                        cVar = null;
                                                    }
                                                    gr6Var3.b(g1);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cVar = au2.g(gr6Var3);
                                }
                            } else {
                                cVar = cVar.D0();
                            }
                        }
                    }
                }
                gr6Var.D(k.a);
                b.a aVar = androidx.compose.ui.focus.b.b;
                if (androidx.compose.ui.focus.b.l(i, aVar.e())) {
                    IntRange intRange = new IntRange(0, gr6Var.s() - 1);
                    int h = intRange.h();
                    int k = intRange.k();
                    if (h <= k) {
                        boolean z = false;
                        while (true) {
                            if (z) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) gr6Var.r()[h];
                                if (j.g(focusTargetNode3) && c(focusTargetNode3, function1)) {
                                    return true;
                                }
                            }
                            if (z65.c(gr6Var.r()[h], focusTargetNode2)) {
                                z = true;
                            }
                            if (h == k) {
                                break;
                            }
                            h++;
                        }
                    }
                } else if (androidx.compose.ui.focus.b.l(i, aVar.f())) {
                    IntRange intRange2 = new IntRange(0, gr6Var.s() - 1);
                    int h2 = intRange2.h();
                    int k2 = intRange2.k();
                    if (h2 <= k2) {
                        boolean z2 = false;
                        while (true) {
                            if (z2) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) gr6Var.r()[k2];
                                if (j.g(focusTargetNode4) && b(focusTargetNode4, function1)) {
                                    return true;
                                }
                            }
                            if (z65.c(gr6Var.r()[k2], focusTargetNode2)) {
                                z2 = true;
                            }
                            if (k2 == h2) {
                                break;
                            }
                            k2--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                if (androidx.compose.ui.focus.b.l(i, androidx.compose.ui.focus.b.b.e()) || !focusTargetNode.j1().j() || e(focusTargetNode)) {
                    return false;
                }
                return function1.invoke(focusTargetNode).booleanValue();
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
