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
/* compiled from: LogoutInteractor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, d2 = {"Lgy5;", "", "", "f", "(Lcv1;)Ljava/lang/Object;", "Li00;", "a", "Li00;", "authorizationState", "Lxda;", "b", "Lxda;", "servicePushService", "Ldua;", c.a, "Ldua;", "stateAnalyzer", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Li00;Lxda;Ldua;Lkx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gy5  reason: default package */
/* loaded from: classes.dex */
public final class gy5 {
    private final i00 a;
    private final xda b;
    private final dua c;
    private final kx1 d;
    private final rn5 e;

    /* compiled from: LogoutInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gy5$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("LogoutInteractor");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LogoutInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.logout.presentation.LogoutInteractor$logout$2", f = "LogoutInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gy5$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
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
                if (!gy5.this.a.b()) {
                    return Unit.a;
                }
                try {
                    gy5.this.b.b();
                } catch (Exception e) {
                    gy5.this.e().warn("Unregister service push failure", (Throwable) e);
                }
                gy5.this.c.a();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public gy5(i00 i00Var, xda xdaVar, dua duaVar, kx1 kx1Var) {
        rn5 b2;
        z65.h(i00Var, "authorizationState");
        z65.h(xdaVar, "servicePushService");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(kx1Var, "ioDispatcher");
        this.a = i00Var;
        this.b = xdaVar;
        this.c = duaVar;
        this.d = kx1Var;
        b2 = yn5.b(a.a);
        this.e = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger e() {
        return (Logger) this.e.getValue();
    }

    public final Object f(cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.d, new b(null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }
}
