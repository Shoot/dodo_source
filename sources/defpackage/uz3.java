package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: FlowExtensions.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004JG\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Luz3;", "", "T", "Loz3;", "Lkotlin/Function1;", "provider", "Lbd8;", com.huawei.hms.opendevice.c.a, "Lkotlin/Function2;", "Lcv1;", "", "lastValueConsumer", "Lyl5;", "b", "(Loz3;Lkotlin/jvm/functions/Function2;)Lyl5;", "action", "a", "(Loz3;Lkotlin/jvm/functions/Function2;)Loz3;", "", "intervalMillis", DateTokenConverter.CONVERTER_KEY, "(JLkotlin/jvm/functions/Function1;)Loz3;", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uz3  reason: default package */
/* loaded from: classes4.dex */
public final class uz3 {
    public static final uz3 a = new uz3();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uz3$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements oz3<T> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: uz3$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0695a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.infrastracture.functional.FlowExtensions$onFirst$$inlined$map$1$2", f = "FlowExtensions.kt", l = {223}, m = "emit")
            /* renamed from: uz3$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0696a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0696a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0695a.this.emit(null, this);
                }
            }

            public C0695a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.uz3.a.C0695a.C0696a
                    if (r0 == 0) goto L13
                    r0 = r6
                    uz3$a$a$a r0 = (defpackage.uz3.a.C0695a.C0696a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    uz3$a$a$a r0 = new uz3$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    kotlin.collections.IndexedValue r5 = (kotlin.collections.IndexedValue) r5
                    java.lang.Object r5 = r5.b()
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uz3.a.C0695a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3 pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0695a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlin/collections/IndexedValue;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.FlowExtensions$onFirst$1", f = "FlowExtensions.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: uz3$b */
    /* loaded from: classes4.dex */
    public static final class b<T> extends f3b implements Function2<IndexedValue<? extends T>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function2<T, cv1<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = function2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(IndexedValue<? extends T> indexedValue, cv1<? super Unit> cv1Var) {
            return ((b) create(indexedValue, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                IndexedValue indexedValue = (IndexedValue) this.b;
                if (indexedValue.a() == 0) {
                    Object b = indexedValue.b();
                    this.a = 1;
                    if (this.c.invoke(b, this) == d) {
                        return d;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lpz3;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.FlowExtensions$repeatFlow$1", f = "FlowExtensions.kt", l = {49, 49, 50}, m = "invokeSuspend")
    /* renamed from: uz3$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends f3b implements Function2<pz3<? super T>, cv1<? super Unit>, Object> {
        Object a;
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ Function1<cv1<? super T>, Object> d;
        final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super cv1<? super T>, ? extends Object> function1, long j, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = function1;
            this.e = j;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, this.e, cv1Var);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            return ((c) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007e -> B:14:0x0045). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r9.b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3c
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r9.c
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r10)
                goto L44
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.c
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r10)
                r6 = r1
                r1 = r0
                r0 = r9
                goto L71
            L2c:
                java.lang.Object r1 = r9.a
                pz3 r1 = (defpackage.pz3) r1
                java.lang.Object r5 = r9.c
                pz3 r5 = (defpackage.pz3) r5
                defpackage.vk9.b(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L63
            L3c:
                defpackage.vk9.b(r10)
                java.lang.Object r10 = r9.c
                pz3 r10 = (defpackage.pz3) r10
                r1 = r10
            L44:
                r10 = r9
            L45:
                kotlin.coroutines.CoroutineContext r5 = r10.getContext()
                boolean r5 = defpackage.q95.m(r5)
                if (r5 == 0) goto L82
                kotlin.jvm.functions.Function1<cv1<? super T>, java.lang.Object> r5 = r10.d
                r10.c = r1
                r10.a = r1
                r10.b = r4
                java.lang.Object r5 = r5.invoke(r10)
                if (r5 != r0) goto L5e
                return r0
            L5e:
                r6 = r1
                r1 = r0
                r0 = r10
                r10 = r5
                r5 = r6
            L63:
                r0.c = r6
                r7 = 0
                r0.a = r7
                r0.b = r3
                java.lang.Object r10 = r5.emit(r10, r0)
                if (r10 != r1) goto L71
                return r1
            L71:
                long r7 = r0.e
                r0.c = r6
                r0.b = r2
                java.lang.Object r10 = defpackage.xt2.a(r7, r0)
                if (r10 != r1) goto L7e
                return r1
            L7e:
                r10 = r0
                r0 = r1
                r1 = r6
                goto L45
            L82:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uz3.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private uz3() {
    }

    public final <T> oz3<T> a(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(oz3Var, "<this>");
        z65.h(function2, "action");
        return new a(wz3.F(wz3.O(oz3Var), new b(function2, null)));
    }

    public final <T> yl5<T> b(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(oz3Var, "<this>");
        z65.h(function2, "lastValueConsumer");
        return new yl5<>(oz3Var, function2);
    }

    public final <T> bd8<T> c(oz3<? extends T> oz3Var, Function1<? super T, ? extends T> function1) {
        z65.h(oz3Var, "<this>");
        z65.h(function1, "provider");
        return new bd8<>(oz3Var, function1);
    }

    public final <T> oz3<T> d(long j, Function1<? super cv1<? super T>, ? extends Object> function1) {
        z65.h(function1, "action");
        return wz3.z(new c(function1, j, null));
    }
}
