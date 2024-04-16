package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aX\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a`\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0001\u0010\u0006\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aT\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0001\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\b\" \u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087T¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "R", "Loz3;", "Lkotlin/Function2;", "Lcv1;", "", "transform", "a", "(Loz3;Lkotlin/jvm/functions/Function2;)Loz3;", "b", "Lkotlin/Function3;", "Lpz3;", "", DateTokenConverter.CONVERTER_KEY, "(Loz3;Ly84;)Loz3;", com.huawei.hms.opendevice.c.a, "", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: g04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class g04 {
    private static final int a = c5b.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: g04$a */
    /* loaded from: classes3.dex */
    public static final class a<R> implements oz3<oz3<? extends R>> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ Function2 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: g04$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0319a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ Function2 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @nn2(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {223, 223}, m = "emit")
            /* renamed from: g04$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0320a extends ev1 {
                /* synthetic */ Object a;
                int b;
                Object c;

                public C0320a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0319a.this.emit(null, this);
                }
            }

            public C0319a(pz3 pz3Var, Function2 function2) {
                this.a = pz3Var;
                this.b = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, defpackage.cv1 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof defpackage.g04.a.C0319a.C0320a
                    if (r0 == 0) goto L13
                    r0 = r8
                    g04$a$a$a r0 = (defpackage.g04.a.C0319a.C0320a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    g04$a$a$a r0 = new g04$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    defpackage.vk9.b(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.c
                    pz3 r7 = (defpackage.pz3) r7
                    defpackage.vk9.b(r8)
                    goto L51
                L3c:
                    defpackage.vk9.b(r8)
                    pz3 r8 = r6.a
                    kotlin.jvm.functions.Function2 r2 = r6.b
                    r0.c = r8
                    r0.b = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.c = r2
                    r0.b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.g04.a.C0319a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var, Function2 function2) {
            this.a = oz3Var;
            this.b = function2;
        }

        @Override // defpackage.oz3
        public Object collect(pz3 pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0319a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"g04$b", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: g04$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements oz3<T> {
        final /* synthetic */ oz3 a;

        public b(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            Object d;
            Object collect = this.a.collect(new c(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Loz3;", "value", "", "b", "(Loz3;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: g04$c */
    /* loaded from: classes3.dex */
    static final class c<T> implements pz3 {
        final /* synthetic */ pz3<T> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", l = {80}, m = "emit")
        /* renamed from: g04$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            final /* synthetic */ c<T> b;
            int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, cv1<? super a> cv1Var) {
                super(cv1Var);
                this.b = cVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(pz3<? super T> pz3Var) {
            this.a = pz3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // defpackage.pz3
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.oz3<? extends T> r5, defpackage.cv1<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof defpackage.g04.c.a
                if (r0 == 0) goto L13
                r0 = r6
                g04$c$a r0 = (defpackage.g04.c.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                g04$c$a r0 = new g04$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                defpackage.vk9.b(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                defpackage.vk9.b(r6)
                pz3<T> r6 = r4.a
                r0.c = r3
                java.lang.Object r5 = defpackage.wz3.q(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.g04.c.emit(oz3, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lpz3;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
    /* renamed from: g04$d */
    /* loaded from: classes3.dex */
    public static final class d<R, T> extends f3b implements y84<pz3<? super R>, T, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        /* synthetic */ Object c;
        final /* synthetic */ Function2<T, cv1<? super R>, Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super T, ? super cv1<? super R>, ? extends Object> function2, cv1<? super d> cv1Var) {
            super(3, cv1Var);
            this.d = function2;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super R> pz3Var, T t, cv1<? super Unit> cv1Var) {
            d dVar = new d(this.d, cv1Var);
            dVar.b = pz3Var;
            dVar.c = t;
            return dVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            pz3 pz3Var;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
                pz3Var = (pz3) this.b;
            } else {
                vk9.b(obj);
                pz3 pz3Var2 = (pz3) this.b;
                Object obj2 = this.c;
                this.b = pz3Var2;
                this.a = 1;
                obj = this.d.invoke(obj2, this);
                pz3Var = pz3Var2;
                if (obj == d) {
                    return d;
                }
            }
            this.b = null;
            this.a = 2;
            if (pz3Var.emit(obj, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    public static final <T, R> oz3<R> a(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super oz3<? extends R>>, ? extends Object> function2) {
        return wz3.y(new a(oz3Var, function2));
    }

    public static final <T> oz3<T> b(oz3<? extends oz3<? extends T>> oz3Var) {
        return new b(oz3Var);
    }

    public static final <T, R> oz3<R> c(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super R>, ? extends Object> function2) {
        return wz3.N(oz3Var, new d(function2, null));
    }

    public static final <T, R> oz3<R> d(oz3<? extends T> oz3Var, y84<? super pz3<? super R>, ? super T, ? super cv1<? super Unit>, ? extends Object> y84Var) {
        return new zv0(y84Var, oz3Var, null, 0, null, 28, null);
    }
}
