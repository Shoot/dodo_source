package ru.dodopizza.app.presentation.splash;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.presentation.main.MainActivity;
/* compiled from: SplashActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R!\u0010\u0019\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/dodopizza/app/presentation/splash/SplashActivity;", "Lfsa;", "Lc80;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "P2", "Lcom/airbnb/lottie/LottieAnimationView;", c.a, "Lk79;", "W8", "()Lcom/airbnb/lottie/LottieAnimationView;", "splash", "", DateTokenConverter.CONVERTER_KEY, "Z", "switchToMainActivityOnAnimationEnd", "Lru/dodopizza/app/presentation/splash/SplashActivityPresenter;", e.a, "Lmoxy/ktx/MoxyKtxDelegate;", "getPresenter", "()Lru/dodopizza/app/presentation/splash/SplashActivityPresenter;", "getPresenter$annotations", "()V", "presenter", "<init>", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SplashActivity extends c80 implements fsa {
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(SplashActivity.class, "splash", "getSplash()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(SplashActivity.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/splash/SplashActivityPresenter;", 0))};
    private final k79 c = kb0.c(this, R.id.splash_image);
    private boolean d;
    private final MoxyKtxDelegate e;

    /* compiled from: SplashActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/dodopizza/app/presentation/splash/SplashActivity$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animation");
            super.onAnimationEnd(animator);
            if (SplashActivity.this.d) {
                un3.n(SplashActivity.this, MainActivity.class);
            } else {
                SplashActivity.this.W8().x();
            }
        }
    }

    /* compiled from: SplashActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/splash/SplashActivityPresenter;", "a", "()Lru/dodopizza/app/presentation/splash/SplashActivityPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<SplashActivityPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SplashActivityPresenter invoke() {
            return ((AppComponent) SplashActivity.this.getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).n3().a();
        }
    }

    public SplashActivity() {
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.e = new MoxyKtxDelegate(mvpDelegate, SplashActivityPresenter.class.getName() + ".presenter", bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView W8() {
        return (LottieAnimationView) this.c.a(this, f[0]);
    }

    @Override // defpackage.fsa
    public void P2() {
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        xra.b.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(512, 512);
        W8().i(new a());
    }
}
