package com.dodopizza.feature.webinfo.presentation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.WebInfoFeatureDependencies;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.feature.webinfo.presentation.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.f3c;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: WebInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001VB\t\b\u0000¢\u0006\u0004\bS\u0010TJ\u001c\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0002J\u001f\u0010\n\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016R#\u0010)\u001a\n $*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u00108R(\u0010B\u001a\b\u0012\u0004\u0012\u00020;0:8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010R\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006W"}, d2 = {"Lcom/dodopizza/feature/webinfo/presentation/c;", "Lf70;", "Lcom/dodopizza/feature/webinfo/presentation/f;", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "callback", "", "Bh", "result", "rh", "([Landroid/net/Uri;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "Ljava/io/File;", ElementGenerator.TYPE_IMAGE, "A5", "Bb", "onDestroyView", "", "visible", "Fd", "", ElementGenerator.TYPE_LINK, "pb", "Ve", "Lcom/dodopizza/feature/webinfo/presentation/a$b;", "title", "Ib", "showProgressBar", "hideProgressBar", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.opendevice.c.a, "Lrn5;", "th", "()Lorg/slf4j/Logger;", "logger", "Landroidx/appcompat/widget/Toolbar;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "xh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/webkit/WebView;", com.huawei.hms.push.e.a, "yh", "()Landroid/webkit/WebView;", "webView", "Landroid/widget/ProgressBar;", "f", "wh", "()Landroid/widget/ProgressBar;", "progressBar", "Las8;", "Lcom/dodopizza/feature/webinfo/presentation/WebInfoPresenter;", "g", "Las8;", "vh", "()Las8;", "setPresenterProvider$feature_base_release", "(Las8;)V", "presenterProvider", "Lmh0;", Image.TYPE_HIGH, "Lmh0;", "sh", "()Lmh0;", "setBuildInfo$feature_base_release", "(Lmh0;)V", "buildInfo", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lcom/dodopizza/feature/webinfo/presentation/WebInfoPresenter;", "presenter", "j", "Landroid/webkit/ValueCallback;", "webViewImagePickCallback", "<init>", "()V", "k", "a", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends f70 implements com.dodopizza.feature.webinfo.presentation.f {
    private final rn5 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    public as8<WebInfoPresenter> g;
    public mh0 h;
    private final MoxyKtxDelegate i;
    private ValueCallback<Uri[]> j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(c.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(c.class, "webView", "getWebView()Landroid/webkit/WebView;", 0)), bc9.f(new ar8(c.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(c.class, "presenter", "getPresenter()Lcom/dodopizza/feature/webinfo/presentation/WebInfoPresenter;", 0))};
    public static final a k = new a(null);

    /* compiled from: WebInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/feature/webinfo/presentation/c$a;", "", "Lcom/dodopizza/feature/webinfo/presentation/a;", "data", "Lcom/dodopizza/feature/webinfo/presentation/c;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(com.dodopizza.feature.webinfo.presentation.a aVar) {
            z65.h(aVar, "data");
            return (c) y64.d(new c(), bi0.c(bi0.d("link_id", aVar)));
        }
    }

    /* compiled from: WebInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("WebInfoFragment");
        }
    }

    /* compiled from: WebInfoFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/dodopizza/feature/webinfo/presentation/c$c", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", RemoteMessageConst.Notification.URL, "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageFinished", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.feature.webinfo.presentation.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0127c extends WebViewClient {
        C0127c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            z65.h(webView, "view");
            z65.h(str, RemoteMessageConst.Notification.URL);
            super.onPageFinished(webView, str);
            c.this.uh().q();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            z65.h(webView, "view");
            z65.h(str, RemoteMessageConst.Notification.URL);
            super.onPageStarted(webView, str, bitmap);
            c.this.uh().r();
        }
    }

    /* compiled from: WebInfoFragment.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"com/dodopizza/feature/webinfo/presentation/c$d", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "", "onShowFileChooser", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class d extends WebChromeClient {
        d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            z65.h(webView, "webView");
            z65.h(valueCallback, "filePathCallback");
            z65.h(fileChooserParams, "fileChooserParams");
            c.this.Bh(valueCallback);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebInfoFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.feature.webinfo.presentation.WebInfoFragment$pickImageForWebView$1", f = "WebInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ ValueCallback<Uri[]> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ValueCallback<Uri[]> valueCallback, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = valueCallback;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                c.this.Bb();
                c.this.j = this.c;
                c.this.uh().s();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: WebInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/feature/webinfo/presentation/WebInfoPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/feature/webinfo/presentation/WebInfoPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<WebInfoPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final WebInfoPresenter invoke() {
            return c.this.vh().get();
        }
    }

    public c() {
        super(cz8.fragment_web_info);
        rn5 b2;
        b2 = yn5.b(b.a);
        this.c = b2;
        this.d = kb0.e(this, cy8.web_info_fragment_toolbar);
        this.e = kb0.e(this, cy8.web_info_fragment_web_view);
        this.f = kb0.e(this, cy8.web_info_fragment_progress);
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, WebInfoPresenter.class.getName() + ".presenter", fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ah(c cVar, MenuItem menuItem) {
        z65.h(cVar, "this$0");
        if (menuItem.getItemId() == cy8.action_share) {
            cVar.uh().t();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bh(ValueCallback<Uri[]> valueCallback) {
        sh0.d(pp5.a(this), null, null, new e(valueCallback, null), 3, null);
    }

    private final void rh(Uri[] uriArr) {
        ValueCallback<Uri[]> valueCallback = this.j;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
        }
        this.j = null;
    }

    private final Logger th() {
        return (Logger) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebInfoPresenter uh() {
        MvpPresenter value = this.i.getValue(this, l[3]);
        z65.g(value, "getValue(...)");
        return (WebInfoPresenter) value;
    }

    private final ProgressBar wh() {
        return (ProgressBar) this.f.a(this, l[2]);
    }

    private final Toolbar xh() {
        return (Toolbar) this.d.a(this, l[0]);
    }

    private final WebView yh() {
        return (WebView) this.e.a(this, l[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zh(c cVar, View view) {
        z65.h(cVar, "this$0");
        cVar.uh().onBackPressed();
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void A5(File file) {
        z65.h(file, ElementGenerator.TYPE_IMAGE);
        try {
            Uri fromFile = Uri.fromFile(file);
            z65.e(fromFile);
            rh(new Uri[]{fromFile});
        } catch (Exception e2) {
            Logger th = th();
            th.error("Failed to process a picked photo: " + file, (Throwable) e2);
            Bb();
        }
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Bb() {
        rh(null);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Fd(boolean z) {
        xh().getMenu().findItem(cy8.action_share).setVisible(z);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Ib(a.b bVar) {
        String value;
        z65.h(bVar, "title");
        Toolbar xh = xh();
        if (bVar instanceof a.b.c) {
            value = getString(n09.order_num, Integer.valueOf(((a.b.c) bVar).a()));
        } else if (bVar instanceof a.b.C0126b) {
            value = getString(n09.web_view_default_title);
        } else if (bVar instanceof a.b.C0125a) {
            value = ((a.b.C0125a) bVar).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xh.setTitle(value);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Ve(String str) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void hideProgressBar() {
        un3.o(wh(), false);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        f3c.b a2 = f3c.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("link_id")) == null) ? null : null;
        if (obj != null && !(obj instanceof com.dodopizza.feature.webinfo.presentation.a)) {
            throw new ClassCastException("Property link_id has different class type");
        } else if (obj != null) {
            a2.a((com.dodopizza.feature.webinfo.presentation.a) obj, (WebInfoFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(WebInfoFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = link_id not found in bundle");
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        yh().stopLoading();
        yh().destroy();
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        xh().setNavigationOnClickListener(new View.OnClickListener() { // from class: g3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.zh(c.this, view2);
            }
        });
        xh().setOnMenuItemClickListener(new Toolbar.f() { // from class: h3c
            @Override // androidx.appcompat.widget.Toolbar.f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean Ah;
                Ah = c.Ah(c.this, menuItem);
                return Ah;
            }
        });
        yh().getSettings().setJavaScriptEnabled(true);
        yh().getSettings().setDomStorageEnabled(true);
        yh().setWebViewClient(new C0127c());
        yh().setWebChromeClient(new d());
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void pb(String str) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        if (sh().i()) {
            Toast.makeText(getContext(), str, 0).show();
        }
        yh().loadUrl(str);
    }

    public final mh0 sh() {
        mh0 mh0Var = this.h;
        if (mh0Var != null) {
            return mh0Var;
        }
        z65.z("buildInfo");
        return null;
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void showProgressBar() {
        un3.o(wh(), true);
    }

    public final as8<WebInfoPresenter> vh() {
        as8<WebInfoPresenter> as8Var = this.g;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
