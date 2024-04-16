package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.focus.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010:\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n09\u0012\u0004\u0012\u00020\n08¢\u0006\u0004\b;\u0010<J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001fH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010!H\u0016R\"\u0010)\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u001a\u00101\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\"\u00107\u001a\u0002028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001e\u00103\u001a\u0004\b4\u00105\"\u0004\b#\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Lf24;", "Lzt2;", "Lsm6$c;", "q", "Landroidx/compose/ui/focus/b;", "focusDirection", "", "r", "(I)Z", "", "b", "k", "force", Image.TYPE_MEDIUM, "refreshFocusEvents", com.huawei.hms.opendevice.c.a, com.huawei.hms.push.e.a, "Lbf5;", "keyEvent", "n", "(Landroid/view/KeyEvent;)Z", "f", "Lfo9;", "event", "l", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "g", "Lu14;", DateTokenConverter.CONVERTER_KEY, "Lg24;", "j", "Lk99;", "i", "a", "Landroidx/compose/ui/focus/FocusTargetNode;", "p", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "rootFocusNode", "Lz14;", "Lz14;", "focusInvalidationManager", "Lsm6;", "Lsm6;", Image.TYPE_HIGH, "()Lsm6;", "modifier", "Lqm5;", "Lqm5;", "o", "()Lqm5;", "(Lqm5;)V", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/Function0;", "onRequestApplyChangesListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements f24 {
    private FocusTargetNode a;
    private final z14 b;
    private final sm6 c;
    public qm5 d;

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[x32.values().length];
            try {
                iArr[x32.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x32.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x32.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x32.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[l24.values().length];
            try {
                iArr2[l24.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[l24.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[l24.Captured.ordinal()] = 3;
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
    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "destination", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<FocusTargetNode, Boolean> {
        final /* synthetic */ FocusTargetNode a;
        final /* synthetic */ int b;
        final /* synthetic */ aa9 c;

        /* compiled from: FocusOwnerImpl.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[x32.values().length];
                try {
                    iArr[x32.Redirected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x32.Cancelled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x32.RedirectCancelled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[x32.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, int i, aa9 aa9Var) {
            super(1);
            this.a = focusTargetNode;
            this.b = i;
            this.c = aa9Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            sm6.c cVar;
            boolean z;
            mz6 e0;
            z65.h(focusTargetNode, "destination");
            if (z65.c(focusTargetNode, this.a)) {
                return Boolean.FALSE;
            }
            int a2 = qz6.a(1024);
            if (focusTargetNode.I().M0()) {
                sm6.c J0 = focusTargetNode.I().J0();
                en5 i = au2.i(focusTargetNode);
                loop0: while (true) {
                    cVar = null;
                    z = true;
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
                    int i3 = a.$EnumSwitchMapping$0[i.h(focusTargetNode, this.b).ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            if (i3 == 4) {
                                z = i.i(focusTargetNode);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            this.c.a = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
    }

    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1) {
        z65.h(function1, "onRequestApplyChangesListener");
        this.a = new FocusTargetNode();
        this.b = new z14(function1);
        this.c = new fn6<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return FocusOwnerImpl.this.p().hashCode();
            }

            @Override // defpackage.fn6
            /* renamed from: t */
            public FocusTargetNode o() {
                return FocusOwnerImpl.this.p();
            }

            @Override // defpackage.fn6
            /* renamed from: u */
            public void s(FocusTargetNode focusTargetNode) {
                z65.h(focusTargetNode, "node");
            }
        };
    }

    private final sm6.c q(zt2 zt2Var) {
        int a2 = qz6.a(1024) | qz6.a(8192);
        if (zt2Var.I().M0()) {
            sm6.c I = zt2Var.I();
            sm6.c cVar = null;
            if ((I.C0() & a2) != 0) {
                for (sm6.c D0 = I.D0(); D0 != null; D0 = D0.D0()) {
                    if ((D0.H0() & a2) != 0) {
                        if ((qz6.a(1024) & D0.H0()) != 0) {
                            return cVar;
                        }
                        cVar = D0;
                    }
                }
            }
            return cVar;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    private final boolean r(int i) {
        if (this.a.l1().k() && !this.a.l1().a()) {
            b.a aVar = androidx.compose.ui.focus.b.b;
            if (androidx.compose.ui.focus.b.l(i, aVar.e()) || androidx.compose.ui.focus.b.l(i, aVar.f())) {
                m(false);
                if (!this.a.l1().a()) {
                    return false;
                }
                return e(i);
            }
        }
        return false;
    }

    @Override // defpackage.f24
    public void a(qm5 qm5Var) {
        z65.h(qm5Var, "<set-?>");
        this.d = qm5Var;
    }

    @Override // defpackage.f24
    public void b() {
        if (this.a.l1() == l24.Inactive) {
            this.a.o1(l24.Active);
        }
    }

    @Override // defpackage.f24
    public void c(boolean z, boolean z2) {
        l24 l24Var;
        if (!z) {
            int i = a.$EnumSwitchMapping$0[i.e(this.a, androidx.compose.ui.focus.b.b.c()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return;
            }
        }
        l24 l1 = this.a.l1();
        if (i.c(this.a, z, z2)) {
            FocusTargetNode focusTargetNode = this.a;
            int i2 = a.$EnumSwitchMapping$1[l1.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    l24Var = l24.Inactive;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                l24Var = l24.Active;
            }
            focusTargetNode.o1(l24Var);
        }
    }

    @Override // defpackage.f24
    public void d(u14 u14Var) {
        z65.h(u14Var, "node");
        this.b.d(u14Var);
    }

    @Override // defpackage.b24
    public boolean e(int i) {
        FocusTargetNode b2 = j.b(this.a);
        if (b2 == null) {
            return false;
        }
        g a2 = j.a(b2, i, o());
        g.a aVar = g.b;
        if (a2 != aVar.b()) {
            if (a2 == aVar.a() || !a2.c()) {
                return false;
            }
            return true;
        }
        aa9 aa9Var = new aa9();
        boolean e = j.e(this.a, i, o(), new b(b2, i, aa9Var));
        if (aa9Var.a) {
            return false;
        }
        if (!e && !r(i)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.f24
    public boolean f(KeyEvent keyEvent) {
        gqa gqaVar;
        int i;
        mz6 e0;
        sm6.c cVar;
        mz6 e02;
        z65.h(keyEvent, "keyEvent");
        FocusTargetNode b2 = j.b(this.a);
        if (b2 != null) {
            int a2 = qz6.a(131072);
            if (b2.I().M0()) {
                sm6.c J0 = b2.I().J0();
                en5 i2 = au2.i(b2);
                loop0: while (true) {
                    if (i2 != null) {
                        if ((i2.e0().k().C0() & a2) != 0) {
                            while (J0 != null) {
                                if ((J0.H0() & a2) != 0) {
                                    gr6 gr6Var = null;
                                    cVar = J0;
                                    while (cVar != null) {
                                        if (cVar instanceof gqa) {
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
                        if (i2 != null && (e02 = i2.e0()) != null) {
                            J0 = e02.o();
                        } else {
                            J0 = null;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                gqaVar = (gqa) cVar;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            gqaVar = null;
        }
        if (gqaVar != null) {
            int a3 = qz6.a(131072);
            if (gqaVar.I().M0()) {
                sm6.c J02 = gqaVar.I().J0();
                en5 i4 = au2.i(gqaVar);
                ArrayList arrayList = null;
                while (i4 != null) {
                    if ((i4.e0().k().C0() & a3) != 0) {
                        while (J02 != null) {
                            if ((J02.H0() & a3) != 0) {
                                sm6.c cVar2 = J02;
                                gr6 gr6Var2 = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof gqa) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVar2);
                                    } else if ((cVar2.H0() & a3) != 0 && (cVar2 instanceof fu2)) {
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
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i6 = i - 1;
                        if (((gqa) arrayList.get(i)).u(keyEvent)) {
                            return true;
                        }
                        if (i6 < 0) {
                            break;
                        }
                        i = i6;
                    }
                }
                sm6.c I = gqaVar.I();
                gr6 gr6Var3 = null;
                while (I != null) {
                    if (I instanceof gqa) {
                        if (((gqa) I).u(keyEvent)) {
                            return true;
                        }
                    } else if ((I.H0() & a3) != 0 && (I instanceof fu2)) {
                        int i7 = 0;
                        for (sm6.c g13 = ((fu2) I).g1(); g13 != null; g13 = g13.D0()) {
                            if ((g13.H0() & a3) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    I = g13;
                                } else {
                                    if (gr6Var3 == null) {
                                        gr6Var3 = new gr6(new sm6.c[16], 0);
                                    }
                                    if (I != null) {
                                        gr6Var3.b(I);
                                        I = null;
                                    }
                                    gr6Var3.b(g13);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    I = au2.g(gr6Var3);
                }
                sm6.c I2 = gqaVar.I();
                gr6 gr6Var4 = null;
                while (I2 != null) {
                    if (I2 instanceof gqa) {
                        if (((gqa) I2).G(keyEvent)) {
                            return true;
                        }
                    } else if ((I2.H0() & a3) != 0 && (I2 instanceof fu2)) {
                        int i8 = 0;
                        for (sm6.c g14 = ((fu2) I2).g1(); g14 != null; g14 = g14.D0()) {
                            if ((g14.H0() & a3) != 0) {
                                i8++;
                                if (i8 == 1) {
                                    I2 = g14;
                                } else {
                                    if (gr6Var4 == null) {
                                        gr6Var4 = new gr6(new sm6.c[16], 0);
                                    }
                                    if (I2 != null) {
                                        gr6Var4.b(I2);
                                        I2 = null;
                                    }
                                    gr6Var4.b(g14);
                                }
                            }
                        }
                        if (i8 == 1) {
                        }
                    }
                    I2 = au2.g(gr6Var4);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        if (((gqa) arrayList.get(i9)).G(keyEvent)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // defpackage.f24
    public void g(FocusTargetNode focusTargetNode) {
        z65.h(focusTargetNode, "node");
        this.b.f(focusTargetNode);
    }

    @Override // defpackage.f24
    public sm6 h() {
        return this.c;
    }

    @Override // defpackage.f24
    public k99 i() {
        FocusTargetNode b2 = j.b(this.a);
        if (b2 != null) {
            return j.d(b2);
        }
        return null;
    }

    @Override // defpackage.f24
    public void j(g24 g24Var) {
        z65.h(g24Var, "node");
        this.b.e(g24Var);
    }

    @Override // defpackage.f24
    public void k() {
        i.c(this.a, true, true);
    }

    @Override // defpackage.f24
    public boolean l(fo9 fo9Var) {
        eo9 eo9Var;
        int i;
        mz6 e0;
        sm6.c cVar;
        mz6 e02;
        z65.h(fo9Var, "event");
        FocusTargetNode b2 = j.b(this.a);
        if (b2 != null) {
            int a2 = qz6.a(16384);
            if (b2.I().M0()) {
                sm6.c J0 = b2.I().J0();
                en5 i2 = au2.i(b2);
                loop0: while (true) {
                    if (i2 != null) {
                        if ((i2.e0().k().C0() & a2) != 0) {
                            while (J0 != null) {
                                if ((J0.H0() & a2) != 0) {
                                    gr6 gr6Var = null;
                                    cVar = J0;
                                    while (cVar != null) {
                                        if (cVar instanceof eo9) {
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
                        if (i2 != null && (e02 = i2.e0()) != null) {
                            J0 = e02.o();
                        } else {
                            J0 = null;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                eo9Var = (eo9) cVar;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            eo9Var = null;
        }
        if (eo9Var != null) {
            int a3 = qz6.a(16384);
            if (eo9Var.I().M0()) {
                sm6.c J02 = eo9Var.I().J0();
                en5 i4 = au2.i(eo9Var);
                ArrayList arrayList = null;
                while (i4 != null) {
                    if ((i4.e0().k().C0() & a3) != 0) {
                        while (J02 != null) {
                            if ((J02.H0() & a3) != 0) {
                                sm6.c cVar2 = J02;
                                gr6 gr6Var2 = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof eo9) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVar2);
                                    } else if ((cVar2.H0() & a3) != 0 && (cVar2 instanceof fu2)) {
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
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i6 = i - 1;
                        if (((eo9) arrayList.get(i)).F(fo9Var)) {
                            return true;
                        }
                        if (i6 < 0) {
                            break;
                        }
                        i = i6;
                    }
                }
                sm6.c I = eo9Var.I();
                gr6 gr6Var3 = null;
                while (I != null) {
                    if (I instanceof eo9) {
                        if (((eo9) I).F(fo9Var)) {
                            return true;
                        }
                    } else if ((I.H0() & a3) != 0 && (I instanceof fu2)) {
                        int i7 = 0;
                        for (sm6.c g13 = ((fu2) I).g1(); g13 != null; g13 = g13.D0()) {
                            if ((g13.H0() & a3) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    I = g13;
                                } else {
                                    if (gr6Var3 == null) {
                                        gr6Var3 = new gr6(new sm6.c[16], 0);
                                    }
                                    if (I != null) {
                                        gr6Var3.b(I);
                                        I = null;
                                    }
                                    gr6Var3.b(g13);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    I = au2.g(gr6Var3);
                }
                sm6.c I2 = eo9Var.I();
                gr6 gr6Var4 = null;
                while (I2 != null) {
                    if (I2 instanceof eo9) {
                        if (((eo9) I2).V(fo9Var)) {
                            return true;
                        }
                    } else if ((I2.H0() & a3) != 0 && (I2 instanceof fu2)) {
                        int i8 = 0;
                        for (sm6.c g14 = ((fu2) I2).g1(); g14 != null; g14 = g14.D0()) {
                            if ((g14.H0() & a3) != 0) {
                                i8++;
                                if (i8 == 1) {
                                    I2 = g14;
                                } else {
                                    if (gr6Var4 == null) {
                                        gr6Var4 = new gr6(new sm6.c[16], 0);
                                    }
                                    if (I2 != null) {
                                        gr6Var4.b(I2);
                                        I2 = null;
                                    }
                                    gr6Var4.b(g14);
                                }
                            }
                        }
                        if (i8 == 1) {
                        }
                    }
                    I2 = au2.g(gr6Var4);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        if (((eo9) arrayList.get(i9)).V(fo9Var)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // defpackage.b24
    public void m(boolean z) {
        c(z, true);
    }

    @Override // defpackage.f24
    public boolean n(KeyEvent keyEvent) {
        int i;
        mz6 e0;
        sm6.c cVar;
        mz6 e02;
        z65.h(keyEvent, "keyEvent");
        FocusTargetNode b2 = j.b(this.a);
        if (b2 != null) {
            sm6.c q = q(b2);
            if (q == null) {
                int a2 = qz6.a(8192);
                if (b2.I().M0()) {
                    sm6.c J0 = b2.I().J0();
                    en5 i2 = au2.i(b2);
                    loop0: while (true) {
                        if (i2 != null) {
                            if ((i2.e0().k().C0() & a2) != 0) {
                                while (J0 != null) {
                                    if ((J0.H0() & a2) != 0) {
                                        gr6 gr6Var = null;
                                        cVar = J0;
                                        while (cVar != null) {
                                            if (cVar instanceof hf5) {
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
                            if (i2 != null && (e02 = i2.e0()) != null) {
                                J0 = e02.o();
                            } else {
                                J0 = null;
                            }
                        } else {
                            cVar = null;
                            break;
                        }
                    }
                    hf5 hf5Var = (hf5) cVar;
                    if (hf5Var != null) {
                        q = hf5Var.I();
                    } else {
                        q = null;
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            if (q != null) {
                int a3 = qz6.a(8192);
                if (q.I().M0()) {
                    sm6.c J02 = q.I().J0();
                    en5 i4 = au2.i(q);
                    ArrayList arrayList = null;
                    while (i4 != null) {
                        if ((i4.e0().k().C0() & a3) != 0) {
                            while (J02 != null) {
                                if ((J02.H0() & a3) != 0) {
                                    sm6.c cVar2 = J02;
                                    gr6 gr6Var2 = null;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof hf5) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(cVar2);
                                        } else if ((cVar2.H0() & a3) != 0 && (cVar2 instanceof fu2)) {
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
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i6 = i - 1;
                            if (((hf5) arrayList.get(i)).W(keyEvent)) {
                                return true;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            i = i6;
                        }
                    }
                    sm6.c I = q.I();
                    gr6 gr6Var3 = null;
                    while (I != null) {
                        if (I instanceof hf5) {
                            if (((hf5) I).W(keyEvent)) {
                                return true;
                            }
                        } else if ((I.H0() & a3) != 0 && (I instanceof fu2)) {
                            int i7 = 0;
                            for (sm6.c g13 = ((fu2) I).g1(); g13 != null; g13 = g13.D0()) {
                                if ((g13.H0() & a3) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        I = g13;
                                    } else {
                                        if (gr6Var3 == null) {
                                            gr6Var3 = new gr6(new sm6.c[16], 0);
                                        }
                                        if (I != null) {
                                            gr6Var3.b(I);
                                            I = null;
                                        }
                                        gr6Var3.b(g13);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        I = au2.g(gr6Var3);
                    }
                    sm6.c I2 = q.I();
                    gr6 gr6Var4 = null;
                    while (I2 != null) {
                        if (I2 instanceof hf5) {
                            if (((hf5) I2).f0(keyEvent)) {
                                return true;
                            }
                        } else if ((I2.H0() & a3) != 0 && (I2 instanceof fu2)) {
                            int i8 = 0;
                            for (sm6.c g14 = ((fu2) I2).g1(); g14 != null; g14 = g14.D0()) {
                                if ((g14.H0() & a3) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        I2 = g14;
                                    } else {
                                        if (gr6Var4 == null) {
                                            gr6Var4 = new gr6(new sm6.c[16], 0);
                                        }
                                        if (I2 != null) {
                                            gr6Var4.b(I2);
                                            I2 = null;
                                        }
                                        gr6Var4.b(g14);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        I2 = au2.g(gr6Var4);
                    }
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            if (((hf5) arrayList.get(i9)).f0(keyEvent)) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    public qm5 o() {
        qm5 qm5Var = this.d;
        if (qm5Var != null) {
            return qm5Var;
        }
        z65.z("layoutDirection");
        return null;
    }

    public final FocusTargetNode p() {
        return this.a;
    }
}
