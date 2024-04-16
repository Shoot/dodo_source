package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aW\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"S", "T", "Loz3;", "Lkotlin/Function3;", "Lcv1;", "", "operation", DateTokenConverter.CONVERTER_KEY, "(Loz3;Ly84;Lcv1;)Ljava/lang/Object;", "a", "(Loz3;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "predicate", "b", "(Loz3;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", com.huawei.hms.opendevice.c.a, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: h04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h04 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"h04$a", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: h04$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements pz3<T> {
        final /* synthetic */ ea9 a;

        public a(ea9 ea9Var) {
            this.a = ea9Var;
        }

        @Override // defpackage.pz3
        public Object emit(T t, cv1<? super Unit> cv1Var) {
            this.a.a = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"h04$b", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: h04$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements pz3<T> {
        final /* synthetic */ Function2 a;
        final /* synthetic */ ea9 b;

        /* compiled from: Limit.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
        /* renamed from: h04$b$a */
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
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, ea9 ea9Var) {
            this.a = function2;
            this.b = ea9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, defpackage.cv1<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof defpackage.h04.b.a
                if (r0 == 0) goto L13
                r0 = r6
                h04$b$a r0 = (defpackage.h04.b.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                h04$b$a r0 = new h04$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.b
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.e
                java.lang.Object r0 = r0.a
                h04$b r0 = (defpackage.h04.b) r0
                defpackage.vk9.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                defpackage.vk9.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.a
                r0.a = r4
                r0.e = r5
                r0.c = r3
                r2 = 6
                defpackage.d35.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                defpackage.d35.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            L5d:
                ea9 r6 = r0.b
                r6.a = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.b.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* renamed from: h04$c */
    /* loaded from: classes3.dex */
    public static final class c<T> extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return wz3.u(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* renamed from: h04$d */
    /* loaded from: classes3.dex */
    public static final class d<T> extends ev1 {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int e;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return wz3.v(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"h04$e", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: h04$e */
    /* loaded from: classes3.dex */
    public static final class e<T> implements pz3<T> {
        final /* synthetic */ ea9 a;

        public e(ea9 ea9Var) {
            this.a = ea9Var;
        }

        @Override // defpackage.pz3
        public Object emit(T t, cv1<? super Unit> cv1Var) {
            this.a.a = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "firstOrNull")
    /* renamed from: h04$f */
    /* loaded from: classes3.dex */
    public static final class f<T> extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        f(cv1<? super f> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return wz3.w(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {22}, m = "reduce")
    /* renamed from: h04$g */
    /* loaded from: classes3.dex */
    public static final class g<S, T extends S> extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int c;

        g(cv1<? super g> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return wz3.J(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: h04$h */
    /* loaded from: classes3.dex */
    public static final class h<T> implements pz3 {
        final /* synthetic */ ea9<Object> a;
        final /* synthetic */ y84<S, T, cv1<? super S>, Object> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Reduce.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", l = {25}, m = "emit")
        /* renamed from: h04$h$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            Object a;
            /* synthetic */ Object b;
            final /* synthetic */ h<T> c;
            int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h<? super T> hVar, cv1<? super a> cv1Var) {
                super(cv1Var);
                this.c = hVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(ea9<Object> ea9Var, y84<? super S, ? super T, ? super cv1<? super S>, ? extends Object> y84Var) {
            this.a = ea9Var;
            this.b = y84Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Type inference failed for: r8v5 */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, defpackage.cv1<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof defpackage.h04.h.a
                if (r0 == 0) goto L13
                r0 = r8
                h04$h$a r0 = (defpackage.h04.h.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                h04$h$a r0 = new h04$h$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.b
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.a
                ea9 r7 = (defpackage.ea9) r7
                defpackage.vk9.b(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                defpackage.vk9.b(r8)
                ea9<java.lang.Object> r8 = r6.a
                T r2 = r8.a
                r3b r4 = defpackage.t37.a
                if (r2 == r4) goto L53
                y84<S, T, cv1<? super S>, java.lang.Object> r4 = r6.b
                r0.a = r8
                r0.d = r3
                java.lang.Object r7 = r4.invoke(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.a = r7
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.h.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(defpackage.oz3<? extends T> r4, defpackage.cv1<? super T> r5) {
        /*
            boolean r0 = r5 instanceof defpackage.h04.c
            if (r0 == 0) goto L13
            r0 = r5
            h04$c r0 = (defpackage.h04.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            h04$c r0 = new h04$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.b
            h04$a r4 = (defpackage.h04.a) r4
            java.lang.Object r0 = r0.a
            ea9 r0 = (defpackage.ea9) r0
            defpackage.vk9.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            defpackage.vk9.b(r5)
            ea9 r5 = new ea9
            r5.<init>()
            r3b r2 = defpackage.t37.a
            r5.a = r2
            h04$a r2 = new h04$a
            r2.<init>(r5)
            r0.a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            defpackage.tz3.a(r5, r4)
        L62:
            T r4 = r0.a
            r3b r5 = defpackage.t37.a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.a(oz3, cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(defpackage.oz3<? extends T> r4, kotlin.jvm.functions.Function2<? super T, ? super defpackage.cv1<? super java.lang.Boolean>, ? extends java.lang.Object> r5, defpackage.cv1<? super T> r6) {
        /*
            boolean r0 = r6 instanceof defpackage.h04.d
            if (r0 == 0) goto L13
            r0 = r6
            h04$d r0 = (defpackage.h04.d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            h04$d r0 = new h04$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.c
            h04$b r4 = (defpackage.h04.b) r4
            java.lang.Object r5 = r0.b
            ea9 r5 = (defpackage.ea9) r5
            java.lang.Object r0 = r0.a
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            defpackage.vk9.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            defpackage.vk9.b(r6)
            ea9 r6 = new ea9
            r6.<init>()
            r3b r2 = defpackage.t37.a
            r6.a = r2
            h04$b r2 = new h04$b
            r2.<init>(r5, r6)
            r0.a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.b = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            defpackage.tz3.a(r6, r4)
        L6a:
            T r4 = r5.a
            r3b r5 = defpackage.t37.a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.b(oz3, kotlin.jvm.functions.Function2, cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(defpackage.oz3<? extends T> r4, defpackage.cv1<? super T> r5) {
        /*
            boolean r0 = r5 instanceof defpackage.h04.f
            if (r0 == 0) goto L13
            r0 = r5
            h04$f r0 = (defpackage.h04.f) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            h04$f r0 = new h04$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.b
            h04$e r4 = (defpackage.h04.e) r4
            java.lang.Object r0 = r0.a
            ea9 r0 = (defpackage.ea9) r0
            defpackage.vk9.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            defpackage.vk9.b(r5)
            ea9 r5 = new ea9
            r5.<init>()
            h04$e r2 = new h04$e
            r2.<init>(r5)
            r0.a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            defpackage.tz3.a(r5, r4)
        L5e:
            T r4 = r0.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.c(oz3, cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Type inference failed for: r2v1, types: [r3b, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object d(defpackage.oz3<? extends T> r4, defpackage.y84<? super S, ? super T, ? super defpackage.cv1<? super S>, ? extends java.lang.Object> r5, defpackage.cv1<? super S> r6) {
        /*
            boolean r0 = r6 instanceof defpackage.h04.g
            if (r0 == 0) goto L13
            r0 = r6
            h04$g r0 = (defpackage.h04.g) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            h04$g r0 = new h04$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            ea9 r4 = (defpackage.ea9) r4
            defpackage.vk9.b(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.vk9.b(r6)
            ea9 r6 = new ea9
            r6.<init>()
            r3b r2 = defpackage.t37.a
            r6.a = r2
            h04$h r2 = new h04$h
            r2.<init>(r6, r5)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.a
            r3b r5 = defpackage.t37.a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.d(oz3, y84, cv1):java.lang.Object");
    }
}
