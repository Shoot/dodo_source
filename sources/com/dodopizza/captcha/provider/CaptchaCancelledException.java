package com.dodopizza.captcha.provider;

import kotlin.Metadata;
/* compiled from: CaptchaCancelledException.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/captcha/provider/CaptchaCancelledException;", "Lcom/dodopizza/captcha/provider/CaptchaException;", "<init>", "()V", "", "cause", "(Ljava/lang/Throwable;)V", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CaptchaCancelledException extends CaptchaException {
    public CaptchaCancelledException() {
    }

    public CaptchaCancelledException(Throwable th) {
        super(th);
    }
}
