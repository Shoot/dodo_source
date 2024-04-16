package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aJ\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a+\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\r\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aJ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Loz3;", "Lkotlin/Function2;", "Lcv1;", "", "", "predicate", "b", "(Loz3;Lkotlin/jvm/functions/Function2;)Loz3;", "", "count", DateTokenConverter.CONVERTER_KEY, "Lpz3;", "value", "", com.huawei.hms.opendevice.c.a, "(Lpz3;Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", com.huawei.hms.push.e.a, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: f04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class f04 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"f04$a", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: f04$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements oz3<T> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ Function2 b;

        public a(oz3 oz3Var, Function2 function2) {
            this.a = oz3Var;
            this.b = function2;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            Object d;
            Object collect = this.a.collect(new b(new aa9(), pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: f04$b */
    /* loaded from: classes3.dex */
    static final class b<T> implements pz3 {
        final /* synthetic */ aa9 a;
        final /* synthetic */ pz3<T> b;
        final /* synthetic */ Function2<T, cv1<? super Boolean>, Object> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* renamed from: f04$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            Object a;
            Object b;
            /* synthetic */ Object c;
            final /* synthetic */ b<T> d;
            int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, cv1<? super a> cv1Var) {
                super(cv1Var);
                this.d = bVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(aa9 aa9Var, pz3<? super T> pz3Var, Function2<? super T, ? super cv1<? super Boolean>, ? extends Object> function2) {
            this.a = aa9Var;
            this.b = pz3Var;
            this.c = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, defpackage.cv1<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof defpackage.f04.b.a
                if (r0 == 0) goto L13
                r0 = r8
                f04$b$a r0 = (defpackage.f04.b.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                f04$b$a r0 = new f04$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.c
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                defpackage.vk9.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.b
                java.lang.Object r2 = r0.a
                f04$b r2 = (defpackage.f04.b) r2
                defpackage.vk9.b(r8)
                goto L6c
            L41:
                defpackage.vk9.b(r8)
                goto L59
            L45:
                defpackage.vk9.b(r8)
                aa9 r8 = r6.a
                boolean r8 = r8.a
                if (r8 == 0) goto L5c
                pz3<T> r8 = r6.b
                r0.e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, cv1<? super java.lang.Boolean>, java.lang.Object> r8 = r6.c
                r0.a = r6
                r0.b = r7
                r0.e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                aa9 r8 = r2.a
                r8.a = r5
                pz3<T> r8 = r2.b
                r2 = 0
                r0.a = r2
                r0.b = r2
                r0.e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.f04.b.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
    /* renamed from: f04$c */
    /* loaded from: classes3.dex */
    public static final class c<T> extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int c;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return f04.c(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"f04$d", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: f04$d */
    /* loaded from: classes3.dex */
    public static final class d<T> implements oz3<T> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ int b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
        /* renamed from: f04$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            int b;
            Object d;

            public a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(oz3 oz3Var, int i) {
            this.a = oz3Var;
            this.b = i;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
            defpackage.tz3.a(r8, r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // defpackage.oz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(defpackage.pz3<? super T> r7, defpackage.cv1<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof defpackage.f04.d.a
                if (r0 == 0) goto L13
                r0 = r8
                f04$d$a r0 = (defpackage.f04.d.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                f04$d$a r0 = new f04$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.d
                pz3 r7 = (defpackage.pz3) r7
                defpackage.vk9.b(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L53
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                defpackage.vk9.b(r8)
                ca9 r8 = new ca9
                r8.<init>()
                oz3 r2 = r6.a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                f04$e r4 = new f04$e     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                int r5 = r6.b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                r0.d = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                r0.b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                if (r7 != r1) goto L56
                return r1
            L53:
                defpackage.tz3.a(r8, r7)
            L56:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.f04.d.collect(pz3, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: f04$e */
    /* loaded from: classes3.dex */
    public static final class e<T> implements pz3 {
        final /* synthetic */ ca9 a;
        final /* synthetic */ int b;
        final /* synthetic */ pz3<T> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {61, 63}, m = "emit")
        /* renamed from: f04$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            final /* synthetic */ e<T> b;
            int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, cv1<? super a> cv1Var) {
                super(cv1Var);
                this.b = eVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(ca9 ca9Var, int i, pz3<? super T> pz3Var) {
            this.a = ca9Var;
            this.b = i;
            this.c = pz3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, defpackage.cv1<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.f04.e.a
                if (r0 == 0) goto L13
                r0 = r7
                f04$e$a r0 = (defpackage.f04.e.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                f04$e$a r0 = new f04$e$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                defpackage.vk9.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                defpackage.vk9.b(r7)
                goto L51
            L38:
                defpackage.vk9.b(r7)
                ca9 r7 = r5.a
                int r2 = r7.a
                int r2 = r2 + r4
                r7.a = r2
                int r7 = r5.b
                if (r2 >= r7) goto L54
                pz3<T> r7 = r5.c
                r0.c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            L54:
                pz3<T> r7 = r5.c
                r0.c = r3
                java.lang.Object r6 = defpackage.f04.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.f04.e.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"f04$f", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: f04$f */
    /* loaded from: classes3.dex */
    public static final class f<T> implements oz3<T> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ Function2 b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {124}, m = "collect")
        /* renamed from: f04$f$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            int b;
            Object d;

            public a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(oz3 oz3Var, Function2 function2) {
            this.a = oz3Var;
            this.b = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // defpackage.oz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(defpackage.pz3<? super T> r6, defpackage.cv1<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.f04.f.a
                if (r0 == 0) goto L13
                r0 = r7
                f04$f$a r0 = (defpackage.f04.f.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                f04$f$a r0 = new f04$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.d
                f04$g r6 = (defpackage.f04.g) r6
                defpackage.vk9.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                defpackage.vk9.b(r7)
                oz3 r7 = r5.a
                f04$g r2 = new f04$g
                kotlin.jvm.functions.Function2 r4 = r5.b
                r2.<init>(r4, r6)
                r0.d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                r0.b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                defpackage.tz3.a(r7, r6)
            L53:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.f04.f.collect(pz3, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"f04$g", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: f04$g */
    /* loaded from: classes3.dex */
    public static final class g<T> implements pz3<T> {
        final /* synthetic */ Function2 a;
        final /* synthetic */ pz3 b;

        /* compiled from: Limit.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", l = {142, 143}, m = "emit")
        /* renamed from: f04$g$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            Object a;
            /* synthetic */ Object b;
            int c;
            Object e;

            public a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                return g.this.emit(null, this);
            }
        }

        public g(Function2 function2, pz3 pz3Var) {
            this.a = function2;
            this.b = pz3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, defpackage.cv1<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof defpackage.f04.g.a
                if (r0 == 0) goto L13
                r0 = r9
                f04$g$a r0 = (defpackage.f04.g.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                f04$g$a r0 = new f04$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.b
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.a
                f04$g r8 = (defpackage.f04.g) r8
                defpackage.vk9.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.e
                java.lang.Object r2 = r0.a
                f04$g r2 = (defpackage.f04.g) r2
                defpackage.vk9.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                defpackage.vk9.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.a
                r0.a = r7
                r0.e = r8
                r0.c = r4
                r2 = 6
                defpackage.d35.a(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                defpackage.d35.a(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                pz3 r2 = r8.b
                r0.a = r8
                r5 = 0
                r0.e = r5
                r0.c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            L81:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.f04.g.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    public static final <T> oz3<T> b(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super Boolean>, ? extends Object> function2) {
        return new a(oz3Var, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(defpackage.pz3<? super T> r4, T r5, defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof defpackage.f04.c
            if (r0 == 0) goto L13
            r0 = r6
            f04$c r0 = (defpackage.f04.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            f04$c r0 = new f04$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.a
            pz3 r4 = (defpackage.pz3) r4
            defpackage.vk9.b(r6)
            goto L43
        L35:
            defpackage.vk9.b(r6)
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f04.c(pz3, java.lang.Object, cv1):java.lang.Object");
    }

    public static final <T> oz3<T> d(oz3<? extends T> oz3Var, int i) {
        if (i > 0) {
            return new d(oz3Var, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }

    public static final <T> oz3<T> e(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super Boolean>, ? extends Object> function2) {
        return new f(oz3Var, function2);
    }
}
