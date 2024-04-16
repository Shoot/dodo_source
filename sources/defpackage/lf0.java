package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import defpackage.mn1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a<\u0010\u0013\u001a\u00020\u0012*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001e\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u001a\u0010\"\u001a\u0004\u0018\u00010\u001f*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0018\u0010%\u001a\u00020\u0002*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lgb;", "alignment", "", "propagateMinConstraints", "Lqb6;", Image.TYPE_HIGH, "(Lgb;ZLqn1;I)Lqb6;", DateTokenConverter.CONVERTER_KEY, "Lgb8$a;", "Lgb8;", "placeable", "Lmb6;", "measurable", "Lqm5;", "layoutDirection", "", "boxWidth", "boxHeight", "", "g", "Lsm6;", "modifier", "a", "(Lsm6;Lqn1;I)V", "Lqb6;", "getDefaultBoxMeasurePolicy", "()Lqb6;", "DefaultBoxMeasurePolicy", "b", "getEmptyBoxMeasurePolicy", "EmptyBoxMeasurePolicy", "Lkf0;", e.a, "(Lmb6;)Lkf0;", "boxChildDataNode", "f", "(Lmb6;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: lf0  reason: default package */
/* loaded from: classes.dex */
public final class lf0 {
    private static final qb6 a = d(gb.a.f(), false);
    private static final qb6 b = b.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Box.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: lf0$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sm6 sm6Var, int i) {
            super(2);
            this.a = sm6Var;
            this.b = i;
        }

        public final void a(qn1 qn1Var, int i) {
            lf0.a(this.a, qn1Var, f99.a(this.b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lvb6;", "", "Lmb6;", "<anonymous parameter 0>", "Lnr1;", "constraints", "Ltb6;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: lf0$b */
    /* loaded from: classes.dex */
    static final class b implements qb6 {
        public static final b a = new b();

        /* compiled from: Box.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: lf0$b$a */
        /* loaded from: classes.dex */
        static final class a extends ej5 implements Function1<gb8.a, Unit> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final void a(gb8.a aVar) {
                z65.h(aVar, "$this$layout");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        b() {
        }

        @Override // defpackage.qb6
        public final tb6 a(vb6 vb6Var, List<? extends mb6> list, long j) {
            z65.h(vb6Var, "$this$MeasurePolicy");
            z65.h(list, "<anonymous parameter 0>");
            return ub6.b(vb6Var, nr1.p(j), nr1.o(j), null, a.a, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lvb6;", "", "Lmb6;", "measurables", "Lnr1;", "constraints", "Ltb6;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: lf0$c */
    /* loaded from: classes.dex */
    public static final class c implements qb6 {
        final /* synthetic */ boolean a;
        final /* synthetic */ gb b;

        /* compiled from: Box.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: lf0$c$a */
        /* loaded from: classes.dex */
        static final class a extends ej5 implements Function1<gb8.a, Unit> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final void a(gb8.a aVar) {
                z65.h(aVar, "$this$layout");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* compiled from: Box.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: lf0$c$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function1<gb8.a, Unit> {
            final /* synthetic */ gb8 a;
            final /* synthetic */ mb6 b;
            final /* synthetic */ vb6 c;
            final /* synthetic */ int d;
            final /* synthetic */ int e;
            final /* synthetic */ gb f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(gb8 gb8Var, mb6 mb6Var, vb6 vb6Var, int i, int i2, gb gbVar) {
                super(1);
                this.a = gb8Var;
                this.b = mb6Var;
                this.c = vb6Var;
                this.d = i;
                this.e = i2;
                this.f = gbVar;
            }

            public final void a(gb8.a aVar) {
                z65.h(aVar, "$this$layout");
                lf0.g(aVar, this.a, this.b, this.c.getLayoutDirection(), this.d, this.e, this.f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* compiled from: Box.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: lf0$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0424c extends ej5 implements Function1<gb8.a, Unit> {
            final /* synthetic */ gb8[] a;
            final /* synthetic */ List<mb6> b;
            final /* synthetic */ vb6 c;
            final /* synthetic */ ca9 d;
            final /* synthetic */ ca9 e;
            final /* synthetic */ gb f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0424c(gb8[] gb8VarArr, List<? extends mb6> list, vb6 vb6Var, ca9 ca9Var, ca9 ca9Var2, gb gbVar) {
                super(1);
                this.a = gb8VarArr;
                this.b = list;
                this.c = vb6Var;
                this.d = ca9Var;
                this.e = ca9Var2;
                this.f = gbVar;
            }

            public final void a(gb8.a aVar) {
                z65.h(aVar, "$this$layout");
                gb8[] gb8VarArr = this.a;
                List<mb6> list = this.b;
                vb6 vb6Var = this.c;
                ca9 ca9Var = this.d;
                ca9 ca9Var2 = this.e;
                gb gbVar = this.f;
                int length = gb8VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    gb8 gb8Var = gb8VarArr[i2];
                    z65.f(gb8Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    lf0.g(aVar, gb8Var, list.get(i), vb6Var.getLayoutDirection(), ca9Var.a, ca9Var2.a, gbVar);
                    i2++;
                    i++;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        c(boolean z, gb gbVar) {
            this.a = z;
            this.b = gbVar;
        }

        @Override // defpackage.qb6
        public final tb6 a(vb6 vb6Var, List<? extends mb6> list, long j) {
            long e;
            int i;
            int i2;
            int p;
            gb8 E;
            int i3;
            z65.h(vb6Var, "$this$MeasurePolicy");
            z65.h(list, "measurables");
            if (list.isEmpty()) {
                return ub6.b(vb6Var, nr1.p(j), nr1.o(j), null, a.a, 4, null);
            }
            if (this.a) {
                e = j;
            } else {
                e = nr1.e(j, 0, 0, 0, 0, 10, null);
            }
            if (list.size() == 1) {
                mb6 mb6Var = list.get(0);
                if (!lf0.f(mb6Var)) {
                    gb8 E2 = mb6Var.E(e);
                    int max = Math.max(nr1.p(j), E2.y0());
                    i3 = Math.max(nr1.o(j), E2.e0());
                    E = E2;
                    p = max;
                } else {
                    p = nr1.p(j);
                    int o = nr1.o(j);
                    E = mb6Var.E(nr1.b.c(nr1.p(j), nr1.o(j)));
                    i3 = o;
                }
                return ub6.b(vb6Var, p, i3, null, new b(E, mb6Var, vb6Var, p, i3, this.b), 4, null);
            }
            gb8[] gb8VarArr = new gb8[list.size()];
            ca9 ca9Var = new ca9();
            ca9Var.a = nr1.p(j);
            ca9 ca9Var2 = new ca9();
            ca9Var2.a = nr1.o(j);
            int size = list.size();
            boolean z = false;
            for (int i4 = 0; i4 < size; i4++) {
                mb6 mb6Var2 = list.get(i4);
                if (!lf0.f(mb6Var2)) {
                    gb8 E3 = mb6Var2.E(e);
                    gb8VarArr[i4] = E3;
                    ca9Var.a = Math.max(ca9Var.a, E3.y0());
                    ca9Var2.a = Math.max(ca9Var2.a, E3.e0());
                } else {
                    z = true;
                }
            }
            if (z) {
                int i5 = ca9Var.a;
                if (i5 != Integer.MAX_VALUE) {
                    i = i5;
                } else {
                    i = 0;
                }
                int i6 = ca9Var2.a;
                if (i6 != Integer.MAX_VALUE) {
                    i2 = i6;
                } else {
                    i2 = 0;
                }
                long a2 = qr1.a(i, i5, i2, i6);
                int size2 = list.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    mb6 mb6Var3 = list.get(i7);
                    if (lf0.f(mb6Var3)) {
                        gb8VarArr[i7] = mb6Var3.E(a2);
                    }
                }
            }
            return ub6.b(vb6Var, ca9Var.a, ca9Var2.a, null, new C0424c(gb8VarArr, list, vb6Var, ca9Var, ca9Var2, this.b), 4, null);
        }
    }

    public static final void a(sm6 sm6Var, qn1 qn1Var, int i) {
        int i2;
        int i3;
        z65.h(sm6Var, "modifier");
        qn1 f = qn1Var.f(-211209833);
        if ((i & 14) == 0) {
            if (f.K(sm6Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && f.g()) {
            f.E();
        } else {
            if (tn1.K()) {
                tn1.V(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:198)");
            }
            qb6 qb6Var = b;
            f.w(-1323940314);
            int a2 = jn1.a(f, 0);
            po1 n = f.n();
            mn1.a aVar = mn1.G;
            Function0<mn1> a3 = aVar.a();
            y84<sna<mn1>, qn1, Integer, Unit> a4 = xm5.a(sm6Var);
            int i4 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (!(f.h() instanceof wp)) {
                jn1.b();
            }
            f.B();
            if (f.e()) {
                f.D(a3);
            } else {
                f.o();
            }
            qn1 a5 = srb.a(f);
            srb.b(a5, qb6Var, aVar.c());
            srb.b(a5, n, aVar.e());
            Function2<mn1, Integer, Unit> b2 = aVar.b();
            if (a5.e() || !z65.c(a5.x(), Integer.valueOf(a2))) {
                a5.p(Integer.valueOf(a2));
                a5.l(Integer.valueOf(a2), b2);
            }
            a4.invoke(sna.a(sna.b(f)), f, Integer.valueOf((i4 >> 3) & 112));
            f.w(2058660585);
            f.J();
            f.r();
            f.J();
            if (tn1.K()) {
                tn1.U();
            }
        }
        xw9 i5 = f.i();
        if (i5 != null) {
            i5.a(new a(sm6Var, i));
        }
    }

    public static final qb6 d(gb gbVar, boolean z) {
        z65.h(gbVar, "alignment");
        return new c(z, gbVar);
    }

    private static final kf0 e(mb6 mb6Var) {
        Object r = mb6Var.r();
        if (r instanceof kf0) {
            return (kf0) r;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(mb6 mb6Var) {
        kf0 e = e(mb6Var);
        if (e != null) {
            return e.g1();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(gb8.a aVar, gb8 gb8Var, mb6 mb6Var, qm5 qm5Var, int i, int i2, gb gbVar) {
        gb gbVar2;
        gb f1;
        kf0 e = e(mb6Var);
        if (e != null && (f1 = e.f1()) != null) {
            gbVar2 = f1;
        } else {
            gbVar2 = gbVar;
        }
        gb8.a.p(aVar, gb8Var, gbVar2.a(x55.a(gb8Var.y0(), gb8Var.e0()), x55.a(i, i2), qm5Var), 0.0f, 2, null);
    }

    public static final qb6 h(gb gbVar, boolean z, qn1 qn1Var, int i) {
        qb6 qb6Var;
        z65.h(gbVar, "alignment");
        qn1Var.w(56522820);
        if (tn1.K()) {
            tn1.V(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:79)");
        }
        if (z65.c(gbVar, gb.a.f()) && !z) {
            qb6Var = a;
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            qn1Var.w(511388516);
            boolean K = qn1Var.K(valueOf) | qn1Var.K(gbVar);
            Object x = qn1Var.x();
            if (K || x == qn1.a.a()) {
                x = d(gbVar, z);
                qn1Var.p(x);
            }
            qn1Var.J();
            qb6Var = (qb6) x;
        }
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return qb6Var;
    }
}
