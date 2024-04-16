package com.hcaptcha.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;
import lombok.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l {
    @NonNull
    private final Context a;
    @NonNull
    private final HCaptchaConfig b;
    @NonNull
    private final m c;
    @NonNull
    private final HCaptchaStateListener d;
    @NonNull
    private final WebView e;
    @NonNull
    private final zr4 f;

    /* loaded from: classes.dex */
    public static class b extends WebChromeClient {
        private b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            hj4.a("[webview] onConsoleMessage " + consoleMessage.message());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            hj4.b("[webview] onProgressChanged %d%%", Integer.valueOf(i));
        }
    }

    /* loaded from: classes.dex */
    public class c extends WebViewClient {
        private c() {
        }

        private String a(String str) {
            return str.split("[?#]")[0] + "...";
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            hj4.a("[webview] onLoadResource " + a(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            hj4.a("[webview] onPageFinished " + a(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            hj4.a("[webview] onPageStarted " + a(str));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            hj4.b("[webview] onReceivedError \"%s\" (%d)", str, Integer.valueOf(i));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url = webResourceRequest.getUrl();
            if (url != null && url.getScheme().equals("http")) {
                l.this.e.removeJavascriptInterface("JSInterface");
                l.this.e.removeJavascriptInterface("JSDI");
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public l(@NonNull Handler handler, @NonNull Context context, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull f fVar, @NonNull m mVar, @NonNull HCaptchaStateListener hCaptchaStateListener, @NonNull WebView webView) {
        if (handler != null) {
            if (context != null) {
                if (hCaptchaConfig != null) {
                    if (fVar != null) {
                        if (mVar != null) {
                            if (hCaptchaStateListener != null) {
                                if (webView != null) {
                                    this.a = context;
                                    this.b = hCaptchaConfig;
                                    this.c = mVar;
                                    this.d = hCaptchaStateListener;
                                    this.e = webView;
                                    this.f = fVar.e();
                                    h(handler);
                                    return;
                                }
                                throw new NullPointerException("webView is marked non-null but is null");
                            }
                            throw new NullPointerException("listener is marked non-null but is null");
                        }
                        throw new NullPointerException("captchaVerifier is marked non-null but is null");
                    }
                    throw new NullPointerException("internalConfig is marked non-null but is null");
                }
                throw new NullPointerException("config is marked non-null but is null");
            }
            throw new NullPointerException("context is marked non-null but is null");
        }
        throw new NullPointerException("handler is marked non-null but is null");
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void h(@NonNull Handler handler) {
        if (handler != null) {
            hj4.a("WebViewHelper.setupWebView");
            k kVar = new k(handler, this.b, this.c);
            com.hcaptcha.sdk.b bVar = new com.hcaptcha.sdk.b(this.a);
            WebSettings settings = this.e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setCacheMode(-1);
            settings.setGeolocationEnabled(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            this.e.setWebViewClient(new c());
            if (hj4.a) {
                this.e.setWebChromeClient(new b());
            }
            this.e.setBackgroundColor(0);
            this.e.setLayerType(1, null);
            this.e.addJavascriptInterface(kVar, "JSInterface");
            this.e.addJavascriptInterface(bVar, "JSDI");
            this.e.loadDataWithBaseURL(this.b.getHost(), this.f.A0(), "text/html", "UTF-8", null);
            hj4.a("WebViewHelper.loadData");
            return;
        }
        throw new NullPointerException("handler is marked non-null but is null");
    }

    public void b() {
        hj4.a("WebViewHelper.destroy");
        this.e.removeJavascriptInterface("JSInterface");
        this.e.removeJavascriptInterface("JSDI");
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        } else {
            hj4.c("webView.getParent() is null or not a ViewGroup instance");
        }
        this.e.destroy();
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaConfig c() {
        return this.b;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaStateListener d() {
        return this.d;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WebView e() {
        return this.e;
    }

    public void f() {
        this.e.loadUrl("javascript:reset();");
    }

    public void g() {
        this.e.loadUrl("javascript:resetAndExecute();");
    }

    public boolean i(HCaptchaException hCaptchaException) {
        return this.b.getRetryPredicate().B(this.b, hCaptchaException);
    }
}
