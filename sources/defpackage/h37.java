package defpackage;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: NotificationsPermission.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0083@¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR#\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lh37;", "", "Landroidx/fragment/app/d;", "activity", "Lry7;", "j", "currentStatus", "", "f", "i", "(Landroidx/fragment/app/d;Lcv1;)Ljava/lang/Object;", "Lqd;", "sender", "Lh37$a;", "listener", "", Image.TYPE_HIGH, "(Landroidx/fragment/app/d;Lqd;Lh37$a;Lcv1;)Ljava/lang/Object;", "Lgc;", "a", "Lgc;", "analytics", "Lhq3;", "b", "Lhq3;", "featureService", "Ley7;", com.huawei.hms.opendevice.c.a, "Ley7;", "permissionChecker", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lrn5;", "g", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lgc;Lhq3;Ley7;)V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h37  reason: default package */
/* loaded from: classes.dex */
public final class h37 {
    private final gc a;
    private final hq3 b;
    private final ey7 c;
    private final rn5 d;

    /* compiled from: NotificationsPermission.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lh37$a;", "", "Lry7;", "status", "", "g", Image.TYPE_HIGH, "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h37$a */
    /* loaded from: classes.dex */
    public interface a {

        /* compiled from: NotificationsPermission.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: h37$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0342a {
            public static void a(a aVar, ry7 ry7Var) {
                z65.h(ry7Var, "status");
            }

            public static void b(a aVar, ry7 ry7Var) {
                z65.h(ry7Var, "status");
            }
        }

        void g(ry7 ry7Var);

        void h(ry7 ry7Var);
    }

    /* compiled from: NotificationsPermission.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h37$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("NotificationsPermissionRequester");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h37$c */
    /* loaded from: classes.dex */
    public static final class c implements oz3<ry7> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h37$c$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.feature.notification.presentation.NotificationsPermission$request$$inlined$map$1$2", f = "NotificationsPermission.kt", l = {223}, m = "emit")
            /* renamed from: h37$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0343a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0343a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, defpackage.cv1 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof defpackage.h37.c.a.C0343a
                    if (r0 == 0) goto L13
                    r0 = r8
                    h37$c$a$a r0 = (defpackage.h37.c.a.C0343a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    h37$c$a$a r0 = new h37$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r8)
                    goto L67
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    defpackage.vk9.b(r8)
                    pz3 r8 = r6.a
                    qy7 r7 = (defpackage.qy7) r7
                    java.util.List r7 = r7.b()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L42:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L6a
                    java.lang.Object r2 = r7.next()
                    dy7 r2 = (defpackage.dy7) r2
                    java.lang.String r4 = r2.c()
                    java.lang.String r5 = "android.permission.POST_NOTIFICATIONS"
                    boolean r4 = defpackage.z65.c(r4, r5)
                    if (r4 == 0) goto L42
                    ry7 r7 = r2.d()
                    r0.b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L67
                    return r1
                L67:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                L6a:
                    java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
                    java.lang.String r8 = "Collection contains no element matching the predicate."
                    r7.<init>(r8)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.h37.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super ry7> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: NotificationsPermission.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.feature.notification.presentation.NotificationsPermission$request$2", f = "NotificationsPermission.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: h37$d */
    /* loaded from: classes.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ androidx.fragment.app.d c;
        final /* synthetic */ a d;
        final /* synthetic */ h37 e;
        final /* synthetic */ qd f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.fragment.app.d dVar, a aVar, h37 h37Var, qd qdVar, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = dVar;
            this.d = aVar;
            this.e = h37Var;
            this.f = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.c, this.d, this.e, this.f, cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            qx1 qx1Var;
            Exception e;
            ry7 j;
            ry7 ry7Var;
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
                        this.e.g().error("Failed to request notifications permission", (Throwable) e);
                        return Unit.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var2 = (qx1) this.b;
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        j = this.e.j(this.c);
                    } catch (Exception e3) {
                        qx1Var = qx1Var2;
                        e = e3;
                        rx1.f(qx1Var);
                        this.e.g().error("Failed to request notifications permission", (Throwable) e);
                        return Unit.a;
                    }
                    if (this.e.f(j)) {
                        this.e.a.a(rs8.a.h(this.f));
                        h37 h37Var = this.e;
                        androidx.fragment.app.d dVar = this.c;
                        this.b = qx1Var2;
                        this.a = 1;
                        Object i2 = h37Var.i(dVar, this);
                        if (i2 == d) {
                            return d;
                        }
                        qx1Var = qx1Var2;
                        obj = i2;
                    } else {
                        a aVar = this.d;
                        if (aVar != null) {
                            aVar.h(j);
                        }
                        return Unit.a;
                    }
                } else {
                    t27 d2 = t27.d(this.c.getBaseContext());
                    z65.g(d2, "from(...)");
                    if (d2.a()) {
                        ry7Var = ry7.GRANTED;
                    } else {
                        ry7Var = ry7.DENIED_FOREVER;
                    }
                    a aVar2 = this.d;
                    if (aVar2 != null) {
                        aVar2.h(ry7Var);
                    }
                    return Unit.a;
                }
            }
            ry7 ry7Var2 = (ry7) obj;
            a aVar3 = this.d;
            if (aVar3 != null) {
                aVar3.g(ry7Var2);
            }
            return Unit.a;
        }
    }

    public h37(gc gcVar, hq3 hq3Var, ey7 ey7Var) {
        rn5 b2;
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(ey7Var, "permissionChecker");
        this.a = gcVar;
        this.b = hq3Var;
        this.c = ey7Var;
        b2 = yn5.b(b.a);
        this.d = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(ry7 ry7Var) {
        if ((this.b.a(bq3.o6) && ry7Var.i()) || ry7Var == ry7.NOT_ASKED) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger g() {
        return (Logger) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(androidx.fragment.app.d dVar, cv1<? super ry7> cv1Var) {
        return wz3.u(new c(ky7.a.b(dVar).a("android.permission.POST_NOTIFICATIONS")), cv1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ry7 j(androidx.fragment.app.d dVar) {
        return this.c.Pb(dVar, "android.permission.POST_NOTIFICATIONS");
    }

    public final Object h(androidx.fragment.app.d dVar, qd qdVar, a aVar, cv1<? super Unit> cv1Var) {
        Object d2;
        Object e = rx1.e(new d(dVar, aVar, this, qdVar, null), cv1Var);
        d2 = c75.d();
        if (e == d2) {
            return e;
        }
        return Unit.a;
    }
}
