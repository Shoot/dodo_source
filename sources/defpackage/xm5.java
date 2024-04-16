package defpackage;

import defpackage.mn1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Layout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lsm6;", "modifier", "Lkotlin/Function1;", "Lsna;", "Lmn1;", "", "a", "(Lsm6;)Ly84;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: xm5  reason: default package */
/* loaded from: classes.dex */
public final class xm5 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsna;", "Lmn1;", "", "a", "(Lqn1;Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: xm5$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements y84<sna<mn1>, qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sm6 sm6Var) {
            super(3);
            this.a = sm6Var;
        }

        public final void a(qn1 qn1Var, qn1 qn1Var2, int i) {
            z65.h(qn1Var, "$this$null");
            if (tn1.K()) {
                tn1.V(-1586257396, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:201)");
            }
            int a = jn1.a(qn1Var2, 0);
            sm6 b = pn1.b(qn1Var2, this.a);
            qn1Var.w(509942095);
            qn1 a2 = srb.a(qn1Var);
            mn1.a aVar = mn1.G;
            srb.b(a2, b, aVar.d());
            Function2<mn1, Integer, Unit> b2 = aVar.b();
            if (a2.e() || !z65.c(a2.x(), Integer.valueOf(a))) {
                a2.p(Integer.valueOf(a));
                a2.l(Integer.valueOf(a), b2);
            }
            qn1Var.J();
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(sna<mn1> snaVar, qn1 qn1Var, Integer num) {
            a(snaVar.f(), qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final y84<sna<mn1>, qn1, Integer, Unit> a(sm6 sm6Var) {
        z65.h(sm6Var, "modifier");
        return gn1.c(-1586257396, true, new a(sm6Var));
    }
}
