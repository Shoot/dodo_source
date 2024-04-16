package androidx.compose.ui.focus;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: FocusTargetNode.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\"B\u0007¢\u0006\u0004\b!\u0010\fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R(\u0010\u001c\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "Lk67;", "Lan6;", "Lsm6$c;", "", "L", "R0", "Landroidx/compose/ui/focus/e;", "j1", "()Landroidx/compose/ui/focus/e;", "m1", "()V", "n1", "", "n", "Z", "isProcessingCustomExit", "o", "isProcessingCustomEnter", "Ll24;", "p", "Ll24;", "l1", "()Ll24;", "o1", "(Ll24;)V", "getFocusState$annotations", "focusState", "Lva0;", "k1", "()Lva0;", "beyondBoundsLayoutParent", "<init>", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusTargetNode extends sm6.c implements zt2, k67, an6 {
    private boolean n;
    private boolean o;
    private l24 p = l24.Inactive;

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Lfn6;", "Landroidx/compose/ui/focus/FocusTargetNode;", "t", "node", "", "u", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends fn6<FocusTargetNode> {
        public static final FocusTargetElement c = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // defpackage.fn6
        /* renamed from: t */
        public FocusTargetNode o() {
            return new FocusTargetNode();
        }

        @Override // defpackage.fn6
        /* renamed from: u */
        public void s(FocusTargetNode focusTargetNode) {
            z65.h(focusTargetNode, "node");
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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
                iArr[l24.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l24.ActiveParent.ordinal()] = 3;
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
    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ ea9<e> a;
        final /* synthetic */ FocusTargetNode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ea9<e> ea9Var, FocusTargetNode focusTargetNode) {
            super(0);
            this.a = ea9Var;
            this.b = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.focus.e, T] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.a = this.b.j1();
        }
    }

    @Override // defpackage.an6
    public /* synthetic */ ym6 D() {
        return zm6.b(this);
    }

    @Override // defpackage.dn6
    public /* synthetic */ Object E(um6 um6Var) {
        return zm6.a(this, um6Var);
    }

    @Override // defpackage.k67
    public void L() {
        l24 l1 = l1();
        m1();
        if (l1 != l1()) {
            v14.c(this);
        }
    }

    @Override // defpackage.sm6.c
    public void R0() {
        int i = a.$EnumSwitchMapping$0[l1().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    n1();
                    return;
                }
                return;
            }
            n1();
            o1(l24.Inactive);
            return;
        }
        au2.j(this).getFocusOwner().m(true);
    }

    public final e j1() {
        mz6 e0;
        f fVar = new f();
        int a2 = qz6.a(2048);
        int a3 = qz6.a(1024);
        sm6.c I = I();
        int i = a2 | a3;
        if (I().M0()) {
            sm6.c I2 = I();
            en5 i2 = au2.i(this);
            loop0: while (i2 != null) {
                if ((i2.e0().k().C0() & i) != 0) {
                    while (I2 != null) {
                        if ((I2.H0() & i) != 0) {
                            if (I2 != I && (I2.H0() & a3) != 0) {
                                break loop0;
                            } else if ((I2.H0() & a2) != 0) {
                                sm6.c cVar = I2;
                                gr6 gr6Var = null;
                                while (cVar != null) {
                                    if (cVar instanceof g24) {
                                        ((g24) cVar).e0(fVar);
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
            return fVar;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final va0 k1() {
        return (va0) E(wa0.a());
    }

    public l24 l1() {
        return this.p;
    }

    public final void m1() {
        e eVar;
        int i = a.$EnumSwitchMapping$0[l1().ordinal()];
        if (i == 1 || i == 2) {
            ea9 ea9Var = new ea9();
            l67.a(this, new b(ea9Var, this));
            T t = ea9Var.a;
            if (t == 0) {
                z65.z("focusProperties");
                eVar = null;
            } else {
                eVar = (e) t;
            }
            if (!eVar.j()) {
                au2.j(this).getFocusOwner().m(true);
            }
        }
    }

    public final void n1() {
        mz6 e0;
        sm6.c I = I();
        int a2 = qz6.a(4096);
        gr6 gr6Var = null;
        while (I != null) {
            if (I instanceof u14) {
                v14.b((u14) I);
            } else if ((I.H0() & a2) != 0 && (I instanceof fu2)) {
                int i = 0;
                for (sm6.c g1 = ((fu2) I).g1(); g1 != null; g1 = g1.D0()) {
                    if ((g1.H0() & a2) != 0) {
                        i++;
                        if (i == 1) {
                            I = g1;
                        } else {
                            if (gr6Var == null) {
                                gr6Var = new gr6(new sm6.c[16], 0);
                            }
                            if (I != null) {
                                gr6Var.b(I);
                                I = null;
                            }
                            gr6Var.b(g1);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            I = au2.g(gr6Var);
        }
        int a3 = qz6.a(4096) | qz6.a(1024);
        if (I().M0()) {
            sm6.c J0 = I().J0();
            en5 i2 = au2.i(this);
            while (i2 != null) {
                if ((i2.e0().k().C0() & a3) != 0) {
                    while (J0 != null) {
                        if ((J0.H0() & a3) != 0 && (qz6.a(1024) & J0.H0()) == 0 && J0.M0()) {
                            int a4 = qz6.a(4096);
                            gr6 gr6Var2 = null;
                            sm6.c cVar = J0;
                            while (cVar != null) {
                                if (cVar instanceof u14) {
                                    v14.b((u14) cVar);
                                } else if ((cVar.H0() & a4) != 0 && (cVar instanceof fu2)) {
                                    int i3 = 0;
                                    for (sm6.c g12 = ((fu2) cVar).g1(); g12 != null; g12 = g12.D0()) {
                                        if ((g12.H0() & a4) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                cVar = g12;
                                            } else {
                                                if (gr6Var2 == null) {
                                                    gr6Var2 = new gr6(new sm6.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    gr6Var2.b(cVar);
                                                    cVar = null;
                                                }
                                                gr6Var2.b(g12);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cVar = au2.g(gr6Var2);
                            }
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public void o1(l24 l24Var) {
        z65.h(l24Var, "<set-?>");
        this.p = l24Var;
    }
}
