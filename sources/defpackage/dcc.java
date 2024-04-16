package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.yandexcaptcha.YaCaptchaConfig;
import com.dodopizza.yandexcaptcha.YaCaptchaException;
import com.huawei.hms.push.e;
import defpackage.ecc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: YaCaptcha.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Ldcc;", "", "Lcom/dodopizza/yandexcaptcha/YaCaptchaConfig;", "yaCaptchaConfig", e.a, "Ld97;", "onSuccessListener", DateTokenConverter.CONVERTER_KEY, "Ld87;", "onFailureListener", com.huawei.hms.opendevice.c.a, "a", "Ld97;", "b", "Ld87;", "Landroidx/appcompat/app/c;", "Landroidx/appcompat/app/c;", "appCompatActivity", "<init>", "(Landroidx/appcompat/app/c;)V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: dcc  reason: default package */
/* loaded from: classes2.dex */
public final class dcc {
    public static final a d = new a(null);
    private d97 a;
    private d87 b;
    private final androidx.appcompat.app.c c;

    /* compiled from: YaCaptcha.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Ldcc$a;", "", "Landroidx/appcompat/app/c;", "appCompatActivity", "Ldcc;", "b", "Landroid/app/Activity;", "activity", "a", "<init>", "()V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: dcc$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dcc a(Activity activity) {
            z65.h(activity, "activity");
            return b((androidx.appcompat.app.c) activity);
        }

        public final dcc b(androidx.appcompat.app.c cVar) {
            z65.h(cVar, "appCompatActivity");
            return new dcc(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YaCaptcha.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "", "a", "(Ljava/lang/String;Landroid/os/Bundle;)V", "com/dodopizza/yandexcaptcha/YaCaptcha$verifyWithYaCaptcha$fragmentManager$1$1"}, k = 3, mv = {1, 4, 2})
    /* renamed from: dcc$b */
    /* loaded from: classes2.dex */
    public static final class b implements r64 {
        b() {
        }

        @Override // defpackage.r64
        public final void a(String str, Bundle bundle) {
            d97 d97Var;
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "bundle");
            String string = bundle.getString("token");
            if (string != null && (d97Var = dcc.this.a) != null) {
                d97Var.onSuccess(string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YaCaptcha.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "", "a", "(Ljava/lang/String;Landroid/os/Bundle;)V", "com/dodopizza/yandexcaptcha/YaCaptcha$verifyWithYaCaptcha$fragmentManager$1$2"}, k = 3, mv = {1, 4, 2})
    /* renamed from: dcc$c */
    /* loaded from: classes2.dex */
    public static final class c implements r64 {
        c() {
        }

        @Override // defpackage.r64
        public final void a(String str, Bundle bundle) {
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "bundle");
            int i = bundle.getInt("errorCode");
            d87 d87Var = dcc.this.b;
            if (d87Var != null) {
                d87Var.a(new YaCaptchaException(fcc.b.a(i)));
            }
        }
    }

    public dcc(androidx.appcompat.app.c cVar) {
        z65.h(cVar, "appCompatActivity");
        this.c = cVar;
    }

    public final dcc c(d87 d87Var) {
        z65.h(d87Var, "onFailureListener");
        this.b = d87Var;
        return this;
    }

    public final dcc d(d97 d97Var) {
        z65.h(d97Var, "onSuccessListener");
        this.a = d97Var;
        return this;
    }

    public final dcc e(YaCaptchaConfig yaCaptchaConfig) {
        z65.h(yaCaptchaConfig, "yaCaptchaConfig");
        FragmentManager supportFragmentManager = this.c.getSupportFragmentManager();
        supportFragmentManager.A1("onSuccess", this.c, new b());
        supportFragmentManager.A1("onFailure", this.c, new c());
        z65.g(supportFragmentManager, "appCompatActivity.suppor…rrorCode)))\n      }\n    }");
        ecc.a aVar = ecc.e;
        aVar.b(yaCaptchaConfig).show(supportFragmentManager, aVar.a());
        return this;
    }
}
