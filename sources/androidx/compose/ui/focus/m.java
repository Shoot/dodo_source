package androidx.compose.ui.focus;

import androidx.compose.ui.focus.b;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import defpackage.va0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: TwoDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a7\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a\u001a\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fH\u0002\u001a1\u0010\u0015\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001b\u001a\f\u0010 \u001a\u00020\u0013*\u00020\u0013H\u0002\u001a\f\u0010!\u001a\u00020\u0013*\u00020\u0013H\u0002\u001a\f\u0010\"\u001a\u00020\u0000*\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "", "onFound", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "r", "Lzt2;", "Lgr6;", "accessibleChildren", "", "i", "Lk99;", "focusRect", "j", "(Lgr6;Lk99;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", Image.TYPE_MEDIUM, "(Lk99;Lk99;Lk99;I)Z", KustoStorage.KustoTable.COLUMN_SOURCE, "rect1", "rect2", com.huawei.hms.opendevice.c.a, Image.TYPE_SMALL, Image.TYPE_HIGH, "b", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class m {

    /* compiled from: TwoDimensionalFocusSearch.kt */
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
    /* compiled from: TwoDimensionalFocusSearch.kt */
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
            Boolean valueOf = Boolean.valueOf(m.r(this.a, this.b, this.c, this.d));
            if (!valueOf.booleanValue() && aVar.a()) {
                return null;
            }
            return valueOf;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.l1() == l24.ActiveParent) {
            FocusTargetNode b2 = j.b(focusTargetNode);
            if (b2 != null) {
                return b2;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean c(k99 k99Var, k99 k99Var2, k99 k99Var3, int i) {
        if (d(k99Var3, i, k99Var) || !d(k99Var2, i, k99Var)) {
            return false;
        }
        if (e(k99Var3, i, k99Var)) {
            b.a aVar = androidx.compose.ui.focus.b.b;
            if (!androidx.compose.ui.focus.b.l(i, aVar.d()) && !androidx.compose.ui.focus.b.l(i, aVar.g()) && f(k99Var2, i, k99Var) >= g(k99Var3, i, k99Var)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(k99 k99Var, int i, k99 k99Var2) {
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d()) || androidx.compose.ui.focus.b.l(i, aVar.g())) {
            if (k99Var.c() <= k99Var2.i() || k99Var.i() >= k99Var2.c()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i, aVar.h()) || androidx.compose.ui.focus.b.l(i, aVar.a())) {
            if (k99Var.g() <= k99Var2.f() || k99Var.f() >= k99Var2.g()) {
                return false;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return true;
    }

    private static final boolean e(k99 k99Var, int i, k99 k99Var2) {
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d())) {
            if (k99Var2.f() < k99Var.g()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i, aVar.g())) {
            if (k99Var2.g() > k99Var.f()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i, aVar.h())) {
            if (k99Var2.i() < k99Var.c()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i, aVar.a())) {
            if (k99Var2.c() > k99Var.i()) {
                return false;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return true;
    }

    private static final float f(k99 k99Var, int i, k99 k99Var2) {
        float i2;
        float c;
        float i3;
        float c2;
        float f;
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d())) {
            i3 = k99Var2.f();
            c2 = k99Var.g();
        } else {
            if (androidx.compose.ui.focus.b.l(i, aVar.g())) {
                i2 = k99Var.f();
                c = k99Var2.g();
            } else if (androidx.compose.ui.focus.b.l(i, aVar.h())) {
                i3 = k99Var2.i();
                c2 = k99Var.c();
            } else if (androidx.compose.ui.focus.b.l(i, aVar.a())) {
                i2 = k99Var.i();
                c = k99Var2.c();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = i2 - c;
            return Math.max(0.0f, f);
        }
        f = i3 - c2;
        return Math.max(0.0f, f);
    }

    private static final float g(k99 k99Var, int i, k99 k99Var2) {
        float c;
        float c2;
        float i2;
        float i3;
        float f;
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d())) {
            i2 = k99Var2.f();
            i3 = k99Var.f();
        } else {
            if (androidx.compose.ui.focus.b.l(i, aVar.g())) {
                c = k99Var.g();
                c2 = k99Var2.g();
            } else if (androidx.compose.ui.focus.b.l(i, aVar.h())) {
                i2 = k99Var2.i();
                i3 = k99Var.i();
            } else if (androidx.compose.ui.focus.b.l(i, aVar.a())) {
                c = k99Var.c();
                c2 = k99Var2.c();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = c - c2;
            return Math.max(1.0f, f);
        }
        f = i2 - i3;
        return Math.max(1.0f, f);
    }

    private static final k99 h(k99 k99Var) {
        return new k99(k99Var.g(), k99Var.c(), k99Var.g(), k99Var.c());
    }

    private static final void i(zt2 zt2Var, gr6<FocusTargetNode> gr6Var) {
        int a2 = qz6.a(1024);
        if (zt2Var.I().M0()) {
            gr6 gr6Var2 = new gr6(new sm6.c[16], 0);
            sm6.c D0 = zt2Var.I().D0();
            if (D0 == null) {
                au2.c(gr6Var2, zt2Var.I());
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
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                    if (focusTargetNode.M0()) {
                                        if (focusTargetNode.j1().j()) {
                                            gr6Var.b(focusTargetNode);
                                        } else {
                                            i(focusTargetNode, gr6Var);
                                        }
                                    }
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
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final FocusTargetNode j(gr6<FocusTargetNode> gr6Var, k99 k99Var, int i) {
        k99 m;
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d())) {
            m = k99Var.m(k99Var.j() + 1, 0.0f);
        } else if (androidx.compose.ui.focus.b.l(i, aVar.g())) {
            m = k99Var.m(-(k99Var.j() + 1), 0.0f);
        } else if (androidx.compose.ui.focus.b.l(i, aVar.h())) {
            m = k99Var.m(0.0f, k99Var.e() + 1);
        } else if (androidx.compose.ui.focus.b.l(i, aVar.a())) {
            m = k99Var.m(0.0f, -(k99Var.e() + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        int s = gr6Var.s();
        FocusTargetNode focusTargetNode = null;
        if (s > 0) {
            FocusTargetNode[] r = gr6Var.r();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = r[i2];
                if (j.g(focusTargetNode2)) {
                    k99 d = j.d(focusTargetNode2);
                    if (m(d, m, k99Var, i)) {
                        focusTargetNode = focusTargetNode2;
                        m = d;
                    }
                }
                i2++;
            } while (i2 < s);
            return focusTargetNode;
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        k99 s;
        Object obj;
        z65.h(focusTargetNode, "$this$findChildCorrespondingToFocusEnter");
        z65.h(function1, "onFound");
        gr6 gr6Var = new gr6(new FocusTargetNode[16], 0);
        i(focusTargetNode, gr6Var);
        if (gr6Var.s() <= 1) {
            if (gr6Var.u()) {
                obj = null;
            } else {
                obj = gr6Var.r()[0];
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj;
            if (focusTargetNode2 == null) {
                return false;
            }
            return function1.invoke(focusTargetNode2).booleanValue();
        }
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.b())) {
            i = aVar.g();
        }
        if (androidx.compose.ui.focus.b.l(i, aVar.g()) || androidx.compose.ui.focus.b.l(i, aVar.a())) {
            s = s(j.d(focusTargetNode));
        } else if (androidx.compose.ui.focus.b.l(i, aVar.d()) || androidx.compose.ui.focus.b.l(i, aVar.h())) {
            s = h(j.d(focusTargetNode));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        FocusTargetNode j = j(gr6Var, s, i);
        if (j == null) {
            return false;
        }
        return function1.invoke(j).booleanValue();
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        if (r(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new b(focusTargetNode, focusTargetNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(k99 k99Var, k99 k99Var2, k99 k99Var3, int i) {
        if (!n(k99Var, i, k99Var3)) {
            return false;
        }
        if (n(k99Var2, i, k99Var3) && !c(k99Var3, k99Var, k99Var2, i) && (c(k99Var3, k99Var2, k99Var, i) || q(i, k99Var3, k99Var) >= q(i, k99Var3, k99Var2))) {
            return false;
        }
        return true;
    }

    private static final boolean n(k99 k99Var, int i, k99 k99Var2) {
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d())) {
            if ((k99Var2.g() <= k99Var.g() && k99Var2.f() < k99Var.g()) || k99Var2.f() <= k99Var.f()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i, aVar.g())) {
            if ((k99Var2.f() >= k99Var.f() && k99Var2.g() > k99Var.f()) || k99Var2.g() >= k99Var.g()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i, aVar.h())) {
            if ((k99Var2.c() <= k99Var.c() && k99Var2.i() < k99Var.c()) || k99Var2.i() <= k99Var.i()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.b.l(i, aVar.a())) {
            if ((k99Var2.i() >= k99Var.i() && k99Var2.c() > k99Var.i()) || k99Var2.c() >= k99Var.c()) {
                return false;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return true;
    }

    private static final float o(k99 k99Var, int i, k99 k99Var2) {
        float i2;
        float c;
        float i3;
        float c2;
        float f;
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d())) {
            i3 = k99Var2.f();
            c2 = k99Var.g();
        } else {
            if (androidx.compose.ui.focus.b.l(i, aVar.g())) {
                i2 = k99Var.f();
                c = k99Var2.g();
            } else if (androidx.compose.ui.focus.b.l(i, aVar.h())) {
                i3 = k99Var2.i();
                c2 = k99Var.c();
            } else if (androidx.compose.ui.focus.b.l(i, aVar.a())) {
                i2 = k99Var.i();
                c = k99Var2.c();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = i2 - c;
            return Math.max(0.0f, f);
        }
        f = i3 - c2;
        return Math.max(0.0f, f);
    }

    private static final float p(k99 k99Var, int i, k99 k99Var2) {
        float f;
        float i2;
        float i3;
        float e;
        b.a aVar = androidx.compose.ui.focus.b.b;
        if (androidx.compose.ui.focus.b.l(i, aVar.d()) || androidx.compose.ui.focus.b.l(i, aVar.g())) {
            f = 2;
            i2 = k99Var2.i() + (k99Var2.e() / f);
            i3 = k99Var.i();
            e = k99Var.e();
        } else if (androidx.compose.ui.focus.b.l(i, aVar.h()) || androidx.compose.ui.focus.b.l(i, aVar.a())) {
            f = 2;
            i2 = k99Var2.f() + (k99Var2.j() / f);
            i3 = k99Var.f();
            e = k99Var.j();
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return i2 - (i3 + (e / f));
    }

    private static final long q(int i, k99 k99Var, k99 k99Var2) {
        long abs = Math.abs(o(k99Var2, i, k99Var));
        long abs2 = Math.abs(p(k99Var2, i, k99Var));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode j;
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
            while (gr6Var.v() && (j = j(gr6Var, j.d(focusTargetNode2), i)) != null) {
                if (j.j1().j()) {
                    return function1.invoke(j).booleanValue();
                }
                if (l(j, focusTargetNode2, i, function1)) {
                    return true;
                }
                gr6Var.x(j);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final k99 s(k99 k99Var) {
        return new k99(k99Var.f(), k99Var.i(), k99Var.f(), k99Var.i());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        z65.h(focusTargetNode, "$this$twoDimensionalFocusSearch");
        z65.h(function1, "onFound");
        l24 l1 = focusTargetNode.l1();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[l1.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (focusTargetNode.j1().j()) {
                        return function1.invoke(focusTargetNode);
                    }
                    return Boolean.FALSE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(k(focusTargetNode, i, function1));
        }
        FocusTargetNode f = j.f(focusTargetNode);
        if (f != null) {
            int i3 = iArr[f.l1().ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                return Boolean.valueOf(l(focusTargetNode, f, i, function1));
            }
            Boolean t = t(f, i, function1);
            if (!z65.c(t, Boolean.FALSE)) {
                return t;
            }
            return Boolean.valueOf(l(focusTargetNode, b(f), i, function1));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
