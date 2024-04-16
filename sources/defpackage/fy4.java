package defpackage;

import android.app.Activity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.android.volley.VolleyError;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fy4;
import defpackage.lx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InAppMessageManagerImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006%"}, d2 = {"Lfy4;", "Ley4;", "", "inAppId", "", "n", "o", Image.TYPE_MEDIUM, "Landroid/app/Activity;", "activity", DateTokenConverter.CONVERTER_KEY, "f", "Ll95;", "g", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "b", "", "shouldUseBlur", "a", "Liy4;", "Liy4;", "inAppMessageViewDisplayer", "Lby4;", "Lby4;", "inAppInteractor", "Lkx1;", "Lkx1;", "defaultDispatcher", "Lco6;", "Lco6;", "monitoringInteractor", "Lqx1;", "Lqx1;", "inAppScope", "<init>", "(Liy4;Lby4;Lkx1;Lco6;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fy4  reason: default package */
/* loaded from: classes.dex */
public final class fy4 implements ey4 {
    public static final a f = new a(null);
    private final iy4 a;
    private final by4 b;
    private final kx1 c;
    private final co6 d;
    private final qx1 e;

    /* compiled from: InAppMessageManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lfy4$a;", "", "", "CONFIG_NOT_FOUND", "I", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fy4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: InAppMessageManagerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.presentation.InAppMessageManagerImpl$listenEventAndInApp$1", f = "InAppMessageManagerImpl.kt", l = {32, 33}, m = "invokeSuspend")
    /* renamed from: fy4$b */
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppMessageManagerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqz4;", "inAppMessage", "", "b", "(Lqz4;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: fy4$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ fy4 a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: InAppMessageManagerImpl.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "cloud.mindbox.mobile_sdk.inapp.presentation.InAppMessageManagerImpl$listenEventAndInApp$1$1$1", f = "InAppMessageManagerImpl.kt", l = {}, m = "invokeSuspend")
            /* renamed from: fy4$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0317a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ fy4 b;
                final /* synthetic */ qz4 c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0317a(fy4 fy4Var, qz4 qz4Var, cv1<? super C0317a> cv1Var) {
                    super(2, cv1Var);
                    this.b = fy4Var;
                    this.c = qz4Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void k(fy4 fy4Var, qz4 qz4Var) {
                    fy4Var.m(qz4Var.a());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void l(fy4 fy4Var, qz4 qz4Var) {
                    fy4Var.b.a(qz4Var.a());
                    fy4Var.n(qz4Var.a());
                    fy4Var.o();
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0317a(this.b, this.c, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0317a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    c75.d();
                    if (this.a == 0) {
                        vk9.b(obj);
                        if (this.b.a.d()) {
                            fy4 fy4Var = this.b;
                            gk6.a(fy4Var, "Inapp is active. Skip " + this.c.a());
                            return Unit.a;
                        } else if (!this.b.b.c()) {
                            iy4 iy4Var = this.b.a;
                            final qz4 qz4Var = this.c;
                            final fy4 fy4Var2 = this.b;
                            h87 h87Var = new h87() { // from class: gy4
                                @Override // defpackage.h87
                                public final void onClick() {
                                    fy4.b.a.C0317a.k(fy4.this, qz4Var);
                                }
                            };
                            final fy4 fy4Var3 = this.b;
                            final qz4 qz4Var2 = this.c;
                            iy4Var.f(qz4Var, h87Var, new i87() { // from class: hy4
                                @Override // defpackage.i87
                                public final void a() {
                                    fy4.b.a.C0317a.l(fy4.this, qz4Var2);
                                }
                            });
                            return Unit.a;
                        } else {
                            fy4 fy4Var4 = this.b;
                            gk6.a(fy4Var4, "Inapp already shown. Skip " + this.c.a());
                            return Unit.a;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            a(fy4 fy4Var) {
                this.a = fy4Var;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(qz4 qz4Var, cv1<? super Unit> cv1Var) {
                Object d;
                Object g = qh0.g(v33.c(), new C0317a(this.a, qz4Var, null), cv1Var);
                d = c75.d();
                if (g == d) {
                    return g;
                }
                return Unit.a;
            }
        }

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
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
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                by4 by4Var = fy4.this.b;
                this.a = 1;
                obj = by4Var.i(this);
                if (obj == d) {
                    return d;
                }
            }
            a aVar = new a(fy4.this);
            this.a = 2;
            if (((oz3) obj).collect(aVar, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    /* compiled from: InAppMessageManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: fy4$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fy4.this.a.c(this.b);
        }
    }

    /* compiled from: InAppMessageManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: fy4$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ Activity b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Activity activity, boolean z) {
            super(0);
            this.b = activity;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fy4.this.a.a(this.b, this.c);
        }
    }

    /* compiled from: InAppMessageManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: fy4$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fy4.this.a.b(this.b);
        }
    }

    /* compiled from: InAppMessageManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: fy4$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fy4.this.a.e(this.b, true);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"fy4$g", "Lkotlin/coroutines/a;", "Llx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "N", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fy4$g */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.a implements lx1 {
        final /* synthetic */ fy4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(lx1.a aVar, fy4 fy4Var) {
            super(aVar);
            this.b = fy4Var;
        }

        @Override // defpackage.lx1
        public void N(CoroutineContext coroutineContext, Throwable th) {
            Integer num;
            if (th instanceof VolleyError) {
                iw6 iw6Var = ((VolleyError) th).a;
                if (iw6Var != null) {
                    num = Integer.valueOf(iw6Var.a);
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 404) {
                    fk6.a.k(fy4.f, "Config not found", th);
                    nk6.a.t("");
                    return;
                }
                nk6 nk6Var = nk6.a;
                nk6Var.t(nk6Var.d());
                fk6.a.f(fy4.f, "Failed to get config", th);
                return;
            }
            fk6.a.f(bc9.b(this.b.getClass()), "Failed to get config", th);
        }
    }

    /* compiled from: InAppMessageManagerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.presentation.InAppMessageManagerImpl$requestConfig$2", f = "InAppMessageManagerImpl.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: fy4$h */
    /* loaded from: classes.dex */
    static final class h extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((h) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                by4 by4Var = fy4.this.b;
                this.a = 1;
                if (by4Var.d(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public fy4(iy4 iy4Var, by4 by4Var, kx1 kx1Var, co6 co6Var) {
        z65.h(iy4Var, "inAppMessageViewDisplayer");
        z65.h(by4Var, "inAppInteractor");
        z65.h(kx1Var, "defaultDispatcher");
        z65.h(co6Var, "monitoringInteractor");
        this.a = iy4Var;
        this.b = by4Var;
        this.c = kx1Var;
        this.d = co6Var;
        this.e = rx1.a(kx1Var.P(k2b.b(null, 1, null)).P(mj6.a.H()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(String str) {
        this.b.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(String str) {
        this.b.f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.b.e();
    }

    @Override // defpackage.ey4
    public void a(Activity activity, boolean z) {
        z65.h(activity, "activity");
        yx5.a.d(new d(activity, z));
    }

    @Override // defpackage.ey4
    public void b(Activity activity) {
        z65.h(activity, "activity");
        yx5.a.d(new e(activity));
    }

    @Override // defpackage.ey4
    public void c(Activity activity) {
        z65.h(activity, "activity");
        yx5.a.d(new c(activity));
    }

    @Override // defpackage.ey4
    public void d(Activity activity) {
        z65.h(activity, "activity");
        yx5.a.d(new f(activity));
    }

    @Override // defpackage.ey4
    public void e() {
        this.d.a();
    }

    @Override // defpackage.ey4
    public void f() {
        sh0.d(this.e, null, null, new b(null), 3, null);
    }

    @Override // defpackage.ey4
    public l95 g() {
        l95 d2;
        d2 = sh0.d(this.e, new g(lx1.J, this), null, new h(null), 2, null);
        return d2;
    }
}
