package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sm6;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: FocusInvalidationManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\fR&\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001d"}, d2 = {"Lz14;", "", "T", "", "node", "", "g", "(Ljava/util/Set;Ljava/lang/Object;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "f", "Lu14;", DateTokenConverter.CONVERTER_KEY, "Lg24;", e.a, "Lkotlin/Function1;", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function1;", "onRequestApplyChangesListener", "b", "Ljava/util/Set;", "focusTargetNodes", c.a, "focusEventNodes", "focusPropertiesNodes", "Lkotlin/jvm/functions/Function0;", "invalidateNodes", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: z14  reason: default package */
/* loaded from: classes.dex */
public final class z14 {
    private final Function1<Function0<Unit>, Unit> a;
    private Set<FocusTargetNode> b;
    private Set<u14> c;
    private Set<g24> d;
    private final Function0<Unit> e;

    /* compiled from: FocusInvalidationManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: z14$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k24 k24Var;
            z14 z14Var = z14.this;
            Iterator it = z14.this.d.iterator();
            while (true) {
                int i = 1024;
                int i2 = 16;
                int i3 = 0;
                int i4 = 1;
                if (!it.hasNext()) {
                    z14.this.d.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    z14 z14Var2 = z14.this;
                    for (u14 u14Var : z14.this.c) {
                        if (!u14Var.I().M0()) {
                            u14Var.r(l24.Inactive);
                        } else {
                            int a = qz6.a(i);
                            sm6.c I = u14Var.I();
                            FocusTargetNode focusTargetNode = null;
                            gr6 gr6Var = null;
                            boolean z = true;
                            boolean z2 = false;
                            while (I != null) {
                                if (I instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) I;
                                    if (focusTargetNode != null) {
                                        z2 = true;
                                    }
                                    if (z14Var2.b.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        z = false;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if ((I.H0() & a) != 0 && (I instanceof fu2)) {
                                    sm6.c g1 = ((fu2) I).g1();
                                    int i5 = 0;
                                    while (g1 != null) {
                                        if ((g1.H0() & a) != 0) {
                                            i5++;
                                            if (i5 == i4) {
                                                I = g1;
                                            } else {
                                                if (gr6Var == null) {
                                                    gr6Var = new gr6(new sm6.c[i2], i3);
                                                }
                                                if (I != null) {
                                                    gr6Var.b(I);
                                                    I = null;
                                                }
                                                gr6Var.b(g1);
                                            }
                                        }
                                        g1 = g1.D0();
                                        i4 = 1;
                                    }
                                    if (i5 == 1) {
                                        i4 = 1;
                                    }
                                }
                                I = au2.g(gr6Var);
                                i4 = 1;
                            }
                            if (u14Var.I().M0()) {
                                gr6 gr6Var2 = new gr6(new sm6.c[i2], i3);
                                sm6.c D0 = u14Var.I().D0();
                                if (D0 == null) {
                                    au2.c(gr6Var2, u14Var.I());
                                } else {
                                    gr6Var2.b(D0);
                                }
                                while (gr6Var2.v()) {
                                    sm6.c cVar = (sm6.c) gr6Var2.z(gr6Var2.s() - 1);
                                    if ((cVar.C0() & a) == 0) {
                                        au2.c(gr6Var2, cVar);
                                    } else {
                                        while (cVar != null) {
                                            if ((cVar.H0() & a) != 0) {
                                                gr6 gr6Var3 = null;
                                                while (cVar != null) {
                                                    if (cVar instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                                                        if (focusTargetNode != null) {
                                                            z2 = true;
                                                        }
                                                        if (z14Var2.b.contains(focusTargetNode3)) {
                                                            linkedHashSet.add(focusTargetNode3);
                                                            z = false;
                                                        }
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                                                        sm6.c g12 = ((fu2) cVar).g1();
                                                        int i6 = 0;
                                                        while (g12 != null) {
                                                            if ((g12.H0() & a) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    cVar = g12;
                                                                } else {
                                                                    if (gr6Var3 == null) {
                                                                        gr6Var3 = new gr6(new sm6.c[i2], 0);
                                                                    }
                                                                    if (cVar != null) {
                                                                        gr6Var3.b(cVar);
                                                                        cVar = null;
                                                                    }
                                                                    gr6Var3.b(g12);
                                                                    g12 = g12.D0();
                                                                    i2 = 16;
                                                                }
                                                            }
                                                            g12 = g12.D0();
                                                            i2 = 16;
                                                        }
                                                        if (i6 == 1) {
                                                            i2 = 16;
                                                        }
                                                        cVar = au2.g(gr6Var3);
                                                        i2 = 16;
                                                    }
                                                    cVar = au2.g(gr6Var3);
                                                    i2 = 16;
                                                }
                                            } else {
                                                cVar = cVar.D0();
                                                i2 = 16;
                                            }
                                        }
                                    }
                                    i2 = 16;
                                }
                                if (z) {
                                    if (z2) {
                                        k24Var = v14.a(u14Var);
                                    } else if (focusTargetNode == null || (k24Var = focusTargetNode.l1()) == null) {
                                        k24Var = l24.Inactive;
                                    }
                                    u14Var.r(k24Var);
                                }
                            } else {
                                throw new IllegalStateException("visitChildren called on an unattached node".toString());
                            }
                        }
                        i = 1024;
                        i2 = 16;
                        i3 = 0;
                        i4 = 1;
                    }
                    z14.this.c.clear();
                    for (FocusTargetNode focusTargetNode4 : z14.this.b) {
                        if (focusTargetNode4.M0()) {
                            l24 l1 = focusTargetNode4.l1();
                            focusTargetNode4.m1();
                            if (l1 != focusTargetNode4.l1() || linkedHashSet.contains(focusTargetNode4)) {
                                v14.c(focusTargetNode4);
                            }
                        }
                    }
                    z14.this.b.clear();
                    linkedHashSet.clear();
                    if (z14.this.d.isEmpty()) {
                        if (z14.this.c.isEmpty()) {
                            if (!z14.this.b.isEmpty()) {
                                throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                            }
                            return;
                        }
                        throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                    }
                    throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                }
                g24 g24Var = (g24) it.next();
                if (g24Var.I().M0()) {
                    int a2 = qz6.a(1024);
                    sm6.c I2 = g24Var.I();
                    gr6 gr6Var4 = null;
                    while (I2 != null) {
                        if (I2 instanceof FocusTargetNode) {
                            z14Var.b.add((FocusTargetNode) I2);
                        } else if ((I2.H0() & a2) != 0 && (I2 instanceof fu2)) {
                            int i7 = 0;
                            for (sm6.c g13 = ((fu2) I2).g1(); g13 != null; g13 = g13.D0()) {
                                if ((g13.H0() & a2) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        I2 = g13;
                                    } else {
                                        if (gr6Var4 == null) {
                                            gr6Var4 = new gr6(new sm6.c[16], 0);
                                        }
                                        if (I2 != null) {
                                            gr6Var4.b(I2);
                                            I2 = null;
                                        }
                                        gr6Var4.b(g13);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        I2 = au2.g(gr6Var4);
                    }
                    if (g24Var.I().M0()) {
                        gr6 gr6Var5 = new gr6(new sm6.c[16], 0);
                        sm6.c D02 = g24Var.I().D0();
                        if (D02 == null) {
                            au2.c(gr6Var5, g24Var.I());
                        } else {
                            gr6Var5.b(D02);
                        }
                        while (gr6Var5.v()) {
                            sm6.c cVar2 = (sm6.c) gr6Var5.z(gr6Var5.s() - 1);
                            if ((cVar2.C0() & a2) == 0) {
                                au2.c(gr6Var5, cVar2);
                            } else {
                                while (true) {
                                    if (cVar2 == null) {
                                        break;
                                    } else if ((cVar2.H0() & a2) != 0) {
                                        gr6 gr6Var6 = null;
                                        while (cVar2 != null) {
                                            if (cVar2 instanceof FocusTargetNode) {
                                                z14Var.b.add((FocusTargetNode) cVar2);
                                            } else if ((cVar2.H0() & a2) != 0 && (cVar2 instanceof fu2)) {
                                                int i8 = 0;
                                                for (sm6.c g14 = ((fu2) cVar2).g1(); g14 != null; g14 = g14.D0()) {
                                                    if ((g14.H0() & a2) != 0) {
                                                        i8++;
                                                        if (i8 == 1) {
                                                            cVar2 = g14;
                                                        } else {
                                                            if (gr6Var6 == null) {
                                                                gr6Var6 = new gr6(new sm6.c[16], 0);
                                                            }
                                                            if (cVar2 != null) {
                                                                gr6Var6.b(cVar2);
                                                                cVar2 = null;
                                                            }
                                                            gr6Var6.b(g14);
                                                        }
                                                    }
                                                }
                                                if (i8 == 1) {
                                                }
                                            }
                                            cVar2 = au2.g(gr6Var6);
                                        }
                                    } else {
                                        cVar2 = cVar2.D0();
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z14(Function1<? super Function0<Unit>, Unit> function1) {
        z65.h(function1, "onRequestApplyChangesListener");
        this.a = function1;
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new a();
    }

    private final <T> void g(Set<T> set, T t) {
        if (set.add(t) && this.b.size() + this.c.size() + this.d.size() == 1) {
            this.a.invoke(this.e);
        }
    }

    public final void d(u14 u14Var) {
        z65.h(u14Var, "node");
        g(this.c, u14Var);
    }

    public final void e(g24 g24Var) {
        z65.h(g24Var, "node");
        g(this.d, g24Var);
    }

    public final void f(FocusTargetNode focusTargetNode) {
        z65.h(focusTargetNode, "node");
        g(this.b, focusTargetNode);
    }
}
