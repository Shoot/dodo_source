package defpackage;

import defpackage.fnb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: TryFlow.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u001aS\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¨\u0006\u0011"}, d2 = {"T", "Loz3;", "Lfnb;", "Lkotlin/Function1;", "", "elseAction", "a", "Lkotlin/Function2;", "Lcv1;", "", "", "failureAction", "b", "(Loz3;Lkotlin/jvm/functions/Function2;)Loz3;", "Lkotlin/Function0;", "action", com.huawei.hms.opendevice.c.a, "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: gnb  reason: default package */
/* loaded from: classes4.dex */
public final class gnb {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gnb$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements oz3<T> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ Function1 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gnb$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0337a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ Function1 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.infrastracture.functional.TryFlowKt$getOrElse$$inlined$map$1$2", f = "TryFlow.kt", l = {223}, m = "emit")
            /* renamed from: gnb$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0338a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0338a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0337a.this.emit(null, this);
                }
            }

            public C0337a(pz3 pz3Var, Function1 function1) {
                this.a = pz3Var;
                this.b = function1;
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
                    boolean r0 = r6 instanceof defpackage.gnb.a.C0337a.C0338a
                    if (r0 == 0) goto L13
                    r0 = r6
                    gnb$a$a$a r0 = (defpackage.gnb.a.C0337a.C0338a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    gnb$a$a$a r0 = new gnb$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    fnb r5 = (defpackage.fnb) r5
                    kotlin.jvm.functions.Function1 r2 = r4.b
                    java.lang.Object r5 = r5.a(r2)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.a.C0337a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var, Function1 function1) {
            this.a = oz3Var;
            this.b = function1;
        }

        @Override // defpackage.oz3
        public Object collect(pz3 pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0337a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: TryFlow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lfnb;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.TryFlowKt$onFailure$1", f = "TryFlow.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: gnb$b */
    /* loaded from: classes4.dex */
    public static final class b<T> extends f3b implements Function2<fnb<T>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function2<Throwable, cv1<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super Throwable, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super b> cv1Var) {
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
        public final Object invoke(fnb<T> fnbVar, cv1<? super Unit> cv1Var) {
            return ((b) create(fnbVar, cv1Var)).invokeSuspend(Unit.a);
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
                fnb fnbVar = (fnb) this.b;
                if (fnbVar instanceof fnb.b) {
                    Function2<Throwable, cv1<? super Unit>, Object> function2 = this.c;
                    Throwable d2 = ((fnb.b) fnbVar).d();
                    this.a = 1;
                    if (function2.invoke(d2, this) == d) {
                        return d;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: TryFlow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"T", "Lpz3;", "Lfnb;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.TryFlowKt$resultOf$1", f = "TryFlow.kt", l = {27}, m = "invokeSuspend")
    /* renamed from: gnb$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends f3b implements Function2<pz3<? super fnb<T>>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ Function0<T> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TryFlow.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: gnb$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<T> {
            final /* synthetic */ Function0<T> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function0<? extends T> function0) {
                super(0);
                this.a = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return this.a.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function0<? extends T> function0, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = function0;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.c, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super fnb<T>> pz3Var, cv1<? super Unit> cv1Var) {
            return ((c) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                fnb<T> a2 = fnb.a.a(new a(this.c));
                this.a = 1;
                if (((pz3) this.b).emit(a2, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public static final <T> oz3<T> a(oz3<? extends fnb<T>> oz3Var, Function1<? super Throwable, ? extends T> function1) {
        z65.h(oz3Var, "<this>");
        z65.h(function1, "elseAction");
        return new a(oz3Var, function1);
    }

    public static final <T> oz3<fnb<T>> b(oz3<? extends fnb<T>> oz3Var, Function2<? super Throwable, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(oz3Var, "<this>");
        z65.h(function2, "failureAction");
        return wz3.F(oz3Var, new b(function2, null));
    }

    public static final <T> oz3<fnb<T>> c(Function0<? extends T> function0) {
        z65.h(function0, "action");
        return wz3.z(new c(function0, null));
    }
}
