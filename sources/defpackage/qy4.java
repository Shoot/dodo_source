package defpackage;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: InAppNotificationInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lqy4;", "Lpy4;", "Lvy4;", "a", "(Lcv1;)Ljava/lang/Object;", "", MessageAttributes.UUID, "", "b", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lsy4;", "Lsy4;", "notificationService", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lsy4;Lhq3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qy4  reason: default package */
/* loaded from: classes2.dex */
public final class qy4 implements py4 {
    private final sy4 a;
    private final hq3 b;

    /* compiled from: InAppNotificationInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.InAppNotificationInteractorImpl$closeInAppNotification$2", f = "InAppNotificationInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qy4$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
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
                qy4.this.a.b(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: InAppNotificationInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lvy4;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.InAppNotificationInteractorImpl$getInAppNotification$2", f = "InAppNotificationInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qy4$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super vy4>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super vy4> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ry4 c = qy4.this.a.c();
                fk fkVar = null;
                if (c == null) {
                    return null;
                }
                boolean a = qy4.this.b.a(bq3.S4);
                String d = c.d();
                String h = c.h();
                String g = c.g();
                String c2 = c.c();
                String b = c.b();
                tl8 e = c.e();
                if (a) {
                    fkVar = c.a();
                }
                return new vy4(d, h, g, c2, b, e, fkVar, c.i(), ty4.d.a(c.f()));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public qy4(sy4 sy4Var, hq3 hq3Var) {
        z65.h(sy4Var, "notificationService");
        z65.h(hq3Var, "featureService");
        this.a = sy4Var;
        this.b = hq3Var;
    }

    @Override // defpackage.py4
    public Object a(cv1<? super vy4> cv1Var) {
        return qh0.g(v33.b(), new b(null), cv1Var);
    }

    @Override // defpackage.py4
    public Object b(String str, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(v33.b(), new a(str, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }
}
