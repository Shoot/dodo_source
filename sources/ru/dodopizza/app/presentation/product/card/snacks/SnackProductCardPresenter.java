package ru.dodopizza.app.presentation.product.card.snacks;

import com.dodopizza.order.feature.product.card.presentation.AbstractProductCardPresenter;
import com.dodopizza.order.feature.product.card.presentation.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nb6;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SnackProductCardPresenter.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020\u0014\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0014J\u0016\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0015J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lru/dodopizza/app/presentation/product/card/snacks/SnackProductCardPresenter;", "Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "Lqoa;", "Lfoa;", "snackInfoVO", "", "H", "Lhn6;", "rawPrice", "actualPrice", "", "timeRemain", "I", "D", "G", "price", "F", "J", "snackInfoVo", "E", "", "", "B", "onFirstViewAttach", "isHero", "C", "", "positionInMenu", "isHeroProduct", "K", "A", "onDestroy", "Lkoa;", com.huawei.hms.push.e.a, "Lkoa;", "interactor", "Lym$d;", "f", "Lym$d;", "screen", "g", "Ljava/lang/String;", "menuItemId", Image.TYPE_HIGH, "menuItemIdV5", "Lf5b;", "i", "Lf5b;", "timeProvider", "Lt18;", "j", "Lt18;", "personalPriceTimer", "Lorg/slf4j/Logger;", "k", "Lorg/slf4j/Logger;", "logger", "l", "Lfoa;", "Lf63;", "router", "<init>", "(Lkoa;Lym$d;Ljava/lang/String;Ljava/lang/String;Lf63;Lf5b;Lt18;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnackProductCardPresenter extends AbstractProductCardPresenter<qoa> {
    private final koa e;
    private final ym.d f;
    private final String g;
    private final String h;
    private final f5b i;
    private final t18 j;
    private final Logger k;
    private foa l;

    /* compiled from: SnackProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter$onAddToCartButtonClick$1", f = "SnackProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((a) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SnackProductCardPresenter.this.s().c(i56.a(n56.a));
                SnackProductCardPresenter.this.s().l(AbstractProductCardPresenter.b.a(), new a.C0194a(SnackProductCardPresenter.this.g));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SnackProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter$onAddToCartButtonClick$2", f = "SnackProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ foa d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(foa foaVar, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = foaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.d, cv1Var);
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
                Logger logger = SnackProductCardPresenter.this.k;
                foa foaVar = this.d;
                logger.warn("Failed to add item to cart " + foaVar, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SnackProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lfoa;", "snackInfoVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter$onFirstViewAttach$1", f = "SnackProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<foa, cv1<? super Unit>, Object> {
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
        public final Object invoke(foa foaVar, cv1<? super Unit> cv1Var) {
            return ((c) create(foaVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                foa foaVar = (foa) this.b;
                SnackProductCardPresenter.this.l = foaVar;
                ((qoa) SnackProductCardPresenter.this.getViewState()).m4(foaVar);
                SnackProductCardPresenter.this.H(foaVar);
                SnackProductCardPresenter.this.E(foaVar);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SnackProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter$onFirstViewAttach$2", f = "SnackProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
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
                Logger logger = SnackProductCardPresenter.this.k;
                String str = SnackProductCardPresenter.this.g;
                logger.warn("Can't load snack for menuItemId = [" + str + "]", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "lastRemainTime", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<Long, Unit> {
        e() {
            super(1);
        }

        public final void a(long j) {
            ((qoa) SnackProductCardPresenter.this.getViewState()).x(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            a(l.longValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ foa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(foa foaVar) {
            super(0);
            this.b = foaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((qoa) SnackProductCardPresenter.this.getViewState()).I(false);
            ((qoa) SnackProductCardPresenter.this.getViewState()).E();
            SnackProductCardPresenter.this.I(this.b.j(), this.b.i(), 0L);
            ((qoa) SnackProductCardPresenter.this.getViewState()).I5(false);
        }
    }

    /* compiled from: SnackProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter$trackOpenSnackProductCard$1", f = "SnackProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                SnackProductCardPresenter.this.k.warn("Failed to track product card open event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackProductCardPresenter(koa koaVar, ym.d dVar, String str, String str2, f63 f63Var, f5b f5bVar, t18 t18Var) {
        super(f63Var);
        z65.h(koaVar, "interactor");
        z65.h(dVar, "screen");
        z65.h(str, "menuItemId");
        z65.h(f63Var, "router");
        z65.h(f5bVar, "timeProvider");
        z65.h(t18Var, "personalPriceTimer");
        this.e = koaVar;
        this.f = dVar;
        this.g = str;
        this.h = str2;
        this.i = f5bVar;
        this.j = t18Var;
        Logger logger = LoggerFactory.getLogger("SnackProductCardPresenter");
        z65.g(logger, "getLogger(...)");
        this.k = logger;
    }

    private final boolean B(String str) {
        boolean y;
        boolean v;
        y = l0b.y(str);
        if (!y) {
            v = l0b.v(str, "null", true);
            if (!v) {
                return true;
            }
        }
        return false;
    }

    private final void D(foa foaVar, long j) {
        if (j > 0 && foaVar.j() != null) {
            ((qoa) getViewState()).I(true);
            ((qoa) getViewState()).x(j);
            this.j.a(j, new e(), new f(foaVar));
            return;
        }
        ((qoa) getViewState()).x(0L);
        ((qoa) getViewState()).N();
        ((qoa) getViewState()).I5(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(foa foaVar) {
        rl8 e2 = foaVar.e();
        if (B(e2.a()) && B(e2.b()) && B(e2.c()) && B(e2.d())) {
            ((qoa) getViewState()).me(foaVar);
        } else {
            ((qoa) getViewState()).Dc();
        }
    }

    private final void F(hn6 hn6Var) {
        ((qoa) getViewState()).J9(un6.b(hn6Var));
    }

    private final void G(foa foaVar) {
        if (foaVar.j() != null) {
            J(foaVar.j(), foaVar.i());
        } else {
            F(foaVar.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(foa foaVar) {
        boolean z;
        if (foaVar.f() && foaVar.j() != null) {
            ((qoa) getViewState()).p();
            long d2 = foaVar.d() - this.i.b();
            I(foaVar.j(), foaVar.i(), d2);
            D(foaVar, d2);
        } else {
            ((qoa) getViewState()).N();
            G(foaVar);
        }
        qoa qoaVar = (qoa) getViewState();
        if (foaVar.f() && foaVar.j() != null) {
            z = true;
        } else {
            z = false;
        }
        qoaVar.I5(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(hn6 hn6Var, hn6 hn6Var2, long j) {
        if (j <= 0) {
            F(hn6Var);
        } else {
            J(hn6Var, hn6Var2);
        }
    }

    private final void J(hn6 hn6Var, hn6 hn6Var2) {
        ((qoa) getViewState()).C2(hn6Var, hn6Var2);
    }

    public final void A(foa foaVar) {
        Integer k;
        int i;
        z65.h(foaVar, "snackInfoVO");
        nb6.a aVar = nb6.a;
        k = k0b.k(foaVar.k().a());
        if (k != null) {
            i = k.intValue();
        } else {
            i = -1;
        }
        nb6 a2 = aVar.a(i);
        if (a2 == nb6.g) {
            ((qoa) getViewState()).Tb(foaVar.k().getValue());
        } else if (a2 != nb6.h) {
            ((qoa) getViewState()).E3(foaVar.k());
        } else {
            ((qoa) getViewState()).U1();
        }
    }

    public final void C(foa foaVar, boolean z) {
        z65.h(foaVar, "snackInfoVO");
        p(z77.a(y87.a(this.e.g(this.g, this.h, this.f, z), new a(null)), new b(foaVar, null)));
    }

    public final void K(int i, boolean z) {
        p(z77.a(this.e.k(this.g, i, this.f, z), new g(null)));
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        super.onDestroy();
        this.j.release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        p(z77.a(y87.a(this.e.j(this.g, this.h), new c(null)), new d(null)));
    }
}
