package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.dodopizza.loyalty.stacksgame.StackGamePresenter;
import com.dodopizza.loyalty.stacksgame.di.StackGameDependencies;
import com.dodopizza.order.feature.menu.DodocoinBadgeView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tsa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: StackGameFragment.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001vB\u0007¢\u0006\u0004\bs\u0010tJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0011H\u0016J\u0018\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0011H\u0016J\b\u0010*\u001a\u00020\rH\u0016J\u0018\u0010+\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020\rH\u0016J\u0010\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0016H\u0016J\u0018\u00102\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0016H\u0016J\b\u00103\u001a\u00020\rH\u0016J\u0010\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0016H\u0016J\b\u00106\u001a\u00020\rH\u0016J\u0010\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0016H\u0007J\u0010\u0010:\u001a\u00020\r2\u0006\u00109\u001a\u00020\u0016H\u0007J\b\u0010;\u001a\u00020\rH\u0007R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u001b\u0010I\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bH\u0010ER\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010>\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010>\u001a\u0004\bZ\u0010[R\u001b\u0010_\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b^\u0010[R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010>\u001a\u0004\bb\u0010cR\u001b\u0010g\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010>\u001a\u0004\bf\u0010VR\u001c\u0010l\u001a\n i*\u0004\u0018\u00010h0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010r\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q¨\u0006w"}, d2 = {"Lwsa;", "Lf70;", "Lfta;", "Lw50;", "", "newCounter", "maxCount", "", "sh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "rootView", "ih", "", "hh", "gh", "", "onBackPressed", "", RemoteMessageConst.Notification.URL, "Lnc4;", "environmentSettings", "Z3", "b", "C", "pointsRatio", "coinsRatio", "A7", "n2", "jb", "Lpc4;", "gameSettings", "te", "newPointCount", "S6", "finalAmountCount", "finalPointsCount", "wg", "o7", "Ra", "j6", "vf", "animationUrl", "O4", "claimedRewardAmount", "rewardAnimationUrl", "de", "F2", "errorMessage", "Hd", "q6", "pointAddedEventJson", "pointAdded", "gameEndedEventJson", "gameEnded", "gameLoaded", "Lcom/google/android/material/appbar/MaterialToolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Bh", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Ah", "()Landroid/widget/Button;", "takeRewardButton", com.huawei.hms.push.e.a, "Ch", "tryAgainButton", "Landroid/webkit/WebView;", "f", "wh", "()Landroid/webkit/WebView;", "gameWebView", "Lcom/dodopizza/order/feature/menu/DodocoinBadgeView;", "g", "th", "()Lcom/dodopizza/order/feature/menu/DodocoinBadgeView;", "coinsBadge", Image.TYPE_HIGH, "zh", "()Landroid/view/View;", "progressBarContainer", "Landroid/widget/TextView;", "i", "vh", "()Landroid/widget/TextView;", "gameTitle", "j", "xh", "pointCountView", "Lcom/airbnb/lottie/LottieAnimationView;", "k", "rh", "()Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "l", "uh", "firstStartView", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "Lorg/slf4j/Logger;", "logger", "Lcom/dodopizza/loyalty/stacksgame/StackGamePresenter;", "n", "Lmoxy/ktx/MoxyKtxDelegate;", "yh", "()Lcom/dodopizza/loyalty/stacksgame/StackGamePresenter;", "presenter", "<init>", "()V", "o", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wsa  reason: default package */
/* loaded from: classes2.dex */
public final class wsa extends f70 implements fta, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final Logger m;
    private final MoxyKtxDelegate n;
    static final /* synthetic */ je5<Object>[] p = {bc9.f(new ar8(wsa.class, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0)), bc9.f(new ar8(wsa.class, "takeRewardButton", "getTakeRewardButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(wsa.class, "tryAgainButton", "getTryAgainButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(wsa.class, "gameWebView", "getGameWebView()Landroid/webkit/WebView;", 0)), bc9.f(new ar8(wsa.class, "coinsBadge", "getCoinsBadge()Lcom/dodopizza/order/feature/menu/DodocoinBadgeView;", 0)), bc9.f(new ar8(wsa.class, "progressBarContainer", "getProgressBarContainer()Landroid/view/View;", 0)), bc9.f(new ar8(wsa.class, "gameTitle", "getGameTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(wsa.class, "pointCountView", "getPointCountView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(wsa.class, "animationView", "getAnimationView()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(wsa.class, "firstStartView", "getFirstStartView()Landroid/view/View;", 0)), bc9.f(new ar8(wsa.class, "presenter", "getPresenter()Lcom/dodopizza/loyalty/stacksgame/StackGamePresenter;", 0))};
    public static final a o = new a(null);

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lwsa$a;", "", "", "activeOrderId", "Lwsa;", "a", "ARG_ACTIVE_ORDER_ID", "Ljava/lang/String;", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wsa$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wsa a(String str) {
            z65.h(str, "activeOrderId");
            return (wsa) y64.d(new wsa(), bi0.c(bi0.d("arg_active_order_id", str)));
        }
    }

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"wsa$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", RemoteMessageConst.Notification.URL, "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageFinished", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wsa$b */
    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {
        final /* synthetic */ nc4 b;

        /* compiled from: StackGameFragment.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wsa$b$a", "Landroid/webkit/WebViewClient;", "loyalty_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: wsa$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends WebViewClient {
            a() {
            }
        }

        b(nc4 nc4Var) {
            this.b = nc4Var;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            z65.h(webView, "view");
            z65.h(str, RemoteMessageConst.Notification.URL);
            String t = new Gson().t(this.b);
            WebView wh = wsa.this.wh();
            wh.evaluateJavascript("initGame('" + t + "')", null);
            webView.setWebViewClient(new a());
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            z65.h(webView, "view");
            z65.h(str, RemoteMessageConst.Notification.URL);
            wsa.this.yh().B();
        }
    }

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"wsa$c", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wsa$c */
    /* loaded from: classes2.dex */
    public static final class c extends WebChromeClient {
        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            z65.h(consoleMessage, "consoleMessage");
            Logger logger = wsa.this.m;
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            logger.warn("GameConsole " + messageLevel + ": " + message + " at " + lineNumber + " line");
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/loyalty/stacksgame/StackGamePresenter;", "a", "()Lcom/dodopizza/loyalty/stacksgame/StackGamePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wsa$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<StackGamePresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final StackGamePresenter invoke() {
            tsa.b a = tsa.a.a();
            StackGameDependencies stackGameDependencies = (StackGameDependencies) wsa.this.getComponentDependenciesRegistry().a(bc9.b(StackGameDependencies.class));
            Bundle arguments = wsa.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_active_order_id")) == null) ? null : null;
            if (obj != null && !(obj instanceof String)) {
                throw new ClassCastException("Property arg_active_order_id has different class type");
            } else if (obj != null) {
                return a.a(stackGameDependencies, (String) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = arg_active_order_id not found in bundle");
            }
        }
    }

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wsa$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ double b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(double d, int i) {
            super(1);
            this.b = d;
            this.c = i;
        }

        public final void a(View view) {
            z65.h(view, "it");
            wsa.this.yh().E(this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wsa$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            wsa.this.yh().F();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wsa$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        g() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "view");
            wsa.this.yh().D();
            un3.e(view);
            wsa.this.wh().requestFocus();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wsa$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<uoa, Unit> {
        final /* synthetic */ String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: StackGameFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wsa$h$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ wsa a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(wsa wsaVar) {
                super(0);
                this.a = wsaVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: StackGameFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wsa$h$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return this.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: StackGameFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: wsa$h$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 3;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: StackGameFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: wsa$h$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(1);
            this.b = str;
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(wsa.this));
            uoaVar.h(new b(this.b));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: StackGameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wsa$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            wsa.this.yh().F();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public wsa() {
        super(ez8.fragment_stack_game);
        this.c = kb0.e(this, ey8.stack_game_toolbar);
        this.d = kb0.e(this, ey8.stack_game_take_reward_button);
        this.e = kb0.e(this, ey8.stack_game_try_again_button);
        this.f = kb0.e(this, ey8.stack_game_webview);
        this.g = kb0.e(this, ey8.stack_game_coin_badge);
        this.h = kb0.e(this, ey8.stack_game_progress_bar_container);
        this.i = kb0.e(this, ey8.stack_game_title);
        this.j = kb0.e(this, ey8.stack_game_point_count);
        this.k = kb0.e(this, ey8.stack_game_animation_view);
        this.l = kb0.e(this, ey8.stack_game_first_start_handler_view);
        this.m = LoggerFactory.getLogger("StackGameFragment");
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.n = new MoxyKtxDelegate(mvpDelegate, StackGamePresenter.class.getName() + ".presenter", dVar);
    }

    private final Button Ah() {
        return (Button) this.d.a(this, p[1]);
    }

    private final MaterialToolbar Bh() {
        return (MaterialToolbar) this.c.a(this, p[0]);
    }

    private final Button Ch() {
        return (Button) this.e.a(this, p[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c Dh(wsa wsaVar, int i2, int i3, int i4, View view, c5c c5cVar) {
        z65.h(wsaVar, "this$0");
        z65.h(view, "<anonymous parameter 0>");
        z65.h(c5cVar, "insets");
        p45.j(wsaVar.th(), 0, i2 + c5cVar.l(), 0, 0, 13, null);
        p45.j(wsaVar.Bh(), 0, i3 + c5cVar.l(), 0, 0, 13, null);
        p45.j(wsaVar.Ch(), 0, 0, 0, i4 + c5cVar.i(), 7, null);
        return c5cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eh(wsa wsaVar, View view) {
        z65.h(wsaVar, "this$0");
        wsaVar.yh().onBackPressed();
    }

    private final LottieAnimationView rh() {
        return (LottieAnimationView) this.k.a(this, p[8]);
    }

    private final CharSequence sh(double d2, double d3) {
        int Y;
        String string = getString(p09.proportion_with_space, Integer.valueOf((int) d2), Integer.valueOf((int) d3));
        z65.g(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(ow8.staticWhiteTransparent50Color));
        Y = m0b.Y(string, '/', 0, false, 6, null);
        spannableString.setSpan(foregroundColorSpan, Y, string.length(), 33);
        return spannableString;
    }

    private final DodocoinBadgeView th() {
        return (DodocoinBadgeView) this.g.a(this, p[4]);
    }

    private final View uh() {
        return (View) this.l.a(this, p[9]);
    }

    private final TextView vh() {
        return (TextView) this.i.a(this, p[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebView wh() {
        return (WebView) this.f.a(this, p[3]);
    }

    private final TextView xh() {
        return (TextView) this.j.a(this, p[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StackGamePresenter yh() {
        return (StackGamePresenter) this.n.getValue(this, p[10]);
    }

    private final View zh() {
        return (View) this.h.a(this, p[5]);
    }

    @Override // defpackage.fta
    public void A7(int i2, int i3) {
        xsa.f.a(i2, i3).show(getChildFragmentManager(), "StackGameInfo");
    }

    @Override // defpackage.fta
    public void C() {
        Bh().setNavigationIconTint(iu1.c(requireContext(), ow8.e));
        un3.d(zh(), 0L, 1, null);
    }

    @Override // defpackage.fta
    public void F2() {
        String string = getString(p09.c);
        z65.g(string, "getString(...)");
        Hd(string);
    }

    @Override // defpackage.fta
    public void Hd(String str) {
        z65.h(str, "errorMessage");
        Snackbar a2 = soa.a.a(new h(str));
        a2.P(Ah());
        a2.U();
    }

    @Override // defpackage.fta
    public void O4(String str) {
        z65.h(str, "animationUrl");
        rh().setAnimationFromUrl(str);
        un3.k(rh());
        rh().x();
    }

    @Override // defpackage.fta
    public void Ra(double d2, double d3) {
        un3.j(th(), 0L, 1, null);
        th().setBalance(sh(d2, d3));
        th().setBadgeColor(ow8.surfaceLoyaltyColor);
    }

    @Override // defpackage.fta
    public void S6(int i2) {
        xh().setText(String.valueOf(i2));
    }

    @Override // defpackage.fta
    public void Z3(String str, nc4 nc4Var) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        z65.h(nc4Var, "environmentSettings");
        if (!z65.c(str, wh().getUrl())) {
            wh().setWebViewClient(new b(nc4Var));
            wh().loadUrl(str);
        }
    }

    @Override // defpackage.fta
    public void b() {
        Bh().setNavigationIconTint(iu1.c(requireContext(), ow8.q));
        un3.j(zh(), 0L, 1, null);
    }

    @Override // defpackage.fta
    public void de(double d2, String str) {
        z65.h(str, "rewardAnimationUrl");
        ata.f.a(d2, str).show(getChildFragmentManager(), "StackGameReward");
    }

    @JavascriptInterface
    public final void gameEnded(String str) {
        z65.h(str, "gameEndedEventJson");
        try {
            jyb.b(this, 0L, 1, null);
            JSONObject jSONObject = new JSONObject(str);
            Object obj = jSONObject.get("score");
            z65.f(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = jSONObject.get("lossReason");
            z65.f(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj2).intValue();
            Object obj3 = jSONObject.get("rewardAmount");
            z65.f(obj3, "null cannot be cast to non-null type kotlin.Int");
            yh().z(intValue, ((Integer) obj3).intValue(), intValue2);
        } catch (Exception e2) {
            this.m.error("Failed when gameEnded callback call", (Throwable) e2);
        }
    }

    @JavascriptInterface
    public final void gameLoaded() {
        try {
            yh().A();
        } catch (Exception e2) {
            this.m.error("Failed when gameLoaded callback call", (Throwable) e2);
        }
    }

    @Override // defpackage.f70
    protected int gh() {
        return ow8.whiteTransparent;
    }

    @Override // defpackage.f70
    protected int hh() {
        return ow8.whiteTransparent;
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        final int i3;
        z65.h(view, "rootView");
        ViewGroup.LayoutParams layoutParams = Ch().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        final int i4 = 0;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = Bh().getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        if (marginLayoutParams2 != null) {
            i3 = marginLayoutParams2.topMargin;
        } else {
            i3 = 0;
        }
        ViewGroup.LayoutParams layoutParams3 = th().getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        }
        if (marginLayoutParams3 != null) {
            i4 = marginLayoutParams3.topMargin;
        }
        syb.I0(view, new h77() { // from class: vsa
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c Dh;
                Dh = wsa.Dh(wsa.this, i4, i3, i2, view2, c5cVar);
                return Dh;
            }
        });
    }

    @Override // defpackage.fta
    public void j6(double d2) {
        un3.j(th(), 0L, 1, null);
        th().setBalance(sh(d2, d2));
        th().setBadgeColor(ow8.k);
    }

    @Override // defpackage.fta
    public void jb() {
        un3.d(vh(), 0L, 1, null);
        un3.d(Ah(), 0L, 1, null);
        un3.d(Ch(), 0L, 1, null);
    }

    @Override // defpackage.fta
    public void n2() {
        vh().setText(getString(p09.stack_game_start_game_title));
        un3.j(vh(), 0L, 1, null);
        oma.a(uh(), new g());
        un3.k(uh());
    }

    @Override // defpackage.fta
    public void o7() {
        un3.d(vh(), 0L, 1, null);
        un3.d(Ah(), 0L, 1, null);
        oma.a(Ch(), new i());
        Ch().setActivated(false);
        un3.j(Ch(), 0L, 1, null);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Bh().setNavigationOnClickListener(new View.OnClickListener() { // from class: usa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                wsa.Eh(wsa.this, view2);
            }
        });
        wh().setLayerType(2, null);
        wh().getSettings().setJavaScriptEnabled(true);
        wh().addJavascriptInterface(this, "JSBridge");
        wh().setWebChromeClient(new c());
    }

    @JavascriptInterface
    public final void pointAdded(String str) {
        z65.h(str, "pointAddedEventJson");
        try {
            jyb.a(this, 10L);
            Object obj = new JSONObject(str).get("score");
            z65.f(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = new JSONObject(str).get("rewardAmount");
            z65.f(obj2, "null cannot be cast to non-null type kotlin.Int");
            yh().C(intValue, ((Integer) obj2).intValue());
        } catch (Exception e2) {
            this.m.error("Failed when pointAdded callback call", (Throwable) e2);
        }
    }

    @Override // defpackage.fta
    public void q6() {
        wh().stopLoading();
        wh().destroy();
    }

    @Override // defpackage.fta
    public void te(pc4 pc4Var) {
        z65.h(pc4Var, "gameSettings");
        un3.d(vh(), 0L, 1, null);
        String t = new Gson().t(pc4Var);
        WebView wh = wh();
        wh.evaluateJavascript("startGame('" + t + "')", null);
    }

    @Override // defpackage.fta
    public void vf() {
        un3.d(th(), 0L, 1, null);
    }

    @Override // defpackage.fta
    public void wg(double d2, int i2) {
        un3.d(vh(), 0L, 1, null);
        oma.a(Ah(), new e(d2, i2));
        Ah().setText(getString(p09.stack_game_take_reward_title, String.valueOf((int) d2)));
        un3.j(Ah(), 0L, 1, null);
        Ch().setActivated(true);
        oma.a(Ch(), new f());
        un3.j(Ch(), 0L, 1, null);
    }
}
