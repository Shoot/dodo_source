package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LiveActivityInteractor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lpr5;", "", "", "orderId", "", DateTokenConverter.CONVERTER_KEY, "Lxda;", "a", "Lxda;", "servicePushService", "Lkx1;", "b", "Lkx1;", "ioDispatcher", "Lqx1;", c.a, "Lqx1;", "processScope", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lxda;Lkx1;Lqx1;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pr5  reason: default package */
/* loaded from: classes.dex */
public final class pr5 {
    private final xda a;
    private final kx1 b;
    private final qx1 c;
    private final rn5 d;

    /* compiled from: LiveActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pr5$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("OrderPresenter");
        }
    }

    /* compiled from: LiveActivityInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.liveactivity.presentation.LiveActivityInteractor$subscribeToLiveActivity$1", f = "LiveActivityInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pr5$b */
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
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
                try {
                    pr5.this.a.d(this.c);
                } catch (Exception e) {
                    Logger c = pr5.this.c();
                    String str = this.c;
                    c.error("Failed to perform live activity subscription for order: " + str, (Throwable) e);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public pr5(xda xdaVar, kx1 kx1Var, qx1 qx1Var) {
        rn5 b2;
        z65.h(xdaVar, "servicePushService");
        z65.h(kx1Var, "ioDispatcher");
        z65.h(qx1Var, "processScope");
        this.a = xdaVar;
        this.b = kx1Var;
        this.c = qx1Var;
        b2 = yn5.b(a.a);
        this.d = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger c() {
        return (Logger) this.d.getValue();
    }

    public final void d(String str) {
        z65.h(str, "orderId");
        sh0.d(this.c, this.b, null, new b(str, null), 2, null);
    }
}
