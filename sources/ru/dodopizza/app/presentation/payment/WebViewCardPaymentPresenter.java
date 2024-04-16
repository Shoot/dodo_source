package ru.dodopizza.app.presentation.payment;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.payment.WebViewCardPaymentPresenter;
/* compiled from: WebViewCardPaymentPresenter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B/\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Li4c;", "", "y", "onFirstViewAttach", "u", "t", "w", Image.TYPE_SMALL, "r", "", "startTime", "lifeTime", "x", "v", "Lf63;", "a", "Lf63;", "router", "Ldf4;", "b", "Ldf4;", "getDataAvailabilityInteractor", "Lwg6;", com.huawei.hms.opendevice.c.a, "Lwg6;", "menuRefreshInteractor", "Lj4c;", DateTokenConverter.CONVERTER_KEY, "Lj4c;", "webViewPaymentScenario", e.a, "J", "", "f", "Z", "paymentWasSuccessful", "Ljava/util/Timer;", "g", "Ljava/util/Timer;", "timer", "<init>", "(Lf63;Ldf4;Lwg6;Lj4c;J)V", Image.TYPE_HIGH, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WebViewCardPaymentPresenter extends BasePresenter<i4c> {
    public static final a h = new a(null);
    private final f63 a;
    private final df4 b;
    private final wg6 c;
    private final j4c d;
    private final long e;
    private boolean f;
    private Timer g;

    /* compiled from: WebViewCardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter$a;", "", "", "PAYMENT_RESULT", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WebViewCardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.WebViewCardPaymentPresenter$onRefresh$1", f = "WebViewCardPaymentPresenter.kt", l = {101}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super Object>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<Object> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
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
                wg6 wg6Var = WebViewCardPaymentPresenter.this.c;
                this.a = 1;
                obj = wg6Var.h(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* compiled from: WebViewCardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter$c", "Ljava/util/TimerTask;", "", "run", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends TimerTask {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WebViewCardPaymentPresenter webViewCardPaymentPresenter) {
            z65.h(webViewCardPaymentPresenter, "this$0");
            ((i4c) webViewCardPaymentPresenter.getViewState()).gf();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler handler = new Handler(Looper.getMainLooper());
            final WebViewCardPaymentPresenter webViewCardPaymentPresenter = WebViewCardPaymentPresenter.this;
            handler.post(new Runnable() { // from class: g4c
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewCardPaymentPresenter.c.b(WebViewCardPaymentPresenter.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebViewCardPaymentPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvv6;", "networkAvailabilityState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.WebViewCardPaymentPresenter$subscribeOnDataAvailability$1", f = "WebViewCardPaymentPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<vv6, cv1<? super Unit>, Object> {
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
        public final Object invoke(vv6 vv6Var, cv1<? super Unit> cv1Var) {
            return ((d) create(vv6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((vv6) this.b) == vv6.b) {
                    z = true;
                } else {
                    z = false;
                }
                ((i4c) WebViewCardPaymentPresenter.this.getViewState()).L(z);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public WebViewCardPaymentPresenter(f63 f63Var, df4 df4Var, wg6 wg6Var, j4c j4cVar, long j) {
        z65.h(f63Var, "router");
        z65.h(df4Var, "getDataAvailabilityInteractor");
        z65.h(wg6Var, "menuRefreshInteractor");
        z65.h(j4cVar, "webViewPaymentScenario");
        this.a = f63Var;
        this.b = df4Var;
        this.c = wg6Var;
        this.d = j4cVar;
        this.e = j;
    }

    private final void y() {
        o(wz3.F(this.b.a(), new d(null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        y();
        x(this.e, this.d.b());
    }

    public final void r() {
        if (this.f) {
            ((i4c) getViewState()).Ke();
        } else {
            this.a.i(R.id.payment_result_id, aw7.d);
        }
    }

    public final void s() {
        if (this.f) {
            ((i4c) getViewState()).Ke();
        } else {
            this.a.i(R.id.payment_result_id, aw7.d);
        }
    }

    public final void t() {
        ((i4c) getViewState()).M(false);
        this.a.i(R.id.payment_result_id, aw7.a);
    }

    public final void u() {
        Timer timer = this.g;
        if (timer != null) {
            timer.cancel();
        }
        this.f = true;
        ((i4c) getViewState()).M(false);
        this.a.i(R.id.payment_result_id, aw7.c);
    }

    public final void v() {
        p(hy.a(new b(null)));
    }

    public final void w() {
        ((i4c) getViewState()).M(false);
        this.a.i(R.id.payment_result_id, aw7.b);
    }

    public final void x(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = j + j2;
        if (currentTimeMillis > j3) {
            ((i4c) getViewState()).gf();
            return;
        }
        c cVar = new c();
        Timer timer = new Timer();
        timer.schedule(cVar, j3 - currentTimeMillis);
        this.g = timer;
    }
}
