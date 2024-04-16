package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.models.Configuration;
import cloud.mindbox.mobile_sdk.models.Event;
import cloud.mindbox.mobile_sdk.models.EventType;
import com.google.gson.Gson;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tx4;
import defpackage.v25;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: MindboxEventManager.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\u001f\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-¨\u00061"}, d2 = {"Ltj6;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcloud/mindbox/mobile_sdk/models/Event;", "event", "", Image.TYPE_HIGH, "Lq25;", "initData", "", "shouldCreateCustomer", com.huawei.hms.push.e.a, "Lrrb;", DateTokenConverter.CONVERTER_KEY, "", "body", "l", "k", "Lakb;", "clickData", "n", "Lbkb;", "trackVisitData", "g", Action.NAME_ATTRIBUTE, "i", "Ltx4$a;", "f", "o", "T", Image.TYPE_MEDIUM, "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "gson", "Lcr6;", "Ltx4;", com.huawei.hms.opendevice.c.a, "Lcr6;", "j", "()Lcr6;", "eventFlow", "Lem3;", "Lem3;", "poolDispatcher", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: tj6  reason: default package */
/* loaded from: classes.dex */
public final class tj6 {
    public static final tj6 a = new tj6();
    private static final Gson b = new Gson();
    private static final cr6<tx4> c = uha.b(20, 0, null, 6, null);
    private static final em3 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxEventManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tj6$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ rrb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, rrb rrbVar) {
            super(0);
            this.a = context;
            this.b = rrbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tj6.a.h(this.a, new Event(0L, EventType.a.INSTANCE, null, 0L, null, tj6.b.t(this.b), 29, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxEventManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tj6$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ Context b;
        final /* synthetic */ q25 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, Context context, q25 q25Var) {
            super(0);
            this.a = z;
            this.b = context;
            this.c = q25Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EventType eventType;
            if (this.a) {
                eventType = EventType.b.INSTANCE;
            } else {
                eventType = EventType.c.INSTANCE;
            }
            tj6.a.h(this.b, new Event(0L, eventType, null, 0L, null, tj6.b.t(this.c), 29, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxEventManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tj6$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ bkb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, bkb bkbVar) {
            super(0);
            this.a = context;
            this.b = bkbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tj6.a.h(this.a, new Event(0L, EventType.h.INSTANCE, null, 0L, null, tj6.b.t(this.b), 29, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxEventManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll95;", "a", "()Ll95;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tj6$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<l95> {
        final /* synthetic */ Context a;
        final /* synthetic */ Event b;
        final /* synthetic */ tj6 c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MindboxEventManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.managers.MindboxEventManager$asyncOperation$1$1", f = "MindboxEventManager.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: tj6$d$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ Context b;
            final /* synthetic */ Event c;
            final /* synthetic */ tj6 d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MindboxEventManager.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: tj6$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0677a extends ej5 implements Function0<Unit> {
                final /* synthetic */ Event a;
                final /* synthetic */ tj6 b;
                final /* synthetic */ Context c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0677a(Event event, tj6 tj6Var, Context context) {
                    super(0);
                    this.a = event;
                    this.b = tj6Var;
                    this.c = context;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Configuration h = in2.a.h();
                    nk6 nk6Var = nk6.a;
                    String b = nk6Var.b();
                    boolean z = (this.a.getEventType() instanceof EventType.b) || (this.a.getEventType() instanceof EventType.c);
                    if ((nk6Var.n() && !z) || h == null) {
                        tj6 tj6Var = this.b;
                        gk6.f(tj6Var, "Event " + this.a.getEventType().getOperation() + " will be sent later, because configuration was not initialized", null, 2, null);
                        tj6 tj6Var2 = this.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("isFirstInitialize: ");
                        sb.append(nk6Var.n());
                        sb.append(", isInstallEvent: ");
                        sb.append(z);
                        sb.append(", configuration is null: ");
                        sb.append(h == null);
                        gk6.d(tj6Var2, sb.toString());
                        return;
                    }
                    z7c.d(new z7c(), this.c, h, b, this.a, this.b, 0, 0, true, false, 96, null);
                    if (z) {
                        nk6Var.r(false);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, Event event, tj6 tj6Var, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = context;
                this.c = event;
                this.d = tj6Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, this.c, this.d, cv1Var);
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
                    v25.a.a(v25.a.SAVE_MINDBOX_CONFIG);
                    in2.a.f(this.b, this.c);
                    cr6<tx4> j = tj6.a.j();
                    tx4.b bVar = new tx4.b(this.c.getEventType(), this.c.getBody());
                    this.a = 1;
                    if (j.emit(bVar, this) == d) {
                        return d;
                    }
                }
                yx5.a.d(new C0677a(this.c, this.d, this.b));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, Event event, tj6 tj6Var) {
            super(0);
            this.a = context;
            this.b = event;
            this.c = tj6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final l95 invoke() {
            l95 d;
            d = sh0.d(mj6.a.K(), tj6.d, null, new a(this.a, this.b, this.c, null), 2, null);
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxEventManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tj6$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ akb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, akb akbVar) {
            super(0);
            this.a = context;
            this.b = akbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            tj6.a.h(this.a, new Event(0L, EventType.e.INSTANCE, null, 0L, null, tj6.b.t(this.b), 29, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxEventManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tj6$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context) {
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
            if (!in2.a.k().isEmpty()) {
                cloud.mindbox.mobile_sdk.services.a.a.g(this.a);
            }
        }
    }

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        z65.g(newSingleThreadExecutor, "newSingleThreadExecutor()");
        d = jm3.b(newSingleThreadExecutor);
    }

    private tj6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context, Event event) {
        yx5.a.d(new d(context, event, this));
    }

    public final void d(Context context, rrb rrbVar) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(rrbVar, "initData");
        yx5.a.d(new a(context, rrbVar));
    }

    public final void e(Context context, q25 q25Var, boolean z) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(q25Var, "initData");
        yx5.a.d(new b(z, context, q25Var));
    }

    public final tx4.a f() {
        return tx4.a.INSTANCE;
    }

    public final void g(Context context, bkb bkbVar) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(bkbVar, "trackVisitData");
        yx5.a.d(new c(context, bkbVar));
    }

    public final void i(Context context, String str, String str2) {
        boolean y;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "body");
        EventType.d dVar = new EventType.d(str);
        y = l0b.y(str2);
        h(context, new Event(0L, dVar, null, 0L, null, (!(y ^ true) || z65.c(str2, "null")) ? "{}" : "{}", 29, null));
    }

    public final cr6<tx4> j() {
        return c;
    }

    public final void k(Context context, String str) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "body");
        i(context, "Inapp.Click", str);
    }

    public final void l(Context context, String str) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "body");
        i(context, "Inapp.Show", str);
    }

    public final <T> String m(T t) {
        String t2 = b.t(t);
        z65.g(t2, "gson.toJson(body)");
        return t2;
    }

    public final void n(Context context, akb akbVar) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(akbVar, "clickData");
        yx5.a.d(new e(context, akbVar));
    }

    public final void o(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        yx5.a.d(new f(context));
    }
}
