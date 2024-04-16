package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsm6;", "Lpd8;", RemoteMessageConst.Notification.ICON, "", "overrideDescendants", "b", "Lyr8;", "Lsd8;", "a", "Lyr8;", "ModifierLocalPointerIcon", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: rd8  reason: default package */
/* loaded from: classes.dex */
public final class rd8 {
    private static final yr8<sd8> a = wm6.a(a.a);

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsd8;", "a", "()Lsd8;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rd8$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<sd8> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final sd8 invoke() {
            return null;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rd8$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ pd8 a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pd8 pd8Var, boolean z) {
            super(1);
            this.a = pd8Var;
            this.b = z;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("pointerHoverIcon");
            t45Var.a().b(RemoteMessageConst.Notification.ICON, this.a);
            t45Var.a().b("overrideDescendants", Boolean.valueOf(this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsm6;", "a", "(Lsm6;Lqn1;I)Lsm6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rd8$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements y84<sm6, qn1, Integer, sm6> {
        final /* synthetic */ pd8 a;
        final /* synthetic */ boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerIcon.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: rd8$c$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ sd8 a;
            final /* synthetic */ pd8 b;
            final /* synthetic */ boolean c;
            final /* synthetic */ Function1<pd8, Unit> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(sd8 sd8Var, pd8 pd8Var, boolean z, Function1<? super pd8, Unit> function1) {
                super(0);
                this.a = sd8Var;
                this.b = pd8Var;
                this.c = z;
                this.d = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.B(this.b, this.c, this.d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerIcon.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpd8;", "pointerIcon", "", "a", "(Lpd8;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: rd8$c$b */
        /* loaded from: classes.dex */
        public static final class b extends ej5 implements Function1<pd8, Unit> {
            final /* synthetic */ td8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(td8 td8Var) {
                super(1);
                this.a = td8Var;
            }

            public final void a(pd8 pd8Var) {
                this.a.a(pd8Var);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(pd8 pd8Var) {
                a(pd8Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerIcon.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lie8;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1", f = "PointerIcon.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: rd8$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0501c extends f3b implements Function2<ie8, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ sd8 c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PointerIcon.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lr40;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1$1", f = "PointerIcon.kt", l = {112}, m = "invokeSuspend")
            /* renamed from: rd8$c$c$a */
            /* loaded from: classes.dex */
            public static final class a extends rk9 implements Function2<r40, cv1<? super Unit>, Object> {
                int b;
                private /* synthetic */ Object c;
                final /* synthetic */ sd8 d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(sd8 sd8Var, cv1<? super a> cv1Var) {
                    super(2, cv1Var);
                    this.d = sd8Var;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    a aVar = new a(this.d, cv1Var);
                    aVar.c = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: i */
                public final Object invoke(r40 r40Var, cv1<? super Unit> cv1Var) {
                    return ((a) create(r40Var, cv1Var)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please submit an issue!!! */
                @Override // defpackage.e70
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = defpackage.a75.d()
                        int r1 = r8.b
                        r2 = 1
                        if (r1 == 0) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r8.c
                        r40 r1 = (defpackage.r40) r1
                        defpackage.vk9.b(r9)
                        r3 = r1
                        r1 = r0
                        r0 = r8
                        goto L39
                    L16:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1e:
                        defpackage.vk9.b(r9)
                        java.lang.Object r9 = r8.c
                        r40 r9 = (defpackage.r40) r9
                        r1 = r9
                        r9 = r8
                    L27:
                        md8 r3 = defpackage.md8.Main
                        r9.c = r1
                        r9.b = r2
                        java.lang.Object r3 = r1.Y(r3, r9)
                        if (r3 != r0) goto L34
                        return r0
                    L34:
                        r7 = r0
                        r0 = r9
                        r9 = r3
                        r3 = r1
                        r1 = r7
                    L39:
                        kd8 r9 = (defpackage.kd8) r9
                        int r4 = r9.e()
                        nd8$a r5 = defpackage.nd8.a
                        int r6 = r5.a()
                        boolean r4 = defpackage.nd8.i(r4, r6)
                        if (r4 == 0) goto L51
                        sd8 r9 = r0.d
                        r9.o()
                        goto L64
                    L51:
                        int r9 = r9.e()
                        int r4 = r5.b()
                        boolean r9 = defpackage.nd8.i(r9, r4)
                        if (r9 == 0) goto L64
                        sd8 r9 = r0.d
                        r9.s()
                    L64:
                        r9 = r0
                        r0 = r1
                        r1 = r3
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.rd8.c.C0501c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0501c(sd8 sd8Var, cv1<? super C0501c> cv1Var) {
                super(2, cv1Var);
                this.c = sd8Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0501c c0501c = new C0501c(this.c, cv1Var);
                c0501c.b = obj;
                return c0501c;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(ie8 ie8Var, cv1<? super Unit> cv1Var) {
                return ((C0501c) create(ie8Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                d = c75.d();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    a aVar = new a(this.c, null);
                    this.a = 1;
                    if (((ie8) this.b).T(aVar, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(pd8 pd8Var, boolean z) {
            super(3);
            this.a = pd8Var;
            this.b = z;
        }

        public final sm6 a(sm6 sm6Var, qn1 qn1Var, int i) {
            sm6 sm6Var2;
            sm6 f;
            z65.h(sm6Var, "$this$composed");
            qn1Var.w(811087536);
            if (tn1.K()) {
                tn1.V(811087536, i, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:89)");
            }
            td8 td8Var = (td8) qn1Var.k(ro1.g());
            if (td8Var == null) {
                f = sm6.a;
            } else {
                b bVar = new b(td8Var);
                pd8 pd8Var = this.a;
                boolean z = this.b;
                qn1Var.w(-492369756);
                Object x = qn1Var.x();
                if (x == qn1.a.a()) {
                    x = new sd8(pd8Var, z, bVar);
                    qn1Var.p(x);
                }
                qn1Var.J();
                sd8 sd8Var = (sd8) x;
                Object[] objArr = {sd8Var, this.a, Boolean.valueOf(this.b), bVar};
                pd8 pd8Var2 = this.a;
                boolean z2 = this.b;
                qn1Var.w(-568225417);
                boolean z3 = false;
                for (int i2 = 0; i2 < 4; i2++) {
                    z3 |= qn1Var.K(objArr[i2]);
                }
                Object x2 = qn1Var.x();
                if (z3 || x2 == qn1.a.a()) {
                    x2 = new a(sd8Var, pd8Var2, z2, bVar);
                    qn1Var.p(x2);
                }
                qn1Var.J();
                zd3.c((Function0) x2, qn1Var, 0);
                if (sd8Var.A()) {
                    qn1Var.w(1157296644);
                    boolean K = qn1Var.K(sd8Var);
                    Object x3 = qn1Var.x();
                    if (K || x3 == qn1.a.a()) {
                        x3 = new C0501c(sd8Var, null);
                        qn1Var.p(x3);
                    }
                    qn1Var.J();
                    sm6Var2 = j3b.c(sm6Var, sd8Var, (Function2) x3);
                } else {
                    sm6Var2 = sm6.a;
                }
                f = sd8Var.f(sm6Var2);
            }
            if (tn1.K()) {
                tn1.U();
            }
            qn1Var.J();
            return f;
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ sm6 invoke(sm6 sm6Var, qn1 qn1Var, Integer num) {
            return a(sm6Var, qn1Var, num.intValue());
        }
    }

    public static final sm6 b(sm6 sm6Var, pd8 pd8Var, boolean z) {
        Function1 a2;
        z65.h(sm6Var, "<this>");
        z65.h(pd8Var, RemoteMessageConst.Notification.ICON);
        if (r45.c()) {
            a2 = new b(pd8Var, z);
        } else {
            a2 = r45.a();
        }
        return pn1.a(sm6Var, a2, new c(pd8Var, z));
    }

    public static /* synthetic */ sm6 c(sm6 sm6Var, pd8 pd8Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(sm6Var, pd8Var, z);
    }
}
