package androidx.compose.ui.focus;

import androidx.compose.ui.focus.b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.sm6;
import defpackage.va0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "Lva0$a;", "block", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class a {
    public static final <T> T a(FocusTargetNode focusTargetNode, int i, Function1<? super va0.a, ? extends T> function1) {
        FocusTargetNode focusTargetNode2;
        va0 k1;
        int c;
        mz6 e0;
        z65.h(focusTargetNode, "$this$searchBeyondBounds");
        z65.h(function1, "block");
        int a = qz6.a(1024);
        if (focusTargetNode.I().M0()) {
            sm6.c J0 = focusTargetNode.I().J0();
            en5 i2 = au2.i(focusTargetNode);
            loop0: while (true) {
                if (i2 != null) {
                    if ((i2.e0().k().C0() & a) != 0) {
                        while (J0 != null) {
                            if ((J0.H0() & a) != 0) {
                                focusTargetNode2 = J0;
                                gr6 gr6Var = null;
                                while (focusTargetNode2 != null) {
                                    if (focusTargetNode2 instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((focusTargetNode2.H0() & a) != 0 && (focusTargetNode2 instanceof fu2)) {
                                        int i3 = 0;
                                        for (sm6.c g1 = ((fu2) focusTargetNode2).g1(); g1 != null; g1 = g1.D0()) {
                                            if ((g1.H0() & a) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        if (i3 == 1) {
                                        }
                                    }
                                    focusTargetNode2 = au2.g(gr6Var);
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
                } else {
                    focusTargetNode2 = null;
                    break;
                }
            }
            FocusTargetNode focusTargetNode3 = focusTargetNode2;
            if ((focusTargetNode3 != null && z65.c(focusTargetNode3.k1(), focusTargetNode.k1())) || (k1 = focusTargetNode.k1()) == null) {
                return null;
            }
            b.a aVar = b.b;
            if (b.l(i, aVar.h())) {
                c = va0.b.a.a();
            } else if (b.l(i, aVar.a())) {
                c = va0.b.a.d();
            } else if (b.l(i, aVar.d())) {
                c = va0.b.a.e();
            } else if (b.l(i, aVar.g())) {
                c = va0.b.a.f();
            } else if (b.l(i, aVar.e())) {
                c = va0.b.a.b();
            } else if (b.l(i, aVar.f())) {
                c = va0.b.a.c();
            } else {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            return (T) k1.a(c, function1);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
