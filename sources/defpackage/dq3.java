package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: FeatureInteractor.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010$\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'¨\u0006+"}, d2 = {"Ldq3;", "", "Ldt5;", "locality", "", "i", "(Ldt5;Lcv1;)Ljava/lang/Object;", "g", "Lbq3;", "featureCode", "Loz3;", "", Image.TYPE_HIGH, "f", "(Lbq3;Lcv1;)Ljava/lang/Object;", "Lhq3;", "a", "Lhq3;", "featureService", "Lmh0;", "b", "Lmh0;", "buildInfo", "Ljv5;", com.huawei.hms.opendevice.c.a, "Ljv5;", "localityService", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "Lfr6;", "", "Lfr6;", "featuresUpdatesTriggerFlow", "<init>", "(Lhq3;Lmh0;Ljv5;Lkx1;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dq3  reason: default package */
/* loaded from: classes4.dex */
public final class dq3 {
    private final hq3 a;
    private final mh0 b;
    private final jv5 c;
    private final kx1 d;
    private final rn5 e;
    private final fr6<String> f;

    /* compiled from: FeatureInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.feature.FeatureInteractor$isEnabled$2", f = "FeatureInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dq3$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;
        final /* synthetic */ bq3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(bq3 bq3Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = bq3Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(dq3.this.a.a(this.c));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FeatureInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dq3$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("FeatureInteractor");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dq3$c */
    /* loaded from: classes4.dex */
    public static final class c implements oz3<String> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dq3$c$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.domain.feature.FeatureInteractor$observeIsEnabled$$inlined$filter$1$2", f = "FeatureInteractor.kt", l = {223}, m = "emit")
            /* renamed from: dq3$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0290a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0290a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
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
                    boolean r0 = r6 instanceof defpackage.dq3.c.a.C0290a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dq3$c$a$a r0 = (defpackage.dq3.c.a.C0290a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    dq3$c$a$a r0 = new dq3$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    r2 = r5
                    java.lang.String r2 = (java.lang.String) r2
                    int r2 = r2.length()
                    if (r2 <= 0) goto L48
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dq3.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super String> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dq3$d */
    /* loaded from: classes4.dex */
    public static final class d implements oz3<Boolean> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ dq3 b;
        final /* synthetic */ bq3 c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: dq3$d$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ dq3 b;
            final /* synthetic */ bq3 c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.domain.feature.FeatureInteractor$observeIsEnabled$$inlined$map$1$2", f = "FeatureInteractor.kt", l = {223}, m = "emit")
            /* renamed from: dq3$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0291a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0291a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, dq3 dq3Var, bq3 bq3Var) {
                this.a = pz3Var;
                this.b = dq3Var;
                this.c = bq3Var;
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
                    boolean r0 = r6 instanceof defpackage.dq3.d.a.C0291a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dq3$d$a$a r0 = (defpackage.dq3.d.a.C0291a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    dq3$d$a$a r0 = new dq3$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L51
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    java.lang.String r5 = (java.lang.String) r5
                    dq3 r5 = r4.b
                    hq3 r5 = defpackage.dq3.b(r5)
                    bq3 r2 = r4.c
                    boolean r5 = r5.a(r2)
                    java.lang.Boolean r5 = defpackage.nf0.a(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dq3.d.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public d(oz3 oz3Var, dq3 dq3Var, bq3 bq3Var) {
            this.a = oz3Var;
            this.b = dq3Var;
            this.c = bq3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Boolean> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: FeatureInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.feature.FeatureInteractor$updateFeaturesForLocality$2", f = "FeatureInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dq3$e */
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ dt5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(dt5 dt5Var, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = dt5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List<bq3> e;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    if (nh0.b(dq3.this.b)) {
                        e = kc1.l();
                    } else {
                        e = dq3.this.c.e(this.c.d(), this.c.a());
                    }
                    dq3.this.a.b(e, this.c.a());
                    dq3.this.g();
                } catch (Exception e2) {
                    dq3.this.e().error("Failed load locality features", (Throwable) e2);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public dq3(hq3 hq3Var, mh0 mh0Var, jv5 jv5Var, kx1 kx1Var) {
        rn5 b2;
        z65.h(hq3Var, "featureService");
        z65.h(mh0Var, "buildInfo");
        z65.h(jv5Var, "localityService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = hq3Var;
        this.b = mh0Var;
        this.c = jv5Var;
        this.d = kx1Var;
        b2 = yn5.b(b.a);
        this.e = b2;
        this.f = mua.a("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger e() {
        return (Logger) this.e.getValue();
    }

    public final Object f(bq3 bq3Var, cv1<? super Boolean> cv1Var) {
        return qh0.g(this.d, new a(bq3Var, null), cv1Var);
    }

    public final void g() {
        fr6<String> fr6Var = this.f;
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "toString(...)");
        fr6Var.setValue(uuid);
    }

    public final oz3<Boolean> h(bq3 bq3Var) {
        z65.h(bq3Var, "featureCode");
        return wz3.B(wz3.o(new d(new c(this.f), this, bq3Var)), this.d);
    }

    public final Object i(dt5 dt5Var, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(this.d, new e(dt5Var, null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }
}
