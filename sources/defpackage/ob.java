package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cw5;
import im.threads.business.transport.PushMessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.presentation.allpizzerias.AllPizzeriasPresenter;
/* compiled from: AllPizzeriasFragment.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0003<=\u0015B\u0007¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R#\u0010(\u001a\n \u0014*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00108\u001a\b\u0012\u0004\u0012\u00020#018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006>"}, d2 = {"Lob;", "Lf70;", "Lvb;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "mapLink", "O5", PushMessageAttributes.ORIGIN, "Landroid/webkit/GeolocationPermissions$Callback;", "callback", "uh", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.opendevice.c.a, "Lorg/slf4j/Logger;", "logger", "Landroidx/appcompat/widget/Toolbar;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "sh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/webkit/WebView;", com.huawei.hms.push.e.a, "ph", "()Landroid/webkit/WebView;", "mapWebView", "Lru/dodopizza/app/presentation/allpizzerias/AllPizzeriasPresenter;", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "qh", "()Lru/dodopizza/app/presentation/allpizzerias/AllPizzeriasPresenter;", "presenter", "Lje4;", "g", "Lje4;", "oh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Las8;", Image.TYPE_HIGH, "Las8;", "rh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "<init>", "()V", "i", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ob  reason: default package */
/* loaded from: classes4.dex */
public final class ob extends f70 implements vb {
    private final Logger c;
    private final k79 d;
    private final k79 e;
    private final MoxyKtxDelegate f;
    public je4 g;
    public as8<AllPizzeriasPresenter> h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(ob.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(ob.class, "mapWebView", "getMapWebView()Landroid/webkit/WebView;", 0)), bc9.f(new ar8(ob.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/allpizzerias/AllPizzeriasPresenter;", 0))};
    public static final a i = new a(null);

    /* compiled from: AllPizzeriasFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lob$a;", "", "Lob;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ob$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ob a() {
            return new ob();
        }
    }

    /* compiled from: AllPizzeriasFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lob$b;", "Landroid/webkit/WebChromeClient;", "", PushMessageAttributes.ORIGIN, "Landroid/webkit/GeolocationPermissions$Callback;", "callback", "", "onGeolocationPermissionsShowPrompt", "<init>", "(Lob;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ob$b */
    /* loaded from: classes4.dex */
    private final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            z65.h(str, PushMessageAttributes.ORIGIN);
            z65.h(callback, "callback");
            ob.this.uh(str, callback);
        }
    }

    /* compiled from: AllPizzeriasFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lob$c;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "<init>", "(Lob;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ob$c */
    /* loaded from: classes4.dex */
    private final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            z65.h(webView, "view");
            z65.h(webResourceRequest, "request");
            return false;
        }
    }

    /* compiled from: AllPizzeriasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/allpizzerias/AllPizzeriasPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/allpizzerias/AllPizzeriasPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ob$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<AllPizzeriasPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AllPizzeriasPresenter invoke() {
            return ob.this.rh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllPizzeriasFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.allpizzerias.AllPizzeriasFragment$requestLocation$1", f = "AllPizzeriasFragment.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: ob$e */
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ GeolocationPermissions.Callback d;
        final /* synthetic */ String e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AllPizzeriasFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbw5;", "", "a", "(Lbw5;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ob$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<bw5, Unit> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final void a(bw5 bw5Var) {
                z65.h(bw5Var, "$this$requestLocation");
                bw5Var.b(wj8.PRIORITY_HIGH_ACCURACY);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bw5 bw5Var) {
                a(bw5Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AllPizzeriasFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.allpizzerias.AllPizzeriasFragment$requestLocation$1$1$2", f = "AllPizzeriasFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ob$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ ob c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ob obVar, cv1<? super b> cv1Var) {
                super(3, cv1Var);
                this.c = obVar;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                b bVar = new b(this.c, cv1Var);
                bVar.b = th;
                return bVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.c.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AllPizzeriasFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "it", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ob$e$c */
        /* loaded from: classes4.dex */
        public static final class c<T> implements pz3 {
            final /* synthetic */ GeolocationPermissions.Callback a;
            final /* synthetic */ String b;

            c(GeolocationPermissions.Callback callback, String str) {
                this.a = callback;
                this.b = str;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.d) {
                    this.a.invoke(this.b, true, false);
                } else {
                    this.a.invoke(this.b, false, false);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(GeolocationPermissions.Callback callback, String str, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.d = callback;
            this.e = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    Context context = (Context) this.a;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                Context context2 = ob.this.getContext();
                if (context2 != null) {
                    ob obVar = ob.this;
                    GeolocationPermissions.Callback callback = this.d;
                    String str = this.e;
                    oz3 h = wz3.h(wz3.L(qv5.a.a(obVar.oh()).b(a.a), 1), new b(obVar, null));
                    c cVar = new c(callback, str);
                    this.a = context2;
                    this.b = 1;
                    if (h.collect(cVar, this) == d) {
                        return d;
                    }
                }
            }
            return Unit.a;
        }
    }

    public ob() {
        super(R.layout.fragment_all_pizzerias);
        this.c = LoggerFactory.getLogger("AllPizzeriasFragment");
        this.d = kb0.e(this, R.id.toolbar);
        this.e = kb0.e(this, R.id.map);
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, AllPizzeriasPresenter.class.getName() + ".presenter", dVar);
    }

    private final WebView ph() {
        return (WebView) this.e.a(this, j[1]);
    }

    private final AllPizzeriasPresenter qh() {
        return (AllPizzeriasPresenter) this.f.getValue(this, j[2]);
    }

    private final Toolbar sh() {
        return (Toolbar) this.d.a(this, j[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void th(ob obVar, View view) {
        z65.h(obVar, "this$0");
        obVar.qh().onBackPressed();
    }

    @Override // defpackage.vb
    public void O5(String str) {
        z65.h(str, "mapLink");
        ph().loadUrl(str);
    }

    public final je4 oh() {
        je4 je4Var = this.g;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ((AppComponent) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).e2().a(this);
        super.onAttach(context);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        sh().setNavigationOnClickListener(new View.OnClickListener() { // from class: nb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ob.th(ob.this, view2);
            }
        });
        WebSettings settings = ph().getSettings();
        z65.g(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setCacheMode(-1);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        b bVar = new b();
        ph().setWebViewClient(new c());
        ph().setWebChromeClient(bVar);
    }

    public final as8<AllPizzeriasPresenter> rh() {
        as8<AllPizzeriasPresenter> as8Var = this.h;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    public final void uh(String str, GeolocationPermissions.Callback callback) {
        z65.h(str, PushMessageAttributes.ORIGIN);
        z65.h(callback, "callback");
        sh0.d(pp5.a(this), null, null, new e(callback, str, null), 3, null);
    }
}
