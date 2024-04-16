package ru.dodopizza.app.presentation.temporarilyblock.presenter;

import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.data.dto.response.CheckAvailabilityResponse;
/* compiled from: TemporarilyBlockPresenter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/dodopizza/app/presentation/temporarilyblock/presenter/TemporarilyBlockPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lf9b;", "", "blockTime", "", "t", "onFirstViewAttach", Image.TYPE_SMALL, "La9b;", "a", "La9b;", "interactor", "Lci8;", "b", "Lci8;", "assetsDataSource", "", com.huawei.hms.opendevice.c.a, "J", "minTimeNextUpdate", "<init>", "(La9b;Lci8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TemporarilyBlockPresenter extends BasePresenter<f9b> {
    private final a9b a;
    private final ci8 b;
    private long c;

    /* compiled from: TemporarilyBlockPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.temporarilyblock.presenter.TemporarilyBlockPresenter$onClickUpdateButton$1", f = "TemporarilyBlockPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
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

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((f9b) TemporarilyBlockPresenter.this.getViewState()).p0(true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: TemporarilyBlockPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.temporarilyblock.presenter.TemporarilyBlockPresenter$onClickUpdateButton$2", f = "TemporarilyBlockPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
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
                ((f9b) TemporarilyBlockPresenter.this.getViewState()).p0(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: TemporarilyBlockPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/data/dto/response/CheckAvailabilityResponse;", "response", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.temporarilyblock.presenter.TemporarilyBlockPresenter$onClickUpdateButton$3", f = "TemporarilyBlockPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<CheckAvailabilityResponse, cv1<? super Unit>, Object> {
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
        public final Object invoke(CheckAvailabilityResponse checkAvailabilityResponse, cv1<? super Unit> cv1Var) {
            return ((c) create(checkAvailabilityResponse, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CheckAvailabilityResponse checkAvailabilityResponse = (CheckAvailabilityResponse) this.b;
                Integer num = checkAvailabilityResponse.errorCode;
                if (num != null && num.intValue() == 3) {
                    ci8 ci8Var = TemporarilyBlockPresenter.this.b;
                    Integer num2 = checkAvailabilityResponse.blockTime;
                    z65.g(num2, "blockTime");
                    ci8Var.H(num2.intValue());
                    ci8 ci8Var2 = TemporarilyBlockPresenter.this.b;
                    Integer num3 = checkAvailabilityResponse.sleepBlockTime;
                    z65.g(num3, "sleepBlockTime");
                    ci8Var2.I(num3.intValue());
                    TemporarilyBlockPresenter temporarilyBlockPresenter = TemporarilyBlockPresenter.this;
                    Integer num4 = checkAvailabilityResponse.blockTime;
                    z65.g(num4, "blockTime");
                    temporarilyBlockPresenter.t(num4.intValue());
                } else {
                    TemporarilyBlockPresenter.this.b.H(0);
                    ((f9b) TemporarilyBlockPresenter.this.getViewState()).p5();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: TemporarilyBlockPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.temporarilyblock.presenter.TemporarilyBlockPresenter$onClickUpdateButton$4", f = "TemporarilyBlockPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
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
                ((f9b) TemporarilyBlockPresenter.this.getViewState()).p5();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public TemporarilyBlockPresenter(a9b a9bVar, ci8 ci8Var) {
        z65.h(a9bVar, "interactor");
        z65.h(ci8Var, "assetsDataSource");
        this.a = a9bVar;
        this.b = ci8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int i) {
        this.c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        t(this.b.u());
    }

    public final void s() {
        if (this.b.f() || System.currentTimeMillis() > this.c) {
            p(z77.a(y87.a(o77.a(r77.a(this.a.c(), new a(null)), new b(null)), new c(null)), new d(null)));
        }
    }
}
