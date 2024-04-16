package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.no6;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: PausableMonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lis7;", "Lno6;", "", DateTokenConverter.CONVERTER_KEY, "f", "R", "Lkotlin/Function1;", "", "onFrame", "S", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "a", "Lno6;", "frameClock", "Lcm5;", "b", "Lcm5;", "latch", "<init>", "(Lno6;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: is7  reason: default package */
/* loaded from: classes.dex */
public final class is7 implements no6 {
    private final no6 a;
    private final cm5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PausableMonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    /* renamed from: is7$a */
    /* loaded from: classes.dex */
    public static final class a<R> extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return is7.this.S(null, this);
        }
    }

    public is7(no6 no6Var) {
        z65.h(no6Var, "frameClock");
        this.a = no6Var;
        this.b = new cm5();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return no6.a.d(this, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7 
      PHI: (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // defpackage.no6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object S(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> r6, defpackage.cv1<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.is7.a
            if (r0 == 0) goto L13
            r0 = r7
            is7$a r0 = (defpackage.is7.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            is7$a r0 = new is7$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.b
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r2 = r0.a
            is7 r2 = (defpackage.is7) r2
            defpackage.vk9.b(r7)
            goto L53
        L40:
            defpackage.vk9.b(r7)
            cm5 r7 = r5.b
            r0.a = r5
            r0.b = r6
            r0.e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            no6 r7 = r2.a
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = r7.S(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is7.S(kotlin.jvm.functions.Function1, cv1):java.lang.Object");
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        return no6.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        return (E) no6.a.b(this, bVar);
    }

    public final void d() {
        this.b.d();
    }

    public final void f() {
        this.b.f();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.b getKey() {
        return mo6.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) no6.a.a(this, r, function2);
    }
}
