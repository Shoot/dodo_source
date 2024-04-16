package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aV\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u0010*\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"T", "Loz3;", "Lkotlin/Function3;", "Lpz3;", "", "Lcv1;", "", "", "action", "a", "(Loz3;Ly84;)Loz3;", "collector", "b", "(Loz3;Lpz3;Lcv1;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", com.huawei.hms.opendevice.c.a, "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: e04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class e04 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"e04$a", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: e04$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements oz3<T> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ y84 b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
        /* renamed from: e04$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0294a extends ev1 {
            /* synthetic */ Object a;
            int b;
            Object d;
            Object e;

            public C0294a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(oz3 oz3Var, y84 y84Var) {
            this.a = oz3Var;
            this.b = y84Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        @Override // defpackage.oz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(defpackage.pz3<? super T> r6, defpackage.cv1<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.e04.a.C0294a
                if (r0 == 0) goto L13
                r0 = r7
                e04$a$a r0 = (defpackage.e04.a.C0294a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                e04$a$a r0 = new e04$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                defpackage.vk9.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.e
                pz3 r6 = (defpackage.pz3) r6
                java.lang.Object r2 = r0.d
                e04$a r2 = (defpackage.e04.a) r2
                defpackage.vk9.b(r7)
                goto L53
            L40:
                defpackage.vk9.b(r7)
                oz3 r7 = r5.a
                r0.d = r5
                r0.e = r6
                r0.b = r4
                java.lang.Object r7 = defpackage.wz3.i(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                y84 r2 = r2.b
                r4 = 0
                r0.d = r4
                r0.e = r4
                r0.b = r3
                r3 = 6
                defpackage.d35.a(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                defpackage.d35.a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.e04.a.collect(pz3, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Errors.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
    /* renamed from: e04$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int c;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return wz3.i(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: e04$c */
    /* loaded from: classes3.dex */
    public static final class c<T> implements pz3 {
        final /* synthetic */ pz3<T> a;
        final /* synthetic */ ea9<Throwable> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Errors.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
        /* renamed from: e04$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            Object a;
            /* synthetic */ Object b;
            final /* synthetic */ c<T> c;
            int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, cv1<? super a> cv1Var) {
                super(cv1Var);
                this.c = cVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(pz3<? super T> pz3Var, ea9<Throwable> ea9Var) {
            this.a = pz3Var;
            this.b = ea9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, defpackage.cv1<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof defpackage.e04.c.a
                if (r0 == 0) goto L13
                r0 = r6
                e04$c$a r0 = (defpackage.e04.c.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                e04$c$a r0 = new e04$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.b
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.a
                e04$c r5 = (defpackage.e04.c) r5
                defpackage.vk9.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                defpackage.vk9.b(r6)
                pz3<T> r6 = r4.a     // Catch: java.lang.Throwable -> L4a
                r0.a = r4     // Catch: java.lang.Throwable -> L4a
                r0.d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                ea9<java.lang.Throwable> r5 = r5.b
                r5.a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.e04.c.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    public static final <T> oz3<T> a(oz3<? extends T> oz3Var, y84<? super pz3<? super T>, ? super Throwable, ? super cv1<? super Unit>, ? extends Object> y84Var) {
        return new a(oz3Var, y84Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(defpackage.oz3<? extends T> r4, defpackage.pz3<? super T> r5, defpackage.cv1<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof defpackage.e04.b
            if (r0 == 0) goto L13
            r0 = r6
            e04$b r0 = (defpackage.e04.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            e04$b r0 = new e04$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.a
            ea9 r4 = (defpackage.ea9) r4
            defpackage.vk9.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            defpackage.vk9.b(r6)
            ea9 r6 = new ea9
            r6.<init>()
            e04$c r2 = new e04$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.a = r6     // Catch: java.lang.Throwable -> L51
            r0.c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            defpackage.ul3.a(r4, r5)
            throw r4
        L72:
            defpackage.ul3.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e04.b(oz3, pz3, cv1):java.lang.Object");
    }

    private static final boolean c(Throwable th, CoroutineContext coroutineContext) {
        l95 l95Var = (l95) coroutineContext.c(l95.M);
        if (l95Var != null && l95Var.isCancelled()) {
            return d(th, l95Var.q());
        }
        return false;
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null && z65.c(th2, th)) {
            return true;
        }
        return false;
    }
}
