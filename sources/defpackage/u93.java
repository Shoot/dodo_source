package defpackage;

import androidx.compose.foundation.e;
import defpackage.gb;
import defpackage.mn1;
import defpackage.sm6;
import defpackage.zq;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: DynamicDeliveryPriceInfo.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsm6;", "modifier", "Lkotlin/Pair;", "Lhn6;", "deliveryFeeRange", "Lkotlin/Function0;", "", "onClick", "a", "(Lsm6;Lkotlin/Pair;Lkotlin/jvm/functions/Function0;Lqn1;II)V", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: u93  reason: default package */
/* loaded from: classes2.dex */
public final class u93 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicDeliveryPriceInfo.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u93$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicDeliveryPriceInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u93$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;
        final /* synthetic */ Pair<hn6, hn6> b;
        final /* synthetic */ Function0<Unit> c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(sm6 sm6Var, Pair<hn6, hn6> pair, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.a = sm6Var;
            this.b = pair;
            this.c = function0;
            this.d = i;
            this.e = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            u93.a(this.a, this.b, this.c, qn1Var, f99.a(this.d | 1), this.e);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(sm6 sm6Var, Pair<hn6, hn6> pair, Function0<Unit> function0, qn1 qn1Var, int i, int i2) {
        sm6.a aVar;
        String str;
        boolean z;
        z65.h(pair, "deliveryFeeRange");
        z65.h(function0, "onClick");
        qn1 f = qn1Var.f(802111964);
        if ((i2 & 1) != 0) {
            aVar = sm6.a;
        } else {
            aVar = sm6Var;
        }
        if (tn1.K()) {
            tn1.V(802111964, i, -1, "com.dodopizza.order.feature.shoppingcart.compose.DynamicDeliveryPriceInfo (DynamicDeliveryPriceInfo.kt:28)");
        }
        if (z65.c(pair.c(), pair.d())) {
            str = un6.b(pair.c());
        } else {
            str = un6.a(pair.c()) + " - " + un6.b(pair.d());
        }
        f.w(1079505192);
        if ((((i & 896) ^ 384) > 256 && f.z(function0)) || (i & 384) == 256) {
            z = true;
        } else {
            z = false;
        }
        Object x = f.x();
        if (z || x == qn1.a.a()) {
            x = new a(function0);
            f.p(x);
        }
        f.J();
        sm6 d = e.d(aVar, false, null, null, (Function0) x, 7, null);
        zq.e a2 = zq.a.a();
        gb.c c = gb.a.c();
        f.w(693286680);
        qb6 a3 = kp9.a(a2, c, f, 54);
        f.w(-1323940314);
        int a4 = jn1.a(f, 0);
        po1 n = f.n();
        mn1.a aVar2 = mn1.G;
        Function0<mn1> a5 = aVar2.a();
        y84<sna<mn1>, qn1, Integer, Unit> a6 = xm5.a(d);
        if (!(f.h() instanceof wp)) {
            jn1.b();
        }
        f.B();
        if (f.e()) {
            f.D(a5);
        } else {
            f.o();
        }
        qn1 a7 = srb.a(f);
        srb.b(a7, a3, aVar2.c());
        srb.b(a7, n, aVar2.e());
        Function2<mn1, Integer, Unit> b2 = aVar2.b();
        if (a7.e() || !z65.c(a7.x(), Integer.valueOf(a4))) {
            a7.p(Integer.valueOf(a4));
            a7.l(Integer.valueOf(a4), b2);
        }
        a6.invoke(sna.a(sna.b(f)), f, 0);
        f.w(2058660585);
        np9 np9Var = np9.a;
        su4.a(tp7.d(bx8.ic_circle_hint, f, 0), null, null, null, null, 0.0f, null, f, 56, 124);
        sqa.a(8, f, 6);
        wbb.a(uza.b(r09.dynamic_delivery_fee_range, new Object[]{str}, f, 64), null, fd1.a(ew8.B, f, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ln1.a.e(), f, 0, 0, 65530);
        sqa.a(8, f, 6);
        su4.a(tp7.d(bx8.ic_arrow_right, f, 0), null, null, null, null, 0.0f, null, f, 56, 124);
        f.J();
        f.r();
        f.J();
        f.J();
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i3 = f.i();
        if (i3 != null) {
            i3.a(new b(aVar, pair, function0, i, i2));
        }
    }
}
