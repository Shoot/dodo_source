package com.dodopizza.loyalty.missions;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import defpackage.xl6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LoyaltyMissionDetailsPresenter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0014J\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/dodopizza/loyalty/missions/LoyaltyMissionDetailsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ls16;", "", "u", "Lb16;", "missionVO", "z", "onFirstViewAttach", "x", "", "newAnswer", "w", "userAnswer", "y", "v", "Lo16;", "a", "Lo16;", "interactor", "Lf63;", "b", "Lf63;", "router", com.huawei.hms.opendevice.c.a, "Lb16;", "missionDataVO", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "Lorg/slf4j/Logger;", "logger", "Lcom/dodopizza/loyalty/missions/a;", "f", "Lcom/dodopizza/loyalty/missions/a;", "userAnswerLimit", "<init>", "(Lo16;Lf63;Lb16;Lgc;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LoyaltyMissionDetailsPresenter extends BasePresenter<s16> {
    private final o16 a;
    private final f63 b;
    private b16 c;
    private final gc d;
    private final Logger e;
    private com.dodopizza.loyalty.missions.a f;

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onAcceptButtonPressed$1", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).ye();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lwl6;", "updatedMissionStatus", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onAcceptButtonPressed$2", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<wl6, cv1<? super Unit>, Object> {
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
        public final Object invoke(wl6 wl6Var, cv1<? super Unit> cv1Var) {
            return ((b) create(wl6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wl6 wl6Var = (wl6) this.b;
                if (wl6Var != null) {
                    LoyaltyMissionDetailsPresenter loyaltyMissionDetailsPresenter = LoyaltyMissionDetailsPresenter.this;
                    loyaltyMissionDetailsPresenter.c = b16.b(loyaltyMissionDetailsPresenter.c, null, null, 0L, null, null, null, wl6Var, null, 191, null);
                    LoyaltyMissionDetailsPresenter loyaltyMissionDetailsPresenter2 = LoyaltyMissionDetailsPresenter.this;
                    loyaltyMissionDetailsPresenter2.z(loyaltyMissionDetailsPresenter2.c);
                } else {
                    ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).Y6();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onAcceptButtonPressed$3", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LoyaltyMissionDetailsPresenter.this.e.error("Can`t send accept request", (Throwable) this.b);
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).f1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onAcceptButtonPressed$4", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).mg();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onSendButtonPressed$1", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).ye();
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).k4();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lwl6;", "answeredMissionStatus", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onSendButtonPressed$2", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function2<wl6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(wl6 wl6Var, cv1<? super Unit> cv1Var) {
            return ((f) create(wl6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wl6 wl6Var = (wl6) this.b;
                if (wl6Var != null) {
                    LoyaltyMissionDetailsPresenter loyaltyMissionDetailsPresenter = LoyaltyMissionDetailsPresenter.this;
                    loyaltyMissionDetailsPresenter.c = b16.b(loyaltyMissionDetailsPresenter.c, null, null, 0L, null, null, null, wl6Var, null, 191, null);
                    LoyaltyMissionDetailsPresenter loyaltyMissionDetailsPresenter2 = LoyaltyMissionDetailsPresenter.this;
                    loyaltyMissionDetailsPresenter2.z(loyaltyMissionDetailsPresenter2.c);
                } else {
                    ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).Y6();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onSendButtonPressed$3", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LoyaltyMissionDetailsPresenter.this.e.error("Can`t send user answer", (Throwable) this.b);
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).f1();
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).ib();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyMissionDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter$onSendButtonPressed$4", f = "LoyaltyMissionDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s16) LoyaltyMissionDetailsPresenter.this.getViewState()).mg();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LoyaltyMissionDetailsPresenter(o16 o16Var, f63 f63Var, b16 b16Var, gc gcVar) {
        z65.h(o16Var, "interactor");
        z65.h(f63Var, "router");
        z65.h(b16Var, "missionDataVO");
        z65.h(gcVar, "analytics");
        this.a = o16Var;
        this.b = f63Var;
        this.c = b16Var;
        this.d = gcVar;
        this.e = LoggerFactory.getLogger("LoyaltyMissionDetailsPresenter");
        this.f = new com.dodopizza.loyalty.missions.a(0, 0, 3, null);
    }

    private final void u() {
        ((s16) getViewState()).ag(this.c.e());
        ((s16) getViewState()).Cg(this.c.f());
        ((s16) getViewState()).tg(this.c.j());
        ((s16) getViewState()).hf(this.c.c());
        vl6 d2 = this.c.d();
        if (d2 == null) {
            ((s16) getViewState()).B();
        } else if (d2.b()) {
            ((s16) getViewState()).v(d2.a());
        } else {
            ((s16) getViewState()).n(d2.a());
        }
        z(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(b16 b16Var) {
        boolean y;
        boolean y2;
        if (b16Var.k() instanceof xl6.b) {
            this.f = new com.dodopizza.loyalty.missions.a(((xl6.b) b16Var.k()).a(), ((xl6.b) b16Var.k()).b());
            ((s16) getViewState()).pc(this.f.a());
            wl6 i = b16Var.i();
            if (i instanceof gf4) {
                ((s16) getViewState()).Le();
                return;
            } else if (i instanceof zl9) {
                y2 = l0b.y(((zl9) b16Var.i()).a());
                if (!y2) {
                    ((s16) getViewState()).u2(((zl9) b16Var.i()).a());
                    return;
                } else {
                    ((s16) getViewState()).Le();
                    return;
                }
            } else if (i instanceof zxb) {
                ((s16) getViewState()).Hb(((zxb) b16Var.i()).a());
                y = l0b.y(((zxb) b16Var.i()).b());
                if (!y) {
                    ((s16) getViewState()).r4(((zxb) b16Var.i()).b());
                } else {
                    ((s16) getViewState()).k7();
                }
                ((s16) getViewState()).k4();
                return;
            } else if (i instanceof ul1) {
                ((s16) getViewState()).Hb(((ul1) b16Var.i()).a());
                ((s16) getViewState()).ze();
                ((s16) getViewState()).k4();
                return;
            } else {
                ((s16) getViewState()).za();
                ((s16) getViewState()).Y6();
                Logger logger = this.e;
                String simpleName = b16Var.i().getClass().getSimpleName();
                logger.error("Product mission can`t be in " + simpleName + " status");
                return;
            }
        }
        ((s16) getViewState()).za();
        wl6 i2 = b16Var.i();
        if (i2 instanceof gf4) {
            ((s16) getViewState()).be();
        } else if (i2 instanceof dp8) {
            dp8 dp8Var = (dp8) b16Var.i();
            ((s16) getViewState()).A1(dp8Var.a(), dp8Var.c());
        } else if (i2 instanceof tl1) {
            ((s16) getViewState()).r2(((tl1) b16Var.i()).a());
        } else {
            ((s16) getViewState()).Y6();
            Logger logger2 = this.e;
            String simpleName2 = b16Var.i().getClass().getSimpleName();
            logger2.error("Product mission can`t be in " + simpleName2 + " status");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        u();
        this.d.a(new r26(this.c.getId()));
    }

    public final void v() {
        p(o77.a(z77.a(y87.a(r77.a(this.a.a(this.c.getId()), new a(null)), new b(null)), new c(null)), new d(null)));
    }

    public final void w(String str) {
        boolean y;
        boolean y2;
        z65.h(str, "newAnswer");
        y = l0b.y(str);
        if (!(!y) || str.length() > this.f.a()) {
            y2 = l0b.y(str);
            if (y2) {
                ((s16) getViewState()).F4();
                ((s16) getViewState()).pe();
                return;
            }
            ((s16) getViewState()).Q7();
            ((s16) getViewState()).pe();
            return;
        }
        ((s16) getViewState()).F4();
        ((s16) getViewState()).q5();
    }

    public final void x() {
        this.b.d();
    }

    public final void y(String str) {
        z65.h(str, "userAnswer");
        if (str.length() >= this.f.b()) {
            p(o77.a(z77.a(y87.a(r77.a(this.a.e(this.c.getId(), str), new e(null)), new f(null)), new g(null)), new h(null)));
        } else {
            ((s16) getViewState()).Ic(this.f.b());
        }
    }
}
