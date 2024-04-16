package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.landing.LandingFeatureDependencies;
import ru.dodopizza.app.presentation.selectlocation.landing.LandingPresenter;
/* compiled from: LandingFragment.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001lB\u0007¢\u0006\u0004\bi\u0010jJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0014J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\rH\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0012H\u0016R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u0010\u001a\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001b\u0010\u001c\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00107R\u001b\u0010'\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00107R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u0010?R\u001b\u0010C\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bB\u0010?R\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\bK\u0010LR\u001b\u0010P\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00100\u001a\u0004\bO\u00107R\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010YR(\u0010c\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006m"}, d2 = {"Loj5;", "Lf70;", "Lrl5;", "Lfk5;", "Lks5;", "Lw50;", "", "Dh", "", "ph", "Hh", "", "resId", "", "vh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "onViewCreated", "onBackPressed", "hh", "title", "r", "subtitle", "F3", "y6", RemoteMessageConst.Notification.URL, "M5", "S2", Action.NAME_ATTRIBUTE, "F0", "p7", "pf", "phoneNumber", "address", "N0", "U4", "G3", com.huawei.hms.opendevice.c.a, "Landroid/content/Context;", "contextForLocale", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "qh", "()Landroid/widget/Button;", "countryBtn", "Landroid/widget/TextView;", e.a, "Ch", "()Landroid/widget/TextView;", "f", "Bh", "g", "getAddress", "Landroid/widget/ImageView;", Image.TYPE_HIGH, "rh", "()Landroid/widget/ImageView;", "facebookBtn", "i", "th", "instagramBtn", "Landroid/widget/FrameLayout;", "j", "sh", "()Landroid/widget/FrameLayout;", "fragmentContainer", "Landroid/widget/LinearLayout;", "k", "Ah", "()Landroid/widget/LinearLayout;", "socialNetworksContainer", "l", "zh", "socialNetworkTitle", "Ldt5;", Image.TYPE_MEDIUM, "Lrn5;", "wh", "()Ldt5;", "locality", "n", "uh", "()Ljava/lang/String;", "language", "Las8;", "Lru/dodopizza/app/presentation/selectlocation/landing/LandingPresenter;", "o", "Las8;", "yh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "p", "Lmoxy/ktx/MoxyKtxDelegate;", "xh", "()Lru/dodopizza/app/presentation/selectlocation/landing/LandingPresenter;", "presenter", "<init>", "()V", "q", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: oj5  reason: default package */
/* loaded from: classes4.dex */
public final class oj5 extends f70 implements rl5, fk5, ks5, w50 {
    private Context c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final rn5 m;
    private final rn5 n;
    public as8<LandingPresenter> o;
    private final MoxyKtxDelegate p;
    static final /* synthetic */ je5<Object>[] r = {bc9.f(new ar8(oj5.class, "countryBtn", "getCountryBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(oj5.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(oj5.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(oj5.class, "address", "getAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(oj5.class, "facebookBtn", "getFacebookBtn()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(oj5.class, "instagramBtn", "getInstagramBtn()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(oj5.class, "fragmentContainer", "getFragmentContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(oj5.class, "socialNetworksContainer", "getSocialNetworksContainer()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(oj5.class, "socialNetworkTitle", "getSocialNetworkTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(oj5.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectlocation/landing/LandingPresenter;", 0))};
    public static final a q = new a(null);

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Loj5$a;", "", "Lpj5;", "data", "Loj5;", "a", "", "EXTRA_KEY_LANGUAGE", "Ljava/lang/String;", "EXTRA_KEY_LOCALITY", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: oj5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oj5 a(pj5 pj5Var) {
            z65.h(pj5Var, "data");
            return (oj5) y64.d(new oj5(), bi0.c(bi0.d("locality", pj5Var.b()), bi0.d("language", pj5Var.a())));
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oj5$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            Bundle arguments = oj5.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("language")) == null) ? null : null;
            if (obj != null && !(obj instanceof String)) {
                throw new ClassCastException("Property language has different class type");
            } else if (obj != null) {
                return (String) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = language not found in bundle");
            }
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldt5;", "a", "()Ldt5;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oj5$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<dt5> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final dt5 invoke() {
            Bundle arguments = oj5.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("locality")) == null) ? null : null;
            if (obj != null && !(obj instanceof dt5)) {
                throw new ClassCastException("Property locality has different class type");
            } else if (obj != null) {
                return (dt5) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = locality not found in bundle");
            }
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/LandingPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/selectlocation/landing/LandingPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oj5$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<LandingPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LandingPresenter invoke() {
            return oj5.this.yh().get();
        }
    }

    public oj5() {
        super(R.layout.fragment_landing);
        rn5 b2;
        rn5 b3;
        this.d = kb0.e(this, R.id.landing_country_button);
        this.e = kb0.e(this, R.id.landing_title);
        this.f = kb0.e(this, R.id.landing_subtitle);
        this.g = kb0.e(this, R.id.landing_address_tv);
        this.h = kb0.e(this, R.id.landing_first_social_network_iv);
        this.i = kb0.e(this, R.id.landing_second_social_network_iv);
        this.j = kb0.e(this, R.id.landing_fragment_container);
        this.k = kb0.e(this, R.id.landing_social_networks_container);
        this.l = kb0.e(this, R.id.landing_social_networks_container_title);
        b2 = yn5.b(new c());
        this.m = b2;
        b3 = yn5.b(new b());
        this.n = b3;
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.p = new MoxyKtxDelegate(mvpDelegate, LandingPresenter.class.getName() + ".presenter", dVar);
    }

    private final LinearLayout Ah() {
        return (LinearLayout) this.k.a(this, r[7]);
    }

    private final TextView Bh() {
        return (TextView) this.f.a(this, r[2]);
    }

    private final TextView Ch() {
        return (TextView) this.e.a(this, r[1]);
    }

    private final void Dh() {
        qh().setOnClickListener(new View.OnClickListener() { // from class: lj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oj5.Eh(oj5.this, view);
            }
        });
        rh().setOnClickListener(new View.OnClickListener() { // from class: mj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oj5.Fh(oj5.this, view);
            }
        });
        th().setOnClickListener(new View.OnClickListener() { // from class: nj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oj5.Gh(oj5.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eh(oj5 oj5Var, View view) {
        z65.h(oj5Var, "this$0");
        oj5Var.xh().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Fh(oj5 oj5Var, View view) {
        z65.h(oj5Var, "this$0");
        oj5Var.xh().t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gh(oj5 oj5Var, View view) {
        z65.h(oj5Var, "this$0");
        oj5Var.xh().u();
    }

    private final void Hh() {
        un3.k(Ah());
        Ch().setText(vh(R.string.landing_offboarding_title));
        Bh().setText(vh(R.string.landing_offboarding_subtitle));
        zh().setText(vh(R.string.landing_social_networks_title));
    }

    private final boolean ph() {
        if (getChildFragmentManager().k0(R.id.landing_fragment_container) == null) {
            return true;
        }
        return false;
    }

    private final Button qh() {
        return (Button) this.d.a(this, r[0]);
    }

    private final ImageView rh() {
        return (ImageView) this.h.a(this, r[4]);
    }

    private final FrameLayout sh() {
        return (FrameLayout) this.j.a(this, r[6]);
    }

    private final ImageView th() {
        return (ImageView) this.i.a(this, r[5]);
    }

    private final String uh() {
        return (String) this.n.getValue();
    }

    private final String vh(int i) {
        Context context = this.c;
        if (context == null) {
            z65.z("contextForLocale");
            context = null;
        }
        String string = context.getString(i);
        z65.g(string, "getString(...)");
        return string;
    }

    private final dt5 wh() {
        return (dt5) this.m.getValue();
    }

    private final LandingPresenter xh() {
        MvpPresenter value = this.p.getValue(this, r[9]);
        z65.g(value, "getValue(...)");
        return (LandingPresenter) value;
    }

    private final TextView zh() {
        return (TextView) this.l.a(this, r[8]);
    }

    @Override // defpackage.rl5
    public void F0(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        qh().setText(str);
    }

    @Override // defpackage.rl5
    public void F3(String str) {
        z65.h(str, "subtitle");
        Bh().setText(str);
    }

    @Override // defpackage.ks5
    public Context G3() {
        Context context = this.c;
        if (context == null) {
            z65.z("contextForLocale");
            return null;
        }
        return context;
    }

    @Override // defpackage.rl5
    public void M5(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.g(requireContext, str);
    }

    @Override // defpackage.fk5
    public void N0(String str, String str2) {
        z65.h(str, "phoneNumber");
        z65.h(str2, "address");
        getChildFragmentManager().p().u(R.id.landing_fragment_container, new ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a().Jh(new wk5(wh(), str, str2))).i(null).k();
    }

    @Override // defpackage.rl5
    public void S2() {
        un3.e(Ah());
    }

    @Override // defpackage.fk5
    public void U4() {
        un3.e(sh());
        Hh();
    }

    @Override // defpackage.f70
    protected int hh() {
        return R.color.black_landing;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        ku1 ku1Var = new ku1(new tl5(uh(), wh().a()));
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        this.c = ku1Var.a(requireContext);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        xh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ij5.a.a().a((LandingFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(LandingFeatureDependencies.class)), wh().a(), wh().getId(), wh().getName()).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Dh();
    }

    @Override // defpackage.rl5
    public void p7() {
        if (ph()) {
            jk5 jk5Var = new jk5();
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_key_locality", wh());
            jk5Var.setArguments(bundle);
            getChildFragmentManager().p().b(R.id.landing_fragment_container, jk5Var).k();
        }
    }

    @Override // defpackage.fk5
    public void pf() {
        getChildFragmentManager().g1();
    }

    @Override // defpackage.rl5
    public void r(String str) {
        z65.h(str, "title");
        Ch().setText(str);
    }

    @Override // defpackage.rl5
    public void y6() {
        Ch().setText(vh(R.string.landing_default_title));
        Bh().setText(vh(R.string.landing_default_subtitle));
    }

    public final as8<LandingPresenter> yh() {
        as8<LandingPresenter> as8Var = this.o;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
