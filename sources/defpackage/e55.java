package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: InstantAppStatusInteractor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR#\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Le55;", "", "", "i", "(Lcv1;)Ljava/lang/Object;", "g", "Lgc;", "a", "Lgc;", "analytics", "Lci8;", "b", "Lci8;", "preferencesAssetsDataSource", "Lc55;", com.huawei.hms.opendevice.c.a, "Lc55;", "instantAppStatusDetector", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "Lkx1;", e.a, "Lkx1;", "ioDispatcher", "Lqx1;", "f", "Lqx1;", "processScope", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", Image.TYPE_HIGH, "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lgc;Lci8;Lc55;Lhq3;Lkx1;Lqx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e55  reason: default package */
/* loaded from: classes.dex */
public final class e55 {
    private final gc a;
    private final ci8 b;
    private final c55 c;
    private final hq3 d;
    private final kx1 e;
    private final qx1 f;
    private final rn5 g;

    /* compiled from: InstantAppStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.instantappstatus.presentation.InstantAppStatusInteractor$checkInstantAppStatus$1", f = "InstantAppStatusInteractor.kt", l = {32}, m = "invokeSuspend")
    /* renamed from: e55$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
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
                e55 e55Var = e55.this;
                this.a = 1;
                if (e55Var.i(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: InstantAppStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.instantappstatus.presentation.InstantAppStatusInteractor$checkInstantAppStatus$2", f = "InstantAppStatusInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e55$b */
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

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
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e55.this.h().error("Failed to check InstantApp status", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: InstantAppStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e55$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Logger> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("InstantAppStatusInteractor");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstantAppStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.instantappstatus.presentation.InstantAppStatusInteractor$performCheck$2", f = "InstantAppStatusInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e55$d */
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (e55.this.d.a(bq3.A6) && !e55.this.b.P()) {
                    e55.this.a.a(ym.a.a(e55.this.c.a()));
                    e55.this.b.w();
                    return Unit.a;
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e55(gc gcVar, ci8 ci8Var, c55 c55Var, hq3 hq3Var, kx1 kx1Var, qx1 qx1Var) {
        rn5 b2;
        z65.h(gcVar, "analytics");
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(c55Var, "instantAppStatusDetector");
        z65.h(hq3Var, "featureService");
        z65.h(kx1Var, "ioDispatcher");
        z65.h(qx1Var, "processScope");
        this.a = gcVar;
        this.b = ci8Var;
        this.c = c55Var;
        this.d = hq3Var;
        this.e = kx1Var;
        this.f = qx1Var;
        b2 = yn5.b(c.a);
        this.g = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger h() {
        return (Logger) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(this.e, new d(null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }

    public final void g() {
        wj1.b(z77.a(hy.a(new a(null)), new b(null)), this.f);
    }
}
