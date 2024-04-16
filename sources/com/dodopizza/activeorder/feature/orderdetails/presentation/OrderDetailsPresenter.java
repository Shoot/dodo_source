package com.dodopizza.activeorder.feature.orderdetails.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.orderdetails.presentation.a;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: OrderDetailsPresenter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderDetailsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lpd7;", "Lld7;", BonusActionEntity.ORDER, "", "u", "onFirstViewAttach", "onBackPressed", "Lf63;", "a", "Lf63;", "router", "Ljgb;", "b", "Ljgb;", "timeFormatter", "Ldd7;", c.a, "Ldd7;", "interactor", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "orderId", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lf63;Ljgb;Ldd7;Ljava/lang/String;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderDetailsPresenter extends BasePresenter<pd7> {
    private final f63 a;
    private final jgb b;
    private final dd7 c;
    private final String d;
    private final Logger e;

    /* compiled from: OrderDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lld7;", BonusActionEntity.ORDER, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.orderdetails.presentation.OrderDetailsPresenter$onFirstViewAttach$1", f = "OrderDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<ld7, cv1<? super Unit>, Object> {
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
        public final Object invoke(ld7 ld7Var, cv1<? super Unit> cv1Var) {
            return ((a) create(ld7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderDetailsPresenter.this.u((ld7) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.orderdetails.presentation.OrderDetailsPresenter$onFirstViewAttach$2", f = "OrderDetailsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
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
                Logger logger = OrderDetailsPresenter.this.e;
                String str = OrderDetailsPresenter.this.d;
                logger.warn("Failed to get order with index " + str + ". ", (Throwable) this.b);
                OrderDetailsPresenter.this.a.d();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public OrderDetailsPresenter(f63 f63Var, jgb jgbVar, dd7 dd7Var, String str) {
        z65.h(f63Var, "router");
        z65.h(jgbVar, "timeFormatter");
        z65.h(dd7Var, "interactor");
        z65.h(str, "orderId");
        this.a = f63Var;
        this.b = jgbVar;
        this.c = dd7Var;
        this.d = str;
        this.e = LoggerFactory.getLogger("OrderCardPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(ld7 ld7Var) {
        ((pd7) getViewState()).setTitle(ld7Var.e());
        ((pd7) getViewState()).A3(ld7Var.d());
        ((pd7) getViewState()).Nb(ld7Var.h());
        ((pd7) getViewState()).L0(ld7Var.l());
        ((pd7) getViewState()).D7(ld7Var.a());
        ((pd7) getViewState()).v2(ld7Var.j(), ld7Var.c());
        ((pd7) getViewState()).eh(ld7Var.i());
        com.dodopizza.activeorder.feature.orderdetails.presentation.a b2 = ld7Var.b();
        if (b2 instanceof a.c) {
            ((pd7) getViewState()).D0(((a.c) ld7Var.b()).a());
        } else if (b2 instanceof a.C0110a) {
            ((pd7) getViewState()).r0();
        } else if (z65.c(b2, a.b.a)) {
            ((pd7) getViewState()).J();
        }
        if (ld7Var.n() && ld7Var.m() == jk7.e) {
            if (ld7Var.k()) {
                ((pd7) getViewState()).Oa(this.b.c(ld7Var.g()));
            } else {
                ((pd7) getViewState()).I8(this.b.c(ld7Var.g()), this.b.c(ld7Var.f()));
            }
        }
        ((pd7) getViewState()).zf(ld7Var.m());
    }

    public final void onBackPressed() {
        this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        p(z77.a(y87.a(this.c.a(this.d), new a(null)), new b(null)));
    }
}
