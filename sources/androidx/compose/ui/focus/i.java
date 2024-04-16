package androidx.compose.ui.focus;

import androidx.compose.ui.focus.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a \u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a!\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010\u001a!\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0010\u001a!\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "j", "i", "forced", "refreshFocusEvents", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "a", "childNode", "k", "l", "Landroidx/compose/ui/focus/b;", "focusDirection", "Lx32;", Image.TYPE_HIGH, "(Landroidx/compose/ui/focus/FocusTargetNode;I)Lx32;", com.huawei.hms.push.e.a, "f", "g", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class i {

    /* compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[x32.values().length];
            try {
                iArr[x32.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x32.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x32.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x32.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[l24.values().length];
            try {
                iArr2[l24.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[l24.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[l24.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[l24.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusTransactions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ FocusTargetNode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.a = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.j1();
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode f = j.f(focusTargetNode);
        if (f != null) {
            return c(f, z, z2);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return a(focusTargetNode, z, z2);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        z65.h(focusTargetNode, "<this>");
        int i = a.$EnumSwitchMapping$1[focusTargetNode.l1().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (a(focusTargetNode, z, z2)) {
                    focusTargetNode.o1(l24.Inactive);
                    if (z2) {
                        v14.c(focusTargetNode);
                    }
                } else {
                    return false;
                }
            } else if (z) {
                focusTargetNode.o1(l24.Inactive);
                if (z2) {
                    v14.c(focusTargetNode);
                    return z;
                }
                return z;
            } else {
                return z;
            }
        } else {
            focusTargetNode.o1(l24.Inactive);
            if (z2) {
                v14.c(focusTargetNode);
            }
        }
        return true;
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        l67.a(focusTargetNode, new b(focusTargetNode));
        int i = a.$EnumSwitchMapping$1[focusTargetNode.l1().ordinal()];
        if (i == 3 || i == 4) {
            focusTargetNode.o1(l24.Active);
            return true;
        }
        return true;
    }

    public static final x32 e(FocusTargetNode focusTargetNode, int i) {
        z65.h(focusTargetNode, "$this$performCustomClearFocus");
        int i2 = a.$EnumSwitchMapping$1[focusTargetNode.l1().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    FocusTargetNode f = j.f(focusTargetNode);
                    if (f != null) {
                        x32 e = e(f, i);
                        if (e == x32.None) {
                            e = null;
                        }
                        if (e == null) {
                            return g(focusTargetNode, i);
                        }
                        return e;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                return x32.Cancelled;
            }
        }
        return x32.None;
    }

    private static final x32 f(FocusTargetNode focusTargetNode, int i) {
        boolean z;
        x32 x32Var;
        z = focusTargetNode.o;
        if (!z) {
            focusTargetNode.o = true;
            try {
                g invoke = focusTargetNode.j1().i().invoke(androidx.compose.ui.focus.b.i(i));
                g.a aVar = g.b;
                if (invoke != aVar.b()) {
                    if (invoke == aVar.a()) {
                        return x32.Cancelled;
                    }
                    if (invoke.c()) {
                        x32Var = x32.Redirected;
                    } else {
                        x32Var = x32.RedirectCancelled;
                    }
                    return x32Var;
                }
            } finally {
                focusTargetNode.o = false;
            }
        }
        return x32.None;
    }

    private static final x32 g(FocusTargetNode focusTargetNode, int i) {
        boolean z;
        x32 x32Var;
        z = focusTargetNode.n;
        if (!z) {
            focusTargetNode.n = true;
            try {
                g invoke = focusTargetNode.j1().c().invoke(androidx.compose.ui.focus.b.i(i));
                g.a aVar = g.b;
                if (invoke != aVar.b()) {
                    if (invoke == aVar.a()) {
                        return x32.Cancelled;
                    }
                    if (invoke.c()) {
                        x32Var = x32.Redirected;
                    } else {
                        x32Var = x32.RedirectCancelled;
                    }
                    return x32Var;
                }
            } finally {
                focusTargetNode.n = false;
            }
        }
        return x32.None;
    }

    public static final x32 h(FocusTargetNode focusTargetNode, int i) {
        x32 x32Var;
        FocusTargetNode focusTargetNode2;
        mz6 e0;
        z65.h(focusTargetNode, "$this$performCustomRequestFocus");
        int i2 = a.$EnumSwitchMapping$1[focusTargetNode.l1().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    int a2 = qz6.a(1024);
                    if (focusTargetNode.I().M0()) {
                        sm6.c J0 = focusTargetNode.I().J0();
                        en5 i3 = au2.i(focusTargetNode);
                        loop0: while (true) {
                            x32Var = null;
                            if (i3 != null) {
                                if ((i3.e0().k().C0() & a2) != 0) {
                                    while (J0 != null) {
                                        if ((J0.H0() & a2) != 0) {
                                            focusTargetNode2 = J0;
                                            gr6 gr6Var = null;
                                            while (focusTargetNode2 != null) {
                                                if (focusTargetNode2 instanceof FocusTargetNode) {
                                                    break loop0;
                                                }
                                                if ((focusTargetNode2.H0() & a2) != 0 && (focusTargetNode2 instanceof fu2)) {
                                                    int i4 = 0;
                                                    for (sm6.c g1 = ((fu2) focusTargetNode2).g1(); g1 != null; g1 = g1.D0()) {
                                                        if ((g1.H0() & a2) != 0) {
                                                            i4++;
                                                            if (i4 == 1) {
                                                                focusTargetNode2 = g1;
                                                            } else {
                                                                if (gr6Var == null) {
                                                                    gr6Var = new gr6(new sm6.c[16], 0);
                                                                }
                                                                if (focusTargetNode2 != null) {
                                                                    gr6Var.b(focusTargetNode2);
                                                                    focusTargetNode2 = null;
                                                                }
                                                                gr6Var.b(g1);
                                                            }
                                                        }
                                                    }
                                                    if (i4 == 1) {
                                                    }
                                                }
                                                focusTargetNode2 = au2.g(gr6Var);
                                            }
                                            continue;
                                        }
                                        J0 = J0.J0();
                                    }
                                }
                                i3 = i3.h0();
                                if (i3 != null && (e0 = i3.e0()) != null) {
                                    J0 = e0.o();
                                } else {
                                    J0 = null;
                                }
                            } else {
                                focusTargetNode2 = null;
                                break;
                            }
                        }
                        FocusTargetNode focusTargetNode3 = focusTargetNode2;
                        if (focusTargetNode3 == null) {
                            return x32.None;
                        }
                        int i5 = a.$EnumSwitchMapping$1[focusTargetNode3.l1().ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 == 4) {
                                        x32 h = h(focusTargetNode3, i);
                                        if (h != x32.None) {
                                            x32Var = h;
                                        }
                                        if (x32Var == null) {
                                            return f(focusTargetNode3, i);
                                        }
                                        return x32Var;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                return h(focusTargetNode3, i);
                            }
                            return x32.Cancelled;
                        }
                        return f(focusTargetNode3, i);
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetNode f = j.f(focusTargetNode);
            if (f != null) {
                return e(f, i);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        return x32.None;
    }

    public static final boolean i(FocusTargetNode focusTargetNode) {
        mz6 e0;
        z65.h(focusTargetNode, "<this>");
        int i = a.$EnumSwitchMapping$1[focusTargetNode.l1().ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            FocusTargetNode focusTargetNode2 = null;
            if (i != 3) {
                if (i == 4) {
                    int a2 = qz6.a(1024);
                    if (focusTargetNode.I().M0()) {
                        sm6.c J0 = focusTargetNode.I().J0();
                        en5 i2 = au2.i(focusTargetNode);
                        loop0: while (true) {
                            if (i2 == null) {
                                break;
                            }
                            if ((i2.e0().k().C0() & a2) != 0) {
                                while (J0 != null) {
                                    if ((J0.H0() & a2) != 0) {
                                        sm6.c cVar = J0;
                                        gr6 gr6Var = null;
                                        while (cVar != null) {
                                            if (cVar instanceof FocusTargetNode) {
                                                focusTargetNode2 = cVar;
                                                break loop0;
                                            }
                                            if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
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
                                        continue;
                                    }
                                    J0 = J0.J0();
                                }
                            }
                            i2 = i2.h0();
                            if (i2 != null && (e0 = i2.e0()) != null) {
                                J0 = e0.o();
                            } else {
                                J0 = null;
                            }
                        }
                        FocusTargetNode focusTargetNode3 = focusTargetNode2;
                        if (focusTargetNode3 != null) {
                            return k(focusTargetNode3, focusTargetNode);
                        }
                        z = (l(focusTargetNode) && d(focusTargetNode)) ? false : false;
                        if (z) {
                            v14.c(focusTargetNode);
                            return z;
                        }
                        return z;
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            z = (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode)) ? false : false;
            if (z) {
                v14.c(focusTargetNode);
                return z;
            }
            return z;
        }
        v14.c(focusTargetNode);
        return true;
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        z65.h(focusTargetNode, "<this>");
        int i = a.$EnumSwitchMapping$0[h(focusTargetNode, androidx.compose.ui.focus.b.b.b()).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return false;
        }
        return i(focusTargetNode);
    }

    private static final boolean k(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        boolean z;
        FocusTargetNode focusTargetNode3;
        sm6.c cVar;
        mz6 e0;
        mz6 e02;
        int a2 = qz6.a(1024);
        if (focusTargetNode2.I().M0()) {
            sm6.c J0 = focusTargetNode2.I().J0();
            en5 i = au2.i(focusTargetNode2);
            loop0: while (true) {
                z = true;
                focusTargetNode3 = null;
                if (i != null) {
                    if ((i.e0().k().C0() & a2) != 0) {
                        while (J0 != null) {
                            if ((J0.H0() & a2) != 0) {
                                cVar = J0;
                                gr6 gr6Var = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
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
                    if (i != null && (e02 = i.e0()) != null) {
                        J0 = e02.o();
                    } else {
                        J0 = null;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            if (z65.c(cVar, focusTargetNode)) {
                int i3 = a.$EnumSwitchMapping$1[focusTargetNode.l1().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return false;
                    }
                    if (i3 != 3) {
                        if (i3 == 4) {
                            int a3 = qz6.a(1024);
                            if (focusTargetNode.I().M0()) {
                                sm6.c J02 = focusTargetNode.I().J0();
                                en5 i4 = au2.i(focusTargetNode);
                                loop4: while (true) {
                                    if (i4 == null) {
                                        break;
                                    }
                                    if ((i4.e0().k().C0() & a3) != 0) {
                                        while (J02 != null) {
                                            if ((J02.H0() & a3) != 0) {
                                                sm6.c cVar2 = J02;
                                                gr6 gr6Var2 = null;
                                                while (cVar2 != null) {
                                                    if (cVar2 instanceof FocusTargetNode) {
                                                        focusTargetNode3 = cVar2;
                                                        break loop4;
                                                    }
                                                    if ((cVar2.H0() & a3) != 0 && (cVar2 instanceof fu2)) {
                                                        int i5 = 0;
                                                        for (sm6.c g12 = ((fu2) cVar2).g1(); g12 != null; g12 = g12.D0()) {
                                                            if ((g12.H0() & a3) != 0) {
                                                                i5++;
                                                                if (i5 == 1) {
                                                                    cVar2 = g12;
                                                                } else {
                                                                    if (gr6Var2 == null) {
                                                                        gr6Var2 = new gr6(new sm6.c[16], 0);
                                                                    }
                                                                    if (cVar2 != null) {
                                                                        gr6Var2.b(cVar2);
                                                                        cVar2 = null;
                                                                    }
                                                                    gr6Var2.b(g12);
                                                                }
                                                            }
                                                        }
                                                        if (i5 == 1) {
                                                        }
                                                    }
                                                    cVar2 = au2.g(gr6Var2);
                                                }
                                                continue;
                                            }
                                            J02 = J02.J0();
                                        }
                                    }
                                    i4 = i4.h0();
                                    if (i4 != null && (e0 = i4.e0()) != null) {
                                        J02 = e0.o();
                                    } else {
                                        J02 = null;
                                    }
                                }
                                FocusTargetNode focusTargetNode4 = focusTargetNode3;
                                if (focusTargetNode4 == null && l(focusTargetNode)) {
                                    focusTargetNode.o1(l24.Active);
                                    v14.c(focusTargetNode);
                                    return k(focusTargetNode, focusTargetNode2);
                                } else if (focusTargetNode4 == null || !k(focusTargetNode4, focusTargetNode)) {
                                    return false;
                                } else {
                                    boolean k = k(focusTargetNode, focusTargetNode2);
                                    if (focusTargetNode.l1() != l24.ActiveParent) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                    return k;
                                }
                            }
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                        throw new NoWhenBranchMatchedException();
                    } else if (j.f(focusTargetNode) != null) {
                        z = (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) ? false : false;
                        if (z) {
                            v14.c(focusTargetNode2);
                        }
                        return z;
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                boolean d = d(focusTargetNode2);
                if (d) {
                    focusTargetNode.o1(l24.ActiveParent);
                    v14.c(focusTargetNode2);
                    v14.c(focusTargetNode);
                    return d;
                }
                return d;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    private static final boolean l(FocusTargetNode focusTargetNode) {
        en5 L0;
        um7 g0;
        oz6 E0 = focusTargetNode.E0();
        if (E0 != null && (L0 = E0.L0()) != null && (g0 = L0.g0()) != null) {
            return g0.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
