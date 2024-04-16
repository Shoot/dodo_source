package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies;
import ru.dodopizza.app.di.onboarding.DaggerOnboardingComponent;
import ru.dodopizza.app.di.onboarding.OnboardingComponent;
import ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies;
import ru.dodopizza.app.di.onboarding.OnboardingRouterFeatureDependencies;
import ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter;
/* compiled from: SelectLocationFragment.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001HB\u0007¢\u0006\u0004\bE\u0010FJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00107\u001a\b\u0012\u0004\u0012\u0002000/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R#\u0010=\u001a\n 8*\u0004\u0018\u000100008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"La6a;", "Lf70;", "Lp6a;", "Ltu6;", "Lw50;", "Lh97;", "nh", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "f", "g", "", "onBackPressed", "finish", "Lj6a;", com.huawei.hms.opendevice.c.a, "Lrn5;", "oh", "()Lj6a;", "args", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "uh", "()Landroid/view/View;", "progress", e.a, "qh", "container", "Ldv6;", "Ldv6;", "rh", "()Ldv6;", "setNavigatorHolder", "(Ldv6;)V", "navigatorHolder", "Lf63;", "Lf63;", "getRouter", "()Lf63;", "setRouter", "(Lf63;)V", "router", "Las8;", "Lru/dodopizza/app/presentation/selectlocation/SelectLocationPresenter;", Image.TYPE_HIGH, "Las8;", "th", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "sh", "()Lru/dodopizza/app/presentation/selectlocation/SelectLocationPresenter;", "presenter", "Lcma;", "Lru/dodopizza/app/di/onboarding/OnboardingComponent;", "j", "Lcma;", "ph", "()Lcma;", "componentDependenciesRegistry", "<init>", "()V", "k", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a6a  reason: default package */
/* loaded from: classes4.dex */
public final class a6a extends f70 implements p6a, tu6, w50 {
    private final rn5 c;
    private final k79 d;
    private final k79 e;
    public dv6 f;
    public f63 g;
    public as8<SelectLocationPresenter> h;
    private final MoxyKtxDelegate i;
    private final cma<OnboardingComponent> j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(a6a.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(a6a.class, "container", "getContainer()Landroid/view/View;", 0)), bc9.f(new ar8(a6a.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectlocation/SelectLocationPresenter;", 0))};
    public static final a k = new a(null);

    /* compiled from: SelectLocationFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"La6a$a;", "", "Lj6a;", "args", "La6a;", "a", "", "EXTRA_KEY_ARGS", "Ljava/lang/String;", "", "FRAGMENT_CONTAINER_ID", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a6a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a6a a(j6a j6aVar) {
            z65.h(j6aVar, "args");
            return (a6a) y64.d(new a6a(), bi0.c(bi0.d("extra_key_args", j6aVar)));
        }
    }

    /* compiled from: SelectLocationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6a;", "a", "()Lj6a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a6a$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<j6a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final j6a invoke() {
            Serializable serializable = a6a.this.requireArguments().getSerializable("extra_key_args");
            z65.f(serializable, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.SelectLocationScreenArg");
            return (j6a) serializable;
        }
    }

    /* compiled from: SelectLocationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/di/onboarding/OnboardingComponent;", "a", "()Lru/dodopizza/app/di/onboarding/OnboardingComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a6a$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<OnboardingComponent> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OnboardingComponent invoke() {
            return DaggerOnboardingComponent.a().c((OnboardingFeatureDependencies) a6a.this.getComponentDependenciesRegistry().a(bc9.b(OnboardingFeatureDependencies.class))).b((OnboardingRouterFeatureDependencies) a6a.this.getComponentDependenciesRegistry().a(bc9.b(OnboardingRouterFeatureDependencies.class))).d(a6a.this.nh()).a();
        }
    }

    /* compiled from: SelectLocationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/SelectLocationPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectlocation/SelectLocationPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a6a$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<SelectLocationPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectLocationPresenter invoke() {
            return a6a.this.th().get();
        }
    }

    public a6a() {
        super(R.layout.fragment_select_location);
        rn5 b2;
        b2 = yn5.b(new b());
        this.c = b2;
        this.d = kb0.e(this, R.id.progress);
        this.e = kb0.e(this, R.id.fragment_container);
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, SelectLocationPresenter.class.getName() + ".presenter", dVar);
        this.j = new cma<>(eu2.d(this), bc9.b(OnboardingComponent.class), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h97 nh() {
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.f(requireActivity, "null cannot be cast to non-null type com.dodopizza.presentation.activities.BaseMvpActivity");
        return new h97(oh().i(), ((c80) requireActivity).n7(), oh().b(), oh().f(), av1.a(), oh().c(), oh().d(), oh().a());
    }

    private final j6a oh() {
        return (j6a) this.c.getValue();
    }

    private final View qh() {
        return (View) this.e.a(this, l[1]);
    }

    private final SelectLocationPresenter sh() {
        return (SelectLocationPresenter) this.i.getValue(this, l[2]);
    }

    private final View uh() {
        return (View) this.d.a(this, l[0]);
    }

    @Override // defpackage.p6a
    public void f() {
        un3.k(uh());
        qh().setVisibility(4);
    }

    @Override // defpackage.tu6
    public void finish() {
        sh().F();
    }

    @Override // defpackage.p6a
    public void g() {
        un3.e(uh());
        qh().setVisibility(0);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        return x50.a(this);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        z5a.a.a().a((SelectLocationFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(SelectLocationFeatureDependencies.class)), oh().e()).a(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        rh().b();
        super.onPause();
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dv6 rh = rh();
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        rh.a(new y46(this, R.id.fragment_container, childFragmentManager, new x97()));
    }

    @Override // defpackage.f70, defpackage.lm1
    /* renamed from: ph */
    public cma<OnboardingComponent> getComponentDependenciesRegistry() {
        return this.j;
    }

    public final dv6 rh() {
        dv6 dv6Var = this.f;
        if (dv6Var != null) {
            return dv6Var;
        }
        z65.z("navigatorHolder");
        return null;
    }

    public final as8<SelectLocationPresenter> th() {
        as8<SelectLocationPresenter> as8Var = this.h;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
