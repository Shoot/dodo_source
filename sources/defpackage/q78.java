package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gl8;
import defpackage.ijb;
import defpackage.ox1;
import defpackage.pja;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: PizzaProductCardInteractor.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0004\b>\u0010?JL\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJD\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003J&\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J&\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J0\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\fJ \u0010 \u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eJ \u0010!\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eJ \u0010$\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"J\u0018\u0010%\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\u0012\u001a\u00020\u0003R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lq78;", "", "Lox1;", "", "menuItemId", "Lfxb;", "variation", "", "toppingsIds", "removedIngredientsIds", "Lym$d;", "screen", "", "isHero", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "g", "cartItemId", "j", "Ly68;", "k", Image.TYPE_MEDIUM, "", "l", "", "positionInMenu", "isHeroProduct", "o", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Lkjb;", "toppingVO", "p", "q", "Lx78;", "pizzaProductCardVO", "r", "n", "Lah6;", "a", "Lah6;", "menuService", "Lds0;", "b", "Lds0;", "cartService", "Lc62;", com.huawei.hms.opendevice.c.a, "Lc62;", "customizationService", "Lsq0;", DateTokenConverter.CONVERTER_KEY, "Lsq0;", "cartItemDataFactory", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Ly78;", "f", "Ly78;", "pizzaProductCardVOFactory", "<init>", "(Lah6;Lds0;Lc62;Lsq0;Lgc;Ly78;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q78  reason: default package */
/* loaded from: classes2.dex */
public final class q78 implements ox1 {
    private final ah6 a;
    private final ds0 b;
    private final c62 c;
    private final sq0 d;
    private final gc e;
    private final y78 f;

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$addToCart$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ ym.d d;
        final /* synthetic */ boolean e;
        final /* synthetic */ fxb f;
        final /* synthetic */ Collection<String> g;
        final /* synthetic */ Collection<String> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ym.d dVar, boolean z, fxb fxbVar, Collection<String> collection, Collection<String> collection2, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = dVar;
            this.e = z;
            this.f = fxbVar;
            this.g = collection;
            this.h = collection2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, this.d, this.e, this.f, this.g, this.h, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Set K0;
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                fxb fxbVar = this.f;
                for (tja tjaVar : q78.this.a.s(this.c)) {
                    m78 m78Var = (m78) tjaVar.t0();
                    if (m78Var.u() == fxbVar.c() && m78Var.q() == fxbVar.a()) {
                        m78 m78Var2 = (m78) tjaVar.t0();
                        Collection<String> collection = this.g;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : m78Var2.a()) {
                            ejb ejbVar = (ejb) obj2;
                            if (collection.contains(ejbVar.c()) && ejbVar.a()) {
                                arrayList.add(obj2);
                            }
                        }
                        K0 = sc1.K0(arrayList);
                        Collection<String> collection2 = this.h;
                        ArrayList<ul8> arrayList2 = new ArrayList();
                        for (Object obj3 : m78Var2.k()) {
                            if (collection2.contains(((ul8) obj3).c())) {
                                arrayList2.add(obj3);
                            }
                        }
                        w = lc1.w(arrayList2, 10);
                        ArrayList arrayList3 = new ArrayList(w);
                        for (ul8 ul8Var : arrayList2) {
                            arrayList3.add(new xq0(ul8Var.getId(), ul8Var.getName(), null, null, false, 28, null));
                        }
                        pja.c cVar = new pja.c(tjaVar, arrayList3, K0);
                        q78.this.b.a(q78.this.d.a(cVar));
                        q78.this.e.a(new gl8.c(cVar, this.d, this.e));
                        return Unit.a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$editPizzaInCart$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ fxb e;
        final /* synthetic */ Collection<String> f;
        final /* synthetic */ Collection<String> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, fxb fxbVar, Collection<String> collection, Collection<String> collection2, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
            this.e = fxbVar;
            this.f = collection;
            this.g = collection2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, this.d, this.e, this.f, this.g, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Set K0;
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                fxb fxbVar = this.e;
                for (tja tjaVar : q78.this.a.s(this.c)) {
                    m78 m78Var = (m78) tjaVar.t0();
                    if (m78Var.u() == fxbVar.c() && m78Var.q() == fxbVar.a()) {
                        m78 m78Var2 = (m78) tjaVar.t0();
                        Collection<String> collection = this.f;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : m78Var2.a()) {
                            ejb ejbVar = (ejb) obj2;
                            if (collection.contains(ejbVar.c()) && ejbVar.a()) {
                                arrayList.add(obj2);
                            }
                        }
                        K0 = sc1.K0(arrayList);
                        Collection<String> collection2 = this.g;
                        ArrayList<ul8> arrayList2 = new ArrayList();
                        for (Object obj3 : m78Var2.k()) {
                            if (collection2.contains(((ul8) obj3).c())) {
                                arrayList2.add(obj3);
                            }
                        }
                        w = lc1.w(arrayList2, 10);
                        ArrayList arrayList3 = new ArrayList(w);
                        for (ul8 ul8Var : arrayList2) {
                            arrayList3.add(new xq0(ul8Var.getId(), ul8Var.getName(), null, null, false, 28, null));
                        }
                        q78.this.b.d(q78.this.d.c(this.d, new pja.c(tjaVar, arrayList3, K0)));
                        return Unit.a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ly68;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$getPizzaCardVO$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super y68>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super y68> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return q78.this.f.a(this.c, this.d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$saveAddedToppings$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$d */
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ Set<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Set<String> set, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = set;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
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
                q78.this.c.f(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$saveRemovedIngredients$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$e */
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ Collection<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Collection<String> collection, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = collection;
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
                q78.this.c.j(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$trackDiscountBadgeClicked$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$f */
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = str;
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
                q78.this.e.a(new zu0(this.c, ck1.f));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$trackPizzaProductCardOpen$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$g */
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ ym.d d;
        final /* synthetic */ int e;
        final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, ym.d dVar, int i, boolean z, cv1<? super g> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = dVar;
            this.e = i;
            this.f = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(this.c, this.d, this.e, this.f, cv1Var);
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
                qd6 a = q78.this.a.a(this.c);
                String str = this.c;
                qd6 qd6Var = (qd6) mh5.b(a, "MenuItem with ud=" + str + " not found");
                Collection<tja> s = q78.this.a.s(this.c);
                ck1 a2 = lx9.a(this.d);
                q78.this.e.a(lzb.c(qd6Var, a2));
                q78.this.e.a(new ma7(qd6Var, this.e, s, a2, this.f));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$trackToppingAdded$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$h */
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ kjb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, kjb kjbVar, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = kjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                q78.this.e.a(new lv0(this.c, this.d, ijb.a.b, a88.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$trackToppingRemoved$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$i */
    /* loaded from: classes2.dex */
    static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ kjb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, kjb kjbVar, cv1<? super i> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = kjbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new i(this.c, this.d, cv1Var);
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
                q78.this.e.a(new lv0(this.c, this.d, ijb.b.b, a88.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PizzaProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardInteractor$trackVariationChange$1", f = "PizzaProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: q78$j */
    /* loaded from: classes2.dex */
    static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ x78 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, x78 x78Var, cv1<? super j> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = x78Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object a0;
            String str;
            fl8 Y;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a0 = sc1.a0(q78.this.a.s(this.c));
                tja tjaVar = (tja) a0;
                if (tjaVar != null && (Y = tjaVar.Y()) != null) {
                    str = Y.getId();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                q78.this.e.a(new nv0(str, this.d));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public q78(ah6 ah6Var, ds0 ds0Var, c62 c62Var, sq0 sq0Var, gc gcVar, y78 y78Var) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(c62Var, "customizationService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(gcVar, "analytics");
        z65.h(y78Var, "pizzaProductCardVOFactory");
        this.a = ah6Var;
        this.b = ds0Var;
        this.c = c62Var;
        this.d = sq0Var;
        this.e = gcVar;
        this.f = y78Var;
    }

    public final wx<Unit> g(String str, fxb fxbVar, Collection<String> collection, Collection<String> collection2, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(fxbVar, "variation");
        z65.h(collection, "toppingsIds");
        z65.h(collection2, "removedIngredientsIds");
        z65.h(dVar, "screen");
        return i(new a(str, dVar, z, fxbVar, collection, collection2, null));
    }

    public <T> wx<T> h(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> i(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<Unit> j(String str, String str2, fxb fxbVar, Collection<String> collection, Collection<String> collection2) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(fxbVar, "variation");
        z65.h(collection, "toppingsIds");
        z65.h(collection2, "removedIngredientsIds");
        return i(new b(str, str2, fxbVar, collection, collection2, null));
    }

    public final wx<y68> k(String str, String str2) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        return h(new c(str, str2, null));
    }

    public final wx<Unit> l(String str, Set<String> set) {
        z65.h(str, "menuItemId");
        z65.h(set, "toppingsIds");
        return i(new d(str, set, null));
    }

    public final wx<Unit> m(String str, Collection<String> collection) {
        z65.h(str, "menuItemId");
        z65.h(collection, "removedIngredientsIds");
        return i(new e(str, collection, null));
    }

    public final wx<Unit> n(String str) {
        z65.h(str, "cartItemId");
        return i(new f(str, null));
    }

    public final wx<Unit> o(String str, int i2, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        return i(new g(str, dVar, i2, z, null));
    }

    public final wx<Unit> p(String str, kjb kjbVar) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(kjbVar, "toppingVO");
        return i(new h(str, kjbVar, null));
    }

    public final wx<Unit> q(String str, kjb kjbVar) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(kjbVar, "toppingVO");
        return i(new i(str, kjbVar, null));
    }

    public final wx<Unit> r(String str, x78 x78Var) {
        z65.h(str, "menuItemId");
        z65.h(x78Var, "pizzaProductCardVO");
        return i(new j(str, x78Var, null));
    }
}
