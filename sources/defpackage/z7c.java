package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.Configuration;
import cloud.mindbox.mobile_sdk.models.Event;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: WorkerDelegate.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001JV\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lz7c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcloud/mindbox/mobile_sdk/models/Event;", "events", "Lcloud/mindbox/mobile_sdk/models/Configuration;", "configuration", "parent", "", e.a, "Landroidx/work/ListenableWorker$a;", "f", "", "deviceUuid", "event", "", "index", "eventsCount", "", "shouldStartWorker", "shouldCountOffset", c.a, "b", "a", "Z", "isWorkerStopped", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: z7c  reason: default package */
/* loaded from: classes.dex */
public final class z7c {
    private boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSent", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: z7c$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<Boolean, Unit> {
        final /* synthetic */ Event a;
        final /* synthetic */ boolean b;
        final /* synthetic */ Context c;
        final /* synthetic */ Object d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ CountDownLatch g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WorkerDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.managers.WorkerDelegate$sendEvent$1$1", f = "WorkerDelegate.kt", l = {}, m = "invokeSuspend")
        /* renamed from: z7c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0758a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ boolean b;
            final /* synthetic */ Event c;
            final /* synthetic */ boolean d;
            final /* synthetic */ Context e;
            final /* synthetic */ Object f;
            final /* synthetic */ int g;
            final /* synthetic */ int h;
            final /* synthetic */ CountDownLatch i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0758a(boolean z, Event event, boolean z2, Context context, Object obj, int i, int i2, CountDownLatch countDownLatch, cv1<? super C0758a> cv1Var) {
                super(2, cv1Var);
                this.b = z;
                this.c = event;
                this.d = z2;
                this.e = context;
                this.f = obj;
                this.g = i;
                this.h = i2;
                this.i = countDownLatch;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C0758a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0758a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    if (this.b) {
                        in2.a.p(this.c);
                    } else if (this.d) {
                        cloud.mindbox.mobile_sdk.services.a.a.g(this.e);
                    }
                    fk6 fk6Var = fk6.a;
                    Object obj2 = this.f;
                    fk6Var.i(obj2, "sent event index #" + this.g + " id #" + this.c.getUid() + " from " + this.h);
                    this.i.countDown();
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Event event, boolean z, Context context, Object obj, int i, int i2, CountDownLatch countDownLatch) {
            super(1);
            this.a = event;
            this.b = z;
            this.c = context;
            this.d = obj;
            this.e = i;
            this.f = i2;
            this.g = countDownLatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.a;
        }

        public final void invoke(boolean z) {
            sh0.d(mj6.a.K(), null, null, new C0758a(z, this.a, this.b, this.c, this.d, this.e, this.f, this.g, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: z7c$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ List<Event> a;
        final /* synthetic */ z7c b;
        final /* synthetic */ Context c;
        final /* synthetic */ Configuration d;
        final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<Event> list, z7c z7cVar, Context context, Configuration configuration, Object obj) {
            super(0);
            this.a = list;
            this.b = z7cVar;
            this.c = context;
            this.d = configuration;
            this.e = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            int size = this.a.size() - 1;
            String b = nk6.a.b();
            z7c z7cVar = this.b;
            Context context = this.c;
            Configuration configuration = this.d;
            Object obj = this.e;
            int i = 0;
            for (Object obj2 : this.a) {
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                Event event = (Event) obj2;
                if (z7cVar.a) {
                    return;
                }
                z7cVar.c(context, configuration, b, event, obj, i, size, false, true);
                i = i2;
                obj = obj;
            }
        }
    }

    public static /* synthetic */ void d(z7c z7cVar, Context context, Configuration configuration, String str, Event event, Object obj, int i, int i2, boolean z, boolean z2, int i3, Object obj2) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        if ((i3 & 32) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            i5 = 1;
        } else {
            i5 = i2;
        }
        if ((i3 & 128) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i3 & 256) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        z7cVar.c(context, configuration, str, event, obj, i4, i5, z3, z4);
    }

    private final void e(Context context, List<Event> list, Configuration configuration, Object obj) {
        yx5.a.d(new b(list, this, context, configuration, obj));
    }

    public final void b(Object obj) {
        z65.h(obj, "parent");
        this.a = true;
        fk6.a.d(obj, "onStopped work");
    }

    public final void c(Context context, Configuration configuration, String str, Event event, Object obj, int i, int i2, boolean z, boolean z2) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(configuration, "configuration");
        z65.h(str, "deviceUuid");
        z65.h(event, "event");
        z65.h(obj, "parent");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        sj6.a.a().d().x(configuration, str, event, z2, new a(event, z, context, obj, i, i2, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            fk6.a.f(obj, "doWork -> sending was interrupted", e);
        }
    }

    public final ListenableWorker.a f(Context context, Object obj) {
        ListenableWorker.a c;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(obj, "parent");
        fk6 fk6Var = fk6.a;
        fk6Var.d(obj, "Start working...");
        try {
            mj6 mj6Var = mj6.a;
            mj6.Q(mj6Var, context, null, 2, null);
            rt8 L = mj6Var.L();
            if (L != null) {
                L.b(context, obj);
            }
            in2 in2Var = in2.a;
            Configuration h = in2Var.h();
            if (!nk6.a.n() && h != null) {
                List<Event> k = in2Var.k();
                List<Event> list = k;
                if (list != null && !list.isEmpty()) {
                    fk6Var.d(obj, "Will be sent " + k.size());
                    e(context, k, h, obj);
                    if (this.a) {
                        c = ListenableWorker.a.a();
                    } else {
                        List<Event> j = in2Var.j();
                        if (j != null && !j.isEmpty()) {
                            c = ListenableWorker.a.b();
                        }
                        c = ListenableWorker.a.c();
                    }
                    z65.g(c, "{\n                Mindbo…          }\n            }");
                    return c;
                }
                fk6Var.d(obj, "Events list is empty");
                List<Event> j2 = in2Var.j();
                if (j2 != null && !j2.isEmpty()) {
                    fk6Var.d(obj, "Database contains events that can't be sent right now. Worker will restart");
                    c = ListenableWorker.a.b();
                    z65.g(c, "{\n                Mindbo…          }\n            }");
                    return c;
                }
                c = ListenableWorker.a.c();
                z65.g(c, "{\n                Mindbo…          }\n            }");
                return c;
            }
            fk6Var.e(obj, "Configuration was not initialized");
            ListenableWorker.a a2 = ListenableWorker.a.a();
            z65.g(a2, "failure()");
            return a2;
        } catch (Exception e) {
            fk6.a.f(obj, "Failed events work", e);
            ListenableWorker.a a3 = ListenableWorker.a.a();
            z65.g(a3, "failure()");
            return a3;
        }
    }
}
