package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import com.dodopizza.yandexcaptcha.YaCaptchaConfig;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: YaCaptchaDialogFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lecc;", "Landroidx/fragment/app/c;", "Lhcc;", "Landroid/webkit/WebView;", "webView", "", "ih", "", "hh", "Lgcc;", "gh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "token", "onSuccess", "onClose", "onLoaded", "V", "", "errorCode", "J3", "Landroid/widget/ProgressBar;", "b", "Landroid/widget/ProgressBar;", "progressBar", c.a, "Landroid/webkit/WebView;", "<init>", "()V", e.a, "a", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: ecc  reason: default package */
/* loaded from: classes2.dex */
public final class ecc extends androidx.fragment.app.c implements hcc {
    private static final String d;
    public static final a e = new a(null);
    private ProgressBar b;
    private WebView c;

    /* compiled from: YaCaptchaDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0012"}, d2 = {"Lecc$a;", "", "Lcom/dodopizza/yandexcaptcha/YaCaptchaConfig;", "yaCaptchaConfig", "Lecc;", "b", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ERROR_CODE_RESPONSE", "ON_FAILURE", "ON_SUCCESS", "TOKEN_RESPONSE", "YA_CAPTCHA_CONFIG", "<init>", "()V", "yandex-captcha_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: ecc$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return ecc.d;
        }

        public final ecc b(YaCaptchaConfig yaCaptchaConfig) {
            z65.h(yaCaptchaConfig, "yaCaptchaConfig");
            ecc eccVar = new ecc();
            Bundle bundle = new Bundle();
            bundle.putParcelable("yaCaptchaConfig", yaCaptchaConfig);
            Unit unit = Unit.a;
            eccVar.setArguments(bundle);
            return eccVar;
        }
    }

    static {
        String simpleName = ecc.class.getSimpleName();
        z65.g(simpleName, "YaCaptchaDialogFragment::class.java.simpleName");
        d = simpleName;
    }

    private final gcc gh() {
        YaCaptchaConfig yaCaptchaConfig;
        Bundle arguments = getArguments();
        YaCaptchaConfig yaCaptchaConfig2 = null;
        if (arguments != null) {
            yaCaptchaConfig = (YaCaptchaConfig) arguments.getParcelable("yaCaptchaConfig");
        } else {
            yaCaptchaConfig = null;
        }
        if (yaCaptchaConfig instanceof YaCaptchaConfig) {
            yaCaptchaConfig2 = yaCaptchaConfig;
        }
        return new gcc(yaCaptchaConfig2, this);
    }

    private final String hh() {
        BufferedReader bufferedReader;
        String f;
        AssetManager assets;
        InputStream open;
        Context context = getContext();
        if (context != null && (assets = context.getAssets()) != null && (open = assets.open("captcha.html")) != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(open, rw0.b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
        } else {
            bufferedReader = null;
        }
        if (bufferedReader != null) {
            try {
                f = pcb.f(bufferedReader);
            } finally {
            }
        } else {
            f = null;
        }
        aa1.a(bufferedReader, null);
        return f;
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private final void ih(WebView webView) {
        String hh = hh();
        if (hh != null) {
            WebSettings settings = webView.getSettings();
            z65.g(settings, "settings");
            settings.setJavaScriptEnabled(true);
            WebSettings settings2 = webView.getSettings();
            z65.g(settings2, "settings");
            settings2.setLoadWithOverviewMode(true);
            webView.setBackgroundColor(0);
            webView.addJavascriptInterface(gh(), "JSInterface");
            webView.loadDataWithBaseURL("https://dodopizza.ru", hh, "text/html", "UTF-8", null);
        }
    }

    @Override // defpackage.hcc
    public void J3(int i) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putSerializable("errorCode", Integer.valueOf(i));
        Unit unit = Unit.a;
        parentFragmentManager.z1("onFailure", bundle);
        dismiss();
    }

    @Override // defpackage.hcc
    public void V() {
        WebView webView = this.c;
        if (webView != null) {
            yn3.a(webView);
        }
    }

    @Override // defpackage.hcc
    public void onClose() {
        dismiss();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, t19.dialog_fullscreen);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(jz8.ya_captcha_fragment, viewGroup, false);
        this.c = (WebView) inflate.findViewById(jy8.b);
        this.b = (ProgressBar) inflate.findViewById(jy8.a);
        WebView webView = this.c;
        if (webView != null) {
            ih(webView);
        }
        z65.g(inflate, "yaCaptchaContainer");
        return inflate.getRootView();
    }

    @Override // defpackage.hcc
    public void onLoaded() {
        ProgressBar progressBar = this.b;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // defpackage.hcc
    public void onSuccess(String str) {
        z65.h(str, "token");
        if (isAdded()) {
            dismiss();
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putString("token", str);
        Unit unit = Unit.a;
        parentFragmentManager.z1("onSuccess", bundle);
    }
}
