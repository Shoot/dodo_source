package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.Group;
import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.mw;
import defpackage.ww;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AssistantWelcomeFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b1\u00102J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 R(\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R#\u00100\u001a\n +*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00065"}, d2 = {"Lqw;", "La70;", "Lyw;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "Lww;", "welcomeVO", "Ae", "", "onBackPressed", "Landroidx/constraintlayout/widget/Group;", Image.TYPE_HIGH, "Lk79;", "rh", "()Landroidx/constraintlayout/widget/Group;", "contentGroup", "Landroid/widget/Button;", "i", "sh", "()Landroid/widget/Button;", "createRecipeButton", "j", "th", "generateRandomRecipeButton", "Landroid/widget/ImageButton;", "k", "qh", "()Landroid/widget/ImageButton;", "backButton", "Las8;", "Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomePresenter;", "l", "Las8;", "vh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomePresenter;", "presenter", "<init>", "()V", "n", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qw  reason: default package */
/* loaded from: classes2.dex */
public final class qw extends a70 implements yw {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    public as8<AssistantWelcomePresenter> l;
    private final MoxyKtxDelegate m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(qw.class, "contentGroup", "getContentGroup()Landroidx/constraintlayout/widget/Group;", 0)), bc9.f(new ar8(qw.class, "createRecipeButton", "getCreateRecipeButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(qw.class, "generateRandomRecipeButton", "getGenerateRandomRecipeButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(qw.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(qw.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomePresenter;", 0))};
    public static final a n = new a(null);
    public static final int p = 8;

    /* compiled from: AssistantWelcomeFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lqw$a;", "", "Lnw;", "data", "Lqw;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qw$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qw a(nw nwVar) {
            z65.h(nwVar, "data");
            return (qw) y64.d(new qw(), bi0.c(bi0.d("data", nwVar)));
        }
    }

    /* compiled from: AssistantWelcomeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qw$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            qw.this.uh().w();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantWelcomeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qw$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            qw.this.uh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantWelcomeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qw$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            qw.this.uh().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantWelcomeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomePresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qw$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<AssistantWelcomePresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AssistantWelcomePresenter invoke() {
            return qw.this.vh().get();
        }
    }

    public qw() {
        super(gz8.fragment_assistant_welcome);
        this.h = kb0.e(this, gy8.L);
        this.i = kb0.e(this, gy8.create_recipe);
        this.j = kb0.e(this, gy8.generate_random_recipe);
        this.k = kb0.e(this, gy8.m);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.m = new MoxyKtxDelegate(mvpDelegate, AssistantWelcomePresenter.class.getName() + ".presenter", eVar);
    }

    private final ImageButton qh() {
        return (ImageButton) this.k.a(this, o[3]);
    }

    private final Group rh() {
        return (Group) this.h.a(this, o[0]);
    }

    private final Button sh() {
        return (Button) this.i.a(this, o[1]);
    }

    private final Button th() {
        return (Button) this.j.a(this, o[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantWelcomePresenter uh() {
        return (AssistantWelcomePresenter) this.m.getValue(this, o[4]);
    }

    @Override // defpackage.yw
    public void Ae(ww wwVar) {
        z65.h(wwVar, "welcomeVO");
        if (wwVar instanceof ww.a) {
            un3.e(rh());
        } else if (wwVar instanceof ww.b) {
            un3.k(rh());
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        uh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        mw.b a2 = mw.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof nw)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((nw) obj, (AssistantFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AssistantFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.a70, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(sh(), new b());
        oma.a(th(), new c());
        oma.a(qh(), new d());
    }

    public final as8<AssistantWelcomePresenter> vh() {
        as8<AssistantWelcomePresenter> as8Var = this.l;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
