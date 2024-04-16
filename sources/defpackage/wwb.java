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
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VariableProductCardInteractor.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001-BG\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\r*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002JL\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J6\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J&\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ&\u0010!\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060 J0\u0010$\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0016J \u0010(\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&J \u0010)\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&J \u0010+\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\rR\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lwwb;", "", "Lox1;", "", "variationsCount", "p", "", "cartItemId", "Lnq0;", "o", "Ltja;", "", "stopToppingIdsList", "Laxb;", "t", "menuItemId", "Lexb;", "variation", "toppingsIds", "removedIngredientsIds", "Lym$d;", "screen", "", "isHero", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "k", "n", "Llwb;", "q", Image.TYPE_SMALL, "", "r", "positionInMenu", "isHeroProduct", "u", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Ljjb;", "toppingVO", "v", "w", "variableProductCardVO", "x", "Lah6;", "a", "Lah6;", "menuService", "Lds0;", "b", "Lds0;", "cartService", "Lc62;", com.huawei.hms.opendevice.c.a, "Lc62;", "customizationService", "Lsq0;", DateTokenConverter.CONVERTER_KEY, "Lsq0;", "cartItemDataFactory", "Lmxa;", com.huawei.hms.push.e.a, "Lmxa;", "stopRepository", "Lgc;", "f", "Lgc;", "analytics", "Lava;", "g", "Lava;", "stateProvider", "Lwr2;", Image.TYPE_HIGH, "Lwr2;", "defaultShoppingItemSelectorFactory", "<init>", "(Lah6;Lds0;Lc62;Lsq0;Lmxa;Lgc;Lava;Lwr2;)V", "i", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wwb  reason: default package */
/* loaded from: classes4.dex */
public final class wwb implements ox1 {
    public static final a i = new a(null);
    private final ah6 a;
    private final ds0 b;
    private final c62 c;
    private final sq0 d;
    private final mxa e;
    private final gc f;
    private final ava g;
    private final wr2 h;

    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lwwb$a;", "", "", "REMOVABLE_INGREDIENTS_ENABLED", "Z", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wwb$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$addToCart$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$b */
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ ym.d d;
        final /* synthetic */ boolean e;
        final /* synthetic */ exb f;
        final /* synthetic */ Collection<String> g;
        final /* synthetic */ Collection<String> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, ym.d dVar, boolean z, exb exbVar, Collection<String> collection, Collection<String> collection2, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = dVar;
            this.e = z;
            this.f = exbVar;
            this.g = collection;
            this.h = collection2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, this.d, this.e, this.f, this.g, this.h, cv1Var);
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
                exb exbVar = this.f;
                for (tja tjaVar : wwb.this.a.s(this.c)) {
                    if (((swb) tjaVar.t0()).s() == exbVar.a()) {
                        swb swbVar = (swb) tjaVar.t0();
                        Collection<String> collection = this.g;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : swbVar.a()) {
                            ejb ejbVar = (ejb) obj2;
                            if (collection.contains(ejbVar.c()) && ejbVar.a()) {
                                arrayList.add(obj2);
                            }
                        }
                        K0 = sc1.K0(arrayList);
                        Collection<String> collection2 = this.h;
                        ArrayList<ul8> arrayList2 = new ArrayList();
                        for (Object obj3 : swbVar.k()) {
                            if (collection2.contains(((ul8) obj3).c())) {
                                arrayList2.add(obj3);
                            }
                        }
                        w = lc1.w(arrayList2, 10);
                        ArrayList arrayList3 = new ArrayList(w);
                        for (ul8 ul8Var : arrayList2) {
                            arrayList3.add(ul8Var.getName());
                        }
                        pja.e eVar = new pja.e(tjaVar, arrayList3, K0);
                        wwb.this.b.a(wwb.this.d.a(eVar));
                        wwb.this.f.a(new gl8.c(eVar, this.d, this.e));
                        return Unit.a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$editVariableProductInCart$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$c */
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ exb e;
        final /* synthetic */ Collection<String> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, exb exbVar, Collection<String> collection, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
            this.e = exbVar;
            this.f = collection;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, this.e, this.f, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Set K0;
            List l;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                exb exbVar = this.e;
                for (tja tjaVar : wwb.this.a.s(this.c)) {
                    if (((swb) tjaVar.t0()).s() == exbVar.a()) {
                        Collection<String> collection = this.f;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : ((swb) tjaVar.t0()).a()) {
                            ejb ejbVar = (ejb) obj2;
                            if (collection.contains(ejbVar.c()) && ejbVar.a()) {
                                arrayList.add(obj2);
                            }
                        }
                        K0 = sc1.K0(arrayList);
                        l = kc1.l();
                        wwb.this.b.d(wwb.this.d.c(this.d, new pja.e(tjaVar, l, K0)));
                        return Unit.a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Llwb;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$getVariableCardVO$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$d */
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super lwb>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VariableProductCardInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wwb$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<Collection<? extends String>> {
            final /* synthetic */ wwb a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(wwb wwbVar, String str) {
                super(0);
                this.a = wwbVar;
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Collection<String> invoke() {
                return this.a.c.h(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VariableProductCardInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltja;", "a", "()Ltja;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wwb$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function0<tja> {
            final /* synthetic */ wwb a;
            final /* synthetic */ Collection<tja> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(wwb wwbVar, Collection<? extends tja> collection) {
                super(0);
                this.a = wwbVar;
                this.b = collection;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final tja invoke() {
                return this.a.h.a(this.b).a(this.b, this.a.p(this.b.size()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super lwb> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            l18 l18Var;
            int w;
            Object obj2;
            ArrayList arrayList;
            boolean z;
            long j;
            int w2;
            String str;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd6 a2 = wwb.this.a.a(this.c);
                tja tjaVar = null;
                if (a2 != null) {
                    l18Var = a2.j();
                } else {
                    l18Var = null;
                }
                Collection<tja> s = wwb.this.a.s(this.c);
                Collection<String> a3 = wwb.this.e.a();
                Collection<tja> collection = s;
                wwb wwbVar = wwb.this;
                w = lc1.w(collection, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (tja tjaVar2 : collection) {
                    arrayList2.add(wwbVar.t(tjaVar2, a3));
                }
                nq0 o = wwb.this.o(this.d);
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        String id = ((tja) obj2).getId();
                        if (o != null) {
                            str = o.X();
                        } else {
                            str = null;
                        }
                        if (z65.c(id, str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                tja tjaVar3 = (tja) obj2;
                if (o != null) {
                    Collection<xq0> a4 = o.I().a();
                    w2 = lc1.w(a4, 10);
                    arrayList = new ArrayList(w2);
                    for (xq0 xq0Var : a4) {
                        arrayList.add(xq0Var.getId());
                    }
                } else {
                    arrayList = null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : (Iterable) mh5.d(arrayList, new a(wwb.this, this.c))) {
                    if (true ^ a3.contains((String) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                Collection<String> g = wwb.this.c.g(this.c);
                wwb wwbVar2 = wwb.this;
                if (o != null) {
                    tjaVar = tjaVar3;
                }
                axb t = wwbVar2.t((tja) mh5.d(tjaVar, new b(wwbVar2, s)), a3);
                if (l18Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (l18Var != null) {
                    j = l18Var.d();
                } else {
                    j = 0;
                }
                return new lwb(arrayList2, t, arrayList3, g, z, j);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$saveAddedToppings$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$e */
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ Set<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Set<String> set, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = set;
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
                wwb.this.c.f(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$saveRemovedIngredients$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$f */
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ Collection<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Collection<String> collection, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = collection;
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wwb.this.c.j(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$trackProductCardOpen$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$g */
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
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
                qd6 a = wwb.this.a.a(this.c);
                String str = this.c;
                qd6 qd6Var = (qd6) mh5.b(a, "MenuItem with ud=" + str + " not found");
                Collection<tja> s = wwb.this.a.s(this.c);
                ck1 a2 = lx9.a(this.d);
                wwb.this.f.a(lzb.c(qd6Var, a2));
                wwb.this.f.a(new na7(qd6Var, this.e, s, a2, this.f));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$trackToppingAdded$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$h */
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ jjb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, jjb jjbVar, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = jjbVar;
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
                wwb.this.f.a(new kv0(this.c, this.d, ijb.a.b, a88.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$trackToppingRemoved$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$i */
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ jjb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, jjb jjbVar, cv1<? super i> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = jjbVar;
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
                wwb.this.f.a(new kv0(this.c, this.d, ijb.b.b, a88.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VariableProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.variable.VariableProductCardInteractor$trackVariationChange$1", f = "VariableProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wwb$j */
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ axb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, axb axbVar, cv1<? super j> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = axbVar;
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
                a0 = sc1.a0(wwb.this.a.s(this.c));
                tja tjaVar = (tja) a0;
                if (tjaVar != null && (Y = tjaVar.Y()) != null) {
                    str = Y.getId();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                wwb.this.f.a(new mv0(str, this.d));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public wwb(ah6 ah6Var, ds0 ds0Var, c62 c62Var, sq0 sq0Var, mxa mxaVar, gc gcVar, ava avaVar, wr2 wr2Var) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(c62Var, "customizationService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(mxaVar, "stopRepository");
        z65.h(gcVar, "analytics");
        z65.h(avaVar, "stateProvider");
        z65.h(wr2Var, "defaultShoppingItemSelectorFactory");
        this.a = ah6Var;
        this.b = ds0Var;
        this.c = c62Var;
        this.d = sq0Var;
        this.e = mxaVar;
        this.f = gcVar;
        this.g = avaVar;
        this.h = wr2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nq0 o(String str) {
        Object obj = null;
        if (str.length() <= 0) {
            return null;
        }
        Iterator<T> it = this.b.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (z65.c(((nq0) next).j().getValue(), str)) {
                obj = next;
                break;
            }
        }
        return (nq0) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int p(int i2) {
        Integer currentOrderType = this.g.e().getCurrentOrderType();
        int i3 = jk7.e.i();
        if ((currentOrderType != null && currentOrderType.intValue() == i3) || i2 != 2) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final axb t(tja tjaVar, Collection<String> collection) {
        int w;
        boolean z;
        Pair a2 = lnb.a(tjaVar, tjaVar.t0());
        tja tjaVar2 = (tja) a2.a();
        swb swbVar = (swb) a2.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : swbVar.a()) {
            if (true ^ collection.contains(((ejb) obj).c())) {
                arrayList.add(obj);
            }
        }
        String d2 = swbVar.d();
        String name = swbVar.getName();
        rl8 i2 = swbVar.i();
        String b2 = swbVar.b();
        String c2 = swbVar.c();
        Collection<ul8> k = swbVar.k();
        w = lc1.w(k, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (ul8 ul8Var : k) {
            arrayList2.add(ul8.b(ul8Var, null, null, null, false, 7, null));
        }
        String f2 = swbVar.f();
        hn6 a3 = sja.a(tjaVar2);
        hn6 b3 = sja.b(tjaVar2);
        exb exbVar = new exb(swbVar.r().d(), swbVar.r().f());
        boolean p = tjaVar2.p();
        if (tjaVar2.v() != null) {
            z = true;
        } else {
            z = false;
        }
        return new axb(d2, name, i2, b2, c2, arrayList2, f2, a3, b3, arrayList, exbVar, p, z);
    }

    public final wx<Unit> k(String str, exb exbVar, Collection<String> collection, Collection<String> collection2, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(exbVar, "variation");
        z65.h(collection, "toppingsIds");
        z65.h(collection2, "removedIngredientsIds");
        z65.h(dVar, "screen");
        return m(new b(str, dVar, z, exbVar, collection, collection2, null));
    }

    public <T> wx<T> l(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> m(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<Unit> n(String str, String str2, exb exbVar, Collection<String> collection) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(exbVar, "variation");
        z65.h(collection, "toppingsIds");
        return m(new c(str, str2, exbVar, collection, null));
    }

    public final wx<lwb> q(String str, String str2) {
        z65.h(str, "cartItemId");
        z65.h(str2, "menuItemId");
        return l(new d(str2, str, null));
    }

    public final wx<Unit> r(String str, Set<String> set) {
        z65.h(str, "menuItemId");
        z65.h(set, "toppingsIds");
        return m(new e(str, set, null));
    }

    public final wx<Unit> s(String str, Collection<String> collection) {
        z65.h(str, "menuItemId");
        z65.h(collection, "removedIngredientsIds");
        return m(new f(str, collection, null));
    }

    public final wx<Unit> u(String str, int i2, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        return m(new g(str, dVar, i2, z, null));
    }

    public final wx<Unit> v(String str, jjb jjbVar) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(jjbVar, "toppingVO");
        return m(new h(str, jjbVar, null));
    }

    public final wx<Unit> w(String str, jjb jjbVar) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(jjbVar, "toppingVO");
        return m(new i(str, jjbVar, null));
    }

    public final wx<Unit> x(String str, axb axbVar) {
        z65.h(str, "menuItemId");
        z65.h(axbVar, "variableProductCardVO");
        return m(new j(str, axbVar, null));
    }
}
