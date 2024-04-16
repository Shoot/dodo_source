package com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo;

import com.dodopizza.presentation.presenters.BasePresenter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CompletedOrderInfoPresenter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lsl1;", "", "onFirstViewAttach", "", "textIsWrapped", "t", "u", "Lll1;", "a", "Lll1;", "data", "Lnl1;", "b", "Lnl1;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.opendevice.c.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lll1;Lnl1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CompletedOrderInfoPresenter extends BasePresenter<sl1> {
    private final ll1 a;
    private final nl1 b;
    private final Logger c;

    /* compiled from: CompletedOrderInfoPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljl1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoPresenter$onFirstViewAttach$1", f = "CompletedOrderInfoPresenter.kt", l = {17}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function1<cv1<? super jl1>, Object> {
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
        public final Object invoke(cv1<? super jl1> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
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
                nl1 nl1Var = CompletedOrderInfoPresenter.this.b;
                String a = CompletedOrderInfoPresenter.this.a.a();
                this.a = 1;
                obj = nl1Var.c(a, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* compiled from: CompletedOrderInfoPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljl1;", "orderInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoPresenter$onFirstViewAttach$2", f = "CompletedOrderInfoPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<jl1, cv1<? super Unit>, Object> {
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
        public final Object invoke(jl1 jl1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(jl1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((sl1) CompletedOrderInfoPresenter.this.getViewState()).a2((jl1) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CompletedOrderInfoPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoPresenter$onFirstViewAttach$3", f = "CompletedOrderInfoPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CompletedOrderInfoPresenter.this.c.warn("Failed to get completed order info", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public CompletedOrderInfoPresenter(ll1 ll1Var, nl1 nl1Var) {
        z65.h(ll1Var, "data");
        z65.h(nl1Var, "interactor");
        this.a = ll1Var;
        this.b = nl1Var;
        this.c = LoggerFactory.getLogger("CompletedOrderInfoPresenter");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        p(z77.a(y87.a(hy.a(new a(null)), new b(null)), new c(null)));
    }

    public final void t(boolean z) {
        if (z) {
            ((sl1) getViewState()).gd();
            ((sl1) getViewState()).f2();
        }
    }

    public final void u() {
        ((sl1) getViewState()).a8();
        ((sl1) getViewState()).M6();
    }
}
