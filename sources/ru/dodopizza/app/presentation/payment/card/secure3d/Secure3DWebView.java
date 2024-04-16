package ru.dodopizza.app.presentation.payment.card.secure3d;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import ru.dodopizza.app.presentation.payment.card.secure3d.Secure3DWebView;
/* compiled from: Secure3DWebView.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0015\u0018B\u001b\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ,\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR$\u0010,\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010.¨\u00066"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView;", "Landroid/webkit/WebView;", "", Image.TYPE_HIGH, "", "k", "", RemoteMessageConst.Notification.URL, "j", "stackedModePostbackUrl", "setStackedMode", "Lj62;", "authorizationListener", "setAuthorizationListener", "acsUrl", "md", "paReq", "postbackUrl", "g", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "Lorg/slf4j/Logger;", "logger", "b", "Z", "urlReturned", com.huawei.hms.opendevice.c.a, "i", "()Z", "setDebugMode", "(Z)V", "isDebugMode", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", com.huawei.hms.push.e.a, "f", "getPostbackHandled", "setPostbackHandled", "postbackHandled", "getDebugExtraPaymentData", "()Ljava/lang/String;", "setDebugExtraPaymentData", "(Ljava/lang/String;)V", "debugExtraPaymentData", "Llpb;", "Llpb;", "dispatcher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Secure3DWebView extends WebView {
    public static final a i = new a(null);
    private static final String j;
    private final Logger a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;
    private volatile boolean f;
    private String g;
    private lpb h;

    /* compiled from: Secure3DWebView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView$a;", "", "", "JS_PROCESS_HTML_FUNCTION_SOURCE", "Ljava/lang/String;", "JavaScriptNS", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Secure3DWebView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView$b;", "", "", "htmlStr", "", "processHTML", "<init>", "(Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class b {

        /* compiled from: Secure3DWebView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj62;", "listener", "", "a", "(Lj62;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        static final class a extends ej5 implements Function1<j62, Unit> {
            final /* synthetic */ Spanned a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Spanned spanned) {
                super(1);
                this.a = spanned;
            }

            public final void a(j62 j62Var) {
                z65.h(j62Var, "listener");
                j62Var.e(this.a.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(j62 j62Var) {
                a(j62Var);
                return Unit.a;
            }
        }

        public b() {
        }

        @JavascriptInterface
        public final void processHTML(String str) {
            Spanned fromHtml;
            z65.h(str, "htmlStr");
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml(str, 0);
            } else {
                fromHtml = Html.fromHtml(str);
            }
            Secure3DWebView.this.h.b(new a(fromHtml));
        }
    }

    /* compiled from: Secure3DWebView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj62;", "listener", "", "a", "(Lj62;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<j62, Unit> {
        c() {
            super(1);
        }

        public final void a(j62 j62Var) {
            z65.h(j62Var, "listener");
            j62Var.d(Secure3DWebView.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j62 j62Var) {
            a(j62Var);
            return Unit.a;
        }
    }

    /* compiled from: Secure3DWebView.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"ru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView$e", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "view", "", "newProgress", "", "onProgressChanged", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e extends WebChromeClient {

        /* compiled from: Secure3DWebView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj62;", "listener", "", "a", "(Lj62;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        static final class a extends ej5 implements Function1<j62, Unit> {
            final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i) {
                super(1);
                this.a = i;
            }

            public final void a(j62 j62Var) {
                z65.h(j62Var, "listener");
                j62Var.b(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(j62 j62Var) {
                a(j62Var);
                return Unit.a;
            }
        }

        e() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            z65.h(webView, "view");
            Secure3DWebView.this.h.b(new a(i));
        }
    }

    static {
        pza pzaVar = pza.a;
        String format = String.format("window.%s.processHTML(document.getElementsByTagName('html')[0].innerHTML);", Arrays.copyOf(new Object[]{"D3SJS"}, 1));
        z65.g(format, "format(...)");
        j = format;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Secure3DWebView(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            defpackage.z65.h(r2, r0)
            android.content.Context r2 = defpackage.c3a.a(r2)
            r1.<init>(r2, r3)
            java.lang.String r2 = "Secure3DWebView"
            org.slf4j.Logger r2 = org.slf4j.LoggerFactory.getLogger(r2)
            r1.a = r2
            java.lang.String r2 = "https://www.google.com"
            r1.d = r2
            lpb r2 = new lpb
            r3 = 0
            r0 = 1
            r2.<init>(r3, r0, r3)
            r1.h = r2
            r1.setFocusable(r0)
            r1.setFocusableInTouchMode(r0)
            r1.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.payment.card.secure3d.Secure3DWebView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void h() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        addJavascriptInterface(new b(), "D3SJS");
        setWebViewClient(new d());
        setWebChromeClient(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(String str) {
        String str2;
        boolean O;
        if (k()) {
            str2 = this.e;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = this.d;
        }
        String lowerCase = str.toLowerCase();
        z65.g(lowerCase, "toLowerCase(...)");
        String lowerCase2 = str2.toLowerCase();
        z65.g(lowerCase2, "toLowerCase(...)");
        O = m0b.O(lowerCase, lowerCase2, false, 2, null);
        return O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k() {
        return !TextUtils.isEmpty(this.e);
    }

    public final void g(String str, String str2, String str3, String str4) {
        z65.h(str, "acsUrl");
        z65.h(str2, "md");
        z65.h(str3, "paReq");
        this.b = false;
        this.f = false;
        this.h.b(new c());
        if (str4 != null && !TextUtils.isEmpty(str4)) {
            this.d = str4;
        }
        try {
            pza pzaVar = pza.a;
            String format = String.format(Locale.US, "MD=%1$s&TermUrl=%2$s&PaReq=%3$s", Arrays.copyOf(new Object[]{URLEncoder.encode(str2, "UTF-8"), URLEncoder.encode(this.d, "UTF-8"), URLEncoder.encode(str3, "UTF-8")}, 3));
            z65.g(format, "format(...)");
            byte[] bytes = format.getBytes(rw0.b);
            z65.g(bytes, "getBytes(...)");
            postUrl(str, bytes);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String getDebugExtraPaymentData() {
        return this.g;
    }

    public final boolean getPostbackHandled() {
        return this.f;
    }

    public final boolean i() {
        return this.c;
    }

    public final void setAuthorizationListener(j62 j62Var) {
        z65.h(j62Var, "authorizationListener");
        this.h = new lpb(j62Var);
    }

    public final void setDebugExtraPaymentData(String str) {
        this.g = str;
    }

    public final void setDebugMode(boolean z) {
        this.c = z;
    }

    public final void setPostbackHandled(boolean z) {
        this.f = z;
    }

    public final void setStackedMode(String str) {
        z65.h(str, "stackedModePostbackUrl");
        this.e = str;
    }

    /* compiled from: Secure3DWebView.kt */
    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0017"}, d2 = {"ru/dodopizza/app/presentation/payment/card/secure3d/Secure3DWebView$d", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", RemoteMessageConst.Notification.URL, "", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "", "errorCode", "description", "failingUrl", "onReceivedError", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends WebViewClient {

        /* compiled from: Secure3DWebView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj62;", "listener", "", "a", "(Lj62;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        static final class a extends ej5 implements Function1<j62, Unit> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.a = str;
            }

            public final void a(j62 j62Var) {
                z65.h(j62Var, "listener");
                j62Var.c(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(j62 j62Var) {
                a(j62Var);
                return Unit.a;
            }
        }

        /* compiled from: Secure3DWebView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj62;", "listener", "", "a", "(Lj62;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        static final class b extends ej5 implements Function1<j62, Unit> {
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i, String str, String str2) {
                super(1);
                this.a = i;
                this.b = str;
                this.c = str2;
            }

            public final void a(j62 j62Var) {
                z65.h(j62Var, "listener");
                j62Var.a(this.a, this.b, this.c);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(j62 j62Var) {
                a(j62Var);
                return Unit.a;
            }
        }

        d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            z65.h(str, RemoteMessageConst.Notification.URL);
            if (!Secure3DWebView.this.getPostbackHandled() && Secure3DWebView.this.j(str)) {
                Secure3DWebView.this.setPostbackHandled(true);
                if (Secure3DWebView.this.k()) {
                    Secure3DWebView.this.h.b(new a(str));
                    return;
                } else if (webView != null) {
                    webView.evaluateJavascript(Secure3DWebView.j, new ValueCallback() { // from class: b3a
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj) {
                            Secure3DWebView.d.b((String) obj);
                        }
                    });
                    return;
                } else {
                    return;
                }
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Object b2;
            boolean J;
            z65.h(webView, "view");
            z65.h(str, "description");
            z65.h(str2, "failingUrl");
            try {
                sk9.a aVar = sk9.b;
                b2 = sk9.b(new URL(str2).getHost());
            } catch (Throwable th) {
                sk9.a aVar2 = sk9.b;
                b2 = sk9.b(vk9.a(th));
            }
            if (sk9.f(b2)) {
                b2 = null;
            }
            Logger logger = Secure3DWebView.this.a;
            StringBuilder sb = new StringBuilder("3DS error; ");
            sb.append(i + "; ");
            sb.append(str + "; ");
            sb.append(((String) b2) + "; ");
            sb.append(String.valueOf(Secure3DWebView.this.getDebugExtraPaymentData()));
            logger.error(sb.toString());
            J = l0b.J(str2, Secure3DWebView.this.d, false, 2, null);
            if (!J) {
                Secure3DWebView.this.h.b(new b(i, str, str2));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            z65.h(webView, "view");
            z65.h(webResourceRequest, "request");
            z65.h(webResourceResponse, "errorResponse");
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            Logger logger = Secure3DWebView.this.a;
            StringBuilder sb = new StringBuilder("3DS HTTP error; ");
            int statusCode = webResourceResponse.getStatusCode();
            sb.append(statusCode + "; ");
            String host = webResourceRequest.getUrl().getHost();
            sb.append(host + "; ");
            sb.append(String.valueOf(Secure3DWebView.this.getDebugExtraPaymentData()));
            logger.error(sb.toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            z65.h(webView, "view");
            z65.h(sslErrorHandler, "handler");
            z65.h(sslError, "error");
            if (Secure3DWebView.this.i()) {
                sslErrorHandler.proceed();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(String str) {
        }
    }
}
