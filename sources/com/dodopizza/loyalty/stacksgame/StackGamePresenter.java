package com.dodopizza.loyalty.stacksgame;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: StackGamePresenter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/dodopizza/loyalty/stacksgame/StackGamePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lfta;", "", "onFirstViewAttach", "onDestroy", "B", "A", "D", "", "newPointsCount", "", "newCoinsAmount", "C", "finalPointsCount", "finalAmountCount", "lossReason", "z", "rewardAmount", "pointsCount", "E", "F", "onBackPressed", "Lysa;", "b", "Lysa;", "interactor", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "activeOrderId", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "Lzsa;", "g", "Lzsa;", "data", Image.TYPE_HIGH, "I", "tryNumber", "<init>", "(Lysa;Lf63;Ljava/lang/String;Lgc;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StackGamePresenter extends BasePresenter2<fta> {
    private final ysa b;
    private final f63 c;
    private final String d;
    private final gc e;
    private final Logger f;
    private zsa g;
    private int h;

    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onFirstViewAttach$1", f = "StackGamePresenter.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        Object a;
        int b;

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
            Object d;
            StackGamePresenter stackGamePresenter;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    stackGamePresenter = (StackGamePresenter) this.a;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ((fta) StackGamePresenter.this.getViewState()).b();
                StackGamePresenter stackGamePresenter2 = StackGamePresenter.this;
                ysa ysaVar = stackGamePresenter2.b;
                String str = StackGamePresenter.this.d;
                this.a = stackGamePresenter2;
                this.b = 1;
                Object f = ysaVar.f(str, this);
                if (f == d) {
                    return d;
                }
                stackGamePresenter = stackGamePresenter2;
                obj = f;
            }
            stackGamePresenter.g = (zsa) obj;
            ((fta) StackGamePresenter.this.getViewState()).Z3(StackGamePresenter.this.g.h(), StackGamePresenter.this.g.f());
            return Unit.a;
        }
    }

    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onFirstViewAttach$2", f = "StackGamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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
                StackGamePresenter.this.f.error("Can`t load game url", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onGameOver$1", f = "StackGamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i, int i2, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                StackGamePresenter.this.e.a(new sd7(StackGamePresenter.this.d, StackGamePresenter.this.g.g(), this.c));
                ((fta) StackGamePresenter.this.getViewState()).S6(this.c);
                if (StackGamePresenter.this.g.e() != null) {
                    ((fta) StackGamePresenter.this.getViewState()).vf();
                    ((fta) StackGamePresenter.this.getViewState()).o7();
                } else {
                    double d = this.d;
                    if (d == StackGamePresenter.this.g.i().b()) {
                        StackGamePresenter.this.E(d, this.c);
                    } else if (d > 0.0d) {
                        ((fta) StackGamePresenter.this.getViewState()).wg(d, this.c);
                    } else {
                        ((fta) StackGamePresenter.this.getViewState()).o7();
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onLoadingGameFinished$1", f = "StackGamePresenter.kt", l = {}, m = "invokeSuspend")
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((fta) StackGamePresenter.this.getViewState()).C();
                ((fta) StackGamePresenter.this.getViewState()).S6(0);
                if (StackGamePresenter.this.g.k() && StackGamePresenter.this.g.e() == null) {
                    ((fta) StackGamePresenter.this.getViewState()).Ra(0.0d, StackGamePresenter.this.g.i().b());
                } else {
                    ((fta) StackGamePresenter.this.getViewState()).vf();
                }
                ((fta) StackGamePresenter.this.getViewState()).n2();
                ((fta) StackGamePresenter.this.getViewState()).A7(StackGamePresenter.this.g.i().d(), StackGamePresenter.this.g.i().a());
                StackGamePresenter.this.e.a(new td7(StackGamePresenter.this.d, StackGamePresenter.this.g.g()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onPointEarned$1", f = "StackGamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ int c;
        final /* synthetic */ double d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i, double d, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = i;
            this.d = d;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, this.d, cv1Var);
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
                ((fta) StackGamePresenter.this.getViewState()).S6(this.c);
                if (StackGamePresenter.this.g.e() == null && StackGamePresenter.this.g.k()) {
                    double b = StackGamePresenter.this.g.i().b();
                    double d = (StackGamePresenter.this.g.i().d() * b) / StackGamePresenter.this.g.i().a();
                    if (this.d == b && this.c == ((int) d)) {
                        ((fta) StackGamePresenter.this.getViewState()).O4(StackGamePresenter.this.g.d().b());
                        ((fta) StackGamePresenter.this.getViewState()).j6(b);
                    } else if (this.c > ((int) d)) {
                        ((fta) StackGamePresenter.this.getViewState()).j6(b);
                    } else {
                        ((fta) StackGamePresenter.this.getViewState()).Ra(this.d, b);
                    }
                } else {
                    ((fta) StackGamePresenter.this.getViewState()).vf();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onTakeRewardPressed$1", f = "StackGamePresenter.kt", l = {197}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ double c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(double d, int i, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = d;
            this.d = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object h;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                    h = ((xd7) obj).f();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ((fta) StackGamePresenter.this.getViewState()).b();
                ysa ysaVar = StackGamePresenter.this.b;
                String str = StackGamePresenter.this.d;
                double d2 = this.c;
                this.a = 1;
                h = ysaVar.h(str, d2, this);
                if (h == d) {
                    return d;
                }
            }
            String str2 = (String) h;
            if (str2 == null) {
                h81 h81Var = new h81(StackGamePresenter.this.d, this.c);
                StackGamePresenter stackGamePresenter = StackGamePresenter.this;
                stackGamePresenter.g = zsa.c(stackGamePresenter.g, null, h81Var, null, null, null, null, null, false, 253, null);
                ((fta) StackGamePresenter.this.getViewState()).o7();
                ((fta) StackGamePresenter.this.getViewState()).S6(this.d);
                ((fta) StackGamePresenter.this.getViewState()).de(h81Var.a(), StackGamePresenter.this.g.d().a());
            } else {
                ((fta) StackGamePresenter.this.getViewState()).wg(this.c, this.d);
                ((fta) StackGamePresenter.this.getViewState()).Hd((String) mh5.b(str2, "Error message can`t be null in this place"));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onTakeRewardPressed$2", f = "StackGamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ double d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(double d, int i, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.d = d;
            this.e = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(this.d, this.e, cv1Var);
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
                StackGamePresenter.this.f.error("Can`t take reward", (Throwable) this.b);
                ((fta) StackGamePresenter.this.getViewState()).wg(this.d, this.e);
                ((fta) StackGamePresenter.this.getViewState()).F2();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onTakeRewardPressed$3", f = "StackGamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                ((fta) StackGamePresenter.this.getViewState()).C();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGamePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGamePresenter$onTryAgainPressed$1", f = "StackGamePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                boolean z = true;
                StackGamePresenter.this.h++;
                gc gcVar = StackGamePresenter.this.e;
                String str = StackGamePresenter.this.d;
                String g = StackGamePresenter.this.g.g();
                if (StackGamePresenter.this.g.e() != null) {
                    z = false;
                }
                gcVar.a(new vd7(str, g, z, StackGamePresenter.this.h));
                ((fta) StackGamePresenter.this.getViewState()).jb();
                ((fta) StackGamePresenter.this.getViewState()).te(StackGamePresenter.this.g.j());
                ((fta) StackGamePresenter.this.getViewState()).S6(0);
                if (StackGamePresenter.this.g.k() && StackGamePresenter.this.g.e() == null) {
                    ((fta) StackGamePresenter.this.getViewState()).Ra(0.0d, StackGamePresenter.this.g.i().b());
                } else {
                    ((fta) StackGamePresenter.this.getViewState()).vf();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public StackGamePresenter(ysa ysaVar, f63 f63Var, String str, gc gcVar) {
        z65.h(ysaVar, "interactor");
        z65.h(f63Var, "router");
        z65.h(str, "activeOrderId");
        z65.h(gcVar, "analytics");
        this.b = ysaVar;
        this.c = f63Var;
        this.d = str;
        this.e = gcVar;
        this.f = LoggerFactory.getLogger("PizzaStacksGamePresenter");
        this.g = zsa.i.a();
    }

    public final void A() {
        wj1.b(hy.a(new d(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void B() {
        ((fta) getViewState()).b();
    }

    public final void C(int i2, double d2) {
        wj1.b(hy.a(new e(i2, d2, null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void D() {
        boolean z = true;
        this.h++;
        gc gcVar = this.e;
        String str = this.d;
        String g2 = this.g.g();
        if (this.g.e() != null) {
            z = false;
        }
        gcVar.a(new vd7(str, g2, z, this.h));
        ((fta) getViewState()).C();
        ((fta) getViewState()).te(this.g.j());
        ((fta) getViewState()).S6(0);
    }

    public final void E(double d2, int i2) {
        this.e.a(new ud7(this.d, this.g.g(), (long) d2));
        wj1.b(o77.a(z77.a(hy.a(new f(d2, i2, null)), new g(d2, i2, null)), new h(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void F() {
        wj1.b(hy.a(new i(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void onBackPressed() {
        this.c.d();
        this.e.a(new rd7(this.d, this.g.g()));
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        super.onDestroy();
        ((fta) getViewState()).q6();
        this.h = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        wj1.b(z77.a(hy.a(new a(null)), new b(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void z(int i2, int i3, int i4) {
        wj1.b(hy.a(new c(i2, i3, null)), PresenterScopeKt.getPresenterScope(this));
    }
}
