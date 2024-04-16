package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ProfileSettingsInteractor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\b\b\u0001\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tJ\u0018\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\r2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\rJ\u0018\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0015J\u0010\u0010\u0017\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Llo8;", "Lox1;", "Ln42;", "currentCustomer", "updatedCustomer", "", "l", "k", Image.TYPE_MEDIUM, "Lwx;", "o", "Lmb0;", "birthday", "Lcom/dodopizza/async/AsyncJob;", Image.TYPE_SMALL, "p", "newCustomer", "r", "Lk4;", "n", "(Lcv1;)Ljava/lang/Object;", "Loz3;", "q", "j", "Lt52;", "a", "Lt52;", "customerService", "Ldua;", "b", "Ldua;", "stateAnalyzer", "Lgy5;", com.huawei.hms.opendevice.c.a, "Lgy5;", "logoutInteractor", "Lqi8;", DateTokenConverter.CONVERTER_KEY, "Lqi8;", "preferredOrderLocationService", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lkx1;", "f", "Lkx1;", "ioDispatcher", "<init>", "(Lt52;Ldua;Lgy5;Lqi8;Lgc;Lkx1;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lo8  reason: default package */
/* loaded from: classes2.dex */
public final class lo8 implements ox1 {
    private final t52 a;
    private final dua b;
    private final gy5 c;
    private final qi8 d;
    private final gc e;
    private final kx1 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsInteractor$cancelAccountDeletionProcess$2", f = "ProfileSettingsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo8$a */
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                lo8.this.a.c();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lk4;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsInteractor$deleteUserAccount$2", f = "ProfileSettingsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo8$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super k4>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super k4> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return k4.a(lo8.this.a.d());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ln42;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsInteractor$getCustomer$1", f = "ProfileSettingsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo8$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function1<cv1<? super n42>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super n42> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return lo8.this.a.f();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsInteractor$logout$1", f = "ProfileSettingsInteractor.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: lo8$d */
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
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
                lo8.this.d.clear();
                gy5 gy5Var = lo8.this.c;
                this.a = 1;
                if (gy5Var.f(this) == d) {
                    return d;
                }
            }
            lo8.this.b.c();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lk4;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsInteractor$observeUpdatingAccountDeletionStatus$1", f = "ProfileSettingsInteractor.kt", l = {70, 73}, m = "invokeSuspend")
    /* renamed from: lo8$e */
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<pz3<? super k4>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super k4> pz3Var, cv1<? super Unit> cv1Var) {
            return ((e) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            pz3 pz3Var;
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
                pz3Var = (pz3) this.b;
                vk9.b(obj);
            } else {
                vk9.b(obj);
                pz3Var = (pz3) this.b;
                k4 e = lo8.this.a.e();
                this.b = pz3Var;
                this.a = 1;
                if (pz3Var.emit(e, this) == d) {
                    return d;
                }
            }
            k4 A = lo8.this.a.A();
            this.b = null;
            this.a = 2;
            if (pz3Var.emit(A, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsInteractor$saveProfile$1", f = "ProfileSettingsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo8$f */
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ n42 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n42 n42Var, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = n42Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                n42 f = lo8.this.a.f();
                lo8.this.l(f, this.c);
                lo8.this.k(f, this.c);
                lo8.this.m(f, this.c);
                lo8.this.a.t(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsInteractor$setBirthday$1", f = "ProfileSettingsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo8$g */
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ mb0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(mb0 mb0Var, cv1<? super g> cv1Var) {
            super(1, cv1Var);
            this.c = mb0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                lo8.this.a.u(this.c.a(), this.c.b(), this.c.c());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public lo8(t52 t52Var, dua duaVar, gy5 gy5Var, qi8 qi8Var, gc gcVar, kx1 kx1Var) {
        z65.h(t52Var, "customerService");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(gy5Var, "logoutInteractor");
        z65.h(qi8Var, "preferredOrderLocationService");
        z65.h(gcVar, "analytics");
        z65.h(kx1Var, "ioDispatcher");
        this.a = t52Var;
        this.b = duaVar;
        this.c = gy5Var;
        this.d = qi8Var;
        this.e = gcVar;
        this.f = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(n42 n42Var, n42 n42Var2) {
        if (!z65.c(n42Var.g(), n42Var2.g())) {
            this.a.v(n42Var2.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(n42 n42Var, n42 n42Var2) {
        boolean y;
        y = l0b.y(n42Var2.h());
        if ((!y) && !z65.c(n42Var.h(), n42Var2.h())) {
            this.a.w(n42Var2.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(n42 n42Var, n42 n42Var2) {
        if (n42Var.n() != n42Var2.n()) {
            this.a.x(n42Var2.n());
            boolean n = n42Var2.n();
            if (n) {
                this.e.a(new yx6(xx6.b, zx6.b));
            } else if (!n) {
                this.e.a(new yx6(xx6.c, zx6.b));
            }
        }
    }

    public <T> wx<T> h(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> i(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final Object j(cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.f, new a(null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public final Object n(cv1<? super k4> cv1Var) {
        return qh0.g(this.f, new b(null), cv1Var);
    }

    public final wx<n42> o() {
        return h(new c(null));
    }

    public final wx<Unit> p() {
        return i(new d(null));
    }

    public final oz3<k4> q() {
        return wz3.B(wz3.z(new e(null)), this.f);
    }

    public final wx<Unit> r(n42 n42Var) {
        z65.h(n42Var, "newCustomer");
        return i(new f(n42Var, null));
    }

    public final wx<Unit> s(mb0 mb0Var) {
        z65.h(mb0Var, "birthday");
        return i(new g(mb0Var, null));
    }
}
