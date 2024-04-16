package com.hcaptcha.sdk;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.webkit.WebView;
import lombok.NonNull;
/* loaded from: classes.dex */
final class d implements m {
    @NonNull
    private final HCaptchaConfig a;
    @NonNull
    private final HCaptchaStateListener b;
    @NonNull
    private final l c;
    private boolean d;
    private boolean e;
    private boolean f;

    public d(@NonNull androidx.fragment.app.d dVar, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull f fVar, @NonNull HCaptchaStateListener hCaptchaStateListener) {
        if (dVar != null) {
            if (hCaptchaConfig != null) {
                if (fVar != null) {
                    if (hCaptchaStateListener != null) {
                        hj4.a("HeadlessWebView.init");
                        this.a = hCaptchaConfig;
                        this.b = hCaptchaStateListener;
                        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(dVar);
                        hCaptchaWebView.setId(ny8.b);
                        hCaptchaWebView.setVisibility(8);
                        if (hCaptchaWebView.getParent() == null) {
                            ((ViewGroup) dVar.getWindow().getDecorView().getRootView()).addView(hCaptchaWebView);
                        }
                        this.c = new l(new Handler(Looper.getMainLooper()), dVar, hCaptchaConfig, fVar, this, hCaptchaStateListener, hCaptchaWebView);
                        return;
                    }
                    throw new NullPointerException("listener is marked non-null but is null");
                }
                throw new NullPointerException("internalConfig is marked non-null but is null");
            }
            throw new NullPointerException("config is marked non-null but is null");
        }
        throw new NullPointerException("activity is marked non-null but is null");
    }

    @Override // defpackage.b97
    /* renamed from: a */
    public void onSuccess(String str) {
        this.b.c(str);
    }

    public void b() {
        if (this.d) {
            this.c.f();
            WebView e = this.c.e();
            if (e.getParent() != null) {
                ((ViewGroup) e.getParent()).removeView(e);
                return;
            }
            return;
        }
        this.f = true;
    }

    @Override // defpackage.q87
    public void g9() {
        this.b.b();
    }

    @Override // com.hcaptcha.sdk.m
    public void jc(@NonNull androidx.fragment.app.d dVar) {
        if (dVar != null) {
            if (this.d) {
                this.c.g();
                return;
            } else {
                this.e = true;
                return;
            }
        }
        throw new NullPointerException("activity is marked non-null but is null");
    }

    @Override // defpackage.m87
    public void onLoaded() {
        this.d = true;
        if (this.f) {
            this.f = false;
            b();
        } else if (this.e) {
            this.e = false;
            this.c.g();
        }
    }

    @Override // defpackage.b87
    public void rc(@NonNull HCaptchaException hCaptchaException) {
        if (hCaptchaException != null) {
            if (this.c.i(hCaptchaException)) {
                this.c.g();
                return;
            } else {
                this.b.a(hCaptchaException);
                return;
            }
        }
        throw new NullPointerException("exception is marked non-null but is null");
    }
}
