package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: RemoteConfigInteractor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001c\u0010\u001c\u001a\n \u0016*\u0004\u0018\u00010\t0\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001f"}, d2 = {"Lgd9;", "", "", "f", "Lhp;", "a", "Lhp;", "appStateProvider", "Las8;", "Lld9;", "b", "Las8;", "remoteConfigServiceProvider", "Lqx1;", c.a, "Lqx1;", "processScope", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "()Lld9;", "remoteConfigService", "<init>", "(Lhp;Las8;Lqx1;Lkx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gd9  reason: default package */
/* loaded from: classes.dex */
public final class gd9 {
    private final hp a;
    private final as8<ld9> b;
    private final qx1 c;
    private final kx1 d;
    private final rn5 e;

    /* compiled from: RemoteConfigInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.remoteconfig.presentation.RemoteConfigInteractor$init$1", f = "RemoteConfigInteractor.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: gd9$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                        gd9.this.d().error("Failed when configure remoteConfig", (Throwable) e);
                        return Unit.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var2 = (qx1) this.b;
                try {
                    hp hpVar = gd9.this.a;
                    this.b = qx1Var2;
                    this.a = 1;
                    if (ip.a(hpVar, this) == d) {
                        return d;
                    }
                    qx1Var = qx1Var2;
                } catch (Exception e3) {
                    qx1Var = qx1Var2;
                    e = e3;
                    rx1.f(qx1Var);
                    gd9.this.d().error("Failed when configure remoteConfig", (Throwable) e);
                    return Unit.a;
                }
            }
            gd9.this.e().e();
            return Unit.a;
        }
    }

    /* compiled from: RemoteConfigInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gd9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("RemoteConfigInteractor");
        }
    }

    public gd9(hp hpVar, as8<ld9> as8Var, qx1 qx1Var, kx1 kx1Var) {
        rn5 b2;
        z65.h(hpVar, "appStateProvider");
        z65.h(as8Var, "remoteConfigServiceProvider");
        z65.h(qx1Var, "processScope");
        z65.h(kx1Var, "ioDispatcher");
        this.a = hpVar;
        this.b = as8Var;
        this.c = qx1Var;
        this.d = kx1Var;
        b2 = yn5.b(b.a);
        this.e = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger d() {
        return (Logger) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ld9 e() {
        return this.b.get();
    }

    public final void f() {
        sh0.d(this.c, this.d, null, new a(null), 2, null);
    }
}
