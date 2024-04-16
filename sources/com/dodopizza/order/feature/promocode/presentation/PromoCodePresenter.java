package com.dodopizza.order.feature.promocode.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: PromoCodePresenter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010&\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/dodopizza/order/feature/promocode/presentation/PromoCodePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lhq8;", "", "promoCodeString", "", "w", "referralCode", "x", "", "u", "onFirstViewAttach", "promoCode", "v", "Lnfa;", "a", "Lnfa;", "promoCodeInteractor", "Lhq3;", "b", "Lhq3;", "featureService", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lcq8;", DateTokenConverter.CONVERTER_KEY, "Lcq8;", "sender", "Laq8;", com.huawei.hms.push.e.a, "Laq8;", "router", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lnfa;Lhq3;Lgc;Lcq8;Laq8;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PromoCodePresenter extends BasePresenter<hq8> {
    private final nfa a;
    private final hq3 b;
    private final gc c;
    private final cq8 d;
    private final aq8 e;
    private final Logger f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lop8;", "promoCode", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter$savePromoCode$1", f = "PromoCodePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<op8, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(op8 op8Var, cv1<? super Unit> cv1Var) {
            return ((a) create(op8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                op8 op8Var = (op8) this.b;
                if (op8Var.h()) {
                    ((hq8) PromoCodePresenter.this.getViewState()).close();
                } else {
                    if (op8Var.f().length() > 0) {
                        ((hq8) PromoCodePresenter.this.getViewState()).R9(op8Var.f());
                    } else {
                        ((hq8) PromoCodePresenter.this.getViewState()).I2(fq8.a(op8Var.e()));
                    }
                    ((hq8) PromoCodePresenter.this.getViewState()).g();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter$savePromoCode$2", f = "PromoCodePresenter.kt", l = {}, m = "invokeSuspend")
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
                PromoCodePresenter.this.f.warn("Failed to save a promo code", (Throwable) this.b);
                ((hq8) PromoCodePresenter.this.getViewState()).g();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lja9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter$saveReferralCode$1", f = "PromoCodePresenter.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function1<cv1<? super ja9>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ja9> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
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
                nfa nfaVar = PromoCodePresenter.this.a;
                String str = this.c;
                cq8 cq8Var = PromoCodePresenter.this.d;
                this.a = 1;
                obj = nfaVar.p(str, cq8Var, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lja9;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter$saveReferralCode$2", f = "PromoCodePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<ja9, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: PromoCodePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ka9.values().length];
                try {
                    iArr[ka9.e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ka9.h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ka9.d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ka9.i.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ka9.c.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ka9.g.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ka9.f.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

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
        public final Object invoke(ja9 ja9Var, cv1<? super Unit> cv1Var) {
            return ((d) create(ja9Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ja9 ja9Var = (ja9) this.b;
                if (ja9Var instanceof kk3) {
                    kk3 kk3Var = (kk3) ja9Var;
                    switch (a.$EnumSwitchMapping$0[kk3Var.b().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            ((hq8) PromoCodePresenter.this.getViewState()).R9(kk3Var.c());
                            break;
                        case 5:
                            PromoCodePresenter.this.e.b();
                            ((hq8) PromoCodePresenter.this.getViewState()).close();
                            break;
                        case 6:
                            PromoCodePresenter.this.e.d(kk3Var.d(), kk3Var.c());
                            ((hq8) PromoCodePresenter.this.getViewState()).close();
                            break;
                        case 7:
                            PromoCodePresenter.this.e.a(kk3Var.a(), kk3Var.d(), kk3Var.c());
                            ((hq8) PromoCodePresenter.this.getViewState()).close();
                            break;
                    }
                } else if (ja9Var instanceof s1b) {
                    s1b s1bVar = (s1b) ja9Var;
                    PromoCodePresenter.this.e.c(s1bVar.a(), s1bVar.b());
                    ((hq8) PromoCodePresenter.this.getViewState()).close();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter$saveReferralCode$3", f = "PromoCodePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                PromoCodePresenter.this.f.error("Can`t apply referral code", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter$saveReferralCode$4", f = "PromoCodePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                ((hq8) PromoCodePresenter.this.getViewState()).g();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PromoCodePresenter(nfa nfaVar, hq3 hq3Var, gc gcVar, cq8 cq8Var, aq8 aq8Var) {
        z65.h(nfaVar, "promoCodeInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        z65.h(cq8Var, "sender");
        z65.h(aq8Var, "router");
        this.a = nfaVar;
        this.b = hq3Var;
        this.c = gcVar;
        this.d = cq8Var;
        this.e = aq8Var;
        this.f = LoggerFactory.getLogger("PromoCodePresenter");
    }

    private final boolean u(String str) {
        boolean O;
        if (this.b.a(bq3.k6) || this.b.a(bq3.n6)) {
            O = m0b.O(str, "-", false, 2, null);
            if (!O) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final void w(String str) {
        p(z77.a(y87.a(this.a.o(str, this.d), new a(null)), new b(null)));
    }

    private final void x(String str) {
        p(o77.a(z77.a(y87.a(hy.a(new c(str, null)), new d(null)), new e(null)), new f(null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.c.a(new ab9(this.d));
    }

    public final void v(String str) {
        z65.h(str, "promoCode");
        if (str.length() > 0) {
            ((hq8) getViewState()).f();
            ((hq8) getViewState()).l9();
            if (u(str)) {
                x(str);
                return;
            } else {
                w(str);
                return;
            }
        }
        ((hq8) getViewState()).b8();
    }
}
