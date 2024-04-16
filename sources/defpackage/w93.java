package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import defpackage.gb;
import defpackage.mn1;
import defpackage.sm6;
import defpackage.zq;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: DynamicDeliveryScreen.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsm6;", "modifier", "", "Llq3;", "levels", "Lkotlin/Function0;", "", "onClick", "a", "(Lsm6;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lqn1;II)V", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: w93  reason: default package */
/* loaded from: classes2.dex */
public final class w93 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicDeliveryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w93$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;
        final /* synthetic */ List<lq3> b;
        final /* synthetic */ Function0<Unit> c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sm6 sm6Var, List<lq3> list, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.a = sm6Var;
            this.b = list;
            this.c = function0;
            this.d = i;
            this.e = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            w93.a(this.a, this.b, this.c, qn1Var, f99.a(this.d | 1), this.e);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(sm6 sm6Var, List<lq3> list, Function0<Unit> function0, qn1 qn1Var, int i, int i2) {
        sm6.a aVar;
        z65.h(list, "levels");
        z65.h(function0, "onClick");
        qn1 f = qn1Var.f(-2008959010);
        if ((i2 & 1) != 0) {
            aVar = sm6.a;
        } else {
            aVar = sm6Var;
        }
        if (tn1.K()) {
            tn1.V(-2008959010, i, -1, "com.dodopizza.order.feature.personaldelivery.compose.DynamicDeliveryScreen (DynamicDeliveryScreen.kt:24)");
        }
        int i3 = i & 14;
        f.w(-483455358);
        zq.l c = zq.a.c();
        gb.a aVar2 = gb.a;
        int i4 = i3 >> 3;
        qb6 a2 = tf1.a(c, aVar2.d(), f, (i4 & 112) | (i4 & 14));
        f.w(-1323940314);
        int a3 = jn1.a(f, 0);
        po1 n = f.n();
        mn1.a aVar3 = mn1.G;
        Function0<mn1> a4 = aVar3.a();
        y84<sna<mn1>, qn1, Integer, Unit> a5 = xm5.a(aVar);
        int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
        if (!(f.h() instanceof wp)) {
            jn1.b();
        }
        f.B();
        if (f.e()) {
            f.D(a4);
        } else {
            f.o();
        }
        qn1 a6 = srb.a(f);
        srb.b(a6, a2, aVar3.c());
        srb.b(a6, n, aVar3.e());
        Function2<mn1, Integer, Unit> b = aVar3.b();
        if (a6.e() || !z65.c(a6.x(), Integer.valueOf(a3))) {
            a6.p(Integer.valueOf(a3));
            a6.l(Integer.valueOf(a3), b);
        }
        a5.invoke(sna.a(sna.b(f)), f, Integer.valueOf((i5 >> 3) & 112));
        f.w(2058660585);
        vf1 vf1Var = vf1.a;
        sm6.a aVar4 = sm6.a;
        qqa.a(d.c(aVar4, i73.o(8)), f, 6);
        lf0.a(vf1Var.a(c.a(d.d(aVar4, i73.o(36), i73.o(4)), fd1.a(ew8.x, f, 0), ko9.c(i73.o(2))), aVar2.b()), f, 0);
        qqa.a(d.c(aVar4, i73.o(16)), f, 6);
        v93.a(d.b(aVar4, 0.0f, 1, null), list, function0, f, (i & 896) | 70, 0);
        f.J();
        f.r();
        f.J();
        f.J();
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i6 = f.i();
        if (i6 != null) {
            i6.a(new a(aVar, list, function0, i, i2));
        }
    }
}
