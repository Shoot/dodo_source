package ru.dodopizza.app.presentation.paymentbrokendialog;

import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: PaymentWorkflowBrokenPresenter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/paymentbrokendialog/PaymentWorkflowBrokenPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ldx7;", "", "onFirstViewAttach", "t", Image.TYPE_SMALL, "Lxw7;", "a", "Lxw7;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lorg/slf4j/Logger;", "logger", "", c.a, "Ljava/lang/String;", "phone", "<init>", "(Lxw7;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PaymentWorkflowBrokenPresenter extends BasePresenter<dx7> {
    private final xw7 a;
    private final Logger b;
    private String c;

    /* compiled from: PaymentWorkflowBrokenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "phone", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.paymentbrokendialog.PaymentWorkflowBrokenPresenter$onFirstViewAttach$1", f = "PaymentWorkflowBrokenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<String, cv1<? super Unit>, Object> {
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
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((a) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                PaymentWorkflowBrokenPresenter.this.c = str;
                ((dx7) PaymentWorkflowBrokenPresenter.this.getViewState()).G6(str);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PaymentWorkflowBrokenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.paymentbrokendialog.PaymentWorkflowBrokenPresenter$onFirstViewAttach$2", f = "PaymentWorkflowBrokenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                PaymentWorkflowBrokenPresenter.this.b.warn("Failed to get call center phone. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PaymentWorkflowBrokenPresenter(xw7 xw7Var) {
        z65.h(xw7Var, "interactor");
        this.a = xw7Var;
        this.b = LoggerFactory.getLogger("PaymentWorkflowBrokenPresenter");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        p(z77.a(y87.a(this.a.a(), new a(null)), new b(null)));
    }

    public final void s() {
        ((dx7) getViewState()).dismiss();
    }

    public final void t() {
        String str = this.c;
        if (str != null) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            ((dx7) viewState).u9(str);
        }
    }
}
