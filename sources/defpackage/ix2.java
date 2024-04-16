package defpackage;

import androidx.compose.foundation.layout.b;
import defpackage.mn1;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: DeliveryLevelItem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsm6;", "modifier", "Llq3;", "level", "", "a", "(Lsm6;Llq3;Lqn1;II)V", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ix2  reason: default package */
/* loaded from: classes2.dex */
public final class ix2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLevelItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ix2$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;
        final /* synthetic */ lq3 b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sm6 sm6Var, lq3 lq3Var, int i, int i2) {
            super(2);
            this.a = sm6Var;
            this.b = lq3Var;
            this.c = i;
            this.d = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            ix2.a(this.a, this.b, qn1Var, f99.a(this.c | 1), this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(sm6 sm6Var, lq3 lq3Var, qn1 qn1Var, int i, int i2) {
        sm6.a aVar;
        String b;
        z65.h(lq3Var, "level");
        qn1 f = qn1Var.f(-1105272181);
        if ((i2 & 1) != 0) {
            aVar = sm6.a;
        } else {
            aVar = sm6Var;
        }
        if (tn1.K()) {
            tn1.V(-1105272181, i, -1, "com.dodopizza.order.feature.personaldelivery.compose.DeliveryLevelItem (DeliveryLevelItem.kt:24)");
        }
        if (((int) lq3Var.c().a()) == 0) {
            f.w(-255799143);
            b = uza.b(r09.dynamic_delivery_order_under_bound, new Object[]{un6.b(lq3Var.b())}, f, 64);
            f.J();
        } else {
            f.w(-255799013);
            b = uza.b(r09.dynamic_delivery_order_over_bound, new Object[]{un6.b(lq3Var.c())}, f, 64);
            f.J();
        }
        sm6 b2 = b.b(aVar, 0.0f, i73.o(8), 1, null);
        f.w(693286680);
        qb6 a2 = kp9.a(zq.a.b(), gb.a.e(), f, 0);
        f.w(-1323940314);
        int a3 = jn1.a(f, 0);
        po1 n = f.n();
        mn1.a aVar2 = mn1.G;
        Function0<mn1> a4 = aVar2.a();
        y84<sna<mn1>, qn1, Integer, Unit> a5 = xm5.a(b2);
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
        srb.b(a6, a2, aVar2.c());
        srb.b(a6, n, aVar2.e());
        Function2<mn1, Integer, Unit> b3 = aVar2.b();
        if (a6.e() || !z65.c(a6.x(), Integer.valueOf(a3))) {
            a6.p(Integer.valueOf(a3));
            a6.l(Integer.valueOf(a3), b3);
        }
        a5.invoke(sna.a(sna.b(f)), f, 0);
        f.w(2058660585);
        np9 np9Var = np9.a;
        sm6.a aVar3 = sm6.a;
        sm6 a7 = lp9.a(np9Var, aVar3, 1.0f, false, 2, null);
        ln1 ln1Var = ln1.a;
        rcb d = ln1Var.d();
        int i3 = ew8.textIconsSecondaryStrong;
        sm6 sm6Var2 = aVar;
        wbb.a(b, a7, fd1.a(i3, f, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, d, f, 0, 0, 65528);
        sqa.a(2, f, 6);
        wbb.a(un6.b(lq3Var.a()), aVar3, fd1.a(i3, f, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ln1Var.d(), f, 48, 0, 65528);
        f.J();
        f.r();
        f.J();
        f.J();
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i4 = f.i();
        if (i4 != null) {
            i4.a(new a(sm6Var2, lq3Var, i, i2));
        }
    }
}
