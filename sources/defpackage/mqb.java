package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: UnexpectedLogoutInteractor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0005\u001a\u00020\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lmqb;", "", "Loz3;", "", DateTokenConverter.CONVERTER_KEY, c.a, "Li00;", "a", "Li00;", "authorizationState", "Lgy5;", "b", "Lgy5;", "logoutInteractor", "Lkx1;", "Lkx1;", "ioDispatcher", "Lcr6;", "Lcr6;", "unauthorizedRequestsFlow", e.a, "Loz3;", "unexpectedLogoutFlow", "<init>", "(Li00;Lgy5;Lkx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mqb  reason: default package */
/* loaded from: classes.dex */
public final class mqb {
    private final i00 a;
    private final gy5 b;
    private final kx1 c;
    private final cr6<Unit> d;
    private final oz3<Unit> e;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mqb$a */
    /* loaded from: classes.dex */
    public static final class a implements oz3<Unit> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ mqb b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: mqb$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0444a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ mqb b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.core.feature.logout.presentation.UnexpectedLogoutInteractor$special$$inlined$filter$1$2", f = "UnexpectedLogoutInteractor.kt", l = {223}, m = "emit")
            /* renamed from: mqb$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0445a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0445a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0444a.this.emit(null, this);
                }
            }

            public C0444a(pz3 pz3Var, mqb mqbVar) {
                this.a = pz3Var;
                this.b = mqbVar;
            }

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
                    boolean r0 = r6 instanceof defpackage.mqb.a.C0444a.C0445a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mqb$a$a$a r0 = (defpackage.mqb.a.C0444a.C0445a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    mqb$a$a$a r0 = new mqb$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    r2 = r5
                    kotlin.Unit r2 = (kotlin.Unit) r2
                    mqb r2 = r4.b
                    i00 r2 = defpackage.mqb.a(r2)
                    boolean r2 = r2.b()
                    if (r2 == 0) goto L4e
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mqb.a.C0444a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var, mqb mqbVar) {
            this.a = oz3Var;
            this.b = mqbVar;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Unit> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0444a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: UnexpectedLogoutInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.logout.presentation.UnexpectedLogoutInteractor$unexpectedLogoutFlow$2", f = "UnexpectedLogoutInteractor.kt", l = {26}, m = "invokeSuspend")
    /* renamed from: mqb$b */
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((b) create(unit, cv1Var)).invokeSuspend(Unit.a);
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
                gy5 gy5Var = mqb.this.b;
                this.a = 1;
                if (gy5Var.f(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public mqb(i00 i00Var, gy5 gy5Var, kx1 kx1Var) {
        z65.h(i00Var, "authorizationState");
        z65.h(gy5Var, "logoutInteractor");
        z65.h(kx1Var, "ioDispatcher");
        this.a = i00Var;
        this.b = gy5Var;
        this.c = kx1Var;
        cr6<Unit> b2 = uha.b(0, 1, null, 5, null);
        this.d = b2;
        this.e = wz3.F(new a(b2, this), new b(null));
    }

    public final void c() {
        this.d.a(Unit.a);
    }

    public final oz3<Unit> d() {
        return wz3.B(this.e, this.c);
    }
}
