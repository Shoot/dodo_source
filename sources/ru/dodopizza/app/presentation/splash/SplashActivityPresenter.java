package ru.dodopizza.app.presentation.splash;

import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SplashActivityPresenter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/splash/SplashActivityPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lfsa;", "", "onFirstViewAttach", "Lbo;", "a", "Lbo;", "appInitializationStateProvider", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lbo;)V", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SplashActivityPresenter extends BasePresenter<fsa> {
    public static final a c = new a(null);
    private static final long d = TimeUnit.SECONDS.toMillis(1);
    private final bo a;
    private final Logger b;

    /* compiled from: SplashActivityPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/splash/SplashActivityPresenter$a;", "", "", "SPLASH_TIME_MILLIS", "J", "a", "()J", "getSPLASH_TIME_MILLIS$annotations", "()V", "<init>", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return SplashActivityPresenter.d;
        }
    }

    /* compiled from: SplashActivityPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.splash.SplashActivityPresenter$onFirstViewAttach$1", f = "SplashActivityPresenter.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SplashActivityPresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.splash.SplashActivityPresenter$onFirstViewAttach$1$1", f = "SplashActivityPresenter.kt", l = {31}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ SplashActivityPresenter b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SplashActivityPresenter splashActivityPresenter, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = splashActivityPresenter;
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
                    bo boVar = this.b.a;
                    this.a = 1;
                    if (co.b(boVar, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

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
            Object d;
            qx1 qx1Var;
            Exception e;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        qx1Var = (qx1) this.b;
                        try {
                            vk9.b(obj);
                        } catch (Exception e2) {
                            e = e2;
                            rx1.f(qx1Var);
                            SplashActivityPresenter.this.b.warn("Failed to await app initialization completion", (Throwable) e);
                            return Unit.a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    qx1 qx1Var2 = (qx1) this.b;
                    try {
                        long a2 = SplashActivityPresenter.c.a();
                        a aVar = new a(SplashActivityPresenter.this, null);
                        this.b = qx1Var2;
                        this.a = 1;
                        if (zgb.c(a2, aVar, this) == d) {
                            return d;
                        }
                    } catch (Exception e3) {
                        qx1Var = qx1Var2;
                        e = e3;
                        rx1.f(qx1Var);
                        SplashActivityPresenter.this.b.warn("Failed to await app initialization completion", (Throwable) e);
                        return Unit.a;
                    }
                }
                return Unit.a;
            } finally {
                ((fsa) SplashActivityPresenter.this.getViewState()).P2();
            }
        }
    }

    public SplashActivityPresenter(bo boVar) {
        z65.h(boVar, "appInitializationStateProvider");
        this.a = boVar;
        this.b = LoggerFactory.getLogger("SplashActivityPresenter");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}
