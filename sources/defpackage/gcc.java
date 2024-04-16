package defpackage;

import android.webkit.JavascriptInterface;
import com.dodopizza.yandexcaptcha.YaCaptchaConfig;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: YaCaptchaJSInterface.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lgcc;", "", "", "getConfig", "token", "", "onSendToken", "close", "loadSuccessful", "onChallengeVisible", "", "errorCode", "onError", "Lcom/dodopizza/yandexcaptcha/YaCaptchaConfig;", "a", "Lcom/dodopizza/yandexcaptcha/YaCaptchaConfig;", "yaCaptchaConfig", "Lhcc;", "b", "Lhcc;", "yaCaptchaResultListener", "<init>", "(Lcom/dodopizza/yandexcaptcha/YaCaptchaConfig;Lhcc;)V", c.a, "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: gcc  reason: default package */
/* loaded from: classes2.dex */
public final class gcc {
    public static final a c = new a(null);
    private final YaCaptchaConfig a;
    private final hcc b;

    /* compiled from: YaCaptchaJSInterface.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lgcc$a;", "", "", "JS_INTERFACE_TAG", "Ljava/lang/String;", "<init>", "()V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: gcc$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public gcc(YaCaptchaConfig yaCaptchaConfig, hcc hccVar) {
        z65.h(hccVar, "yaCaptchaResultListener");
        this.a = yaCaptchaConfig;
        this.b = hccVar;
    }

    @JavascriptInterface
    public final void close() {
        this.b.onClose();
    }

    @JavascriptInterface
    public final String getConfig() {
        Gson gson = new Gson();
        YaCaptchaConfig yaCaptchaConfig = this.a;
        if (yaCaptchaConfig == null) {
            yaCaptchaConfig = new YaCaptchaConfig(null, null, null, 7, null);
        }
        String t = gson.t(yaCaptchaConfig);
        z65.g(t, "Gson().toJson(yaCaptchaC…fig ?: YaCaptchaConfig())");
        return t;
    }

    @JavascriptInterface
    public final void loadSuccessful() {
        this.b.onLoaded();
    }

    @JavascriptInterface
    public final void onChallengeVisible() {
        this.b.V();
    }

    @JavascriptInterface
    public final void onError(int i) {
        this.b.J3(i);
    }

    @JavascriptInterface
    public final void onSendToken(String str) {
        z65.h(str, "token");
        this.b.onSuccess(str);
    }
}
