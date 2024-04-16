package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a^\u0010\n\u001a\u00020\u0005*\u00020\u00002*\b\u0002\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0012\u001a\u00020\u0011*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"<\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lie8;", "Lkotlin/Function3;", "Ldj8;", "Ls67;", "Lcv1;", "", "", "onPress", "Lkotlin/Function1;", "onTap", DateTokenConverter.CONVERTER_KEY, "(Lie8;Ly84;Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "Lr40;", "", "requireUnconsumed", "Lmd8;", "pass", "Lwd8;", "b", "(Lr40;ZLmd8;Lcv1;)Ljava/lang/Object;", e.a, "(Lr40;Lmd8;Lcv1;)Ljava/lang/Object;", "a", "Ly84;", "NoPressGesture", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: m6b  reason: default package */
/* loaded from: classes.dex */
public final class m6b {
    private static final y84<dj8, s67, cv1<? super Unit>, Object> a = new a(null);

    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldj8;", "Ls67;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m6b$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements y84<dj8, s67, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(3, cv1Var);
        }

        public final Object i(dj8 dj8Var, long j, cv1<? super Unit> cv1Var) {
            return new a(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Object invoke(dj8 dj8Var, s67 s67Var, cv1<? super Unit> cv1Var) {
            return i(dj8Var, s67Var.t(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    /* renamed from: m6b$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        boolean c;
        /* synthetic */ Object d;
        int e;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return m6b.b(null, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
    /* renamed from: m6b$c */
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ ie8 c;
        final /* synthetic */ y84<dj8, s67, cv1<? super Unit>, Object> d;
        final /* synthetic */ Function1<s67, Unit> e;
        final /* synthetic */ ej8 f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lr40;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
        /* renamed from: m6b$c$a */
        /* loaded from: classes.dex */
        public static final class a extends rk9 implements Function2<r40, cv1<? super Unit>, Object> {
            int b;
            private /* synthetic */ Object c;
            final /* synthetic */ qx1 d;
            final /* synthetic */ y84<dj8, s67, cv1<? super Unit>, Object> e;
            final /* synthetic */ Function1<s67, Unit> f;
            final /* synthetic */ ej8 g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
            /* renamed from: m6b$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0433a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ ej8 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0433a(ej8 ej8Var, cv1<? super C0433a> cv1Var) {
                    super(2, cv1Var);
                    this.b = ej8Var;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0433a(this.b, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0433a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                        ej8 ej8Var = this.b;
                        this.a = 1;
                        if (ej8Var.e(this) == d) {
                            return d;
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
            /* renamed from: m6b$c$a$b */
            /* loaded from: classes.dex */
            public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ y84<dj8, s67, cv1<? super Unit>, Object> b;
                final /* synthetic */ ej8 c;
                final /* synthetic */ wd8 d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(y84<? super dj8, ? super s67, ? super cv1<? super Unit>, ? extends Object> y84Var, ej8 ej8Var, wd8 wd8Var, cv1<? super b> cv1Var) {
                    super(2, cv1Var);
                    this.b = y84Var;
                    this.c = ej8Var;
                    this.d = wd8Var;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new b(this.b, this.c, this.d, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                        y84<dj8, s67, cv1<? super Unit>, Object> y84Var = this.b;
                        ej8 ej8Var = this.c;
                        s67 d2 = s67.d(this.d.g());
                        this.a = 1;
                        if (y84Var.invoke(ej8Var, d2, this) == d) {
                            return d;
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: m6b$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0434c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ ej8 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0434c(ej8 ej8Var, cv1<? super C0434c> cv1Var) {
                    super(2, cv1Var);
                    this.b = ej8Var;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0434c(this.b, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0434c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    c75.d();
                    if (this.a == 0) {
                        vk9.b(obj);
                        this.b.b();
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: m6b$c$a$d */
            /* loaded from: classes.dex */
            public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ ej8 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(ej8 ej8Var, cv1<? super d> cv1Var) {
                    super(2, cv1Var);
                    this.b = ej8Var;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new d(this.b, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    c75.d();
                    if (this.a == 0) {
                        vk9.b(obj);
                        this.b.d();
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(qx1 qx1Var, y84<? super dj8, ? super s67, ? super cv1<? super Unit>, ? extends Object> y84Var, Function1<? super s67, Unit> function1, ej8 ej8Var, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.d = qx1Var;
                this.e = y84Var;
                this.f = function1;
                this.g = ej8Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                a aVar = new a(this.d, this.e, this.f, this.g, cv1Var);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(r40 r40Var, cv1<? super Unit> cv1Var) {
                return ((a) create(r40Var, cv1Var)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
            @Override // defpackage.e70
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    java.lang.Object r7 = defpackage.a75.d()
                    int r0 = r6.b
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L2a
                    if (r0 == r9) goto L1f
                    if (r0 != r8) goto L17
                    defpackage.vk9.b(r24)
                    r0 = r24
                    goto L7d
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r6.c
                    r40 r0 = (defpackage.r40) r0
                    defpackage.vk9.b(r24)
                    r11 = r0
                    r0 = r24
                    goto L51
                L2a:
                    defpackage.vk9.b(r24)
                    java.lang.Object r0 = r6.c
                    r11 = r0
                    r40 r11 = (defpackage.r40) r11
                    qx1 r0 = r6.d
                    r1 = 0
                    r2 = 0
                    m6b$c$a$a r3 = new m6b$c$a$a
                    ej8 r4 = r6.g
                    r3.<init>(r4, r10)
                    r4 = 3
                    r5 = 0
                    defpackage.qh0.d(r0, r1, r2, r3, r4, r5)
                    r1 = 0
                    r6.c = r11
                    r6.b = r9
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = defpackage.m6b.c(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L51
                    return r7
                L51:
                    wd8 r0 = (defpackage.wd8) r0
                    r0.a()
                    y84<dj8, s67, cv1<? super kotlin.Unit>, java.lang.Object> r1 = r6.e
                    y84 r2 = defpackage.m6b.a()
                    if (r1 == r2) goto L72
                    qx1 r12 = r6.d
                    r13 = 0
                    r14 = 0
                    m6b$c$a$b r15 = new m6b$c$a$b
                    y84<dj8, s67, cv1<? super kotlin.Unit>, java.lang.Object> r1 = r6.e
                    ej8 r2 = r6.g
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    defpackage.qh0.d(r12, r13, r14, r15, r16, r17)
                L72:
                    r6.c = r10
                    r6.b = r8
                    java.lang.Object r0 = defpackage.m6b.f(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7d
                    return r7
                L7d:
                    wd8 r0 = (defpackage.wd8) r0
                    if (r0 != 0) goto L93
                    qx1 r11 = r6.d
                    r12 = 0
                    r13 = 0
                    m6b$c$a$c r14 = new m6b$c$a$c
                    ej8 r0 = r6.g
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    defpackage.qh0.d(r11, r12, r13, r14, r15, r16)
                    goto Lbd
                L93:
                    r0.a()
                    qx1 r1 = r6.d
                    r18 = 0
                    r19 = 0
                    m6b$c$a$d r2 = new m6b$c$a$d
                    ej8 r3 = r6.g
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r17 = r1
                    r20 = r2
                    defpackage.qh0.d(r17, r18, r19, r20, r21, r22)
                    kotlin.jvm.functions.Function1<s67, kotlin.Unit> r1 = r6.f
                    if (r1 == 0) goto Lbd
                    long r2 = r0.g()
                    s67 r0 = defpackage.s67.d(r2)
                    r1.invoke(r0)
                Lbd:
                    kotlin.Unit r0 = kotlin.Unit.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.m6b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ie8 ie8Var, y84<? super dj8, ? super s67, ? super cv1<? super Unit>, ? extends Object> y84Var, Function1<? super s67, Unit> function1, ej8 ej8Var, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = ie8Var;
            this.d = y84Var;
            this.e = function1;
            this.f = ej8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.c, this.d, this.e, this.f, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                qx1 qx1Var = (qx1) this.b;
                ie8 ie8Var = this.c;
                a aVar = new a(qx1Var, this.d, this.e, this.f, null);
                this.a = 1;
                if (v44.c(ie8Var, aVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
    /* renamed from: m6b$d */
    /* loaded from: classes.dex */
    public static final class d extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return m6b.e(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.r40 r9, boolean r10, defpackage.md8 r11, defpackage.cv1<? super defpackage.wd8> r12) {
        /*
            boolean r0 = r12 instanceof defpackage.m6b.b
            if (r0 == 0) goto L13
            r0 = r12
            m6b$b r0 = (defpackage.m6b.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            m6b$b r0 = new m6b$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.d
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.c
            java.lang.Object r10 = r0.b
            md8 r10 = (defpackage.md8) r10
            java.lang.Object r11 = r0.a
            r40 r11 = (defpackage.r40) r11
            defpackage.vk9.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            defpackage.vk9.b(r12)
        L42:
            r0.a = r9
            r0.b = r11
            r0.c = r10
            r0.e = r3
            java.lang.Object r12 = r9.Y(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            kd8 r12 = (defpackage.kd8) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L5d:
            if (r6 >= r4) goto L76
            java.lang.Object r7 = r2.get(r6)
            wd8 r7 = (defpackage.wd8) r7
            if (r10 == 0) goto L6c
            boolean r7 = defpackage.ld8.a(r7)
            goto L70
        L6c:
            boolean r7 = defpackage.ld8.b(r7)
        L70:
            if (r7 != 0) goto L73
            goto L42
        L73:
            int r6 = r6 + 1
            goto L5d
        L76:
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6b.b(r40, boolean, md8, cv1):java.lang.Object");
    }

    public static /* synthetic */ Object c(r40 r40Var, boolean z, md8 md8Var, cv1 cv1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            md8Var = md8.Main;
        }
        return b(r40Var, z, md8Var, cv1Var);
    }

    public static final Object d(ie8 ie8Var, y84<? super dj8, ? super s67, ? super cv1<? super Unit>, ? extends Object> y84Var, Function1<? super s67, Unit> function1, cv1<? super Unit> cv1Var) {
        Object d2;
        Object e = rx1.e(new c(ie8Var, y84Var, function1, new ej8(ie8Var), null), cv1Var);
        d2 = c75.d();
        if (e == d2) {
            return e;
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c3 -> B:13:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.r40 r18, defpackage.md8 r19, defpackage.cv1<? super defpackage.wd8> r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6b.e(r40, md8, cv1):java.lang.Object");
    }

    public static /* synthetic */ Object f(r40 r40Var, md8 md8Var, cv1 cv1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            md8Var = md8.Main;
        }
        return e(r40Var, md8Var, cv1Var);
    }
}
