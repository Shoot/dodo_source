package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies;
import com.dodopizza.controlling.feature.ordercompleted.di.OrderCompletedComponent;
import com.dodopizza.controlling.feature.ordercompleted.presentation.OrderCompletedPresenter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: OrderCompletedFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB\u0007¢\u0006\u0004\bU\u0010LJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010'R\u001b\u0010.\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010'R\u001b\u00101\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010'R\u001b\u00104\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010'R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010E\u001a\b\u0012\u0004\u0012\u00020>0=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR)\u0010M\u001a\n F*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010L\u001a\u0004\bI\u0010JR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lmc7;", "Lf70;", "Lxc7;", "Lw50;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "onBackPressed", "Lll1;", "data", "w4", "Lpq3;", "V6", "B8", "Lsr6;", "h7", "visible", "wc", "Lez1;", "t0", "q0", "Lvm9;", Image.TYPE_SMALL, "H", "", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "Landroid/widget/LinearLayout;", com.huawei.hms.opendevice.c.a, "Lk79;", "rh", "()Landroid/widget/LinearLayout;", "mainContentContainer", "qh", "()Landroid/view/View;", "feedbackButtonsCard", com.huawei.hms.push.e.a, "sh", "mysteryShopperCard", "f", "ph", "courierTipsCard", "g", "vh", "rnDigitalCard", Image.TYPE_HIGH, "nh", "closeButton", "Lxtb;", "i", "Lxtb;", "wh", "()Lxtb;", "setUrlOpener", "(Lxtb;)V", "urlOpener", "Las8;", "Lcom/dodopizza/controlling/feature/ordercompleted/presentation/OrderCompletedPresenter;", "j", "Las8;", "uh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "k", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/controlling/feature/ordercompleted/presentation/OrderCompletedPresenter;", "getPresenter$annotations", "()V", "presenter", "Lcma;", "Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent;", "l", "Lcma;", "oh", "()Lcma;", "componentDependenciesRegistry", "<init>", Image.TYPE_MEDIUM, "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mc7  reason: default package */
/* loaded from: classes.dex */
public final class mc7 extends f70 implements xc7, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    public xtb i;
    public as8<OrderCompletedPresenter> j;
    private final MoxyKtxDelegate k;
    private final cma<OrderCompletedComponent> l;
    static final /* synthetic */ je5<Object>[] n = {bc9.f(new ar8(mc7.class, "mainContentContainer", "getMainContentContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(mc7.class, "feedbackButtonsCard", "getFeedbackButtonsCard()Landroid/view/View;", 0)), bc9.f(new ar8(mc7.class, "mysteryShopperCard", "getMysteryShopperCard()Landroid/view/View;", 0)), bc9.f(new ar8(mc7.class, "courierTipsCard", "getCourierTipsCard()Landroid/view/View;", 0)), bc9.f(new ar8(mc7.class, "rnDigitalCard", "getRnDigitalCard()Landroid/view/View;", 0)), bc9.f(new ar8(mc7.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(mc7.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/ordercompleted/presentation/OrderCompletedPresenter;", 0))};
    public static final a m = new a(null);

    /* compiled from: OrderCompletedFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lmc7$a;", "", "Lic7;", "data", "Lmc7;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mc7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mc7 a(ic7 ic7Var) {
            z65.h(ic7Var, "data");
            return (mc7) y64.d(new mc7(), bi0.c(bi0.d("data", ic7Var)));
        }
    }

    /* compiled from: OrderCompletedFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent;", "a", "()Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mc7$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<OrderCompletedComponent> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderCompletedComponent invoke() {
            OrderCompletedComponent.b a = OrderCompletedComponent.b.a();
            OrderCompletedFeatureDependencies orderCompletedFeatureDependencies = (OrderCompletedFeatureDependencies) mc7.this.getComponentDependenciesRegistry().a(bc9.b(OrderCompletedFeatureDependencies.class));
            Bundle arguments = mc7.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof ic7)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a((ic7) obj, mc7.this, orderCompletedFeatureDependencies);
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    /* compiled from: OrderCompletedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mc7$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            mc7.this.th().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderCompletedFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mc7$d */
    /* loaded from: classes.dex */
    /* synthetic */ class d extends m94 implements Function1<Boolean, Unit> {
        d(Object obj) {
            super(1, obj, OrderCompletedPresenter.class, "onRnDigitalDataAvailabilityChanged", "onRnDigitalDataAvailabilityChanged(Z)V", 0);
        }

        public final void b(boolean z) {
            ((OrderCompletedPresenter) this.receiver).y(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            b(bool.booleanValue());
            return Unit.a;
        }
    }

    /* compiled from: OrderCompletedFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/presentation/OrderCompletedPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/controlling/feature/ordercompleted/presentation/OrderCompletedPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mc7$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<OrderCompletedPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderCompletedPresenter invoke() {
            return mc7.this.uh().get();
        }
    }

    public mc7() {
        super(wz8.fragment_order_completed);
        this.c = kb0.e(this, zx8.main_content_container);
        this.d = kb0.e(this, zx8.feedback_buttons_card);
        this.e = kb0.e(this, zx8.x);
        this.f = kb0.e(this, zx8.courier_tips_card);
        this.g = kb0.e(this, zx8.rndigital_card);
        this.h = kb0.e(this, zx8.k);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.k = new MoxyKtxDelegate(mvpDelegate, OrderCompletedPresenter.class.getName() + ".presenter", eVar);
        this.l = new cma<>(eu2.d(this), bc9.b(OrderCompletedComponent.class), new b());
    }

    private final View nh() {
        return (View) this.h.a(this, n[5]);
    }

    private final View ph() {
        return (View) this.f.a(this, n[3]);
    }

    private final View qh() {
        return (View) this.d.a(this, n[1]);
    }

    private final LinearLayout rh() {
        return (LinearLayout) this.c.a(this, n[0]);
    }

    private final View sh() {
        return (View) this.e.a(this, n[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderCompletedPresenter th() {
        return (OrderCompletedPresenter) this.k.getValue(this, n[6]);
    }

    private final View vh() {
        return (View) this.g.a(this, n[4]);
    }

    @Override // defpackage.xc7
    public void B8() {
        rh().removeView(qh());
        rh().addView(qh());
    }

    @Override // defpackage.xc7
    public void H(boolean z) {
        un3.o(vh(), z);
    }

    @Override // defpackage.xc7
    public void V6(pq3 pq3Var) {
        z65.h(pq3Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        u8c.a(p, zx8.q, pq3Var, q19.OrderCompletedTheme);
        p.l();
    }

    @Override // defpackage.xc7
    public void d(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        wh().a(str, false);
    }

    @Override // defpackage.xc7
    public void h7(sr6 sr6Var) {
        z65.h(sr6Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        com.dodopizza.controlling.feature.mysteryshoppercard.presentation.c.a(p, zx8.D, sr6Var, q19.OrderCompletedTheme);
        p.l();
    }

    @Override // defpackage.f70, defpackage.lm1
    /* renamed from: oh */
    public cma<OrderCompletedComponent> getComponentDependenciesRegistry() {
        return this.l;
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        th().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        getComponentDependenciesRegistry().b().h4(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(nh(), new c());
        OrderCompletedPresenter th = th();
        z65.g(th, "<get-presenter>(...)");
        x8c.b(this, new d(th));
    }

    @Override // defpackage.xc7
    public void q0(boolean z) {
        un3.o(ph(), z);
    }

    @Override // defpackage.xc7
    public void s(vm9 vm9Var) {
        z65.h(vm9Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        x8c.a(p, zx8.rndigital_card_container, vm9Var, q19.OrderCompletedTheme);
        p.l();
    }

    @Override // defpackage.xc7
    public void t0(ez1 ez1Var) {
        z65.h(ez1Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        a9c.a(p, zx8.courier_tips_card_container, ez1Var, new mz1(q19.OrderCompletedTheme, false));
        p.l();
    }

    public final as8<OrderCompletedPresenter> uh() {
        as8<OrderCompletedPresenter> as8Var = this.j;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.xc7
    public void w4(ll1 ll1Var) {
        z65.h(ll1Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        z65.g(p.w(zx8.completed_order_info_container, ml1.class, ml1.g.a(ll1Var), null), "replace(containerViewId, F::class.java, args, tag)");
        p.l();
    }

    @Override // defpackage.xc7
    public void wc(boolean z) {
        un3.o(sh(), z);
    }

    public final xtb wh() {
        xtb xtbVar = this.i;
        if (xtbVar != null) {
            return xtbVar;
        }
        z65.z("urlOpener");
        return null;
    }
}
