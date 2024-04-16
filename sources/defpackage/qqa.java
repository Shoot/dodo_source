package defpackage;

import defpackage.mn1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: Spacer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsm6;", "modifier", "", "a", "(Lsm6;Lqn1;I)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: qqa  reason: default package */
/* loaded from: classes.dex */
public final class qqa {
    public static final void a(sm6 sm6Var, qn1 qn1Var, int i) {
        z65.h(sm6Var, "modifier");
        qn1Var.w(-72882467);
        if (tn1.K()) {
            tn1.V(-72882467, i, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        rqa rqaVar = rqa.a;
        qn1Var.w(-1323940314);
        int a = jn1.a(qn1Var, 0);
        po1 n = qn1Var.n();
        mn1.a aVar = mn1.G;
        Function0<mn1> a2 = aVar.a();
        y84<sna<mn1>, qn1, Integer, Unit> a3 = xm5.a(sm6Var);
        int i2 = (((((i << 3) & 112) | 384) << 9) & 7168) | 6;
        if (!(qn1Var.h() instanceof wp)) {
            jn1.b();
        }
        qn1Var.B();
        if (qn1Var.e()) {
            qn1Var.D(a2);
        } else {
            qn1Var.o();
        }
        qn1 a4 = srb.a(qn1Var);
        srb.b(a4, rqaVar, aVar.c());
        srb.b(a4, n, aVar.e());
        Function2<mn1, Integer, Unit> b = aVar.b();
        if (a4.e() || !z65.c(a4.x(), Integer.valueOf(a))) {
            a4.p(Integer.valueOf(a));
            a4.l(Integer.valueOf(a), b);
        }
        a3.invoke(sna.a(sna.b(qn1Var)), qn1Var, Integer.valueOf((i2 >> 3) & 112));
        qn1Var.w(2058660585);
        qn1Var.J();
        qn1Var.r();
        qn1Var.J();
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
    }
}
