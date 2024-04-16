package com.dodopizza.yandexcaptcha;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: YaCaptchaException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/yandexcaptcha/YaCaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "Lfcc;", "a", "Lfcc;", "()Lfcc;", "yaCaptchaError", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Lfcc;)V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class YaCaptchaException extends Exception {
    private final fcc a;

    public YaCaptchaException(fcc fccVar) {
        z65.h(fccVar, "yaCaptchaError");
        this.a = fccVar;
    }

    public final fcc a() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a.a();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "YaCaptchaException(yaCaptchaError=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
