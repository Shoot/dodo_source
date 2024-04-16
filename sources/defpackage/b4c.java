package defpackage;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ht7;
import defpackage.tj1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.payment.WebViewCardPaymentPresenter;
/* compiled from: WebViewCardPaymentFragment.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002TUB\u0007¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006V"}, d2 = {"Lb4c;", "Lf70;", "Li4c;", "Lw50;", "Ltj1$a;", "", "Ah", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "isError", "L", "show", "M", "gf", "Ke", "onBackPressed", "", "id", "O8", "onCancel", "onDestroyView", "", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "Landroid/widget/RelativeLayout;", com.huawei.hms.opendevice.c.a, "Lk79;", "vh", "()Landroid/widget/RelativeLayout;", "errorMessage", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "yh", "()Landroid/widget/Button;", "refreshButton", "Landroid/webkit/WebView;", com.huawei.hms.push.e.a, "th", "()Landroid/webkit/WebView;", "cardPaymentWebView", "Landroid/widget/ProgressBar;", "f", "sh", "()Landroid/widget/ProgressBar;", "bankProgressBar", "Landroid/widget/ImageView;", "g", "rh", "()Landroid/widget/ImageView;", "backButton", "Lcom/dodopizza/android/view/custom/InfoMessage;", Image.TYPE_HIGH, "wh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "i", "Z", "close", "Lru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter;", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "xh", "()Lru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter;", "presenter", "Lj4c;", "k", "Lrn5;", "zh", "()Lj4c;", "webViewPaymentScenario", "Ly31;", "uh", "()Ly31;", "checkoutParent", "<init>", "()V", "l", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b4c  reason: default package */
/* loaded from: classes4.dex */
public final class b4c extends f70 implements i4c, w50, tj1.a {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private boolean i;
    private final MoxyKtxDelegate j;
    private final rn5 k;
    static final /* synthetic */ je5<Object>[] m = {bc9.f(new ar8(b4c.class, "errorMessage", "getErrorMessage()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(b4c.class, "refreshButton", "getRefreshButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(b4c.class, "cardPaymentWebView", "getCardPaymentWebView()Landroid/webkit/WebView;", 0)), bc9.f(new ar8(b4c.class, "bankProgressBar", "getBankProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(b4c.class, "backButton", "getBackButton()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(b4c.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(b4c.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter;", 0))};
    public static final a l = new a(null);

    /* compiled from: WebViewCardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lb4c$a;", "", "Le4c;", "data", "Lb4c;", "a", "", "EXPIRED", "Ljava/lang/String;", "EXTRA_START_TIME", "EXTRA_WEB_VIEW_PAYMENT_SCENARIO", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b4c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b4c a(e4c e4cVar) {
            z65.h(e4cVar, "data");
            return (b4c) y64.d(new b4c(), bi0.c(bi0.d("payment_scenario", e4cVar.a()), bi0.d("extra_start_time", Long.valueOf(System.currentTimeMillis()))));
        }
    }

    /* compiled from: WebViewCardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017J(\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lb4c$b;", "Landroid/webkit/WebViewClient;", "", "code", "", "description", RemoteMessageConst.Notification.URL, "", "a", "", "b", "Landroid/webkit/WebView;", "webView", "shouldOverrideUrlLoading", "view", "Landroid/webkit/WebResourceRequest;", "request", "errorCode", "failingUrl", "onReceivedError", "Landroid/webkit/WebResourceError;", "error", "onPageFinished", "Z", "finished", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lb4c;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b4c$b */
    /* loaded from: classes4.dex */
    private final class b extends WebViewClient {
        private boolean a;
        private final Logger b = LoggerFactory.getLogger("DodoWebViewClient");

        public b() {
        }

        private final void a(int i, String str, String str2) {
            this.b.error("Some errors in WebViewCard", new Throwable("WV error " + i + ", message " + str + ", url " + str2));
        }

        private final boolean b(String str) {
            boolean O;
            boolean z;
            boolean O2;
            boolean O3;
            boolean O4;
            try {
                O = m0b.O(str, b4c.this.zh().d(), false, 2, null);
                if (O) {
                    b4c.this.th().stopLoading();
                    un3.e(b4c.this.th());
                    b4c.this.xh().u();
                    this.a = true;
                    z = true;
                } else {
                    z = false;
                }
                O2 = m0b.O(str, b4c.this.zh().a(), false, 2, null);
                if (O2) {
                    b4c.this.th().stopLoading();
                    b4c.this.xh().t();
                    this.a = true;
                    z = true;
                }
                O3 = m0b.O(str, "payments/fail?reason=invalid-scid", false, 2, null);
                if (O3) {
                    this.a = false;
                    z = false;
                }
                O4 = m0b.O(str, "/payments/shop/0", false, 2, null);
                if (O4) {
                    b4c.this.th().stopLoading();
                    b4c.this.xh().w();
                    this.a = false;
                    return true;
                }
                return z;
            } catch (Throwable th) {
                Logger logger = this.b;
                logger.error("Failed to redirect url = " + str, th);
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            z65.h(webView, "view");
            z65.h(str, RemoteMessageConst.Notification.URL);
            if (!this.a) {
                un3.e(b4c.this.sh());
                un3.k(b4c.this.th());
                return;
            }
            b4c.this.wh().m(R.string.wait_for_order_after, 10000);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            z65.h(webView, "view");
            z65.h(str, "description");
            z65.h(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
            a(i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            z65.h(webView, "webView");
            z65.h(str, RemoteMessageConst.Notification.URL);
            return b(str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            z65.h(webView, "view");
            z65.h(webResourceRequest, "request");
            String uri = webResourceRequest.getUrl().toString();
            z65.g(uri, "toString(...)");
            return b(uri);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int errorCode;
            CharSequence description;
            z65.h(webView, "view");
            z65.h(webResourceRequest, "request");
            z65.h(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            errorCode = webResourceError.getErrorCode();
            description = webResourceError.getDescription();
            String obj = description.toString();
            String uri = webResourceRequest.getUrl().toString();
            z65.g(uri, "toString(...)");
            a(errorCode, obj, uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebViewCardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b4c$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b4c.this.xh().v();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: WebViewCardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b4c$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b4c.this.xh().r();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: WebViewCardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter;", "a", "()Lru/dodopizza/app/presentation/payment/WebViewCardPaymentPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b4c$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<WebViewCardPaymentPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final WebViewCardPaymentPresenter invoke() {
            Object obj;
            Object obj2;
            ht7.a b = ((LocalityComponent) b4c.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).Y3().b(((CheckoutComponent) b4c.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).b());
            Bundle arguments = b4c.this.getArguments();
            Long l = null;
            if (arguments == null || (obj = arguments.get("payment_scenario")) == null) {
                obj = null;
            }
            if (obj != null && !(obj instanceof j4c)) {
                throw new ClassCastException("Property payment_scenario has different class type");
            } else if (obj != null) {
                ht7.a c = b.c((j4c) obj);
                Bundle arguments2 = b4c.this.getArguments();
                if (arguments2 != null && (obj2 = arguments2.get("extra_start_time")) != null) {
                    l = obj2;
                }
                if (l != null && !(l instanceof Long)) {
                    throw new ClassCastException("Property extra_start_time has different class type");
                } else if (l != null) {
                    return c.d(l.longValue()).a().a();
                } else {
                    throw new IllegalArgumentException("Argument with key = extra_start_time not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = payment_scenario not found in bundle");
            }
        }
    }

    /* compiled from: WebViewCardPaymentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj4c;", "a", "()Lj4c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b4c$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<j4c> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final j4c invoke() {
            Bundle arguments = b4c.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("payment_scenario")) == null) ? null : null;
            if (obj != null && !(obj instanceof j4c)) {
                throw new ClassCastException("Property payment_scenario has different class type");
            } else if (obj != null) {
                return (j4c) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = payment_scenario not found in bundle");
            }
        }
    }

    public b4c() {
        super(R.layout.fragment_card_payment);
        rn5 b2;
        this.c = kb0.e(this, R.id.alert_message);
        this.d = kb0.e(this, R.id.refresh_button);
        this.e = kb0.e(this, R.id.web_view);
        this.f = kb0.e(this, R.id.progress_bar);
        this.g = kb0.e(this, R.id.back_button);
        this.h = kb0.e(this, R.id.info_message);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, WebViewCardPaymentPresenter.class.getName() + ".presenter", eVar);
        b2 = yn5.b(new f());
        this.k = b2;
    }

    private final void Ah() {
        oma.a(yh(), new c());
    }

    private final ImageView rh() {
        return (ImageView) this.g.a(this, m[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressBar sh() {
        return (ProgressBar) this.f.a(this, m[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebView th() {
        return (WebView) this.e.a(this, m[2]);
    }

    private final y31 uh() {
        y31 y31Var;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof y31) {
            y31Var = (y31) parentFragment;
        } else {
            y31Var = null;
        }
        if (y31Var != null) {
            return y31Var;
        }
        throw new IllegalArgumentException("Parent fragment is not checkout dialog".toString());
    }

    private final RelativeLayout vh() {
        return (RelativeLayout) this.c.a(this, m[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoMessage wh() {
        return (InfoMessage) this.h.a(this, m[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebViewCardPaymentPresenter xh() {
        return (WebViewCardPaymentPresenter) this.j.getValue(this, m[6]);
    }

    private final Button yh() {
        return (Button) this.d.a(this, m[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j4c zh() {
        return (j4c) this.k.getValue();
    }

    @Override // defpackage.i4c
    public void Ke() {
        wh().m(R.string.wait_for_order, Level.INFO_INT);
    }

    @Override // defpackage.i4c
    public void L(boolean z) {
        un3.o(vh(), z);
    }

    @Override // defpackage.i4c
    public void M(boolean z) {
        un3.o(sh(), z);
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        xh().s();
    }

    @Override // defpackage.i4c
    public void gf() {
        tj1.b bVar = tj1.e;
        String string = getString(R.string.payment_expired);
        z65.g(string, "getString(...)");
        bVar.b(string, "", getString(R.string.close), "expired", false).show(getChildFragmentManager(), "expired");
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        xh().r();
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (this.i) {
            return new AlphaAnimation(1.0f, 1.0f);
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        th().stopLoading();
        th().destroy();
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ah();
        oma.a(rh(), new d());
        th().setWebViewClient(new b());
        th().getSettings().setLoadWithOverviewMode(true);
        th().loadUrl(zh().c());
        th().getSettings().setJavaScriptEnabled(true);
        th().getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        un3.k(sh());
        un3.e(th());
        uh().setCancelable(false);
    }
}
