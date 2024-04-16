package com.dodopizza.order.feature.shoppingcart.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.shoppingcart.presentation.a;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gl8;
import defpackage.ov0;
import defpackage.ox1;
import defpackage.zw9;
import io.realm.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ShoppingCartInteractor.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T¢\u0006\u0004\bX\u0010YJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\nH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\tH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\tH\u0016J\u001a\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\n2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\tH\u0016J\u0010\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0016J\b\u0010 \u001a\u00020\u0007H\u0016R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/presentation/b;", "Lwia;", "Lox1;", "Lng4;", "goodModel", "", "F", "", "E", "Lwx;", "Lcom/dodopizza/async/AsyncJob;", Image.TYPE_MEDIUM, "Llja;", Image.TYPE_HIGH, "Lnq0;", "cartItem", "", com.huawei.hms.opendevice.c.a, "a", DateTokenConverter.CONVERTER_KEY, "Ln42;", "j", "Lcom/dodopizza/order/feature/shoppingcart/presentation/a;", "k", "Lb61;", "g", com.huawei.hms.push.e.a, "upsaleProductId", "i", "Llk8;", "f", "l", "b", "Lds0;", "Lds0;", "cartService", "Lah6;", "Lah6;", "menuService", "Lc62;", "Lc62;", "customizationService", "Lsq0;", "Lsq0;", "cartItemDataFactory", "Lava;", "Lava;", "stateProvider", "Lt52;", "Lt52;", "customerService", "Lgc;", "Lgc;", "analytics", "Ldua;", "Ldua;", "stateAnalyzer", "Lpv0;", "Lpv0;", "workflowResultHandler", "Lvg7;", "Lvg7;", "orderPizzeriaStateService", "Lt61;", "Lt61;", "checkoutStateProvider", "Lmja;", "Lmja;", "shoppingCartVOBuilder", "Lfq0;", "Lfq0;", "cartContentService", "Ldt5;", "n", "Ldt5;", "locality", "Ljv5;", "o", "Ljv5;", "localityService", "Lej6;", "p", "Lej6;", "minDeliveryPriceInfoProvider", "Lhq3;", "q", "Lhq3;", "featureService", "<init>", "(Lds0;Lah6;Lc62;Lsq0;Lava;Lt52;Lgc;Ldua;Lpv0;Lvg7;Lt61;Lmja;Lfq0;Ldt5;Ljv5;Lej6;Lhq3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b implements wia, ox1 {
    private final ds0 a;
    private final ah6 b;
    private final c62 c;
    private final sq0 d;
    private final ava e;
    private final t52 f;
    private final gc g;
    private final dua h;
    private final pv0 i;
    private final vg7 j;
    private final t61 k;
    private final mja l;
    private final fq0 m;
    private final dt5 n;
    private final jv5 o;
    private final ej6 p;
    private final hq3 q;

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/presentation/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$actualize$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super com.dodopizza.order.feature.shoppingcart.presentation.a>, Object> {
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
        public final Object invoke(cv1<? super com.dodopizza.order.feature.shoppingcart.presentation.a> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ov0 a = b.this.i.a(b.this.h.c());
                if (a instanceof ov0.a.c) {
                    return a.c.a;
                }
                if (a instanceof ov0.a.b) {
                    return a.C0207a.a;
                }
                if (b.this.E()) {
                    return a.b.a;
                }
                return a.d.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$addGoodFromUpsale$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.order.feature.shoppingcart.presentation.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0208b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0208b(String str, cv1<? super C0208b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new C0208b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((C0208b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                tja k = b.this.b.k(this.c);
                String str = this.c;
                tja tjaVar = (tja) mh5.b(k, "Couldn't find this product - " + str);
                nq0 a = hs0.a(tjaVar, Integer.MAX_VALUE, 1);
                b.this.a.a(b.this.d.e(tjaVar.G0()));
                b.this.g.a(new gl8.d(a));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$addGoodToCart$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ nq0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(nq0 nq0Var, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = nq0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
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
                b.this.a.a(b.this.d.b(this.c));
                b.this.g.a(new gl8.a(this.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$getCheckoutState$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function1<cv1<? super b61>, Object> {
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
        public final Object invoke(cv1<? super b61> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.k.get();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$getComboMenuItemId$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function1<cv1<? super String>, Object> {
        int a;
        final /* synthetic */ nq0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(nq0 nq0Var, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = nq0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object Y;
            int w;
            int w2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd6 n = b.this.b.n(this.c.X());
                if (n != null) {
                    Y = sc1.Y(b.this.b.s(n.f()));
                    zi1 zi1Var = (zi1) ((tja) Y).t0();
                    List<dq0> w0 = this.c.w0();
                    w = lc1.w(w0, 10);
                    ArrayList arrayList = new ArrayList(w);
                    for (dq0 dq0Var : w0) {
                        arrayList.add(dq0Var.getId());
                    }
                    List<dj1> s = zi1Var.s(arrayList);
                    w2 = lc1.w(s, 10);
                    ArrayList arrayList2 = new ArrayList(w2);
                    for (dj1 dj1Var : s) {
                        arrayList2.add(dj1Var.g().getId());
                    }
                    b.this.c.i(n.f(), arrayList2);
                    return n.f();
                }
                String X = this.c.X();
                throw new IllegalStateException("Didn't find menuItemId for " + X);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ln42;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$getCustomer$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function1<cv1<? super n42>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super n42> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.f.f();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$getNiceBonusRulesUrl$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function1<cv1<? super String>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PrizotekaEntity prizoteka = b.this.e.e().getPrizoteka();
                if (prizoteka != null) {
                    return prizoteka.getLegalDocumentUrl();
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$getPizzaMenuItemId$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function1<cv1<? super String>, Object> {
        int a;
        final /* synthetic */ nq0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(nq0 nq0Var, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.c = nq0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd6 n = b.this.b.n(this.c.X());
                if (n != null) {
                    str = n.f();
                } else {
                    str = null;
                }
                nq0 nq0Var = this.c;
                if (str != null) {
                    return str;
                }
                String X = nq0Var.X();
                throw new IllegalArgumentException(("Didn't find menuItemId for " + X).toString());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Llk8;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$getPrizotekaVO$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class i extends f3b implements Function1<cv1<? super lk8>, Object> {
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
        public final Object invoke(cv1<? super lk8> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PrizotekaEntity prizoteka = b.this.e.e().getPrizoteka();
                if (prizoteka != null) {
                    String title = prizoteka.getTitle();
                    String subtitle = prizoteka.getSubtitle();
                    k0<PrizotekaLevelEntity> levels = prizoteka.getLevels();
                    w = lc1.w(levels, 10);
                    ArrayList arrayList = new ArrayList(w);
                    for (PrizotekaLevelEntity prizotekaLevelEntity : levels) {
                        arrayList.add(new jk8(prizotekaLevelEntity.getMinCartValue(), prizotekaLevelEntity.getProgressDescription(), prizotekaLevelEntity.getGiftDescription()));
                    }
                    return new lk8(title, subtitle, arrayList);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Llja;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$getShoppingCartVO$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class j extends f3b implements Function1<cv1<? super lja>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super lja> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.l.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$removeFromCart$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class k extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ ng4 b;
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ng4 ng4Var, b bVar, cv1<? super k> cv1Var) {
            super(1, cv1Var);
            this.b = ng4Var;
            this.c = bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b.a().d() >= this.b.b() && this.b.b() != 0) {
                    this.c.a.b(this.c.d.d(this.b));
                    this.c.F(this.b);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingCartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartInteractorImpl$trackCartScreenShown$1", f = "ShoppingCartInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class l extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new l(cv1Var);
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
                b.this.g.a(new zw9.c(b.this.j.b()));
                b.this.g.a(ld.a(b.this.m.a()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(ds0 ds0Var, ah6 ah6Var, c62 c62Var, sq0 sq0Var, ava avaVar, t52 t52Var, gc gcVar, dua duaVar, pv0 pv0Var, vg7 vg7Var, t61 t61Var, mja mjaVar, fq0 fq0Var, dt5 dt5Var, jv5 jv5Var, ej6 ej6Var, hq3 hq3Var) {
        z65.h(ds0Var, "cartService");
        z65.h(ah6Var, "menuService");
        z65.h(c62Var, "customizationService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(avaVar, "stateProvider");
        z65.h(t52Var, "customerService");
        z65.h(gcVar, "analytics");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(pv0Var, "workflowResultHandler");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(mjaVar, "shoppingCartVOBuilder");
        z65.h(fq0Var, "cartContentService");
        z65.h(dt5Var, "locality");
        z65.h(jv5Var, "localityService");
        z65.h(ej6Var, "minDeliveryPriceInfoProvider");
        z65.h(hq3Var, "featureService");
        this.a = ds0Var;
        this.b = ah6Var;
        this.c = c62Var;
        this.d = sq0Var;
        this.e = avaVar;
        this.f = t52Var;
        this.g = gcVar;
        this.h = duaVar;
        this.i = pv0Var;
        this.j = vg7Var;
        this.k = t61Var;
        this.l = mjaVar;
        this.m = fq0Var;
        this.n = dt5Var;
        this.o = jv5Var;
        this.p = ej6Var;
        this.q = hq3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E() {
        if (this.q.a(bq3.H6) && cj6.a.c(this.p.b())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(ng4 ng4Var) {
        gl8.f.b bVar;
        boolean z;
        if (ng4Var.a().y()) {
            bVar = gl8.f.b.c;
        } else {
            bVar = gl8.f.b.b;
        }
        if (ng4Var.b() >= ng4Var.a().d()) {
            z = true;
        } else {
            z = false;
        }
        this.g.a(new gl8.f(ng4Var, bVar, z));
    }

    public <T> wx<T> C(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> D(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    @Override // defpackage.wia
    public wx<String> a(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        return C(new h(nq0Var, null));
    }

    @Override // defpackage.wia
    public boolean b() {
        return !z65.c(this.o.i(), this.n);
    }

    @Override // defpackage.wia
    public wx<String> c(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        return C(new e(nq0Var, null));
    }

    @Override // defpackage.wia
    public wx<Unit> d() {
        return D(new l(null));
    }

    @Override // defpackage.wia
    public wx<Unit> e(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        return D(new c(nq0Var, null));
    }

    @Override // defpackage.wia
    public wx<lk8> f() {
        return C(new i(null));
    }

    @Override // defpackage.wia
    public wx<b61> g() {
        return C(new d(null));
    }

    @Override // defpackage.wia
    public wx<lja> h() {
        return C(new j(null));
    }

    @Override // defpackage.wia
    public wx<Unit> i(String str) {
        z65.h(str, "upsaleProductId");
        return D(new C0208b(str, null));
    }

    @Override // defpackage.wia
    public wx<n42> j() {
        return C(new f(null));
    }

    @Override // defpackage.wia
    public wx<com.dodopizza.order.feature.shoppingcart.presentation.a> k() {
        return C(new a(null));
    }

    @Override // defpackage.wia
    public wx<String> l() {
        return C(new g(null));
    }

    @Override // defpackage.wia
    public wx<Unit> m(ng4 ng4Var) {
        z65.h(ng4Var, "goodModel");
        return D(new k(ng4Var, this, null));
    }
}
