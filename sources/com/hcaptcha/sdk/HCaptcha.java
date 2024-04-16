package com.hcaptcha.sdk;

import android.content.Context;
import android.util.AndroidRuntimeException;
import lombok.NonNull;
/* loaded from: classes.dex */
public final class HCaptcha extends u6b<pj4> {
    @NonNull
    private final androidx.fragment.app.d i;
    private m j;
    private HCaptchaConfig k;
    @NonNull
    private final f l;

    private HCaptcha(@NonNull Context context, @NonNull f fVar) {
        if (context != null) {
            if (fVar != null) {
                this.i = (androidx.fragment.app.d) context;
                this.l = fVar;
                return;
            }
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        throw new NullPointerException("context is marked non-null but is null");
    }

    public static HCaptcha r(@NonNull Context context) {
        if (context != null) {
            return new HCaptcha(context, f.c().a());
        }
        throw new NullPointerException("context is marked non-null but is null");
    }

    private HCaptcha t() {
        hj4.a("HCaptcha.startVerification");
        this.h.removeCallbacksAndMessages(null);
        m mVar = this.j;
        if (mVar == null) {
            i(new HCaptchaException(gj4.ERROR));
        } else {
            mVar.jc(this.i);
        }
        return this;
    }

    public HCaptcha s(@NonNull HCaptchaConfig hCaptchaConfig) {
        if (hCaptchaConfig != null) {
            hj4.a = hCaptchaConfig.getDiagnosticLog().booleanValue();
            hj4.a("HCaptcha.setup");
            HCaptchaStateListener hCaptchaStateListener = new HCaptchaStateListener() { // from class: com.hcaptcha.sdk.HCaptcha.1
                @Override // com.hcaptcha.sdk.HCaptchaStateListener
                public void a(HCaptchaException hCaptchaException) {
                    hj4.a("HCaptcha.onFailure");
                    HCaptcha.this.i(hCaptchaException);
                }

                @Override // com.hcaptcha.sdk.HCaptchaStateListener
                public void b() {
                    HCaptcha.this.d();
                }

                @Override // com.hcaptcha.sdk.HCaptchaStateListener
                public void c(String str) {
                    hj4.a("HCaptcha.onSuccess");
                    HCaptcha hCaptcha = HCaptcha.this;
                    hCaptcha.h(hCaptcha.k.getTokenExpiration());
                    HCaptcha hCaptcha2 = HCaptcha.this;
                    hCaptcha2.j(new pj4(str, hCaptcha2.h));
                }
            };
            try {
                if (hCaptchaConfig.getHideDialog().booleanValue()) {
                    HCaptchaConfig c = hCaptchaConfig.toBuilder().t(jj4.INVISIBLE).k(Boolean.FALSE).c();
                    this.k = c;
                    this.j = new d(this.i, c, this.l, hCaptchaStateListener);
                } else {
                    this.j = c.kh(hCaptchaConfig, this.l, hCaptchaStateListener);
                    this.k = hCaptchaConfig;
                }
            } catch (AndroidRuntimeException unused) {
                hCaptchaStateListener.a(new HCaptchaException(gj4.ERROR));
            }
            return this;
        }
        throw new NullPointerException("inputConfig is marked non-null but is null");
    }

    public HCaptcha u(@NonNull HCaptchaConfig hCaptchaConfig) {
        if (hCaptchaConfig != null) {
            if (this.j == null || !hCaptchaConfig.equals(this.k)) {
                s(hCaptchaConfig);
            }
            return t();
        }
        throw new NullPointerException("inputConfig is marked non-null but is null");
    }
}
