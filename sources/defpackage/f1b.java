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
/* compiled from: SubscribeToNewsInteractor.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010\"\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0010\u0010!¨\u0006%"}, d2 = {"Lf1b;", "", "Lzx6;", "sender", "", DateTokenConverter.CONVERTER_KEY, e.a, "Lgc;", "a", "Lgc;", "analytics", "Li00;", "b", "Li00;", "authorizationState", "Lt52;", c.a, "Lt52;", "customerService", "Lk63;", "Lk63;", "domainEvents", "Lkx1;", "Lkx1;", "ioDispatcher", "Lqx1;", "f", "Lqx1;", "processScope", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lgc;Li00;Lt52;Lk63;Lkx1;Lqx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: f1b  reason: default package */
/* loaded from: classes4.dex */
public final class f1b {
    private final gc a;
    private final i00 b;
    private final t52 c;
    private final k63 d;
    private final kx1 e;
    private final qx1 f;
    private final rn5 g;

    /* compiled from: SubscribeToNewsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f1b$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("SubscribeToNewsInteractor");
        }
    }

    /* compiled from: SubscribeToNewsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profilesettings.SubscribeToNewsInteractor$subscribe$1", f = "SubscribeToNewsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f1b$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ zx6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zx6 zx6Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = zx6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.d, cv1Var);
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
                    f1b.this.d(this.d);
                } catch (Exception e) {
                    rx1.f(qx1Var);
                    f1b.this.c().error("Failed to subscribe the user to news", (Throwable) e);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f1b(gc gcVar, i00 i00Var, t52 t52Var, k63 k63Var, kx1 kx1Var, qx1 qx1Var) {
        rn5 b2;
        z65.h(gcVar, "analytics");
        z65.h(i00Var, "authorizationState");
        z65.h(t52Var, "customerService");
        z65.h(k63Var, "domainEvents");
        z65.h(kx1Var, "ioDispatcher");
        z65.h(qx1Var, "processScope");
        this.a = gcVar;
        this.b = i00Var;
        this.c = t52Var;
        this.d = k63Var;
        this.e = kx1Var;
        this.f = qx1Var;
        b2 = yn5.b(a.a);
        this.g = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger c() {
        return (Logger) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(zx6 zx6Var) {
        if (this.b.b()) {
            this.c.x(true);
            this.a.a(new yx6(xx6.b, zx6Var));
            this.d.b(j63.k);
        }
    }

    public final void e(zx6 zx6Var) {
        z65.h(zx6Var, "sender");
        sh0.d(this.f, this.e, null, new b(zx6Var, null), 2, null);
    }
}
