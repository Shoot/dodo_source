package com.dodopizza.order.feature.product.card.presentation.pizza;

import com.dodopizza.order.feature.product.card.presentation.AbstractProductCardPresenter;
import com.dodopizza.order.feature.product.card.presentation.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: PizzaProductCardPresenter.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001{BG\b\u0007\u0012\b\b\u0001\u0010>\u001a\u00020\u0010\u0012\u0006\u0010B\u001a\u00020?\u0012\b\b\u0001\u0010D\u001a\u00020\u0010\u0012\b\b\u0001\u0010H\u001a\u00020E\u0012\u0006\u0010x\u001a\u00020w\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M¢\u0006\u0004\by\u0010zJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0003J\u0014\u0010\u0012\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000bJ\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010\u001f\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\"\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010%H\u0002J\u001e\u0010.\u001a\u00020\u00032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\u0006\u0010-\u001a\u00020 H\u0002J\u0010\u00100\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010/H\u0002J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000204H\u0002J\u0010\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u000207H\u0002J\b\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0003H\u0002R\u0014\u0010>\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010=R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00100X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00100X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010ZR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010\u0012R\u001c\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010VR(\u0010o\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001d0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020 0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010VR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010\u0012¨\u0006|"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter;", "Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "Lcom/dodopizza/order/feature/product/card/presentation/pizza/e;", "", "onFirstViewAttach", "", "sizeGroup", "dough", "U", "Lkjb;", "toppingVO", "", "isAdded", "i0", "a0", "", "", "newRemovedIngredientsIds", "Z", "Lx78;", "pizzaProductCardVO", "isHero", "V", "positionInMenu", "isHeroProduct", "k0", "X", "W", "Y", "", "pizzas", "e0", "Lfxb;", "variationVO", "T", "h0", "j0", "Lhn6;", "P", "O", "isFromCart", "price", "rawPrice", "g0", "pizzasProductCardVO", "currentPizzaVariationVO", "R", "", "S", "c0", "toppingToUpdate", "l0", "Ly68;", "pizzaCardVO", "f0", "", "timeRemain", "b0", "Q", "d0", com.huawei.hms.push.e.a, "Ljava/lang/String;", "cartItemId", "Lq78;", "f", "Lq78;", "pizzaProductCardInteractor", "g", "menuItemId", "Lym$d;", Image.TYPE_HIGH, "Lym$d;", "screen", "Lf5b;", "i", "Lf5b;", "timeProvider", "Lt18;", "j", "Lt18;", "personalPriceTimer", "Lorg/slf4j/Logger;", "k", "Lorg/slf4j/Logger;", "logger", "l", "Ljava/util/List;", "pizzaVariations", "", Image.TYPE_MEDIUM, "Ljava/util/Set;", "removedIngredientIds", "n", "addedToppingsIds", "Ll6;", "o", "Ll6;", "toppingsDataSet", "p", "Lx78;", "currentPizzaVO", "q", "J", "discountEndTime", "r", "hasCardDiscount", Image.TYPE_SMALL, "discountForSize", "", "t", "Ljava/util/Map;", "discountForDough", "u", "availableCombinationDiscounts", "v", "Ljava/util/Iterator;", "availableDiscountIterator", "w", "isArPizzaAvailable", "Lf63;", "router", "<init>", "(Ljava/lang/String;Lq78;Ljava/lang/String;Lym$d;Lf63;Lf5b;Lt18;)V", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PizzaProductCardPresenter extends AbstractProductCardPresenter<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
    private final String e;
    private final q78 f;
    private final String g;
    private final ym.d h;
    private final f5b i;
    private final t18 j;
    private final Logger k;
    private List<x78> l;
    private final Set<String> m;
    private final Set<String> n;
    private final l6<kjb> o;
    private x78 p;
    private long q;
    private boolean r;
    private List<Integer> s;
    private Map<Integer, ? extends List<Integer>> t;
    private List<fxb> u;
    private Iterator<fxb> v;
    private boolean w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/PizzaProductCardPresenter$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a("DONE", 0);
        public static final a b = new a("ADD_TO_CART", 1);
        private static final /* synthetic */ a[] c;
        private static final /* synthetic */ kj3 d;

        static {
            a[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "th", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$handleVariationChange$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                PizzaProductCardPresenter.this.k.error("Failed to track variation changes", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$onAddToCartButtonClick$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((c) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter.this.s().c(i56.a(n56.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$onAddToCartButtonClick$2", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ x78 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x78 x78Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.d = x78Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.d, cv1Var);
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
                Logger logger = PizzaProductCardPresenter.this.k;
                x78 x78Var = this.d;
                logger.warn("Failed to edit item to cart " + x78Var, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$onAddToCartButtonClick$3", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((e) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter.this.s().c(i56.a(n56.a));
                PizzaProductCardPresenter.this.s().l(AbstractProductCardPresenter.b.a(), new a.C0194a(PizzaProductCardPresenter.this.g));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$onAddToCartButtonClick$4", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ x78 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x78 x78Var, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.d = x78Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(this.d, cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = PizzaProductCardPresenter.this.k;
                x78 x78Var = this.d;
                logger.warn("Failed to add item to cart " + x78Var, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "th", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$onDiscountBadgeClick$1$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
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
                PizzaProductCardPresenter.this.k.error("Failed to track Discount Badge Clicked", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ly68;", "cardVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$onFirstViewAttach$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function2<y68, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(y68 y68Var, cv1<? super Unit> cv1Var) {
            return ((h) create(y68Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                y68 y68Var = (y68) this.b;
                x78 d = y68Var.d();
                PizzaProductCardPresenter.this.p = d;
                PizzaProductCardPresenter.this.l = y68Var.f();
                PizzaProductCardPresenter.this.q = y68Var.b();
                PizzaProductCardPresenter.this.r = y68Var.c();
                PizzaProductCardPresenter.this.n.addAll(y68Var.a());
                PizzaProductCardPresenter.this.m.addAll(y68Var.g());
                PizzaProductCardPresenter.this.e0(y68Var.f());
                ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).T0(y68Var.e());
                ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).pa(d);
                com.dodopizza.order.feature.product.card.presentation.pizza.e eVar = (com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState();
                x78 x78Var = PizzaProductCardPresenter.this.p;
                if (x78Var == null) {
                    z65.z("currentPizzaVO");
                    x78Var = null;
                }
                eVar.J5(x78Var.g(), y68Var.g());
                if (!d.f()) {
                    PizzaProductCardPresenter.this.R(y68Var.f(), d.l());
                    ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).C0(PizzaProductCardPresenter.this.o);
                    PizzaProductCardPresenter.this.f0(y68Var);
                    PizzaProductCardPresenter.this.c0(d);
                    PizzaProductCardPresenter.this.O(d);
                } else {
                    ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).m0();
                    ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).t();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$onFirstViewAttach$2", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = PizzaProductCardPresenter.this.k;
                String str = PizzaProductCardPresenter.this.g;
                logger.warn("Can't load productCardVO for menuItemId = [" + str + "]", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$removeIngredients$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class j extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Collection<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Collection<String> collection, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.c = collection;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((j) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter.this.m.clear();
                PizzaProductCardPresenter.this.m.addAll(this.c);
                com.dodopizza.order.feature.product.card.presentation.pizza.e eVar = (com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState();
                x78 x78Var = PizzaProductCardPresenter.this.p;
                if (x78Var == null) {
                    z65.z("currentPizzaVO");
                    x78Var = null;
                }
                eVar.J5(x78Var.g(), PizzaProductCardPresenter.this.m);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "lastRemainTime", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function1<Long, Unit> {
        k() {
            super(1);
        }

        public final void a(long j) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).x(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            a(l.longValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class l extends ej5 implements Function0<Unit> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).I(false);
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).E();
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).G0();
            PizzaProductCardPresenter.this.Q();
            PizzaProductCardPresenter pizzaProductCardPresenter = PizzaProductCardPresenter.this;
            x78 x78Var = pizzaProductCardPresenter.p;
            if (x78Var == null) {
                z65.z("currentPizzaVO");
                x78Var = null;
            }
            pizzaProductCardPresenter.O(x78Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$setupArPizza$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function1<cv1<? super Boolean>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new m(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((m) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isAvailable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$setupArPizza$2", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = ((Boolean) obj).booleanValue();
            return nVar;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((n) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                boolean z = this.b;
                PizzaProductCardPresenter.this.w = z;
                if (z) {
                    ((com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState()).Lg();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$setupArPizza$3", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((o) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter.this.k.error("Failed to setup AR pizza", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$toppingAdded$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ kjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(kjb kjbVar, cv1<? super p> cv1Var) {
            super(1, cv1Var);
            this.c = kjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new p(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((p) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter.this.n.add(this.c.d());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$toppingAdded$2", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ kjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(kjb kjbVar, cv1<? super q> cv1Var) {
            super(2, cv1Var);
            this.c = kjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new q(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((q) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter pizzaProductCardPresenter = PizzaProductCardPresenter.this;
                pizzaProductCardPresenter.p(pizzaProductCardPresenter.f.p(PizzaProductCardPresenter.this.g, this.c));
                com.dodopizza.order.feature.product.card.presentation.pizza.e eVar = (com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState();
                x78 x78Var = PizzaProductCardPresenter.this.p;
                x78 x78Var2 = null;
                if (x78Var == null) {
                    z65.z("currentPizzaVO");
                    x78Var = null;
                }
                eVar.J5(x78Var.g(), PizzaProductCardPresenter.this.m);
                PizzaProductCardPresenter.this.l0(this.c, true);
                PizzaProductCardPresenter pizzaProductCardPresenter2 = PizzaProductCardPresenter.this;
                x78 x78Var3 = pizzaProductCardPresenter2.p;
                if (x78Var3 == null) {
                    z65.z("currentPizzaVO");
                } else {
                    x78Var2 = x78Var3;
                }
                pizzaProductCardPresenter2.O(x78Var2);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$toppingRemoved$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ kjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(kjb kjbVar, cv1<? super r> cv1Var) {
            super(1, cv1Var);
            this.c = kjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new r(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((r) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter.this.n.remove(this.c.d());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$toppingRemoved$2", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ kjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(kjb kjbVar, cv1<? super s> cv1Var) {
            super(2, cv1Var);
            this.c = kjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new s(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((s) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter pizzaProductCardPresenter = PizzaProductCardPresenter.this;
                pizzaProductCardPresenter.p(pizzaProductCardPresenter.f.q(PizzaProductCardPresenter.this.g, this.c));
                com.dodopizza.order.feature.product.card.presentation.pizza.e eVar = (com.dodopizza.order.feature.product.card.presentation.pizza.e) PizzaProductCardPresenter.this.getViewState();
                x78 x78Var = PizzaProductCardPresenter.this.p;
                x78 x78Var2 = null;
                if (x78Var == null) {
                    z65.z("currentPizzaVO");
                    x78Var = null;
                }
                eVar.J5(x78Var.g(), PizzaProductCardPresenter.this.m);
                PizzaProductCardPresenter.this.l0(this.c, false);
                PizzaProductCardPresenter pizzaProductCardPresenter2 = PizzaProductCardPresenter.this;
                x78 x78Var3 = pizzaProductCardPresenter2.p;
                if (x78Var3 == null) {
                    z65.z("currentPizzaVO");
                } else {
                    x78Var2 = x78Var3;
                }
                pizzaProductCardPresenter2.O(x78Var2);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter$trackOpenPizzaProductCard$1", f = "PizzaProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class t extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((t) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PizzaProductCardPresenter.this.k.warn("Failed to track product card open event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkjb;", "toppingVO", "", "a", "(Lkjb;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class u extends ej5 implements Function1<kjb, Boolean> {
        final /* synthetic */ kjb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(kjb kjbVar) {
            super(1);
            this.a = kjbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(kjb kjbVar) {
            z65.h(kjbVar, "toppingVO");
            return Boolean.valueOf(z65.c(kjbVar, this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PizzaProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkjb;", "toppingVO", "", "", "a", "(Lkjb;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class v extends ej5 implements Function1<kjb, List<? extends String>> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(kjb kjbVar) {
            List<String> e;
            z65.h(kjbVar, "toppingVO");
            kjbVar.g(this.a);
            e = jc1.e("added_state_changed");
            return e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PizzaProductCardPresenter(String str, q78 q78Var, String str2, ym.d dVar, f63 f63Var, f5b f5bVar, t18 t18Var) {
        super(f63Var);
        List<x78> l2;
        List<Integer> l3;
        Map<Integer, ? extends List<Integer>> h2;
        List<fxb> l4;
        z65.h(str, "cartItemId");
        z65.h(q78Var, "pizzaProductCardInteractor");
        z65.h(str2, "menuItemId");
        z65.h(dVar, "screen");
        z65.h(f63Var, "router");
        z65.h(f5bVar, "timeProvider");
        z65.h(t18Var, "personalPriceTimer");
        this.e = str;
        this.f = q78Var;
        this.g = str2;
        this.h = dVar;
        this.i = f5bVar;
        this.j = t18Var;
        Logger logger = LoggerFactory.getLogger("PizzaProductCardPresenter");
        z65.g(logger, "getLogger(...)");
        this.k = logger;
        l2 = kc1.l();
        this.l = l2;
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.o = new l6<>(null, 1, null);
        l3 = kc1.l();
        this.s = l3;
        h2 = g86.h();
        this.t = h2;
        l4 = kc1.l();
        this.u = l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(x78 x78Var) {
        Pair pair;
        boolean z;
        hn6 P = P(x78Var);
        long b2 = this.q - this.i.b();
        hn6 f2 = kn6.f();
        if (x78Var.j() != null) {
            if (b2 > 0) {
                hn6 f3 = rn6.f(x78Var.i(), P);
                hn6 j2 = x78Var.j();
                if (j2 != null) {
                    f2 = j2;
                }
                pair = new Pair(f3, rn6.f(f2, P));
            } else {
                hn6 j3 = x78Var.j();
                if (j3 != null) {
                    f2 = j3;
                }
                pair = new Pair(rn6.f(f2, P), null);
            }
        } else {
            pair = new Pair(rn6.f(x78Var.i(), P), null);
        }
        hn6 hn6Var = (hn6) pair.a();
        hn6 hn6Var2 = (hn6) pair.b();
        boolean z2 = false;
        if (this.e.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        g0(z, hn6Var, hn6Var2);
        com.dodopizza.order.feature.product.card.presentation.pizza.e eVar = (com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState();
        if (hn6Var2 != null) {
            z2 = true;
        }
        eVar.I5(z2);
    }

    private final hn6 P(x78 x78Var) {
        ArrayList<ejb> arrayList = new ArrayList();
        for (Object obj : x78Var.k()) {
            if (this.n.contains(((ejb) obj).c())) {
                arrayList.add(obj);
            }
        }
        hn6 f2 = kn6.f();
        for (ejb ejbVar : arrayList) {
            f2 = rn6.f(f2, ejbVar.h());
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        Map<Integer, ? extends List<Integer>> h2;
        List<Integer> l2;
        List<fxb> l3;
        h2 = g86.h();
        this.t = h2;
        l2 = kc1.l();
        this.s = l2;
        l3 = kc1.l();
        this.u = l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(List<x78> list, fxb fxbVar) {
        List<Integer> F0;
        Object i2;
        int w;
        Object i3;
        int w2;
        Map<Integer, ? extends List<Integer>> s2;
        int w3;
        List R;
        Map<Integer, ? extends List<Integer>> h2;
        int w4;
        int w5;
        List<x78> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            Integer valueOf = Integer.valueOf(((x78) obj).l().c());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        F0 = sc1.F0(linkedHashMap.keySet());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Iterable iterable = (Iterable) entry.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        x78 x78Var = (x78) it.next();
                        if (x78Var.d() && !x78Var.f()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList.add(Integer.valueOf(((Number) entry2.getKey()).intValue()));
        }
        this.s = arrayList;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            Iterable<x78> iterable2 = (Iterable) entry3.getValue();
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (x78 x78Var2 : iterable2) {
                    if (!x78Var2.f()) {
                        break;
                    }
                }
            }
            linkedHashMap3.put(entry3.getKey(), entry3.getValue());
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap3.size());
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            arrayList2.add(Integer.valueOf(((Number) entry4.getKey()).intValue()));
        }
        i2 = g86.i(linkedHashMap, Integer.valueOf(fxbVar.c()));
        Iterable<x78> iterable3 = (Iterable) i2;
        w = lc1.w(iterable3, 10);
        ArrayList arrayList3 = new ArrayList(w);
        for (x78 x78Var3 : iterable3) {
            arrayList3.add(Integer.valueOf(x78Var3.l().a()));
        }
        i3 = g86.i(linkedHashMap, Integer.valueOf(fxbVar.c()));
        ArrayList<x78> arrayList4 = new ArrayList();
        for (Object obj3 : (Iterable) i3) {
            if (((x78) obj3).f()) {
                arrayList4.add(obj3);
            }
        }
        w2 = lc1.w(arrayList4, 10);
        ArrayList arrayList5 = new ArrayList(w2);
        for (x78 x78Var4 : arrayList4) {
            arrayList5.add(Integer.valueOf(x78Var4.l().a()));
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry5 : linkedHashMap.entrySet()) {
            Object key = entry5.getKey();
            ArrayList<x78> arrayList7 = new ArrayList();
            for (Object obj4 : (Iterable) entry5.getValue()) {
                x78 x78Var5 = (x78) obj4;
                if (x78Var5.d() && !x78Var5.f()) {
                    arrayList7.add(obj4);
                }
            }
            w5 = lc1.w(arrayList7, 10);
            ArrayList arrayList8 = new ArrayList(w5);
            for (x78 x78Var6 : arrayList7) {
                arrayList8.add(Integer.valueOf(x78Var6.l().a()));
            }
            arrayList6.add(lnb.a(key, arrayList8));
        }
        s2 = g86.s(arrayList6);
        this.t = s2;
        w3 = lc1.w(list2, 10);
        ArrayList arrayList9 = new ArrayList(w3);
        for (x78 x78Var7 : list2) {
            arrayList9.add(Integer.valueOf(x78Var7.l().a()));
        }
        R = sc1.R(arrayList9);
        if (R.size() > 1) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).va();
        } else {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).na();
            h2 = g86.h();
            this.t = h2;
        }
        ArrayList<x78> arrayList10 = new ArrayList();
        for (Object obj5 : list2) {
            x78 x78Var8 = (x78) obj5;
            if (x78Var8.d() && !x78Var8.f()) {
                arrayList10.add(obj5);
            }
        }
        w4 = lc1.w(arrayList10, 10);
        ArrayList arrayList11 = new ArrayList(w4);
        for (x78 x78Var9 : arrayList10) {
            arrayList11.add(x78Var9.l());
        }
        this.u = arrayList11;
        this.v = null;
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).Q(F0, this.s, arrayList2);
        com.dodopizza.order.feature.product.card.presentation.pizza.e eVar = (com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState();
        List<Integer> list3 = this.t.get(Integer.valueOf(fxbVar.c()));
        if (list3 == null) {
            list3 = kc1.l();
        }
        eVar.t7(arrayList3, list3, arrayList5);
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).ch(fxbVar.c(), fxbVar.a());
        T(fxbVar);
    }

    private final Iterator<fxb> S() {
        if (!this.u.isEmpty()) {
            if (this.v == null) {
                this.v = nr5.a(this.u);
            }
            return this.v;
        }
        return null;
    }

    private final void T(fxb fxbVar) {
        List<Integer> e2;
        if (this.u.contains(fxbVar)) {
            e2 = jc1.e(Integer.valueOf(fxbVar.c()));
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).Xa(e2);
            return;
        }
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).R1(fxbVar.c());
    }

    private final void b0(long j2) {
        if (j2 > 0) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).I(true);
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).x(j2);
            this.j.a(j2, new k(), new l());
            return;
        }
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).N();
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).G0();
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(x78 x78Var) {
        int w;
        Collection<ejb> k2 = x78Var.k();
        if (!k2.isEmpty()) {
            Collection<ejb> collection = k2;
            w = lc1.w(collection, 10);
            ArrayList arrayList = new ArrayList(w);
            for (ejb ejbVar : collection) {
                arrayList.add(new kjb(ejbVar.c(), ejbVar.b(), ejbVar.getName(), ejbVar.h(), ejbVar.a(), this.n.contains(ejbVar.c())));
            }
            this.o.r();
            this.o.addAll(arrayList);
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).O();
            return;
        }
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).t();
        this.o.r();
    }

    private final void d0() {
        p(z77.a(y87.a(hy.a(new m(null)), new n(null)), new o(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(List<x78> list) {
        int w;
        int e2;
        int e3;
        int w2;
        int e4;
        int e5;
        List<x78> list2 = list;
        w = lc1.w(list2, 10);
        e2 = f86.e(w);
        e3 = kotlin.ranges.i.e(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e3);
        for (x78 x78Var : list2) {
            linkedHashMap.put(Integer.valueOf(x78Var.l().c()), x78Var.l().d());
        }
        w2 = lc1.w(list2, 10);
        e4 = f86.e(w2);
        e5 = kotlin.ranges.i.e(e4, 16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e5);
        for (x78 x78Var2 : list2) {
            linkedHashMap2.put(Integer.valueOf(x78Var2.l().a()), x78Var2.l().b());
        }
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).H0(linkedHashMap);
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).Ed(linkedHashMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(y68 y68Var) {
        if (y68Var.c()) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).p();
            b0(y68Var.b() - this.i.b());
            return;
        }
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).N();
    }

    private final void g0(boolean z, hn6 hn6Var, hn6 hn6Var2) {
        if (z && hn6Var2 != null) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).n3(hn6Var2, hn6Var, a.a);
        } else if (z && hn6Var2 == null) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).X4(hn6Var, a.a);
        } else if (!z && hn6Var2 != null) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).n3(hn6Var2, hn6Var, a.b);
        } else if (!z && hn6Var2 == null) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).i0(hn6Var);
        }
    }

    private final void h0(kjb kjbVar) {
        p(y87.a(r77.a(this.f.l(this.g, this.n), new p(kjbVar, null)), new q(kjbVar, null)));
    }

    private final void j0(kjb kjbVar) {
        p(y87.a(r77.a(this.f.l(this.g, this.n), new r(kjbVar, null)), new s(kjbVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(kjb kjbVar, boolean z) {
        this.o.S(new u(kjbVar), new v(z));
    }

    public final void U(int i2, int i3) {
        int w;
        int w2;
        List<Integer> F0;
        Object obj;
        Object Z;
        ArrayList<x78> arrayList = new ArrayList();
        for (Object obj2 : this.l) {
            if (((x78) obj2).l().c() == i2) {
                arrayList.add(obj2);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (x78 x78Var : arrayList) {
            arrayList2.add(Integer.valueOf(x78Var.l().a()));
        }
        ArrayList<x78> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((x78) obj3).f()) {
                arrayList3.add(obj3);
            }
        }
        w2 = lc1.w(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(w2);
        for (x78 x78Var2 : arrayList3) {
            arrayList4.add(Integer.valueOf(x78Var2.l().a()));
        }
        com.dodopizza.order.feature.product.card.presentation.pizza.e eVar = (com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState();
        F0 = sc1.F0(arrayList2);
        List<Integer> list = this.t.get(Integer.valueOf(i2));
        if (list == null) {
            list = kc1.l();
        }
        eVar.t7(F0, list, arrayList4);
        if (arrayList4.contains(Integer.valueOf(i3))) {
            for (x78 x78Var3 : arrayList) {
                if (!x78Var3.f()) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((x78) obj).l().a() == i3) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Z = sc1.Z(arrayList);
        x78Var3 = (x78) mh5.c(obj, Z);
        this.p = x78Var3;
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).Xa(this.s);
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).ch(x78Var3.l().c(), x78Var3.l().a());
        x78 x78Var4 = this.p;
        if (x78Var4 == null) {
            z65.z("currentPizzaVO");
            x78Var4 = null;
        }
        T(x78Var4.l());
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).Vd(x78Var3);
        O(x78Var3);
        c0(x78Var3);
        q78 q78Var = this.f;
        String str = this.g;
        x78 x78Var5 = this.p;
        if (x78Var5 == null) {
            z65.z("currentPizzaVO");
            x78Var5 = null;
        }
        p(z77.a(q78Var.r(str, x78Var5), new b(null)));
    }

    public final void V(x78 x78Var, boolean z) {
        z65.h(x78Var, "pizzaProductCardVO");
        if (this.e.length() > 0) {
            p(z77.a(y87.a(this.f.j(this.g, this.e, x78Var.l(), this.n, this.m), new c(null)), new d(x78Var, null)));
        } else {
            p(z77.a(y87.a(this.f.g(this.g, x78Var.l(), this.n, this.m, this.h, z), new e(null)), new f(x78Var, null)));
        }
    }

    public final void W() {
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).Ub();
    }

    public final void X() {
        Iterator<fxb> S = S();
        if (S != null) {
            fxb next = S.next();
            x78 x78Var = this.p;
            if (x78Var == null) {
                z65.z("currentPizzaVO");
                x78Var = null;
            }
            if (z65.c(x78Var.l(), next)) {
                next = S.next();
            }
            x78 x78Var2 = this.p;
            if (x78Var2 == null) {
                z65.z("currentPizzaVO");
                x78Var2 = null;
            }
            if (!z65.c(x78Var2.l(), next)) {
                U(next.c(), next.a());
                p(z77.a(this.f.n(this.e), new g(null)));
            }
        }
    }

    public final void Y() {
        if (this.w) {
            ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).Ub();
        }
    }

    public final void Z(Collection<String> collection) {
        z65.h(collection, "newRemovedIngredientsIds");
        p(y87.a(this.f.m(this.g, collection), new j(collection, null)));
    }

    public final void a0() {
        int w;
        x78 x78Var = this.p;
        if (x78Var == null) {
            z65.z("currentPizzaVO");
            x78Var = null;
        }
        ArrayList<ul8> arrayList = new ArrayList();
        for (Object obj : x78Var.g()) {
            if (((ul8) obj).d()) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (ul8 ul8Var : arrayList) {
            arrayList2.add(new vl8(ul8Var.c(), ul8Var.getName(), this.m.contains(ul8Var.c()), ul8Var.d()));
        }
        ((com.dodopizza.order.feature.product.card.presentation.pizza.e) getViewState()).T(this.g, arrayList2);
    }

    public final void i0(kjb kjbVar, boolean z) {
        z65.h(kjbVar, "toppingVO");
        if (z) {
            h0(kjbVar);
        } else {
            j0(kjbVar);
        }
    }

    public final void k0(int i2, boolean z) {
        p(z77.a(this.f.o(this.g, i2, this.h, z), new t(null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        d0();
        p(z77.a(y87.a(this.f.k(this.g, this.e), new h(null)), new i(null)));
    }
}
