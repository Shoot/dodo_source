package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PushTokenManager.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006 "}, d2 = {"Lst8;", "", "", "newToken", "", e.a, "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "f", "Lxda;", "a", "Lxda;", "servicePushService", "Lpq;", "b", "Lpq;", "appsFlyerService", "Lbfb;", c.a, "Lbfb;", "threadsLibInitializer", "Lhfb;", "Lhfb;", "threadsLibPushService", "Lbo;", "Lbo;", "appInitializationStateProvider", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Lxda;Lpq;Lbfb;Lhfb;Lbo;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: st8  reason: default package */
/* loaded from: classes3.dex */
public final class st8 {
    private final xda a;
    private final pq b;
    private final bfb c;
    private final hfb d;
    private final bo e;
    private final kx1 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushTokenManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.application.fcm.PushTokenManager$updateTokenOnAppsflyer$2", f = "PushTokenManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: st8$a */
    /* loaded from: classes3.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
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
                st8.this.b.c(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushTokenManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.application.fcm.PushTokenManager$updateTokenOnMapi$2", f = "PushTokenManager.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: st8$b */
    /* loaded from: classes3.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
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
                bo boVar = st8.this.e;
                this.a = 1;
                if (co.b(boVar, this) == d) {
                    return d;
                }
            }
            st8.this.a.a(this.c);
            return Unit.a;
        }
    }

    public st8(xda xdaVar, pq pqVar, bfb bfbVar, hfb hfbVar, bo boVar, kx1 kx1Var) {
        z65.h(xdaVar, "servicePushService");
        z65.h(pqVar, "appsFlyerService");
        z65.h(bfbVar, "threadsLibInitializer");
        z65.h(hfbVar, "threadsLibPushService");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(kx1Var, "ioDispatcher");
        this.a = xdaVar;
        this.b = pqVar;
        this.c = bfbVar;
        this.d = hfbVar;
        this.e = boVar;
        this.f = kx1Var;
    }

    public final Object d(String str, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.f, new a(str, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }

    public final Object e(String str, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.f, new b(str, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }

    public final Object f(String str, cv1<? super Unit> cv1Var) {
        Object d;
        this.c.b();
        Object a2 = this.d.a(str, cv1Var);
        d = c75.d();
        if (a2 == d) {
            return a2;
        }
        return Unit.a;
    }
}
