package androidx.compose.foundation;

import androidx.compose.foundation.a;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0018\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lsm6;", "", "enabled", "", "onClickLabel", "Lgn9;", "role", "Lkotlin/Function0;", "", "onClick", com.huawei.hms.opendevice.c.a, "(Lsm6;ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;)Lsm6;", "Loq6;", "interactionSource", "Lp05;", "indication", "b", "(Lsm6;Loq6;Lp05;ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;)Lsm6;", "Ldj8;", "Ls67;", "pressPoint", "Landroidx/compose/foundation/a$a;", "interactionData", "delayPressInteraction", com.huawei.hms.push.e.a, "(Ldj8;JLoq6;Landroidx/compose/foundation/a$a;Lkotlin/jvm/functions/Function0;Lcv1;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class e {

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsm6;", "a", "(Lsm6;Lqn1;I)Lsm6;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements y84<sm6, qn1, Integer, sm6> {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;
        final /* synthetic */ gn9 c;
        final /* synthetic */ Function0<Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
            super(3);
            this.a = z;
            this.b = str;
            this.c = gn9Var;
            this.d = function0;
        }

        public final sm6 a(sm6 sm6Var, qn1 qn1Var, int i) {
            z65.h(sm6Var, "$this$composed");
            qn1Var.w(-756081143);
            if (tn1.K()) {
                tn1.V(-756081143, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:97)");
            }
            sm6.a aVar = sm6.a;
            p05 p05Var = (p05) qn1Var.k(r05.a());
            qn1Var.w(-492369756);
            Object x = qn1Var.x();
            if (x == qn1.a.a()) {
                x = j65.a();
                qn1Var.p(x);
            }
            qn1Var.J();
            sm6 b = e.b(aVar, (oq6) x, p05Var, this.a, this.b, this.c, this.d);
            if (tn1.K()) {
                tn1.U();
            }
            qn1Var.J();
            return b;
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ sm6 invoke(sm6 sm6Var, qn1 qn1Var, Integer num) {
            return a(sm6Var, qn1Var, num.intValue());
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ oq6 a;
        final /* synthetic */ p05 b;
        final /* synthetic */ boolean c;
        final /* synthetic */ String d;
        final /* synthetic */ gn9 e;
        final /* synthetic */ Function0 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq6 oq6Var, p05 p05Var, boolean z, String str, gn9 gn9Var, Function0 function0) {
            super(1);
            this.a = oq6Var;
            this.b = p05Var;
            this.c = z;
            this.d = str;
            this.e = gn9Var;
            this.f = function0;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("clickable");
            t45Var.a().b("interactionSource", this.a);
            t45Var.a().b("indication", this.b);
            t45Var.a().b("enabled", Boolean.valueOf(this.c));
            t45Var.a().b("onClickLabel", this.d);
            t45Var.a().b("role", this.e);
            t45Var.a().b("onClick", this.f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;
        final /* synthetic */ gn9 c;
        final /* synthetic */ Function0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, String str, gn9 gn9Var, Function0 function0) {
            super(1);
            this.a = z;
            this.b = str;
            this.c = gn9Var;
            this.d = function0;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("clickable");
            t45Var.a().b("enabled", Boolean.valueOf(this.a));
            t45Var.a().b("onClickLabel", this.b);
            t45Var.a().b("role", this.c);
            t45Var.a().b("onClick", this.d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {299, 301, 308, 309, 318}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        boolean a;
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ dj8 d;
        final /* synthetic */ long e;
        final /* synthetic */ oq6 f;
        final /* synthetic */ a.C0013a g;
        final /* synthetic */ Function0<Boolean> h;

        /* compiled from: Clickable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {293, 296}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            Object a;
            int b;
            final /* synthetic */ Function0<Boolean> c;
            final /* synthetic */ long d;
            final /* synthetic */ oq6 e;
            final /* synthetic */ a.C0013a f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Boolean> function0, long j, oq6 oq6Var, a.C0013a c0013a, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = function0;
                this.d = j;
                this.e = oq6Var;
                this.f = c0013a;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.c, this.d, this.e, this.f, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                gj8 gj8Var;
                d = c75.d();
                int i = this.b;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            gj8Var = (gj8) this.a;
                            vk9.b(obj);
                            this.f.e(gj8Var);
                            return Unit.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vk9.b(obj);
                } else {
                    vk9.b(obj);
                    if (this.c.invoke().booleanValue()) {
                        long a = c91.a();
                        this.b = 1;
                        if (xt2.a(a, this) == d) {
                            return d;
                        }
                    }
                }
                gj8 gj8Var2 = new gj8(this.d, null);
                oq6 oq6Var = this.e;
                this.a = gj8Var2;
                this.b = 2;
                if (oq6Var.a(gj8Var2, this) == d) {
                    return d;
                }
                gj8Var = gj8Var2;
                this.f.e(gj8Var);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(dj8 dj8Var, long j, oq6 oq6Var, a.C0013a c0013a, Function0<Boolean> function0, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.d = dj8Var;
            this.e = j;
            this.f = oq6Var;
            this.g = c0013a;
            this.h = function0;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.d, this.e, this.f, this.g, this.h, cv1Var);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00b4 A[RETURN] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final sm6 b(sm6 sm6Var, oq6 oq6Var, p05 p05Var, boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
        Function1 a2;
        z65.h(sm6Var, "$this$clickable");
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        if (r45.c()) {
            a2 = new b(oq6Var, p05Var, z, str, gn9Var, function0);
        } else {
            a2 = r45.a();
        }
        return r45.b(sm6Var, a2, FocusableKt.b(n.a(r05.b(sm6.a, oq6Var, p05Var), oq6Var, z), z, oq6Var).f(new ClickableElement(oq6Var, z, str, gn9Var, function0, null)));
    }

    public static final sm6 c(sm6 sm6Var, boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
        Function1 a2;
        z65.h(sm6Var, "$this$clickable");
        z65.h(function0, "onClick");
        if (r45.c()) {
            a2 = new c(z, str, gn9Var, function0);
        } else {
            a2 = r45.a();
        }
        return pn1.a(sm6Var, a2, new a(z, str, gn9Var, function0));
    }

    public static /* synthetic */ sm6 d(sm6 sm6Var, boolean z, String str, gn9 gn9Var, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            gn9Var = null;
        }
        return c(sm6Var, z, str, gn9Var, function0);
    }

    public static final Object e(dj8 dj8Var, long j, oq6 oq6Var, a.C0013a c0013a, Function0<Boolean> function0, cv1<? super Unit> cv1Var) {
        Object d2;
        Object e = rx1.e(new d(dj8Var, j, oq6Var, c0013a, function0, null), cv1Var);
        d2 = c75.d();
        if (e == d2) {
            return e;
        }
        return Unit.a;
    }
}
