package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.Configuration;
import cloud.mindbox.mobile_sdk.models.Event;
import cloud.mindbox.mobile_sdk.repository.MindboxDatabase;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: DbManager.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019J\u0006\u0010\u001b\u001a\u00020\u0005R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lin2;", "", "", "Lcloud/mindbox/mobile_sdk/models/Event;", "events", "", "q", "i", "g", "", "timeNow", "", Image.TYPE_MEDIUM, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "l", "event", "f", "j", "k", "p", "Lcloud/mindbox/mobile_sdk/models/Configuration;", "configuration", "r", Image.TYPE_HIGH, "Loz3;", "n", "o", "Lcloud/mindbox/mobile_sdk/repository/MindboxDatabase;", "b", "Lcloud/mindbox/mobile_sdk/repository/MindboxDatabase;", "mindboxDb", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: in2  reason: default package */
/* loaded from: classes.dex */
public final class in2 {
    public static final in2 a = new in2();
    private static volatile MindboxDatabase b;

    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ Event a;
        final /* synthetic */ in2 b;
        final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Event event, in2 in2Var, Context context) {
            super(0);
            this.a = event;
            this.b = in2Var;
            this.c = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                MindboxDatabase mindboxDatabase = in2.b;
                if (mindboxDatabase == null) {
                    z65.z("mindboxDb");
                    mindboxDatabase = null;
                }
                mindboxDatabase.G().c(this.a);
                fk6 fk6Var = fk6.a;
                in2 in2Var = this.b;
                fk6Var.d(in2Var, "Event " + this.a.getEventType().getOperation() + " was added to queue");
            } catch (RuntimeException e) {
                fk6 fk6Var2 = fk6.a;
                in2 in2Var2 = this.b;
                fk6Var2.f(in2Var2, "Error writing object to the database: " + this.a.getBody(), e);
            }
            cloud.mindbox.mobile_sdk.services.a.a.g(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/Configuration;", "a", "()Lcloud/mindbox/mobile_sdk/models/Configuration;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: in2$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Configuration> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Configuration invoke() {
            try {
                MindboxDatabase mindboxDatabase = in2.b;
                if (mindboxDatabase == null) {
                    z65.z("mindboxDb");
                    mindboxDatabase = null;
                }
                return mindboxDatabase.F().get();
            } catch (RuntimeException e) {
                fk6.a.f(in2.this, "Error reading from database", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcloud/mindbox/mobile_sdk/models/Event;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<List<? extends Event>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Event> invoke() {
            List<Event> all;
            synchronized (in2.this) {
                try {
                    MindboxDatabase mindboxDatabase = in2.b;
                    if (mindboxDatabase == null) {
                        z65.z("mindboxDb");
                        mindboxDatabase = null;
                    }
                    all = mindboxDatabase.G().getAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return all;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcloud/mindbox/mobile_sdk/models/Event;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<List<? extends Event>> {
        public static final d a = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DbManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.managers.DbManager$getFilteredEvents$1$1", f = "DbManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: in2$d$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ List<Event> b;
            final /* synthetic */ List<Event> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<Event> list, List<Event> list2, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = list;
                this.c = list2;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, this.c, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                List o0;
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    in2 in2Var = in2.a;
                    o0 = sc1.o0(this.b, this.c);
                    in2Var.q(o0);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: in2$d$b */
        /* loaded from: classes.dex */
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int d;
                d = mk1.d(Long.valueOf(((Event) t).getEnqueueTimestamp()), Long.valueOf(((Event) t2).getEnqueueTimestamp()));
                return d;
            }
        }

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Event> invoke() {
            List y0;
            in2 in2Var = in2.a;
            y0 = sc1.y0(in2Var.i(), new b());
            List<? extends Event> g = in2Var.g(y0);
            if (y0.size() > g.size()) {
                sh0.d(rx1.a(v33.b()), null, null, new a(y0, g, null), 3, null);
            }
            return g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (in2.b == null) {
                in2.b = MindboxDatabase.p.a(this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function0<Boolean> {
        final /* synthetic */ long a;
        final /* synthetic */ Event b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j, Event event) {
            super(0);
            this.a = j;
            this.b = event;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a - this.b.getEnqueueTimestamp() >= 15552000000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$g */
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ Event b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Event event) {
            super(0);
            this.b = event;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                in2 in2Var = in2.this;
                Event event = this.b;
                synchronized (in2Var) {
                    MindboxDatabase mindboxDatabase = in2.b;
                    if (mindboxDatabase == null) {
                        z65.z("mindboxDb");
                        mindboxDatabase = null;
                    }
                    mindboxDatabase.G().a(event.getTransactionId());
                    Unit unit = Unit.a;
                }
                fk6 fk6Var = fk6.a;
                in2 in2Var2 = in2.this;
                fk6Var.d(in2Var2, "Event " + this.b.getEventType() + ';' + this.b.getTransactionId() + " was deleted from queue");
            } catch (RuntimeException e) {
                fk6.a.f(in2.this, "Error deleting item from database", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$h */
    /* loaded from: classes.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ List<Event> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List<Event> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                in2 in2Var = in2.this;
                List<Event> list = this.b;
                synchronized (in2Var) {
                    MindboxDatabase mindboxDatabase = in2.b;
                    if (mindboxDatabase == null) {
                        z65.z("mindboxDb");
                        mindboxDatabase = null;
                    }
                    mindboxDatabase.G().d(list);
                    Unit unit = Unit.a;
                }
                fk6 fk6Var = fk6.a;
                in2 in2Var2 = in2.this;
                fk6Var.d(in2Var2, this.b.size() + " events were deleted from queue");
            } catch (RuntimeException e) {
                fk6.a.f(in2.this, "Error deleting items from database", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DbManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: in2$i */
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ Configuration a;
        final /* synthetic */ in2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Configuration configuration, in2 in2Var) {
            super(0);
            this.a = configuration;
            this.b = in2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                MindboxDatabase mindboxDatabase = in2.b;
                if (mindboxDatabase == null) {
                    z65.z("mindboxDb");
                    mindboxDatabase = null;
                }
                mindboxDatabase.F().a(this.a);
            } catch (RuntimeException e) {
                fk6.a.f(this.b, "Error writing object configuration to the database", e);
            }
        }
    }

    private in2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Event> g(List<Event> list) {
        List<Event> C0;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!a.m((Event) obj, currentTimeMillis)) {
                arrayList.add(obj);
            }
        }
        C0 = sc1.C0(arrayList, 10000);
        return C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Event> i() {
        List l;
        yx5 yx5Var = yx5.a;
        l = kc1.l();
        return (List) yx5Var.b(l, new c());
    }

    private final boolean m(Event event, long j) {
        return ((Boolean) yx5.a.b(Boolean.FALSE, new f(j, event))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(List<Event> list) {
        yx5.a.d(new h(list));
    }

    public final void f(Context context, Event event) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(event, "event");
        yx5.a.d(new a(event, this, context));
    }

    public final Configuration h() {
        return (Configuration) yx5.a.b(null, new b());
    }

    public final List<Event> j() {
        List l;
        yx5 yx5Var = yx5.a;
        l = kc1.l();
        return (List) yx5Var.b(l, d.a);
    }

    public final List<Event> k() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a.j()) {
            if (currentTimeMillis - ((Event) obj).getEnqueueTimestamp() > 120000) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void l(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        yx5.a.d(new e(context));
    }

    public final oz3<Configuration> n() {
        oz3<Configuration> A;
        try {
            MindboxDatabase mindboxDatabase = b;
            if (mindboxDatabase == null) {
                z65.z("mindboxDb");
                mindboxDatabase = null;
            }
            A = mindboxDatabase.F().b();
        } catch (RuntimeException e2) {
            fk6.a.f(this, "Error reading from database", e2);
            A = wz3.A(null);
        }
        return wz3.t(A);
    }

    public final void o() {
        try {
            MindboxDatabase mindboxDatabase = b;
            if (mindboxDatabase == null) {
                z65.z("mindboxDb");
                mindboxDatabase = null;
            }
            mindboxDatabase.G().b();
        } catch (RuntimeException e2) {
            fk6.a.f(this, "Error reading from database", e2);
        }
    }

    public final void p(Event event) {
        z65.h(event, "event");
        yx5.a.d(new g(event));
    }

    public final void r(Configuration configuration) {
        z65.h(configuration, "configuration");
        yx5.a.d(new i(configuration, this));
    }
}
