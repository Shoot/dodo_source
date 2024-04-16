package com.dodopizza.loyalty.menu;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import defpackage.os8;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LoyaltyPresenter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b7\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0003R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00106\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "La36;", "", "B", "Lu06;", "menuData", "D", "F", "G", "Ln06;", "historyData", "H", "(Ln06;Lcv1;)Ljava/lang/Object;", "categoryVO", "L", "Ldb1;", "coinsExpirationsInfo", "E", "view", "C", "Lb26;", "I", "J", "onBackPressed", "K", "Le06;", "a", "Le06;", "loyaltyData", "Ls06;", "b", "Ls06;", "interactor", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Ll6;", "", com.huawei.hms.push.e.a, "Ll6;", "operationsList", "f", "Lu06;", "screenData", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "<init>", "(Le06;Ls06;Lf63;Lgc;Ll6;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LoyaltyPresenter extends BasePresenter<a36> {
    private e06 a;
    private final s06 b;
    private final f63 c;
    private final gc d;
    private final l6<Object> e;
    private u06 f;
    private final Logger g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyPresenter$applyLoyaltyMenu$1", f = "LoyaltyPresenter.kt", l = {119, 130, 133, 134}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
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

        /* JADX WARN: Removed duplicated region for block: B:22:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d1 A[RETURN] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r8.a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L26
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                defpackage.vk9.b(r9)
                goto Ld2
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                defpackage.vk9.b(r9)
                goto Lc5
            L26:
                defpackage.vk9.b(r9)
                goto Laf
            L2b:
                defpackage.vk9.b(r9)
                goto L61
            L2f:
                defpackage.vk9.b(r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                moxy.MvpView r9 = r9.getViewState()
                a36 r9 = (defpackage.a36) r9
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                u06 r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.y(r1)
                double r6 = r1.a()
                r9.h2(r6)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                moxy.MvpView r9 = r9.getViewState()
                a36 r9 = (defpackage.a36) r9
                r9.M3()
                com.dodopizza.loyalty.menu.LoyaltyPresenter r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                s06 r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.v(r9)
                r8.a = r5
                java.lang.Object r9 = r9.p(r8)
                if (r9 != r0) goto L61
                return r0
            L61:
                u06 r9 = (defpackage.u06) r9
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                com.dodopizza.loyalty.menu.LoyaltyPresenter.z(r1, r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                com.dodopizza.loyalty.menu.LoyaltyPresenter.A(r1, r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                com.dodopizza.loyalty.menu.LoyaltyPresenter.q(r1, r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                com.dodopizza.loyalty.menu.LoyaltyPresenter.t(r1, r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                moxy.MvpView r1 = r1.getViewState()
                a36 r1 = (defpackage.a36) r1
                double r5 = r9.a()
                r1.h2(r5)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                com.dodopizza.loyalty.menu.LoyaltyPresenter.s(r1, r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                moxy.MvpView r1 = r1.getViewState()
                a36 r1 = (defpackage.a36) r1
                java.util.Collection r9 = r9.c()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.List r9 = defpackage.ic1.F0(r9)
                r1.qd(r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                s06 r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.v(r9)
                r8.a = r4
                java.lang.Object r9 = r9.n(r8)
                if (r9 != r0) goto Laf
                return r0
            Laf:
                db1 r9 = (defpackage.db1) r9
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                com.dodopizza.loyalty.menu.LoyaltyPresenter.r(r1, r9)
                com.dodopizza.loyalty.menu.LoyaltyPresenter r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                s06 r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.v(r9)
                r8.a = r3
                java.lang.Object r9 = r9.o(r8)
                if (r9 != r0) goto Lc5
                return r0
            Lc5:
                n06 r9 = (defpackage.n06) r9
                com.dodopizza.loyalty.menu.LoyaltyPresenter r1 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                r8.a = r2
                java.lang.Object r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.u(r1, r9, r8)
                if (r9 != r0) goto Ld2
                return r0
            Ld2:
                com.dodopizza.loyalty.menu.LoyaltyPresenter r9 = com.dodopizza.loyalty.menu.LoyaltyPresenter.this
                moxy.MvpView r9 = r9.getViewState()
                a36 r9 = (defpackage.a36) r9
                r9.M7()
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.loyalty.menu.LoyaltyPresenter.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyPresenter$applyLoyaltyMenu$2", f = "LoyaltyPresenter.kt", l = {}, m = "invokeSuspend")
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
                LoyaltyPresenter.this.g.error("Can`t load loyalty categories", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyPresenter", f = "LoyaltyPresenter.kt", l = {175}, m = "configureHistory")
    /* loaded from: classes2.dex */
    public static final class c extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return LoyaltyPresenter.this.H(null, this);
        }
    }

    /* compiled from: LoyaltyPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyPresenter$onOperationsLoadMore$1", f = "LoyaltyPresenter.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function1<cv1<? super Object>, Object> {
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
        public final Object invoke(cv1<Object> cv1Var) {
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
                ((a36) LoyaltyPresenter.this.getViewState()).b4();
                s06 s06Var = LoyaltyPresenter.this.b;
                int size = LoyaltyPresenter.this.e.size();
                this.a = 1;
                obj = s06Var.q(size, this);
                if (obj == d) {
                    return d;
                }
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                return nf0.a(LoyaltyPresenter.this.e.addAll(list));
            }
            LoyaltyPresenter.this.e.add(abb.a);
            ((a36) LoyaltyPresenter.this.getViewState()).Sb();
            return Unit.a;
        }
    }

    /* compiled from: LoyaltyPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyPresenter$onOperationsLoadMore$2", f = "LoyaltyPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LoyaltyPresenter.this.g.error("Can`t load more history operations", (Throwable) this.b);
                ((a36) LoyaltyPresenter.this.getViewState()).t5();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.menu.LoyaltyPresenter$onOperationsLoadMore$3", f = "LoyaltyPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(cv1Var);
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
                ((a36) LoyaltyPresenter.this.getViewState()).Ea();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ LoyaltyPresenter(e06 e06Var, s06 s06Var, f63 f63Var, gc gcVar, l6 l6Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(e06Var, s06Var, f63Var, gcVar, (i & 16) != 0 ? new l6(null, 1, null) : l6Var);
    }

    private final void B() {
        p(z77.a(hy.a(new a(null)), new b(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(u06 u06Var) {
        boolean y;
        String b2 = this.a.b();
        if (b2 != null) {
            y = l0b.y(b2);
            if (!y) {
                for (b26 b26Var : u06Var.c()) {
                    if (z65.c(b26Var.a(), this.a.b())) {
                        I(b26Var);
                        e06 e06Var = this.a;
                        this.a = e06Var.a(e06Var.c(), null);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(db1 db1Var) {
        Object u0;
        if (db1Var != null) {
            List<xa1> b2 = db1Var.b();
            if (b2.size() >= 2) {
                ((a36) getViewState()).Se(b2.get(0), b2.get(1));
                ((a36) getViewState()).td(db1Var.a(), db1Var.c());
                return;
            } else if (b2.size() == 1) {
                u0 = sc1.u0(b2);
                ((a36) getViewState()).Sd((xa1) u0);
                ((a36) getViewState()).td(db1Var.a(), db1Var.c());
                return;
            } else {
                ((a36) getViewState()).cc();
                return;
            }
        }
        ((a36) getViewState()).cc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(u06 u06Var) {
        os8 d2 = u06Var.d();
        if (d2 instanceof os8.b) {
            ((a36) getViewState()).B3(((os8.b) d2).a());
        } else if (d2 instanceof os8.e) {
            ((a36) getViewState()).Dg();
        } else if (d2 instanceof os8.a) {
            ((a36) getViewState()).p2();
        } else if (d2 instanceof os8.d) {
            ((a36) getViewState()).lb();
        } else if (d2 instanceof os8.c) {
            ((a36) getViewState()).n5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(u06 u06Var) {
        if (u06Var.b().length() > 0) {
            ((a36) getViewState()).Nf();
        } else {
            ((a36) getViewState()).Kd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:25:0x0058, B:27:0x0064, B:28:0x007c), top: B:36:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:25:0x0058, B:27:0x0064, B:28:0x007c), top: B:36:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(defpackage.n06 r5, defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.dodopizza.loyalty.menu.LoyaltyPresenter.c
            if (r0 == 0) goto L13
            r0 = r6
            com.dodopizza.loyalty.menu.LoyaltyPresenter$c r0 = (com.dodopizza.loyalty.menu.LoyaltyPresenter.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.dodopizza.loyalty.menu.LoyaltyPresenter$c r0 = new com.dodopizza.loyalty.menu.LoyaltyPresenter$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.a
            com.dodopizza.loyalty.menu.LoyaltyPresenter r5 = (com.dodopizza.loyalty.menu.LoyaltyPresenter) r5
            defpackage.vk9.b(r6)     // Catch: java.lang.Exception -> L2d
            goto L58
        L2d:
            r6 = move-exception
            goto L88
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.vk9.b(r6)
            boolean r5 = r5.a()
            if (r5 == 0) goto La0
            moxy.MvpView r5 = r4.getViewState()
            a36 r5 = (defpackage.a36) r5
            r5.Q9()
            s06 r5 = r4.b     // Catch: java.lang.Exception -> L86
            r0.a = r4     // Catch: java.lang.Exception -> L86
            r0.d = r3     // Catch: java.lang.Exception -> L86
            r6 = 0
            java.lang.Object r6 = r5.q(r6, r0)     // Catch: java.lang.Exception -> L86
            if (r6 != r1) goto L57
            return r1
        L57:
            r5 = r4
        L58:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L2d
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Exception -> L2d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L2d
            r1 = r1 ^ r3
            if (r1 == 0) goto L7c
            l6<java.lang.Object> r1 = r5.e     // Catch: java.lang.Exception -> L2d
            r1.clear()     // Catch: java.lang.Exception -> L2d
            l6<java.lang.Object> r1 = r5.e     // Catch: java.lang.Exception -> L2d
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Exception -> L2d
            r1.addAll(r6)     // Catch: java.lang.Exception -> L2d
            moxy.MvpView r6 = r5.getViewState()     // Catch: java.lang.Exception -> L2d
            a36 r6 = (defpackage.a36) r6     // Catch: java.lang.Exception -> L2d
            l6<java.lang.Object> r1 = r5.e     // Catch: java.lang.Exception -> L2d
            r6.R7(r1)     // Catch: java.lang.Exception -> L2d
            goto La9
        L7c:
            moxy.MvpView r6 = r5.getViewState()     // Catch: java.lang.Exception -> L2d
            a36 r6 = (defpackage.a36) r6     // Catch: java.lang.Exception -> L2d
            r6.z6()     // Catch: java.lang.Exception -> L2d
            goto La9
        L86:
            r6 = move-exception
            r5 = r4
        L88:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            defpackage.q95.k(r0)
            org.slf4j.Logger r0 = r5.g
            java.lang.String r1 = "Can`t load loyalty history"
            r0.error(r1, r6)
            moxy.MvpView r5 = r5.getViewState()
            a36 r5 = (defpackage.a36) r5
            r5.z6()
            goto La9
        La0:
            moxy.MvpView r5 = r4.getViewState()
            a36 r5 = (defpackage.a36) r5
            r5.z6()
        La9:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.loyalty.menu.LoyaltyPresenter.H(n06, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(u06 u06Var) {
        u26 u26Var;
        os8 d2 = u06Var.d();
        boolean z = true;
        if (!(d2 instanceof os8.d) && !(d2 instanceof os8.c)) {
            z = false;
        }
        gc gcVar = this.d;
        rba c2 = this.a.c();
        if (c2 != null) {
            u26Var = sba.a(c2);
        } else {
            u26Var = null;
        }
        gcVar.a(new t26(u26Var, u06Var.a(), z));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: C */
    public void attachView(a36 a36Var) {
        super.attachView(a36Var);
        B();
    }

    public final void I(b26 b26Var) {
        z65.h(b26Var, "categoryVO");
        this.c.e(new l26(new h26(b26Var.d(), b26Var.e(), b26Var.c(), this.f.a(), b26Var.f(), b26Var.g(), this.a.c())));
    }

    public final void J() {
        this.c.e(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a(this.f.b(), this.f.b(), (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }

    public final void K() {
        p(o77.a(z77.a(hy.a(new d(null)), new e(null)), new f(null)));
    }

    public final void onBackPressed() {
        this.c.d();
    }

    public LoyaltyPresenter(e06 e06Var, s06 s06Var, f63 f63Var, gc gcVar, l6<Object> l6Var) {
        List l;
        z65.h(e06Var, "loyaltyData");
        z65.h(s06Var, "interactor");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(l6Var, "operationsList");
        this.a = e06Var;
        this.b = s06Var;
        this.c = f63Var;
        this.d = gcVar;
        this.e = l6Var;
        l = kc1.l();
        this.f = new u06(l, os8.e.a, 0.0d, "");
        this.g = LoggerFactory.getLogger("LoyaltyPresenter");
    }
}
