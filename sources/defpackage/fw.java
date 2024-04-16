package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.jw;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AssistantSharingInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lfw;", "", "Ljw$a;", c.a, "(Lcv1;)Ljava/lang/Object;", "Ljw;", "b", "Lbw;", "a", "Lbw;", "data", "Lhq3;", "Lhq3;", "featureService", "Lkx1;", "Lkx1;", "getIoDispatcher", "()Lkx1;", "ioDispatcher", "<init>", "(Lbw;Lhq3;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fw  reason: default package */
/* loaded from: classes2.dex */
public final class fw {
    private final bw a;
    private final hq3 b;
    private final kx1 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantSharingInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.order.feature.assistant.sharing.presentation.AssistantSharingInteractor", f = "AssistantSharingInteractor.kt", l = {22}, m = "getSharingInfo")
    /* renamed from: fw$a */
    /* loaded from: classes2.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return fw.this.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantSharingInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ljw$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.sharing.presentation.AssistantSharingInteractor$resolveLogo$2", f = "AssistantSharingInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fw$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super jw.a>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super jw.a> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (fw.this.b.a(bq3.Q5)) {
                    return jw.a.b;
                }
                return jw.a.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public fw(bw bwVar, hq3 hq3Var, kx1 kx1Var) {
        z65.h(bwVar, "data");
        z65.h(hq3Var, "featureService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = bwVar;
        this.b = hq3Var;
        this.c = kx1Var;
    }

    private final Object c(cv1<? super jw.a> cv1Var) {
        return qh0.g(this.c, new b(null), cv1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cv1<? super defpackage.jw> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.fw.a
            if (r0 == 0) goto L13
            r0 = r6
            fw$a r0 = (defpackage.fw.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fw$a r0 = new fw$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            nt r0 = (defpackage.nt) r0
            defpackage.vk9.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            defpackage.vk9.b(r6)
            bw r6 = r5.a
            nt r6 = r6.a()
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r4 = r0
            r0 = r6
            r6 = r4
        L4c:
            jw$a r6 = (defpackage.jw.a) r6
            jw r1 = new jw
            r1.<init>(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.b(cv1):java.lang.Object");
    }
}
