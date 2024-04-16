package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LocalityScopeLifecycleHandler.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\b\b\u0001\u00109\u001a\u000206\u0012\b\b\u0001\u0010=\u001a\u00020:¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010B\u001a\n ?*\u0004\u0018\u00010>0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010D\u001a\n ?*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010C¨\u0006G"}, d2 = {"Lhv5;", "Lww9;", "", "o", "p", Image.TYPE_SMALL, "r", "", "isDarkModeEnabled", "n", "(ZLcv1;)Ljava/lang/Object;", "q", "onStart", "Ldt5;", "a", "Ldt5;", "locality", "Las8;", "Lay1;", "b", "Las8;", "countryProvider", "Lk63;", com.huawei.hms.opendevice.c.a, "Lk63;", "domainEvents", "Ljv5;", DateTokenConverter.CONVERTER_KEY, "Ljv5;", "localityService", "Lrt5;", com.huawei.hms.push.e.a, "Lrt5;", "localityInfoService", "Ldq3;", "f", "Ldq3;", "featureInteractor", "Li00;", "g", "Li00;", "authorizationState", "Lt52;", Image.TYPE_HIGH, "Lt52;", "customerService", "Li32;", "i", "Li32;", "currentLocaleProvider", "Lbo;", "j", "Lbo;", "appInitializationStateProvider", "Lkx1;", "k", "Lkx1;", "ioDispatcher", "Lqx1;", "l", "Lqx1;", "activityScope", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "Lorg/slf4j/Logger;", "logger", "()Lay1;", tmb.c.COUNTRY_JSON_NAME, "<init>", "(Ldt5;Las8;Lk63;Ljv5;Lrt5;Ldq3;Li00;Lt52;Li32;Lbo;Lkx1;Lqx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hv5  reason: default package */
/* loaded from: classes3.dex */
public final class hv5 implements ww9 {
    private final dt5 a;
    private final as8<ay1> b;
    private final k63 c;
    private final jv5 d;
    private final rt5 e;
    private final dq3 f;
    private final i00 g;
    private final t52 h;
    private final i32 i;
    private final bo j;
    private final kx1 k;
    private final qx1 l;
    private final Logger m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityScopeLifecycleHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.di.initialization.LocalityScopeLifecycleHandler$initDarkMode$2", f = "LocalityScopeLifecycleHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hv5$a */
    /* loaded from: classes3.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b) {
                    androidx.appcompat.app.d.H(-1);
                } else {
                    androidx.appcompat.app.d.H(1);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityScopeLifecycleHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.di.initialization.LocalityScopeLifecycleHandler$setupMoney$1", f = "LocalityScopeLifecycleHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hv5$b */
    /* loaded from: classes3.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.b;
                try {
                    Locale locale = hv5.this.i.get();
                    kn6 kn6Var = kn6.c;
                    kn6Var.d(hv5.this.m().b().getCode());
                    kn6Var.e(locale);
                    nn6.a.b(locale, hv5.this.m().b().getCode(), hv5.this.m().b().a());
                } catch (Exception e) {
                    rx1.f(qx1Var);
                    hv5.this.m.error("Failed to setup money utilities", (Throwable) e);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityScopeLifecycleHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.di.initialization.LocalityScopeLifecycleHandler$updateCountryLocalities$1", f = "LocalityScopeLifecycleHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hv5$c */
    /* loaded from: classes3.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.b;
                try {
                    hv5.this.d.h(hv5.this.m().getCode());
                } catch (Exception e) {
                    rx1.f(qx1Var);
                    hv5.this.m.error("Failed to update localities", (Throwable) e);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityScopeLifecycleHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.di.initialization.LocalityScopeLifecycleHandler$updateCustomer$1", f = "LocalityScopeLifecycleHandler.kt", l = {146}, m = "invokeSuspend")
    /* renamed from: hv5$d */
    /* loaded from: classes3.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            qx1 qx1Var;
            Exception e;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    qx1Var = (qx1) this.b;
                    try {
                        vk9.b(obj);
                    } catch (Exception e2) {
                        e = e2;
                        rx1.f(qx1Var);
                        hv5.this.m.error("Failed to update customer info", (Throwable) e);
                        return Unit.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var2 = (qx1) this.b;
                try {
                    bo boVar = hv5.this.j;
                    this.b = qx1Var2;
                    this.a = 1;
                    if (co.b(boVar, this) == d) {
                        return d;
                    }
                } catch (Exception e3) {
                    qx1Var = qx1Var2;
                    e = e3;
                    rx1.f(qx1Var);
                    hv5.this.m.error("Failed to update customer info", (Throwable) e);
                    return Unit.a;
                }
            }
            if (!hv5.this.g.b()) {
                return Unit.a;
            }
            hv5.this.h.B(true);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityScopeLifecycleHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.di.initialization.LocalityScopeLifecycleHandler$updateLocalityFeatures$1", f = "LocalityScopeLifecycleHandler.kt", l = {112, 114, 115, 116, 120, 120}, m = "invokeSuspend")
    /* renamed from: hv5$e */
    /* loaded from: classes3.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;
        private /* synthetic */ Object c;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
            if (((java.lang.Boolean) r7).booleanValue() == false) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:55:0x00f1, B:17:0x0035, B:48:0x00c5, B:50:0x00cd, B:51:0x00d8, B:22:0x0042, B:43:0x00a9, B:45:0x00b1, B:25:0x004a, B:38:0x008d, B:40:0x0095, B:28:0x0052), top: B:65:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:55:0x00f1, B:17:0x0035, B:48:0x00c5, B:50:0x00cd, B:51:0x00d8, B:22:0x0042, B:43:0x00a9, B:45:0x00b1, B:25:0x004a, B:38:0x008d, B:40:0x0095, B:28:0x0052), top: B:65:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00ed A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0105 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hv5.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityScopeLifecycleHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.di.initialization.LocalityScopeLifecycleHandler$updateLocalityInfo$1", f = "LocalityScopeLifecycleHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hv5$f */
    /* loaded from: classes3.dex */
    public static final class f extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.b;
                try {
                    hv5.this.e.d(hv5.this.a);
                } catch (Exception e) {
                    rx1.f(qx1Var);
                    hv5.this.m.error("Failed to update locality info", (Throwable) e);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public hv5(dt5 dt5Var, as8<ay1> as8Var, k63 k63Var, jv5 jv5Var, rt5 rt5Var, dq3 dq3Var, i00 i00Var, t52 t52Var, i32 i32Var, bo boVar, kx1 kx1Var, qx1 qx1Var) {
        z65.h(dt5Var, "locality");
        z65.h(as8Var, "countryProvider");
        z65.h(k63Var, "domainEvents");
        z65.h(jv5Var, "localityService");
        z65.h(rt5Var, "localityInfoService");
        z65.h(dq3Var, "featureInteractor");
        z65.h(i00Var, "authorizationState");
        z65.h(t52Var, "customerService");
        z65.h(i32Var, "currentLocaleProvider");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(kx1Var, "ioDispatcher");
        z65.h(qx1Var, "activityScope");
        this.a = dt5Var;
        this.b = as8Var;
        this.c = k63Var;
        this.d = jv5Var;
        this.e = rt5Var;
        this.f = dq3Var;
        this.g = i00Var;
        this.h = t52Var;
        this.i = i32Var;
        this.j = boVar;
        this.k = kx1Var;
        this.l = qx1Var;
        this.m = LoggerFactory.getLogger("MainActivityInteractor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ay1 m() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(boolean z, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(v33.c(), new a(z, null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }

    private final void o() {
        sh0.d(this.l, this.k, null, new b(null), 2, null);
    }

    private final void p() {
        sh0.d(this.l, this.k, null, new c(null), 2, null);
    }

    private final void q() {
        sh0.d(this.l, this.k, null, new d(null), 2, null);
    }

    private final void r() {
        sh0.d(this.l, this.k, null, new e(null), 2, null);
    }

    private final void s() {
        sh0.d(this.l, this.k, null, new f(null), 2, null);
    }

    @Override // defpackage.ww9
    public void onStart() {
        wta.a.d(fxa.h);
        o();
        p();
        s();
        r();
        q();
    }
}
