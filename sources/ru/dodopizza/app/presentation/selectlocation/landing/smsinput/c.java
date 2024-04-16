package ru.dodopizza.app.presentation.selectlocation.landing.smsinput;

import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.e;
import kotlin.ranges.i;
/* compiled from: Ticker.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/c;", "Lvfb;", "Lox1;", "", "secInFuture", "Loz3;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c implements vfb, ox1 {

    /* compiled from: Ticker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<oz3<? extends b>> {
        final /* synthetic */ long a;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0614a implements oz3<b> {
            final /* synthetic */ oz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0615a<T> implements pz3 {
                final /* synthetic */ pz3 a;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.TickerInteractorImpl$startTicker$1$invoke$$inlined$map$1$2", f = "Ticker.kt", l = {224, 223}, m = "emit")
                /* renamed from: ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0616a extends ev1 {
                    /* synthetic */ Object a;
                    int b;
                    Object c;
                    long e;

                    public C0616a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0615a.this.emit(null, this);
                    }
                }

                public C0615a(pz3 pz3Var) {
                    this.a = pz3Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, defpackage.cv1 r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c.a.C0614a.C0615a.C0616a
                        if (r0 == 0) goto L13
                        r0 = r11
                        ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c$a$a$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c.a.C0614a.C0615a.C0616a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c$a$a$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c$a$a$a$a
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.a
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        defpackage.vk9.b(r11)
                        goto L80
                    L2c:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L34:
                        long r4 = r0.e
                        java.lang.Object r10 = r0.c
                        pz3 r10 = (defpackage.pz3) r10
                        defpackage.vk9.b(r11)
                        goto L60
                    L3e:
                        defpackage.vk9.b(r11)
                        pz3 r11 = r9.a
                        java.lang.Number r10 = (java.lang.Number) r10
                        long r5 = r10.longValue()
                        java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
                        r7 = 1
                        long r7 = r10.toMillis(r7)
                        r0.c = r11
                        r0.e = r5
                        r0.b = r4
                        java.lang.Object r10 = defpackage.xt2.a(r7, r0)
                        if (r10 != r1) goto L5e
                        return r1
                    L5e:
                        r10 = r11
                        r4 = r5
                    L60:
                        r6 = 0
                        int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r11 != 0) goto L69
                        ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b$a r11 = ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b.a.a
                        goto L74
                    L69:
                        ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b$b r11 = new ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b$b
                        java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                        long r4 = r2.toMillis(r4)
                        r11.<init>(r4)
                    L74:
                        r2 = 0
                        r0.c = r2
                        r0.b = r3
                        java.lang.Object r10 = r10.emit(r11, r0)
                        if (r10 != r1) goto L80
                        return r1
                    L80:
                        kotlin.Unit r10 = kotlin.Unit.a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.landing.smsinput.c.a.C0614a.C0615a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public C0614a(oz3 oz3Var) {
                this.a = oz3Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super b> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new C0615a(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<b> invoke() {
            e o;
            o = i.o(this.a, 0);
            return new C0614a(wz3.a(o));
        }
    }

    @Override // defpackage.vfb
    public oz3<b> a(long j) {
        return b(new a(j));
    }

    public <T> oz3<T> b(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }
}
