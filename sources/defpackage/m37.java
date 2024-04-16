package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.rs8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: NotificationsStatusInteractor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR#\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lm37;", "", "Lqd;", "sender", "", Image.TYPE_HIGH, "(Lqd;Lcv1;)Ljava/lang/Object;", "f", "Lgc;", "a", "Lgc;", "analytics", "Lci8;", "b", "Lci8;", "preferencesAssetsDataSource", "Lk37;", com.huawei.hms.opendevice.c.a, "Lk37;", "notificationsStatusDetector", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "Lkx1;", "ioDispatcher", "Lqx1;", e.a, "Lqx1;", "processScope", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "g", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lgc;Lci8;Lk37;Lkx1;Lqx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m37  reason: default package */
/* loaded from: classes.dex */
public final class m37 {
    private final gc a;
    private final ci8 b;
    private final k37 c;
    private final kx1 d;
    private final qx1 e;
    private final rn5 f;

    /* compiled from: NotificationsStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.notificationstatus.presentation.NotificationsStatusInteractor$checkNotificationsStatus$1", f = "NotificationsStatusInteractor.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: m37$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(qd qdVar, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
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
                m37 m37Var = m37.this;
                qd qdVar = this.c;
                this.a = 1;
                if (m37Var.h(qdVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: NotificationsStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.notificationstatus.presentation.NotificationsStatusInteractor$checkNotificationsStatus$2", f = "NotificationsStatusInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m37$b */
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
                m37.this.g().error("Failed to check notifications status", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: NotificationsStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m37$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Logger> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("NotificationsStatusInteractor");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsStatusInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.notificationstatus.presentation.NotificationsStatusInteractor$performCheck$2", f = "NotificationsStatusInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m37$d */
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd qdVar, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
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
                j37 a = m37.this.c.a();
                j37 p = m37.this.b.p();
                if (z65.c(p, a)) {
                    return Unit.a;
                }
                m37.this.a.a(new rs8.d(p, a, this.c));
                m37.this.b.C(a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m37(gc gcVar, ci8 ci8Var, k37 k37Var, kx1 kx1Var, qx1 qx1Var) {
        rn5 b2;
        z65.h(gcVar, "analytics");
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(k37Var, "notificationsStatusDetector");
        z65.h(kx1Var, "ioDispatcher");
        z65.h(qx1Var, "processScope");
        this.a = gcVar;
        this.b = ci8Var;
        this.c = k37Var;
        this.d = kx1Var;
        this.e = qx1Var;
        b2 = yn5.b(c.a);
        this.f = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger g() {
        return (Logger) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(qd qdVar, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(this.d, new d(qdVar, null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }

    public final void f(qd qdVar) {
        z65.h(qdVar, "sender");
        wj1.b(z77.a(hy.a(new a(qdVar, null)), new b(null)), this.e);
    }
}
