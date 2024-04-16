package com.hcaptcha.sdk;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Serializable;
import java.util.Objects;
import lombok.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k implements Serializable {
    @NonNull
    private final transient Handler a;
    private final String b;
    @NonNull
    private final transient m c;

    public k(@NonNull Handler handler, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull m mVar) {
        String str;
        if (handler != null) {
            if (hCaptchaConfig != null) {
                if (mVar != null) {
                    this.a = handler;
                    this.c = mVar;
                    try {
                        str = new f57().m(hCaptchaConfig);
                    } catch (JsonProcessingException unused) {
                        Log.w("JSInterface", "Cannot prepare config for passing to WebView. A fallback config will be used");
                        str = null;
                    }
                    this.b = str;
                    return;
                }
                throw new NullPointerException("captchaVerifier is marked non-null but is null");
            }
            throw new NullPointerException("config is marked non-null but is null");
        }
        throw new NullPointerException("handler is marked non-null but is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(gj4 gj4Var) {
        this.c.rc(new HCaptchaException(gj4Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        this.c.onSuccess(str);
    }

    @JavascriptInterface
    public String getConfig() {
        return this.b;
    }

    @JavascriptInterface
    public void onError(int i) {
        hj4.b("JSInterface.onError %d", Integer.valueOf(i));
        final gj4 a = gj4.a(i);
        this.a.post(new Runnable() { // from class: com.hcaptcha.sdk.h
            @Override // java.lang.Runnable
            public final void run() {
                k.this.c(a);
            }
        });
    }

    @JavascriptInterface
    public void onLoaded() {
        hj4.a("JSInterface.onLoaded");
        Handler handler = this.a;
        final m mVar = this.c;
        Objects.requireNonNull(mVar);
        handler.post(new Runnable() { // from class: com.hcaptcha.sdk.g
            @Override // java.lang.Runnable
            public final void run() {
                m.this.onLoaded();
            }
        });
    }

    @JavascriptInterface
    public void onOpen() {
        hj4.a("JSInterface.onOpen");
        Handler handler = this.a;
        final m mVar = this.c;
        Objects.requireNonNull(mVar);
        handler.post(new Runnable() { // from class: com.hcaptcha.sdk.j
            @Override // java.lang.Runnable
            public final void run() {
                m.this.g9();
            }
        });
    }

    @JavascriptInterface
    public void onPass(final String str) {
        hj4.a("JSInterface.onPass");
        this.a.post(new Runnable() { // from class: com.hcaptcha.sdk.i
            @Override // java.lang.Runnable
            public final void run() {
                k.this.d(str);
            }
        });
    }
}
