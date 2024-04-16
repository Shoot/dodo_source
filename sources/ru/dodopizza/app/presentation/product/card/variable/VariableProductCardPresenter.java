package ru.dodopizza.app.presentation.product.card.variable;

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
/* compiled from: VariableProductCardPresenter.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001xBW\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010=\u001a\u00020.\u0012\u0006\u0010?\u001a\u00020.\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010u\u001a\u00020t\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T¢\u0006\u0004\bv\u0010wJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002J\u001e\u0010\u0019\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020\u0003H\u0002J\b\u0010'\u001a\u00020\u0003H\u0014J\u000e\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(J\u0016\u0010+\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010,\u001a\u00020\u0003J\u0014\u00100\u001a\u00020\u00032\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-J\u0016\u00102\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0011J\u0016\u00105\u001a\u00020\u00032\u0006\u00103\u001a\u00020(2\u0006\u00104\u001a\u00020\u0011J\u0006\u00106\u001a\u00020\u0003R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020.0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020.0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010aR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\t0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010k\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010]R\u001e\u0010s\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006y"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter;", "Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "Lru/dodopizza/app/presentation/product/card/variable/d;", "", "a0", "", "Laxb;", "variables", "Z", "Ljjb;", "toppingVO", "d0", "f0", "variableProductCardVO", "N", "Lhn6;", "O", "", "isFromCart", "price", "rawPrice", "c0", "variableProductCardVOs", "Lexb;", "currentVariationVO", "Q", "Y", "", "R", "toppingToUpdate", "isAdded", "h0", "Llwb;", "cardVO", "b0", "", "timeRemain", "X", "P", "onFirstViewAttach", "", "sizeGroup", "S", "e0", "W", "", "", "newRemovedIngredientsIds", "V", "isHero", "T", "positionInMenu", "isHeroProduct", "g0", "U", "Lwwb;", com.huawei.hms.push.e.a, "Lwwb;", "variableProductCardInteractor", "f", "Ljava/lang/String;", "cartItemId", "g", "menuItemId", "Lym$d;", Image.TYPE_HIGH, "Lym$d;", "screen", "Lhq3;", "i", "Lhq3;", "featureService", "Lf5b;", "j", "Lf5b;", "timeProvider", "Ljn6;", "k", "Ljn6;", "moneyFactory", "Lt18;", "l", "Lt18;", "personalPriceTimer", "Lgc;", Image.TYPE_MEDIUM, "Lgc;", "analytics", "Lorg/slf4j/Logger;", "n", "Lorg/slf4j/Logger;", "logger", "o", "Ljava/util/List;", "variableVariations", "", "p", "Ljava/util/Set;", "removedIngredientIds", "q", "addedToppingsIds", "Ll6;", "r", "Ll6;", "toppingsDataSet", Image.TYPE_SMALL, "Laxb;", "currentVariableVO", "t", "J", "discountEndTime", "u", "availableCombinationDiscounts", "v", "Ljava/util/Iterator;", "availableDiscountIterator", "Lf63;", "router", "<init>", "(Lwwb;Ljava/lang/String;Ljava/lang/String;Lym$d;Lhq3;Lf63;Lf5b;Ljn6;Lt18;Lgc;)V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VariableProductCardPresenter extends AbstractProductCardPresenter<ru.dodopizza.app.presentation.product.card.variable.d> {
    private final wwb e;
    private final String f;
    private final String g;
    private final ym.d h;
    private final hq3 i;
    private final f5b j;
    private final jn6 k;
    private final t18 l;
    private final gc m;
    private final Logger n;
    private List<axb> o;
    private final Set<String> p;
    private final Set<String> q;
    private final l6<jjb> r;
    private axb s;
    private long t;
    private List<exb> u;
    private Iterator<exb> v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
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
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "th", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$handleVariationChange$1", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                VariableProductCardPresenter.this.n.error("Failed to track variation changes", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$onAddToCartButtonClick$1", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                VariableProductCardPresenter.this.s().c(i56.a(n56.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$onAddToCartButtonClick$2", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ axb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(axb axbVar, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.d = axbVar;
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
                Logger logger = VariableProductCardPresenter.this.n;
                axb axbVar = this.d;
                logger.warn("Failed to edit item to cart " + axbVar, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$onAddToCartButtonClick$3", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                VariableProductCardPresenter.this.s().c(i56.a(n56.a));
                VariableProductCardPresenter.this.s().l(AbstractProductCardPresenter.b.a(), new a.C0194a(VariableProductCardPresenter.this.g));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$onAddToCartButtonClick$4", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ axb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(axb axbVar, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.d = axbVar;
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
                Logger logger = VariableProductCardPresenter.this.n;
                axb axbVar = this.d;
                logger.warn("Failed to add item to cart " + axbVar, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Llwb;", "cardVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$onFirstViewAttach$1", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends f3b implements Function2<lwb, cv1<? super Unit>, Object> {
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
        public final Object invoke(lwb lwbVar, cv1<? super Unit> cv1Var) {
            return ((g) create(lwbVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                lwb lwbVar = (lwb) this.b;
                axb d = lwbVar.d();
                VariableProductCardPresenter.this.s = d;
                VariableProductCardPresenter.this.t = lwbVar.b();
                VariableProductCardPresenter.this.o = lwbVar.f();
                VariableProductCardPresenter.this.q.addAll(lwbVar.a());
                VariableProductCardPresenter.this.p.addAll(lwbVar.e());
                VariableProductCardPresenter.this.Z(lwbVar.f());
                VariableProductCardPresenter.this.a0();
                ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).E5(d);
                if (!d.g()) {
                    VariableProductCardPresenter.this.Q(lwbVar.f(), d.m());
                    ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).C0(VariableProductCardPresenter.this.r);
                    VariableProductCardPresenter.this.b0(lwbVar);
                    VariableProductCardPresenter.this.Y(d);
                    VariableProductCardPresenter.this.N(d);
                } else {
                    ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).m0();
                    ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).t();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$onFirstViewAttach$2", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = VariableProductCardPresenter.this.n;
                String str = VariableProductCardPresenter.this.g;
                logger.warn("Can't load productCardVO for menuItemId = [" + str + "]", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$removeIngredients$1", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class i extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Collection<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection, cv1<? super i> cv1Var) {
            super(2, cv1Var);
            this.c = collection;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((i) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                VariableProductCardPresenter.this.p.clear();
                VariableProductCardPresenter.this.p.addAll(this.c);
                VariableProductCardPresenter.this.a0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "lastRemainTime", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<Long, Unit> {
        j() {
            super(1);
        }

        public final void a(long j) {
            ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).x(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            a(l.longValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function0<Unit> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).I(false);
            ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).G0();
            ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).E();
            ((ru.dodopizza.app.presentation.product.card.variable.d) VariableProductCardPresenter.this.getViewState()).w3();
            VariableProductCardPresenter variableProductCardPresenter = VariableProductCardPresenter.this;
            axb axbVar = variableProductCardPresenter.s;
            if (axbVar == null) {
                z65.z("currentVariableVO");
                axbVar = null;
            }
            variableProductCardPresenter.N(axbVar);
            VariableProductCardPresenter.this.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$toppingAdded$1", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ jjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(jjb jjbVar, cv1<? super l> cv1Var) {
            super(1, cv1Var);
            this.c = jjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new l(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((l) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                VariableProductCardPresenter.this.q.add(this.c.d());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$toppingAdded$2", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ jjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(jjb jjbVar, cv1<? super m> cv1Var) {
            super(2, cv1Var);
            this.c = jjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new m(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((m) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                VariableProductCardPresenter variableProductCardPresenter = VariableProductCardPresenter.this;
                variableProductCardPresenter.p(variableProductCardPresenter.e.v(VariableProductCardPresenter.this.g, this.c));
                VariableProductCardPresenter.this.a0();
                VariableProductCardPresenter.this.h0(this.c, true);
                VariableProductCardPresenter variableProductCardPresenter2 = VariableProductCardPresenter.this;
                axb axbVar = variableProductCardPresenter2.s;
                if (axbVar == null) {
                    z65.z("currentVariableVO");
                    axbVar = null;
                }
                variableProductCardPresenter2.N(axbVar);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$toppingRemoved$1", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ jjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(jjb jjbVar, cv1<? super n> cv1Var) {
            super(1, cv1Var);
            this.c = jjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new n(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((n) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                VariableProductCardPresenter.this.q.remove(this.c.d());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$toppingRemoved$2", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ jjb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(jjb jjbVar, cv1<? super o> cv1Var) {
            super(2, cv1Var);
            this.c = jjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new o(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((o) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                VariableProductCardPresenter variableProductCardPresenter = VariableProductCardPresenter.this;
                variableProductCardPresenter.p(variableProductCardPresenter.e.w(VariableProductCardPresenter.this.g, this.c));
                VariableProductCardPresenter.this.a0();
                VariableProductCardPresenter.this.h0(this.c, false);
                VariableProductCardPresenter variableProductCardPresenter2 = VariableProductCardPresenter.this;
                axb axbVar = variableProductCardPresenter2.s;
                if (axbVar == null) {
                    z65.z("currentVariableVO");
                    axbVar = null;
                }
                variableProductCardPresenter2.N(axbVar);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter$trackOpenProductCard$1", f = "VariableProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class p extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(cv1Var);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((p) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                VariableProductCardPresenter.this.n.warn("Failed to track product card open event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljjb;", "toppingVO", "", "a", "(Ljjb;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class q extends ej5 implements Function1<jjb, Boolean> {
        final /* synthetic */ jjb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(jjb jjbVar) {
            super(1);
            this.a = jjbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(jjb jjbVar) {
            z65.h(jjbVar, "toppingVO");
            return Boolean.valueOf(z65.c(jjbVar, this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljjb;", "toppingVO", "", "", "a", "(Ljjb;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r extends ej5 implements Function1<jjb, List<? extends String>> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(jjb jjbVar) {
            List<String> e;
            z65.h(jjbVar, "toppingVO");
            jjbVar.g(this.a);
            e = jc1.e("added_state_changed");
            return e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableProductCardPresenter(wwb wwbVar, String str, String str2, ym.d dVar, hq3 hq3Var, f63 f63Var, f5b f5bVar, jn6 jn6Var, t18 t18Var, gc gcVar) {
        super(f63Var);
        List<axb> l2;
        List<exb> l3;
        z65.h(wwbVar, "variableProductCardInteractor");
        z65.h(str, "cartItemId");
        z65.h(str2, "menuItemId");
        z65.h(dVar, "screen");
        z65.h(hq3Var, "featureService");
        z65.h(f63Var, "router");
        z65.h(f5bVar, "timeProvider");
        z65.h(jn6Var, "moneyFactory");
        z65.h(t18Var, "personalPriceTimer");
        z65.h(gcVar, "analytics");
        this.e = wwbVar;
        this.f = str;
        this.g = str2;
        this.h = dVar;
        this.i = hq3Var;
        this.j = f5bVar;
        this.k = jn6Var;
        this.l = t18Var;
        this.m = gcVar;
        Logger logger = LoggerFactory.getLogger("VariableProductCardPresenter");
        z65.g(logger, "getLogger(...)");
        this.n = logger;
        l2 = kc1.l();
        this.o = l2;
        this.p = new LinkedHashSet();
        this.q = new LinkedHashSet();
        this.r = new l6<>(null, 1, null);
        l3 = kc1.l();
        this.u = l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(axb axbVar) {
        Pair pair;
        boolean z;
        hn6 O = O(axbVar);
        long b2 = this.t - this.j.b();
        if (axbVar.k() != null) {
            if (b2 > 0) {
                pair = new Pair(rn6.f(axbVar.j(), O), rn6.f(axbVar.k(), O));
            } else {
                pair = new Pair(rn6.f(axbVar.k(), O), null);
            }
        } else {
            pair = new Pair(rn6.f(axbVar.j(), O), null);
        }
        hn6 hn6Var = (hn6) pair.a();
        hn6 hn6Var2 = (hn6) pair.b();
        boolean z2 = false;
        if (this.f.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        c0(z, hn6Var, hn6Var2);
        ru.dodopizza.app.presentation.product.card.variable.d dVar = (ru.dodopizza.app.presentation.product.card.variable.d) getViewState();
        if (hn6Var2 != null) {
            z2 = true;
        }
        dVar.I5(z2);
    }

    private final hn6 O(axb axbVar) {
        ArrayList<ejb> arrayList = new ArrayList();
        for (Object obj : axbVar.l()) {
            if (this.q.contains(((ejb) obj).c())) {
                arrayList.add(obj);
            }
        }
        hn6 c2 = this.k.c(0);
        for (ejb ejbVar : arrayList) {
            c2 = rn6.f(c2, ejbVar.h());
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        List<exb> l2;
        l2 = kc1.l();
        this.u = l2;
        this.v = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(List<axb> list, exb exbVar) {
        List<Integer> F0;
        int w;
        List<axb> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            Integer valueOf = Integer.valueOf(((axb) obj).m().a());
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
                        axb axbVar = (axb) it.next();
                        if (axbVar.e() && !axbVar.g()) {
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
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            Iterable<axb> iterable2 = (Iterable) entry3.getValue();
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (axb axbVar2 : iterable2) {
                    if (!axbVar2.g()) {
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
        ArrayList<axb> arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            axb axbVar3 = (axb) obj3;
            if (axbVar3.e() && !axbVar3.g()) {
                arrayList3.add(obj3);
            }
        }
        w = lc1.w(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(w);
        for (axb axbVar4 : arrayList3) {
            arrayList4.add(axbVar4.m());
        }
        this.u = arrayList4;
        this.v = null;
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).Q(F0, arrayList, arrayList2);
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).ob(exbVar.a());
    }

    private final Iterator<exb> R() {
        if (!this.u.isEmpty()) {
            if (this.v == null) {
                this.v = nr5.a(this.u);
            }
            return this.v;
        }
        return null;
    }

    private final void X(long j2) {
        if (j2 > 0) {
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).I(true);
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).x(j2);
            this.l.a(j2, new j(), new k());
            return;
        }
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).I(false);
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).N();
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).w3();
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(axb axbVar) {
        int w;
        Collection<ejb> l2 = axbVar.l();
        if (!l2.isEmpty()) {
            Collection<ejb> collection = l2;
            w = lc1.w(collection, 10);
            ArrayList arrayList = new ArrayList(w);
            for (ejb ejbVar : collection) {
                arrayList.add(new jjb(ejbVar.c(), ejbVar.b(), ejbVar.getName(), ejbVar.h(), ejbVar.a(), this.q.contains(ejbVar.c())));
            }
            this.r.r();
            this.r.addAll(arrayList);
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).O();
            return;
        }
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).t();
        this.r.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(List<axb> list) {
        int w;
        int e2;
        int e3;
        List<axb> list2 = list;
        w = lc1.w(list2, 10);
        e2 = f86.e(w);
        e3 = kotlin.ranges.i.e(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e3);
        for (axb axbVar : list2) {
            linkedHashMap.put(Integer.valueOf(axbVar.m().a()), axbVar.m().b());
        }
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).H0(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        ru.dodopizza.app.presentation.product.card.variable.d dVar = (ru.dodopizza.app.presentation.product.card.variable.d) getViewState();
        axb axbVar = this.s;
        if (axbVar == null) {
            z65.z("currentVariableVO");
            axbVar = null;
        }
        dVar.W4(axbVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(lwb lwbVar) {
        if (lwbVar.c()) {
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).p();
            X(lwbVar.b() - this.j.b());
            return;
        }
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).N();
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).w3();
    }

    private final void c0(boolean z, hn6 hn6Var, hn6 hn6Var2) {
        if (z && hn6Var2 != null) {
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).Ua(hn6Var2, hn6Var, a.a);
        } else if (z && hn6Var2 == null) {
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).E9(hn6Var, a.a);
        } else if (!z && hn6Var2 != null) {
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).Ua(hn6Var2, hn6Var, a.b);
        } else if (!z && hn6Var2 == null) {
            ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).i0(hn6Var);
        }
    }

    private final void d0(jjb jjbVar) {
        p(y87.a(r77.a(this.e.r(this.g, this.q), new l(jjbVar, null)), new m(jjbVar, null)));
    }

    private final void f0(jjb jjbVar) {
        p(y87.a(r77.a(this.e.r(this.g, this.q), new n(jjbVar, null)), new o(jjbVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(jjb jjbVar, boolean z) {
        this.r.S(new q(jjbVar), new r(z));
    }

    public final void S(int i2) {
        for (axb axbVar : this.o) {
            if (axbVar.m().a() == i2) {
                this.s = axbVar;
                ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).ob(axbVar.m().a());
                ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).Qa(axbVar);
                N(axbVar);
                Y(axbVar);
                wwb wwbVar = this.e;
                String str = this.g;
                axb axbVar2 = this.s;
                if (axbVar2 == null) {
                    z65.z("currentVariableVO");
                    axbVar2 = null;
                }
                p(z77.a(wwbVar.x(str, axbVar2), new b(null)));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void T(axb axbVar, boolean z) {
        z65.h(axbVar, "variableProductCardVO");
        if (this.f.length() > 0) {
            p(z77.a(y87.a(this.e.n(this.g, this.f, axbVar.m(), this.q), new c(null)), new d(axbVar, null)));
        } else {
            p(z77.a(y87.a(this.e.k(this.g, axbVar.m(), this.q, this.p, this.h, z), new e(null)), new f(axbVar, null)));
        }
    }

    public final void U() {
        Iterator<exb> R = R();
        if (R != null) {
            this.m.a(new zu0(this.f, ck1.f));
            exb next = R.next();
            axb axbVar = this.s;
            axb axbVar2 = null;
            if (axbVar == null) {
                z65.z("currentVariableVO");
                axbVar = null;
            }
            if (z65.c(axbVar.m(), next)) {
                next = R.next();
            }
            axb axbVar3 = this.s;
            if (axbVar3 == null) {
                z65.z("currentVariableVO");
            } else {
                axbVar2 = axbVar3;
            }
            if (!z65.c(axbVar2.m(), next)) {
                S(next.a());
            }
        }
    }

    public final void V(Collection<String> collection) {
        z65.h(collection, "newRemovedIngredientsIds");
        p(y87.a(this.e.s(this.g, collection), new i(collection, null)));
    }

    public final void W() {
        int w;
        axb axbVar = this.s;
        if (axbVar == null) {
            z65.z("currentVariableVO");
            axbVar = null;
        }
        ArrayList<ul8> arrayList = new ArrayList();
        for (Object obj : axbVar.h()) {
            if (((ul8) obj).d()) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (ul8 ul8Var : arrayList) {
            arrayList2.add(new vl8(ul8Var.c(), ul8Var.getName(), this.p.contains(ul8Var.c()), ul8Var.d()));
        }
        ((ru.dodopizza.app.presentation.product.card.variable.d) getViewState()).T(this.g, arrayList2);
    }

    public final void e0(jjb jjbVar, boolean z) {
        z65.h(jjbVar, "toppingVO");
        if (z) {
            d0(jjbVar);
        } else {
            f0(jjbVar);
        }
    }

    public final void g0(int i2, boolean z) {
        p(z77.a(this.e.u(this.g, i2, this.h, z), new p(null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        p(z77.a(y87.a(this.e.q(this.f, this.g), new g(null)), new h(null)));
    }
}
