package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.applicationstate.AppStateManager;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AppScopeLifecycleHandler.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lwo;", "Lww9;", "", "onStart", "Lcom/dodopizza/android/applicationstate/AppStateManager;", "a", "Lcom/dodopizza/android/applicationstate/AppStateManager;", "appStateManager", "Lkq;", "b", "Lkq;", "appsFlyerLibInitializer", "Ldo;", c.a, "Ldo;", "appInitializer", "Lqx1;", DateTokenConverter.CONVERTER_KEY, "Lqx1;", "coroutineScope", "<init>", "(Lcom/dodopizza/android/applicationstate/AppStateManager;Lkq;Ldo;Lqx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wo  reason: default package */
/* loaded from: classes3.dex */
public final class wo implements ww9 {
    private final AppStateManager a;
    private final kq b;
    private final Cdo c;
    private final qx1 d;

    /* compiled from: AppScopeLifecycleHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.di.initialization.AppScopeLifecycleHandler$onStart$1", f = "AppScopeLifecycleHandler.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: wo$a */
    /* loaded from: classes3.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
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
                AppStateManager appStateManager = wo.this.a;
                this.a = 1;
                if (appStateManager.e(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public wo(AppStateManager appStateManager, kq kqVar, Cdo cdo, qx1 qx1Var) {
        z65.h(appStateManager, "appStateManager");
        z65.h(kqVar, "appsFlyerLibInitializer");
        z65.h(cdo, "appInitializer");
        z65.h(qx1Var, "coroutineScope");
        this.a = appStateManager;
        this.b = kqVar;
        this.c = cdo;
        this.d = qx1Var;
    }

    @Override // defpackage.ww9
    public void onStart() {
        wta wtaVar = wta.a;
        wtaVar.d(fxa.f);
        this.c.n();
        wtaVar.d(fxa.i);
        this.b.a();
        sh0.d(this.d, null, null, new a(null), 3, null);
    }
}
