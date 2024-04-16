package defpackage;

import defpackage.cw0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001a2\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Loz3;", "Lkotlin/Function1;", "", "timeoutMillis", "a", "timeoutMillisSelector", "b", "(Loz3;Lkotlin/jvm/functions/Function1;)Loz3;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: b04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class b04 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lqx1;", "Lpz3;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {222, 355}, m = "invokeSuspend")
    /* renamed from: b04$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends f3b implements y84<qx1, pz3<? super T>, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        private /* synthetic */ Object d;
        /* synthetic */ Object e;
        final /* synthetic */ Function1<T, Long> f;
        final /* synthetic */ oz3<T> g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {233}, m = "invokeSuspend")
        /* renamed from: b04$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0061a extends f3b implements Function1<cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ pz3<T> b;
            final /* synthetic */ ea9<Object> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0061a(pz3<? super T> pz3Var, ea9<Object> ea9Var, cv1<? super C0061a> cv1Var) {
                super(1, cv1Var);
                this.b = pz3Var;
                this.c = ea9Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(cv1<?> cv1Var) {
                return new C0061a(this.b, this.c, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: i */
            public final Object invoke(cv1<? super Unit> cv1Var) {
                return ((C0061a) create(cv1Var)).invokeSuspend(Unit.a);
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
                    pz3<T> pz3Var = this.b;
                    r3b r3bVar = t37.a;
                    T t = this.c.a;
                    if (t == r3bVar) {
                        t = null;
                    }
                    this.a = 1;
                    if (pz3Var.emit(t, this) == d) {
                        return d;
                    }
                }
                this.c.a = null;
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lcw0;", "", "value", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {243}, m = "invokeSuspend")
        /* renamed from: b04$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends f3b implements Function2<cw0<? extends Object>, cv1<? super Unit>, Object> {
            Object a;
            int b;
            /* synthetic */ Object c;
            final /* synthetic */ ea9<Object> d;
            final /* synthetic */ pz3<T> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ea9<Object> ea9Var, pz3<? super T> pz3Var, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.d = ea9Var;
                this.e = pz3Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                b bVar = new b(this.d, this.e, cv1Var);
                bVar.c = obj;
                return bVar;
            }

            public final Object i(Object obj, cv1<? super Unit> cv1Var) {
                return ((b) create(cw0.b(obj), cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(cw0<? extends Object> cw0Var, cv1<? super Unit> cv1Var) {
                return i(cw0Var.l(), cv1Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                ea9<Object> ea9Var;
                ea9<Object> ea9Var2;
                d = c75.d();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        ea9Var2 = (ea9) this.a;
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    T t = (T) ((cw0) this.c).l();
                    ea9Var = this.d;
                    boolean z = t instanceof cw0.c;
                    if (!z) {
                        ea9Var.a = t;
                    }
                    pz3<T> pz3Var = this.e;
                    if (z) {
                        Throwable e = cw0.e(t);
                        if (e == null) {
                            Object obj2 = ea9Var.a;
                            if (obj2 != null) {
                                if (obj2 == t37.a) {
                                    obj2 = null;
                                }
                                this.c = t;
                                this.a = ea9Var;
                                this.b = 1;
                                if (pz3Var.emit(obj2, this) == d) {
                                    return d;
                                }
                                ea9Var2 = ea9Var;
                            }
                            ea9Var.a = (T) t37.c;
                        } else {
                            throw e;
                        }
                    }
                    return Unit.a;
                }
                ea9Var = ea9Var2;
                ea9Var.a = (T) t37.c;
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ldl8;", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {211}, m = "invokeSuspend")
        /* renamed from: b04$a$c */
        /* loaded from: classes3.dex */
        public static final class c extends f3b implements Function2<dl8<? super Object>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ oz3<T> c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Delay.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: b04$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0062a<T> implements pz3 {
                final /* synthetic */ dl8<Object> a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Delay.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @nn2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {211}, m = "emit")
                /* renamed from: b04$a$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0063a extends ev1 {
                    /* synthetic */ Object a;
                    final /* synthetic */ C0062a<T> b;
                    int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0063a(C0062a<? super T> c0062a, cv1<? super C0063a> cv1Var) {
                        super(cv1Var);
                        this.b = c0062a;
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.c |= Integer.MIN_VALUE;
                        return this.b.emit(null, this);
                    }
                }

                C0062a(dl8<Object> dl8Var) {
                    this.a = dl8Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, defpackage.cv1<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof defpackage.b04.a.c.C0062a.C0063a
                        if (r0 == 0) goto L13
                        r0 = r6
                        b04$a$c$a$a r0 = (defpackage.b04.a.c.C0062a.C0063a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        b04$a$c$a$a r0 = new b04$a$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        dl8<java.lang.Object> r6 = r4.a
                        if (r5 != 0) goto L3a
                        r3b r5 = defpackage.t37.a
                    L3a:
                        r0.c = r3
                        java.lang.Object r5 = r6.p(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.b04.a.c.C0062a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(oz3<? extends T> oz3Var, cv1<? super c> cv1Var) {
                super(2, cv1Var);
                this.c = oz3Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                c cVar = new c(this.c, cv1Var);
                cVar.b = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(dl8<Object> dl8Var, cv1<? super Unit> cv1Var) {
                return ((c) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
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
                    oz3<T> oz3Var = this.c;
                    C0062a c0062a = new C0062a((dl8) this.b);
                    this.a = 1;
                    if (oz3Var.collect(c0062a, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, Long> function1, oz3<? extends T> oz3Var, cv1<? super a> cv1Var) {
            super(3, cv1Var);
            this.f = function1;
            this.g = oz3Var;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(qx1 qx1Var, pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            a aVar = new a(this.f, this.g, cv1Var);
            aVar.d = qx1Var;
            aVar.e = pz3Var;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:48|24|27|28|29|30|(1:32)|33|34|(1:36)|(1:38)(1:39)) */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            r10.Y(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00da A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:33:0x00d6, B:35:0x00da, B:38:0x00e7), top: B:49:0x00d6 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0106 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0107 -> B:11:0x006e). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.b04.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> oz3<T> a(oz3<? extends T> oz3Var, Function1<? super T, Long> function1) {
        return b(oz3Var, function1);
    }

    private static final <T> oz3<T> b(oz3<? extends T> oz3Var, Function1<? super T, Long> function1) {
        return sz3.b(new a(function1, oz3Var, null));
    }
}
