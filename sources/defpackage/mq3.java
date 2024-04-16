package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.d;
import defpackage.mn1;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: FeeLevelsInfoButton.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsm6;", "modifier", "Lkotlin/Function0;", "", "onClick", "a", "(Lsm6;Lkotlin/jvm/functions/Function0;Lqn1;II)V", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: mq3  reason: default package */
/* loaded from: classes2.dex */
public final class mq3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeeLevelsInfoButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq3$a */
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
    /* compiled from: FeeLevelsInfoButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq3$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;
        final /* synthetic */ Function0<Unit> b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(sm6 sm6Var, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.a = sm6Var;
            this.b = function0;
            this.c = i;
            this.d = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            mq3.a(this.a, this.b, qn1Var, f99.a(this.c | 1), this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(sm6 sm6Var, Function0<Unit> function0, qn1 qn1Var, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        sm6.a aVar;
        boolean z;
        sm6 sm6Var2;
        qn1 qn1Var2;
        z65.h(function0, "onClick");
        qn1 f = qn1Var.f(1347250340);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            obj = sm6Var;
        } else if ((i & 14) == 0) {
            obj = sm6Var;
            if (f.K(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = sm6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (f.z(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && f.g()) {
            f.E();
            sm6Var2 = obj;
            qn1Var2 = f;
        } else {
            if (i6 != 0) {
                aVar = sm6.a;
            } else {
                aVar = obj;
            }
            if (tn1.K()) {
                tn1.V(1347250340, i3, -1, "com.dodopizza.order.feature.personaldelivery.compose.FeeLevelsInfoButton (FeeLevelsInfoButton.kt:25)");
            }
            sm6 a2 = c.a(d.c(aVar, i73.o(48)), fd1.a(ew8.s, f, 0), ko9.c(i73.o(24)));
            f.w(346754470);
            if ((i3 & 112) == 32) {
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
            sm6 d = e.d(a2, false, null, null, (Function0) x, 7, null);
            gb a3 = gb.a.a();
            f.w(733328855);
            qb6 h = lf0.h(a3, false, f, 6);
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
            srb.b(a7, h, aVar2.c());
            srb.b(a7, n, aVar2.e());
            Function2<mn1, Integer, Unit> b2 = aVar2.b();
            if (a7.e() || !z65.c(a7.x(), Integer.valueOf(a4))) {
                a7.p(Integer.valueOf(a4));
                a7.l(Integer.valueOf(a4), b2);
            }
            a6.invoke(sna.a(sna.b(f)), f, 0);
            f.w(2058660585);
            mf0 mf0Var = mf0.a;
            String a8 = uza.a(r09.dynamic_delivery_info_okay, f, 0);
            rcb a9 = ln1.a.a();
            sm6Var2 = aVar;
            qn1Var2 = f;
            wbb.a(a8, null, fd1.a(ew8.p, f, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a9, qn1Var2, 0, 0, 65530);
            qn1Var2.J();
            qn1Var2.r();
            qn1Var2.J();
            qn1Var2.J();
            if (tn1.K()) {
                tn1.U();
            }
        }
        xw9 i7 = qn1Var2.i();
        if (i7 != null) {
            i7.a(new b(sm6Var2, function0, i, i2));
        }
    }
}
