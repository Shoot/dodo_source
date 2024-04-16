package defpackage;

import androidx.compose.foundation.layout.d;
import defpackage.mn1;
import defpackage.sm6;
import defpackage.zq;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: DeliveryTermsContent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsm6;", "modifier", "", "Llq3;", "levels", "", "a", "(Lsm6;Ljava/util/List;Lqn1;II)V", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: tz2  reason: default package */
/* loaded from: classes2.dex */
public final class tz2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryTermsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz2$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;
        final /* synthetic */ List<lq3> b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sm6 sm6Var, List<lq3> list, int i, int i2) {
            super(2);
            this.a = sm6Var;
            this.b = list;
            this.c = i;
            this.d = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            tz2.a(this.a, this.b, qn1Var, f99.a(this.c | 1), this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(sm6 sm6Var, List<lq3> list, qn1 qn1Var, int i, int i2) {
        sm6.a aVar;
        int w;
        z65.h(list, "levels");
        qn1 f = qn1Var.f(1254371892);
        if ((i2 & 1) != 0) {
            aVar = sm6.a;
        } else {
            aVar = sm6Var;
        }
        if (tn1.K()) {
            tn1.V(1254371892, i, -1, "com.dodopizza.order.feature.personaldelivery.compose.DeliveryTermsContent (DeliveryTermsContent.kt:23)");
        }
        zq.e j = zq.a.j(i73.o(8));
        int i3 = (i & 14) | 48;
        f.w(-483455358);
        int i4 = i3 >> 3;
        qb6 a2 = tf1.a(j, gb.a.d(), f, (i4 & 112) | (i4 & 14));
        f.w(-1323940314);
        int a3 = jn1.a(f, 0);
        po1 n = f.n();
        mn1.a aVar2 = mn1.G;
        Function0<mn1> a4 = aVar2.a();
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
        srb.b(a6, a2, aVar2.c());
        srb.b(a6, n, aVar2.e());
        Function2<mn1, Integer, Unit> b = aVar2.b();
        if (a6.e() || !z65.c(a6.x(), Integer.valueOf(a3))) {
            a6.p(Integer.valueOf(a3));
            a6.l(Integer.valueOf(a3), b);
        }
        a5.invoke(sna.a(sna.b(f)), f, Integer.valueOf((i5 >> 3) & 112));
        f.w(2058660585);
        vf1 vf1Var = vf1.a;
        sm6 sm6Var2 = aVar;
        int i6 = 0;
        wbb.a(uza.a(r09.dynamic_delivery_conditions_title, f, 0), null, fd1.a(ew8.A, f, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ln1.a.c(), f, 0, 0, 65530);
        f.w(488914650);
        List<lq3> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        int i7 = 0;
        for (Object obj : list2) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                kc1.v();
            }
            lq3 lq3Var = (lq3) obj;
            if (i7 == 0) {
                f.w(2045786834);
                ix2.a(d.b(sm6.a, 0.0f, 1, null), lq3Var, f, 70, i6);
                f.J();
            } else {
                f.w(2045786963);
                d53.a(null, 0.0f, fd1.a(ew8.r, f, i6), f, 0, 3);
                ix2.a(d.b(sm6.a, 0.0f, 1, null), lq3Var, f, 70, 0);
                f.J();
            }
            arrayList.add(Unit.a);
            i7 = i8;
            i6 = 0;
        }
        f.J();
        f.J();
        f.r();
        f.J();
        f.J();
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i9 = f.i();
        if (i9 != null) {
            i9.a(new a(sm6Var2, list, i, i2));
        }
    }
}
