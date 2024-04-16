package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.cw0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ClosedSendChannelException;
/* compiled from: SimpleActor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00040\u000b\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR3\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Luka;", "T", "", RemoteMessageConst.MessageBody.MSG, "", e.a, "(Ljava/lang/Object;)V", "Lqx1;", "a", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function2;", "Lcv1;", "b", "Lkotlin/jvm/functions/Function2;", "consumeMessage", "Lrv0;", c.a, "Lrv0;", "messageQueue", "Ljava/util/concurrent/atomic/AtomicInteger;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "Lkotlin/Function1;", "", "onComplete", "onUndeliveredElement", "<init>", "(Lqx1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: uka  reason: default package */
/* loaded from: classes.dex */
public final class uka<T> {
    private final qx1 a;
    private final Function2<T, cv1<? super Unit>, Object> b;
    private final rv0<T> c;
    private final AtomicInteger d;

    /* compiled from: SimpleActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"T", "", "ex", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: uka$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> a;
        final /* synthetic */ uka<T> b;
        final /* synthetic */ Function2<T, Throwable, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Throwable, Unit> function1, uka<T> ukaVar, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.a = function1;
            this.b = ukaVar;
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Unit unit;
            this.a.invoke(th);
            ((uka) this.b).c.v(th);
            do {
                Object f = cw0.f(((uka) this.b).c.s());
                if (f == null) {
                    unit = null;
                    continue;
                } else {
                    this.c.invoke(f, th);
                    unit = Unit.a;
                    continue;
                }
            } while (unit != null);
        }
    }

    /* compiled from: SimpleActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    /* renamed from: uka$b */
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ uka<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(uka<T> ukaVar, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = ukaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r7.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                defpackage.vk9.b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.a
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                defpackage.vk9.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                defpackage.vk9.b(r8)
                uka<T> r8 = r7.c
                java.util.concurrent.atomic.AtomicInteger r8 = defpackage.uka.c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = 1
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                uka<T> r1 = r8.c
                qx1 r1 = defpackage.uka.d(r1)
                defpackage.rx1.f(r1)
                uka<T> r1 = r8.c
                kotlin.jvm.functions.Function2 r1 = defpackage.uka.a(r1)
                uka<T> r4 = r8.c
                rv0 r4 = defpackage.uka.b(r4)
                r8.a = r1
                r8.b = r3
                java.lang.Object r4 = r4.f(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.a = r5
                r0.b = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                uka<T> r1 = r8.c
                java.util.concurrent.atomic.AtomicInteger r1 = defpackage.uka.c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uka.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uka(qx1 qx1Var, Function1<? super Throwable, Unit> function1, Function2<? super T, ? super Throwable, Unit> function2, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function22) {
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "onComplete");
        z65.h(function2, "onUndeliveredElement");
        z65.h(function22, "consumeMessage");
        this.a = qx1Var;
        this.b = function22;
        this.c = bw0.b(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new AtomicInteger(0);
        l95 l95Var = (l95) qx1Var.getCoroutineContext().c(l95.M);
        if (l95Var != null) {
            l95Var.r(new a(function1, this, function2));
        }
    }

    public final void e(T t) {
        Object h = this.c.h(t);
        if (h instanceof cw0.a) {
            Throwable e = cw0.e(h);
            if (e == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
        } else if (cw0.j(h)) {
            if (this.d.getAndIncrement() == 0) {
                sh0.d(this.a, null, null, new b(this, null), 3, null);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
