package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: InAppStoryNavigator.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\""}, d2 = {"Lkz4;", "", "", "storyId", "", "g", "f", "Landroid/content/Context;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lhq3;", "b", "Lhq3;", "featureService", "Lqx1;", c.a, "Lqx1;", "coroutineScope", "Lnz4;", DateTokenConverter.CONVERTER_KEY, "Lnz4;", "stateProvider", "Lkx1;", e.a, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Landroid/content/Context;Lhq3;Lqx1;Lnz4;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kz4  reason: default package */
/* loaded from: classes2.dex */
public final class kz4 {
    private final Context a;
    private final hq3 b;
    private final qx1 c;
    private final nz4 d;
    private final kx1 e;
    private final rn5 f;

    /* compiled from: InAppStoryNavigator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kz4$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("InAppStoryNavigator");
        }
    }

    /* compiled from: InAppStoryNavigator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.stories.InAppStoryNavigator$navigateToStory$1", f = "InAppStoryNavigator.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: kz4$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppStoryNavigator.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.order.feature.menu.stories.InAppStoryNavigator$navigateToStory$1$1", f = "InAppStoryNavigator.kt", l = {42}, m = "invokeSuspend")
        /* renamed from: kz4$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ kz4 c;
            final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kz4 kz4Var, String str, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = kz4Var;
                this.d = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                a aVar = new a(this.c, this.d, cv1Var);
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
                d = c75.d();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        qx1Var = (qx1) this.b;
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    qx1 qx1Var2 = (qx1) this.b;
                    nz4 nz4Var = this.c.d;
                    this.b = qx1Var2;
                    this.a = 1;
                    if (pz4.a(nz4Var, this) == d) {
                        return d;
                    }
                    qx1Var = qx1Var2;
                }
                rx1.f(qx1Var);
                this.c.g(this.d);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = str;
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
                        Logger e3 = kz4.this.e();
                        String str = this.d;
                        e3.error("Failed to navigate to a story (id: " + str + ")", (Throwable) e);
                        return Unit.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var2 = (qx1) this.b;
                try {
                    if (!kz4.this.b.a(bq3.s)) {
                        Logger e4 = kz4.this.e();
                        String str2 = this.d;
                        e4.error("Can't show a story (id: " + str2 + "): the feature flag is disabled");
                        return Unit.a;
                    }
                    a aVar = new a(kz4.this, this.d, null);
                    this.b = qx1Var2;
                    this.a = 1;
                    if (zgb.c(AbstractComponentTracker.LINGERING_TIMEOUT, aVar, this) == d) {
                        return d;
                    }
                } catch (Exception e5) {
                    qx1Var = qx1Var2;
                    e = e5;
                    rx1.f(qx1Var);
                    Logger e32 = kz4.this.e();
                    String str3 = this.d;
                    e32.error("Failed to navigate to a story (id: " + str3 + ")", (Throwable) e);
                    return Unit.a;
                }
            }
            return Unit.a;
        }
    }

    public kz4(Context context, hq3 hq3Var, qx1 qx1Var, nz4 nz4Var, kx1 kx1Var) {
        rn5 b2;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(hq3Var, "featureService");
        z65.h(qx1Var, "coroutineScope");
        z65.h(nz4Var, "stateProvider");
        z65.h(kx1Var, "ioDispatcher");
        this.a = context;
        this.b = hq3Var;
        this.c = qx1Var;
        this.d = nz4Var;
        this.e = kx1Var;
        b2 = yn5.b(a.a);
        this.f = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger e() {
        return (Logger) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str) {
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            inAppStoryManager.showStory(str, this.a, AppearanceManager.getCommonInstance());
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void f(String str) {
        z65.h(str, "storyId");
        sh0.d(this.c, this.e, null, new b(str, null), 2, null);
    }
}
