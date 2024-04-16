package defpackage;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LastLocationProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u0004*\u00060\u0002j\u0002`\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lam5;", "Lzl5;", "Landroid/location/Location;", "Lru/dodopizza/app/infrastracture/location/AndroidLocation;", "Lov5;", DateTokenConverter.CONVERTER_KEY, "get", "Lje4;", "a", "Lje4;", "factory", "Ljgb;", "b", "Ljgb;", "timeFormatter", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", c.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lje4;Ljgb;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: am5  reason: default package */
/* loaded from: classes4.dex */
public final class am5 implements zl5 {
    private final je4 a;
    private final jgb b;
    private final Logger c;

    /* compiled from: LastLocationProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lov5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.location.LastLocationProviderImpl$get$1", f = "LastLocationProvider.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: am5$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super ov5>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LastLocationProvider.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Landroid/location/Location;", "", e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.infrastracture.location.LastLocationProviderImpl$get$1$2", f = "LastLocationProvider.kt", l = {}, m = "invokeSuspend")
        /* renamed from: am5$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0002a extends f3b implements y84<pz3<? super Location>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ am5 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0002a(am5 am5Var, cv1<? super C0002a> cv1Var) {
                super(3, cv1Var);
                this.c = am5Var;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super Location> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                C0002a c0002a = new C0002a(this.c, cv1Var);
                c0002a.b = th;
                return c0002a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.c.warn("Failed to get last location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
        /* renamed from: am5$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements oz3<Object> {
            final /* synthetic */ oz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: am5$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0003a<T> implements pz3 {
                final /* synthetic */ pz3 a;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @nn2(c = "ru.dodopizza.app.infrastracture.location.LastLocationProviderImpl$get$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "LastLocationProvider.kt", l = {224}, m = "emit")
                /* renamed from: am5$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0004a extends ev1 {
                    /* synthetic */ Object a;
                    int b;

                    public C0004a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0003a.this.emit(null, this);
                    }
                }

                public C0003a(pz3 pz3Var) {
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
                        boolean r0 = r6 instanceof defpackage.am5.a.b.C0003a.C0004a
                        if (r0 == 0) goto L13
                        r0 = r6
                        am5$a$b$a$a r0 = (defpackage.am5.a.b.C0003a.C0004a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        am5$a$b$a$a r0 = new am5$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        pz3 r6 = r4.a
                        boolean r2 = r5 instanceof defpackage.cw5.d
                        if (r2 == 0) goto L43
                        r0.b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.am5.a.b.C0003a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public b(oz3 oz3Var) {
                this.a = oz3Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new C0003a(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
        /* renamed from: am5$a$c */
        /* loaded from: classes4.dex */
        public static final class c implements oz3<Location> {
            final /* synthetic */ oz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: am5$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0005a<T> implements pz3 {
                final /* synthetic */ pz3 a;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @nn2(c = "ru.dodopizza.app.infrastracture.location.LastLocationProviderImpl$get$1$invokeSuspend$$inlined$map$1$2", f = "LastLocationProvider.kt", l = {223}, m = "emit")
                /* renamed from: am5$a$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0006a extends ev1 {
                    /* synthetic */ Object a;
                    int b;

                    public C0006a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0005a.this.emit(null, this);
                    }
                }

                public C0005a(pz3 pz3Var) {
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
                        boolean r0 = r6 instanceof defpackage.am5.a.c.C0005a.C0006a
                        if (r0 == 0) goto L13
                        r0 = r6
                        am5$a$c$a$a r0 = (defpackage.am5.a.c.C0005a.C0006a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        am5$a$c$a$a r0 = new am5$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        pz3 r6 = r4.a
                        cw5$d r5 = (defpackage.cw5.d) r5
                        android.location.Location r5 = r5.a()
                        r0.b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.am5.a.c.C0005a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public c(oz3 oz3Var) {
                this.a = oz3Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super Location> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new C0005a(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super ov5> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(new c(new b(qv5.a.a(am5.this.a).a())), new C0002a(am5.this, null));
                this.a = 1;
                obj = wz3.w(h, this);
                if (obj == d) {
                    return d;
                }
            }
            Location location = (Location) obj;
            if (location != null) {
                return am5.this.d(location);
            }
            return null;
        }
    }

    public am5(je4 je4Var, jgb jgbVar) {
        z65.h(je4Var, "factory");
        z65.h(jgbVar, "timeFormatter");
        this.a = je4Var;
        this.b = jgbVar;
        this.c = LoggerFactory.getLogger("LastLocationProviderImpl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ov5 d(Location location) {
        return new ov5(location.getLatitude(), location.getLongitude(), Float.valueOf(location.getAccuracy()), this.b.b(location.getTime()));
    }

    @Override // defpackage.zl5
    public ov5 get() {
        return (ov5) qh0.f(null, new a(null), 1, null);
    }
}
