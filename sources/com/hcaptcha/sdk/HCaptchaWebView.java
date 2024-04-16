package com.hcaptcha.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class HCaptchaWebView extends WebView {
    public HCaptchaWebView(@NonNull Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onCheckIsTextEditor() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }

    public HCaptchaWebView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
