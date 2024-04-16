package defpackage;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.captcha.provider.CaptchaCancelledException;
import com.dodopizza.captcha.provider.CaptchaException;
import com.dodopizza.yandexcaptcha.YaCaptchaConfig;
import com.dodopizza.yandexcaptcha.YaCaptchaException;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.fcc;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: YaCaptchaTokenProviderImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0014R\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lkcc;", "Lz0;", "Lro0;", "settings", "Landroid/app/Activity;", "activity", "Lfn0;", "", "cont", "", e.a, "Lorg/slf4j/Logger;", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", c.a, "()Lorg/slf4j/Logger;", "logger", "Lbo0;", "captchaActivityHolder", "<init>", "(Lbo0;)V", "a", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: kcc  reason: default package */
/* loaded from: classes.dex */
public final class kcc extends z0 {
    public static final a e = new a(null);
    private final Logger d;

    /* compiled from: YaCaptchaTokenProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkcc$a;", "", "", "CAPTCHA_URL", "Ljava/lang/String;", "<init>", "()V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: kcc$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcc(bo0 bo0Var) {
        super(bo0Var);
        z65.h(bo0Var, "captchaActivityHolder");
        Logger logger = LoggerFactory.getLogger("YaCaptchaTokenProviderImpl");
        z65.g(logger, "getLogger(\"YaCaptchaTokenProviderImpl\")");
        this.d = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(kcc kccVar, fn0 fn0Var, String str) {
        z65.h(kccVar, "this$0");
        z65.h(fn0Var, "$cont");
        z65.h(str, "token");
        Logger c = kccVar.c();
        c.debug("Got captcha token: " + str);
        if (fn0Var.b()) {
            fn0Var.resumeWith(sk9.b(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(kcc kccVar, fn0 fn0Var, YaCaptchaException yaCaptchaException) {
        Throwable captchaException;
        z65.h(kccVar, "this$0");
        z65.h(fn0Var, "$cont");
        z65.h(yaCaptchaException, e.a);
        kccVar.c().warn("Captcha failure. ", (Throwable) yaCaptchaException);
        if (yaCaptchaException.a() instanceof fcc.a) {
            captchaException = new CaptchaCancelledException(yaCaptchaException);
        } else {
            captchaException = new CaptchaException(yaCaptchaException);
        }
        if (fn0Var.b()) {
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(vk9.a(captchaException)));
        }
    }

    @Override // defpackage.z0
    protected Logger c() {
        return this.d;
    }

    @Override // defpackage.z0
    protected void e(ro0 ro0Var, Activity activity, final fn0<? super String> fn0Var) {
        z65.h(ro0Var, "settings");
        z65.h(activity, "activity");
        z65.h(fn0Var, "cont");
        dcc.d.a(activity).e(new YaCaptchaConfig(ro0Var.b(), "https://captcha-api.yandex.ru/captcha.js", null, 4, null)).d(new d97() { // from class: icc
            @Override // defpackage.d97
            public final void onSuccess(String str) {
                kcc.i(kcc.this, fn0Var, str);
            }
        }).c(new d87() { // from class: jcc
            @Override // defpackage.d87
            public final void a(YaCaptchaException yaCaptchaException) {
                kcc.j(kcc.this, fn0Var, yaCaptchaException);
            }
        });
    }
}
