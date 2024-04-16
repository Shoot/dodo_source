package defpackage;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CaptchaInteractor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n \u0019*\u0004\u0018\u00010\r0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001fR\u001c\u0010\"\u001a\n \u0019*\u0004\u0018\u00010\t0\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!¨\u0006%"}, d2 = {"Llo0;", "", "", Image.TYPE_HIGH, "Lhp;", "a", "Lhp;", "appStateProvider", "Las8;", "Landroid/app/Application;", "b", "Las8;", "applicationProvider", "Lbo0;", c.a, "captchaActivityHolderProvider", "Lqx1;", DateTokenConverter.CONVERTER_KEY, "Lqx1;", "processScope", "Lkx1;", e.a, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lrn5;", "g", "()Lorg/slf4j/Logger;", "logger", "()Lbo0;", "captchaActivityHolder", "()Landroid/app/Application;", "application", "<init>", "(Lhp;Las8;Las8;Lqx1;Lkx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lo0  reason: default package */
/* loaded from: classes.dex */
public final class lo0 {
    private final hp a;
    private final as8<Application> b;
    private final as8<bo0> c;
    private final qx1 d;
    private final kx1 e;
    private final rn5 f;

    /* compiled from: CaptchaInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.captcha.presentation.CaptchaInteractor$init$1", f = "CaptchaInteractor.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: lo0$a */
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
                        lo0.this.g().error("Failed to init captcha", (Throwable) e);
                        return Unit.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var2 = (qx1) this.b;
                try {
                    hp hpVar = lo0.this.a;
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
                    lo0.this.g().error("Failed to init captcha", (Throwable) e);
                    return Unit.a;
                }
            }
            bo0 f = lo0.this.f();
            Application e4 = lo0.this.e();
            z65.g(e4, "access$getApplication(...)");
            f.b(e4);
            return Unit.a;
        }
    }

    /* compiled from: CaptchaInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lo0$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("CaptchaInitializer");
        }
    }

    public lo0(hp hpVar, as8<Application> as8Var, as8<bo0> as8Var2, qx1 qx1Var, kx1 kx1Var) {
        rn5 b2;
        z65.h(hpVar, "appStateProvider");
        z65.h(as8Var, "applicationProvider");
        z65.h(as8Var2, "captchaActivityHolderProvider");
        z65.h(qx1Var, "processScope");
        z65.h(kx1Var, "ioDispatcher");
        this.a = hpVar;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = qx1Var;
        this.e = kx1Var;
        b2 = yn5.b(b.a);
        this.f = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application e() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bo0 f() {
        return this.c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger g() {
        return (Logger) this.f.getValue();
    }

    public final void h() {
        sh0.d(this.d, this.e, null, new a(null), 2, null);
    }
}
