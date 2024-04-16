package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies;
import com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nd4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: GeoChooseOrderTypeFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u001b\u0010\u0016\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R(\u0010/\u001a\b\u0012\u0004\u0012\u00020(0'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00104\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00069"}, d2 = {"Lod4;", "Lf70;", "Lxd4;", "", "hh", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "countryName", "z0", "s0", "O0", "R6", com.huawei.hms.opendevice.c.a, "Lk79;", "ph", "()Landroid/view/View;", "deliveryButton", DateTokenConverter.CONVERTER_KEY, "qh", "pickupButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", com.huawei.hms.push.e.a, "nh", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "backButton", "f", "oh", "countriesButton", "Landroid/widget/TextView;", "g", "th", "()Landroid/widget/TextView;", "title", "Las8;", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/GeoChooseOrderTypePresenter;", Image.TYPE_HIGH, "Las8;", "sh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/GeoChooseOrderTypePresenter;", "presenter", "<init>", "()V", "j", "a", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: od4  reason: default package */
/* loaded from: classes2.dex */
public final class od4 extends f70 implements xd4 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    public as8<GeoChooseOrderTypePresenter> h;
    private final MoxyKtxDelegate i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(od4.class, "deliveryButton", "getDeliveryButton()Landroid/view/View;", 0)), bc9.f(new ar8(od4.class, "pickupButton", "getPickupButton()Landroid/view/View;", 0)), bc9.f(new ar8(od4.class, "backButton", "getBackButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0)), bc9.f(new ar8(od4.class, "countriesButton", "getCountriesButton()Landroid/view/View;", 0)), bc9.f(new ar8(od4.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(od4.class, "presenter", "getPresenter()Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/GeoChooseOrderTypePresenter;", 0))};
    public static final a j = new a(null);

    /* compiled from: GeoChooseOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lod4$a;", "", "Lpd4;", "args", "Lod4;", "a", "", "EXTRA_KEY_ARGUMENTS", "Ljava/lang/String;", "", "TOOLBAR_TITLE_LEFT_MARGIN", "I", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: od4$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final od4 a(pd4 pd4Var) {
            z65.h(pd4Var, "args");
            return (od4) y64.d(new od4(), bi0.c(bi0.d("extra_key_arguments", pd4Var)));
        }
    }

    /* compiled from: GeoChooseOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: od4$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            od4.this.rh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: GeoChooseOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: od4$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            od4.this.rh().D();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: GeoChooseOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: od4$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            od4.this.rh().B();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: GeoChooseOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: od4$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            od4.this.rh().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: GeoChooseOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/GeoChooseOrderTypePresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/GeoChooseOrderTypePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: od4$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function0<GeoChooseOrderTypePresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final GeoChooseOrderTypePresenter invoke() {
            return od4.this.sh().get();
        }
    }

    public od4() {
        super(fz8.fragment_geo_choose_order_type);
        this.c = kb0.e(this, fy8.choose_order_type_delivery_button);
        this.d = kb0.e(this, fy8.choose_order_type_pickup_button);
        this.e = kb0.e(this, fy8.choose_order_type_back_button);
        this.f = kb0.e(this, fy8.choose_order_type_countries);
        this.g = kb0.e(this, fy8.choose_order_type_title);
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, GeoChooseOrderTypePresenter.class.getName() + ".presenter", fVar);
    }

    private final FloatingActionButton nh() {
        return (FloatingActionButton) this.e.a(this, k[2]);
    }

    private final View oh() {
        return (View) this.f.a(this, k[3]);
    }

    private final View ph() {
        return (View) this.c.a(this, k[0]);
    }

    private final View qh() {
        return (View) this.d.a(this, k[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GeoChooseOrderTypePresenter rh() {
        MvpPresenter value = this.i.getValue(this, k[5]);
        z65.g(value, "getValue(...)");
        return (GeoChooseOrderTypePresenter) value;
    }

    private final TextView th() {
        return (TextView) this.g.a(this, k[4]);
    }

    @Override // defpackage.xd4
    public void O0() {
        nh().setVisibility(8);
    }

    @Override // defpackage.xd4
    public void R6() {
        em.h.a().showNow(getChildFragmentManager(), null);
    }

    @Override // defpackage.f70
    protected int hh() {
        return pw8.a;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        nd4.b a2 = nd4.a.a();
        GeoChooseOrderTypeFeatureDependencies geoChooseOrderTypeFeatureDependencies = (GeoChooseOrderTypeFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(GeoChooseOrderTypeFeatureDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_key_arguments")) == null) ? null : null;
        if (obj != null && !(obj instanceof pd4)) {
            throw new ClassCastException("Property extra_key_arguments has different class type");
        } else if (obj != null) {
            a2.a(geoChooseOrderTypeFeatureDependencies, ((pd4) obj).a()).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_arguments not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(ph(), new b());
        oma.a(qh(), new c());
        oma.a(oh(), new d());
        oma.a(nh(), new e());
    }

    @Override // defpackage.xd4
    public void s0() {
        nh().setVisibility(0);
    }

    public final as8<GeoChooseOrderTypePresenter> sh() {
        as8<GeoChooseOrderTypePresenter> as8Var = this.h;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.xd4
    public void z0(String str) {
        z65.h(str, "countryName");
        th().setText(str);
    }
}
