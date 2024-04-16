package com.dodopizza.loyalty.products.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LoyaltyProductsPresenter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/dodopizza/loyalty/products/presentation/LoyaltyProductsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lo26;", "", "y", "", "newBalance", "B", "Lm26;", "loyaltyProductsVO", "C", "onFirstViewAttach", "Le26;", "item", "x", "A", "z", "Lf63;", "a", "Lf63;", "router", "Lk26;", "b", "Lk26;", "interactor", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "Ll6;", com.huawei.hms.push.e.a, "Ll6;", "loyaltyProducts", "f", "Lm26;", "screenData", "<init>", "(Lf63;Lk26;Lgc;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LoyaltyProductsPresenter extends BasePresenter<o26> {
    private final f63 a;
    private final k26 b;
    private final gc c;
    private final Logger d;
    private final l6<e26> e;
    private m26 f;

    /* compiled from: LoyaltyProductsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.products.presentation.LoyaltyProductsPresenter$addProductToCart$1", f = "LoyaltyProductsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e26 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e26 e26Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = e26Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
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
                double e = LoyaltyProductsPresenter.this.f.e() - this.c.d();
                LoyaltyProductsPresenter loyaltyProductsPresenter = LoyaltyProductsPresenter.this;
                loyaltyProductsPresenter.f = m26.c(loyaltyProductsPresenter.f, e, 0.0d, null, null, false, null, null, 126, null);
                LoyaltyProductsPresenter.this.B(e);
                LoyaltyProductsPresenter loyaltyProductsPresenter2 = LoyaltyProductsPresenter.this;
                loyaltyProductsPresenter2.C(loyaltyProductsPresenter2.f);
                ((o26) LoyaltyProductsPresenter.this.getViewState()).re(e);
                ((o26) LoyaltyProductsPresenter.this.getViewState()).D2(this.c.c());
                ((o26) LoyaltyProductsPresenter.this.getViewState()).u0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyProductsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.products.presentation.LoyaltyProductsPresenter$addProductToCart$2", f = "LoyaltyProductsPresenter.kt", l = {}, m = "invokeSuspend")
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
                LoyaltyProductsPresenter.this.d.error(((Throwable) this.b).getMessage());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyProductsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm26;", "loyaltyProductVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.products.presentation.LoyaltyProductsPresenter$addProductToCart$3", f = "LoyaltyProductsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<m26, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ e26 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e26 e26Var, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = e26Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(m26 m26Var, cv1<? super Unit> cv1Var) {
            return ((c) create(m26Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                m26 m26Var = (m26) this.b;
                LoyaltyProductsPresenter.this.c.a(new q26(u26.e, this.d.d(), this.d.e(), this.d.c(), m26Var.g(), m26Var.f().c(), m26Var.f().a()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyProductsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.products.presentation.LoyaltyProductsPresenter$addProductToCart$4", f = "LoyaltyProductsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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
                LoyaltyProductsPresenter.this.d.error(((Throwable) this.b).getMessage());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyProductsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm26;", "loyaltyProductsVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.products.presentation.LoyaltyProductsPresenter$applyLoyaltyProducts$1", f = "LoyaltyProductsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<m26, cv1<? super Unit>, Object> {
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
        public final Object invoke(m26 m26Var, cv1<? super Unit> cv1Var) {
            return ((e) create(m26Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            u26 u26Var;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                m26 m26Var = (m26) this.b;
                LoyaltyProductsPresenter.this.f = m26Var;
                ((o26) LoyaltyProductsPresenter.this.getViewState()).r(m26Var.g());
                LoyaltyProductsPresenter.this.C(m26Var);
                ((o26) LoyaltyProductsPresenter.this.getViewState()).re(m26Var.e());
                gc gcVar = LoyaltyProductsPresenter.this.c;
                rba j = m26Var.j();
                if (j != null) {
                    u26Var = sba.a(j);
                } else {
                    u26Var = null;
                }
                u26 u26Var2 = u26Var;
                gcVar.a(new s26(u26Var2, m26Var.e(), m26Var.d(), m26Var.h(), m26Var.g()));
                LoyaltyProductsPresenter.this.e.clear();
                LoyaltyProductsPresenter.this.e.addAll(m26Var.i());
                ((o26) LoyaltyProductsPresenter.this.getViewState()).u(LoyaltyProductsPresenter.this.e);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyProductsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le26;", "productVo", "", "", "a", "(Le26;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<e26, List<? extends String>> {
        final /* synthetic */ double a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(double d) {
            super(1);
            this.a = d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(e26 e26Var) {
            List<String> e;
            List<String> e2;
            z65.h(e26Var, "productVo");
            if (this.a >= e26Var.d()) {
                e26Var.h(true);
                e2 = jc1.e("enable_state");
                return e2;
            }
            e26Var.h(false);
            e = jc1.e("disable_state");
            return e;
        }
    }

    public LoyaltyProductsPresenter(f63 f63Var, k26 k26Var, gc gcVar) {
        z65.h(f63Var, "router");
        z65.h(k26Var, "interactor");
        z65.h(gcVar, "analytics");
        this.a = f63Var;
        this.b = k26Var;
        this.c = gcVar;
        this.d = LoggerFactory.getLogger("LoyaltyProductsPresenter");
        this.e = new l6<>(null, 1, null);
        this.f = m26.h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(double d2) {
        this.e.w1(new f(d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(m26 m26Var) {
        double h = m26Var.h();
        hn6 f2 = m26Var.f();
        double e2 = m26Var.e() - h;
        if (e2 < 0.0d) {
            ((o26) getViewState()).mf(Math.abs(e2));
        } else if (f2.e()) {
            ((o26) getViewState()).De(h, un6.b(f2));
        } else {
            ((o26) getViewState()).V4(h);
        }
    }

    private final void y() {
        p(y87.a(this.b.g(), new e(null)));
    }

    public final void A() {
        this.a.c(i56.a(n56.c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        y();
    }

    public final void x(e26 e26Var) {
        z65.h(e26Var, "item");
        p(z77.a(y87.a(this.b.d(e26Var.e()), new a(e26Var, null)), new b(null)));
        p(z77.a(y87.a(this.b.g(), new c(e26Var, null)), new d(null)));
    }

    public final void z() {
        this.a.d();
    }
}
