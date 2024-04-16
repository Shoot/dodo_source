package ru.dodopizza.app.presentation.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ViewSwitcher;
import androidx.appcompat.app.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.inappstory.sdk.stories.api.models.Image;
import io.realm.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies;
import ru.dodopizza.app.presentation.main.MainActivity;
/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u009b\u0001B\t¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\"\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u001c\u0010#\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0016R#\u0010:\u001a\n 5*\u0004\u0018\u000104048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR(\u0010r\u001a\b\u0012\u0004\u0012\u00020k0j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010~\u001a\u00020{8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0087\u0001\u001a\n 5*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010\u008d\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R$\u0010\u0098\u0001\u001a\u00070\u0093\u0001R\u00020\u00008\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009c\u0001"}, d2 = {"Lru/dodopizza/app/presentation/main/MainActivity;", "Lc80;", "Lr46;", "Ltu6;", "", "of", "Qf", "bf", "gh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onRestoreInstanceState", "onResumeFragments", "onPause", "outState", "onSaveInstanceState", "onStop", "Landroid/content/Context;", "newBase", "attachBaseContext", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "onNewIntent", "Q4", "P1", "", "phoneNumber", "siteUrl", "wd", "fh", "gc", "fe", "cb", "onBackPressed", "Ha", "c6", "b", "b0", "deepLink", "i1", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "Lqd;", "sender", "X", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.opendevice.c.a, "Lrn5;", "rc", "()Lorg/slf4j/Logger;", "logger", "Ldv6;", "Ldv6;", "vc", "()Ldv6;", "setNavigatorHolder", "(Ldv6;)V", "navigatorHolder", "Lxr0;", com.huawei.hms.push.e.a, "Lxr0;", "Pb", "()Lxr0;", "setCartQueueProcessService", "(Lxr0;)V", "cartQueueProcessService", "Lug4;", "f", "Lug4;", "mc", "()Lug4;", "setGooglePayHandler", "(Lug4;)V", "googlePayHandler", "Lz5;", "g", "Lz5;", "sa", "()Lz5;", "setActivityResultHandler", "(Lz5;)V", "activityResultHandler", "Lmy7;", Image.TYPE_HIGH, "Lmy7;", "Mc", "()Lmy7;", "setPermissionHandler", "(Lmy7;)V", "permissionHandler", "Lb79;", "i", "Lb79;", "xe", "()Lb79;", "setRawDeepLinkDataBuilder", "(Lb79;)V", "rawDeepLinkDataBuilder", "Las8;", "Lru/dodopizza/app/presentation/main/MainActivityPresenter;", "j", "Las8;", "ve", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lh37;", "k", "Lh37;", "Jc", "()Lh37;", "setNotificationsPermission$app_prodRelease", "(Lh37;)V", "notificationsPermission", "Lio/realm/d0;", "l", "Lio/realm/d0;", "defaultInstance", "Landroid/content/BroadcastReceiver;", Image.TYPE_MEDIUM, "Landroid/content/BroadcastReceiver;", "connectivityReceiver", "n", "Lmoxy/ktx/MoxyKtxDelegate;", "xd", "()Lru/dodopizza/app/presentation/main/MainActivityPresenter;", "presenter", "Landroid/widget/ViewSwitcher;", "o", "Lk79;", "Te", "()Landroid/widget/ViewSwitcher;", "viewSwitcher", "Lcma;", "Lru/dodopizza/app/di/locality/LocalityComponent;", "p", "Lcma;", "localityComponentRegistry", "Lru/dodopizza/app/presentation/main/MainActivity$a;", "q", "Lru/dodopizza/app/presentation/main/MainActivity$a;", "jc", "()Lru/dodopizza/app/presentation/main/MainActivity$a;", "componentDependenciesRegistry", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MainActivity extends c80 implements r46, tu6 {
    static final /* synthetic */ je5<Object>[] r = {bc9.f(new ar8(MainActivity.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/main/MainActivityPresenter;", 0)), bc9.f(new ar8(MainActivity.class, "viewSwitcher", "getViewSwitcher()Landroid/widget/ViewSwitcher;", 0))};
    private final rn5 c;
    public dv6 d;
    public xr0 e;
    public ug4 f;
    public z5 g;
    public my7 h;
    public b79 i;
    public as8<MainActivityPresenter> j;
    public h37 k;
    private d0 l;
    private BroadcastReceiver m;
    private final MoxyKtxDelegate n;
    private final k79 o;
    private final cma<LocalityComponent> p;
    private final a q;

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/main/MainActivity$a;", "Lkm1;", "Ljm1;", "T", "Lod5;", "clazz", "a", "(Lod5;)Ljm1;", "Lcma;", "Lru/dodopizza/app/di/locality/LocalityComponent;", "Lcma;", "wrappedRegistry", "b", "Lkm1;", "fallbackRegistry", "<init>", "(Lru/dodopizza/app/presentation/main/MainActivity;Lcma;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class a implements km1 {
        private final cma<LocalityComponent> a;
        private final km1 b;
        final /* synthetic */ MainActivity c;

        public a(MainActivity mainActivity, cma<LocalityComponent> cmaVar) {
            z65.h(cmaVar, "wrappedRegistry");
            this.c = mainActivity;
            this.a = cmaVar;
            this.b = eu2.b(mainActivity);
        }

        @Override // defpackage.km1
        public <T extends jm1> T a(od5<? extends T> od5Var) {
            z65.h(od5Var, "clazz");
            try {
                return this.a.a(od5Var);
            } catch (Exception e) {
                if (gd5.a(od5Var).isAssignableFrom(LocalityComponent.class)) {
                    this.c.rc().error("Failed to find dependencies", (Throwable) e);
                    try {
                        return (T) this.b.a(od5Var);
                    } catch (Exception e2) {
                        vl3.a(e2, e);
                        throw e2;
                    }
                }
                throw e;
            }
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/di/locality/LocalityComponent;", "a", "()Lru/dodopizza/app/di/locality/LocalityComponent;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<LocalityComponent> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LocalityComponent invoke() {
            wta.a.d(fxa.g);
            return (LocalityComponent) vw9.a(((AppComponent) MainActivity.this.getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).E2().b(pp5.a(MainActivity.this)).a());
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<Logger> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("MainActivity");
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/main/MainActivityPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/main/MainActivityPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<MainActivityPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final MainActivityPresenter invoke() {
            return MainActivity.this.ve().get();
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.MainActivity$requestNotificationPermission$1", f = "MainActivity.kt", l = {409}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(qd qdVar, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = qdVar;
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
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                h37 Jc = MainActivity.this.Jc();
                MainActivity mainActivity = MainActivity.this;
                qd qdVar = this.c;
                MainActivityPresenter xd = mainActivity.xd();
                this.a = 1;
                if (Jc.h(mainActivity, qdVar, xd, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ MainActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity) {
                super(0);
                this.a = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                return this.a.Te();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ MainActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity) {
                super(0);
                this.a = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(R.string.promo_subscription_success);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 3;
            }
        }

        f() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(MainActivity.this));
            uoaVar.h(new b(MainActivity.this));
            uoaVar.f(c.a);
            uoaVar.b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    public MainActivity() {
        rn5 b2;
        b2 = yn5.b(c.a);
        this.c = b2;
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.n = new MoxyKtxDelegate(mvpDelegate, MainActivityPresenter.class.getName() + ".presenter", dVar);
        this.o = kb0.c(this, R.id.main_activity_switcher);
        cma<LocalityComponent> cmaVar = new cma<>(eu2.b(this), bc9.b(LocalityComponent.class), new b());
        this.p = cmaVar;
        this.q = new a(this, cmaVar);
    }

    private final void Qf() {
        this.m = new yq1();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        BroadcastReceiver broadcastReceiver = this.m;
        if (broadcastReceiver == null) {
            z65.z("connectivityReceiver");
            broadcastReceiver = null;
        }
        registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSwitcher Te() {
        return (ViewSwitcher) this.o.a(this, r[1]);
    }

    private final void bf() {
        if (getSupportFragmentManager().k0(R.id.main_fragment_container) instanceof b4c) {
            xd().R();
        }
    }

    private final void gh() {
        Intent intent;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
            if (i >= 28) {
                intent.setFlags(intent.getFlags() + 268435456);
            }
        } else {
            intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", getPackageName());
            intent.putExtra("app_uid", getApplicationInfo().uid);
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ig(MainActivity mainActivity, DialogInterface dialogInterface, int i) {
        z65.h(mainActivity, "this$0");
        mainActivity.gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets pf(View view, WindowInsets windowInsets) {
        z65.h(view, "view");
        z65.h(windowInsets, "insets");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            z = viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets).isConsumed();
        }
        if (z) {
            return windowInsets.consumeSystemWindowInsets();
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger rc() {
        return (Logger) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainActivityPresenter xd() {
        return (MainActivityPresenter) this.n.getValue(this, r[0]);
    }

    @Override // defpackage.r46
    public void Ha() {
        b.a aVar = new b.a(this);
        aVar.r(R.string.notifications_are_off_titile);
        aVar.g(R.string.notifications_are_off_body);
        aVar.n(R.string.settings, new DialogInterface.OnClickListener() { // from class: i46
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.ig(MainActivity.this, dialogInterface, i);
            }
        });
        aVar.j(R.string.cancel, new DialogInterface.OnClickListener() { // from class: j46
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.Rg(dialogInterface, i);
            }
        });
        aVar.u();
    }

    public final h37 Jc() {
        h37 h37Var = this.k;
        if (h37Var != null) {
            return h37Var;
        }
        z65.z("notificationsPermission");
        return null;
    }

    public final my7 Mc() {
        my7 my7Var = this.h;
        if (my7Var != null) {
            return my7Var;
        }
        z65.z("permissionHandler");
        return null;
    }

    @Override // defpackage.r46
    public void P1() {
        if (getSupportFragmentManager().l0("temporarily_block") != null) {
            return;
        }
        vc().b();
        z8b.f.a().show(getSupportFragmentManager(), "temporarily_block");
    }

    public final xr0 Pb() {
        xr0 xr0Var = this.e;
        if (xr0Var != null) {
            return xr0Var;
        }
        z65.z("cartQueueProcessService");
        return null;
    }

    @Override // defpackage.r46
    public void Q4() {
        vc().b();
        hv6.c.a().show(getSupportFragmentManager(), "need_update");
    }

    @Override // defpackage.r46
    public void X(qd qdVar) {
        z65.h(qdVar, "sender");
        sh0.d(pp5.a(this), null, null, new e(qdVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        z65.h(context, "newBase");
        super.attachBaseContext(((AppComponent) eu2.b(context).a(bc9.b(AppComponent.class))).C1().b(context));
    }

    @Override // defpackage.r46
    public void b() {
        un3.l(Te(), R.id.main_activity_progress);
    }

    @Override // defpackage.r46
    public void b0() {
        soa.a.a(new f()).U();
    }

    @Override // defpackage.r46
    public void c6() {
        un3.l(Te(), R.id.main_fragment_container);
    }

    @Override // defpackage.r46
    public void cb() {
        ww7.e.a().show(getSupportFragmentManager(), "payment_broken");
    }

    @Override // defpackage.r46
    public void d(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        z65.f(this, "null cannot be cast to non-null type android.content.Context");
        av1.g(this, str);
    }

    @Override // defpackage.r46
    public void fe() {
        bf();
        mpb.d(this, getString(R.string.logout_unexpectedly));
    }

    @Override // defpackage.r46
    public void fh() {
        bf();
        mpb.d(this, getString(R.string.order_places_unexpectedly));
    }

    @Override // defpackage.r46
    public void gc() {
        bf();
        mpb.d(this, getString(R.string.order_paid_unexpectedly));
    }

    @Override // defpackage.r46
    public void i1(String str) {
        z65.h(str, "deepLink");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str), this, MainActivity.class);
        intent.putExtra("notification_sender", cq8.i.getValue());
        startActivity(intent);
    }

    @Override // defpackage.c80, defpackage.lm1
    /* renamed from: jc */
    public a getComponentDependenciesRegistry() {
        return this.q;
    }

    public final ug4 mc() {
        ug4 ug4Var = this.f;
        if (ug4Var != null) {
            return ug4Var;
        }
        z65.z("googlePayHandler");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        sa().c(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment k0 = getSupportFragmentManager().k0(R.id.main_fragment_container);
        if (!(k0 instanceof w50) || !((w50) k0).onBackPressed()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        k46.a.a().a((MainActivityFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(MainActivityFeatureDependencies.class))).a(this);
        Pb().start();
        getWindow().setBackgroundDrawable(null);
        ln1.a.f(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        if (bundle == null) {
            xd().L();
            a79 b2 = b79.b(xe(), getIntent().getData(), getIntent().getExtras(), null, 4, null);
            if (b2 != null) {
                xd().H(b2);
            }
        }
        View decorView = getWindow().getDecorView();
        z65.g(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(768);
        findViewById(R.id.main_fragment_container).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: h46
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets pf;
                pf = MainActivity.pf(view, windowInsets);
                return pf;
            }
        });
        of();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.onNewIntent(intent);
        a79 b2 = b79.b(xe(), intent.getData(), intent.getExtras(), null, 4, null);
        if (b2 != null) {
            xd().H(b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        vc().b();
        super.onPause();
        xd().M();
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        z65.h(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        mc().a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onResumeFragments() {
        super.onResumeFragments();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        z65.g(supportFragmentManager, "getSupportFragmentManager(...)");
        vc().a(new y46(this, R.id.main_fragment_container, supportFragmentManager, new x46()));
        xd().N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpAppCompatActivity, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        z65.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        mc().e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpAppCompatActivity, androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onStart() {
        super.onStart();
        d0 x0 = d0.x0();
        z65.g(x0, "getDefaultInstance(...)");
        this.l = x0;
        Mc().c(this);
        Qf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpAppCompatActivity, androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        d0 d0Var = this.l;
        BroadcastReceiver broadcastReceiver = null;
        if (d0Var == null) {
            z65.z("defaultInstance");
            d0Var = null;
        }
        d0Var.close();
        Mc().b(this);
        BroadcastReceiver broadcastReceiver2 = this.m;
        if (broadcastReceiver2 == null) {
            z65.z("connectivityReceiver");
        } else {
            broadcastReceiver = broadcastReceiver2;
        }
        unregisterReceiver(broadcastReceiver);
        super.onStop();
    }

    public final z5 sa() {
        z5 z5Var = this.g;
        if (z5Var != null) {
            return z5Var;
        }
        z65.z("activityResultHandler");
        return null;
    }

    public final dv6 vc() {
        dv6 dv6Var = this.d;
        if (dv6Var != null) {
            return dv6Var;
        }
        z65.z("navigatorHolder");
        return null;
    }

    public final as8<MainActivityPresenter> ve() {
        as8<MainActivityPresenter> as8Var = this.j;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.r46
    public void wd(String str, String str2) {
        vc().b();
        em.h.a().mh(str).ph(str2).show(getSupportFragmentManager(), "api_broken");
    }

    public final b79 xe() {
        b79 b79Var = this.i;
        if (b79Var != null) {
            return b79Var;
        }
        z65.z("rawDeepLinkDataBuilder");
        return null;
    }

    private final void of() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rg(DialogInterface dialogInterface, int i) {
    }
}
