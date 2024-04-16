package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Produce.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ab\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0096\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Ldl8;", "Lkotlin/Function0;", "", "block", "a", "(Ldl8;Lkotlin/jvm/functions/Function0;Lcv1;)Ljava/lang/Object;", "E", "Lqx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lkotlin/Function2;", "Lcv1;", "", "La99;", DateTokenConverter.CONVERTER_KEY, "(Lqx1;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)La99;", "Lzg0;", "onBufferOverflow", "Lux1;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", com.huawei.hms.opendevice.c.a, "(Lqx1;Lkotlin/coroutines/CoroutineContext;ILzg0;Lux1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La99;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: bl8  reason: default package */
/* loaded from: classes3.dex */
public final class bl8 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Produce.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* renamed from: bl8$a */
    /* loaded from: classes3.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return bl8.a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: bl8$b */
    /* loaded from: classes3.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: bl8$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ fn0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(fn0<? super Unit> fn0Var) {
            super(1);
            this.a = fn0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            fn0<Unit> fn0Var = this.a;
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(Unit.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dl8<?> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5, defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof defpackage.bl8.a
            if (r0 == 0) goto L13
            r0 = r6
            bl8$a r0 = (defpackage.bl8.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bl8$a r0 = new bl8$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.a
            dl8 r4 = (defpackage.dl8) r4
            defpackage.vk9.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            defpackage.vk9.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            l95$b r2 = defpackage.l95.M
            kotlin.coroutines.CoroutineContext$Element r6 = r6.c(r2)
            if (r6 != r4) goto L7f
            r0.a = r4     // Catch: java.lang.Throwable -> L32
            r0.b = r5     // Catch: java.lang.Throwable -> L32
            r0.d = r3     // Catch: java.lang.Throwable -> L32
            gn0 r6 = new gn0     // Catch: java.lang.Throwable -> L32
            cv1 r2 = defpackage.a75.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.w()     // Catch: java.lang.Throwable -> L32
            bl8$c r2 = new bl8$c     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.g(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = defpackage.a75.d()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            defpackage.io2.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl8.a(dl8, kotlin.jvm.functions.Function0, cv1):java.lang.Object");
    }

    public static /* synthetic */ Object b(dl8 dl8Var, Function0 function0, cv1 cv1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = b.a;
        }
        return a(dl8Var, function0, cv1Var);
    }

    public static final <E> a99<E> c(qx1 qx1Var, CoroutineContext coroutineContext, int i, zg0 zg0Var, ux1 ux1Var, Function1<? super Throwable, Unit> function1, Function2<? super dl8<? super E>, ? super cv1<? super Unit>, ? extends Object> function2) {
        cl8 cl8Var = new cl8(jx1.d(qx1Var, coroutineContext), bw0.b(i, zg0Var, null, 4, null));
        if (function1 != null) {
            cl8Var.r(function1);
        }
        cl8Var.f1(ux1Var, cl8Var, function2);
        return cl8Var;
    }

    public static final <E> a99<E> d(qx1 qx1Var, CoroutineContext coroutineContext, int i, Function2<? super dl8<? super E>, ? super cv1<? super Unit>, ? extends Object> function2) {
        return c(qx1Var, coroutineContext, i, zg0.SUSPEND, ux1.DEFAULT, null, function2);
    }

    public static /* synthetic */ a99 e(qx1 qx1Var, CoroutineContext coroutineContext, int i, zg0 zg0Var, ux1 ux1Var, Function1 function1, Function2 function2, int i2, Object obj) {
        int i3;
        if ((i2 & 1) != 0) {
            coroutineContext = e.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            zg0Var = zg0.SUSPEND;
        }
        zg0 zg0Var2 = zg0Var;
        if ((i2 & 8) != 0) {
            ux1Var = ux1.DEFAULT;
        }
        ux1 ux1Var2 = ux1Var;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return c(qx1Var, coroutineContext2, i3, zg0Var2, ux1Var2, function1, function2);
    }

    public static /* synthetic */ a99 f(qx1 qx1Var, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = e.a;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return d(qx1Var, coroutineContext, i, function2);
    }
}
