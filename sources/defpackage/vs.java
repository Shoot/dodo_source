package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.airbnb.lottie.LottieAnimationView;
import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.error.presentation.AssistantErrorPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ts;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpView;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AssistantErrorFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R#\u0010+\u001a\n &*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lvs;", "La70;", "", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onStart", "", "onBackPressed", "Lcom/airbnb/lottie/LottieAnimationView;", Image.TYPE_HIGH, "Lk79;", "sh", "()Lcom/airbnb/lottie/LottieAnimationView;", "logo", "Landroid/widget/ImageButton;", "i", "rh", "()Landroid/widget/ImageButton;", "backButton", "Landroid/widget/Button;", "j", "vh", "()Landroid/widget/Button;", "retryButton", "Las8;", "Lcom/dodopizza/order/feature/assistant/error/presentation/AssistantErrorPresenter;", "k", "Las8;", "uh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "l", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/order/feature/assistant/error/presentation/AssistantErrorPresenter;", "presenter", "<init>", "()V", Image.TYPE_MEDIUM, "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vs  reason: default package */
/* loaded from: classes2.dex */
public final class vs extends a70 implements MvpView {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    public as8<AssistantErrorPresenter> k;
    private final MoxyKtxDelegate l;
    static final /* synthetic */ je5<Object>[] n = {bc9.f(new ar8(vs.class, "logo", "getLogo()Lcom/airbnb/lottie/LottieAnimationView;", 0)), bc9.f(new ar8(vs.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(vs.class, "retryButton", "getRetryButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(vs.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/assistant/error/presentation/AssistantErrorPresenter;", 0))};
    public static final a m = new a(null);
    public static final int o = 8;

    /* compiled from: AssistantErrorFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lvs$a;", "", "Lus;", "data", "Lvs;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "", "LOGO_ANIMATION_START_DELAY", "J", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vs$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vs a(us usVar) {
            z65.h(usVar, "data");
            return (vs) y64.d(new vs(), bi0.c(lnb.a("data", usVar)));
        }
    }

    /* compiled from: AssistantErrorFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.error.presentation.AssistantErrorFragment$onStart$1", f = "AssistantErrorFragment.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: vs$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                this.a = 1;
                if (xt2.a(1000L, this) == d) {
                    return d;
                }
            }
            vs.this.sh().x();
            return Unit.a;
        }
    }

    /* compiled from: AssistantErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vs$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            vs.this.th().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vs$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            vs.this.th().r();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantErrorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/assistant/error/presentation/AssistantErrorPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/assistant/error/presentation/AssistantErrorPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vs$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<AssistantErrorPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AssistantErrorPresenter invoke() {
            return vs.this.uh().get();
        }
    }

    public vs() {
        super(gz8.fragment_assistant_error);
        this.h = kb0.e(this, gy8.logo);
        this.i = kb0.e(this, gy8.m);
        this.j = kb0.e(this, gy8.retry);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.l = new MoxyKtxDelegate(mvpDelegate, AssistantErrorPresenter.class.getName() + ".presenter", eVar);
    }

    private final ImageButton rh() {
        return (ImageButton) this.i.a(this, n[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView sh() {
        return (LottieAnimationView) this.h.a(this, n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantErrorPresenter th() {
        return (AssistantErrorPresenter) this.l.getValue(this, n[3]);
    }

    private final Button vh() {
        return (Button) this.j.a(this, n[2]);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        th().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ts.b a2 = ts.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof us)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((us) obj, (AssistantFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AssistantFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        op5 viewLifecycleOwner = getViewLifecycleOwner();
        z65.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        sh0.d(pp5.a(viewLifecycleOwner), null, null, new b(null), 3, null);
    }

    @Override // defpackage.a70, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(rh(), new c());
        oma.a(vh(), new d());
    }

    public final as8<AssistantErrorPresenter> uh() {
        as8<AssistantErrorPresenter> as8Var = this.k;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
