package ru.dodopizza.app.presentation.product.card.halves;

import com.dodopizza.order.feature.product.card.presentation.AbstractProductCardPresenter;
import com.dodopizza.order.feature.product.card.presentation.a;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: HalvesProductCardPresenter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lru/dodopizza/app/presentation/product/card/halves/HalvesProductCardPresenter;", "Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "Lxl4;", "Lhl4;", "halvesInfoVO", "", "z", "onFirstViewAttach", "y", "", "dough", "A", "Lkotlin/Pair;", "", e.a, "Lkotlin/Pair;", "chosenHalves", "Lql4;", "f", "Lql4;", "halvesProductCardInteractor", "Lym$d;", "g", "Lym$d;", "screen", Image.TYPE_HIGH, "Ljava/lang/String;", "menuItemId", "Lorg/slf4j/Logger;", "i", "Lorg/slf4j/Logger;", "logger", "", "j", "Ljava/util/List;", "halvesVariation", "Lf63;", "router", "<init>", "(Lkotlin/Pair;Lql4;Lym$d;Lf63;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HalvesProductCardPresenter extends AbstractProductCardPresenter<xl4> {
    private final Pair<String, String> e;
    private final ql4 f;
    private final ym.d g;
    private final String h;
    private final Logger i;
    private List<hl4> j;

    /* compiled from: HalvesProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter$addToCartButtonClick$1", f = "HalvesProductCardPresenter.kt", l = {}, m = "invokeSuspend")
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
                HalvesProductCardPresenter.this.s().c(i56.a(n56.a));
                HalvesProductCardPresenter.this.s().l(AbstractProductCardPresenter.b.a(), new a.C0194a(HalvesProductCardPresenter.this.h));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: HalvesProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter$addToCartButtonClick$2", f = "HalvesProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ hl4 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(hl4 hl4Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = hl4Var;
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
                Logger logger = HalvesProductCardPresenter.this.i;
                hl4 hl4Var = this.d;
                logger.warn("Failed to add item to cart " + hl4Var, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: HalvesProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lhl4;", "variations", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter$onFirstViewAttach$1", f = "HalvesProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<List<? extends hl4>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int d;
                d = mk1.d(Integer.valueOf(((hl4) t).a()), Integer.valueOf(((hl4) t2).a()));
                return d;
            }
        }

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
        public final Object invoke(List<hl4> list, cv1<? super Unit> cv1Var) {
            return ((c) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List y0;
            Object Z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<hl4> list = (List) this.b;
                HalvesProductCardPresenter.this.j.addAll(list);
                y0 = sc1.y0(list, new a());
                Z = sc1.Z(y0);
                hl4 hl4Var = (hl4) Z;
                ((xl4) HalvesProductCardPresenter.this.getViewState()).T0(hl4Var.e());
                ((xl4) HalvesProductCardPresenter.this.getViewState()).vg(hl4Var);
                ((xl4) HalvesProductCardPresenter.this.getViewState()).sb(list, hl4Var.a());
                ((xl4) HalvesProductCardPresenter.this.getViewState()).Ad(hl4Var);
                HalvesProductCardPresenter.this.z(hl4Var);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: HalvesProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter$onFirstViewAttach$2", f = "HalvesProductCardPresenter.kt", l = {}, m = "invokeSuspend")
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
                HalvesProductCardPresenter.this.i.warn("Can't load HalvesInfoVO", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalvesProductCardPresenter(Pair<String, String> pair, ql4 ql4Var, ym.d dVar, f63 f63Var, String str) {
        super(f63Var);
        z65.h(pair, "chosenHalves");
        z65.h(ql4Var, "halvesProductCardInteractor");
        z65.h(dVar, "screen");
        z65.h(f63Var, "router");
        z65.h(str, "menuItemId");
        this.e = pair;
        this.f = ql4Var;
        this.g = dVar;
        this.h = str;
        Logger logger = LoggerFactory.getLogger("HalvesProductCardPresenter");
        z65.g(logger, "getLogger(...)");
        this.i = logger;
        this.j = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(hl4 hl4Var) {
        ((xl4) getViewState()).nf(un6.b(hl4Var.f()));
    }

    public final void A(int i) {
        for (hl4 hl4Var : this.j) {
            if (hl4Var.a() == i) {
                ((xl4) getViewState()).Zg(hl4Var);
                ((xl4) getViewState()).Ad(hl4Var);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        p(z77.a(y87.a(this.f.j(this.e), new c(null)), new d(null)));
    }

    public final void y(hl4 hl4Var) {
        z65.h(hl4Var, "halvesInfoVO");
        p(z77.a(y87.a(this.f.g(hl4Var, this.g), new a(null)), new b(hl4Var, null)));
    }
}
