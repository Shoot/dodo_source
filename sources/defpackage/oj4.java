package defpackage;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.captcha.provider.CaptchaCancelledException;
import com.dodopizza.captcha.provider.CaptchaException;
import com.hcaptcha.sdk.HCaptcha;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaException;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: HCaptchaTokenProviderImpl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J&\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0014R\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Loj4;", "Lz0;", "Lpo0;", "Ljj4;", Image.TYPE_MEDIUM, "Lro0;", "settings", "Landroid/app/Activity;", "activity", "Lfn0;", "", "cont", "", e.a, "Lorg/slf4j/Logger;", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", c.a, "()Lorg/slf4j/Logger;", "logger", "Lbo0;", "captchaActivityHolder", "<init>", "(Lbo0;)V", "a", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: oj4 */
/* loaded from: classes.dex */
public final class oj4 extends z0 {
    public static final a e = new a(null);
    private final Logger d;

    /* compiled from: HCaptchaTokenProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Loj4$a;", "", "", "MAX_RETRIES", "I", "<init>", "()V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: oj4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: HCaptchaTokenProviderImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: oj4$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[gj4.values().length];
            try {
                iArr[gj4.CHALLENGE_CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[po0.values().length];
            try {
                iArr2[po0.INVISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[po0.COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[po0.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj4(bo0 bo0Var) {
        super(bo0Var);
        z65.h(bo0Var, "captchaActivityHolder");
        Logger logger = LoggerFactory.getLogger("HCaptchaTokenProviderImpl");
        z65.g(logger, "getLogger(\"HCaptchaTokenProviderImpl\")");
        this.d = logger;
    }

    public static final boolean j(ca9 ca9Var, HCaptchaConfig hCaptchaConfig, HCaptchaException hCaptchaException) {
        z65.h(ca9Var, "$retries");
        z65.h(hCaptchaConfig, "<anonymous parameter 0>");
        z65.h(hCaptchaException, "exception");
        if (ca9Var.a < 3 && hCaptchaException.b() == gj4.CHALLENGE_CLOSED) {
            ca9Var.a++;
            return true;
        }
        return false;
    }

    public static final void k(oj4 oj4Var, fn0 fn0Var, pj4 pj4Var) {
        z65.h(oj4Var, "this$0");
        z65.h(fn0Var, "$cont");
        String a2 = pj4Var.a();
        Logger c = oj4Var.c();
        c.debug("Got captcha token: " + a2);
        if (fn0Var.b()) {
            fn0Var.resumeWith(sk9.b(a2));
        }
    }

    public static final void l(oj4 oj4Var, fn0 fn0Var, HCaptchaException hCaptchaException) {
        Throwable captchaException;
        z65.h(oj4Var, "this$0");
        z65.h(fn0Var, "$cont");
        Logger c = oj4Var.c();
        c.warn("Captcha failure. " + hCaptchaException.getMessage() + ", " + hCaptchaException.c() + ' ', (Throwable) hCaptchaException);
        gj4 b2 = hCaptchaException.b();
        if (b2 != null && b.$EnumSwitchMapping$0[b2.ordinal()] == 1) {
            captchaException = new CaptchaCancelledException(hCaptchaException);
        } else {
            captchaException = new CaptchaException(hCaptchaException);
        }
        if (fn0Var.b()) {
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(vk9.a(captchaException)));
        }
    }

    private final jj4 m(po0 po0Var) {
        int i = b.$EnumSwitchMapping$1[po0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return jj4.NORMAL;
                }
                throw new NoWhenBranchMatchedException();
            }
            return jj4.COMPACT;
        }
        return jj4.INVISIBLE;
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
        ca9 ca9Var = new ca9();
        HCaptchaConfig.a t = HCaptchaConfig.builder().s(ro0Var.b()).a("https://hcaptcha.com/1/api.js").t(m(ro0Var.a()));
        Boolean bool = Boolean.TRUE;
        HCaptchaConfig c = t.k(bool).e(bool).p(new lj4(ca9Var)).c();
        z65.g(c, "builder()\n        .siteK…       }\n        .build()");
        HCaptcha.r(activity).u(c).c(new b97() { // from class: mj4
            @Override // defpackage.b97
            public final void onSuccess(Object obj) {
                oj4.k(oj4.this, fn0Var, (pj4) obj);
            }
        }).b(new b87() { // from class: nj4
            @Override // defpackage.b87
            public final void rc(HCaptchaException hCaptchaException) {
                oj4.l(oj4.this, fn0Var, hCaptchaException);
            }
        });
    }
}
